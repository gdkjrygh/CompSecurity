// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley.toolbox;

import android.graphics.Bitmap;
import com.android.volley.n;
import com.android.volley.w;
import java.util.LinkedList;

// Referenced classes of package com.android.volley.toolbox:
//            i

protected final class e
{

    final i a;
    private final n b;
    private Bitmap c;
    private w d;
    private final LinkedList e = new LinkedList();

    static Bitmap a(e e1, Bitmap bitmap)
    {
        e1.c = bitmap;
        return bitmap;
    }

    static LinkedList a(c c1)
    {
        return c1.e;
    }

    static Bitmap b(e e1)
    {
        return e1.c;
    }

    public final w a()
    {
        return d;
    }

    public final void a(d d1)
    {
        e.add(d1);
    }

    public final void a(w w)
    {
        d = w;
    }

    public final boolean b(d d1)
    {
        e.remove(d1);
        if (e.size() == 0)
        {
            b.g();
            return true;
        } else
        {
            return false;
        }
    }

    public (i j, n n1,  )
    {
        a = j;
        super();
        b = n1;
        e.add();
    }
}
