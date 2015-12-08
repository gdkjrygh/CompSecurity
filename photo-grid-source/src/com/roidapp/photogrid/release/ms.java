// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.app.Activity;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Message;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.roidapp.cloudlib.template.m;
import com.roidapp.photogrid.common.a;
import com.roidapp.photogrid.common.aj;
import com.roidapp.photogrid.common.az;
import com.roidapp.photogrid.common.b;
import com.roidapp.photogrid.common.c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;

// Referenced classes of package com.roidapp.photogrid.release:
//            mm, ih, rf, ig, 
//            lc, qz, PhotoView, rc, 
//            ra, ao, ps, PhotoGridActivity, 
//            az, ic, ml, an, 
//            mt, if

public final class ms extends mm
{

    public ms(boolean flag, Activity activity, ig aig[], ml ml1, PhotoView photoview, com.roidapp.photogrid.release.az az1)
    {
        F = flag;
        h = activity;
        this.i = aig;
        l = ml1;
        D = photoview;
        E = az1;
        activity.getWindow().setFormat(-1);
        aig = ih.C();
        if (flag)
        {
            aig.d(false);
            aig.c(0);
            aig.b(1.0F);
            aig.f(false);
            if (aig.aI())
            {
                int i = aj.a().a[this.i.length - 1];
                aig.k(0);
                aig.i(i);
                aig.r(i);
            } else
            {
                aig.i(0);
                aig.r(0);
            }
        }
        if (aig.w() != null)
        {
            z = aig.w();
        }
        r = aig.A();
        if (aig.W() != 4)
        {
            activity = activity.getPreferences(0);
            aig.d(activity.getFloat("INNER_SPACE", 0.64F));
            if (r == 0)
            {
                aig.e(activity.getFloat("OUTER_SPACE", 0.64F));
            } else
            {
                aig.e(activity.getFloat("OUTER_SPACE", 1.45F));
            }
            aig.f(activity.getFloat("CORNER_RADIOUS", 0.0F));
        }
        m = aig.I();
        s = aig.x();
        r = aig.A();
        t = aig.y();
        u = aig.z();
        A = aig.m();
        if (this.i != null) goto _L2; else goto _L1
_L1:
        com.roidapp.photogrid.common.c.a("190", h);
_L20:
        return;
_L2:
        this.i.length;
        JVM INSTR tableswitch 1 15: default 372
    //                   1 404
    //                   2 417
    //                   3 430
    //                   4 443
    //                   5 456
    //                   6 469
    //                   7 482
    //                   8 495
    //                   9 508
    //                   10 521
    //                   11 534
    //                   12 547
    //                   13 560
    //                   14 573
    //                   15 586;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18
_L18:
        break MISSING_BLOCK_LABEL_586;
_L4:
        break; /* Loop/switch isn't completed */
_L3:
        B = new int[0];
_L21:
        if (B != null && m >= B.length)
        {
            m = 0;
            return;
        }
        if (true) goto _L20; else goto _L19
_L19:
        B = aj.a().b;
          goto _L21
_L5:
        B = aj.a().c;
          goto _L21
_L6:
        B = aj.a().d;
          goto _L21
_L7:
        B = aj.a().e;
          goto _L21
_L8:
        B = aj.a().f;
          goto _L21
_L9:
        B = aj.a().g;
          goto _L21
_L10:
        B = aj.a().h;
          goto _L21
_L11:
        B = aj.a().i;
          goto _L21
_L12:
        B = aj.a().j;
          goto _L21
_L13:
        B = aj.a().k;
          goto _L21
_L14:
        B = aj.a().l;
          goto _L21
_L15:
        B = aj.a().m;
          goto _L21
_L16:
        B = aj.a().n;
          goto _L21
_L17:
        B = aj.a().o;
          goto _L21
        B = aj.a().p;
          goto _L21
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

    static void a(ms ms1)
    {
        ms1.n();
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
        if (D != null)
        {
            if (F && (z == null || z.size() == 0) && ih.C().W() == 4)
            {
                List list = ih.C().p();
                Object obj = ih.C().q();
                if (list != null && obj != null && list.size() == ((List) (obj)).size())
                {
                    for (int i = 0; i < list.size(); i++)
                    {
                        qz qz1 = new qz(h);
                        qz1.V = 2;
                        qz1.K = (String)list.get(i);
                        if (qz1.K != null)
                        {
                            Map map = (Map)((List) (obj)).get(i);
                            qz1.M = ((Float)map.get("x")).floatValue() / 100F;
                            qz1.N = ((Float)map.get("y")).floatValue() / 100F;
                            qz1.l = ((Float)map.get("angle")).floatValue();
                            qz1.O = ((Float)map.get("scale")).floatValue() / 100F;
                            D.a(qz1);
                        }
                    }

                }
                obj = ih.C().X();
                if (obj != null && ((List) (obj)).size() != 0)
                {
                    rc rc1 = com.roidapp.photogrid.release.rc.a(h);
                    HashMap hashmap = rc1.a();
                    int j = hashmap.size();
                    int l = rc1.a.size();
                    for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext();)
                    {
                        m m1 = (m)((Iterator) (obj)).next();
                        Object obj2 = m1.a;
                        if (obj2 != null)
                        {
                            obj2 = new ra(h, ((String) (obj2)));
                            obj2.an = true;
                            obj2.c = n;
                            obj2.d = o;
                            obj2.ae = m1.g;
                            obj2.af = m1.h;
                            obj2.ah = m1.i;
                            obj2.ao = m1.l;
                            obj2.ap = m1.m;
                            obj2.aq = true;
                            obj2.ar = m1.n;
                            float f1;
                            float f3;
                            boolean flag;
                            if (m1.n != 1)
                            {
                                obj2.P = 3;
                                obj2.ar = m1.n;
                            } else
                            {
                                obj2.P = 1;
                            }
                            flag = m1.u;
                            obj2.ag = flag;
                            if (flag)
                            {
                                obj2.au = m1.q;
                                obj2.av = m1.r;
                                obj2.aw = m1.s;
                                obj2.ax = m1.t;
                            } else
                            {
                                obj2.au = 0.0F;
                                obj2.av = m1.r;
                                obj2.aw = m1.s;
                                obj2.ax = m1.t;
                            }
                            if (m1.o == 1)
                            {
                                obj2.K = android.text.Layout.Alignment.ALIGN_NORMAL;
                            } else
                            if (m1.o == 2)
                            {
                                obj2.K = android.text.Layout.Alignment.ALIGN_CENTER;
                            } else
                            if (m1.o == 3)
                            {
                                obj2.K = android.text.Layout.Alignment.ALIGN_OPPOSITE;
                            }
                            obj2.as = m1.p;
                            obj2.aj = m1.k;
                            if (m1.f <= j - 1)
                            {
                                obj2.J = (Typeface)hashmap.get(Integer.valueOf(m1.f + l));
                            }
                            obj2.ad = m1.j;
                            ((ra) (obj2)).b(n, o);
                            ((ra) (obj2)).g();
                            ((ra) (obj2)).l();
                            f1 = ((float)n * m1.b) / 100F - (float)(((ra) (obj2)).c() / 2);
                            f3 = ((float)o * m1.c) / 100F - (float)(((ra) (obj2)).d() / 2);
                            ((ra) (obj2)).a(0.0F, 0.0F);
                            ((ra) (obj2)).b(m1.e);
                            ((ra) (obj2)).c(m1.d / 100F);
                            if (m1.v)
                            {
                                ((ra) (obj2)).c(f1, f3);
                            } else
                            {
                                ((ra) (obj2)).b(f1, f3);
                            }
                            z.add(0, obj2);
                        }
                    }

                }
            }
            Iterator iterator1;
            int k;
            int i1;
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
            k = D.getLayoutParams().width;
            i1 = D.getLayoutParams().height;
            iterator1 = D.e().iterator();
            while (iterator1.hasNext()) 
            {
                Object obj1 = (ao)iterator1.next();
                if (obj1 instanceof ra)
                {
                    ra ra1 = (ra)obj1;
                    float f2 = ra1.j;
                    float f4 = ra1.k;
                    float f5 = (float)k / (float)ra1.c;
                    float f6 = (float)i1 / (float)ra1.d;
                    ra1.c = k;
                    ra1.d = i1;
                    ra1.i();
                    ra1.b(-f2, -f4);
                    ra1.b(ra1.h * f5, ra1.l, f2 * f5, f6 * f4);
                    ((ra)obj1).j();
                    obj1.f = false;
                } else
                if (obj1 instanceof qz)
                {
                    obj1 = (qz)obj1;
                    if (((qz) (obj1)).c > 0 && ((qz) (obj1)).d > 0)
                    {
                        obj1.j = ((qz) (obj1)).j * ((float)k / (float)((qz) (obj1)).c);
                        obj1.k = ((qz) (obj1)).k * ((float)i1 / (float)((qz) (obj1)).d);
                    }
                    obj1.c = k;
                    obj1.d = i1;
                    ((qz) (obj1)).g();
                }
            }
        }
    }

    private void n()
    {
        if (y == null) goto _L2; else goto _L1
_L1:
        Object obj;
        if (!G)
        {
            break MISSING_BLOCK_LABEL_113;
        }
        obj = new ArrayList();
        ArrayList arraylist = y;
        arraylist;
        JVM INSTR monitorenter ;
        Object obj1 = y.iterator();
_L4:
        ic ic1;
        do
        {
            if (!((Iterator) (obj1)).hasNext())
            {
                break MISSING_BLOCK_LABEL_87;
            }
            ic1 = (ic)((Iterator) (obj1)).next();
        } while (ic1 == null);
        ((List) (obj)).add(ic1.b);
        ic1.a();
        if (true) goto _L4; else goto _L3
_L3:
        obj;
        arraylist;
        JVM INSTR monitorexit ;
        throw obj;
        if (((List) (obj)).size() > 0)
        {
            ih.C().m(((List) (obj)));
        }
        y.clear();
        arraylist;
        JVM INSTR monitorexit ;
_L2:
        return;
        G = true;
        arraylist = y;
        arraylist;
        JVM INSTR monitorenter ;
        obj = y.iterator();
_L6:
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break MISSING_BLOCK_LABEL_168;
            }
            obj1 = (ic)((Iterator) (obj)).next();
        } while (obj1 == null);
        ((ic) (obj1)).a();
        if (true) goto _L6; else goto _L5
_L5:
        Exception exception;
        exception;
        arraylist;
        JVM INSTR monitorexit ;
        throw exception;
        y.clear();
        arraylist;
        JVM INSTR monitorexit ;
    }

    public final void a()
    {
        float f1;
        float f2;
        float f3;
        float f4;
        Object obj;
        int j;
        int k;
        try
        {
            n();
            l.a(11, 0);
            if (this.j != null)
            {
                this.j.removeAllViews();
            }
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
        if (obj == null) goto _L2; else goto _L1
_L1:
        com.roidapp.photogrid.common.a.a();
        if (!com.roidapp.photogrid.common.a.a(h, "grid", true) || com.roidapp.photogrid.a.m.a(h) == 1) goto _L4; else goto _L3
_L3:
        if (az.B) goto _L6; else goto _L5
_L5:
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
_L2:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_1106;
        }
        if (((View) (obj)).getVisibility() != 0)
        {
            break MISSING_BLOCK_LABEL_1106;
        }
        obj = ((View) (obj)).findViewById(0x7f0d0086);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_286;
        }
        j = ((View) (obj)).getLayoutParams().height;
        if (j > 0)
        {
            f1 = j;
        }
_L14:
        float f5 = h.getResources().getDimension(0x7f0900cb);
        j = (int)((float)x - f3 - f4 - f1 - f5 - (float)az.g);
        if (f2 >= (float)w / (float)j) goto _L8; else goto _L7
_L7:
        k = (int)((float)j * f2);
_L10:
        k = (int)((float)k * C);
        j = (int)((float)j * C);
        this.j = (ViewGroup)LayoutInflater.from(h).inflate(0x7f03000c, null);
        obj = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        obj.width = k;
        obj.height = j;
        this.j.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        this.k = (RelativeLayout)this.j.findViewById(0x7f0d0061);
        p = (LinearLayout)this.j.findViewById(0x7f0d0060);
        p.removeAllViews();
        q = null;
        l.a(12, 0);
        if (this.k == null)
        {
            com.roidapp.photogrid.common.c.a("192", h);
            return;
        }
          goto _L9
_L6:
        ((View) (obj)).setVisibility(8);
          goto _L2
_L4:
        ((View) (obj)).setVisibility(8);
          goto _L2
_L8:
        k = w;
        j = (int)((float)k / f2);
          goto _L10
_L9:
        j = this.k.getLayoutParams().width;
        j = this.k.getLayoutParams().height;
        if (!ih.C().ay()) goto _L12; else goto _L11
_L11:
        com.roidapp.photogrid.release.rf.a();
        com.roidapp.photogrid.release.rf.a(y, this.i.length);
_L13:
        l.a(13, 0);
        a(this.k);
        l.a(14, 0);
        n = p.getLayoutParams().width;
        o = p.getLayoutParams().height;
        if (q == null)
        {
            q = new an(h, n, o);
            q.c(ih.C().B());
            q.a(r, s, t, u);
        }
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
        (new Thread(new mt(this, this.j.getLayoutParams().width, this.j.getLayoutParams().height))).start();
        l.a(21, 0);
        return;
_L12:
label0:
        {
            if (ih.C().aL() == null || !ih.C().aM())
            {
                break label0;
            }
            com.roidapp.photogrid.release.rf.a();
            com.roidapp.photogrid.release.rf.a(y, ih.C().aL());
            ih.C().k(null);
            ih.C().r(false);
        }
          goto _L13
        com.roidapp.photogrid.release.rf.a();
        com.roidapp.photogrid.release.rf.a(h, y, B, m, this.i.length);
          goto _L13
        f1 = 0.0F;
          goto _L14
    }

    public final void a(RelativeLayout relativelayout, android.view.View.OnTouchListener ontouchlistener)
    {
        if (H)
        {
            return;
        }
        l.a(74, 0);
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
        } else
        {
            l.sendEmptyMessage(7);
            return;
        }
    }

    public final int b(boolean flag)
    {
        if (flag)
        {
            return B.length;
        }
        int i = ih.C().aA();
        if (i >= B.length - 1)
        {
            return 0;
        } else
        {
            return i + 1;
        }
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
        this.i[i].c();
        this.i[j].c();
        Object obj = this.i[i].a();
        lc lc1 = this.i[i].y.a();
        this.i[i] = this.i[j];
        this.i[j] = ((ig) (obj));
        this.i[j].y = this.i[i].y;
        this.i[i].y = lc1;
        obj = Message.obtain();
        obj.what = 2;
        obj.arg1 = i;
        obj.arg2 = j;
        K.sendMessage(((Message) (obj)));
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
        if1.b(if1.d);
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
        if (y == null || y.size() == 0)
        {
            return;
        }
        com.roidapp.photogrid.common.b.a("Exchange");
        ic ic1 = (ic)y.get(i);
        ic ic2 = (ic)y.get(j);
        if if1 = (if)this.j.findViewById(i + 1);
        if if2 = (if)this.j.findViewById(j + 1);
        android.graphics.Bitmap bitmap = if1.d;
        ic1.a = if2.d;
        ic2.a = bitmap;
        if1.c = this.i[i];
        if2.c = this.i[j];
        if1.C = if1.c.B;
        if2.C = if2.c.B;
        try
        {
            ic1.a(h, this.i[i], ic1.d, ic1.e);
            ic2.a(h, this.i[j], ic2.d, ic2.e);
        }
        catch (OutOfMemoryError outofmemoryerror)
        {
            outofmemoryerror.printStackTrace();
            l.sendEmptyMessage(15);
            d(161);
            return;
        }
        if1.b(ic1.a);
        if1.a(ic1.a);
        if2.b(ic2.a);
        if2.a(ic2.a);
        l.sendEmptyMessage(15);
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
        if (E != null && E.a().size() > 0)
        {
            A.addAll(E.a());
            ih.C().e(A);
            E.a().clear();
        }
    }
}
