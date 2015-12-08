// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx;

import rx.b.f;

// Referenced classes of package rx:
//            b, R

final class t
    implements f
{

    final f a;
    final R b;
    final b c;

    t(b b1, f f1, R r)
    {
        c = b1;
        a = f1;
        b = r;
        super();
    }

    public final Object call(Object obj)
    {
        obj = (b)obj;
        return ((b)a.call(obj)).observeOn(b);
    }
}
