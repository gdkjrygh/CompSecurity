// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain;

import com.fitbit.d.a;
import com.fitbit.d.b;
import com.fitbit.util.bn;
import com.fitbit.util.format.e;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.fitbit.data.domain:
//            LogEntry, Length, ActivityItem, b

public class ActivityLogEntry extends LogEntry
    implements b, Cloneable
{
    public static class a
        implements Comparable
    {

        final int a;

        public int a()
        {
            return a;
        }

        public int a(a a1)
        {
            return a - a1.a;
        }

        public String b()
        {
            return com.fitbit.util.format.e.a(new Date(a), bn.a());
        }

        public boolean b(a a1)
        {
            return a(a1) > 0;
        }

        public boolean c(a a1)
        {
            return a(a1) < 0;
        }

        public int compareTo(Object obj)
        {
            return a((a)obj);
        }

        public boolean equals(Object obj)
        {
            return obj == this || (obj instanceof a) && ((a)obj).a == a;
        }

        public int hashCode()
        {
            return a;
        }

        public String toString()
        {
            return b();
        }

        public a(long l1)
        {
            this(new Date(l1));
        }

        public a(Date date)
        {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            int i1 = calendar.get(11);
            int j1 = calendar.get(12);
            int k1 = calendar.get(13);
            int l1 = calendar.get(14);
            date = Calendar.getInstance();
            date.clear();
            date.set(11, i1);
            date.set(12, j1);
            date.set(13, k1);
            date.set(14, l1);
            a = (int)date.getTimeInMillis();
        }
    }


    private static final String a = "ActivityLogEntry";
    private static final String b = "Fat Burn";
    private static final String c = "Cardio";
    private static final String d = "Peak";
    private static int e = 3000;
    private ActivityItem activity;
    private long activityLevelItemId;
    private int avergeHeartRate;
    private int cachedCalories;
    private String caloriesLink;
    private int caloriesOnServer;
    private int cardioHeartRateZoneMinutes;
    private com.fitbit.data.domain.b details;
    private Length distance;
    private int duration;
    private int fatBurnHeartRateZoneMinutes;
    private boolean hasDetails;
    private String heartRateLink;
    private a lastModified;
    private int manualCalories;
    private boolean manualCaloriesPopulated;
    private int moderatelyActiveMinutes;
    private String name;
    private int peakHeartRateZoneMinutes;
    private a startTime;
    private int steps;
    private int veryActiveMinutes;

    public ActivityLogEntry()
    {
        manualCalories = -1;
        caloriesOnServer = 0;
        activityLevelItemId = -1L;
    }

    private void a(JSONArray jsonarray)
        throws JSONException
    {
        if (jsonarray != null)
        {
            int i1 = 0;
            while (i1 < jsonarray.length()) 
            {
                JSONObject jsonobject = jsonarray.getJSONObject(i1);
                String s1 = jsonobject.optString("name");
                int j1 = jsonobject.optInt("minutes");
                if ("Fat Burn".equals(s1))
                {
                    fatBurnHeartRateZoneMinutes = j1;
                } else
                if ("Cardio".equals(s1))
                {
                    cardioHeartRateZoneMinutes = j1;
                } else
                if ("Peak".equals(s1))
                {
                    peakHeartRateZoneMinutes = j1;
                }
                i1++;
            }
        }
    }

    private void b(JSONArray jsonarray)
        throws JSONException
    {
        if (jsonarray != null)
        {
            int i1 = 0;
            while (i1 < jsonarray.length()) 
            {
                JSONObject jsonobject = jsonarray.getJSONObject(i1);
                if (jsonobject.has("name"))
                {
                    String s1 = jsonobject.getString("name");
                    int j1 = com.fitbit.d.a.a(jsonobject, "minutes", 0);
                    if (s1.equals("very"))
                    {
                        h(j1);
                    } else
                    if (s1.equals("fairly"))
                    {
                        i(j1);
                    }
                }
                i1++;
            }
        }
    }

    public int a(TimeUnit timeunit)
    {
        return (int)timeunit.convert(duration, TimeUnit.SECONDS);
    }

    public ActivityItem a()
    {
        return activity;
    }

    public void a(int i1)
    {
        steps = i1;
    }

    public void a(long l1)
    {
        activityLevelItemId = l1;
    }

    public void a(long l1, TimeUnit timeunit)
    {
        duration = (int)TimeUnit.SECONDS.convert(l1, timeunit);
    }

    public void a(ActivityItem activityitem)
    {
        activity = activityitem;
    }

    public void a(a a1)
    {
        startTime = a1;
    }

    public void a(Length length)
    {
        distance = length;
    }

    public void a(com.fitbit.data.domain.b b1)
    {
        details = b1;
    }

    public void a(String s1)
    {
        heartRateLink = s1;
    }

    public void a(boolean flag)
    {
        hasDetails = flag;
    }

    public Length b()
    {
        return distance;
    }

    public void b(int i1)
    {
        cachedCalories = i1;
    }

    public void b(a a1)
    {
        lastModified = a1;
    }

    public void b(String s1)
    {
        caloriesLink = s1;
    }

    public void b(boolean flag)
    {
        manualCaloriesPopulated = flag;
    }

    public int c()
    {
        return steps;
    }

    public void c(int i1)
    {
        manualCalories = i1;
    }

    public void c(String s1)
    {
        name = s1;
    }

    public Object clone()
    {
        ActivityLogEntry activitylogentry = new ActivityLogEntry();
        activitylogentry.duration = duration;
        activitylogentry.distance = distance;
        activitylogentry.startTime = startTime;
        activitylogentry.manualCalories = manualCalories;
        activitylogentry.activity = activity;
        activitylogentry.activityLevelItemId = activityLevelItemId;
        activitylogentry.details = details;
        activitylogentry.hasDetails = hasDetails;
        activitylogentry.heartRateLink = heartRateLink;
        activitylogentry.caloriesLink = caloriesLink;
        activitylogentry.fatBurnHeartRateZoneMinutes = fatBurnHeartRateZoneMinutes;
        activitylogentry.cardioHeartRateZoneMinutes = cardioHeartRateZoneMinutes;
        activitylogentry.peakHeartRateZoneMinutes = peakHeartRateZoneMinutes;
        activitylogentry.lastModified = lastModified;
        activitylogentry.veryActiveMinutes = veryActiveMinutes;
        activitylogentry.moderatelyActiveMinutes = moderatelyActiveMinutes;
        activitylogentry.avergeHeartRate = avergeHeartRate;
        return activitylogentry;
    }

    public a d()
    {
        return startTime;
    }

    public void d(int i1)
    {
        caloriesOnServer = i1;
    }

    public Date e()
    {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(getLogDate());
        Calendar calendar1 = Calendar.getInstance();
        calendar1.setTimeInMillis(startTime.a);
        calendar.set(11, calendar1.get(11));
        calendar.set(12, calendar1.get(12));
        calendar.set(13, calendar1.get(13));
        calendar.set(14, calendar1.get(14));
        return calendar.getTime();
    }

    public void e(int i1)
    {
        fatBurnHeartRateZoneMinutes = i1;
    }

    public boolean equals(Object obj)
    {
        return (obj instanceof ActivityLogEntry) && getEntityId() == ((ActivityLogEntry)obj).getEntityId();
    }

    public void f(int i1)
    {
        cardioHeartRateZoneMinutes = i1;
    }

    public boolean f()
    {
        return hasDetails;
    }

    public void g(int i1)
    {
        peakHeartRateZoneMinutes = i1;
    }

    public boolean g()
    {
        return activityLevelItemId == (long)e;
    }

    public void h(int i1)
    {
        veryActiveMinutes = i1;
    }

    public boolean h()
    {
        return g();
    }

    public int hashCode()
    {
        if (getEntityId() != null)
        {
            return getEntityId().hashCode();
        } else
        {
            return 0;
        }
    }

    public int i()
    {
        if (k() != -1)
        {
            return k();
        }
        double d1 = l();
        if (d1 > 0.0D)
        {
            return (int)com.fitbit.activity.a.a(d1 * ((double)a(TimeUnit.MILLISECONDS) / 60000D), getLogDate());
        } else
        {
            return 0;
        }
    }

    public void i(int i1)
    {
        moderatelyActiveMinutes = i1;
    }

    public void initFromPublicApiJsonObject(JSONObject jsonobject)
        throws JSONException
    {
        setServerId(com.fitbit.d.a.b(jsonobject, "logId", -1));
        a(com.fitbit.d.a.a(jsonobject, "duration", 0), TimeUnit.MILLISECONDS);
        if (jsonobject.has("distance"))
        {
            a(new Length(com.fitbit.d.a.a(jsonobject, "distance", 0.0D), Length.LengthUnits.KM));
        }
        if (jsonobject.has("steps"))
        {
            a(com.fitbit.d.a.a(jsonobject, "steps", 0));
        }
        d(com.fitbit.d.a.a(jsonobject, "calories", 0));
        if (jsonobject.has("activityTypeId"))
        {
            ActivityItem activityitem = new ActivityItem();
            activityitem.setServerId(com.fitbit.d.a.b(jsonobject, "activityTypeId", -1));
            activityitem.a(com.fitbit.d.a.a(jsonobject, "activityName"));
            a(activityitem);
        }
        if (jsonobject.has("activityName"))
        {
            c(com.fitbit.d.a.a(jsonobject, "activityName"));
        }
        if (jsonobject.has("startTime"))
        {
            a(new a(com.fitbit.d.a.c(jsonobject, "startTime")));
        }
        if (!jsonobject.isNull("detailsLink"))
        {
            a(true);
        }
        if (jsonobject.has("heartRateLink"))
        {
            a(com.fitbit.d.a.a(jsonobject, "heartRateLink"));
        }
        if (jsonobject.has("caloriesLink"))
        {
            b(com.fitbit.d.a.a(jsonobject, "caloriesLink"));
        }
        if (jsonobject.has("lastModified"))
        {
            b(new a(com.fitbit.d.a.c(jsonobject, "lastModified")));
        }
        if (jsonobject.has("averageHeartRate"))
        {
            j(com.fitbit.d.a.a(jsonobject, "averageHeartRate", 0));
        }
        b(jsonobject.optJSONArray("activityLevel"));
        a(jsonobject.optJSONArray("heartRateZones"));
        setEntityStatus(Entity.EntityStatus.SYNCED);
    }

    public int j()
    {
        return cachedCalories;
    }

    public void j(int i1)
    {
        avergeHeartRate = i1;
    }

    public int k()
    {
        return manualCalories;
    }

    public double l()
    {
        if (a() != null)
        {
            return a().b();
        } else
        {
            return 0.0D;
        }
    }

    public long m()
    {
        long l1 = -1L;
        if (activityLevelItemId != -1L)
        {
            l1 = activityLevelItemId;
        } else
        if (activity != null)
        {
            return activity.getServerId();
        }
        return l1;
    }

    public int n()
    {
        return caloriesOnServer;
    }

    public boolean o()
    {
        return manualCaloriesPopulated;
    }

    public com.fitbit.data.domain.b p()
    {
        return details;
    }

    public String q()
    {
        return heartRateLink;
    }

    public String r()
    {
        return caloriesLink;
    }

    public int s()
    {
        return fatBurnHeartRateZoneMinutes;
    }

    public int t()
    {
        return cardioHeartRateZoneMinutes;
    }

    public JSONObject toPublicApiJsonObject()
        throws JSONException
    {
        throw new UnsupportedOperationException();
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(super.toString());
        stringbuilder.append(" distance: ").append(b());
        stringbuilder.append(" duration: ").append(duration);
        stringbuilder.append(" calories(manual/server/cached): ").append(k()).append("/").append(n()).append("/").append(j());
        stringbuilder.append(" activity: {").append(a()).append("}");
        return stringbuilder.toString();
    }

    public int u()
    {
        return peakHeartRateZoneMinutes;
    }

    public a v()
    {
        return lastModified;
    }

    public int w()
    {
        return veryActiveMinutes;
    }

    public int x()
    {
        return moderatelyActiveMinutes;
    }

    public int y()
    {
        return avergeHeartRate;
    }

    public String z()
    {
        return name;
    }

}
