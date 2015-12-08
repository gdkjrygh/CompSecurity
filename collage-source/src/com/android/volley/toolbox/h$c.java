// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley.toolbox;

import android.graphics.Bitmap;
import java.util.HashMap;
import java.util.LinkedList;

// Referenced classes of package com.android.volley.toolbox:
//            h

public class c
{

    final h a;
    private Bitmap b;
    private final e c;
    private final String d;
    private final String e;

    static Bitmap a(c c1, Bitmap bitmap)
    {
        c1.b = bitmap;
        return bitmap;
    }

    static b a(b b1)
    {
        return b1.c;
    }

    public void a()
    {
        if (c != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        c c1 = (c)h.a(a).get(d);
        if (c1 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (c1.b(this))
        {
            h.a(a).remove(d);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        c c2 = (d)h.b(a).get(d);
        if (c2 != null)
        {
            c2.b(this);
            if (a(c2).size() == 0)
            {
                h.b(a).remove(d);
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

    public (h h1, Bitmap bitmap, String s, String s1,  )
    {
        a = h1;
        super();
        b = bitmap;
        e = s;
        d = s1;
        c = ;
    }
}
