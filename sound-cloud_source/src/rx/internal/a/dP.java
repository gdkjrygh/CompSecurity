// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import rx.X;
import rx.b.a;

// Referenced classes of package rx.internal.a:
//            dO

final class dP
    implements a
{

    final rx.R.a a;
    final dO b;

    dP(dO do1, rx.R.a a1)
    {
        b = do1;
        a = a1;
        super();
    }

    public final void call()
    {
        b.a.unsubscribe();
        a.unsubscribe();
    }
}
