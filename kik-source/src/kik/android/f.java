// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kik.a.f.f.s;

// Referenced classes of package kik.android:
//            a, h

final class f
    implements Runnable
{

    final boolean a;
    final a b;

    f(a a1, boolean flag)
    {
        b = a1;
        a = flag;
        super();
    }

    public final void run()
    {
label0:
        {
            synchronized (kik.android.a.l(b))
            {
                if (kik.android.a.m(b) != null)
                {
                    break label0;
                }
            }
            return;
        }
        for (obj1 = new ArrayList(); kik.android.a.m(b).hasNext() && ((List) (obj1)).size() < 100; ((List) (obj1)).add(kik.android.a.m(b).next())) { }
        break MISSING_BLOCK_LABEL_84;
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        if (kik.android.a.m(b).hasNext())
        {
            break MISSING_BLOCK_LABEL_177;
        }
        kik.android.a.n(b);
        if (((List) (obj1)).size() > 0)
        {
            break MISSING_BLOCK_LABEL_177;
        }
        if (kik.android.a.o(b))
        {
            kik.android.a.p(b).a();
            obj1 = new s(kik.android.a.q(b), kik.android.a.c(b), a, a);
            kik.android.a.b(b, ((s) (obj1)));
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        s s1 = new s(kik.android.a.q(b), kik.android.a.c(b), a, a);
        s1.a(((List) (obj1)));
        kik.android.a.p(b).a();
        kik.android.a.b(b, s1);
        obj;
        JVM INSTR monitorexit ;
    }
}
