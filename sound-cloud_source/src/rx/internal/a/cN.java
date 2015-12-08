// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import rx.b;
import rx.b.a;

// Referenced classes of package rx.internal.a:
//            cO, cM

final class cN
    implements a
{

    final b a;
    final cM b;

    cN(cM cm, b b1)
    {
        b = cm;
        a = b1;
        super();
    }

    public final void call()
    {
        Thread thread = Thread.currentThread();
        a.unsafeSubscribe(new cO(this, b.a, thread));
    }
}
