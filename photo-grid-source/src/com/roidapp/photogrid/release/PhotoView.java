// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.app.AlertDialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.DrawFilter;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.RectF;
import android.support.v4.view.MotionEventCompat;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import com.roidapp.baselib.gl.c;
import com.roidapp.photogrid.common.az;
import com.roidapp.photogrid.common.bp;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;

// Referenced classes of package com.roidapp.photogrid.release:
//            PhotoGridActivity, pr, id, ra, 
//            ao, qz, ps, if, 
//            ih, lc, pq, pl, 
//            pk, pm, pn, po, 
//            pp, db, dj, mm

public class PhotoView extends View
{

    private Paint A;
    private Timer B;
    private boolean C;
    private DrawFilter D;
    private boolean E;
    private boolean F;
    private boolean G;
    private long H;
    private boolean I;
    private List J;
    private int K;
    private int L;
    private int M;
    private int N;
    private int O;
    private int P;
    private id Q;
    private if R;
    private RelativeLayout S;
    private boolean T;
    public boolean a;
    protected int b;
    private PhotoGridActivity c;
    private List d;
    private List e;
    private List f;
    private List g;
    private float h;
    private final int i;
    private int j;
    private float k;
    private float l;
    private boolean m;
    private Bitmap n;
    private Point o;
    private Bitmap p;
    private Bitmap q;
    private Bitmap r;
    private RectF s;
    private RectF t;
    private RectF u;
    private Paint v;
    private int w;
    private long x;
    private float y;
    private Paint z;

    public PhotoView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        d = new ArrayList();
        e = new ArrayList();
        f = new ArrayList();
        g = new ArrayList();
        h = 1.0F;
        i = 2;
        k = 0.0F;
        l = 0.0F;
        m = false;
        o = null;
        s = new RectF();
        t = new RectF();
        u = new RectF();
        b = -1;
        w = -1;
        x = 0L;
        y = 3F;
        z = new Paint();
        A = new Paint();
        boolean flag;
        if (az.q == 8)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        C = flag;
        D = new PaintFlagsDrawFilter(0, 7);
        E = true;
        F = false;
        G = true;
        I = false;
        J = new ArrayList();
        T = false;
        p();
    }

    public PhotoView(PhotoGridActivity photogridactivity)
    {
        super(photogridactivity);
        d = new ArrayList();
        e = new ArrayList();
        f = new ArrayList();
        g = new ArrayList();
        h = 1.0F;
        i = 2;
        k = 0.0F;
        l = 0.0F;
        m = false;
        o = null;
        s = new RectF();
        t = new RectF();
        u = new RectF();
        b = -1;
        w = -1;
        x = 0L;
        y = 3F;
        z = new Paint();
        A = new Paint();
        boolean flag;
        if (az.q == 8)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        C = flag;
        D = new PaintFlagsDrawFilter(0, 7);
        E = true;
        F = false;
        G = true;
        I = false;
        J = new ArrayList();
        T = false;
        c = photogridactivity;
        p();
        z.setStyle(android.graphics.Paint.Style.STROKE);
        z.setColor(0xc0d7d7d7);
        A.setAntiAlias(true);
        A.setStyle(android.graphics.Paint.Style.FILL);
        y = photogridactivity.getResources().getDisplayMetrics().density * 2.0F;
        if (y < 2.0F)
        {
            y = 2.0F;
        }
        z.setStrokeWidth(y);
        pr.a().a(d);
    }

    private static float a(float f1, float f2, float f3, float f4)
    {
        f1 -= f3;
        f2 -= f4;
        return (float)Math.sqrt(f1 * f1 + f2 * f2);
    }

    private static float a(PointF pointf, PointF pointf1)
    {
        double d1 = 1.0D;
        float f1 = pointf.x - pointf1.x;
        float f2 = pointf.y - pointf1.y;
        double d2 = (double)f1 / Math.sqrt(f1 * f1 + f2 * f2);
        float f3;
        if (d2 <= 1.0D)
        {
            if (d2 < -1D)
            {
                d1 = -1D;
            } else
            {
                d1 = d2;
            }
        }
        f3 = (float)((Math.asin(d1) * 180D) / 3.1415926535897931D);
        if (f1 >= 0.0F && f2 <= 0.0F)
        {
            return 360F - f3;
        }
        if (f1 <= 0.0F && f2 <= 0.0F)
        {
            return -f3;
        }
        if (f1 <= 0.0F && f2 >= 0.0F)
        {
            return f3 + 180F;
        }
        if (f1 >= 0.0F && f2 >= 0.0F)
        {
            return f3 + 180F;
        } else
        {
            return 0.0F;
        }
    }

    static PhotoGridActivity a(PhotoView photoview)
    {
        return photoview.c;
    }

    private void a(Canvas canvas, PointF pointf, int i1, Paint paint)
    {
        boolean flag = false;
        int k1 = (int)((float)i1 / y);
        float f1 = pointf.x - (float)(i1 / 2);
        for (int j1 = 0; j1 < k1; j1++)
        {
            if (j1 % 2 == 0)
            {
                canvas.drawLine(f1 + y * (float)j1, pointf.y, f1 + y * (float)(j1 + 1), pointf.y, paint);
            }
        }

        f1 = pointf.y - (float)(i1 / 2);
        for (i1 = ((flag) ? 1 : 0); i1 < k1; i1++)
        {
            if (i1 % 2 == 0)
            {
                canvas.drawLine(pointf.x, f1 + y * (float)i1, pointf.x, f1 + y * (float)(i1 + 1), paint);
            }
        }

    }

    private void a(PointF pointf, PointF pointf1, id id1, boolean flag)
    {
        float f1 = 1.0F;
        if (az.q == 4)
        {
            f1 = 0.0F;
        }
        float f4 = (pointf.x + pointf1.x) / 2.0F;
        float f2 = (pointf.y + pointf1.y) / 2.0F;
        float f3 = O + M;
        f4 = (f4 - f1) / 100F;
        float f5 = K;
        float f6 = P + N;
        id1.a(f4 * f5 + f3, ((f2 - f1) / 100F) * (float)L + f6, flag);
    }

    private float[] a(float f1, float f2)
    {
        return (new float[] {
            f1 - (float)(p.getWidth() / 2), f2 - (float)(p.getHeight() / 2)
        });
    }

    static List b(PhotoView photoview)
    {
        return photoview.f;
    }

    private float[] b(float f1, float f2)
    {
        return (new float[] {
            f1 - (float)(r.getWidth() / 2), f2 - (float)(r.getHeight() / 2)
        });
    }

    static List c(PhotoView photoview)
    {
        return photoview.g;
    }

    static List d(PhotoView photoview)
    {
        return photoview.e;
    }

    static List e(PhotoView photoview)
    {
        return photoview.d;
    }

    private static void e(ao ao1)
    {
        if (ao1 == null) goto _L2; else goto _L1
_L1:
        if (ao1 instanceof ra) goto _L4; else goto _L3
_L3:
        float f1 = ao1.l % 90F;
        if (Math.abs(f1) >= 3F) goto _L6; else goto _L5
_L5:
        ao1.l = ao1.l - f1;
_L2:
        return;
_L6:
        if (Math.abs(f1) > 87F)
        {
            if (f1 > 0.0F)
            {
                ao1.l = (90F - f1) + ao1.l;
                return;
            } else
            {
                ao1.l = ao1.l - (f1 + 90F);
                return;
            }
        }
        continue; /* Loop/switch isn't completed */
_L4:
        float f2 = ao1.l % 90F;
        if (Math.abs(f2) < 3F)
        {
            ao1.b(-f2);
            return;
        }
        if (Math.abs(f2) > 87F)
        {
            if (f2 > 0.0F)
            {
                ao1.b(90F - f2);
                return;
            } else
            {
                ao1.b(-f2 - 90F);
                return;
            }
        }
        if (true) goto _L2; else goto _L7
_L7:
    }

    private void p()
    {
        v = new Paint();
        v.setColor(0xff0000ff);
        v.setAntiAlias(true);
    }

    private void q()
    {
        this;
        JVM INSTR monitorenter ;
        if (b == -1) goto _L2; else goto _L1
_L1:
        int i1 = 0;
_L3:
        if (i1 >= d.size())
        {
            break; /* Loop/switch isn't completed */
        }
        if (i1 != b)
        {
            ((ao)d.get(i1)).f = false;
        }
        i1++;
        if (true) goto _L3; else goto _L2
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private void r()
    {
        this;
        JVM INSTR monitorenter ;
        for (Iterator iterator = d.iterator(); iterator.hasNext(); ((ao)iterator.next()).a()) { }
        break MISSING_BLOCK_LABEL_41;
        Exception exception;
        exception;
        throw exception;
        if (n != null && !n.isRecycled())
        {
            n.recycle();
        }
        this;
        JVM INSTR monitorexit ;
    }

    public final void a()
    {
        if (d.size() > 0 && b != -1)
        {
            ((ao)d.get(b)).f = false;
            b = -1;
            invalidate();
        }
    }

    public final void a(ao ao1)
    {
        this;
        JVM INSTR monitorenter ;
        if (!(ao1 instanceof qz)) goto _L2; else goto _L1
_L1:
        g.add((qz)ao1);
_L5:
        d.add(ao1);
        q();
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (!(ao1 instanceof ps)) goto _L4; else goto _L3
_L3:
        e.add((ps)ao1);
          goto _L5
        ao1;
        throw ao1;
_L4:
        if (!(ao1 instanceof ra)) goto _L5; else goto _L6
_L6:
        f.add((ra)ao1);
          goto _L5
    }

    public final void a(if if1, RelativeLayout relativelayout, boolean flag)
    {
        Object obj = (android.widget.RelativeLayout.LayoutParams)relativelayout.getLayoutParams();
        O = ((android.widget.RelativeLayout.LayoutParams) (obj)).leftMargin;
        P = ((android.widget.RelativeLayout.LayoutParams) (obj)).topMargin;
        K = ((android.widget.RelativeLayout.LayoutParams) (obj)).width;
        L = ((android.widget.RelativeLayout.LayoutParams) (obj)).height;
        if (flag)
        {
            T = false;
            R = if1;
            S = relativelayout;
        }
        relativelayout = (android.widget.RelativeLayout.LayoutParams)if1.getLayoutParams();
        M = ((android.widget.RelativeLayout.LayoutParams) (relativelayout)).leftMargin;
        N = ((android.widget.RelativeLayout.LayoutParams) (relativelayout)).topMargin;
        float f1 = (ih.C().aR() / 100F) * (float)K;
        float f2 = (ih.C().aS() / 100F) * (float)L;
        if (J.size() == 0)
        {
            J.add(new id(c, 0));
            J.add(new id(c, 1));
            J.add(new id(c, 2));
            J.add(new id(c, 3));
        }
        Object obj2 = if1.b;
        if1 = (PointF)((lc) (obj2)).b.get(0);
        Object obj3 = (PointF)((lc) (obj2)).b.get(1);
        Object obj1 = (PointF)((lc) (obj2)).b.get(2);
        relativelayout = (PointF)((lc) (obj2)).b.get(3);
        obj = (PointF)((lc) (obj2)).c.get(0);
        PointF pointf1 = (PointF)((lc) (obj2)).c.get(1);
        PointF pointf = (PointF)((lc) (obj2)).c.get(2);
        obj2 = (PointF)((lc) (obj2)).c.get(3);
        id id1 = (id)J.get(0);
        id1.a(((PointF) (obj)), pointf1);
        id1.a(K, L, O, P);
        id1.a(f1, f2);
        if (((PointF) (obj)).y <= 0.0F || pointf1.y <= 0.0F)
        {
            id1.c = false;
        } else
        {
            id1.c = true;
            a(((PointF) (if1)), ((PointF) (obj3)), id1, flag);
        }
        id1 = (id)J.get(1);
        id1.a(pointf1, pointf);
        id1.a(K, L, O, P);
        id1.a(f1, f2);
        if (pointf1.x >= 100F || pointf.x >= 100F)
        {
            id1.c = false;
        } else
        {
            id1.c = true;
            a(((PointF) (obj3)), ((PointF) (obj1)), id1, flag);
        }
        obj3 = (id)J.get(2);
        ((id) (obj3)).a(((PointF) (obj2)), pointf);
        ((id) (obj3)).a(K, L, O, P);
        ((id) (obj3)).a(f1, f2);
        if (((PointF) (obj2)).y >= 100F || pointf.y >= 100F)
        {
            obj3.c = false;
        } else
        {
            obj3.c = true;
            a(((PointF) (relativelayout)), ((PointF) (obj1)), ((id) (obj3)), flag);
        }
        obj1 = (id)J.get(3);
        ((id) (obj1)).a(((PointF) (obj)), ((PointF) (obj2)));
        ((id) (obj1)).a(K, L, O, P);
        ((id) (obj1)).a(f1, f2);
        if (((PointF) (obj)).x <= 0.0F || ((PointF) (obj2)).x <= 0.0F)
        {
            obj1.c = false;
        } else
        {
            obj1.c = true;
            a(((PointF) (if1)), ((PointF) (relativelayout)), ((id) (obj1)), flag);
        }
        invalidate();
    }

    public final void a(ra ra1)
    {
        this;
        JVM INSTR monitorenter ;
        if (!ra1.f) goto _L2; else goto _L1
_L1:
        ra1.f = false;
        b = -1;
        c.K();
_L4:
        f.remove(ra1);
        d.remove(ra1);
        invalidate();
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (b == -1) goto _L4; else goto _L3
_L3:
        int i1 = d.indexOf(ra1);
        if (i1 < 0) goto _L4; else goto _L5
_L5:
        if (i1 >= b) goto _L4; else goto _L6
_L6:
        b = b - 1;
          goto _L4
        ra1;
        throw ra1;
    }

    public final void a(String s1)
    {
        this;
        JVM INSTR monitorenter ;
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_98;
        }
        ArrayList arraylist;
        arraylist = new ArrayList();
        Iterator iterator = g.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            ao ao1 = (ao)iterator.next();
            if (s1.equalsIgnoreCase(((qz)ao1).K))
            {
                arraylist.add(ao1);
            }
        } while (true);
        break MISSING_BLOCK_LABEL_76;
        s1;
        throw s1;
        d.removeAll(arraylist);
        g.removeAll(arraylist);
        this;
        JVM INSTR monitorexit ;
    }

    public final void a(ArrayList arraylist)
    {
        this;
        JVM INSTR monitorenter ;
        g.addAll(arraylist);
        d.addAll(arraylist);
        for (arraylist = arraylist.iterator(); arraylist.hasNext(); b((qz)arraylist.next())) { }
        break MISSING_BLOCK_LABEL_59;
        arraylist;
        throw arraylist;
        a();
        this;
        JVM INSTR monitorexit ;
    }

    public final void a(boolean flag)
    {
        for (Iterator iterator = J.iterator(); iterator.hasNext();)
        {
            ((id)iterator.next()).c = false;
        }

        if (B != null)
        {
            B.cancel();
            B = null;
        }
        if (flag)
        {
            T = true;
            invalidate();
        }
    }

    public final void b()
    {
        b = -1;
    }

    public final void b(ao ao1)
    {
        this;
        JVM INSTR monitorenter ;
        ArrayList arraylist;
        ao aao[];
        int j1;
        arraylist = new ArrayList();
        aao = new ao[d.size()];
        j1 = d.indexOf(ao1);
        arraylist.addAll(d);
        b = 0;
        int i1 = 0;
_L2:
        if (i1 >= arraylist.size())
        {
            break MISSING_BLOCK_LABEL_194;
        }
        if (i1 >= j1)
        {
            break MISSING_BLOCK_LABEL_99;
        }
        aao[i1 + 1] = (ao)arraylist.get(i1);
        ((ao)arraylist.get(i1)).f = false;
        break MISSING_BLOCK_LABEL_248;
        if (i1 <= j1)
        {
            break MISSING_BLOCK_LABEL_140;
        }
        aao[i1] = (ao)arraylist.get(i1);
        ((ao)arraylist.get(i1)).f = false;
        break MISSING_BLOCK_LABEL_248;
        ao1;
        throw ao1;
        aao[0] = (ao)arraylist.get(i1);
        ((ao)arraylist.get(i1)).f = true;
        ((ao)arraylist.get(i1)).y = true;
        ((ao)arraylist.get(i1)).z = false;
        break MISSING_BLOCK_LABEL_248;
        if (aao.length == 1)
        {
            aao[0].z = true;
            aao[0].y = true;
        }
        d.clear();
        d.addAll(Arrays.asList(aao));
        q();
        invalidate();
        this;
        JVM INSTR monitorexit ;
        return;
        i1++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final boolean b(String s1)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = false;
        ArrayList arraylist;
        Iterator iterator;
        arraylist = new ArrayList();
        iterator = g.iterator();
_L1:
        ao ao1;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_73;
            }
            ao1 = (ao)iterator.next();
        } while (!s1.equals(((qz)ao1).R));
        arraylist.add(ao1);
        flag = true;
          goto _L1
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_100;
        }
        d.removeAll(arraylist);
        g.removeAll(arraylist);
        this;
        JVM INSTR monitorexit ;
        return flag;
        s1;
        throw s1;
    }

    public final void c(ao ao1)
    {
        this;
        JVM INSTR monitorenter ;
        ArrayList arraylist;
        ao aao[];
        int j1;
        arraylist = new ArrayList();
        aao = new ao[d.size()];
        j1 = d.indexOf(ao1);
        arraylist.addAll(d);
        b = j1;
        int i1 = 0;
_L6:
        if (i1 >= arraylist.size())
        {
            break MISSING_BLOCK_LABEL_225;
        }
        if (i1 != j1)
        {
            break MISSING_BLOCK_LABEL_209;
        }
        if (i1 != 0) goto _L2; else goto _L1
_L1:
        ((ao)arraylist.get(i1)).z = false;
        ((ao)arraylist.get(i1)).y = true;
_L3:
        ((ao)arraylist.get(i1)).f = true;
_L4:
        aao[i1] = (ao)arraylist.get(i1);
        i1++;
        continue; /* Loop/switch isn't completed */
_L2:
        if (i1 != arraylist.size() - 1)
        {
            break MISSING_BLOCK_LABEL_180;
        }
        ((ao)arraylist.get(i1)).z = true;
        ((ao)arraylist.get(i1)).y = false;
          goto _L3
        ao1;
        throw ao1;
        ((ao)arraylist.get(i1)).z = false;
        ((ao)arraylist.get(i1)).y = false;
          goto _L3
        ((ao)arraylist.get(i1)).f = false;
          goto _L4
        if (aao.length == 1)
        {
            aao[0].z = true;
            aao[0].y = true;
        }
        d.clear();
        d.addAll(Arrays.asList(aao));
        q();
        invalidate();
        this;
        JVM INSTR monitorexit ;
        return;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final boolean c()
    {
        return f != null && !f.isEmpty();
    }

    public final boolean c(String s1)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = false;
        ArrayList arraylist;
        Iterator iterator;
        arraylist = new ArrayList();
        iterator = g.iterator();
_L1:
        ao ao1;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_73;
            }
            ao1 = (ao)iterator.next();
        } while (!s1.equals(((qz)ao1).T));
        arraylist.add(ao1);
        flag = true;
          goto _L1
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_100;
        }
        d.removeAll(arraylist);
        g.removeAll(arraylist);
        this;
        JVM INSTR monitorexit ;
        return flag;
        s1;
        throw s1;
    }

    public final void d(ao ao1)
    {
        this;
        JVM INSTR monitorenter ;
        ArrayList arraylist;
        ao aao[];
        int j1;
        arraylist = new ArrayList();
        aao = new ao[d.size()];
        j1 = d.indexOf(ao1);
        arraylist.addAll(d);
        b = d.size() - 1;
        int i1 = 0;
_L2:
        if (i1 >= arraylist.size())
        {
            break MISSING_BLOCK_LABEL_209;
        }
        if (i1 >= j1)
        {
            break MISSING_BLOCK_LABEL_107;
        }
        aao[i1] = (ao)arraylist.get(i1);
        ((ao)arraylist.get(i1)).f = false;
        break MISSING_BLOCK_LABEL_263;
        if (i1 <= j1)
        {
            break MISSING_BLOCK_LABEL_150;
        }
        aao[i1 - 1] = (ao)arraylist.get(i1);
        ((ao)arraylist.get(i1)).f = false;
        break MISSING_BLOCK_LABEL_263;
        ao1;
        throw ao1;
        aao[arraylist.size() - 1] = (ao)arraylist.get(i1);
        ((ao)arraylist.get(i1)).f = true;
        ((ao)arraylist.get(i1)).z = true;
        ((ao)arraylist.get(i1)).y = false;
        break MISSING_BLOCK_LABEL_263;
        if (aao.length == 1)
        {
            aao[0].z = true;
            aao[0].y = true;
        }
        d.clear();
        d.addAll(Arrays.asList(aao));
        q();
        invalidate();
        this;
        JVM INSTR monitorexit ;
        return;
        i1++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final boolean d()
    {
        return g != null && !g.isEmpty();
    }

    public final List e()
    {
        return d;
    }

    public final List f()
    {
        return e;
    }

    public final ao g()
    {
        ao ao1;
        if (b == -1 || d.size() <= 0)
        {
            ao1 = null;
        } else
        {
            ao ao2 = (ao)d.get(b);
            ao1 = ao2;
            if (!ao2.f)
            {
                return null;
            }
        }
        return ao1;
    }

    public final void h()
    {
        this;
        JVM INSTR monitorenter ;
        r();
        d.clear();
        e.clear();
        f.clear();
        g.clear();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void i()
    {
        this;
        JVM INSTR monitorenter ;
        b = -1;
        d.removeAll(e);
        e.clear();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final List j()
    {
        return g;
    }

    public final int k()
    {
        return g.size();
    }

    public final int l()
    {
        return w;
    }

    public final int m()
    {
        return b;
    }

    public final void n()
    {
        b = -1;
    }

    public final void o()
    {
        Object obj = J.iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            id id1 = (id)((Iterator) (obj)).next();
            if (!id1.c)
            {
                continue;
            }
            if (B != null)
            {
                B.cancel();
                B = null;
            }
            B = new Timer();
            int i1;
            if (android.os.Build.VERSION.SDK_INT == 14)
            {
                i1 = 300;
            } else
            {
                i1 = 200;
            }
            obj = new pq(this);
            obj.c = id1;
            B.schedule(((java.util.TimerTask) (obj)), 600L, i1);
            break;
        } while (true);
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        r();
        if (p != null && !p.isRecycled())
        {
            p.recycle();
            p = null;
        }
        if (q != null && !q.isRecycled())
        {
            q.recycle();
            q = null;
        }
        if (r != null && !r.isRecycled())
        {
            r.recycle();
            r = null;
        }
        for (Iterator iterator = J.iterator(); iterator.hasNext(); ((id)iterator.next()).a()) { }
        if (B != null)
        {
            B.cancel();
            B = null;
        }
        J.clear();
    }

    protected void onDraw(Canvas canvas)
    {
        this;
        JVM INSTR monitorenter ;
        int i1;
        canvas.setDrawFilter(D);
        i1 = d.size() - 1;
_L29:
        if (i1 < 0)
        {
            break MISSING_BLOCK_LABEL_1259;
        }
        ao ao1 = (ao)d.get(i1);
        if (!(ao1 instanceof ra)) goto _L2; else goto _L1
_L1:
        Object obj = (ra)ao1;
        ((ra) (obj)).b(canvas);
        obj.ak = false;
        obj.al = false;
        obj.am = false;
_L15:
        if (!((ra) (obj)).al)
        {
            obj.L = ((ra) (obj)).r();
        }
_L16:
        if (!ao1.f || !m || ao1.x || !ao1.A) goto _L4; else goto _L3
_L3:
        int j1;
        int k1;
        j1 = (int)a(ao1.o[14], ao1.o[15], ao1.o[6], ao1.o[7]);
        k1 = (int)a(ao1.o[2], ao1.o[3], ao1.o[10], ao1.o[11]);
        float f1;
        float f2;
        float f3;
        Object obj1;
        Object obj2;
        float af[];
        if (j1 <= k1)
        {
            j1 = k1;
        }
        j1 = (int)((float)j1 * 1.2F);
        a(canvas, new PointF(ao1.o[16], ao1.o[17]), j1, z);
_L4:
        if (C || !ao1.f || m || ao1.x)
        {
            break MISSING_BLOCK_LABEL_896;
        }
        if ((ao1 instanceof ra) && ((ra)ao1).B())
        {
            break MISSING_BLOCK_LABEL_1312;
        }
        if (p != null && !p.isRecycled()) goto _L6; else goto _L5
_L5:
        obj = getResources().openRawResource(0x7f02036d);
        p = BitmapFactory.decodeStream(((InputStream) (obj)));
        if (obj == null) goto _L6; else goto _L7
_L7:
        ((InputStream) (obj)).close();
_L6:
        if (q != null && !q.isRecycled()) goto _L9; else goto _L8
_L8:
        obj = getResources().openRawResource(0x7f020582);
        q = BitmapFactory.decodeStream(((InputStream) (obj)));
        if (obj == null) goto _L9; else goto _L10
_L10:
        ((InputStream) (obj)).close();
_L9:
        j1 = p.getWidth();
        k1 = p.getHeight();
        obj2 = a(ao1.o[0], ao1.o[1]);
        af = a(ao1.o[8], ao1.o[9]);
        if (!(ao1 instanceof qz) || ((qz)ao1).P != -1) goto _L12; else goto _L11
_L11:
        obj1 = a(ao1.o[4], ao1.o[5]);
        obj = a(ao1.o[12], ao1.o[13]);
_L18:
        if (!(ao1 instanceof ra) || ((ra)ao1).ak) goto _L14; else goto _L13
_L13:
        obj2 = ((ra)ao1).U;
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_566;
        }
        if (!((Bitmap) (obj2)).isRecycled())
        {
            break MISSING_BLOCK_LABEL_881;
        }
        ((ra)ao1).h();
        canvas.drawBitmap(((ra)ao1).U, ao1.b, null);
_L14:
        canvas.drawBitmap(p, obj1[0], obj1[1], null);
        canvas.drawBitmap(q, obj[0], obj[1], null);
        s.set(obj1[0], obj1[1], obj1[0] + (float)j1, obj1[1] + (float)k1);
        obj1 = t;
        f1 = obj[0];
        f2 = obj[1];
        f3 = obj[0];
        ((RectF) (obj1)).set(f1, f2, (float)j1 + f3, obj[1] + (float)k1);
        break MISSING_BLOCK_LABEL_1312;
        obj1;
        ((OutOfMemoryError) (obj1)).printStackTrace();
        obj.ak = true;
        obj.al = true;
        b = i1;
        ((ao)d.get(b)).f = true;
        if (!((ra) (obj)).B())
        {
            c.L();
        }
          goto _L15
        canvas;
        throw canvas;
_L2:
        ao1.a(canvas);
          goto _L16
        obj;
        ((IOException) (obj)).printStackTrace();
          goto _L6
        obj;
        ((IOException) (obj)).printStackTrace();
          goto _L9
_L12:
        obj = af;
        obj1 = obj2;
        if (!(ao1 instanceof ps)) goto _L18; else goto _L17
_L17:
        obj = af;
        obj1 = obj2;
        if (((ps)ao1).K != -1) goto _L18; else goto _L19
_L19:
        obj1 = a(ao1.o[4], ao1.o[5]);
        obj = a(ao1.o[12], ao1.o[13]);
          goto _L18
        canvas.drawBitmap(((Bitmap) (obj2)), ao1.b, null);
          goto _L14
        if (C || !ao1.f || m || !ao1.x)
        {
            break MISSING_BLOCK_LABEL_1312;
        }
        if (r != null && !r.isRecycled())
        {
            break MISSING_BLOCK_LABEL_974;
        }
        obj = getResources().openRawResource(0x7f0203b5);
        r = BitmapFactory.decodeStream(((InputStream) (obj)));
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_974;
        }
        ((InputStream) (obj)).close();
_L24:
        j1 = r.getWidth();
        k1 = r.getHeight();
        obj1 = b(ao1.o[4], ao1.o[5]);
        if (!(ao1 instanceof qz) || ((qz)ao1).P != -1) goto _L21; else goto _L20
_L20:
        obj = b(ao1.o[0], ao1.o[1]);
_L26:
        if (!(ao1 instanceof ra) || ((ra)ao1).ak) goto _L23; else goto _L22
_L22:
        obj1 = ((ra)ao1).U;
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_1094;
        }
        if (!((Bitmap) (obj1)).isRecycled())
        {
            break MISSING_BLOCK_LABEL_1244;
        }
        ((ra)ao1).h();
        canvas.drawBitmap(((ra)ao1).U, ao1.b, null);
_L23:
        canvas.drawBitmap(r, obj[0], obj[1], null);
        obj1 = u;
        f1 = obj[0];
        f2 = obj[1];
        f3 = obj[0];
        ((RectF) (obj1)).set(f1, f2, (float)j1 + f3, obj[1] + (float)k1);
        break MISSING_BLOCK_LABEL_1312;
        obj;
        ((IOException) (obj)).printStackTrace();
          goto _L24
_L21:
        obj = obj1;
        if (!(ao1 instanceof ps)) goto _L26; else goto _L25
_L25:
        obj = obj1;
        if (((ps)ao1).K != -1) goto _L26; else goto _L27
_L27:
        obj = b(ao1.o[0], ao1.o[1]);
          goto _L26
        canvas.drawBitmap(((Bitmap) (obj1)), ao1.b, null);
          goto _L23
        obj = J.iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            obj1 = (id)((Iterator) (obj)).next();
            if (((id) (obj1)).c)
            {
                ((id) (obj1)).a(canvas);
            }
        } while (true);
        this;
        JVM INSTR monitorexit ;
        return;
        i1--;
        if (true) goto _L29; else goto _L28
_L28:
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        int i1;
        int j1;
        i1 = 0;
        j1 = 0;
        boolean flag = false;
        this;
        JVM INSTR monitorenter ;
        if ((d.size() != 0 || J.size() != 0) && !a) goto _L2; else goto _L1
_L1:
        flag = super.onTouchEvent(motionevent);
_L123:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        motionevent.getAction() & 0xff;
        JVM INSTR lookupswitch 6: default 2904
    //                   0: 132
    //                   1: 2369
    //                   2: 1420
    //                   3: 2369
    //                   6: 2882
    //                   261: 2869;
           goto _L3 _L4 _L5 _L6 _L5 _L7 _L8
_L3:
        super.onTouchEvent(motionevent);
        flag = true;
        continue; /* Loop/switch isn't completed */
_L4:
        if (!c.e(false)) goto _L10; else goto _L9
_L9:
        motionevent = g();
        if (motionevent == null) goto _L12; else goto _L11
_L11:
        if (!(motionevent instanceof ra) || !((ra)motionevent).B())
        {
            motionevent.f = false;
            a();
        }
          goto _L12
_L10:
        float f1;
        float f2;
        f1 = motionevent.getX();
        f2 = motionevent.getY();
        if (Q != null)
        {
            Q.b();
            Q = null;
        }
        Iterator iterator = J.iterator();
        id id1;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_295;
            }
            id1 = (id)iterator.next();
        } while (!id1.c || !id1.b.contains(f1, f2));
        if (B != null)
        {
            B.cancel();
            B = null;
        }
        Q = id1;
        flag = true;
        continue; /* Loop/switch isn't completed */
        x = System.currentTimeMillis();
        if (b == -1 || C) goto _L14; else goto _L13
_L13:
        Object obj = (ao)d.get(b);
        if (obj == null) goto _L14; else goto _L15
_L15:
        if ((obj instanceof ra) && ((ra)obj).B() || !((ao) (obj)).f) goto _L14; else goto _L16
_L16:
        if (!t.contains(f1, f2) || ((ao) (obj)).x)
        {
            break MISSING_BLOCK_LABEL_460;
        }
        o = new Point((int)f1, (int)f2);
        h = 0.0F;
        l = a(new PointF((int)motionevent.getX(), (int)motionevent.getY()), new PointF(((ao) (obj)).f()[0], ((ao) (obj)).f()[1]));
        flag = true;
        continue; /* Loop/switch isn't completed */
        if (!s.contains(f1, f2) || ((ao) (obj)).x)
        {
            break MISSING_BLOCK_LABEL_635;
        }
        a = true;
        if (c == null || c.isFinishing())
        {
            break MISSING_BLOCK_LABEL_629;
        }
        motionevent = new android.app.AlertDialog.Builder(c);
        if (!(obj instanceof qz))
        {
            break MISSING_BLOCK_LABEL_603;
        }
        motionevent.setMessage(getContext().getResources().getString(0x7f070177));
_L17:
        motionevent.setPositiveButton(0x7f07032f, new pl(this, ((ao) (obj)))).setNegativeButton(0x7f0701ec, new pk(this));
        motionevent.setOnCancelListener(new pm(this));
        motionevent.create().show();
        a = true;
        flag = true;
        continue; /* Loop/switch isn't completed */
        motionevent.setMessage(getContext().getResources().getString(0x7f070177));
          goto _L17
        motionevent;
        throw motionevent;
        flag = false;
        continue; /* Loop/switch isn't completed */
        if (!u.contains(f1, f2) || !((ao) (obj)).f || !((ao) (obj)).x) goto _L14; else goto _L18
_L18:
        if (c == null || c.isFinishing()) goto _L20; else goto _L19
_L19:
        motionevent = new android.app.AlertDialog.Builder(c);
        motionevent.setMessage(getContext().getResources().getString(0x7f0702fb));
        motionevent.setPositiveButton(0x7f07032f, new pn(this, ((ao) (obj))));
        motionevent.setNegativeButton(0x7f0701ec, new po(this));
        motionevent.setOnCancelListener(new pp(this));
        motionevent.create().show();
        a = true;
        flag = true;
        continue; /* Loop/switch isn't completed */
_L14:
        j1 = b;
        b = -1;
        if (!C)
        {
            break MISSING_BLOCK_LABEL_864;
        }
        obj = (ao)d.get(0);
        if (!((ao) (obj)).a(motionevent.getX(), motionevent.getY()))
        {
            break MISSING_BLOCK_LABEL_848;
        }
        obj.f = true;
        b = 0;
        H = System.currentTimeMillis();
        flag = true;
        continue; /* Loop/switch isn't completed */
        b = -1;
        H = 0L;
        flag = false;
        continue; /* Loop/switch isn't completed */
        Object obj1 = d.iterator();
        flag = false;
_L49:
        if (!((Iterator) (obj1)).hasNext()) goto _L22; else goto _L21
_L21:
        obj = (ao)((Iterator) (obj1)).next();
        flag = ((ao) (obj)).f;
        if (!((ao) (obj)).a(motionevent.getX(), motionevent.getY())) goto _L24; else goto _L23
_L23:
        obj.e = new Point((int)motionevent.getX(), (int)motionevent.getY());
        c(((ao) (obj)));
        j = 2;
        l = 0.0F;
        G = false;
        if (!(obj instanceof ra)) goto _L26; else goto _L25
_L25:
        if (flag) goto _L22; else goto _L27
_L27:
        c.b(0);
        c.H();
_L22:
        if (b != -1) goto _L29; else goto _L28
_L28:
        w = -1;
        if (j1 == -1) goto _L31; else goto _L30
_L30:
        invalidate();
        if (c.n == 0 && !c.b("FragmentEditTip") && !c.b("FragmentDoodle"))
        {
            c.K();
        }
          goto _L31
_L26:
        if (!(obj instanceof qz)) goto _L33; else goto _L32
_L32:
        if (flag) goto _L22; else goto _L34
_L34:
        c.b(0);
        c.I();
          goto _L22
_L33:
        if (!(obj instanceof ps)) goto _L22; else goto _L35
_L35:
        ig aig[] = c.e;
        if (aig == null) goto _L37; else goto _L36
_L36:
        i1 = 0;
_L121:
        if (i1 >= aig.length) goto _L37; else goto _L38
_L38:
        if (!aig[i1].equals(((ps)obj).H)) goto _L40; else goto _L39
_L39:
        c.a(c.k);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_1240;
        }
        obj = (db)c.c("FragmentFreeEdit");
        if (obj == null) goto _L22; else goto _L41
_L41:
        if (!((db) (obj)).c()) goto _L22; else goto _L42
_L42:
        obj = c;
        com.roidapp.baselib.gl.c.a();
        if (!com.roidapp.baselib.gl.c.b(((Context) (obj))))
        {
            break MISSING_BLOCK_LABEL_1226;
        }
        c.a(i1, 0, 0);
          goto _L22
        c.a(i1, 1, 0);
          goto _L22
        obj = (dj)c.c("FragmentEditTip");
        if (obj == null) goto _L44; else goto _L43
_L43:
        if (!((dj) (obj)).b()) goto _L44; else goto _L45
_L45:
        obj = c;
        com.roidapp.baselib.gl.c.a();
        if (!com.roidapp.baselib.gl.c.b(((Context) (obj)))) goto _L47; else goto _L46
_L46:
        c.a(i1, 0, 0);
_L48:
        w = i1;
          goto _L22
_L47:
        c.a(i1, 1, 0);
          goto _L48
_L44:
label0:
        {
            if (c.b("FragmentFreeEdit"))
            {
                break label0;
            }
            obj = new db();
            c.a(0x7f0d028d, ((android.support.v4.app.Fragment) (obj)), "FragmentFreeEdit");
        }
          goto _L48
        obj = (db)c.c("FragmentFreeEdit");
        ((db) (obj)).a();
        ((db) (obj)).b();
          goto _L48
_L24:
        obj.f = false;
          goto _L49
_L29:
        if (flag)
        {
            break MISSING_BLOCK_LABEL_1410;
        }
        H = 0L;
          goto _L3
        H = System.currentTimeMillis();
          goto _L3
_L6:
        if (Q == null) goto _L51; else goto _L50
_L50:
        if (T)
        {
            flag = false;
            continue; /* Loop/switch isn't completed */
        }
        f1 = motionevent.getX();
        f2 = motionevent.getY();
        if (f1 <= 0.0F) goto _L53; else goto _L52
_L52:
        if (f1 >= (float)K || f2 <= 0.0F) goto _L53; else goto _L54
_L54:
        if (f2 < (float)L) goto _L55; else goto _L53
_L55:
        Q.g;
        JVM INSTR tableswitch 0 3: default 2943
    //                   0 1545
    //                   1 1565
    //                   2 1545
    //                   3 1565;
           goto _L56 _L57 _L58 _L57 _L58
_L56:
        if (flag)
        {
            break; /* Loop/switch isn't completed */
        }
        a(R, S, false);
        break; /* Loop/switch isn't completed */
_L57:
        flag = Q.b(Q.d, f2);
        continue; /* Loop/switch isn't completed */
_L58:
        flag = Q.b(f1, Q.e);
        if (true) goto _L56; else goto _L59
_L51:
        if (b == -1) goto _L61; else goto _L60
_L60:
        obj = (ao)d.get(b);
        if (C || obj == null) goto _L3; else goto _L62
_L62:
        if (a || !((ao) (obj)).f || ((ao) (obj)).x) goto _L3; else goto _L63
_L63:
        m = true;
        MotionEventCompat.getPointerCount(motionevent);
        JVM INSTR tableswitch 1 2: default 2952
    //                   1 1676
    //                   2 2063;
           goto _L3 _L64 _L65
_L64:
        if (o == null || F) goto _L67; else goto _L66
_L66:
        k = a(new PointF((int)motionevent.getX(), (int)motionevent.getY()), new PointF(((ao) (obj)).f()[0], ((ao) (obj)).f()[1]));
        f1 = l - k;
        obj.m = ((ao) (obj)).m + f1;
        f2 = Math.abs(((ao) (obj)).m % 90F);
        if (f2 < 3F) goto _L69; else goto _L68
_L68:
        if (Math.abs(f2 - 90F) >= 3F) goto _L70; else goto _L69
_L70:
        if (i1 == 0) goto _L72; else goto _L71
_L71:
        obj.A = true;
        ((ao) (obj)).b(f1);
        e(((ao) (obj)));
_L77:
        l = k;
        f1 = a(motionevent.getX(), motionevent.getY(), ((ao) (obj)).f()[0], ((ao) (obj)).f()[1]);
        if (h == 0.0F) goto _L74; else goto _L73
_L73:
        if (f1 / h <= 1.0F) goto _L76; else goto _L75
_L75:
        ((ao) (obj)).a(f1 / h);
_L74:
        h = f1;
_L80:
        invalidate();
          goto _L3
_L72:
        obj.A = false;
        ((ao) (obj)).b(((ao) (obj)).m - ((ao) (obj)).l);
          goto _L77
_L76:
        if (((ao) (obj)).c() < 10 || ((ao) (obj)).d() < 10) goto _L74; else goto _L78
_L78:
        ((ao) (obj)).a(f1 / h);
          goto _L74
_L67:
        if (j != 2) goto _L80; else goto _L79
_L79:
        if (F) goto _L3; else goto _L81
_L81:
        G = true;
        if (((ao) (obj)).e != null && (!(obj instanceof ra) || !((ra)obj).B()))
        {
            ((ao) (obj)).b((int)motionevent.getX() - ((ao) (obj)).e.x, (int)motionevent.getY() - ((ao) (obj)).e.y);
            obj.e = new Point((int)motionevent.getX(), (int)motionevent.getY());
        }
          goto _L80
_L65:
        if (!G) goto _L83; else goto _L82
_L82:
        obj = MotionEvent.obtain(0L, 0L, 0, motionevent.getX(), motionevent.getY(), 0);
        onTouchEvent(((MotionEvent) (obj)));
        ((MotionEvent) (obj)).recycle();
        G = false;
          goto _L3
_L83:
        F = true;
        if (!E) goto _L85; else goto _L84
_L84:
        E = false;
        bp.a();
        h = bp.b(motionevent);
        bp.a();
        l = bp.c(motionevent);
          goto _L3
_L85:
        bp.a();
        k = bp.c(motionevent);
        f1 = l - k;
        obj.m = ((ao) (obj)).m + f1;
        f2 = Math.abs(((ao) (obj)).m % 90F);
        if (f2 < 3F) goto _L87; else goto _L86
_L86:
        i1 = j1;
        if (Math.abs(f2 - 90F) >= 3F) goto _L88; else goto _L87
_L88:
        if (i1 == 0) goto _L90; else goto _L89
_L89:
        obj.A = true;
        ((ao) (obj)).b(f1);
        e(((ao) (obj)));
_L95:
        l = k;
        bp.a();
        f1 = bp.b(motionevent);
        if (h == 0.0F) goto _L92; else goto _L91
_L91:
        if (f1 / h <= 1.0F) goto _L94; else goto _L93
_L93:
        ((ao) (obj)).a(f1 / h);
_L92:
        h = f1;
        invalidate();
          goto _L3
_L90:
        obj.A = false;
        ((ao) (obj)).b(((ao) (obj)).m - ((ao) (obj)).l);
          goto _L95
_L94:
        if (((ao) (obj)).c() < 10 || ((ao) (obj)).d() < 10) goto _L92; else goto _L96
_L96:
        ((ao) (obj)).a(f1 / h);
          goto _L92
_L5:
        long l1 = System.currentTimeMillis();
        obj = null;
        if (b != -1)
        {
            obj = (ao)d.get(b);
        }
        if (l1 - H > 300L) goto _L98; else goto _L97
_L97:
        if (obj == null) goto _L100; else goto _L99
_L99:
        if (!((ao) (obj)).a(motionevent.getX(), motionevent.getY())) goto _L102; else goto _L101
_L101:
        if (!C || !((ao) (obj)).f || !(obj instanceof ra)) goto _L104; else goto _L103
_L103:
        c.a((ra)obj);
        ((ra)obj).C();
_L102:
        if (((ao) (obj)).C)
        {
            ((ao) (obj)).b();
        }
_L100:
        x = System.currentTimeMillis();
        if (obj == null) goto _L106; else goto _L105
_L105:
        if (((ao) (obj)).A)
        {
            e(((ao) (obj)));
            obj.A = false;
        }
        if (((ao) (obj)).C)
        {
            ((ao) (obj)).b();
        }
_L106:
        m = false;
        l = 0.0F;
        o = null;
        E = true;
        G = true;
        if (F)
        {
            F = false;
        }
        invalidate();
        if (Q != null)
        {
            c.b.c(2);
        }
          goto _L3
_L104:
        if (!((ao) (obj)).f || (obj instanceof ra) && ((ra)obj).B()) goto _L108; else goto _L107
_L107:
        obj.f = false;
        b = -1;
        c.K();
          goto _L102
_L108:
        if (((ao) (obj)).x) goto _L102; else goto _L109
_L109:
        b(((ao) (obj)));
        if (!(obj instanceof qz)) goto _L111; else goto _L110
_L110:
        c.I();
          goto _L102
_L111:
        if (!(obj instanceof ps) || c.c("FragmentFreeEdit") == null) goto _L102; else goto _L112
_L112:
        aig = (db)c.c("FragmentFreeEdit");
        if (aig == null) goto _L102; else goto _L113
_L113:
        aig.a();
        aig.b();
          goto _L102
_L98:
        if (System.currentTimeMillis() - x > 300L || obj == null) goto _L100; else goto _L114
_L114:
        if (!((ao) (obj)).a(motionevent.getX(), motionevent.getY()) || ((ao) (obj)).x) goto _L116; else goto _L115
_L115:
        b(((ao) (obj)));
        if (!(obj instanceof qz)) goto _L118; else goto _L117
_L117:
        c.I();
_L116:
        if (((ao) (obj)).C)
        {
            ((ao) (obj)).b();
        }
          goto _L100
_L118:
        if (!(obj instanceof ps) || c.c("FragmentFreeEdit") == null) goto _L116; else goto _L119
_L119:
        aig = (db)c.c("FragmentFreeEdit");
        if (aig == null) goto _L116; else goto _L120
_L120:
        aig.a();
        aig.b();
          goto _L116
_L8:
        E = true;
        G = true;
          goto _L3
_L7:
        E = true;
        G = true;
          goto _L3
_L37:
        i1 = -1;
          goto _L39
_L12:
        flag = true;
        continue; /* Loop/switch isn't completed */
_L20:
        flag = false;
        continue; /* Loop/switch isn't completed */
_L31:
        flag = false;
        continue; /* Loop/switch isn't completed */
_L40:
        i1++;
          goto _L121
_L53:
        flag = false;
        continue; /* Loop/switch isn't completed */
_L59:
        flag = true;
        continue; /* Loop/switch isn't completed */
_L69:
        i1 = 1;
          goto _L70
_L87:
        i1 = 1;
          goto _L88
_L61:
        flag = false;
        if (true) goto _L123; else goto _L122
_L122:
    }
}
