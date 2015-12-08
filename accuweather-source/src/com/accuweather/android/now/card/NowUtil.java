// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.now.card;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import com.accuweather.android.models.Measurement;
import com.accuweather.android.models.MeasurementRange;
import com.accuweather.android.models.WeatherDataModel;
import com.accuweather.android.models.current.CurrentConditionsResult;
import com.accuweather.android.models.daily.DailyForecast;
import com.accuweather.android.models.daily.DayNight;
import com.accuweather.android.models.daily.ForecastResult;
import com.accuweather.android.models.daily.Headline;
import com.accuweather.android.models.quarter.QuarterResult;
import com.accuweather.android.models.quarter.QuarterResults;
import com.accuweather.android.utilities.DateUtils;
import com.accuweather.android.utilities.Logger;
import com.accuweather.android.utilities.StringUtils;
import com.google.api.client.extensions.android.http.AndroidHttp;
import com.google.api.client.extensions.android.json.AndroidJsonFactory;
import com.google.api.client.googleapis.auth.oauth2.GoogleCredential;
import com.google.api.client.googleapis.json.GoogleJsonResponseException;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.gson.GsonFactory;
import com.google.api.services.now.Now;
import com.google.api.services.now.model.Action;
import com.google.api.services.now.model.Card;
import com.google.api.services.now.model.CardContent;
import com.google.api.services.now.model.CardContexts;
import com.google.api.services.now.model.Image;
import com.google.api.services.now.model.ListCard;
import com.google.api.services.now.model.ListItem;
import com.google.api.services.now.model.LocalTimeRange;
import com.google.api.services.now.model.TemplatedString;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class NowUtil
{

    private static final String ACCUWEATHER_ALERT_ICON_URL = "http://vortex.accuweather.com/adc2010/images/google/now/padded/alert.png";
    private static final String ACCUWEATHER_CARD_DEEP_LINK_TO_DAILY_FORECAST_SCREEN = "android-app://com.accuweather.android/http/accuweather.com/dailyforecastscreen";
    private static final String ACCUWEATHER_CARD_DEEP_LINK_TO_HOME_SCREEN = "android-app://com.accuweather.android/http/accuweather.com/homescreen";
    private static final String ACCUWEATHER_CARD_DEEP_LINK_TO_HOURLY_FORECAST_SCREEN = "android-app://com.accuweather.android/http/accuweather.com/hourlyforecastscreen";
    private static final String ACCUWEATHER_CARD_LOGO_URL = "http://vortex.accuweather.com/adc2010/images/google/now/ic_144x144_fullcolor/ic_45_accuwx_logo.png";
    private static final String ACCUWEATHER_ICON_URL = "http://vortex.accuweather.com/adc2010/images/google/now/padded/";
    private static final String AFTERNOON_SECTION = "afternoon_section";
    private static final String DAY_AFTER_TOMORROW_SECTION = "dayAfterTomorrow_section";
    private static final String EN_LOCALES[] = {
        "en_US", "en_AU", "en_GB", "en_CA", "en_NZ", "en_SG", "en_IN", "en_IE", "en_ZA"
    };
    private static final List EN_LOCALE_LIST = Collections.unmodifiableList(Arrays.asList(EN_LOCALES));
    static HttpTransport HTTP_TRANSPORT = AndroidHttp.newCompatibleTransport();
    private static final String LFS_SECTION = "lfs_section";
    private static final String TAG = "NowUtil";
    private static final String TOMORROW_SECTION = "tomorrow_section";

    public NowUtil()
    {
    }

    private static HashMap buildEveningContent(Context context, ForecastResult forecastresult)
        throws Exception
    {
        HashMap hashmap;
        try
        {
            writeToFile("NowUtil", "buildEveningContent", false);
            hashmap = new HashMap();
            ListItem listitem = new ListItem();
            Object obj = (DailyForecast)forecastresult.getDailyForecasts().get(1);
            forecastresult = (DailyForecast)forecastresult.getDailyForecasts().get(2);
            Object obj1 = new ArrayList();
            ((List) (obj1)).add((new TemplatedString()).setDisplayString((new StringBuilder()).append(getHighTemperatureText(context, ((DailyForecast) (obj)))).append("/").append(getLowTemperatureText(context, ((DailyForecast) (obj)))).toString()));
            Image image = new Image();
            image.setUrl(getIconUrlFromIconCode(context, getIconCode(((DailyForecast) (obj)))));
            listitem.setTitle((new TemplatedString()).setDisplayString(context.getString(com.accuweather.android.R.string.tomorrow))).setSubtitle((new TemplatedString()).setDisplayString(((DailyForecast) (obj)).getDay().getIconPhrase())).setDetails(((List) (obj1))).setImage(image).setTapAction((new Action()).setUrls(Collections.singletonList("android-app://com.accuweather.android/http/accuweather.com/dailyforecastscreen")));
            hashmap.put("tomorrow_section", listitem);
            listitem = new ListItem();
            obj = new ArrayList();
            ((List) (obj)).add((new TemplatedString()).setDisplayString((new StringBuilder()).append(getHighTemperatureText(context, forecastresult)).append("/").append(getLowTemperatureText(context, forecastresult)).toString()));
            obj1 = new Image();
            ((Image) (obj1)).setUrl(getIconUrlFromIconCode(context, getIconCode(forecastresult)));
            context = DateUtils.toFullDayName(forecastresult.getDate(), context.getResources().getConfiguration().locale);
            listitem.setTitle((new TemplatedString()).setDisplayString(context)).setSubtitle((new TemplatedString()).setDisplayString(forecastresult.getDay().getIconPhrase())).setDetails(((List) (obj))).setImage(((Image) (obj1))).setTapAction((new Action()).setUrls(Collections.singletonList("android-app://com.accuweather.android/http/accuweather.com/dailyforecastscreen")));
            hashmap.put("dayAfterTomorrow_section", listitem);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            writeToFile("NowUtil", (new StringBuilder()).append("buildEveningContent error: ").append(context.getMessage()).toString(), true);
            Logger.e("NowUtil", (new StringBuilder()).append("buildEveningContent error: ").append(context.getMessage()).toString());
            throw context;
        }
        return hashmap;
    }

    private static HashMap buildMorningContent(Context context, WeatherDataModel weatherdatamodel)
        throws Exception
    {
        HashMap hashmap;
        ListItem listitem;
        Object obj;
        writeToFile("NowUtil", "buildMorningContent", false);
        hashmap = new HashMap();
        listitem = new ListItem();
        obj = (QuarterResult)weatherdatamodel.getQuartersResults().get(1);
        ArrayList arraylist1 = new ArrayList();
        arraylist1.add((new TemplatedString()).setDisplayString(getTemperatureText(context, ((QuarterResult) (obj)))));
        Image image1 = new Image();
        image1.setUrl(getIconUrlFromIconCode(context, getIconCode(((QuarterResult) (obj)))));
        listitem.setTitle((new TemplatedString()).setDisplayString(context.getString(com.accuweather.android.R.string.thisAfternoon))).setSubtitle((new TemplatedString()).setDisplayString(((QuarterResult) (obj)).getIconPhrase())).setDetails(arraylist1).setImage(image1).setTapAction((new Action()).setUrls(Collections.singletonList("android-app://com.accuweather.android/http/accuweather.com/hourlyforecastscreen")));
        hashmap.put("afternoon_section", listitem);
        listitem = new ListItem();
        obj = weatherdatamodel.getForecast().getHeadline();
        if (((Headline) (obj)).getSeverity().intValue() > 3 || obj == null)
        {
            break MISSING_BLOCK_LABEL_295;
        }
        if (((Headline) (obj)).getText() == null || "".equals(((Headline) (obj)).getText()))
        {
            break MISSING_BLOCK_LABEL_295;
        }
        listitem.setTitle((new TemplatedString()).setDisplayString(context.getString(com.accuweather.android.R.string.lookingAhead))).setSubtitle((new TemplatedString()).setDisplayString(((Headline) (obj)).getText())).setTapAction((new Action()).setUrls(Collections.singletonList("android-app://com.accuweather.android/http/accuweather.com/homescreen")));
_L1:
        hashmap.put("lfs_section", listitem);
        return hashmap;
        try
        {
            weatherdatamodel = (QuarterResult)weatherdatamodel.getQuartersResults().get(2);
            ArrayList arraylist = new ArrayList();
            arraylist.add((new TemplatedString()).setDisplayString(getTemperatureText(context, weatherdatamodel)));
            Image image = new Image();
            image.setUrl(getIconUrlFromIconCode(context, getIconCode(weatherdatamodel)));
            listitem.setTitle((new TemplatedString()).setDisplayString(context.getString(com.accuweather.android.R.string.thisEvening))).setSubtitle((new TemplatedString()).setDisplayString(weatherdatamodel.getIconPhrase())).setDetails(arraylist).setImage(image).setTapAction((new Action()).setUrls(Collections.singletonList("android-app://com.accuweather.android/http/accuweather.com/homescreen")));
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            writeToFile("NowUtil", (new StringBuilder()).append("buildMorningContent error: ").append(context.getMessage()).toString(), true);
            Logger.e("NowUtil", (new StringBuilder()).append("buildMorningContent error: ").append(context.getMessage()).toString());
            throw context;
        }
          goto _L1
    }

    public static String createEveningWeatherCard(Context context, Now now, String s, WeatherDataModel weatherdatamodel)
        throws Exception
    {
        Object obj;
        Object obj1;
        ListItem listitem;
        Object obj2;
        Image image;
        ArrayList arraylist;
        ListItem listitem1;
        TemplatedString templatedstring;
        CurrentConditionsResult currentconditionsresult;
        boolean flag;
        try
        {
            writeToFile("NowUtil", "createEveningWeatherCard", false);
            obj1 = weatherdatamodel.getCityName();
            obj = context.getString(com.accuweather.android.R.string.nowCardJustification);
            obj2 = weatherdatamodel.getForecast();
            QuarterResult quarterresult = (QuarterResult)weatherdatamodel.getQuartersResults().get(1);
            currentconditionsresult = weatherdatamodel.getCurrentConditionsModel();
            flag = weatherdatamodel.getAlertIsActive();
            listitem = new ListItem();
            image = new Image();
            arraylist = new ArrayList();
            arraylist.add((new TemplatedString()).setDisplayString(getTemperatureText(context, quarterresult)));
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            writeToFile("NowUtil", (new StringBuilder()).append("createMEveningWeatherCard error: ").append(context.getMessage()).toString(), true);
            Logger.e("NowUtil", (new StringBuilder()).append("createEveningWeatherCard error: ").append(context.getMessage()).toString());
            throw context;
        }
        if (!flag) goto _L2; else goto _L1
_L1:
        image.setUrl("http://vortex.accuweather.com/adc2010/images/google/now/padded/alert.png");
_L3:
        listitem1 = listitem.setTitle((new TemplatedString()).setDisplayString(context.getString(com.accuweather.android.R.string.current)));
        templatedstring = new TemplatedString();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_532;
        }
        weatherdatamodel = context.getString(com.accuweather.android.R.string.severeWeatherAlert);
_L4:
        listitem1.setSubtitle(templatedstring.setDisplayString(weatherdatamodel)).setDetails(arraylist).setImage(image).setTapAction((new Action()).setUrls(Collections.singletonList("android-app://com.accuweather.android/http/accuweather.com/homescreen")));
        weatherdatamodel = buildEveningContent(context, ((ForecastResult) (obj2)));
        context = (ListItem)weatherdatamodel.get("tomorrow_section");
        weatherdatamodel = (ListItem)weatherdatamodel.get("dayAfterTomorrow_section");
        obj2 = new ArrayList();
        ((List) (obj2)).add(listitem);
        ((List) (obj2)).add(context);
        ((List) (obj2)).add(weatherdatamodel);
        context = (new ListCard()).setTitle((new TemplatedString()).setDisplayString(((String) (obj1)))).setLogo((new Image()).setUrl("http://vortex.accuweather.com/adc2010/images/google/now/ic_144x144_fullcolor/ic_45_accuwx_logo.png")).setListItems(((List) (obj2)));
        context = (new CardContent()).setListCard(context).setLocales(EN_LOCALE_LIST).setJustification((new TemplatedString()).setDisplayString(((String) (obj))));
        weatherdatamodel = new ArrayList();
        obj = new com.google.api.services.now.model.Context();
        obj1 = new LocalTimeRange();
        ((LocalTimeRange) (obj1)).setStartTime(String.format("%02d:00:00", new Object[] {
            Integer.valueOf(16)
        }));
        ((LocalTimeRange) (obj1)).setEndTime(String.format("%02d:00:00", new Object[] {
            Integer.valueOf(19)
        }));
        ((com.google.api.services.now.model.Context) (obj)).setLocalTimeRange(((LocalTimeRange) (obj1)));
        weatherdatamodel.add(obj);
        return sendCard(now, context, s, (new CardContexts()).setInlineContexts(weatherdatamodel));
_L2:
        image.setUrl(getIconUrlFromIconCode(context, getIconCode(currentconditionsresult)));
          goto _L3
        weatherdatamodel = currentconditionsresult.getWeatherText();
          goto _L4
    }

    public static String createMorningWeatherCard(Context context, Now now, String s, WeatherDataModel weatherdatamodel)
        throws Exception
    {
        Object obj;
        Logger.i("NowUtil", "createMorningWeatherCard");
        Object obj1;
        String s1;
        ListItem listitem;
        Image image;
        ArrayList arraylist;
        ListItem listitem1;
        TemplatedString templatedstring;
        boolean flag;
        try
        {
            writeToFile("NowUtil", "createMorningWeatherCard", false);
            s1 = weatherdatamodel.getCityName();
            obj1 = context.getString(com.accuweather.android.R.string.nowCardJustification);
            QuarterResult quarterresult = (QuarterResult)weatherdatamodel.getQuartersResults().get(0);
            obj = weatherdatamodel.getCurrentConditionsModel();
            flag = weatherdatamodel.getAlertIsActive();
            listitem = new ListItem();
            image = new Image();
            arraylist = new ArrayList();
            arraylist.add((new TemplatedString()).setDisplayString(getTemperatureText(context, quarterresult)));
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            writeToFile("NowUtil", (new StringBuilder()).append("createMorningWeatherCard error: ").append(context.getMessage()).toString(), true);
            Logger.e("NowUtil", (new StringBuilder()).append("createMorningWeatherCard error: ").append(context.getMessage()).toString());
            throw context;
        }
        if (!flag) goto _L2; else goto _L1
_L1:
        image.setUrl("http://vortex.accuweather.com/adc2010/images/google/now/padded/alert.png");
_L3:
        listitem1 = listitem.setTitle((new TemplatedString()).setDisplayString(context.getString(com.accuweather.android.R.string.current)));
        templatedstring = new TemplatedString();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_535;
        }
        obj = context.getString(com.accuweather.android.R.string.severeWeatherAlert);
_L4:
        listitem1.setSubtitle(templatedstring.setDisplayString(((String) (obj)))).setDetails(arraylist).setImage(image).setTapAction((new Action()).setUrls(Collections.singletonList("android-app://com.accuweather.android/http/accuweather.com/homescreen")));
        weatherdatamodel = buildMorningContent(context, weatherdatamodel);
        context = (ListItem)weatherdatamodel.get("afternoon_section");
        weatherdatamodel = (ListItem)weatherdatamodel.get("lfs_section");
        obj = new ArrayList();
        ((List) (obj)).add(listitem);
        ((List) (obj)).add(context);
        ((List) (obj)).add(weatherdatamodel);
        context = (new ListCard()).setTitle((new TemplatedString()).setDisplayString(s1)).setLogo((new Image()).setUrl("http://vortex.accuweather.com/adc2010/images/google/now/ic_144x144_fullcolor/ic_45_accuwx_logo.png")).setListItems(((List) (obj)));
        context = (new CardContent()).setListCard(context).setLocales(EN_LOCALE_LIST).setJustification((new TemplatedString()).setDisplayString(((String) (obj1))));
        weatherdatamodel = new ArrayList();
        obj = new com.google.api.services.now.model.Context();
        obj1 = new LocalTimeRange();
        ((LocalTimeRange) (obj1)).setStartTime(String.format("%02d:00:00", new Object[] {
            Integer.valueOf(6)
        }));
        ((LocalTimeRange) (obj1)).setEndTime(String.format("%02d:00:00", new Object[] {
            Integer.valueOf(10)
        }));
        ((com.google.api.services.now.model.Context) (obj)).setLocalTimeRange(((LocalTimeRange) (obj1)));
        weatherdatamodel.add(obj);
        return sendCard(now, context, s, (new CardContexts()).setInlineContexts(weatherdatamodel));
_L2:
        image.setUrl(getIconUrlFromIconCode(context, getIconCode(((CurrentConditionsResult) (obj)))));
          goto _L3
        obj = ((CurrentConditionsResult) (obj)).getWeatherText();
          goto _L4
    }

    public static void deleteCard(Now now, String s)
        throws Exception
    {
        try
        {
            writeToFile("NowUtil", "delete card", false);
            now.users().cards().delete("me", s).execute();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Now now)
        {
            writeToFile("NowUtil", (new StringBuilder()).append("Error deleting card : ").append(now.getMessage()).toString(), true);
        }
        Logger.e("NowUtil", (new StringBuilder()).append("Error deleting card : ").append(now.getMessage()).toString());
        throw now;
    }

    private static String getHighTemperatureText(Context context, DailyForecast dailyforecast)
    {
        if (dailyforecast.getHighTemperature() != null)
        {
            return (new StringBuilder()).append(dailyforecast.getHighTemperature().intValue()).append("\260").toString();
        } else
        {
            return context.getString(com.accuweather.android.R.string.NA);
        }
    }

    private static String getIconCode(CurrentConditionsResult currentconditionsresult)
    {
        return StringUtils.padLeft((new StringBuilder()).append(currentconditionsresult.getWeatherIcon()).append("").toString(), '0', 2);
    }

    private static String getIconCode(DailyForecast dailyforecast)
    {
        return StringUtils.padLeft((new StringBuilder()).append(dailyforecast.getDay().getIcon()).append("").toString(), '0', 2);
    }

    private static String getIconCode(QuarterResult quarterresult)
    {
        return StringUtils.padLeft((new StringBuilder()).append(quarterresult.getIcon()).append("").toString(), '0', 2);
    }

    private static String getIconUrlFromIconCode(Context context, String s)
    {
        String s1 = "";
        String as[] = context.getResources().getStringArray(com.accuweather.android.R.array.icons_urls);
        int j = as.length;
        int i = 0;
        context = s1;
        for (; i < j; i++)
        {
            String s2 = as[i];
            if (s2.startsWith(s))
            {
                context = s2;
            }
        }

        return (new StringBuilder()).append("http://vortex.accuweather.com/adc2010/images/google/now/padded/").append(context).toString();
    }

    private static final JsonFactory getJsonFactory()
    {
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            return AndroidJsonFactory.getDefaultInstance();
        } else
        {
            return new GsonFactory();
        }
    }

    private static String getLowTemperatureText(Context context, DailyForecast dailyforecast)
    {
        if (dailyforecast.getLowTemperature() != null)
        {
            return (new StringBuilder()).append(dailyforecast.getLowTemperature().intValue()).append("\260").toString();
        } else
        {
            return context.getString(com.accuweather.android.R.string.NA);
        }
    }

    public static Now getNowInstance(Context context, String s)
        throws IOException
    {
        s = (new GoogleCredential()).setAccessToken(s);
        return (new com.google.api.services.now.Now.Builder(HTTP_TRANSPORT, getJsonFactory(), s)).setApplicationName(context.getString(com.accuweather.android.R.string.app_name)).build();
    }

    private static String getTemperatureText(Context context, QuarterResult quarterresult)
    {
        if (quarterresult.getTemperature() != null && quarterresult.getTemperature().getMaximum() != null && quarterresult.getTemperature().getMinimum() != null)
        {
            context = (new StringBuilder()).append(quarterresult.getTemperature().getMaximum().getValue().intValue()).append("\260").toString();
            quarterresult = (new StringBuilder()).append(quarterresult.getTemperature().getMinimum().getValue().intValue()).append("\260").toString();
            return (new StringBuilder()).append(context).append("/").append(quarterresult).toString();
        } else
        {
            return context.getString(com.accuweather.android.R.string.NA);
        }
    }

    public static int randInt(int i, int j)
    {
        return (new Random()).nextInt((j - i) + 1) + i;
    }

    private static String sendCard(Now now, CardContent cardcontent, String s, CardContexts cardcontexts)
        throws IOException
    {
        cardcontent = (new Card()).setContent(cardcontent).setContexts(cardcontexts);
        if (s == null || s.isEmpty())
        {
            now = (Card)now.users().cards().create("me", cardcontent).execute();
            writeToFile("NowUtil", "Create successful", false);
            return now.getCardId();
        }
        try
        {
            cardcontent.setCardId(s);
            now = (Card)now.users().cards().update("me", s, cardcontent).execute();
            writeToFile("NowUtil", "Update successful", false);
        }
        // Misplaced declaration of an exception variable
        catch (Now now)
        {
            if (now.getContent().contains("Card is the same"))
            {
                writeToFile("NowUtil", "sendCard error : Card is the same", true);
                return s;
            } else
            {
                throw now;
            }
        }
        return s;
    }

    public static void writeToFile(String s, String s1, boolean flag)
    {
    }

}
