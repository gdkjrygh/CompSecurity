// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley.toolbox;

import android.graphics.Bitmap;
import com.android.volley.k;
import com.android.volley.r;
import java.util.LinkedList;

// Referenced classes of package com.android.volley.toolbox:
//            h

private class e
{

    final h a;
    private final k b;
    private Bitmap c;
    private r d;
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

    public r a()
    {
        return d;
    }

    public void a(r r)
    {
        d = r;
    }

    public void a(d d1)
    {
        e.add(d1);
    }

    public boolean b(e e1)
    {
        e.remove(e1);
        if (e.size() == 0)
        {
            b.i();
            return true;
        } else
        {
            return false;
        }
    }

    public (h h1, k k1,  )
    {
        a = h1;
        super();
        b = k1;
        e.add();
    }
}
