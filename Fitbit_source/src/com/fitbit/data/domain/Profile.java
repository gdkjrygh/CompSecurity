// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain;

import com.fitbit.d.a;
import com.fitbit.data.bl.ft;
import com.fitbit.data.domain.device.Device;
import com.fitbit.data.domain.device.DeviceType;
import com.fitbit.util.bn;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.EnumSet;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.fitbit.data.domain:
//            User, c, ProfilePreference, UnitSystem, 
//            Length, DietPlan

public class Profile extends User
    implements c, Serializable
{

    private static final String a = "languageLocale";
    private static final String b = "distanceUnit";
    private static final String c = "heightUnit";
    private static final String d = "weightUnit";
    private static final String e = "waterUnitName";
    private static final long serialVersionUID = 0x7e9ad8f8661e4c2L;
    private boolean challengesBeta;
    private String city;
    private boolean customHeartRateZoneEnabled;
    private int customHeartRateZoneLowerLimit;
    private int customHeartRateZoneUpperLimit;
    private Date dateOfBirth;
    private Length.LengthUnits distanceUnit;
    private volatile transient List f;
    private String foodsLocale;
    private volatile transient EnumSet g;
    private Length.LengthUnits heightUnit;
    private boolean hideMeFromLeaderboard;
    private String languageLocale;
    private Lock lockSetDietPlan;
    private Boolean loggedIn;
    private String oauthSecret;
    private String oauthToken;
    private DietPlan plan;
    private String state;
    private Length strideLengthRunning;
    private Length strideLengthWalking;
    private boolean trainerEnabled;
    private WaterLogEntry.WaterUnits waterUnit;
    private WeightLogEntry.WeightUnits weightUnit;

    public Profile()
    {
        loggedIn = Boolean.valueOf(false);
        customHeartRateZoneLowerLimit = 0;
        customHeartRateZoneUpperLimit = 0;
        customHeartRateZoneEnabled = false;
        g = EnumSet.noneOf(com/fitbit/data/domain/ProfilePreference);
        lockSetDietPlan = new ReentrantLock();
    }

    public int B()
    {
        return customHeartRateZoneUpperLimit;
    }

    public boolean C()
    {
        return customHeartRateZoneEnabled;
    }

    public EnumSet D()
    {
        return g;
    }

    public DietPlan a()
    {
        return plan;
    }

    public void a(int i1)
    {
        customHeartRateZoneLowerLimit = i1;
    }

    public void a(DietPlan dietplan)
    {
        b().lock();
        plan = dietplan;
        b().unlock();
        return;
        dietplan;
        b().unlock();
        throw dietplan;
    }

    public void a(Length.LengthUnits lengthunits)
    {
        distanceUnit = lengthunits;
    }

    public void a(Length length)
    {
        strideLengthRunning = length;
    }

    public void a(WaterLogEntry.WaterUnits waterunits)
    {
        waterUnit = waterunits;
    }

    public void a(WeightLogEntry.WeightUnits weightunits)
    {
        weightUnit = weightunits;
    }

    public void a(String s1)
    {
        languageLocale = s1;
    }

    public void a(String s1, String s2)
    {
        oauthToken = s1;
        oauthSecret = s2;
    }

    public void a(Date date)
    {
        dateOfBirth = date;
    }

    public void a(EnumSet enumset)
    {
        if (enumset == null)
        {
            enumset = EnumSet.noneOf(com/fitbit/data/domain/ProfilePreference);
        }
        g = enumset;
    }

    public void a(List list)
    {
        f = Collections.unmodifiableList(list);
    }

    public void a(boolean flag)
    {
        hideMeFromLeaderboard = flag;
    }

    public double b(Date date)
    {
        GregorianCalendar gregoriancalendar = new GregorianCalendar();
        gregoriancalendar.setTime(date);
        gregoriancalendar.get(1);
        date = new GregorianCalendar();
        date.setTime(j());
        if (gregoriancalendar.get(2) < date.get(2) || gregoriancalendar.get(2) == date.get(2) && gregoriancalendar.get(5) < date.get(5))
        {
            return (double)(gregoriancalendar.get(1) - date.get(1) - 1);
        } else
        {
            return (double)(gregoriancalendar.get(1) - date.get(1));
        }
    }

    public Lock b()
    {
        return lockSetDietPlan;
    }

    public void b(int i1)
    {
        customHeartRateZoneUpperLimit = i1;
    }

    public void b(Length.LengthUnits lengthunits)
    {
        heightUnit = lengthunits;
    }

    public void b(Length length)
    {
        strideLengthWalking = length;
    }

    public void b(String s1)
    {
        foodsLocale = s1;
    }

    public void b(boolean flag)
    {
        trainerEnabled = flag;
    }

    public void c(String s1)
    {
        state = s1;
    }

    public void c(boolean flag)
    {
        loggedIn = Boolean.valueOf(flag);
    }

    public boolean c()
    {
        return hideMeFromLeaderboard;
    }

    public String d()
    {
        return languageLocale;
    }

    public void d(String s1)
    {
        city = s1;
    }

    public void d(boolean flag)
    {
        challengesBeta = flag;
    }

    public Length e()
    {
        return strideLengthRunning;
    }

    public void e(boolean flag)
    {
        customHeartRateZoneEnabled = flag;
    }

    public Length f()
    {
        return strideLengthWalking;
    }

    public boolean g()
    {
        return trainerEnabled;
    }

    public boolean h()
    {
        return dateOfBirth != null;
    }

    public Date i()
    {
        GregorianCalendar gregoriancalendar = new GregorianCalendar(bn.c());
        gregoriancalendar.add(1, -25);
        gregoriancalendar.set(2, 0);
        gregoriancalendar.set(5, 1);
        return gregoriancalendar.getTime();
    }

    public void initFromPublicApiJsonObject(JSONObject jsonobject)
        throws JSONException
    {
        super.initFromPublicApiJsonObject(jsonobject);
        j(jsonobject.optString("locale"));
        a(UnitSystem.parse(jsonobject.getString("distanceUnit")).getDistanceUnit());
        b(UnitSystem.parse(jsonobject.getString("heightUnit")).getHeightUnit());
        a(UnitSystem.parse(jsonobject.getString("weightUnit")).getWeightUnits());
        a(WaterLogEntry.WaterUnits.parse(jsonobject.getString("waterUnitName")));
        b(jsonobject.optString("foodsLocale"));
        a(com.fitbit.d.a.a(jsonobject, "dateOfBirth", bn.c()));
        a(jsonobject.optString("languageLocale"));
        a(new Length(jsonobject.optDouble("strideLengthRunning"), Length.LengthUnits.CM));
        b(new Length(jsonobject.optDouble("strideLengthWalking"), Length.LengthUnits.CM));
        JSONObject jsonobject1;
        boolean flag;
        if (jsonobject.has("challengesBeta") && jsonobject.getBoolean("challengesBeta"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        d(flag);
        h(jsonobject.optString("nickname"));
        a(ft.a().a(jsonobject.optString("timezone")));
        jsonobject1 = jsonobject.optJSONObject("customHeartRateZone");
        if (jsonobject1 != null)
        {
            b(jsonobject1.optInt("max"));
            a(jsonobject1.optInt("min"));
            e(jsonobject1.optBoolean("enabled"));
        }
        c(jsonobject.optString("state"));
    }

    public Date j()
    {
        if (dateOfBirth == null)
        {
            return i();
        } else
        {
            return dateOfBirth;
        }
    }

    public boolean k()
    {
        return loggedIn.booleanValue();
    }

    public String l()
    {
        return oauthToken;
    }

    public String m()
    {
        return foodsLocale;
    }

    public String n()
    {
        return state;
    }

    public String o()
    {
        return city;
    }

    public boolean p()
    {
        return plan != null;
    }

    public Date q()
    {
        Object obj = null;
        Date date = null;
        Object obj1 = s();
        if (obj1 != null)
        {
            obj1 = ((List) (obj1)).iterator();
            do
            {
                obj = date;
                if (!((Iterator) (obj1)).hasNext())
                {
                    break;
                }
                obj = (Device)((Iterator) (obj1)).next();
                if (((Device) (obj)).g() == DeviceType.TRACKER)
                {
                    if (date == null)
                    {
                        date = ((Device) (obj)).e();
                    } else
                    if (((Device) (obj)).e() != null && ((Device) (obj)).e().after(date))
                    {
                        date = ((Device) (obj)).e();
                    }
                }
            } while (true);
        }
        return ((Date) (obj));
    }

    public String r()
    {
        return oauthSecret;
    }

    public List s()
    {
        return f;
    }

    public Length.LengthUnits t()
    {
        return distanceUnit;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(super.toString());
        stringbuilder.append(" isLoggedIn: ").append(k());
        stringbuilder.append(" oauthToken: ").append(l());
        return stringbuilder.toString();
    }

    public Set u()
    {
        TreeSet treeset = new TreeSet();
        Object obj = s();
        if (obj != null)
        {
            obj = ((List) (obj)).iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                Device device = (Device)((Iterator) (obj)).next();
                if (device.g() == DeviceType.TRACKER)
                {
                    treeset.add(device.h());
                }
            } while (true);
        }
        return treeset;
    }

    public Length.LengthUnits v()
    {
        return heightUnit;
    }

    public WeightLogEntry.WeightUnits w()
    {
        return weightUnit;
    }

    public WaterLogEntry.WaterUnits x()
    {
        return waterUnit;
    }

    public boolean y()
    {
        return challengesBeta;
    }

    public int z()
    {
        return customHeartRateZoneLowerLimit;
    }
}
