// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view;

import android.content.ContentValues;
import android.graphics.Canvas;
import android.graphics.Matrix;
import com.cardinalblue.android.piccollage.model.d;
import com.cardinalblue.android.piccollage.model.gson.BaseScrapModel;
import com.cardinalblue.android.piccollage.model.gson.CollageRoot;
import com.cardinalblue.android.piccollage.model.gson.FrameModel;
import com.cardinalblue.android.piccollage.model.gson.TagModel;
import com.google.b.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONException;

public abstract class k
{
    public static abstract class a
    {

        public a()
        {
        }
    }


    private static Random A = new Random();
    public static final float q[] = {
        0.0F, 0.0F, 0.0F
    };
    private float a;
    private float b;
    private float c;
    private float d;
    private float e;
    private float f;
    private boolean g;
    protected float h;
    protected float i;
    protected float j;
    protected float k;
    protected Matrix l;
    protected Matrix m;
    protected int n;
    protected boolean o;
    protected boolean p;
    private int r;
    private int s;
    private List t;
    private int u;
    private Queue v;
    private Matrix w;
    private final long x;
    private boolean y;
    private boolean z;

    public k()
    {
        g = false;
        j = 1.0F;
        t = new ArrayList();
        v = new ConcurrentLinkedQueue();
        m = new Matrix();
        y = false;
        z = false;
        o = false;
        p = false;
        x = F();
        n = 0x80000000;
    }

    public k(ContentValues contentvalues)
        throws NullPointerException
    {
        g = false;
        j = 1.0F;
        t = new ArrayList();
        v = new ConcurrentLinkedQueue();
        m = new Matrix();
        y = false;
        z = false;
        o = false;
        p = false;
        x = F();
        n = contentvalues.getAsInteger("z_index").intValue();
    }

    public k(BaseScrapModel basescrapmodel)
        throws IllegalArgumentException
    {
        g = false;
        j = 1.0F;
        t = new ArrayList();
        v = new ConcurrentLinkedQueue();
        m = new Matrix();
        y = false;
        z = false;
        o = false;
        p = false;
        if (!d(basescrapmodel))
        {
            throw new IllegalArgumentException("the scrap model is not correct");
        }
        long l1;
        if (basescrapmodel.getId() == 0x8000000000000000L)
        {
            l1 = F();
        } else
        {
            l1 = basescrapmodel.getId();
        }
        x = l1;
        n = 0x80000000;
        c(basescrapmodel);
    }

    public static long F()
    {
        return A.nextLong();
    }

    private void c(BaseScrapModel basescrapmodel)
    {
        n = basescrapmodel.getzIndex();
        t = basescrapmodel.getTags();
        j = basescrapmodel.getTransform().getScale();
        k = basescrapmodel.getTransform().getAngle();
        h = basescrapmodel.getFrame().getCenterX();
        i = basescrapmodel.getFrame().getCenterY();
        e((int)basescrapmodel.getFrame().getBaseWidth());
        f((int)basescrapmodel.getFrame().getBaseHeight());
    }

    private boolean d(BaseScrapModel basescrapmodel)
    {
        while (basescrapmodel == null || basescrapmodel.getFrame() == null || basescrapmodel.getTransform() == null) 
        {
            return false;
        }
        return true;
    }

    public abstract BaseScrapModel D();

    public final void E()
    {
        if (!o)
        {
            o = true;
            x();
        }
    }

    public void G()
    {
        int i1 = com.cardinalblue.android.b.k.c();
        int j1 = com.cardinalblue.android.b.k.d();
        if (h <= 0.0F || h >= (float)i1 || i <= 0.0F || i >= (float)j1)
        {
            h = i1 / 2;
            i = j1 / 2;
            J();
        }
    }

    public void H()
    {
        w = null;
    }

    public boolean I()
    {
        return g;
    }

    public void J()
    {
        l = new Matrix();
        float f1 = R();
        l.postTranslate(-h, -i);
        l.postRotate(-f1);
        l.postScale(1.0F / j, 1.0F / j);
        l.invert(m);
    }

    public float K()
    {
        return h;
    }

    public float L()
    {
        return i;
    }

    public void M()
    {
        a = K();
        b = L();
        e = Q();
        f = P();
        d = T();
        c = S();
    }

    public void N()
    {
        c = S();
        d = T();
    }

    public boolean O()
    {
        return f != j;
    }

    public float P()
    {
        return j;
    }

    public float Q()
    {
        return k;
    }

    public float R()
    {
        return (float)Math.toDegrees(k);
    }

    public int S()
    {
        return r;
    }

    public int T()
    {
        return s;
    }

    public long U()
    {
        return x;
    }

    public int V()
    {
        return u;
    }

    public int W()
    {
        return n;
    }

    public Matrix X()
    {
        return m;
    }

    public Matrix Y()
    {
        return l;
    }

    public boolean Z()
    {
        return y;
    }

    public void a(float f1)
    {
        k = f1;
        J();
    }

    public void a(float f1, float f2, float f3, float f4)
    {
        h = f1;
        i = f2;
        j = f3;
        k = f4;
        J();
    }

    protected abstract void a(Canvas canvas);

    public void a(Canvas canvas, float f1, float f2)
    {
        if (w == null)
        {
            if (f1 != 0.0F || f2 != 0.0F)
            {
                Matrix matrix = new Matrix(m);
                matrix.postTranslate(f1, f2);
                canvas.concat(matrix);
            } else
            {
                canvas.concat(m);
            }
        } else
        {
            canvas.concat(w);
        }
        a(canvas);
    }

    public void a(Matrix matrix, Matrix matrix1)
    {
        w = new Matrix(m);
        if (matrix != null)
        {
            w.preConcat(matrix);
        }
        if (matrix1 != null)
        {
            w.postConcat(matrix1);
        }
    }

    public void a(com.cardinalblue.android.piccollage.controller.e e1)
    {
        a(e1.a(), e1.b(), e1.c(), e1.d());
    }

    public void a(BaseScrapModel basescrapmodel)
    {
        c(basescrapmodel);
    }

    public void a(FrameModel framemodel)
    {
        h = framemodel.getCenterX();
        i = framemodel.getCenterY();
        r = (int)framemodel.getBaseWidth();
        s = (int)framemodel.getBaseHeight();
        J();
    }

    protected void a(TagModel tagmodel)
    {
        Iterator iterator = t.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            if (tagmodel.equals((TagModel)iterator.next()))
            {
                iterator.remove();
            }
        } while (true);
        t.add(tagmodel);
    }

    public boolean a()
    {
        return false;
    }

    public boolean a(float f1, float f2)
    {
        if (!b())
        {
            return false;
        } else
        {
            float af1[] = new float[2];
            af1[0] = f1;
            af1[1] = f2;
            l.mapPoints(af1, new float[] {
                f1, f2
            });
            return c(af1[0], af1[1]);
        }
    }

    public boolean a(d d1, int i1, int j1, float f1, float f2)
    {
        return false;
    }

    public boolean aa()
    {
        return z;
    }

    public final String ab()
        throws JSONException
    {
        return CollageRoot.versionedTypeAdapterGson(com.cardinalblue.android.piccollage.model.gson.CollageRoot.VersionEnum.A3).a(D());
    }

    public List ac()
    {
        return t;
    }

    public Queue ad()
    {
        return v;
    }

    public void ae()
    {
        v.clear();
    }

    public boolean af()
    {
        float f1 = (float)(S() + T()) / 2.0F;
        boolean flag1 = com.cardinalblue.android.b.k.a(a, b, h, i, f1);
        boolean flag2 = com.cardinalblue.android.b.k.a(c, d, r, s, 3F);
        boolean flag;
        if (Math.round((double)(com.cardinalblue.android.b.k.a(Math.abs(com.cardinalblue.android.b.k.a(k) - com.cardinalblue.android.b.k.a(e))) * 2.0F) / 3.1415926535897931D) != 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return flag | (flag2 | flag1);
    }

    public abstract void b(int i1);

    public final void b(Canvas canvas)
    {
        a(canvas, 0.0F, 0.0F);
    }

    public void b(BaseScrapModel basescrapmodel)
    {
        basescrapmodel.getTransform().setAngle(e);
        basescrapmodel.getTransform().setScale(f);
        basescrapmodel.getFrame().setCenterX(a);
        basescrapmodel.getFrame().setCenterY(b);
        basescrapmodel.getFrame().setBaseWidth(c);
        basescrapmodel.getFrame().setBaseHeights(d);
        basescrapmodel.setFrameSlotNumber(u());
    }

    public boolean b()
    {
        return true;
    }

    public void c(int i1)
    {
    }

    public boolean c(float f1, float f2)
    {
        float f3 = (float)r / 2.0F;
        float f4 = -f3;
        float f5 = (float)s / 2.0F;
        float f6 = -f5;
        return f1 >= f4 && f1 < f3 && f2 >= f6 && f2 < f5;
    }

    public void d(float f1, float f2)
    {
        h = f1;
        i = f2;
        J();
    }

    public void d(int i1)
    {
    }

    public void d(boolean flag)
    {
        g = flag;
    }

    protected void e(int i1)
    {
        r = i1;
    }

    public void e(boolean flag)
    {
        y = flag;
    }

    protected abstract void f();

    protected void f(int i1)
    {
        s = i1;
    }

    public void f(boolean flag)
    {
        z = flag;
    }

    public void g(int i1)
    {
        u = i1;
    }

    public void g(boolean flag)
    {
        p = flag;
    }

    public void h(int i1)
    {
        n = i1;
    }

    public int o()
    {
        return S();
    }

    public int p()
    {
        return T();
    }

    public int t()
    {
        return -1;
    }

    public int u()
    {
        return t();
    }

    public void v()
    {
    }

    public boolean w()
    {
        return false;
    }

    protected abstract void x();

}
