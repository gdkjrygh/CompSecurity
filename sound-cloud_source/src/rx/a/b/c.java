// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.a.b;

import android.os.Handler;
import rx.b.a;
import rx.internal.c.d;

final class c
    implements a
{

    final d a;
    final b.a b;

    c(b.a a1, d d)
    {
        b = a1;
        a = d;
        super();
    }

    public final void call()
    {
        b.a.removeCallbacks(a);
    }
}
