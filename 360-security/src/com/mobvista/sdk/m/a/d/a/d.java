// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobvista.sdk.m.a.d.a;

import android.graphics.Bitmap;
import android.os.Handler;
import com.mobvista.sdk.m.a.f.a;
import com.mobvista.sdk.m.a.f.j;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.LinkedList;

// Referenced classes of package com.mobvista.sdk.m.a.d.a:
//            e, f, l, g, 
//            i, h

public final class d
{

    private static d a;
    private l b;
    private LinkedHashMap c;
    private Handler d;

    protected d()
    {
        c = new LinkedHashMap();
        d = new e(this);
        b = new f(this, (int)Runtime.getRuntime().maxMemory() / 10);
    }

    private Bitmap a(String s)
    {
        return (Bitmap)b.a(s);
    }

    public static d a()
    {
        if (a == null)
        {
            a = new d();
        }
        return a;
    }

    private i a(String s, String s1, String s2, boolean flag)
    {
        g g1 = new g(this);
        s = new i(s, s1, s2);
        s.a(flag);
        s.a(g1);
        return s;
    }

    static LinkedHashMap a(d d1)
    {
        return d1.c;
    }

    private void a(String s, String s1, String s2, boolean flag, h h1)
    {
        if (j.a(s) || j.a(s1) || j.a(s2))
        {
            return;
        }
        File file = new File(s2);
        if (a(s1) != null)
        {
            h1.a(a(s1), s);
            return;
        }
        if (file.exists())
        {
            Bitmap bitmap = com.mobvista.sdk.m.a.f.a.a(s2);
            if (bitmap != null)
            {
                com.mobvista.sdk.m.a.b.a.a.b("ImageLoader", (new StringBuilder("url image [")).append(s1).append("] is downloaded, save by file [").append(s2).append("]").toString());
                a(s1, bitmap);
                h1.a(bitmap, s);
                return;
            } else
            {
                a(s, s1, s2, true, false, h1);
                return;
            }
        } else
        {
            a(s, s1, s2, false, false, h1);
            return;
        }
    }

    private void a(String s, String s1, String s2, boolean flag, boolean flag1, h h1)
    {
        if (!c.containsKey(s1))
        {
            LinkedList linkedlist = new LinkedList();
            linkedlist.add(h1);
            c.put(s1, linkedlist);
            s = a(s, s1, s2, flag);
            com.mobvista.sdk.m.a.e.a.a().d(s);
            return;
        }
        s = (LinkedList)c.get(s1);
        if (s != null && !s.contains(h1))
        {
            s.add(h1);
        }
        com.mobvista.sdk.m.a.b.a.a.b("ImageLoader", (new StringBuilder("loading:")).append(s1).toString());
    }

    static Handler b(d d1)
    {
        return d1.d;
    }

    public final void a(String s, Bitmap bitmap)
    {
        if (a(s) == null && bitmap != null)
        {
            b.b(s, bitmap);
        }
    }

    public final void a(String s, h h1)
    {
        a(s, s, com.mobvista.sdk.m.core.util.a.b(s), false, h1);
    }
}
