// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.util;

import com.kik.g.p;
import com.kik.l.ab;
import java.util.HashSet;
import kik.a.d.a.a;

// Referenced classes of package kik.android.util:
//            bf, b, a

final class c extends bf
{

    final com.kik.cache.ad.c a;
    final b b;

    c(b b1, com.kik.cache.ad.c c1)
    {
        b = b1;
        a = c1;
        super();
    }

    protected final Object doInBackground(Object aobj[])
    {
        kik.android.util.a.a(b.d).a(a.b(), b.a);
        b.b.a(null);
        if (b.c != null)
        {
            kik.android.util.a.b(b.d).remove(b.c.o());
        }
        return null;
    }
}
