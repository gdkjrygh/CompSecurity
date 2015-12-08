// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import rx.X;
import rx.h.b;

// Referenced classes of package rx.internal.a:
//            ei

private final class c extends X
{

    final X a;
    final f b;
    final f c;
    boolean d;
    final ei e;

    public final void onCompleted()
    {
        if (!d)
        {
            a.onCompleted();
        }
    }

    public final void onError(Throwable throwable)
    {
        a.onError(throwable);
    }

    public final void onNext(Object obj)
    {
        boolean flag = false;
        obj = (rx.b[])obj;
        if (obj == null || obj.length == 0)
        {
            a.onCompleted();
        } else
        {
            d = true;
              = b;
             1 = c;
            .f = new Object[obj.length];
            .g = 1;
            int i = 0;
            int j;
            do
            {
                j = ((flag) ? 1 : 0);
                if (i >= obj.length)
                {
                    break;
                }
                a a1 = new a();
                .f[i] = a1;
                .a.a(a1);
                i++;
            } while (true);
            while (j < obj.length) 
            {
                obj[j].unsafeSubscribe((a).f[j]);
                j++;
            }
        }
    }

    public (ei ei1, X x,  ,  1)
    {
        e = ei1;
        super(x);
        d = false;
        a = x;
        b = ;
        c = 1;
    }
}
