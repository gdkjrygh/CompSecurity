// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.data;

import android.text.TextUtils;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.fitness.FitnessActivities;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.fitness.data:
//            Session, a

public static class SC
{

    private long KS;
    private int SC;
    private a SP;
    private long Sr;
    private String Tq;
    private String Tr;
    private String mName;

    static long a(SC sc)
    {
        return sc.KS;
    }

    static long b(KS ks)
    {
        return ks.Sr;
    }

    static String c(Sr sr)
    {
        return sr.mName;
    }

    static String d(mName mname)
    {
        return mname.Tq;
    }

    static String e(Tq tq)
    {
        return tq.Tr;
    }

    static int f(Tr tr)
    {
        return tr.SC;
    }

    static a g(SC sc)
    {
        return sc.SP;
    }

    public Session build()
    {
label0:
        {
            boolean flag1 = false;
            StringBuilder stringbuilder;
            boolean flag;
            if (KS > 0L)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            o.a(flag, "Start time should be specified.");
            if (Sr != 0L)
            {
                flag = flag1;
                if (Sr <= KS)
                {
                    break label0;
                }
            }
            flag = true;
        }
        o.a(flag, "End time should be later than start time.");
        if (Tq == null)
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
            Tq = stringbuilder.append(s).append(KS).toString();
        }
        return new Session(this, null);
    }

    public KS cK(int i)
    {
        SC = i;
        return this;
    }

    public SC setActivity(String s)
    {
        return cK(FitnessActivities.bp(s));
    }

    public cK setDescription(String s)
    {
        boolean flag;
        if (s.length() <= 1000)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        o.b(flag, "Session description cannot exceed %d characters", new Object[] {
            Integer.valueOf(1000)
        });
        Tr = s;
        return this;
    }

    public Tr setEndTime(long l, TimeUnit timeunit)
    {
        boolean flag;
        if (l >= 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        o.a(flag, "End time should be positive.");
        Sr = timeunit.toMillis(l);
        return this;
    }

    public Sr setIdentifier(String s)
    {
        boolean flag;
        if (s != null && TextUtils.getTrimmedLength(s) > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        o.K(flag);
        Tq = s;
        return this;
    }

    public Tq setName(String s)
    {
        boolean flag;
        if (s.length() <= 100)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        o.b(flag, "Session name cannot exceed %d characters", new Object[] {
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
        o.a(flag, "Start time should be positive.");
        KS = timeunit.toMillis(l);
        return this;
    }

    public _cls9()
    {
        KS = 0L;
        Sr = 0L;
        mName = null;
        SC = 4;
    }
}
