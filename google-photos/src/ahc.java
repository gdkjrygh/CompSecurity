// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Vector;
import javax.microedition.khronos.egl.EGLContext;

abstract class ahc
{

    public int a;
    public int b;
    public int c;
    public int d;
    public ahj e;
    public Vector f;
    private HashMap g;
    private HashMap h;
    private HashMap i;

    private ahc(ahb ahb)
    {
        g = new HashMap();
        h = new HashMap();
        i = new HashMap();
        f = new Vector();
    }

    ahc(ahb ahb, byte byte0)
    {
        this(ahb);
    }

    protected final Set a(EGLContext eglcontext)
    {
        Set set = (Set)i.get(eglcontext);
        Object obj = set;
        if (set == null)
        {
            obj = new HashSet();
            i.put(eglcontext, obj);
        }
        return ((Set) (obj));
    }

    public abstract void a();

    public abstract void a(ahv ahv, int j);

    public final void a(aka aka)
    {
        EGLContext eglcontext = ajv.e();
        a(eglcontext).add(aka);
        f.add(aka);
        b(eglcontext);
    }

    public abstract void b();

    public final void b(aka aka)
    {
        EGLContext eglcontext = ajv.e();
        Set set = a(eglcontext);
        set.remove(aka);
        if (set.isEmpty())
        {
            c(eglcontext);
        }
        f.remove(aka);
    }

    protected void b(EGLContext eglcontext)
    {
    }

    public abstract void c();

    protected void c(EGLContext eglcontext)
    {
        ajz ajz1 = (ajz)h.get(eglcontext);
        ajl ajl1 = (ajl)g.get(eglcontext);
        if (ajz1 != null)
        {
            ajz1.e();
            h.remove(eglcontext);
        }
        if (ajl1 != null)
        {
            g.remove(eglcontext);
        }
    }

    protected ajl d()
    {
        return null;
    }

    protected final ajz d(EGLContext eglcontext)
    {
        ajz ajz2 = (ajz)h.get(eglcontext);
        ajz ajz1 = ajz2;
        if (ajz2 == null)
        {
            ajz1 = e();
            h.put(eglcontext, ajz1);
        }
        return ajz1;
    }

    protected final ajl e(EGLContext eglcontext)
    {
        ajl ajl2 = (ajl)g.get(eglcontext);
        ajl ajl1 = ajl2;
        if (ajl2 == null)
        {
            ajl1 = d();
            g.put(eglcontext, ajl1);
        }
        return ajl1;
    }

    protected ajz e()
    {
        return null;
    }
}
