// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley.toolbox;

import android.graphics.Bitmap;
import java.util.LinkedList;
import p.k.l;
import p.k.s;

// Referenced classes of package com.android.volley.toolbox:
//            h

private class e
{

    final h a;
    private final l b;
    private Bitmap c;
    private s d;
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

    public s a()
    {
        return d;
    }

    public void a(d d1)
    {
        e.add(d1);
    }

    public void a(s s)
    {
        d = s;
    }

    public boolean b(d d1)
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

    public (h h1, l l1,  )
    {
        a = h1;
        super();
        b = l1;
        e.add();
    }
}
