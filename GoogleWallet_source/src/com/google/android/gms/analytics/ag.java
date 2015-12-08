// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;

// Referenced classes of package com.google.android.gms.analytics:
//            q

final class ag
    implements q
{

    private static ag BZ;
    private static Object xN = new Object();
    private final Context mContext;

    private ag(Context context)
    {
        mContext = context;
    }

    public static ag fg()
    {
        ag ag1;
        synchronized (xN)
        {
            ag1 = BZ;
        }
        return ag1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private String fh()
    {
        DisplayMetrics displaymetrics = mContext.getResources().getDisplayMetrics();
        return (new StringBuilder()).append(displaymetrics.widthPixels).append("x").append(displaymetrics.heightPixels).toString();
    }

    public static void y(Context context)
    {
        synchronized (xN)
        {
            if (BZ == null)
            {
                BZ = new ag(context);
            }
        }
        return;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    public final String getValue(String s)
    {
        while (s == null || !s.equals("&sr")) 
        {
            return null;
        }
        return fh();
    }

}
