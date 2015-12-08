// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android;

import kik.a.z;

// Referenced classes of package kik.android:
//            d, a

final class e
    implements Runnable
{

    final d a;

    e(d d1)
    {
        a = d1;
        super();
    }

    public final void run()
    {
        if (z.a(kik.android.a.e(a.a)))
        {
            if (kik.android.a.f(a.a) || kik.android.a.g(a.a))
            {
                kik.android.a.h(a.a);
            } else
            if (kik.android.a.i(a.a))
            {
                kik.android.a.j(a.a);
                return;
            }
        }
    }
}
