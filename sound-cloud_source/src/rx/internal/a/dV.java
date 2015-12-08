// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import rx.b.a;

final class dV
    implements a
{

    final dS.c a;

    dV(dS.c c)
    {
        a = c;
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
