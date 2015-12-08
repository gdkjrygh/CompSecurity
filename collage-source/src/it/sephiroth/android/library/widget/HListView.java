// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package it.sephiroth.android.library.widget;

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
import java.util.ArrayList;

// Referenced classes of package it.sephiroth.android.library.widget:
//            AbsHListView, b

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
    private final a aJ;
    private FocusSelector aK;
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
        this(context, attributeset, it.sephiroth.android.library.R.attr.hlv_listViewStyle);
    }

    public HListView(Context context, AttributeSet attributeset, int i1)
    {
        int j1 = -1;
        boolean flag1 = true;
        super(context, attributeset, i1);
        az = new ArrayList();
        aA = new ArrayList();
        aF = true;
        aG = false;
        aH = new Rect();
    /* block-local class not found */
    class a {}

        aJ = new a(null);
        TypedArray typedarray = context.getTheme().obtainStyledAttributes(attributeset, it.sephiroth.android.library.R.styleable.HListView, i1, 0);
        Drawable drawable;
        Drawable drawable1;
        CharSequence acharsequence[];
        boolean flag2;
        if (typedarray != null)
        {
            acharsequence = typedarray.getTextArray(it.sephiroth.android.library.R.styleable.HListView_android_entries);
            drawable1 = typedarray.getDrawable(it.sephiroth.android.library.R.styleable.HListView_android_divider);
            drawable = typedarray.getDrawable(it.sephiroth.android.library.R.styleable.HListView_hlv_overScrollHeader);
            attributeset = typedarray.getDrawable(it.sephiroth.android.library.R.styleable.HListView_hlv_overScrollFooter);
            j1 = typedarray.getDimensionPixelSize(it.sephiroth.android.library.R.styleable.HListView_hlv_dividerWidth, 0);
            flag2 = typedarray.getBoolean(it.sephiroth.android.library.R.styleable.HListView_hlv_headerDividersEnabled, true);
            flag1 = typedarray.getBoolean(it.sephiroth.android.library.R.styleable.HListView_hlv_footerDividersEnabled, true);
            i1 = typedarray.getInteger(it.sephiroth.android.library.R.styleable.HListView_hlv_measureWithChild, -1);
            typedarray.recycle();
        } else
        {
            attributeset = null;
            drawable = null;
            drawable1 = null;
            acharsequence = null;
            boolean flag = false;
            flag2 = true;
            i1 = j1;
            j1 = ((flag) ? 1 : 0);
        }
        if (acharsequence != null)
        {
            setAdapter(new ArrayAdapter(context, 0x1090003, acharsequence));
        }
        if (drawable1 != null)
        {
            setDivider(drawable1);
        }
        if (drawable != null)
        {
            setOverscrollHeader(drawable);
        }
        if (attributeset != null)
        {
            setOverscrollFooter(attributeset);
        }
        if (j1 != 0)
        {
            setDividerWidth(j1);
        }
        aD = flag2;
        aE = flag1;
        aw = i1;
    }

    private boolean A()
    {
        boolean flag = false;
        int i1 = getScrollX();
        int j1 = u.left;
        if (V > 0 || getChildAt(0).getLeft() > i1 + j1)
        {
            flag = true;
        }
        return flag;
    }

    private boolean B()
    {
        int i1 = getChildCount();
        int j1 = getChildAt(i1 - 1).getRight();
        int k1 = V;
        int l1 = getScrollX();
        int i2 = getWidth();
        int j2 = u.right;
        return (i1 + k1) - 1 < ao - 1 || j1 < (l1 + i2) - j2;
    }

    private int a(int i1, View view, int j1)
    {
        int k1 = 0;
        view.getDrawingRect(aH);
        offsetDescendantRectToMyCoords(view, aH);
        if (i1 == 17)
        {
            i1 = k1;
            if (aH.left < u.left)
            {
                k1 = u.left - aH.left;
                i1 = k1;
                if (j1 > 0)
                {
                    i1 = k1 + getArrowScrollPreviewLength();
                }
            }
        } else
        {
            int i2 = getWidth() - u.right;
            i1 = k1;
            if (aH.bottom > i2)
            {
                int l1 = aH.right - i2;
                i1 = l1;
                if (j1 < ao - 1)
                {
                    return l1 + getArrowScrollPreviewLength();
                }
            }
        }
        return i1;
    }

    private View a(int i1, int j1, boolean flag, int k1, boolean flag1)
    {
        if (!aj)
        {
            View view = p.c(i1);
            if (view != null)
            {
                a(view, i1, j1, flag, k1, flag1, true);
                return view;
            }
        }
        View view1 = a(i1, P);
        a(view1, i1, j1, flag, k1, flag1, P[0]);
        return view1;
    }

    private View a(View view, View view1, int i1, int j1, int k1)
    {
        int i2 = getHorizontalFadingEdgeLength();
        int j2 = am;
        int l1 = d(j1, i2, j2);
        i2 = c(j1, i2, j2);
        if (i1 > 0)
        {
            view = a(j2 - 1, view.getLeft(), true, u.top, false);
            i1 = av;
            view1 = a(j2, view.getRight() + i1, true, u.top, true);
            if (view1.getRight() > i2)
            {
                j2 = view1.getLeft();
                int k2 = view1.getRight();
                j1 = (k1 - j1) / 2;
                j1 = Math.min(Math.min(j2 - l1, k2 - i2), j1);
                view.offsetLeftAndRight(-j1);
                view1.offsetLeftAndRight(-j1);
            }
            if (!K)
            {
                h(am - 2, view1.getLeft() - i1);
                z();
                g(am + 1, view1.getRight() + i1);
                return view1;
            } else
            {
                g(am + 1, view1.getRight() + i1);
                z();
                h(am - 2, view1.getLeft() - i1);
                return view1;
            }
        }
        if (i1 < 0)
        {
            if (view1 != null)
            {
                view = a(j2, view1.getLeft(), true, u.top, true);
            } else
            {
                view = a(j2, view.getLeft(), false, u.top, true);
            }
            if (view.getLeft() < l1)
            {
                i1 = view.getLeft();
                int l2 = view.getRight();
                j1 = (k1 - j1) / 2;
                view.offsetLeftAndRight(Math.min(Math.min(l1 - i1, i2 - l2), j1));
            }
            a(view, j2);
            return view;
        }
        i1 = view.getLeft();
        view = a(j2, i1, true, u.top, true);
        if (i1 < j1 && view.getRight() < j1 + 20)
        {
            view.offsetLeftAndRight(j1 - view.getLeft());
        }
        a(view, j2);
        return view;
    }

    private void a(View view, int i1)
    {
        int j1 = av;
        if (!K)
        {
            h(i1 - 1, view.getLeft() - j1);
            z();
            g(i1 + 1, j1 + view.getRight());
            return;
        } else
        {
            g(i1 + 1, view.getRight() + j1);
            z();
            h(i1 - 1, view.getLeft() - j1);
            return;
        }
    }

    private void a(View view, int i1, int j1)
    {
        AbsHListView.c c2 = (AbsHListView.c)view.getLayoutParams();
        AbsHListView.c c1 = c2;
        if (c2 == null)
        {
            c1 = (AbsHListView.c)generateDefaultLayoutParams();
            view.setLayoutParams(c1);
        }
        c1.a = j.getItemViewType(i1);
        c1.c = true;
        j1 = ViewGroup.getChildMeasureSpec(j1, u.top + u.bottom, c1.height);
        i1 = c1.width;
        if (i1 > 0)
        {
            i1 = android.view.View.MeasureSpec.makeMeasureSpec(i1, 0x40000000);
        } else
        {
            i1 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        }
        view.measure(i1, j1);
    }

    private void a(View view, int i1, int j1, boolean flag)
    {
        boolean flag3 = true;
        if (j1 == -1)
        {
            throw new IllegalArgumentException("newSelectedPosition needs to be valid");
        }
        int k1 = am - V;
        j1 -= V;
        View view1;
        int l1;
        if (i1 == 17)
        {
            View view2 = getChildAt(j1);
            i1 = k1;
            boolean flag1 = true;
            view1 = view;
            view = view2;
            k1 = j1;
            j1 = i1;
            i1 = ((flag1) ? 1 : 0);
        } else
        {
            view1 = getChildAt(j1);
            i1 = 0;
        }
        l1 = getChildCount();
        if (view != null)
        {
            boolean flag2;
            if (!flag && i1 != 0)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            view.setSelected(flag2);
            b(view, k1, l1);
        }
        if (view1 != null)
        {
            if (!flag && i1 == 0)
            {
                flag = flag3;
            } else
            {
                flag = false;
            }
            view1.setSelected(flag);
            b(view1, j1, l1);
        }
    }

    private void a(View view, int i1, int j1, boolean flag, int k1, boolean flag1, boolean flag2)
    {
        AbsHListView.c c1;
        int l1;
        boolean flag3;
        int i2;
        int j2;
        boolean flag4;
        if (flag1 && h())
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag1 != view.isSelected())
        {
            i2 = 1;
        } else
        {
            i2 = 0;
        }
        l1 = F;
        if (l1 > 0 && l1 < 3 && A == i1)
        {
            flag4 = true;
        } else
        {
            flag4 = false;
        }
        if (flag4 != view.isPressed())
        {
            j2 = 1;
        } else
        {
            j2 = 0;
        }
        if (!flag2 || i2 != 0 || view.isLayoutRequested())
        {
            flag3 = true;
        } else
        {
            flag3 = false;
        }
        c1 = (AbsHListView.c)view.getLayoutParams();
        if (c1 == null)
        {
            c1 = (AbsHListView.c)generateDefaultLayoutParams();
        }
        c1.a = j.getItemViewType(i1);
        if (flag2 && !c1.c || c1.b && c1.a == -2)
        {
            byte byte0;
            if (flag)
            {
                byte0 = -1;
            } else
            {
                byte0 = 0;
            }
            attachViewToParent(view, byte0, c1);
        } else
        {
            c1.c = false;
            if (c1.a == -2)
            {
                c1.b = true;
            }
            byte byte1;
            if (flag)
            {
                byte1 = -1;
            } else
            {
                byte1 = 0;
            }
            addViewInLayout(view, byte1, c1, true);
        }
        if (i2 != 0)
        {
            view.setSelected(flag1);
        }
        if (j2 != 0)
        {
            view.setPressed(flag4);
        }
        if (b != 0 && f != null)
        {
            if (view instanceof Checkable)
            {
                ((Checkable)view).setChecked(((Boolean)f.get(i1, Boolean.valueOf(false))).booleanValue());
            } else
            if (android.os.Build.VERSION.SDK_INT >= 11)
            {
                view.setActivated(((Boolean)f.get(i1, Boolean.valueOf(false))).booleanValue());
            }
        }
        if (flag3)
        {
            j2 = ViewGroup.getChildMeasureSpec(v, u.top + u.bottom, c1.height);
            i2 = c1.width;
            if (i2 > 0)
            {
                i2 = android.view.View.MeasureSpec.makeMeasureSpec(i2, 0x40000000);
            } else
            {
                i2 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
            }
            view.measure(i2, j2);
        } else
        {
            cleanupLayoutState(view);
        }
        i2 = view.getMeasuredWidth();
        j2 = view.getMeasuredHeight();
        if (!flag)
        {
            j1 -= i2;
        }
        if (flag3)
        {
            view.layout(j1, k1, i2 + j1, j2 + k1);
        } else
        {
            view.offsetLeftAndRight(j1 - view.getLeft());
            view.offsetTopAndBottom(k1 - view.getTop());
        }
        if (y && !view.isDrawingCacheEnabled())
        {
            view.setDrawingCacheEnabled(true);
        }
        if (android.os.Build.VERSION.SDK_INT >= 11 && flag2 && ((AbsHListView.c)view.getLayoutParams()).d != i1)
        {
            view.jumpDrawablesToCurrentState();
        }
    }

    private void a(ArrayList arraylist)
    {
        if (arraylist != null)
        {
            int j1 = arraylist.size();
            for (int i1 = 0; i1 < j1; i1++)
            {
    /* block-local class not found */
    class b {}

                AbsHListView.c c1 = (AbsHListView.c)((b)arraylist.get(i1)).a.getLayoutParams();
                if (c1 != null)
                {
                    c1.b = false;
                }
            }

        }
    }

    private boolean a(int i1, int j1, KeyEvent keyevent)
    {
        if (j != null && T) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        if (aj)
        {
            e();
        }
        if (android.os.Build.VERSION.SDK_INT < 11) goto _L1; else goto _L3
_L3:
        int i2 = keyevent.getAction();
        if (i2 == 1) goto _L5; else goto _L4
_L4:
        i1;
        JVM INSTR lookupswitch 11: default 148
    //                   19: 381
    //                   20: 402
    //                   21: 161
    //                   22: 271
    //                   23: 423
    //                   62: 489
    //                   66: 423
    //                   92: 548
    //                   93: 631
    //                   122: 714
    //                   123: 755;
           goto _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L10 _L12 _L13 _L14 _L15
_L5:
        int k1;
        boolean flag;
        flag = false;
        k1 = j1;
          goto _L16
_L8:
        if (!keyevent.hasNoModifiers())
        {
            continue; /* Loop/switch isn't completed */
        }
        flag1 = o();
        flag = flag1;
        k1 = j1;
        if (flag1) goto _L16; else goto _L17
_L17:
        l1 = j1 - 1;
        flag = flag1;
        k1 = l1;
        if (j1 <= 0) goto _L16; else goto _L18
_L18:
        flag = flag1;
        k1 = l1;
        if (!k(17)) goto _L16; else goto _L19
_L19:
        flag1 = true;
        j1 = l1;
          goto _L17
        if (!keyevent.hasModifiers(2)) goto _L5; else goto _L20
_L20:
        if (o() || j(17))
        {
            flag = true;
            k1 = j1;
        } else
        {
            flag = false;
            k1 = j1;
        }
          goto _L16
_L9:
        if (!keyevent.hasNoModifiers())
        {
            continue; /* Loop/switch isn't completed */
        }
        flag1 = o();
        flag = flag1;
        k1 = j1;
        if (flag1) goto _L16; else goto _L21
_L21:
        l1 = j1 - 1;
        flag = flag1;
        k1 = l1;
        if (j1 <= 0) goto _L16; else goto _L22
_L22:
        flag = flag1;
        k1 = l1;
        if (!k(66)) goto _L16; else goto _L23
_L23:
        flag1 = true;
        j1 = l1;
          goto _L21
        if (!keyevent.hasModifiers(2)) goto _L5; else goto _L24
_L24:
        if (o() || j(66))
        {
            flag = true;
            k1 = j1;
        } else
        {
            flag = false;
            k1 = j1;
        }
          goto _L16
_L6:
        if (!keyevent.hasNoModifiers()) goto _L5; else goto _L25
_L25:
        flag = n(17);
        k1 = j1;
          goto _L16
_L7:
        if (!keyevent.hasNoModifiers()) goto _L5; else goto _L26
_L26:
        flag = n(66);
        k1 = j1;
          goto _L16
_L10:
        if (!keyevent.hasNoModifiers()) goto _L5; else goto _L27
_L27:
        boolean flag2 = o();
        flag = flag2;
        k1 = j1;
        if (!flag2)
        {
            flag = flag2;
            k1 = j1;
            if (keyevent.getRepeatCount() == 0)
            {
                flag = flag2;
                k1 = j1;
                if (getChildCount() > 0)
                {
                    i();
                    flag = true;
                    k1 = j1;
                }
            }
        }
          goto _L16
_L11:
        if (keyevent.hasNoModifiers())
        {
            if (!o())
            {
                if (!i(66));
            }
        } else
        if (!keyevent.hasModifiers(1) || o() || !i(66));
        flag = true;
        k1 = j1;
          goto _L16
_L12:
        if (!keyevent.hasNoModifiers())
        {
            continue; /* Loop/switch isn't completed */
        }
        if (o() || i(17))
        {
            flag = true;
            k1 = j1;
        } else
        {
            flag = false;
            k1 = j1;
        }
          goto _L16
        if (!keyevent.hasModifiers(2)) goto _L5; else goto _L28
_L28:
        if (o() || j(17))
        {
            flag = true;
            k1 = j1;
        } else
        {
            flag = false;
            k1 = j1;
        }
          goto _L16
_L13:
        if (!keyevent.hasNoModifiers())
        {
            continue; /* Loop/switch isn't completed */
        }
        if (o() || i(66))
        {
            flag = true;
            k1 = j1;
        } else
        {
            flag = false;
            k1 = j1;
        }
          goto _L16
        if (!keyevent.hasModifiers(2)) goto _L5; else goto _L29
_L29:
        if (o() || j(66))
        {
            flag = true;
            k1 = j1;
        } else
        {
            flag = false;
            k1 = j1;
        }
          goto _L16
_L14:
        if (!keyevent.hasNoModifiers()) goto _L5; else goto _L30
_L30:
        if (o() || j(17))
        {
            flag = true;
            k1 = j1;
        } else
        {
            flag = false;
            k1 = j1;
        }
          goto _L16
_L15:
        if (!keyevent.hasNoModifiers()) goto _L5; else goto _L31
_L31:
        if (o() || j(66))
        {
            flag = true;
            k1 = j1;
        } else
        {
            flag = false;
            k1 = j1;
        }
_L16:
        int l1;
        boolean flag1;
        if (flag)
        {
            return true;
        }
        switch (i2)
        {
        default:
            return false;

        case 0: // '\0'
            return super.onKeyDown(i1, keyevent);

        case 1: // '\001'
            return super.onKeyUp(i1, keyevent);

        case 2: // '\002'
            return super.onKeyMultiple(i1, k1, keyevent);
        }
    }

    private boolean a(View view, View view1)
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

    private View b(int i1, int j1, int k1)
    {
        int i2 = getHorizontalFadingEdgeLength();
        int l1 = am;
        j1 = d(j1, i2, l1);
        k1 = c(k1, i2, l1);
        View view = a(l1, i1, true, u.top, true);
        if (view.getRight() > k1)
        {
            view.offsetLeftAndRight(-Math.min(view.getLeft() - j1, view.getRight() - k1));
        } else
        if (view.getLeft() < j1)
        {
            view.offsetLeftAndRight(Math.min(j1 - view.getLeft(), k1 - view.getRight()));
        }
        a(view, l1);
        if (!K)
        {
            l(getChildCount());
            return view;
        } else
        {
            m(getChildCount());
            return view;
        }
    }

    private View b(View view, int i1)
    {
        i1--;
        View view1 = a(i1, P);
        a(view1, i1, view.getLeft() - av, false, u.top, false, P[0]);
        return view1;
    }

    private void b(View view, int i1, int j1)
    {
        int k1 = view.getWidth();
        e(view);
        if (view.getMeasuredWidth() != k1)
        {
            f(view);
            int l1 = view.getMeasuredWidth();
            for (i1++; i1 < j1; i1++)
            {
                getChildAt(i1).offsetLeftAndRight(l1 - k1);
            }

        }
    }

    private int c(int i1, int j1, int k1)
    {
        int l1 = i1;
        if (k1 != ao - 1)
        {
            l1 = i1 - j1;
        }
        return l1;
    }

    private View c(View view, int i1)
    {
        i1++;
        View view1 = a(i1, P);
        int j1 = view.getRight();
        a(view1, i1, av + j1, true, u.top, false, P[0]);
        return view1;
    }

    private int d(int i1, int j1, int k1)
    {
        int l1 = i1;
        if (k1 > 0)
        {
            l1 = i1 + j1;
        }
        return l1;
    }

    private boolean d(View view)
    {
        ArrayList arraylist = az;
        int k1 = arraylist.size();
        for (int i1 = 0; i1 < k1; i1++)
        {
            if (view == ((b)arraylist.get(i1)).a)
            {
                return true;
            }
        }

        arraylist = aA;
        k1 = arraylist.size();
        for (int j1 = 0; j1 < k1; j1++)
        {
            if (view == ((b)arraylist.get(j1)).a)
            {
                return true;
            }
        }

        return false;
    }

    private void e(View view)
    {
        android.view.ViewGroup.LayoutParams layoutparams1 = view.getLayoutParams();
        android.view.ViewGroup.LayoutParams layoutparams = layoutparams1;
        if (layoutparams1 == null)
        {
            layoutparams = new android.view.ViewGroup.LayoutParams(-2, -1);
        }
        int j1 = ViewGroup.getChildMeasureSpec(v, u.top + u.bottom, layoutparams.height);
        int i1 = layoutparams.width;
        if (i1 > 0)
        {
            i1 = android.view.View.MeasureSpec.makeMeasureSpec(i1, 0x40000000);
        } else
        {
            i1 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        }
        view.measure(i1, j1);
    }

    private void f(View view)
    {
        int i1 = view.getMeasuredWidth();
        int j1 = view.getMeasuredHeight();
        int k1 = u.top;
        int l1 = view.getLeft();
        view.layout(l1, k1, i1 + l1, j1 + k1);
    }

    private int g(View view)
    {
        int j1 = getChildCount();
        for (int i1 = 0; i1 < j1; i1++)
        {
            if (a(view, getChildAt(i1)))
            {
                return i1 + V;
            }
        }

        throw new IllegalArgumentException("newFocus is not a child of any of the children of the list!");
    }

    private View g(int i1, int j1)
    {
        View view = null;
        int k1 = getRight();
        int l1 = getLeft();
        while (j1 < k1 - l1 && i1 < ao) 
        {
            View view1;
            boolean flag;
            if (i1 == am)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            view1 = a(i1, j1, true, u.top, flag);
            j1 = view1.getRight() + av;
            if (flag)
            {
                view = view1;
            }
            i1++;
        }
        e(V, (V + getChildCount()) - 1);
        return view;
    }

    private int getArrowScrollPreviewLength()
    {
        return Math.max(2, getHorizontalFadingEdgeLength());
    }

    private int h(View view)
    {
        int i1 = 0;
        view.getDrawingRect(aH);
        offsetDescendantRectToMyCoords(view, aH);
        int j1 = getRight() - getLeft() - u.right;
        if (aH.right < u.left)
        {
            i1 = u.left - aH.right;
        } else
        if (aH.left > j1)
        {
            return aH.left - j1;
        }
        return i1;
    }

    private View h(int i1)
    {
        V = Math.min(V, am);
        V = Math.min(V, ao - 1);
        if (V < 0)
        {
            V = 0;
        }
        return g(V, i1);
    }

    private View h(int i1, int j1)
    {
        View view = null;
        while (j1 > 0 && i1 >= 0) 
        {
            View view1;
            boolean flag;
            if (i1 == am)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            view1 = a(i1, j1, false, u.top, flag);
            j1 = view1.getLeft() - av;
            if (flag)
            {
                view = view1;
            }
            i1--;
        }
        V = i1 + 1;
        e(V, (V + getChildCount()) - 1);
        return view;
    }

    private View i(int i1, int j1)
    {
        j1 -= i1;
        int k1 = n();
        View view = a(k1, i1, true, u.top, true);
        V = k1;
        i1 = view.getMeasuredWidth();
        if (i1 <= j1)
        {
            view.offsetLeftAndRight((j1 - i1) / 2);
        }
        a(view, k1);
        if (!K)
        {
            l(getChildCount());
            return view;
        } else
        {
            m(getChildCount());
            return view;
        }
    }

    private View j(int i1, int j1)
    {
        View view;
        View view1;
        View view6;
        View view2;
        View view4;
        boolean flag;
        if (i1 == am)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        view6 = a(i1, j1, true, u.top, flag);
        V = i1;
        j1 = av;
        if (K) goto _L2; else goto _L1
_L1:
        view2 = h(i1 - 1, view6.getLeft() - j1);
        z();
        view4 = g(i1 + 1, j1 + view6.getRight());
        i1 = getChildCount();
        view = view2;
        view1 = view4;
        if (i1 > 0)
        {
            l(i1);
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
        View view3 = g(i1 + 1, view6.getRight() + j1);
        z();
        View view5 = h(i1 - 1, view6.getLeft() - j1);
        i1 = getChildCount();
        view = view5;
        view1 = view3;
        if (i1 > 0)
        {
            m(i1);
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

    private int k(int i1, int j1)
    {
_L2:
        do
        {
            return 0;
        } while (view.getRight() <= i1 || j1 != -1 && i1 - view.getLeft() >= getMaxScrollAmount());
        j1 = view.getRight() - i1;
        i1 = j1;
        if (V + i2 == ao)
        {
            i1 = Math.min(j1, getChildAt(i2 - 1).getRight() - k1);
        }
        return Math.min(i1, getMaxScrollAmount());
        int k1 = getWidth() - u.right;
        int l1 = u.left;
        int i2 = getChildCount();
        if (i1 == 66)
        {
            i1 = i2 - 1;
            if (j1 != -1)
            {
                i1 = j1 - V;
            }
            l1 = V;
            View view = getChildAt(i1);
            if (l1 + i1 < ao - 1)
            {
                i1 = k1 - getArrowScrollPreviewLength();
            } else
            {
                i1 = k1;
            }
            break MISSING_BLOCK_LABEL_85;
        }
        if (j1 != -1)
        {
            i1 = j1 - V;
        } else
        {
            i1 = 0;
        }
        k1 = V;
        view = getChildAt(i1);
        if (k1 + i1 > 0)
        {
            i1 = getArrowScrollPreviewLength() + l1;
        } else
        {
            i1 = l1;
        }
        if (view.getLeft() < i1 && (j1 == -1 || view.getRight() - i1 < getMaxScrollAmount()))
        {
            j1 = i1 - view.getLeft();
            i1 = j1;
            if (V == 0)
            {
                i1 = Math.min(j1, l1 - getChildAt(0).getLeft());
            }
            return Math.min(i1, getMaxScrollAmount());
        }
        if (true) goto _L2; else goto _L1
_L1:
    }

    private void l(int i1)
    {
        if ((V + i1) - 1 == ao - 1 && i1 > 0)
        {
            i1 = getChildAt(i1 - 1).getRight();
            int j1 = getRight() - getLeft() - u.right - i1;
            View view = getChildAt(0);
            int k1 = view.getLeft();
            if (j1 > 0 && (V > 0 || k1 < u.top))
            {
                i1 = j1;
                if (V == 0)
                {
                    i1 = Math.min(j1, u.top - k1);
                }
                d(i1);
                if (V > 0)
                {
                    h(V - 1, view.getLeft() - av);
                    z();
                }
            }
        }
    }

    private void m(int i1)
    {
        if (V == 0 && i1 > 0)
        {
            int j1 = getChildAt(0).getLeft();
            int l1 = u.left;
            int k1 = getRight() - getLeft() - u.right;
            j1 -= l1;
            View view = getChildAt(i1 - 1);
            l1 = view.getRight();
            int i2 = (V + i1) - 1;
            if (j1 > 0)
            {
                if (i2 < ao - 1 || l1 > k1)
                {
                    i1 = j1;
                    if (i2 == ao - 1)
                    {
                        i1 = Math.min(j1, l1 - k1);
                    }
                    d(-i1);
                    if (i2 < ao - 1)
                    {
                        g(i2 + 1, view.getRight() + av);
                        z();
                    }
                } else
                if (i2 == ao - 1)
                {
                    z();
                    return;
                }
            }
        }
    }

    private boolean n(int i1)
    {
        if (i1 != 17 && i1 != 66)
        {
            throw new IllegalArgumentException("direction must be one of {View.FOCUS_LEFT, View.FOCUS_RIGHT}");
        }
        int j1 = getChildCount();
        if (aG && j1 > 0 && am != -1)
        {
            View view1 = getSelectedView();
            if (view1 != null && view1.hasFocus() && (view1 instanceof ViewGroup))
            {
                View view = view1.findFocus();
                view1 = FocusFinder.getInstance().findNextFocus((ViewGroup)view1, view, i1);
                if (view1 != null)
                {
                    view.getFocusedRect(aH);
                    offsetDescendantRectToMyCoords(view, aH);
                    offsetRectIntoDescendantCoords(view1, aH);
                    if (view1.requestFocus(i1, aH))
                    {
                        return true;
                    }
                }
                view = FocusFinder.getInstance().findNextFocus((ViewGroup)getRootView(), view, i1);
                if (view != null)
                {
                    return a(view, this);
                }
            }
        }
        return false;
    }

    private boolean o(int i1)
    {
        if (getChildCount() > 0)
        {
            View view = getSelectedView();
            int l1 = am;
            int j1 = p(i1);
            int k1 = k(i1, j1);
            Object obj;
            boolean flag;
            if (aG)
            {
                obj = q(i1);
            } else
            {
                obj = null;
            }
            if (obj != null)
            {
                j1 = ((a) (obj)).a();
                k1 = ((a) (obj)).b();
            }
            if (obj != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (j1 != -1)
            {
                boolean flag1;
                if (obj != null)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                a(view, i1, j1, flag1);
                setSelectedPositionInt(j1);
                setNextSelectedPositionInt(j1);
                view = getSelectedView();
                if (aG && obj == null)
                {
                    View view1 = getFocusedChild();
                    if (view1 != null)
                    {
                        view1.clearFocus();
                    }
                }
                v();
                flag = true;
                l1 = j1;
            }
            if (k1 > 0)
            {
                if (i1 != 17)
                {
                    k1 = -k1;
                }
                r(k1);
                flag = true;
            }
            if (aG && obj == null && view != null && view.hasFocus())
            {
                obj = view.findFocus();
                if (!a(((View) (obj)), this) || h(((View) (obj))) > 0)
                {
                    ((View) (obj)).clearFocus();
                }
            }
            if (j1 == -1 && view != null && !a(view, this))
            {
                m();
                M = -1;
                view = null;
            }
            if (flag)
            {
                if (view != null)
                {
                    a(l1, view);
                    J = view.getLeft();
                }
                if (!awakenScrollBars())
                {
                    invalidate();
                }
                b();
                return true;
            }
        }
        return false;
    }

    private int p(int i1)
    {
        int l1 = V;
        if (i1 != 66) goto _L2; else goto _L1
_L1:
        int j1;
        if (am != -1)
        {
            j1 = am + 1;
        } else
        {
            j1 = l1;
        }
        if (j1 < j.getCount()) goto _L4; else goto _L3
_L3:
        i1 = -1;
_L6:
        return i1;
_L4:
        ListAdapter listadapter;
        int i2;
        i1 = j1;
        if (j1 < l1)
        {
            i1 = l1;
        }
        i2 = getLastVisiblePosition();
        listadapter = getAdapter();
        j1 = i1;
_L7:
        if (j1 > i2)
        {
            break MISSING_BLOCK_LABEL_219;
        }
        if (!listadapter.isEnabled(j1))
        {
            break; /* Loop/switch isn't completed */
        }
        i1 = j1;
        if (getChildAt(j1 - l1).getVisibility() == 0) goto _L6; else goto _L5
_L5:
        j1++;
          goto _L7
_L2:
        int k1 = (getChildCount() + l1) - 1;
        if (am != -1)
        {
            i1 = am - 1;
        } else
        {
            i1 = (getChildCount() + l1) - 1;
        }
        if (i1 < 0 || i1 >= j.getCount())
        {
            return -1;
        }
        ListAdapter listadapter1;
        if (i1 <= k1)
        {
            k1 = i1;
        }
        listadapter1 = getAdapter();
        if (k1 < l1) goto _L9; else goto _L8
_L8:
        if (!listadapter1.isEnabled(k1))
        {
            continue; /* Loop/switch isn't completed */
        }
        i1 = k1;
        if (getChildAt(k1 - l1).getVisibility() != 0)
        {
            k1--;
            break MISSING_BLOCK_LABEL_180;
        }
        if (true) goto _L6; else goto _L9
_L9:
        return -1;
    }

    private a q(int i1)
    {
        int k1 = 1;
        int j1 = 1;
        View view = getSelectedView();
        if (view != null && view.hasFocus())
        {
            view = view.findFocus();
            view = FocusFinder.getInstance().findNextFocus(this, view, i1);
        } else
        {
            if (i1 == 66)
            {
                if (V <= 0)
                {
                    j1 = 0;
                }
                k1 = u.left;
                if (j1 != 0)
                {
                    j1 = getArrowScrollPreviewLength();
                } else
                {
                    j1 = 0;
                }
                k1 = j1 + k1;
                j1 = k1;
                if (view != null)
                {
                    j1 = k1;
                    if (view.getLeft() > k1)
                    {
                        j1 = view.getLeft();
                    }
                }
                aH.set(j1, 0, j1, 0);
            } else
            {
                int l1;
                if ((V + getChildCount()) - 1 < ao)
                {
                    j1 = k1;
                } else
                {
                    j1 = 0;
                }
                k1 = getWidth();
                l1 = u.right;
                if (j1 != 0)
                {
                    j1 = getArrowScrollPreviewLength();
                } else
                {
                    j1 = 0;
                }
                k1 = k1 - l1 - j1;
                j1 = k1;
                if (view != null)
                {
                    j1 = k1;
                    if (view.getRight() < k1)
                    {
                        j1 = view.getRight();
                    }
                }
                aH.set(j1, 0, j1, 0);
            }
            view = FocusFinder.getInstance().findNextFocusFromRect(this, aH, i1);
        }
        if (view != null)
        {
            j1 = g(view);
            if (am != -1 && j1 != am)
            {
                k1 = p(i1);
                if (k1 != -1 && (i1 == 66 && k1 < j1 || i1 == 17 && k1 > j1))
                {
                    return null;
                }
            }
            k1 = a(i1, view, j1);
            int i2 = getMaxScrollAmount();
            if (k1 < i2)
            {
                view.requestFocus(i1);
                aJ.a(j1, k1);
                return aJ;
            }
            if (h(view) < i2)
            {
                view.requestFocus(i1);
                aJ.a(j1, i2);
                return aJ;
            }
        }
        return null;
    }

    private void r(int i1)
    {
        d(i1);
        int j1 = getWidth() - u.right;
        int k1 = u.left;
        AbsHListView.e e1 = p;
        if (i1 < 0)
        {
            i1 = getChildCount();
            View view = getChildAt(i1 - 1);
            do
            {
                if (view.getRight() >= j1)
                {
                    break;
                }
                int l1 = (V + i1) - 1;
                if (l1 >= ao - 1)
                {
                    break;
                }
                view = c(view, l1);
                i1++;
            } while (true);
            if (view.getBottom() < j1)
            {
                d(j1 - view.getRight());
            }
            view = getChildAt(0);
            while (view.getRight() < k1) 
            {
                if (e1.b(((AbsHListView.c)view.getLayoutParams()).a))
                {
                    detachViewFromParent(view);
                    e1.a(view, V);
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
            for (view1 = getChildAt(0); view1.getLeft() > k1 && V > 0; V = V - 1)
            {
                view1 = b(view1, V);
            }

            if (view1.getLeft() > k1)
            {
                d(k1 - view1.getLeft());
            }
            i1 = getChildCount() - 1;
            view1 = getChildAt(i1);
            while (view1.getLeft() > j1) 
            {
                if (e1.b(((AbsHListView.c)view1.getLayoutParams()).a))
                {
                    detachViewFromParent(view1);
                    e1.a(view1, V + i1);
                } else
                {
                    removeViewInLayout(view1);
                }
                i1--;
                view1 = getChildAt(i1);
            }
        }
    }

    private void z()
    {
        boolean flag;
        int l1;
        flag = false;
        l1 = getChildCount();
        if (l1 <= 0) goto _L2; else goto _L1
_L1:
        if (K) goto _L4; else goto _L3
_L3:
        int k1;
        k1 = getChildAt(0).getLeft() - u.left;
        int i1 = k1;
        if (V != 0)
        {
            i1 = k1 - av;
        }
        k1 = i1;
        if (i1 < 0)
        {
            k1 = ((flag) ? 1 : 0);
        }
_L6:
        if (k1 != 0)
        {
            d(-k1);
        }
_L2:
        return;
_L4:
        k1 = getChildAt(l1 - 1).getRight() - (getWidth() - u.right);
        int j1 = k1;
        if (l1 + V < ao)
        {
            j1 = k1 + av;
        }
        k1 = ((flag) ? 1 : 0);
        if (j1 <= 0)
        {
            k1 = j1;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    final int a(int i1, int j1, int k1, int l1, int i2)
    {
        Object obj;
        int l2;
        l2 = 0;
        obj = j;
        if (obj != null) goto _L2; else goto _L1
_L1:
        i1 = u.left + u.right;
_L4:
        return i1;
_L2:
        int i3 = u.left + u.right;
        boolean aflag[];
        int j2;
        int k2;
        boolean flag;
        if (av > 0 && au != null)
        {
            j2 = av;
        } else
        {
            j2 = 0;
        }
        k2 = k1;
        if (k1 == -1)
        {
            k2 = ((ListAdapter) (obj)).getCount() - 1;
        }
        obj = p;
        flag = y();
        aflag = P;
        k1 = j1;
        j1 = i3;
        while (k1 <= k2) 
        {
            View view = a(k1, aflag);
            a(view, k1, i1);
            if (k1 > 0)
            {
                j1 += j2;
            }
            if (flag && ((AbsHListView.e) (obj)).b(((AbsHListView.c)view.getLayoutParams()).a))
            {
                ((AbsHListView.e) (obj)).a(view, -1);
            }
            j1 = view.getMeasuredWidth() + j1;
            if (j1 >= l1)
            {
                i1 = l1;
                if (i2 >= 0)
                {
                    i1 = l1;
                    if (k1 > i2)
                    {
                        i1 = l1;
                        if (l2 > 0)
                        {
                            i1 = l1;
                            if (j1 != l1)
                            {
                                return l2;
                            }
                        }
                    }
                }
                continue; /* Loop/switch isn't completed */
            }
            int j3 = l2;
            if (i2 >= 0)
            {
                j3 = l2;
                if (k1 >= i2)
                {
                    j3 = j1;
                }
            }
            k1++;
            l2 = j3;
        }
        return j1;
        if (true) goto _L4; else goto _L3
_L3:
    }

    void a(Canvas canvas, Rect rect, int i1)
    {
        Drawable drawable = au;
        drawable.setBounds(rect);
        drawable.draw(canvas);
    }

    void a(Canvas canvas, Drawable drawable, Rect rect)
    {
        int i1 = drawable.getMinimumWidth();
        canvas.save();
        canvas.clipRect(rect);
        if (rect.right - rect.left < i1)
        {
            rect.left = rect.right - i1;
        }
        drawable.setBounds(rect);
        drawable.draw(canvas);
        canvas.restore();
    }

    public void a(View view, Object obj, boolean flag)
    {
        b b1 = new b();
        b1.a = view;
        b1.b = obj;
        b1.c = flag;
        az.add(b1);
        if (j != null)
        {
            if (!(j instanceof b))
            {
                j = new b(az, aA, j);
            }
            if (i != null)
            {
                i.onChanged();
            }
        }
    }

    protected void a(boolean flag)
    {
        int i1 = 0;
        int j1 = getChildCount();
        if (flag)
        {
            if (j1 > 0)
            {
                i1 = getChildAt(j1 - 1).getRight() + av;
            }
            g(j1 + V, i1);
            l(getChildCount());
            return;
        }
        if (j1 > 0)
        {
            i1 = getChildAt(0).getLeft() - av;
        } else
        {
            i1 = getWidth() - 0;
        }
        h(V - 1, i1);
        m(getChildCount());
    }

    final int[] a(int i1, int j1, int k1, int l1, int i2, int j2)
    {
        Object obj = j;
        if (obj == null)
        {
            return (new int[] {
                u.left + u.right, u.top + u.bottom
            });
        }
        int i3 = u.left;
        int j3 = u.right;
        int k3 = u.top;
        int l3 = u.bottom;
        boolean aflag[];
        int k2;
        int l2;
        boolean flag;
        if (av > 0 && au != null)
        {
            j2 = av;
        } else
        {
            j2 = 0;
        }
        k2 = k1;
        if (k1 == -1)
        {
            k2 = ((ListAdapter) (obj)).getCount() - 1;
        }
        obj = p;
        flag = y();
        aflag = P;
        l2 = 0;
        k1 = 0;
        for (; j1 <= k2; j1++)
        {
            View view = a(j1, aflag);
            a(view, j1, i1);
            if (flag && ((AbsHListView.e) (obj)).b(((AbsHListView.c)view.getLayoutParams()).a))
            {
                ((AbsHListView.e) (obj)).a(view, -1);
            }
            l2 = Math.max(l2, view.getMeasuredWidth() + j2);
            k1 = Math.max(k1, view.getMeasuredHeight());
        }

        return (new int[] {
            Math.min(l2 + (i3 + j3), l1), Math.min(k1 + (k3 + l3), i2)
        });
    }

    protected int b(int i1, boolean flag)
    {
        ListAdapter listadapter = j;
        if (listadapter != null && !isInTouchMode()) goto _L2; else goto _L1
_L1:
        int j1 = -1;
_L4:
        return j1;
_L2:
        int k1;
        k1 = listadapter.getCount();
        if (aF)
        {
            break MISSING_BLOCK_LABEL_137;
        }
        if (flag)
        {
            j1 = Math.max(0, i1);
            do
            {
                i1 = j1;
                if (j1 >= k1)
                {
                    break;
                }
                i1 = j1;
                if (listadapter.isEnabled(j1))
                {
                    break;
                }
                j1++;
            } while (true);
        } else
        {
            j1 = Math.min(i1, k1 - 1);
            do
            {
                i1 = j1;
                if (j1 < 0)
                {
                    break;
                }
                i1 = j1;
                if (listadapter.isEnabled(j1))
                {
                    break;
                }
                j1--;
            } while (true);
        }
        if (i1 < 0)
        {
            break; /* Loop/switch isn't completed */
        }
        j1 = i1;
        if (i1 < k1) goto _L4; else goto _L3
_L3:
        return -1;
        if (i1 < 0)
        {
            break; /* Loop/switch isn't completed */
        }
        j1 = i1;
        if (i1 < k1) goto _L4; else goto _L5
_L5:
        return -1;
    }

    void b(Canvas canvas, Drawable drawable, Rect rect)
    {
        int i1 = drawable.getMinimumWidth();
        canvas.save();
        canvas.clipRect(rect);
        if (rect.right - rect.left < i1)
        {
            rect.right = i1 + rect.left;
        }
        drawable.setBounds(rect);
        drawable.draw(canvas);
        canvas.restore();
    }

    public void b(View view)
    {
        a(view, null, true);
    }

    public int[] c(View view)
    {
        e(view);
        return (new int[] {
            view.getMeasuredWidth(), view.getMeasuredHeight()
        });
    }

    protected boolean canAnimate()
    {
        return super.canAnimate() && ao > 0;
    }

    protected void d()
    {
        a(az);
        a(aA);
        super.d();
        h = 0;
    }

    protected void dispatchDraw(Canvas canvas)
    {
        Drawable drawable;
        Drawable drawable1;
        Rect rect;
        ListAdapter listadapter;
        Paint paint;
        int i1;
        boolean flag;
        boolean flag1;
        boolean flag2;
        int i3;
        int j3;
        int k3;
        int l3;
        int i4;
        int j4;
        int k4;
        boolean flag8;
        boolean flag9;
        if (y)
        {
            z = true;
        }
        i3 = av;
        drawable = ax;
        drawable1 = ay;
        int k1;
        int i5;
        boolean flag10;
        if (drawable != null)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (drawable1 != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (i3 > 0 && au != null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (!flag1 && i1 == 0 && !flag) goto _L2; else goto _L1
_L1:
        rect = aH;
        rect.top = getPaddingTop();
        rect.bottom = getBottom() - getTop() - getPaddingBottom();
        j3 = getChildCount();
        l3 = az.size();
        k4 = ao;
        i4 = k4 - aA.size() - 1;
        flag8 = aD;
        flag9 = aE;
        k3 = V;
        flag10 = aF;
        listadapter = j;
        if (isOpaque() && !super.isOpaque())
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        if (flag2 && aI == null && aB)
        {
            aI = new Paint();
            aI.setColor(getCacheColorHint());
        }
        paint = aI;
        j4 = (getRight() - getLeft() - 0) + getScrollX();
        if (K) goto _L4; else goto _L3
_L3:
        k1 = getScrollX();
        if (j3 <= 0 || k1 >= 0) goto _L6; else goto _L5
_L5:
        if (i1 == 0) goto _L8; else goto _L7
_L7:
        rect.right = 0;
        rect.left = k1;
        a(canvas, drawable, rect);
          goto _L6
_L8:
        if (flag1)
        {
            rect.right = 0;
            rect.left = -i3;
            a(canvas, rect, -1);
        }
        continue; /* Loop/switch isn't completed */
_L6:
        i1 = 0;
        int i2 = 0;
label0:
        do
        {
label1:
            {
                if (i1 >= j3)
                {
                    break label0;
                }
                i5 = k3 + i1;
                boolean flag3;
                boolean flag5;
                int j2;
                int k2;
                if (i5 < l3)
                {
                    flag3 = true;
                } else
                {
                    flag3 = false;
                }
                if (i5 >= i4)
                {
                    flag5 = true;
                } else
                {
                    flag5 = false;
                }
                if (!flag8)
                {
                    j2 = i2;
                    if (flag3)
                    {
                        break label1;
                    }
                }
                if (!flag9)
                {
                    j2 = i2;
                    if (flag5)
                    {
                        break label1;
                    }
                }
                k2 = getChildAt(i1).getRight();
                if (i1 == j3 - 1)
                {
                    i2 = 1;
                } else
                {
                    i2 = 0;
                }
                j2 = k2;
                if (!flag1)
                {
                    break label1;
                }
                j2 = k2;
                if (k2 >= j4)
                {
                    break label1;
                }
                if (flag)
                {
                    j2 = k2;
                    if (i2 != 0)
                    {
                        break label1;
                    }
                }
                j2 = i5 + 1;
                if (listadapter.isEnabled(i5) && (flag8 || !flag3 && j2 >= l3) && (i2 != 0 || listadapter.isEnabled(j2) && (flag9 || !flag5 && j2 < i4)))
                {
                    rect.left = k2;
                    rect.right = k2 + i3;
                    a(canvas, rect, i1);
                    j2 = k2;
                } else
                {
                    j2 = k2;
                    if (flag2)
                    {
                        rect.left = k2;
                        rect.right = k2 + i3;
                        canvas.drawRect(rect, paint);
                        j2 = k2;
                    }
                }
            }
            i1++;
            i2 = j2;
        } while (true);
        i1 = getRight() + getScrollX();
        if (flag && k3 + j3 == k4 && i1 > i2)
        {
            rect.left = i2;
            rect.right = i1;
            b(canvas, drawable1, rect);
        }
_L2:
        super.dispatchDraw(canvas);
        return;
_L4:
        int l2 = getScrollX();
        if (j3 > 0 && i1 != 0)
        {
            rect.left = l2;
            rect.right = getChildAt(0).getLeft();
            a(canvas, drawable, rect);
        }
        int l1;
        if (i1 != 0)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        l1 = i1;
        while (l1 < j3) 
        {
            int l4 = k3 + l1;
            boolean flag4;
            boolean flag6;
            int j5;
            if (l4 < l3)
            {
                flag4 = true;
            } else
            {
                flag4 = false;
            }
            if (l4 >= i4)
            {
                flag6 = true;
            } else
            {
                flag6 = false;
            }
            if (!flag8 && flag4 || !flag9 && flag6)
            {
                continue;
            }
            j5 = getChildAt(l1).getLeft();
            if (flag1 && j5 > 0)
            {
                boolean flag7;
                int k5;
                if (l1 == i1)
                {
                    flag7 = true;
                } else
                {
                    flag7 = false;
                }
                k5 = l4 - 1;
                if (listadapter.isEnabled(l4) && (flag8 || !flag4 && k5 >= l3) && (flag7 || listadapter.isEnabled(k5) && (flag9 || !flag6 && k5 < i4)))
                {
                    rect.left = j5 - i3;
                    rect.right = j5;
                    a(canvas, rect, l1 - 1);
                } else
                if (flag2)
                {
                    rect.left = j5 - i3;
                    rect.right = j5;
                    canvas.drawRect(rect, paint);
                }
            }
            l1++;
        }
        if (j3 > 0 && l2 > 0)
        {
            if (flag)
            {
                int j1 = getRight();
                rect.left = j1;
                rect.right = j1 + l2;
                b(canvas, drawable1, rect);
            } else
            if (flag1)
            {
                rect.left = j4;
                rect.right = j4 + i3;
                a(canvas, rect, -1);
            }
        }
        if (true) goto _L2; else goto _L9
_L9:
        if (true) goto _L6; else goto _L10
_L10:
    }

    public boolean dispatchKeyEvent(KeyEvent keyevent)
    {
        boolean flag1 = super.dispatchKeyEvent(keyevent);
        boolean flag = flag1;
        if (!flag1)
        {
            flag = flag1;
            if (getFocusedChild() != null)
            {
                flag = flag1;
                if (keyevent.getAction() == 0)
                {
                    flag = onKeyDown(keyevent.getKeyCode(), keyevent);
                }
            }
        }
        return flag;
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

    protected int e(int i1)
    {
        int l1 = getChildCount();
        if (l1 > 0)
        {
            if (!K)
            {
                for (int j1 = 0; j1 < l1; j1++)
                {
                    if (i1 <= getChildAt(j1).getRight())
                    {
                        return j1 + V;
                    }
                }

            } else
            {
                for (int k1 = l1 - 1; k1 >= 0; k1--)
                {
                    if (i1 >= getChildAt(k1).getLeft())
                    {
                        return k1 + V;
                    }
                }

            }
        }
        return -1;
    }

    protected void e()
    {
        boolean flag = at;
        if (!flag) goto _L2; else goto _L1
_L1:
        return;
_L2:
        at = true;
        super.e();
        invalidate();
        if (j != null)
        {
            break MISSING_BLOCK_LABEL_51;
        }
        d();
        b();
        if (flag) goto _L1; else goto _L3
_L3:
        at = false;
        return;
        int j1;
        int l1;
        int i2;
        j1 = u.left;
        l1 = getRight() - getLeft() - u.right;
        i2 = getChildCount();
        Object obj;
        View view;
        View view2;
        int i1;
        int k1;
        k1 = 0;
        i1 = 0;
        view2 = null;
        obj = null;
        view = null;
        h;
        JVM INSTR tableswitch 1 5: default 1178
    //                   1 1181
    //                   2 248
    //                   3 1181
    //                   4 1181
    //                   5 1181;
           goto _L4 _L5 _L6 _L5 _L5 _L5
_L4:
        k1 = am - V;
        View view1;
        view1 = ((View) (obj));
        if (k1 < 0)
        {
            break MISSING_BLOCK_LABEL_170;
        }
        view1 = ((View) (obj));
        if (k1 >= i2)
        {
            break MISSING_BLOCK_LABEL_170;
        }
        view1 = getChildAt(k1);
        obj = getChildAt(0);
        if (ak >= 0)
        {
            i1 = ak - am;
        }
        view = getChildAt(k1 + i1);
        view2 = view1;
_L14:
        boolean flag1 = aj;
        if (!flag1) goto _L8; else goto _L7
_L7:
        r();
_L8:
        if (ao != 0) goto _L10; else goto _L9
_L9:
        d();
        b();
        if (flag) goto _L1; else goto _L11
_L11:
        at = false;
        return;
_L6:
        i1 = ak - V;
        if (i1 < 0 || i1 >= i2) goto _L13; else goto _L12
_L12:
        view = getChildAt(i1);
        obj = null;
        i1 = k1;
          goto _L14
_L10:
        if (ao != j.getCount())
        {
            throw new IllegalStateException((new StringBuilder()).append("The content of the adapter has changed but ListView did not receive a notification. Make sure the content of your adapter is not modified from a background thread, but only from the UI thread. [in ListView(").append(getId()).append(", ").append(getClass()).append(") with Adapter(").append(j.getClass()).append(")]").toString());
        }
          goto _L15
        obj;
        if (!flag)
        {
            at = false;
        }
        throw obj;
_L15:
        setSelectedPositionInt(ak);
        Object obj1;
        obj1 = null;
        view1 = null;
        Object obj2 = getFocusedChild();
        if (obj2 == null) goto _L17; else goto _L16
_L16:
        if (!flag1) goto _L19; else goto _L18
_L18:
        if (!d(((View) (obj2)))) goto _L20; else goto _L19
_L19:
        view1 = findFocus();
        if (view1 == null) goto _L22; else goto _L21
_L21:
        view1.onStartTemporaryDetach();
          goto _L22
_L20:
        requestFocus();
_L73:
        int j2;
        j2 = V;
        obj2 = p;
        if (!flag1) goto _L24; else goto _L23
_L23:
        k1 = 0;
_L26:
        if (k1 >= i2)
        {
            break; /* Loop/switch isn't completed */
        }
        ((AbsHListView.e) (obj2)).a(getChildAt(k1), j2 + k1);
        k1++;
        if (true) goto _L26; else goto _L25
_L24:
        ((AbsHListView.e) (obj2)).a(i2, j2);
_L25:
        detachAllViewsFromParent();
        ((AbsHListView.e) (obj2)).d();
        h;
        JVM INSTR tableswitch 1 6: default 1197
    //                   1 827
    //                   2 759
    //                   3 807
    //                   4 846
    //                   5 791
    //                   6 862;
           goto _L27 _L28 _L29 _L30 _L31 _L32 _L33
_L27:
        if (i2 != 0) goto _L35; else goto _L34
_L34:
        if (K) goto _L37; else goto _L36
_L36:
        setSelectedPositionInt(b(0, true));
        obj = h(j1);
_L54:
        ((AbsHListView.e) (obj2)).e();
        if (obj == null) goto _L39; else goto _L38
_L38:
        if (!aG || !hasFocus() || ((View) (obj)).hasFocus()) goto _L41; else goto _L40
_L40:
        if (obj != obj1 || view1 == null) goto _L43; else goto _L42
_L42:
        if (view1.requestFocus()) goto _L44; else goto _L43
_L43:
        if (!((View) (obj)).requestFocus()) goto _L45; else goto _L44
_L74:
        if (i1 != 0) goto _L47; else goto _L46
_L46:
        view = getFocusedChild();
        if (view == null) goto _L49; else goto _L48
_L48:
        view.clearFocus();
_L49:
        b(-1, ((View) (obj)));
_L63:
        J = ((View) (obj)).getLeft();
_L69:
        if (view1 == null) goto _L51; else goto _L50
_L50:
        if (view1.getWindowToken() != null)
        {
            view1.onFinishTemporaryDetach();
        }
_L51:
        h = 0;
        aj = false;
        if (O != null)
        {
            post(O);
            O = null;
        }
        ad = false;
        setNextSelectedPositionInt(am);
        f();
        if (ao > 0)
        {
            v();
        }
        b();
        if (!flag)
        {
            at = false;
            return;
        }
          goto _L1
_L29:
        if (view == null) goto _L53; else goto _L52
_L52:
        obj = b(view.getLeft(), j1, l1);
          goto _L54
_L53:
        obj = i(j1, l1);
          goto _L54
_L32:
        obj = j(aa, W);
          goto _L54
_L30:
        obj = h(ao - 1, l1);
        z();
          goto _L54
_L28:
        V = 0;
        obj = h(j1);
        z();
          goto _L54
_L31:
        obj = j(n(), W);
          goto _L54
_L33:
        obj = a(view2, view, i1, j1, l1);
          goto _L54
_L37:
        setSelectedPositionInt(b(ao - 1, false));
        obj = h(ao - 1, l1);
          goto _L54
_L35:
        if (am < 0 || am >= ao) goto _L56; else goto _L55
_L55:
        i1 = am;
        if (view2 != null) goto _L58; else goto _L57
_L57:
        obj = j(i1, j1);
          goto _L54
_L58:
        j1 = view2.getLeft();
          goto _L57
_L56:
        if (V >= ao) goto _L60; else goto _L59
_L59:
        i1 = V;
        if (obj != null) goto _L62; else goto _L61
_L61:
        obj = j(i1, j1);
          goto _L54
_L62:
        j1 = ((View) (obj)).getLeft();
          goto _L61
_L60:
        obj = j(0, j1);
          goto _L54
_L47:
        ((View) (obj)).setSelected(false);
        o.setEmpty();
          goto _L63
_L41:
        b(-1, ((View) (obj)));
          goto _L63
_L39:
        if (F == 1 || F == 2)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 == 0) goto _L65; else goto _L64
_L64:
        obj = getChildAt(A - V);
        if (obj == null) goto _L67; else goto _L66
_L66:
        b(A, ((View) (obj)));
_L67:
        if (!hasFocus() || view1 == null) goto _L69; else goto _L68
_L68:
        view1.requestFocus();
          goto _L69
_L65:
        if (n == -1) goto _L71; else goto _L70
_L70:
        obj = getChildAt(n - V);
        if (obj == null) goto _L67; else goto _L72
_L72:
        b(n, ((View) (obj)));
          goto _L67
_L71:
        J = 0;
        o.setEmpty();
          goto _L67
_L17:
        obj1 = null;
        view1 = null;
          goto _L73
_L13:
        obj = null;
        i1 = k1;
          goto _L14
_L5:
        obj = null;
        i1 = k1;
          goto _L14
_L22:
        obj1 = obj2;
          goto _L20
_L44:
        i1 = 1;
          goto _L74
_L45:
        i1 = 0;
          goto _L74
    }

    public void f(int i1, int j1)
    {
        if (j != null)
        {
            if (!isInTouchMode())
            {
                int k1 = b(i1, true);
                i1 = k1;
                if (k1 >= 0)
                {
                    setNextSelectedPositionInt(k1);
                    i1 = k1;
                }
            } else
            {
                M = i1;
            }
            if (i1 >= 0)
            {
                h = 4;
                W = u.left + j1;
                if (ad)
                {
                    aa = i1;
                    ab = j.getItemId(i1);
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

    public volatile Adapter getAdapter()
    {
        return getAdapter();
    }

    public ListAdapter getAdapter()
    {
        return j;
    }

    public long[] getCheckItemIds()
    {
        if (j != null && j.hasStableIds())
        {
            return getCheckedItemIds();
        }
        if (b != 0 && f != null && j != null)
        {
            SparseArrayCompat sparsearraycompat = f;
            int l1 = sparsearraycompat.size();
            long al[] = new long[l1];
            ListAdapter listadapter = j;
            int j1 = 0;
            int i1 = 0;
            for (; j1 < l1; j1++)
            {
                if (((Boolean)sparsearraycompat.valueAt(j1)).booleanValue())
                {
                    int k1 = i1 + 1;
                    al[i1] = listadapter.getItemId(sparsearraycompat.keyAt(j1));
                    i1 = k1;
                }
            }

            if (i1 == l1)
            {
                return al;
            } else
            {
                long al1[] = new long[i1];
                System.arraycopy(al, 0, al1, 0, i1);
                return al1;
            }
        } else
        {
            return new long[0];
        }
    }

    public Drawable getDivider()
    {
        return au;
    }

    public int getDividerWidth()
    {
        return av;
    }

    public int getFooterViewsCount()
    {
        return aA.size();
    }

    public int getHeaderViewsCount()
    {
        return az.size();
    }

    public boolean getItemsCanFocus()
    {
        return aG;
    }

    public int getMaxScrollAmount()
    {
        return (int)(0.33F * (float)(getRight() - getLeft()));
    }

    public Drawable getOverscrollFooter()
    {
        return ay;
    }

    public Drawable getOverscrollHeader()
    {
        return ax;
    }

    boolean i(int i1)
    {
        boolean flag;
        if (i1 == 17)
        {
            i1 = Math.max(0, am - getChildCount() - 1);
            flag = false;
        } else
        if (i1 == 66)
        {
            i1 = Math.min(ao - 1, (am + getChildCount()) - 1);
            flag = true;
        } else
        {
            i1 = -1;
            flag = false;
        }
        if (i1 >= 0)
        {
            i1 = b(i1, flag);
            if (i1 >= 0)
            {
                h = 4;
                W = getPaddingLeft() + getHorizontalFadingEdgeLength();
                if (flag && i1 > ao - getChildCount())
                {
                    h = 3;
                }
                if (!flag && i1 < getChildCount())
                {
                    h = 1;
                }
                setSelectionInt(i1);
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
            int i1;
            if (u != null)
            {
                i1 = u.left;
            } else
            {
                i1 = getPaddingLeft();
            }
            view = getChildAt(0);
            if (view == null || view.getLeft() > i1)
            {
                return false;
            }
            int j1 = getWidth();
            if (u != null)
            {
                i1 = u.right;
            } else
            {
                i1 = getPaddingRight();
            }
            view = getChildAt(getChildCount() - 1);
            if (view == null || view.getRight() < j1 - i1)
            {
                return false;
            }
        }
        return flag;
    }

    boolean j(int i1)
    {
        boolean flag1 = true;
        if (i1 != 17) goto _L2; else goto _L1
_L1:
        if (am == 0) goto _L4; else goto _L3
_L3:
        boolean flag;
        i1 = b(0, true);
        flag = flag1;
        if (i1 >= 0)
        {
            h = 1;
            setSelectionInt(i1);
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
        if (i1 == 66 && am < ao - 1)
        {
            i1 = b(ao - 1, true);
            flag = flag1;
            if (i1 >= 0)
            {
                h = 3;
                setSelectionInt(i1);
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

    boolean k(int i1)
    {
        boolean flag;
        af = true;
        flag = o(i1);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_23;
        }
        playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i1));
        af = false;
        return flag;
        Exception exception;
        exception;
        af = false;
        throw exception;
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        int j1 = getChildCount();
        if (j1 > 0)
        {
            for (int i1 = 0; i1 < j1; i1++)
            {
                b(getChildAt(i1));
            }

            removeAllViews();
        }
    }

    protected void onFocusChanged(boolean flag, int i1, Rect rect)
    {
        ListAdapter listadapter;
        int j1;
        int k1;
        int l1;
        int j2;
        int l2;
        l1 = 0;
        k1 = 0;
        super.onFocusChanged(flag, i1, rect);
        listadapter = j;
        j1 = -1;
        j2 = l1;
        l2 = j1;
        if (listadapter == null) goto _L2; else goto _L1
_L1:
        j2 = l1;
        l2 = j1;
        if (!flag) goto _L2; else goto _L3
_L3:
        j2 = l1;
        l2 = j1;
        if (rect == null) goto _L2; else goto _L4
_L4:
        Rect rect1;
        int i2;
        int i3;
        int j3;
        rect.offset(getScrollX(), getScrollY());
        if (listadapter.getCount() < getChildCount() + V)
        {
            h = 0;
            e();
        }
        rect1 = aH;
        i2 = 0x7fffffff;
        i3 = getChildCount();
        j3 = V;
        l1 = 0;
_L6:
        j2 = k1;
        l2 = j1;
        if (l1 >= i3) goto _L2; else goto _L5
_L5:
        if (!listadapter.isEnabled(j3 + l1))
        {
            j2 = k1;
            k1 = j1;
            j1 = j2;
        } else
        {
            View view = getChildAt(l1);
            view.getDrawingRect(rect1);
            offsetDescendantRectToMyCoords(view, rect1);
            j2 = a(rect, rect1, i1);
            if (j2 < i2)
            {
                j1 = view.getLeft();
                k1 = l1;
                i2 = j2;
            } else
            {
                int k2 = j1;
                j1 = k1;
                k1 = k2;
            }
        }
        j2 = l1 + 1;
        l1 = k1;
        k1 = j1;
        j1 = l1;
        l1 = j2;
        if (true) goto _L6; else goto _L2
_L2:
        if (l2 >= 0)
        {
            f(V + l2, j2);
            return;
        } else
        {
            requestLayout();
            return;
        }
    }

    public void onGlobalLayout()
    {
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityevent)
    {
        super.onInitializeAccessibilityEvent(accessibilityevent);
        accessibilityevent.setClassName(it/sephiroth/android/library/widget/HListView.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilitynodeinfo)
    {
        super.onInitializeAccessibilityNodeInfo(accessibilitynodeinfo);
        accessibilitynodeinfo.setClassName(it/sephiroth/android/library/widget/HListView.getName());
    }

    public boolean onKeyDown(int i1, KeyEvent keyevent)
    {
        return a(i1, 1, keyevent);
    }

    public boolean onKeyMultiple(int i1, int j1, KeyEvent keyevent)
    {
        return a(i1, j1, keyevent);
    }

    public boolean onKeyUp(int i1, KeyEvent keyevent)
    {
        return a(i1, 1, keyevent);
    }

    protected void onMeasure(int i1, int j1)
    {
        int k1;
        int j2;
        int k2;
        int k3;
label0:
        {
            super.onMeasure(i1, j1);
            int j3 = android.view.View.MeasureSpec.getMode(i1);
            k3 = android.view.View.MeasureSpec.getMode(j1);
            j2 = android.view.View.MeasureSpec.getSize(i1);
            k2 = android.view.View.MeasureSpec.getSize(j1);
            int l2 = 0;
            int i3 = 0;
            boolean flag1 = false;
            boolean flag = false;
            View view;
            int l1;
            int i2;
            if (j == null)
            {
                i1 = 0;
            } else
            {
                i1 = j.getCount();
            }
            ao = i1;
            k1 = ((flag1) ? 1 : 0);
            i2 = i3;
            l1 = l2;
            if (ao <= 0)
            {
                break label0;
            }
            if (j3 != 0)
            {
                k1 = ((flag1) ? 1 : 0);
                i2 = i3;
                l1 = l2;
                if (k3 != 0)
                {
                    break label0;
                }
            }
            view = a(0, P);
            a(view, 0, j1);
            l2 = view.getMeasuredWidth();
            i3 = view.getMeasuredHeight();
            i1 = ((flag) ? 1 : 0);
            if (android.os.Build.VERSION.SDK_INT >= 11)
            {
                i1 = combineMeasuredStates(0, view.getMeasuredState());
            }
            k1 = i1;
            i2 = i3;
            l1 = l2;
            if (y())
            {
                k1 = i1;
                i2 = i3;
                l1 = l2;
                if (p.b(((AbsHListView.c)view.getLayoutParams()).a))
                {
                    p.a(view, 0);
                    l1 = l2;
                    i2 = i3;
                    k1 = i1;
                }
            }
        }
        if (k3 == 0)
        {
            i1 = i2 + (u.top + u.bottom) + getHorizontalScrollbarHeight();
        } else
        if (k3 == 0x80000000 && ao > 0 && aw > -1)
        {
            i1 = a(j1, aw, aw, j2, k2, -1)[1];
        } else
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            i1 = k2 | 0xff000000 & k1;
        } else
        {
            i1 = k2;
        }
        k1 = j2;
        if (j3 == 0)
        {
            k1 = u.left + u.right + l1 + getHorizontalFadingEdgeLength() * 2;
        }
        l1 = k1;
        if (j3 == 0x80000000)
        {
            l1 = a(j1, 0, -1, k1, -1);
        }
        setMeasuredDimension(l1, i1);
        v = j1;
    }

    protected void onSizeChanged(int i1, int j1, int k1, int l1)
    {
        if (getChildCount() > 0)
        {
            View view = getFocusedChild();
            if (view != null)
            {
                int i2 = V;
                int j2 = indexOfChild(view);
                int k2 = Math.max(0, view.getRight() - (i1 - getPaddingLeft()));
                int l2 = view.getLeft();
    /* block-local class not found */
    class FocusSelector {}

                if (aK == null)
                {
                    aK = new FocusSelector(null);
                }
                post(aK.a(i2 + j2, l2 - k2));
            }
        }
        super.onSizeChanged(i1, j1, k1, l1);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean flag)
    {
        int i1;
        int l1;
        int i2;
        int l2;
label0:
        {
            int j2 = rect.left;
            rect.offset(view.getLeft(), view.getTop());
            rect.offset(-view.getScrollX(), -view.getScrollY());
            i2 = getWidth();
            int j1 = getScrollX();
            l1 = j1 + i2;
            l2 = getHorizontalFadingEdgeLength();
            i1 = j1;
            if (!A())
            {
                break label0;
            }
            if (am <= 0)
            {
                i1 = j1;
                if (j2 <= l2)
                {
                    break label0;
                }
            }
            i1 = j1 + l2;
        }
        int k1;
        int k2;
label1:
        {
            k2 = getChildAt(getChildCount() - 1).getRight();
            k1 = l1;
            if (!B())
            {
                break label1;
            }
            if (am >= ao - 1)
            {
                k1 = l1;
                if (rect.right >= k2 - l2)
                {
                    break label1;
                }
            }
            k1 = l1 - l2;
        }
        if (rect.right > k1 && rect.left > i1)
        {
            if (rect.width() > i2)
            {
                i1 = (rect.left - i1) + 0;
            } else
            {
                i1 = (rect.right - k1) + 0;
            }
            i1 = Math.min(i1, k2 - k1);
        } else
        if (rect.left < i1 && rect.right < k1)
        {
            if (rect.width() > i2)
            {
                k1 = 0 - (k1 - rect.right);
            } else
            {
                k1 = 0 - (i1 - rect.left);
            }
            i1 = Math.max(k1, getChildAt(0).getLeft() - i1);
        } else
        {
            i1 = 0;
        }
        if (i1 != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            r(-i1);
            b(-1, view);
            J = view.getTop();
            invalidate();
        }
        return flag;
    }

    public volatile void setAdapter(Adapter adapter)
    {
        setAdapter((ListAdapter)adapter);
    }

    public void setAdapter(ListAdapter listadapter)
    {
        if (j != null && i != null)
        {
            j.unregisterDataSetObserver(i);
        }
        d();
        p.b();
        if (az.size() > 0 || aA.size() > 0)
        {
            j = new b(az, aA, listadapter);
        } else
        {
            j = listadapter;
        }
        ar = -1;
        as = 0x8000000000000000L;
        super.setAdapter(listadapter);
        if (j != null)
        {
            aF = j.areAllItemsEnabled();
            ap = ao;
            ao = j.getCount();
            t();
            i = new AbsHListView.b(this);
            j.registerDataSetObserver(i);
            p.a(j.getViewTypeCount());
            int i1;
            if (K)
            {
                i1 = b(ao - 1, false);
            } else
            {
                i1 = b(0, true);
            }
            setSelectedPositionInt(i1);
            setNextSelectedPositionInt(i1);
            if (ao == 0)
            {
                v();
            }
        } else
        {
            aF = true;
            t();
            v();
        }
        requestLayout();
    }

    public void setCacheColorHint(int i1)
    {
        boolean flag;
        if (i1 >>> 24 == 255)
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
            aI.setColor(i1);
        }
        super.setCacheColorHint(i1);
    }

    public void setDivider(Drawable drawable)
    {
        boolean flag = false;
        if (drawable != null)
        {
            av = drawable.getIntrinsicWidth();
        } else
        {
            av = 0;
        }
        au = drawable;
        if (drawable == null || drawable.getOpacity() == -1)
        {
            flag = true;
        }
        aC = flag;
        requestLayout();
        invalidate();
    }

    public void setDividerWidth(int i1)
    {
        av = i1;
        requestLayout();
        invalidate();
    }

    public void setFooterDividersEnabled(boolean flag)
    {
        aE = flag;
        invalidate();
    }

    public void setHeaderDividersEnabled(boolean flag)
    {
        aD = flag;
        invalidate();
    }

    public void setItemsCanFocus(boolean flag)
    {
        aG = flag;
        if (!flag)
        {
            setDescendantFocusability(0x60000);
        }
    }

    public void setOverscrollFooter(Drawable drawable)
    {
        ay = drawable;
        invalidate();
    }

    public void setOverscrollHeader(Drawable drawable)
    {
        ax = drawable;
        if (getScrollX() < 0)
        {
            invalidate();
        }
    }

    public void setSelection(int i1)
    {
        f(i1, 0);
    }

    public void setSelectionInt(int i1)
    {
        boolean flag;
        int j1;
        flag = true;
        setNextSelectedPositionInt(i1);
        j1 = am;
        break MISSING_BLOCK_LABEL_12;
        if (j1 < 0 || i1 != j1 - 1 && i1 != j1 + 1)
        {
            flag = false;
        }
        if (I != null)
        {
            I.a();
        }
        e();
        if (flag)
        {
            awakenScrollBars();
        }
        return;
    }

    protected boolean y()
    {
        return true;
    }
}
