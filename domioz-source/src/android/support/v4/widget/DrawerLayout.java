// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.support.v4.view.ay;
import android.support.v4.view.bp;
import android.support.v4.view.v;
import android.support.v4.view.z;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

// Referenced classes of package android.support.v4.widget:
//            h, i, ax, k, 
//            g, f

public final class DrawerLayout extends ViewGroup
{

    static final g a;
    private static final int b[] = {
        0x10100b3
    };
    private static final boolean c;
    private final f d;
    private int e;
    private int f;
    private float g;
    private Paint h;
    private final ax i;
    private final ax j;
    private final k k;
    private final k l;
    private int m;
    private boolean n;
    private boolean o;
    private int p;
    private int q;
    private boolean r;
    private boolean s;
    private float t;
    private float u;
    private Drawable v;
    private Drawable w;
    private Drawable x;
    private Object y;
    private boolean z;

    private void a(int i1, int j1)
    {
        j1 = android.support.v4.view.v.a(j1, bp.h(this));
        if (j1 == 3)
        {
            p = i1;
        } else
        if (j1 == 5)
        {
            q = i1;
        }
        if (i1 != 0)
        {
            ax ax1;
            if (j1 == 3)
            {
                ax1 = i;
            } else
            {
                ax1 = j;
            }
            ax1.e();
        }
        i1;
        JVM INSTR tableswitch 1 2: default 60
    //                   1 98
    //                   2 82;
           goto _L1 _L2 _L3
_L1:
        View view;
        return;
_L3:
        if ((view = a(j1)) != null)
        {
            h(view);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if ((view = a(j1)) != null)
        {
            d(view);
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    static void a(View view, float f1)
    {
        view = (LayoutParams)view.getLayoutParams();
        if (f1 == ((LayoutParams) (view)).b)
        {
            return;
        } else
        {
            view.b = f1;
            return;
        }
    }

    private void a(View view, boolean flag)
    {
        int j1 = getChildCount();
        int i1 = 0;
        while (i1 < j1) 
        {
            View view1 = getChildAt(i1);
            if (!flag && !c(view1) || flag && view1 == view)
            {
                bp.c(view1, 1);
            } else
            {
                bp.c(view1, 4);
            }
            i1++;
        }
    }

    private void a(boolean flag)
    {
        int l1 = getChildCount();
        int j1 = 0;
        int i1 = 0;
        while (j1 < l1) 
        {
label0:
            {
                View view = getChildAt(j1);
                LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
                int k1 = i1;
                if (!c(view))
                {
                    break label0;
                }
                if (flag)
                {
                    k1 = i1;
                    if (!layoutparams.c)
                    {
                        break label0;
                    }
                }
                k1 = view.getWidth();
                if (a(view, 3))
                {
                    i1 |= i.a(view, -k1, view.getTop());
                } else
                {
                    i1 |= j.a(view, getWidth(), view.getTop());
                }
                layoutparams.c = false;
                k1 = i1;
            }
            j1++;
            i1 = k1;
        }
        k.a();
        l.a();
        if (i1 != 0)
        {
            invalidate();
        }
    }

    static int[] a()
    {
        return b;
    }

    static float b(View view)
    {
        return ((LayoutParams)view.getLayoutParams()).b;
    }

    private View b()
    {
        int j1 = getChildCount();
        for (int i1 = 0; i1 < j1; i1++)
        {
            View view = getChildAt(i1);
            if (((LayoutParams)view.getLayoutParams()).d)
            {
                return view;
            }
        }

        return null;
    }

    private View c()
    {
        int j1 = getChildCount();
        boolean flag;
        for (int i1 = 0; i1 < j1; i1++)
        {
            View view = getChildAt(i1);
            if (!c(view))
            {
                continue;
            }
            if (!c(view))
            {
                throw new IllegalArgumentException((new StringBuilder("View ")).append(view).append(" is not a drawer").toString());
            }
            if (((LayoutParams)view.getLayoutParams()).b > 0.0F)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                return view;
            }
        }

        return null;
    }

    static boolean c(View view)
    {
        return (android.support.v4.view.v.a(((LayoutParams)view.getLayoutParams()).a, bp.h(view)) & 7) != 0;
    }

    static boolean e(View view)
    {
        return bp.e(view) != 4 && bp.e(view) != 2;
    }

    private int f(View view)
    {
        return android.support.v4.view.v.a(((LayoutParams)view.getLayoutParams()).a, bp.h(this));
    }

    private static boolean g(View view)
    {
        return ((LayoutParams)view.getLayoutParams()).a == 0;
    }

    private void h(View view)
    {
        if (!c(view))
        {
            throw new IllegalArgumentException((new StringBuilder("View ")).append(view).append(" is not a sliding drawer").toString());
        }
        if (o)
        {
            LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
            layoutparams.b = 1.0F;
            layoutparams.d = true;
            a(view, true);
        } else
        if (a(view, 3))
        {
            i.a(view, 0, view.getTop());
        } else
        {
            j.a(view, getWidth() - view.getWidth(), view.getTop());
        }
        invalidate();
    }

    public final int a(View view)
    {
        int i1 = f(view);
        if (i1 == 3)
        {
            return p;
        }
        if (i1 == 5)
        {
            return q;
        } else
        {
            return 0;
        }
    }

    final View a(int i1)
    {
        int j1 = android.support.v4.view.v.a(i1, bp.h(this));
        int k1 = getChildCount();
        for (i1 = 0; i1 < k1; i1++)
        {
            View view = getChildAt(i1);
            if ((f(view) & 7) == (j1 & 7))
            {
                return view;
            }
        }

        return null;
    }

    final void a(int i1, View view)
    {
        LayoutParams layoutparams;
        int j1 = i.a();
        int k1 = j.a();
        if (j1 == 1 || k1 == 1)
        {
            j1 = 1;
        } else
        if (j1 == 2 || k1 == 2)
        {
            j1 = 2;
        } else
        {
            j1 = 0;
        }
        if (view == null || i1 != 0) goto _L2; else goto _L1
_L1:
        layoutparams = (LayoutParams)view.getLayoutParams();
        if (layoutparams.b != 0.0F) goto _L4; else goto _L3
_L3:
        layoutparams = (LayoutParams)view.getLayoutParams();
        if (layoutparams.d)
        {
            layoutparams.d = false;
            a(view, false);
            if (hasWindowFocus())
            {
                view = getRootView();
                if (view != null)
                {
                    view.sendAccessibilityEvent(32);
                }
            }
        }
_L2:
        if (j1 != m)
        {
            m = j1;
        }
        return;
_L4:
        if (layoutparams.b == 1.0F)
        {
            LayoutParams layoutparams1 = (LayoutParams)view.getLayoutParams();
            if (!layoutparams1.d)
            {
                layoutparams1.d = true;
                a(view, true);
                if (hasWindowFocus())
                {
                    sendAccessibilityEvent(32);
                }
                view.requestFocus();
            }
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    final boolean a(View view, int i1)
    {
        return (f(view) & i1) == i1;
    }

    public final void addView(View view, int i1, android.view.ViewGroup.LayoutParams layoutparams)
    {
        super.addView(view, i1, layoutparams);
        if (b() != null || c(view))
        {
            bp.c(view, 4);
        } else
        {
            bp.c(view, 1);
        }
        if (!c)
        {
            bp.a(view, d);
        }
    }

    protected final boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return (layoutparams instanceof LayoutParams) && super.checkLayoutParams(layoutparams);
    }

    public final void computeScroll()
    {
        int j1 = getChildCount();
        float f1 = 0.0F;
        for (int i1 = 0; i1 < j1; i1++)
        {
            f1 = Math.max(f1, ((LayoutParams)getChildAt(i1).getLayoutParams()).b);
        }

        g = f1;
        if (i.g() | j.g())
        {
            bp.d(this);
        }
    }

    public final void d(View view)
    {
        if (!c(view))
        {
            throw new IllegalArgumentException((new StringBuilder("View ")).append(view).append(" is not a sliding drawer").toString());
        }
        if (o)
        {
            view = (LayoutParams)view.getLayoutParams();
            view.b = 0.0F;
            view.d = false;
        } else
        if (a(view, 3))
        {
            i.a(view, -view.getWidth(), view.getTop());
        } else
        {
            j.a(view, getWidth(), view.getTop());
        }
        invalidate();
    }

    protected final boolean drawChild(Canvas canvas, View view, long l1)
    {
        int i1;
        int j2;
        int i3;
        int l3;
        int i5;
        int j5;
        int k5;
        boolean flag1;
        i5 = getHeight();
        flag1 = g(view);
        j2 = 0;
        boolean flag = false;
        i1 = getWidth();
        j5 = canvas.save();
        i3 = i1;
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_244;
        }
        k5 = getChildCount();
        l3 = 0;
        j2 = ((flag) ? 1 : 0);
_L6:
        View view1;
        if (l3 >= k5)
        {
            break MISSING_BLOCK_LABEL_226;
        }
        view1 = getChildAt(l3);
        if (view1 == view || view1.getVisibility() != 0) goto _L2; else goto _L1
_L1:
        int k4;
        Drawable drawable = view1.getBackground();
        if (drawable != null)
        {
            if (drawable.getOpacity() == -1)
            {
                i3 = 1;
            } else
            {
                i3 = 0;
            }
        } else
        {
            i3 = 0;
        }
        if (i3 == 0 || !c(view1) || view1.getHeight() < i5) goto _L2; else goto _L3
_L3:
        if (!a(view1, 3)) goto _L5; else goto _L4
_L4:
        i3 = view1.getRight();
        if (i3 > j2)
        {
            j2 = i3;
        }
        k4 = j2;
        i3 = i1;
_L7:
        l3++;
        i1 = i3;
        j2 = k4;
          goto _L6
_L5:
        int l4;
        l4 = view1.getLeft();
        i3 = l4;
        k4 = j2;
        if (l4 < i1) goto _L7; else goto _L2
_L2:
        i3 = i1;
        k4 = j2;
          goto _L7
        canvas.clipRect(j2, 0, i1, getHeight());
        i3 = i1;
        boolean flag2 = super.drawChild(canvas, view, l1);
        canvas.restoreToCount(j5);
        if (g > 0.0F && flag1)
        {
            int j1 = (int)((float)((f & 0xff000000) >>> 24) * g);
            int i4 = f;
            h.setColor(j1 << 24 | i4 & 0xffffff);
            canvas.drawRect(j2, 0.0F, i3, getHeight(), h);
        } else
        {
            if (v != null && a(view, 3))
            {
                int k1 = v.getIntrinsicWidth();
                int k2 = view.getRight();
                int j3 = i.b();
                float f1 = Math.max(0.0F, Math.min((float)k2 / (float)j3, 1.0F));
                v.setBounds(k2, view.getTop(), k1 + k2, view.getBottom());
                v.setAlpha((int)(255F * f1));
                v.draw(canvas);
                return flag2;
            }
            if (w != null && a(view, 5))
            {
                int i2 = w.getIntrinsicWidth();
                int l2 = view.getLeft();
                int k3 = getWidth();
                int j4 = j.b();
                float f2 = Math.max(0.0F, Math.min((float)(k3 - l2) / (float)j4, 1.0F));
                w.setBounds(l2 - i2, view.getTop(), l2, view.getBottom());
                w.setAlpha((int)(255F * f2));
                w.draw(canvas);
                return flag2;
            }
        }
        return flag2;
    }

    protected final android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
    {
        return new LayoutParams();
    }

    public final android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
        return new LayoutParams(getContext(), attributeset);
    }

    protected final android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        if (layoutparams instanceof LayoutParams)
        {
            return new LayoutParams((LayoutParams)layoutparams);
        }
        if (layoutparams instanceof android.view.ViewGroup.MarginLayoutParams)
        {
            return new LayoutParams((android.view.ViewGroup.MarginLayoutParams)layoutparams);
        } else
        {
            return new LayoutParams(layoutparams);
        }
    }

    protected final void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        o = true;
    }

    protected final void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        o = true;
    }

    public final void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        if (z && x != null)
        {
            int i1 = a.a(y);
            if (i1 > 0)
            {
                x.setBounds(0, 0, getWidth(), i1);
                x.draw(canvas);
            }
        }
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        int i1;
        boolean flag;
        boolean flag1;
        boolean flag2;
        flag = false;
        i1 = ay.a(motionevent);
        flag1 = i.a(motionevent);
        flag2 = j.a(motionevent);
        i1;
        JVM INSTR tableswitch 0 3: default 60
    //                   0 131
    //                   1 229
    //                   2 199
    //                   3 229;
           goto _L1 _L2 _L3 _L4 _L3
_L1:
        i1 = 0;
_L15:
        if (flag1 | flag2 || i1 != 0) goto _L6; else goto _L5
_L5:
        int j1;
        j1 = getChildCount();
        i1 = 0;
_L17:
        if (i1 >= j1) goto _L8; else goto _L7
_L7:
        if (!((LayoutParams)getChildAt(i1).getLayoutParams()).c) goto _L10; else goto _L9
_L9:
        i1 = 1;
_L18:
        if (i1 == 0 && !s) goto _L11; else goto _L6
_L6:
        flag = true;
_L11:
        return flag;
_L2:
        float f1;
        float f2;
        f1 = motionevent.getX();
        f2 = motionevent.getY();
        t = f1;
        u = f2;
        if (g <= 0.0F) goto _L13; else goto _L12
_L12:
        motionevent = i.b((int)f1, (int)f2);
        if (motionevent == null || !g(motionevent)) goto _L13; else goto _L14
_L14:
        i1 = 1;
_L19:
        r = false;
        s = false;
          goto _L15
_L4:
        if (!i.h()) goto _L1; else goto _L16
_L16:
        k.a();
        l.a();
        i1 = 0;
          goto _L15
_L3:
        a(true);
        r = false;
        s = false;
          goto _L1
_L10:
        i1++;
          goto _L17
_L8:
        i1 = 0;
          goto _L18
_L13:
        i1 = 0;
          goto _L19
    }

    public final boolean onKeyDown(int i1, KeyEvent keyevent)
    {
        if (i1 == 4)
        {
            boolean flag;
            if (c() != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                android.support.v4.view.z.c(keyevent);
                return true;
            }
        }
        return super.onKeyDown(i1, keyevent);
    }

    public final boolean onKeyUp(int i1, KeyEvent keyevent)
    {
        boolean flag = false;
        if (i1 == 4)
        {
            keyevent = c();
            if (keyevent != null && a(keyevent) == 0)
            {
                a(false);
            }
            if (keyevent != null)
            {
                flag = true;
            }
            return flag;
        } else
        {
            return super.onKeyUp(i1, keyevent);
        }
    }

    protected final void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        int k2;
        int l2;
        n = true;
        k2 = k1 - i1;
        l2 = getChildCount();
        k1 = 0;
_L2:
        View view;
        LayoutParams layoutparams;
        if (k1 >= l2)
        {
            break MISSING_BLOCK_LABEL_445;
        }
        view = getChildAt(k1);
        if (view.getVisibility() != 8)
        {
            layoutparams = (LayoutParams)view.getLayoutParams();
            if (!g(view))
            {
                break; /* Loop/switch isn't completed */
            }
            view.layout(layoutparams.leftMargin, layoutparams.topMargin, layoutparams.leftMargin + view.getMeasuredWidth(), layoutparams.topMargin + view.getMeasuredHeight());
        }
_L6:
        k1++;
        if (true) goto _L2; else goto _L1
_L1:
        int i2;
        int i3;
        int j3;
        i3 = view.getMeasuredWidth();
        j3 = view.getMeasuredHeight();
        float f1;
        boolean flag1;
        if (a(view, 3))
        {
            i1 = -i3;
            i2 = (int)((float)i3 * layoutparams.b) + i1;
            f1 = (float)(i3 + i2) / (float)i3;
        } else
        {
            i2 = k2 - (int)((float)i3 * layoutparams.b);
            f1 = (float)(k2 - i2) / (float)i3;
        }
        if (f1 != layoutparams.b)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        layoutparams.a & 0x70;
        JVM INSTR lookupswitch 2: default 212
    //                   16: 355
    //                   80: 315;
           goto _L3 _L4 _L5
_L4:
        break MISSING_BLOCK_LABEL_355;
_L3:
        view.layout(i2, layoutparams.topMargin, i3 + i2, j3 + layoutparams.topMargin);
_L7:
        if (flag1)
        {
            a(view, f1);
        }
        int j2;
        int k3;
        if (layoutparams.b > 0.0F)
        {
            i1 = 0;
        } else
        {
            i1 = 4;
        }
        if (view.getVisibility() != i1)
        {
            view.setVisibility(i1);
        }
          goto _L6
_L5:
        i1 = l1 - j1;
        view.layout(i2, i1 - layoutparams.bottomMargin - view.getMeasuredHeight(), i3 + i2, i1 - layoutparams.bottomMargin);
          goto _L7
        k3 = l1 - j1;
        j2 = (k3 - j3) / 2;
        if (j2 < layoutparams.topMargin)
        {
            i1 = layoutparams.topMargin;
        } else
        {
            i1 = j2;
            if (j2 + j3 > k3 - layoutparams.bottomMargin)
            {
                i1 = k3 - layoutparams.bottomMargin - j3;
            }
        }
        view.layout(i2, i1, i3 + i2, j3 + i1);
          goto _L7
        n = false;
        o = false;
        return;
          goto _L6
    }

    protected final void onMeasure(int i1, int j1)
    {
        int i2;
        int j2;
        int k2;
        int l2;
        int i3;
        int l3;
        k2 = 300;
        j2 = 0;
        l3 = android.view.View.MeasureSpec.getMode(i1);
        i3 = android.view.View.MeasureSpec.getMode(j1);
        i2 = android.view.View.MeasureSpec.getSize(i1);
        l2 = android.view.View.MeasureSpec.getSize(j1);
        if (l3 != 0x40000000) goto _L2; else goto _L1
_L1:
        int l1 = i2;
        if (i3 == 0x40000000) goto _L3; else goto _L2
_L2:
        int k1;
        boolean flag;
        if (isInEditMode())
        {
            k1 = i2;
            if (l3 != 0x80000000)
            {
                k1 = i2;
                if (l3 == 0)
                {
                    k1 = 300;
                }
            }
            l1 = k1;
            if (i3 != 0x80000000)
            {
label0:
                {
                    l1 = k1;
                    if (i3 == 0)
                    {
                        l1 = k1;
                        k1 = k2;
                        break label0;
                    }
                }
            }
        } else
        {
            throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
        }
          goto _L3
_L5:
        setMeasuredDimension(l1, k1);
        if (y != null && bp.s(this))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        k2 = bp.h(this);
        l2 = getChildCount();
        while (j2 < l2) 
        {
            Object obj = getChildAt(j2);
            if (((View) (obj)).getVisibility() != 8)
            {
                Object obj1 = (LayoutParams)((View) (obj)).getLayoutParams();
                if (flag)
                {
                    int j3 = android.support.v4.view.v.a(((LayoutParams) (obj1)).a, k2);
                    if (bp.s(((View) (obj))))
                    {
                        a.a(((View) (obj)), y, j3);
                    } else
                    {
                        a.a(((android.view.ViewGroup.MarginLayoutParams) (obj1)), y, j3);
                    }
                }
                if (g(((View) (obj))))
                {
                    ((View) (obj)).measure(android.view.View.MeasureSpec.makeMeasureSpec(l1 - ((LayoutParams) (obj1)).leftMargin - ((LayoutParams) (obj1)).rightMargin, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(k1 - ((LayoutParams) (obj1)).topMargin - ((LayoutParams) (obj1)).bottomMargin, 0x40000000));
                } else
                if (c(((View) (obj))))
                {
                    int k3 = f(((View) (obj))) & 7;
                    if ((k3 & 0) != 0)
                    {
                        obj1 = new StringBuilder("Child drawer has absolute gravity ");
                        if ((k3 & 3) == 3)
                        {
                            obj = "LEFT";
                        } else
                        if ((k3 & 5) == 5)
                        {
                            obj = "RIGHT";
                        } else
                        {
                            obj = Integer.toHexString(k3);
                        }
                        throw new IllegalStateException(((StringBuilder) (obj1)).append(((String) (obj))).append(" but this DrawerLayout already has a drawer view along that edge").toString());
                    }
                    ((View) (obj)).measure(getChildMeasureSpec(i1, e + ((LayoutParams) (obj1)).leftMargin + ((LayoutParams) (obj1)).rightMargin, ((LayoutParams) (obj1)).width), getChildMeasureSpec(j1, ((LayoutParams) (obj1)).topMargin + ((LayoutParams) (obj1)).bottomMargin, ((LayoutParams) (obj1)).height));
                } else
                {
                    throw new IllegalStateException((new StringBuilder("Child ")).append(obj).append(" at index ").append(j2).append(" does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY").toString());
                }
            }
            j2++;
        }
        return;
_L3:
        k1 = l2;
        if (true) goto _L5; else goto _L4
_L4:
    }

    protected final void onRestoreInstanceState(Parcelable parcelable)
    {
        parcelable = (SavedState)parcelable;
        super.onRestoreInstanceState(parcelable.getSuperState());
        if (((SavedState) (parcelable)).a != 0)
        {
            View view = a(((SavedState) (parcelable)).a);
            if (view != null)
            {
                h(view);
            }
        }
        a(((SavedState) (parcelable)).b, 3);
        a(((SavedState) (parcelable)).c, 5);
    }

    protected final Parcelable onSaveInstanceState()
    {
        SavedState savedstate = new SavedState(super.onSaveInstanceState());
        View view = b();
        if (view != null)
        {
            savedstate.a = ((LayoutParams)view.getLayoutParams()).a;
        }
        savedstate.b = p;
        savedstate.c = q;
        return savedstate;
    }

    public final boolean onTouchEvent(MotionEvent motionevent)
    {
        i.b(motionevent);
        j.b(motionevent);
        motionevent.getAction() & 0xff;
        JVM INSTR tableswitch 0 3: default 56
    //                   0 58
    //                   1 90
    //                   2 56
    //                   3 203;
           goto _L1 _L2 _L3 _L1 _L4
_L1:
        return true;
_L2:
        float f1 = motionevent.getX();
        float f3 = motionevent.getY();
        t = f1;
        u = f3;
        r = false;
        s = false;
        return true;
_L3:
        float f2;
        float f4;
        f4 = motionevent.getX();
        f2 = motionevent.getY();
        motionevent = i.b((int)f4, (int)f2);
        if (motionevent == null || !g(motionevent)) goto _L6; else goto _L5
_L5:
        int i1;
        f4 -= t;
        f2 -= u;
        i1 = i.d();
        if (f4 * f4 + f2 * f2 >= (float)(i1 * i1)) goto _L6; else goto _L7
_L7:
        motionevent = b();
        if (motionevent == null) goto _L6; else goto _L8
_L8:
        boolean flag;
        if (a(motionevent) == 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
_L10:
        a(flag);
        r = false;
        return true;
_L4:
        a(true);
        r = false;
        s = false;
        return true;
_L6:
        flag = true;
        if (true) goto _L10; else goto _L9
_L9:
    }

    public final void requestDisallowInterceptTouchEvent(boolean flag)
    {
        super.requestDisallowInterceptTouchEvent(flag);
        r = flag;
        if (flag)
        {
            a(true);
        }
    }

    public final void requestLayout()
    {
        if (!n)
        {
            super.requestLayout();
        }
    }

    static 
    {
        boolean flag = true;
        if (android.os.Build.VERSION.SDK_INT < 19)
        {
            flag = false;
        }
        c = flag;
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            a = new h();
        } else
        {
            a = new i();
        }
    }

    private class LayoutParams extends android.view.ViewGroup.MarginLayoutParams
    {

        public int a;
        float b;
        boolean c;
        boolean d;

        public LayoutParams()
        {
            super(-1, -1);
            a = 0;
        }

        public LayoutParams(Context context, AttributeSet attributeset)
        {
            super(context, attributeset);
            a = 0;
            context = context.obtainStyledAttributes(attributeset, DrawerLayout.a());
            a = context.getInt(0, 0);
            context.recycle();
        }

        public LayoutParams(LayoutParams layoutparams)
        {
            super(layoutparams);
            a = 0;
            a = layoutparams.a;
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
        {
            super(layoutparams);
            a = 0;
        }

        public LayoutParams(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
        {
            super(marginlayoutparams);
            a = 0;
        }
    }


    private class SavedState extends android.view.View.BaseSavedState
    {

        public static final android.os.Parcelable.Creator CREATOR = new j();
        int a;
        int b;
        int c;

        public void writeToParcel(Parcel parcel, int i1)
        {
            super.writeToParcel(parcel, i1);
            parcel.writeInt(a);
        }


        public SavedState(Parcel parcel)
        {
            super(parcel);
            a = 0;
            b = 0;
            c = 0;
            a = parcel.readInt();
        }

        public SavedState(Parcelable parcelable)
        {
            super(parcelable);
            a = 0;
            b = 0;
            c = 0;
        }
    }

}
