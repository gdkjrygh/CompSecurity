// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import rx.b.a;

final class dT
    implements a
{

    final dS.b a;

    dT(dS.b b)
    {
        a = b;
        super();
    }

    public final void call()
    {
        if (a.d)
        {
            a.unsubscribe();
        }
    }
}
