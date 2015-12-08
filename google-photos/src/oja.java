// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

public final class oja extends ViewGroup
{

    public int a;
    private int b;
    private int c;
    private float d;
    private float e;
    private int f;
    private int g;
    private int h;
    private int i;
    private boolean j;
    private boolean k;
    private boolean l;
    private ojc m;

    private int a(int i1, int j1)
    {
        int k1 = getPaddingTop();
        int l1 = -j1;
        while (h > l1 && i1 >= 0) 
        {
            View view = c(i1);
            if (view == null)
            {
                return 0;
            }
            ojb ojb1 = (ojb)view.getLayoutParams();
            int i2;
            int j2;
            int k2;
            if (view.getParent() != this)
            {
                if (k)
                {
                    addViewInLayout(view, 0, ojb1);
                } else
                {
                    addView(view, 0);
                }
            }
            a(view);
            i2 = view.getMeasuredWidth();
            j2 = view.getMeasuredHeight();
            h = h - j2;
            k2 = h;
            if (ojb1.a)
            {
                j1 = (getMeasuredWidth() - i2) / 2;
            } else
            {
                j1 = 0;
            }
            view.layout(j1, k2, i2 + j1, j2 + k2);
            a = i1;
            i1--;
        }
        return k1 - h;
    }

    private void a(int i1)
    {
        if (i1 != b)
        {
            b = i1;
        }
    }

    private void a(View view)
    {
        ojb ojb1 = (ojb)view.getLayoutParams();
        int i1;
        int j1;
        if (ojb1.width == -2)
        {
            i1 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        } else
        if (ojb1.width == -1)
        {
            i1 = android.view.View.MeasureSpec.makeMeasureSpec(getWidth() - getPaddingLeft() - getPaddingRight(), 0x40000000);
        } else
        {
            i1 = android.view.View.MeasureSpec.makeMeasureSpec(ojb1.width, 0x40000000);
        }
        if (ojb1.height == -2)
        {
            j1 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        } else
        if (ojb1.height == -1)
        {
            j1 = android.view.View.MeasureSpec.makeMeasureSpec(getHeight() - getPaddingTop() - getPaddingBottom(), 0x40000000);
        } else
        {
            j1 = android.view.View.MeasureSpec.makeMeasureSpec(ojb1.height, 0x40000000);
        }
        view.measure(i1, j1);
    }

    private boolean a()
    {
        if (a == 0 && getChildCount() == 0)
        {
            int i1 = getPaddingTop();
            int j1 = getHeight();
            int k1 = getPaddingBottom();
            if (h >= i1 && i <= j1 - k1)
            {
                return true;
            }
        }
        return false;
    }

    private boolean a(int i1, boolean flag)
    {
        int k1;
        int l1;
        int k2;
        boolean flag1;
        int i2;
label0:
        {
            flag1 = a();
            k2 = Math.abs(i1);
            if (flag1)
            {
                break MISSING_BLOCK_LABEL_517;
            }
            l = true;
            l1 = b(a + getChildCount(), k2);
            i2 = a(a - 1, k2);
            int j1;
            int l2;
            if (i1 > 0)
            {
                j1 = 1;
            } else
            {
                j1 = l1;
                if (l1 < 0)
                {
                    j1 = 0;
                }
                i2 = j1;
                j1 = 0;
            }
            l1 = Math.min(i2, k2);
            if (l1 == 0)
            {
                break label0;
            }
            if (j1 != 0)
            {
                j1 = l1;
            } else
            {
                j1 = -l1;
            }
            l2 = getChildCount();
            for (l1 = 0; l1 < l2; l1++)
            {
                View view = getChildAt(l1);
                view.layout(view.getLeft(), view.getTop() + j1, view.getRight(), view.getBottom() + j1);
            }

            h = h + j1;
            i = i + j1;
            l2 = getHeight();
            l1 = getChildCount() - 1;
            if (l1 >= 0 && getChildAt(l1).getTop() > l2)
            {
                if (k)
                {
                    removeViewsInLayout(l1, 1);
                } else
                {
                    removeViewAt(l1);
                }
                throw new NullPointerException();
            }
            if (getChildCount() > 0 && getChildAt(0).getBottom() < 0)
            {
                if (k)
                {
                    removeViewsInLayout(0, 1);
                } else
                {
                    removeViewAt(0);
                }
                throw new NullPointerException();
            }
            g = getChildCount();
            if (g > 0)
            {
                h = 0x7fffffff;
                i = 0x80000000;
                for (l1 = 0; l1 < g; l1++)
                {
                    View view1 = getChildAt(l1);
                    int j3 = view1.getTop();
                    int i3 = view1.getBottom();
                    h = Math.min(h, j3);
                    i = Math.max(i, i3);
                }

                l1 = j1;
                if (h != 0x7fffffff)
                {
                    break label0;
                }
            }
            d(0);
            l1 = j1;
        }
        l = false;
        k1 = k2 - i2;
_L1:
        if (flag)
        {
            int j2 = mk.a(this);
            if ((j2 == 0 || j2 == 1 && !flag1) && k1 > 0)
            {
                k1 = getHeight();
                float f1 = (float)Math.abs(i1) / (float)k1;
                throw new NullPointerException();
            }
        }
        if (l1 != 0)
        {
            b(l1);
        }
        return i1 == 0 || l1 != 0;
        l1 = 0;
        k1 = k2;
          goto _L1
    }

    private int b(int i1, int j1)
    {
        int l1 = getHeight() - getPaddingBottom();
        while (i < l1 + j1 && i1 < 0) 
        {
            View view = c(i1);
            if (view == null)
            {
                return 0;
            }
            ojb ojb1 = (ojb)view.getLayoutParams();
            int k1;
            int i2;
            int j2;
            int k2;
            if (view.getParent() != this)
            {
                if (k)
                {
                    addViewInLayout(view, -1, ojb1);
                } else
                {
                    addView(view);
                }
            }
            a(view);
            i2 = view.getMeasuredWidth();
            j2 = view.getMeasuredHeight();
            k2 = i;
            i = i + j2;
            if (ojb1.a)
            {
                k1 = (getMeasuredWidth() - i2) / 2;
            } else
            {
                k1 = 0;
            }
            view.layout(k1, k2, i2 + k1, j2 + k2);
            i1++;
        }
        return i - l1;
    }

    private static ojb b()
    {
        return new ojb(-2, -2);
    }

    private void b(int i1)
    {
        onScrollChanged(0, 0, 0, 0);
        if (m == null)
        {
            m = new ojc(this);
        }
        if (!m.a)
        {
            m.a = true;
            b.a(m, 100L);
        }
    }

    private View c(int i1)
    {
        throw new NullPointerException();
    }

    private void d(int i1)
    {
        h = getPaddingTop();
        i = h;
    }

    protected final int computeHorizontalScrollExtent()
    {
        int k1 = getChildCount();
        if (k1 > 0)
        {
            int j1 = k1 * 100;
            View view = getChildAt(0);
            int l1 = view.getLeft();
            int i2 = view.getWidth();
            int i1 = j1;
            if (i2 > 0)
            {
                i1 = j1 + (l1 * 100) / i2;
            }
            view = getChildAt(k1 - 1);
            k1 = view.getRight();
            l1 = view.getHeight();
            j1 = i1;
            if (l1 > 0)
            {
                j1 = i1 - ((k1 - getWidth()) * 100) / l1;
            }
            return j1;
        } else
        {
            return 0;
        }
    }

    protected final int computeHorizontalScrollOffset()
    {
        boolean flag = false;
        int j1 = a;
        int k1 = getChildCount();
        int i1 = ((flag) ? 1 : 0);
        if (j1 >= 0)
        {
            i1 = ((flag) ? 1 : 0);
            if (k1 > 0)
            {
                View view = getChildAt(0);
                int l1 = view.getLeft();
                int i2 = view.getWidth();
                i1 = ((flag) ? 1 : 0);
                if (i2 > 0)
                {
                    i1 = Math.max((j1 * 100 - (l1 * 100) / i2) + (int)(((float)getScrollX() / (float)getWidth()) * 0.0F * 100F), 0);
                }
            }
        }
        return i1;
    }

    protected final int computeHorizontalScrollRange()
    {
        int j1 = Math.max(0, 0);
        int i1 = j1;
        if (getScrollX() != 0)
        {
            i1 = j1 + Math.abs((int)(((float)getScrollX() / (float)getWidth()) * 0.0F * 100F));
        }
        return i1;
    }

    public final void computeScroll()
    {
        throw new NullPointerException();
    }

    protected final int computeVerticalScrollExtent()
    {
        int k1 = getChildCount();
        if (k1 > 0)
        {
            int j1 = k1 * 100;
            View view = getChildAt(0);
            int l1 = view.getTop();
            int i2 = view.getHeight();
            int i1 = j1;
            if (i2 > 0)
            {
                i1 = j1 + (l1 * 100) / i2;
            }
            view = getChildAt(k1 - 1);
            k1 = view.getBottom();
            l1 = view.getHeight();
            j1 = i1;
            if (l1 > 0)
            {
                j1 = i1 - ((k1 - getHeight()) * 100) / l1;
            }
            return j1;
        } else
        {
            return 0;
        }
    }

    protected final int computeVerticalScrollOffset()
    {
        boolean flag = false;
        int j1 = a;
        int k1 = getChildCount();
        int i1 = ((flag) ? 1 : 0);
        if (j1 >= 0)
        {
            i1 = ((flag) ? 1 : 0);
            if (k1 > 0)
            {
                View view = getChildAt(0);
                int l1 = view.getTop();
                int i2 = view.getHeight();
                i1 = ((flag) ? 1 : 0);
                if (i2 > 0)
                {
                    i1 = Math.max((j1 * 100 - (l1 * 100) / i2) + (int)(((float)getScrollY() / (float)getHeight()) * 0.0F * 100F), 0);
                }
            }
        }
        return i1;
    }

    protected final int computeVerticalScrollRange()
    {
        int j1 = Math.max(0, 0);
        int i1 = j1;
        if (getScrollY() != 0)
        {
            i1 = j1 + Math.abs((int)(((float)getScrollY() / (float)getHeight()) * 0.0F * 100F));
        }
        return i1;
    }

    public final void draw(Canvas canvas)
    {
        super.draw(canvas);
    }

    protected final android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
    {
        return b();
    }

    public final boolean onGenericMotionEvent(MotionEvent motionevent)
    {
        if (android.os.Build.VERSION.SDK_INT < 12 || a() || (motionevent.getSource() & 2) == 0) goto _L2; else goto _L1
_L1:
        motionevent.getAction();
        JVM INSTR tableswitch 8 8: default 48
    //                   8 54;
           goto _L2 _L3
_L2:
        return super.onGenericMotionEvent(motionevent);
_L3:
        float f1;
        if ((motionevent.getMetaState() & 1) != 0)
        {
            f1 = 0.0F;
        } else
        {
            f1 = motionevent.getAxisValue(9);
        }
        if (f1 != 0.0F)
        {
            if (c == 0)
            {
                c = oiu.a(getContext());
            }
            if (!a((int)(f1 * (float)c), true))
            {
                throw new NullPointerException();
            } else
            {
                awakenScrollBars();
                return true;
            }
        }
        if (true) goto _L2; else goto _L4
_L4:
    }

    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityevent)
    {
        super.onInitializeAccessibilityEvent(accessibilityevent);
        if (accessibilityevent.getEventType() == 4096)
        {
            accessibilityevent.setScrollable(true);
            accessibilityevent.setItemCount(0);
            accessibilityevent.setFromIndex(a);
        }
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilitynodeinfo)
    {
        super.onInitializeAccessibilityNodeInfo(accessibilitynodeinfo);
        accessibilitynodeinfo.setClassName(oja.getCanonicalName());
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        throw new NullPointerException();
    }

    protected final void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        k = true;
        if (getWidth() != 0 && getHeight() != 0)
        {
            i = h;
            l = true;
            k1 = getChildCount();
            i1 = 0;
            while (i1 < k1) 
            {
                View view = getChildAt(i1);
                ojb ojb1 = (ojb)view.getLayoutParams();
                if (view.isLayoutRequested())
                {
                    a(view);
                }
                l1 = view.getMeasuredWidth();
                int j2 = view.getMeasuredHeight();
                int i2 = i;
                i = i + j2;
                if (ojb1.a)
                {
                    j1 = (getMeasuredWidth() - l1) / 2;
                } else
                {
                    j1 = 0;
                }
                view.layout(j1, i2, l1 + j1, j2 + i2);
                i1++;
            }
            b(a + getChildCount(), 0);
            a(a - 1, getPaddingTop());
            l = false;
            j = false;
            i1 = getHeight();
            if (i < i1 && h <= 0)
            {
                i1 -= i;
                j1 = Math.abs(h);
                if (j1 < i1)
                {
                    i1 = Math.min(j1, i1);
                }
                a(i1, false);
            }
            b(0);
        }
        k = false;
        throw new NullPointerException();
    }

    protected final void onSizeChanged(int i1, int j1, int k1, int l1)
    {
    }

    public final boolean onTouchEvent(MotionEvent motionevent)
    {
        throw new NullPointerException();
    }

    public final void requestLayout()
    {
        if (!l)
        {
            super.requestLayout();
        }
    }
}
