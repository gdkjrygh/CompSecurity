// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.textinput;

import android.content.Context;
import android.graphics.AvoidXfermode;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.google.android.apps.unveil.env.af;
import com.google.android.apps.unveil.env.e;
import com.google.android.apps.unveil.env.j;
import com.google.android.apps.unveil.env.k;
import com.google.android.apps.unveil.env.p;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.apps.unveil.textinput:
//            ak, j, k

public class SmudgeView extends View
    implements ak
{

    private static final af b = new af();
    private static final float c[] = {
        0.3F, 0.15F, 0.15F, 0.0F, 0.0F, 0.15F, 0.3F, 0.15F, 0.0F, 0.0F, 
        0.15F, 0.15F, 0.3F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F
    };
    private static final float d[] = {
        0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 
        0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1F, 100F
    };
    private List A;
    private Float B;
    private boolean C;
    private boolean D;
    private boolean E;
    private boolean F;
    private boolean G;
    private boolean H;
    private long I;
    private final Matrix J;
    private final Matrix K;
    private final float L[];
    private final float M[];
    private final AccessibilityManager N;
    private boolean O;
    final Path a;
    private final Paint e;
    private final Paint f;
    private final Paint g;
    private final Paint h;
    private final Paint i;
    private final Paint j;
    private com.google.android.apps.unveil.textinput.j k;
    private j l;
    private Canvas m;
    private boolean n;
    private final Rect o;
    private final RectF p;
    private final Rect q;
    private long r;
    private Bitmap s;
    private volatile boolean t;
    private j u;
    private final float v;
    private final float w;
    private final float x;
    private Path y;
    private List z;

    public SmudgeView(Context context)
    {
        this(context, null);
    }

    public SmudgeView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public SmudgeView(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        o = new Rect();
        p = new RectF();
        q = new Rect();
        z = new ArrayList();
        A = new ArrayList();
        C = true;
        D = true;
        E = true;
        F = true;
        G = true;
        H = true;
        J = new Matrix();
        K = new Matrix();
        L = new float[2];
        M = new float[3];
        a = new Path();
        setFocusable(true);
        setBackgroundColor(0);
        e = new Paint();
        e.setAntiAlias(true);
        e.setColor(0xff000000);
        j = new Paint(e);
        j.setStyle(android.graphics.Paint.Style.STROKE);
        j.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        f = new Paint();
        f.setColorFilter(new ColorMatrixColorFilter(c));
        g = new Paint();
        g.setXfermode(new AvoidXfermode(0xff000000, 0, android.graphics.AvoidXfermode.Mode.TARGET));
        g.setXfermode(new PorterDuffXfermode(android.graphics.PorterDuff.Mode.SRC_ATOP));
        h = new Paint();
        h.setXfermode(new PorterDuffXfermode(android.graphics.PorterDuff.Mode.SRC_OVER));
        i = new Paint();
        i.setColorFilter(new ColorMatrixColorFilter(d));
        v = com.google.android.apps.unveil.env.p.a(10000F, context);
        w = com.google.android.apps.unveil.env.p.a(50F, context);
        x = com.google.android.apps.unveil.env.p.a(5F, context);
        N = (AccessibilityManager)context.getSystemService("accessibility");
        a(0.6F);
    }

    private void a(float f1)
    {
        if (getAlphaValue() * 255F == 255F * f1)
        {
            return;
        } else
        {
            int i1 = (int)(255F * f1);
            e.setAlpha(i1);
            f.setAlpha(i1);
            g.setAlpha(i1);
            h.setAlpha(i1);
            j.setAlpha(i1);
            return;
        }
    }

    private float[] a(int i1, int j1, float f1)
    {
        L[0] = i1;
        L[1] = j1;
        J.mapPoints(L);
        f1 = J.mapRadius(f1);
        M[0] = L[0];
        M[1] = L[1];
        M[2] = f1;
        return M;
    }

    private void b()
    {
        int i1 = z.size();
        if (i1 == 0)
        {
            return;
        }
        i1--;
        int j1 = Math.max(i1 - 1, 0);
        Point point = (Point)z.get(i1);
        Point point1 = new Point((Point)z.get(j1));
        if (com.google.android.apps.unveil.env.e.a(point1, point) < 1.0F)
        {
            point1.offset(1, 1);
        }
        a.reset();
        a.moveTo(point1.x, point1.y);
        a.lineTo(point.x, point.y);
        float f1 = ((Float)A.get(i1)).floatValue();
        f1 = ((((Float)A.get(j1)).floatValue() + f1) / 2.0F) * 0.75F;
        j.setStrokeWidth(f1);
        m.drawPath(a, j);
        f1 /= 2.0F;
        p.set((float)Math.min(point1.x, point.x) - f1, (float)Math.min(point1.y, point.y) - f1, (float)Math.max(point1.x, point.x) + f1, (float)Math.max(point1.y, point.y) + f1);
        p.roundOut(q);
        o.union(q);
    }

    private void b(int i1, int j1, float f1)
    {
        this;
        JVM INSTR monitorenter ;
        float af1[] = a(i1, j1, Math.max(w, f1));
        int k1;
        j1 = (int)af1[0];
        k1 = (int)af1[1];
        f1 = af1[2];
        z.add(new Point(j1, k1));
        A.add(Float.valueOf(f1));
        if (y != null) goto _L2; else goto _L1
_L1:
        y = new Path();
        y.moveTo(j1, k1);
        B = Float.valueOf(f1);
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        Point point;
        Point point1;
        boolean flag;
        point = (Point)z.get(z.size() - 2);
        point1 = (Point)z.get(0);
        flag = C;
        Exception exception;
        if ((float)point.x >= (float)j1 - x)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        C = i1 & flag;
        flag = D;
        if ((float)point.x <= (float)j1 + x)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        D = i1 & flag;
        flag = E;
        if ((float)point.y >= (float)k1 - x)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        E = i1 & flag;
        flag = F;
        if ((float)point.y <= (float)k1 + x)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        F = i1 & flag;
        if ((float)((point1.x - j1) * (point1.x - j1) + (point1.y - k1) * (point1.y - k1)) >= v)
        {
            if (j1 != point1.x)
            {
                break; /* Loop/switch isn't completed */
            }
            G = false;
            H = true;
        }
_L5:
        y.lineTo(j1, k1);
        if (true) goto _L4; else goto _L3
        exception;
        throw exception;
_L3:
        f1 = k1;
        f1 = Math.abs((f1 - (float)point1.y) / (float)(j1 - point1.x));
        flag = G;
        if (f1 < 0.25F)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        G = i1 & flag;
        flag = H;
        if (f1 > 4F)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        H = i1 & flag;
          goto _L5
    }

    private Path c(int i1, int j1, float f1)
    {
        this;
        JVM INSTR monitorenter ;
        float af1[] = a(i1, j1, Math.max(w, f1));
        i1 = (int)af1[0];
        j1 = (int)af1[1];
        f1 = af1[2];
        Path path = y;
        if (!com.google.android.apps.unveil.env.e.a((Point)z.get(0), (B.floatValue() * 0.75F) / 2.0F, new Point(i1, j1), (f1 * 0.75F) / 2.0F)) goto _L2; else goto _L1
_L1:
        path.close();
_L4:
        this;
        JVM INSTR monitorexit ;
        return path;
_L2:
        path = null;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    private boolean c()
    {
        return G && (C || D) || H && (E || F);
    }

    public final void a()
    {
        m.drawColor(0, android.graphics.PorterDuff.Mode.CLEAR);
        postInvalidate();
    }

    public final void a(Matrix matrix)
    {
        matrix.invert(J);
        K.set(matrix);
    }

    public float getAlphaValue()
    {
        return (float)j.getAlpha() / 255F;
    }

    public void invalidate()
    {
        r = SystemClock.uptimeMillis();
        if (O)
        {
            o.set(0, 0, getWidth(), getHeight());
        }
        super.invalidate();
    }

    public void invalidate(int i1, int j1, int k1, int l1)
    {
        if (O)
        {
            o.union(i1, j1, k1, l1);
            super.invalidate(o.left, o.top, o.right, o.bottom);
            return;
        } else
        {
            super.invalidate(i1, j1, k1, l1);
            return;
        }
    }

    public void invalidate(Rect rect)
    {
        if (O)
        {
            o.union(rect);
            rect.set(o);
        }
        super.invalidate(rect);
    }

    protected void onDraw(Canvas canvas)
    {
        if (l == null)
        {
            return;
        }
        if (t)
        {
            a(1.0F);
            Rect rect;
            if (O)
            {
                q.set(o);
            } else
            {
                canvas.getClipBounds(q);
            }
            rect = q;
            rect.left = rect.left - 1;
            rect = q;
            rect.top = rect.top - 1;
            rect = q;
            rect.right = rect.right + 1;
            rect = q;
            rect.bottom = rect.bottom + 1;
            q.intersect(0, 0, getWidth(), getHeight());
            m.drawBitmap(s, q, q, g);
            canvas.drawBitmap(s, q, q, f);
            canvas.drawBitmap(l.c(), q, q, h);
            o.setEmpty();
            return;
        } else
        {
            canvas.drawBitmap(l.c(), 0.0F, 0.0F, i);
            return;
        }
    }

    public boolean onHoverEvent(MotionEvent motionevent)
    {
        byte byte0;
        byte0 = 0;
        if (android.os.Build.VERSION.SDK_INT < 14)
        {
            break MISSING_BLOCK_LABEL_109;
        }
        if (!N.isTouchExplorationEnabled() || motionevent.getSource() != 4098) goto _L2; else goto _L1
_L1:
        motionevent.getAction();
        JVM INSTR tableswitch 7 10: default 64
    //                   7 93
    //                   8 64
    //                   9 66
    //                   10 98;
           goto _L3 _L4 _L3 _L5 _L6
_L5:
        break; /* Loop/switch isn't completed */
_L3:
        byte0 = -1;
_L7:
        if (byte0 != -1)
        {
            motionevent = MotionEvent.obtain(motionevent);
            motionevent.setAction(byte0);
            onTouchEvent(motionevent);
            motionevent.recycle();
            return true;
        }
        break; /* Loop/switch isn't completed */
_L4:
        byte0 = 2;
        continue; /* Loop/switch isn't completed */
_L6:
        byte0 = 1;
        if (true) goto _L7; else goto _L2
_L2:
        return super.onHoverEvent(motionevent);
        return false;
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        super.onLayout(flag, i1, j1, k1, l1);
    }

    protected void onSizeChanged(int i1, int j1, int k1, int l1)
    {
        if (l != null)
        {
            l = null;
        }
        if (u != null)
        {
            u = null;
        }
        if (i1 > 0 && j1 > 0)
        {
            Bitmap bitmap = Bitmap.createBitmap(i1, j1, android.graphics.Bitmap.Config.ARGB_8888);
            m = new Canvas(bitmap);
            m.drawColor(0xff000000);
            s = bitmap.copy(bitmap.getConfig(), true);
            u = com.google.android.apps.unveil.env.k.a(s, 0);
            l = com.google.android.apps.unveil.env.k.a(bitmap, 0);
            if (android.os.Build.VERSION.SDK_INT > 19)
            {
                O = false;
                return;
            }
            if (android.os.Build.VERSION.SDK_INT >= 11 && isHardwareAccelerated())
            {
                O = true;
                setLayerType(2, null);
                return;
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        int l1 = 0;
        if (n) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        int k1;
        int i2;
        boolean flag;
        long l2 = System.currentTimeMillis();
        if ((float)(l2 - I) < 1000F)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        I = l2;
        i2 = motionevent.getActionMasked();
        if (i2 == 0 || i2 == 2 || i2 == 7)
        {
            if (i2 == 0 && k != null && !flag)
            {
                k.a();
            }
            int j2 = motionevent.getHistorySize();
            i2 = motionevent.getPointerCount();
            for (int i1 = 0; i1 < j2; i1++)
            {
                for (l1 = 0; l1 < i2; l1++)
                {
                    b((int)motionevent.getHistoricalX(l1, i1), (int)motionevent.getHistoricalY(l1, i1), motionevent.getHistoricalTouchMajor(l1, i1));
                    b();
                }

            }

            for (int j1 = 0; j1 < i2; j1++)
            {
                b((int)motionevent.getX(j1), (int)motionevent.getY(j1), motionevent.getTouchMajor(j1));
                b();
            }

            motionevent = o;
            Rect rect = q;
            long l3 = SystemClock.uptimeMillis();
            if (l3 - r < 500L)
            {
                p.set(motionevent);
                K.mapRect(p);
                p.roundOut(rect);
            } else
            {
                rect.set(0, 0, getWidth(), getHeight());
                r = l3;
            }
            invalidate(q);
            if (k != null)
            {
                k.a(new com.google.android.apps.unveil.textinput.k(l, c(), flag, z), q);
            }
            return true;
        }
        k1 = l1;
        if (i2 == 1)
        {
            break; /* Loop/switch isn't completed */
        }
        if (i2 != 3) goto _L1; else goto _L3
_L3:
        for (k1 = l1; k1 < motionevent.getPointerCount(); k1++)
        {
            b((int)motionevent.getX(k1), (int)motionevent.getY(k1), motionevent.getTouchMajor(k1));
            b();
        }

        motionevent = c((int)motionevent.getX(), (int)motionevent.getY(), motionevent.getTouchMajor());
        if (motionevent != null)
        {
            if (l != null)
            {
                m.drawPath(motionevent, e);
                if (t)
                {
                    m.drawBitmap(s, 0.0F, 0.0F, g);
                }
            }
            invalidate();
        }
        invalidate();
        if (k != null && i2 != 3)
        {
            k.a(new com.google.android.apps.unveil.textinput.k(l, c(), flag, z));
        }
        y = null;
        B = null;
        z = new ArrayList();
        A = new ArrayList();
        C = true;
        D = true;
        E = true;
        F = true;
        G = true;
        H = true;
        if (i2 == 3)
        {
            a();
        }
        return true;
    }

    protected void onVisibilityChanged(View view, int i1)
    {
        super.onVisibilityChanged(view, i1);
        if (i1 == 0)
        {
            invalidate();
        }
    }

    public void setAcceptSmudges(boolean flag)
    {
        n = flag;
    }

    public void setImageToDisplay(Bitmap bitmap, Matrix matrix)
    {
        if (bitmap == null)
        {
            t = false;
        } else
        {
            Canvas canvas = new Canvas(s);
            if (matrix != null)
            {
                canvas.drawBitmap(bitmap, matrix, null);
            } else
            {
                canvas.drawBitmap(bitmap, null, new Rect(0, 0, s.getWidth(), s.getHeight()), null);
            }
            t = true;
        }
        postInvalidate();
    }

    public void setListener(com.google.android.apps.unveil.textinput.j j1)
    {
        k = j1;
    }

}
