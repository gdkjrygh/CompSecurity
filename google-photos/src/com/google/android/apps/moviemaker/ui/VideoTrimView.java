// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.moviemaker.ui;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.Vibrator;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import b;
import bhx;
import c;
import dbp;
import dbt;
import dbu;
import dbv;
import dbw;
import dbx;
import dby;
import dbz;
import dca;
import dcb;
import ed;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org;
import ori;
import ork;
import oro;
import orr;
import oru;
import orv;
import ote;
import ovg;
import ovl;
import ovn;
import ovr;
import ovs;
import ovt;
import ovu;
import p;

public class VideoTrimView extends ViewGroup
    implements oro, orv, ovs
{

    private static final String c = com/google/android/apps/moviemaker/ui/VideoTrimView.getSimpleName();
    private final ImageView A;
    private final ImageView B;
    private final Runnable C = new dbt(this);
    private final List D = new ArrayList();
    private final List E = new ArrayList();
    private float F;
    private boolean G;
    private dbp H;
    private float I;
    private long J;
    private dbz K;
    private final Rect L = new Rect();
    private ork M;
    private orr N;
    private ote O;
    private ovn P;
    private ovr Q;
    private ovr R;
    private ovr S;
    private ovt T;
    private dcb U;
    private boolean V;
    private int W;
    public final float a;
    private float aa;
    private float ab;
    private float ac;
    private float ad;
    private long ae;
    private long af;
    private int ag;
    private long ah;
    private int ai;
    private dbx aj;
    private dca ak;
    private Animator al;
    private Animator am;
    public ori b;
    private boolean d;
    private Rect e;
    private final int f;
    private final int g;
    private final int h;
    private final int i;
    private final int j;
    private final int k;
    private final int l;
    private final int m;
    private final int n;
    private final int o;
    private final int p;
    private final int q;
    private final int r;
    private final boolean s;
    private int t;
    private final boolean u;
    private final boolean v;
    private final boolean w;
    private final boolean x;
    private final boolean y;
    private final Paint z = new Paint();

    public VideoTrimView(Context context, AttributeSet attributeset)
    {
        boolean flag1 = true;
        super(context, attributeset);
        K = dbz.a;
        ah = -1L;
        aj = new dbx(this);
        ak = new dca(this);
        q = ViewConfiguration.get(context).getScaledTouchSlop();
        t = ViewConfiguration.getLongPressTimeout();
        Resources resources = context.getResources();
        attributeset = context.obtainStyledAttributes(attributeset, bhx.l);
        a = attributeset.getFraction(bhx.s, 1, 100, 1.0F);
        f = (int)(resources.getDimension(b.dM) * a);
        g = (int)(resources.getDimension(b.dN) * a);
        i = (int)(resources.getDimension(b.dJ) * a);
        j = (int)(resources.getDimension(b.dI) * a);
        s = attributeset.getBoolean(bhx.r, true);
        int i1 = attributeset.getInteger(bhx.t, dby.a - 1);
        int j1;
        boolean flag;
        boolean flag2;
        if (i1 >= 0 && i1 < dby.a().length)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag);
        r = dby.a()[i1];
        i1 = attributeset.getResourceId(bhx.p, b.eC);
        j1 = attributeset.getResourceId(bhx.o, b.dp);
        h = ed.a(context, i1).getIntrinsicWidth() / 2;
        flag2 = attributeset.getBoolean(bhx.q, false);
        w = attributeset.getBoolean(bhx.m, false);
        x = attributeset.getBoolean(bhx.n, false);
        y = attributeset.getBoolean(bhx.u, true);
        attributeset.recycle();
        J = resources.getInteger(b.hC) * 1000;
        k = resources.getDimensionPixelSize(b.dK);
        l = resources.getDimensionPixelSize(b.dL);
        I = resources.getInteger(b.hA);
        m = resources.getInteger(b.hB);
        n = resources.getInteger(b.hy);
        o = resources.getInteger(b.hx);
        p = resources.getInteger(b.hz);
        ai = o;
        z.setColor(resources.getColor(j1));
        z.setStrokeWidth(i);
        z.setStyle(android.graphics.Paint.Style.STROKE);
        A = a(context, i1);
        addView(A);
        B = a(context, i1);
        addView(B);
        H = new dbp(context);
        if (context.checkCallingOrSelfPermission("android.permission.VIBRATE") == 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        u = flag;
        v = flag2 & flag;
        setWillNotDraw(false);
        if (w)
        {
            setClipToPadding(false);
        }
    }

    private static float a(MotionEvent motionevent, int i1)
    {
        i1 = motionevent.findPointerIndex(i1);
        if (i1 == -1)
        {
            return (0.0F / 0.0F);
        } else
        {
            return motionevent.getX(i1);
        }
    }

    private static long a(long l1, long l2, long l3)
    {
        if (Math.abs(l2 - l1) < Math.abs(l3 - l1))
        {
            return l2;
        } else
        {
            return l3;
        }
    }

    private ImageView a(Context context, int i1)
    {
        ovu ovu1 = new ovu(context, i1, i);
        context = new ImageView(context);
        context.setImageDrawable(ovu1);
        context.setScaleType(android.widget.ImageView.ScaleType.CENTER);
        return context;
    }

    private void a(float f1)
    {
        if (!c() || b == null)
        {
            return;
        }
        float f2;
        float f3;
        String s1;
        int i1;
        long l1;
        boolean flag;
        if (U == dcb.a)
        {
            l1 = i();
            flag = true;
        } else
        {
            l1 = j();
            flag = false;
        }
        s1 = b.a(getContext(), l1 / 1000L, M.c);
        if (ak.a())
        {
            if (f1 < (float)L.centerX())
            {
                f1 = L.left;
            } else
            {
                f1 = L.right;
            }
        }
        f3 = z.getStrokeWidth() / 2.0F;
        f2 = f3;
        if (flag)
        {
            f2 = -f3;
        }
        i1 = -j;
        b.a(s1, (int)(f2 + f1), i1, this, flag);
    }

    private void a(float f1, float f2)
    {
        A.setX(f1 - (float)h);
        B.setX(f2 - (float)h);
        float f3 = ((float)(h * 2) + f1) - f2;
        if (f3 > 0.0F)
        {
            f3 = ((float)h - f3) / (float)h;
        } else
        {
            f3 = 1.0F;
        }
        ((ovu)A.getDrawable()).a(f3, false);
        ((ovu)B.getDrawable()).a(f3, true);
        H.b = f1;
        H.c = f2;
        if (U != dcb.a)
        {
            f1 = f2;
        }
        a(f1);
    }

    private void a(int i1)
    {
        if (u)
        {
            ((Vibrator)getContext().getSystemService("vibrator")).vibrate(i1);
        }
    }

    private void a(long l1)
    {
        long l2 = e(l1);
        l1 = l2;
        if (r == dby.b)
        {
            long l3 = N.f;
            l1 = l2;
            if (l3 - l2 < N.c)
            {
                int i1 = O.d(l3 - N.c - 1L);
                l1 = O.b(i1);
            }
        }
        N.a(l1);
    }

    private void a(ImageView imageview, RectF rectf)
    {
        float f1;
        float f2;
        float f3;
        f1 = 0.0F;
        f3 = (float)k / 2.0F;
        float f4 = imageview.getX() + (float)h;
        f2 = f4 - f3;
        f3 += f4;
        if (f2 >= 0.0F) goto _L2; else goto _L1
_L1:
        f1 = -f2;
_L4:
        rectf.left = f1 + f2;
        rectf.top = imageview.getTop();
        rectf.right = f3 + f1;
        rectf.bottom = imageview.getBottom();
        return;
_L2:
        if (f3 > (float)getWidth())
        {
            f1 = (float)getWidth() - f3;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static void a(VideoTrimView videotrimview, float f1)
    {
        if (videotrimview.M.a()) goto _L2; else goto _L1
_L1:
        long l2 = (long)(1000F * f1);
        if (videotrimview.U != dcb.a) goto _L4; else goto _L3
_L3:
        long l1;
        long l3 = videotrimview.j() - videotrimview.l();
        long l5 = videotrimview.M.b(1.0F);
        l1 = l2;
        if (l5 + l2 > l3)
        {
            l1 = l3 - l5;
        }
_L9:
        f1 = videotrimview.M.a(l1);
        float f2 = videotrimview.F;
        videotrimview.F = f1 * (float)videotrimview.L.width() + f2;
        videotrimview.T.a(videotrimview.M.b(0.0F), videotrimview.M.b(1.0F), 0xf4240L);
        videotrimview.a(videotrimview.K);
        l1 = videotrimview.b(Math.max(videotrimview.L.left, Math.min(videotrimview.L.right, videotrimview.aa)));
        if (videotrimview.U != dcb.a) goto _L6; else goto _L5
_L5:
        videotrimview.a(l1);
_L2:
        return;
_L4:
        l1 = l2;
        if (videotrimview.U == dcb.b)
        {
            long l4 = videotrimview.i() + videotrimview.l();
            long l6 = videotrimview.M.b(0.0F);
            l1 = l2;
            if (l6 + l2 < l4)
            {
                l1 = l4 - l6;
            }
        }
        continue; /* Loop/switch isn't completed */
_L6:
        if (videotrimview.U != dcb.b) goto _L2; else goto _L7
_L7:
        videotrimview.b(l1);
        return;
        if (true) goto _L9; else goto _L8
_L8:
    }

    public static void a(VideoTrimView videotrimview, dbz dbz1)
    {
        videotrimview.a(dbz1);
    }

    public static void a(VideoTrimView videotrimview, ovl ovl1)
    {
        videotrimview.a(ovl1);
    }

    private void a(dbz dbz1)
    {
        K = (dbz)p.a(dbz1);
        float f1 = K.b + (float)g;
        int i1 = dbz1.d;
        float f2 = F % f1;
        int j1;
        int j2;
        boolean flag2;
        if (M.c)
        {
            int k1 = (int)(Math.ceil((float)(getWidth() - getPaddingLeft() - getPaddingRight()) / f1) + 1.0D);
            int i2 = (int)Math.ceil(((float)L.left + f2) / f1);
            dbz1 = S;
            j1 = 0 - i2;
            k1 = i1 + (k1 - i2);
            flag2 = false;
            i1 = j1;
            j1 = k1;
        } else
        if (Q != null && Q.g())
        {
            dbz1 = Q;
            flag2 = G;
            G = false;
            l1 = 0;
            j1 = i1;
            i1 = l1;
        } else
        {
            boolean flag = false;
            dbz1 = null;
            flag2 = false;
            j1 = i1;
            i1 = ((flag) ? 1 : 0);
        }
        j2 = i1;
        while (j2 < j1) 
        {
            int l1 = j2 - i1;
            float f3;
            float f4;
            float f5;
            float f6;
            ovl ovl1;
            long l2;
            if (E.size() > l1)
            {
                ovl1 = (ovl)E.get(l1);
            } else
            {
                ovl1 = new ovl();
                E.add(l1, ovl1);
                ovl1.setCallback(this);
                D.add(ovl1);
            }
            f3 = (float)L.left + (float)j2 * f1 + f2;
            f4 = getPaddingTop();
            f5 = K.b + f3;
            f6 = K.c;
            ovl1.setBounds((int)f3, (int)f4, (int)f5, (int)(f6 + f4));
            l2 = b(f3 + (f5 - f3) / 2.0F);
            ovl1.b = l2;
            if (dbz1 != null)
            {
                ovg ovg1 = dbz1.a(l2, true);
                boolean flag1 = true;
                ovg ovg2 = ovl1.a;
                l1 = ((flag1) ? 1 : 0);
                if (ovg2 != null)
                {
                    l1 = ((flag1) ? 1 : 0);
                    if (ovg1 != null)
                    {
                        long l3 = ovg2.b();
                        long l4 = ovg1.b();
                        l1 = ((flag1) ? 1 : 0);
                        if (l4 > l3)
                        {
                            if (Math.abs(l2 - l4) < Math.abs(l2 - l3))
                            {
                                l1 = 1;
                            } else
                            {
                                l1 = 0;
                            }
                        }
                    }
                }
                if (l1 != 0)
                {
                    ovl1.a(ovg1);
                }
                if (ovg1 != null)
                {
                    ovg1.e();
                }
            }
            j2++;
        }
        for (; E.size() > j1 - i1; a((ovl)E.remove(E.size() - 1))) { }
        if (flag2)
        {
            for (i1 = 0; i1 < E.size(); i1++)
            {
                dbz1 = (ovl)E.get(i1);
                dbz1.a(false);
                dbz1.a(true, i1 * 50);
            }

        }
    }

    private void a(ovl ovl1)
    {
        ovl1.a(null);
        ovl1.setCallback(null);
        D.remove(ovl1);
    }

    private void a(boolean flag)
    {
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            String s1;
            Object obj;
            String s2;
            String s3;
            String s4;
            String s5;
            int i1;
            int j1;
            int k1;
            int l1;
            long l2;
            long l3;
            if (flag)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            setAccessibilityLiveRegion(i1);
        }
        l2 = TimeUnit.MICROSECONDS.toSeconds(i());
        l3 = TimeUnit.MICROSECONDS.toSeconds(j());
        i1 = (int)TimeUnit.MICROSECONDS.toMinutes(i());
        j1 = (int)TimeUnit.MICROSECONDS.toMinutes(j());
        k1 = (int)(l2 - TimeUnit.MINUTES.toSeconds(i1));
        l1 = (int)(l3 - TimeUnit.MINUTES.toSeconds(j1));
        obj = getContext().getResources();
        s4 = ((Resources) (obj)).getQuantityString(b.hG, i1, new Object[] {
            Integer.valueOf(i1)
        });
        s5 = ((Resources) (obj)).getQuantityString(b.hI, k1, new Object[] {
            Integer.valueOf(k1)
        });
        s2 = ((Resources) (obj)).getQuantityString(b.hG, j1, new Object[] {
            Integer.valueOf(j1)
        });
        s3 = ((Resources) (obj)).getQuantityString(b.hI, l1, new Object[] {
            Integer.valueOf(l1)
        });
        s1 = String.valueOf(((Resources) (obj)).getString(c.ap));
        s4 = String.valueOf(((Resources) (obj)).getString(c.ao, new Object[] {
            (new StringBuilder(String.valueOf(s4).length() + 1 + String.valueOf(s5).length())).append(s4).append(" ").append(s5).toString()
        }));
        obj = String.valueOf(((Resources) (obj)).getString(c.an, new Object[] {
            (new StringBuilder(String.valueOf(s2).length() + 1 + String.valueOf(s3).length())).append(s2).append(" ").append(s3).toString()
        }));
        s1 = (new StringBuilder(String.valueOf(s1).length() + 2 + String.valueOf(s4).length() + String.valueOf(obj).length())).append(s1).append(" ").append(s4).append(" ").append(((String) (obj))).toString();
        setContentDescription(s1);
        if (android.os.Build.VERSION.SDK_INT < 19 && flag)
        {
            announceForAccessibility(s1);
        }
    }

    private void a(boolean flag, boolean flag1)
    {
        float f2 = 2.0F;
        AnimatorSet animatorset = new AnimatorSet();
        float f1;
        float f3;
        ImageView imageview;
        android.animation.AnimatorSet.Builder builder;
        long l1;
        if (flag1)
        {
            if (al != null)
            {
                al.cancel();
            }
            al = animatorset;
            imageview = A;
        } else
        {
            if (am != null)
            {
                am.cancel();
            }
            am = animatorset;
            imageview = B;
        }
        f3 = imageview.getScaleX();
        if (flag)
        {
            f1 = 2.0F;
        } else
        {
            f1 = 1.0F;
        }
        f1 *= a;
        l1 = getContext().getResources().getInteger(0x10e0000);
        builder = animatorset.play(ObjectAnimator.ofFloat(imageview, View.SCALE_X, new float[] {
            f3, f1
        })).with(ObjectAnimator.ofFloat(imageview, View.SCALE_Y, new float[] {
            f3, f1
        }));
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            float f4 = imageview.getTranslationZ();
            if (flag)
            {
                f1 = f2;
            } else
            {
                f1 = 0.0F;
            }
            f2 = a;
            builder.with(ObjectAnimator.ofFloat(imageview, View.TRANSLATION_Z, new float[] {
                f4, f1 * f2
            }));
        }
        animatorset.setDuration(l1);
        animatorset.setInterpolator(new DecelerateInterpolator());
        animatorset.start();
    }

    public static boolean a(VideoTrimView videotrimview)
    {
        return videotrimview.h();
    }

    public static boolean a(VideoTrimView videotrimview, boolean flag)
    {
        videotrimview.G = flag;
        return flag;
    }

    private long b(float f1)
    {
        return M.b((f1 - (float)L.left) / (float)L.width());
    }

    private dbz b(int i1)
    {
        boolean flag;
        if (i1 >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag);
        if (i1 == 0)
        {
            return dbz.a;
        }
        float f1 = 1.777778F;
        if (O != null)
        {
            f1 = O.a();
        }
        float f2 = f;
        int j1 = Math.max(1, Math.round((float)i1 / (f2 * f1)));
        f2 = i1 / j1 - g;
        return new dbz(f2, f2 / f1, j1);
    }

    private void b(long l1)
    {
        long l2 = e(l1);
        l1 = l2;
        if (r == dby.b)
        {
            long l3 = N.e;
            l1 = l2;
            if (l2 - l3 < N.c)
            {
                int i1 = O.c(l3 + N.c + 1L);
                if (i1 < 0)
                {
                    l1 = N.a.f;
                } else
                {
                    l1 = O.b(i1);
                }
            }
        }
        N.b(l1);
    }

    public static boolean b(VideoTrimView videotrimview)
    {
        return videotrimview.c();
    }

    private void c(long l1)
    {
        if (l1 < 0L)
        {
            ag = -1;
            ah = -1L;
        } else
        if (v && O != null)
        {
            int i1 = O.a(l1);
            if (i1 != ag)
            {
                if (M.c && !h())
                {
                    ah = System.currentTimeMillis();
                    ai = p;
                    postDelayed(C, ai);
                }
                ag = i1;
                return;
            }
        }
    }

    private boolean c()
    {
        return U == dcb.a || U == dcb.b;
    }

    public static boolean c(VideoTrimView videotrimview)
    {
        return videotrimview.n();
    }

    private float d(long l1)
    {
        return M.b(l1) * (float)L.width() + (float)L.left;
    }

    private void d()
    {
        ab = aa;
        ae = i();
        af = j();
        ac = o();
        ad = p();
    }

    public static boolean d(VideoTrimView videotrimview)
    {
        return videotrimview.V;
    }

    private long e(long l1)
    {
        dbw.c[r - 1];
        JVM INSTR tableswitch 1 2: default 32
    //                   1 34
    //                   2 87;
           goto _L1 _L2 _L3
_L1:
        return l1;
_L2:
        long l3 = a(l1, 0L, O.f);
        ovg ovg1 = S.a(l1, false);
        long l2 = l3;
        if (ovg1 != null)
        {
            l2 = a(l1, ovg1.b(), l3);
            ovg1.e();
        }
        return l2;
_L3:
        if (O != null)
        {
            int i1 = O.b(l1);
            return a(l1, O.b(i1), O.f);
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    private void e()
    {
        boolean flag1 = false;
        ViewParent viewparent;
        int i1;
        boolean flag;
        if (U != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.b(flag);
        flag = flag1;
        if (!V)
        {
            flag = true;
        }
        p.b(flag);
        V = true;
        N.a(U.d);
        if (c() && b != null)
        {
            b.a();
            long l1;
            if (U == dcb.a)
            {
                l1 = i();
            } else
            {
                l1 = j();
            }
            a(d(l1));
        }
        viewparent = getParent();
        if (viewparent != null)
        {
            viewparent.requestDisallowInterceptTouchEvent(true);
        }
        i1 = org.a;
    }

    public static void e(VideoTrimView videotrimview)
    {
        videotrimview.e();
    }

    private void f()
    {
        if (x && c())
        {
            ViewParent viewparent;
            boolean flag;
            if (U == dcb.a)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            a(false, flag);
        }
        if (V)
        {
            p.b(V);
            N.b(U.d);
            U = null;
            V = false;
            if (b != null)
            {
                b.b();
            }
            if (M.c)
            {
                p.b(M.c);
                F = 0.0F;
                M.a(true);
                g();
                d();
                T.b(this);
                T.a();
                T = null;
            }
            ak.a(0.0F);
            viewparent = getParent();
            if (viewparent != null)
            {
                viewparent.requestDisallowInterceptTouchEvent(false);
            }
            a(true);
        }
    }

    public static void f(VideoTrimView videotrimview)
    {
        boolean flag;
        if (!videotrimview.M.c)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.b(flag);
        p.b(videotrimview.c());
        if (videotrimview.M.b > videotrimview.J)
        {
            double d1;
            long l1;
            long l2;
            if (videotrimview.U == dcb.a)
            {
                l1 = videotrimview.i();
            } else
            {
                l1 = videotrimview.j();
            }
            d1 = videotrimview.M.b(l1);
            l2 = (long)((double)l1 - (double)videotrimview.J * d1);
            l1 = (long)((double)l1 + (1.0D - d1) * (double)videotrimview.J);
            videotrimview.T = new ovt(videotrimview.P);
            videotrimview.T.a(l2, l1, 0xf4240L);
            videotrimview.T.a(videotrimview);
            videotrimview.M.a(l2, l1, true);
            videotrimview.g();
            videotrimview.d();
            videotrimview.a(videotrimview.m);
            videotrimview.requestLayout();
        }
    }

    public static int g(VideoTrimView videotrimview)
    {
        return videotrimview.q;
    }

    private void g()
    {
        Object obj = new ArrayList(E);
        E.clear();
        ObjectAnimator objectanimator;
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); objectanimator.start())
        {
            ovl ovl1 = (ovl)((Iterator) (obj)).next();
            objectanimator = ObjectAnimator.ofInt(ovl1, "alpha", new int[] {
                0
            });
            objectanimator.addListener(new dbu(this, ovl1));
        }

        M.d = true;
        a(K);
        ovl ovl2;
        for (Iterator iterator = E.iterator(); iterator.hasNext(); ObjectAnimator.ofInt(ovl2, "alpha", new int[] {
    0, 255
}).start())
        {
            ovl2 = (ovl)iterator.next();
            ovl2.a(true);
        }

        M.d = false;
    }

    public static void h(VideoTrimView videotrimview)
    {
        if (videotrimview.U != dcb.a) goto _L2; else goto _L1
_L1:
        videotrimview.a(videotrimview.i());
_L4:
        videotrimview.d();
        return;
_L2:
        if (videotrimview.U == dcb.b)
        {
            videotrimview.b(videotrimview.j());
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private boolean h()
    {
        long l1 = System.currentTimeMillis();
        if (l1 - ah >= (long)ai)
        {
            a(n);
            ai = o;
            ah = l1;
            return true;
        } else
        {
            return false;
        }
    }

    public static float i(VideoTrimView videotrimview)
    {
        return videotrimview.I;
    }

    private long i()
    {
        if (N == null)
        {
            return 0L;
        } else
        {
            return N.e;
        }
    }

    private long j()
    {
        if (N == null)
        {
            return k();
        } else
        {
            return N.f;
        }
    }

    public static ork j(VideoTrimView videotrimview)
    {
        return videotrimview.M;
    }

    private long k()
    {
        if (O == null)
        {
            return 1L;
        } else
        {
            return O.f;
        }
    }

    public static ovr k(VideoTrimView videotrimview)
    {
        return videotrimview.Q;
    }

    private long l()
    {
        if (N == null)
        {
            return 1L;
        } else
        {
            return N.c;
        }
    }

    public static boolean l(VideoTrimView videotrimview)
    {
        return videotrimview.s;
    }

    public static dbz m(VideoTrimView videotrimview)
    {
        return videotrimview.K;
    }

    private void m()
    {
        a(d(i()), d(j()));
    }

    private boolean n()
    {
        return M.c;
    }

    private float o()
    {
        return A.getX() + (float)h;
    }

    private float p()
    {
        return B.getX() + (float)h;
    }

    public final void a()
    {
        Iterator iterator = D.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            ovl ovl1 = (ovl)iterator.next();
            float f1 = d(ovl1.b);
            Rect rect = ovl1.getBounds();
            f1 = (float)rect.centerX() - f1;
            if (f1 != 0.0F)
            {
                int i1 = (int)((float)rect.left - f1);
                ovl1.setBounds(i1, rect.top, rect.width() + i1, rect.bottom);
            }
        } while (true);
        m();
        invalidate();
    }

    public final void a(Exception exception)
    {
        Log.e(c, "Failed to render thumbnail", exception);
    }

    public final void a(orr orr1, Set set)
    {
        c(-1L);
    }

    public final void a(orr orr1, oru oru1)
    {
        switch (dbw.b[oru1.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            if (!V)
            {
                m();
                invalidate();
            }
            c(orr1.e);
            return;

        case 2: // '\002'
            break;
        }
        if (!V)
        {
            m();
            invalidate();
        }
        c(orr1.f);
    }

    public final void a(orr orr1, ovn ovn1, ork ork1)
    {
        boolean flag2 = true;
        ote ote1;
        boolean flag;
        if (orr1 != null)
        {
            p.a(ovn1);
            ote1 = orr1.a;
            flag = ote1.equals(ovn1.d());
        } else
        if (ovn1 == null)
        {
            flag = true;
            ote1 = null;
        } else
        {
            flag = false;
            ote1 = null;
        }
        p.a(flag);
        p.a(ork1);
        if (orr1 == N && ovn1 == P)
        {
            return;
        }
        if (N != null)
        {
            f();
            N.b(this);
            P = null;
            Q.b(this);
            Q = null;
            R.b(this);
            R = null;
            S = null;
            boolean flag1;
            if (T == null)
            {
                flag1 = flag2;
            } else
            {
                flag1 = false;
            }
            p.b(flag1);
        }
        N = orr1;
        O = ote1;
        P = ovn1;
        ovn1 = b(L.width());
        if (N != null)
        {
            N.a(this);
            Q = P.f();
            Q.a(this);
            R = P.g();
            R.a(this);
            S = P.e();
        }
        if (r == dby.b && O != null)
        {
            J = 10L * N.d;
            I = J / 2000L;
        }
        if (M != null)
        {
            M.b(this);
        }
        M = ork1;
        M.a(this);
        a(((dbz) (ovn1)));
        H.a = orr1;
        a(false);
        requestLayout();
    }

    public final void a(ovg ovg1)
    {
    }

    public final void a(ovr ovr1)
    {
        post(new dbv(this, ovr1));
    }

    public final void b()
    {
        a(K);
        m();
        requestLayout();
    }

    public final void b(orr orr1, Set set)
    {
        c(-1L);
    }

    public int getPaddingLeft()
    {
        if (!w)
        {
            return super.getPaddingLeft();
        } else
        {
            return Math.max((super.getPaddingLeft() - h) + i / 2, 0);
        }
    }

    public int getPaddingRight()
    {
        if (!w)
        {
            return super.getPaddingRight();
        } else
        {
            return Math.max((super.getPaddingRight() - h) + i / 2, 0);
        }
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        canvas.save();
        canvas.clipRect(e);
        canvas.save();
        canvas.clipRect(d(0L), e.top, d(k()), e.bottom);
        for (Iterator iterator = D.iterator(); iterator.hasNext(); ((Drawable)iterator.next()).draw(canvas)) { }
        canvas.restore();
        H.draw(canvas);
        float f1 = z.getStrokeWidth() / 2.0F;
        float f2 = o();
        float f3 = p();
        canvas.drawRect(f2, (float)L.top + f1, f3, (float)L.bottom - f1, z);
        canvas.restore();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        motionevent.getActionMasked();
        JVM INSTR tableswitch 0 3: default 36
    //                   0 45
    //                   1 337
    //                   2 36
    //                   3 352;
           goto _L1 _L2 _L3 _L1 _L4
_L1:
        return U != null;
_L2:
        if (motionevent.getPointerCount() == 1)
        {
            W = motionevent.getPointerId(0);
            aa = a(motionevent, W);
            float f9 = aa;
            motionevent = new RectF();
            a(A, motionevent);
            float f8 = ((RectF) (motionevent)).left;
            float f7 = ((RectF) (motionevent)).right;
            a(B, motionevent);
            float f6 = ((RectF) (motionevent)).left;
            float f5 = ((RectF) (motionevent)).right;
            float f4 = f5;
            float f3 = f6;
            float f2 = f7;
            float f1 = f8;
            if (f7 > f6)
            {
                f4 = (f7 - f6) / 2.0F;
                f1 = f8 - f4;
                f2 = f7 - f4;
                f3 = f6 + f4;
                f4 = f5 + f4;
            }
            if (f9 >= f1 && f9 <= f2)
            {
                motionevent = dcb.a;
            } else
            if (f9 >= f3 && f9 <= f4)
            {
                motionevent = dcb.b;
            } else
            if (f9 > f2 && f9 < f3)
            {
                motionevent = dcb.c;
            } else
            {
                motionevent = null;
            }
            U = motionevent;
            if (U != null)
            {
                d();
                if (c())
                {
                    aj.a(t, aa);
                    if (x && !V)
                    {
                        boolean flag;
                        if (U == dcb.a)
                        {
                            flag = true;
                        } else
                        {
                            flag = false;
                        }
                        a(true, flag);
                    }
                }
            }
        }
          goto _L1
_L3:
        if (motionevent.getActionIndex() != motionevent.findPointerIndex(W)) goto _L1; else goto _L4
_L4:
        aj.a();
        f();
          goto _L1
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        e = new Rect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
        L.left = e.left + h;
        L.top = e.top;
        L.right = e.right - h;
        L.bottom = e.bottom;
        i1 = e.top;
        j1 = e.bottom;
        k1 = L.left - h;
        l1 = h;
        A.layout(k1, i1, l1 * 2 + k1, j1);
        k1 = L.right - h;
        l1 = h;
        B.layout(k1, i1, l1 * 2 + k1, j1);
        m();
        dbz dbz1 = b(L.width());
        if (!c.c(dbz1, K))
        {
            a(dbz1);
        }
        if (w && !M.c && !M.a())
        {
            H.setBounds(L);
            return;
        } else
        {
            H.setBounds(e);
            return;
        }
    }

    protected void onMeasure(int i1, int j1)
    {
        int k1;
        int l1;
        int i2;
        int j2;
        boolean flag;
        if (android.view.View.MeasureSpec.getMode(i1) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.b(flag);
        l1 = android.view.View.MeasureSpec.getSize(i1);
        k1 = (int)b(l1 - getPaddingRight() - getPaddingLeft() - h * 2).c;
        i2 = getPaddingTop();
        j2 = getPaddingBottom();
        setMeasuredDimension(resolveSizeAndState(l1, i1, 0), resolveSizeAndState(i2 + k1 + j2, j1, 0));
        i1 = android.view.View.MeasureSpec.makeMeasureSpec(h * 2, 0x40000000);
        j1 = android.view.View.MeasureSpec.makeMeasureSpec(k1, 0x40000000);
        A.measure(i1, j1);
        B.measure(i1, j1);
    }

    public void onRestoreInstanceState(Parcelable parcelable)
    {
        Parcelable parcelable1 = parcelable;
        if (parcelable instanceof Bundle)
        {
            parcelable = (Bundle)parcelable;
            d = parcelable.getBoolean("trimHandleInteractionAlreadyLogged");
            parcelable1 = parcelable.getParcelable("superViewInstanceState");
        }
        super.onRestoreInstanceState(parcelable1);
    }

    public Parcelable onSaveInstanceState()
    {
        Bundle bundle = new Bundle();
        bundle.putParcelable("superViewInstanceState", super.onSaveInstanceState());
        bundle.putBoolean("trimHandleInteractionAlreadyLogged", d);
        return bundle;
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        float f5;
        float f6;
        f5 = 0.0F;
        if (U == null)
        {
            return super.onTouchEvent(motionevent);
        }
        f6 = a(motionevent, W);
        motionevent.getActionMasked();
        JVM INSTR tableswitch 1 6: default 68
    //                   1 690
    //                   2 76
    //                   3 705
    //                   4 68
    //                   5 68
    //                   6 690;
           goto _L1 _L2 _L3 _L4 _L1 _L1 _L2
_L1:
        aa = f6;
        return true;
_L3:
        long l2;
        if (!V && Math.abs(ab - f6) > (float)q)
        {
            e();
        }
        if (!V)
        {
            continue; /* Loop/switch isn't completed */
        }
        aj.a(t, f6);
        float f1;
        float f3;
        boolean flag;
        if (U != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.b(flag);
        f1 = (f6 - ab) / (float)L.width();
        l2 = M.a(f1);
        if (ak.a()) goto _L6; else goto _L5
_L5:
        dbw.a[U.ordinal()];
        JVM INSTR tableswitch 1 3: default 216
    //                   1 339
    //                   2 353
    //                   3 367;
           goto _L7 _L8 _L9 _L10
_L7:
        if (!y) goto _L12; else goto _L11
_L11:
        m();
_L17:
        invalidate();
_L6:
        float f2 = f5;
        if (c())
        {
            f2 = f5;
            if (M.c)
            {
                f2 = L.left - h;
                f3 = L.right + h;
                float f4;
                float f7;
                float f8;
                float f9;
                long l1;
                long l3;
                if (Math.max(0.0F, f6 - f2) < (float)l)
                {
                    f2 = -1F;
                } else
                {
                    f2 = 0.0F;
                }
                if (Math.max(0.0F, f3 - f6) < (float)l)
                {
                    f2 = 1.0F;
                }
            }
        }
        ak.a(f2);
        continue; /* Loop/switch isn't completed */
_L8:
        a(l2 + ae);
          goto _L7
_L9:
        b(l2 + af);
          goto _L7
_L10:
        l1 = af - ae;
        l2 = e(Math.min(O.f - l1, l2 + ae));
        N.a(l2);
        N.b(l1 + l2);
        N.a(l2);
          goto _L7
_L12:
        f8 = L.left;
        f7 = L.left + L.width();
        l2 = N.c;
        l3 = L.width();
        if (M.c)
        {
            l1 = J;
        } else
        {
            l1 = N.a.f;
        }
        f9 = (l3 * l2) / l1;
        f4 = o();
        f2 = p();
        dbw.a[U.ordinal()];
        JVM INSTR tableswitch 1 3: default 560
    //                   1 584
    //                   2 602
    //                   3 620;
           goto _L13 _L14 _L15 _L16
_L13:
        a(f4, f2);
          goto _L17
_L14:
        f4 = Math.max(f8, Math.min(f6, f2 - f9));
          goto _L13
_L15:
        f2 = Math.min(f7, Math.max(f6, f4 + f9));
          goto _L13
_L16:
        f4 = f6 - ab;
        if (ac + f4 < f8)
        {
            f2 = f8 - ac;
        } else
        {
            f2 = f4;
            if (ad + f4 > f7)
            {
                f2 = f7 - ad;
            }
        }
        f4 = ac + f2;
        f2 += ad;
          goto _L13
_L2:
        if (motionevent.getActionIndex() != motionevent.findPointerIndex(W))
        {
            continue; /* Loop/switch isn't completed */
        }
_L4:
        aj.a();
        f();
        if (true) goto _L1; else goto _L18
_L18:
    }

    protected boolean verifyDrawable(Drawable drawable)
    {
        return super.verifyDrawable(drawable) || (drawable instanceof ovl);
    }

}
