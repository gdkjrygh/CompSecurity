// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import rx.b.a;

// Referenced classes of package rx.internal.a:
//            ea

final class eb
    implements a
{

    final ea a;
    final ea.b b;

    eb(ea.b b1, ea ea)
    {
        b = b1;
        a = ea;
        super();
    }

    public final void call()
    {
        if (b.f.a == null)
        {
            b.unsubscribe();
        }
    }
}
