// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.leak;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import com.qihoo.security.SecurityApplication;
import com.qihoo.security.locale.d;

// Referenced classes of package com.qihoo.security.leak:
//            d, e

public abstract class c
{

    final Context a;
    final com.qihoo.security.leak.d b;
    public d c;
    long d;
    private boolean e;

    c()
    {
        c = com.qihoo.security.locale.d.a();
        e = true;
        d = 0L;
        a = null;
        b = null;
    }

    c(com.qihoo.security.leak.d d1)
    {
        c = com.qihoo.security.locale.d.a();
        e = true;
        d = 0L;
        b = d1;
        a = SecurityApplication.a();
        d = b.b().a(m(), 0L);
    }

    public abstract String a();

    final void a(long l1, long l2)
    {
        long l3 = d;
        d = d & (-1L ^ l2) | l1 & l2;
        if ((l3 ^ d) != 0L)
        {
            b.b().b(m(), d);
        }
    }

    void a(boolean flag)
    {
        long l1;
        if (flag)
        {
            l1 = 1L;
        } else
        {
            l1 = 0L;
        }
        a(l1, 1L);
    }

    final boolean b(long l1, long l2)
    {
        return (d & l2) == l1;
    }

    public boolean c()
    {
        return b(1L, 1L);
    }

    public abstract Drawable d();

    abstract int e();

    public boolean f()
    {
        a(true);
        return true;
    }

    public String g()
    {
        return c.b(e())[0];
    }

    public String h()
    {
        return c.b(e())[1];
    }

    public String i()
    {
        return c.b(e())[2];
    }

    public String j()
    {
        return c.b(e())[3];
    }

    public String k()
    {
        return c.b(e())[4];
    }

    public String l()
    {
        return c.b(e())[5];
    }

    String m()
    {
        return a();
    }

    boolean n()
    {
        if ("Xiaomi".equalsIgnoreCase(Build.BRAND))
        {
            String as[] = new String[9];
            as[0] = "MI-ONE Plus";
            as[1] = "MI-ONE C1";
            as[2] = "MI 1S";
            as[3] = "MI 1SC";
            as[4] = "MI 2";
            as[5] = "MI 2C";
            as[6] = "MI 2S";
            as[7] = "MI 2SC";
            as[8] = "MI 2A";
            int j1 = as.length;
            int i1 = 0;
            while (i1 < j1) 
            {
                if (as[i1].equalsIgnoreCase(Build.MODEL))
                {
                    return true;
                }
                i1++;
            }
        }
        return false;
    }

    boolean o()
    {
        return "E30".equals(Build.MODEL) && "8x25q".equals(Build.BOARD);
    }

    public String toString()
    {
        return super.toString();
    }
}
