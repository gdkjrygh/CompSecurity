// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.now.card;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.util.Log;
import com.accuweather.android.models.WeatherContentUpdateParams;
import com.accuweather.android.models.WeatherDataModel;
import com.accuweather.android.models.current.CurrentConditionsResult;
import com.accuweather.android.models.location.LocationModel;
import com.accuweather.android.services.IWeatherParser;
import com.accuweather.android.services.WeatherParser;
import com.accuweather.android.services.request.WeatherUpdateRequest;
import com.accuweather.android.utilities.Data;
import com.accuweather.android.utilities.DateUtils;
import com.accuweather.android.utilities.Logger;
import com.accuweather.android.utilities.PartnerCoding;
import com.accuweather.android.utilities.UserPreferences;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.accuweather.android.now.card:
//            AuthUtil, NowUtil, NowCardScheduler

public class NowCardService extends IntentService
{

    private static String PREFS_NAME = "NOW_CREDENTIAL_DATASTORE";
    private static final int REFRESH_WINDOW = 30;
    private static final String TAG = "NowClientService";
    private SharedPreferences credentialDatastore;

    public NowCardService()
    {
        super("NowClientService");
    }

    private WeatherContentUpdateParams buildWeatherContentUpdateParams()
    {
        WeatherContentUpdateParams weathercontentupdateparams = new WeatherContentUpdateParams();
        weathercontentupdateparams.setAlertsUpdate(true);
        weathercontentupdateparams.setCurrentConditionsUpdate(true);
        weathercontentupdateparams.setDailyUpdate(true);
        weathercontentupdateparams.setHourlyUpdate(true);
        weathercontentupdateparams.setNewsUpdate(false);
        weathercontentupdateparams.setVideoUpdate(false);
        return weathercontentupdateparams;
    }

    private static Data getData(Context context)
    {
        return Data.getInstance(context);
    }

    private long getMinutesSinceLastUpdate(WeatherDataModel weatherdatamodel)
    {
        weatherdatamodel = DateUtils.toDate(weatherdatamodel.getCurrentConditionsModel().getLocalObservationDateTime(), this);
        return (((new Date()).getTime() - weatherdatamodel.getTime()) / 60000L) % 60L;
    }

    private String getNowAccessToken(Context context)
        throws Exception
    {
        try
        {
            context = AuthUtil.getAccessToken(context, credentialDatastore, "732023175389-uvjm3ac8919d8ctlnmfo99e73lmdbd8h.apps.googleusercontent.com");
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw context;
        }
        return context;
    }

    private List getOrderedLocationKeys(List list, String s)
    {
        ArrayList arraylist;
        int i;
        boolean flag;
        arraylist = new ArrayList();
        flag = false;
        i = ((flag) ? 1 : 0);
        if (s == null) goto _L2; else goto _L1
_L1:
        int j = 0;
_L7:
        i = ((flag) ? 1 : 0);
        if (j >= list.size()) goto _L2; else goto _L3
_L3:
        if (!((LocationModel)list.get(j)).getKey().equals(s)) goto _L5; else goto _L4
_L4:
        i = j;
_L2:
        for (j = i; j < list.size(); j++)
        {
            arraylist.add(((LocationModel)list.get(j)).getKey());
        }

        break; /* Loop/switch isn't completed */
_L5:
        j++;
        if (true) goto _L7; else goto _L6
_L6:
        for (int k = 0; k < i; k++)
        {
            arraylist.add(((LocationModel)list.get(k)).getKey());
        }

        return arraylist;
    }

    private WeatherDataModel getWeatherDataModel(LocationModel locationmodel)
    {
        List list = getData(this).getWeatherDataModels();
        Object obj = null;
        WeatherDataModel weatherdatamodel = null;
        WeatherDataModel weatherdatamodel1 = obj;
        if (locationmodel != null)
        {
            weatherdatamodel1 = obj;
            if (list != null)
            {
                weatherdatamodel1 = obj;
                if (list.size() != 0)
                {
                    Iterator iterator = list.iterator();
                    do
                    {
                        weatherdatamodel1 = weatherdatamodel;
                        if (!iterator.hasNext())
                        {
                            break;
                        }
                        weatherdatamodel1 = (WeatherDataModel)iterator.next();
                        if (weatherdatamodel1.getLocationKey().equals(locationmodel.getLocKey()))
                        {
                            weatherdatamodel = weatherdatamodel1;
                        }
                    } while (true);
                }
            }
        }
        return weatherdatamodel1;
    }

    private boolean inLegitimateEveningWindow(int i, int j)
    {
        boolean flag = true;
        if (i < 16 || i >= 19)
        {
            flag = false;
        }
        return flag;
    }

    private boolean inLegitimateMorningWindow(int i, int j)
    {
        boolean flag = true;
        if (i < 6 || i >= 10)
        {
            flag = false;
        }
        return flag;
    }

    protected List getLocations(Context context)
    {
        return getData(context).getLocations();
    }

    public void onCreate()
    {
        Logger.i("NowClientService", "Inside NowClientService.onCreate");
        super.onCreate();
        credentialDatastore = getSharedPreferences(PREFS_NAME, 0);
        Logger.i("NowClientService", (new StringBuilder()).append("Got credentialDatastore : ").append(credentialDatastore).toString());
    }

    protected void onHandleIntent(Intent intent)
    {
        Object obj;
        Logger.i("NowClientService", "Inside NowClientService.onHandle");
        obj = getNowAccessToken(this);
        if (obj == null) goto _L2; else goto _L1
_L1:
        Object obj1;
        com.google.api.services.now.Now now;
        long l;
        intent = intent.getStringExtra("action");
        NowUtil.writeToFile("NowClientService", (new StringBuilder()).append("onHandleIntent: ").append(intent).toString(), false);
        now = NowUtil.getNowInstance(this, ((String) (obj)));
        obj1 = getData(this).getHomeLocation();
        obj = getWeatherDataModel(((LocationModel) (obj1)));
        l = getMinutesSinceLastUpdate(((WeatherDataModel) (obj)));
        if (l <= 30L)
        {
            break MISSING_BLOCK_LABEL_130;
        }
        NowUtil.writeToFile("NowClientService", (new StringBuilder()).append("Stale data : ").append(String.valueOf(l)).append(" minutes old").toString(), false);
        obj = refreshWeatherModel(this, ((LocationModel) (obj1)).getLocKey());
        NowCardScheduler nowcardscheduler;
        int i;
        int j;
        obj1 = credentialDatastore.getString("KEY_PREFS_CARD_ID", null);
        nowcardscheduler = new NowCardScheduler();
        Calendar calendar = Calendar.getInstance();
        i = calendar.get(11);
        j = calendar.get(12);
        if (!intent.equals("com.accuweather.android.UPDATE_ACCUWEATHER_NOW_CARDS")) goto _L4; else goto _L3
_L3:
        intent = ((Intent) (obj1));
        if (!inLegitimateMorningWindow(i, j))
        {
            break MISSING_BLOCK_LABEL_215;
        }
        obj = NowUtil.createMorningWeatherCard(this, now, ((String) (obj1)), ((WeatherDataModel) (obj)));
        intent = ((Intent) (obj1));
        if (obj != null)
        {
            intent = ((Intent) (obj));
        }
        break MISSING_BLOCK_LABEL_215;
_L4:
        flag = intent.equals("com.accuweather.android.CANCEL_UPDATE_ACCUWEATHER_NOW_CARDS");
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_346;
        }
        NowUtil.deleteCard(now, ((String) (obj1)));
_L5:
        intent = null;
        nowcardscheduler.scheduleMorningCard(this, true);
        continue; /* Loop/switch isn't completed */
_L8:
        boolean flag;
        try
        {
            obj = credentialDatastore.edit();
            ((android.content.SharedPreferences.Editor) (obj)).putString("KEY_PREFS_CARD_ID", intent);
            ((android.content.SharedPreferences.Editor) (obj)).commit();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            NowUtil.writeToFile("NowClientService", (new StringBuilder()).append("onHandleIntent error : ").append(intent.getMessage()).toString(), true);
        }
        Logger.e("NowClientService", (new StringBuilder()).append("onHandleIntent error:").append(intent.getMessage()).toString());
        return;
        intent;
        Logger.e("NowClientService", "Error deleting morning card");
          goto _L5
        if (!intent.equals("com.accuweather.android.UPDATE_ACCUWEATHER_EVENING_NOW_CARDS"))
        {
            break MISSING_BLOCK_LABEL_389;
        }
        intent = ((Intent) (obj1));
        if (!inLegitimateEveningWindow(i, j))
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = NowUtil.createEveningWeatherCard(this, now, ((String) (obj1)), ((WeatherDataModel) (obj)));
        intent = ((Intent) (obj1));
        if (obj != null)
        {
            intent = ((Intent) (obj));
        }
        continue; /* Loop/switch isn't completed */
        boolean flag1 = intent.equals("com.accuweather.android.CANCEL_UPDATE_ACCUWEATHER_EVENING_NOW_CARDS");
        intent = ((Intent) (obj1));
        if (!flag1)
        {
            continue; /* Loop/switch isn't completed */
        }
        NowUtil.deleteCard(now, ((String) (obj1)));
_L6:
        intent = null;
        nowcardscheduler.scheduleEveningCard(this, true);
        continue; /* Loop/switch isn't completed */
        intent;
        Log.e("NowClientService", "Error deleting evening card");
        if (true) goto _L6; else goto _L2
_L2:
        return;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public WeatherDataModel refreshWeatherModel(Context context, String s)
    {
        Logger.i(getClass().getName(), "In refreshWeatherModel().");
        Object obj = null;
        Context context1 = obj;
        ArrayList arraylist;
        WeatherUpdateRequest weatherupdaterequest;
        int i;
        long l;
        try
        {
            s = getOrderedLocationKeys(getLocations(context), s);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Logger.e(getClass().getName(), (new StringBuilder()).append("Error refreshing weather model: ").append(context.getMessage()).toString());
            return context1;
        }
        context1 = obj;
        arraylist = new ArrayList();
        context1 = obj;
        weatherupdaterequest = new WeatherUpdateRequest();
        i = 0;
_L2:
        context1 = obj;
        if (i >= s.size())
        {
            break; /* Loop/switch isn't completed */
        }
        context1 = obj;
        weatherupdaterequest.setLocationKey((String)s.get(i));
        context1 = obj;
        weatherupdaterequest.setMetric(UserPreferences.getMetricIntPreference(context));
        context1 = obj;
        weatherupdaterequest.setLangId(getData(context).getLangId());
        context1 = obj;
        weatherupdaterequest.setPartnerCode(PartnerCoding.getPartnerCodeFromSharedPreferences(context));
        context1 = obj;
        weatherupdaterequest.setPrimaryLocation(false);
        context1 = obj;
        weatherupdaterequest.setWeatherContentUpdateParams(buildWeatherContentUpdateParams());
        context1 = obj;
        weatherupdaterequest.setWidget(true);
        context1 = obj;
        arraylist.add(weatherupdaterequest);
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        context1 = obj;
        context = (new WeatherParser(context)).parse(weatherupdaterequest, getData(context));
        context1 = context;
        l = getMinutesSinceLastUpdate(context);
        context1 = context;
        NowUtil.writeToFile("NowClientService", (new StringBuilder()).append("New stale minutes : ").append(String.valueOf(l)).toString(), false);
        return context;
    }

}
