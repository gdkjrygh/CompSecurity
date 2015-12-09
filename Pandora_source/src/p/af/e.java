// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.af;

import android.graphics.Bitmap;
import p.ab.c;
import p.q.g;
import p.s.k;

// Referenced classes of package p.af:
//            b

public class e
    implements g
{

    private final g a;
    private final p.t.c b;

    public e(g g1, p.t.c c1)
    {
        a = g1;
        b = c1;
    }

    public String a()
    {
        return a.a();
    }

    public k a(k k1, int i, int j)
    {
        b b1 = (b)k1.b();
        Object obj = new c(((b)k1.b()).b(), b);
        k k2 = a.a(((k) (obj)), i, j);
        if (!obj.equals(k2))
        {
            ((k) (obj)).d();
        }
        obj = (Bitmap)k2.b();
        b1.a(a, ((Bitmap) (obj)));
        return k1;
    }
}
