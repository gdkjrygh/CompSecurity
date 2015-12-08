// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

// Referenced classes of package com.taplytics:
//            cv, hk, turkey

final class de
    implements Runnable
{

    final cv a;

    de(cv cv1)
    {
        a = cv1;
        super();
    }

    public final void run()
    {
        if (hk.a(cv.d(a)) && cv.d(a).findViewById(0x17ccbc35).getTag().equals(turkey.a.name()))
        {
            if (cv.e(a) == null)
            {
                cv.a(a, "waiting..");
            }
            if (cv.f(a) == null)
            {
                cv.b(a, "waiting...");
            }
            ((TextView)cv.d(a).findViewById(0x17ccbc33)).setText((new StringBuilder("Experiment: ")).append(cv.e(a)).toString());
            ((TextView)cv.d(a).findViewById(0x17ccbc34)).setText((new StringBuilder("Variation: ")).append(cv.f(a)).toString());
        }
    }
}
