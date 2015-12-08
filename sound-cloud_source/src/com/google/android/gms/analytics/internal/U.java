// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.os.Looper;
import com.google.android.gms.b.aj;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            T, v

final class U
    implements Runnable
{

    final T a;

    U(T t)
    {
        a = t;
        super();
    }

    public final void run()
    {
        if (Looper.myLooper() == Looper.getMainLooper())
        {
            T.a(a).b().a(this);
        } else
        {
            boolean flag = a.b();
            T.b(a);
            if (flag && !T.c(a))
            {
                a.a();
                return;
            }
        }
    }
}
