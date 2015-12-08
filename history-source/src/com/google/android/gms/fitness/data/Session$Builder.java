// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.data;

import android.text.TextUtils;
import com.google.android.gms.fitness.FitnessActivities;
import com.google.android.gms.internal.jx;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.fitness.data:
//            Session, a

public static class TZ
{

    private long LW;
    private long TO;
    private int TZ;
    private String UN;
    private String UO;
    private a Um;
    private String mName;

    static long a(TZ tz)
    {
        return tz.LW;
    }

    static long b(LW lw)
    {
        return lw.TO;
    }

    static String c(TO to)
    {
        return to.mName;
    }

    static String d(mName mname)
    {
        return mname.UN;
    }

    static String e(UN un)
    {
        return un.UO;
    }

    static int f(UO uo)
    {
        return uo.TZ;
    }

    static a g(TZ tz)
    {
        return tz.Um;
    }

    public Session build()
    {
label0:
        {
            boolean flag1 = false;
            StringBuilder stringbuilder;
            boolean flag;
            if (LW > 0L)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            jx.a(flag, "Start time should be specified.");
            if (TO != 0L)
            {
                flag = flag1;
                if (TO <= LW)
                {
                    break label0;
                }
            }
            flag = true;
        }
        jx.a(flag, "End time should be later than start time.");
        if (UN == null)
        {
            stringbuilder = new StringBuilder();
            String s;
            if (mName == null)
            {
                s = "";
            } else
            {
                s = mName;
            }
            UN = stringbuilder.append(s).append(LW).toString();
        }
        return new Session(this, null);
    }

    public LW cV(int i)
    {
        TZ = i;
        return this;
    }

    public TZ setActivity(String s)
    {
        return cV(FitnessActivities.bs(s));
    }

    public cV setDescription(String s)
    {
        boolean flag;
        if (s.length() <= 1000)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        jx.b(flag, "Session description cannot exceed %d characters", new Object[] {
            Integer.valueOf(1000)
        });
        UO = s;
        return this;
    }

    public UO setEndTime(long l, TimeUnit timeunit)
    {
        boolean flag;
        if (l >= 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        jx.a(flag, "End time should be positive.");
        TO = timeunit.toMillis(l);
        return this;
    }

    public TO setIdentifier(String s)
    {
        boolean flag;
        if (s != null && TextUtils.getTrimmedLength(s) > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        jx.L(flag);
        UN = s;
        return this;
    }

    public UN setName(String s)
    {
        boolean flag;
        if (s.length() <= 100)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        jx.b(flag, "Session name cannot exceed %d characters", new Object[] {
            Integer.valueOf(100)
        });
        mName = s;
        return this;
    }

    public mName setStartTime(long l, TimeUnit timeunit)
    {
        boolean flag;
        if (l > 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        jx.a(flag, "Start time should be positive.");
        LW = timeunit.toMillis(l);
        return this;
    }

    public _cls9()
    {
        LW = 0L;
        TO = 0L;
        mName = null;
        TZ = 4;
    }
}
