// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley.toolbox;

import android.graphics.Bitmap;
import java.util.HashMap;
import java.util.LinkedList;

// Referenced classes of package com.android.volley.toolbox:
//            g

public class c
{

    final g a;
    private Bitmap b;
    private final e c;
    private final String d;
    private final String e;

    static c a(c c1)
    {
        return c1.c;
    }

    static void a(c c1, Bitmap bitmap)
    {
        c1.b = bitmap;
    }

    public void a()
    {
        if (c != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        b b1 = (c)g.a(a).get(d);
        if (b1 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (b1.b(this))
        {
            g.a(a).remove(d);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        b b2 = (d)g.b(a).get(d);
        if (b2 != null)
        {
            b2.b(this);
            if (a(b2).size() == 0)
            {
                g.b(a).remove(d);
                return;
            }
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public Bitmap b()
    {
        return b;
    }

    public String c()
    {
        return e;
    }

    public (g g1, Bitmap bitmap, String s, String s1,  )
    {
        a = g1;
        super();
        b = bitmap;
        e = s;
        d = s1;
        c = ;
    }
}
