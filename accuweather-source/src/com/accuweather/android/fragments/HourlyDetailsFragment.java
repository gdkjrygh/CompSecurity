// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.accuweather.android.details.views.HourlyDetailsPrecipView;
import com.accuweather.android.details.views.HourlyDetailsQuickView;
import com.accuweather.android.details.views.HourlyDetailsWindView;
import com.accuweather.android.enums.LayoutStyleType;
import com.accuweather.android.models.Measurement;
import com.accuweather.android.models.WeatherDataModel;
import com.accuweather.android.models.hourly.HourlyResult;
import com.accuweather.android.services.DetailBackgroundImageLoader;
import com.accuweather.android.utilities.BackgroundImageMappings;
import com.accuweather.android.utilities.BackgroundImages;
import com.accuweather.android.utilities.Data;
import com.accuweather.android.utilities.UserPreferences;
import com.accuweather.android.utilities.Utilities;
import com.accuweather.android.views.MyImageView;

// Referenced classes of package com.accuweather.android.fragments:
//            WeatherFragment

public class HourlyDetailsFragment extends WeatherFragment
{

    protected static final String CONTENT = "content";
    protected static final String TITLE = "title";
    private HourlyResult mHourly;
    private String mTitle;
    private int mUnitPreference;

    public HourlyDetailsFragment()
    {
    }

    private String getRealFeelText()
    {
        if (mHourly.getRealFeelTemperature() != null && mHourly.getRealFeelTemperature().getValue() != null)
        {
            return (new StringBuilder()).append(getString(com.accuweather.android.R.string.RealFeel)).append(": ").append(mHourly.getRealFeelTemperature().getValue().intValue()).append("\260").toString();
        } else
        {
            return getString(com.accuweather.android.R.string.NA);
        }
    }

    public static HourlyDetailsFragment newInstance(HourlyResult hourlyresult)
    {
        HourlyDetailsFragment hourlydetailsfragment = new HourlyDetailsFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("content", hourlyresult);
        hourlydetailsfragment.setArguments(bundle);
        return hourlydetailsfragment;
    }

    private void updateHeaderCategories(HourlyResult hourlyresult)
    {
        LayoutStyleType layoutstyletype;
        if (Utilities.isScreenSizeSmall(getActivity()))
        {
            layoutstyletype = LayoutStyleType.RIGHT_MARGIN;
        } else
        {
            layoutstyletype = LayoutStyleType.LEFT_MARGIN;
        }
        ((HourlyDetailsQuickView)getView().findViewById(com.accuweather.android.R.id.hourly_header_custom_view)).setForecastData(hourlyresult, Integer.valueOf(mUnitPreference), getActivity(), layoutstyletype, 0);
    }

    private void updatePrecipValues()
    {
        ((HourlyDetailsPrecipView)getView().findViewById(com.accuweather.android.R.id.precip_custom_view)).setForecastData(mHourly, Integer.valueOf(mUnitPreference), getActivity(), LayoutStyleType.HOURLY_TABLE, 0);
    }

    private void updateWindValues()
    {
        ((HourlyDetailsWindView)getView().findViewById(com.accuweather.android.R.id.wind_custom_view_hourly)).setForecastData(mHourly, Integer.valueOf(mUnitPreference), getActivity(), LayoutStyleType.HOURLY_TABLE, 0);
    }

    protected String getIconPrefix()
    {
        return "background_";
    }

    public void init()
    {
        if (mHourly == null)
        {
            return;
        } else
        {
            updateView();
            return;
        }
    }

    protected void initBackgroundImages(HourlyResult hourlyresult)
    {
        BackgroundImages backgroundimages = BackgroundImages.getInstance(getActivity());
        if (!backgroundimages.backgroundImagesAreLocal())
        {
            loadImagesExternal(backgroundimages, hourlyresult);
            return;
        } else
        {
            loadImagesInternal(hourlyresult);
            return;
        }
    }

    protected boolean isInitialized()
    {
        return mHourly != null && super.isInitialized();
    }

    protected void loadImagesExternal(BackgroundImages backgroundimages, HourlyResult hourlyresult)
    {
        (new DetailBackgroundImageLoader(backgroundimages, (MyImageView)getView().findViewById(com.accuweather.android.R.id.background), false)).execute(new String[] {
            BackgroundImageMappings.getDayIconCode(Integer.parseInt(hourlyresult.getWeatherIcon()))
        });
    }

    protected void loadImagesInternal(HourlyResult hourlyresult)
    {
        hourlyresult = BackgroundImageMappings.getDayIconCode(Integer.parseInt(hourlyresult.getWeatherIcon()));
        ((ImageView)getView().findViewById(com.accuweather.android.R.id.background)).setBackgroundResource(Utilities.getDrawableId((new StringBuilder()).append(getIconPrefix()).append(hourlyresult).toString()));
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        init();
    }

    public void onCreate(Bundle bundle)
    {
        Object obj = null;
        super.onCreate(bundle);
        if (getArguments() != null)
        {
            bundle = (HourlyResult)getArguments().getSerializable("content");
        } else
        {
            bundle = null;
        }
        mHourly = bundle;
        bundle = obj;
        if (getArguments() != null)
        {
            bundle = getArguments().getString("title");
        }
        mTitle = bundle;
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(com.accuweather.android.R.layout.hourly_details, null);
    }

    public void onReceive(Intent intent)
    {
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
        if (s != null)
        {
            if ((textview = (TextView)getView().findViewById(com.accuweather.android.R.id.hour)) != null)
            {
                textview.setText(s);
                return;
            }
        }
    }

    protected void setTypeFaces()
    {
        Utilities.setTypeFace(getView(), Data.getRobotoCondensed());
        Utilities.setTypeFace(getView().findViewById(com.accuweather.android.R.id.temperature), Data.getRobotoLight());
        Utilities.setTypeFace(getView().findViewById(com.accuweather.android.R.id.wind_label), Data.getRobotoBoldCondensed());
        Utilities.setTypeFace(getView().findViewById(com.accuweather.android.R.id.precip_label), Data.getRobotoBoldCondensed());
        Utilities.setTypeFace(getView().findViewById(com.accuweather.android.R.id.more_details_label), Data.getRobotoBoldCondensed());
    }

    protected void updateTemperature(HourlyResult hourlyresult, WeatherDataModel weatherdatamodel)
    {
        if (hourlyresult.getTemperature() != null && hourlyresult.getTemperature().getValue() != null)
        {
            ((TextView)getView().findViewById(com.accuweather.android.R.id.hourly_header_temperature)).setText(Html.fromHtml((new StringBuilder()).append(hourlyresult.getTemperature().getValue().intValue()).append("\260").append("<small><small>").append(weatherdatamodel.getTempUnit()).append("</small> </small>").toString()));
        }
    }

    public void updateView()
    {
        if (!isInitialized())
        {
            return;
        } else
        {
            HourlyResult hourlyresult = mHourly;
            mUnitPreference = UserPreferences.getMeasurement(getActivity());
            WeatherDataModel weatherdatamodel = Data.getInstance(getActivity()).getCurrentlyViewedWeatherDataModel();
            initBackgroundImages(hourlyresult);
            updateTemperature(hourlyresult, weatherdatamodel);
            updateHeaderCategories(hourlyresult);
            ((TextView)getView().findViewById(com.accuweather.android.R.id.realfeel)).setText(getRealFeelText());
            ((TextView)getView().findViewById(com.accuweather.android.R.id.shorttext)).setText(mHourly.getIconPhrase());
            updateWindValues();
            updatePrecipValues();
            setTypeFaces();
            setTitle(mTitle);
            return;
        }
    }
}
