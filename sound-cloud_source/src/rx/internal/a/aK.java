// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import rx.X;
import rx.b.f;
import rx.internal.util.q;

// Referenced classes of package rx.internal.a:
//            aL

public final class aK
    implements rx.b.g
{
    private static final class a
    {

        public static final aK a = new aK(q.b());

    }


    final f a;

    public aK(f f)
    {
        a = f;
    }

    public final Object call(Object obj)
    {
        obj = (X)obj;
        return new aL(this, ((X) (obj)), ((X) (obj)));
    }
}
