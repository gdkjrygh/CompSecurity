// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import android.text.TextUtils;
import android.util.Pair;
import com.fitbit.bluetooth.support.BluetoothSupportStatus;
import com.fitbit.config.BuildType;
import com.fitbit.config.b;
import com.fitbit.d.a;
import com.fitbit.data.domain.Alarm;
import com.fitbit.data.domain.AwakeningsCount;
import com.fitbit.data.domain.BodyFat;
import com.fitbit.data.domain.BodyFatGoal;
import com.fitbit.data.domain.BodyFatLogEntry;
import com.fitbit.data.domain.BodyWeight;
import com.fitbit.data.domain.CaloriesBurned;
import com.fitbit.data.domain.CaloriesBurnedIntraday;
import com.fitbit.data.domain.DietPlan;
import com.fitbit.data.domain.Distance;
import com.fitbit.data.domain.DistanceIntraday;
import com.fitbit.data.domain.Floors;
import com.fitbit.data.domain.FloorsIntraday;
import com.fitbit.data.domain.FoodItem;
import com.fitbit.data.domain.FoodLocale;
import com.fitbit.data.domain.FoodLogEntry;
import com.fitbit.data.domain.FoodRelation;
import com.fitbit.data.domain.FoodTimeSeries;
import com.fitbit.data.domain.Gender;
import com.fitbit.data.domain.LocaleInfo;
import com.fitbit.data.domain.Meal;
import com.fitbit.data.domain.MinutesAsleep;
import com.fitbit.data.domain.MinutesAsleepIntraday;
import com.fitbit.data.domain.MinutesVeryActive;
import com.fitbit.data.domain.MinutesVeryActiveIntraday;
import com.fitbit.data.domain.Notification;
import com.fitbit.data.domain.Profile;
import com.fitbit.data.domain.ProfilePreference;
import com.fitbit.data.domain.RankedUser;
import com.fitbit.data.domain.SleepGoal;
import com.fitbit.data.domain.SleepLogEntry;
import com.fitbit.data.domain.Steps;
import com.fitbit.data.domain.StepsIntraday;
import com.fitbit.data.domain.TimeSeriesObject;
import com.fitbit.data.domain.TimeZone;
import com.fitbit.data.domain.UnitSystem;
import com.fitbit.data.domain.WaterGoal;
import com.fitbit.data.domain.WaterLogDaySummary;
import com.fitbit.data.domain.WaterLogEntry;
import com.fitbit.data.domain.WeightGoal;
import com.fitbit.data.domain.WeightLogEntry;
import com.fitbit.data.domain.badges.Badge;
import com.fitbit.data.domain.device.AutoLap;
import com.fitbit.data.domain.device.Device;
import com.fitbit.data.domain.device.ExerciseOption;
import com.fitbit.data.domain.device.Scale;
import com.fitbit.data.domain.device.TrackerGoalType;
import com.fitbit.data.domain.device.TrackerInfo;
import com.fitbit.data.domain.device.TrackerType;
import com.fitbit.data.domain.device.d;
import com.fitbit.data.domain.device.f;
import com.fitbit.data.domain.heartrate.HeartRateDailySummary;
import com.fitbit.data.domain.heartrate.HeartRateExerciseSummary;
import com.fitbit.data.domain.heartrate.HeartRateIntraday;
import com.fitbit.data.domain.heartrate.RestingHeartRate;
import com.fitbit.data.domain.i;
import com.fitbit.serverinteraction.q;
import com.fitbit.util.bn;
import com.fitbit.util.o;
import com.fitbit.util.w;
import com.fitbit.weight.Fat;
import com.fitbit.weight.Weight;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.EnumSet;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.fitbit.data.bl:
//            ft

public class ao
{

    private static final String a = "PublicAPIHelper";

    public ao()
    {
    }

    private Collection Z(JSONObject jsonobject)
        throws JSONException
    {
        return a(jsonobject, "activities-restingHeartRate", com/fitbit/data/domain/heartrate/RestingHeartRate);
    }

    private RankedUser a(RankedUser rankeduser, JSONObject jsonobject)
        throws JSONException
    {
        String s1 = jsonobject.optString("email");
        if (!TextUtils.isEmpty(s1))
        {
            rankeduser.d(jsonobject.optLong("id"));
            rankeduser.b(com.fitbit.d.a.c(jsonobject, "dateTime"));
            rankeduser.b(s1);
        }
        return rankeduser;
    }

    private static String a(String s1)
    {
        if (s1 == null) goto _L2; else goto _L1
_L1:
        String as[] = s1.split("/");
        if (as.length <= 0) goto _L2; else goto _L3
_L3:
        Object obj;
        int i1;
        obj = (new StringBuilder()).append(as[0]).append("/").toString();
        i1 = 1;
_L5:
        Object obj1;
        obj1 = obj;
        if (i1 >= as.length)
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = (new StringBuilder()).append(((String) (obj))).append(URLEncoder.encode(as[i1], "UTF-8")).toString();
        obj = obj1;
_L6:
        obj1 = (new StringBuilder()).append(((String) (obj)));
        if (i1 != as.length - 1)
        {
            obj = "/";
        } else
        {
            obj = "";
        }
        obj = ((StringBuilder) (obj1)).append(((String) (obj))).toString();
        i1++;
        if (true) goto _L5; else goto _L4
        obj1;
        if (b.a.a())
        {
            com.fitbit.e.a.a("PublicAPIHelper", "Failed to encode URL for API, %s", ((Throwable) (obj1)), new Object[] {
                s1
            });
        }
        com.fitbit.e.a.a("PublicAPIHelper", "Failed to encode Url for Api", new Object[0]);
          goto _L6
_L2:
        obj1 = s1;
_L4:
        return ((String) (obj1));
    }

    public static String a(JSONObject jsonobject, int i1)
    {
        String s1;
        JSONArray jsonarray;
        int j1;
        int k1;
        if (jsonobject == null)
        {
            return null;
        }
        jsonarray = jsonobject.names();
        if (jsonarray == null)
        {
            return null;
        }
        s1 = "";
        k1 = 0;
        j1 = 0;
_L2:
        Object obj;
        if (k1 >= jsonarray.length())
        {
            break MISSING_BLOCK_LABEL_113;
        }
        obj = jsonarray.get(k1);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_136;
        }
        int l1;
        if (!(obj instanceof String))
        {
            break MISSING_BLOCK_LABEL_136;
        }
        obj = (String)obj;
        if (!((String) (obj)).startsWith("image"))
        {
            break MISSING_BLOCK_LABEL_136;
        }
        l1 = Integer.parseInt(((String) (obj)).replace("image", "").replace("px", ""));
        if (l1 > j1 && l1 < i1)
        {
            j1 = l1;
            s1 = ((String) (obj));
        }
        break MISSING_BLOCK_LABEL_136;
        try
        {
            jsonobject = com.fitbit.d.a.a(jsonobject, s1);
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            com.fitbit.e.a.e("PublicAPIHelper", "Exception occured while parsing largest image", jsonobject, new Object[0]);
            return null;
        }
        return jsonobject;
        k1++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private Collection a(JSONObject jsonobject, Date date)
        throws JSONException
    {
        return a(jsonobject, "activities-heart", "activities-heart-intraday", com/fitbit/data/domain/heartrate/HeartRateIntraday, date);
    }

    private List a(JSONArray jsonarray, com.fitbit.data.domain.RankedUser.Relation relation)
        throws JSONException
    {
        ArrayList arraylist = new ArrayList();
        for (int i1 = 0; jsonarray != null && i1 < jsonarray.length(); i1++)
        {
            RankedUser rankeduser = new RankedUser();
            b(rankeduser, jsonarray.getJSONObject(i1));
            rankeduser.a(relation);
            rankeduser.b(relation);
            arraylist.add(rankeduser);
        }

        return arraylist;
    }

    private List a(JSONObject jsonobject, String s1, Class class1)
        throws JSONException
    {
        ArrayList arraylist = new ArrayList();
        s1 = jsonobject.optJSONArray(s1);
        int i1 = 0;
        while (s1 != null && i1 < s1.length()) 
        {
            Object obj = s1.get(i1);
            if (JSONObject.NULL.equals(obj))
            {
                throw new JSONException((new StringBuilder()).append("TimeSeries array contains null reference. Received json: ").append(jsonobject).toString());
            }
            if (!(obj instanceof JSONObject))
            {
                throw new JSONException((new StringBuilder()).append("TimeSeries array contains invalid value. Received json: ").append(jsonobject).toString());
            }
            try
            {
                TimeSeriesObject timeseriesobject = (TimeSeriesObject)class1.newInstance();
                timeseriesobject.initFromPublicApiJsonObject((JSONObject)obj);
                arraylist.add(timeseriesobject);
            }
            // Misplaced declaration of an exception variable
            catch (JSONObject jsonobject)
            {
                throw new RuntimeException(jsonobject);
            }
            // Misplaced declaration of an exception variable
            catch (JSONObject jsonobject)
            {
                throw new RuntimeException(jsonobject);
            }
            i1++;
        }
        return arraylist;
    }

    private List a(JSONObject jsonobject, String s1, String s2, Class class1, Date date)
        throws JSONException
    {
        ArrayList arraylist;
        Object obj;
        obj = a(jsonobject, s1, class1);
        s1 = Calendar.getInstance();
        arraylist = new ArrayList();
        jsonobject = jsonobject.optJSONObject(s2);
        if (jsonobject != null && obj != null && ((List) (obj)).size() != 0)
        {
            break MISSING_BLOCK_LABEL_207;
        }
        if (date == null) goto _L2; else goto _L1
_L1:
        s1.setTime(com.fitbit.util.o.d(date));
_L3:
        jsonobject = jsonobject.optJSONArray("dataset");
        int i1 = 0;
        while (jsonobject != null && i1 < jsonobject.length()) 
        {
            s2 = jsonobject.getJSONObject(i1);
            try
            {
                date = (TimeSeriesObject)class1.newInstance();
                double d1 = s2.getDouble("value");
                int j1 = com.fitbit.d.a.g(s2, "time");
                obj = (Calendar)s1.clone();
                ((Calendar) (obj)).add(13, j1);
                j1 = s2.optInt("level");
                date.a(d1);
                date.a(((Calendar) (obj)).getTime());
                date.a(j1);
                date.setEntityStatus(com.fitbit.data.domain.Entity.EntityStatus.SYNCED);
                arraylist.add(date);
            }
            // Misplaced declaration of an exception variable
            catch (JSONObject jsonobject)
            {
                throw new RuntimeException(jsonobject);
            }
            // Misplaced declaration of an exception variable
            catch (JSONObject jsonobject)
            {
                throw new RuntimeException(jsonobject);
            }
            i1++;
        }
        break MISSING_BLOCK_LABEL_248;
_L2:
        return new ArrayList();
        s1.setTime(((TimeSeriesObject)((List) (obj)).get(0)).a());
          goto _L3
        return arraylist;
    }

    private Collection aa(JSONObject jsonobject)
        throws JSONException
    {
        return a(jsonobject, "activities-floors", "activities-floors-intraday", com/fitbit/data/domain/FloorsIntraday, null);
    }

    private Collection ab(JSONObject jsonobject)
        throws JSONException
    {
        return a(jsonobject, "activities-steps", "activities-steps-intraday", com/fitbit/data/domain/StepsIntraday, null);
    }

    private Collection ac(JSONObject jsonobject)
        throws JSONException
    {
        return a(jsonobject, "activities-calories", "activities-calories-intraday", com/fitbit/data/domain/CaloriesBurnedIntraday, null);
    }

    private Collection ad(JSONObject jsonobject)
        throws JSONException
    {
        return a(jsonobject, "activities-distance", "activities-distance-intraday", com/fitbit/data/domain/DistanceIntraday, null);
    }

    private Collection ae(JSONObject jsonobject)
        throws JSONException
    {
        return a(jsonobject, "activities-minutesVeryActive", "activities-minutesVeryActive-intraday", com/fitbit/data/domain/MinutesVeryActiveIntraday, null);
    }

    private Collection af(JSONObject jsonobject)
        throws JSONException
    {
        return a(jsonobject, "activities-minutesFairlyActive", "activities-minutesFairlyActive-intraday", com/fitbit/data/domain/MinutesVeryActiveIntraday, null);
    }

    private Collection ag(JSONObject jsonobject)
        throws JSONException
    {
        return a(jsonobject, "foods-log-caloriesIn", com/fitbit/data/domain/FoodTimeSeries);
    }

    private Collection ah(JSONObject jsonobject)
        throws JSONException
    {
        return a(jsonobject, "activities-floors", com/fitbit/data/domain/Floors);
    }

    private RankedUser b(RankedUser rankeduser, JSONObject jsonobject)
        throws JSONException
    {
        JSONObject jsonobject1 = jsonobject.optJSONObject("summary");
        JSONObject jsonobject2 = jsonobject.optJSONObject("user");
        JSONObject jsonobject3 = jsonobject.optJSONObject("average");
        if (jsonobject1 != null)
        {
            rankeduser.a(jsonobject1.optLong("steps"));
        }
        if (jsonobject3 != null)
        {
            rankeduser.b(jsonobject3.optLong("steps"));
        }
        if (jsonobject2 != null)
        {
            c(rankeduser, jsonobject2);
            rankeduser.d(jsonobject.optLong("id"));
            rankeduser.b(com.fitbit.d.a.c(jsonobject, "dateTime"));
        }
        rankeduser.setEntityStatus(com.fitbit.data.domain.Entity.EntityStatus.SYNCED);
        return rankeduser;
    }

    private void c(RankedUser rankeduser, JSONObject jsonobject)
        throws JSONException
    {
        rankeduser.i(jsonobject.optString("aboutMe"));
        rankeduser.g(jsonobject.optString("avatar"));
        rankeduser.d(jsonobject.optString("city"));
        rankeduser.j(jsonobject.optString("country"));
        rankeduser.k(jsonobject.optString("displayName"));
        rankeduser.f(jsonobject.optString("encodedId"));
        rankeduser.e(jsonobject.optString("fullName"));
        rankeduser.a((Gender)com.fitbit.util.w.a(jsonobject.optString("gender", "MALE"), com/fitbit/data/domain/Gender));
        rankeduser.h(jsonobject.optString("nickname"));
        rankeduser.a(com.fitbit.data.bl.ft.a().a(jsonobject.optString("timezone")));
        rankeduser.a(jsonobject.optString("state"));
        rankeduser.a(com.fitbit.d.a.e(jsonobject, "memberSince"));
        rankeduser.b(jsonobject.optString("email"));
        rankeduser.setEntityStatus(com.fitbit.data.domain.Entity.EntityStatus.SYNCED);
        rankeduser.c(jsonobject.optBoolean("challengesBeta"));
        rankeduser.b(i(jsonobject.optJSONArray("topBadges")));
    }

    public List A(JSONObject jsonobject)
        throws JSONException
    {
        jsonobject = jsonobject.optJSONArray("trackerAlarms");
        ArrayList arraylist = new ArrayList();
        for (int i1 = 0; jsonobject != null && i1 < jsonobject.length(); i1++)
        {
            JSONObject jsonobject1 = jsonobject.optJSONObject(i1);
            if (jsonobject1 != null)
            {
                Alarm alarm = new Alarm();
                alarm.initFromPublicApiJsonObject(jsonobject1);
                arraylist.add(alarm);
            }
        }

        return arraylist;
    }

    public Alarm B(JSONObject jsonobject)
        throws JSONException
    {
        Alarm alarm = new Alarm();
        jsonobject = jsonobject.optJSONObject("trackerAlarm");
        if (jsonobject != null)
        {
            alarm.initFromPublicApiJsonObject(jsonobject);
        }
        return alarm;
    }

    public com.fitbit.data.domain.a.a C(JSONObject jsonobject)
        throws JSONException
    {
        com.fitbit.data.domain.a.a a1 = new com.fitbit.data.domain.a.a();
        if (jsonobject != null)
        {
            jsonobject = jsonobject.optJSONObject("goals");
            if (jsonobject != null)
            {
                if (jsonobject.has("caloriesOut"))
                {
                    a1.a(Double.valueOf(jsonobject.optDouble("caloriesOut")));
                }
                if (jsonobject.has("distance"))
                {
                    a1.b(Double.valueOf(jsonobject.optDouble("distance")));
                }
                if (jsonobject.has("floors"))
                {
                    a1.c(Double.valueOf(jsonobject.optDouble("floors")));
                }
                if (jsonobject.has("steps"))
                {
                    a1.d(Double.valueOf(jsonobject.optDouble("steps")));
                }
                if (jsonobject.has("activeMinutes"))
                {
                    a1.e(Double.valueOf(jsonobject.optDouble("activeMinutes")));
                }
            }
        }
        return a1;
    }

    public WeightGoal D(JSONObject jsonobject)
        throws JSONException
    {
        Object obj = jsonobject.optJSONObject("goal");
        if (obj != null)
        {
            jsonobject = com.fitbit.d.a.e(((JSONObject) (obj)), "startDate");
            Double double1 = Double.valueOf(((JSONObject) (obj)).optDouble("startWeight"));
            obj = Double.valueOf(((JSONObject) (obj)).optDouble("weight"));
            if (jsonobject != null && double1 != null && obj != null)
            {
                WeightGoal weightgoal = new WeightGoal();
                weightgoal.setEntityStatus(com.fitbit.data.domain.Entity.EntityStatus.SYNCED);
                weightgoal.a(jsonobject);
                weightgoal.c(new Weight(double1.doubleValue(), com.fitbit.data.domain.WeightLogEntry.WeightUnits.KG));
                weightgoal.b(new Weight(((Double) (obj)).doubleValue(), com.fitbit.data.domain.WeightLogEntry.WeightUnits.KG));
                return weightgoal;
            }
        }
        return null;
    }

    public WaterGoal E(JSONObject jsonobject)
        throws JSONException
    {
        jsonobject = jsonobject.optJSONObject("goal");
        if (jsonobject == null)
        {
            return null;
        } else
        {
            WaterGoal watergoal = new WaterGoal();
            watergoal.setEntityStatus(com.fitbit.data.domain.Entity.EntityStatus.SYNCED);
            Date date = com.fitbit.d.a.e(jsonobject, "startDate");
            double d1 = jsonobject.getDouble("goal");
            watergoal.a(date);
            watergoal.b(Double.valueOf(d1));
            return watergoal;
        }
    }

    public SleepGoal F(JSONObject jsonobject)
        throws JSONException
    {
        jsonobject = jsonobject.optJSONObject("goal");
        if (jsonobject == null)
        {
            return null;
        }
        SleepGoal sleepgoal = new SleepGoal();
        sleepgoal.setEntityStatus(com.fitbit.data.domain.Entity.EntityStatus.SYNCED);
        Date date = com.fitbit.d.a.e(jsonobject, "updatedOn");
        if (jsonobject.has("minDuration"))
        {
            jsonobject = Double.valueOf(jsonobject.getDouble("minDuration"));
        } else
        {
            jsonobject = Double.valueOf(0.0D);
        }
        sleepgoal.a(date);
        sleepgoal.b(jsonobject);
        return sleepgoal;
    }

    public BodyFatGoal G(JSONObject jsonobject)
        throws JSONException
    {
        jsonobject = jsonobject.optJSONObject("goal");
        if (jsonobject == null || jsonobject.isNull("fat"))
        {
            return null;
        } else
        {
            BodyFatGoal bodyfatgoal = new BodyFatGoal();
            bodyfatgoal.setEntityStatus(com.fitbit.data.domain.Entity.EntityStatus.SYNCED);
            bodyfatgoal.b(Double.valueOf(jsonobject.getDouble("fat")));
            bodyfatgoal.a(com.fitbit.util.o.d(new Date()));
            return bodyfatgoal;
        }
    }

    public DietPlan H(JSONObject jsonobject)
        throws JSONException
    {
        DietPlan dietplan = new DietPlan();
        dietplan.setEntityStatus(com.fitbit.data.domain.Entity.EntityStatus.SYNCED);
        jsonobject = jsonobject.optJSONObject("foodPlan");
        if (jsonobject != null)
        {
            dietplan.a(com.fitbit.data.domain.DietPlan.IntensityLevel.parseByApiName(jsonobject.getString("intensity")));
            dietplan.a(com.fitbit.d.a.e(jsonobject, "estimatedDate"));
            dietplan.a(jsonobject.getBoolean("personalized"));
            dietplan.f();
            return dietplan;
        } else
        {
            return null;
        }
    }

    public Double I(JSONObject jsonobject)
        throws JSONException
    {
        jsonobject = jsonobject.optJSONObject("goal");
        if (jsonobject == null)
        {
            return null;
        } else
        {
            return Double.valueOf(jsonobject.getDouble("goal"));
        }
    }

    public List J(JSONObject jsonobject)
        throws JSONException
    {
        ArrayList arraylist = new ArrayList();
        jsonobject = jsonobject.optJSONArray("deviceTypes");
        int i1 = 0;
        while (jsonobject != null && i1 < jsonobject.length()) 
        {
            JSONObject jsonobject1 = jsonobject.getJSONObject(i1);
            TrackerType trackertype = new TrackerType();
            trackertype.initFromPublicApiJsonObject(jsonobject1);
            if (!"MobileTrack".equals(trackertype.a()))
            {
                arraylist.add(trackertype);
            }
            i1++;
        }
        return arraylist;
    }

    public List K(JSONObject jsonobject)
        throws JSONException
    {
        boolean flag = false;
        ArrayList arraylist = new ArrayList();
        JSONArray jsonarray = jsonobject.optJSONArray("time");
        if (jsonarray != null && jsonarray.length() > 0)
        {
            for (int i1 = 0; i1 < jsonarray.length(); i1++)
            {
                AutoLap autolap1 = new AutoLap(com.fitbit.data.domain.device.AutoLap.AutoLapType.TIME);
                autolap1.initFromPublicApiJsonObject(jsonarray.getJSONObject(i1));
                arraylist.add(autolap1);
            }

        }
        jsonarray = jsonobject.optJSONArray("distanceKm");
        if (jsonarray != null && jsonarray.length() > 0)
        {
            for (int j1 = 0; j1 < jsonarray.length(); j1++)
            {
                AutoLap autolap2 = new AutoLap(com.fitbit.data.domain.device.AutoLap.AutoLapType.DISTANCE_KM);
                autolap2.initFromPublicApiJsonObject(jsonarray.getJSONObject(j1));
                arraylist.add(autolap2);
            }

        }
        jsonobject = jsonobject.optJSONArray("distanceMile");
        if (jsonobject != null && jsonobject.length() > 0)
        {
            for (int k1 = ((flag) ? 1 : 0); k1 < jsonobject.length(); k1++)
            {
                AutoLap autolap = new AutoLap(com.fitbit.data.domain.device.AutoLap.AutoLapType.DISTANCE_MILE);
                autolap.initFromPublicApiJsonObject(jsonobject.getJSONObject(k1));
                arraylist.add(autolap);
            }

        }
        return arraylist;
    }

    public FacebookBusinessLogic.SuggestionsResult L(JSONObject jsonobject)
        throws JSONException
    {
        return com.fitbit.data.bl.FacebookBusinessLogic.SuggestionsResult.a(jsonobject.optString("facebookStatus"));
    }

    public List M(JSONObject jsonobject)
        throws JSONException
    {
        ArrayList arraylist;
        JSONArray jsonarray;
        int i1;
        arraylist = new ArrayList();
        jsonarray = jsonobject.optJSONArray("suggestions");
        i1 = 0;
_L6:
        RankedUser rankeduser;
        if (jsonarray == null || i1 >= jsonarray.length())
        {
            break MISSING_BLOCK_LABEL_177;
        }
        jsonobject = jsonarray.getJSONObject(i1);
        rankeduser = new RankedUser();
        c(rankeduser, jsonobject);
        com.fitbit.serverinteraction.PublicAPI.EmailStatus emailstatus = com.fitbit.serverinteraction.PublicAPI.EmailStatus.a(jsonobject.optString("source"));
        if (com.fitbit.serverinteraction.PublicAPI.EmailStatus.b.equals(emailstatus))
        {
            rankeduser.b(true);
        } else
        if (com.fitbit.serverinteraction.PublicAPI.EmailStatus.a.equals(emailstatus))
        {
            rankeduser.d(true);
        }
        if (!jsonobject.getBoolean("active")) goto _L2; else goto _L1
_L1:
        jsonobject = com.fitbit.data.domain.RankedUser.ActiveState.ACTIVE;
_L3:
        rankeduser.a(jsonobject);
_L4:
        rankeduser.a(com.fitbit.data.domain.RankedUser.Relation.STRANGER);
        rankeduser.b(com.fitbit.data.domain.RankedUser.Relation.STRANGER);
        arraylist.add(rankeduser);
        i1++;
        continue; /* Loop/switch isn't completed */
_L2:
        jsonobject = com.fitbit.data.domain.RankedUser.ActiveState.INACTIVE;
          goto _L3
        jsonobject;
        rankeduser.a(com.fitbit.data.domain.RankedUser.ActiveState.UNKNOWN);
          goto _L4
        return arraylist;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public List N(JSONObject jsonobject)
        throws JSONException
    {
        return a(jsonobject.getJSONArray("friends"), com.fitbit.data.domain.RankedUser.Relation.REQUEST_RECEIVE);
    }

    public List O(JSONObject jsonobject)
        throws JSONException
    {
        jsonobject = a(jsonobject.optJSONArray("sentInvites"), com.fitbit.data.domain.RankedUser.Relation.REQUEST_SENT);
        Date date = new Date();
        for (int i1 = jsonobject.size() - 1; i1 >= 0; i1--)
        {
            RankedUser rankeduser = (RankedUser)jsonobject.get(i1);
            Date date1 = rankeduser.l();
            if (date1 == null || com.fitbit.util.o.c(date1, date) > 1L)
            {
                jsonobject.remove(rankeduser);
            }
        }

        return jsonobject;
    }

    public List P(JSONObject jsonobject)
        throws JSONException
    {
        Object obj = jsonobject.optJSONArray("sentInvites");
        jsonobject = new ArrayList();
        for (int i1 = 0; obj != null && i1 < ((JSONArray) (obj)).length(); i1++)
        {
            RankedUser rankeduser = new RankedUser();
            a(rankeduser, ((JSONArray) (obj)).getJSONObject(i1));
            rankeduser.a(com.fitbit.data.domain.RankedUser.Relation.REQUEST_SENT);
            rankeduser.b(com.fitbit.data.domain.RankedUser.Relation.REQUEST_SENT);
            jsonobject.add(rankeduser);
        }

        obj = new Date();
        for (int j1 = jsonobject.size() - 1; j1 >= 0; j1--)
        {
            RankedUser rankeduser1 = (RankedUser)jsonobject.get(j1);
            Date date = rankeduser1.l();
            if (date == null || com.fitbit.util.o.c(date, ((Date) (obj))) > 1L)
            {
                jsonobject.remove(rankeduser1);
            }
        }

        return jsonobject;
    }

    public RankedUser Q(JSONObject jsonobject)
        throws JSONException
    {
        jsonobject = jsonobject.getJSONObject("user");
        if (jsonobject == null)
        {
            return null;
        } else
        {
            RankedUser rankeduser = new RankedUser();
            rankeduser.initFromPublicApiJsonObject(jsonobject);
            c(rankeduser, jsonobject);
            rankeduser.a(com.fitbit.data.domain.RankedUser.Relation.STRANGER);
            rankeduser.b(com.fitbit.data.domain.RankedUser.Relation.STRANGER);
            return rankeduser;
        }
    }

    public List R(JSONObject jsonobject)
        throws JSONException
    {
        ArrayList arraylist = new ArrayList();
        if (jsonobject != null && jsonobject.has("supportedLocales"))
        {
            jsonobject = jsonobject.getJSONObject("supportedLocales");
            if (jsonobject != null)
            {
                String s1;
                for (Iterator iterator = jsonobject.keys(); iterator.hasNext(); arraylist.add(new LocaleInfo(s1, jsonobject.getString(s1))))
                {
                    s1 = (String)iterator.next();
                }

            }
        }
        return arraylist;
    }

    public String S(JSONObject jsonobject)
        throws JSONException
    {
        if (jsonobject != null)
        {
            return com.fitbit.d.a.a(jsonobject, "recommendedLocale");
        } else
        {
            return null;
        }
    }

    public BluetoothSupportStatus T(JSONObject jsonobject)
        throws JSONException
    {
        return BluetoothSupportStatus.a(jsonobject);
    }

    public List U(JSONObject jsonobject)
        throws JSONException
    {
        ArrayList arraylist = new ArrayList();
        if (jsonobject != null)
        {
            jsonobject = jsonobject.optJSONArray("badges");
            for (int i1 = 0; jsonobject != null && i1 < jsonobject.length(); i1++)
            {
                Badge badge = new Badge();
                badge.initFromPublicApiJsonObject(jsonobject.getJSONObject(i1));
                if (badge.d() != null)
                {
                    arraylist.add(badge);
                }
            }

        }
        return arraylist;
    }

    public List V(JSONObject jsonobject)
        throws JSONException
    {
        ArrayList arraylist = new ArrayList();
        if (jsonobject != null)
        {
            jsonobject = jsonobject.optJSONArray("notifications");
            for (int i1 = 0; jsonobject != null && i1 < jsonobject.length(); i1++)
            {
                com.fitbit.data.domain.badges.a a1 = new com.fitbit.data.domain.badges.a();
                a1.initFromPublicApiJsonObject(jsonobject.getJSONObject(i1));
                if (a1.f())
                {
                    arraylist.add(a1);
                }
            }

        }
        return arraylist;
    }

    public EnumSet W(JSONObject jsonobject)
        throws JSONException
    {
        EnumSet enumset = EnumSet.noneOf(com/fitbit/data/domain/ProfilePreference);
        if (jsonobject != null)
        {
            ProfilePreference aprofilepreference[] = ProfilePreference.values();
            int j1 = aprofilepreference.length;
            for (int i1 = 0; i1 < j1; i1++)
            {
                ProfilePreference profilepreference = aprofilepreference[i1];
                if (jsonobject.optBoolean(profilepreference.getJsonKey(), false))
                {
                    enumset.add(profilepreference);
                }
            }

        }
        return enumset;
    }

    public List X(JSONObject jsonobject)
        throws JSONException
    {
        Object obj1 = null;
        Object obj = obj1;
        if (jsonobject != null)
        {
            obj = obj1;
            if (jsonobject.length() > 0)
            {
                JSONArray jsonarray = jsonobject.optJSONArray("errors");
                obj = obj1;
                if (jsonarray != null)
                {
                    jsonobject = null;
                    for (int i1 = 0; i1 < jsonarray.length();)
                    {
                        JSONObject jsonobject1 = jsonarray.getJSONObject(i1);
                        obj = jsonobject;
                        if (com.fitbit.serverinteraction.q.b(jsonobject1))
                        {
                            obj = jsonobject;
                            if (jsonobject == null)
                            {
                                obj = new ArrayList();
                            }
                            ((List) (obj)).add(new q(jsonobject1));
                        }
                        i1++;
                        jsonobject = ((JSONObject) (obj));
                    }

                    obj = jsonobject;
                }
            }
        }
        return ((List) (obj));
    }

    public List Y(JSONObject jsonobject)
        throws JSONException
    {
        return com.fitbit.d.a.b(jsonobject, "timezones", com/fitbit/data/domain/TimeZone);
    }

    public SleepLogEntry a(JSONObject jsonobject, SleepLogEntry sleeplogentry)
        throws JSONException
    {
        SleepLogEntry sleeplogentry1 = sleeplogentry;
        if (sleeplogentry == null)
        {
            sleeplogentry1 = new SleepLogEntry();
        }
        sleeplogentry1.initFromPublicApiJsonObject(jsonobject.getJSONObject("sleep"));
        return sleeplogentry1;
    }

    public TrackerInfo a(JSONObject jsonobject, TrackerType trackertype)
        throws JSONException
    {
        TrackerInfo trackerinfo = new TrackerInfo();
        trackerinfo.a(jsonobject, trackertype);
        return trackerinfo;
    }

    public List a(Date date, JSONObject jsonobject)
        throws JSONException
    {
        ArrayList arraylist = new ArrayList();
        jsonobject = jsonobject.optJSONArray("water");
        for (int i1 = 0; jsonobject != null && i1 < jsonobject.length(); i1++)
        {
            JSONObject jsonobject1 = jsonobject.getJSONObject(i1);
            WaterLogEntry waterlogentry = new WaterLogEntry();
            waterlogentry.setLogDate(date);
            waterlogentry.initFromPublicApiJsonObject(jsonobject1);
            arraylist.add(waterlogentry);
        }

        return arraylist;
    }

    public List a(JSONArray jsonarray)
        throws JSONException
    {
        ArrayList arraylist = new ArrayList();
        for (int i1 = 0; i1 < jsonarray.length(); i1++)
        {
            JSONObject jsonobject = jsonarray.getJSONObject(i1);
            FoodLogEntry foodlogentry = new FoodLogEntry();
            foodlogentry.initFromPublicApiJsonObject(jsonobject);
            arraylist.add(foodlogentry);
        }

        return arraylist;
    }

    public List a(JSONArray jsonarray, Profile profile)
        throws JSONException
    {
        ArrayList arraylist = new ArrayList();
        for (int i1 = 0; i1 < jsonarray.length(); i1++)
        {
            JSONObject jsonobject = jsonarray.getJSONObject(i1);
            Device device = new Device();
            device.initFromPublicApiJsonObject(jsonobject);
            device.a(profile);
            arraylist.add(device);
        }

        return arraylist;
    }

    public List a(JSONObject jsonobject)
        throws JSONException
    {
        ArrayList arraylist = new ArrayList();
        jsonobject = jsonobject.optJSONArray("fat");
        for (int i1 = 0; jsonobject != null && i1 < jsonobject.length(); i1++)
        {
            JSONObject jsonobject1 = jsonobject.getJSONObject(i1);
            BodyFatLogEntry bodyfatlogentry = new BodyFatLogEntry();
            bodyfatlogentry.initFromPublicApiJsonObject(jsonobject1);
            arraylist.add(bodyfatlogentry);
        }

        return arraylist;
    }

    public List a(JSONObject jsonobject, Profile profile)
        throws JSONException
    {
        ArrayList arraylist = new ArrayList();
        jsonobject = jsonobject.optJSONArray("scales");
        for (int i1 = 0; jsonobject != null && i1 < jsonobject.length(); i1++)
        {
            JSONObject jsonobject1 = jsonobject.getJSONObject(i1);
            Scale scale = new Scale();
            scale.initFromPublicApiJsonObject(jsonobject1);
            scale.a(profile);
            arraylist.add(scale);
        }

        return arraylist;
    }

    public List a(JSONObject jsonobject, com.fitbit.data.domain.RankedUser.Relation relation)
        throws JSONException
    {
        return a(jsonobject.getJSONArray("friends"), relation);
    }

    public List a(JSONObject jsonobject, com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType timeseriesresourcetype, Date date)
        throws JSONException
    {
        ArrayList arraylist = new ArrayList();
        static class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.values().length];
                try
                {
                    a[com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.BODY_FAT.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror18) { }
                try
                {
                    a[com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.BODY_WEIGHT.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror17) { }
                try
                {
                    a[com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.CALORIES.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror16) { }
                try
                {
                    a[com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.STEPS.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror15) { }
                try
                {
                    a[com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.FLOORS.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror14) { }
                try
                {
                    a[com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.CALORIES_IN.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror13) { }
                try
                {
                    a[com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.DISTANCE.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror12) { }
                try
                {
                    a[com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.MINUTES_VERY_ACTIVE.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror11) { }
                try
                {
                    a[com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.MINUTES_FAIRLY_ACTIVE.ordinal()] = 9;
                }
                catch (NoSuchFieldError nosuchfielderror10) { }
                try
                {
                    a[com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.MINUTES_ASLEEP.ordinal()] = 10;
                }
                catch (NoSuchFieldError nosuchfielderror9) { }
                try
                {
                    a[com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.AWAKENINGS_COUNT.ordinal()] = 11;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    a[com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.STEPS_INTRADAY.ordinal()] = 12;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    a[com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.HEART_RATE_INTRADAY.ordinal()] = 13;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    a[com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.RESTING_HEART_RATE.ordinal()] = 14;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    a[com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.CALORIES_INTRADAY.ordinal()] = 15;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.DISTANCE_INTRADAY.ordinal()] = 16;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.MINUTES_VERY_ACTIVE_INTRADAY.ordinal()] = 17;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.MINUTES_FAIRLY_ACTIVE_INTRADAY.ordinal()] = 18;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.FLOORS_INTRADAY.ordinal()] = 19;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (com.fitbit.data.bl._cls1.a[timeseriesresourcetype.ordinal()])
        {
        default:
            return arraylist;

        case 1: // '\001'
            arraylist.addAll(e(jsonobject));
            return arraylist;

        case 2: // '\002'
            arraylist.addAll(d(jsonobject));
            return arraylist;

        case 3: // '\003'
            arraylist.addAll(b(jsonobject));
            return arraylist;

        case 4: // '\004'
            arraylist.addAll(c(jsonobject));
            return arraylist;

        case 5: // '\005'
            arraylist.addAll(ah(jsonobject));
            return arraylist;

        case 6: // '\006'
            arraylist.addAll(ag(jsonobject));
            return arraylist;

        case 7: // '\007'
            arraylist.addAll(f(jsonobject));
            return arraylist;

        case 8: // '\b'
            arraylist.addAll(g(jsonobject));
            return arraylist;

        case 9: // '\t'
            arraylist.addAll(h(jsonobject));
            return arraylist;

        case 10: // '\n'
            arraylist.addAll(j(jsonobject));
            return arraylist;

        case 11: // '\013'
            arraylist.addAll(i(jsonobject));
            return arraylist;

        case 12: // '\f'
            arraylist.addAll(ab(jsonobject));
            return arraylist;

        case 13: // '\r'
            arraylist.addAll(a(jsonobject, date));
            return arraylist;

        case 14: // '\016'
            arraylist.addAll(Z(jsonobject));
            return arraylist;

        case 15: // '\017'
            arraylist.addAll(ac(jsonobject));
            return arraylist;

        case 16: // '\020'
            arraylist.addAll(ad(jsonobject));
            return arraylist;

        case 17: // '\021'
            arraylist.addAll(ae(jsonobject));
            return arraylist;

        case 18: // '\022'
            arraylist.addAll(af(jsonobject));
            return arraylist;

        case 19: // '\023'
            arraylist.addAll(aa(jsonobject));
            break;
        }
        return arraylist;
    }

    public List a(JSONObject jsonobject, UnitSystem unitsystem)
        throws JSONException
    {
        ArrayList arraylist = new ArrayList();
        jsonobject = jsonobject.optJSONArray("weight");
        for (int i1 = 0; jsonobject != null && i1 < jsonobject.length(); i1++)
        {
            JSONObject jsonobject1 = jsonobject.getJSONObject(i1);
            WeightLogEntry weightlogentry = new WeightLogEntry();
            weightlogentry.a(jsonobject1, unitsystem.getWeightUnits());
            arraylist.add(weightlogentry);
        }

        return arraylist;
    }

    public transient Map a(TimeSeriesObject atimeseriesobject[])
    {
        HashMap hashmap = new HashMap();
        int j1 = atimeseriesobject.length;
        int i1 = 0;
        while (i1 < j1) 
        {
            TimeSeriesObject timeseriesobject = atimeseriesobject[i1];
            if (timeseriesobject instanceof BodyFat)
            {
                hashmap.put("fat", Double.valueOf(((BodyFat)timeseriesobject).c().b()));
            } else
            if (timeseriesobject instanceof BodyWeight)
            {
                hashmap.put("weight", Double.valueOf(((BodyWeight)timeseriesobject).c().a(com.fitbit.data.domain.WeightLogEntry.WeightUnits.KG).b()));
            }
            i1++;
        }
        return hashmap;
    }

    public void a(List list, JSONObject jsonobject)
        throws JSONException
    {
        jsonobject = jsonobject.optJSONArray("trackers");
label0:
        for (int i1 = 0; jsonobject != null && i1 < jsonobject.length(); i1++)
        {
            JSONObject jsonobject1 = jsonobject.getJSONObject(i1);
            Iterator iterator = list.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    continue label0;
                }
                Device device = (Device)iterator.next();
                if (device.c() != null && device.c().equals(jsonobject1.optString("id")))
                {
                    device.a(jsonobject1);
                }
            } while (true);
        }

    }

    public WeightLogEntry b(JSONObject jsonobject, UnitSystem unitsystem)
        throws JSONException
    {
        WeightLogEntry weightlogentry = new WeightLogEntry();
        weightlogentry.a(jsonobject.getJSONObject("weightLog"), unitsystem.getWeightUnits());
        return weightlogentry;
    }

    public List b(JSONArray jsonarray)
        throws JSONException
    {
        ArrayList arraylist = new ArrayList();
        for (int i1 = 0; i1 < jsonarray.length(); i1++)
        {
            JSONObject jsonobject = jsonarray.getJSONObject(i1);
            FoodRelation foodrelation = new FoodRelation();
            foodrelation.initFromPublicApiJsonObject(jsonobject);
            foodrelation.setDisplayIndex(i1);
            arraylist.add(foodrelation);
        }

        return arraylist;
    }

    public List b(JSONObject jsonobject)
        throws JSONException
    {
        return a(jsonobject, "activities-calories", com/fitbit/data/domain/CaloriesBurned);
    }

    public void b(List list, JSONObject jsonobject)
        throws JSONException
    {
        jsonobject = jsonobject.optJSONArray("trackers");
label0:
        for (int i1 = 0; jsonobject != null && i1 < jsonobject.length(); i1++)
        {
            JSONObject jsonobject1 = jsonobject.getJSONObject(i1);
            Iterator iterator = list.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    continue label0;
                }
                Device device = (Device)iterator.next();
                if (device.c() != null && device.c().equals(jsonobject1.optString("id")))
                {
                    Object obj = jsonobject1.optJSONArray("primaryGoalsSupported");
                    if (obj != null)
                    {
                        device.b(d(((JSONArray) (obj))));
                    }
                    obj = jsonobject1.optJSONArray("clockFacesSupported");
                    if (obj != null && ((JSONArray) (obj)).length() > 0)
                    {
                        device.d(c(((JSONArray) (obj))));
                    }
                    obj = a(jsonobject1.getString("imageUrl"));
                    if (!TextUtils.isEmpty(((CharSequence) (obj))))
                    {
                        device.a(((String) (obj)));
                    }
                    obj = jsonobject1.optJSONArray("apiExerciseOptions");
                    if (obj != null && ((JSONArray) (obj)).length() > 0)
                    {
                        device.c(e(((JSONArray) (obj))));
                    }
                    obj = jsonobject1.optJSONArray("tapGestureOptions");
                    if (obj != null && ((JSONArray) (obj)).length() > 0)
                    {
                        device.e(f(((JSONArray) (obj))));
                    }
                    obj = jsonobject1.optJSONArray("watchCheckOptions");
                    if (obj != null && ((JSONArray) (obj)).length() > 0)
                    {
                        device.f(g(((JSONArray) (obj))));
                    }
                    obj = jsonobject1.optJSONObject("autoLapInterval");
                    if (obj != null)
                    {
                        device.g(K(((JSONObject) (obj))));
                    }
                }
            } while (true);
        }

    }

    public List c(JSONArray jsonarray)
        throws JSONException
    {
        ArrayList arraylist = new ArrayList(jsonarray.length());
        for (int i1 = 0; i1 < jsonarray.length(); i1++)
        {
            com.fitbit.data.domain.device.a a1 = new com.fitbit.data.domain.device.a();
            a1.initFromPublicApiJsonObject(jsonarray.getJSONObject(i1));
            arraylist.add(a1);
        }

        return arraylist;
    }

    public List c(JSONObject jsonobject)
        throws JSONException
    {
        return a(jsonobject, "activities-steps", com/fitbit/data/domain/Steps);
    }

    public List d(JSONArray jsonarray)
        throws JSONException
    {
        ArrayList arraylist = new ArrayList(jsonarray.length());
        for (int i1 = 0; i1 < jsonarray.length(); i1++)
        {
            TrackerGoalType trackergoaltype = TrackerGoalType.parse(jsonarray.getString(i1));
            if (trackergoaltype != TrackerGoalType.UNKNOWN)
            {
                arraylist.add(trackergoaltype);
            }
        }

        return arraylist;
    }

    public List d(JSONObject jsonobject)
        throws JSONException
    {
        return a(jsonobject, "body-weight", com/fitbit/data/domain/BodyWeight);
    }

    public List e(JSONArray jsonarray)
        throws JSONException
    {
        ArrayList arraylist = new ArrayList(jsonarray.length());
        for (int i1 = 0; i1 < jsonarray.length(); i1++)
        {
            ExerciseOption exerciseoption = new ExerciseOption();
            exerciseoption.initFromPublicApiJsonObject(jsonarray.getJSONObject(i1));
            arraylist.add(exerciseoption);
        }

        return arraylist;
    }

    public List e(JSONObject jsonobject)
        throws JSONException
    {
        return a(jsonobject, "body-fat", com/fitbit/data/domain/BodyFat);
    }

    public List f(JSONArray jsonarray)
        throws JSONException
    {
        ArrayList arraylist = new ArrayList(jsonarray.length());
        for (int i1 = 0; i1 < jsonarray.length(); i1++)
        {
            d d1 = new d();
            d1.initFromPublicApiJsonObject(jsonarray.getJSONObject(i1));
            arraylist.add(d1);
        }

        return arraylist;
    }

    public List f(JSONObject jsonobject)
        throws JSONException
    {
        return a(jsonobject, "activities-distance", com/fitbit/data/domain/Distance);
    }

    public List g(JSONArray jsonarray)
        throws JSONException
    {
        ArrayList arraylist = new ArrayList(jsonarray.length());
        for (int i1 = 0; i1 < jsonarray.length(); i1++)
        {
            f f1 = new f();
            f1.initFromPublicApiJsonObject(jsonarray.getJSONObject(i1));
            arraylist.add(f1);
        }

        return arraylist;
    }

    public List g(JSONObject jsonobject)
        throws JSONException
    {
        return a(jsonobject, "activities-minutesVeryActive", com/fitbit/data/domain/MinutesVeryActive);
    }

    public List h(JSONArray jsonarray)
        throws JSONException
    {
        ArrayList arraylist = new ArrayList();
        if (jsonarray != null)
        {
            for (int i1 = 0; i1 < jsonarray.length(); i1++)
            {
                JSONObject jsonobject = jsonarray.optJSONObject(i1);
                String s1 = jsonobject.optString("value");
                String s2 = jsonobject.optString("label");
                boolean flag = jsonobject.optBoolean("barcode", false);
                boolean flag1 = jsonobject.optBoolean("imageUpload", false);
                if (s1 != null && s2 != null)
                {
                    arraylist.add(new FoodLocale(s1, s2, flag, flag1));
                }
            }

        }
        return arraylist;
    }

    public List h(JSONObject jsonobject)
        throws JSONException
    {
        return a(jsonobject, "activities-minutesFairlyActive", com/fitbit/data/domain/MinutesVeryActive);
    }

    public List i(JSONArray jsonarray)
        throws JSONException
    {
        ArrayList arraylist = new ArrayList();
        for (int i1 = 0; jsonarray != null && i1 < jsonarray.length(); i1++)
        {
            Badge badge = new Badge();
            badge.initFromPublicApiJsonObject(jsonarray.getJSONObject(i1));
            if (badge.d() != null)
            {
                arraylist.add(badge);
            }
        }

        return arraylist;
    }

    public List i(JSONObject jsonobject)
        throws JSONException
    {
        return a(jsonobject, "sleep-awakeningsCount", com/fitbit/data/domain/AwakeningsCount);
    }

    public List j(JSONObject jsonobject)
        throws JSONException
    {
        return a(jsonobject, "sleep-minutesAsleep", com/fitbit/data/domain/MinutesAsleep);
    }

    public List k(JSONObject jsonobject)
        throws JSONException
    {
        jsonobject = jsonobject.optJSONArray("foods");
        if (jsonobject != null)
        {
            return a(jsonobject);
        } else
        {
            return Collections.emptyList();
        }
    }

    public List l(JSONObject jsonobject)
        throws JSONException
    {
        jsonobject = jsonobject.optJSONArray("days");
        ArrayList arraylist = new ArrayList();
        if (jsonobject != null)
        {
            for (int i1 = 0; i1 < jsonobject.length(); i1++)
            {
                Object obj = jsonobject.getJSONObject(i1);
                List list = k(((JSONObject) (obj)));
                obj = com.fitbit.d.a.e(((JSONObject) (obj)), "date");
                if (obj != null)
                {
                    obj = com.fitbit.util.o.c(((Date) (obj)));
                    for (Iterator iterator = list.iterator(); iterator.hasNext(); ((FoodLogEntry)iterator.next()).setLogDate(((Date) (obj)))) { }
                }
                arraylist.addAll(list);
            }

        }
        return arraylist;
    }

    public List m(JSONObject jsonobject)
        throws JSONException
    {
        jsonobject = jsonobject.optJSONArray("sleep");
        ArrayList arraylist = new ArrayList();
        if (jsonobject != null)
        {
            for (int i1 = 0; i1 < jsonobject.length(); i1++)
            {
                JSONObject jsonobject1 = jsonobject.getJSONObject(i1);
                SleepLogEntry sleeplogentry = new SleepLogEntry();
                sleeplogentry.initFromPublicApiJsonObject(jsonobject1);
                sleeplogentry.a(n(jsonobject1));
                arraylist.add(sleeplogentry);
            }

        }
        return arraylist;
    }

    public List n(JSONObject jsonobject)
        throws JSONException
    {
        Object obj = jsonobject.optJSONArray("minuteData");
        ArrayList arraylist = new ArrayList();
        Date date = com.fitbit.d.a.c(jsonobject, "startTime");
        jsonobject = new GregorianCalendar(bn.b());
        jsonobject.setTime(date);
        if (obj != null)
        {
            int i1 = 0;
            int k1;
            for (int j1 = 0; i1 < ((JSONArray) (obj)).length(); j1 = k1)
            {
                JSONObject jsonobject1 = ((JSONArray) (obj)).getJSONObject(i1);
                com.fitbit.util.o.a(jsonobject, com.fitbit.d.a.g(jsonobject1, "dateTime"));
                if (jsonobject.getTimeInMillis() < date.getTime())
                {
                    jsonobject.add(5, 1);
                }
                k1 = jsonobject1.getInt("value");
                if (k1 != j1)
                {
                    MinutesAsleepIntraday minutesasleepintraday = new MinutesAsleepIntraday();
                    minutesasleepintraday.a(jsonobject.getTime());
                    minutesasleepintraday.a(k1);
                    arraylist.add(minutesasleepintraday);
                }
                i1++;
            }

            obj = new MinutesAsleepIntraday();
            jsonobject.add(12, 1);
            ((MinutesAsleepIntraday) (obj)).a(jsonobject.getTime());
            ((MinutesAsleepIntraday) (obj)).a(0);
            arraylist.add(obj);
        }
        return arraylist;
    }

    public List o(JSONObject jsonobject)
        throws JSONException
    {
        JSONArray jsonarray = jsonobject.optJSONArray("days");
        ArrayList arraylist = new ArrayList();
        if (jsonarray != null)
        {
            for (int j1 = 0; j1 < jsonarray.length(); j1++)
            {
                jsonobject = jsonarray.getJSONObject(j1);
                i i1 = new i();
                i1.initFromPublicApiJsonObject(jsonobject);
                Date date = com.fitbit.d.a.e(jsonobject, "date");
                jsonobject = date;
                if (date != null)
                {
                    jsonobject = com.fitbit.util.o.c(date);
                }
                arraylist.add(new Pair(jsonobject, i1));
            }

        }
        return arraylist;
    }

    public FoodLogEntry p(JSONObject jsonobject)
        throws JSONException
    {
        FoodLogEntry foodlogentry = new FoodLogEntry();
        foodlogentry.initFromPublicApiJsonObject(jsonobject.getJSONObject("foodLog"));
        return foodlogentry;
    }

    public BodyFatLogEntry q(JSONObject jsonobject)
        throws JSONException
    {
        BodyFatLogEntry bodyfatlogentry = new BodyFatLogEntry();
        bodyfatlogentry.initFromPublicApiJsonObject(jsonobject.getJSONObject("fatLog"));
        return bodyfatlogentry;
    }

    public List r(JSONObject jsonobject)
        throws JSONException
    {
        ArrayList arraylist = new ArrayList();
        jsonobject = jsonobject.optJSONArray("foods-log-water");
        for (int i1 = 0; jsonobject != null && i1 < jsonobject.length(); i1++)
        {
            JSONObject jsonobject1 = jsonobject.getJSONObject(i1);
            WaterLogDaySummary waterlogdaysummary = new WaterLogDaySummary();
            waterlogdaysummary.initFromPublicApiJsonObject(jsonobject1);
            arraylist.add(waterlogdaysummary);
        }

        return arraylist;
    }

    public WaterLogEntry s(JSONObject jsonobject)
        throws JSONException
    {
        WaterLogEntry waterlogentry = new WaterLogEntry();
        waterlogentry.initFromPublicApiJsonObject(jsonobject.getJSONObject("waterLog"));
        return waterlogentry;
    }

    public long t(JSONObject jsonobject)
        throws JSONException
    {
        return com.fitbit.d.a.b(jsonobject.getJSONObject("activityLog"), "logId", -1);
    }

    public List u(JSONObject jsonobject)
        throws JSONException
    {
        ArrayList arraylist = new ArrayList();
        jsonobject = jsonobject.optJSONArray("meals");
        for (int i1 = 0; jsonobject != null && i1 < jsonobject.length(); i1++)
        {
            Meal meal = new Meal();
            meal.initFromPublicApiJsonObject(jsonobject.getJSONObject(i1));
            arraylist.add(meal);
        }

        return arraylist;
    }

    public List v(JSONObject jsonobject)
        throws JSONException
    {
        ArrayList arraylist = new ArrayList();
        jsonobject = jsonobject.optJSONArray("foods");
        for (int i1 = 0; jsonobject != null && i1 < jsonobject.length(); i1++)
        {
            FoodItem fooditem = new FoodItem();
            fooditem.initFromPublicApiJsonObject(jsonobject.getJSONObject(i1));
            fooditem.a(true);
            arraylist.add(fooditem);
        }

        return arraylist;
    }

    public List w(JSONObject jsonobject)
        throws JSONException
    {
        ArrayList arraylist = new ArrayList();
        jsonobject = jsonobject.optJSONArray("activities-heart");
        for (int i1 = 0; jsonobject != null && i1 < jsonobject.length(); i1++)
        {
            JSONObject jsonobject1 = jsonobject.optJSONObject(i1);
            if (jsonobject1 != null)
            {
                HeartRateDailySummary heartratedailysummary = new HeartRateDailySummary();
                heartratedailysummary.initFromPublicApiJsonObject(jsonobject1);
                arraylist.add(heartratedailysummary);
            }
        }

        return arraylist;
    }

    public List x(JSONObject jsonobject)
        throws JSONException
    {
        ArrayList arraylist = new ArrayList();
        jsonobject = jsonobject.optJSONArray("activities-heart");
        for (int i1 = 0; jsonobject != null && i1 < jsonobject.length(); i1++)
        {
            JSONObject jsonobject1 = jsonobject.optJSONObject(i1);
            if (jsonobject1 != null)
            {
                HeartRateExerciseSummary heartrateexercisesummary = new HeartRateExerciseSummary();
                heartrateexercisesummary.initFromPublicApiJsonObject(jsonobject1);
                arraylist.add(heartrateexercisesummary);
            }
        }

        return arraylist;
    }

    public Double y(JSONObject jsonobject)
        throws JSONException
    {
        if (jsonobject != null && jsonobject.has("goals"))
        {
            jsonobject = jsonobject.optJSONObject("goals");
            if (jsonobject != null && jsonobject.has("calories"))
            {
                return Double.valueOf(jsonobject.optDouble("calories"));
            }
        }
        return null;
    }

    public List z(JSONObject jsonobject)
        throws JSONException
    {
        ArrayList arraylist = new ArrayList();
        if (jsonobject != null)
        {
            jsonobject = jsonobject.optJSONArray("notifications");
            int i1 = 0;
            while (jsonobject != null && i1 < jsonobject.length()) 
            {
                JSONObject jsonobject1 = jsonobject.getJSONObject(i1);
                Notification notification = new Notification();
                notification.initFromPublicApiJsonObject(jsonobject1);
                if (notification.b() == com.fitbit.data.domain.Notification.NotificationType.UNKNOWN)
                {
                    com.fitbit.e.a.a("PublicAPIHelper", "unknown notification type received: %s", new Object[] {
                        jsonobject1.optString("type")
                    });
                } else
                {
                    arraylist.add(notification);
                }
                i1++;
            }
        }
        return arraylist;
    }
}
