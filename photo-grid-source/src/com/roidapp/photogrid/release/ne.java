// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.roidapp.baselib.gl.c;
import com.roidapp.cloudlib.template.e;
import com.roidapp.cloudlib.template.m;
import com.roidapp.imagelib.ImageLibrary;
import com.roidapp.imagelib.b.b;
import com.roidapp.imagelib.b.d;
import com.roidapp.imagelib.filter.bi;
import com.roidapp.photogrid.common.a;
import com.roidapp.photogrid.common.aj;
import com.roidapp.photogrid.common.az;
import com.roidapp.photogrid.common.bc;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jp.co.cyberagent.android.gpuimage.GPUImageView;
import org.xmlpull.v1.XmlPullParserException;

// Referenced classes of package com.roidapp.photogrid.release:
//            mm, ih, ml, PhotoGridActivity, 
//            ig, rf, ic, lc, 
//            qz, PhotoView, ao, ps, 
//            az, ra, rc, an, 
//            mp, ck, nf, if

public final class ne extends mm
    implements jp.co.cyberagent.android.gpuimage.GPUImageView.OnPictureSavedListener
{

    private bi L;
    private b M;
    private boolean N;
    private boolean O;
    private int P;
    private int Q;
    private GPUImageView R;

    public ne(boolean flag, Activity activity, ig aig[], ml ml1, PhotoView photoview, com.roidapp.photogrid.release.az az1)
    {
        M = new b();
        F = flag;
        h = activity;
        this.i = aig;
        l = ml1;
        D = photoview;
        E = az1;
        photoview = ih.C();
        if (flag)
        {
            photoview.d(0.0F);
            photoview.e(0.0F);
            photoview.f(0.0F);
            photoview.g(false);
            photoview.d(false);
            photoview.c(0);
            photoview.f(false);
            if (photoview.aI())
            {
                int i = aj.a().a[this.i.length - 1];
                photoview.k(0);
                photoview.i(i);
                photoview.r(i);
            } else
            {
                photoview.i(0);
                photoview.r(0);
            }
            if (bc.a(activity) && ih.C().h() && aig != null && aig.length > 1)
            {
                ml1.sendEmptyMessage(22);
            }
        } else
        if (photoview.w() != null)
        {
            z = photoview.w();
        }
        if (!photoview.h()) goto _L2; else goto _L1
_L1:
        m = photoview.I();
        this.i.length;
        JVM INSTR tableswitch 1 15: default 272
    //                   1 437
    //                   2 450
    //                   3 463
    //                   4 476
    //                   5 489
    //                   6 502
    //                   7 515
    //                   8 528
    //                   9 541
    //                   10 554
    //                   11 567
    //                   12 580
    //                   13 593
    //                   14 606
    //                   15 619;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18
_L18:
        break MISSING_BLOCK_LABEL_619;
_L3:
        B = new int[0];
_L2:
        s = photoview.x();
        t = photoview.y();
        u = photoview.z();
        A = photoview.m();
        aig = (PhotoGridActivity)activity;
        com.roidapp.baselib.gl.c.a();
        if (com.roidapp.baselib.gl.c.b(aig))
        {
            L = new bi(activity);
            if (L != null)
            {
                L.c(true);
            }
            N = true;
            if (com.roidapp.baselib.gl.c.a().c())
            {
                O = true;
                activity = photoview.o();
                int j;
                if (activity != null)
                {
                    j = activity.size();
                } else
                {
                    j = 0;
                }
                Q = j;
                return;
            } else
            {
                O = false;
                return;
            }
        } else
        {
            N = false;
            return;
        }
_L4:
        B = aj.a().b;
          goto _L2
_L5:
        B = aj.a().c;
          goto _L2
_L6:
        B = aj.a().d;
          goto _L2
_L7:
        B = aj.a().e;
          goto _L2
_L8:
        B = aj.a().f;
          goto _L2
_L9:
        B = aj.a().g;
          goto _L2
_L10:
        B = aj.a().h;
          goto _L2
_L11:
        B = aj.a().i;
          goto _L2
_L12:
        B = aj.a().j;
          goto _L2
_L13:
        B = aj.a().k;
          goto _L2
_L14:
        B = aj.a().l;
          goto _L2
_L15:
        B = aj.a().m;
          goto _L2
_L16:
        B = aj.a().n;
          goto _L2
_L17:
        B = aj.a().o;
          goto _L2
        B = aj.a().p;
          goto _L2
    }

    private void a(int i, Bitmap bitmap)
    {
        Object obj = (new StringBuilder()).append(ImageLibrary.a().a(h));
        ImageLibrary.a();
        obj = ((StringBuilder) (obj)).append(ImageLibrary.b()).toString();
        String s = (new StringBuilder("tmp_")).append(Calendar.getInstance().getTimeInMillis()).append(".png").toString();
        try
        {
            bitmap = com.roidapp.imagelib.b.d.a(bitmap, ((String) (obj)), s, android.graphics.Bitmap.CompressFormat.PNG);
            this.i[i].b = bitmap.getPath();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Bitmap bitmap)
        {
            p();
        }
        d(149);
        bitmap.printStackTrace();
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

    static void a(ne ne1, int i, Bitmap bitmap)
    {
        e e1;
        List list = ih.C().o();
        if (list == null || (e)list.get(i) == null || ne1.L == null || ne1.i[i].b != null || az.q != 4)
        {
            break MISSING_BLOCK_LABEL_185;
        }
        e1 = (e)list.get(i);
        FileInputStream fileinputstream1 = new FileInputStream(e1.b);
        FileInputStream fileinputstream = fileinputstream1;
        ne1.L.c(e1.a);
        fileinputstream = fileinputstream1;
        ne1.L.a(fileinputstream1);
        fileinputstream = fileinputstream1;
        ne1.L.a(e1.c);
        fileinputstream = fileinputstream1;
        ne1.L.b(e1.d);
        fileinputstream = fileinputstream1;
        ((ic)ne1.y.get(i)).a = ne1.L.a(bitmap);
        fileinputstream = fileinputstream1;
        ne1.a(i, ((ic)ne1.y.get(i)).a);
        fileinputstream1.close();
_L2:
        return;
        ne1;
        ne1.printStackTrace();
        return;
        bitmap;
        fileinputstream1 = null;
_L11:
        fileinputstream = fileinputstream1;
        ne1.p();
        fileinputstream = fileinputstream1;
        ne1.d(150);
        fileinputstream = fileinputstream1;
        bitmap.printStackTrace();
        if (fileinputstream1 == null) goto _L2; else goto _L1
_L1:
        try
        {
            fileinputstream1.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ne ne1)
        {
            ne1.printStackTrace();
        }
        return;
        bitmap;
        fileinputstream1 = null;
_L10:
        fileinputstream = fileinputstream1;
        ne1.p();
        fileinputstream = fileinputstream1;
        ne1.d(151);
        fileinputstream = fileinputstream1;
        bitmap.printStackTrace();
        if (fileinputstream1 == null) goto _L2; else goto _L3
_L3:
        try
        {
            fileinputstream1.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ne ne1)
        {
            ne1.printStackTrace();
        }
        return;
        bitmap;
        fileinputstream1 = null;
_L9:
        fileinputstream = fileinputstream1;
        ne1.p();
        fileinputstream = fileinputstream1;
        ne1.d(152);
        fileinputstream = fileinputstream1;
        bitmap.printStackTrace();
        if (fileinputstream1 == null) goto _L2; else goto _L4
_L4:
        try
        {
            fileinputstream1.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ne ne1)
        {
            ne1.printStackTrace();
        }
        return;
        bitmap;
        fileinputstream1 = null;
_L8:
        fileinputstream = fileinputstream1;
        ne1.p();
        fileinputstream = fileinputstream1;
        ne1.d(153);
        fileinputstream = fileinputstream1;
        bitmap.printStackTrace();
        if (fileinputstream1 == null) goto _L2; else goto _L5
_L5:
        try
        {
            fileinputstream1.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ne ne1)
        {
            ne1.printStackTrace();
        }
        return;
        ne1;
        fileinputstream = null;
_L7:
        if (fileinputstream != null)
        {
            try
            {
                fileinputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (Bitmap bitmap)
            {
                bitmap.printStackTrace();
            }
        }
        throw ne1;
        ne1;
        if (true) goto _L7; else goto _L6
_L6:
        bitmap;
          goto _L8
        bitmap;
          goto _L9
        bitmap;
          goto _L10
        bitmap;
          goto _L11
    }

    static boolean a(ne ne1)
    {
        return ne1.O;
    }

    static void b(ne ne1)
    {
        ne1.p();
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

    private void n()
    {
        if (D != null)
        {
            if (F)
            {
                List list = ih.C().p();
                List list1 = ih.C().q();
                if (list != null && list1 != null && list.size() == list1.size())
                {
                    new com.roidapp.cloudlib.template.c();
                    for (int i = 0; i < list.size(); i++)
                    {
                        qz qz1 = new qz(h);
                        qz1.V = 2;
                        String s1 = (String)list.get(i);
                        String s = s1;
                        if (s1 != null)
                        {
                            s = s1;
                            if (s1.indexOf("${PIC_WEATHER}") >= 0)
                            {
                                s = s1.replace("${PIC_WEATHER}", "sunny.png");
                                if (!"sunny.png".equals("sunny.png") && !(new File(s)).exists())
                                {
                                    s = s1.replace("${PIC_WEATHER}", "sunny.png");
                                }
                            }
                        }
                        qz1.K = s;
                        if (qz1.K != null)
                        {
                            Map map = (Map)list1.get(i);
                            qz1.M = ((Float)map.get("x")).floatValue() / 100F;
                            qz1.N = ((Float)map.get("y")).floatValue() / 100F;
                            qz1.l = ((Float)map.get("angle")).floatValue();
                            qz1.O = ((Float)map.get("scale")).floatValue() / 100F;
                            z.add(0, qz1);
                        }
                    }

                }
                o();
            }
            Iterator iterator1;
            int j;
            int k;
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
            j = D.getLayoutParams().width;
            k = D.getLayoutParams().height;
            iterator1 = D.e().iterator();
            while (iterator1.hasNext()) 
            {
                Object obj = (ao)iterator1.next();
                if (obj instanceof ra)
                {
                    ra ra1 = (ra)obj;
                    float f1 = ra1.j;
                    float f2 = ra1.k;
                    float f3 = (float)j / (float)ra1.c;
                    float f4 = (float)k / (float)ra1.d;
                    ra1.c = j;
                    ra1.d = k;
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
                        obj.j = ((qz) (obj)).j * ((float)j / (float)((qz) (obj)).c);
                        obj.k = ((qz) (obj)).k * ((float)k / (float)((qz) (obj)).d);
                    }
                    obj.c = j;
                    obj.d = k;
                    ((qz) (obj)).g();
                }
            }
        }
    }

    private void o()
    {
        Object obj1 = ih.C().X();
        if (obj1 != null && ((List) (obj1)).size() != 0)
        {
            Object obj = com.roidapp.photogrid.release.rc.a(h);
            HashMap hashmap = ((rc) (obj)).a();
            int i = hashmap.size();
            int j = ((rc) (obj)).a.size();
            obj = new com.roidapp.cloudlib.template.c();
            for (obj1 = ((List) (obj1)).iterator(); ((Iterator) (obj1)).hasNext();)
            {
                m m1 = (m)((Iterator) (obj1)).next();
                Object obj2 = ((com.roidapp.cloudlib.template.c) (obj)).a(h, m1.a);
                if (obj2 != null)
                {
                    obj2 = new ra(h, ((String) (obj2)));
                    obj2.c = n;
                    obj2.d = o;
                    obj2.an = true;
                    obj2.ae = m1.g;
                    obj2.af = m1.h;
                    obj2.ah = m1.i;
                    obj2.ao = m1.l;
                    obj2.ap = m1.m;
                    obj2.aq = true;
                    obj2.ar = m1.n;
                    float f1;
                    float f2;
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
                    if (m1.f <= i - 1)
                    {
                        obj2.J = (Typeface)hashmap.get(Integer.valueOf(m1.f + j));
                        obj2.M = m1.f;
                    }
                    obj2.ad = m1.j;
                    ((ra) (obj2)).b(n, o);
                    ((ra) (obj2)).g();
                    ((ra) (obj2)).l();
                    f1 = ((float)n * m1.b) / 100F - (float)(((ra) (obj2)).c() / 2);
                    f2 = ((float)o * m1.c) / 100F - (float)(((ra) (obj2)).d() / 2);
                    ((ra) (obj2)).a(0.0F, 0.0F);
                    ((ra) (obj2)).b(m1.e);
                    ((ra) (obj2)).c(m1.d / 100F);
                    if (m1.v)
                    {
                        ((ra) (obj2)).c(f1, f2);
                    } else
                    {
                        ((ra) (obj2)).b(f1, f2);
                    }
                    z.add(0, obj2);
                }
            }

        }
    }

    private void p()
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
            p();
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
            p();
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
        if (!com.roidapp.photogrid.common.a.a(h, "template", true) || com.roidapp.photogrid.a.m.a(h) == 1) goto _L4; else goto _L3
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
            break MISSING_BLOCK_LABEL_1233;
        }
        if (((View) (obj)).getVisibility() != 0)
        {
            break MISSING_BLOCK_LABEL_1233;
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
_L19:
        float f5 = h.getResources().getDimension(0x7f0900cb);
        j = (int)((float)x - f3 - f4 - f1 - f5 - (float)az.g);
        if (f2 >= (float)w / (float)j) goto _L8; else goto _L7
_L7:
        k = (int)((float)j * f2);
_L15:
        k = (int)((float)k * C);
        j = (int)((float)j * C);
        this.j = (RelativeLayout)LayoutInflater.from(h).inflate(0x7f03000c, null);
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
        if (!ih.C().h()) goto _L10; else goto _L9
_L9:
        if (!ih.C().ay()) goto _L12; else goto _L11
_L11:
        com.roidapp.photogrid.release.rf.a();
        com.roidapp.photogrid.release.rf.a(y, this.i.length);
_L16:
        l.a(13, 0);
        a(this.k);
        l.a(14, 0);
        n = p.getLayoutParams().width;
        o = p.getLayoutParams().height;
        if (ih.C().e() != null) goto _L14; else goto _L13
_L13:
        if (q == null)
        {
            q = new an(h, n, o);
            q.c(ih.C().B());
            q.a(r, s, t, u);
        }
_L18:
        l.a(16, 0);
        obj = (ck)v.c("FragmentBorder");
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_705;
        }
        ((ck) (obj)).a();
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
        n();
        l.a(19, 0);
        d(this.k.getLayoutParams().width, this.k.getLayoutParams().height);
        l.a(20, 0);
        (new Thread(new nf(this, this.j.getLayoutParams().width, this.j.getLayoutParams().height))).start();
        return;
_L6:
        ((View) (obj)).setVisibility(8);
          goto _L2
_L4:
        ((View) (obj)).setVisibility(8);
          goto _L2
_L8:
        k = w;
        j = (int)((float)k / f2);
          goto _L15
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
          goto _L16
        com.roidapp.photogrid.release.rf.a();
        com.roidapp.photogrid.release.rf.a(h, y, B, m, this.i.length);
          goto _L16
_L10:
        if (ih.C().aL() != null && ih.C().aM())
        {
            ih.C().k(null);
            ih.C().r(false);
        }
        com.roidapp.photogrid.release.rf.a();
        com.roidapp.photogrid.release.rf.a(h, y, B, -1, this.i.length);
          goto _L16
_L14:
        if (q != null && az.q != 4) goto _L18; else goto _L17
_L17:
        q = new an(h, n, o);
        q.c(ih.C().B());
        q.a(ih.C().e(), ih.C().f());
          goto _L18
        f1 = 0.0F;
          goto _L19
    }

    public final void a(RelativeLayout relativelayout, android.view.View.OnTouchListener ontouchlistener)
    {
        if (!H)
        {
            if (R != null)
            {
                R.removeAllViews();
                relativelayout.removeView(R);
                R = null;
            }
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
                            obj = (if)this.k.findViewById(i + 1);
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
                            this.j.addView(E);
                        }
                        if (D != null)
                        {
                            obj = (ViewGroup)D.getParent();
                            if (obj != null)
                            {
                                ((ViewGroup) (obj)).removeView(D);
                            }
                            this.j.addView(D);
                        }
                        obj = (android.widget.RelativeLayout.LayoutParams)relativelayout.getLayoutParams();
                        ((android.widget.RelativeLayout.LayoutParams) (obj)).setMargins(0, 0, 0, (int)h.getResources().getDimension(0x7f09010a));
                        relativelayout.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
                        relativelayout.removeAllViews();
                        relativelayout.addView(this.j);
                        this.k.setOnTouchListener(ontouchlistener);
                        return;
                    }
                    float f1 = ((ic)y.get(i)).d;
                    f1 = (((ic)y.get(i)).b.l * f1) / 100F;
                    float f2 = ((ic)y.get(i)).e;
                    f2 = (((ic)y.get(i)).b.m * f2) / 100F;
                    Bitmap bitmap = ((ic)y.get(i)).a;
                    if (bitmap != null && !bitmap.isRecycled())
                    {
                        ((if) (obj)).b(bitmap);
                        if (O)
                        {
                            int j = bitmap.getWidth();
                            int k = bitmap.getHeight();
                            f1 /= j;
                            f2 /= k;
                            if (f1 > f2)
                            {
                                ((if) (obj)).b(f1);
                            } else
                            {
                                ((if) (obj)).b(f2);
                            }
                        }
                        ((if) (obj)).a(bitmap);
                    }
                    l.a(i * 2 + 76, 0);
                    i++;
                } while (true);
            }
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
        p();
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
        a(this.k);
        d(this.k.getLayoutParams().width, this.k.getLayoutParams().height);
        if (y.size() != this.i.length) goto _L2; else goto _L1
_L1:
        int j = 0;
_L7:
        if (j >= this.i.length) goto _L2; else goto _L3
_L3:
        if if1 = (if)this.k.findViewById(j + 1);
        if (if1 != null) goto _L5; else goto _L4
_L4:
        a();
_L2:
        return;
_L5:
        float f1 = ((ic)y.get(j)).d;
        f1 = (((ic)y.get(j)).b.l * f1) / 100F;
        float f2 = ((ic)y.get(j)).e;
        f2 = (((ic)y.get(j)).b.m * f2) / 100F;
        if1.b(((ic)y.get(j)).a);
        boolean flag;
        if (O)
        {
            int k = ((ic)y.get(j)).a.getWidth();
            int l = ((ic)y.get(j)).a.getHeight();
            f1 /= k;
            f2 /= l;
            if (f1 > f2)
            {
                if1.b(f1);
            } else
            {
                if1.b(f2);
            }
        }
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
        Bitmap bitmap = if1.d;
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

    public final void m()
    {
        Object obj = ih.C().o();
        if (obj == null) goto _L2; else goto _L1
_L1:
        int i = ((List) (obj)).size();
        if (P < i) goto _L4; else goto _L3
_L3:
        l.sendEmptyMessage(3);
_L8:
        return;
_L4:
        if ((e)((List) (obj)).get(P) == null || L == null || this.i[P].b != null) goto _L6; else goto _L5
_L5:
        if (az.q != 4) goto _L8; else goto _L7
_L7:
        Object obj2 = (e)((List) (obj)).get(P);
        Object obj1;
        obj = ((ic)y.get(P)).a;
        obj1 = new FileInputStream(((e) (obj2)).b);
        L.c(((e) (obj2)).a);
        L.a(((InputStream) (obj1)));
        L.a(((e) (obj2)).c);
        L.b(((e) (obj2)).d);
        int j = ((Bitmap) (obj)).getWidth();
        int k = ((Bitmap) (obj)).getHeight();
        j = Math.round(180F / ((float)j / (float)k));
        R = new GPUImageView(h);
        ((ViewGroup)((PhotoGridActivity)h).findViewById(0x7f0d03e9)).addView(R);
        obj2 = new android.widget.RelativeLayout.LayoutParams(1, 1);
        R.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj2)));
        R.setGalaxyYSeries(O);
        R.setVisibility(0);
        R.setFilter(L.a(L.f(), 180, j, L.g(), false));
        R.deleteImage();
        R.setImage(((Bitmap) (obj)));
        R.forceLayout();
        R.saveToPictures(null, null, 180, j, this);
        try
        {
            ((InputStream) (obj1)).close();
            return;
        }
        catch (IOException ioexception)
        {
            ioexception.printStackTrace();
        }
        return;
        obj1;
        ioexception = null;
_L12:
        p();
        d(150);
        ((FileNotFoundException) (obj1)).printStackTrace();
        if (ioexception == null) goto _L8; else goto _L9
_L9:
        try
        {
            ioexception.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (IOException ioexception)
        {
            ioexception.printStackTrace();
        }
        return;
        ioexception;
        obj1 = null;
_L11:
        if (obj1 != null)
        {
            try
            {
                ((InputStream) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                ((IOException) (obj1)).printStackTrace();
            }
        }
        throw ioexception;
_L6:
        P = P + 1;
        if (P < Q)
        {
            l.sendEmptyMessage(17);
            return;
        } else
        {
            l.sendEmptyMessage(3);
            return;
        }
_L2:
        l.sendEmptyMessage(3);
        return;
        ioexception;
        continue; /* Loop/switch isn't completed */
        Object obj3;
        obj3;
        obj1 = ioexception;
        ioexception = ((IOException) (obj3));
        if (true) goto _L11; else goto _L10
_L10:
        obj3;
        ioexception = ((IOException) (obj1));
        obj1 = obj3;
          goto _L12
    }

    public final void onPictureSaved(Bitmap bitmap)
    {
        ((ic)y.get(P)).a = bitmap;
        a(P, bitmap);
        P = P + 1;
        if (P >= Q)
        {
            l.sendEmptyMessage(3);
            return;
        } else
        {
            l.sendEmptyMessage(17);
            return;
        }
    }
}
