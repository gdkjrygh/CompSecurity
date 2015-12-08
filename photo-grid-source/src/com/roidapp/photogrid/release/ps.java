// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.NinePatchDrawable;
import android.util.DisplayMetrics;

// Referenced classes of package com.roidapp.photogrid.release:
//            ao, rf, lc, ig

public final class ps extends ao
{

    public Bitmap G;
    public ig H;
    public lc I;
    public boolean J;
    public int K;
    public float L;
    public float M;
    public float N;
    public float O;
    public float P;
    public float Q;
    public float R;
    public float S;
    private float T[];
    private Paint U;
    private NinePatchDrawable V;
    private boolean W;
    private RectF X;
    private RectF Y;

    public ps(Context context)
    {
        super(context);
        K = 1;
        V = null;
        P = 1.0F;
        Q = 1.0F;
        float f = rf.a().a;
        i = 1.0F;
        if (f == 1.0F)
        {
            i = 1.0F;
        }
        if (f > 1.0F && (double)f <= 1.5D)
        {
            i = 1.5F;
        }
        if ((double)f > 1.5D && f <= 2.0F)
        {
            i = 2.0F;
        }
        if (f > 2.0F && f <= 3F)
        {
            i = 3F;
        }
        a(context.getResources().getDisplayMetrics().densityDpi, false);
        U = new Paint();
        U.setAntiAlias(true);
        U.setColor(-1);
        f = i;
        U.setStrokeWidth(4F * f);
        U.setStyle(android.graphics.Paint.Style.STROKE);
        U.setDither(true);
        W = true;
    }

    private static Rect a(RectF rectf)
    {
        return new Rect(Math.round(rectf.left), Math.round(rectf.top), Math.round(rectf.right), Math.round(rectf.bottom));
    }

    public final ao a(Context context)
    {
        context = new ps(context);
        context.b = new Matrix();
        context.g = g;
        context.j = j;
        context.k = k;
        context.K = K;
        context.l = l;
        context.p = d();
        context.q = c();
        context.h = h;
        context.r = e();
        context.s = s;
        context.t = t;
        context.H = H;
        context.I = I;
        context.u = u;
        context.W = W;
        context.M = M;
        context.L = L;
        context.N = N;
        context.O = O;
        return context;
    }

    public final void a()
    {
    }

    public final void a(int i, boolean flag)
    {
        float f;
        if (flag)
        {
            f = (P * 4F) / 2.0F;
        } else
        {
            f = (this.i * 4F) / 2.0F;
        }
        i;
        JVM INSTR lookupswitch 5: default 64
    //                   120: 101
    //                   160: 110
    //                   240: 119
    //                   320: 128
    //                   480: 137;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        L = -3F;
_L8:
        M = (int)((double)L - Math.floor(f));
        return;
_L2:
        L = -1F;
        continue; /* Loop/switch isn't completed */
_L3:
        L = -2F;
        continue; /* Loop/switch isn't completed */
_L4:
        L = -3F;
        continue; /* Loop/switch isn't completed */
_L5:
        L = -4F;
        continue; /* Loop/switch isn't completed */
_L6:
        L = -4F;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public final void a(Bitmap bitmap, boolean flag)
    {
        float f;
        float f1;
        int i;
        int j;
        if (bitmap == null || bitmap.isRecycled())
        {
            return;
        }
        G = bitmap;
        i = G.getWidth();
        j = G.getHeight();
        f = (4F * this.i) / 2.0F;
        bitmap = new RectF(0.0F, 0.0F, i, j);
        float af[] = new float[16];
        af[0] = ((RectF) (bitmap)).left - f;
        af[1] = ((RectF) (bitmap)).top;
        af[2] = ((RectF) (bitmap)).right + f;
        af[3] = ((RectF) (bitmap)).top;
        af[4] = ((RectF) (bitmap)).left - f;
        af[5] = ((RectF) (bitmap)).bottom;
        af[6] = f + ((RectF) (bitmap)).right;
        af[7] = ((RectF) (bitmap)).bottom;
        af[8] = ((RectF) (bitmap)).left;
        af[9] = ((RectF) (bitmap)).top;
        af[10] = ((RectF) (bitmap)).left;
        af[11] = ((RectF) (bitmap)).bottom;
        af[12] = ((RectF) (bitmap)).right;
        af[13] = ((RectF) (bitmap)).top;
        af[14] = ((RectF) (bitmap)).right;
        af[15] = ((RectF) (bitmap)).bottom;
        T = (float[])af;
        f = af[2] - af[0];
        f1 = af[11] - af[9];
        n = (new float[] {
            0.0F, 0.0F, f / 2.0F, 0.0F, f, 0.0F, f, f1 / 2.0F, f, f1, 
            f / 2.0F, f1, 0.0F, f1, 0.0F, f1 / 2.0F, f / 2.0F, f1 / 2.0F
        });
        o = (float[])n.clone();
        if (!J) goto _L2; else goto _L1
_L1:
        bitmap = new RectF(0.0F, 0.0F, N, O);
        if (W)
        {
            bitmap.inset(M, M);
        } else
        {
            bitmap.inset(L, L);
        }
        if (V != null)
        {
            V.setBounds(a(((RectF) (bitmap))));
        }
        Y = new RectF(0.0F, 0.0F, ((4F * P) / 2.0F) * 2.0F + N, O);
_L4:
        X = new RectF(0.0F, 0.0F, f, f1);
        if (flag)
        {
            R = I.j * (float)c - Y.width() / 2.0F;
            S = I.k * (float)d - Y.height() / 2.0F;
        }
        v = I.j * (float)c - X.width() / 2.0F;
        w = I.k * (float)d - X.height() / 2.0F;
        return;
_L2:
        N = i;
        O = j;
        if (W)
        {
            bitmap.inset(M, M);
        } else
        {
            bitmap.inset(L, L);
        }
        if (V != null)
        {
            V.setBounds(a(((RectF) (bitmap))));
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void a(Canvas canvas)
    {
        if (X == null)
        {
            return;
        }
        canvas.save();
        b.reset();
        if (!J)
        {
            b.postScale(h, h, X.width() / 2.0F, X.height() / 2.0F);
        }
        b.postScale(K, 1.0F, X.width() / 2.0F, X.height() / 2.0F);
        b.postRotate(l, X.width() / 2.0F, X.height() / 2.0F);
        b.postTranslate(j + v, k + w);
        b.mapPoints(o, n);
        float af[] = o;
        boolean flag;
        if (af[16] > 0.0F && af[16] < (float)c && af[17] > 0.0F && af[17] < (float)d)
        {
            flag = false;
        } else
        {
            float af1[] = new float[18];
            F.reset();
            F.postScale(0.75F, 0.75F, af[16], af[17]);
            F.mapPoints(af1, af);
            if (af1[0] > 0.0F && af1[0] < (float)c && af1[1] > 0.0F && af1[1] < (float)d)
            {
                flag = false;
            } else
            if (af1[2] > 0.0F && af1[2] < (float)c && af1[3] > 0.0F && af1[3] < (float)d)
            {
                flag = false;
            } else
            if (af1[4] > 0.0F && af1[4] < (float)c && af1[5] > 0.0F && af1[5] < (float)d)
            {
                flag = false;
            } else
            if (af1[6] > 0.0F && af1[6] < (float)c && af1[7] > 0.0F && af1[7] < (float)d)
            {
                flag = false;
            } else
            if (af1[8] > 0.0F && af1[8] < (float)c && af1[9] > 0.0F && af1[9] < (float)d)
            {
                flag = false;
            } else
            if (af1[10] > 0.0F && af1[10] < (float)c && af1[11] > 0.0F && af1[11] < (float)d)
            {
                flag = false;
            } else
            if (af1[12] > 0.0F && af1[12] < (float)c && af1[13] > 0.0F && af1[13] < (float)d)
            {
                flag = false;
            } else
            if (af1[14] > 0.0F && af1[14] < (float)c && af1[15] > 0.0F && af1[15] < (float)d)
            {
                flag = false;
            } else
            {
                flag = true;
            }
        }
        if (flag)
        {
            if (!B)
            {
                C = true;
                D = (int)j;
                E = (int)k;
                B = true;
            }
        } else
        {
            B = false;
            C = false;
        }
        if (!J) goto _L2; else goto _L1
_L1:
        if (V != null)
        {
            canvas.save();
            af = new Matrix();
            af.postScale(Q, Q, Y.width() / 2.0F, Y.height() / 2.0F);
            af.postScale(K, 1.0F, Y.width() / 2.0F, Y.height() / 2.0F);
            af.postRotate(l, Y.width() / 2.0F, Y.height() / 2.0F);
            af.postTranslate(j + R, k + S);
            canvas.concat(af);
            V.draw(canvas);
            canvas.restore();
        }
        canvas.setMatrix(new Matrix());
        canvas.concat(b);
_L4:
        if (G != null && !G.isRecycled())
        {
            canvas.drawBitmap(G, 0.0F, 0.0F, null);
        }
        if (W)
        {
            canvas.drawLines(T, U);
        }
        canvas.restore();
        return;
_L2:
        canvas.concat(b);
        if (V != null)
        {
            V.draw(canvas);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void a(NinePatchDrawable ninepatchdrawable)
    {
        V = ninepatchdrawable;
    }

    public final void a(boolean flag)
    {
        W = flag;
    }

    public final boolean a(float f)
    {
        Matrix matrix = new Matrix(b);
        matrix.postScale(f, f, o[16], o[17]);
        float af[] = (float[])n.clone();
        matrix.mapPoints(af, n);
        float f2 = a(af[0], af[1], af[12], af[13]);
        float f3 = a(af[0], af[1], af[4], af[5]);
        float f1 = f3;
        if (f2 >= f3)
        {
            f1 = f2;
        }
        int i;
        if (d >= c)
        {
            i = d;
        } else
        {
            i = c;
        }
        if (f1 <= (float)i || f < 1.0F)
        {
            h = h * f;
            u = h;
            return true;
        } else
        {
            return false;
        }
    }

    public final void b()
    {
        C = false;
        B = false;
        j = D;
        k = E;
    }

    public final void b(float f)
    {
        l = l + f;
    }

    public final void b(float f, float f1)
    {
        k = k + f1;
        j = j + f;
    }

    public final void b(boolean flag)
    {
        if (G != null && !G.isRecycled())
        {
            W = flag;
            int i = G.getWidth();
            int j = G.getHeight();
            RectF rectf = new RectF(0.0F, 0.0F, i, j);
            if (W)
            {
                rectf.inset(M, M);
            } else
            {
                rectf.inset(L, L);
            }
            if (V != null)
            {
                V.setBounds(a(rectf));
            }
        }
    }

    public final void c(float f)
    {
        U.setStrokeWidth(4F * f);
    }

    public final boolean g()
    {
        return W;
    }

    public final NinePatchDrawable h()
    {
        return V;
    }
}
