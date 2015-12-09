// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a;

import android.view.View;
import com.b.b.c;
import com.b.c.a.a;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.b.a:
//            ab, j, y, a

public final class i extends ab
{

    private static final Map h;
    private Object i;
    private String j;
    private c k;

    public i()
    {
    }

    private i(Object obj, String s)
    {
        i = obj;
        if (f != null)
        {
            obj = f[0];
            String s1 = ((y) (obj)).a;
            obj.a = s;
            g.remove(s1);
            g.put(s, obj);
        }
        j = s;
        e = false;
    }

    public static transient i a(Object obj, String s, int ai[])
    {
        obj = new i(obj, s);
        ((i) (obj)).a(ai);
        return ((i) (obj));
    }

    public final volatile ab a(long l)
    {
        super.a(l);
        return this;
    }

    public final void a()
    {
        super.a();
    }

    final void a(float f)
    {
        super.a(f);
        int i1 = this.f.length;
        for (int l = 0; l < i1; l++)
        {
            this.f[l].b(i);
        }

    }

    public final transient void a(int ai[])
    {
        if (f == null || f.length == 0)
        {
            if (k != null)
            {
                a(new y[] {
                    com.b.a.y.a(k, ai)
                });
                return;
            } else
            {
                a(new y[] {
                    com.b.a.y.a(j, ai)
                });
                return;
            }
        } else
        {
            super.a(ai);
            return;
        }
    }

    public final com.b.a.a b()
    {
        return (i)super.d();
    }

    final void c()
    {
        if (!e)
        {
            if (k == null && a.a && (i instanceof View) && h.containsKey(j))
            {
                c c1 = (c)h.get(j);
                if (f != null)
                {
                    y y1 = f[0];
                    String s = y1.a;
                    y1.a(c1);
                    g.remove(s);
                    g.put(j, y1);
                }
                if (k != null)
                {
                    j = c1.a();
                }
                k = c1;
                e = false;
            }
            int i1 = f.length;
            for (int l = 0; l < i1; l++)
            {
                f[l].a(i);
            }

            super.c();
        }
    }

    public final Object clone()
    {
        return (i)super.d();
    }

    public final volatile ab d()
    {
        return (i)super.d();
    }

    public final String toString()
    {
        String s = (new StringBuilder("ObjectAnimator@")).append(Integer.toHexString(hashCode())).append(", target ").append(i).toString();
        String s1 = s;
        if (f != null)
        {
            int l = 0;
            do
            {
                s1 = s;
                if (l >= f.length)
                {
                    break;
                }
                s = (new StringBuilder()).append(s).append("\n    ").append(f[l].toString()).toString();
                l++;
            } while (true);
        }
        return s1;
    }

    static 
    {
        HashMap hashmap = new HashMap();
        h = hashmap;
        hashmap.put("alpha", com.b.a.j.a);
        h.put("pivotX", j.b);
        h.put("pivotY", com.b.a.j.c);
        h.put("translationX", j.d);
        h.put("translationY", j.e);
        h.put("rotation", j.f);
        h.put("rotationX", j.g);
        h.put("rotationY", j.h);
        h.put("scaleX", j.i);
        h.put("scaleY", j.j);
        h.put("scrollX", j.k);
        h.put("scrollY", j.l);
        h.put("x", j.m);
        h.put("y", j.n);
    }
}
