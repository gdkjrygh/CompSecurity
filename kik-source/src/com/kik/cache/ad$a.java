// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cache;

import android.graphics.Bitmap;
import com.android.volley.n;
import com.android.volley.w;
import java.util.LinkedList;

// Referenced classes of package com.kik.cache:
//            ad

private final class t.add
{

    final ad a;
    private final n b;
    private Bitmap c;
    private w d;
    private final LinkedList e = new LinkedList();

    static Bitmap a(tmap tmap, Bitmap bitmap)
    {
        tmap.c = bitmap;
        return bitmap;
    }

    static n a(c c1)
    {
        return c1.b;
    }

    static LinkedList b(b b1)
    {
        return b1.e;
    }

    static Bitmap c(e e1)
    {
        return e1.c;
    }

    public final w a()
    {
        return d;
    }

    public final void a(w w)
    {
        d = w;
    }

    public final void a(d d1)
    {
        e.add(d1);
    }

    public final boolean b(t.add add)
    {
        e.remove(add);
        if (e.size() == 0)
        {
            b.g();
            return true;
        } else
        {
            return false;
        }
    }

    public n(ad ad1, n n1, n n2)
    {
        a = ad1;
        super();
        b = n1;
        e.add(n2);
    }
}
