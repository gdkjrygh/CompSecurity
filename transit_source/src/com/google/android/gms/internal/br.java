// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.common.GooglePlayServicesUtil;

// Referenced classes of package com.google.android.gms.internal:
//            bu, co, cn, cg, 
//            bw

public final class br
{
    public static interface a
    {

        public abstract void a(bw bw);
    }


    public static cg a(Context context, bu bu1, a a1)
    {
        if (bu1.eg.hS)
        {
            return b(context, bu1, a1);
        } else
        {
            return c(context, bu1, a1);
        }
    }

    private static cg b(Context context, bu bu1, a a1)
    {
        cn.m("Fetching ad response from local ad request service.");
        context = new bs.a(context, bu1, a1);
        context.start();
        return context;
    }

    private static cg c(Context context, bu bu1, a a1)
    {
        cn.m("Fetching ad response from remote ad request service.");
        if (GooglePlayServicesUtil.isGooglePlayServicesAvailable(context) != 0)
        {
            cn.q("Failed to connect to remote ad request service.");
            return null;
        } else
        {
            return new bs.b(context, bu1, a1);
        }
    }
}
