// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cache;

import android.graphics.Bitmap;
import com.android.volley.k;
import com.android.volley.r;
import com.android.volley.toolbox.m;
import com.android.volley.w;
import com.kik.g.as;
import java.util.ArrayList;
import java.util.Iterator;
import kik.android.util.bx;

// Referenced classes of package com.kik.cache:
//            au, aa, ab

public abstract class z extends m
    implements au
{

    public static final android.graphics.Bitmap.Config a;
    public static final com.android.volley.r.a d = new aa();
    public static final com.android.volley.r.b e = new ab();
    com.android.volley.r.b b;
    com.android.volley.r.a c;
    private ArrayList f;
    private boolean g;
    private String h;
    private Object i;

    public z(Object obj, String s, com.android.volley.r.b b1, int j, int k, android.graphics.Bitmap.Config config, com.android.volley.r.a a1)
    {
        if (b1 == null)
        {
            b1 = e;
        }
        if (a1 == null)
        {
            a1 = d;
        }
        super(s, b1, j, k, config, a1);
        f = new ArrayList();
        g = false;
        i = obj;
    }

    protected r a(k k)
    {
        if (!w())
        {
            throw new IllegalAccessError("Non-nework sublclasses must not call through the super.");
        } else
        {
            return super.a(k);
        }
    }

    public String a(int j, int k)
    {
        String s = d();
        return (new StringBuilder(s.length() + 12)).append("#W").append(j).append("#H").append(k).append(s).toString();
    }

    protected final void a(Bitmap bitmap)
    {
        Object obj = null;
        try
        {
            bitmap = b(bitmap);
        }
        // Misplaced declaration of an exception variable
        catch (Bitmap bitmap)
        {
            bx.a(bitmap);
            bitmap = obj;
        }
        super.a(bitmap);
        if (b != null)
        {
            b.a(bitmap);
        }
    }

    public final void a(as as1)
    {
        f.add(as1);
    }

    public final void a(String s)
    {
        if (s != null && s.equals("network-http-complete"))
        {
            g = true;
        }
        super.a(s);
    }

    public final void a_(String s)
    {
        h = s;
    }

    protected final Bitmap b(Bitmap bitmap)
    {
        Iterator iterator = f.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            as as1 = (as)iterator.next();
            if (as1 != null)
            {
                bitmap = (Bitmap)as1.a(bitmap);
            }
        } while (true);
        return bitmap;
    }

    public com.android.volley.b.a b(com.android.volley.b.a a1)
    {
        if (a1 == null)
        {
            a1 = new com.android.volley.b.a();
            a1.a = new byte[0];
            a1.e = System.currentTimeMillis() + 0x1d4c0L;
            a1.d = System.currentTimeMillis() + 0x1d4c0L;
            return a1;
        }
        if (!a1.a())
        {
            return null;
        } else
        {
            a1.e = System.currentTimeMillis() + 0x1d4c0L;
            a1.d = System.currentTimeMillis() + 0x1d4c0L;
            return a1;
        }
    }

    public final void b(w w1)
    {
        super.b(w1);
        if (c != null)
        {
            c.a(w1);
        }
    }

    protected final void b(Object obj)
    {
        a((Bitmap)obj);
    }

    public final String d()
    {
        if (h != null)
        {
            return h;
        } else
        {
            return super.d();
        }
    }

    public boolean e_()
    {
        return true;
    }

    public final String t()
    {
        return super.d();
    }

    public final boolean v()
    {
        return g;
    }

    public boolean w()
    {
        return true;
    }

    protected final Object x()
    {
        return i;
    }

    static 
    {
        a = android.graphics.Bitmap.Config.ARGB_8888;
    }
}
