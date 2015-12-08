// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Process;
import android.text.TextUtils;
import com.google.android.gms.common.internal.g;
import com.google.android.gms.common.internal.z;
import com.google.android.gms.internal.jd;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            am, t, g, aa, 
//            ac

public class af
{

    private final t a;
    private volatile Boolean b;
    private String c;
    private Set d;

    protected af(t t1)
    {
        com.google.android.gms.common.internal.z.a(t1);
        a = t1;
    }

    public String A()
    {
        return "google_analytics_v4.db";
    }

    public String B()
    {
        return "google_analytics2_v4.db";
    }

    public long C()
    {
        return 0x5265c00L;
    }

    public int D()
    {
        return ((Integer)am.E.a()).intValue();
    }

    public int E()
    {
        return ((Integer)am.F.a()).intValue();
    }

    public long F()
    {
        return ((Long)am.G.a()).longValue();
    }

    public long G()
    {
        return ((Long)am.P.a()).longValue();
    }

    public boolean a()
    {
        return g.a;
    }

    public boolean b()
    {
        if (b != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorenter ;
        if (b != null) goto _L4; else goto _L3
_L3:
        String s1;
        Object obj;
        obj = a.b().getApplicationInfo();
        s1 = jd.a(a.b(), Process.myPid());
        if (obj == null) goto _L6; else goto _L5
_L5:
        obj = ((ApplicationInfo) (obj)).processName;
        if (obj == null) goto _L8; else goto _L7
_L7:
        if (!((String) (obj)).equals(s1)) goto _L8; else goto _L9
_L9:
        boolean flag = true;
_L11:
        b = Boolean.valueOf(flag);
_L6:
        if ((b == null || !b.booleanValue()) && "com.google.android.gms.analytics".equals(s1))
        {
            b = Boolean.TRUE;
        }
        if (b == null)
        {
            b = Boolean.TRUE;
            a.f().f("My process not in the list of running processes");
        }
_L4:
        this;
        JVM INSTR monitorexit ;
_L2:
        return b.booleanValue();
_L8:
        flag = false;
        if (true) goto _L11; else goto _L10
_L10:
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean c()
    {
        return ((Boolean)am.b.a()).booleanValue();
    }

    public int d()
    {
        return ((Integer)am.u.a()).intValue();
    }

    public int e()
    {
        return ((Integer)am.y.a()).intValue();
    }

    public int f()
    {
        return ((Integer)com.google.android.gms.analytics.internal.am.z.a()).intValue();
    }

    public int g()
    {
        return ((Integer)am.A.a()).intValue();
    }

    public long h()
    {
        return ((Long)am.j.a()).longValue();
    }

    public long i()
    {
        return ((Long)am.i.a()).longValue();
    }

    public long j()
    {
        return ((Long)am.m.a()).longValue();
    }

    public long k()
    {
        return ((Long)am.n.a()).longValue();
    }

    public int l()
    {
        return ((Integer)am.o.a()).intValue();
    }

    public int m()
    {
        return ((Integer)am.p.a()).intValue();
    }

    public long n()
    {
        return (long)((Integer)am.C.a()).intValue();
    }

    public String o()
    {
        return (String)am.r.a();
    }

    public String p()
    {
        return (String)am.q.a();
    }

    public String q()
    {
        return (String)am.s.a();
    }

    public String r()
    {
        return (String)am.t.a();
    }

    public aa s()
    {
        return aa.a((String)am.v.a());
    }

    public ac t()
    {
        return ac.a((String)am.w.a());
    }

    public Set u()
    {
        String s1 = (String)am.B.a();
        if (d == null || c == null || !c.equals(s1))
        {
            String as[] = TextUtils.split(s1, ",");
            HashSet hashset = new HashSet();
            int j1 = as.length;
            int i1 = 0;
            while (i1 < j1) 
            {
                String s2 = as[i1];
                try
                {
                    hashset.add(Integer.valueOf(Integer.parseInt(s2)));
                }
                catch (NumberFormatException numberformatexception) { }
                i1++;
            }
            c = s1;
            d = hashset;
        }
        return d;
    }

    public long v()
    {
        return ((Long)am.K.a()).longValue();
    }

    public long w()
    {
        return ((Long)am.L.a()).longValue();
    }

    public long x()
    {
        return ((Long)am.O.a()).longValue();
    }

    public int y()
    {
        return ((Integer)am.f.a()).intValue();
    }

    public int z()
    {
        return ((Integer)am.h.a()).intValue();
    }
}
