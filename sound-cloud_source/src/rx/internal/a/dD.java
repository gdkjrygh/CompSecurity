// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import java.util.HashMap;
import rx.X;
import rx.b.e;
import rx.b.f;

// Referenced classes of package rx.internal.a:
//            dE

public final class dD
    implements rx.b.g
{
    public static final class a
        implements e
    {

        public final Object call()
        {
            return new HashMap();
        }

        public a()
        {
        }
    }


    final f a;
    final f b;
    final e c;

    public dD(f f, f f1)
    {
        this(f, f1, ((e) (new a())));
    }

    public dD(f f, f f1, e e)
    {
        a = f;
        b = f1;
        c = e;
    }

    public final Object call(Object obj)
    {
        obj = (X)obj;
        return new dE(this, ((X) (obj)), ((X) (obj)));
    }
}
