// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import android.app.AlertDialog;

// Referenced classes of package com.taplytics:
//            ci, gs, cq, fu

final class fv
    implements Runnable
{

    final fu a;

    fv(fu fu)
    {
        a = fu;
        super();
    }

    public final void run()
    {
        ci ci1 = ci.b();
        if (!ci1.g)
        {
            if (gs.b())
            {
                gs.a("live update being set to true due to pair token.");
            }
            ci1.g = true;
            ci1.c();
        }
        ci1.a(null, null);
        if (ci1.v != null && ci1.l)
        {
            android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(ci1.v);
            builder.setTitle("Taplytics Pairing Successful!");
            builder.setCancelable(false);
            builder.setPositiveButton("OK", new cq(ci1));
            ci1.z = builder.create();
            ci1.z.show();
        }
    }
}
