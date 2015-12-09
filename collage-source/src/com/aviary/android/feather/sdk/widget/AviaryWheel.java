// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;

// Referenced classes of package com.aviary.android.feather.sdk.widget:
//            i, a, ScrollerRunnable, h

public class AviaryWheel extends View
    implements android.view.GestureDetector.OnGestureListener, ScrollerRunnable.a, i
{
    public static interface a
    {

        public abstract void a(AviaryWheel aviarywheel);

        public abstract void a(AviaryWheel aviarywheel, int i1);

        public abstract void b(AviaryWheel aviarywheel);
    }


    private a A;
    private float B;
    private Paint C;
    private float D;
    int a;
    private Drawable b;
    private BitmapShader c;
    private Matrix d;
    private GestureDetector e;
    private ScrollerRunnable f;
    private double g;
    private boolean h;
    private boolean i;
    private boolean j;
    private Drawable k;
    private Drawable l;
    private Paint m;
    private int n;
    private int o;
    private int p;
    private int q;
    private int r;
    private int s;
    private float t;
    private com.aviary.android.feather.sdk.widget.a u;
    private com.aviary.android.feather.sdk.widget.a v;
    private Matrix w;
    private Matrix x;
    private int y;
    private h z;

    public AviaryWheel(Context context)
    {
        this(context, null);
    }

    public AviaryWheel(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, com.aviary.android.feather.sdk.R.attr.aviaryWheelStyle);
    }

    public AviaryWheel(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        w = new Matrix();
        x = new Matrix();
        a = 0;
        D = 0.0F;
        a(context, attributeset, i1);
    }

    private void a(int i1, int j1)
    {
        Bitmap bitmap = Bitmap.createBitmap((int)((float)i1 * 2.2F), l.getIntrinsicHeight(), android.graphics.Bitmap.Config.ARGB_8888);
        BitmapShader bitmapshader = new BitmapShader(((BitmapDrawable)l).getBitmap(), android.graphics.Shader.TileMode.REPEAT, android.graphics.Shader.TileMode.CLAMP);
        Canvas canvas = new Canvas(bitmap);
        Paint paint = new Paint(7);
        paint.setShader(bitmapshader);
        int k1 = bitmap.getWidth() / 2;
        int l1 = k.getIntrinsicWidth();
        j1 = k1 - l1 / 2;
        k1 += l1 / 2;
        double d1 = j1 % p;
        Matrix matrix = new Matrix();
        matrix.setTranslate((float)d1, 0.0F);
        bitmapshader.setLocalMatrix(matrix);
        canvas.drawRect(0.0F, 0.0F, j1, bitmap.getHeight(), paint);
        k.setBounds(j1, 0, k1, bitmap.getHeight());
        k.draw(canvas);
        bitmapshader.setLocalMatrix(null);
        canvas.drawRect(k1, 0.0F, bitmap.getWidth(), bitmap.getHeight(), paint);
        c = new BitmapShader(bitmap, android.graphics.Shader.TileMode.CLAMP, android.graphics.Shader.TileMode.CLAMP);
        m.setShader(c);
        d = new Matrix();
        n = bitmap.getWidth();
        j1 = (int)(0.55172413793103448D * (double)bitmap.getHeight());
        k1 = (int)(9F * B);
        w.reset();
        w.postRotate(-90F);
        w.postTranslate(k1, j1);
        w.postTranslate(0.0F, a - 3);
        u.a(j1, k1 * 2);
        x.reset();
        x.postRotate(90F);
        x.postTranslate(i1 - k1, 0.0F);
        x.postTranslate(0.0F, a - 3);
        v.a(j1, k1 * 2);
    }

    private void a(Context context, AttributeSet attributeset, int i1)
    {
        ViewConfiguration viewconfiguration = ViewConfiguration.get(context);
        B = context.getResources().getDisplayMetrics().density / 2.0F;
        attributeset = context.getTheme().obtainStyledAttributes(attributeset, com.aviary.android.feather.sdk.R.styleable.AviaryWheel, i1, 0);
        b = attributeset.getDrawable(0);
        l = attributeset.getDrawable(1);
        k = attributeset.getDrawable(2);
        y = attributeset.getResourceId(3, 0);
        attributeset.recycle();
        t = (float)(20D * (double)B);
        p = l.getIntrinsicWidth();
        m = new Paint(7);
        if (!isInEditMode())
        {
            e = new GestureDetector(context, this);
            e.setIsLongpressEnabled(false);
        }
        f = new ScrollerRunnable(this, 200, viewconfiguration.getScaledOverflingDistance(), null);
        z = new h(context, true);
        u = new com.aviary.android.feather.sdk.widget.a(getContext(), y);
        v = new com.aviary.android.feather.sdk.widget.a(getContext(), y);
        u.a(100);
        v.a(100);
        s = -1;
        g = 0.0D;
    }

    private void c(int i1)
    {
        g = i1;
        c();
        postInvalidate();
    }

    private void d()
    {
        a();
    }

    protected double a(int i1)
    {
        return ((double)(i1 - q) / (double)getRange()) * 100D;
    }

    protected int a(double d1)
    {
        return (int)((d1 / 100D) * (double)getRange()) + q;
    }

    void a()
    {
        if (A != null)
        {
            A.b(this);
        }
    }

    public boolean a(MotionEvent motionevent)
    {
        u.b();
        v.b();
        if (f.f())
        {
            k();
        }
        return true;
    }

    void b()
    {
        if (A != null)
        {
            A.a(this);
        }
    }

    public void b(int i1)
    {
        double d1 = a(i1);
        if (d1 != g)
        {
            g = d1;
            c();
        }
        postInvalidate();
    }

    void c()
    {
        int i1 = getValue();
        if (!j && Math.abs(i1 - o) > 3)
        {
            z.a(8);
            o = i1;
        }
        if (A != null)
        {
            A.a(this, getValue());
        }
    }

    public void computeScroll()
    {
        super.computeScroll();
        if (f.d())
        {
            int i1 = f.c();
            int j1 = f.h();
            if (i1 != j1)
            {
                if (j1 < q && i1 >= q && i1 > j1)
                {
                    u.b((int)f.e());
                } else
                if (j1 > r && i1 <= r && j1 > i1)
                {
                    v.b((int)f.e());
                    return;
                }
            }
        }
    }

    public int getMaxX()
    {
        return r;
    }

    public int getMinX()
    {
        return q;
    }

    public int getRange()
    {
        return r - q;
    }

    protected int getSuggestedMinimumHeight()
    {
        if (getBackground() != null)
        {
            return getBackground().getIntrinsicHeight();
        } else
        {
            return super.getSuggestedMinimumHeight();
        }
    }

    protected int getSuggestedMinimumWidth()
    {
        if (getBackground() != null)
        {
            return getBackground().getIntrinsicWidth();
        } else
        {
            return super.getSuggestedMinimumWidth();
        }
    }

    public int getValue()
    {
        return (int)g;
    }

    public boolean getVibrationEnabled()
    {
        return z.b();
    }

    public void k()
    {
        if (!f.f())
        {
            return;
        }
        int i1 = getMaxX();
        int j1 = getMinX();
        int k1 = a(g);
        if (k1 > i1)
        {
            f.a(k1, i1 - k1);
            return;
        }
        if (k1 < j1)
        {
            f.a(k1, j1 - k1);
            return;
        } else
        {
            d();
            return;
        }
    }

    public boolean onDown(MotionEvent motionevent)
    {
        getParent().requestDisallowInterceptTouchEvent(true);
        f.a(false);
        b();
        return true;
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        if (getBackground() != null)
        {
            if (c != null && d != null)
            {
                int i1 = n / 2;
                int l1 = a(g);
                d.setTranslate(l1 - i1, 0.0F);
                c.setLocalMatrix(d);
                canvas.drawRect(t, 0.0F, (float)getWidth() - t, getHeight(), m);
            }
            canvas.translate(0.0F, a);
            b.draw(canvas);
            canvas.translate(0.0F, -a);
            if (C != null)
            {
                C.setColor(-1);
                C.setAlpha(127);
                canvas.drawLine(q, 0.0F, q, getHeight(), C);
                canvas.drawLine(r, 0.0F, r, getHeight(), C);
                canvas.drawLine(getWidth() / 2, 0.0F, getWidth() / 2, getHeight(), C);
            }
            if (u != null)
            {
                if (!u.a())
                {
                    int j1 = canvas.save();
                    canvas.concat(w);
                    if (u.a(canvas))
                    {
                        postInvalidate();
                    }
                    canvas.restoreToCount(j1);
                }
                if (!v.a())
                {
                    int k1 = canvas.save();
                    canvas.concat(x);
                    if (v.a(canvas))
                    {
                        postInvalidate();
                    }
                    canvas.restoreToCount(k1);
                    return;
                }
            }
        }
    }

    public boolean onFling(MotionEvent motionevent, MotionEvent motionevent1, float f1, float f2)
    {
        int i1;
        int j1;
        int k1;
        i1 = getMaxX();
        j1 = getMinX();
        k1 = a(g);
        boolean flag;
        if (f1 < 0.0F)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag) goto _L2; else goto _L1
_L1:
        if (k1 < i1) goto _L4; else goto _L3
_L3:
        return false;
_L4:
        if (k1 > i1)
        {
            f.a(k1, i1 - k1);
            return true;
        }
        break; /* Loop/switch isn't completed */
_L2:
        if (k1 <= j1)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (k1 < j1)
        {
            f.a(k1, j1 - k1);
            return true;
        }
        break; /* Loop/switch isn't completed */
        if (true) goto _L3; else goto _L5
_L5:
        f.b(k1, (int)f1 / 2);
        return true;
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        super.onLayout(flag, i1, j1, k1, l1);
        j = true;
        if (flag)
        {
            i = true;
            if (s != -1)
            {
                setValue(s);
                s = -1;
            }
        }
        j = false;
    }

    public void onLongPress(MotionEvent motionevent)
    {
    }

    protected void onMeasure(int i1, int j1)
    {
        Drawable drawable = getBackground();
        if (drawable != null)
        {
            int l1 = android.view.View.MeasureSpec.getMode(i1);
            i1 = android.view.View.MeasureSpec.getSize(i1);
            int k1 = android.view.View.MeasureSpec.getMode(j1);
            j1 = android.view.View.MeasureSpec.getSize(j1);
            if (l1 == 0x80000000 || l1 == 0)
            {
                i1 = drawable.getIntrinsicWidth();
            }
            l1 = Math.min(i1, 930);
            if (k1 == 0x80000000 || k1 == 0)
            {
                i1 = drawable.getIntrinsicHeight();
            } else
            {
                i1 = j1;
            }
            setMeasuredDimension(l1, i1);
            return;
        } else
        {
            super.onMeasure(i1, j1);
            return;
        }
    }

    public boolean onScroll(MotionEvent motionevent, MotionEvent motionevent1, float f1, float f2)
    {
        f1 = -1F * f1;
        int i1;
        int j1;
        int k1;
        int l1;
        boolean flag;
        if (f1 < 0.0F)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        h = flag;
        l1 = a(g);
        i1 = (int)((float)l1 + f1);
        j1 = getMaxX();
        k1 = getMinX();
        if (!h)
        {
            if ((float)l1 + f1 > (float)j1)
            {
                f1 = Math.min(f1, 50F);
                double d1 = f1;
                f1 = (float)((1.0D - (double)(((f1 + D) - (float)j1) / 50F)) * d1);
                D = (float)l1 + f1;
                v.a(f1 / 50F);
                i1 = j1;
            } else
            {
                D = (float)l1 + f1;
            }
        } else
        if ((float)l1 + f1 < (float)k1)
        {
            f1 = Math.max(f1, -50F);
            f2 = ((float)l1 - f1 - (float)k1) / 50F;
            u.a((f1 * (1.0F - f2)) / 50F);
            i1 = k1;
        } else
        {
            D = (float)l1 + f1;
        }
        b(i1);
        return false;
    }

    public void onShowPress(MotionEvent motionevent)
    {
    }

    public boolean onSingleTapUp(MotionEvent motionevent)
    {
        return false;
    }

    protected void onSizeChanged(int i1, int j1, int k1, int l1)
    {
        super.onSizeChanged(i1, j1, k1, l1);
        Rect rect = new Rect(0, 0, i1, j1);
        q = (i1 - (int)((float)i1 - t * 4F)) / 2;
        r = i1 - q;
        if (getBackground() != null)
        {
            a = getBackground().getIntrinsicHeight() - b.getIntrinsicHeight();
        }
        b.setBounds(rect.left, rect.top, rect.right, rect.top + b.getIntrinsicHeight());
        a(i1, j1);
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        boolean flag = e.onTouchEvent(motionevent);
        int i1 = motionevent.getAction();
        if (i1 == 1)
        {
            a(motionevent);
        } else
        if (i1 == 3)
        {
            return flag;
        }
        return flag;
    }

    public void setOnWheelChangeListener(a a1)
    {
        A = a1;
    }

    public void setValue(int i1)
    {
label0:
        {
            i1 = Math.min(100, Math.max(i1, 0));
            if (g != (double)i1)
            {
                if (i)
                {
                    break label0;
                }
                s = i1;
            }
            return;
        }
        if (!f.f())
        {
            f.a(false);
        }
        b();
        c(i1);
        a();
    }

    public void setVibrationEnabled(boolean flag)
    {
        Log.i("wheel", (new StringBuilder()).append("setVibrationEnabled: ").append(flag).toString());
        z.a(flag);
    }
}
