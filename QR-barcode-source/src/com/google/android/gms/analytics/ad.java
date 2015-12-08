// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;

// Referenced classes of package com.google.android.gms.analytics:
//            l

class ad
    implements l
{

    private static ad Bi;
    private static Object xz = new Object();
    private final Context mContext;

    protected ad(Context context)
    {
        mContext = context;
    }

    public static ad eQ()
    {
        ad ad1;
        synchronized (xz)
        {
            ad1 = Bi;
        }
        return ad1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static void y(Context context)
    {
        synchronized (xz)
        {
            if (Bi == null)
            {
                Bi = new ad(context);
            }
        }
        return;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    public boolean ac(String s)
    {
        return "&sr".equals(s);
    }

    protected String eR()
    {
        DisplayMetrics displaymetrics = mContext.getResources().getDisplayMetrics();
        return (new StringBuilder()).append(displaymetrics.widthPixels).append("x").append(displaymetrics.heightPixels).toString();
    }

    public String getValue(String s)
    {
        while (s == null || !s.equals("&sr")) 
        {
            return null;
        }
        return eR();
    }

}
