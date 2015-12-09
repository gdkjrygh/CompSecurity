// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.common.GooglePlayServicesUtil;

// Referenced classes of package com.google.android.gms.internal:
//            cx, dx, dw, do, 
//            cz

public final class cu
{
    public static interface a
    {

        public abstract void a(cz cz);
    }


    public static do a(Context context, cx cx1, a a1)
    {
        if (cx1.kK.rt)
        {
            return b(context, cx1, a1);
        } else
        {
            return c(context, cx1, a1);
        }
    }

    private static do b(Context context, cx cx1, a a1)
    {
        dw.v("Fetching ad response from local ad request service.");
        context = new cv.a(context, cx1, a1);
        context.start();
        return context;
    }

    private static do c(Context context, cx cx1, a a1)
    {
        dw.v("Fetching ad response from remote ad request service.");
        if (GooglePlayServicesUtil.isGooglePlayServicesAvailable(context) != 0)
        {
            dw.z("Failed to connect to remote ad request service.");
            return null;
        } else
        {
            return new cv.b(context, cx1, a1);
        }
    }
}
