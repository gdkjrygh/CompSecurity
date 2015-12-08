// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain;

import android.content.Context;
import android.util.Pair;
import com.fitbit.d.a;
import com.fitbit.d.b;
import com.fitbit.util.format.e;
import com.fitbit.util.o;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.fitbit.data.domain:
//            LogEntry, n, t

public class SleepLogEntry extends LogEntry
    implements b, n
{

    private int awakeCount;
    private int awakeningsCount;
    private int calculatedAwakeCount;
    private int calculatedAwakeDuration;
    private int calculatedRestlessCount;
    private int calculatedRestlessDuration;
    private int duration;
    private float efficiency;
    private boolean isMainSleep;
    private List minuteData;
    private int minutesAfterWakeup;
    private int minutesAsleep;
    private int minutesAwake;
    private int minutesToFallAsleep;
    private int restlessCount;
    private Date startTime;
    private int timeInBed;

    public SleepLogEntry()
    {
    }

    private void s()
    {
        calculatedAwakeCount = 0;
        calculatedRestlessCount = 0;
        calculatedAwakeDuration = 0;
        calculatedRestlessDuration = 0;
        Pair pair = com.fitbit.data.domain.t.a(this, 3);
        Pair pair1 = com.fitbit.data.domain.t.a(this, 2);
        calculatedAwakeCount = ((Integer)pair.first).intValue();
        calculatedAwakeDuration = ((Integer)pair.second).intValue();
        calculatedRestlessCount = ((Integer)pair1.first).intValue();
        calculatedRestlessDuration = ((Integer)pair1.second).intValue();
    }

    public String a(Context context)
    {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(a());
        calendar.add(14, e());
        return (new StringBuilder()).append(com.fitbit.util.format.e.n(context, a())).append(" - ").append(com.fitbit.util.format.e.n(context, calendar.getTime())).toString();
    }

    public Date a()
    {
        return startTime;
    }

    public void a(float f1)
    {
        efficiency = f1;
    }

    public void a(int i1)
    {
        duration = i1;
    }

    public void a(Date date)
    {
        startTime = date;
    }

    public void a(List list)
    {
        minuteData = list;
        s();
    }

    public void a(boolean flag)
    {
        isMainSleep = flag;
    }

    public Date b()
    {
        return new Date(startTime.getTime() + (long)duration);
    }

    public void b(int i1)
    {
        minutesToFallAsleep = i1;
    }

    public void c(int i1)
    {
        minutesAsleep = i1;
    }

    public boolean c()
    {
        return isMainSleep;
    }

    public float d()
    {
        return efficiency;
    }

    public void d(int i1)
    {
        minutesAwake = i1;
    }

    public int e()
    {
        return duration;
    }

    public void e(int i1)
    {
        minutesAfterWakeup = i1;
    }

    public int f()
    {
        return minutesToFallAsleep;
    }

    public void f(int i1)
    {
        awakeningsCount = i1;
    }

    public int g()
    {
        return minutesAsleep;
    }

    public void g(int i1)
    {
        awakeCount = i1;
    }

    public int h()
    {
        return minutesAwake;
    }

    public void h(int i1)
    {
        restlessCount = i1;
    }

    public int i()
    {
        return minutesAfterWakeup;
    }

    public void i(int i1)
    {
        timeInBed = i1;
    }

    public void initFromPublicApiJsonObject(JSONObject jsonobject)
        throws JSONException
    {
        setServerId(jsonobject.getLong("logId"));
        isMainSleep = com.fitbit.d.a.a(jsonobject, "isMainSleep", false).booleanValue();
        efficiency = (float)com.fitbit.d.a.a(jsonobject, "efficiency", 0.0D);
        startTime = com.fitbit.d.a.c(jsonobject, "startTime");
        duration = com.fitbit.d.a.a(jsonobject, "duration", 0);
        minutesToFallAsleep = com.fitbit.d.a.a(jsonobject, "minutesToFallAsleep", 0);
        minutesAsleep = com.fitbit.d.a.a(jsonobject, "minutesAsleep", 0);
        minutesAwake = com.fitbit.d.a.a(jsonobject, "minutesAwake", 0);
        minutesAfterWakeup = com.fitbit.d.a.a(jsonobject, "minutesAfterWakeup", 0);
        awakeningsCount = com.fitbit.d.a.a(jsonobject, "awakeningsCount", 0);
        timeInBed = com.fitbit.d.a.a(jsonobject, "timeInBed", 0);
        awakeCount = com.fitbit.d.a.a(jsonobject, "awakeCount", 0);
        restlessCount = com.fitbit.d.a.a(jsonobject, "restlessCount", 0);
        setLogDate(com.fitbit.util.o.d(com.fitbit.d.a.e(jsonobject, "dateOfSleep")));
    }

    public int j()
    {
        return awakeningsCount;
    }

    public int k()
    {
        return awakeCount;
    }

    public int l()
    {
        return restlessCount;
    }

    public int m()
    {
        return timeInBed;
    }

    public int n()
    {
        return calculatedAwakeCount;
    }

    public int o()
    {
        return calculatedRestlessCount;
    }

    public int p()
    {
        return calculatedAwakeDuration;
    }

    public int q()
    {
        return calculatedRestlessDuration;
    }

    public List r()
    {
        return minuteData;
    }

    public JSONObject toPublicApiJsonObject()
        throws JSONException
    {
        throw new UnsupportedOperationException();
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(super.toString());
        stringbuilder.append(" startTime: ").append(a());
        stringbuilder.append(" duartion: ").append(e());
        stringbuilder.append(" munites(toFallAsleep/asleep/awake/afterWakeUp): ");
        stringbuilder.append(f()).append("/");
        stringbuilder.append(g()).append("/");
        stringbuilder.append(h()).append("/");
        stringbuilder.append(i()).append("/");
        stringbuilder.append(" timeInBed: ").append(m());
        stringbuilder.append(" awakeningsCount: ").append(j());
        stringbuilder.append(" awakeCount: ").append(k());
        stringbuilder.append(" restlessCount: ").append(l());
        stringbuilder.append(" calculatedAwakeCount: ").append(n());
        stringbuilder.append(" calculatedRestlessCount: ").append(o());
        return stringbuilder.toString();
    }
}
