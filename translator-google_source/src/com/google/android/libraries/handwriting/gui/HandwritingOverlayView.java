// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.handwriting.gui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.RelativeLayout;
import com.google.android.libraries.handwriting.base.Stroke;
import com.google.android.libraries.handwriting.base.StrokeList;
import java.util.Iterator;
import java.util.ListIterator;

// Referenced classes of package com.google.android.libraries.handwriting.gui:
//            f, h, z, g, 
//            y

public class HandwritingOverlayView extends RelativeLayout
{

    private final Context a;
    private int b;
    private int c;
    private int d;
    private final Paint e;
    private final Paint f;
    private final Paint g;
    private final Paint h;
    private final AccessibilityManager i;
    private int j;
    private boolean k;
    private CharSequence l;
    private final Runnable m;
    private Canvas n;
    private Bitmap o;
    private final RectF p;
    private float q;
    private float r;
    private int s;
    private boolean t;
    private int u;
    private final h v;
    private g w;
    private HandwritingOverlayView x;

    public HandwritingOverlayView(Context context)
    {
        this(context, null);
    }

    public HandwritingOverlayView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public HandwritingOverlayView(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        b = -1;
        c = -256;
        d = 0xffff0000;
        e = new Paint();
        f = new Paint();
        g = new Paint();
        h = new Paint();
        m = new f(this);
        p = new RectF();
        t = true;
        u = -1;
        v = new h();
        a = context;
        i = (AccessibilityManager)context.getSystemService("accessibility");
        l = new String();
        context = context.obtainStyledAttributes(attributeset, z.HandwritingOverlayView);
        b = context.getColor(z.HandwritingOverlayView_strokeColor, 0xffff0000);
        c = context.getColor(z.HandwritingOverlayView_strokeColorRecognized, 0xff00ff00);
        d = context.getColor(z.HandwritingOverlayView_strokeColorPreviouslyRecognized, 0xff0000ff);
        context.recycle();
        v.e = getResources().getDisplayMetrics().density / 3F;
        setWillNotDraw(false);
        a(h, b);
        a(e, c);
        a(g, d);
        a(f, b);
        f.setStrokeWidth(1.0F);
        return;
        attributeset;
        context.recycle();
        throw attributeset;
    }

    private void a(float f1, float f2, float f3, float f4, float f5, Paint paint)
    {
        if (o == null)
        {
            b();
        }
        RectF rectf = p;
        Canvas canvas = n;
        rectf.set(Math.min(f1, f3), Math.min(f2, f4), Math.max(f1, f3), Math.max(f2, f4));
        rectf.inset(-v.c, -v.c);
        h h1 = v;
        f5 = h1.a(f5);
        float f6 = h1.b;
        paint.setStrokeWidth((h1.d * (f5 * f5) + f6) * 2.0F);
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setStrokeJoin(android.graphics.Paint.Join.ROUND);
        canvas.clipRect(rectf, android.graphics.Region.Op.REPLACE);
        canvas.drawLine(f3, f4, f1, f2, paint);
        invalidate((int)rectf.left, (int)rectf.top, (int)rectf.right + 1, (int)rectf.bottom + 1);
    }

    private void a(float f1, float f2, float f3, Paint paint)
    {
        if (o == null)
        {
            b();
        }
        RectF rectf = p;
        rectf.set(f1, f2, f1, f2);
        v.a = -1F;
        rectf.inset(-v.c, -v.c);
        n.clipRect(rectf, android.graphics.Region.Op.REPLACE);
        paint.setStyle(android.graphics.Paint.Style.FILL);
        n.drawCircle(f1, f2, v.b(f3), paint);
        invalidate((int)rectf.left, (int)rectf.top, (int)rectf.right + 1, (int)rectf.bottom + 1);
    }

    private void a(float f1, float f2, long l1, float f3, int i1)
    {
        if (Math.abs(f1 - q) <= 3F && Math.abs(f2 - r) <= 3F && s == i1)
        {
            return;
        }
        a(f1, f2, q, r, f3, h);
        if (w != null)
        {
            w.b(f1, f2, l1, f3, i1);
        }
        q = f1;
        r = f2;
        s = i1;
    }

    private void a(Paint paint, int i1)
    {
        paint.setAntiAlias(true);
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        paint.setStrokeJoin(android.graphics.Paint.Join.ROUND);
        paint.setColor(i1);
        h h1 = v;
        float f1 = h1.b;
        paint.setStrokeWidth((h1.c + f1) / 2.0F);
        paint.setXfermode(new PorterDuffXfermode(android.graphics.PorterDuff.Mode.SRC));
    }

    private void a(Stroke stroke, float f1, float f2, Paint paint)
    {
        float f5 = 0.0F;
        stroke = stroke.iterator();
        float f3;
        float f4;
        if (stroke.hasNext())
        {
            com.google.android.libraries.handwriting.base.Stroke.Point point = (com.google.android.libraries.handwriting.base.Stroke.Point)stroke.next();
            f3 = point.a + f1;
            f4 = point.b + f2;
            f5 = point.d;
            a(f3, f4, f5, paint);
        } else
        {
            f4 = 0.0F;
            f3 = 0.0F;
        }
        while (stroke.hasNext()) 
        {
            com.google.android.libraries.handwriting.base.Stroke.Point point1 = (com.google.android.libraries.handwriting.base.Stroke.Point)stroke.next();
            float f6 = point1.a + f1;
            float f7 = point1.b + f2;
            f5 = point1.d;
            if (f6 != f3 || f7 != f4)
            {
                a(f6, f7, f3, f4, f5, paint);
            }
            f4 = f7;
            f3 = f6;
        }
        b(f3, f4, f5, paint);
    }

    private void a(boolean flag)
    {
        if (l.length() == 0 && getContentDescription() != null)
        {
            l = getContentDescription();
        }
        Object obj;
        if (!flag)
        {
            obj = l;
        } else
        {
            obj = "";
        }
        setContentDescription(((CharSequence) (obj)));
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            obj = getResources();
            int i1;
            if (flag)
            {
                i1 = y.announce_handwriting_enabled;
            } else
            {
                i1 = y.announce_handwriting_disabled;
            }
            announceForAccessibility(((Resources) (obj)).getString(i1));
        }
        k = flag;
    }

    private boolean a(MotionEvent motionevent)
    {
        int i1;
        int k1;
        boolean flag;
        flag = true;
        i1 = 0;
        k1 = motionevent.getActionMasked();
        k1;
        JVM INSTR tableswitch 0 6: default 56
    //                   0 62
    //                   1 308
    //                   2 153
    //                   3 308
    //                   4 56
    //                   5 56
    //                   6 344;
           goto _L1 _L2 _L3 _L4 _L3 _L1 _L1 _L5
_L1:
        flag = false;
_L7:
        return flag;
_L2:
        float f1 = motionevent.getX();
        float f2 = motionevent.getY();
        long l2 = motionevent.getEventTime();
        float f3 = motionevent.getPressure();
        i1 = motionevent.getButtonState();
        a(f1, f2, f3, h);
        if (w != null)
        {
            w.a(f1, f2, l2, f3, i1);
        }
        q = f1;
        r = f2;
        s = i1;
        u = motionevent.getPointerId(0);
        return true;
_L4:
        if (u == -1)
        {
            return false;
        }
        k1 = motionevent.getHistorySize();
        int l1 = motionevent.findPointerIndex(u);
        if (l1 == -1)
        {
            i1 = u;
            (new StringBuilder(49)).append("Invalid pointer index for pointer id: ").append(i1);
            return true;
        }
        if (t && k1 > 0)
        {
            for (; i1 < k1; i1++)
            {
                a(motionevent.getHistoricalX(l1, i1), motionevent.getHistoricalY(l1, i1), motionevent.getHistoricalEventTime(i1), motionevent.getHistoricalPressure(i1), motionevent.getButtonState());
            }

        }
        a(motionevent.getX(l1), motionevent.getY(l1), motionevent.getEventTime(), motionevent.getPressure(), motionevent.getButtonState());
        return true;
_L3:
        if (u == -1)
        {
            return false;
        } else
        {
            b(motionevent.getX(), motionevent.getY(), motionevent.getEventTime(), motionevent.getPressure(), motionevent.getButtonState());
            return true;
        }
_L5:
        int j1 = k1 >> 8;
        if (motionevent.getPointerId(j1) == u)
        {
            b(motionevent.getX(j1), motionevent.getY(j1), motionevent.getEventTime(), motionevent.getPressure(), motionevent.getButtonState());
            u = -1;
            return true;
        }
        if (true) goto _L7; else goto _L6
_L6:
    }

    static boolean a(HandwritingOverlayView handwritingoverlayview)
    {
        return handwritingoverlayview.k;
    }

    private void b()
    {
        int i1 = Math.max(getHeight(), 1);
        int j1 = Math.max(getWidth(), 1);
        if (o == null || o.getWidth() != j1 || o.getHeight() != i1)
        {
            o = Bitmap.createBitmap(j1, i1, android.graphics.Bitmap.Config.ARGB_8888);
            n = new Canvas(o);
        }
    }

    private void b(float f1, float f2, float f3, Paint paint)
    {
        if (o == null)
        {
            b();
        }
        RectF rectf = p;
        Canvas canvas = n;
        rectf.set(f1, f2, f1, f2);
        rectf.inset(-v.c, -v.c);
        paint.setStyle(android.graphics.Paint.Style.FILL);
        canvas.drawCircle(f1, f2, v.b(f3), paint);
        invalidate((int)rectf.left, (int)rectf.top, (int)rectf.right + 1, (int)rectf.bottom + 1);
    }

    private void b(float f1, float f2, long l1, float f3, int i1)
    {
        if (f1 != q && f2 != r)
        {
            a(f1, f2, q, r, f3, h);
        }
        b(f1, f2, f3, h);
        if (w != null)
        {
            w.c(f1, f2, l1, f3, i1);
        }
        q = f1;
        r = f2;
        s = i1;
    }

    static void b(HandwritingOverlayView handwritingoverlayview)
    {
        handwritingoverlayview.a(false);
    }

    public final void a()
    {
        b();
        n.clipRect(0.0F, 0.0F, n.getWidth(), n.getHeight(), android.graphics.Region.Op.REPLACE);
        n.drawColor(0, android.graphics.PorterDuff.Mode.CLEAR);
        if (x != null && x != this)
        {
            x.a();
        }
        invalidate();
    }

    public final void a(StrokeList strokelist, float f1, float f2, Paint paint)
    {
        paint = new Paint(paint);
        if (strokelist != null && !strokelist.isEmpty())
        {
            v.a = -1F;
            strokelist = strokelist.listIterator();
            while (strokelist.hasNext()) 
            {
                a((Stroke)strokelist.next(), f1, f2, paint);
            }
        }
    }

    public final void a(StrokeList strokelist, boolean flag)
    {
        Paint paint;
        if (flag)
        {
            paint = e;
        } else
        {
            paint = h;
        }
        a(strokelist, 0.0F, 0.0F, paint);
    }

    protected boolean dispatchHoverEvent(MotionEvent motionevent)
    {
        boolean flag;
        flag = false;
        if (android.os.Build.VERSION.SDK_INT < 14)
        {
            return false;
        }
        if (!i.isTouchExplorationEnabled() || motionevent.getSource() != 4098 || !k || x == this)
        {
            return super.dispatchHoverEvent(motionevent);
        }
        motionevent.getAction();
        JVM INSTR tableswitch 7 10: default 88
    //                   7 178
    //                   8 88
    //                   9 94
    //                   10 192;
           goto _L1 _L2 _L1 _L3 _L4
_L1:
        return super.dispatchHoverEvent(motionevent);
_L3:
        int i1;
        removeCallbacks(m);
        i1 = ((flag) ? 1 : 0);
        if (j > 3)
        {
            break; /* Loop/switch isn't completed */
        }
        i1 = ((flag) ? 1 : 0);
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            announceForAccessibility(getResources().getString(y.announce_handwriting_recording));
            j = j + 1;
            i1 = ((flag) ? 1 : 0);
        }
_L6:
        MotionEvent motionevent1 = MotionEvent.obtain(motionevent);
        motionevent1.setAction(i1);
        a(motionevent1);
        motionevent1.recycle();
        return super.dispatchHoverEvent(motionevent);
_L2:
        removeCallbacks(m);
        i1 = 2;
        continue; /* Loop/switch isn't completed */
_L4:
        removeCallbacks(m);
        postDelayed(m, 4000L);
        i1 = 1;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public boolean dispatchTouchEvent(MotionEvent motionevent)
    {
        boolean flag = true;
        if (!isEnabled())
        {
            flag = super.dispatchTouchEvent(motionevent);
        } else
        if (i.isTouchExplorationEnabled() && x != this)
        {
            if (!k)
            {
                a(true);
                j = 0;
                return true;
            }
        } else
        {
            a(motionevent);
            motionevent.setAction(3);
            super.dispatchTouchEvent(motionevent);
            return true;
        }
        return flag;
    }

    public HandwritingOverlayView getAnimationLayer()
    {
        if (x == null)
        {
            return this;
        } else
        {
            return x;
        }
    }

    Paint getRecoQueueStrokePaint()
    {
        return f;
    }

    public Paint getStrokePaint()
    {
        return h;
    }

    public Paint getStrokePreviouslyRecognizedPaint()
    {
        return g;
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        o = null;
        n = null;
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        if (o == null)
        {
            b();
        }
        canvas.drawBitmap(o, 0.0F, 0.0F, null);
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        Context context = a;
        int i1 = context.getResources().getIdentifier("animation_layer_view", "id", context.getPackageName());
        if (i1 != 0)
        {
            x = (HandwritingOverlayView)findViewById(i1);
            return;
        } else
        {
            x = null;
            return;
        }
    }

    protected void onSizeChanged(int i1, int j1, int k1, int l1)
    {
        super.onSizeChanged(i1, j1, k1, l1);
        (new StringBuilder(62)).append("onSizeChanged: ").append(i1).append(" ").append(j1).append(" ").append(k1).append(" ").append(l1);
        b();
        if (w != null)
        {
            w.a(i1, j1);
        }
    }

    protected void onWindowVisibilityChanged(int i1)
    {
        if (i.isTouchExplorationEnabled() && x != this)
        {
            boolean flag;
            if (i1 == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            a(flag);
        }
        super.onWindowVisibilityChanged(i1);
    }

    public void setHandwritingOverlayListener(g g1)
    {
        w = g1;
    }

    public void setMaxStrokeWidth(float f1)
    {
        h h1 = v;
        h1.c = h1.e * f1;
        h1.d = h1.c - h1.b;
        if (x != null && x != this)
        {
            x.setMaxStrokeWidth(f1);
        }
    }

    public void setMinStrokeWidth(float f1)
    {
        h h1 = v;
        h1.b = h1.e * f1;
        h1.d = h1.c - h1.b;
        if (x != null && x != this)
        {
            x.setMinStrokeWidth(f1);
        }
    }

    public void setPendingStrokeColor(int i1)
    {
        h.setColor(i1);
    }

    public void setRecoQueueStrokeColor(int i1)
    {
        f.setColor(i1);
    }

    public void setRecognizedStrokeColor(int i1)
    {
        e.setColor(i1);
    }

    public void setStrokePreviouslyRecognizedColor(int i1)
    {
        g.setColor(i1);
    }
}
