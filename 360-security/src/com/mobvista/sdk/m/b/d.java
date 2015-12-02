// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobvista.sdk.m.b;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.Scroller;

// Referenced classes of package com.mobvista.sdk.m.b:
//            e

public final class d extends ViewGroup
{

    private int a;
    private int b;
    private int c;
    private Scroller d;
    private int e;
    private boolean f;
    private float g;
    private float h;
    private int i;
    private boolean j;
    private VelocityTracker k;
    private int l;
    private e m;

    public d(Context context)
    {
        super(context);
        a = 1;
        c = -1;
        f = true;
        l = 0;
        a();
    }

    private void a()
    {
        d = new Scroller(getContext());
        b = a;
        i = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }

    private int b()
    {
        return b;
    }

    private void b(int i1)
    {
        boolean flag = true;
        if (!d.isFinished())
        {
            return;
        }
        c();
        int j1 = getChildCount();
        if (i1 < 0)
        {
            l = -1;
            return;
        }
        if (i1 > j1 - 1)
        {
            l = 1;
            return;
        }
        l = 0;
        View view;
        if (i1 == b)
        {
            flag = false;
        }
        c = i1;
        view = getFocusedChild();
        if (view != null && flag && view == getChildAt(b))
        {
            view.clearFocus();
        }
        i1 = getWidth() * i1 - getScrollX();
        d.startScroll(getScrollX(), 0, i1, 0, Math.abs(i1) / 2);
        invalidate();
    }

    private void c()
    {
        int j1 = getChildCount();
        for (int i1 = 0; i1 < j1; i1++)
        {
            View view = getChildAt(i1);
            view.setDrawingCacheEnabled(true);
            if (view instanceof ViewGroup)
            {
                ((ViewGroup)view).setAlwaysDrawnWithCacheEnabled(true);
            }
        }

    }

    private void d()
    {
        int j1 = getChildCount();
        for (int i1 = 0; i1 < j1; i1++)
        {
            View view = getChildAt(i1);
            if (view instanceof ViewGroup)
            {
                ((ViewGroup)view).setAlwaysDrawnWithCacheEnabled(false);
            }
        }

    }

    private void e()
    {
        int j1;
        int k1;
        int l1;
        k1 = getWidth();
        l1 = (k1 >> 1) + getScrollX();
        j1 = getChildCount();
        if (l1 >= 0) goto _L2; else goto _L1
_L1:
        int i1 = -1;
_L4:
        b(i1);
        return;
_L2:
        i1 = j1;
        if (l1 <= k1 * j1)
        {
            i1 = (getScrollX() + k1 / 2) / k1;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void a(int i1)
    {
        b = Math.max(0, Math.min(i1, getChildCount() - 1));
        scrollTo(b * getWidth(), 0);
        if (m != null)
        {
            m.a(b);
        }
        invalidate();
    }

    public final void a(e e1)
    {
        m = e1;
    }

    public final void computeScroll()
    {
        if (!d.computeScrollOffset()) goto _L2; else goto _L1
_L1:
        int i1;
        int k1;
        int i2;
        int k2;
        i1 = d.getCurrX();
        k1 = d.getCurrY();
        i2 = getScrollX();
        k2 = getScrollY();
        if (i1 == i2 && k1 == k2) goto _L4; else goto _L3
_L3:
        scrollTo(d.getCurrX(), d.getCurrY());
_L6:
        return;
_L4:
        invalidate();
        return;
_L2:
        if (c != -1)
        {
            b = Math.max(0, Math.min(c, getChildCount() - 1));
            c = -1;
            l = 0;
            d();
            int j1 = getScrollX();
            int l1 = getScrollY();
            int j2 = b * getWidth();
            if (j1 != j2)
            {
                scrollTo(j2, l1);
            }
            if (m != null)
            {
                m.a(b);
                return;
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    protected final void dispatchDraw(Canvas canvas)
    {
        boolean flag1;
        flag1 = false;
        boolean flag;
        if (e != 1 && c == -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag) goto _L2; else goto _L1
_L1:
        drawChild(canvas, getChildAt(b), getDrawingTime());
_L6:
        return;
_L2:
        long l1 = getDrawingTime();
        if (c >= 0 && c < getChildCount() && (Math.abs(b - c) == 1 || l != 0))
        {
            Object obj = getChildAt(b);
            View view = getChildAt(c);
            android.graphics.Bitmap bitmap = view.getDrawingCache();
            drawChild(canvas, ((View) (obj)), l1);
            if (l == 0)
            {
                drawChild(canvas, view, l1);
                return;
            }
            obj = new Paint();
            if (l < 0)
            {
                if (bitmap != null)
                {
                    canvas.drawBitmap(bitmap, -view.getWidth(), view.getTop(), ((Paint) (obj)));
                    return;
                } else
                {
                    canvas.save();
                    canvas.translate(-view.getWidth(), view.getTop());
                    drawChild(canvas, view, l1);
                    canvas.restore();
                    return;
                }
            }
            if (bitmap != null)
            {
                canvas.drawBitmap(bitmap, getWidth() * getChildCount(), view.getTop(), ((Paint) (obj)));
                return;
            } else
            {
                canvas.save();
                canvas.translate(getWidth() * getChildCount(), view.getTop());
                drawChild(canvas, view, l1);
                canvas.restore();
                return;
            }
        }
        Paint paint;
        View view1;
        android.graphics.Bitmap bitmap1;
        int i1;
        int j1;
        try
        {
            j1 = getChildCount();
        }
        // Misplaced declaration of an exception variable
        catch (Canvas canvas)
        {
            return;
        }
        i1 = ((flag1) ? 1 : 0);
        if (i1 >= j1)
        {
            break; /* Loop/switch isn't completed */
        }
        drawChild(canvas, getChildAt(i1), l1);
        i1++;
        if (true) goto _L4; else goto _L3
_L3:
        continue; /* Loop/switch isn't completed */
_L4:
        break MISSING_BLOCK_LABEL_298;
        if (l == 0) goto _L6; else goto _L5
_L5:
        paint = new Paint();
        if (l >= 0)
        {
            break MISSING_BLOCK_LABEL_425;
        }
        view1 = getChildAt(getChildCount() - 1);
        bitmap1 = view1.getDrawingCache();
        if (bitmap1 == null)
        {
            break MISSING_BLOCK_LABEL_391;
        }
        canvas.drawBitmap(bitmap1, -view1.getWidth(), view1.getTop(), paint);
        return;
        canvas.save();
        canvas.translate(-view1.getWidth(), view1.getTop());
        drawChild(canvas, view1, l1);
        canvas.restore();
        return;
        view1 = getChildAt(0);
        bitmap1 = view1.getDrawingCache();
        if (bitmap1 == null)
        {
            break MISSING_BLOCK_LABEL_465;
        }
        canvas.drawBitmap(bitmap1, getWidth() * getChildCount(), view1.getTop(), paint);
        return;
        canvas.save();
        canvas.translate(getWidth() * getChildCount(), view1.getTop());
        drawChild(canvas, view1, l1);
        canvas.restore();
        return;
    }

    public final boolean dispatchUnhandledMove(View view, int i1)
    {
        if (i1 == 17)
        {
            if (b() > 0)
            {
                b(b() - 1);
                return true;
            }
        } else
        if (i1 == 66 && b() < getChildCount() - 1)
        {
            b(b() + 1);
            return true;
        }
        return super.dispatchUnhandledMove(view, i1);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        int i1 = motionevent.getAction();
        if (i1 != 2 || e == 0) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        float f1;
        float f2;
        f1 = motionevent.getX();
        f2 = motionevent.getY();
        i1;
        JVM INSTR tableswitch 0 3: default 64
    //                   0 185
    //                   1 228
    //                   2 73
    //                   3 228;
           goto _L3 _L4 _L5 _L6 _L5
_L5:
        break MISSING_BLOCK_LABEL_228;
_L3:
        break; /* Loop/switch isn't completed */
_L6:
        break; /* Loop/switch isn't completed */
_L8:
        if (e == 0)
        {
            return false;
        }
        if (true) goto _L1; else goto _L7
_L7:
        int j1 = (int)Math.abs(f1 - g);
        int l1 = (int)Math.abs(f2 - h);
        int i2 = i;
        boolean flag;
        if (j1 > i2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (l1 > i2)
        {
            l1 = 1;
        } else
        {
            l1 = 0;
        }
        if (flag || l1)
        {
            if (flag)
            {
                e = 1;
                c();
            }
            if (j)
            {
                j = false;
                getChildAt(b).cancelLongPress();
            }
        }
          goto _L8
_L4:
        g = f1;
        h = f2;
        j = true;
        int k1;
        if (d.isFinished())
        {
            k1 = 0;
        } else
        {
            k1 = 1;
        }
        e = k1;
          goto _L8
        e = 0;
        j = false;
          goto _L8
    }

    protected final void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        l1 = getChildCount();
        i1 = 0;
        for (j1 = 0; i1 < l1; j1 = k1)
        {
            View view = getChildAt(i1);
            k1 = j1;
            if (view.getVisibility() != 8)
            {
                k1 = view.getMeasuredWidth();
                view.layout(j1, 0, j1 + k1, view.getMeasuredHeight());
                k1 = j1 + k1;
            }
            i1++;
        }

    }

    protected final void onMeasure(int i1, int j1)
    {
        super.onMeasure(i1, j1);
        int l1 = android.view.View.MeasureSpec.getSize(i1);
        int i2 = getChildCount();
        for (int k1 = 0; k1 < i2; k1++)
        {
            getChildAt(k1).measure(i1, j1);
        }

        if (f)
        {
            scrollTo(b * l1, 0);
            f = false;
        }
    }

    protected final boolean onRequestFocusInDescendants(int i1, Rect rect)
    {
        int j1;
        if (c != -1)
        {
            j1 = c;
        } else
        {
            j1 = b;
        }
        getChildAt(j1).requestFocus(i1, rect);
        return false;
    }

    public final boolean onTouchEvent(MotionEvent motionevent)
    {
        float f1;
        int i1;
        if (k == null)
        {
            k = VelocityTracker.obtain();
        }
        k.addMovement(motionevent);
        i1 = motionevent.getAction();
        f1 = motionevent.getX();
        i1;
        JVM INSTR tableswitch 0 3: default 64
    //                   0 66
    //                   1 199
    //                   2 90
    //                   3 302;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        return true;
_L2:
        if (!d.isFinished())
        {
            d.abortAnimation();
        }
        g = f1;
        return true;
_L4:
        e = 1;
        int j1 = (int)(g - f1);
        g = f1;
        if (j1 < 0)
        {
            if (getScrollX() + j1 <= 0)
            {
                l = -1;
                scrollBy(0, 0);
                return true;
            } else
            {
                scrollBy(j1, 0);
                return true;
            }
        }
        if (j1 > 0)
        {
            int i2 = getChildAt(getChildCount() - 1).getRight() - getScrollX() - getWidth();
            if (i2 <= 0)
            {
                l = 1;
            }
            if (i2 > 0)
            {
                scrollBy(Math.min(i2, j1), 0);
                return true;
            }
        }
          goto _L1
_L3:
        motionevent = k;
        k.computeCurrentVelocity(1000);
        int k1 = (int)motionevent.getXVelocity();
        int j2 = (int)motionevent.getYVelocity();
        if (Math.abs(k1) > Math.abs(j2) && k1 > 200)
        {
            b(b - 1);
        } else
        if (Math.abs(k1) > Math.abs(j2) && k1 < -200)
        {
            b(b + 1);
        } else
        {
            e();
        }
        e = 0;
        return true;
_L5:
        motionevent = k;
        k.computeCurrentVelocity(1000);
        int l1 = (int)motionevent.getXVelocity();
        int k2 = (int)motionevent.getYVelocity();
        if (Math.abs(l1) > Math.abs(k2) && l1 > 200)
        {
            b(b - 1);
        } else
        if (Math.abs(l1) > Math.abs(k2) && l1 < -200)
        {
            b(b + 1);
        } else
        {
            e();
        }
        e = 0;
        return true;
    }
}
