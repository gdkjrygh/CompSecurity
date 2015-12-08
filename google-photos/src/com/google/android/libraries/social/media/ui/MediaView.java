// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.social.media.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.ProgressBar;
import b;
import c;
import g;
import j;
import java.util.ArrayList;
import k;
import mzc;
import naf;
import nbc;
import nbf;
import nbj;
import njm;
import njn;
import njr;
import njt;
import njx;
import nka;
import nkb;
import nkc;
import nkd;
import nke;
import nkf;
import nkg;
import nkh;
import nki;
import nxb;
import nxc;
import nxe;
import nxg;
import oiu;
import oiz;
import olm;
import qwd;

public class MediaView extends View
    implements j, nbf, nxe, oiz
{

    private static final mzc A = new nka();
    private static njn p;
    private static Interpolator q;
    private static int r;
    private static int s;
    private static final RectF t = new RectF();
    private static nkd u;
    private static nkd v;
    private static nkd w;
    private static nkg x;
    private static nkg y;
    private static nki z;
    private njt B;
    private nkc C;
    private boolean D;
    private long E;
    private boolean F;
    private boolean G;
    private final Rect H;
    private final RectF I;
    private final RectF J;
    private final Matrix K;
    private final Matrix L;
    private Drawable M;
    private Bitmap N;
    private int O;
    private int P;
    private Bitmap Q;
    private Drawable R;
    private int S;
    private boolean T;
    private String U;
    private ProgressBar V;
    private int W;
    public boolean a;
    private int aa;
    private int ab;
    private int ac;
    private int ad;
    private int ae;
    private int af;
    private int ag;
    private float ah;
    private boolean ai;
    private boolean aj;
    private boolean ak;
    private int al;
    private int am;
    private boolean an;
    private int ao;
    private int ap;
    private boolean aq;
    private k ar;
    public boolean b;
    public boolean c;
    public int d;
    public RectF e;
    public njr f;
    public k g;
    public boolean h;
    public int i;
    public int j;
    public final Rect k;
    public int l;
    public int m;
    public nkf n;
    public boolean o;

    public MediaView(Context context)
    {
        super(context);
        c = true;
        d = -1;
        j = 1;
        k = new Rect();
        H = new Rect();
        I = new RectF();
        J = new RectF();
        K = new Matrix();
        L = new Matrix();
        S = -1;
        T = true;
        o = false;
        ai = false;
        aj = false;
        ak = false;
        al = nkh.a;
        am = -1;
        an = true;
        ao = -1;
        ap = -1;
        aq = true;
        a(context, ((AttributeSet) (null)));
    }

    public MediaView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        c = true;
        d = -1;
        j = 1;
        k = new Rect();
        H = new Rect();
        I = new RectF();
        J = new RectF();
        K = new Matrix();
        L = new Matrix();
        S = -1;
        T = true;
        o = false;
        ai = false;
        aj = false;
        ak = false;
        al = nkh.a;
        am = -1;
        an = true;
        ao = -1;
        ap = -1;
        aq = true;
        a(context, attributeset);
    }

    public MediaView(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        c = true;
        d = -1;
        j = 1;
        k = new Rect();
        H = new Rect();
        I = new RectF();
        J = new RectF();
        K = new Matrix();
        L = new Matrix();
        S = -1;
        T = true;
        o = false;
        ai = false;
        aj = false;
        ak = false;
        al = nkh.a;
        am = -1;
        an = true;
        ao = -1;
        ap = -1;
        aq = true;
        a(context, attributeset);
    }

    public static int a(MediaView mediaview)
    {
        return mediaview.i;
    }

    public static Drawable a(MediaView mediaview, Drawable drawable)
    {
        mediaview.R = drawable;
        return drawable;
    }

    private njt a(int i1, int j1, nxe nxe1)
    {
        if (d == 0)
        {
            int k1;
            int l1;
            if (l != 0 || m != 0)
            {
                k1 = l;
                l1 = m;
            } else
            {
                k1 = getWidth();
                l1 = getHeight();
            }
            if (k1 != 0 || l1 != 0)
            {
                return p.a(f, 0, k1, l1, j1, e, g, i1, nxe1);
            } else
            {
                return null;
            }
        } else
        {
            return p.a(f, d, getWidth(), getHeight(), -1, e, g, i1, nxe1);
        }
    }

    public static njt a(MediaView mediaview, int i1, int j1, nxe nxe1)
    {
        return mediaview.a(i1, j1, nxe1);
    }

    private void a(Context context, AttributeSet attributeset)
    {
        Resources resources = context.getResources();
        if (p == null)
        {
            p = (njn)olm.a(context, njn);
            r = resources.getDimensionPixelSize(b.GH);
            s = resources.getDimensionPixelSize(b.GG);
            u = new nkd(resources, c.fP);
            v = new nkd(resources, c.fQ);
            w = new nkd(resources, c.fN);
            z = new nki(resources);
            x = new nkg(resources.getColor(b.GE));
            y = new nkg(0x66ffffff);
        }
        Q = (Bitmap)w.b();
        M = resources.getDrawable(c.fO);
        M.setCallback(this);
        ah = 0.4F;
        if (attributeset != null)
        {
            String s1 = attributeset.getAttributeValue(null, "size");
            if (s1 != null)
            {
                if ("custom".equals(s1))
                {
                    d = 0;
                } else
                if ("thumbnail".equals(s1))
                {
                    d = 2;
                } else
                if ("large".equals(s1))
                {
                    d = 3;
                } else
                if ("full".equals(s1))
                {
                    d = 1;
                } else
                if ("original".equals(s1))
                {
                    d = 4;
                } else
                {
                    context = String.valueOf(s1);
                    if (context.length() != 0)
                    {
                        context = "Invalid size category: ".concat(context);
                    } else
                    {
                        context = new String("Invalid size category: ");
                    }
                    throw new IllegalArgumentException(context);
                }
            }
            attributeset = attributeset.getAttributeValue(null, "scale");
            if (attributeset != null)
            {
                if ("zoom".equals(attributeset))
                {
                    j = 1;
                } else
                if ("fit".equals(attributeset))
                {
                    j = 0;
                } else
                {
                    context = String.valueOf(attributeset);
                    if (context.length() != 0)
                    {
                        context = "Invalid scale mode: ".concat(context);
                    } else
                    {
                        context = new String("Invalid scale mode: ");
                    }
                    throw new IllegalArgumentException(context);
                }
            }
        }
        oiu.c(this);
        attributeset = (njm)olm.b(context, njm);
        if (attributeset != null && attributeset.a())
        {
            context = (nke)olm.b(context, nke);
            if (context != null)
            {
                ar = context.a();
            }
            return;
        } else
        {
            ar = null;
            return;
        }
    }

    private void a(Canvas canvas, Bitmap bitmap, int i1, int j1)
    {
        if (bitmap == null || bitmap.isRecycled())
        {
            return;
        }
        if (k.isEmpty() || G)
        {
            b(i1, j1);
        }
        canvas.drawBitmap(bitmap, k, H, (Paint)A.b());
    }

    private void a(Canvas canvas, Drawable drawable)
    {
        if (drawable != null)
        {
            drawable.setBounds(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
            drawable.draw(canvas);
        }
    }

    private static boolean a(Drawable drawable)
    {
        if (drawable != null) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        if (!(drawable instanceof naf))
        {
            break; /* Loop/switch isn't completed */
        }
        drawable = (naf)drawable;
        boolean flag;
        if (!((qwd) (drawable)).b && ((qwd) (drawable)).e)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag) goto _L1; else goto _L3
_L3:
        return true;
    }

    public static boolean a(MediaView mediaview, boolean flag)
    {
        mediaview.ai = flag;
        return flag;
    }

    public static boolean a(k k1, k k2)
    {
        if (k1 == null && k2 == null)
        {
            return true;
        }
        if (k1 == null && k2 != null || k1 != null && k2 == null)
        {
            return false;
        } else
        {
            return k1.z();
        }
    }

    public static int b(MediaView mediaview)
    {
        return mediaview.S;
    }

    private void b(int i1, int j1)
    {
        float f1;
        float f2;
        int k1;
        int l1;
        int i2;
        int j2;
        k1 = getPaddingTop();
        i2 = getPaddingRight();
        j2 = getPaddingBottom();
        l1 = getPaddingLeft();
        i2 = getWidth() - l1 - i2;
        j2 = getHeight() - k1 - j2;
        f1 = (float)i1 / (float)j1;
        f2 = (float)i2 / (float)j2;
        j;
        JVM INSTR tableswitch 0 2: default 92
    //                   0 155
    //                   1 253
    //                   2 354;
           goto _L1 _L2 _L3 _L4
_L1:
        J.set(k);
        I.set(H);
        K.setRectToRect(J, I, android.graphics.Matrix.ScaleToFit.FILL);
        if (!K.invert(L))
        {
            L.reset();
        }
        return;
_L2:
        k.set(0, 0, i1, j1);
        if (f1 > f2)
        {
            i1 = (j2 - (int)((float)i2 / f1)) / 2;
            H.set(l1, k1 + i1, i2 + l1, (k1 + j2) - i1);
        } else
        {
            i1 = (i2 - (int)(f1 * (float)j2)) / 2;
            H.set(l1 + i1, k1, (i2 + l1) - i1, j2 + k1);
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (f1 > f2)
        {
            int k2 = (i1 - (int)((float)j1 * f2)) / 2;
            k.set(k2, 0, i1 - k2, j1);
        } else
        {
            int l2 = (int)((float)i1 / f2);
            j1 = Math.max((int)((float)j1 * ah) - l2 / 2, 0);
            k.set(0, j1, i1, l2 + j1);
        }
        H.set(l1, k1, i2 + l1, j2 + k1);
        continue; /* Loop/switch isn't completed */
_L4:
        k.set(0, 0, i1, j1);
        H.set(0, 0, i2, j2);
        if (true) goto _L1; else goto _L5
_L5:
    }

    public static boolean b(MediaView mediaview, boolean flag)
    {
        mediaview.o = flag;
        return flag;
    }

    public static boolean c(MediaView mediaview)
    {
        return mediaview.o;
    }

    public static boolean c(MediaView mediaview, boolean flag)
    {
        mediaview.G = true;
        return true;
    }

    public static void d(MediaView mediaview)
    {
        mediaview.i();
    }

    public static ProgressBar e(MediaView mediaview)
    {
        return mediaview.V;
    }

    public static boolean f(MediaView mediaview)
    {
        return mediaview.m();
    }

    public static Drawable g(MediaView mediaview)
    {
        return mediaview.R;
    }

    public static njn h()
    {
        return p;
    }

    public static boolean h(MediaView mediaview)
    {
        return mediaview.an;
    }

    public static int i(MediaView mediaview)
    {
        return mediaview.am;
    }

    private void i()
    {
        if (R == null)
        {
            return;
        }
        R.setCallback(null);
        if (!(R instanceof oiz)) goto _L2; else goto _L1
_L1:
        ((oiz)R).ax_();
_L4:
        R = null;
        return;
_L2:
        if (!(R instanceof g)) goto _L4; else goto _L3
_L3:
        g g1;
        g1 = (g)R;
        if (g1.b == null)
        {
            throw new IllegalStateException("BitmapProvider must be non-null");
        }
        Object obj1 = g1.a;
        obj1;
        JVM INSTR monitorenter ;
        Object obj;
        Bitmap bitmap;
        g1.a();
        bitmap = g1.d;
        g1.d = null;
        if (g1.f == 2)
        {
            break MISSING_BLOCK_LABEL_160;
        }
        obj = g1.e;
        g1.e = null;
_L5:
        g1.c = true;
        g1.b.a(bitmap);
        if (obj != null)
        {
            g1.b.a(((Bitmap) (obj)));
        }
          goto _L4
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
        obj = null;
          goto _L5
    }

    public static njt j(MediaView mediaview)
    {
        return mediaview.B;
    }

    private boolean j()
    {
        boolean flag;
        if (B != null && ((nxb) (B)).i == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return flag && B.i() != null;
    }

    public static nkf k(MediaView mediaview)
    {
        return mediaview.n;
    }

    private boolean k()
    {
        return f != null && njx.d.equals(f.d);
    }

    private boolean l()
    {
        return f != null && njx.b.equals(f.d);
    }

    private boolean m()
    {
        return al == nkh.c && k() || al == nkh.b;
    }

    public final Bitmap a(int i1, int j1)
    {
        return p.a.a(i1, j1);
    }

    public final void a(long l1, long l2)
    {
        if (m())
        {
            post(new nkb(this, l1, l2));
        }
    }

    public final void a(Bitmap bitmap)
    {
        p.a.a(bitmap);
    }

    public final void a(njr njr1)
    {
        if (f == null || !f.equals(njr1)) goto _L2; else goto _L1
_L1:
        Object obj;
        obj = g;
        boolean flag;
        if (obj == null && true)
        {
            flag = true;
        } else
        if (obj == null && false || obj != null && true)
        {
            flag = false;
        } else
        {
            flag = ((k) (obj)).z();
        }
        if (flag) goto _L3; else goto _L2
_L2:
        h = true;
        g = null;
        if (!h && j())
        {
            N = B.i();
            O = B.j();
            P = B.k();
        }
        if (B == null) goto _L5; else goto _L4
_L4:
        obj = B;
        b.u();
        ((nxb) (obj)).r();
        if (((nxb) (obj)).n != this || ((nxb) (obj)).o != null && (((nxb) (obj)).o == null || !((nxb) (obj)).o.equals(null))) goto _L7; else goto _L6
_L6:
        obj.n = null;
        obj.o = null;
        ((nxb) (obj)).f.b(((nxb) (obj)));
_L9:
        B = null;
_L5:
        f();
        i();
        k.setEmpty();
        ak = false;
        o = false;
        f = njr1;
        if (f != null)
        {
            a = false;
        }
        b();
        invalidate();
_L3:
        return;
_L7:
        int i1;
        int j1;
        if (((nxb) (obj)).p == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        j1 = ((nxb) (obj)).p.size();
        i1 = 0;
_L10:
label0:
        {
            if (i1 < j1)
            {
                if (!((nxc)((nxb) (obj)).p.get(i1)).a(this, null))
                {
                    break label0;
                }
                ((nxb) (obj)).p.remove(i1);
            }
            if (((nxb) (obj)).p.isEmpty())
            {
                ((nxb) (obj)).f.b(((nxb) (obj)));
            }
        }
        if (true) goto _L9; else goto _L8
_L8:
        i1++;
          goto _L10
        if (true) goto _L9; else goto _L11
_L11:
    }

    public final void a(nxb nxb1)
    {
        nxb1.i;
        JVM INSTR tableswitch 1 5: default 40
    //                   1 106
    //                   2 68
    //                   3 40
    //                   4 40
    //                   5 240;
           goto _L1 _L2 _L3 _L1 _L1 _L4
_L1:
        if (n != null && ak)
        {
            n.a();
        }
        invalidate();
        return;
_L3:
        if (V != null && m())
        {
            ((nbc)nxb1).d = this;
            V.setIndeterminate(true);
            aj = true;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        k.setEmpty();
        if (E != 0L && System.currentTimeMillis() - E > 100L && b)
        {
            boolean flag;
            if (android.os.Build.VERSION.SDK_INT >= 14)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                if (q == null)
                {
                    q = new DecelerateInterpolator();
                }
                setAlpha(0.01F);
                animate().alpha(1.0F).setDuration(500L).setInterpolator(q);
            }
        }
        E = 0L;
        ak = true;
        aj = false;
        e();
        if (!k())
        {
            d();
        }
        continue; /* Loop/switch isn't completed */
_L4:
        aj = false;
        ak = true;
        if (true) goto _L1; else goto _L5
_L5:
    }

    public final void ax_()
    {
        c();
        a(((njr) (null)));
        D = false;
        setContentDescription(null);
        U = null;
    }

    public final void b()
    {
label0:
        {
            if (oiu.a(this))
            {
                if (d == -1)
                {
                    String s1 = String.valueOf(oiu.b(this));
                    if (s1.length() != 0)
                    {
                        s1 = "Size category is not set: ".concat(s1);
                    } else
                    {
                        s1 = new String("Size category is not set: ");
                    }
                    throw new IllegalStateException(s1);
                }
                if (d != 5 || getWidth() != 0 || getHeight() != 0)
                {
                    E = System.currentTimeMillis();
                    k.setEmpty();
                    if (f == null)
                    {
                        break label0;
                    }
                    int j1 = (i | 0x200) & -5;
                    int i1 = j1;
                    if (aq)
                    {
                        i1 = j1 | 0x40;
                    }
                    boolean flag;
                    if (V == null && al != nkh.a)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    if (flag)
                    {
                        V = new ProgressBar(new ContextThemeWrapper(getContext(), b.GI), null, 0);
                        requestLayout();
                    }
                    B = a(i1, S, this);
                }
            }
            return;
        }
        N = null;
        i();
    }

    public final void c()
    {
        if (!h && j())
        {
            N = B.i();
            O = B.j();
            P = B.k();
        }
        if (B == null) goto _L2; else goto _L1
_L1:
        njt njt1;
        njt1 = B;
        b.u();
        njt1.r();
        if (((nxb) (njt1)).n != this || ((nxb) (njt1)).o != null && (((nxb) (njt1)).o == null || !((nxb) (njt1)).o.equals(null))) goto _L4; else goto _L3
_L3:
        njt1.n = null;
        njt1.o = null;
        ((nxb) (njt1)).f.b(njt1);
_L6:
        B = null;
_L2:
        f();
        i();
        k.setEmpty();
        ak = false;
        o = false;
        return;
_L4:
        int i1;
        int j1;
        if (((nxb) (njt1)).p == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        j1 = ((nxb) (njt1)).p.size();
        i1 = 0;
_L7:
label0:
        {
            if (i1 < j1)
            {
                if (!((nxc)((nxb) (njt1)).p.get(i1)).a(this, null))
                {
                    break label0;
                }
                ((nxb) (njt1)).p.remove(i1);
            }
            if (((nxb) (njt1)).p.isEmpty())
            {
                ((nxb) (njt1)).f.b(njt1);
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
        i1++;
          goto _L7
        if (true) goto _L6; else goto _L8
_L8:
    }

    public final void d()
    {
        if (!TextUtils.isEmpty(null))
        {
            setContentDescription(null);
        }
    }

    public void draw(Canvas canvas)
    {
        super.draw(canvas);
        if (M != null)
        {
            if (isPressed() || isFocused())
            {
                M.setBounds(0, 0, getWidth(), getHeight());
                M.draw(canvas);
            } else
            if (isSelected())
            {
                M.setBounds(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
                M.draw(canvas);
                return;
            }
        }
    }

    protected void drawableStateChanged()
    {
        if (M != null)
        {
            M.setState(getDrawableState());
            invalidate();
        }
        super.drawableStateChanged();
    }

    public void e()
    {
        while (!ak || o || !g() || !k() && !l()) 
        {
            return;
        }
        if (C == null)
        {
            C = new nkc(this);
        }
        C.a = false;
        C.b();
    }

    public void f()
    {
        if (C != null)
        {
            C.c();
        }
    }

    public boolean g()
    {
        return (i & 4) != 0;
    }

    public void invalidateDrawable(Drawable drawable)
    {
        if (drawable == R)
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
        if (R != null)
        {
            R.jumpToCurrentState();
        }
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        F = false;
        b();
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        c();
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        if (!a(R) && !j() && N == null) goto _L2; else goto _L1
_L1:
        if (!a(R)) goto _L4; else goto _L3
_L3:
        Drawable drawable = R;
        if (!a(drawable))
        {
            a(canvas, ((Drawable) (null)));
        } else
        {
            i1 = drawable.getIntrinsicWidth();
            int j1 = drawable.getIntrinsicHeight();
            if (k.isEmpty() || G)
            {
                b(i1, j1);
                G = false;
            }
            drawable.setBounds(0, 0, i1, j1);
            canvas.concat(K);
            drawable.draw(canvas);
            canvas.concat(L);
        }
_L17:
        if (!c) goto _L6; else goto _L5
_L5:
        if (!l()) goto _L8; else goto _L7
_L7:
        canvas.drawBitmap((Bitmap)z.b(), W, aa, null);
_L6:
        Bitmap bitmap;
        int i1;
        if (!T)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 != 0)
        {
            canvas.drawRect(0.0F, 0.0F, getWidth(), getHeight(), (Paint)y.b());
        }
        if (ar != null && B != null)
        {
            getWidth();
            getHeight();
        }
        if (V != null && m() && (k() ? ai : aj))
        {
            canvas.save();
            canvas.translate(0.0F, getHeight() - V.getHeight());
            V.draw(canvas);
            canvas.restore();
        }
        return;
_L4:
        if (j())
        {
            a(canvas, B.i(), B.j(), B.k());
        } else
        if (N != null)
        {
            a(canvas, N, O, P);
        }
        continue; /* Loop/switch isn't completed */
_L8:
        if (f != null && njx.c.equals(f.d))
        {
            i1 = 1;
        } else
        {
label0:
            {
                if (B == null)
                {
                    break label0;
                }
                i1 = ((nbc) (B)).l;
                if (i1 == 4 || i1 == 3)
                {
                    i1 = 1;
                } else
                {
                    i1 = 0;
                }
                if (i1 == 0)
                {
                    break label0;
                }
                i1 = 1;
            }
        }
_L11:
        if (i1 == 0) goto _L10; else goto _L9
_L9:
        canvas.drawBitmap((Bitmap)u.b(), ad, ae, null);
          goto _L6
        i1 = 0;
          goto _L11
_L10:
        if (!k() || !g()) goto _L6; else goto _L12
_L12:
        if (((nxb) (B)).i == 5) goto _L14; else goto _L13
_L13:
        if (!o)
        {
            if (!ai)
            {
                canvas.drawBitmap((Bitmap)z.b(), W, aa, null);
            }
            bitmap = (Bitmap)v.b();
            canvas.drawRect(ab, ac, ab + bitmap.getWidth(), ac + bitmap.getHeight(), (Paint)x.b());
            canvas.drawBitmap(bitmap, ab, ac, null);
        }
          goto _L6
_L2:
        if (B != null)
        {
            switch (((nxb) (B)).i)
            {
            case 0: // '\0'
            case 2: // '\002'
                a(canvas, ((Drawable) (null)));
                break;

            case 3: // '\003'
                a(canvas, ((Drawable) (null)));
                break;

            case 4: // '\004'
            case 5: // '\005'
            case 6: // '\006'
                a(canvas, ((Drawable) (null)));
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
_L14:
        a(canvas, ((Drawable) (null)));
        if (true) goto _L6; else goto _L15
_L15:
        if (true) goto _L17; else goto _L16
_L16:
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        super.onLayout(flag, i1, j1, k1, l1);
        k1 -= i1;
        j1 = l1 - j1;
        W = (k1 - ((Bitmap)z.b()).getWidth()) / 2;
        aa = (j1 - ((Bitmap)z.b()).getHeight()) / 2;
        ab = s;
        ac = j1 - ((Bitmap)v.b()).getHeight() - s;
        ad = (k1 - ((Bitmap)u.b()).getWidth()) / 2;
        ae = (j1 - ((Bitmap)u.b()).getHeight()) / 2;
        af = (k1 - Q.getWidth()) / 2;
        ag = (j1 - Q.getHeight()) / 2;
        if (!flag || k1 == ap || j1 == ao) goto _L2; else goto _L1
_L1:
        if (d != 0) goto _L4; else goto _L3
_L3:
        if (l == 0 && m == 0)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 != 0)
        {
            c();
            b();
        }
_L6:
        k.setEmpty();
_L2:
        ap = k1;
        ao = j1;
        if (V != null)
        {
            V.layout(0, j1 - r, k1, j1);
        }
        return;
_L4:
        if (d == 5)
        {
            c();
            b();
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    protected void onMeasure(int i1, int j1)
    {
        super.onMeasure(i1, j1);
        if (V != null)
        {
            V.measure(android.view.View.MeasureSpec.makeMeasureSpec(android.view.View.MeasureSpec.getSize(i1), 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(r, 0x40000000));
        }
    }

    public void setSelected(boolean flag)
    {
        if (flag != isSelected())
        {
            super.setSelected(flag);
            if (M != null)
            {
                invalidate();
            }
        }
    }

    protected boolean verifyDrawable(Drawable drawable)
    {
        if (drawable == M || drawable == R)
        {
            return true;
        } else
        {
            return super.verifyDrawable(drawable);
        }
    }

}
