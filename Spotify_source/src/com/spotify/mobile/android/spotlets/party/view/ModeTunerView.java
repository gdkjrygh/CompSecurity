// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.party.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewParent;
import com.spotify.mobile.android.util.logging.Logger;
import com.squareup.picasso.Picasso;
import dgd;
import dmz;
import dto;
import eyw;
import eyx;
import gcf;
import gft;
import gwb;
import gwi;
import java.util.List;

public class ModeTunerView extends View
{

    private float A;
    private float B;
    private float C;
    private float D;
    private float E;
    private float F;
    private float G;
    private float H;
    private float I;
    private float J;
    private float K;
    private final Path L;
    private final RectF M;
    private final Path N;
    private final Path O;
    private final RectF P;
    private final RectF Q;
    private String R;
    private List S;
    private Path T;
    private Typeface U;
    private Typeface V;
    private Typeface W;
    public int a;
    private List aa;
    private Bitmap ab;
    private final Path ac;
    private VelocityTracker ad;
    private float ae;
    private TouchState af;
    private gwi ag = new gwi() {

        private ModeTunerView a;

        public final void a(Bitmap bitmap, com.squareup.picasso.Picasso.LoadedFrom loadedfrom)
        {
            ModeTunerView.a(a, bitmap);
            a.postInvalidate();
        }

        public final void a(Drawable drawable)
        {
            Logger.c("Failed to load bitmap.", new Object[0]);
        }

        public final void b(Drawable drawable)
        {
        }

            
            {
                a = ModeTunerView.this;
                super();
            }
    };
    public int b;
    public String c;
    public eyx d;
    public eyw e;
    float f;
    public float g;
    private final Paint h;
    private final Paint i;
    private final Paint j;
    private final Paint k;
    private final Paint l;
    private int m;
    private float n;
    private float o;
    private int p;
    private int q;
    private int r;
    private int s;
    private int t;
    private float u;
    private float v;
    private float w;
    private float x;
    private float y;
    private float z;

    public ModeTunerView(Context context)
    {
        this(context, null);
    }

    public ModeTunerView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        h = new Paint();
        i = new Paint();
        j = new Paint();
        k = new Paint();
        l = new Paint();
        p = 0x88888888;
        q = 0x88aaaaaa;
        r = 0xffdddddd;
        s = 0xff222222;
        t = -1;
        L = new Path();
        M = new RectF();
        N = new Path();
        O = new Path();
        P = new RectF();
        Q = new RectF();
        T = new Path();
        ac = new Path();
        e = new eyw(this, (byte)0);
        new gcf();
        f = 1.0F;
        af = TouchState.a;
        o = 1.0F;
        context = getResources();
        u = context.getDimension(0x7f0c0110);
        w = context.getDimension(0x7f0c010f);
        x = context.getDimension(0x7f0c010e);
        v = context.getDimension(0x7f0c0116);
        C = context.getDimension(0x7f0c010d);
        D = context.getDimension(0x7f0c0106);
        E = context.getDimension(0x7f0c0107);
        y = context.getDimension(0x7f0c0112);
        z = context.getDimension(0x7f0c0111);
        A = context.getDimension(0x7f0c010a);
        B = context.getDimension(0x7f0c0109);
        F = u * 0.3333333F;
        G = F * 0.6F;
        m = 3;
        h.setStyle(android.graphics.Paint.Style.STROKE);
        h.setStrokeCap(android.graphics.Paint.Cap.BUTT);
        h.setAntiAlias(true);
        h.setStrokeWidth(v);
        i.setColor(r);
        i.setStrokeWidth(w * 2.0F);
        i.setStrokeJoin(android.graphics.Paint.Join.ROUND);
        i.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        i.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
        i.setAntiAlias(true);
        j.setStrokeWidth(x);
        j.setStrokeCap(android.graphics.Paint.Cap.BUTT);
        j.setColor(s);
        j.setStyle(android.graphics.Paint.Style.STROKE);
        j.setAntiAlias(true);
        l.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
        l.setColor(t);
        l.setAntiAlias(true);
        l.setTextAlign(android.graphics.Paint.Align.CENTER);
        l.setHinting(0);
        l.setSubpixelText(true);
        k.setAntiAlias(true);
        context = getContext();
        U = dgd.c(context, 0x7f010003);
        V = dgd.c(context, 0x7f010006);
        W = dgd.b(context, 0x7f0101dc);
    }

    public static float a(ModeTunerView modetunerview)
    {
        return modetunerview.o;
    }

    public static float a(ModeTunerView modetunerview, float f1)
    {
        modetunerview.o = f1;
        return f1;
    }

    static Bitmap a(ModeTunerView modetunerview, Bitmap bitmap)
    {
        modetunerview.ab = bitmap;
        return bitmap;
    }

    private void a()
    {
        if (aa != null && aa.size() >= a)
        {
            android.net.Uri uri = dto.a((String)aa.get(a));
            ((gft)dmz.a(gft)).a().a(uri).a(ag);
        }
    }

    private void a(float f1)
    {
        o = f1;
        int i1 = Math.round(f1);
        if (a != i1)
        {
            a = i1;
            if (d != null)
            {
                d.a(a);
            }
            a();
        }
    }

    public static int b(ModeTunerView modetunerview)
    {
        return modetunerview.m;
    }

    public static void b(ModeTunerView modetunerview, float f1)
    {
        modetunerview.a(f1);
    }

    public static TouchState c(ModeTunerView modetunerview)
    {
        return modetunerview.af;
    }

    public final void a(String s1)
    {
        R = s1;
        invalidate();
    }

    public final void a(List list)
    {
        S = list;
        invalidate();
    }

    public final void b(List list)
    {
        aa = list;
        a();
    }

    protected void onDraw(Canvas canvas)
    {
        float f1;
        float f4;
        int i1;
        if (ab != null && !ab.isRecycled())
        {
            k.setAlpha(Math.round(255F * (1.0F - g)));
            canvas.save();
            canvas.clipPath(ac, android.graphics.Region.Op.DIFFERENCE);
            canvas.translate(0.0F, g * D + (1.0F - f) * E);
            canvas.drawBitmap(ab, null, P, k);
            canvas.restore();
        }
        f1 = n * f;
        f4 = f;
        i1 = 0;
        while (i1 < m) 
        {
            Paint paint = h;
            int j1;
            if (i1 % 2 == 0)
            {
                j1 = p;
            } else
            {
                j1 = q;
            }
            paint.setColor(j1);
            canvas.drawArc(M, (float)i1 * f1 + ((60F + 120F * f4) - 30F), f1, false, h);
            i1++;
        }
        f1 = M.centerX();
        f4 = M.centerY();
        canvas.save();
        canvas.rotate(((100F + 80F * f) - 30F) + n * o, f1, f4);
        canvas.drawPath(L, i);
        canvas.rotate(-6F, f1, f4);
        canvas.drawPath(N, j);
        canvas.rotate(n + 12F, f1, f4);
        canvas.drawPath(O, j);
        canvas.restore();
        l.setTypeface(W);
        l.setTextSize(C);
        canvas.save();
        canvas.rotate(-30F * (1.0F - f), f1, f4);
        if (!TextUtils.isEmpty(c))
        {
            canvas.drawTextOnPath(c, T, 0.0F, 0.0F, l);
        }
        canvas.restore();
        if (R != null)
        {
            float f2 = H;
            float f5 = I;
            float f7 = H;
            float f9 = g;
            float f11 = y;
            float f13 = z;
            float f15 = y;
            float f17 = g;
            l.setTypeface(U);
            l.setTextSize(f11 + (f13 - f15) * f17);
            canvas.drawText(R, M.centerX(), f2 + (f5 - f7) * f9, l);
        }
        if (S != null && S.size() > a)
        {
            float f3 = J;
            float f6 = K;
            float f8 = J;
            float f10 = g;
            float f12 = A;
            float f14 = B;
            float f16 = A;
            float f18 = g;
            l.setTypeface(V);
            l.setTextSize(f12 + (f14 - f16) * f18);
            canvas.drawText((String)S.get(a), M.centerX(), (f6 - f8) * f10 + f3, l);
        }
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        super.onLayout(flag, i1, j1, k1, l1);
        if (flag)
        {
            Resources resources = getResources();
            i1 = getWidth();
            j1 = getHeight();
            k1 = resources.getDimensionPixelOffset(0x7f0c0115);
            M.set(k1, k1, i1 - k1, j1 - k1);
            float f1 = (u - w * 2.0F) / 2.0F;
            RectF rectf = new RectF(M.left - f1, M.top - f1, M.right + f1, M.bottom + f1);
            RectF rectf1 = new RectF(M.left + f1, M.top + f1, M.right - f1, M.bottom - f1);
            n = -120F / (float)m;
            L.reset();
            L.arcTo(rectf, 0.0F, n, true);
            L.arcTo(rectf1, n, -n, false);
            L.close();
            N.reset();
            N.moveTo(M.right - F / 2.0F, M.top + M.height() / 2.0F);
            N.rLineTo(F / 2.0F, G);
            N.rLineTo(F / 2.0F, -G);
            O.reset();
            O.moveTo(M.right - F / 2.0F, M.top + M.height() / 2.0F);
            O.rLineTo(F / 2.0F, -G);
            O.rLineTo(F / 2.0F, G);
            H = y + (float)resources.getDimensionPixelOffset(0x7f0c0113);
            I = (float)(j1 - b) + z + (float)resources.getDimensionPixelOffset(0x7f0c0114);
            J = H + A + (float)resources.getDimensionPixelOffset(0x7f0c010b);
            K = I + B + (float)resources.getDimensionPixelOffset(0x7f0c010c);
            f1 = k1;
            if (!TextUtils.isEmpty(c))
            {
                Q.set(M.left - f1, M.top - f1, M.right + f1, f1 + M.bottom);
                T.reset();
                T.arcTo(Q, 180F, -180F, false);
            }
            k1 = resources.getDimensionPixelOffset(0x7f0c0108);
            P.set(k1, k1, i1 - k1, j1 - k1);
            k1 = resources.getDimensionPixelOffset(0x7f0c0105);
            Q.set(k1, k1, i1 - k1, j1 - k1);
            ac.reset();
            ac.arcTo(Q, 30F, 120F, true);
            ac.rLineTo(-10000F, 0.0F);
            ac.rLineTo(0.0F, 10000F);
            ac.rLineTo(30000F, 0.0F);
            ac.rLineTo(0.0F, -10000F);
            ac.close();
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (!isEnabled())
        {
            return false;
        }
        motionevent.getAction();
        JVM INSTR tableswitch 0 3: default 44
    //                   0 46
    //                   1 183
    //                   2 81
    //                   3 183;
           goto _L1 _L2 _L3 _L4 _L3
_L1:
        return true;
_L2:
        ad = VelocityTracker.obtain();
        ae = motionevent.getX();
        getParent().requestDisallowInterceptTouchEvent(true);
        af = TouchState.b;
        continue; /* Loop/switch isn't completed */
_L4:
        ad.addMovement(motionevent);
        float f1 = motionevent.getX();
        int i1 = getWidth();
        if (af == TouchState.c && i1 > 0)
        {
            float f3 = ae;
            float f4 = m;
            float f5 = o;
            a(Math.max(0.0F, Math.min(f4 - 1.0F, ((f1 - f3) / (float)i1) * (float)m + f5)));
            invalidate();
        }
        ae = f1;
        af = TouchState.c;
        continue; /* Loop/switch isn't completed */
_L3:
        ad.computeCurrentVelocity(1000);
        motionevent = e;
        float f2 = ad.getXVelocity();
        if (Math.abs(f2) > 1000F)
        {
            motionevent.a = f2;
            int j1;
            if (f2 < 0.0F)
            {
                j1 = Math.max(0, Math.round(((eyw) (motionevent)).c.o) - 1);
            } else
            {
                j1 = Math.min(((eyw) (motionevent)).c.m - 1, Math.round(((eyw) (motionevent)).c.o) + 1);
            }
            motionevent.b = j1;
        } else
        {
            motionevent.a = 0.0F;
            motionevent.b = 0x80000000;
        }
        motionevent.a();
        ad.recycle();
        ad = null;
        getParent().requestDisallowInterceptTouchEvent(false);
        af = TouchState.a;
        if (true) goto _L1; else goto _L5
_L5:
    }

    // Unreferenced inner class com/spotify/mobile/android/spotlets/party/view/ModeTunerView$2

/* anonymous class */
    public final class _cls2
        implements android.animation.ValueAnimator.AnimatorUpdateListener
    {

        private ModeTunerView a;

        public final void onAnimationUpdate(ValueAnimator valueanimator)
        {
            ModeTunerView modetunerview = a;
            modetunerview.f = ((Float)valueanimator.getAnimatedValue()).floatValue();
            modetunerview.invalidate();
        }

            public 
            {
                a = ModeTunerView.this;
                super();
            }
    }


    private class TouchState extends Enum
    {

        public static final TouchState a;
        public static final TouchState b;
        public static final TouchState c;
        private static final TouchState d[];

        public static TouchState valueOf(String s1)
        {
            return (TouchState)Enum.valueOf(com/spotify/mobile/android/spotlets/party/view/ModeTunerView$TouchState, s1);
        }

        public static TouchState[] values()
        {
            return (TouchState[])d.clone();
        }

        static 
        {
            a = new TouchState("WAITING", 0);
            b = new TouchState("DOWN", 1);
            c = new TouchState("MOVING", 2);
            d = (new TouchState[] {
                a, b, c
            });
        }

        private TouchState(String s1, int i1)
        {
            super(s1, i1);
        }
    }

}
