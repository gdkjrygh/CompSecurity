// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.os.Looper;
import com.google.android.gms.c.f;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            bb, aa

final class bc
    implements Runnable
{

    final bb a;

    bc(bb bb1)
    {
        a = bb1;
        super();
    }

    public final void run()
    {
        if (Looper.myLooper() == Looper.getMainLooper())
        {
            bb.a(a).g().a(this);
        } else
        {
            boolean flag = a.c();
            bb.b(a);
            if (flag && !bb.c(a))
            {
                a.a();
                return;
            }
        }
    }
}
