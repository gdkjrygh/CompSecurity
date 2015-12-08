// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.common.GooglePlayServicesUtil;

// Referenced classes of package com.google.android.gms.internal:
//            fi, gt, gs, gg, 
//            fk

public final class ff
{
    public static interface a
    {

        public abstract void a(fk fk);
    }


    public static gg a(Context context, fi fi1, a a1)
    {
        if (fi1.lD.wG)
        {
            return b(context, fi1, a1);
        } else
        {
            return c(context, fi1, a1);
        }
    }

    private static gg b(Context context, fi fi1, a a1)
    {
        gs.S("Fetching ad response from local ad request service.");
        context = new fg.a(context, fi1, a1);
        context.start();
        return context;
    }

    private static gg c(Context context, fi fi1, a a1)
    {
        gs.S("Fetching ad response from remote ad request service.");
        if (GooglePlayServicesUtil.isGooglePlayServicesAvailable(context) != 0)
        {
            gs.W("Failed to connect to remote ad request service.");
            return null;
        } else
        {
            return new fg.b(context, fi1, a1);
        }
    }
}
