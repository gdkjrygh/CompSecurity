// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;

// Referenced classes of package com.google.android.gms.analytics:
//            ao

class t
    implements ao
{

    private static t a;
    private static Object b = new Object();
    private final Context c;

    protected t(Context context)
    {
        c = context;
    }

    public static t a()
    {
        t t1;
        synchronized (b)
        {
            t1 = a;
        }
        return t1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static void a(Context context)
    {
        synchronized (b)
        {
            if (a == null)
            {
                a = new t(context);
            }
        }
        return;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    public String a(String s)
    {
        while (s == null || !s.equals("&sr")) 
        {
            return null;
        }
        return b();
    }

    protected String b()
    {
        DisplayMetrics displaymetrics = c.getResources().getDisplayMetrics();
        return (new StringBuilder()).append(displaymetrics.widthPixels).append("x").append(displaymetrics.heightPixels).toString();
    }

    public boolean b(String s)
    {
        return "&sr".equals(s);
    }

}
