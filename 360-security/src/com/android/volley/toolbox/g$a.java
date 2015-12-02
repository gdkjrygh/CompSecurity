// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley.toolbox;

import android.graphics.Bitmap;
import com.android.volley.Request;
import com.android.volley.VolleyError;
import java.util.LinkedList;

// Referenced classes of package com.android.volley.toolbox:
//            g

private class e
{

    final g a;
    private final Request b;
    private Bitmap c;
    private VolleyError d;
    private final LinkedList e = new LinkedList();

    static LinkedList a(e e1)
    {
        return e1.e;
    }

    static void a(e e1, Bitmap bitmap)
    {
        e1.c = bitmap;
    }

    static Bitmap b(c c1)
    {
        return c1.c;
    }

    public VolleyError a()
    {
        return d;
    }

    public void a(VolleyError volleyerror)
    {
        d = volleyerror;
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
            b.g();
            return true;
        } else
        {
            return false;
        }
    }

    public (g g1, Request request,  )
    {
        a = g1;
        super();
        b = request;
        e.add();
    }
}
