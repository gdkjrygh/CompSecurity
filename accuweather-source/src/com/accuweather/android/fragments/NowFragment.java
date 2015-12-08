// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.fragments;

import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;
import com.accuweather.android.AbsPrimaryActivity;
import com.accuweather.android.adapters.LookingAheadAdapter;
import com.accuweather.android.ias.AmazonUtilities;
import com.accuweather.android.models.FragmentPayload;
import com.accuweather.android.models.WeatherDataModel;
import com.accuweather.android.models.daily.DailyForecast;
import com.accuweather.android.models.daily.ForecastResult;
import com.accuweather.android.models.daily.Headline;
import com.accuweather.android.utilities.AccuAnalytics;
import com.accuweather.android.utilities.BackgroundImageMappings;
import com.accuweather.android.utilities.BackgroundImages;
import com.accuweather.android.utilities.ConversionUtilities;
import com.accuweather.android.utilities.Data;
import com.accuweather.android.utilities.DateUtils;
import com.accuweather.android.utilities.GuiUtils;
import com.accuweather.android.utilities.MinuteCastUtilities;
import com.accuweather.android.utilities.UserPreferences;
import com.accuweather.android.utilities.Utilities;
import com.accuweather.android.views.ExpandableHeightListView;
import com.accuweather.android.views.MyImageView;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.accuweather.android.fragments:
//            WeatherFragment, AlertDialogFragment

public class NowFragment extends WeatherFragment
    implements android.view.View.OnClickListener, android.widget.AdapterView.OnItemClickListener
{
    public static interface INowFragmentListener
    {

        public abstract void onNavigateToDailyView();

        public abstract void onNavigateToMinuteCastView();
    }


    private INowFragmentListener mListener;
    private LookingAheadAdapter mLookingAheadAdapter;
    private int mPrefMetric;

    public NowFragment()
    {
    }

    private String getBackgroundImageIconCode()
    {
        if (mWeatherDataModel.getIsDaylight())
        {
            return BackgroundImageMappings.getDayIconCode(Integer.parseInt(mWeatherDataModel.getIconCode()));
        } else
        {
            return BackgroundImageMappings.getNightIconCode(Integer.parseInt(mWeatherDataModel.getIconCode()));
        }
    }

    private List getDailyForecastsForLfs(WeatherDataModel weatherdatamodel)
    {
        if (weatherdatamodel != null && weatherdatamodel.getForecast() != null && weatherdatamodel.getForecast().getHeadline() != null)
        {
            Object obj1 = weatherdatamodel.getForecast().getHeadline().getEffectiveDate();
            Object obj = weatherdatamodel.getForecast().getHeadline().getEndDate();
            obj1 = DateUtils.toDate(((String) (obj1)), getActivity());
            obj = DateUtils.toDate(((String) (obj)), getActivity());
            return getDailyForecastsWithinLfsDateRange(weatherdatamodel.getForecast().getDailyForecasts(), ((Date) (obj1)), ((Date) (obj)));
        } else
        {
            return new ArrayList();
        }
    }

    private List getDailyForecastsWithinLfsDateRange(List list, Date date, Date date1)
    {
        ArrayList arraylist = new ArrayList();
        if (date == null)
        {
            return list;
        }
        Object obj = Calendar.getInstance();
        ((Calendar) (obj)).setTime(date);
        ((Calendar) (obj)).set(11, 0);
        ((Calendar) (obj)).set(12, 0);
        ((Calendar) (obj)).set(13, 0);
        ((Calendar) (obj)).set(14, 0);
        obj = ((Calendar) (obj)).getTime();
        date = date1;
        if (date1 == null)
        {
            date = Calendar.getInstance();
            date.setTime(((Date) (obj)));
            date.set(11, 23);
            date.set(12, 59);
            date.set(13, 59);
            date.set(14, 0);
            date = date.getTime();
        }
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            date1 = (DailyForecast)list.next();
            if (date1.getDate() != null)
            {
                Date date2 = DateUtils.toDate(date1.getDate(), getActivity());
                if (date2 != null && date2.compareTo(((Date) (obj))) >= 0 && date2.compareTo(date) <= 0)
                {
                    arraylist.add(date1);
                }
            }
        } while (true);
        return arraylist;
    }

    private String getDewPointText()
    {
        Integer integer = mWeatherDataModel.getDewPoint();
        if (integer != null)
        {
            return (new StringBuilder()).append(integer).append("\260").toString();
        } else
        {
            return getNoDataText();
        }
    }

    private String getHumidityText()
    {
        Double double1 = mWeatherDataModel.getHumidity();
        if (double1 != null)
        {
            return (new StringBuilder()).append(double1.intValue()).append(getString(com.accuweather.android.R.string.Percent)).toString();
        } else
        {
            return getNoDataText();
        }
    }

    private String getLookingAheadSummaryText(WeatherDataModel weatherdatamodel)
    {
        if (weatherdatamodel != null && weatherdatamodel.getForecast() != null && weatherdatamodel.getForecast().getHeadline() != null)
        {
            return weatherdatamodel.getForecast().getHeadline().getText();
        } else
        {
            return getNoDataText();
        }
    }

    private String getNoDataText()
    {
        return getString(com.accuweather.android.R.string.NA);
    }

    private String getPressureText()
    {
        Double double1 = mWeatherDataModel.getPressure();
        if (double1 != null)
        {
            return ConversionUtilities.convertPressure((new StringBuilder()).append(double1).append("").toString(), mPrefMetric, getActivity(), UserPreferences.getPressureFormatInt(getActivity()));
        } else
        {
            return getNoDataText();
        }
    }

    private String getRealFeelText()
    {
        Integer integer = mWeatherDataModel.getRealfeel();
        if (integer != null)
        {
            return (new StringBuilder()).append(getString(com.accuweather.android.R.string.RealFeel)).append(" ").append(integer).append("\260").toString();
        } else
        {
            return getNoDataText();
        }
    }

    private String getTemperature()
    {
        Integer integer = mWeatherDataModel.getTemperature();
        if (integer != null)
        {
            String s = Integer.toHexString(0xffffff | getResources().getColor(com.accuweather.android.R.color.primary_text));
            return (new StringBuilder()).append(integer).append("\260").append("<small><small><font color=#").append(s).append(">").append(mWeatherDataModel.getTempUnit()).append("</font></small> </small>").toString();
        } else
        {
            return getNoDataText();
        }
    }

    private String getUvIndexText()
    {
        Integer integer = mWeatherDataModel.getUv();
        if (integer != null)
        {
            return Utilities.getUvCategory((new StringBuilder()).append(integer).append("").toString(), getActivity());
        } else
        {
            return getNoDataText();
        }
    }

    private String getVisibilityText()
    {
        boolean flag = true;
        Object obj = mWeatherDataModel.getVisibility();
        if (obj != null)
        {
            obj = (new StringBuilder()).append(obj).append(" ");
            if (mPrefMetric != 1)
            {
                flag = false;
            }
            return ((StringBuilder) (obj)).append(UserPreferences.getVisibilityUnit(flag, getActivity())).toString();
        } else
        {
            return getNoDataText();
        }
    }

    private String getWindDirectionText()
    {
        return ConversionUtilities.convertWindDirection(mWeatherDataModel.getWindDirection(), getActivity(), UserPreferences.getDirectionalUnitInt(getActivity()));
    }

    private String getWindGustSpeedText()
    {
        Integer integer = mWeatherDataModel.getGustSpeed();
        if (integer != null)
        {
            return ConversionUtilities.convertSpeed((new StringBuilder()).append(integer).append("").toString(), mPrefMetric, getActivity(), UserPreferences.getWindSpeedFormatInt(getActivity()));
        } else
        {
            return getNoDataText();
        }
    }

    private String getWindSpeedText()
    {
        Integer integer = mWeatherDataModel.getWindSpeed();
        if (integer != null)
        {
            return ConversionUtilities.convertSpeed((new StringBuilder()).append(integer).append("").toString(), mPrefMetric, getActivity(), UserPreferences.getWindSpeedFormatInt(getActivity()));
        } else
        {
            return getNoDataText();
        }
    }

    private void initBackgroundImage(String s)
    {
        BackgroundImages backgroundimages = BackgroundImages.getInstance(getActivity());
        ImageView imageview = (ImageView)getView().findViewById(com.accuweather.android.R.id.background);
        if (!backgroundimages.backgroundImagesAreLocal())
        {
            imageview.setImageBitmap(BackgroundImages.getInstance(getActivity()).getBackgroundImageFromCode(s));
            return;
        } else
        {
            imageview.setBackgroundResource(Utilities.getDrawableId((new StringBuilder()).append("background_").append(s).toString()));
            return;
        }
    }

    public static NowFragment newInstance()
    {
        return new NowFragment();
    }

    private void setTypeFaces()
    {
        Utilities.setTypeFace(getView(), Data.getRobotoCondensed());
        Utilities.setTypeFace(getView().findViewById(com.accuweather.android.R.id.wind_label), Data.getRobotoBoldCondensed());
        Utilities.setTypeFace(getView().findViewById(com.accuweather.android.R.id.short_text), Data.getRobotoBoldCondensed());
        Utilities.setTypeFace(getView().findViewById(com.accuweather.android.R.id.realfeel), Data.getRobotoBoldCondensed());
        Utilities.setTypeFace(getView().findViewById(com.accuweather.android.R.id.temperature), Data.getRobotoLight());
        Utilities.setTypeFace(getView().findViewById(com.accuweather.android.R.id.lookingAheadTextView), Data.getRobotoBoldCondensed());
    }

    private void setupMinuteCastView()
    {
        Object obj = getView().findViewById(com.accuweather.android.R.id.minuteCast);
        if (MinuteCastUtilities.isMinuteCastLocation(mWeatherDataModel) && MinuteCastUtilities.hasMinuteCastResult(mWeatherDataModel))
        {
            ((View) (obj)).setVisibility(0);
            ((View) (obj)).setOnClickListener(this);
            obj = (TextView)getView().findViewById(com.accuweather.android.R.id.minuteCastSummary);
            if (MinuteCastUtilities.shouldShowMinuteCastSummaryText(mWeatherDataModel))
            {
                if (getActivity() instanceof AbsPrimaryActivity)
                {
                    ((TextView) (obj)).setText(((AbsPrimaryActivity)getActivity()).getSummaryFromNowTimerService());
                }
                ((TextView) (obj)).setVisibility(0);
                return;
            } else
            {
                ((TextView) (obj)).setVisibility(8);
                return;
            }
        } else
        {
            ((View) (obj)).setVisibility(8);
            return;
        }
    }

    private void startTrackGAForMinuteCast()
    {
label0:
        {
            View view = getView().findViewById(com.accuweather.android.R.id.minuteCastSummary);
            if (view != null)
            {
                boolean flag;
                if (view.getVisibility() == 8)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (!flag)
                {
                    break label0;
                }
                AccuAnalytics.logStateEvent(getActivity(), "Clicks on Teaser content");
            }
            return;
        }
        AccuAnalytics.logStateEvent(getActivity(), "Clicks on MinuteCast summary");
    }

    private void updateLookingAheadAffectedDaysVisibility(List list)
    {
        View view = getView().findViewById(com.accuweather.android.R.id.affectedDaysContainer);
        byte byte0;
        if (list.isEmpty())
        {
            byte0 = 8;
        } else
        {
            byte0 = 0;
        }
        view.setVisibility(byte0);
    }

    public TextView getSummaryTextView()
    {
        return (TextView)getView().findViewById(com.accuweather.android.R.id.update_time);
    }

    public void init()
    {
        updateView();
    }

    protected boolean isInitialized()
    {
        return mWeatherDataModel != null && super.isInitialized();
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        init();
    }

    public void onClick(View view)
    {
        int i = view.getId();
        if (i == com.accuweather.android.R.id.alertIcon)
        {
            view = AlertDialogFragment.newInstance(Data.getInstance(getActivity()).getCurrentlyViewedWeatherDataModel());
            view.setTitleIconResourceId(com.accuweather.android.R.drawable.alert_img_small);
            view.show(getActivity().getSupportFragmentManager(), null);
        } else
        if (i == com.accuweather.android.R.id.minuteCast)
        {
            startTrackGAForMinuteCast();
            if (mListener != null)
            {
                mListener.onNavigateToMinuteCastView();
                return;
            }
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        mWeatherDataModel = getData().getCurrentlyViewedWeatherDataModel();
        mTitle = getString(com.accuweather.android.R.string.Now).toUpperCase(getResources().getConfiguration().locale);
        if (getActivity() instanceof INowFragmentListener)
        {
            mListener = (INowFragmentListener)getActivity();
        }
        mLookingAheadAdapter = new LookingAheadAdapter(getActivity());
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(com.accuweather.android.R.layout.now_fragment, null);
        if (getActivity() instanceof AbsPrimaryActivity)
        {
            viewgroup = (TextView)layoutinflater.findViewById(com.accuweather.android.R.id.minuteCastSummary);
            ((AbsPrimaryActivity)getActivity()).setSummaryTextView(viewgroup);
        }
        return layoutinflater;
    }

    public void onDestroyView()
    {
        Object obj = getView();
        if (obj != null)
        {
            obj = (MyImageView)((View) (obj)).findViewById(com.accuweather.android.R.id.background);
            if (obj != null)
            {
                ((MyImageView) (obj)).cleanupBitmap();
            }
        }
        super.onDestroyView();
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        if (mListener != null)
        {
            mListener.onNavigateToDailyView();
        }
    }

    public void onReceive(Intent intent)
    {
        if (intent.getAction().equals("accuwx.intent.action.UPDATE_FRAGMENT"))
        {
            if (intent.getExtras().get("fragment_payload") instanceof FragmentPayload)
            {
                mWeatherDataModel = getData().getCurrentlyViewedWeatherDataModel();
                updateView();
            }
        } else
        {
            if (intent.getAction().equals("accuwx.intent.action.UPDATE_NOW_FRAGMENT"))
            {
                mWeatherDataModel = getData().getCurrentlyViewedWeatherDataModel();
                updateView();
                return;
            }
            if (intent.getAction().equals("accuwx.intent.action.UPDATE_AMAZON_PRODUCTS"))
            {
                intent = Data.getInstance(getActivity()).getCurrentlyViewedWeatherDataModel();
                if (intent != null && intent.getForecast().getDailyForecasts().size() > 3)
                {
                    AmazonUtilities.initializeAmazonDialogCondition(getView(), getActivity(), getChildFragmentManager());
                    return;
                }
            }
        }
    }

    public void onStop()
    {
        super.onStop();
        MyImageView myimageview = (MyImageView)getView().findViewById(com.accuweather.android.R.id.background);
        if (myimageview != null)
        {
            myimageview.cleanupBitmap();
        }
    }

    public void setTitle(String s)
    {
        TextView textview;
        if (s != null && !TextUtils.isEmpty(s))
        {
            if ((textview = (TextView)getView().findViewById(com.accuweather.android.R.id.title)) != null)
            {
                textview.setText(s);
                return;
            }
        }
    }

    public void updateView()
    {
        if (!isInitialized())
        {
            return;
        }
        mPrefMetric = UserPreferences.getMetricIntPreference(getActivity());
        Object obj = (ImageView)getView().findViewById(com.accuweather.android.R.id.alertIcon);
        int i;
        if (mWeatherDataModel.getAlertIsActive())
        {
            i = 0;
        } else
        {
            i = 4;
        }
        ((ImageView) (obj)).setVisibility(i);
        ((ImageView) (obj)).setOnClickListener(this);
        setupMinuteCastView();
        initBackgroundImage(getBackgroundImageIconCode());
        obj = (ExpandableHeightListView)getView().findViewById(com.accuweather.android.R.id.lookingAheadListView);
        ((ExpandableHeightListView) (obj)).setExpanded(true);
        ((ExpandableHeightListView) (obj)).setAdapter(mLookingAheadAdapter);
        ((ExpandableHeightListView) (obj)).setOnItemClickListener(this);
        ((TextView)getView().findViewById(com.accuweather.android.R.id.short_text)).setText(mWeatherDataModel.getText());
        ((TextView)getView().findViewById(com.accuweather.android.R.id.realfeel)).setText(getRealFeelText());
        ((TextView)getView().findViewById(com.accuweather.android.R.id.temperature)).setText(Html.fromHtml(getTemperature()));
        ((TextView)getView().findViewById(com.accuweather.android.R.id.wind_speed)).setText(getWindSpeedText());
        ((TextView)getView().findViewById(com.accuweather.android.R.id.wind_direction)).setText(getWindDirectionText());
        ((TextView)getView().findViewById(com.accuweather.android.R.id.wind_gusts)).setText(getWindGustSpeedText());
        ((TextView)getView().findViewById(com.accuweather.android.R.id.humidity)).setText(getHumidityText());
        ((TextView)getView().findViewById(com.accuweather.android.R.id.pressure)).setText(getPressureText());
        ((TextView)getView().findViewById(com.accuweather.android.R.id.uv_index)).setText(getUvIndexText());
        ((TextView)getView().findViewById(com.accuweather.android.R.id.dew_point)).setText(getDewPointText());
        ((TextView)getView().findViewById(com.accuweather.android.R.id.visibility)).setText(getVisibilityText());
        ((TextView)getView().findViewById(com.accuweather.android.R.id.update_time)).setText(GuiUtils.getUpdateTimeText(getActivity(), mWeatherDataModel));
        ((TextView)getView().findViewById(com.accuweather.android.R.id.summaryTextView)).setText(getLookingAheadSummaryText(mWeatherDataModel));
        obj = getDailyForecastsForLfs(mWeatherDataModel);
        updateLookingAheadAffectedDaysVisibility(((List) (obj)));
        mLookingAheadAdapter.setDailyForecastsForLfs(((List) (obj)));
        if (AmazonUtilities.shouldShowAmazonProducts(getActivity()))
        {
            AmazonUtilities.initializeAmazonDialogCondition(getView(), getActivity(), getChildFragmentManager());
        }
        setTypeFaces();
        setTitle(mTitle);
    }
}
