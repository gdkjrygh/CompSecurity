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
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.Path;
import android.util.DisplayMetrics;
import com.roidapp.photogrid.common.bl;

// Referenced classes of package com.roidapp.photogrid.release:
//            ao, rf, StickerInfo

public final class qz extends ao
{

    public Bitmap G;
    public float H;
    public float I;
    public boolean J;
    public String K;
    public int L;
    public float M;
    public float N;
    public float O;
    public int P;
    public String Q;
    public String R;
    protected StickerInfo S;
    protected String T;
    public int U;
    public int V;
    private boolean W;
    private boolean X;
    private Paint Y;
    private Boolean Z;

    public qz(Context context)
    {
        super(context);
        H = 2.0F;
        I = 6F;
        J = false;
        W = false;
        X = false;
        M = 0.5F;
        N = 0.5F;
        O = 0.26F;
        P = 1;
        Y = new Paint();
        H = H * context.getResources().getDisplayMetrics().density;
        I = Math.round((I * (float)context.getResources().getDisplayMetrics().widthPixels) / 1024F);
        Y.setStyle(android.graphics.Paint.Style.STROKE);
        Y.setStrokeWidth(H);
        Y.setAntiAlias(true);
        Y.setColor(0xff3c64d5);
    }

    public final ao a(Context context)
    {
        context = new qz(context);
        context.b = new Matrix();
        context.M = M;
        context.N = N;
        context.P = P;
        context.g = g;
        context.j = j;
        context.k = k;
        context.l = l;
        context.p = d();
        context.q = c();
        context.h = h;
        context.r = e();
        context.s = s;
        context.t = t;
        context.L = L;
        context.K = K;
        context.J = J;
        context.W = W;
        context.X = X;
        context.c = c;
        context.d = d;
        context.H = H;
        context.u = u;
        context.O = O;
        context.Q = Q;
        context.R = R;
        context.S = S;
        context.V = V;
        context.T = T;
        context.U = U;
        return context;
    }

    public final void a()
    {
        if (G != null && !G.isRecycled())
        {
            G.recycle();
            G = null;
        }
    }

    public final void a(Canvas canvas)
    {
        if (G != null && !G.isRecycled())
        {
            b.reset();
            b.postScale(h, h, (float)G.getWidth() / 2.0F, (float)G.getHeight() / 2.0F);
            b.postScale(P, 1.0F, (float)G.getWidth() / 2.0F, (float)G.getHeight() / 2.0F);
            b.postRotate(l, (float)G.getWidth() / 2.0F, (float)G.getHeight() / 2.0F);
            b.postTranslate(j + v, k + w);
            b.mapPoints(o, n);
            float af[] = o;
            boolean flag;
            if (af[16] > 0.0F && af[16] < (float)c && af[17] > 0.0F && af[17] < (float)d)
            {
                flag = false;
            } else
            {
                float f = 0.3F;
                if (h > 1.0F)
                {
                    f = 0.3F * h;
                }
                float f1 = f;
                if (f > 0.7F)
                {
                    f1 = 0.7F;
                }
                float af1[] = new float[18];
                F.reset();
                F.postScale(f1, f1, af[16], af[17]);
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
            canvas.drawBitmap(G, b, null);
            if (this.f)
            {
                canvas.save();
                canvas.concat(b);
                if (Z == null)
                {
                    bl.a();
                    Z = Boolean.valueOf(bl.a(canvas));
                }
                if (Z.booleanValue())
                {
                    canvas.drawLine(0.0F, 0.0F, s, 0.0F, Y);
                    canvas.drawLine((float)s - H / 2.0F, 0.0F, (float)s - H / 2.0F, t, Y);
                    canvas.drawLine(s, t, 0.0F, t, Y);
                    canvas.drawLine(H / 2.0F, t, H / 2.0F, 0.0F, Y);
                } else
                {
                    Path path = new Path();
                    path.moveTo(0.0F, 0.0F);
                    path.lineTo(s, 0.0F);
                    path.lineTo(s, t);
                    path.lineTo(0.0F, t);
                    path.close();
                    canvas.drawPath(path, Y);
                }
                canvas.restore();
            }
        }
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
        if (f1 <= (float)i)
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

    public final void b(float f, float f1)
    {
        k = k + f1;
        j = j + f;
    }

    public final void g()
    {
        float f;
        Object obj;
        a();
        f = (float)c * O;
        if (c > d)
        {
            f = (float)d * O;
        }
        obj = null;
        V;
        JVM INSTR tableswitch 0 3: default 72
    //                   0 87
    //                   1 123
    //                   2 107
    //                   3 159;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        if (obj == null)
        {
            throw new OutOfMemoryError("sticker create bitmap null");
        }
        if (((Bitmap) (obj)).getWidth() > ((Bitmap) (obj)).getHeight())
        {
            f /= ((Bitmap) (obj)).getWidth();
        } else
        {
            f /= ((Bitmap) (obj)).getHeight();
        }
        rf.a();
        G = rf.a(((Bitmap) (obj)), f, f);
        if (G == null)
        {
            throw new OutOfMemoryError("sticker create bitmap null");
        }
        int i = G.getWidth();
        int k = G.getHeight();
        s = (int)((float)i + H * 2.0F);
        t = (int)((float)k + H * 2.0F);
        if (G == null || G.isRecycled())
        {
            continue; /* Loop/switch isn't completed */
        }
        rf.a();
        obj = rf.a((int)((float)G.getWidth() + H * 2.0F), (int)((float)G.getHeight() + H * 2.0F), android.graphics.Bitmap.Config.ARGB_8888);
          goto _L6
_L2:
        rf.a();
        obj = rf.a(a, L, f);
        continue; /* Loop/switch isn't completed */
_L4:
        rf.a();
        obj = rf.b(K, f);
        continue; /* Loop/switch isn't completed */
_L3:
        obj = a.createPackageContext(R, 2);
        rf.a();
        obj = rf.a(((Context) (obj)), Q, f);
        continue; /* Loop/switch isn't completed */
        obj;
        ((android.content.pm.PackageManager.NameNotFoundException) (obj)).printStackTrace();
_L8:
        return;
_L5:
        rf.a();
        obj = rf.a(Q, f);
        continue; /* Loop/switch isn't completed */
_L6:
        if (obj == null) goto _L8; else goto _L7
_L7:
        Canvas canvas = new Canvas(((Bitmap) (obj)));
        canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(0);
        canvas.drawBitmap(G, H, H, null);
        G.recycle();
        G = ((Bitmap) (obj));
        if (G == null) goto _L8; else goto _L9
_L9:
        int j = G.getWidth();
        int l = G.getHeight();
        n = (new float[] {
            0.0F, 0.0F, (float)j / 2.0F, 0.0F, (float)j, 0.0F, (float)j, (float)l / 2.0F, (float)j, (float)l, 
            (float)j / 2.0F, (float)l, 0.0F, (float)l, 0.0F, (float)l / 2.0F, (float)j / 2.0F, (float)l / 2.0F
        });
        o = (float[])n.clone();
        v = M * (float)c - (float)j / 2.0F;
        w = N * (float)d - (float)l / 2.0F;
        return;
        if (true) goto _L1; else goto _L10
_L10:
    }
}
