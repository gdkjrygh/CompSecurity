// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import rx.Y;
import rx.b;
import rx.b.e;
import rx.exceptions.Exceptions;
import rx.h.f;

// Referenced classes of package rx.internal.a:
//            dy

final class dx
    implements dv.a
{

    final e a;

    dx(e e1)
    {
        a = e1;
        super();
    }

    private Y a(dv.c c, Long long1)
    {
        if (a != null)
        {
            b b1;
            try
            {
                b1 = (b)a.call();
            }
            // Misplaced declaration of an exception variable
            catch (Long long1)
            {
                Exceptions.throwIfFatal(long1);
                c.onError(long1);
                return f.b();
            }
            return b1.unsafeSubscribe(new dy(this, c, long1));
        } else
        {
            return f.b();
        }
    }

    public final Object call(Object obj, Object obj1, Object obj2)
    {
        return a((dv.c)obj, (Long)obj1);
    }
}
