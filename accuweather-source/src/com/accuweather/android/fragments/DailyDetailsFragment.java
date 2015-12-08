// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.fragments;

import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.accuweather.android.details.views.DailyDetailsPrecipView;
import com.accuweather.android.details.views.DailyDetailsQuickView;
import com.accuweather.android.details.views.DailyDetailsWindView;
import com.accuweather.android.enums.LayoutStyleType;
import com.accuweather.android.ias.AmazonUtilities;
import com.accuweather.android.models.WeatherDataModel;
import com.accuweather.android.models.daily.DailyForecast;
import com.accuweather.android.models.daily.DayNight;
import com.accuweather.android.models.daily.ForecastResult;
import com.accuweather.android.services.DetailBackgroundImageLoader;
import com.accuweather.android.utilities.BackgroundImageMappings;
import com.accuweather.android.utilities.BackgroundImages;
import com.accuweather.android.utilities.Data;
import com.accuweather.android.utilities.GuiUtils;
import com.accuweather.android.utilities.UserPreferences;
import com.accuweather.android.utilities.Utilities;
import com.accuweather.android.views.MyImageView;
import java.util.List;

// Referenced classes of package com.accuweather.android.fragments:
//            WeatherFragment, DailyDetailsUiTextBuilder

public class DailyDetailsFragment extends WeatherFragment
{

    protected static final String ADDITIONAL_CONTENT = "additional_content";
    protected static final String CONTENT = "content";
    protected static final String TITLE = "title";
    private DailyDetailsUiTextBuilder mDailyDetailsUiTextBuilder;
    private DayNight mDayForecast;
    private int mDaysOut;
    private DailyForecast mForecast;
    private DayNight mNightForecast;
    private String mTitle;
    private int mUnitPreference;

    public DailyDetailsFragment()
    {
        mDailyDetailsUiTextBuilder = new DailyDetailsUiTextBuilder();
    }

    private String getHalfDayBackgroundImageIconCode(DailyForecast dailyforecast)
    {
        return BackgroundImageMappings.getHalfDayIconCode(dailyforecast.getDay().getIcon().intValue());
    }

    private String getNightBackgroundImageIconCode(DailyForecast dailyforecast)
    {
        return BackgroundImageMappings.getNightIconCode(dailyforecast.getNight().getIcon().intValue());
    }

    private void init()
    {
        updateView();
    }

    public static DailyDetailsFragment newInstance(DailyForecast dailyforecast, int i)
    {
        DailyDetailsFragment dailydetailsfragment = new DailyDetailsFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("content", dailyforecast);
        bundle.putInt("additional_content", i);
        dailydetailsfragment.setArguments(bundle);
        return dailydetailsfragment;
    }

    private void updateDayHeaderCategories()
    {
        ((DailyDetailsQuickView)getView().findViewById(com.accuweather.android.R.id.day_header_custom_view)).setForecastData(mDayForecast, Integer.valueOf(mUnitPreference), getActivity(), LayoutStyleType.RIGHT_MARGIN, mDaysOut);
    }

    private void updateDayHeaderTempAndLabel()
    {
        ((TextView)getView().findViewById(com.accuweather.android.R.id.day_header_label)).setText(getString(com.accuweather.android.R.string.DayHigh_Abbr16).toUpperCase(getResources().getConfiguration().locale));
        ((TextView)getView().findViewById(com.accuweather.android.R.id.day_header_temperature)).setText(Html.fromHtml(mDailyDetailsUiTextBuilder.getDayHeaderTemperatureText()));
    }

    private void updateDayValues()
    {
        ((TextView)getView().findViewById(com.accuweather.android.R.id.day_info)).setText(Html.fromHtml(mDailyDetailsUiTextBuilder.getRealFeelHighTemperatureText()));
        String s = mDailyDetailsUiTextBuilder.getDayShortText();
        ((TextView)getView().findViewById(com.accuweather.android.R.id.day_shorttext)).setText(s);
        s = mForecast.getUVIndex();
        ((TextView)getView().findViewById(com.accuweather.android.R.id.uv)).setText((new StringBuilder()).append(getString(com.accuweather.android.R.string.UV)).append(": ").append(Utilities.getUvCategory(s, getActivity())).toString());
        s = mDailyDetailsUiTextBuilder.getSunriseText();
        if (TextUtils.isEmpty(s))
        {
            getView().findViewById(com.accuweather.android.R.id.sunrise_info).setVisibility(8);
        }
        ((TextView)getView().findViewById(com.accuweather.android.R.id.sunrise_info)).setText(s);
    }

    private void updateNightHeaderCategories()
    {
        ((DailyDetailsQuickView)getView().findViewById(com.accuweather.android.R.id.night_header_custom_view)).setForecastData(mNightForecast, Integer.valueOf(mUnitPreference), getActivity(), LayoutStyleType.LEFT_MARGIN, mDaysOut);
    }

    private void updateNightHeaderTempAndLabel()
    {
        ((TextView)getView().findViewById(com.accuweather.android.R.id.night_header_label)).setText(getString(com.accuweather.android.R.string.NightLow_Abbr16).toUpperCase(getResources().getConfiguration().locale));
        ((TextView)getView().findViewById(com.accuweather.android.R.id.night_header_temperature)).setText(Html.fromHtml(mDailyDetailsUiTextBuilder.getNightHeaderTemperatureText()));
    }

    private void updateNightValues()
    {
        ((TextView)getView().findViewById(com.accuweather.android.R.id.night_info)).setText(Html.fromHtml(mDailyDetailsUiTextBuilder.getRealFeelLowTemperatureText()));
        String s = mDailyDetailsUiTextBuilder.getNightShortText();
        ((TextView)getView().findViewById(com.accuweather.android.R.id.night_shorttext)).setText(s);
        String s1 = mDailyDetailsUiTextBuilder.getSunsetText();
        if (TextUtils.isEmpty(s1))
        {
            getView().findViewById(com.accuweather.android.R.id.sunset_info).setVisibility(8);
        }
        ((TextView)getView().findViewById(com.accuweather.android.R.id.sunset_info)).setText(s1);
        ((TextView)getView().findViewById(com.accuweather.android.R.id.night_shorttext)).setText(s);
    }

    private void updatePrecipValues()
    {
        ((DailyDetailsPrecipView)getView().findViewById(com.accuweather.android.R.id.precip_custom_view)).setForecastData(mForecast, Integer.valueOf(mUnitPreference), getActivity(), LayoutStyleType.DAILY_TABLE, mDaysOut);
    }

    private void updateWindValues()
    {
        ((DailyDetailsWindView)getView().findViewById(com.accuweather.android.R.id.wind_custom_view)).setForecastData(mForecast, Integer.valueOf(mUnitPreference), getActivity(), LayoutStyleType.DAILY_TABLE, mDaysOut);
    }

    protected String getHalfDayIconPrefix()
    {
        return "half_background_";
    }

    protected String getNightIconPrefix()
    {
        return "background_";
    }

    protected void initBackgroundImages(DailyForecast dailyforecast)
    {
        BackgroundImages backgroundimages = BackgroundImages.getInstance(getActivity());
        if (!backgroundimages.backgroundImagesAreLocal())
        {
            loadImagesExternal(backgroundimages, dailyforecast);
            return;
        } else
        {
            loadImagesInternal(dailyforecast);
            return;
        }
    }

    protected boolean isInitialized()
    {
        return super.isInitialized() && mForecast != null;
    }

    protected void loadImagesExternal(BackgroundImages backgroundimages, DailyForecast dailyforecast)
    {
        DetailBackgroundImageLoader detailbackgroundimageloader = new DetailBackgroundImageLoader(backgroundimages, (MyImageView)getView().findViewById(com.accuweather.android.R.id.day_header_background), true);
        backgroundimages = new DetailBackgroundImageLoader(backgroundimages, (MyImageView)getView().findViewById(com.accuweather.android.R.id.night_header_background), false);
        String s = getHalfDayBackgroundImageIconCode(dailyforecast);
        dailyforecast = getNightBackgroundImageIconCode(dailyforecast);
        if (Utilities.isGingerbreadOrEarlier())
        {
            detailbackgroundimageloader.executeSync(new String[] {
                s
            });
            backgroundimages.executeSync(new String[] {
                dailyforecast
            });
            return;
        } else
        {
            detailbackgroundimageloader.execute(new String[] {
                s
            });
            backgroundimages.execute(new String[] {
                dailyforecast
            });
            return;
        }
    }

    protected void loadImagesInternal(DailyForecast dailyforecast)
    {
        ((ImageView)getView().findViewById(com.accuweather.android.R.id.day_header_background)).setBackgroundResource(Utilities.getDrawableId((new StringBuilder()).append(getHalfDayIconPrefix()).append(getHalfDayBackgroundImageIconCode(dailyforecast)).toString()));
        ((ImageView)getView().findViewById(com.accuweather.android.R.id.night_header_background)).setBackgroundResource(Utilities.getDrawableId((new StringBuilder()).append(getNightIconPrefix()).append(getNightBackgroundImageIconCode(dailyforecast)).toString()));
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
            bundle = (DailyForecast)getArguments().getSerializable("content");
        } else
        {
            bundle = null;
        }
        mForecast = bundle;
        if (getArguments() != null)
        {
            bundle = Integer.valueOf(getArguments().getInt("additional_content"));
        } else
        {
            bundle = null;
        }
        mDaysOut = bundle.intValue();
        bundle = obj;
        if (getArguments() != null)
        {
            bundle = getArguments().getString("title");
        }
        mTitle = bundle;
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(com.accuweather.android.R.layout.daily_details, null);
    }

    public void onReceive(Intent intent)
    {
        if (intent.getAction().equals("accuwx.intent.action.UPDATE_AMAZON_PRODUCTS"))
        {
            intent = Data.getInstance(getActivity()).getCurrentlyViewedWeatherDataModel();
            if (intent != null && intent.getForecast().getDailyForecasts().size() > 3)
            {
                AmazonUtilities.updateAmazonProductsView(getView(), getActivity(), getChildFragmentManager(), (DailyForecast)intent.getForecast().getDailyForecasts().get(3));
                AmazonUtilities.initializeAmazonDialogCondition(getView(), getActivity(), getChildFragmentManager());
            }
        }
    }

    public void onStop()
    {
        super.onStop();
        MyImageView myimageview = (MyImageView)getView().findViewById(com.accuweather.android.R.id.day_header_background);
        if (myimageview != null)
        {
            myimageview.cleanupBitmap();
        }
        myimageview = (MyImageView)getView().findViewById(com.accuweather.android.R.id.night_header_background);
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
            if ((textview = (TextView)getView().findViewById(com.accuweather.android.R.id.day)) != null)
            {
                textview.setText(s);
                return;
            }
        }
    }

    protected void setTypeFaces()
    {
        Utilities.setTypeFace(getView(), Data.getRobotoCondensed());
        Utilities.setTypeFace(getView().findViewById(com.accuweather.android.R.id.day_header_temperature), Data.getRobotoBoldCondensed());
        Utilities.setTypeFace(getView().findViewById(com.accuweather.android.R.id.night_header_temperature), Data.getRobotoBoldCondensed());
        Utilities.setTypeFace(getView().findViewById(com.accuweather.android.R.id.more_details_label), Data.getRobotoBoldCondensed());
        Utilities.setTypeFace(getView().findViewById(com.accuweather.android.R.id.wind_label), Data.getRobotoBoldCondensed());
        Utilities.setTypeFace(getView().findViewById(com.accuweather.android.R.id.day_label), Data.getRobotoBoldCondensed());
        Utilities.setTypeFace(getView().findViewById(com.accuweather.android.R.id.night_label), Data.getRobotoBoldCondensed());
        Utilities.setTypeFace(getView().findViewById(com.accuweather.android.R.id.precip_label), Data.getRobotoBoldCondensed());
    }

    public void updateView()
    {
        if (!isInitialized())
        {
            return;
        }
        mDayForecast = mForecast.getDay();
        mNightForecast = mForecast.getNight();
        mUnitPreference = UserPreferences.getMeasurement(getActivity());
        DailyForecast dailyforecast = mForecast;
        WeatherDataModel weatherdatamodel = Data.getInstance(getActivity()).getCurrentlyViewedWeatherDataModel();
        mDailyDetailsUiTextBuilder.setContext(getActivity());
        mDailyDetailsUiTextBuilder.setDailyForecast(mForecast);
        mDailyDetailsUiTextBuilder.setWeatherDataModel(weatherdatamodel);
        initBackgroundImages(dailyforecast);
        updateDayHeaderTempAndLabel();
        updateDayHeaderCategories();
        updateNightHeaderTempAndLabel();
        updateNightHeaderCategories();
        updateDayValues();
        updateNightValues();
        updateWindValues();
        updatePrecipValues();
        if (AmazonUtilities.shouldShowAmazonProducts(getActivity()))
        {
            AmazonUtilities.updateAmazonProductsView(getView(), getActivity(), getChildFragmentManager(), (DailyForecast)weatherdatamodel.getForecast().getDailyForecasts().get(3));
            AmazonUtilities.initializeAmazonDialogCondition(getView(), getActivity(), getChildFragmentManager());
        }
        ((TextView)getView().findViewById(com.accuweather.android.R.id.update_time)).setText(GuiUtils.getUpdateTimeText(getActivity(), weatherdatamodel));
        setTypeFaces();
        setTitle(mTitle);
    }
}
