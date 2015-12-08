// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.roidapp.photogrid.a.m;
import com.roidapp.photogrid.common.a;
import com.roidapp.photogrid.common.aj;
import com.roidapp.photogrid.common.az;
import com.roidapp.photogrid.common.bb;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.xmlpull.v1.XmlPullParserException;

// Referenced classes of package com.roidapp.photogrid.release:
//            mm, ih, ig, rf, 
//            lc, PhotoView, ao, ps, 
//            PhotoGridActivity, az, ra, qz, 
//            ic, ml, an, nd, 
//            if

public final class nc extends mm
{

    public nc(boolean flag, Activity activity, ig aig[], ml ml1, PhotoView photoview, com.roidapp.photogrid.release.az az1)
    {
        F = flag;
        h = activity;
        this.i = aig;
        l = ml1;
        D = photoview;
        E = az1;
        activity.getWindow().setFormat(-1);
        activity = ih.C();
        if (flag)
        {
            activity.d(false);
            if (activity.ax())
            {
                this.i[0].B = false;
            } else
            {
                this.i[0].B = true;
            }
            activity.b(1.0F);
            activity.c(0);
            activity.f(false);
            if (activity.aI())
            {
                int i = aj.a().a[this.i.length - 1];
                activity.k(1);
                activity.i(i);
                activity.r(i);
            } else
            {
                activity.i(0);
                activity.r(0);
            }
            if (activity.A() != 0)
            {
                activity.e(1.45F);
            } else
            {
                activity.e(0.0F);
            }
            activity.f(0.0F);
        }
        if (activity.W() == 4)
        {
            this.i[0].B = false;
        }
        if (activity.w() != null)
        {
            z = activity.w();
        }
        m = activity.I();
        s = activity.x();
        r = activity.A();
        t = activity.y();
        u = activity.z();
        A = activity.m();
        I = activity.be();
        J = activity.bd() / 5;
        B = aj.a().b;
    }

    private void a(RelativeLayout relativelayout)
    {
        try
        {
            com.roidapp.photogrid.release.rf.a();
            com.roidapp.photogrid.release.rf.a(j, relativelayout, p, h, i, y);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (RelativeLayout relativelayout)
        {
            relativelayout.printStackTrace();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (RelativeLayout relativelayout)
        {
            relativelayout.printStackTrace();
        }
    }

    static void a(nc nc1)
    {
        nc1.n();
    }

    private void d(int i, int j)
    {
        ig aig[] = this.i;
        int j1 = aig.length;
        for (int k = 0; k < j1; k++)
        {
            lc lc1 = aig[k].y;
            if (lc1 == null)
            {
                throw new OutOfMemoryError("data null");
            }
            int k1 = Math.round(((float)i * lc1.j) / 100F);
            int l1 = Math.round(((float)j * lc1.k) / 100F);
            int i1 = Math.round(((float)i * lc1.l) / 100F);
            int i2 = Math.round(((float)j * lc1.m) / 100F);
            float f1;
            float f2;
            float f3;
            float f5;
            float f6;
            Path path1;
            List list;
            if (lc1.f)
            {
                Path path = new Path();
                Object obj = (PointF)lc1.b.get(0);
                path.moveTo((((PointF) (obj)).x * (float)i) / 100F + (float)k1, (((PointF) (obj)).y * (float)j) / 100F + (float)l1);
                for (i1 = 1; i1 < lc1.b.size(); i1++)
                {
                    obj = (PointF)lc1.b.get(i1);
                    path.lineTo((((PointF) (obj)).x * (float)i) / 100F + (float)k1, (((PointF) (obj)).y * (float)j) / 100F + (float)l1);
                }

                path.close();
                obj = new RectF();
                path.computeBounds(((RectF) (obj)), true);
                lc1.p.setPath(path, new Region((int)((RectF) (obj)).left, (int)((RectF) (obj)).top, (int)((RectF) (obj)).right, (int)((RectF) (obj)).bottom));
            } else
            {
                lc1.p.set(k1, l1, i1 + k1, i2 + l1);
            }
            path1 = new Path();
            list = lc1.b;
            k1 = list.size();
            f5 = lc1.e.x;
            f6 = lc1.e.y;
            f1 = ((PointF)list.get(0)).x;
            f2 = ((PointF)list.get(0)).y;
            if (f1 < f5)
            {
                f1 = (f1 * (float)i) / 100F - 1.0F;
            } else
            {
                f1 = (f1 * (float)i) / 100F + 1.0F;
            }
            if (f2 < f6)
            {
                f2 = (f2 * (float)j) / 100F - 1.0F;
            } else
            {
                f2 = (f2 * (float)j) / 100F + 1.0F;
            }
            f3 = f1;
            if (f1 < 0.0F)
            {
                f3 = 0.0F;
            }
            f1 = f2;
            if (f2 < 0.0F)
            {
                f1 = 0.0F;
            }
            path1.moveTo(f3, f1);
            i1 = 1;
            while (i1 < k1) 
            {
                PointF pointf = (PointF)list.get(i1);
                f1 = pointf.x;
                f2 = pointf.y;
                float f4;
                if (f1 < f5)
                {
                    f1 = (f1 * (float)i) / 100F - 1.0F;
                } else
                {
                    f1 = (f1 * (float)i) / 100F + 1.0F;
                }
                if (f2 < f6)
                {
                    f2 = (f2 * (float)j) / 100F - 1.0F;
                } else
                {
                    f2 = (f2 * (float)j) / 100F + 1.0F;
                }
                f4 = f1;
                if (f1 < 0.0F)
                {
                    f4 = 0.0F;
                }
                f1 = f2;
                if (f2 < 0.0F)
                {
                    f1 = 0.0F;
                }
                path1.lineTo(f4, f1);
                i1++;
            }
            path1.close();
            lc1.a = path1;
        }

    }

    private void m()
    {
        if (D != null)
        {
            Iterator iterator1;
            int i;
            int j;
            if (z != null && z.size() > 0)
            {
                if (D.e().size() == 0)
                {
                    Iterator iterator = z.iterator();
                    do
                    {
                        if (!iterator.hasNext())
                        {
                            break;
                        }
                        ao ao1 = (ao)iterator.next();
                        if (!(ao1 instanceof ps))
                        {
                            ao1.f = false;
                            D.a(ao1);
                        }
                    } while (true);
                    ((PhotoGridActivity)h).i();
                }
                z.clear();
            } else
            {
                ((PhotoGridActivity)h).i();
            }
            if (A != null && A.size() > 0)
            {
                if (E != null && E.a().size() == 0)
                {
                    E.a().addAll(A);
                }
                A.clear();
            }
            i = D.getLayoutParams().width;
            j = D.getLayoutParams().height;
            iterator1 = D.e().iterator();
            while (iterator1.hasNext()) 
            {
                Object obj = (ao)iterator1.next();
                if (obj instanceof ra)
                {
                    ra ra1 = (ra)obj;
                    float f1 = ra1.j;
                    float f2 = ra1.k;
                    float f3 = (float)i / (float)ra1.c;
                    float f4 = (float)j / (float)ra1.d;
                    ra1.c = i;
                    ra1.d = j;
                    ra1.i();
                    ra1.b(-f1, -f2);
                    ra1.b(ra1.h * f3, ra1.l, f1 * f3, f4 * f2);
                    ((ra)obj).j();
                    obj.f = false;
                } else
                if (obj instanceof qz)
                {
                    obj = (qz)obj;
                    if (((qz) (obj)).c > 0 && ((qz) (obj)).d > 0)
                    {
                        obj.j = ((qz) (obj)).j * ((float)i / (float)((qz) (obj)).c);
                        obj.k = ((qz) (obj)).k * ((float)j / (float)((qz) (obj)).d);
                    }
                    obj.c = i;
                    obj.d = j;
                    ((qz) (obj)).g();
                }
            }
        }
    }

    private void n()
    {
        if (y == null) goto _L2; else goto _L1
_L1:
        ArrayList arraylist = y;
        arraylist;
        JVM INSTR monitorenter ;
        Iterator iterator = y.iterator();
_L4:
        ic ic1;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_57;
            }
            ic1 = (ic)iterator.next();
        } while (ic1 == null);
        ic1.a();
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        arraylist;
        JVM INSTR monitorexit ;
        throw exception;
        y.clear();
        arraylist;
        JVM INSTR monitorexit ;
_L2:
    }

    public final void a()
    {
        n();
        l.a(11, 0);
        if (this.j != null)
        {
            this.j.removeAllViews();
        }
        if (ih.C().W() != 2) goto _L2; else goto _L1
_L1:
        ig aig[];
        android.graphics.BitmapFactory.Options options;
        aig = ih.C().M();
        options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        if (this.i[0].b == null) goto _L4; else goto _L3
_L3:
        Object obj = this.i[0].b;
_L22:
        float f1;
        float f2;
        BitmapFactory.decodeFile(((String) (obj)), options);
        f2 = options.outWidth;
        f1 = options.outHeight;
        ih.C().t();
        if (f2 == 0.0F && f1 == 0.0F) goto _L2; else goto _L5
_L5:
        if ((bb.a(((String) (obj))) / 90) % 2 == 1)
        {
            f2 = options.outHeight;
            f1 = options.outWidth;
        }
        if (aig[0].q % 180 == 0) goto _L7; else goto _L6
_L6:
        ih.C().b(f1 / f2);
_L2:
        float f3;
        float f4;
        f2 = ih.C().t();
        x = h.getResources().getDisplayMetrics().heightPixels;
        w = h.getResources().getDisplayMetrics().widthPixels;
        if (x < w)
        {
            int i = x;
            x = w;
            w = i;
        }
        f3 = h.getResources().getDimension(0x7f0900dd);
        f4 = h.getResources().getDimension(0x7f090058);
        f1 = h.getResources().getDimension(0x7f090057);
        obj = h.findViewById(0x7f0d0085);
        if (obj == null) goto _L9; else goto _L8
_L8:
        com.roidapp.photogrid.common.a.a();
        if (!com.roidapp.photogrid.common.a.a(h, "grid", true) || com.roidapp.photogrid.a.m.a(h) == 1) goto _L11; else goto _L10
_L10:
        if (az.B) goto _L13; else goto _L12
_L12:
        ((View) (obj)).setVisibility(0);
        if (h instanceof PhotoGridActivity)
        {
            PhotoGridActivity photogridactivity = (PhotoGridActivity)h;
            if (photogridactivity.F)
            {
                photogridactivity.F = false;
                photogridactivity.C();
            }
        }
_L9:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_1274;
        }
        float f5;
        int j;
        int k;
        try
        {
            if (((View) (obj)).getVisibility() != 0)
            {
                break MISSING_BLOCK_LABEL_1274;
            }
            obj = ((View) (obj)).findViewById(0x7f0d0086);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            n();
            if (((OutOfMemoryError) (obj)).getMessage() != null && (((OutOfMemoryError) (obj)).getMessage().equals("bg create decodeBitmap null") || ((OutOfMemoryError) (obj)).getMessage().equals("sticker create bitmap null")))
            {
                if (C == 1.0F)
                {
                    C = 0.75F;
                    K.sendEmptyMessage(1);
                    return;
                }
                if (C == 0.75F)
                {
                    C = 0.5F;
                    K.sendEmptyMessage(1);
                    return;
                } else
                {
                    ((OutOfMemoryError) (obj)).printStackTrace();
                    C = 1.0F;
                    d(142);
                    return;
                }
            } else
            {
                ((OutOfMemoryError) (obj)).printStackTrace();
                C = 1.0F;
                d(143);
                return;
            }
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_434;
        }
        j = ((View) (obj)).getLayoutParams().height;
        if (j > 0)
        {
            f1 = j;
        }
_L26:
        f5 = h.getResources().getDimension(0x7f0900cb);
        j = (int)((float)x - f3 - f4 - f1 - f5 - (float)az.g);
        if (f2 >= (float)w / (float)j) goto _L15; else goto _L14
_L14:
        k = (int)((float)j * f2);
_L23:
        k = (int)((float)k * C);
        j = (int)((float)j * C);
        this.j = (ViewGroup)LayoutInflater.from(h).inflate(0x7f03000c, null);
        obj = new android.widget.RelativeLayout.LayoutParams(-1, -1);
        obj.width = k;
        obj.height = j;
        this.j.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        this.k = (RelativeLayout)this.j.findViewById(0x7f0d0061);
        p = (LinearLayout)this.j.findViewById(0x7f0d0060);
        p.removeAllViews();
        q = null;
        l.a(12, 0);
        j = this.k.getLayoutParams().width;
        j = this.k.getLayoutParams().height;
        if (ih.C().aL() == null || !ih.C().aM()) goto _L17; else goto _L16
_L16:
        com.roidapp.photogrid.release.rf.a();
        com.roidapp.photogrid.release.rf.a(y, ih.C().aL());
        ih.C().k(null);
        ih.C().r(false);
_L24:
        l.a(13, 0);
        a(this.k);
        l.a(14, 0);
        n = p.getLayoutParams().width;
        o = p.getLayoutParams().height;
        if (q != null) goto _L19; else goto _L18
_L18:
        q = new an(h, n, o);
        q.c(ih.C().B());
        if (!ih.C().be()) goto _L21; else goto _L20
_L20:
        q.b(true);
        if (h != null)
        {
            ((PhotoGridActivity)h).a(ih.C().bd(), true);
        }
_L25:
        q.a(r, s, t, u);
_L19:
        l.a(15, 0);
        l.a(16, 0);
        l.a(17, 0);
        obj = (android.widget.RelativeLayout.LayoutParams)p.getLayoutParams();
        if (D != null)
        {
            D.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        }
        if (E != null)
        {
            E.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        }
        l.a(18, 0);
        m();
        l.a(19, 0);
        d(this.k.getLayoutParams().width, this.k.getLayoutParams().height);
        l.a(20, 0);
        (new Thread(new nd(this, this.j.getLayoutParams().width, this.j.getLayoutParams().height))).start();
        return;
_L4:
        obj = this.i[0].e();
          goto _L22
_L7:
        ih.C().b(f2 / f1);
          goto _L2
_L13:
        ((View) (obj)).setVisibility(8);
          goto _L9
_L11:
        ((View) (obj)).setVisibility(8);
          goto _L9
_L15:
        k = w;
        j = (int)((float)k / f2);
          goto _L23
_L17:
        com.roidapp.photogrid.release.rf.a();
        com.roidapp.photogrid.release.rf.a(h, y, B, m, this.i.length);
          goto _L24
_L21:
        q.b(false);
          goto _L25
        f1 = 0.0F;
          goto _L26
    }

    public final void a(RelativeLayout relativelayout, android.view.View.OnTouchListener ontouchlistener)
    {
        if (!H)
        {
            if (q != null && p.getChildCount() == 0)
            {
                p.addView(q);
            }
            l.a(75, 0);
            if (y.size() == this.i.length)
            {
                int i = 0;
                do
                {
                    Object obj;
label0:
                    {
                        if (i < this.i.length)
                        {
                            obj = (if)k.findViewById(i + 1);
                            if (obj != null)
                            {
                                break label0;
                            }
                            a();
                        }
                        if (E != null)
                        {
                            obj = (ViewGroup)E.getParent();
                            if (obj != null)
                            {
                                ((ViewGroup) (obj)).removeView(E);
                            }
                            j.addView(E);
                        }
                        if (D != null)
                        {
                            obj = (ViewGroup)D.getParent();
                            if (obj != null)
                            {
                                ((ViewGroup) (obj)).removeView(D);
                            }
                            j.addView(D);
                        }
                        obj = (android.widget.RelativeLayout.LayoutParams)relativelayout.getLayoutParams();
                        ((android.widget.RelativeLayout.LayoutParams) (obj)).setMargins(0, 0, 0, (int)h.getResources().getDimension(0x7f09010a));
                        relativelayout.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
                        relativelayout.removeAllViews();
                        relativelayout.addView(j);
                        k.setOnTouchListener(ontouchlistener);
                        return;
                    }
                    y.get(i);
                    y.get(i);
                    y.get(i);
                    y.get(i);
                    ((if) (obj)).b(((ic)y.get(i)).a);
                    ((if) (obj)).a(((ic)y.get(i)).a);
                    l.a(i * 2 + 76, 0);
                    i++;
                } while (true);
            }
        }
    }

    public final int b(boolean flag)
    {
        return 0;
    }

    public final void b()
    {
        H = true;
        if (j != null)
        {
            j.removeAllViews();
        }
        n();
    }

    public final void b(int i, int j)
    {
    }

    public final void b(int i, boolean flag)
    {
        if (y == null || y.size() == 0)
        {
            return;
        } else
        {
            if if1 = (if)j.findViewById(i + 1);
            ic ic1 = (ic)y.get(i);
            this.i[i].B = flag;
            this.i[i].v = 1.0F;
            this.i[i].t = 0.0F;
            this.i[i].u = 0.0F;
            this.i[i].p = 0;
            this.i[i].x = 0;
            this.i[i].r = 1;
            this.i[i].s = 1;
            if1.c = this.i[i];
            if1.a(ic1.a);
            return;
        }
    }

    public final void c(int i)
    {
        a(k);
        d(k.getLayoutParams().width, k.getLayoutParams().height);
        if (y.size() != this.i.length) goto _L2; else goto _L1
_L1:
        int j = 0;
_L7:
        if (j >= this.i.length) goto _L2; else goto _L3
_L3:
        if if1 = (if)k.findViewById(j + 1);
        if (if1 != null) goto _L5; else goto _L4
_L4:
        a();
_L2:
        return;
_L5:
        y.get(j);
        y.get(j);
        y.get(j);
        y.get(j);
        if1.b(((ic)y.get(j)).a);
        boolean flag;
        if (i == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if1.D = flag;
        if1.invalidate();
        j++;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public final void c(int i, int j)
    {
    }

    public final void f()
    {
        if (A == null)
        {
            A = new ArrayList();
        }
        if (D != null)
        {
            if (z == null)
            {
                z = new ArrayList();
            }
            z.addAll(D.e());
            ih.C().j(z);
        }
        if (E != null)
        {
            A.addAll(E.a());
            ih.C().e(A);
            E.a().clear();
        }
    }

    public final void l()
    {
        super.l();
    }
}
