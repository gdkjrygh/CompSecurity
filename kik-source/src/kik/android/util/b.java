// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.util;

import com.android.volley.w;
import com.kik.g.p;
import java.util.HashSet;
import kik.a.d.a.a;

// Referenced classes of package kik.android.util:
//            a, c, bf

final class b
    implements com.kik.cache.ad.d
{

    final String a;
    final p b;
    final a c;
    final kik.android.util.a d;

    b(kik.android.util.a a1, String s, p p1, a a2)
    {
        d = a1;
        a = s;
        b = p1;
        c = a2;
        super();
    }

    public final void a(w w)
    {
        b.a(null);
        if (c != null)
        {
            kik.android.util.a.b(d).remove(c.o());
        }
    }

    public final void a(com.kik.cache.ad.c c1, boolean flag)
    {
        if (c1 == null)
        {
            break MISSING_BLOCK_LABEL_28;
        }
        if (c1.b() != null)
        {
            (new c(this, c1)).a(new Void[0]);
        }
        return;
        c1;
        b.a(c1);
        return;
    }
}
