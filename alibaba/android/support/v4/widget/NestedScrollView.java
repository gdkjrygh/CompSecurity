// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import cm;
import df;
import dj;
import dk;
import dl;
import dm;
import dq;
import ds;
import er;
import es;
import fb;
import fm;
import ft;
import java.util.List;

public class NestedScrollView extends FrameLayout
    implements dj, dl
{
    static class SavedState extends android.view.View.BaseSavedState
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public SavedState a(Parcel parcel)
            {
                return new SavedState(parcel);
            }

            public SavedState[] a(int i1)
            {
                return new SavedState[i1];
            }

            public Object createFromParcel(Parcel parcel)
            {
                return a(parcel);
            }

            public Object[] newArray(int i1)
            {
                return a(i1);
            }

        };
        public int a;

        public String toString()
        {
            return (new StringBuilder()).append("HorizontalScrollView.SavedState{").append(Integer.toHexString(System.identityHashCode(this))).append(" scrollPosition=").append(a).append("}").toString();
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

    static class a extends cm
    {

        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
        {
            super.onInitializeAccessibilityEvent(view, accessibilityevent);
            view = (NestedScrollView)view;
            accessibilityevent.setClassName(android/widget/ScrollView.getName());
            accessibilityevent = er.a(accessibilityevent);
            boolean flag;
            if (NestedScrollView.a(view) > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            accessibilityevent.a(flag);
            accessibilityevent.d(view.getScrollX());
            accessibilityevent.e(view.getScrollY());
            accessibilityevent.f(view.getScrollX());
            accessibilityevent.g(NestedScrollView.a(view));
        }

        public void onInitializeAccessibilityNodeInfo(View view, es es1)
        {
            super.onInitializeAccessibilityNodeInfo(view, es1);
            view = (NestedScrollView)view;
            es1.b(android/widget/ScrollView.getName());
            if (view.isEnabled())
            {
                int i1 = NestedScrollView.a(view);
                if (i1 > 0)
                {
                    es1.i(true);
                    if (view.getScrollY() > 0)
                    {
                        es1.a(8192);
                    }
                    if (view.getScrollY() < i1)
                    {
                        es1.a(4096);
                    }
                }
            }
        }

        public boolean performAccessibilityAction(View view, int i1, Bundle bundle)
        {
            if (super.performAccessibilityAction(view, i1, bundle))
            {
                return true;
            }
            view = (NestedScrollView)view;
            if (!view.isEnabled())
            {
                return false;
            }
            switch (i1)
            {
            default:
                return false;

            case 4096: 
                i1 = Math.min((view.getHeight() - view.getPaddingBottom() - view.getPaddingTop()) + view.getScrollY(), NestedScrollView.a(view));
                if (i1 != view.getScrollY())
                {
                    view.b(0, i1);
                    return true;
                } else
                {
                    return false;
                }

            case 8192: 
                i1 = view.getHeight();
                int j1 = view.getPaddingBottom();
                int k1 = view.getPaddingTop();
                i1 = Math.max(view.getScrollY() - (i1 - j1 - k1), 0);
                break;
            }
            if (i1 != view.getScrollY())
            {
                view.b(0, i1);
                return true;
            } else
            {
                return false;
            }
        }

        a()
        {
        }
    }


    private static final a v = new a();
    private static final int w[] = {
        0x101017a
    };
    private long a;
    private final Rect b = new Rect();
    private ft c;
    private fm d;
    private fm e;
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
    private final int r[] = new int[2];
    private final int s[] = new int[2];
    private int t;
    private SavedState u;
    private final dm x = new dm(this);
    private final dk y = new dk(this);
    private float z;

    public NestedScrollView(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        g = true;
        h = false;
        i = null;
        j = false;
        m = true;
        q = -1;
        a();
        context = context.obtainStyledAttributes(attributeset, w, i1, 0);
        setFillViewport(context.getBoolean(0, false));
        context.recycle();
        setNestedScrollingEnabled(true);
        ds.a(this, v);
    }

    static int a(NestedScrollView nestedscrollview)
    {
        return nestedscrollview.getScrollRange();
    }

    private View a(boolean flag, int i1, int j1)
    {
        View view1;
        java.util.ArrayList arraylist;
        boolean flag1;
        int k1;
        int i2;
        arraylist = getFocusables(2);
        view1 = null;
        flag1 = false;
        i2 = arraylist.size();
        k1 = 0;
_L2:
        View view;
        boolean flag2;
        int l1;
        if (k1 >= i2)
        {
            break; /* Loop/switch isn't completed */
        }
        view = (View)arraylist.get(k1);
        l1 = view.getTop();
        int j2 = view.getBottom();
        if (i1 >= j2 || l1 >= j1)
        {
            break MISSING_BLOCK_LABEL_192;
        }
        if (i1 < l1 && j2 < j1)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        if (view1 == null)
        {
            flag1 = flag2;
        } else
        {
label0:
            {
                if (flag && l1 < view1.getTop() || !flag && j2 > view1.getBottom())
                {
                    l1 = 1;
                } else
                {
                    l1 = 0;
                }
                if (!flag1)
                {
                    break label0;
                }
                if (!flag2 || !l1)
                {
                    break MISSING_BLOCK_LABEL_192;
                }
            }
        }
_L3:
        k1++;
        view1 = view;
        if (true) goto _L2; else goto _L1
        if (flag2)
        {
            flag1 = true;
        } else
        if (!l1)
        {
            break MISSING_BLOCK_LABEL_192;
        }
          goto _L3
_L1:
        return view1;
        view = view1;
          goto _L3
    }

    private void a()
    {
        c = new ft(getContext(), null);
        setFocusable(true);
        setDescendantFocusability(0x40000);
        setWillNotDraw(false);
        ViewConfiguration viewconfiguration = ViewConfiguration.get(getContext());
        n = viewconfiguration.getScaledTouchSlop();
        o = viewconfiguration.getScaledMinimumFlingVelocity();
        p = viewconfiguration.getScaledMaximumFlingVelocity();
    }

    private void a(MotionEvent motionevent)
    {
        int i1 = (motionevent.getAction() & 0xff00) >> 8;
        if (df.b(motionevent, i1) == q)
        {
            if (i1 == 0)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            f = (int)df.d(motionevent, i1);
            q = df.b(motionevent, i1);
            if (k != null)
            {
                k.clear();
            }
        }
    }

    private boolean a(int i1, int j1, int k1)
    {
        boolean flag1 = false;
        int i2 = getHeight();
        int l1 = getScrollY();
        i2 = l1 + i2;
        Object obj;
        View view;
        boolean flag;
        if (i1 == 33)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        view = a(flag, j1, k1);
        obj = view;
        if (view == null)
        {
            obj = this;
        }
        if (j1 >= l1 && k1 <= i2)
        {
            flag = flag1;
        } else
        {
            if (flag)
            {
                j1 -= l1;
            } else
            {
                j1 = k1 - i2;
            }
            e(j1);
            flag = true;
        }
        if (obj != findFocus())
        {
            ((View) (obj)).requestFocus(i1);
        }
        return flag;
    }

    private boolean a(Rect rect, boolean flag)
    {
        int i1;
        boolean flag1;
label0:
        {
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
        boolean flag;
        if ((view instanceof ViewGroup) && a((View)view, view1))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return flag;
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

    private boolean b()
    {
        boolean flag1 = false;
        View view = getChildAt(0);
        boolean flag = flag1;
        if (view != null)
        {
            int i1 = view.getHeight();
            flag = flag1;
            if (getHeight() < i1 + getPaddingTop() + getPaddingBottom())
            {
                flag = true;
            }
        }
        return flag;
    }

    private void c()
    {
        if (k == null)
        {
            k = VelocityTracker.obtain();
            return;
        } else
        {
            k.clear();
            return;
        }
    }

    private boolean c(int i1, int j1)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (getChildCount() > 0)
        {
            int k1 = getScrollY();
            View view = getChildAt(0);
            flag = flag1;
            if (j1 >= view.getTop() - k1)
            {
                flag = flag1;
                if (j1 < view.getBottom() - k1)
                {
                    flag = flag1;
                    if (i1 >= view.getLeft())
                    {
                        flag = flag1;
                        if (i1 < view.getRight())
                        {
                            flag = true;
                        }
                    }
                }
            }
        }
        return flag;
    }

    private void d()
    {
        if (k == null)
        {
            k = VelocityTracker.obtain();
        }
    }

    private void e()
    {
        if (k != null)
        {
            k.recycle();
            k = null;
        }
    }

    private void e(int i1)
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

    private void f()
    {
        j = false;
        e();
        if (d != null)
        {
            d.c();
            e.c();
        }
    }

    private void f(int i1)
    {
        int j1 = getScrollY();
        boolean flag;
        if ((j1 > 0 || i1 > 0) && (j1 < getScrollRange() || i1 < 0))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!dispatchNestedPreFling(0.0F, i1))
        {
            dispatchNestedFling(0.0F, i1, flag);
            if (flag)
            {
                d(i1);
            }
        }
    }

    private void g()
    {
        if (ds.a(this) != 2)
        {
            if (d == null)
            {
                Context context = getContext();
                d = new fm(context);
                e = new fm(context);
            }
            return;
        } else
        {
            d = null;
            e = null;
            return;
        }
    }

    private int getScrollRange()
    {
        int i1 = 0;
        if (getChildCount() > 0)
        {
            i1 = Math.max(0, getChildAt(0).getHeight() - (getHeight() - getPaddingBottom() - getPaddingTop()));
        }
        return i1;
    }

    private float getVerticalScrollFactorCompat()
    {
        if (z == 0.0F)
        {
            TypedValue typedvalue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(0x101004d, typedvalue, true))
            {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            z = typedvalue.getDimension(context.getResources().getDisplayMetrics());
        }
        return z;
    }

    protected int a(Rect rect)
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

    public final void a(int i1, int j1)
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
            c.a(getScrollX(), i1, 0, j1 - i1);
            ds.d(this);
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

    public boolean a(int i1)
    {
        int k1;
        View view;
        int j1;
        if (i1 == 130)
        {
            j1 = 1;
        } else
        {
            j1 = 0;
        }
        k1 = getHeight();
        if (j1 == 0) goto _L2; else goto _L1
_L1:
        b.top = getScrollY() + k1;
        j1 = getChildCount();
        if (j1 > 0)
        {
            view = getChildAt(j1 - 1);
            if (b.top + k1 > view.getBottom())
            {
                b.top = view.getBottom() - k1;
            }
        }
_L4:
        b.bottom = b.top + k1;
        return a(i1, b.top, b.bottom);
_L2:
        b.top = getScrollY() - k1;
        if (b.top < 0)
        {
            b.top = 0;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    boolean a(int i1, int j1, int k1, int l1, int i2, int j2, int k2, 
            int l2, boolean flag)
    {
        int i3 = ds.a(this);
        boolean flag1;
        boolean flag2;
        boolean flag3;
        if (computeHorizontalScrollRange() > computeHorizontalScrollExtent())
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (computeVerticalScrollRange() > computeVerticalScrollExtent())
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        if (i3 == 0 || i3 == 1 && flag1)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (i3 == 0 || i3 == 1 && flag2)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        i1 = k1 + i1;
        if (!flag1)
        {
            k2 = 0;
        }
        j1 = l1 + j1;
        if (!flag2)
        {
            l2 = 0;
        }
        l1 = -k2;
        k2 += i2;
        k1 = -l2;
        i2 = l2 + j2;
        if (i1 > k2)
        {
            i1 = k2;
            flag = true;
        } else
        if (i1 < l1)
        {
            flag = true;
            i1 = l1;
        } else
        {
            flag = false;
        }
        flag3 = false;
        if (j1 > i2)
        {
            flag3 = true;
            j1 = i2;
        } else
        if (j1 < k1)
        {
            flag3 = true;
            j1 = k1;
        }
        onOverScrolled(i1, j1, flag, flag3);
        return flag || flag3;
    }

    public boolean a(KeyEvent keyevent)
    {
        char c1 = '!';
        boolean flag1 = false;
        b.setEmpty();
        boolean flag;
        if (!b())
        {
            flag = flag1;
            if (isFocused())
            {
                flag = flag1;
                if (keyevent.getKeyCode() != 4)
                {
                    View view = findFocus();
                    keyevent = view;
                    if (view == this)
                    {
                        keyevent = null;
                    }
                    keyevent = FocusFinder.getInstance().findNextFocus(this, keyevent, 130);
                    if (keyevent != null && keyevent != this && keyevent.requestFocus(130))
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                }
            }
        } else
        {
            flag = flag1;
            if (keyevent.getAction() == 0)
            {
                switch (keyevent.getKeyCode())
                {
                default:
                    return false;

                case 19: // '\023'
                    if (!keyevent.isAltPressed())
                    {
                        return c(33);
                    } else
                    {
                        return b(33);
                    }

                case 20: // '\024'
                    if (!keyevent.isAltPressed())
                    {
                        return c(130);
                    } else
                    {
                        return b(130);
                    }

                case 62: // '>'
                    break;
                }
                if (!keyevent.isShiftPressed())
                {
                    c1 = '\202';
                }
                a(c1);
                return false;
            }
        }
        return flag;
    }

    public void addView(View view)
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

    public void addView(View view, int i1)
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

    public void addView(View view, int i1, android.view.ViewGroup.LayoutParams layoutparams)
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

    public void addView(View view, android.view.ViewGroup.LayoutParams layoutparams)
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

    public final void b(int i1, int j1)
    {
        a(i1 - getScrollX(), j1 - getScrollY());
    }

    public boolean b(int i1)
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

    public boolean c(int i1)
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
        k1 = getMaxScrollAmount();
        if (view1 == null || !a(view1, k1, getHeight())) goto _L2; else goto _L1
_L1:
        view1.getDrawingRect(b);
        offsetDescendantRectToMyCoords(view1, b);
        e(a(b));
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
        e(j1);
        if (true) goto _L8; else goto _L7
_L7:
    }

    public void computeScroll()
    {
        if (c.g())
        {
            int j1 = getScrollX();
            int k1 = getScrollY();
            int l1 = c.b();
            int i2 = c.c();
            if (j1 != l1 || k1 != i2)
            {
                int j2 = getScrollRange();
                int i1 = ds.a(this);
                boolean flag;
                if (i1 == 0 || i1 == 1 && j2 > 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                a(l1 - j1, i2 - k1, j1, k1, 0, j2, 0, 0, false);
                if (flag)
                {
                    g();
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

    protected int computeVerticalScrollOffset()
    {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    protected int computeVerticalScrollRange()
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

    public void d(int i1)
    {
        if (getChildCount() > 0)
        {
            int j1 = getHeight() - getPaddingBottom() - getPaddingTop();
            int k1 = getChildAt(0).getHeight();
            c.a(getScrollX(), getScrollY(), 0, i1, 0, 0, 0, Math.max(0, k1 - j1), 0, j1 / 2);
            ds.d(this);
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyevent)
    {
        return super.dispatchKeyEvent(keyevent) || a(keyevent);
    }

    public boolean dispatchNestedFling(float f1, float f2, boolean flag)
    {
        return y.a(f1, f2, flag);
    }

    public boolean dispatchNestedPreFling(float f1, float f2)
    {
        return y.a(f1, f2);
    }

    public boolean dispatchNestedPreScroll(int i1, int j1, int ai[], int ai1[])
    {
        return y.a(i1, j1, ai, ai1);
    }

    public boolean dispatchNestedScroll(int i1, int j1, int k1, int l1, int ai[])
    {
        return y.a(i1, j1, k1, l1, ai);
    }

    public void draw(Canvas canvas)
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
                    ds.d(this);
                }
                canvas.restoreToCount(j1);
            }
            if (!e.a())
            {
                int k1 = canvas.save();
                int i2 = getWidth() - getPaddingLeft() - getPaddingRight();
                int k2 = getHeight();
                canvas.translate(-i2 + getPaddingLeft(), Math.max(getScrollRange(), i1) + k2);
                canvas.rotate(180F, i2, 0.0F);
                e.a(i2, k2);
                if (e.a(canvas))
                {
                    ds.d(this);
                }
                canvas.restoreToCount(k1);
            }
        }
    }

    protected float getBottomFadingEdgeStrength()
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

    public int getMaxScrollAmount()
    {
        return (int)(0.5F * (float)getHeight());
    }

    public int getNestedScrollAxes()
    {
        return x.a();
    }

    protected float getTopFadingEdgeStrength()
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

    public boolean hasNestedScrollingParent()
    {
        return y.b();
    }

    public boolean isNestedScrollingEnabled()
    {
        return y.a();
    }

    protected void measureChild(View view, int i1, int j1)
    {
        android.view.ViewGroup.LayoutParams layoutparams = view.getLayoutParams();
        view.measure(getChildMeasureSpec(i1, getPaddingLeft() + getPaddingRight(), layoutparams.width), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    protected void measureChildWithMargins(View view, int i1, int j1, int k1, int l1)
    {
        android.view.ViewGroup.MarginLayoutParams marginlayoutparams = (android.view.ViewGroup.MarginLayoutParams)view.getLayoutParams();
        i1 = getChildMeasureSpec(i1, getPaddingLeft() + getPaddingRight() + marginlayoutparams.leftMargin + marginlayoutparams.rightMargin + j1, marginlayoutparams.width);
        j1 = marginlayoutparams.topMargin;
        view.measure(i1, android.view.View.MeasureSpec.makeMeasureSpec(marginlayoutparams.bottomMargin + j1, 0));
    }

    public void onAttachedToWindow()
    {
        h = false;
    }

    public boolean onGenericMotionEvent(MotionEvent motionevent)
    {
        if ((df.d(motionevent) & 2) == 0) goto _L2; else goto _L1
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
        if (j || (f1 = df.e(motionevent, 9)) == 0.0F)
        {
            continue; /* Loop/switch isn't completed */
        }
        i1 = (int)(f1 * getVerticalScrollFactorCompat());
        j1 = getScrollRange();
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

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        int i1;
        boolean flag;
        flag = true;
        i1 = motionevent.getAction();
        if (i1 == 2 && j)
        {
            return true;
        }
        if (getScrollY() == 0 && !ds.b(this, 1))
        {
            return false;
        }
        i1 & 0xff;
        JVM INSTR tableswitch 0 6: default 88
    //                   0 228
    //                   1 316
    //                   2 93
    //                   3 316
    //                   4 88
    //                   5 88
    //                   6 337;
           goto _L1 _L2 _L3 _L4 _L3 _L1 _L1 _L5
_L1:
        return j;
_L4:
        int j1 = q;
        if (j1 != -1)
        {
            int i2 = df.a(motionevent, j1);
            if (i2 == -1)
            {
                Log.e("NestedScrollView", (new StringBuilder()).append("Invalid pointerId=").append(j1).append(" in onInterceptTouchEvent").toString());
            } else
            {
                int k1 = (int)df.d(motionevent, i2);
                if (Math.abs(k1 - f) > n && (getNestedScrollAxes() & 2) == 0)
                {
                    j = true;
                    f = k1;
                    d();
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
        int l1 = (int)motionevent.getY();
        if (!c((int)motionevent.getX(), l1))
        {
            j = false;
            e();
        } else
        {
            f = l1;
            q = df.b(motionevent, 0);
            c();
            k.addMovement(motionevent);
            if (c.a())
            {
                flag = false;
            }
            j = flag;
            startNestedScroll(2);
        }
        continue; /* Loop/switch isn't completed */
_L3:
        j = false;
        q = -1;
        e();
        stopNestedScroll();
        continue; /* Loop/switch isn't completed */
_L5:
        a(motionevent);
        if (true) goto _L1; else goto _L6
_L6:
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
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

    protected void onMeasure(int i1, int j1)
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

    public boolean onNestedFling(View view, float f1, float f2, boolean flag)
    {
        if (!flag)
        {
            f((int)f2);
            return true;
        } else
        {
            return false;
        }
    }

    public boolean onNestedPreFling(View view, float f1, float f2)
    {
        return false;
    }

    public void onNestedPreScroll(View view, int i1, int j1, int ai[])
    {
    }

    public void onNestedScroll(View view, int i1, int j1, int k1, int l1)
    {
        i1 = getScrollY();
        scrollBy(0, l1);
        i1 = getScrollY() - i1;
        dispatchNestedScroll(0, i1, 0, l1 - i1, null);
    }

    public void onNestedScrollAccepted(View view, View view1, int i1)
    {
        x.a(view, view1, i1);
        startNestedScroll(2);
    }

    protected void onOverScrolled(int i1, int j1, boolean flag, boolean flag1)
    {
        super.scrollTo(i1, j1);
    }

    protected boolean onRequestFocusInDescendants(int i1, Rect rect)
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

    protected void onRestoreInstanceState(Parcelable parcelable)
    {
        parcelable = (SavedState)parcelable;
        super.onRestoreInstanceState(parcelable.getSuperState());
        u = parcelable;
        requestLayout();
    }

    protected Parcelable onSaveInstanceState()
    {
        SavedState savedstate = new SavedState(super.onSaveInstanceState());
        savedstate.a = getScrollY();
        return savedstate;
    }

    protected void onSizeChanged(int i1, int j1, int k1, int l1)
    {
        super.onSizeChanged(i1, j1, k1, l1);
        View view;
        for (view = findFocus(); view == null || this == view || !a(view, 0, l1);)
        {
            return;
        }

        view.getDrawingRect(b);
        offsetDescendantRectToMyCoords(view, b);
        e(a(b));
    }

    public boolean onStartNestedScroll(View view, View view1, int i1)
    {
        return (i1 & 2) != 0;
    }

    public void onStopNestedScroll(View view)
    {
        stopNestedScroll();
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        MotionEvent motionevent1;
        int i1;
        d();
        motionevent1 = MotionEvent.obtain(motionevent);
        i1 = df.a(motionevent);
        if (i1 == 0)
        {
            t = 0;
        }
        motionevent1.offsetLocation(0.0F, t);
        i1;
        JVM INSTR tableswitch 0 6: default 80
    //                   0 101
    //                   1 732
    //                   2 200
    //                   3 798
    //                   4 80
    //                   5 824
    //                   6 854;
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
        q = df.b(motionevent, 0);
        startNestedScroll(2);
        continue; /* Loop/switch isn't completed */
_L4:
        int l1;
        int i2;
        int j2;
        i2 = df.a(motionevent, q);
        if (i2 == -1)
        {
            Log.e("NestedScrollView", (new StringBuilder()).append("Invalid pointerId=").append(q).append(" in onTouchEvent").toString());
            continue; /* Loop/switch isn't completed */
        }
        j2 = (int)df.d(motionevent, i2);
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
        j2 = getScrollRange();
        l1 = ds.a(this);
        if (l1 == 0 || l1 == 1 && j2 > 0)
        {
            l1 = 1;
        } else
        {
            l1 = 0;
        }
        if (a(0, i1, 0, getScrollY(), 0, j2, 0, 0, true) && !hasNestedScrollingParent())
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
        g();
        l1 = k2 + i1;
        if (l1 >= 0) goto _L9; else goto _L8
_L8:
        d.a((float)i1 / (float)getHeight(), df.c(motionevent, i2) / (float)getWidth());
        if (!e.a())
        {
            e.c();
        }
_L10:
        if (d != null && (!d.a() || !e.a()))
        {
            ds.d(this);
        }
        continue; /* Loop/switch isn't completed */
_L9:
        if (l1 > j2)
        {
            e.a((float)i1 / (float)getHeight(), 1.0F - df.c(motionevent, i2) / (float)getWidth());
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
            int j1 = (int)dq.b(motionevent, q);
            if (Math.abs(j1) > o)
            {
                f(-j1);
            }
            q = -1;
            f();
        }
        continue; /* Loop/switch isn't completed */
_L5:
        if (j && getChildCount() > 0)
        {
            q = -1;
            f();
        }
        continue; /* Loop/switch isn't completed */
_L6:
        int k1 = df.b(motionevent);
        f = (int)df.d(motionevent, k1);
        q = df.b(motionevent, k1);
        continue; /* Loop/switch isn't completed */
_L7:
        a(motionevent);
        f = (int)df.d(motionevent, df.a(motionevent, q));
        if (true) goto _L1; else goto _L11
_L11:
    }

    public void requestChildFocus(View view, View view1)
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

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean flag)
    {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return a(rect, flag);
    }

    public void requestDisallowInterceptTouchEvent(boolean flag)
    {
        if (flag)
        {
            e();
        }
        super.requestDisallowInterceptTouchEvent(flag);
    }

    public void requestLayout()
    {
        g = true;
        super.requestLayout();
    }

    public void scrollTo(int i1, int j1)
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

    public void setFillViewport(boolean flag)
    {
        if (flag != l)
        {
            l = flag;
            requestLayout();
        }
    }

    public void setNestedScrollingEnabled(boolean flag)
    {
        y.a(flag);
    }

    public void setSmoothScrollingEnabled(boolean flag)
    {
        m = flag;
    }

    public boolean shouldDelayChildPressedState()
    {
        return true;
    }

    public boolean startNestedScroll(int i1)
    {
        return y.a(i1);
    }

    public void stopNestedScroll()
    {
        y.c();
    }

}
