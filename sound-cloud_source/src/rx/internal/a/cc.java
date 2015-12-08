// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import java.util.concurrent.atomic.AtomicReference;
import rx.X;
import rx.b.e;

final class cc
    implements rx.b.f
{

    final AtomicReference a;
    final e b;

    cc(AtomicReference atomicreference, e e1)
    {
        a = atomicreference;
        b = e1;
        super();
    }

    public final void call(Object obj)
    {
        X x = (X)obj;
        do
        {
            obj = (bT.e)a.get();
            if (obj != null)
            {
                break;
            }
            bT.e e1 = new bT.e((bT.d)b.call());
            e1.a();
            if (!a.compareAndSet(obj, e1))
            {
                continue;
            }
            obj = e1;
            break;
        } while (true);
        bT.b b1 = new bT.b(((bT.e) (obj)), x);
        bT.b ab[];
        bT.b ab1[];
        do
        {
            ab = (bT.b[])((bT.e) (obj)).f.get();
            if (ab == rx.internal.a.bT.e.e)
            {
                break;
            }
            int i = ab.length;
            ab1 = new bT.b[i + 1];
            System.arraycopy(ab, 0, ab1, 0, i);
            ab1[i] = b1;
        } while (!((bT.e) (obj)).f.compareAndSet(ab, ab1));
        x.add(b1);
        x.setProducer(b1);
    }
}
