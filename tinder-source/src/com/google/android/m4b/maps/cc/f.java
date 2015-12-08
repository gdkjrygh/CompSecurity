// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cc;

import com.google.android.m4b.maps.bi.b;
import com.google.android.m4b.maps.bi.c;
import com.google.android.m4b.maps.bm.d;
import com.google.android.m4b.maps.bo.aa;
import com.google.android.m4b.maps.bo.ac;
import com.google.android.m4b.maps.bo.ah;
import com.google.android.m4b.maps.bo.bg;
import com.google.android.m4b.maps.bo.m;
import com.google.android.m4b.maps.bx.ab;
import com.google.android.m4b.maps.bx.ai;
import com.google.android.m4b.maps.bx.i;
import com.google.android.m4b.maps.bx.n;
import java.util.Collection;
import java.util.List;
import javax.microedition.khronos.opengles.GL10;

// Referenced classes of package com.google.android.m4b.maps.cc:
//            q, o, r, h

public final class f
    implements q
{

    public final ac a;
    public List b;
    private final m c;
    private final ah d;
    private String e[];
    private String f[];
    private int g;
    private o h;
    private final float i[] = new float[4];
    private long j;
    private h k;

    private f(ac ac1, ah ah)
    {
        j = 0L;
        a = ac1;
        d = ah;
        c = ac1.d();
    }

    public static f a(aa aa1)
    {
        f f1 = new f(aa1.a(), aa1.b());
        if (aa1 instanceof bg)
        {
            aa1 = (bg)aa1;
            f1.h = o.a(((bg) (aa1)).a);
            f1.e = ((bg) (aa1)).b;
            f1.f = ((bg) (aa1)).c;
            f1.g = ((bg) (aa1)).e;
            f1.b = ((bg) (aa1)).d;
            return f1;
        } else
        {
            f1.e = new String[0];
            f1.f = new String[0];
            f1.g = -1;
            return f1;
        }
    }

    public final int a(b b1, i l)
    {
        byte byte0 = 0;
        boolean flag = ai.a;
        if (h != null)
        {
            byte0 = 2;
        }
        return byte0;
    }

    public final void a(d d1, b b1, ab ab1)
    {
        GL10 gl10;
        if (h == null && ab1.b == 1)
        {
            return;
        }
        gl10 = d1.a;
        gl10.glPushMatrix();
        if (b1.p != j)
        {
            j = b1.p;
            com.google.android.m4b.maps.bo.g g2 = c.c();
            com.google.android.m4b.maps.bo.g g1 = g2;
            if (!b1.c)
            {
                g1 = g2;
                if (b1.b.c == 0.0F)
                {
                    g1 = g2;
                    if (b1.b.d == 0.0F)
                    {
                        g1 = g2;
                        if (b1.b.b == (float)(int)b1.b.b)
                        {
                            b1.a(g2, d1.w);
                            g1 = b1.b(Math.round(d1.w[0]), Math.round(d1.w[1]));
                        }
                    }
                }
            }
            n.a(d1, b1, g1, c.f(), i);
        }
        n.a(gl10, i);
        if (ab1.b != 1) goto _L2; else goto _L1
_L1:
        h.a(d1, b1, ab1);
_L4:
        gl10.glPopMatrix();
        return;
_L2:
        if (ab1.b == 15)
        {
            r.a.a(d1, b1, ab1);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void a(com.google.android.m4b.maps.br.b b1)
    {
    }

    public final void a(Collection collection)
    {
        String as[] = e;
        int i1 = as.length;
        for (int l = 0; l < i1; l++)
        {
            collection.add(as[l]);
        }

    }

    public final void a(boolean flag)
    {
    }

    public final boolean a()
    {
        return true;
    }

    public final boolean a(com.google.android.m4b.maps.bx.f f1)
    {
        return false;
    }

    public final ac b()
    {
        return a;
    }

    public final void b(d d1)
    {
        if (h != null)
        {
            h.b(d1);
        }
        if (k != null)
        {
            k.b(d1);
            k = null;
        }
    }

    public final void b(d d1, b b1, ab ab1)
    {
        o.a(d1);
    }

    public final void b(Collection collection)
    {
        String as[] = f;
        int i1 = as.length;
        for (int l = 0; l < i1; l++)
        {
            collection.add(as[l]);
        }

    }

    public final void c(d d1)
    {
        if (h != null)
        {
            h.c(d1);
        }
        if (k != null)
        {
            k.c(d1);
            k = null;
        }
    }

    public final boolean c()
    {
        return false;
    }

    public final boolean d()
    {
        return false;
    }

    public final boolean e()
    {
        return h != null && h.c;
    }

    public final void f()
    {
        if (h != null)
        {
            h.c = false;
        }
    }

    public final int g()
    {
        return g;
    }

    public final int h()
    {
        if (h == null)
        {
            return 0;
        } else
        {
            return h.a();
        }
    }

    public final int i()
    {
        int l = 136;
        if (h != null)
        {
            l = h.b() + 136;
        }
        return l;
    }
}
