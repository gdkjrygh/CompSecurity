// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import rx.Q;

// Referenced classes of package rx.internal.a:
//            j

final class l
    implements Q
{

    final j a;

    l(j j1)
    {
        a = j1;
        super();
    }

    public final void a(long l1)
    {
        j.a a1 = (j.a)a.c.get();
        if (a1 != null)
        {
            j.a.a(a1, l1);
        } else
        {
            Iterator iterator = a.b.b.iterator();
            while (iterator.hasNext()) 
            {
                j.a a2 = (j.a)iterator.next();
                if (!a2.isUnsubscribed())
                {
                    if (a.c.get() == a2)
                    {
                        j.a.a(a2, l1);
                        return;
                    }
                    j.a.a(a2, l1);
                }
            }
        }
    }
}
