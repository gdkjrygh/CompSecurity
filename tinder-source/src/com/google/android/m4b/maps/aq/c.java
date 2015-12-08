// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aq;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.m4b.maps.aa.ax;
import com.google.android.m4b.maps.ay.b;
import com.google.android.m4b.maps.bx.ah;
import com.google.android.m4b.maps.bx.ak;
import com.google.android.m4b.maps.bx.w;
import com.google.android.m4b.maps.bx.x;
import com.google.android.m4b.maps.cc.m;
import com.google.android.m4b.maps.cg.aa;
import com.google.android.m4b.maps.cg.ac;
import com.google.android.m4b.maps.df.v;
import com.google.android.m4b.maps.model.RuntimeRemoteException;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.android.m4b.maps.aq:
//            v, d, u

public final class c
    implements com.google.android.m4b.maps.bx.ah.a, com.google.android.m4b.maps.bx.ak.a, com.google.android.m4b.maps.bx.w.a, com.google.android.m4b.maps.cg.ac.a
{

    final com.google.android.m4b.maps.aq.v a;
    final ak b;
    private final Map c = ax.b();
    private final u d;
    private final ah e;
    private final b f;

    private c(com.google.android.m4b.maps.aq.v v1, u u1, ak ak1, ah ah1, b b1)
    {
        a = v1;
        d = u1;
        b = ak1;
        e = ah1;
        f = b1;
        b.d = this;
        b.b = this;
        ah1.a(this);
    }

    public static c a(com.google.android.m4b.maps.aq.v v1, u u1, b b1)
    {
        return new c(v1, u1, v1.a(com.google.android.m4b.maps.bx.r.a.o), v1.c(), b1);
    }

    private aa c(com.google.android.m4b.maps.bx.v v1)
    {
        v1 = d(v1);
        if (v1 == null)
        {
            return null;
        } else
        {
            v1 = ((m) (v1)).g;
            f.a();
            return (aa)c.get(v1);
        }
    }

    private static m d(com.google.android.m4b.maps.bx.v v1)
    {
        if (!(v1 instanceof m))
        {
            return null;
        } else
        {
            return (m)v1;
        }
    }

    public final com.google.android.m4b.maps.cg.aa.a a(aa aa1)
    {
        return new d(aa1, this);
    }

    protected final void a()
    {
        a.b();
    }

    protected final void a(d d1)
    {
        b.a(d1.a);
        d1 = d1.b;
        c.put(d1.a(), d1);
        a();
    }

    public final void a(com.google.android.m4b.maps.bx.v v1)
    {
        aa aa1;
        f.a();
        aa1 = c(v1);
        break MISSING_BLOCK_LABEL_13;
        if (aa1 != null && !aa1.a.b(aa1))
        {
            Object obj = d(v1);
            if (obj != null)
            {
                v1 = d;
                obj = ((m) (obj)).f();
                com.google.android.m4b.maps.bi.b b1 = ((u) (v1)).d.p();
                v1.a(new com.google.android.m4b.maps.bi.c(((com.google.android.m4b.maps.bo.g) (obj)), b1.b.b, b1.b.c, b1.b.d, 0.0F), 300);
                return;
            }
        }
        return;
    }

    public final void a(m m1)
    {
        c.remove(m1.g);
        b.b(m1);
    }

    public final void b(d d1)
    {
        if (!b())
        {
            ViewTreeObserver viewtreeobserver = a.d().getViewTreeObserver();
            if (viewtreeobserver.isAlive())
            {
                viewtreeobserver.addOnGlobalLayoutListener(new android.view.ViewTreeObserver.OnGlobalLayoutListener(d1) {

                    private d a;
                    private c b;

                    public final void onGlobalLayout()
                    {
                        ViewTreeObserver viewtreeobserver1;
label0:
                        {
                            if (b.b())
                            {
                                b.b(a);
                                viewtreeobserver1 = b.a.d().getViewTreeObserver();
                                if (android.os.Build.VERSION.SDK_INT >= 16)
                                {
                                    break label0;
                                }
                                viewtreeobserver1.removeGlobalOnLayoutListener(this);
                            }
                            return;
                        }
                        viewtreeobserver1.removeOnGlobalLayoutListener(this);
                    }

            
            {
                b = c.this;
                a = d1;
                super();
            }
                });
            }
        }
        m m1 = d1.a;
        aa aa1 = d1.b;
        if (m1.a())
        {
            try
            {
                d1 = aa1.a.k.a(d1.b, a.getWidth(), a.getHeight());
            }
            // Misplaced declaration of an exception variable
            catch (d d1)
            {
                d1.printStackTrace();
                d1 = null;
            }
            if (d1 != null)
            {
                a.a(m1, new x(d1));
                return;
            }
        }
    }

    public final void b(com.google.android.m4b.maps.bx.v v1)
    {
        f.a();
        v1 = c(v1);
        if (v1 != null)
        {
            ((aa) (v1)).a.c(v1);
        }
    }

    final boolean b()
    {
        return a.getWidth() != 0 || a.getHeight() != 0;
    }

    protected final boolean b(m m1)
    {
        boolean flag;
        synchronized (e)
        {
            flag = m1.i;
        }
        return flag;
        m1;
        ah1;
        JVM INSTR monitorexit ;
        throw m1;
    }

    public final List c()
    {
        return b.j();
    }

    public final void c(d d1)
    {
        m m1 = d1.a;
        if (!m1.a())
        {
            return;
        }
        synchronized (e)
        {
            if (m1.i)
            {
                a.o();
            }
        }
        return;
        exception;
        d1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void c(m m1)
    {
        ac ac1;
        f.a();
        m1 = c(((com.google.android.m4b.maps.bx.v) (m1)));
        if (m1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        ac1 = ((aa) (m1)).a;
        if (ac1.i == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        ((com.google.android.m4b.maps.cg.aa.a)ac1.c.get(m1)).e();
        ac1.i.a(m1);
        return;
        m1;
        throw new RuntimeRemoteException(m1);
    }

    public final void d(m m1)
    {
        ac ac1;
        f.a();
        m1 = c(m1);
        if (m1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        ac1 = ((aa) (m1)).a;
        if (ac1.i == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        ((com.google.android.m4b.maps.cg.aa.a)ac1.c.get(m1)).e();
        ac1.i.c(m1);
        return;
        m1;
        throw new RuntimeRemoteException(m1);
    }

    public final void e(m m1)
    {
        ac ac1;
        f.a();
        m1 = c(m1);
        if (m1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        ac1 = ((aa) (m1)).a;
        if (ac1.i == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        ((com.google.android.m4b.maps.cg.aa.a)ac1.c.get(m1)).e();
        ac1.i.b(m1);
        return;
        m1;
        throw new RuntimeRemoteException(m1);
    }
}
