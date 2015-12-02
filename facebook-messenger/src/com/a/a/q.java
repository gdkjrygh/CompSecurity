// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a;

import android.view.View;
import com.a.b.c;
import com.a.c.a.a;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.a.a:
//            ak, r, ag, a

public final class q extends ak
{

    private static final Map h;
    private Object i;
    private String j;
    private c k;

    public q()
    {
    }

    private q(Object obj, String s)
    {
        i = obj;
        a(s);
    }

    public static transient q a(Object obj, String s, float af[])
    {
        obj = new q(obj, s);
        ((q) (obj)).a(af);
        return ((q) (obj));
    }

    public com.a.a.a a(long l)
    {
        return b(l);
    }

    public void a()
    {
        super.a();
    }

    void a(float f)
    {
        super.a(f);
        int i1 = this.f.length;
        for (int l = 0; l < i1; l++)
        {
            this.f[l].b(i);
        }

    }

    public void a(c c1)
    {
        if (f != null)
        {
            ag ag1 = f[0];
            String s = ag1.c();
            ag1.a(c1);
            g.remove(s);
            g.put(j, ag1);
        }
        if (k != null)
        {
            j = c1.a();
        }
        k = c1;
        e = false;
    }

    public void a(Object obj)
    {
label0:
        {
            if (i != obj)
            {
                Object obj1 = i;
                i = obj;
                if (obj1 == null || obj == null || obj1.getClass() != obj.getClass())
                {
                    break label0;
                }
            }
            return;
        }
        e = false;
    }

    public void a(String s)
    {
        if (f != null)
        {
            ag ag1 = f[0];
            String s1 = ag1.c();
            ag1.a(s);
            g.remove(s1);
            g.put(s, ag1);
        }
        j = s;
        e = false;
    }

    public transient void a(float af[])
    {
        if (f == null || f.length == 0)
        {
            if (k != null)
            {
                a(new ag[] {
                    com.a.a.ag.a(k, af)
                });
                return;
            } else
            {
                a(new ag[] {
                    com.a.a.ag.a(j, af)
                });
                return;
            }
        } else
        {
            super.a(af);
            return;
        }
    }

    public q b(long l)
    {
        super.c(l);
        return this;
    }

    public ak c(long l)
    {
        return b(l);
    }

    public Object clone()
    {
        return i();
    }

    public com.a.a.a g()
    {
        return i();
    }

    void h()
    {
        if (!e)
        {
            if (k == null && a.a && (i instanceof View) && h.containsKey(j))
            {
                a((c)h.get(j));
            }
            int i1 = f.length;
            for (int l = 0; l < i1; l++)
            {
                f[l].a(i);
            }

            super.h();
        }
    }

    public q i()
    {
        return (q)super.j();
    }

    public ak j()
    {
        return i();
    }

    public String toString()
    {
        String s = (new StringBuilder()).append("ObjectAnimator@").append(Integer.toHexString(hashCode())).append(", target ").append(i).toString();
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
        h = new HashMap();
        h.put("alpha", com.a.a.r.a);
        h.put("pivotX", r.b);
        h.put("pivotY", com.a.a.r.c);
        h.put("translationX", r.d);
        h.put("translationY", r.e);
        h.put("rotation", r.f);
        h.put("rotationX", r.g);
        h.put("rotationY", r.h);
        h.put("scaleX", r.i);
        h.put("scaleY", r.j);
        h.put("scrollX", r.k);
        h.put("scrollY", r.l);
        h.put("x", r.m);
        h.put("y", r.n);
    }
}
