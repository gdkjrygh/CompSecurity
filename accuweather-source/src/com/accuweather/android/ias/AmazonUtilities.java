// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.ias;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.accuweather.android.models.WeatherDataModel;
import com.accuweather.android.models.daily.DailyForecast;
import com.accuweather.android.models.daily.DayNight;
import com.accuweather.android.models.daily.ForecastResult;
import com.accuweather.android.utilities.AccuAnalytics;
import com.accuweather.android.utilities.Constants;
import com.accuweather.android.utilities.Data;
import com.accuweather.android.utilities.DateUtils;
import com.accuweather.android.utilities.Logger;
import com.google.gson.Gson;
import com.viewpagerindicator.CirclePageIndicator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

// Referenced classes of package com.accuweather.android.ias:
//            Constantsias, AmazonConditions, AmazonSearchParameters, AmazonProductAdapter, 
//            AmazonModel, AmazonProductChoiceDialog

public class AmazonUtilities
{

    private static AmazonModel mAmazonModel;
    private static List mAmazonModelList;
    private static Random random = new Random();
    List coldSearchParameters;
    List fogSearchParameters;
    List rainSearchParameters;
    List snowSearchParameters;
    List sunSearchParameters;
    List windSearchParameters;

    public AmazonUtilities()
    {
        rainSearchParameters = new ArrayList();
        sunSearchParameters = new ArrayList();
        coldSearchParameters = new ArrayList();
        snowSearchParameters = new ArrayList();
        windSearchParameters = new ArrayList();
        fogSearchParameters = new ArrayList();
        populateRainSearchParameters();
        populateSunSearchParameters();
        populateColdSearchParameters();
        populateSnowSearchParameters();
        populateWindSearchParameters();
        populateFogSearchParameters();
    }

    public static void clearAmazonPreferences(Context context)
    {
        Logger.i("AmazonUtilities", "clearAmazonPreferences");
        context = context.getSharedPreferences("search_response", 0).edit();
        context.clear();
        context.commit();
    }

    public static AmazonModel getAmazonModel()
    {
        return mAmazonModel;
    }

    public static List getAmazonModelList()
    {
        return mAmazonModelList;
    }

    private static String getDayName(Context context, DailyForecast dailyforecast)
    {
        return DateUtils.toFullDayName(dailyforecast.getDate(), context.getResources().getConfiguration().locale);
    }

    public static void initializeAmazonDialogCondition(View view, Context context, FragmentManager fragmentmanager)
    {
        Logger.i("AmazonUtilities", "initializeAmazonDialogCondition");
        RelativeLayout relativelayout = (RelativeLayout)view.findViewById(com.accuweather.android.R.id.amazon_condition_rl);
        if (productsAvailable(context))
        {
            DailyForecast dailyforecast = (DailyForecast)Data.getInstance(context).getCurrentlyViewedWeatherDataModel().getForecast().getDailyForecasts().get(3);
            AmazonConditions amazonconditions = (AmazonConditions)Constantsias.AMAZON_ICONS.get(dailyforecast.getDay().getIcon());
            Logger.i("AmazonUtilities", (new StringBuilder()).append("AmazonCondition is ").append(amazonconditions).toString());
            view = (ImageView)view.findViewById(com.accuweather.android.R.id.amazon_condition);
            if (amazonconditions != null)
            {
                relativelayout.setVisibility(0);
                view.setBackgroundResource(amazonconditions.getIcon().intValue());
            }
            view.setOnClickListener(new android.view.View.OnClickListener(context, dailyforecast, fragmentmanager) {

                final Context val$context;
                final DailyForecast val$forecast;
                final FragmentManager val$fragmentManager;

                public void onClick(View view1)
                {
                    Logger.i(this, "onClick Amazon Triangle");
                    AccuAnalytics.logUiEvent(context, "Amazon shopping triangle click");
                    view1 = new AmazonProductChoiceDialog();
                    Bundle bundle = new Bundle();
                    bundle.putString("shorttext", forecast.getDay().getIconPhrase());
                    bundle.putString("day", AmazonUtilities.getDayName(context, forecast));
                    bundle.putString("date", DateUtils.toUserPreferredDate(forecast.getDate(), context));
                    view1.setArguments(bundle);
                    view1.show(fragmentManager, "dialog");
                }

            
            {
                context = context1;
                forecast = dailyforecast;
                fragmentManager = fragmentmanager;
                super();
            }
            });
            return;
        } else
        {
            relativelayout.setVisibility(8);
            return;
        }
    }

    private void populateColdSearchParameters()
    {
        coldSearchParameters.add(new AmazonSearchParameters("hats", "ClothingAndAccessories"));
        coldSearchParameters.add(new AmazonSearchParameters("gloves", "ClothingAndAccessories"));
        coldSearchParameters.add(new AmazonSearchParameters("jackets", "ClothingAndAccessories"));
        coldSearchParameters.add(new AmazonSearchParameters("hand warmers", "SportsAndOutdoors"));
        coldSearchParameters.add(new AmazonSearchParameters("sweaters", "ClothingAndAccessories"));
        coldSearchParameters.add(new AmazonSearchParameters("sweatshirts", "ClothingAndAccessories"));
        coldSearchParameters.add(new AmazonSearchParameters("mittens", "Baby"));
    }

    private void populateFogSearchParameters()
    {
        fogSearchParameters.add(new AmazonSearchParameters("fog", "Automotive"));
    }

    private void populateRainSearchParameters()
    {
        rainSearchParameters.add(new AmazonSearchParameters("Umbrella", "All"));
        rainSearchParameters.add(new AmazonSearchParameters("compact umbrella", "All"));
        rainSearchParameters.add(new AmazonSearchParameters("Rain boots", "ClothingAndAccessories"));
        rainSearchParameters.add(new AmazonSearchParameters("Rain boots", "Baby"));
        rainSearchParameters.add(new AmazonSearchParameters("Rain Coats", "ClothingAndAccessories"));
        rainSearchParameters.add(new AmazonSearchParameters("Rain Coats", "Baby"));
        rainSearchParameters.add(new AmazonSearchParameters("Rain jackets", "ClothingAndAccessories"));
        rainSearchParameters.add(new AmazonSearchParameters("Rain jackets", "Baby"));
        rainSearchParameters.add(new AmazonSearchParameters("Rain-X", "Automotive"));
        rainSearchParameters.add(new AmazonSearchParameters("Windshield Wipers Blades", "Automotive"));
    }

    private void populateSnowSearchParameters()
    {
        snowSearchParameters.add(new AmazonSearchParameters("warm hat", "ClothingAndAccessories"));
        snowSearchParameters.add(new AmazonSearchParameters("gloves", "ClothingAndAccessories"));
        snowSearchParameters.add(new AmazonSearchParameters("snow shovels", "LawnAndGarden"));
        snowSearchParameters.add(new AmazonSearchParameters("snow pants", "ClothingAndAccessories"));
        snowSearchParameters.add(new AmazonSearchParameters("snowboards", "SportsAndOutdoors"));
        snowSearchParameters.add(new AmazonSearchParameters("skis", "SportsAndOutdoors"));
        snowSearchParameters.add(new AmazonSearchParameters("snow chains", "Automotive"));
    }

    private void populateSunSearchParameters()
    {
        sunSearchParameters.add(new AmazonSearchParameters("Sunscreen", "HealthPersonalCare"));
        sunSearchParameters.add(new AmazonSearchParameters("Sunscreen", "beauty"));
        sunSearchParameters.add(new AmazonSearchParameters("fans", "Appliances"));
        sunSearchParameters.add(new AmazonSearchParameters("sun hats", "SportsAndOutdoors"));
        sunSearchParameters.add(new AmazonSearchParameters("sun hats", "ClothingAndAccessories"));
        sunSearchParameters.add(new AmazonSearchParameters("shorts", "ClothingAndAccessories"));
        sunSearchParameters.add(new AmazonSearchParameters("t-shirts", "ClothingAndAccessories"));
        sunSearchParameters.add(new AmazonSearchParameters("sunglasses", "SportsAndOutdoors"));
        sunSearchParameters.add(new AmazonSearchParameters("sun protective clothing", "SportsAndOutdoors"));
        sunSearchParameters.add(new AmazonSearchParameters("sun protective clothing", "ClothingAndAccessories"));
        sunSearchParameters.add(new AmazonSearchParameters("swimwear", "SportsAndOutdoors"));
        sunSearchParameters.add(new AmazonSearchParameters("swimwear", "ClothingAndAccessories"));
        sunSearchParameters.add(new AmazonSearchParameters("umbrellas", "All"));
        sunSearchParameters.add(new AmazonSearchParameters("coolers", "All"));
        sunSearchParameters.add(new AmazonSearchParameters("bandanas", "All"));
        sunSearchParameters.add(new AmazonSearchParameters("car detailing", "Automotive"));
        sunSearchParameters.add(new AmazonSearchParameters("baseball glove", "SportsAndOutdoors"));
        sunSearchParameters.add(new AmazonSearchParameters("soccer ball", "SportsAndOutdoors"));
        sunSearchParameters.add(new AmazonSearchParameters("football", "SportsAndOutdoors"));
    }

    private void populateWindSearchParameters()
    {
        windSearchParameters.add(new AmazonSearchParameters("Wind breaker", "ClothingAndAccessories"));
    }

    private static boolean productsAvailable(Context context)
    {
        boolean flag1 = false;
        context = context.getSharedPreferences("search_response", 0).getString("search_response", null);
        mAmazonModelList = getAmazonModelList();
        boolean flag = flag1;
        if (context != null)
        {
            flag = flag1;
            if (mAmazonModelList != null)
            {
                Logger.i("TabletActivity", "value != null && mAmazonModelList != null");
                flag = true;
            }
        }
        return flag;
    }

    public static void setAmazonModel(AmazonModel amazonmodel)
    {
        mAmazonModel = amazonmodel;
    }

    public static void setAmazonModelList(List list)
    {
        mAmazonModelList = list;
    }

    protected static void setTypeFaces(TextView textview, TextView textview1)
    {
        textview.setTypeface(Data.getRobotoBoldCondensed());
        textview1.setTypeface(Data.getRobotoCondensed());
    }

    public static boolean shouldShowAmazonProducts(Context context)
    {
        context = Build.MODEL;
        for (int i = 0; i < Constants.KINDLE_DEVICES.size(); i++)
        {
            if (((String)Constants.KINDLE_DEVICES.get(i)).equals(context))
            {
                return true;
            }
        }

        return false;
    }

    public static void storeAmazonInPreferences(List list, Context context)
    {
        list = (new Gson()).toJson(list);
        context = context.getSharedPreferences("search_response", 0).edit();
        context.putString("search_response", list);
        context.commit();
    }

    public static void updateAmazonProductsView(View view, Context context, FragmentManager fragmentmanager, DailyForecast dailyforecast)
    {
        View view1 = view.findViewById(com.accuweather.android.R.id.line_separator);
        TextView textview = (TextView)view.findViewById(com.accuweather.android.R.id.amazon_weather_statement);
        TextView textview1 = (TextView)view.findViewById(com.accuweather.android.R.id.tap_to_view_product_details);
        ViewPager viewpager = (ViewPager)view.findViewById(com.accuweather.android.R.id.amazon_view_pager);
        view = (CirclePageIndicator)view.findViewById(com.accuweather.android.R.id.indicator);
        if (productsAvailable(context))
        {
            fragmentmanager = new AmazonProductAdapter(fragmentmanager);
            fragmentmanager.setProducts(mAmazonModelList);
            viewpager.setClipChildren(false);
            viewpager.setAdapter(fragmentmanager);
            view.setViewPager(viewpager);
            view.setFillColor(context.getResources().getColor(com.accuweather.android.R.color.darker_blue));
            view1.setVisibility(0);
            textview.setVisibility(0);
            textview1.setVisibility(0);
            viewpager.setVisibility(0);
            view.setVisibility(0);
            if (dailyforecast != null)
            {
                textview.setText((new StringBuilder()).append(dailyforecast.getDay().getIconPhrase()).append(" ").append(context.getString(com.accuweather.android.R.string.On_UC_Abbr3).toLowerCase()).append(" ").append(getDayName(context, dailyforecast)).append(", ").append(DateUtils.toUserPreferredDate(dailyforecast.getDate(), context)).toString());
                textview1.setText(com.accuweather.android.R.string.tap_to_view_product_details);
                setTypeFaces(textview, textview1);
            }
            return;
        } else
        {
            view1.setVisibility(8);
            textview.setVisibility(8);
            textview1.setVisibility(8);
            viewpager.setVisibility(8);
            view.setVisibility(8);
            return;
        }
    }

    protected AmazonConditions getAmazonCondition(Context context)
    {
        return (AmazonConditions)Constantsias.AMAZON_ICONS.get(((DailyForecast)Data.getInstance(context).getCurrentlyViewedWeatherDataModel().getForecast().getDailyForecasts().get(3)).getDay().getIcon());
    }

    public AmazonSearchParameters getRandomParameters(AmazonConditions amazonconditions)
    {
        if (amazonconditions == AmazonConditions.RAIN)
        {
            return (AmazonSearchParameters)rainSearchParameters.get(random.nextInt(rainSearchParameters.size()));
        }
        if (amazonconditions == AmazonConditions.SUN)
        {
            return (AmazonSearchParameters)sunSearchParameters.get(random.nextInt(sunSearchParameters.size()));
        }
        if (amazonconditions == AmazonConditions.COLD)
        {
            return (AmazonSearchParameters)coldSearchParameters.get(random.nextInt(coldSearchParameters.size()));
        }
        if (amazonconditions == AmazonConditions.SNOW)
        {
            return (AmazonSearchParameters)snowSearchParameters.get(random.nextInt(snowSearchParameters.size()));
        }
        if (amazonconditions == AmazonConditions.WIND)
        {
            return (AmazonSearchParameters)windSearchParameters.get(random.nextInt(windSearchParameters.size()));
        }
        if (amazonconditions == AmazonConditions.FOG)
        {
            return (AmazonSearchParameters)fogSearchParameters.get(random.nextInt(fogSearchParameters.size()));
        } else
        {
            return null;
        }
    }


}
