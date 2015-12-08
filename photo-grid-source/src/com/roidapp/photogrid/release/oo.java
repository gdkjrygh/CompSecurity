// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.view.ViewGroup;

// Referenced classes of package com.roidapp.photogrid.release:
//            oi, mm, ih, ml, 
//            ie, PhotoGridActivity, op, oq, 
//            ig, PhotoView, az

public final class oo extends oi
{

    private mm r;

    public oo(PhotoGridActivity photogridactivity, ig aig[], ml ml1, PhotoView photoview, mm mm1, az az)
    {
        b = photogridactivity;
        c = aig;
        d = ml1;
        g = photoview;
        r = mm1;
        h = az;
    }

    public final void a()
    {
        Object obj = r.j.getLayoutParams();
        int k1 = ((android.view.ViewGroup.LayoutParams) (obj)).width;
        int l1 = ((android.view.ViewGroup.LayoutParams) (obj)).height;
        float f;
        float f2;
        float f3;
        float f4;
        int i;
        int j;
        boolean flag;
        if (ih.C().t() > 1.0F)
        {
            float f1 = (float)this.f / (float)l1;
            int k = (int)((float)k1 * f1);
            int i1 = this.f;
            f = f1;
            j = k;
            i = i1;
            if (this.f == 2560)
            {
                f = f1;
                j = k;
                i = i1;
                if (k > 4096)
                {
                    f = 4096F / (float)k1;
                    this.f = (int)((float)l1 * f);
                    i = this.f;
                    j = 4096;
                }
            }
        } else
        {
            int l = this.f;
            f2 = (float)this.f / (float)k1;
            int j1 = (int)((float)l1 * f2);
            f = f2;
            j = l;
            i = j1;
            if (this.f == 2560)
            {
                f = f2;
                j = l;
                i = j1;
                if (j1 > 4096)
                {
                    f = 4096F / (float)l1;
                    this.f = (int)((float)k1 * f);
                    j = this.f;
                    i = 4096;
                }
            }
        }
        d.a(8, 1);
        obj = new ie(b, j, i, c, c(), d, g, h);
        ((ie) (obj)).a(ih.C().B());
        ((ie) (obj)).a(f);
        if (!((PhotoGridActivity)b).R() && d())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ((ie) (obj)).b(flag);
        if (ih.C().W() == 4)
        {
            ((ie) (obj)).a(ih.C().n());
        }
        if (!ih.C().B())
        {
            ((ie) (obj)).a(ih.C().A(), ih.C().x(), ih.C().y(), ih.C().z());
        }
        if (ih.C().t() < 1.0F)
        {
            f2 = j;
        } else
        {
            f2 = i;
        }
        f4 = ih.C().S();
        if (r.r != 0 && !ih.C().B() && (f4 != 0.0F || ih.C().R() != 0.0F))
        {
            f3 = (f4 / 100F + 0.004791666F) * f2;
            f2 *= f4 / 100F + 0.004791666F;
        } else
        {
            f3 = (f4 / 100F) * f2;
            f2 *= f4 / 100F;
        }
        ((ie) (obj)).a(f3, f2, f);
        d.a(21, 1);
        (new Thread(new op(this, ((ie) (obj))))).start();
    }

    public final void a(int i)
    {
        Object obj;
        o = i;
        b(5);
        r.f();
        ((PhotoGridActivity)b).q();
        obj = r.j.getLayoutParams();
        int j = ((android.view.ViewGroup.LayoutParams) (obj)).width;
        j = ((android.view.ViewGroup.LayoutParams) (obj)).height;
        this.k;
        JVM INSTR tableswitch 0 5: default 96
    //                   0 348
    //                   1 358
    //                   2 369
    //                   3 380
    //                   4 391
    //                   5 402;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        break; /* Loop/switch isn't completed */
_L7:
        break MISSING_BLOCK_LABEL_402;
_L8:
        boolean flag = ih.C().B();
        int i1 = ih.C().A();
        int j1 = ih.C().x();
        int k1 = ih.C().y();
        int l1 = ih.C().z();
        float f;
        float f1;
        float f2;
        float f5;
        int k;
        int l;
        if (ih.C().t() > 1.0F)
        {
            f = (float)i / (float)((android.view.ViewGroup.LayoutParams) (obj)).height;
            k = (int)((float)((android.view.ViewGroup.LayoutParams) (obj)).width * f);
            l = i;
        } else
        {
            f = (float)i / (float)((android.view.ViewGroup.LayoutParams) (obj)).width;
            l = (int)((float)((android.view.ViewGroup.LayoutParams) (obj)).height * f);
            k = i;
        }
        b(8);
        obj = new ie(b, k, l, r.i, 1, d, g, h);
        ((ie) (obj)).a(flag);
        ((ie) (obj)).a(f);
        if (!flag)
        {
            ((ie) (obj)).a(i1, j1, k1, l1);
        }
        if (ih.C().t() < 1.0F)
        {
            f1 = k;
        } else
        {
            f1 = l;
        }
        f5 = ih.C().S();
        if (i1 != 0 && !flag)
        {
            float f3 = (0.00575F + f5 / 100F) * f1;
            f5 = f1 * (f5 / 100F + 0.00575F);
            f2 = f;
            f1 = f3;
            f = f5;
        } else
        {
            f2 = (f5 / 100F) * f1;
            f1 *= f5 / 100F;
            float f4 = f / 0.975F;
            f = f1;
            f1 = f2;
            f2 = f4;
        }
        ((ie) (obj)).a(f1, f, f2);
        b(21);
        (new Thread(new oq(this, ((ie) (obj)), i))).start();
        return;
_L2:
        ih.C().b(1.0F);
          goto _L8
_L3:
        ih.C().b(0.75F);
          goto _L8
_L4:
        ih.C().b(0.7142857F);
          goto _L8
_L5:
        ih.C().b(0.6666667F);
          goto _L8
_L6:
        ih.C().b(0.6F);
          goto _L8
        ih.C().b(0.5625F);
          goto _L8
    }
}
