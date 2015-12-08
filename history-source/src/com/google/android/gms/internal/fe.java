// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.common.GooglePlayServicesUtil;

// Referenced classes of package com.google.android.gms.internal:
//            fh, gs, gr, gf, 
//            fj

public final class fe
{
    public static interface a
    {

        public abstract void a(fj fj);
    }


    public static gf a(Context context, fh fh1, a a1)
    {
        if (fh1.lO.wV)
        {
            return b(context, fh1, a1);
        } else
        {
            return c(context, fh1, a1);
        }
    }

    private static gf b(Context context, fh fh1, a a1)
    {
        gr.S("Fetching ad response from local ad request service.");
        context = new ff.a(context, fh1, a1);
        context.start();
        return context;
    }

    private static gf c(Context context, fh fh1, a a1)
    {
        gr.S("Fetching ad response from remote ad request service.");
        if (GooglePlayServicesUtil.isGooglePlayServicesAvailable(context) != 0)
        {
            gr.W("Failed to connect to remote ad request service.");
            return null;
        } else
        {
            return new ff.b(context, fh1, a1);
        }
    }
}
