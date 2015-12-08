// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import android.view.ViewGroup;

// Referenced classes of package com.taplytics:
//            cv, gh, ci, hk

final class di
    implements Runnable
{

    final cv a;

    di(cv cv1)
    {
        a = cv1;
        super();
    }

    public final void run()
    {
        if (cv.d(a).findViewById(0x17ccbc36) == null)
        {
            cv cv1 = a;
            gh gh1 = new gh(ci.b().u);
            android.widget.FrameLayout.LayoutParams layoutparams = new android.widget.FrameLayout.LayoutParams(-1, -1);
            layoutparams.setMargins(0, hk.a(ci.b().u), 0, 0);
            gh1.setLayoutParams(layoutparams);
            gh1.setId(0x17ccbc36);
            cv.a(cv1, gh1);
            cv.d(a).addView(cv.l(a));
        }
    }
}
