// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.views;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import com.android.a.g;

// Referenced classes of package com.android.slyce.views:
//            a, b, c

public class CustomCircleProgressWidgetExtraAnimationsAll extends View
{

    private static int r;
    private static int s;
    private float A;
    private int B;
    private Paint C;
    private Paint D;
    private Paint E;
    private Paint F;
    private Paint G;
    private Paint H;
    private Shader I;
    private RectF J;
    private RectF K;
    private Matrix L;
    private float M;
    private float N;
    int a;
    int b;
    int c[] = {
        0xff0000ff, 0xff1a237e
    };
    Point d;
    float e;
    float f;
    float g;
    Handler h;
    float i;
    Runnable j;
    Handler k;
    int l;
    int m;
    boolean n;
    Runnable o;
    private Paint p;
    private Paint q;
    private float t;
    private volatile boolean u;
    private c v;
    private Resources w;
    private Bitmap x;
    private Bitmap y;
    private float z;

    public CustomCircleProgressWidgetExtraAnimationsAll(Context context)
    {
        super(context);
        t = 0.5F;
        u = false;
        N = 25F;
        h = new Handler();
        j = new a(this);
        k = new Handler();
        l = getMeasuredWidth() / 3 + s;
        m = getMeasuredWidth() / 3;
        n = true;
        o = new b(this);
        a(context, ((AttributeSet) (null)));
    }

    public CustomCircleProgressWidgetExtraAnimationsAll(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        t = 0.5F;
        u = false;
        N = 25F;
        h = new Handler();
        j = new a(this);
        k = new Handler();
        l = getMeasuredWidth() / 3 + s;
        m = getMeasuredWidth() / 3;
        n = true;
        o = new b(this);
        a(context, attributeset);
    }

    public CustomCircleProgressWidgetExtraAnimationsAll(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        t = 0.5F;
        u = false;
        N = 25F;
        h = new Handler();
        j = new a(this);
        k = new Handler();
        l = getMeasuredWidth() / 3 + s;
        m = getMeasuredWidth() / 3;
        n = true;
        o = new b(this);
        a(context, attributeset);
    }

    static float a(CustomCircleProgressWidgetExtraAnimationsAll customcircleprogresswidgetextraanimationsall)
    {
        return customcircleprogresswidgetextraanimationsall.t;
    }

    static float a(CustomCircleProgressWidgetExtraAnimationsAll customcircleprogresswidgetextraanimationsall, float f1)
    {
        customcircleprogresswidgetextraanimationsall.N = f1;
        return f1;
    }

    private void a(Context context, AttributeSet attributeset)
    {
        context = context.getTheme().obtainStyledAttributes(attributeset, g.CustomCircleProgressWidgetMaskingV2, 0, 0);
        float f1;
        int i1;
        int j1;
        i1 = context.getInt(g.CustomCircleProgressWidgetMaskingV2_gradient_background_color_1, 0);
        j1 = context.getInt(g.CustomCircleProgressWidgetMaskingV2_gradient_background_color_2, 0);
        f1 = context.getFloat(g.CustomCircleProgressWidgetMaskingV2_max, 360F);
        context.recycle();
        M = f1;
        if (i1 != 0)
        {
            c[0] = i1;
        }
        if (j1 != 0)
        {
            c[1] = j1;
        }
        w = getResources();
        if (w != null && w.getDisplayMetrics() != null && Math.min(w.getDisplayMetrics().widthPixels, w.getDisplayMetrics().heightPixels) > 0)
        {
            float f2 = TypedValue.applyDimension(1, 20F, w.getDisplayMetrics());
            float f3 = TypedValue.applyDimension(1, 2.66666F, w.getDisplayMetrics());
            s = (int)f2;
            b = (int)f2;
            r = (int)f3;
        } else
        {
            s = 60;
            b = 60;
            r = 8;
        }
        C = new Paint();
        C.setColor(-1);
        C.setStyle(android.graphics.Paint.Style.STROKE);
        C.setStrokeWidth(r);
        C.setAntiAlias(true);
        D = new Paint();
        D.setColor(0);
        D.setStyle(android.graphics.Paint.Style.STROKE);
        D.setStrokeWidth(s);
        D.setAntiAlias(true);
        E = new Paint();
        E.setFilterBitmap(true);
        y = b();
        I = new LinearGradient(0.0F, 0.0F, 40F, 40F, c[0], c[1], android.graphics.Shader.TileMode.MIRROR);
        J = new RectF();
        L = new Matrix();
        F = new Paint();
        F.setShader(I);
        F.setAntiAlias(true);
        F.setStyle(android.graphics.Paint.Style.STROKE);
        F.setStrokeWidth(s);
        K = new RectF();
        G = new Paint();
        G.setAntiAlias(true);
        G.setStyle(android.graphics.Paint.Style.STROKE);
        G.setStrokeWidth(N);
        G.setColor(-1);
        H = new Paint();
        H.setStrokeWidth(700F);
        H.setColor(0xaaeceff1);
        d = new Point();
        p = new Paint();
        p.setXfermode(new PorterDuffXfermode(android.graphics.PorterDuff.Mode.CLEAR));
        q = new Paint();
        q.setXfermode(new PorterDuffXfermode(android.graphics.PorterDuff.Mode.DST_OVER));
        q.setStyle(android.graphics.Paint.Style.FILL);
        q.setAntiAlias(true);
        return;
        attributeset;
        context.recycle();
        throw attributeset;
    }

    private void a(Canvas canvas, int i1, int j1, int k1)
    {
        canvas.drawCircle(j1, k1, i1 / 3, C);
        canvas.drawCircle(j1, k1, i1 / 3 + b, C);
    }

    static boolean a(CustomCircleProgressWidgetExtraAnimationsAll customcircleprogresswidgetextraanimationsall, boolean flag)
    {
        customcircleprogresswidgetextraanimationsall.u = flag;
        return flag;
    }

    private Bitmap b()
    {
        int i1 = w.getDisplayMetrics().widthPixels;
        int j1 = w.getDisplayMetrics().heightPixels;
        Bitmap bitmap = Bitmap.createBitmap(i1, j1, android.graphics.Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap);
        Paint paint = new Paint();
        canvas.drawARGB(125, 205, 201, 201);
        paint.setAntiAlias(true);
        paint.setXfermode(new PorterDuffXfermode(android.graphics.PorterDuff.Mode.CLEAR));
        float f1 = i1 / 3;
        canvas.drawCircle(i1 / 2, j1 / 2, f1, paint);
        return bitmap;
    }

    static boolean b(CustomCircleProgressWidgetExtraAnimationsAll customcircleprogresswidgetextraanimationsall)
    {
        return customcircleprogresswidgetextraanimationsall.u;
    }

    static c c(CustomCircleProgressWidgetExtraAnimationsAll customcircleprogresswidgetextraanimationsall)
    {
        return customcircleprogresswidgetextraanimationsall.v;
    }

    static Paint d(CustomCircleProgressWidgetExtraAnimationsAll customcircleprogresswidgetextraanimationsall)
    {
        return customcircleprogresswidgetextraanimationsall.F;
    }

    static float e(CustomCircleProgressWidgetExtraAnimationsAll customcircleprogresswidgetextraanimationsall)
    {
        return customcircleprogresswidgetextraanimationsall.N;
    }

    static Paint f(CustomCircleProgressWidgetExtraAnimationsAll customcircleprogresswidgetextraanimationsall)
    {
        return customcircleprogresswidgetextraanimationsall.G;
    }

    private void setBaseProgressionInterval(float f1)
    {
        t = f1;
    }

    void a()
    {
        h.removeCallbacks(j);
    }

    public float getAvailableHeight()
    {
        return f;
    }

    public float getAvailableWidth()
    {
        return g;
    }

    public Point getCenterOfScreen()
    {
        return d;
    }

    public float getInnerCircleRadius()
    {
        return e;
    }

    public float getOuterCircleRadius()
    {
        return e + (float)s;
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        B = B + 1;
        int i1 = w.getDisplayMetrics().heightPixels;
        int j1 = w.getDisplayMetrics().widthPixels;
        int k1 = j1 / 2;
        int l1 = i1 / 2;
        canvas.drawBitmap(x, k1 - x.getWidth() / 2, l1 - x.getHeight() / 2, E);
        canvas.drawBitmap(y, 0.0F, 0.0F, E);
        d.set(k1, l1);
        if (j1 > i1)
        {
            e = i1 / 3;
            f = j1;
            g = i1;
        } else
        {
            e = j1 / 3;
            f = i1;
            g = j1;
        }
        K.set(k1 - j1 / 3 - b - a / 4, l1 - j1 / 3 - b - a / 4, j1 / 3 + k1 + b + a / 4, j1 / 3 + l1 + b + a / 4);
        canvas.drawArc(K, -90F, A, false, G);
        J.set((float)k1 - e - 30F - (float)(a / 2), (float)l1 - e - 30F - (float)(a / 2), (float)k1 + e + 30F + (float)(a / 2), (float)l1 + e + 30F + (float)(a / 2));
        A = (360F / M) * z;
        canvas.drawArc(J, -90F, A, false, F);
        L.setTranslate(-B, -B);
        I.setLocalMatrix(L);
        F.setShader(I);
        a(canvas, j1, k1, l1);
        postInvalidate();
    }

    public void setMaxProgress(float f1)
    {
        M = f1;
        invalidate();
        requestLayout();
    }

    public void setOnProgressFinishListener(c c1)
    {
        v = c1;
    }

    public void setProgress(float f1)
    {
        z = f1;
        invalidate();
    }
}
