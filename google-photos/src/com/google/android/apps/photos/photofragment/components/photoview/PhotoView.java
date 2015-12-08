// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.photos.photofragment.components.photoview;

import amb;
import ame;
import amh;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import awl;
import awr;
import ayt;
import azg;
import azh;
import b;
import com.google.android.libraries.social.tiledimage.views.TiledImageView;
import ekp;
import elt;
import euv;
import fli;
import flk;
import gaf;
import gap;
import gyn;
import gyo;
import gyp;
import gyr;
import gys;
import gyw;
import gyx;
import gyz;
import gza;
import gzc;
import gzd;
import gze;
import java.util.Iterator;
import java.util.Set;
import mk;
import mwx;
import nkj;
import noy;
import noz;
import olm;

public class PhotoView extends ViewGroup
    implements android.view.GestureDetector.OnDoubleTapListener, android.view.GestureDetector.OnGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
{

    private static float o;
    private static boolean p;
    private static Bitmap q;
    private static Bitmap r;
    private static boolean s;
    private static int t;
    private Matrix A;
    private boolean B;
    private boolean C;
    private boolean D;
    private boolean E;
    private boolean F;
    private boolean G;
    private GestureDetector H;
    private ScaleGestureDetector I;
    private android.view.View.OnClickListener J;
    private boolean K;
    private boolean L;
    private gzc M;
    private float N;
    private float O;
    private float P;
    private boolean Q;
    private float R;
    private long S;
    private gze T;
    private gzd U;
    private RectF V;
    private RectF W;
    public Drawable a;
    private float aa[];
    private RectF ab;
    private final RectF ac;
    private gys ad;
    private boolean ae;
    private boolean af;
    private long ag;
    private boolean ah;
    private Rect ai;
    private boolean aj;
    private boolean ak;
    private azg al;
    private gyz am;
    private final azh an;
    private final azh ao;
    public ekp b;
    public Matrix c;
    public boolean d;
    public boolean e;
    public boolean f;
    public float g;
    public RectF h;
    public final RectF i;
    public float j;
    public float k;
    public float l;
    public gyr m;
    public boolean n;
    private final noz u;
    private amh v;
    private fli w;
    private gap x;
    private gyx y;
    private Matrix z;

    public PhotoView(Context context)
    {
        super(context);
        u = noz.a(getContext(), 2, "PhotoView", new String[0]);
        y = new gyx();
        c = new Matrix();
        A = new Matrix();
        h = new RectF();
        V = new RectF();
        W = new RectF();
        aa = new float[9];
        ab = new RectF();
        ac = new RectF();
        i = new RectF();
        l = 1.0F;
        ah = true;
        an = new gyn(this);
        ao = new gyo(this);
        l();
    }

    public PhotoView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        u = noz.a(getContext(), 2, "PhotoView", new String[0]);
        y = new gyx();
        c = new Matrix();
        A = new Matrix();
        h = new RectF();
        V = new RectF();
        W = new RectF();
        aa = new float[9];
        ab = new RectF();
        ac = new RectF();
        i = new RectF();
        l = 1.0F;
        ah = true;
        an = new gyn(this);
        ao = new gyo(this);
        l();
    }

    public PhotoView(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        u = noz.a(getContext(), 2, "PhotoView", new String[0]);
        y = new gyx();
        c = new Matrix();
        A = new Matrix();
        h = new RectF();
        V = new RectF();
        W = new RectF();
        aa = new float[9];
        ab = new RectF();
        ac = new RectF();
        i = new RectF();
        l = 1.0F;
        ah = true;
        an = new gyn(this);
        ao = new gyo(this);
        l();
    }

    private float a(float f1, float f2, float f3, float f4)
    {
        return a(f1, f2, f3, f4, 0.0F);
    }

    private static float a(float f1, float f2, float f3, float f4, float f5)
    {
        if (f4 - f3 < f2 - f1)
        {
            return (f2 - f1 - (f4 + f3)) / 2.0F + f1;
        } else
        {
            return Math.max(f2 - f4, Math.min(f1 - f3, f5));
        }
    }

    public static azg a(PhotoView photoview, azg azg1)
    {
        photoview.al = azg1;
        return azg1;
    }

    private void a(Matrix matrix)
    {
        float f1;
        float f2;
        W.set(h);
        matrix.mapRect(W);
        a(ac);
        f1 = a(ac.left, ac.right, W.left, W.right);
        f2 = a(ac.top, ac.bottom, W.top, W.bottom);
        if (Math.abs(f1) <= 20F && Math.abs(f2) <= 20F) goto _L2; else goto _L1
_L1:
        long l1;
        matrix = U;
        matrix.d = f1;
        matrix.e = f2;
        l1 = 250L - (System.currentTimeMillis() - ((gzd) (matrix)).f);
        if (!((gzd) (matrix)).g || l1 <= 0L) goto _L4; else goto _L3
_L3:
        matrix.a = ((gzd) (matrix)).d / (float)l1;
        matrix.b = ((gzd) (matrix)).e / (float)l1;
_L6:
        return;
_L4:
        matrix.f = -1L;
        matrix.a = f1 / 250F;
        matrix.b = f2 / 250F;
        matrix.h = false;
        matrix.g = true;
        mk.a(((gzd) (matrix)).c, matrix);
        return;
_L2:
        if (!U.g)
        {
            c.postTranslate(f1, f2);
            h();
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    private void a(RectF rectf)
    {
        rectf.set(ab);
    }

    private void a(Drawable drawable)
    {
        g = 0.0F;
        N = 0.0F;
        a = drawable;
        if (a != null)
        {
            a.setCallback(this);
        }
        d(true);
        invalidate();
    }

    public static void a(PhotoView photoview)
    {
        photoview.i();
    }

    public static void a(PhotoView photoview, Drawable drawable)
    {
        if (!photoview.D || !photoview.F)
        {
            photoview.a(drawable);
        }
        if (photoview.G)
        {
            photoview.ad.c();
        }
        photoview.d = false;
        photoview.i();
    }

    public static boolean a(PhotoView photoview, boolean flag)
    {
        photoview.D = false;
        return false;
    }

    public static void b(PhotoView photoview, Drawable drawable)
    {
        boolean flag;
        if (photoview.getVisibility() == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        drawable.setVisible(flag, false);
        if (photoview.C)
        {
            ((Animatable)drawable).start();
        }
        photoview.D = true;
        photoview.F = true;
        if (photoview.a != null)
        {
            photoview.a.setCallback(null);
            if (photoview.a instanceof Animatable)
            {
                ((Animatable)photoview.a).stop();
            }
        }
        photoview.a(drawable);
        photoview.d = false;
        photoview.i();
    }

    public static boolean b(PhotoView photoview)
    {
        return photoview.B;
    }

    public static boolean b(PhotoView photoview, boolean flag)
    {
        photoview.G = false;
        return false;
    }

    public static gys c(PhotoView photoview)
    {
        return photoview.ad;
    }

    public static boolean c(PhotoView photoview, boolean flag)
    {
        photoview.d = true;
        return true;
    }

    private void d(boolean flag)
    {
        if (a == null || !B)
        {
            return;
        }
        int i1 = a.getIntrinsicWidth();
        int k1 = a.getIntrinsicHeight();
        a.setBounds(0, 0, i1, k1);
        if (flag || g == 0.0F && a != null && B)
        {
            int j1 = a.getIntrinsicWidth();
            int l1 = a.getIntrinsicHeight();
            h.set(0.0F, 0.0F, j1, l1);
            a(ac);
            V.set(0.0F, 0.0F, getWidth(), getHeight());
            c.setRectToRect(h, V, android.graphics.Matrix.ScaleToFit.CENTER);
            A.set(c);
            g = c();
            float f1;
            if (e)
            {
                f1 = 0.8F * g;
            } else
            {
                f1 = g;
            }
            N = f1;
            k();
        }
        z = c;
        if (m != null)
        {
            W.set(h);
            z.mapRect(W);
        }
        y.f();
        y.g();
        h();
    }

    public static boolean d(PhotoView photoview)
    {
        return photoview.C;
    }

    public static int e()
    {
        return t;
    }

    public static Matrix e(PhotoView photoview)
    {
        return photoview.c;
    }

    public static float f(PhotoView photoview)
    {
        return photoview.c();
    }

    private boolean f()
    {
        return b != null && euv.c.equals(b.c());
    }

    public static float g(PhotoView photoview)
    {
        return photoview.g;
    }

    private boolean g()
    {
        return D && C;
    }

    public static gap h(PhotoView photoview)
    {
        return photoview.x;
    }

    private void h()
    {
        y.f();
        gys gys1 = ad;
        boolean flag;
        if (gys1.c != null && gys1.b != null && gys1.i.a != null)
        {
            gys1.a();
            flag = gys1.b();
        } else
        {
            gys1.c();
            flag = false;
        }
        if (!flag)
        {
            invalidate();
        }
    }

    public static fli i(PhotoView photoview)
    {
        return photoview.w;
    }

    private void i()
    {
        if (!d && am != null && am.a != gza.e) goto _L2; else goto _L1
_L1:
        y.a(this, b);
_L4:
        if (u.a())
        {
            noy.a("isAnimationEnabled", Boolean.valueOf(g()));
            noy.a("AnimatedImageLoaded", Boolean.valueOf(F));
            noy.a("AnimatedImageLoading", Boolean.valueOf(E));
        }
        if (g() && !F && !E)
        {
            E = true;
            j();
        }
        invalidate();
        return;
_L2:
        if (a != null)
        {
            Object obj = y;
            ekp ekp1 = b;
            obj = ((gyx) (obj)).a.iterator();
            while (((Iterator) (obj)).hasNext()) 
            {
                ((gyw)((Iterator) (obj)).next()).a(this, ekp1);
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static amh j(PhotoView photoview)
    {
        return photoview.v;
    }

    private void j()
    {
        v.a(awr).a(new awl()).a(amh.a).a(w.c()).a(x).a(ao);
    }

    private void k()
    {
        gaf gaf1 = (gaf)b.b(gaf);
        float f2;
        if (gaf1 != null)
        {
            Resources resources = getResources();
            int i1 = resources.getDisplayMetrics().widthPixels;
            int j1 = resources.getDisplayMetrics().densityDpi;
            float f1 = (float)i1 / (float)j1;
            f1 = (float)gaf1.k() / (f1 * 150F);
            O = Math.max(g * 2.0F, f1 * g);
        } else
        {
            O = Math.max(g * 2.0F, Math.min(g * 12F, 12F));
        }
        if (e)
        {
            f2 = 1.5F * O;
        } else
        {
            f2 = O;
        }
        P = f2;
    }

    private void l()
    {
        setWillNotDraw(false);
        setFocusable(true);
        setClickable(true);
        Context context = getContext();
        if (!p)
        {
            p = true;
            Resources resources = context.getApplicationContext().getResources();
            o = TypedValue.applyDimension(1, 1.0F, resources.getDisplayMetrics());
            q = BitmapFactory.decodeResource(resources, b.uY);
            r = BitmapFactory.decodeResource(resources, b.uX);
            s = context.getPackageManager().hasSystemFeature("android.hardware.touchscreen.multitouch.distinct");
            t = ((flk)olm.a(context, flk)).c();
        }
        v = (amh)olm.a(context, amh);
        w = (fli)olm.a(context, fli);
        boolean flag;
        if (!s)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        H = new GestureDetector(context, this, null, flag);
        I = new ScaleGestureDetector(context, this);
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            I.setQuickScaleEnabled(true);
        }
        M = new gzc(this);
        T = new gze(this);
        U = new gzd(this);
        ad = new gys(this);
    }

    public final void a()
    {
        c.set(A);
        h();
    }

    public final void a(float f1, float f2, float f3)
    {
        l = f1;
        j = f2;
        k = f3;
        f1 = Math.min(Math.max(f1, N), P);
        float f4 = c();
        float f5 = f1 / f4;
        c.postScale(f5, f5, f2, f3);
        h();
        if (f1 > O)
        {
            M.a(f4, O, 600L);
            d();
        } else
        if (f1 < g)
        {
            M.a(f4, g, 600L);
            d();
            return;
        }
    }

    public final void a(TiledImageView tiledimageview)
    {
        gys gys1;
label0:
        {
            gys1 = ad;
            if (gys1.c != tiledimageview)
            {
                gys1.c = tiledimageview;
                if (gys1.c == null)
                {
                    break label0;
                }
                gys1.c();
            }
            return;
        }
        gys1.d();
    }

    public final void a(ekp ekp1)
    {
        Object obj1 = null;
        if (u.a())
        {
            b.a(ekp1);
        }
        b = ekp1;
        if (ekp1 != null)
        {
            if (ekp1.b(gaf) != null)
            {
                k();
            }
            ekp1 = ((elt)ekp1.a(elt)).e();
        } else
        {
            ekp1 = null;
        }
        if (ekp1 == null || x == null || !x.equals(ekp1))
        {
            ad.d();
            a(((Drawable) (null)));
            v.a(an);
            v.a(ao);
            F = false;
            E = false;
            d = false;
            gap gap1;
            boolean flag;
            boolean flag1;
            boolean flag2;
            if (ekp1 != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag && ekp1.e())
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (flag && euv.e == b.c())
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            D = flag2;
            if (flag && (flag1 || !D))
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            G = flag2;
            if (u.a())
            {
                noy.a("model", ekp1);
                noy.a("type", b.c());
                Object obj;
                ame ame1;
                ame ame2;
                if (ekp1 != null)
                {
                    obj = Boolean.valueOf(nkj.a(ekp1.a()));
                } else
                {
                    obj = null;
                }
                noy.a("isFifeHosted", obj);
            }
            x = ekp1;
            obj = (mwx)olm.a(getContext(), mwx);
            ame1 = v.a(ekp1).a(w.d());
            ekp1 = x;
            ame2 = v.a(ekp1).a(w.e());
            gap1 = x;
            ekp1 = obj1;
            if (gap1 != null)
            {
                if (gap1.h() == null)
                {
                    ekp1 = obj1;
                } else
                {
                    ekp1 = v.a(gap1.h()).a(w.d().a(amb.d));
                }
            }
            ame2.b = ekp1;
            ame1.b = ame2;
            am = new gyz(((mwx) (obj)), ame1, an, new gyp(this));
            am.a();
        }
    }

    public final void a(gyw gyw1)
    {
        y.a.add(gyw1);
    }

    public final void a(boolean flag)
    {
        if (ah != flag)
        {
            ah = flag;
            if (!flag)
            {
                M.a(true);
                T.a();
                U.a();
                a();
            }
        }
    }

    public final boolean a(float f1, float f2, boolean flag)
    {
        W.set(h);
        c.mapRect(W);
        a(ac);
        float f3;
        float f4;
        if (!flag)
        {
            f4 = a(ac.left, ac.right, W.left, W.right, f1);
            f3 = a(ac.top, ac.bottom, W.top, W.bottom, f2);
        } else
        {
            f3 = f2;
            f4 = f1;
        }
        c.postTranslate(f4, f3);
        j = j + f4;
        k = k + f3;
        h();
        return f4 == f1 && f3 == f2;
    }

    public final void b(boolean flag)
    {
        ae = flag;
        gys gys1 = ad;
        if (ae && G && !f())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        gys1.d = flag;
        if (gys1.d)
        {
            gys1.c();
            return;
        } else
        {
            gys1.d();
            return;
        }
    }

    public final boolean b()
    {
        float af1[] = new float[9];
        float af2[] = new float[9];
        c.getValues(af1);
        A.getValues(af2);
        return Math.abs(af1[0] - af2[0]) >= 0.05F || Math.abs(af1[4] - af2[4]) >= 0.05F || Math.abs(af1[2] - af2[2]) >= o || Math.abs(af1[5] - af2[5]) >= o;
    }

    public float c()
    {
        c.getValues(aa);
        return aa[0];
    }

    public final void c(boolean flag)
    {
        if (C != flag)
        {
            C = flag;
            if (a != null)
            {
                if (a instanceof Animatable)
                {
                    if (C)
                    {
                        ((Animatable)a).start();
                    } else
                    {
                        ((Animatable)a).stop();
                    }
                }
                if (g() && !E && !F)
                {
                    j();
                }
                invalidate();
            }
        }
    }

    public final void d()
    {
        a(c);
    }

    public void invalidateDrawable(Drawable drawable)
    {
        if (drawable == a)
        {
            invalidate();
            return;
        } else
        {
            super.invalidateDrawable(drawable);
            return;
        }
    }

    public void jumpDrawablesToCurrentState()
    {
        super.jumpDrawablesToCurrentState();
        if (a != null)
        {
            a.jumpToCurrentState();
        }
    }

    public boolean onDoubleTap(MotionEvent motionevent)
    {
        return true;
    }

    public boolean onDoubleTapEvent(MotionEvent motionevent)
    {
        return true;
    }

    public boolean onDown(MotionEvent motionevent)
    {
        if (f)
        {
            T.a();
        }
        return true;
    }

    protected void onDraw(Canvas canvas)
    {
        if (ai != null)
        {
            canvas.clipRect(ai);
        }
        super.onDraw(canvas);
        if (a != null)
        {
            if (!ad.b())
            {
                int i1 = canvas.getSaveCount();
                canvas.save();
                if (z != null)
                {
                    canvas.concat(z);
                }
                if (!(a instanceof BitmapDrawable) || !((BitmapDrawable)a).getBitmap().isRecycled())
                {
                    a.draw(canvas);
                }
                canvas.restoreToCount(i1);
            }
            if (!n)
            {
                int j1 = canvas.getSaveCount();
                if (m != null)
                {
                    canvas.save();
                }
                if (f())
                {
                    int k1 = (getWidth() - q.getWidth()) / 2;
                    int l1 = (getHeight() - q.getHeight()) / 2;
                    canvas.drawBitmap(q, k1, l1, null);
                }
                if (m != null)
                {
                    canvas.restoreToCount(j1);
                }
            }
        }
    }

    public boolean onFling(MotionEvent motionevent, MotionEvent motionevent1, float f1, float f2)
    {
        if (f)
        {
            if (!Q)
            {
                motionevent = T;
                if (!((gze) (motionevent)).e)
                {
                    motionevent.d = -1L;
                    motionevent.b = f1;
                    motionevent.c = f2;
                    f1 = (float)Math.atan2(((gze) (motionevent)).c, ((gze) (motionevent)).b);
                    motionevent.g = (float)(Math.cos(f1) * 20000D);
                    motionevent.h = (float)(Math.sin(f1) * 20000D);
                    motionevent.f = false;
                    motionevent.e = true;
                    mk.a(((gze) (motionevent)).a, motionevent);
                }
            }
            Q = false;
        }
        return true;
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        ab.set(0.0F, 0.0F, getWidth(), getHeight());
        int j2 = getChildCount();
        for (int i2 = 0; i2 < j2; i2++)
        {
            getChildAt(i2).layout(i1, j1, k1, l1);
        }

        B = true;
        if (al != null && getWidth() > 0 && getHeight() > 0)
        {
            al.a(getWidth(), getHeight());
            al = null;
        }
        d(flag);
    }

    public void onLongPress(MotionEvent motionevent)
    {
    }

    protected void onMeasure(int i1, int j1)
    {
        super.onMeasure(i1, j1);
        int l1 = getChildCount();
        for (int k1 = 0; k1 < l1; k1++)
        {
            getChildAt(k1).measure(i1, j1);
        }

    }

    public boolean onScale(ScaleGestureDetector scalegesturedetector)
    {
        boolean flag = true;
        float f1 = scalegesturedetector.getScaleFactor() - 1.0F;
        if (aj && f1 != 0.0F)
        {
            if (f1 < 0.0F && !b())
            {
                ak = true;
            } else
            {
                ak = false;
            }
            aj = false;
        } else
        if (aj)
        {
            return true;
        }
        if (ak)
        {
            flag = false;
        } else
        if (R != 0.0F && (R <= 1.0F || R + f1 >= 1.0F) && (R >= 1.0F || R + f1 <= 1.0F) || (double)f1 <= 0.10000000000000001D)
        {
            R = f1 + R;
            L = false;
            a(c() * scalegesturedetector.getScaleFactor(), scalegesturedetector.getFocusX(), scalegesturedetector.getFocusY());
            return true;
        }
        return flag;
    }

    public boolean onScaleBegin(ScaleGestureDetector scalegesturedetector)
    {
        aj = true;
        if (f)
        {
            M.a(false);
            L = true;
            R = 0.0F;
        }
        return true;
    }

    public void onScaleEnd(ScaleGestureDetector scalegesturedetector)
    {
        if (ak)
        {
            return;
        }
        if (f && L)
        {
            K = true;
            a();
        }
        Q = true;
    }

    public boolean onScroll(MotionEvent motionevent, MotionEvent motionevent1, float f1, float f2)
    {
        if (Math.abs(motionevent1.getEventTime() - S) > 200L && f)
        {
            j = motionevent.getX() - f1;
            k = motionevent.getY() - f2;
            a(-f1, -f2, false);
        }
        return true;
    }

    public void onShowPress(MotionEvent motionevent)
    {
    }

    public boolean onSingleTapConfirmed(MotionEvent motionevent)
    {
        if (J != null && !L)
        {
            J.onClick(this);
        }
        L = false;
        return true;
    }

    public boolean onSingleTapUp(MotionEvent motionevent)
    {
        return false;
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (ah) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        I.onTouchEvent(motionevent);
        H.onTouchEvent(motionevent);
        motionevent.getActionMasked();
        JVM INSTR tableswitch 6 6: default 48
    //                   6 118;
           goto _L3 _L4
_L3:
        long l1;
        l1 = System.currentTimeMillis();
        switch (motionevent.getAction())
        {
        case 2: // '\002'
        default:
            return true;

        case 0: // '\0'
            if (l1 - ag < (long)ViewConfiguration.getDoubleTapTimeout())
            {
                af = true;
            }
            ag = l1;
            return true;

        case 1: // '\001'
        case 3: // '\003'
            break;
        }
        break; /* Loop/switch isn't completed */
_L4:
        if (motionevent.getPointerCount() == 2)
        {
            S = motionevent.getEventTime();
        } else
        if (motionevent.getPointerCount() == 1)
        {
            S = 0L;
        }
        if (true) goto _L3; else goto _L5
_L5:
        if (af && l1 - ag < (long)ViewConfiguration.getTapTimeout())
        {
            if (!K && f)
            {
                float f2 = c();
                float f1;
                if (g != 0.0F)
                {
                    f1 = f2 / g;
                } else
                {
                    f1 = 1.0F;
                }
                if (f1 > 1.04F)
                {
                    f1 = g;
                } else
                {
                    f1 = 2.5F * f2;
                }
                f1 = Math.max(g, f1);
                f1 = Math.min(O, f1);
                j = motionevent.getX();
                k = motionevent.getY();
                M.a(f2, f1, 0L);
                motionevent = new Matrix(c);
                f1 /= f2;
                motionevent.postScale(f1, f1, j, k);
                a(motionevent);
            }
            K = false;
        }
        af = false;
        if (!T.e)
        {
            d();
            return true;
        }
        if (true) goto _L1; else goto _L6
_L6:
    }

    public void setClipBounds(Rect rect)
    {
        if (rect == null)
        {
            ai = null;
        } else
        if (ai == null)
        {
            ai = new Rect(rect);
        } else
        {
            ai.set(rect);
        }
        invalidate();
    }

    public void setOnClickListener(android.view.View.OnClickListener onclicklistener)
    {
        J = onclicklistener;
    }

    public void setVisibility(int i1)
    {
        super.setVisibility(i1);
        if (a != null)
        {
            Drawable drawable = a;
            boolean flag;
            if (i1 == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            drawable.setVisible(flag, false);
        }
    }

    protected boolean verifyDrawable(Drawable drawable)
    {
        return a == drawable || super.verifyDrawable(drawable);
    }
}
