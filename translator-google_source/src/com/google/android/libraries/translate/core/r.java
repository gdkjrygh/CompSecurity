// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.core;

import android.os.SystemClock;
import android.support.v4.d.f;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.google.android.libraries.translate.core:
//            s, l, n, p, 
//            m

final class r extends s
{

    final n a;

    r(n n1)
    {
        a = n1;
        super();
    }

    public final transient m a(String as[])
    {
        long l1 = SystemClock.elapsedRealtime();
        m m = l.a(as[0], as[1], as[2], as[3]);
        long l2 = SystemClock.elapsedRealtime();
        AtomicBoolean atomicboolean = a.a;
        boolean flag;
        if (l2 > l1 + 5000L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        atomicboolean.set(flag);
        a.b.a(n.a(as[0], as[1], as[2]), new p(m));
        return m;
    }
}
