// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.minutecast;

import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.accuweather.android.models.WeatherDataModel;
import com.accuweather.android.models.minutecast.Intervals;
import com.accuweather.android.models.minutecast.MinuteCastPrecipitationType;
import com.accuweather.android.models.minutecast.MinuteCastResult;
import com.accuweather.android.models.minutecast.MinuteCastThresholdType;
import com.accuweather.android.models.minutecast.Summaries;
import com.accuweather.android.models.minutecast.Summary;
import com.accuweather.android.utilities.Data;
import com.accuweather.android.utilities.Logger;
import com.accuweather.android.utilities.MinuteCastUtilities;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

// Referenced classes of package com.accuweather.android.minutecast:
//            MinuteCastCircle, TurboMinuteCastUtilities, SeekCircle

public class MinuteCastCircleFragment extends Fragment
{
    public static interface ICircleListener
    {

        public abstract void onCircleMinuteChanged(int i);
    }

    private class SeekCircleChangeListener
        implements SeekCircle.OnSeekCircleChangeListener
    {

        final MinuteCastCircleFragment this$0;

        public void onProgressChanged(SeekCircle seekcircle, int i, boolean flag)
        {
            if (flag || i == 0)
            {
                setSelectedMinute(i);
            }
        }

        public void onStartTrackingTouch(SeekCircle seekcircle)
        {
        }

        public void onStopTrackingTouch(SeekCircle seekcircle)
        {
        }

        private SeekCircleChangeListener()
        {
            this$0 = MinuteCastCircleFragment.this;
            super();
        }

    }


    private static final int CIRCLE_TOP_PRECIP_ANIMATION_MINUTE = 120;
    private static final int DEFAULT_PRECIP_EVENT_MINUTE = -1;
    private static final int PRECIPITATION_ICON_COLOR = Color.parseColor("#99808284");
    private final int NO_PRECIP_COLOR_FILL_FOR_GRADIENT = Color.parseColor("#4D011032");
    private ICircleListener mCircleListener;
    private WeatherDataModel mCurrentlyViewedWeatherDataModel;
    private boolean mIsAnimating;
    private MinuteCastCircle mMinuteCastCircle;
    private int mMinutesToMovePerAnimationFrame;
    private Runnable mNextPrecipEventAnimationRunnable;
    private int mNextPrecipEventStartMinute;
    private ImageView mPrecipitationIconImageView;
    private SeekCircleChangeListener mSeekCircleChangeListener;
    private TextView mSelectedPrecipDescriptionTextView;
    private TextView mShortPhraseTextView;

    public MinuteCastCircleFragment()
    {
        mSeekCircleChangeListener = new SeekCircleChangeListener();
        mNextPrecipEventStartMinute = -1;
        mIsAnimating = false;
        mNextPrecipEventAnimationRunnable = new Runnable() {

            final MinuteCastCircleFragment this$0;

            public void run()
            {
                if (mNextPrecipEventStartMinute != -1)
                {
                    animateCircleToNextPrecipEventForSingleFrame();
                }
            }

            
            {
                this$0 = MinuteCastCircleFragment.this;
                super();
            }
        };
    }

    private void animateCircleToNextPrecipEvent(int i)
    {
        mNextPrecipEventStartMinute = i;
        int j = Math.abs(mNextPrecipEventStartMinute - getSelectedMinute());
        i = j;
        if (j <= 0)
        {
            i = 1;
        }
        mMinutesToMovePerAnimationFrame = i / 7;
        if (mMinutesToMovePerAnimationFrame > 1) goto _L2; else goto _L1
_L1:
        mMinutesToMovePerAnimationFrame = 1;
_L4:
        mIsAnimating = true;
        animateCircleToNextPrecipEventForSingleFrame();
        return;
_L2:
        if (mMinutesToMovePerAnimationFrame >= 5)
        {
            mMinutesToMovePerAnimationFrame = 5;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void animateCircleToNextPrecipEventForSingleFrame()
    {
        int i;
label0:
        {
            if (getView() != null && getActivity() != null)
            {
                i = mMinuteCastCircle.getProgress() + mMinutesToMovePerAnimationFrame;
                if ((float)i < mMinuteCastCircle.getMax())
                {
                    break label0;
                }
                mNextPrecipEventStartMinute = -1;
                mIsAnimating = false;
                setSelectedMinute(0);
            }
            return;
        }
        if (i >= mNextPrecipEventStartMinute)
        {
            i = mNextPrecipEventStartMinute;
            mNextPrecipEventStartMinute = -1;
            mIsAnimating = false;
            setSelectedMinute(i);
            return;
        } else
        {
            mMinuteCastCircle.setProgress(i);
            mMinuteCastCircle.postDelayed(mNextPrecipEventAnimationRunnable, 16L);
            return;
        }
    }

    private int getNextPrecipEventStartMinute(List list)
    {
        for (list = list.iterator(); list.hasNext();)
        {
            Summaries summaries = (Summaries)list.next();
            if (getSelectedMinute() < summaries.getStartMinute().intValue())
            {
                return summaries.getStartMinute().intValue();
            }
        }

        return 120;
    }

    private void init()
    {
        if (getView() != null && getActivity() != null)
        {
            mPrecipitationIconImageView = (ImageView)getView().findViewById(com.accuweather.android.R.id.precipitationIcon);
            mShortPhraseTextView = (TextView)getView().findViewById(com.accuweather.android.R.id.shortPhrase_text);
            mSelectedPrecipDescriptionTextView = (TextView)getView().findViewById(com.accuweather.android.R.id.selectedPrecipDescriptionTextView);
            mMinuteCastCircle = (MinuteCastCircle)getView().findViewById(com.accuweather.android.R.id.minuteCastCircle);
            mPrecipitationIconImageView.setOnTouchListener(new android.view.View.OnTouchListener() {

                final MinuteCastCircleFragment this$0;

                public boolean onTouch(View view, MotionEvent motionevent)
                {
                    if (motionevent.getAction() == 1 && !mIsAnimating)
                    {
                        moveArmToNextPrecipitationEvent();
                    }
                    return true;
                }

            
            {
                this$0 = MinuteCastCircleFragment.this;
                super();
            }
            });
            mShortPhraseTextView.setOnTouchListener(new android.view.View.OnTouchListener() {

                final MinuteCastCircleFragment this$0;

                public boolean onTouch(View view, MotionEvent motionevent)
                {
                    if (motionevent.getAction() == 1 && !mIsAnimating)
                    {
                        moveArmToNextPrecipitationEvent();
                    }
                    return true;
                }

            
            {
                this$0 = MinuteCastCircleFragment.this;
                super();
            }
            });
            mMinuteCastCircle.setOnSeekCircleChangeListener(mSeekCircleChangeListener);
            updateView();
        }
    }

    private void moveArmToNextPrecipitationEvent()
    {
        Object obj;
label0:
        {
            obj = Data.getInstance(getActivity()).getCurrentlyViewedWeatherDataModel();
            if (obj != null)
            {
                obj = ((WeatherDataModel) (obj)).getMinuteCastResult();
                if (obj != null)
                {
                    if (!MinuteCastUtilities.isAllDry(((MinuteCastResult) (obj))) && !MinuteCastUtilities.isAllSamePrecipitationType(((MinuteCastResult) (obj))))
                    {
                        break label0;
                    }
                    int j = getSelectedMinute() + 15;
                    int i = j;
                    if (j > 120)
                    {
                        i = 120;
                    }
                    animateCircleToNextPrecipEvent(i);
                }
            }
            return;
        }
        animateCircleToNextPrecipEvent(getNextPrecipEventStartMinute(((MinuteCastResult) (obj)).getSummaries()));
    }

    private boolean needsTranslatedShortPhrase(int i)
    {
        Object obj = mCurrentlyViewedWeatherDataModel.getMinuteCastResult().getIntervals();
        if (obj != null && i <= ((List) (obj)).size() - 1)
        {
            obj = (Intervals)((List) (obj)).get(i);
            if ((((Intervals) (obj)).getPrecipitationType() == MinuteCastPrecipitationType.DRY || ((Intervals) (obj)).getThreshold() == MinuteCastThresholdType.NONE) && !Locale.getDefault().getLanguage().startsWith("en"))
            {
                mShortPhraseTextView.setVisibility(0);
                mPrecipitationIconImageView.setVisibility(8);
                return true;
            }
        }
        mShortPhraseTextView.setVisibility(8);
        mPrecipitationIconImageView.setVisibility(0);
        return false;
    }

    public static MinuteCastCircleFragment newInstance(int i)
    {
        Logger.d("MinuteCastCircleFragment", "MinuteCastCircleFragment newInstance");
        MinuteCastCircleFragment minutecastcirclefragment = new MinuteCastCircleFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("selectedMinute", i);
        minutecastcirclefragment.setArguments(bundle);
        return minutecastcirclefragment;
    }

    private void updatePrecipitationSummaryTextView(MinuteCastResult minutecastresult)
    {
        TextView textview = (TextView)getView().findViewById(com.accuweather.android.R.id.summaryTextView);
        if (minutecastresult != null && minutecastresult.getSummary() != null && minutecastresult.getSummary().getPhrase() != null)
        {
            textview.setText(minutecastresult.getSummary().getPhrase());
            return;
        } else
        {
            textview.setText("---");
            return;
        }
    }

    protected int getContentViewId()
    {
        return com.accuweather.android.R.layout.minute_cast_circle;
    }

    protected int getMinuteCastDryColor()
    {
        return NO_PRECIP_COLOR_FILL_FOR_GRADIENT;
    }

    protected Drawable getPrecipitationIconDrawable(int i)
    {
        Object obj = Integer.valueOf(TurboMinuteCastUtilities.getPrecipitationImageResourceId(i, mCurrentlyViewedWeatherDataModel));
        if (obj == null)
        {
            return null;
        } else
        {
            obj = getActivity().getResources().getDrawable(((Integer) (obj)).intValue());
            ((Drawable) (obj)).setColorFilter(PRECIPITATION_ICON_COLOR, android.graphics.PorterDuff.Mode.SRC_ATOP);
            return ((Drawable) (obj));
        }
    }

    public int getSelectedMinute()
    {
        return mMinuteCastCircle.getProgress();
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        init();
        int i;
        if (getArguments() != null)
        {
            i = getArguments().getInt("selectedMinute");
        } else
        {
            i = 0;
        }
        setSelectedMinute(i);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        mCurrentlyViewedWeatherDataModel = Data.getInstance(getActivity()).getCurrentlyViewedWeatherDataModel();
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(getContentViewId(), null);
    }

    public void setCircleListener(ICircleListener icirclelistener)
    {
        mCircleListener = icirclelistener;
    }

    protected void setSelectedMinute(int i)
    {
        String s = MinuteCastUtilities.getShortPhrase(i, mCurrentlyViewedWeatherDataModel);
        String s1 = MinuteCastUtilities.getMinuteTime(getActivity(), mCurrentlyViewedWeatherDataModel, i);
        if (needsTranslatedShortPhrase(i))
        {
            mShortPhraseTextView.setText(s);
        } else
        {
            mPrecipitationIconImageView.setImageDrawable(getPrecipitationIconDrawable(i));
        }
        mSelectedPrecipDescriptionTextView.setText((new StringBuilder()).append(s).append(" ").append(s1).toString());
        if (mCircleListener != null)
        {
            mCircleListener.onCircleMinuteChanged(i);
        }
        if (mMinuteCastCircle.getProgress() != i)
        {
            mMinuteCastCircle.setProgress(i);
        }
    }

    protected void updateView()
    {
        if (getView() != null && getActivity() != null)
        {
            WeatherDataModel weatherdatamodel = Data.getInstance(getActivity()).getCurrentlyViewedWeatherDataModel();
            if (weatherdatamodel != null)
            {
                mCurrentlyViewedWeatherDataModel = weatherdatamodel;
                if (mMinuteCastCircle != null)
                {
                    mMinuteCastCircle.setColors(MinuteCastUtilities.getMinuteCastColors(mCurrentlyViewedWeatherDataModel, getMinuteCastDryColor()));
                    setSelectedMinute(mMinuteCastCircle.getProgress());
                }
                updatePrecipitationSummaryTextView(weatherdatamodel.getMinuteCastResult());
            }
        }
    }





}
