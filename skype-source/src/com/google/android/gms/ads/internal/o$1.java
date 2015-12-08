// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal;

import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.ads.internal:
//            o, a

final class a
    implements Runnable
{

    final WeakReference a;
    final o b;

    public final void run()
    {
        o.a(b);
        a a1 = (a)a.get();
        if (a1 != null)
        {
            a1.c(o.b(b));
        }
    }

    (o o1, WeakReference weakreference)
    {
        b = o1;
        a = weakreference;
        super();
    }
}
