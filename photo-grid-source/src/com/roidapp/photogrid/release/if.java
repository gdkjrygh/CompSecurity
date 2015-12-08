// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ComposePathEffect;
import android.graphics.CornerPathEffect;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.PathShape;
import android.os.Handler;
import android.os.Message;
import android.util.DisplayMetrics;
import com.roidapp.photogrid.common.az;
import com.roidapp.photogrid.common.bl;
import java.util.List;

// Referenced classes of package com.roidapp.photogrid.release:
//            aq, ig, lc, ih, 
//            rf, PhotoGridActivity, ml, ImageEditor

public final class if extends aq
{

    private static int E = 2;
    public boolean A;
    public int B;
    public boolean C;
    public boolean D;
    private float F;
    private PaintFlagsDrawFilter G;
    private float H;
    private Paint I;
    private Matrix J;
    private Path K;
    private Paint L;
    private Paint M;
    private DashPathEffect N;
    private ShapeDrawable O;
    private Matrix P;
    private boolean Q;
    public float w;
    public float x;
    public float y;
    public float z;

    public if(Context context, Bitmap bitmap, lc lc1, ig ig1, int i, int j, int k, 
            int l, int i1)
    {
        float f1;
        super(context);
        w = 2.0F;
        F = 0.0F;
        A = false;
        G = null;
        C = false;
        H = 20F;
        J = new Matrix();
        K = new Path();
        L = new Paint();
        M = new Paint();
        O = new ShapeDrawable();
        P = new Matrix();
        if (android.os.Build.VERSION.SDK_INT > 10)
        {
            bl.a(this);
        }
        a = context;
        e = bitmap;
        b = lc1;
        c = ig1;
        f = i;
        g = j;
        m = false;
        q = l;
        p = k;
        B = i1;
        f1 = context.getResources().getDisplayMetrics().density;
        E = (int)((float)E * f1 + 0.5F);
        w = w * f1;
        H = 6F * f1;
        G = new PaintFlagsDrawFilter(0, 3);
        x = 0.0F;
        y = 0.0F;
        z = 0.0F;
        o = 1.0F;
        I = null;
        az.q;
        JVM INSTR tableswitch 5 10: default 296
    //                   5 463
    //                   6 296
    //                   7 296
    //                   8 296
    //                   9 518
    //                   10 561;
           goto _L1 _L2 _L1 _L1 _L1 _L3 _L4
_L1:
        C = ig1.B;
_L9:
        if (I != null)
        {
            I.setColor(getResources().getColor(0x7f0c00b5));
            I.setAlpha(229);
            I.setStrokeWidth(1.0F);
            I.setShadowLayer(1.5F, 0.7F, 0.7F, getResources().getColor(0x7f0c00b6));
        }
        if (C && !lc1.f)
        {
            A = true;
        }
        M.setStyle(android.graphics.Paint.Style.STROKE);
        M.setStrokeWidth(w);
        M.setAntiAlias(true);
        N = new DashPathEffect(new float[] {
            0.0F, 0.0F, 2.0F * f1, f1 * 2.0F
        }, 0.0F);
        M.setColor(0xff3c64d5);
        return;
_L2:
        Q = true;
        ih.C().W();
        JVM INSTR tableswitch 1 1: default 492
    //                   1 506;
           goto _L5 _L6
_L5:
        I = new Paint();
        break; /* Loop/switch isn't completed */
_L6:
        C = ig1.B;
        if (true) goto _L5; else goto _L7
_L7:
        if (false)
        {
        }
        continue; /* Loop/switch isn't completed */
_L3:
        Q = true;
        C = ig1.B;
        if (ih.C().W() == 4)
        {
            C = false;
        }
        I = new Paint();
        continue; /* Loop/switch isn't completed */
_L4:
        Q = true;
        C = ig1.B;
        I = new Paint();
        if (true) goto _L9; else goto _L8
_L8:
    }

    private static Path a(lc lc1, float f1, float f2)
    {
        Path path = new Path();
        lc1 = lc1.b;
        path.moveTo((((PointF)lc1.get(0)).x * f1) / 100F, (((PointF)lc1.get(0)).y * f2) / 100F);
        int j = lc1.size();
        for (int i = 1; i < j; i++)
        {
            path.lineTo((((PointF)lc1.get(i)).x * f1) / 100F, (((PointF)lc1.get(i)).y * f2) / 100F);
        }

        path.close();
        return path;
    }

    private static Path a(lc lc1, float f1, float f2, float f3)
    {
        Path path = new Path();
        List list = lc1.b;
        lc1 = lc1.e;
        float f9 = ((PointF) (lc1)).x;
        float f10 = ((PointF) (lc1)).y;
        float f4 = f1 / 2.0F;
        float f6 = f1 / 2.0F;
        path.moveTo(f4 + (((PointF)list.get(0)).x * f2) / 100F, (((PointF)list.get(0)).y * f3) / 100F + f6);
        int j = list.size();
        for (int i = 1; i < j; i++)
        {
            lc1 = (PointF)list.get(i);
            float f7 = f1 / 2.0F;
            float f8 = f1 / 2.0F;
            float f5 = f7;
            if (((PointF) (lc1)).x > f9)
            {
                f5 = -f7;
            }
            f7 = f8;
            if (((PointF) (lc1)).y > f10)
            {
                f7 = -f8;
            }
            path.lineTo(f5 + (((PointF) (lc1)).x * f2) / 100F, (((PointF) (lc1)).y * f3) / 100F + f7);
        }

        path.close();
        return path;
    }

    private static void d(Bitmap bitmap)
    {
        if (bitmap != null && !bitmap.isRecycled())
        {
            bitmap.recycle();
        }
    }

    public final void a(lc lc1, int i, int j, int k, int l)
    {
        b = lc1;
        f = i;
        g = j;
        p = k;
        q = l;
    }

    public final void b(float f1)
    {
        r = r * f1;
    }

    public final void b(Bitmap bitmap)
    {
        if (bitmap == null || bitmap.isRecycled())
        {
            return;
        }
        float f1 = (float)f / (float)g;
        float f2 = (float)bitmap.getWidth() / (float)bitmap.getHeight();
        if (Q)
        {
            if (f2 <= 1.0F)
            {
                ih.C().y(1);
            } else
            {
                ih.C().y(2);
            }
        }
        if (C)
        {
            if (f1 <= f2)
            {
                r = ((float)f * 1.0F) / (float)bitmap.getWidth();
                return;
            }
        } else
        if (f1 > f2)
        {
            r = ((float)f * 1.0F) / (float)bitmap.getWidth();
            return;
        }
        r = ((float)g * 1.0F) / (float)bitmap.getHeight();
    }

    public final void c(Bitmap bitmap)
    {
        if (e != null && !e.isRecycled())
        {
            e.recycle();
        }
        P.reset();
        e = bitmap;
    }

    public final void f()
    {
        if (e == null || e.isRecycled())
        {
            return;
        } else
        {
            P.reset();
            P.postScale(((float)f * 1.0F) / (float)e.getWidth(), ((float)g * 1.0F) / (float)e.getHeight());
            return;
        }
    }

    protected final void onDetachedFromWindow()
    {
        if (c != null && b != null && d != null)
        {
            c.E = false;
            c.F = false;
            c.G = false;
            c.H = false;
            if (!b.f && c.p % 90 == 0)
            {
                float f1 = d.getWidth();
                float f2 = d.getHeight();
                float af[] = new float[4];
                J.mapPoints(af, new float[] {
                    0.0F, 0.0F, f1, f2
                });
                int i = (int)Math.min(af[0], af[2]);
                int j = (int)Math.min(af[1], af[3]);
                int k = (int)Math.max(af[0], af[2]);
                int l = (int)Math.max(af[1], af[3]);
                if (i >= 0 && (float)i < H)
                {
                    c.E = true;
                } else
                if (k <= f && (float)(f - k) < H)
                {
                    c.G = true;
                }
                if (j >= 0 && (float)j < H)
                {
                    c.F = true;
                } else
                if (l <= g && (float)(g - l) < H)
                {
                    c.H = true;
                }
            }
        }
        super.onDetachedFromWindow();
    }

    public final void onDraw(Canvas canvas)
    {
        Object obj;
        Object obj1;
        float f3 = 0.0F;
        super.onDraw(canvas);
        if (!h || d == null || d.isRecycled())
        {
            return;
        }
        J.reset();
        J.postScale(c.r, c.s, (float)d.getWidth() / 2.0F, (float)d.getHeight() / 2.0F);
        J.postRotate(c.p, (float)d.getWidth() / 2.0F, (float)d.getHeight() / 2.0F);
        J.postRotate(z, (float)d.getWidth() / 2.0F, (float)d.getHeight() / 2.0F);
        J.postScale(c.v * r, c.v * r);
        J.postScale(o, o);
        J.postTranslate((c.t - ((float)d.getWidth() * c.v * r) / 2.0F) + (float)f / 2.0F, (c.u - ((float)d.getHeight() * c.v * r) / 2.0F) + (float)g / 2.0F);
        J.postTranslate(x, y);
        u = c.t;
        v = c.u;
        if (t && !b.f && c.p % 90 == 0)
        {
            float f1 = d.getWidth();
            float f2 = d.getHeight();
            float af[] = new float[4];
            J.mapPoints(af, new float[] {
                0.0F, 0.0F, f1, f2
            });
            f1 = Math.min(af[0], af[2]);
            f2 = Math.min(af[1], af[3]);
            float f5 = Math.max(af[0], af[2]);
            float f4 = Math.max(af[1], af[3]);
            Object obj2;
            CornerPathEffect cornerpatheffect;
            Object obj3;
            Object obj4;
            boolean flag;
            int i;
            int j;
            if (f1 > 0.0F && f1 < H)
            {
                f1 = -f1;
            } else
            if (f5 < (float)f && (float)f - f5 < H)
            {
                f1 = (float)f - f5;
            } else
            {
                f1 = 0.0F;
            }
            if (f2 > 0.0F && f2 < H)
            {
                f2 = -f2;
            } else
            {
                f2 = f3;
                if (f4 < (float)g)
                {
                    f2 = f3;
                    if ((float)g - f4 < H)
                    {
                        f2 = (float)g - f4;
                    }
                }
            }
            u = u + f1;
            v = v + f2;
            J.postTranslate(f1, f2);
        }
        canvas.setDrawFilter(G);
        F = ih.C().V();
        cornerpatheffect = new CornerPathEffect(F);
        if (!A && (!C || b.f)) goto _L2; else goto _L1
_L1:
        obj3 = new BitmapShader(d, android.graphics.Shader.TileMode.CLAMP, android.graphics.Shader.TileMode.CLAMP);
        rf.a();
        obj = rf.a(d.getWidth(), d.getHeight(), android.graphics.Bitmap.Config.ARGB_8888);
        obj1 = obj;
        obj2 = obj;
        obj4 = new Canvas(((Bitmap) (obj)));
        obj1 = obj;
        obj2 = obj;
        K.reset();
        obj1 = obj;
        obj2 = obj;
        K.moveTo(0.0F, 0.0F);
        obj1 = obj;
        obj2 = obj;
        K.lineTo(d.getWidth(), 0.0F);
        obj1 = obj;
        obj2 = obj;
        K.lineTo(d.getWidth(), d.getHeight());
        obj1 = obj;
        obj2 = obj;
        K.lineTo(0.0F, d.getHeight());
        obj1 = obj;
        obj2 = obj;
        K.close();
        obj1 = obj;
        obj2 = obj;
        O.setShape(new PathShape(K, d.getWidth(), d.getHeight()));
        obj1 = obj;
        obj2 = obj;
        O.getPaint().setPathEffect(cornerpatheffect);
        obj1 = obj;
        obj2 = obj;
        O.getPaint().setShader(((android.graphics.Shader) (obj3)));
        obj1 = obj;
        obj2 = obj;
        O.setBounds(0, 0, d.getWidth(), d.getHeight());
        obj1 = obj;
        obj2 = obj;
        O.draw(((Canvas) (obj4)));
        obj1 = obj;
        obj2 = obj;
        canvas.drawBitmap(((Bitmap) (obj)), J, null);
_L11:
        if (!s) goto _L4; else goto _L3
_L3:
        if (I != null)
        {
            canvas.drawLine(0.0F, g / 3, f, g / 3, I);
            canvas.drawLine(0.0F, (g / 3) * 2, f, (g / 3) * 2, I);
            canvas.drawLine(f / 3, 0.0F, f / 3, g, I);
            canvas.drawLine((f / 3) * 2, 0.0F, (f / 3) * 2, g, I);
        }
        if (C && !b.f) goto _L6; else goto _L5
_L5:
        M.setPathEffect(cornerpatheffect);
_L14:
        canvas.drawPath(a(b, w, p, q), M);
_L16:
        d(((Bitmap) (obj)));
_L13:
        super.onDraw(canvas);
        return;
_L2:
        j = f;
        i = g;
        rf.a();
        obj = rf.a(j, i, az.c);
        if (obj != null) goto _L8; else goto _L7
_L7:
        obj1 = obj;
        obj2 = obj;
        j = f / 2;
        obj1 = obj;
        obj2 = obj;
        i = g / 2;
        obj1 = obj;
        obj2 = obj;
        rf.a();
        obj1 = obj;
        obj2 = obj;
        obj = rf.a(j, i, az.c);
        flag = true;
_L22:
        obj1 = obj;
        obj2 = obj;
        obj3 = new Canvas(((Bitmap) (obj)));
        obj1 = obj;
        obj2 = obj;
        ((Canvas) (obj3)).setDrawFilter(G);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_1363;
        }
        obj1 = obj;
        obj2 = obj;
        J.postScale(0.5F, 0.5F);
        obj1 = obj;
        obj2 = obj;
        L.reset();
        obj1 = obj;
        obj2 = obj;
        L.setAntiAlias(true);
        obj1 = obj;
        obj2 = obj;
        L.setFilterBitmap(true);
        obj1 = obj;
        obj2 = obj;
        ((Canvas) (obj3)).drawBitmap(d, J, L);
        obj1 = obj;
        obj2 = obj;
        ((Canvas) (obj3)).save();
        obj1 = obj;
        obj2 = obj;
        if (e == null)
        {
            break MISSING_BLOCK_LABEL_1515;
        }
        obj1 = obj;
        obj2 = obj;
        L.setXfermode(new PorterDuffXfermode(android.graphics.PorterDuff.Mode.DST_IN));
        obj1 = obj;
        obj2 = obj;
        ((Canvas) (obj3)).drawBitmap(e, P, L);
        obj1 = obj;
        obj2 = obj;
        obj3 = new BitmapShader(((Bitmap) (obj)), android.graphics.Shader.TileMode.CLAMP, android.graphics.Shader.TileMode.CLAMP);
        obj1 = obj;
        obj2 = obj;
        obj4 = b.a;
        if (!flag) goto _L10; else goto _L9
_L9:
        obj1 = obj;
        obj2 = obj;
        O.setShape(new PathShape(a(b, (float)p / 2.0F, (float)q / 2.0F), j, i));
_L12:
        obj1 = obj;
        obj2 = obj;
        O.getPaint().setPathEffect(cornerpatheffect);
        obj1 = obj;
        obj2 = obj;
        O.getPaint().setShader(((android.graphics.Shader) (obj3)));
        obj1 = obj;
        obj2 = obj;
        O.setBounds(0, 0, f, g);
        obj1 = obj;
        obj2 = obj;
        O.draw(canvas);
          goto _L11
_L10:
        obj1 = obj;
        obj2 = obj;
        O.setShape(new PathShape(((Path) (obj4)), j, i));
          goto _L12
        obj;
_L21:
        d(((Bitmap) (obj1)));
        if (a instanceof PhotoGridActivity)
        {
            obj1 = Message.obtain();
            obj1.what = 14;
            obj1.arg1 = 201;
            ((PhotoGridActivity)a).d.sendMessage(((Message) (obj1)));
        } else
        {
            obj1 = Message.obtain();
            obj1.what = 2;
            obj1.obj = Boolean.valueOf(false);
            ((ImageEditor)a).h.sendMessage(((Message) (obj1)));
            ((ImageEditor)a).h.sendEmptyMessage(6);
        }
        ((OutOfMemoryError) (obj)).printStackTrace();
          goto _L13
_L6:
        M.setPathEffect(null);
          goto _L14
_L4:
        if (!D) goto _L16; else goto _L15
_L15:
        D = false;
        if (C && !b.f) goto _L18; else goto _L17
_L17:
        M.setPathEffect(new ComposePathEffect(N, cornerpatheffect));
_L19:
        canvas.drawPath(a(b, w, p, q), M);
          goto _L16
        obj2;
        obj1 = obj;
        obj = obj2;
_L20:
        ((Exception) (obj)).printStackTrace();
        d(((Bitmap) (obj1)));
        if (a instanceof PhotoGridActivity)
        {
            obj1 = Message.obtain();
            obj1.what = 14;
            obj1.arg1 = 202;
            ((PhotoGridActivity)a).d.sendMessage(((Message) (obj1)));
        } else
        {
            obj1 = Message.obtain();
            obj1.what = 2;
            obj1.obj = Boolean.valueOf(false);
            ((ImageEditor)a).h.sendMessage(((Message) (obj1)));
            ((ImageEditor)a).h.sendEmptyMessage(6);
        }
        ((Exception) (obj)).printStackTrace();
          goto _L13
_L18:
        M.setPathEffect(N);
          goto _L19
        obj;
        obj1 = null;
          goto _L20
        obj;
        obj1 = obj2;
          goto _L20
        obj;
        obj1 = null;
          goto _L21
_L8:
        flag = false;
          goto _L22
        OutOfMemoryError outofmemoryerror;
        outofmemoryerror;
        obj1 = obj;
        obj = outofmemoryerror;
          goto _L21
    }

    public final void onMeasure(int i, int j)
    {
        super.setMeasuredDimension(f, g);
    }

}
