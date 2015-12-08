// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.retouch;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.DrawFilter;
import android.graphics.Matrix;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Handler;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.roidapp.baselib.c.n;
import java.util.Iterator;
import java.util.LinkedList;

// Referenced classes of package com.roidapp.imagelib.retouch:
//            w, h, Magnifier, t, 
//            Inpaint, x, i, j, 
//            k

public class BlemishImageView extends ImageView
    implements android.view.View.OnLongClickListener, w
{

    private x A;
    private ObjectAnimator B;
    private ObjectAnimator C;
    private k D;
    private final Object E;
    private final DrawFilter F;
    private Handler G;
    private float H[];
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private float h;
    private float i;
    private boolean j;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n;
    private Bitmap o;
    private Matrix p;
    private Matrix q;
    private Inpaint r;
    private LinkedList s;
    private LinkedList t;
    private LinkedList u;
    private LinkedList v;
    private LinkedList w;
    private t x;
    private Magnifier y;
    private RelativeLayout z;

    public BlemishImageView(Context context)
    {
        super(context);
        q = new Matrix();
        s = new LinkedList();
        t = new LinkedList();
        u = new LinkedList();
        v = new LinkedList();
        w = new LinkedList();
        E = new Object();
        F = new PaintFlagsDrawFilter(0, 7);
        G = new h(this);
        H = new float[9];
        h();
    }

    public BlemishImageView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        q = new Matrix();
        s = new LinkedList();
        t = new LinkedList();
        u = new LinkedList();
        v = new LinkedList();
        w = new LinkedList();
        E = new Object();
        F = new PaintFlagsDrawFilter(0, 7);
        G = new h(this);
        H = new float[9];
        h();
    }

    public BlemishImageView(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        q = new Matrix();
        s = new LinkedList();
        t = new LinkedList();
        u = new LinkedList();
        v = new LinkedList();
        w = new LinkedList();
        E = new Object();
        F = new PaintFlagsDrawFilter(0, 7);
        G = new h(this);
        H = new float[9];
        h();
    }

    private float a(float f1)
    {
        float af[] = new float[2];
        float[] _tmp = af;
        af[0] = 100F;
        af[1] = 100F;
        float f2 = af[0];
        float f3 = af[0];
        RectF rectf = new RectF(f2 - f1, af[1] - f1, f3 + f1, af[1] + f1);
        RectF rectf1 = new RectF();
        q.mapRect(rectf1, rectf);
        return rectf.width() / rectf1.width();
    }

    static RelativeLayout a(BlemishImageView blemishimageview)
    {
        return blemishimageview.z;
    }

    private void a(float f1, float f2)
    {
        c(true);
        int i1 = y.a();
        Object obj = new android.widget.RelativeLayout.LayoutParams(i1, i1);
        if (f1 < (float)i1 && f2 < (float)i1)
        {
            ((android.widget.RelativeLayout.LayoutParams) (obj)).addRule(11, -1);
            ((android.widget.RelativeLayout.LayoutParams) (obj)).addRule(10, -1);
            z.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        }
        if (f1 > (float)(a - i1) && f2 < (float)i1)
        {
            ((android.widget.RelativeLayout.LayoutParams) (obj)).addRule(9, -1);
            ((android.widget.RelativeLayout.LayoutParams) (obj)).addRule(10, -1);
            z.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        }
        obj = q;
        float af[] = new float[2];
        af[0] = f1;
        af[1] = f2;
        ((Matrix) (obj)).mapPoints(af);
        obj = new PointF(af[0], af[1]);
        y.a(((PointF) (obj)));
        y.invalidate();
    }

    private void a(Bitmap bitmap, Rect rect)
    {
        Bitmap bitmap1 = Bitmap.createBitmap(rect.width() + 1, rect.height() + 1, android.graphics.Bitmap.Config.ARGB_8888);
        for (int i1 = rect.left; i1 <= rect.right; i1++)
        {
            for (int j1 = rect.top; j1 <= rect.bottom; j1++)
            {
                bitmap1.setPixel(i1 - rect.left, j1 - rect.top, bitmap.getPixel(i1, j1));
            }

        }

        u.clear();
        v.clear();
        if (w.size() >= 10)
        {
            w.pollLast();
            t.pollLast();
            bitmap = (Bitmap)s.pollLast();
            if (bitmap != null)
            {
                bitmap.recycle();
            }
        }
        w.push(rect);
        s.push(bitmap1);
        t.push(rect);
        if (x != null)
        {
            x.q_();
        }
    }

    static t b(BlemishImageView blemishimageview)
    {
        return blemishimageview.x;
    }

    static Object c(BlemishImageView blemishimageview)
    {
        return blemishimageview.E;
    }

    private void c(boolean flag)
    {
label0:
        {
label1:
            {
                if (m != flag)
                {
                    m = flag;
                    if (!flag)
                    {
                        break label0;
                    }
                    if (B == null)
                    {
                        break label1;
                    }
                    B.start();
                }
                return;
            }
            z.setVisibility(0);
            return;
        }
        if (C != null)
        {
            C.start();
            return;
        } else
        {
            z.setVisibility(8);
            return;
        }
    }

    static Inpaint d(BlemishImageView blemishimageview)
    {
        return blemishimageview.r;
    }

    private void h()
    {
        ViewCompat.setLayerType(this, 1, null);
        a = getResources().getDisplayMetrics().widthPixels;
        r = new Inpaint();
        A = new x(this);
        setClickable(true);
        setLongClickable(true);
        setOnTouchListener(A);
        setOnLongClickListener(this);
    }

    public final Bitmap a()
    {
        return o;
    }

    public final void a(int i1)
    {
        b = i1 / 2;
        y.a(b);
    }

    public final void a(Magnifier magnifier, RelativeLayout relativelayout)
    {
        y = magnifier;
        z = relativelayout;
        if (com.roidapp.baselib.c.n.d())
        {
            magnifier = new AccelerateDecelerateInterpolator();
            B = ObjectAnimator.ofFloat(z, "alpha", new float[] {
                0.0F, 1.0F
            });
            B.setDuration(400L);
            B.setInterpolator(magnifier);
            B.addListener(new i(this));
            C = ObjectAnimator.ofFloat(z, "alpha", new float[] {
                1.0F, 0.0F
            });
            C.setDuration(400L);
            B.setInterpolator(magnifier);
            C.addListener(new j(this));
        }
    }

    public final void a(t t1)
    {
        x = t1;
        x.q_();
        if (Inpaint.a)
        {
            x.a(new UnsatisfiedLinkError(String.valueOf("JNI ERROR")), "");
        }
    }

    public final void a(boolean flag)
    {
        n = flag;
    }

    public final void b(boolean flag)
    {
        k = flag;
    }

    public final boolean b()
    {
        return !t.isEmpty();
    }

    public final boolean c()
    {
        return !v.isEmpty();
    }

    public final void d()
    {
        Rect rect;
        if (!w.isEmpty())
        {
            w.pop();
        }
        rect = (Rect)t.pop();
        v.push(rect);
        Object obj = E;
        obj;
        JVM INSTR monitorenter ;
        Bitmap bitmap;
        int i1;
        bitmap = Bitmap.createBitmap(rect.width() + 1, rect.height() + 1, android.graphics.Bitmap.Config.ARGB_8888);
        i1 = rect.left;
_L9:
        if (i1 > rect.right) goto _L2; else goto _L1
_L1:
        int j1 = rect.top;
_L5:
        if (j1 > rect.bottom) goto _L4; else goto _L3
_L3:
        bitmap.setPixel(i1 - rect.left, j1 - rect.top, o.getPixel(i1, j1));
        j1++;
          goto _L5
_L2:
        u.push(bitmap);
        bitmap = (Bitmap)s.pop();
        i1 = rect.left;
_L10:
        if (i1 > rect.right) goto _L7; else goto _L6
_L6:
        j1 = rect.top;
_L8:
        if (j1 > rect.bottom)
        {
            break MISSING_BLOCK_LABEL_264;
        }
        o.setPixel(i1, j1, bitmap.getPixel(i1 - rect.left, j1 - rect.top));
        j1++;
          goto _L8
_L7:
        if (bitmap == null)
        {
            break MISSING_BLOCK_LABEL_233;
        }
        if (!bitmap.isRecycled())
        {
            bitmap.recycle();
        }
        g = g - 1;
        obj;
        JVM INSTR monitorexit ;
        invalidate();
        return;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
_L4:
        i1++;
          goto _L9
        i1++;
          goto _L10
    }

    public boolean dispatchTouchEvent(MotionEvent motionevent)
    {
        return n || super.dispatchTouchEvent(motionevent);
    }

    public final void e()
    {
        Rect rect;
        rect = (Rect)v.pop();
        w.push(rect);
        t.push(rect);
        Object obj = E;
        obj;
        JVM INSTR monitorenter ;
        Bitmap bitmap;
        int i1;
        bitmap = Bitmap.createBitmap(rect.width() + 1, rect.height() + 1, android.graphics.Bitmap.Config.ARGB_8888);
        i1 = rect.left;
_L9:
        if (i1 > rect.right) goto _L2; else goto _L1
_L1:
        int j1 = rect.top;
_L5:
        if (j1 > rect.bottom) goto _L4; else goto _L3
_L3:
        bitmap.setPixel(i1 - rect.left, j1 - rect.top, o.getPixel(i1, j1));
        j1++;
          goto _L5
_L2:
        s.push(bitmap);
        bitmap = (Bitmap)u.pop();
        i1 = rect.left;
_L10:
        if (i1 > rect.right) goto _L7; else goto _L6
_L6:
        j1 = rect.top;
_L8:
        if (j1 > rect.bottom)
        {
            break MISSING_BLOCK_LABEL_254;
        }
        o.setPixel(i1, j1, bitmap.getPixel(i1 - rect.left, j1 - rect.top));
        j1++;
          goto _L8
_L7:
        if (bitmap == null)
        {
            break MISSING_BLOCK_LABEL_223;
        }
        if (!bitmap.isRecycled())
        {
            bitmap.recycle();
        }
        g = g + 1;
        obj;
        JVM INSTR monitorexit ;
        invalidate();
        return;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
_L4:
        i1++;
          goto _L9
        i1++;
          goto _L10
    }

    public final int f()
    {
        return g;
    }

    public final boolean g()
    {
        return D == null || D.a();
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        Iterator iterator = s.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Bitmap bitmap = (Bitmap)iterator.next();
            if (bitmap != null && !bitmap.isRecycled())
            {
                bitmap.recycle();
            }
        } while (true);
        t.clear();
        iterator = u.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Bitmap bitmap1 = (Bitmap)iterator.next();
            if (bitmap1 != null && !bitmap1.isRecycled())
            {
                bitmap1.recycle();
            }
        } while (true);
        u.clear();
        t.clear();
        v.clear();
        w.clear();
        if (D != null)
        {
            D.cancel(true);
            D = null;
        }
    }

    protected void onDraw(Canvas canvas)
    {
        canvas.setDrawFilter(F);
        if (k)
        {
            super.onDraw(canvas);
        } else
        if (o != null && !o.isRecycled())
        {
            canvas.drawBitmap(o, p, null);
            return;
        }
    }

    public boolean onLongClick(View view)
    {
        if (n)
        {
            return true;
        } else
        {
            j = true;
            a(h, i);
            return true;
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        boolean flag = true;
        motionevent.getActionMasked();
        JVM INSTR tableswitch 0 5: default 44
    //                   0 50
    //                   1 107
    //                   2 69
    //                   3 44
    //                   4 44
    //                   5 442;
           goto _L1 _L2 _L3 _L4 _L1 _L1 _L5
_L1:
        return super.onTouchEvent(motionevent);
_L2:
        h = motionevent.getX();
        i = motionevent.getY();
        continue; /* Loop/switch isn't completed */
_L4:
        h = motionevent.getX();
        i = motionevent.getY();
        if (j)
        {
            a(h, i);
        }
        continue; /* Loop/switch isn't completed */
_L3:
        j = false;
        if (!l)
        {
            float f1 = motionevent.getX();
            float f2 = motionevent.getY();
            c(false);
            cancelLongPress();
            float af[] = new float[2];
            q.mapPoints(af, new float[] {
                f1, f2
            });
            f1 = (float)b / a(b);
            c = (int)(af[0] - f1);
            d = (int)(af[0] + f1);
            e = (int)(af[1] - f1);
            f = (int)(af[1] + f1);
            if (d >= o.getWidth() || f >= o.getHeight() || c < 0 || e < 0)
            {
                flag = false;
            }
            if (flag && (D == null || D.a()))
            {
                synchronized (E)
                {
                    a(o, new Rect(c, e, d, f));
                    Rect rect = new Rect();
                    rect.left = c;
                    rect.top = e;
                    rect.right = d;
                    rect.bottom = f;
                    D = new k(this, (byte)0);
                    D.execute(new Object[] {
                        o, rect
                    });
                    g = g + 1;
                }
            }
        }
        l = false;
        continue; /* Loop/switch isn't completed */
        motionevent;
        obj;
        JVM INSTR monitorexit ;
        throw motionevent;
_L5:
        l = true;
        cancelLongPress();
        if (j)
        {
            j = false;
            c(false);
        }
        if (true) goto _L1; else goto _L6
_L6:
    }

    public void setImageBitmap(Bitmap bitmap)
    {
        super.setImageBitmap(bitmap);
        o = bitmap.copy(android.graphics.Bitmap.Config.ARGB_8888, true);
        p = getImageMatrix();
        p.invert(q);
        y.a(o);
        A.a();
    }

    public void setImageMatrix(Matrix matrix)
    {
        super.setImageMatrix(matrix);
        p = matrix;
        p.invert(q);
        y.b(a(b));
        matrix = new StringBuilder("ImageToScreen scale: ");
        p.getValues(H);
        Log.i("BlemishImageView", matrix.append(H[0]).append(" dst: ").append(a(b)).toString());
    }
}
