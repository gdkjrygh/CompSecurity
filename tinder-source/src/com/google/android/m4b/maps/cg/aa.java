// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cg;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.util.Log;
import com.google.android.m4b.maps.ay.ab;
import com.google.android.m4b.maps.ay.b;
import com.google.android.m4b.maps.model.LatLng;
import com.google.android.m4b.maps.model.MarkerOptions;
import com.google.android.m4b.maps.model.internal.k;
import com.google.android.m4b.maps.y.j;
import java.util.Map;

// Referenced classes of package com.google.android.m4b.maps.cg:
//            ac, bl, bm, cb, 
//            q

public final class aa extends com.google.android.m4b.maps.model.internal.k.a
{
    public static interface a
    {

        public abstract void a();

        public abstract void a(int i1);

        public abstract void b();

        public abstract void c();

        public abstract void d();

        public abstract void e();

        public abstract boolean f();

        public abstract Rect g();
    }


    private static final MarkerOptions f = new MarkerOptions();
    public final ac a;
    public final b b;
    a c;
    boolean d;
    public String e;
    private final String g;
    private final bm h;
    private final cb i;
    private LatLng j;
    private bl k;
    private float l;
    private float m;
    private boolean n;
    private float o;
    private boolean p;
    private boolean q;
    private String r;
    private float s;
    private float t;
    private boolean u;
    private float v;
    private Resources w;

    public aa(String s1, MarkerOptions markeroptions, ac ac1, bm bm1, b b1, cb cb1, Resources resources)
    {
        g = s1;
        a = (ac)com.google.android.m4b.maps.y.j.a(ac1);
        h = bm1;
        i = cb1;
        b = b1;
        w = resources;
        j = (LatLng)com.google.android.m4b.maps.y.j.a(markeroptions.b);
        k = bl.a(markeroptions.e, w);
        h.a(k);
        l = markeroptions.f;
        m = markeroptions.g;
        n = markeroptions.j;
        o = markeroptions.k;
        v = markeroptions.n;
        r = markeroptions.c;
        e = markeroptions.d;
        p = markeroptions.h;
        q = markeroptions.i;
        s = markeroptions.l;
        t = markeroptions.m;
        if (markeroptions.f != f.f || markeroptions.g != f.g)
        {
            i.b(cb.a.i);
        }
        if (markeroptions.l != f.l || markeroptions.m != f.m)
        {
            i.b(cb.a.n);
        }
        if (markeroptions.e != f.e)
        {
            i.b(cb.a.h);
        }
        if (markeroptions.c != f.c)
        {
            i.b(cb.a.f);
        }
        if (markeroptions.d != f.d)
        {
            i.b(cb.a.g);
        }
        if (markeroptions.h != f.h)
        {
            i.b(com.google.android.m4b.maps.cg.cb.a.j);
        }
        if (markeroptions.i != f.i)
        {
            i.b(com.google.android.m4b.maps.cg.cb.a.k);
        }
        if (markeroptions.j != f.j)
        {
            i.b(cb.a.l);
        }
        if (markeroptions.k != f.k)
        {
            i.b(cb.a.m);
        }
        if (markeroptions.n != f.n)
        {
            i.b(cb.a.o);
        }
    }

    public final float A()
    {
        b.a();
        return B();
    }

    public final float B()
    {
        this;
        JVM INSTR monitorenter ;
        float f1 = v;
        this;
        JVM INSTR monitorexit ;
        return f1;
        Exception exception;
        exception;
        throw exception;
    }

    public final int C()
    {
        return hashCode();
    }

    public final Rect D()
    {
        return c.g();
    }

    public final String a()
    {
        return g;
    }

    public final void a(float f1)
    {
        b.a();
        this;
        JVM INSTR monitorenter ;
        o = f1;
        this;
        JVM INSTR monitorexit ;
        a(16);
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void a(float f1, float f2)
    {
        b.a();
        this;
        JVM INSTR monitorenter ;
        l = f1;
        m = f2;
        this;
        JVM INSTR monitorexit ;
        a(4);
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    final void a(int i1)
    {
        a a1;
        if (!u)
        {
            if ((a1 = a.a(this)) != null)
            {
                a1.a(i1);
                return;
            }
        }
    }

    public final void a(com.google.android.m4b.maps.da.b b1)
    {
        b.a();
        this;
        JVM INSTR monitorenter ;
        h.c(k);
        k = bl.a(b1, w);
        h.a(k);
        this;
        JVM INSTR monitorexit ;
        a(2);
        return;
        b1;
        this;
        JVM INSTR monitorexit ;
        throw b1;
    }

    public final void a(LatLng latlng)
    {
        b.a();
        i.b(cb.a.e);
        b(latlng);
        a(1);
    }

    public final void a(String s1)
    {
        b.a();
        this;
        JVM INSTR monitorenter ;
        r = s1;
        this;
        JVM INSTR monitorexit ;
        a(128);
        return;
        s1;
        this;
        JVM INSTR monitorexit ;
        throw s1;
    }

    public final void a(boolean flag)
    {
        b.a();
        p = flag;
        a(32);
    }

    public final boolean a(k k1)
    {
        return equals(k1);
    }

    public final void b()
    {
        b.a();
        i.b(cb.a.d);
        c();
    }

    public final void b(float f1)
    {
        b.a();
        this;
        JVM INSTR monitorenter ;
        v = f1;
        this;
        JVM INSTR monitorexit ;
        a(1024);
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void b(float f1, float f2)
    {
        b.a();
        this;
        JVM INSTR monitorenter ;
        s = f1;
        t = f2;
        this;
        JVM INSTR monitorexit ;
        a(512);
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void b(LatLng latlng)
    {
        this;
        JVM INSTR monitorenter ;
        j = latlng;
        this;
        JVM INSTR monitorexit ;
        return;
        latlng;
        throw latlng;
    }

    public final void b(String s1)
    {
        b.a();
        e = s1;
        a(256);
    }

    public final void b(boolean flag)
    {
        b.a();
        this;
        JVM INSTR monitorenter ;
        q = flag;
        this;
        JVM INSTR monitorexit ;
        a(64);
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    final void c()
    {
        if (!u) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (t())
        {
            s();
        }
        u = true;
        this;
        JVM INSTR monitorenter ;
        h.c(k);
        this;
        JVM INSTR monitorexit ;
        Object obj;
        Object obj1;
        obj = a;
        obj1 = ((ac) (obj)).l;
        if (((q) (obj1)).e == this && !((q) (obj1)).d)
        {
            ((q) (obj1)).a();
        }
        obj1 = (a)((ac) (obj)).c.get(this);
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_147;
        }
        if (!ab.a(ac.a, 6)) goto _L1; else goto _L3
_L3:
        obj = ac.a;
        obj1 = String.valueOf(this);
        Log.e(((String) (obj)), (new StringBuilder(String.valueOf(obj1).length() + 35)).append("MarkerRenderer is null for Marker: ").append(((String) (obj1))).toString());
        return;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        ((a) (obj1)).b();
        ((ac) (obj)).c.remove(this);
        return;
    }

    public final void c(boolean flag)
    {
        b.a();
        this;
        JVM INSTR monitorenter ;
        n = flag;
        this;
        JVM INSTR monitorexit ;
        a(8);
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final LatLng d()
    {
        b.a();
        return e();
    }

    public final LatLng e()
    {
        this;
        JVM INSTR monitorenter ;
        LatLng latlng = j;
        this;
        JVM INSTR monitorexit ;
        return latlng;
        Exception exception;
        exception;
        throw exception;
    }

    public final Bitmap f()
    {
        this;
        JVM INSTR monitorenter ;
        Bitmap bitmap = h.b(k).b;
        this;
        JVM INSTR monitorexit ;
        return bitmap;
        Exception exception;
        exception;
        throw exception;
    }

    public final float g()
    {
        this;
        JVM INSTR monitorenter ;
        float f1 = l;
        this;
        JVM INSTR monitorexit ;
        return f1;
        Exception exception;
        exception;
        throw exception;
    }

    public final float h()
    {
        this;
        JVM INSTR monitorenter ;
        float f1 = m;
        this;
        JVM INSTR monitorexit ;
        return f1;
        Exception exception;
        exception;
        throw exception;
    }

    public final float i()
    {
        b.a();
        return j();
    }

    public final float j()
    {
        this;
        JVM INSTR monitorenter ;
        float f1 = s;
        this;
        JVM INSTR monitorexit ;
        return f1;
        Exception exception;
        exception;
        throw exception;
    }

    public final float k()
    {
        b.a();
        return l();
    }

    public final float l()
    {
        this;
        JVM INSTR monitorenter ;
        float f1 = t;
        this;
        JVM INSTR monitorexit ;
        return f1;
        Exception exception;
        exception;
        throw exception;
    }

    public final String m()
    {
        b.a();
        return n();
    }

    public final String n()
    {
        this;
        JVM INSTR monitorenter ;
        String s1 = r;
        this;
        JVM INSTR monitorexit ;
        return s1;
        Exception exception;
        exception;
        throw exception;
    }

    public final String o()
    {
        b.a();
        return e;
    }

    public final boolean p()
    {
        b.a();
        return q();
    }

    public final boolean q()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = p;
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public final void r()
    {
        if (!u)
        {
            b.a();
            i.b(cb.a.p);
            a a1 = a.a(this);
            if (a1 != null)
            {
                a1.c();
            }
        }
    }

    public final void s()
    {
        if (!u && t())
        {
            b.a();
            i.b(cb.a.q);
            a a1 = a.a(this);
            if (a1 != null)
            {
                a1.d();
            }
        }
    }

    public final boolean t()
    {
        b.a();
        if (!u)
        {
            return ((a)a.c.get(this)).f();
        } else
        {
            return false;
        }
    }

    public final String toString()
    {
        return g;
    }

    public final boolean u()
    {
        b.a();
        return v();
    }

    public final boolean v()
    {
        this;
        JVM INSTR monitorenter ;
        if (!q) goto _L2; else goto _L1
_L1:
        boolean flag = d;
        if (flag) goto _L2; else goto _L3
_L3:
        flag = true;
_L5:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        flag = false;
        if (true) goto _L5; else goto _L4
_L4:
        Exception exception;
        exception;
        throw exception;
    }

    public final boolean w()
    {
        b.a();
        return x();
    }

    public final boolean x()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = n;
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public final float y()
    {
        b.a();
        return z();
    }

    public final float z()
    {
        this;
        JVM INSTR monitorenter ;
        float f1 = o;
        this;
        JVM INSTR monitorexit ;
        return f1;
        Exception exception;
        exception;
        throw exception;
    }

}
