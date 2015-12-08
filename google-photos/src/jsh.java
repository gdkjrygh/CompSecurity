// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Process;
import android.text.TextUtils;
import java.util.HashSet;
import java.util.Set;

public final class jsh
{

    private final jrk a;
    private volatile Boolean b;
    private String c;
    private Set d;

    protected jsh(jrk jrk1)
    {
        b.d(jrk1);
        a = jrk1;
    }

    public static boolean b()
    {
        return ((Boolean)jsl.a.a()).booleanValue();
    }

    public static int c()
    {
        return ((Integer)jsl.r.a()).intValue();
    }

    public static long d()
    {
        return ((Long)jsl.f.a()).longValue();
    }

    public static long e()
    {
        return ((Long)jsl.g.a()).longValue();
    }

    public static int f()
    {
        return ((Integer)jsl.i.a()).intValue();
    }

    public static int g()
    {
        return ((Integer)jsl.j.a()).intValue();
    }

    public static String h()
    {
        return (String)jsl.l.a();
    }

    public static String i()
    {
        return (String)jsl.k.a();
    }

    public static String j()
    {
        return (String)jsl.m.a();
    }

    public static long l()
    {
        return ((Long)jsl.y.a()).longValue();
    }

    public final boolean a()
    {
        if (b != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorenter ;
        if (b != null) goto _L4; else goto _L3
_L3:
        String s;
        Object obj;
        obj = a.a.getApplicationInfo();
        s = b.b(a.a, Process.myPid());
        if (obj == null) goto _L6; else goto _L5
_L5:
        obj = ((ApplicationInfo) (obj)).processName;
        if (obj == null) goto _L8; else goto _L7
_L7:
        if (!((String) (obj)).equals(s)) goto _L8; else goto _L9
_L9:
        boolean flag = true;
_L11:
        b = Boolean.valueOf(flag);
_L6:
        if ((b == null || !b.booleanValue()) && "com.google.android.gms.analytics.analytics".equals(s))
        {
            b = Boolean.TRUE;
        }
        if (b == null)
        {
            b = Boolean.TRUE;
            a.a().f("My process not in the list of running processes");
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
        String s = (String)jsl.u.a();
        if (d == null || c == null || !c.equals(s))
        {
            String as[] = TextUtils.split(s, ",");
            HashSet hashset = new HashSet();
            int j1 = as.length;
            int i1 = 0;
            while (i1 < j1) 
            {
                String s1 = as[i1];
                try
                {
                    hashset.add(Integer.valueOf(Integer.parseInt(s1)));
                }
                catch (NumberFormatException numberformatexception) { }
                i1++;
            }
            c = s;
            d = hashset;
        }
        return d;
    }
}
