// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.measurement.internal;

import android.os.Looper;

// Referenced classes of package com.google.android.gms.measurement.internal:
//            l, ac, ab

final class a
    implements Runnable
{

    final l a;

    public final void run()
    {
        if (Looper.myLooper() == Looper.getMainLooper())
        {
            l.a(a).f().a(this);
        } else
        {
            boolean flag;
            if (a.b != 0L)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            l.b(a);
            if (flag && l.c(a))
            {
                a.a();
                return;
            }
        }
    }

    (l l1)
    {
        a = l1;
        super();
    }
}
