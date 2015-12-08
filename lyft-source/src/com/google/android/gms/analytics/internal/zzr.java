// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Process;
import android.text.TextUtils;
import com.google.android.gms.common.internal.zzd;
import com.google.android.gms.common.internal.zzu;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            zzy, zzf, zzaf, zzm, 
//            zzo

public class zzr
{

    private final zzf a;
    private Boolean b;
    private String c;
    private Set d;

    protected zzr(zzf zzf1)
    {
        zzu.a(zzf1);
        a = zzf1;
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
        return ((Integer)zzy.E.a()).intValue();
    }

    public int E()
    {
        return ((Integer)zzy.F.a()).intValue();
    }

    public long F()
    {
        return ((Long)zzy.G.a()).longValue();
    }

    public long G()
    {
        return ((Long)zzy.P.a()).longValue();
    }

    public boolean a()
    {
        return zzd.a;
    }

    public boolean b()
    {
        if (b != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorenter ;
        if (b != null) goto _L4; else goto _L3
_L3:
        Object obj;
        Object obj1;
        obj1 = a.b();
        obj = ((Context) (obj1)).getApplicationInfo();
        if (obj == null) goto _L6; else goto _L5
_L5:
        obj = ((ApplicationInfo) (obj)).processName;
        obj1 = (ActivityManager)((Context) (obj1)).getSystemService("activity");
        if (obj1 == null) goto _L6; else goto _L7
_L7:
        int i1;
        i1 = Process.myPid();
        obj1 = ((ActivityManager) (obj1)).getRunningAppProcesses().iterator();
_L10:
        if (!((Iterator) (obj1)).hasNext()) goto _L6; else goto _L8
_L8:
        android.app.ActivityManager.RunningAppProcessInfo runningappprocessinfo = (android.app.ActivityManager.RunningAppProcessInfo)((Iterator) (obj1)).next();
        if (i1 != runningappprocessinfo.pid) goto _L10; else goto _L9
_L9:
        if (obj == null) goto _L12; else goto _L11
_L11:
        if (!((String) (obj)).equals(runningappprocessinfo.processName)) goto _L12; else goto _L13
_L13:
        boolean flag = true;
_L15:
        b = Boolean.valueOf(flag);
_L6:
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
_L12:
        flag = false;
        if (true) goto _L15; else goto _L14
_L14:
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean c()
    {
        return ((Boolean)zzy.b.a()).booleanValue();
    }

    public int d()
    {
        return ((Integer)zzy.u.a()).intValue();
    }

    public int e()
    {
        return ((Integer)zzy.y.a()).intValue();
    }

    public int f()
    {
        return ((Integer)zzy.z.a()).intValue();
    }

    public int g()
    {
        return ((Integer)zzy.A.a()).intValue();
    }

    public long h()
    {
        return ((Long)zzy.j.a()).longValue();
    }

    public long i()
    {
        return ((Long)zzy.i.a()).longValue();
    }

    public long j()
    {
        return ((Long)zzy.m.a()).longValue();
    }

    public long k()
    {
        return ((Long)zzy.n.a()).longValue();
    }

    public int l()
    {
        return ((Integer)zzy.o.a()).intValue();
    }

    public int m()
    {
        return ((Integer)zzy.p.a()).intValue();
    }

    public long n()
    {
        return (long)((Integer)zzy.C.a()).intValue();
    }

    public String o()
    {
        return (String)zzy.r.a();
    }

    public String p()
    {
        return (String)zzy.q.a();
    }

    public String q()
    {
        return (String)zzy.s.a();
    }

    public String r()
    {
        return (String)zzy.t.a();
    }

    public zzm s()
    {
        return zzm.a((String)zzy.v.a());
    }

    public zzo t()
    {
        return zzo.a((String)zzy.w.a());
    }

    public Set u()
    {
        String s1 = (String)zzy.B.a();
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
        return ((Long)zzy.K.a()).longValue();
    }

    public long w()
    {
        return ((Long)zzy.L.a()).longValue();
    }

    public long x()
    {
        return ((Long)zzy.O.a()).longValue();
    }

    public int y()
    {
        return ((Integer)zzy.f.a()).intValue();
    }

    public int z()
    {
        return ((Integer)zzy.h.a()).intValue();
    }
}
