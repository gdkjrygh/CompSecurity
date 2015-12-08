// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.f;

import java.util.concurrent.PriorityBlockingQueue;
import rx.b.a;

final class n
    implements a
{

    final m.b a;
    final m.a b;

    n(m.a a1, m.b b1)
    {
        b = a1;
        a = b1;
        super();
    }

    public final void call()
    {
        rx.f.m.a.a(b).remove(a);
    }
}
