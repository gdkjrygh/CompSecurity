// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.g;

import rx.b.b;

final class j
    implements b
{

    final e.a a;

    j(e.a a1)
    {
        a = a1;
        super();
    }

    public final void call(Object obj)
    {
        n.b b1 = (n.b)obj;
        e.d.a a1 = (e.d.a)b1.g;
        obj = a1;
        if (a1 == null)
        {
            obj = a.a.a;
        }
        a.a(((e.d.a) (obj)), b1);
    }
}
