// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Parcelable;
import android.support.v4.view.ay;
import android.support.v4.view.be;
import android.support.v4.view.bf;
import android.support.v4.view.bg;
import android.support.v4.view.bh;
import android.support.v4.view.bl;
import android.support.v4.view.bp;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import java.util.List;

// Referenced classes of package android.support.v4.widget:
//            y, ae, af, m

public final class NestedScrollView extends FrameLayout
    implements be, bg
{

    private static final y v = new y();
    private static final int w[] = {
        0x101017a
    };
    private long a;
    private final Rect b;
    private ae c;
    private m d;
    private m e;
    private int f;
    private boolean g;
    private boolean h;
    private View i;
    private boolean j;
    private VelocityTracker k;
    private boolean l;
    private boolean m;
    private int n;
    private int o;
    private int p;
    private int q;
    private final int r[];
    private final int s[];
    private int t;
    private SavedState u;
    private final bh x;
    private final bf y;
    private float z;

    private int a(Rect rect)
    {
        if (getChildCount() == 0)
        {
            return 0;
        }
        int l1 = getHeight();
        int i1 = getScrollY();
        int k1 = i1 + l1;
        int i2 = getVerticalFadingEdgeLength();
        int j1 = i1;
        if (rect.top > 0)
        {
            j1 = i1 + i2;
        }
        i1 = k1;
        if (rect.bottom < getChildAt(0).getHeight())
        {
            i1 = k1 - i2;
        }
        if (rect.bottom > i1 && rect.top > j1)
        {
            if (rect.height() > l1)
            {
                j1 = (rect.top - j1) + 0;
            } else
            {
                j1 = (rect.bottom - i1) + 0;
            }
            i1 = Math.min(j1, getChildAt(0).getBottom() - i1);
        } else
        if (rect.top < j1 && rect.bottom < i1)
        {
            if (rect.height() > l1)
            {
                i1 = 0 - (i1 - rect.bottom);
            } else
            {
                i1 = 0 - (j1 - rect.top);
            }
            i1 = Math.max(i1, -getScrollY());
        } else
        {
            i1 = 0;
        }
        return i1;
    }

    static int a(NestedScrollView nestedscrollview)
    {
        return nestedscrollview.c();
    }

    private void a()
    {
        if (k == null)
        {
            k = VelocityTracker.obtain();
        }
    }

    private void a(int i1, int j1)
    {
        if (getChildCount() == 0)
        {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - a > 250L)
        {
            i1 = getHeight();
            int k1 = getPaddingBottom();
            int l1 = getPaddingTop();
            k1 = Math.max(0, getChildAt(0).getHeight() - (i1 - k1 - l1));
            i1 = getScrollY();
            j1 = Math.max(0, Math.min(i1 + j1, k1));
            ae ae1 = c;
            k1 = getScrollX();
            ae1.b.a(ae1.a, k1, i1, j1 - i1);
            bp.d(this);
        } else
        {
            if (!c.a())
            {
                c.h();
            }
            scrollBy(i1, j1);
        }
        a = AnimationUtils.currentAnimationTimeMillis();
    }

    private void a(MotionEvent motionevent)
    {
        int i1 = (motionevent.getAction() & 0xff00) >> 8;
        if (ay.b(motionevent, i1) == q)
        {
            if (i1 == 0)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            f = (int)ay.d(motionevent, i1);
            q = ay.b(motionevent, i1);
            if (k != null)
            {
                k.clear();
            }
        }
    }

    private boolean a(int i1, int j1, int k1)
    {
        int l1 = getHeight();
        int k2 = getScrollY();
        int l2 = k2 + l1;
        View view;
        java.util.ArrayList arraylist;
        boolean flag;
        boolean flag2;
        int i2;
        int i3;
        if (i1 == 33)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        arraylist = getFocusables(2);
        view = null;
        flag = false;
        i3 = arraylist.size();
        i2 = 0;
        while (i2 < i3) 
        {
            View view1 = (View)arraylist.get(i2);
            int j2 = view1.getTop();
            int j3 = view1.getBottom();
            if (j1 < j3 && j2 < k1)
            {
                boolean flag1;
                if (j1 < j2 && j3 < k1)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                if (view == null)
                {
                    view = view1;
                    flag = flag1;
                } else
                {
                    boolean flag3;
                    if (flag2 && j2 < view.getTop() || !flag2 && j3 > view.getBottom())
                    {
                        flag3 = true;
                    } else
                    {
                        flag3 = false;
                    }
                    if (flag)
                    {
                        if (flag1 && flag3)
                        {
                            view = view1;
                        }
                    } else
                    if (flag1)
                    {
                        view = view1;
                        flag = true;
                    } else
                    if (flag3)
                    {
                        view = view1;
                    }
                }
            }
            i2++;
        }
        Object obj = view;
        if (view == null)
        {
            obj = this;
        }
        boolean flag4;
        if (j1 >= k2 && k1 <= l2)
        {
            flag4 = false;
        } else
        {
            if (flag2)
            {
                j1 -= k2;
            } else
            {
                j1 = k1 - l2;
            }
            d(j1);
            flag4 = true;
        }
        if (obj != findFocus())
        {
            ((View) (obj)).requestFocus(i1);
        }
        return flag4;
    }

    private boolean a(int i1, int j1, int k1, int l1, int i2)
    {
label0:
        {
            boolean flag2 = false;
            bp.a(this);
            computeHorizontalScrollRange();
            computeHorizontalScrollExtent();
            computeVerticalScrollRange();
            computeVerticalScrollExtent();
            i1 = k1 + i1;
            j1 = l1 + j1;
            k1 = i2 + 0;
            boolean flag;
            boolean flag1;
            if (i1 > 0)
            {
                flag = true;
                i1 = 0;
            } else
            if (i1 < 0)
            {
                flag = true;
                i1 = 0;
            } else
            {
                flag = false;
            }
            if (j1 > k1)
            {
                j1 = k1;
                flag1 = true;
            } else
            if (j1 < 0)
            {
                flag1 = true;
                j1 = 0;
            } else
            {
                flag1 = false;
            }
            onOverScrolled(i1, j1, flag, flag1);
            if (!flag)
            {
                flag = flag2;
                if (!flag1)
                {
                    break label0;
                }
            }
            flag = true;
        }
        return flag;
    }

    private boolean a(View view)
    {
        boolean flag = false;
        if (!a(view, 0, getHeight()))
        {
            flag = true;
        }
        return flag;
    }

    private boolean a(View view, int i1, int j1)
    {
        view.getDrawingRect(b);
        offsetDescendantRectToMyCoords(view, b);
        return b.bottom + i1 >= getScrollY() && b.top - i1 <= getScrollY() + j1;
    }

    private static boolean a(View view, View view1)
    {
        if (view == view1)
        {
            return true;
        }
        view = view.getParent();
        return (view instanceof ViewGroup) && a((View)view, view1);
    }

    private static int b(int i1, int j1, int k1)
    {
        int l1;
        if (j1 >= k1 || i1 < 0)
        {
            l1 = 0;
        } else
        {
            l1 = i1;
            if (j1 + i1 > k1)
            {
                return k1 - j1;
            }
        }
        return l1;
    }

    private void b()
    {
        if (k != null)
        {
            k.recycle();
            k = null;
        }
    }

    private void b(View view)
    {
        view.getDrawingRect(b);
        offsetDescendantRectToMyCoords(view, b);
        int i1 = a(b);
        if (i1 != 0)
        {
            scrollBy(0, i1);
        }
    }

    private boolean b(int i1)
    {
        int j1;
        int k1;
        if (i1 == 130)
        {
            j1 = 1;
        } else
        {
            j1 = 0;
        }
        k1 = getHeight();
        b.top = 0;
        b.bottom = k1;
        if (j1 != 0)
        {
            j1 = getChildCount();
            if (j1 > 0)
            {
                View view = getChildAt(j1 - 1);
                b.bottom = view.getBottom() + getPaddingBottom();
                b.top = b.bottom - k1;
            }
        }
        return a(i1, b.top, b.bottom);
    }

    private int c()
    {
        int i1 = 0;
        if (getChildCount() > 0)
        {
            i1 = Math.max(0, getChildAt(0).getHeight() - (getHeight() - getPaddingBottom() - getPaddingTop()));
        }
        return i1;
    }

    private boolean c(int i1)
    {
        View view;
        View view1;
        int k1;
        view1 = findFocus();
        view = view1;
        if (view1 == this)
        {
            view = null;
        }
        view1 = FocusFinder.getInstance().findNextFocus(this, view, i1);
        k1 = (int)(0.5F * (float)getHeight());
        if (view1 == null || !a(view1, k1, getHeight())) goto _L2; else goto _L1
_L1:
        view1.getDrawingRect(b);
        offsetDescendantRectToMyCoords(view1, b);
        d(a(b));
        view1.requestFocus(i1);
_L8:
        if (view != null && view.isFocused() && a(view))
        {
            i1 = getDescendantFocusability();
            setDescendantFocusability(0x20000);
            requestFocus();
            setDescendantFocusability(i1);
        }
        return true;
_L2:
        if (i1 != 33 || getScrollY() >= k1) goto _L4; else goto _L3
_L3:
        int j1 = getScrollY();
_L6:
        if (j1 == 0)
        {
            return false;
        }
        break; /* Loop/switch isn't completed */
_L4:
        j1 = k1;
        if (i1 == 130)
        {
            j1 = k1;
            if (getChildCount() > 0)
            {
                int l1 = getChildAt(0).getBottom();
                int i2 = (getScrollY() + getHeight()) - getPaddingBottom();
                j1 = k1;
                if (l1 - i2 < k1)
                {
                    j1 = l1 - i2;
                }
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
        if (i1 != 130)
        {
            j1 = -j1;
        }
        d(j1);
        if (true) goto _L8; else goto _L7
_L7:
    }

    private void d()
    {
        j = false;
        b();
        if (d != null)
        {
            d.c();
            e.c();
        }
    }

    private void d(int i1)
    {
label0:
        {
            if (i1 != 0)
            {
                if (!m)
                {
                    break label0;
                }
                a(0, i1);
            }
            return;
        }
        scrollBy(0, i1);
    }

    private void e()
    {
        if (bp.a(this) != 2)
        {
            if (d == null)
            {
                Context context = getContext();
                d = new m(context);
                e = new m(context);
            }
            return;
        } else
        {
            d = null;
            e = null;
            return;
        }
    }

    private void e(int i1)
    {
        int j1 = getScrollY();
        boolean flag;
        if ((j1 > 0 || i1 > 0) && (j1 < c() || i1 < 0))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!dispatchNestedPreFling(0.0F, i1))
        {
            dispatchNestedFling(0.0F, i1, flag);
            if (flag && getChildCount() > 0)
            {
                int i2 = getHeight() - getPaddingBottom() - getPaddingTop();
                int j2 = getChildAt(0).getHeight();
                ae ae1 = c;
                int k1 = getScrollX();
                int l1 = getScrollY();
                j2 = Math.max(0, j2 - i2);
                i2 /= 2;
                ae1.b.b(ae1.a, k1, l1, i1, j2, i2);
                bp.d(this);
            }
        }
    }

    public final void a(int i1)
    {
        a(0 - getScrollX(), i1 - getScrollY());
    }

    public final void addView(View view)
    {
        if (getChildCount() > 0)
        {
            throw new IllegalStateException("ScrollView can host only one direct child");
        } else
        {
            super.addView(view);
            return;
        }
    }

    public final void addView(View view, int i1)
    {
        if (getChildCount() > 0)
        {
            throw new IllegalStateException("ScrollView can host only one direct child");
        } else
        {
            super.addView(view, i1);
            return;
        }
    }

    public final void addView(View view, int i1, android.view.ViewGroup.LayoutParams layoutparams)
    {
        if (getChildCount() > 0)
        {
            throw new IllegalStateException("ScrollView can host only one direct child");
        } else
        {
            super.addView(view, i1, layoutparams);
            return;
        }
    }

    public final void addView(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        if (getChildCount() > 0)
        {
            throw new IllegalStateException("ScrollView can host only one direct child");
        } else
        {
            super.addView(view, layoutparams);
            return;
        }
    }

    public final void computeScroll()
    {
        if (c.g())
        {
            int j1 = getScrollX();
            int k1 = getScrollY();
            int l1 = c.b();
            int i2 = c.c();
            if (j1 != l1 || k1 != i2)
            {
                int j2 = c();
                int i1 = bp.a(this);
                boolean flag;
                if (i1 == 0 || i1 == 1 && j2 > 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                a(l1 - j1, i2 - k1, j1, k1, j2);
                if (flag)
                {
                    e();
                    if (i2 <= 0 && k1 > 0)
                    {
                        d.a((int)c.f());
                    } else
                    if (i2 >= j2 && k1 < j2)
                    {
                        e.a((int)c.f());
                        return;
                    }
                }
            }
        }
    }

    protected final int computeVerticalScrollOffset()
    {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    protected final int computeVerticalScrollRange()
    {
        int j1 = getChildCount();
        int i1 = getHeight() - getPaddingBottom() - getPaddingTop();
        if (j1 != 0)
        {
            int k1 = getChildAt(0).getBottom();
            int l1 = getScrollY();
            int i2 = Math.max(0, k1 - i1);
            if (l1 < 0)
            {
                return k1 - l1;
            }
            i1 = k1;
            if (l1 > i2)
            {
                return k1 + (l1 - i2);
            }
        }
        return i1;
    }

    public final boolean dispatchKeyEvent(KeyEvent keyevent)
    {
        boolean flag2 = false;
        if (super.dispatchKeyEvent(keyevent)) goto _L2; else goto _L1
_L1:
        boolean flag1;
        b.setEmpty();
        View view = getChildAt(0);
        boolean flag;
        if (view != null)
        {
            int i1 = view.getHeight();
            if (getHeight() < i1 + getPaddingTop() + getPaddingBottom())
            {
                flag = true;
            } else
            {
                flag = false;
            }
        } else
        {
            flag = false;
        }
        if (flag) goto _L4; else goto _L3
_L3:
        if (isFocused() && keyevent.getKeyCode() != 4)
        {
            view = findFocus();
            keyevent = view;
            if (view == this)
            {
                keyevent = null;
            }
            keyevent = FocusFinder.getInstance().findNextFocus(this, keyevent, 130);
            if (keyevent != null && keyevent != this && keyevent.requestFocus(130))
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
        } else
        {
            flag1 = false;
        }
_L12:
        if (!flag1) goto _L5; else goto _L2
_L2:
        flag2 = true;
_L5:
        return flag2;
_L4:
        if (keyevent.getAction() != 0) goto _L7; else goto _L6
_L6:
        keyevent.getKeyCode();
        JVM INSTR lookupswitch 3: default 200
    //                   19: 206
    //                   20: 235
    //                   62: 266;
           goto _L8 _L9 _L10 _L11
_L8:
        break; /* Loop/switch isn't completed */
_L11:
        break MISSING_BLOCK_LABEL_266;
_L7:
        flag1 = false;
          goto _L12
_L9:
        if (!keyevent.isAltPressed())
        {
            flag1 = c(33);
        } else
        {
            flag1 = b(33);
        }
          goto _L12
_L10:
        if (!keyevent.isAltPressed())
        {
            flag1 = c(130);
        } else
        {
            flag1 = b(130);
        }
          goto _L12
        char c1;
        int j1;
        int k1;
        if (keyevent.isShiftPressed())
        {
            c1 = '!';
        } else
        {
            c1 = '\202';
        }
        if (c1 == 130)
        {
            j1 = 1;
        } else
        {
            j1 = 0;
        }
        k1 = getHeight();
        if (j1 != 0)
        {
            b.top = getScrollY() + k1;
            j1 = getChildCount();
            if (j1 > 0)
            {
                keyevent = getChildAt(j1 - 1);
                if (b.top + k1 > keyevent.getBottom())
                {
                    b.top = keyevent.getBottom() - k1;
                }
            }
        } else
        {
            b.top = getScrollY() - k1;
            if (b.top < 0)
            {
                b.top = 0;
            }
        }
        b.bottom = k1 + b.top;
        a(c1, b.top, b.bottom);
          goto _L7
    }

    public final boolean dispatchNestedFling(float f1, float f2, boolean flag)
    {
        return y.a(f1, f2, flag);
    }

    public final boolean dispatchNestedPreFling(float f1, float f2)
    {
        return y.a(f1, f2);
    }

    public final boolean dispatchNestedPreScroll(int i1, int j1, int ai[], int ai1[])
    {
        return y.a(i1, j1, ai, ai1);
    }

    public final boolean dispatchNestedScroll(int i1, int j1, int k1, int l1, int ai[])
    {
        return y.a(i1, j1, k1, l1, ai);
    }

    public final void draw(Canvas canvas)
    {
        super.draw(canvas);
        if (d != null)
        {
            int i1 = getScrollY();
            if (!d.a())
            {
                int j1 = canvas.save();
                int l1 = getWidth();
                int j2 = getPaddingLeft();
                int l2 = getPaddingRight();
                canvas.translate(getPaddingLeft(), Math.min(0, i1));
                d.a(l1 - j2 - l2, getHeight());
                if (d.a(canvas))
                {
                    bp.d(this);
                }
                canvas.restoreToCount(j1);
            }
            if (!e.a())
            {
                int k1 = canvas.save();
                int i2 = getWidth() - getPaddingLeft() - getPaddingRight();
                int k2 = getHeight();
                canvas.translate(-i2 + getPaddingLeft(), Math.max(c(), i1) + k2);
                canvas.rotate(180F, i2, 0.0F);
                e.a(i2, k2);
                if (e.a(canvas))
                {
                    bp.d(this);
                }
                canvas.restoreToCount(k1);
            }
        }
    }

    protected final float getBottomFadingEdgeStrength()
    {
        if (getChildCount() == 0)
        {
            return 0.0F;
        }
        int i1 = getVerticalFadingEdgeLength();
        int j1 = getHeight();
        int k1 = getPaddingBottom();
        j1 = getChildAt(0).getBottom() - getScrollY() - (j1 - k1);
        if (j1 < i1)
        {
            return (float)j1 / (float)i1;
        } else
        {
            return 1.0F;
        }
    }

    public final int getNestedScrollAxes()
    {
        return x.a();
    }

    protected final float getTopFadingEdgeStrength()
    {
        if (getChildCount() == 0)
        {
            return 0.0F;
        }
        int i1 = getVerticalFadingEdgeLength();
        int j1 = getScrollY();
        if (j1 < i1)
        {
            return (float)j1 / (float)i1;
        } else
        {
            return 1.0F;
        }
    }

    public final boolean hasNestedScrollingParent()
    {
        return y.b();
    }

    public final boolean isNestedScrollingEnabled()
    {
        return y.a();
    }

    protected final void measureChild(View view, int i1, int j1)
    {
        android.view.ViewGroup.LayoutParams layoutparams = view.getLayoutParams();
        view.measure(getChildMeasureSpec(i1, getPaddingLeft() + getPaddingRight(), layoutparams.width), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    protected final void measureChildWithMargins(View view, int i1, int j1, int k1, int l1)
    {
        android.view.ViewGroup.MarginLayoutParams marginlayoutparams = (android.view.ViewGroup.MarginLayoutParams)view.getLayoutParams();
        i1 = getChildMeasureSpec(i1, getPaddingLeft() + getPaddingRight() + marginlayoutparams.leftMargin + marginlayoutparams.rightMargin + j1, marginlayoutparams.width);
        j1 = marginlayoutparams.topMargin;
        view.measure(i1, android.view.View.MeasureSpec.makeMeasureSpec(marginlayoutparams.bottomMargin + j1, 0));
    }

    public final void onAttachedToWindow()
    {
        h = false;
    }

    public final boolean onGenericMotionEvent(MotionEvent motionevent)
    {
        if ((ay.d(motionevent) & 2) == 0) goto _L2; else goto _L1
_L1:
        motionevent.getAction();
        JVM INSTR tableswitch 8 8: default 32
    //                   8 34;
           goto _L2 _L3
_L2:
        return false;
_L3:
        int i1;
        int j1;
        int k1;
        int l1;
        float f1;
        if (j || (f1 = ay.e(motionevent, 9)) == 0.0F)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (z == 0.0F)
        {
            motionevent = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(0x101004d, motionevent, true))
            {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            z = motionevent.getDimension(context.getResources().getDisplayMetrics());
        }
        i1 = (int)(f1 * z);
        j1 = c();
        l1 = getScrollY();
        k1 = l1 - i1;
        if (k1 >= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        i1 = 0;
_L5:
        if (i1 != l1)
        {
            super.scrollTo(getScrollX(), i1);
            return true;
        }
        if (true) goto _L2; else goto _L4
_L4:
        i1 = j1;
        if (k1 <= j1)
        {
            i1 = k1;
        }
          goto _L5
        if (true) goto _L2; else goto _L6
_L6:
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        int i1;
        boolean flag1;
        flag1 = true;
        i1 = motionevent.getAction();
        if (i1 == 2 && j)
        {
            return true;
        }
        if (getScrollY() == 0 && !bp.b(this, 1))
        {
            return false;
        }
        i1 & 0xff;
        JVM INSTR tableswitch 0 6: default 88
    //                   0 228
    //                   1 406
    //                   2 93
    //                   3 406
    //                   4 88
    //                   5 88
    //                   6 427;
           goto _L1 _L2 _L3 _L4 _L3 _L1 _L1 _L5
_L1:
        return j;
_L4:
        int j1 = q;
        if (j1 != -1)
        {
            int i2 = ay.a(motionevent, j1);
            if (i2 == -1)
            {
                Log.e("NestedScrollView", (new StringBuilder("Invalid pointerId=")).append(j1).append(" in onInterceptTouchEvent").toString());
            } else
            {
                int k1 = (int)ay.d(motionevent, i2);
                if (Math.abs(k1 - f) > n && (getNestedScrollAxes() & 2) == 0)
                {
                    j = true;
                    f = k1;
                    a();
                    k.addMovement(motionevent);
                    t = 0;
                    motionevent = getParent();
                    if (motionevent != null)
                    {
                        motionevent.requestDisallowInterceptTouchEvent(true);
                    }
                }
            }
        }
        continue; /* Loop/switch isn't completed */
_L2:
        int j2 = (int)motionevent.getY();
        int l1 = (int)motionevent.getX();
        boolean flag;
        if (getChildCount() > 0)
        {
            int k2 = getScrollY();
            View view = getChildAt(0);
            if (j2 >= view.getTop() - k2 && j2 < view.getBottom() - k2 && l1 >= view.getLeft() && l1 < view.getRight())
            {
                flag = true;
            } else
            {
                flag = false;
            }
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            j = false;
            b();
        } else
        {
            f = j2;
            q = ay.b(motionevent, 0);
            if (k == null)
            {
                k = VelocityTracker.obtain();
            } else
            {
                k.clear();
            }
            k.addMovement(motionevent);
            if (c.a())
            {
                flag1 = false;
            }
            j = flag1;
            startNestedScroll(2);
        }
        continue; /* Loop/switch isn't completed */
_L3:
        j = false;
        q = -1;
        b();
        stopNestedScroll();
        continue; /* Loop/switch isn't completed */
_L5:
        a(motionevent);
        if (true) goto _L1; else goto _L6
_L6:
    }

    protected final void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        super.onLayout(flag, i1, j1, k1, l1);
        g = false;
        if (i != null && a(i, this))
        {
            b(i);
        }
        i = null;
        if (h) goto _L2; else goto _L1
_L1:
        if (u != null)
        {
            scrollTo(getScrollX(), u.a);
            u = null;
        }
        if (getChildCount() > 0)
        {
            i1 = getChildAt(0).getMeasuredHeight();
        } else
        {
            i1 = 0;
        }
        i1 = Math.max(0, i1 - (l1 - j1 - getPaddingBottom() - getPaddingTop()));
        if (getScrollY() <= i1) goto _L4; else goto _L3
_L3:
        scrollTo(getScrollX(), i1);
_L2:
        scrollTo(getScrollX(), getScrollY());
        h = true;
        return;
_L4:
        if (getScrollY() < 0)
        {
            scrollTo(getScrollX(), 0);
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    protected final void onMeasure(int i1, int j1)
    {
        super.onMeasure(i1, j1);
        break MISSING_BLOCK_LABEL_6;
        if (l && android.view.View.MeasureSpec.getMode(j1) != 0 && getChildCount() > 0)
        {
            View view = getChildAt(0);
            j1 = getMeasuredHeight();
            if (view.getMeasuredHeight() < j1)
            {
                android.widget.FrameLayout.LayoutParams layoutparams = (android.widget.FrameLayout.LayoutParams)view.getLayoutParams();
                view.measure(getChildMeasureSpec(i1, getPaddingLeft() + getPaddingRight(), layoutparams.width), android.view.View.MeasureSpec.makeMeasureSpec(j1 - getPaddingTop() - getPaddingBottom(), 0x40000000));
                return;
            }
        }
        return;
    }

    public final boolean onNestedFling(View view, float f1, float f2, boolean flag)
    {
        if (!flag)
        {
            e((int)f2);
            return true;
        } else
        {
            return false;
        }
    }

    public final boolean onNestedPreFling(View view, float f1, float f2)
    {
        return false;
    }

    public final void onNestedPreScroll(View view, int i1, int j1, int ai[])
    {
    }

    public final void onNestedScroll(View view, int i1, int j1, int k1, int l1)
    {
        i1 = getScrollY();
        scrollBy(0, l1);
        i1 = getScrollY() - i1;
        dispatchNestedScroll(0, i1, 0, l1 - i1, null);
    }

    public final void onNestedScrollAccepted(View view, View view1, int i1)
    {
        x.a(i1);
        startNestedScroll(2);
    }

    protected final void onOverScrolled(int i1, int j1, boolean flag, boolean flag1)
    {
        super.scrollTo(i1, j1);
    }

    protected final boolean onRequestFocusInDescendants(int i1, Rect rect)
    {
        View view;
        int j1;
        if (i1 == 2)
        {
            j1 = 130;
        } else
        {
            j1 = i1;
            if (i1 == 1)
            {
                j1 = 33;
            }
        }
        if (rect == null)
        {
            view = FocusFinder.getInstance().findNextFocus(this, null, j1);
        } else
        {
            view = FocusFinder.getInstance().findNextFocusFromRect(this, rect, j1);
        }
        if (view == null || a(view))
        {
            return false;
        } else
        {
            return view.requestFocus(j1, rect);
        }
    }

    protected final void onRestoreInstanceState(Parcelable parcelable)
    {
        parcelable = (SavedState)parcelable;
        super.onRestoreInstanceState(parcelable.getSuperState());
        u = parcelable;
        requestLayout();
    }

    protected final Parcelable onSaveInstanceState()
    {
        SavedState savedstate = new SavedState(super.onSaveInstanceState());
        savedstate.a = getScrollY();
        return savedstate;
    }

    protected final void onSizeChanged(int i1, int j1, int k1, int l1)
    {
        super.onSizeChanged(i1, j1, k1, l1);
        View view;
        for (view = findFocus(); view == null || this == view || !a(view, 0, l1);)
        {
            return;
        }

        view.getDrawingRect(b);
        offsetDescendantRectToMyCoords(view, b);
        d(a(b));
    }

    public final boolean onStartNestedScroll(View view, View view1, int i1)
    {
        return (i1 & 2) != 0;
    }

    public final void onStopNestedScroll(View view)
    {
        stopNestedScroll();
    }

    public final boolean onTouchEvent(MotionEvent motionevent)
    {
        MotionEvent motionevent1;
        int i1;
        a();
        motionevent1 = MotionEvent.obtain(motionevent);
        i1 = ay.a(motionevent);
        if (i1 == 0)
        {
            t = 0;
        }
        motionevent1.offsetLocation(0.0F, t);
        i1;
        JVM INSTR tableswitch 0 6: default 80
    //                   0 101
    //                   1 725
    //                   2 200
    //                   3 791
    //                   4 80
    //                   5 817
    //                   6 847;
           goto _L1 _L2 _L3 _L4 _L5 _L1 _L6 _L7
_L1:
        if (k != null)
        {
            k.addMovement(motionevent1);
        }
        motionevent1.recycle();
        return true;
_L2:
        if (getChildCount() == 0)
        {
            return false;
        }
        boolean flag;
        if (!c.a())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        j = flag;
        if (flag)
        {
            ViewParent viewparent = getParent();
            if (viewparent != null)
            {
                viewparent.requestDisallowInterceptTouchEvent(true);
            }
        }
        if (!c.a())
        {
            c.h();
        }
        f = (int)motionevent.getY();
        q = ay.b(motionevent, 0);
        startNestedScroll(2);
        continue; /* Loop/switch isn't completed */
_L4:
        int l1;
        int i2;
        int j2;
        i2 = ay.a(motionevent, q);
        if (i2 == -1)
        {
            Log.e("NestedScrollView", (new StringBuilder("Invalid pointerId=")).append(q).append(" in onTouchEvent").toString());
            continue; /* Loop/switch isn't completed */
        }
        j2 = (int)ay.d(motionevent, i2);
        l1 = f - j2;
        i1 = l1;
        if (dispatchNestedPreScroll(0, l1, s, r))
        {
            i1 = l1 - s[1];
            motionevent1.offsetLocation(0.0F, r[1]);
            t = t + r[1];
        }
        int k2;
        if (!j && Math.abs(i1) > n)
        {
            ViewParent viewparent1 = getParent();
            if (viewparent1 != null)
            {
                viewparent1.requestDisallowInterceptTouchEvent(true);
            }
            j = true;
            int l2;
            if (i1 > 0)
            {
                i1 -= n;
            } else
            {
                i1 += n;
            }
        }
        if (!j)
        {
            continue; /* Loop/switch isn't completed */
        }
        f = j2 - r[1];
        k2 = getScrollY();
        j2 = c();
        l1 = bp.a(this);
        if (l1 == 0 || l1 == 1 && j2 > 0)
        {
            l1 = 1;
        } else
        {
            l1 = 0;
        }
        if (a(0, i1, 0, getScrollY(), j2) && !hasNestedScrollingParent())
        {
            k.clear();
        }
        l2 = getScrollY() - k2;
        if (dispatchNestedScroll(0, l2, 0, i1 - l2, r))
        {
            f = f - r[1];
            motionevent1.offsetLocation(0.0F, r[1]);
            t = t + r[1];
            continue; /* Loop/switch isn't completed */
        }
        if (!l1)
        {
            continue; /* Loop/switch isn't completed */
        }
        e();
        l1 = k2 + i1;
        if (l1 >= 0) goto _L9; else goto _L8
_L8:
        d.a((float)i1 / (float)getHeight(), ay.c(motionevent, i2) / (float)getWidth());
        if (!e.a())
        {
            e.c();
        }
_L10:
        if (d != null && (!d.a() || !e.a()))
        {
            bp.d(this);
        }
        continue; /* Loop/switch isn't completed */
_L9:
        if (l1 > j2)
        {
            e.a((float)i1 / (float)getHeight(), 1.0F - ay.c(motionevent, i2) / (float)getWidth());
            if (!d.a())
            {
                d.c();
            }
        }
        if (true) goto _L10; else goto _L3
_L3:
        if (j)
        {
            motionevent = k;
            motionevent.computeCurrentVelocity(1000, p);
            int j1 = (int)bl.b(motionevent, q);
            if (Math.abs(j1) > o)
            {
                e(-j1);
            }
            q = -1;
            d();
        }
        continue; /* Loop/switch isn't completed */
_L5:
        if (j && getChildCount() > 0)
        {
            q = -1;
            d();
        }
        continue; /* Loop/switch isn't completed */
_L6:
        int k1 = ay.b(motionevent);
        f = (int)ay.d(motionevent, k1);
        q = ay.b(motionevent, k1);
        continue; /* Loop/switch isn't completed */
_L7:
        a(motionevent);
        f = (int)ay.d(motionevent, ay.a(motionevent, q));
        if (true) goto _L1; else goto _L11
_L11:
    }

    public final void requestChildFocus(View view, View view1)
    {
        if (!g)
        {
            b(view1);
        } else
        {
            i = view1;
        }
        super.requestChildFocus(view, view1);
    }

    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean flag)
    {
        int i1;
        boolean flag1;
label0:
        {
            rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
            i1 = a(rect);
            if (i1 != 0)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (flag1)
            {
                if (!flag)
                {
                    break label0;
                }
                scrollBy(0, i1);
            }
            return flag1;
        }
        a(0, i1);
        return flag1;
    }

    public final void requestDisallowInterceptTouchEvent(boolean flag)
    {
        if (flag)
        {
            b();
        }
        super.requestDisallowInterceptTouchEvent(flag);
    }

    public final void requestLayout()
    {
        g = true;
        super.requestLayout();
    }

    public final void scrollTo(int i1, int j1)
    {
        if (getChildCount() > 0)
        {
            View view = getChildAt(0);
            i1 = b(i1, getWidth() - getPaddingRight() - getPaddingLeft(), view.getWidth());
            j1 = b(j1, getHeight() - getPaddingBottom() - getPaddingTop(), view.getHeight());
            if (i1 != getScrollX() || j1 != getScrollY())
            {
                super.scrollTo(i1, j1);
            }
        }
    }

    public final void setNestedScrollingEnabled(boolean flag)
    {
        y.a(flag);
    }

    public final boolean shouldDelayChildPressedState()
    {
        return true;
    }

    public final boolean startNestedScroll(int i1)
    {
        return y.a(i1);
    }

    public final void stopNestedScroll()
    {
        y.c();
    }


    private class SavedState extends android.view.View.BaseSavedState
    {

        public static final android.os.Parcelable.Creator CREATOR = new z();
        public int a;

        public String toString()
        {
            return (new StringBuilder("HorizontalScrollView.SavedState{")).append(Integer.toHexString(System.identityHashCode(this))).append(" scrollPosition=").append(a).append("}").toString();
        }

        public void writeToParcel(Parcel parcel, int i1)
        {
            super.writeToParcel(parcel, i1);
            parcel.writeInt(a);
        }


        public SavedState(Parcel parcel)
        {
            super(parcel);
            a = parcel.readInt();
        }

        SavedState(Parcelable parcelable)
        {
            super(parcelable);
        }
    }

}
