// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.g;

import rx.b.b;

final class h
    implements b
{

    final e.g a;

    h(e.g g)
    {
        a = g;
        super();
    }

    public final void call(Object obj)
    {
        n.b b1 = (n.b)obj;
        Integer integer = (Integer)b1.g;
        obj = integer;
        if (integer == null)
        {
            obj = Integer.valueOf(0);
        }
        a.a(((Integer) (obj)), b1);
    }
}
