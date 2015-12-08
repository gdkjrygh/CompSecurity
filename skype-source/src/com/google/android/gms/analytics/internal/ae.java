// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Process;
import android.text.TextUtils;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.internal.iu;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            al, s, g

public final class ae
{

    private final s a;
    private volatile Boolean b;
    private String c;
    private Set d;

    protected ae(s s1)
    {
        y.a(s1);
        a = s1;
    }

    public static boolean b()
    {
        return ((Boolean)al.b.a()).booleanValue();
    }

    public static int c()
    {
        return ((Integer)com.google.android.gms.analytics.internal.al.y.a()).intValue();
    }

    public static long d()
    {
        return ((Long)al.j.a()).longValue();
    }

    public static long e()
    {
        return ((Long)al.m.a()).longValue();
    }

    public static int f()
    {
        return ((Integer)al.o.a()).intValue();
    }

    public static int g()
    {
        return ((Integer)al.p.a()).intValue();
    }

    public static String h()
    {
        return (String)al.r.a();
    }

    public static String i()
    {
        return (String)al.q.a();
    }

    public static String j()
    {
        return (String)al.s.a();
    }

    public static long l()
    {
        return ((Long)al.G.a()).longValue();
    }

    public final boolean a()
    {
        if (b != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorenter ;
        if (b != null) goto _L4; else goto _L3
_L3:
        String s1;
        Object obj;
        obj = a.a().getApplicationInfo();
        s1 = iu.a(a.a(), Process.myPid());
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
            a.e().g("My process not in the list of running processes");
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

    public final Set k()
    {
        String s1 = (String)al.B.a();
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
}
