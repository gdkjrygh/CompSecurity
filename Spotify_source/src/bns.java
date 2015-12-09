// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Process;
import android.text.TextUtils;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class bns
{

    private final bnf a;
    private volatile Boolean b;
    private String c;
    private Set d;

    protected bns(bnf bnf1)
    {
        btl.a(bnf1);
        a = bnf1;
    }

    public static boolean b()
    {
        return ((Boolean)bnz.a.a).booleanValue();
    }

    public static int c()
    {
        return ((Integer)bnz.r.a).intValue();
    }

    public static long d()
    {
        return ((Long)bnz.f.a).longValue();
    }

    public static long e()
    {
        return ((Long)bnz.g.a).longValue();
    }

    public static int f()
    {
        return ((Integer)bnz.i.a).intValue();
    }

    public static int g()
    {
        return ((Integer)bnz.j.a).intValue();
    }

    public static String h()
    {
        return (String)bnz.l.a;
    }

    public static String i()
    {
        return (String)bnz.k.a;
    }

    public static String j()
    {
        return (String)bnz.m.a;
    }

    public static long l()
    {
        return ((Long)bnz.y.a).longValue();
    }

    public final boolean a()
    {
        if (b != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorenter ;
        if (b != null) goto _L4; else goto _L3
_L3:
        Object obj;
        Object obj1;
        int i1;
        obj1 = a.a.getApplicationInfo();
        obj = a.a;
        i1 = Process.myPid();
        obj = ((ActivityManager)((Context) (obj)).getSystemService("activity")).getRunningAppProcesses();
        if (obj == null) goto _L6; else goto _L5
_L5:
        obj = ((List) (obj)).iterator();
_L9:
        if (!((Iterator) (obj)).hasNext()) goto _L6; else goto _L7
_L7:
        android.app.ActivityManager.RunningAppProcessInfo runningappprocessinfo = (android.app.ActivityManager.RunningAppProcessInfo)((Iterator) (obj)).next();
        if (runningappprocessinfo.pid != i1) goto _L9; else goto _L8
_L8:
        obj = runningappprocessinfo.processName;
_L18:
        if (obj1 == null) goto _L11; else goto _L10
_L10:
        obj1 = ((ApplicationInfo) (obj1)).processName;
        if (obj1 == null) goto _L13; else goto _L12
_L12:
        if (!((String) (obj1)).equals(obj)) goto _L13; else goto _L14
_L14:
        boolean flag = true;
_L16:
        b = Boolean.valueOf(flag);
_L11:
        if ((b == null || !b.booleanValue()) && "com.google.android.gms.analytics".equals(obj))
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
_L6:
        obj = null;
        continue; /* Loop/switch isn't completed */
_L13:
        flag = false;
        if (true) goto _L16; else goto _L15
_L15:
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        if (true) goto _L18; else goto _L17
_L17:
    }

    public final Set k()
    {
        String s = (String)bnz.u.a;
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
