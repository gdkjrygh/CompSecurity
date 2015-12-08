// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;

// Referenced classes of package com.google.android.gms.analytics:
//            q

class ai
    implements q
{

    private static ai Cc;
    private static Object xO = new Object();
    private final Context mContext;

    protected ai(Context context)
    {
        mContext = context;
    }

    public static ai fl()
    {
        ai ai1;
        synchronized (xO)
        {
            ai1 = Cc;
        }
        return ai1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static void y(Context context)
    {
        synchronized (xO)
        {
            if (Cc == null)
            {
                Cc = new ai(context);
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

    protected String fm()
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
        return fm();
    }

}
