// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.baselib.hlistview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.util.SparseArrayCompat;
import android.util.AttributeSet;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.SoundEffectConstants;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Checkable;
import android.widget.ListAdapter;
import com.roidapp.baselib.b;
import com.roidapp.baselib.i;
import java.util.ArrayList;

// Referenced classes of package com.roidapp.baselib.hlistview:
//            AbsHListView, x, n, y, 
//            aa, c, l, z

public class HListView extends AbsHListView
{

    private ArrayList aA;
    private boolean aB;
    private boolean aC;
    private boolean aD;
    private boolean aE;
    private boolean aF;
    private boolean aG;
    private final Rect aH;
    private Paint aI;
    private final x aJ;
    private z aK;
    Drawable au;
    int av;
    int aw;
    Drawable ax;
    Drawable ay;
    private ArrayList az;

    public HListView(Context context)
    {
        this(context, null);
    }

    public HListView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, b.c);
    }

    public HListView(Context context, AttributeSet attributeset, int k)
    {
        super(context, attributeset, k);
        az = new ArrayList();
        aA = new ArrayList();
        aF = true;
        aG = false;
        aH = new Rect();
        aJ = new x((byte)0);
        TypedArray typedarray = context.getTheme().obtainStyledAttributes(attributeset, i.o, k, 0);
        CharSequence acharsequence[] = null;
        Drawable drawable;
        Drawable drawable1;
        int i1;
        boolean flag;
        boolean flag1;
        if (typedarray != null)
        {
            acharsequence = typedarray.getTextArray(i.q);
            attributeset = typedarray.getDrawable(i.p);
            drawable1 = typedarray.getDrawable(i.w);
            drawable = typedarray.getDrawable(i.v);
            k = typedarray.getDimensionPixelSize(i.r, 0);
            flag1 = typedarray.getBoolean(i.t, true);
            flag = typedarray.getBoolean(i.s, true);
            i1 = typedarray.getInteger(i.u, -1);
            typedarray.recycle();
        } else
        {
            attributeset = null;
            drawable1 = null;
            drawable = null;
            k = 0;
            flag1 = true;
            flag = true;
            i1 = -1;
        }
        if (acharsequence != null)
        {
            a(new ArrayAdapter(context, 0x1090003, acharsequence));
        }
        if (attributeset != null)
        {
            boolean flag2;
            if (attributeset != null)
            {
                av = attributeset.getIntrinsicWidth();
            } else
            {
                av = 0;
            }
            au = attributeset;
            if (attributeset == null || attributeset.getOpacity() == -1)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            aC = flag2;
            requestLayout();
            invalidate();
        }
        if (drawable1 != null)
        {
            ax = drawable1;
            if (getScrollX() < 0)
            {
                invalidate();
            }
        }
        if (drawable != null)
        {
            ay = drawable;
            invalidate();
        }
        if (k != 0)
        {
            av = k;
            requestLayout();
            invalidate();
        }
        aD = flag1;
        aE = flag;
        aw = i1;
    }

    private int A()
    {
        return (int)(0.33F * (float)(getRight() - getLeft()));
    }

    private void B()
    {
        boolean flag;
        int k1;
        flag = false;
        k1 = getChildCount();
        if (k1 <= 0) goto _L2; else goto _L1
_L1:
        if (K) goto _L4; else goto _L3
_L3:
        int j1;
        j1 = getChildAt(0).getLeft() - u.left;
        int k = j1;
        if (V != 0)
        {
            k = j1 - av;
        }
        j1 = k;
        if (k < 0)
        {
            j1 = ((flag) ? 1 : 0);
        }
_L6:
        if (j1 != 0)
        {
            e(-j1);
        }
_L2:
        return;
_L4:
        j1 = getChildAt(k1 - 1).getRight() - (getWidth() - u.right);
        int i1 = j1;
        if (k1 + V < ao)
        {
            i1 = j1 + av;
        }
        j1 = ((flag) ? 1 : 0);
        if (i1 <= 0)
        {
            j1 = i1;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    private int C()
    {
        return Math.max(2, getHorizontalFadingEdgeLength());
    }

    private View a(int k, int i1, int j1)
    {
        int l1 = getHorizontalFadingEdgeLength();
        int k1 = am;
        i1 = c(i1, l1, k1);
        j1 = b(j1, l1, k1);
        View view = a(k1, k, true, u.top, true);
        if (view.getRight() > j1)
        {
            view.offsetLeftAndRight(-Math.min(view.getLeft() - i1, view.getRight() - j1));
        } else
        if (view.getLeft() < i1)
        {
            view.offsetLeftAndRight(Math.min(i1 - view.getLeft(), j1 - view.getRight()));
        }
        a(view, k1);
        if (!K)
        {
            o(getChildCount());
            return view;
        } else
        {
            p(getChildCount());
            return view;
        }
    }

    private View a(int k, int i1, boolean flag, int j1, boolean flag1)
    {
        if (!aj)
        {
            View view = p.b(k);
            if (view != null)
            {
                a(view, k, i1, flag, j1, flag1, true);
                return view;
            }
        }
        View view1 = a(k, P);
        a(view1, k, i1, flag, j1, flag1, P[0]);
        return view1;
    }

    private View a(View view, View view1, int k, int i1, int j1)
    {
        int l1 = getHorizontalFadingEdgeLength();
        int i2 = am;
        int k1 = c(i1, l1, i2);
        l1 = b(i1, l1, i2);
        if (k > 0)
        {
            view = a(i2 - 1, view.getLeft(), true, u.top, false);
            k = av;
            view1 = a(i2, view.getRight() + k, true, u.top, true);
            if (view1.getRight() > l1)
            {
                i2 = view1.getLeft();
                int j2 = view1.getRight();
                i1 = (j1 - i1) / 2;
                i1 = Math.min(Math.min(i2 - k1, j2 - l1), i1);
                view.offsetLeftAndRight(-i1);
                view1.offsetLeftAndRight(-i1);
            }
            if (!K)
            {
                d(am - 2, view1.getLeft() - k);
                B();
                c(am + 1, view1.getRight() + k);
                return view1;
            } else
            {
                c(am + 1, view1.getRight() + k);
                B();
                d(am - 2, view1.getLeft() - k);
                return view1;
            }
        }
        if (k < 0)
        {
            if (view1 != null)
            {
                view = a(i2, view1.getLeft(), true, u.top, true);
            } else
            {
                view = a(i2, view.getLeft(), false, u.top, true);
            }
            if (view.getLeft() < k1)
            {
                k = view.getLeft();
                int k2 = view.getRight();
                i1 = (j1 - i1) / 2;
                view.offsetLeftAndRight(Math.min(Math.min(k1 - k, l1 - k2), i1));
            }
            a(view, i2);
            return view;
        }
        k = view.getLeft();
        view = a(i2, k, true, u.top, true);
        if (k < i1 && view.getRight() < i1 + 20)
        {
            view.offsetLeftAndRight(i1 - view.getLeft());
        }
        a(view, i2);
        return view;
    }

    private void a(Canvas canvas, Rect rect)
    {
        Drawable drawable = au;
        drawable.setBounds(rect);
        drawable.draw(canvas);
    }

    private static void a(Canvas canvas, Drawable drawable, Rect rect)
    {
        int k = drawable.getMinimumWidth();
        canvas.save();
        canvas.clipRect(rect);
        if (rect.right - rect.left < k)
        {
            rect.left = rect.right - k;
        }
        drawable.setBounds(rect);
        drawable.draw(canvas);
        canvas.restore();
    }

    private void a(View view, int k)
    {
        int i1 = av;
        if (!K)
        {
            d(k - 1, view.getLeft() - i1);
            B();
            c(k + 1, i1 + view.getRight());
            return;
        } else
        {
            c(k + 1, view.getRight() + i1);
            B();
            d(k - 1, view.getLeft() - i1);
            return;
        }
    }

    private void a(View view, int k, int i1)
    {
        AbsHListView.LayoutParams layoutparams1 = (AbsHListView.LayoutParams)view.getLayoutParams();
        AbsHListView.LayoutParams layoutparams = layoutparams1;
        if (layoutparams1 == null)
        {
            layoutparams = (AbsHListView.LayoutParams)generateDefaultLayoutParams();
            view.setLayoutParams(layoutparams);
        }
        layoutparams.a = j.getItemViewType(k);
        layoutparams.c = true;
        i1 = getChildMeasureSpec(i1, u.top + u.bottom, layoutparams.height);
        k = layoutparams.width;
        if (k > 0)
        {
            k = android.view.View.MeasureSpec.makeMeasureSpec(k, 0x40000000);
        } else
        {
            k = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        }
        view.measure(k, i1);
    }

    private void a(View view, int k, int i1, boolean flag, int j1, boolean flag1, boolean flag2)
    {
        AbsHListView.LayoutParams layoutparams;
        int k1;
        boolean flag3;
        int l1;
        int i2;
        boolean flag4;
        if (flag1 && g())
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag1 != view.isSelected())
        {
            l1 = 1;
        } else
        {
            l1 = 0;
        }
        k1 = F;
        if (k1 > 0 && k1 < 3 && A == k)
        {
            flag4 = true;
        } else
        {
            flag4 = false;
        }
        if (flag4 != view.isPressed())
        {
            i2 = 1;
        } else
        {
            i2 = 0;
        }
        if (!flag2 || l1 != 0 || view.isLayoutRequested())
        {
            flag3 = true;
        } else
        {
            flag3 = false;
        }
        layoutparams = (AbsHListView.LayoutParams)view.getLayoutParams();
        if (layoutparams == null)
        {
            layoutparams = (AbsHListView.LayoutParams)generateDefaultLayoutParams();
        }
        layoutparams.a = j.getItemViewType(k);
        if (flag2 && !layoutparams.c || layoutparams.b && layoutparams.a == -2)
        {
            byte byte0;
            if (flag)
            {
                byte0 = -1;
            } else
            {
                byte0 = 0;
            }
            attachViewToParent(view, byte0, layoutparams);
        } else
        {
            layoutparams.c = false;
            if (layoutparams.a == -2)
            {
                layoutparams.b = true;
            }
            byte byte1;
            if (flag)
            {
                byte1 = -1;
            } else
            {
                byte1 = 0;
            }
            addViewInLayout(view, byte1, layoutparams, true);
        }
        if (l1 != 0)
        {
            view.setSelected(flag1);
        }
        if (i2 != 0)
        {
            view.setPressed(flag4);
        }
        if (b != 0 && f != null)
        {
            if (view instanceof Checkable)
            {
                ((Checkable)view).setChecked(((Boolean)f.get(k, Boolean.valueOf(false))).booleanValue());
            } else
            if (android.os.Build.VERSION.SDK_INT >= 11)
            {
                view.setActivated(((Boolean)f.get(k, Boolean.valueOf(false))).booleanValue());
            }
        }
        if (flag3)
        {
            i2 = getChildMeasureSpec(v, u.top + u.bottom, layoutparams.height);
            l1 = layoutparams.width;
            if (l1 > 0)
            {
                l1 = android.view.View.MeasureSpec.makeMeasureSpec(l1, 0x40000000);
            } else
            {
                l1 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
            }
            view.measure(l1, i2);
        } else
        {
            cleanupLayoutState(view);
        }
        l1 = view.getMeasuredWidth();
        i2 = view.getMeasuredHeight();
        if (!flag)
        {
            i1 -= l1;
        }
        if (flag3)
        {
            view.layout(i1, j1, l1 + i1, i2 + j1);
        } else
        {
            view.offsetLeftAndRight(i1 - view.getLeft());
            view.offsetTopAndBottom(j1 - view.getTop());
        }
        if (y && !view.isDrawingCacheEnabled())
        {
            view.setDrawingCacheEnabled(true);
        }
        if (android.os.Build.VERSION.SDK_INT >= 11 && flag2 && ((AbsHListView.LayoutParams)view.getLayoutParams()).d != k)
        {
            view.jumpDrawablesToCurrentState();
        }
    }

    private static void a(ArrayList arraylist)
    {
        if (arraylist != null)
        {
            int i1 = arraylist.size();
            for (int k = 0; k < i1; k++)
            {
                AbsHListView.LayoutParams layoutparams = (AbsHListView.LayoutParams)((y)arraylist.get(k)).a.getLayoutParams();
                if (layoutparams != null)
                {
                    layoutparams.b = false;
                }
            }

        }
    }

    private boolean a(int k, int i1, KeyEvent keyevent)
    {
        if (j != null && S) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        if (aj)
        {
            d();
        }
        if (android.os.Build.VERSION.SDK_INT < 11) goto _L1; else goto _L3
_L3:
        int l1 = keyevent.getAction();
        if (l1 == 1) goto _L5; else goto _L4
_L4:
        k;
        JVM INSTR lookupswitch 11: default 148
    //                   19: 383
    //                   20: 404
    //                   21: 161
    //                   22: 271
    //                   23: 426
    //                   62: 492
    //                   66: 426
    //                   92: 548
    //                   93: 631
    //                   122: 716
    //                   123: 757;
           goto _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L10 _L12 _L13 _L14 _L15
_L5:
        int j1;
        boolean flag;
        flag = false;
        j1 = i1;
          goto _L16
_L8:
        if (!keyevent.hasNoModifiers())
        {
            continue; /* Loop/switch isn't completed */
        }
        flag1 = m();
        flag = flag1;
        j1 = i1;
        if (flag1) goto _L16; else goto _L17
_L17:
        k1 = i1 - 1;
        flag = flag1;
        j1 = k1;
        if (i1 <= 0) goto _L16; else goto _L18
_L18:
        flag = flag1;
        j1 = k1;
        if (!t(33)) goto _L16; else goto _L19
_L19:
        flag1 = true;
        i1 = k1;
          goto _L17
        if (!keyevent.hasModifiers(2)) goto _L5; else goto _L20
_L20:
        if (m() || r(33))
        {
            flag = true;
            j1 = i1;
        } else
        {
            flag = false;
            j1 = i1;
        }
          goto _L16
_L9:
        if (!keyevent.hasNoModifiers())
        {
            continue; /* Loop/switch isn't completed */
        }
        flag1 = m();
        flag = flag1;
        j1 = i1;
        if (flag1) goto _L16; else goto _L21
_L21:
        k1 = i1 - 1;
        flag = flag1;
        j1 = k1;
        if (i1 <= 0) goto _L16; else goto _L22
_L22:
        flag = flag1;
        j1 = k1;
        if (!t(130)) goto _L16; else goto _L23
_L23:
        flag1 = true;
        i1 = k1;
          goto _L21
        if (!keyevent.hasModifiers(2)) goto _L5; else goto _L24
_L24:
        if (m() || r(130))
        {
            flag = true;
            j1 = i1;
        } else
        {
            flag = false;
            j1 = i1;
        }
          goto _L16
_L6:
        if (!keyevent.hasNoModifiers()) goto _L5; else goto _L25
_L25:
        flag = s(33);
        j1 = i1;
          goto _L16
_L7:
        if (!keyevent.hasNoModifiers()) goto _L5; else goto _L26
_L26:
        flag = s(130);
        j1 = i1;
          goto _L16
_L10:
        if (!keyevent.hasNoModifiers()) goto _L5; else goto _L27
_L27:
        boolean flag2 = m();
        flag = flag2;
        j1 = i1;
        if (!flag2)
        {
            flag = flag2;
            j1 = i1;
            if (keyevent.getRepeatCount() == 0)
            {
                flag = flag2;
                j1 = i1;
                if (getChildCount() > 0)
                {
                    h();
                    flag = true;
                    j1 = i1;
                }
            }
        }
          goto _L16
_L11:
        if (keyevent.hasNoModifiers())
        {
            if (!m())
            {
                q(130);
            }
        } else
        if (keyevent.hasModifiers(1) && !m())
        {
            q(33);
        }
        flag = true;
        j1 = i1;
          goto _L16
_L12:
        if (!keyevent.hasNoModifiers())
        {
            continue; /* Loop/switch isn't completed */
        }
        if (m() || q(33))
        {
            flag = true;
            j1 = i1;
        } else
        {
            flag = false;
            j1 = i1;
        }
          goto _L16
        if (!keyevent.hasModifiers(2)) goto _L5; else goto _L28
_L28:
        if (m() || r(33))
        {
            flag = true;
            j1 = i1;
        } else
        {
            flag = false;
            j1 = i1;
        }
          goto _L16
_L13:
        if (!keyevent.hasNoModifiers())
        {
            continue; /* Loop/switch isn't completed */
        }
        if (m() || q(130))
        {
            flag = true;
            j1 = i1;
        } else
        {
            flag = false;
            j1 = i1;
        }
          goto _L16
        if (!keyevent.hasModifiers(2)) goto _L5; else goto _L29
_L29:
        if (m() || r(130))
        {
            flag = true;
            j1 = i1;
        } else
        {
            flag = false;
            j1 = i1;
        }
          goto _L16
_L14:
        if (!keyevent.hasNoModifiers()) goto _L5; else goto _L30
_L30:
        if (m() || r(33))
        {
            flag = true;
            j1 = i1;
        } else
        {
            flag = false;
            j1 = i1;
        }
          goto _L16
_L15:
        if (!keyevent.hasNoModifiers()) goto _L5; else goto _L31
_L31:
        if (m() || r(130))
        {
            flag = true;
            j1 = i1;
        } else
        {
            flag = false;
            j1 = i1;
        }
_L16:
        int k1;
        boolean flag1;
        if (flag)
        {
            return true;
        }
        switch (l1)
        {
        default:
            return false;

        case 0: // '\0'
            return super.onKeyDown(k, keyevent);

        case 1: // '\001'
            return super.onKeyUp(k, keyevent);

        case 2: // '\002'
            return super.onKeyMultiple(k, j1, keyevent);
        }
    }

    private boolean a(View view, View view1)
    {
        if (view == view1)
        {
            return true;
        }
        view = view.getParent();
        return (view instanceof ViewGroup) && a((View)view, view1);
    }

    private int b(int k, int i1, int j1)
    {
        int k1 = k;
        if (j1 != ao - 1)
        {
            k1 = k - i1;
        }
        return k1;
    }

    private static void b(Canvas canvas, Drawable drawable, Rect rect)
    {
        int k = drawable.getMinimumWidth();
        canvas.save();
        canvas.clipRect(rect);
        if (rect.right - rect.left < k)
        {
            rect.right = k + rect.left;
        }
        drawable.setBounds(rect);
        drawable.draw(canvas);
        canvas.restore();
    }

    private void b(View view, int k, int i1)
    {
        int k1 = view.getWidth();
        android.view.ViewGroup.LayoutParams layoutparams1 = view.getLayoutParams();
        android.view.ViewGroup.LayoutParams layoutparams = layoutparams1;
        if (layoutparams1 == null)
        {
            layoutparams = new android.view.ViewGroup.LayoutParams(-2, -1);
        }
        int l1 = getChildMeasureSpec(v, u.top + u.bottom, layoutparams.height);
        int j1 = layoutparams.width;
        if (j1 > 0)
        {
            j1 = android.view.View.MeasureSpec.makeMeasureSpec(j1, 0x40000000);
        } else
        {
            j1 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        }
        view.measure(j1, l1);
        if (view.getMeasuredWidth() != k1)
        {
            j1 = view.getMeasuredWidth();
            int i2 = view.getMeasuredHeight();
            int j2 = u.top;
            int k2 = view.getLeft();
            view.layout(k2, j2, j1 + k2, i2 + j2);
            j1 = view.getMeasuredWidth();
            for (k++; k < i1; k++)
            {
                getChildAt(k).offsetLeftAndRight(j1 - k1);
            }

        }
    }

    private boolean b(View view)
    {
        ArrayList arraylist = az;
        int j1 = arraylist.size();
        for (int k = 0; k < j1; k++)
        {
            if (view == ((y)arraylist.get(k)).a)
            {
                return true;
            }
        }

        arraylist = aA;
        j1 = arraylist.size();
        for (int i1 = 0; i1 < j1; i1++)
        {
            if (view == ((y)arraylist.get(i1)).a)
            {
                return true;
            }
        }

        return false;
    }

    private static int c(int k, int i1, int j1)
    {
        int k1 = k;
        if (j1 > 0)
        {
            k1 = k + i1;
        }
        return k1;
    }

    private int c(View view)
    {
        int k = 0;
        view.getDrawingRect(aH);
        offsetDescendantRectToMyCoords(view, aH);
        int i1 = getRight() - getLeft() - u.right;
        if (aH.right < u.left)
        {
            k = u.left - aH.right;
        } else
        if (aH.left > i1)
        {
            return aH.left - i1;
        }
        return k;
    }

    private View c(int k, int i1)
    {
        View view = null;
        int j1 = getRight();
        int k1 = getLeft();
        while (i1 < j1 - k1 && k < ao) 
        {
            View view1;
            boolean flag;
            if (k == am)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            view1 = a(k, i1, true, u.top, flag);
            i1 = view1.getRight() + av;
            if (flag)
            {
                view = view1;
            }
            k++;
        }
        getChildCount();
        return view;
    }

    private View d(int k, int i1)
    {
        View view = null;
        while (i1 > 0 && k >= 0) 
        {
            View view1;
            boolean flag;
            if (k == am)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            view1 = a(k, i1, false, u.top, flag);
            i1 = view1.getLeft() - av;
            if (flag)
            {
                view = view1;
            }
            k--;
        }
        V = k + 1;
        getChildCount();
        return view;
    }

    private View e(int k, int i1)
    {
        View view;
        View view1;
        View view6;
        View view2;
        View view4;
        boolean flag;
        if (k == am)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        view6 = a(k, i1, true, u.top, flag);
        V = k;
        i1 = av;
        if (K) goto _L2; else goto _L1
_L1:
        view2 = d(k - 1, view6.getLeft() - i1);
        B();
        view4 = c(k + 1, i1 + view6.getRight());
        k = getChildCount();
        view = view2;
        view1 = view4;
        if (k > 0)
        {
            o(k);
            view1 = view4;
            view = view2;
        }
_L4:
        if (flag)
        {
            return view6;
        }
        break; /* Loop/switch isn't completed */
_L2:
        View view3 = c(k + 1, view6.getRight() + i1);
        B();
        View view5 = d(k - 1, view6.getLeft() - i1);
        k = getChildCount();
        view = view5;
        view1 = view3;
        if (k > 0)
        {
            p(k);
            view = view5;
            view1 = view3;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (view != null)
        {
            return view;
        } else
        {
            return view1;
        }
    }

    private View n(int k)
    {
        V = Math.min(V, am);
        V = Math.min(V, ao - 1);
        if (V < 0)
        {
            V = 0;
        }
        return c(V, k);
    }

    private void o(int k)
    {
        if ((V + k) - 1 == ao - 1 && k > 0)
        {
            k = getChildAt(k - 1).getRight();
            int i1 = getRight() - getLeft() - u.right - k;
            View view = getChildAt(0);
            int j1 = view.getLeft();
            if (i1 > 0 && (V > 0 || j1 < u.top))
            {
                k = i1;
                if (V == 0)
                {
                    k = Math.min(i1, u.top - j1);
                }
                e(k);
                if (V > 0)
                {
                    d(V - 1, view.getLeft() - av);
                    B();
                }
            }
        }
    }

    private void p(int k)
    {
        if (V == 0 && k > 0)
        {
            int i1 = getChildAt(0).getLeft();
            int k1 = u.left;
            int j1 = getRight() - getLeft() - u.right;
            i1 -= k1;
            View view = getChildAt(k - 1);
            k1 = view.getRight();
            int l1 = (V + k) - 1;
            if (i1 > 0)
            {
                if (l1 < ao - 1 || k1 > j1)
                {
                    k = i1;
                    if (l1 == ao - 1)
                    {
                        k = Math.min(i1, k1 - j1);
                    }
                    e(-k);
                    if (l1 < ao - 1)
                    {
                        c(l1 + 1, view.getRight() + av);
                        B();
                    }
                } else
                if (l1 == ao - 1)
                {
                    B();
                    return;
                }
            }
        }
    }

    private boolean q(int k)
    {
        boolean flag;
        if (k == 33)
        {
            k = Math.max(0, am - getChildCount() - 1);
            flag = false;
        } else
        if (k == 130)
        {
            k = Math.min(ao - 1, (am + getChildCount()) - 1);
            flag = true;
        } else
        {
            k = -1;
            flag = false;
        }
        if (k >= 0)
        {
            k = a(k, flag);
            if (k >= 0)
            {
                h = 4;
                W = getPaddingLeft() + getHorizontalFadingEdgeLength();
                if (flag && k > ao - getChildCount())
                {
                    h = 3;
                }
                if (!flag && k < getChildCount())
                {
                    h = 1;
                }
                g(k);
                b();
                if (!awakenScrollBars())
                {
                    invalidate();
                }
                return true;
            }
        }
        return false;
    }

    private boolean r(int k)
    {
        boolean flag1 = true;
        if (k != 33) goto _L2; else goto _L1
_L1:
        if (am == 0) goto _L4; else goto _L3
_L3:
        boolean flag;
        k = a(0, true);
        flag = flag1;
        if (k >= 0)
        {
            h = 1;
            g(k);
            b();
            flag = flag1;
        }
_L6:
        if (flag && !awakenScrollBars())
        {
            awakenScrollBars();
            invalidate();
        }
        return flag;
_L2:
        if (k == 130 && am < ao - 1)
        {
            k = a(ao - 1, true);
            flag = flag1;
            if (k >= 0)
            {
                h = 3;
                g(k);
                b();
                flag = flag1;
            }
            continue; /* Loop/switch isn't completed */
        }
_L4:
        flag = false;
        if (true) goto _L6; else goto _L5
_L5:
    }

    private boolean s(int k)
    {
        if (k != 33 && k != 130)
        {
            throw new IllegalArgumentException("direction must be one of {View.FOCUS_UP, View.FOCUS_DOWN}");
        }
        int i1 = getChildCount();
        if (aG && i1 > 0 && am != -1)
        {
            View view1 = f();
            if (view1 != null && view1.hasFocus() && (view1 instanceof ViewGroup))
            {
                View view = view1.findFocus();
                view1 = FocusFinder.getInstance().findNextFocus((ViewGroup)view1, view, k);
                if (view1 != null)
                {
                    view.getFocusedRect(aH);
                    offsetDescendantRectToMyCoords(view, aH);
                    offsetRectIntoDescendantCoords(view1, aH);
                    if (view1.requestFocus(k, aH))
                    {
                        return true;
                    }
                }
                view = FocusFinder.getInstance().findNextFocus((ViewGroup)getRootView(), view, k);
                if (view != null)
                {
                    return a(view, this);
                }
            }
        }
        return false;
    }

    private boolean t(int k)
    {
        af = true;
        if (getChildCount() <= 0) goto _L2; else goto _L1
_L1:
        View view;
        int j1;
        int k1;
        int l1;
        int i2;
        int j2;
        view = f();
        l1 = am;
        k1 = u(k);
        j1 = getWidth() - u.right;
        i2 = u.left;
        j2 = getChildCount();
        if (k != 130) goto _L4; else goto _L3
_L3:
        int i1;
        i1 = j2 - 1;
        if (k1 == -1)
        {
            break MISSING_BLOCK_LABEL_87;
        }
        i1 = k1 - V;
        Object obj;
        i2 = V;
        obj = getChildAt(i1);
        if (i2 + i1 >= ao - 1) goto _L6; else goto _L5
_L5:
        i1 = j1 - C();
_L57:
        if (((View) (obj)).getRight() > i1) goto _L8; else goto _L7
_L7:
        i1 = 0;
_L27:
        if (!aG) goto _L10; else goto _L9
_L9:
        obj = f();
        if (obj == null) goto _L12; else goto _L11
_L11:
        if (!((View) (obj)).hasFocus()) goto _L12; else goto _L13
_L13:
        obj = ((View) (obj)).findFocus();
        obj = FocusFinder.getInstance().findNextFocus(this, ((View) (obj)), k);
_L36:
        if (obj == null) goto _L15; else goto _L14
_L14:
        i2 = getChildCount();
        j1 = 0;
_L63:
        if (j1 >= i2) goto _L17; else goto _L16
_L16:
        if (!a(((View) (obj)), getChildAt(j1))) goto _L19; else goto _L18
_L18:
        j2 = V + j1;
        if (am == -1 || j2 == am) goto _L21; else goto _L20
_L20:
        j1 = u(k);
          goto _L22
_L42:
        j1 = i1;
        i1 = k1;
        if (obj == null) goto _L24; else goto _L23
_L23:
        i1 = ((x) (obj)).a();
        j1 = ((x) (obj)).b();
          goto _L24
_L60:
        if (i1 != -1) goto _L26; else goto _L25
_L25:
        throw new IllegalArgumentException("newSelectedPosition needs to be valid");
        obj;
        af = false;
        throw obj;
_L8:
        if (k1 == -1)
        {
            break MISSING_BLOCK_LABEL_341;
        }
        if (i1 - ((View) (obj)).getLeft() < A())
        {
            break MISSING_BLOCK_LABEL_341;
        }
        i1 = 0;
          goto _L27
        i2 = ((View) (obj)).getRight() - i1;
        i1 = i2;
        if (V + j2 == ao)
        {
            i1 = Math.min(i2, getChildAt(j2 - 1).getRight() - j1);
        }
        i1 = Math.min(i1, A());
          goto _L27
_L4:
        i1 = 0;
        if (k1 == -1)
        {
            break MISSING_BLOCK_LABEL_421;
        }
        i1 = k1 - V;
        j1 = V;
        obj = getChildAt(i1);
        if (j1 + i1 <= 0) goto _L29; else goto _L28
_L28:
        i1 = C() + i2;
_L56:
        if (((View) (obj)).getLeft() < i1) goto _L31; else goto _L30
_L30:
        i1 = 0;
          goto _L27
_L31:
        if (k1 == -1)
        {
            break MISSING_BLOCK_LABEL_492;
        }
        if (((View) (obj)).getRight() - i1 < A())
        {
            break MISSING_BLOCK_LABEL_492;
        }
        i1 = 0;
          goto _L27
        j1 = i1 - ((View) (obj)).getLeft();
        i1 = j1;
        if (V == 0)
        {
            i1 = Math.min(j1, i2 - getChildAt(0).getLeft());
        }
        i1 = Math.min(i1, A());
          goto _L27
_L12:
        if (k != 130) goto _L33; else goto _L32
_L32:
        View view1;
        boolean flag;
        int k2;
        boolean flag2;
        if (V > 0)
        {
            j1 = 1;
        } else
        {
            j1 = 0;
        }
        i2 = u.left;
        if (j1 == 0) goto _L35; else goto _L34
_L34:
        j1 = C();
_L61:
        i2 = j1 + i2;
        j1 = i2;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_615;
        }
        j1 = i2;
        if (((View) (obj)).getLeft() > i2)
        {
            j1 = ((View) (obj)).getLeft();
        }
        aH.set(j1, 0, j1, 0);
_L39:
        obj = FocusFinder.getInstance().findNextFocusFromRect(this, aH, k);
          goto _L36
_L33:
        if ((V + getChildCount()) - 1 < ao)
        {
            j1 = 1;
        } else
        {
            j1 = 0;
        }
        i2 = getWidth();
        j2 = u.right;
        if (j1 == 0) goto _L38; else goto _L37
_L37:
        j1 = C();
_L62:
        i2 = i2 - j2 - j1;
        j1 = i2;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_728;
        }
        j1 = i2;
        if (((View) (obj)).getRight() < i2)
        {
            j1 = ((View) (obj)).getRight();
        }
        aH.set(j1, 0, j1, 0);
          goto _L39
_L17:
        throw new IllegalArgumentException("newFocus is not a child of any of the children of the list!");
_L21:
        j1 = 0;
        ((View) (obj)).getDrawingRect(aH);
        offsetDescendantRectToMyCoords(((View) (obj)), aH);
        if (k != 33) goto _L41; else goto _L40
_L40:
        if (aH.left >= u.left)
        {
            break MISSING_BLOCK_LABEL_833;
        }
        i2 = u.left - aH.left;
        j1 = i2;
        if (j2 <= 0)
        {
            break MISSING_BLOCK_LABEL_833;
        }
        j1 = i2 + C();
_L44:
        i2 = A();
        if (j1 >= i2)
        {
            break MISSING_BLOCK_LABEL_936;
        }
        ((View) (obj)).requestFocus(k);
        aJ.a(j2, j1);
        obj = aJ;
          goto _L42
_L41:
        i2 = getWidth() - u.right;
        if (aH.bottom <= i2) goto _L44; else goto _L43
_L43:
        i2 = aH.right - i2;
        j1 = i2;
        if (j2 >= ao - 1) goto _L44; else goto _L45
_L45:
        j1 = i2 + C();
          goto _L44
        if (c(((View) (obj))) >= i2) goto _L15; else goto _L46
_L46:
        ((View) (obj)).requestFocus(k);
        aJ.a(j2, i2);
        obj = aJ;
          goto _L42
_L26:
        l1 = am - V;
        i2 = i1 - V;
        if (k != 33) goto _L48; else goto _L47
_L47:
        view1 = getChildAt(i2);
        boolean flag1 = true;
        j2 = i2;
        i2 = l1;
        l1 = ((flag1) ? 1 : 0);
_L53:
        k2 = getChildCount();
        if (view1 == null) goto _L50; else goto _L49
_L49:
        if (!flag && l1 != 0)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        view1.setSelected(flag2);
        b(view1, j2, k2);
          goto _L50
_L54:
        view.setSelected(flag2);
        b(view, i2, k2);
_L65:
        l(i1);
        m(i1);
        view = f();
        if (!aG || obj != null)
        {
            break MISSING_BLOCK_LABEL_1123;
        }
        view1 = getFocusedChild();
        if (view1 == null)
        {
            break MISSING_BLOCK_LABEL_1123;
        }
        view1.clearFocus();
        flag = true;
        w();
        l1 = i1;
          goto _L51
_L70:
        v(j1);
        flag = true;
_L69:
        if (!aG || obj != null || view == null)
        {
            break MISSING_BLOCK_LABEL_1194;
        }
        if (view.hasFocus())
        {
            obj = view.findFocus();
            if (!a(((View) (obj)), this) || c(((View) (obj))) > 0)
            {
                ((View) (obj)).clearFocus();
            }
        }
        obj = view;
        if (i1 != -1)
        {
            break MISSING_BLOCK_LABEL_1230;
        }
        obj = view;
        if (view == null)
        {
            break MISSING_BLOCK_LABEL_1230;
        }
        obj = view;
        if (a(view, this))
        {
            break MISSING_BLOCK_LABEL_1230;
        }
        obj = null;
        k();
        M = -1;
        if (!flag) goto _L2; else goto _L52
_L52:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_1254;
        }
        a(l1, ((View) (obj)));
        J = ((View) (obj)).getLeft();
        if (!awakenScrollBars())
        {
            invalidate();
        }
        b();
        flag2 = true;
_L55:
        if (!flag2)
        {
            break MISSING_BLOCK_LABEL_1285;
        }
        playSoundEffect(SoundEffectConstants.getContantForFocusDirection(k));
        af = false;
        return flag2;
_L48:
        view1 = getChildAt(i2);
        View view2 = view;
        j2 = l1;
        l1 = 0;
        view = view1;
        view1 = view2;
          goto _L53
_L67:
        flag2 = false;
          goto _L54
_L71:
        j1 = -j1;
        break; /* Loop/switch isn't completed */
_L2:
        flag2 = false;
          goto _L55
_L29:
        i1 = i2;
          goto _L56
_L6:
        i1 = j1;
          goto _L57
_L22:
        if (j1 == -1 || (k != 130 || j1 >= j2) && (k != 33 || j1 <= j2)) goto _L21; else goto _L58
_L58:
        obj = null;
          goto _L42
_L24:
        if (obj != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (i1 == -1) goto _L51; else goto _L59
_L59:
        if (obj != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
          goto _L60
_L35:
        j1 = 0;
          goto _L61
_L38:
        j1 = 0;
          goto _L62
_L19:
        j1++;
          goto _L63
_L15:
        obj = null;
          goto _L42
_L10:
        obj = null;
          goto _L42
_L50:
        if (view == null) goto _L65; else goto _L64
_L64:
        if (flag || l1 != 0) goto _L67; else goto _L66
_L66:
        flag2 = true;
          goto _L54
_L51:
        if (j1 <= 0) goto _L69; else goto _L68
_L68:
        if (k != 33) goto _L71; else goto _L70
    }

    private int u(int k)
    {
        int k1 = V;
        if (k != 130) goto _L2; else goto _L1
_L1:
        int i1;
        if (am != -1)
        {
            i1 = am + 1;
        } else
        {
            i1 = k1;
        }
        if (i1 < j.getCount()) goto _L4; else goto _L3
_L3:
        k = -1;
_L6:
        return k;
_L4:
        ListAdapter listadapter;
        int l1;
        k = i1;
        if (i1 < k1)
        {
            k = k1;
        }
        l1 = u();
        listadapter = j;
        i1 = k;
_L7:
        if (i1 > l1)
        {
            break MISSING_BLOCK_LABEL_220;
        }
        if (!listadapter.isEnabled(i1))
        {
            break; /* Loop/switch isn't completed */
        }
        k = i1;
        if (getChildAt(i1 - k1).getVisibility() == 0) goto _L6; else goto _L5
_L5:
        i1++;
          goto _L7
_L2:
        int j1 = (getChildCount() + k1) - 1;
        if (am != -1)
        {
            k = am - 1;
        } else
        {
            k = (getChildCount() + k1) - 1;
        }
        if (k < 0 || k >= j.getCount())
        {
            return -1;
        }
        ListAdapter listadapter1;
        if (k <= j1)
        {
            j1 = k;
        }
        listadapter1 = j;
        if (j1 < k1) goto _L9; else goto _L8
_L8:
        if (!listadapter1.isEnabled(j1))
        {
            continue; /* Loop/switch isn't completed */
        }
        k = j1;
        if (getChildAt(j1 - k1).getVisibility() != 0)
        {
            j1--;
            break MISSING_BLOCK_LABEL_181;
        }
        if (true) goto _L6; else goto _L9
_L9:
        return -1;
    }

    private void v(int k)
    {
        e(k);
        int j1 = getWidth() - u.right;
        int i1 = u.left;
        n n1 = p;
        if (k < 0)
        {
            k = getChildCount();
            View view = getChildAt(k - 1);
            do
            {
                if (view.getRight() >= j1)
                {
                    break;
                }
                int k1 = (V + k) - 1;
                if (k1 >= ao - 1)
                {
                    break;
                }
                k1++;
                View view2 = a(k1, P);
                int l1 = view.getRight();
                a(view2, k1, av + l1, true, u.top, false, P[0]);
                k++;
                view = view2;
            } while (true);
            if (view.getBottom() < j1)
            {
                e(j1 - view.getRight());
            }
            view = getChildAt(0);
            while (view.getRight() < i1) 
            {
                if (((AbsHListView.LayoutParams)view.getLayoutParams()).a >= 0)
                {
                    k = 1;
                } else
                {
                    k = 0;
                }
                if (k != 0)
                {
                    detachViewFromParent(view);
                    n1.a(view, V);
                } else
                {
                    removeViewInLayout(view);
                }
                view = getChildAt(0);
                V = V + 1;
            }
        } else
        {
            View view1;
            View view3;
            for (view1 = getChildAt(0); view1.getLeft() > i1 && V > 0; view1 = view3)
            {
                k = V - 1;
                view3 = a(k, P);
                a(view3, k, view1.getLeft() - av, false, u.top, false, P[0]);
                V = V - 1;
            }

            if (view1.getLeft() > i1)
            {
                e(i1 - view1.getLeft());
            }
            k = getChildCount() - 1;
            view1 = getChildAt(k);
            while (view1.getLeft() > j1) 
            {
                boolean flag;
                if (((AbsHListView.LayoutParams)view1.getLayoutParams()).a >= 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (flag)
                {
                    detachViewFromParent(view1);
                    n1.a(view1, V + k);
                } else
                {
                    removeViewInLayout(view1);
                }
                k--;
                view1 = getChildAt(k);
            }
        }
    }

    protected final int a(int k, boolean flag)
    {
        ListAdapter listadapter = j;
        if (listadapter != null && !isInTouchMode()) goto _L2; else goto _L1
_L1:
        int i1 = -1;
_L4:
        return i1;
_L2:
        int j1;
        j1 = listadapter.getCount();
        if (aF)
        {
            break MISSING_BLOCK_LABEL_137;
        }
        if (flag)
        {
            i1 = Math.max(0, k);
            do
            {
                k = i1;
                if (i1 >= j1)
                {
                    break;
                }
                k = i1;
                if (listadapter.isEnabled(i1))
                {
                    break;
                }
                i1++;
            } while (true);
        } else
        {
            i1 = Math.min(k, j1 - 1);
            do
            {
                k = i1;
                if (i1 < 0)
                {
                    break;
                }
                k = i1;
                if (listadapter.isEnabled(i1))
                {
                    break;
                }
                i1--;
            } while (true);
        }
        if (k < 0)
        {
            break; /* Loop/switch isn't completed */
        }
        i1 = k;
        if (k < j1) goto _L4; else goto _L3
_L3:
        return -1;
        if (k < 0)
        {
            break; /* Loop/switch isn't completed */
        }
        i1 = k;
        if (k < j1) goto _L4; else goto _L5
_L5:
        return -1;
    }

    public final void a(ListAdapter listadapter)
    {
        if (j != null && i != null)
        {
            j.unregisterDataSetObserver(i);
        }
        c();
        p.b();
        if (az.size() > 0 || aA.size() > 0)
        {
            j = new aa(az, aA, listadapter);
        } else
        {
            j = listadapter;
        }
        ar = -1;
        as = 0x8000000000000000L;
        super.a(listadapter);
        if (j != null)
        {
            aF = j.areAllItemsEnabled();
            ap = ao;
            ao = j.getCount();
            v();
            i = new c(this);
            j.registerDataSetObserver(i);
            p.a(j.getViewTypeCount());
            int k;
            if (K)
            {
                k = a(ao - 1, false);
            } else
            {
                k = a(0, true);
            }
            l(k);
            m(k);
            if (ao == 0)
            {
                w();
            }
        } else
        {
            aF = true;
            v();
            w();
        }
        requestLayout();
    }

    protected final void a(boolean flag)
    {
        int k = 0;
        int i1 = getChildCount();
        if (flag)
        {
            if (i1 > 0)
            {
                k = getChildAt(i1 - 1).getRight() + av;
            }
            c(i1 + V, k);
            o(getChildCount());
            return;
        }
        if (i1 > 0)
        {
            k = getChildAt(0).getLeft() - av;
        } else
        {
            k = getWidth() + 0;
        }
        d(V - 1, k);
        p(getChildCount());
    }

    public final void b(int k, int i1)
    {
        if (j != null)
        {
            if (!isInTouchMode())
            {
                int j1 = a(k, true);
                k = j1;
                if (j1 >= 0)
                {
                    m(j1);
                    k = j1;
                }
            } else
            {
                M = k;
            }
            if (k >= 0)
            {
                h = 4;
                W = u.left + i1;
                if (ad)
                {
                    aa = k;
                    ab = j.getItemId(k);
                }
                if (I != null)
                {
                    I.a();
                }
                requestLayout();
                return;
            }
        }
    }

    protected final void c()
    {
        a(az);
        a(aA);
        super.c();
        h = 0;
    }

    public final void c(int k)
    {
        super.c(k);
    }

    protected boolean canAnimate()
    {
        return super.canAnimate() && ao > 0;
    }

    protected final void d()
    {
        boolean flag = at;
        if (flag) goto _L2; else goto _L1
_L1:
        at = true;
        super.d();
        invalidate();
        if (j != null) goto _L4; else goto _L3
_L3:
        c();
        b();
        if (!flag)
        {
            at = false;
        }
_L2:
        return;
_L4:
        int i1;
        int k1;
        int l1;
        i1 = u.left;
        k1 = getRight() - getLeft() - u.right;
        l1 = getChildCount();
        Object obj;
        View view;
        View view2;
        View view3;
        int k;
        int j1;
        j1 = 0;
        k = 0;
        view3 = null;
        obj = null;
        view = null;
        view2 = null;
        h;
        JVM INSTR tableswitch 1 5: default 1228
    //                   1 1231
    //                   2 252
    //                   3 1231
    //                   4 1231
    //                   5 1231;
           goto _L5 _L6 _L7 _L6 _L6 _L6
_L5:
        j1 = am - V;
        View view1;
        view1 = ((View) (obj));
        if (j1 < 0)
        {
            break MISSING_BLOCK_LABEL_174;
        }
        view1 = ((View) (obj));
        if (j1 >= l1)
        {
            break MISSING_BLOCK_LABEL_174;
        }
        view1 = getChildAt(j1);
        obj = getChildAt(0);
        if (ak >= 0)
        {
            k = ak - am;
        }
        view = getChildAt(j1 + k);
        view3 = view1;
_L15:
        boolean flag1 = aj;
        if (!flag1) goto _L9; else goto _L8
_L8:
        n();
_L9:
        if (ao != 0) goto _L11; else goto _L10
_L10:
        c();
        b();
        if (flag) goto _L2; else goto _L12
_L12:
        at = false;
        return;
_L7:
        k = ak - V;
        if (k < 0 || k >= l1) goto _L14; else goto _L13
_L13:
        view = getChildAt(k);
        obj = null;
        k = j1;
          goto _L15
_L11:
        if (ao != j.getCount())
        {
            throw new IllegalStateException((new StringBuilder("The content of the adapter has changed but ListView did not receive a notification. Make sure the content of your adapter is not modified from a background thread, but only from the UI thread. [in ListView(")).append(getId()).append(", ").append(getClass()).append(") with Adapter(").append(j.getClass()).append(")]").toString());
        }
          goto _L16
        obj;
        if (!flag)
        {
            at = false;
        }
        throw obj;
_L16:
        n n1;
        int i2;
        l(ak);
        i2 = V;
        n1 = p;
        view1 = null;
        if (!flag1) goto _L18; else goto _L17
_L17:
        j1 = 0;
_L20:
        if (j1 >= l1)
        {
            break; /* Loop/switch isn't completed */
        }
        n1.a(getChildAt(j1), i2 + j1);
        j1++;
        if (true) goto _L20; else goto _L19
_L18:
        n1.a(l1, i2);
_L19:
        View view4 = getFocusedChild();
        if (view4 == null) goto _L22; else goto _L21
_L21:
        if (!flag1) goto _L24; else goto _L23
_L23:
        if (!b(view4)) goto _L25; else goto _L24
_L24:
        view2 = findFocus();
        if (view2 == null) goto _L27; else goto _L26
_L26:
        view2.onStartTemporaryDetach();
          goto _L27
_L25:
        requestFocus();
        view4 = view1;
        view1 = view2;
        view2 = view4;
_L75:
        detachAllViewsFromParent();
        n1.d();
        h;
        JVM INSTR tableswitch 1 6: default 1246
    //                   1 924
    //                   2 771
    //                   3 904
    //                   4 943
    //                   5 888
    //                   6 959;
           goto _L28 _L29 _L30 _L31 _L32 _L33 _L34
_L28:
        if (l1 != 0) goto _L36; else goto _L35
_L35:
        if (K) goto _L38; else goto _L37
_L37:
        l(a(0, true));
        obj = n(i1);
_L55:
        n1.e();
        if (obj == null) goto _L40; else goto _L39
_L39:
        if (!aG || !hasFocus() || ((View) (obj)).hasFocus()) goto _L42; else goto _L41
_L41:
        if (obj != view2 || view1 == null) goto _L44; else goto _L43
_L43:
        if (view1.requestFocus()) goto _L45; else goto _L44
_L44:
        if (!((View) (obj)).requestFocus()) goto _L46; else goto _L45
_L76:
        if (k != 0) goto _L48; else goto _L47
_L47:
        view = getFocusedChild();
        if (view == null) goto _L50; else goto _L49
_L49:
        view.clearFocus();
_L50:
        a(-1, ((View) (obj)));
_L68:
        J = ((View) (obj)).getLeft();
_L74:
        if (view1 == null) goto _L52; else goto _L51
_L51:
        if (view1.getWindowToken() != null)
        {
            view1.onFinishTemporaryDetach();
        }
_L52:
        h = 0;
        aj = false;
        if (O != null)
        {
            post(O);
            O = null;
        }
        ad = false;
        m(am);
        e();
        if (ao > 0)
        {
            w();
        }
        b();
        if (!flag)
        {
            at = false;
            return;
        }
          goto _L2
_L30:
        if (view == null) goto _L54; else goto _L53
_L53:
        obj = a(view.getLeft(), i1, k1);
          goto _L55
_L54:
        k = k1 - i1;
        j1 = l();
        obj = a(j1, i1, true, u.top, true);
        V = j1;
        i1 = ((View) (obj)).getMeasuredWidth();
        if (i1 > k) goto _L57; else goto _L56
_L56:
        ((View) (obj)).offsetLeftAndRight((k - i1) / 2);
_L57:
        a(((View) (obj)), j1);
        if (K) goto _L59; else goto _L58
_L58:
        o(getChildCount());
          goto _L55
_L59:
        p(getChildCount());
          goto _L55
_L33:
        obj = e(aa, W);
          goto _L55
_L31:
        obj = d(ao - 1, k1);
        B();
          goto _L55
_L29:
        V = 0;
        obj = n(i1);
        B();
          goto _L55
_L32:
        obj = e(l(), W);
          goto _L55
_L34:
        obj = a(view3, view, k, i1, k1);
          goto _L55
_L38:
        l(a(ao - 1, false));
        obj = d(ao - 1, k1);
          goto _L55
_L36:
        if (am < 0 || am >= ao) goto _L61; else goto _L60
_L60:
        k = am;
        if (view3 != null) goto _L63; else goto _L62
_L62:
        obj = e(k, i1);
          goto _L55
_L63:
        i1 = view3.getLeft();
          goto _L62
_L61:
        if (V >= ao) goto _L65; else goto _L64
_L64:
        k = V;
        if (obj != null) goto _L67; else goto _L66
_L66:
        obj = e(k, i1);
          goto _L55
_L67:
        i1 = ((View) (obj)).getLeft();
          goto _L66
_L65:
        obj = e(0, i1);
          goto _L55
_L48:
        ((View) (obj)).setSelected(false);
        o.setEmpty();
          goto _L68
_L42:
        a(-1, ((View) (obj)));
          goto _L68
_L40:
        if (F <= 0 || F >= 3) goto _L70; else goto _L69
_L69:
        obj = getChildAt(A - V);
        if (obj == null) goto _L72; else goto _L71
_L71:
        a(A, ((View) (obj)));
_L72:
        if (!hasFocus() || view1 == null) goto _L74; else goto _L73
_L73:
        view1.requestFocus();
          goto _L74
_L70:
        J = 0;
        o.setEmpty();
          goto _L72
_L22:
        view2 = null;
        view1 = null;
          goto _L75
_L14:
        obj = null;
        k = j1;
          goto _L15
_L6:
        obj = null;
        k = j1;
          goto _L15
_L27:
        view1 = view4;
          goto _L25
_L45:
        k = 1;
          goto _L76
_L46:
        k = 0;
          goto _L76
    }

    protected void dispatchDraw(Canvas canvas)
    {
        Drawable drawable;
        Drawable drawable1;
        Rect rect;
        ListAdapter listadapter;
        Paint paint;
        int k;
        boolean flag;
        int j1;
        boolean flag1;
        int l2;
        int i3;
        int j3;
        int k3;
        int l3;
        int i4;
        int j4;
        boolean flag2;
        boolean flag3;
        boolean flag4;
        if (y)
        {
            z = true;
        }
        l2 = av;
        drawable = ax;
        drawable1 = ay;
        int k1;
        int i2;
        if (drawable != null)
        {
            k = 1;
        } else
        {
            k = 0;
        }
        if (drawable1 != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (l2 > 0 && au != null)
        {
            j1 = 1;
        } else
        {
            j1 = 0;
        }
        if (j1 == 0 && k == 0 && !flag) goto _L2; else goto _L1
_L1:
        rect = aH;
        rect.top = getPaddingTop();
        rect.bottom = getBottom() - getTop() - getPaddingBottom();
        i3 = getChildCount();
        k3 = az.size();
        j4 = ao;
        l3 = j4 - aA.size() - 1;
        flag2 = aD;
        flag3 = aE;
        j3 = V;
        flag4 = aF;
        listadapter = j;
        if (isOpaque() && !super.isOpaque())
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag1 && aI == null && aB)
        {
            aI = new Paint();
            aI.setColor(o());
        }
        paint = aI;
        k1 = getRight();
        i2 = getLeft();
        i4 = getScrollX() + ((k1 - i2) + 0);
        if (K) goto _L4; else goto _L3
_L3:
        i2 = 0;
        k1 = getScrollX();
        if (i3 <= 0 || k1 >= 0) goto _L6; else goto _L5
_L5:
        if (k == 0) goto _L8; else goto _L7
_L7:
        rect.right = 0;
        rect.left = k1;
        a(canvas, drawable, rect);
          goto _L6
_L8:
        if (j1 != 0)
        {
            rect.right = 0;
            rect.left = -l2;
            a(canvas, rect);
        }
        continue; /* Loop/switch isn't completed */
_L6:
        k1 = 0;
        k = i2;
label0:
        do
        {
label1:
            {
                if (k1 >= i3)
                {
                    break label0;
                }
                int j2;
                if (!flag2)
                {
                    j2 = k;
                    if (j3 + k1 < k3)
                    {
                        break label1;
                    }
                }
                if (!flag3)
                {
                    j2 = k;
                    if (j3 + k1 >= l3)
                    {
                        break label1;
                    }
                }
                k = getChildAt(k1).getRight();
                j2 = k;
                if (j1 == 0)
                {
                    break label1;
                }
                j2 = k;
                if (k >= i4)
                {
                    break label1;
                }
                if (flag)
                {
                    j2 = k;
                    if (k1 == i3 - 1)
                    {
                        break label1;
                    }
                }
                if (flag4 || listadapter.isEnabled(j3 + k1) && (k1 == i3 - 1 || listadapter.isEnabled(j3 + k1 + 1)))
                {
                    rect.left = k;
                    rect.right = k + l2;
                    a(canvas, rect);
                    j2 = k;
                } else
                {
                    j2 = k;
                    if (flag1)
                    {
                        rect.left = k;
                        rect.right = k + l2;
                        canvas.drawRect(rect, paint);
                        j2 = k;
                    }
                }
            }
            k1++;
            k = j2;
        } while (true);
        j1 = getRight() + getScrollX();
        if (flag && j3 + i3 == j4 && j1 > k)
        {
            rect.left = k;
            rect.right = j1;
            b(canvas, drawable1, rect);
        }
_L2:
        super.dispatchDraw(canvas);
        return;
_L4:
        int l1 = getScrollX();
        if (i3 > 0 && k != 0)
        {
            rect.left = l1;
            rect.right = getChildAt(0).getLeft();
            a(canvas, drawable, rect);
        }
        if (k != 0)
        {
            k = 1;
        } else
        {
            k = 0;
        }
        while (k < i3) 
        {
            if (!flag2 && j3 + k < k3 || !flag3 && j3 + k >= l3)
            {
                continue;
            }
            int k2 = getChildAt(k).getLeft();
            if (k2 > 0)
            {
                if (flag4 || listadapter.isEnabled(j3 + k) && (k == i3 - 1 || listadapter.isEnabled(j3 + k + 1)))
                {
                    rect.left = k2 - l2;
                    rect.right = k2;
                    a(canvas, rect);
                } else
                if (flag1)
                {
                    rect.left = k2 - l2;
                    rect.right = k2;
                    canvas.drawRect(rect, paint);
                }
            }
            k++;
        }
        if (i3 > 0 && l1 > 0)
        {
            if (flag)
            {
                int i1 = getRight();
                rect.left = i1;
                rect.right = i1 + l1;
                b(canvas, drawable1, rect);
            } else
            if (j1 != 0)
            {
                rect.left = i4;
                rect.right = i4 + l2;
                a(canvas, rect);
            }
        }
        if (true) goto _L2; else goto _L9
_L9:
        if (true) goto _L6; else goto _L10
_L10:
    }

    protected boolean drawChild(Canvas canvas, View view, long l1)
    {
        boolean flag = super.drawChild(canvas, view, l1);
        if (z)
        {
            z = false;
        }
        return flag;
    }

    protected final int f(int k)
    {
        int k1 = getChildCount();
        if (k1 > 0)
        {
            if (!K)
            {
                for (int i1 = 0; i1 < k1; i1++)
                {
                    if (k <= getChildAt(i1).getRight())
                    {
                        return i1 + V;
                    }
                }

            } else
            {
                for (int j1 = k1 - 1; j1 >= 0; j1--)
                {
                    if (k >= getChildAt(j1).getLeft())
                    {
                        return j1 + V;
                    }
                }

            }
        }
        return -1;
    }

    public final void g(int k)
    {
        boolean flag;
        int i1;
        flag = true;
        m(k);
        i1 = am;
        break MISSING_BLOCK_LABEL_12;
        if (i1 < 0 || k != i1 - 1 && k != i1 + 1)
        {
            flag = false;
        }
        if (I != null)
        {
            I.a();
        }
        d();
        if (flag)
        {
            awakenScrollBars();
        }
        return;
    }

    public final void h(int k)
    {
        boolean flag;
        if (k >>> 24 == 255)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        aB = flag;
        if (flag)
        {
            if (aI == null)
            {
                aI = new Paint();
            }
            aI.setColor(k);
        }
        super.h(k);
    }

    public final int i()
    {
        return az.size();
    }

    public final void i(int k)
    {
        b(k, 0);
    }

    public boolean isOpaque()
    {
        boolean flag;
        if (z && aB && aC || super.isOpaque())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            View view;
            int k;
            if (u != null)
            {
                k = u.left;
            } else
            {
                k = getPaddingLeft();
            }
            view = getChildAt(0);
            if (view == null || view.getLeft() > k)
            {
                return false;
            }
            int i1 = getWidth();
            if (u != null)
            {
                k = u.right;
            } else
            {
                k = getPaddingRight();
            }
            view = getChildAt(getChildCount() - 1);
            if (view == null || view.getRight() < i1 - k)
            {
                return false;
            }
        }
        return flag;
    }

    public final int j()
    {
        return aA.size();
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        int i1 = getChildCount();
        if (i1 > 0)
        {
            for (int k = 0; k < i1; k++)
            {
                View view = getChildAt(k);
                if (j != null && !(j instanceof aa))
                {
                    throw new IllegalStateException("Cannot add header view to list -- setAdapter has already been called.");
                }
                y y1 = new y();
                y1.a = view;
                y1.b = null;
                y1.c = true;
                az.add(y1);
                if (j != null && i != null)
                {
                    i.onChanged();
                }
            }

            removeAllViews();
        }
    }

    protected void onFocusChanged(boolean flag, int k, Rect rect)
    {
        ListAdapter listadapter;
        int i1;
        int j1;
        int k1;
        int i2;
        int j2;
        super.onFocusChanged(flag, k, rect);
        listadapter = j;
        i2 = -1;
        k1 = 0;
        j2 = 0;
        i1 = k1;
        j1 = i2;
        if (listadapter == null) goto _L2; else goto _L1
_L1:
        i1 = k1;
        j1 = i2;
        if (!flag) goto _L2; else goto _L3
_L3:
        i1 = k1;
        j1 = i2;
        if (rect == null) goto _L2; else goto _L4
_L4:
        Rect rect1;
        int k2;
        int l2;
        int i3;
        int j3;
        rect.offset(getScrollX(), getScrollY());
        if (listadapter.getCount() < getChildCount() + V)
        {
            h = 0;
            d();
        }
        rect1 = aH;
        l2 = 0x7fffffff;
        i3 = getChildCount();
        j3 = V;
        k2 = 0;
_L12:
        i1 = j2;
        j1 = i2;
        if (k2 >= i3) goto _L2; else goto _L5
_L5:
        View view;
        if (!listadapter.isEnabled(j3 + k2))
        {
            break MISSING_BLOCK_LABEL_581;
        }
        view = getChildAt(k2);
        view.getDrawingRect(rect1);
        offsetDescendantRectToMyCoords(view, rect1);
        k;
        JVM INSTR lookupswitch 6: default 236
    //                   1: 494
    //                   2: 494
    //                   17: 402
    //                   33: 446
    //                   66: 247
    //                   130: 354;
           goto _L6 _L7 _L7 _L8 _L9 _L10 _L11
_L6:
        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT, FOCUS_FORWARD, FOCUS_BACKWARD}.");
_L10:
        int l1;
        j1 = rect.right;
        l1 = rect.top + rect.height() / 2;
        i1 = rect1.left;
        k1 = rect1.top + rect1.height() / 2;
_L13:
        i1 -= j1;
        j1 = k1 - l1;
        i1 = i1 * i1 + j1 * j1;
        if (i1 >= l2)
        {
            break MISSING_BLOCK_LABEL_581;
        }
        j1 = view.getLeft();
        k1 = k2;
_L14:
        k2++;
        l2 = i1;
        j2 = j1;
        i2 = k1;
          goto _L12
_L11:
        i1 = rect.left;
        j1 = rect.width() / 2 + i1;
        l1 = rect.bottom;
        i1 = rect1.left + rect1.width() / 2;
        k1 = rect1.top;
          goto _L13
_L8:
        j1 = rect.left;
        l1 = rect.top + rect.height() / 2;
        i1 = rect1.right;
        k1 = rect1.top + rect1.height() / 2;
          goto _L13
_L9:
        i1 = rect.left;
        j1 = rect.width() / 2 + i1;
        l1 = rect.top;
        i1 = rect1.left + rect1.width() / 2;
        k1 = rect1.bottom;
          goto _L13
_L7:
        i1 = rect.right;
        j1 = rect.width() / 2 + i1;
        l1 = rect.top + rect.height() / 2;
        i1 = rect1.left + rect1.width() / 2;
        k1 = rect1.top + rect1.height() / 2;
          goto _L13
_L2:
        if (j1 >= 0)
        {
            b(V + j1, i1);
            return;
        } else
        {
            requestLayout();
            return;
        }
        i1 = l2;
        j1 = j2;
        k1 = i2;
          goto _L14
    }

    public void onGlobalLayout()
    {
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityevent)
    {
        super.onInitializeAccessibilityEvent(accessibilityevent);
        accessibilityevent.setClassName(com/roidapp/baselib/hlistview/HListView.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilitynodeinfo)
    {
        super.onInitializeAccessibilityNodeInfo(accessibilitynodeinfo);
        accessibilitynodeinfo.setClassName(com/roidapp/baselib/hlistview/HListView.getName());
    }

    public boolean onKeyDown(int k, KeyEvent keyevent)
    {
        return a(k, 1, keyevent);
    }

    public boolean onKeyMultiple(int k, int i1, KeyEvent keyevent)
    {
        return a(k, i1, keyevent);
    }

    public boolean onKeyUp(int k, KeyEvent keyevent)
    {
        return a(k, 1, keyevent);
    }

    protected void onMeasure(int k, int i1)
    {
        Object obj;
        int j1;
        int i2;
        int i4;
        int j4;
        int i5;
label0:
        {
            super.onMeasure(k, i1);
            int l4 = android.view.View.MeasureSpec.getMode(k);
            i5 = android.view.View.MeasureSpec.getMode(i1);
            i4 = android.view.View.MeasureSpec.getSize(k);
            j4 = android.view.View.MeasureSpec.getSize(i1);
            int l2 = 0;
            int k3 = 0;
            boolean flag2 = false;
            boolean flag = false;
            int k1;
            if (j == null)
            {
                k = 0;
            } else
            {
                k = j.getCount();
            }
            ao = k;
            j1 = ((flag2) ? 1 : 0);
            i2 = k3;
            k1 = l2;
            if (ao <= 0)
            {
                break label0;
            }
            if (l4 != 0)
            {
                j1 = ((flag2) ? 1 : 0);
                i2 = k3;
                k1 = l2;
                if (i5 != 0)
                {
                    break label0;
                }
            }
            obj = a(0, P);
            a(((View) (obj)), 0, i1);
            l2 = ((View) (obj)).getMeasuredWidth();
            k3 = ((View) (obj)).getMeasuredHeight();
            k = ((flag) ? 1 : 0);
            if (android.os.Build.VERSION.SDK_INT >= 11)
            {
                k = combineMeasuredStates(0, ((View) (obj)).getMeasuredState());
            }
            if (((AbsHListView.LayoutParams)((View) (obj)).getLayoutParams()).a >= 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            j1 = k;
            i2 = k3;
            k1 = l2;
            if (flag)
            {
                p.a(((View) (obj)), -1);
                k1 = l2;
                i2 = k3;
                j1 = k;
            }
        }
        boolean aflag1[];
        View view1;
        int l1;
        int k2;
        int j3;
        int l3;
        if (i5 == 0)
        {
            k = i2 + (u.top + u.bottom) + getHorizontalScrollbarHeight();
        } else
        if (i5 == 0x80000000 && ao > 0 && aw >= 0)
        {
            i2 = aw;
            j1 = aw;
            obj = j;
            if (obj == null)
            {
                obj = new int[2];
                obj[0] = u.left + u.right;
                obj[1] = u.top + u.bottom;
            } else
            {
                int k4 = u.left;
                int j5 = u.right;
                int k5 = u.top;
                int l5 = u.bottom;
                boolean aflag[];
                int j2;
                int i3;
                if (av > 0 && au != null)
                {
                    k = av;
                } else
                {
                    k = 0;
                }
                i3 = 0;
                j2 = 0;
                if (j1 == -1)
                {
                    j1 = ((ListAdapter) (obj)).getCount() - 1;
                }
                obj = p;
                aflag = P;
                while (i2 <= j1) 
                {
                    View view = a(i2, aflag);
                    a(view, i2, i1);
                    boolean flag1;
                    if (((AbsHListView.LayoutParams)view.getLayoutParams()).a >= 0)
                    {
                        flag1 = true;
                    } else
                    {
                        flag1 = false;
                    }
                    if (flag1)
                    {
                        ((n) (obj)).a(view, -1);
                    }
                    i3 = Math.max(i3, view.getMeasuredWidth() + k);
                    j2 = Math.max(j2, view.getMeasuredHeight());
                    i2++;
                }
                obj = new int[2];
                obj[0] = Math.min(k4 + j5 + i3, i4);
                obj[1] = Math.min(j2 + (k5 + l5), j4);
            }
            k = obj[1];
        } else
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            k = 0xff000000 & j1 | j4;
        } else
        {
            k = j4;
        }
        j1 = i4;
        if (l4 == 0)
        {
            j1 = u.left + u.right + k1 + getHorizontalFadingEdgeLength() * 2;
        }
        if (l4 != 0x80000000) goto _L2; else goto _L1
_L1:
        obj = j;
        if (obj != null) goto _L4; else goto _L3
_L3:
        i2 = u.left + u.right;
_L6:
        setMeasuredDimension(i2, k);
        v = i1;
        return;
_L4:
        l1 = u.left;
        i2 = u.right;
        if (av > 0 && au != null)
        {
            k2 = av;
        } else
        {
            k2 = 0;
        }
        l3 = ((ListAdapter) (obj)).getCount();
        obj = p;
        aflag1 = P;
        j3 = 0;
        l1 += i2;
        do
        {
            i2 = l1;
            if (j3 > l3 - 1)
            {
                continue; /* Loop/switch isn't completed */
            }
            view1 = a(j3, aflag1);
            a(view1, j3, i1);
            if (j3 > 0)
            {
                l1 += k2;
            }
            if (((AbsHListView.LayoutParams)view1.getLayoutParams()).a >= 0)
            {
                i2 = 1;
            } else
            {
                i2 = 0;
            }
            if (i2 != 0)
            {
                ((n) (obj)).a(view1, -1);
            }
            l1 += view1.getMeasuredWidth();
            if (l1 >= j1)
            {
                i2 = j1;
                continue; /* Loop/switch isn't completed */
            }
            j3++;
        } while (true);
_L2:
        i2 = j1;
        if (true) goto _L6; else goto _L5
_L5:
    }

    protected void onSizeChanged(int k, int i1, int j1, int k1)
    {
        if (getChildCount() > 0)
        {
            View view = getFocusedChild();
            if (view != null)
            {
                int l1 = V;
                int i2 = indexOfChild(view);
                int j2 = Math.max(0, view.getRight() - (k - getPaddingLeft()));
                int k2 = view.getLeft();
                if (aK == null)
                {
                    aK = new z(this, (byte)0);
                }
                post(aK.a(l1 + i2, k2 - j2));
            }
        }
        super.onSizeChanged(k, i1, j1, k1);
    }

    public final volatile Adapter p()
    {
        return j;
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean flag)
    {
        int k;
        int i1;
        int j1;
        int l1;
label0:
        {
            int j2 = rect.left;
            rect.offset(view.getLeft(), view.getTop());
            rect.offset(-view.getScrollX(), -view.getScrollY());
            l1 = getWidth();
            j1 = getScrollX();
            int k1 = j1 + l1;
            int i2 = getHorizontalFadingEdgeLength();
            k = getScrollX();
            i1 = u.left;
            int k2;
            int l2;
            int i3;
            int j3;
            if (V > 0 || getChildAt(0).getLeft() > k + i1)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            k = j1;
            if (i1 == 0)
            {
                break label0;
            }
            if (am <= 0)
            {
                k = j1;
                if (j2 <= i2)
                {
                    break label0;
                }
            }
            k = j1 + i2;
        }
label1:
        {
            j2 = getChildAt(getChildCount() - 1).getRight();
            i1 = getChildCount();
            j1 = getChildAt(i1 - 1).getRight();
            k2 = V;
            l2 = getScrollX();
            i3 = getWidth();
            j3 = u.right;
            if ((i1 + k2) - 1 < ao - 1 || j1 < (l2 + i3) - j3)
            {
                j1 = 1;
            } else
            {
                j1 = 0;
            }
            i1 = k1;
            if (!j1)
            {
                break label1;
            }
            if (am >= ao - 1)
            {
                i1 = k1;
                if (rect.right >= j2 - i2)
                {
                    break label1;
                }
            }
            i1 = k1 - i2;
        }
        if (rect.right > i1 && rect.left > k)
        {
            if (rect.width() > l1)
            {
                k = (rect.left - k) + 0;
            } else
            {
                k = (rect.right - i1) + 0;
            }
            k = Math.min(k, j2 - i1);
        } else
        if (rect.left < k && rect.right < i1)
        {
            if (rect.width() > l1)
            {
                i1 = 0 - (i1 - rect.right);
            } else
            {
                i1 = 0 - (k - rect.left);
            }
            k = Math.max(i1, getChildAt(0).getLeft() - k);
        } else
        {
            k = 0;
        }
        if (k != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            v(-k);
            a(-1, view);
            J = view.getTop();
            invalidate();
        }
        return flag;
    }

    public final ListAdapter z()
    {
        return j;
    }
}
