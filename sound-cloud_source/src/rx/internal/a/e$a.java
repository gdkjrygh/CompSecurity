// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import rx.P;
import rx.h.e;
import rx.internal.util.b;

// Referenced classes of package rx.internal.a:
//            e, g

static final class d extends b
    implements P
{

    static final a d[] = new a[0];
    final rx.b a;
    final e b = new e();
    volatile a c[];
    final g e = rx.internal.a.g.a();
    volatile boolean f;
    boolean g;

    private void a()
    {
         a1[] = c;
        int j = a1.length;
        for (int i = 0; i < j; i++)
        {
            a1[i].a();
        }

    }

    public final void onCompleted()
    {
        if (!g)
        {
            g = true;
            a(rx.internal.a.g.b());
            b.unsubscribe();
            a();
        }
    }

    public final void onError(Throwable throwable)
    {
        if (!g)
        {
            g = true;
            a(rx.internal.a.g.a(throwable));
            b.unsubscribe();
            a();
        }
    }

    public final void onNext(Object obj)
    {
        if (!g)
        {
            a(rx.internal.a.g.a(obj));
            a();
        }
    }


    public e(rx.b b1, int i)
    {
        super(i);
        a = b1;
        c = d;
    }
}
