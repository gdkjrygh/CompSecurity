// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import java.util.ArrayList;
import java.util.HashMap;
import rx.X;
import rx.b.e;
import rx.b.f;

// Referenced classes of package rx.internal.a:
//            dG

public final class dF
    implements rx.b.g
{
    public static final class a
        implements f
    {

        public final Object call(Object obj)
        {
            return new ArrayList();
        }

        public a()
        {
        }
    }

    public static final class b
        implements e
    {

        public final Object call()
        {
            return new HashMap();
        }

        public b()
        {
        }
    }


    final f a;
    final f b;
    final e c;
    final f d;

    public dF(f f, f f1)
    {
        this(f, f1, ((e) (new b())), ((f) (new a())));
    }

    public dF(f f, f f1, e e)
    {
        this(f, f1, e, ((f) (new a())));
    }

    public dF(f f, f f1, e e, f f2)
    {
        a = f;
        b = f1;
        c = e;
        d = f2;
    }

    public final Object call(Object obj)
    {
        obj = (X)obj;
        return new dG(this, ((X) (obj)), ((X) (obj)));
    }
}
