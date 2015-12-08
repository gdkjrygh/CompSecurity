// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.photos.list;

import amb;
import ame;
import amh;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import au;
import ayt;
import azh;
import b;
import c;
import dfo;
import ekp;
import elt;
import enu;
import fli;
import flj;
import fqf;
import frd;
import frg;
import frh;
import fro;
import frs;
import frt;
import fru;
import frv;
import frw;
import frx;
import fry;
import frz;
import fsa;
import fsb;
import fsc;
import fsd;
import fse;
import fsf;
import fso;
import gap;
import hgz;
import hkl;
import hlk;
import hll;
import hrc;
import hrd;
import hyy;
import hzg;
import hzh;
import iwf;
import java.util.concurrent.TimeUnit;
import jz;
import mml;
import mmm;
import nud;
import nug;
import oiu;
import olm;
import p;

public class PhotoTileView extends fsf
    implements android.animation.ValueAnimator.AnimatorUpdateListener, frd, mmm
{

    private static int F;
    private static int G;
    private static Rect H;
    private static Paint I;
    private static Paint J;
    private static int K;
    private static Bitmap L;
    private static Bitmap M;
    private static Bitmap N;
    private static Bitmap O;
    private static Bitmap P;
    private static int Q;
    private static TextPaint R;
    private static Rect S;
    public static final float a;
    private static final PointF s = new PointF(0.0F, 0.0F);
    private static boolean w;
    private static Paint x;
    private static Rect y;
    private Drawable A;
    private Drawable B;
    private Drawable C;
    private frg D;
    private long E;
    private int T;
    private final hzh U;
    private final hzg V;
    private final hyy W;
    private final hkl aa;
    private final hlk ab;
    private final enu ac;
    private final hrd ad;
    private final RectF ae;
    private final amh af;
    private final fli ag;
    private final ayt ah;
    private final frh ai;
    private final Matrix aj;
    private ame ak;
    private ame al;
    private ame am;
    private boolean an;
    private dfo ao;
    private hrc ap;
    private boolean aq;
    private final frs ar;
    private final azh as;
    private final nug at;
    private final nug au;
    private final nug av;
    private final nug aw;
    private final nug ax;
    fqf b;
    public fso c;
    public fro d;
    public long e;
    public boolean f;
    public flj g;
    public int h;
    public fsb i;
    public boolean j;
    public boolean k;
    public long l;
    public ekp m;
    public mml n;
    private final int t;
    private final int u;
    private ValueAnimator v;
    private StaticLayout z;

    public PhotoTileView(Context context)
    {
        this(context, null);
    }

    public PhotoTileView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        g = flj.b;
        T = fse.a;
        h = fsd.a;
        ae = new RectF();
        aj = new Matrix();
        ap = hrc.c;
        ar = new frs(this);
        as = new frt(this, this);
        at = new fru(this);
        au = new frv(this);
        av = new frw(this);
        aw = new frx(this);
        ax = new fry(this);
        attributeset = context.getApplicationContext().getResources();
        if (!w)
        {
            Object obj = new Paint();
            ((Paint) (obj)).setColor(attributeset.getColor(c.cY));
            ((Paint) (obj)).setStyle(android.graphics.Paint.Style.FILL);
            obj = new Paint();
            x = ((Paint) (obj));
            ((Paint) (obj)).setColor(attributeset.getColor(c.cX));
            x.setStyle(android.graphics.Paint.Style.FILL);
            y = new Rect();
            K = attributeset.getDimensionPixelSize(c.dl);
            obj = new LinearGradient(0.0F, 0.0F, 0.0F, K, attributeset.getColor(c.db), 0, android.graphics.Shader.TileMode.CLAMP);
            Paint paint = new Paint();
            J = paint;
            paint.setShader(((android.graphics.Shader) (obj)));
            L = a(attributeset, c.dv);
            M = a(attributeset, c.dC);
            N = a(attributeset, c.dB);
            O = a(attributeset, c.dA);
            P = a(attributeset, c.dD);
            Q = attributeset.getDimensionPixelSize(c.dg);
            obj = new TextPaint();
            R = ((TextPaint) (obj));
            ((TextPaint) (obj)).setAntiAlias(true);
            R.setColor(attributeset.getColor(c.dd));
            R.setTextSize(attributeset.getDimension(c.dt));
            R.setTypeface(Typeface.DEFAULT_BOLD);
            int i1 = attributeset.getDimensionPixelSize(c.dj);
            int j1 = attributeset.getDimensionPixelSize(c.dh);
            int k1 = attributeset.getDimensionPixelSize(c.di);
            int l1 = attributeset.getColor(c.cZ);
            R.setShadowLayer(i1, j1, k1, l1);
            S = new Rect();
            H = new Rect();
            I = new Paint();
            F = attributeset.getDimensionPixelOffset(c.dn);
            G = attributeset.getDimensionPixelOffset(c.dm);
            w = true;
        }
        i = new fsb(new fsc(this));
        ao = (dfo)olm.a(context, dfo);
        U = (hzh)olm.a(context, hzh);
        V = (hzg)olm.a(context, hzg);
        W = (hyy)olm.a(context, hyy);
        aa = (hkl)olm.b(context, hkl);
        ab = (hlk)olm.b(context, hlk);
        ac = (enu)olm.b(context, enu);
        ad = (hrd)olm.b(context, hrd);
        ai = (frh)olm.a(context, frh);
        af = (amh)olm.a(context, amh);
        ag = (fli)olm.a(context, fli);
        context = getResources().getDrawable(c.dc);
        ah = (ayt)ayt.c(context).b(context);
        t = getResources().getDimensionPixelSize(c.dr);
        u = getResources().getDimensionPixelSize(c.dq);
    }

    private ame a(flj flj1)
    {
        ame ame1 = af.f().a(ah);
        switch (fsa.a[flj1.ordinal()])
        {
        default:
            flj1 = String.valueOf(flj1);
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(flj1).length() + 37)).append("Cannot create request for image size ").append(flj1).toString());

        case 1: // '\001'
            return ame1.a(ag.d()).a(ayt.b(true));

        case 2: // '\002'
            return ame1.a(ag.e());

        case 3: // '\003'
            p.b(f, "Mini thumb can only be used for square images");
            break;
        }
        return ame1.a(ag.g());
    }

    private ame a(gap gap1)
    {
        if (gap1.h() == null)
        {
            return null;
        } else
        {
            return am.a(gap1.h());
        }
    }

    private static Bitmap a(Resources resources, int i1)
    {
        Bitmap bitmap = BitmapFactory.decodeResource(resources, i1);
        i1 = resources.getDimensionPixelSize(c.dk);
        Object obj = new RadialGradient(i1, i1, i1, resources.getColor(c.da), 0, android.graphics.Shader.TileMode.CLAMP);
        resources = new Paint();
        resources.setShader(((android.graphics.Shader) (obj)));
        int j1 = i1 * 2;
        obj = Bitmap.createBitmap(j1, j1, android.graphics.Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(((Bitmap) (obj)));
        canvas.drawCircle(i1, i1, i1, resources);
        canvas.drawBitmap(bitmap, (j1 - bitmap.getWidth()) / 2, (j1 - bitmap.getHeight()) / 2, null);
        return ((Bitmap) (obj));
    }

    public static Matrix a(PhotoTileView phototileview)
    {
        return phototileview.aj;
    }

    public static hrc a(PhotoTileView phototileview, hrc hrc1)
    {
        phototileview.ap = hrc1;
        return hrc1;
    }

    private void a(Canvas canvas)
    {
        if (!TextUtils.isEmpty(null)) goto _L2; else goto _L1
_L1:
        z = null;
_L4:
        StaticLayout staticlayout = z;
        if (staticlayout != null)
        {
            canvas.save();
            canvas.translate(0.0F, getHeight() / 2);
            staticlayout.draw(canvas);
            canvas.restore();
        }
        return;
_L2:
        if (z == null)
        {
            TextPaint textpaint = new TextPaint(1);
            textpaint.setTextSize(15F);
            textpaint.setColor(-1);
            z = new StaticLayout(null, textpaint, getWidth(), android.text.Layout.Alignment.ALIGN_CENTER, 1.0F, 0.0F, false);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static void a(PhotoTileView phototileview, ekp ekp1)
    {
        phototileview.b(ekp1);
    }

    public static boolean a(PhotoTileView phototileview, boolean flag)
    {
        phototileview.j = flag;
        return flag;
    }

    private void b(ekp ekp1)
    {
        if (al == null)
        {
            al = a(g);
            ak = a(flj.values()[g.ordinal() + 1]).a(ayt.b(amb.b));
            am = al.a().a(ayt.b(amb.d));
        }
        gap gap1 = ((elt)ekp1.a(elt)).e();
        if (ap == hrc.a)
        {
            ekp1 = ak.a(gap1);
            ekp1.b = null;
            ekp1.a(as);
            aq = false;
            return;
        }
        aq = true;
        ame ame1 = al.a(gap1);
        if (ak != null)
        {
            ekp1 = ak.a(gap1);
            ekp1.b = a(gap1);
        } else
        {
            ekp1 = a(gap1);
        }
        ame1.b = ekp1;
        ame1.a(as);
    }

    public static boolean b(PhotoTileView phototileview)
    {
        return phototileview.an;
    }

    public static boolean b(PhotoTileView phototileview, boolean flag)
    {
        phototileview.an = flag;
        return flag;
    }

    public static ekp c(PhotoTileView phototileview)
    {
        return phototileview.m;
    }

    public static void c(PhotoTileView phototileview, boolean flag)
    {
        Object obj = phototileview.j();
        fqf fqf1 = new fqf();
        fqf1.c.set(0.0F, 0.0F, phototileview.getRight(), phototileview.getBottom());
        fqf1.d = 1.0F;
        if (phototileview.v == null)
        {
            phototileview.v = ValueAnimator.ofPropertyValuesHolder(new PropertyValuesHolder[0]).setDuration(250L);
            phototileview.v.addUpdateListener(phototileview);
        }
        float f1;
        int i1;
        if (flag)
        {
            phototileview.b = fqf1;
            phototileview.b.a(phototileview.v, ((fqf) (obj)));
        } else
        {
            phototileview.b = ((fqf) (obj));
            phototileview.b.a(phototileview.v, fqf1);
        }
        phototileview.v.setInterpolator(phototileview.ar.d());
        phototileview.v.removeAllListeners();
        i1 = Math.round(((fqf) (obj)).c.left + ((fqf) (obj)).a);
        f1 = ((fqf) (obj)).c.top;
        obj = new Point(i1, Math.round(((fqf) (obj)).b + f1));
        phototileview.v.addListener(new frz(phototileview, ((Point) (obj))));
        phototileview.v.start();
    }

    public static frs d(PhotoTileView phototileview)
    {
        return phototileview.ar;
    }

    public static boolean d()
    {
        return android.os.Build.VERSION.SDK_INT < 21;
    }

    public static dfo e(PhotoTileView phototileview)
    {
        return phototileview.ao;
    }

    private void f()
    {
        if (D != null)
        {
            return;
        } else
        {
            Object obj = getResources();
            D = new frg();
            int i1 = ((Resources) (obj)).getDimensionPixelOffset(c._flddo);
            D.setBounds(0, 0, i1, i1);
            frg frg1 = D;
            frg1.a.setColor(-1);
            frg1.invalidateSelf();
            i1 = ((Resources) (obj)).getDimensionPixelOffset(c.dp);
            obj = D;
            float f1 = i1;
            obj.b = f1;
            ((frg) (obj)).a.setStrokeWidth(f1);
            ((frg) (obj)).a();
            ((frg) (obj)).invalidateSelf();
            obj = D;
            obj.c = 0.8F;
            ((frg) (obj)).invalidateSelf();
            D.setCallback(this);
            return;
        }
    }

    public static boolean f(PhotoTileView phototileview)
    {
        return phototileview.i();
    }

    private void g()
    {
        if (d() && i() && n == null)
        {
            n = (mml)olm.a(getContext(), mml);
            n.a(this, b());
        }
    }

    public static void g(PhotoTileView phototileview)
    {
        phototileview.g();
    }

    private void h()
    {
        if (d() && n != null)
        {
            n.a(this);
            n = null;
        }
    }

    public static void h(PhotoTileView phototileview)
    {
        phototileview.h();
    }

    private boolean i()
    {
        return aa != null && aa.b;
    }

    public static boolean i(PhotoTileView phototileview)
    {
        return phototileview.aq;
    }

    private fqf j()
    {
        int j1 = d.e();
        if (j1 != -1)
        {
            p.a(c);
            int i1 = c.a(j1);
            if (i1 != 0)
            {
                float f1;
                float f2;
                float f3;
                float f4;
                float f5;
                float f6;
                float f7;
                float f8;
                float f9;
                float f10;
                float f11;
                fqf fqf1;
                boolean flag;
                if (i1 > 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                p.b(flag);
                j1 = c.b(j1);
                f3 = ((i1 + 1) * u - t * (i1 - 1)) / i1;
                f4 = u - t;
                f1 = (float)getWidth() - f3;
                f2 = (float)getHeight() - f4;
                f5 = Math.max(f1 / (float)getWidth(), f2 / (float)getHeight());
                f6 = f4 / 2.0F;
                f7 = (u + t) / i1;
                f8 = u;
                f9 = j1;
                f11 = (float)getWidth() * f5;
                f10 = (float)getHeight() * f5;
                if (f11 > f1)
                {
                    f1 = (f11 - f1) / 2.0F;
                } else
                {
                    f1 = 0.0F;
                }
                if (f10 > f2)
                {
                    f2 = (f10 - f2) / 2.0F;
                } else
                {
                    f2 = 0.0F;
                }
                fqf1 = new fqf();
                fqf1.a = f8 - f9 * f7 - f1;
                fqf1.b = f6 - f2;
                fqf1.c.set(f1, f2, ((float)getRight() - f3) + f1, ((float)getBottom() - f4) + f2);
                fqf1.d = f5;
                return fqf1;
            }
        }
        return null;
    }

    public static fro j(PhotoTileView phototileview)
    {
        return phototileview.d;
    }

    public static hyy k(PhotoTileView phototileview)
    {
        return phototileview.W;
    }

    public static hzh l(PhotoTileView phototileview)
    {
        return phototileview.U;
    }

    public static hzg m(PhotoTileView phototileview)
    {
        return phototileview.V;
    }

    public final PointF a(int i1, int j1, int k1, int l1)
    {
        if (!f)
        {
            return s;
        } else
        {
            return ai.a(i1, j1, k1, l1);
        }
    }

    public final jz a()
    {
        Resources resources = getResources();
        jz jz1 = new jz();
        if (ab.c)
        {
            jz1.put(Integer.valueOf(au.h), resources.getString(b.qd));
            hlk hlk1 = ab;
            long l1 = e;
            boolean flag;
            if (hlk1.a.a(l1) == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                jz1.put(Integer.valueOf(au.i), resources.getString(b.qe));
            }
            return jz1;
        } else
        {
            jz1.put(Integer.valueOf(au.j), resources.getString(b.qf));
            return jz1;
        }
    }

    public void a(int i1, long l1)
    {
        if (T == i1 && i1 != fse.e)
        {
            return;
        }
        if (T != fse.d) goto _L2; else goto _L1
_L1:
        if (D != null)
        {
            D.stop();
        }
_L4:
        T = i1;
        E = l1;
        invalidate();
        return;
_L2:
        if (i1 == fse.d)
        {
            f();
            if (!D.isRunning())
            {
                D.start();
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void a(ekp ekp1)
    {
        m = ekp1;
        if (oiu.a(this))
        {
            b(ekp1);
        }
        an = c();
        if (an)
        {
            ar.a(true);
            return;
        } else
        {
            ar.a(false);
            return;
        }
    }

    public final boolean a(int i1)
    {
        if (i1 == au.j)
        {
            hlk hlk1 = ab;
            long l1 = e;
            hlk1.d = hlk1.a.a(l1);
            hll hll1 = hlk1.e;
            CharSequence charsequence = hlk1.b;
            if (android.os.Build.VERSION.SDK_INT >= 16)
            {
                if (android.os.Build.VERSION.SDK_INT < 19)
                {
                    hll1.a.announceForAccessibility(charsequence);
                } else
                {
                    hll1.a.setContentDescription("");
                    hll1.a.setContentDescription(charsequence);
                }
            }
            hlk1.c = true;
            return true;
        }
        if (i1 == au.i)
        {
            hlk hlk2 = ab;
            long l2 = e;
            hlk2.a(hlk2.a.a(l2));
            return true;
        }
        if (i1 == au.h)
        {
            hlk hlk3 = ab;
            long l3 = e;
            hlk3.a(hlk3.a.a(l3) + 1);
            return true;
        } else
        {
            return false;
        }
    }

    public final String b()
    {
        return String.valueOf(m.b());
    }

    public final void b(int i1)
    {
        boolean flag;
        if (i1 != fse.e)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag, "RECENTLY_DONE can only set by setRecentUploaded() with completion time.");
        a(i1, 0L);
    }

    public final boolean c()
    {
        return U != null && m != null && U.a(m);
    }

    public boolean hasOverlappingRendering()
    {
        return false;
    }

    public void invalidateDrawable(Drawable drawable)
    {
        if (drawable == D)
        {
            invalidate();
            return;
        } else
        {
            super.invalidateDrawable(drawable);
            return;
        }
    }

    public void onAnimationUpdate(ValueAnimator valueanimator)
    {
        if (b != null)
        {
            fqf fqf1 = b;
            fqf1.a = ((Float)valueanimator.getAnimatedValue("translate_x")).floatValue();
            fqf1.b = ((Float)valueanimator.getAnimatedValue("translate_y")).floatValue();
            fqf1.c.set(((Float)valueanimator.getAnimatedValue("clip_left")).floatValue(), ((Float)valueanimator.getAnimatedValue("clip_top")).floatValue(), ((Float)valueanimator.getAnimatedValue("clip_right")).floatValue(), ((Float)valueanimator.getAnimatedValue("clip_bottom")).floatValue());
            fqf1.d = ((Float)valueanimator.getAnimatedValue("scale")).floatValue();
        }
        invalidate();
    }

    protected void onAttachedToWindow()
    {
        iwf.a("PhotoTileView AttachToWindow");
        super.onAttachedToWindow();
        if (D != null)
        {
            frg frg1 = D;
            boolean flag;
            if (getVisibility() == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            frg1.setVisible(flag, false);
        }
        W.a.a(au, false);
        U.a.a(at, false);
        if (aa != null)
        {
            aa.a.a(av, false);
            g();
        }
        if (ac != null)
        {
            ac.a.a(aw, true);
        }
        if (ad != null)
        {
            ad.a.a(ax, false);
            ap = ad.b;
        }
        if (m != null)
        {
            b(m);
        }
        iwf.a();
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        if (D != null)
        {
            D.setVisible(false, false);
        }
        W.a.a(au);
        U.a.a(at);
        if (aa != null)
        {
            aa.a.a(av);
            h();
        }
        if (ac != null)
        {
            ac.a.a(aw);
        }
        if (ad != null)
        {
            ad.a.a(ax);
        }
        af.a(as);
    }

    public void onDraw(Canvas canvas)
    {
        Object obj;
        int i1;
label0:
        {
            i1 = canvas.save();
            if (!i() && (v == null || !v.isRunning()))
            {
                break label0;
            }
            if (v == null || !v.isRunning())
            {
                b = j();
                if (b == null)
                {
                    break label0;
                }
                fro fro1 = d;
                Math.round(b.c.left + b.a);
                Math.round(b.c.top + b.b);
            }
            fqf fqf1 = b;
            canvas.translate(fqf1.a, fqf1.b);
            canvas.clipRect(fqf1.c);
            canvas.scale(fqf1.d, fqf1.d);
        }
        canvas.concat(aj);
        super.onDraw(canvas);
        canvas.restoreToCount(i1);
        if (!j && !W.d())
        {
            a(canvas);
            return;
        }
        if (!isEnabled())
        {
            y.set(0, 0, getWidth(), getHeight());
            canvas.drawRect(y, x);
            a(canvas);
            return;
        }
        if (W.d() && m != null && !U.a(m))
        {
            ae.set(0.0F, 0.0F, canvas.getWidth(), K);
            canvas.drawRect(ae, J);
        }
        float f1;
        float f3;
        float f4;
        String s1;
        int k1;
        int i2;
        int j2;
        int k2;
        int l2;
        if (h != fsd.a)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 == 0) goto _L2; else goto _L1
_L1:
        if (i())
        {
            canvas.translate(-u, u);
        }
        fsa.b[h - 1];
        JVM INSTR tableswitch 1 5: default 380
    //                   1 762
    //                   2 770
    //                   3 778
    //                   4 786
    //                   5 794;
           goto _L3 _L4 _L5 _L6 _L7 _L8
_L3:
        obj = null;
_L14:
        if (obj != null)
        {
            canvas.drawBitmap(((Bitmap) (obj)), getWidth() - ((Bitmap) (obj)).getWidth(), 0.0F, null);
        }
        if (l > 0L)
        {
            s1 = DateUtils.formatElapsedTime(l / 1000L);
            obj = s1;
            if (s1.startsWith("00"))
            {
                obj = s1.substring(1);
            }
            R.getTextBounds(((String) (obj)), 0, ((String) (obj)).length(), S);
            f1 = (R.descent() - R.ascent()) / 2.0F;
            f3 = R.descent();
            f4 = R.measureText(((String) (obj)));
            canvas.drawText(((String) (obj)), (float)(getWidth() - M.getWidth() - Q) - f4, (f1 - f3) + (float)(M.getHeight() / 2), R);
        }
        if (i())
        {
            canvas.translate(u, -u);
        }
_L2:
        i2 = getWidth();
        j2 = getHeight();
        fsa.c[T - 1];
        JVM INSTR tableswitch 1 4: default 616
    //                   1 802
    //                   2 855
    //                   3 908
    //                   4 921;
           goto _L9 _L10 _L11 _L12 _L13
_L13:
        break MISSING_BLOCK_LABEL_921;
_L9:
        obj = null;
_L15:
        if (obj != null)
        {
            canvas.save();
            canvas.rotate(180F, getWidth() / 2, getHeight() / 2);
            ae.set(0.0F, 0.0F, canvas.getWidth(), K);
            canvas.drawRect(ae, J);
            canvas.restore();
            canvas.save();
            i1 = ((Drawable) (obj)).getBounds().width();
            k1 = ((Drawable) (obj)).getBounds().height();
            k2 = F;
            l2 = G;
            canvas.translate(i2 - i1 - k2, j2 - k1 - l2);
            ((Drawable) (obj)).draw(canvas);
            canvas.restore();
        }
        a(canvas);
        return;
_L4:
        obj = M;
          goto _L14
_L5:
        obj = O;
          goto _L14
_L6:
        obj = P;
          goto _L14
_L7:
        obj = N;
          goto _L14
_L8:
        obj = L;
          goto _L14
_L10:
        if (B == null)
        {
            B = getResources().getDrawable(c.dx);
            B.setBounds(0, 0, B.getIntrinsicWidth(), B.getIntrinsicHeight());
        }
        obj = B;
          goto _L15
_L11:
        if (A == null)
        {
            A = getResources().getDrawable(c.dE);
            A.setBounds(0, 0, A.getIntrinsicWidth(), A.getIntrinsicHeight());
        }
        obj = A;
          goto _L15
_L12:
        f();
        obj = D;
          goto _L15
        if (C == null)
        {
            C = getResources().getDrawable(c.dw).mutate();
            C.setBounds(0, 0, C.getIntrinsicWidth(), C.getIntrinsicHeight());
        }
        obj = C;
        float f2 = ((float)E + a) - (float)SystemClock.elapsedRealtime();
        int j1;
        if (f2 > 0.0F)
        {
            int l1 = (int)(ar.d().getInterpolation(f2 / a) * 255F);
            j1 = l1;
            if (l1 < 0)
            {
                j1 = 0;
            }
            postInvalidateDelayed(33L);
        } else
        {
            j1 = 0;
        }
        ((Drawable) (obj)).setAlpha(j1);
          goto _L15
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilitynodeinfo)
    {
        super.onInitializeAccessibilityNodeInfo(accessibilitynodeinfo);
        if (!d() && i())
        {
            jz jz1 = a();
            int i1 = 0;
            while (i1 < jz1.size()) 
            {
                accessibilitynodeinfo.addAction(new android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction(((Integer)jz1.b(i1)).intValue(), (CharSequence)jz1.c(i1)));
                i1++;
            }
        }
    }

    public void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        super.onLayout(flag, i1, j1, k1, l1);
        z = null;
        ao.a(this, m, false);
    }

    public void onMeasure(int i1, int j1)
    {
        if (f)
        {
            j1 = i1;
        }
        super.onMeasure(i1, j1);
    }

    protected void onSizeChanged(int i1, int j1, int k1, int l1)
    {
        super.onSizeChanged(i1, j1, k1, l1);
        if (an)
        {
            ar.a(true);
        }
    }

    public boolean performAccessibilityAction(int i1, Bundle bundle)
    {
        return a(i1) || super.performAccessibilityAction(i1, bundle);
    }

    public void setOnClickListener(android.view.View.OnClickListener onclicklistener)
    {
        i.a = onclicklistener;
        if (onclicklistener != null)
        {
            onclicklistener = i;
        } else
        {
            onclicklistener = null;
        }
        super.setOnClickListener(onclicklistener);
    }

    public void setVisibility(int i1)
    {
        super.setVisibility(i1);
        if (D != null)
        {
            frg frg1 = D;
            boolean flag;
            if (i1 == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            frg1.setVisible(flag, false);
        }
    }

    protected boolean verifyDrawable(Drawable drawable)
    {
        return drawable == D || super.verifyDrawable(drawable);
    }

    static 
    {
        a = TimeUnit.SECONDS.toMillis(3L);
    }
}
