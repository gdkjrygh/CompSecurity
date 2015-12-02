// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.i;

import android.os.Handler;
import com.facebook.common.time.a;
import com.facebook.common.v.f;
import com.facebook.common.v.j;
import java.util.LinkedList;

// Referenced classes of package com.facebook.common.i:
//            c, d, a

public class b
{

    private final LinkedList a = new LinkedList();
    private final Handler b = new Handler(new c(this));
    private final a c;
    private final j d;
    private long e;
    private long f;
    private boolean g;
    private boolean h;
    private boolean i;

    public b(a a1, f f1)
    {
        e = 4L;
        f = 17L;
        g = false;
        h = false;
        i = false;
        c = a1;
        if (f1 != null)
        {
            d = new d(this);
            f1.a(d);
            return;
        } else
        {
            d = null;
            return;
        }
    }

    private void a()
    {
        if (!h || i)
        {
            long l = c.a();
            h = false;
            long l1 = c.a() + e;
            while (!a.isEmpty()) 
            {
                long l2 = c.a();
                if (l2 >= l1)
                {
                    a(Math.max((l + f) - l2, 0L));
                    return;
                }
                g = true;
                com.facebook.common.i.a a1 = (com.facebook.common.i.a)a.getFirst();
                a(a1, l1);
                if (a1.c())
                {
                    a.removeFirst();
                }
                g = false;
            }
        }
    }

    private void a(long l)
    {
        if (!b.hasMessages(0) && !a.isEmpty())
        {
            b.sendEmptyMessageDelayed(0, l);
        }
    }

    static void a(b b1)
    {
        b1.a();
    }

    static void a(b b1, long l)
    {
        b1.a(l);
    }

    private boolean a(com.facebook.common.i.a a1, long l)
    {
        while (!a1.c()) 
        {
            c.a();
            if (c.a() >= l)
            {
                return true;
            }
            LinkedList linkedlist = a1.d();
            if (linkedlist != null && !linkedlist.isEmpty())
            {
                for (com.facebook.common.i.a a2 = (com.facebook.common.i.a)linkedlist.getFirst(); a(a2, l);)
                {
                    if (c.a() >= l)
                    {
                        return true;
                    }
                }

                linkedlist.removeFirst();
            } else
            {
                a1.a();
            }
            c.a();
        }
        return false;
    }

    static boolean a(b b1, boolean flag)
    {
        b1.h = flag;
        return flag;
    }

    static boolean b(b b1)
    {
        return b1.h;
    }

    static boolean c(b b1)
    {
        return b1.i;
    }
}
