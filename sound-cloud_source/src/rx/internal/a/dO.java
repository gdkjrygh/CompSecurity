// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import rx.R;
import rx.X;
import rx.b.a;

// Referenced classes of package rx.internal.a:
//            dM, dP

final class dO
    implements a
{

    final X a;
    final dM b;

    dO(dM dm, X x)
    {
        b = dm;
        a = x;
        super();
    }

    public final void call()
    {
        rx.R.a a1 = b.a.a();
        a1.a(new dP(this, a1));
    }
}
