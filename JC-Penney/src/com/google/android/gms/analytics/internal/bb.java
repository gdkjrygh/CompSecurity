// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Process;
import android.text.TextUtils;
import com.google.android.gms.common.internal.a;
import com.google.android.gms.common.internal.u;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            bj, bk, ab, j, 
//            at, ax

public class bb
{

    private final ab a;
    private volatile Boolean b;
    private String c;
    private Set d;

    protected bb(ab ab1)
    {
        com.google.android.gms.common.internal.u.a(ab1);
        a = ab1;
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
        return ((Integer)bj.E.a()).intValue();
    }

    public int E()
    {
        return ((Integer)bj.F.a()).intValue();
    }

    public long F()
    {
        return ((Long)bj.G.a()).longValue();
    }

    public long G()
    {
        return ((Long)bj.P.a()).longValue();
    }

    public boolean a()
    {
        return a.a;
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
        s1 = com.google.android.gms.d.u.a(a.b(), Process.myPid());
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
        return ((Boolean)bj.b.a()).booleanValue();
    }

    public int d()
    {
        return ((Integer)com.google.android.gms.analytics.internal.bj.u.a()).intValue();
    }

    public int e()
    {
        return ((Integer)bj.y.a()).intValue();
    }

    public int f()
    {
        return ((Integer)bj.z.a()).intValue();
    }

    public int g()
    {
        return ((Integer)bj.A.a()).intValue();
    }

    public long h()
    {
        return ((Long)bj.j.a()).longValue();
    }

    public long i()
    {
        return ((Long)bj.i.a()).longValue();
    }

    public long j()
    {
        return ((Long)bj.m.a()).longValue();
    }

    public long k()
    {
        return ((Long)bj.n.a()).longValue();
    }

    public int l()
    {
        return ((Integer)bj.o.a()).intValue();
    }

    public int m()
    {
        return ((Integer)bj.p.a()).intValue();
    }

    public long n()
    {
        return (long)((Integer)bj.C.a()).intValue();
    }

    public String o()
    {
        return (String)bj.r.a();
    }

    public String p()
    {
        return (String)bj.q.a();
    }

    public String q()
    {
        return (String)bj.s.a();
    }

    public String r()
    {
        return (String)bj.t.a();
    }

    public at s()
    {
        return com.google.android.gms.analytics.internal.at.a((String)bj.v.a());
    }

    public ax t()
    {
        return com.google.android.gms.analytics.internal.ax.a((String)bj.w.a());
    }

    public Set u()
    {
        String s1 = (String)bj.B.a();
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
        return ((Long)bj.K.a()).longValue();
    }

    public long w()
    {
        return ((Long)bj.L.a()).longValue();
    }

    public long x()
    {
        return ((Long)bj.O.a()).longValue();
    }

    public int y()
    {
        return ((Integer)bj.f.a()).intValue();
    }

    public int z()
    {
        return ((Integer)bj.h.a()).intValue();
    }
}
