// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain.heartrate;

import com.fitbit.d.a;
import com.fitbit.d.b;
import com.fitbit.data.domain.Entity;
import com.fitbit.util.o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.fitbit.data.domain.heartrate:
//            HeartRateZone

public class HeartRateDailySummary extends Entity
    implements b
{

    private int averageHeartRate;
    private List customZones;
    private Date date;
    private int restingHeartRate;
    private List zones;

    public HeartRateDailySummary()
    {
        customZones = Collections.emptyList();
        zones = Collections.emptyList();
    }

    public HeartRateZone.HeartRateZoneType a(double d1)
    {
        if (d1 < (double)a(HeartRateZone.HeartRateZoneType.OUT_OF_RANGE).a())
        {
            return HeartRateZone.HeartRateZoneType.OUT_OF_RANGE;
        }
        if (d1 < (double)a(HeartRateZone.HeartRateZoneType.FAT_BURN).a())
        {
            return HeartRateZone.HeartRateZoneType.FAT_BURN;
        }
        if (d1 < (double)a(HeartRateZone.HeartRateZoneType.CARDIO).a())
        {
            return HeartRateZone.HeartRateZoneType.CARDIO;
        } else
        {
            return HeartRateZone.HeartRateZoneType.PEAK;
        }
    }

    public HeartRateZone a(HeartRateZone.HeartRateZoneType heartratezonetype)
    {
        for (Iterator iterator = zones.iterator(); iterator.hasNext();)
        {
            HeartRateZone heartratezone = (HeartRateZone)iterator.next();
            if (heartratezonetype.equals(heartratezone.c()))
            {
                return heartratezone;
            }
        }

        return null;
    }

    public Date a()
    {
        return date;
    }

    public void a(int j)
    {
        averageHeartRate = j;
    }

    public void a(Date date1)
    {
        date = date1;
    }

    public void a(List list)
    {
        customZones = list;
    }

    public double b(HeartRateZone.HeartRateZoneType heartratezonetype)
    {
        return (double)((a(heartratezonetype).b() + a(heartratezonetype).a()) / 2);
    }

    public List b()
    {
        return customZones;
    }

    public void b(int j)
    {
        restingHeartRate = j;
    }

    public void b(List list)
    {
        zones = list;
    }

    public List c()
    {
        return zones;
    }

    public boolean d()
    {
        while (a(HeartRateZone.HeartRateZoneType.OUT_OF_RANGE) == null || a(HeartRateZone.HeartRateZoneType.FAT_BURN) == null || a(HeartRateZone.HeartRateZoneType.CARDIO) == null || a(HeartRateZone.HeartRateZoneType.PEAK) == null) 
        {
            return false;
        }
        return true;
    }

    public int e()
    {
        Iterator iterator = zones.iterator();
        int j = 0;
        do
        {
            if (iterator.hasNext())
            {
                HeartRateZone heartratezone = (HeartRateZone)iterator.next();
                static class _cls1
                {

                    static final int a[];

                    static 
                    {
                        a = new int[HeartRateZone.HeartRateZoneType.values().length];
                        try
                        {
                            a[HeartRateZone.HeartRateZoneType.CARDIO.ordinal()] = 1;
                        }
                        catch (NoSuchFieldError nosuchfielderror3) { }
                        try
                        {
                            a[HeartRateZone.HeartRateZoneType.FAT_BURN.ordinal()] = 2;
                        }
                        catch (NoSuchFieldError nosuchfielderror2) { }
                        try
                        {
                            a[HeartRateZone.HeartRateZoneType.PEAK.ordinal()] = 3;
                        }
                        catch (NoSuchFieldError nosuchfielderror1) { }
                        try
                        {
                            a[HeartRateZone.HeartRateZoneType.OUT_OF_RANGE.ordinal()] = 4;
                        }
                        catch (NoSuchFieldError nosuchfielderror)
                        {
                            return;
                        }
                    }
                }

                switch (com.fitbit.data.domain.heartrate._cls1.a[heartratezone.c().ordinal()])
                {
                case 1: // '\001'
                case 2: // '\002'
                case 3: // '\003'
                    j = heartratezone.e() + j;
                    break;
                }
            } else
            {
                return j;
            }
        } while (true);
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag;
        if (this == obj)
        {
            flag = true;
        } else
        {
            flag = flag1;
            if (obj != null)
            {
                flag = flag1;
                if (obj.getClass().equals(getClass()))
                {
                    return a().equals(((HeartRateDailySummary)obj).a());
                }
            }
        }
        return flag;
    }

    public int f()
    {
        Iterator iterator = zones.iterator();
        float f1 = 0.0F;
        do
        {
            if (iterator.hasNext())
            {
                HeartRateZone heartratezone = (HeartRateZone)iterator.next();
                switch (com.fitbit.data.domain.heartrate._cls1.a[heartratezone.c().ordinal()])
                {
                case 1: // '\001'
                case 2: // '\002'
                case 3: // '\003'
                case 4: // '\004'
                    double d1 = f1;
                    f1 = (float)(heartratezone.g() + d1);
                    break;
                }
            } else
            {
                return Math.round(f1);
            }
        } while (true);
    }

    public double g()
    {
        Iterator iterator = zones.iterator();
        double d1 = 0.0D;
        do
        {
            if (iterator.hasNext())
            {
                HeartRateZone heartratezone = (HeartRateZone)iterator.next();
                switch (com.fitbit.data.domain.heartrate._cls1.a[heartratezone.c().ordinal()])
                {
                case 1: // '\001'
                case 2: // '\002'
                case 3: // '\003'
                    d1 = heartratezone.g() + d1;
                    break;
                }
            } else
            {
                return d1;
            }
        } while (true);
    }

    public int h()
    {
        return averageHeartRate;
    }

    public int i()
    {
        return restingHeartRate;
    }

    public void initFromPublicApiJsonObject(JSONObject jsonobject)
        throws JSONException
    {
        boolean flag = false;
        a(o.c(com.fitbit.d.a.e(jsonobject, "dateTime")));
        jsonobject = jsonobject.optJSONObject("value");
        if (jsonobject != null)
        {
            JSONArray jsonarray = jsonobject.optJSONArray("heartRateZones");
            ArrayList arraylist = new ArrayList();
            for (int j = 0; jsonarray != null && j < jsonarray.length(); j++)
            {
                JSONObject jsonobject1 = jsonarray.optJSONObject(j);
                if (jsonobject1 != null)
                {
                    HeartRateZone heartratezone = new HeartRateZone();
                    heartratezone.initFromPublicApiJsonObject(jsonobject1);
                    heartratezone.a(HeartRateZone.HeartRateZoneType.values()[j]);
                    arraylist.add(heartratezone);
                }
            }

            if (arraylist.size() < HeartRateZone.HeartRateZoneType.PEAK.ordinal() + 1)
            {
                throw new JSONException("Some of Heart Rate Zones ommited");
            }
            b(arraylist);
            jsonarray = jsonobject.optJSONArray("customHeartRateZones");
            arraylist = new ArrayList();
            for (int k = ((flag) ? 1 : 0); jsonarray != null && k < jsonarray.length(); k++)
            {
                JSONObject jsonobject2 = jsonarray.optJSONObject(k);
                if (jsonobject2 != null)
                {
                    HeartRateZone heartratezone1 = new HeartRateZone();
                    heartratezone1.initFromPublicApiJsonObject(jsonobject2);
                    heartratezone1.a(HeartRateZone.HeartRateZoneType.CUSTOM_ZONE);
                    arraylist.add(heartratezone1);
                }
            }

            a(arraylist);
            restingHeartRate = jsonobject.optInt("restingHeartRate");
            averageHeartRate = jsonobject.optInt("averageHeartRate");
        }
    }

    public JSONObject toPublicApiJsonObject()
        throws JSONException
    {
        throw new UnsupportedOperationException();
    }
}
