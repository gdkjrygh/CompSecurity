// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx;

import rx.b.f;

// Referenced classes of package rx:
//            b, i

final class h
    implements f
{

    final f a;
    final b b;

    h(b b1, f f1)
    {
        b = b1;
        a = f1;
        super();
    }

    public final Object call(Object obj)
    {
        obj = (b)obj;
        return (b)a.call(((b) (obj)).map(new i(this)));
    }
}
