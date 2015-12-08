// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.f;

import rx.Y;
import rx.b.a;
import rx.h.c;
import rx.internal.c.d;

final class e
    implements a
{

    final c a;
    final a b;
    final Y c;
    final c.a d;

    e(c.a a1, c c1, a a2, Y y)
    {
        d = a1;
        a = c1;
        b = a2;
        c = y;
        super();
    }

    public final void call()
    {
        if (!a.isUnsubscribed())
        {
            Y y = d.a(b);
            a.a(y);
            if (y.getClass() == rx/internal/c/d)
            {
                ((d)y).a(c);
                return;
            }
        }
    }
}
