// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.minutecast;

import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SeekBar;
import android.widget.TextView;
import com.accuweather.android.models.WeatherDataModel;
import com.accuweather.android.models.minutecast.MinuteCastResult;
import com.accuweather.android.models.minutecast.Summary;
import com.accuweather.android.utilities.AccuAnalytics;
import com.accuweather.android.utilities.Data;
import com.accuweather.android.utilities.Logger;
import com.accuweather.android.utilities.MinuteCastUtilities;
import com.accuweather.android.utilities.Utilities;

// Referenced classes of package com.accuweather.android.minutecast:
//            HorizontalSeekBar, BaseSeekBar, VerticalSeekBar, MinuteCastListAdapter

public class MinuteCastListFragment extends ListFragment
    implements android.widget.SeekBar.OnSeekBarChangeListener, android.widget.AbsListView.OnScrollListener, android.view.View.OnTouchListener
{
    public static interface IListListener
    {

        public abstract void onListMinuteChanged(int i);
    }


    protected static final String CONTENT = "content";
    private final int NO_PRECIP_COLOR_FILL_FOR_GRADIENT = Color.parseColor("#4D011032");
    private Boolean allowUpdateSeekBarPosition;
    int mInsetValue;
    private boolean mIsOnLandscape;
    private int mLastSelectedMinute;
    private IListListener mListListener;
    private ListView mListView;
    private BaseSeekBar mSeekBar;

    public MinuteCastListFragment()
    {
        allowUpdateSeekBarPosition = Boolean.valueOf(false);
        mIsOnLandscape = false;
        mInsetValue = 0;
        mLastSelectedMinute = 0;
    }

    private LayerDrawable buildLayersWithGradientAndPadding(WeatherDataModel weatherdatamodel)
    {
        weatherdatamodel = new GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.LEFT_RIGHT, MinuteCastUtilities.getMinuteCastColors(weatherdatamodel, getMinuteCastDryColor()));
        ClipDrawable clipdrawable = new ClipDrawable(new ColorDrawable(0), 3, 1);
        return new LayerDrawable(new Drawable[] {
            new InsetDrawable(weatherdatamodel, 0, mInsetValue, 0, mInsetValue), clipdrawable
        });
    }

    private void getSeekBarFromXML()
    {
        if (!Utilities.isScreenSizeLargeOrGreater(getActivity()) && mIsOnLandscape)
        {
            mSeekBar = (HorizontalSeekBar)getView().findViewById(com.accuweather.android.R.id.seekBar2);
        } else
        {
            mSeekBar = (VerticalSeekBar)getView().findViewById(com.accuweather.android.R.id.seekBar1);
            setupSeekBarVerticalInset();
        }
        if (mSeekBar != null)
        {
            mSeekBar.setOnSeekBarChangeListener(this);
        }
    }

    private int getSeekBarPositionToScroll(int i, int j)
    {
        float f = (float)mLastSelectedMinute / (float)j;
        return (int)((float)(mSeekBar.getMax() + i) * f);
    }

    private void init()
    {
        getSeekBarFromXML();
        mListView = (ListView)getView().findViewById(0x102000a);
        mListView.setOnScrollListener(this);
        mListView.setOnTouchListener(this);
        updateView();
    }

    public static MinuteCastListFragment newInstance(int i)
    {
        Logger.d("MinuteCastListFragment", "MinuteCastListFragment newInstance");
        MinuteCastListFragment minutecastlistfragment = new MinuteCastListFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("selectedMinute", i);
        minutecastlistfragment.setArguments(bundle);
        return minutecastlistfragment;
    }

    private void setSeekBarPosition(int i)
    {
        if (mSeekBar != null)
        {
            mSeekBar.setOnSeekBarChangeListener(null);
            mSeekBar.setProgress(i);
            mSeekBar.updateThumb();
            mSeekBar.setOnSeekBarChangeListener(this);
        }
    }

    private void updatePrecipitationSummaryTextView(WeatherDataModel weatherdatamodel)
    {
        TextView textview;
label0:
        {
            textview = (TextView)getView().findViewById(com.accuweather.android.R.id.summaryTextView);
            if (textview != null)
            {
                if (weatherdatamodel == null || weatherdatamodel.getMinuteCastResult() == null || weatherdatamodel.getMinuteCastResult().getSummary() == null || weatherdatamodel.getMinuteCastResult().getSummary().getPhrase() == null)
                {
                    break label0;
                }
                textview.setText(weatherdatamodel.getMinuteCastResult().getSummary().getPhrase());
            }
            return;
        }
        textview.setText("---");
    }

    private void updateSeekBarPosition(int i, int j)
    {
label0:
        {
            if (mSeekBar != null)
            {
                if (!mIsOnLandscape || Utilities.isScreenSizeLargeOrGreater(getActivity()))
                {
                    break label0;
                }
                setSeekBarPosition(mLastSelectedMinute);
            }
            return;
        }
        setSeekBarPosition(getSeekBarPositionToScroll(i, j));
    }

    protected int getContentViewId()
    {
        return com.accuweather.android.R.layout.minute_cast_list;
    }

    protected int getMinuteCastDryColor()
    {
        return NO_PRECIP_COLOR_FILL_FOR_GRADIENT;
    }

    protected MinuteCastListAdapter getMinuteCastListAdapter(WeatherDataModel weatherdatamodel)
    {
        return new MinuteCastListAdapter(getActivity(), weatherdatamodel);
    }

    public int getSelectedMinute()
    {
        return mLastSelectedMinute;
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        int i;
        if (getArguments() != null)
        {
            i = getArguments().getInt("selectedMinute");
        } else
        {
            i = 0;
        }
        mLastSelectedMinute = i;
        mIsOnLandscape = Utilities.isLandscape(getActivity());
        init();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(getContentViewId(), null);
    }

    public void onProgressChanged(SeekBar seekbar, int i, boolean flag)
    {
        Logger.i(getClass().getName(), (new StringBuilder()).append("progress is ").append(seekbar.getProgress()).toString());
        updateListViewPositionFromSeekBar(i);
    }

    public void onScroll(AbsListView abslistview, int i, int j, int k)
    {
        if (allowUpdateSeekBarPosition.booleanValue())
        {
            mLastSelectedMinute = i;
            if (mSeekBar != null)
            {
                updateSeekBarPosition(j, k);
            }
            if (mListListener != null)
            {
                mListListener.onListMinuteChanged(i);
            }
        }
    }

    public void onScrollStateChanged(AbsListView abslistview, int i)
    {
        if (i == 0)
        {
            allowUpdateSeekBarPosition = Boolean.valueOf(false);
        }
        if (i == 1)
        {
            AccuAnalytics.logStateEvent(getActivity(), "Interaction on the MinuteCast List view");
        }
    }

    public void onStartTrackingTouch(SeekBar seekbar)
    {
        Logger.i(getClass().getName(), (new StringBuilder()).append("onStartTrackingTouch position is ").append(seekbar.getProgress()).toString());
    }

    public void onStopTrackingTouch(SeekBar seekbar)
    {
        Logger.i(getClass().getName(), (new StringBuilder()).append("onStopTrackingTouch position is ").append(seekbar.getProgress()).toString());
    }

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        motionevent.getAction();
        JVM INSTR tableswitch 0 2: default 32
    //                   0 51
    //                   1 32
    //                   2 51;
           goto _L1 _L2 _L1 _L2
_L1:
        return mIsOnLandscape && !Utilities.isScreenSizeLargeOrGreater(getActivity());
_L2:
        allowUpdateSeekBarPosition = Boolean.valueOf(true);
          goto _L1
    }

    public void setListListener(IListListener ilistlistener)
    {
        mListListener = ilistlistener;
    }

    public void setSelectedMinute(int i)
    {
        mLastSelectedMinute = i;
        updateListViewPosition(true, i);
        setSeekBarPosition(i);
    }

    protected void setupSeekBarVerticalInset()
    {
        float f1 = getResources().getDisplayMetrics().density;
        if ((double)f1 == 1.0D)
        {
            mInsetValue = (int)(25F * f1 + 0.5F);
            return;
        }
        if (Utilities.isGingerbreadOrEarlier())
        {
            float f;
            if (Utilities.isScreenSizeLargeOrGreater(getActivity()))
            {
                f = (348F * f1) / (float)getResources().getDisplayMetrics().widthPixels;
            } else
            {
                f = getResources().getDisplayMetrics().widthPixels;
            }
            mInsetValue = (int)((f - 40F * (f1 / 160F)) / 15F);
            Logger.i(this, (new StringBuilder()).append("earlier than gbread and inset is ").append(mInsetValue).toString());
            return;
        }
        if (Utilities.isKindleDevice(getActivity()))
        {
            mInsetValue = 32;
        } else
        {
            mInsetValue = (int)(25F * f1 + 0.5F);
        }
        Logger.i(this, (new StringBuilder()).append("earlier than gbread and inset is ").append(mInsetValue).toString());
    }

    public void updateListViewPosition(boolean flag, int i)
    {
        if (mIsOnLandscape && !Utilities.isScreenSizeLargeOrGreater(getActivity()) || !flag)
        {
            mListView.setSelection(i);
            return;
        }
        if (Utilities.isHoneycombOrGreater())
        {
            mListView.smoothScrollToPositionFromTop(i, 0);
            return;
        } else
        {
            mListView.smoothScrollToPosition(i);
            return;
        }
    }

    public void updateListViewPositionFromSeekBar(int i)
    {
        int j = mListView.getAdapter().getCount();
        int k = mListView.getLastVisiblePosition() - mListView.getFirstVisiblePosition();
        if (i <= j - k)
        {
            mLastSelectedMinute = i;
        } else
        {
            mLastSelectedMinute = j - k;
        }
        updateListViewPosition(true, i);
    }

    protected void updateView()
    {
        if (getView() != null && getActivity() != null)
        {
            WeatherDataModel weatherdatamodel = Data.getInstance(getActivity()).getCurrentlyViewedWeatherDataModel();
            if (weatherdatamodel != null)
            {
                updatePrecipitationSummaryTextView(weatherdatamodel);
                mListView.setAdapter(getMinuteCastListAdapter(weatherdatamodel));
                updateListViewPosition(false, mLastSelectedMinute);
                if (mSeekBar != null)
                {
                    mSeekBar.setProgressDrawable(buildLayersWithGradientAndPadding(weatherdatamodel));
                    mSeekBar.updateThumb();
                }
                setSeekBarPosition(mLastSelectedMinute);
            }
        }
    }
}
