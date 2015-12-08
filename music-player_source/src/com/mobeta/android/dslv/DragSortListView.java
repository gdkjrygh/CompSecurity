// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobeta.android.dslv;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ListAdapter;
import android.widget.ListView;

// Referenced classes of package com.mobeta.android.dslv:
//            e, p, v, l, 
//            a, k, r, m, 
//            f, c, o, i, 
//            q, g, n, s, 
//            j

public class DragSortListView extends ListView
{

    private View A[];
    private k B;
    private float C;
    private float D;
    private int E;
    private int F;
    private float G;
    private float H;
    private float I;
    private float J;
    private float K;
    private j L;
    private int M;
    private int N;
    private int O;
    private int P;
    private int Q;
    private int R;
    private boolean S;
    private boolean T;
    private o U;
    private MotionEvent V;
    private int W;
    private View a;
    private float aa;
    private float ab;
    private g ac;
    private boolean ad;
    private l ae;
    private boolean af;
    private boolean ag;
    private p ah;
    private r ai;
    private q aj;
    private m ak;
    private boolean al;
    private float am;
    private boolean an;
    private boolean ao;
    private Point b;
    private Point c;
    private int d;
    private boolean e;
    private DataSetObserver f;
    private float g;
    private float h;
    private int i;
    private int j;
    private int k;
    private boolean l;
    private int m;
    private int n;
    private int o;
    private int p;
    private int q;
    private i r;
    private n s;
    private s t;
    private boolean u;
    private int v;
    private int w;
    private int x;
    private int y;
    private int z;

    public DragSortListView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        b = new Point();
        c = new Point();
        e = false;
        g = 1.0F;
        h = 1.0F;
        l = false;
        u = true;
        v = 0;
        w = 1;
        z = 0;
        A = new View[1];
        C = 0.3333333F;
        D = 0.3333333F;
        K = 0.5F;
        L = new e(this);
        R = 0;
        S = false;
        T = false;
        U = null;
        W = 0;
        aa = 0.25F;
        ab = 0.0F;
        ad = false;
        af = false;
        ag = false;
        ah = new p(this);
        am = 0.0F;
        an = false;
        ao = false;
        int j1 = 150;
        int i1 = 150;
        if (attributeset != null)
        {
            context = getContext().obtainStyledAttributes(attributeset, v.a, 0, 0);
            w = Math.max(1, context.getDimensionPixelSize(v.c, 1));
            ad = context.getBoolean(v.r, false);
            if (ad)
            {
                ae = new l(this);
            }
            g = context.getFloat(v.j, g);
            h = g;
            u = context.getBoolean(v.d, u);
            aa = Math.max(0.0F, Math.min(1.0F, 1.0F - context.getFloat(v.p, 0.75F)));
            float f1;
            boolean flag;
            if (aa > 0.0F)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            l = flag;
            f1 = context.getFloat(v.f, C);
            if (f1 > 0.5F)
            {
                D = 0.5F;
            } else
            {
                D = f1;
            }
            if (f1 > 0.5F)
            {
                C = 0.5F;
            } else
            {
                C = f1;
            }
            if (getHeight() != 0)
            {
                i();
            }
            K = context.getFloat(v.l, K);
            j1 = context.getInt(v.m, 150);
            i1 = context.getInt(v.h, 150);
            if (context.getBoolean(v.s, true))
            {
                flag = context.getBoolean(v.n, false);
                int k1 = context.getInt(v.o, 1);
                boolean flag1 = context.getBoolean(v.q, true);
                int l1 = context.getInt(v.g, 0);
                int i2 = context.getResourceId(v.e, 0);
                int j2 = context.getResourceId(v.i, 0);
                int k2 = context.getResourceId(v.b, 0);
                int l2 = context.getColor(v.k, 0xff000000);
                attributeset = new a(this, i2, l1, k1, k2, j2);
                attributeset.b(flag);
                attributeset.a(flag1);
                attributeset.b(l2);
                U = attributeset;
                setOnTouchListener(attributeset);
            }
            context.recycle();
        }
        B = new k(this);
        if (j1 > 0)
        {
            ai = new r(this, j1);
        }
        if (i1 > 0)
        {
            ak = new m(this, i1);
        }
        V = MotionEvent.obtain(0L, 0L, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0, 0.0F, 0.0F, 0, 0);
        f = new f(this);
    }

    static float a(DragSortListView dragsortlistview)
    {
        return dragsortlistview.K;
    }

    private int a(int i1, int j1)
    {
        int k1 = getHeaderViewsCount();
        int l1 = getFooterViewsCount();
        if (i1 <= k1 || i1 >= getCount() - l1)
        {
            return j1;
        }
        l1 = getDividerHeight();
        int j2 = x - w;
        int i2 = c(i1);
        int k2 = b(i1);
        if (k <= m)
        {
            if (i1 == k && j != k)
            {
                if (i1 == m)
                {
                    k1 = (j1 + k2) - x;
                } else
                {
                    k1 = ((k2 - i2) + j1) - j2;
                }
            } else
            {
                k1 = j1;
                if (i1 > k)
                {
                    k1 = j1;
                    if (i1 <= m)
                    {
                        k1 = j1 - j2;
                    }
                }
            }
        } else
        if (i1 > m && i1 <= j)
        {
            k1 = j1 + j2;
        } else
        {
            k1 = j1;
            if (i1 == k)
            {
                k1 = j1;
                if (j != k)
                {
                    k1 = j1 + (k2 - i2);
                }
            }
        }
        if (i1 <= m)
        {
            return (x - l1 - c(i1 - 1)) / 2 + k1;
        } else
        {
            return (i2 - l1 - x) / 2 + k1;
        }
    }

    static int a(DragSortListView dragsortlistview, int i1, int j1)
    {
        return dragsortlistview.a(i1, j1);
    }

    private void a(int i1, float f1)
    {
        if (v != 0 && v != 4) goto _L2; else goto _L1
_L1:
        if (v == 0)
        {
            m = getHeaderViewsCount() + i1;
            j = m;
            k = m;
            i = m;
            View view = getChildAt(m - getFirstVisiblePosition());
            if (view != null)
            {
                view.setVisibility(4);
            }
        }
        v = 1;
        am = f1;
        if (!T) goto _L4; else goto _L3
_L3:
        W;
        JVM INSTR tableswitch 1 2: default 124
    //                   1 139
    //                   2 151;
           goto _L4 _L5 _L6
_L4:
        if (ai == null)
        {
            break; /* Loop/switch isn't completed */
        }
        ai.c();
_L2:
        return;
_L5:
        super.onTouchEvent(V);
        continue; /* Loop/switch isn't completed */
_L6:
        super.onInterceptTouchEvent(V);
        if (true) goto _L4; else goto _L7
_L7:
        f();
        return;
    }

    private void a(int i1, Canvas canvas)
    {
        Drawable drawable = getDivider();
        int i2 = getDividerHeight();
        if (drawable != null && i2 != 0)
        {
            ViewGroup viewgroup = (ViewGroup)getChildAt(i1 - getFirstVisiblePosition());
            if (viewgroup != null)
            {
                int k1 = getPaddingLeft();
                int l1 = getWidth() - getPaddingRight();
                int j1 = viewgroup.getChildAt(0).getHeight();
                if (i1 > m)
                {
                    j1 += viewgroup.getTop();
                    i1 = j1 + i2;
                } else
                {
                    i1 = viewgroup.getBottom() - j1;
                    j1 = i1 - i2;
                }
                canvas.save();
                canvas.clipRect(k1, j1, l1, i1);
                drawable.setBounds(k1, j1, l1, i1);
                drawable.draw(canvas);
                canvas.restore();
            }
        }
    }

    private void a(int i1, View view, boolean flag)
    {
        android.view.ViewGroup.LayoutParams layoutparams = view.getLayoutParams();
        int j1;
        boolean flag1;
        int k1;
        if (i1 != m && i1 != j && i1 != k)
        {
            j1 = -2;
        } else
        {
            j1 = b(i1, b(i1, view, flag));
        }
        if (j1 != layoutparams.height)
        {
            layoutparams.height = j1;
            view.setLayoutParams(layoutparams);
        }
        if (i1 != j && i1 != k) goto _L2; else goto _L1
_L1:
        if (i1 >= m) goto _L4; else goto _L3
_L3:
        ((c)view).a(80);
_L2:
        k1 = view.getVisibility();
        flag1 = false;
        j1 = ((flag1) ? 1 : 0);
        if (i1 == m)
        {
            j1 = ((flag1) ? 1 : 0);
            if (a != null)
            {
                j1 = 4;
            }
        }
        if (j1 != k1)
        {
            view.setVisibility(j1);
        }
        return;
_L4:
        if (i1 > m)
        {
            ((c)view).a(48);
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    private void a(MotionEvent motionevent)
    {
        int i1 = motionevent.getAction() & 0xff;
        if (i1 != 0)
        {
            O = M;
            P = N;
        }
        M = (int)motionevent.getX();
        N = (int)motionevent.getY();
        if (i1 == 0)
        {
            O = M;
            P = N;
        }
        p = (int)motionevent.getRawX() - M;
        q = (int)motionevent.getRawY() - N;
    }

    private void a(View view)
    {
        android.view.ViewGroup.LayoutParams layoutparams = view.getLayoutParams();
        Object obj = layoutparams;
        if (layoutparams == null)
        {
            obj = new android.widget.AbsListView.LayoutParams(-1, -2);
            view.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        }
        int j1 = ViewGroup.getChildMeasureSpec(z, getListPaddingLeft() + getListPaddingRight(), ((android.view.ViewGroup.LayoutParams) (obj)).width);
        int i1;
        if (((android.view.ViewGroup.LayoutParams) (obj)).height > 0)
        {
            i1 = android.view.View.MeasureSpec.makeMeasureSpec(((android.view.ViewGroup.LayoutParams) (obj)).height, 0x40000000);
        } else
        {
            i1 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        }
        view.measure(j1, i1);
    }

    static void a(DragSortListView dragsortlistview, float f1)
    {
        dragsortlistview.am = f1;
    }

    static void a(DragSortListView dragsortlistview, int i1)
    {
        dragsortlistview.o = i1;
    }

    static void a(DragSortListView dragsortlistview, int i1, View view)
    {
        dragsortlistview.a(i1, view, true);
    }

    static void a(DragSortListView dragsortlistview, boolean flag)
    {
        dragsortlistview.af = flag;
    }

    private boolean a(boolean flag, float f1)
    {
        if (a != null)
        {
            B.c();
            if (flag)
            {
                a(m - getHeaderViewsCount(), f1);
            } else
            if (ak != null)
            {
                ak.c();
            } else
            {
                e();
            }
            if (ad)
            {
                ae.c();
            }
            return true;
        } else
        {
            return false;
        }
    }

    private int b(int i1)
    {
        View view = getChildAt(i1 - getFirstVisiblePosition());
        if (view != null)
        {
            return view.getHeight();
        } else
        {
            return b(i1, c(i1));
        }
    }

    private int b(int i1, int j1)
    {
        int k1;
        int l1;
        int i2;
        getDividerHeight();
        if (l && j != k)
        {
            k1 = 1;
        } else
        {
            k1 = 0;
        }
        l1 = x - w;
        i2 = (int)(ab * (float)l1);
        if (i1 != m) goto _L2; else goto _L1
_L1:
        if (m != j) goto _L4; else goto _L3
_L3:
        if (k1 == 0) goto _L6; else goto _L5
_L5:
        k1 = i2 + w;
_L8:
        return k1;
_L6:
        return x;
_L4:
        if (m == k)
        {
            return x - i2;
        } else
        {
            return w;
        }
_L2:
        if (i1 == j)
        {
            if (k1 != 0)
            {
                return j1 + i2;
            } else
            {
                return j1 + l1;
            }
        }
        k1 = j1;
        if (i1 == k)
        {
            return (j1 + l1) - i2;
        }
        if (true) goto _L8; else goto _L7
_L7:
    }

    private int b(int i1, View view, boolean flag)
    {
        boolean flag1 = false;
        if (i1 == m)
        {
            i1 = ((flag1) ? 1 : 0);
        } else
        {
            View view1 = view;
            if (i1 >= getHeaderViewsCount())
            {
                if (i1 >= getCount() - getFooterViewsCount())
                {
                    view1 = view;
                } else
                {
                    view1 = ((ViewGroup)view).getChildAt(0);
                }
            }
            view = view1.getLayoutParams();
            if (view != null && ((android.view.ViewGroup.LayoutParams) (view)).height > 0)
            {
                return ((android.view.ViewGroup.LayoutParams) (view)).height;
            }
            i1 = view1.getHeight();
            if (i1 == 0 || flag)
            {
                a(view1);
                return view1.getMeasuredHeight();
            }
        }
        return i1;
    }

    static int b(DragSortListView dragsortlistview)
    {
        return dragsortlistview.o;
    }

    static int b(DragSortListView dragsortlistview, int i1, View view)
    {
        return dragsortlistview.b(i1, view, false);
    }

    static void b(DragSortListView dragsortlistview, int i1)
    {
        dragsortlistview.v = i1;
    }

    private int c(int i1)
    {
        int j1 = 0;
        if (i1 != m)
        {
            View view = getChildAt(i1 - getFirstVisiblePosition());
            if (view != null)
            {
                return b(i1, view, false);
            }
            int l1 = ah.a(i1);
            j1 = l1;
            if (l1 == -1)
            {
                Object obj = getAdapter();
                int k1 = ((ListAdapter) (obj)).getItemViewType(i1);
                int i2 = ((ListAdapter) (obj)).getViewTypeCount();
                if (i2 != A.length)
                {
                    A = new View[i2];
                }
                if (k1 >= 0)
                {
                    if (A[k1] == null)
                    {
                        obj = ((ListAdapter) (obj)).getView(i1, null, this);
                        A[k1] = ((View) (obj));
                    } else
                    {
                        obj = ((ListAdapter) (obj)).getView(i1, A[k1], this);
                    }
                } else
                {
                    obj = ((ListAdapter) (obj)).getView(i1, null, this);
                }
                k1 = b(i1, ((View) (obj)), true);
                ah.a(i1, k1);
                return k1;
            }
        }
        return j1;
    }

    static int c(DragSortListView dragsortlistview)
    {
        return dragsortlistview.y;
    }

    static int c(DragSortListView dragsortlistview, int i1)
    {
        return dragsortlistview.b(i1);
    }

    private void c(int i1, View view, boolean flag)
    {
        float f2;
        int j1;
        int k1;
        int l1;
        int i2;
        int l2;
        int k3;
        int i4;
        int j4;
        af = true;
        if (U != null)
        {
            c.set(M, N);
            o o1 = U;
            Object obj = a;
            obj = b;
            Point point = c;
            o1.a(((Point) (obj)));
        }
        j1 = b.x;
        i2 = b.y;
        k1 = getPaddingLeft();
        float f1;
        View view1;
        View view2;
        int j2;
        int i3;
        int l3;
        if ((R & 1) == 0 && j1 > k1)
        {
            b.x = k1;
        } else
        if ((R & 2) == 0 && j1 < k1)
        {
            b.x = k1;
        }
        k1 = getHeaderViewsCount();
        l1 = getFooterViewsCount();
        j2 = getFirstVisiblePosition();
        l2 = getLastVisiblePosition();
        j1 = getPaddingTop();
        if (j2 < k1)
        {
            j1 = getChildAt(k1 - j2 - 1).getBottom();
        }
        k1 = j1;
        if ((R & 8) == 0)
        {
            k1 = j1;
            if (j2 <= m)
            {
                k1 = Math.max(getChildAt(m - j2).getTop(), j1);
            }
        }
        j1 = getHeight() - getPaddingBottom();
        if (l2 >= getCount() - l1 - 1)
        {
            j1 = getChildAt(getCount() - l1 - 1 - j2).getBottom();
        }
        l1 = j1;
        if ((R & 4) == 0)
        {
            l1 = j1;
            if (l2 >= m)
            {
                l1 = Math.min(getChildAt(m - j2).getBottom(), j1);
            }
        }
        if (i2 < k1)
        {
            b.y = k1;
        } else
        if (x + i2 > l1)
        {
            b.y = l1 - x;
        }
        d = b.y + y;
        l3 = j;
        i4 = k;
        j1 = getFirstVisiblePosition();
        k1 = j;
        view2 = getChildAt(k1 - j1);
        view1 = view2;
        if (view2 == null)
        {
            k1 = j1 + getChildCount() / 2;
            view1 = getChildAt(k1 - j1);
        }
        i2 = view1.getTop();
        l2 = view1.getHeight();
        j1 = a(k1, i2);
        j4 = getDividerHeight();
        if (d >= j1) goto _L2; else goto _L1
_L1:
        l1 = j1;
_L5:
        if (k1 >= 0)
        {
label0:
            {
                k2 = k1 - 1;
                j1 = b(k2);
                if (k2 != 0)
                {
                    break label0;
                }
                j1 = i2 - j4 - j1;
                k1 = k2;
            }
        }
_L4:
        j2 = getHeaderViewsCount();
        k3 = getFooterViewsCount();
        l2 = j;
        i3 = k;
        f1 = ab;
        if (!l)
        {
            break MISSING_BLOCK_LABEL_1189;
        }
        j4 = Math.abs(j1 - l1);
        int j3;
        int k4;
        if (d >= j1)
        {
            i2 = l1;
            l1 = j1;
            j1 = i2;
        }
        f2 = aa;
        i2 = (int)((float)j4 * (0.5F * f2));
        f2 = i2;
        l1 += i2;
        if (d < l1)
        {
            j = k1 - 1;
            k = k1;
            ab = ((float)(l1 - d) * 0.5F) / f2;
        } else
        {
            if (d < j1 - i2)
            {
                break MISSING_BLOCK_LABEL_1189;
            }
            j = k1;
            k = k1 + 1;
            ab = 0.5F * ((float)(j1 - d) / f2 + 1.0F);
        }
_L8:
label1:
        {
            {
                int k2;
                if (j < j2)
                {
                    j = j2;
                    k = j2;
                    k1 = j2;
                } else
                if (k >= getCount() - k3)
                {
                    k1 = getCount() - k3 - 1;
                    j = k1;
                    k = k1;
                }
                if (j != l2 || k != i3 || ab != f1)
                {
                    j1 = 1;
                } else
                {
                    j1 = 0;
                }
                if (k1 != i)
                {
                    if (r != null)
                    {
                        r.b(i - j2, k1 - j2);
                    }
                    i = k1;
                    k1 = 1;
                } else
                {
                    k1 = j1;
                }
                if (k1 == 0)
                {
                    break label1;
                }
                j();
                l1 = c(i1);
                k2 = view.getHeight();
                l2 = b(i1, l1);
                if (i1 != m)
                {
                    j1 = k2 - l1;
                    l1 = l2 - l1;
                } else
                {
                    j1 = k2;
                    l1 = l2;
                }
                i3 = x;
                i2 = i3;
                if (m != j)
                {
                    i2 = i3;
                    if (m != k)
                    {
                        i2 = i3 - w;
                    }
                }
                if (i1 <= l3)
                {
                    if (i1 <= j)
                    {
                        break MISSING_BLOCK_LABEL_1333;
                    }
                    j1 = (i2 - l1) + 0;
                } else
                if (i1 == i4)
                {
                    if (i1 <= j)
                    {
                        j1 = (j1 - i2) + 0;
                    } else
                    if (i1 == k)
                    {
                        j1 = (k2 - l2) + 0;
                    } else
                    {
                        j1 += 0;
                    }
                } else
                if (i1 <= j)
                {
                    j1 = 0 - i2;
                } else
                {
                    if (i1 != k)
                    {
                        break MISSING_BLOCK_LABEL_1333;
                    }
                    j1 = 0 - l1;
                }
            }
            setSelectionFromTop(i1, (j1 + view.getTop()) - getPaddingTop());
            layoutChildren();
        }
        if (k1 != 0 || flag)
        {
            invalidate();
        }
        af = false;
        return;
        l2 = i2 - (j1 + j4);
        i2 = a(k2, l2);
        k1 = k2;
        j1 = i2;
        if (d >= i2) goto _L4; else goto _L3
_L3:
        l1 = i2;
        k1 = k2;
        j1 = i2;
        i2 = l2;
          goto _L5
_L2:
        k4 = getCount();
        j3 = i2;
        k2 = j1;
        i2 = k1;
_L7:
        k1 = i2;
        l1 = k2;
        if (i2 < k4)
        {
label2:
            {
                if (i2 != k4 - 1)
                {
                    break label2;
                }
                j1 = j3 + j4 + l2;
                k1 = i2;
                l1 = k2;
            }
        }
          goto _L4
        j3 += j4 + l2;
        k3 = b(i2 + 1);
        l2 = a(i2 + 1, j3);
        k1 = i2;
        l1 = k2;
        j1 = l2;
        if (d < l2) goto _L4; else goto _L6
_L6:
        i2++;
        k2 = l2;
        j1 = l2;
        l2 = k3;
          goto _L7
        j = k1;
        k = k1;
          goto _L8
        j1 = 0;
        break MISSING_BLOCK_LABEL_799;
    }

    static void c(DragSortListView dragsortlistview, int i1, View view)
    {
        dragsortlistview.c(i1, view, false);
    }

    static int d(DragSortListView dragsortlistview)
    {
        return dragsortlistview.v;
    }

    static int d(DragSortListView dragsortlistview, int i1)
    {
        return dragsortlistview.c(i1);
    }

    private void d()
    {
        m = -1;
        j = -1;
        k = -1;
        i = -1;
    }

    static Point e(DragSortListView dragsortlistview)
    {
        return dragsortlistview.b;
    }

    private void e()
    {
        v = 2;
        if (s != null && i >= 0 && i < getCount())
        {
            getHeaderViewsCount();
            n n1 = s;
            int i1 = m;
            i1 = i;
        }
        m();
        g();
        d();
        j();
        if (T)
        {
            v = 3;
            return;
        } else
        {
            v = 0;
            return;
        }
    }

    static int f(DragSortListView dragsortlistview)
    {
        return dragsortlistview.N;
    }

    private void f()
    {
        v = 1;
        s s1;
        if (t != null)
        {
            s1 = t;
        }
        m();
        g();
        d();
        if (T)
        {
            v = 3;
            return;
        } else
        {
            v = 0;
            return;
        }
    }

    private void g()
    {
        int i1 = 0;
        int j1 = getFirstVisiblePosition();
        if (m < j1)
        {
            View view = getChildAt(0);
            if (view != null)
            {
                i1 = view.getTop();
            }
            setSelectionFromTop(j1 - 1, i1 - getPaddingTop());
        }
    }

    static void g(DragSortListView dragsortlistview)
    {
        dragsortlistview.l();
    }

    static int h(DragSortListView dragsortlistview)
    {
        return dragsortlistview.i;
    }

    private void h()
    {
        W = 0;
        T = false;
        Log.i("DragSortListView", (new StringBuilder("doActionUpOrCancel --> mDragState:")).append(v).toString());
        if (v != 0)
        {
            r.g();
        }
        if (v == 3)
        {
            v = 0;
        }
        h = g;
        an = false;
        ah.a();
    }

    static int i(DragSortListView dragsortlistview)
    {
        return dragsortlistview.m;
    }

    private void i()
    {
        int i1 = getPaddingTop();
        int j1 = getHeight() - i1 - getPaddingBottom();
        float f1 = j1;
        H = (float)i1 + C * f1;
        float f2 = i1;
        G = f1 * (1.0F - D) + f2;
        E = (int)H;
        F = (int)G;
        I = H - (float)i1;
        J = (float)(i1 + j1) - G;
    }

    static int j(DragSortListView dragsortlistview)
    {
        return dragsortlistview.w;
    }

    private void j()
    {
        int j1 = getFirstVisiblePosition();
        int k1 = getLastVisiblePosition();
        int i1 = Math.max(0, getHeaderViewsCount() - j1);
        k1 = Math.min(k1 - j1, getCount() - 1 - getFooterViewsCount() - j1);
        do
        {
            if (i1 > k1)
            {
                return;
            }
            View view = getChildAt(i1);
            if (view != null)
            {
                a(j1 + i1, view, false);
            }
            i1++;
        } while (true);
    }

    static int k(DragSortListView dragsortlistview)
    {
        return dragsortlistview.x;
    }

    private void k()
    {
        if (a != null)
        {
            a(a);
            x = a.getMeasuredHeight();
            y = x / 2;
        }
    }

    private void l()
    {
        int i1 = getFirstVisiblePosition();
        int j1 = getChildCount() / 2;
        View view = getChildAt(getChildCount() / 2);
        if (view == null)
        {
            return;
        } else
        {
            c(i1 + j1, view, true);
            return;
        }
    }

    static void l(DragSortListView dragsortlistview)
    {
        dragsortlistview.e();
    }

    static int m(DragSortListView dragsortlistview)
    {
        return dragsortlistview.j;
    }

    private void m()
    {
        if (a != null)
        {
            a.setVisibility(8);
            if (U != null)
            {
                U.a(a);
            }
            a = null;
            invalidate();
        }
    }

    static int n(DragSortListView dragsortlistview)
    {
        return dragsortlistview.k;
    }

    static boolean o(DragSortListView dragsortlistview)
    {
        return dragsortlistview.al;
    }

    static float p(DragSortListView dragsortlistview)
    {
        return dragsortlistview.am;
    }

    static void q(DragSortListView dragsortlistview)
    {
        dragsortlistview.m();
    }

    static void r(DragSortListView dragsortlistview)
    {
        int i1 = dragsortlistview.m;
        dragsortlistview.getHeaderViewsCount();
        dragsortlistview.f();
    }

    static int s(DragSortListView dragsortlistview)
    {
        return dragsortlistview.d;
    }

    static j t(DragSortListView dragsortlistview)
    {
        return dragsortlistview.L;
    }

    static float u(DragSortListView dragsortlistview)
    {
        return dragsortlistview.H;
    }

    static float v(DragSortListView dragsortlistview)
    {
        return dragsortlistview.I;
    }

    static float w(DragSortListView dragsortlistview)
    {
        return dragsortlistview.G;
    }

    static float x(DragSortListView dragsortlistview)
    {
        return dragsortlistview.J;
    }

    static int y(DragSortListView dragsortlistview)
    {
        return dragsortlistview.P;
    }

    public final void a()
    {
label0:
        {
            if (v == 4)
            {
                B.c();
                m();
                d();
                j();
                if (!T)
                {
                    break label0;
                }
                v = 3;
            }
            return;
        }
        v = 0;
    }

    public final void a(int i1)
    {
        al = false;
        a(i1, 0.0F);
    }

    public final void a(i i1)
    {
        r = i1;
    }

    public final void a(boolean flag)
    {
        u = flag;
    }

    public final boolean a(float f1)
    {
        al = true;
        return a(true, f1);
    }

    public final boolean a(int i1, int j1, int k1, int l1)
    {
        if (T && U != null) goto _L2; else goto _L1
_L1:
        View view;
        return false;
_L2:
        if ((view = U.a(i1)) == null || v != 0 || !T || a != null || view == null || !u) goto _L1; else goto _L3
_L3:
        if (getParent() != null)
        {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        i1 = getHeaderViewsCount() + i1;
        j = i1;
        k = i1;
        m = i1;
        i = i1;
        v = 4;
        R = 0;
        R = R | j1;
        a = view;
        k();
        n = k1;
        o = l1;
        Q = N;
        b.x = M - n;
        b.y = N - o;
        view = getChildAt(m - getFirstVisiblePosition());
        if (view != null)
        {
            view.setVisibility(4);
        }
        if (ad)
        {
            ae.a();
        }
        W;
        JVM INSTR tableswitch 1 2: default 256
    //                   1 276
    //                   2 288;
           goto _L4 _L5 _L6
_L4:
        requestLayout();
        if (aj != null)
        {
            aj.c();
        }
        return true;
_L5:
        super.onTouchEvent(V);
        continue; /* Loop/switch isn't completed */
_L6:
        super.onInterceptTouchEvent(V);
        if (true) goto _L4; else goto _L7
_L7:
    }

    public final boolean b()
    {
        return an;
    }

    public final boolean c()
    {
        return u;
    }

    protected void dispatchDraw(Canvas canvas)
    {
        super.dispatchDraw(canvas);
        if (v != 0)
        {
            if (j != m)
            {
                a(j, canvas);
            }
            if (k != j && k != m)
            {
                a(k, canvas);
            }
        }
        if (a != null)
        {
            int k1 = a.getWidth();
            int l1 = a.getHeight();
            int j1 = b.x;
            int i2 = getWidth();
            int i1 = j1;
            if (j1 < 0)
            {
                i1 = -j1;
            }
            float f1;
            if (i1 < i2)
            {
                f1 = (float)(i2 - i1) / (float)i2;
                f1 *= f1;
            } else
            {
                f1 = 0.0F;
            }
            i1 = (int)(f1 * (255F * h));
            canvas.save();
            canvas.translate(b.x, b.y);
            canvas.clipRect(0, 0, k1, l1);
            canvas.saveLayerAlpha(0.0F, 0.0F, k1, l1, i1, 31);
            a.draw(canvas);
            canvas.restore();
            canvas.restore();
        }
    }

    protected void layoutChildren()
    {
        super.layoutChildren();
        if (a != null)
        {
            if (a.isLayoutRequested() && !e)
            {
                k();
            }
            a.layout(0, 0, a.getMeasuredWidth(), a.getMeasuredHeight());
            e = false;
        }
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        if (ad)
        {
            ae.b();
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        int i1;
        if (!u)
        {
            return super.onInterceptTouchEvent(motionevent);
        }
        a(motionevent);
        S = true;
        i1 = motionevent.getAction() & 0xff;
        if (i1 == 0)
        {
            if (v != 0)
            {
                ag = true;
                return true;
            }
            T = true;
        }
        if (a == null) goto _L2; else goto _L1
_L1:
        boolean flag = true;
_L4:
        if (i1 == 1 || i1 == 3)
        {
            T = false;
        }
        return flag;
_L2:
        if (super.onInterceptTouchEvent(motionevent))
        {
            an = true;
            flag = true;
        } else
        {
            flag = false;
        }
        switch (i1)
        {
        case 2: // '\002'
        default:
            if (flag)
            {
                W = 1;
            } else
            {
                W = 2;
            }
            break;

        case 1: // '\001'
        case 3: // '\003'
            h();
            break;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected void onMeasure(int i1, int j1)
    {
        super.onMeasure(i1, j1);
        if (a != null)
        {
            if (a.isLayoutRequested())
            {
                k();
            }
            e = true;
        }
        z = i1;
    }

    protected void onSizeChanged(int i1, int j1, int k1, int l1)
    {
        super.onSizeChanged(i1, j1, k1, l1);
        i();
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        boolean flag;
        boolean flag3;
        flag3 = false;
        flag = false;
        if (!ag) goto _L2; else goto _L1
_L1:
        ag = false;
        flag3 = flag;
_L10:
        return flag3;
_L2:
        if (!u)
        {
            return super.onTouchEvent(motionevent);
        }
        boolean flag1 = S;
        S = false;
        if (!flag1)
        {
            a(motionevent);
        }
        if (v != 4) goto _L4; else goto _L3
_L3:
        motionevent.getAction();
        motionevent.getAction() & 0xff;
        JVM INSTR tableswitch 1 3: default 108
    //                   1 129
    //                   2 156
    //                   3 110;
           goto _L5 _L6 _L7 _L8
_L5:
        return true;
_L8:
        if (v == 4)
        {
            a();
        }
        h();
        continue; /* Loop/switch isn't completed */
_L6:
        if (v == 4)
        {
            al = false;
            a(false, 0.0F);
        }
        h();
        continue; /* Loop/switch isn't completed */
_L7:
        int i1 = (int)motionevent.getX();
        int j1 = (int)motionevent.getY();
        b.x = i1 - n;
        b.y = j1 - o;
        l();
        i1 = Math.min(j1, d + y);
        j1 = Math.max(j1, d - y);
        int k1 = B.b();
        if (i1 > P && i1 > F && k1 != 1)
        {
            if (k1 != -1)
            {
                B.c();
            }
            B.a(1);
        } else
        if (j1 < P && j1 < E && k1 != 0)
        {
            if (k1 != -1)
            {
                B.c();
            }
            B.a(0);
        } else
        if (j1 >= E && i1 <= F && B.a())
        {
            B.c();
        }
        if (true) goto _L5; else goto _L4
_L4:
        boolean flag2 = flag3;
        if (v == 0)
        {
            flag2 = flag3;
            if (super.onTouchEvent(motionevent))
            {
                flag2 = true;
            }
        }
        switch (motionevent.getAction() & 0xff)
        {
        case 2: // '\002'
        default:
            flag3 = flag2;
            if (flag2)
            {
                W = 1;
                return flag2;
            }
            break;

        case 1: // '\001'
        case 3: // '\003'
            h();
            return flag2;
        }
        if (true) goto _L10; else goto _L9
_L9:
    }

    public void requestLayout()
    {
        if (!af)
        {
            super.requestLayout();
        }
    }

    public void setAdapter(ListAdapter listadapter)
    {
        if (listadapter != null)
        {
            ac = new g(this, listadapter);
            listadapter.registerDataSetObserver(f);
            if (listadapter instanceof n)
            {
                s = (n)listadapter;
            }
            if (listadapter instanceof i)
            {
                r = (i)listadapter;
            }
            if (listadapter instanceof s)
            {
                t = (s)listadapter;
            }
        } else
        {
            ac = null;
        }
        super.setAdapter(ac);
    }
}
