// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;

// Referenced classes of package com.google.android.gms.analytics:
//            m

class ae
    implements m
{

    private static Object tq = new Object();
    private static ae wZ;
    private final Context mContext;

    protected ae(Context context)
    {
        mContext = context;
    }

    public static ae dv()
    {
        ae ae1;
        synchronized (tq)
        {
            ae1 = wZ;
        }
        return ae1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static void u(Context context)
    {
        synchronized (tq)
        {
            if (wZ == null)
            {
                wZ = new ae(context);
            }
        }
        return;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    public boolean J(String s)
    {
        return "&sr".equals(s);
    }

    protected String dw()
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
        return dw();
    }

}
