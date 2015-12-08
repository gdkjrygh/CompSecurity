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
import android.graphics.Typeface;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.util.TypedValue;
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
import com.roidapp.photogrid.common.bc;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import org.xmlpull.v1.XmlPullParserException;

// Referenced classes of package com.roidapp.photogrid.release:
//            mm, ih, ml, ig, 
//            rf, lc, ic, PhotoGridActivity, 
//            an, PhotoView, az, ra, 
//            mx, if

public final class mw extends mm
{

    public mw(boolean flag, Activity activity, ig aig[], ml ml1, PhotoView photoview, com.roidapp.photogrid.release.az az1)
    {
        F = flag;
        h = activity;
        i = aig;
        l = ml1;
        D = photoview;
        E = az1;
        activity.getWindow().setFormat(-1);
        aig = ih.C();
        if (flag)
        {
            aig.d(false);
            aig.c(-2);
            aig.b(1.777778F);
            aig.e(0.0F);
            aig.d(0.0F);
            aig.f(0.0F);
            aig.d(0xff000000);
            if (bc.a(activity))
            {
                ml1.sendEmptyMessage(22);
            }
        }
        if (aig.w() != null)
        {
            z = aig.w();
        }
        i[0].B = true;
        m = aig.I();
        s = aig.x();
        r = aig.A();
        t = aig.y();
        u = aig.z();
        A = aig.m();
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

    static void a(mw mw1)
    {
        mw1.m();
    }

    private void d(int i, int j)
    {
        ig aig[] = this.i;
        int i1 = aig.length;
        for (int k = 0; k < i1; k++)
        {
            lc lc1 = aig[k].y;
            if (lc1 == null)
            {
                throw new OutOfMemoryError("data null");
            }
            int j1 = Math.round(((float)i * lc1.j) / 100F);
            int k1 = Math.round(((float)j * lc1.k) / 100F);
            int l = Math.round(((float)i * lc1.l) / 100F);
            int l1 = Math.round(((float)j * lc1.m) / 100F);
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
                path.moveTo((((PointF) (obj)).x * (float)i) / 100F + (float)j1, (((PointF) (obj)).y * (float)j) / 100F + (float)k1);
                for (l = 1; l < lc1.b.size(); l++)
                {
                    obj = (PointF)lc1.b.get(l);
                    path.lineTo((((PointF) (obj)).x * (float)i) / 100F + (float)j1, (((PointF) (obj)).y * (float)j) / 100F + (float)k1);
                }

                path.close();
                obj = new RectF();
                path.computeBounds(((RectF) (obj)), true);
                lc1.p.setPath(path, new Region((int)((RectF) (obj)).left, (int)((RectF) (obj)).top, (int)((RectF) (obj)).right, (int)((RectF) (obj)).bottom));
            } else
            {
                lc1.p.set(j1, k1, l + j1, l1 + k1);
            }
            path1 = new Path();
            list = lc1.b;
            j1 = list.size();
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
            l = 1;
            while (l < j1) 
            {
                PointF pointf = (PointF)list.get(l);
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
                l++;
            }
            path1.close();
            lc1.a = path1;
        }

    }

    private void m()
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
        m();
        this.l.a(11, 0);
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
_L20:
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
            break MISSING_BLOCK_LABEL_1632;
        }
        float f5;
        Object aobj[];
        int j;
        int k;
        int l;
        int i1;
        int j1;
        int k1;
        try
        {
            if (((View) (obj)).getVisibility() != 0)
            {
                break MISSING_BLOCK_LABEL_1632;
            }
            obj = ((View) (obj)).findViewById(0x7f0d0086);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            m();
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
_L23:
        f5 = h.getResources().getDimension(0x7f0900cb);
        j = (int)((float)x - f3 - f4 - f1 - f5 - (float)az.g);
        if (f2 >= (float)w / (float)j) goto _L15; else goto _L14
_L14:
        k = (int)((float)j * f2);
_L21:
        k = (int)((float)k * C);
        j = (int)((float)j * C);
        this.j = (ViewGroup)LayoutInflater.from(h).inflate(0x7f03000c, null);
        obj = new android.widget.RelativeLayout.LayoutParams(-1, -1);
        obj.width = k;
        obj.height = j;
        this.j.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        this.k = (RelativeLayout)this.j.findViewById(0x7f0d0061);
        obj = (android.widget.RelativeLayout.LayoutParams)this.k.getLayoutParams();
        obj.width = k;
        obj.height = j;
        ((android.widget.RelativeLayout.LayoutParams) (obj)).setMargins(0, 0, 0, 0);
        this.k.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        p = (LinearLayout)this.j.findViewById(0x7f0d0060);
        p.removeAllViews();
        if (ih.C().B())
        {
            p.setVisibility(8);
        }
        q = null;
        this.l.a(12, 0);
        j = this.k.getLayoutParams().width;
        j = this.k.getLayoutParams().height;
        if (ih.C().aL() == null || !ih.C().aM()) goto _L17; else goto _L16
_L16:
        com.roidapp.photogrid.release.rf.a();
        com.roidapp.photogrid.release.rf.a(y, ih.C().aL());
        ih.C().k(null);
        ih.C().r(false);
_L22:
        this.l.a(13, 0);
        a(this.k);
        this.l.a(14, 0);
        n = p.getLayoutParams().width;
        o = p.getLayoutParams().height;
        if (q == null)
        {
            q = new an(h, n, o);
            q.c(ih.C().B());
            q.a(r, s, t, u);
        }
        this.l.a(15, 0);
        this.l.a(16, 0);
        this.l.a(17, 0);
        obj = (android.widget.RelativeLayout.LayoutParams)p.getLayoutParams();
        if (D != null)
        {
            D.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        }
        if (E != null)
        {
            E.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        }
        this.l.a(18, 0);
        if (!D.e().isEmpty()) goto _L19; else goto _L18
_L18:
        obj = new Random();
        aobj = h.getResources().getStringArray(0x7f080003);
        obj = aobj[((Random) (obj)).nextInt(aobj.length)];
        obj = new ra(h, ((String) (obj)), true);
        obj.aj = 255;
        obj.c = n;
        obj.d = o;
        obj.au = 1.0F;
        obj.av = 2.0F;
        obj.aw = 2.0F;
        obj.ad = h.getResources().getInteger(0x7f0a0000);
        obj.getClass();
        obj.P = 2;
        obj.getClass();
        obj.ar = 2;
        obj.ag = true;
        obj.ah = 1.0F;
        obj.ae = -1;
        obj.ax = 0xff000000;
        obj.af = -21;
        obj.J = Typeface.DEFAULT;
        obj.M = ((ra) (obj)).a(((ra) (obj)).J);
        ((ra) (obj)).a(android.text.Layout.Alignment.ALIGN_CENTER);
        ((ra) (obj)).g();
        aobj = ((ra) (obj)).e();
        j = (int)TypedValue.applyDimension(1, 2.5F, h.getResources().getDisplayMetrics());
        k = (int)((double)((ra) (obj)).c * 0.49424999998882413D - (double)aobj[0]);
        l = ((ra) (obj)).d;
        i1 = (int)((float)((ra) (obj)).d - (float)((ra) (obj)).c / 2.35F) / 2;
        j1 = ((ra) (obj)).d() / 2;
        k1 = (int)aobj[1];
        ((ra) (obj)).b(k, l - i1 - j1 - k1 - j);
        obj.f = true;
        D.a(((ao) (obj)));
_L19:
        this.l.a(19, 0);
        d(this.k.getLayoutParams().width, this.k.getLayoutParams().height);
        this.l.a(20, 0);
        (new Thread(new mx(this, this.j.getLayoutParams().width, this.j.getLayoutParams().height))).start();
        return;
_L4:
        obj = this.i[0].e();
          goto _L20
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
          goto _L21
_L17:
        com.roidapp.photogrid.release.rf.a();
        com.roidapp.photogrid.release.rf.a(h, y, B, m, this.i.length);
          goto _L22
        f1 = 0.0F;
          goto _L23
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
label0:
                    {
                        if (i < this.i.length)
                        {
                            ontouchlistener = (if)k.findViewById(i + 1);
                            if (ontouchlistener != null)
                            {
                                break label0;
                            }
                            a();
                        }
                        if (E != null)
                        {
                            ontouchlistener = (ViewGroup)E.getParent();
                            if (ontouchlistener != null)
                            {
                                ontouchlistener.removeView(E);
                            }
                            j.addView(E);
                        }
                        if (D != null)
                        {
                            ontouchlistener = (ViewGroup)D.getParent();
                            if (ontouchlistener != null)
                            {
                                ontouchlistener.removeView(D);
                            }
                            j.addView(D);
                        }
                        ontouchlistener = (android.widget.RelativeLayout.LayoutParams)relativelayout.getLayoutParams();
                        ontouchlistener.setMargins(0, 0, 0, (int)h.getResources().getDimension(0x7f09010a));
                        relativelayout.setLayoutParams(ontouchlistener);
                        relativelayout.removeAllViews();
                        relativelayout.addView(j);
                        return;
                    }
                    y.get(i);
                    y.get(i);
                    y.get(i);
                    y.get(i);
                    ontouchlistener.b(((ic)y.get(i)).a);
                    ontouchlistener.a(((ic)y.get(i)).a);
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
        m();
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
}
