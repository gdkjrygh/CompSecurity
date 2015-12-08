// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.widget;

import android.content.Context;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Adapter;

public abstract class AviaryAdapterView extends ViewGroup
{
    private class SelectionNotifier
        implements Runnable
    {

        final AviaryAdapterView a;

        public void run()
        {
            if (a.A)
            {
                if (a.getAdapter() != null)
                {
                    a.post(this);
                }
                return;
            } else
            {
                a.f();
                return;
            }
        }

        private SelectionNotifier()
        {
            a = AviaryAdapterView.this;
            super();
        }

    }

    public static class a
        implements android.view.ContextMenu.ContextMenuInfo
    {
    }

    class b extends DataSetObserver
    {

        final AviaryAdapterView a;
        private Parcelable b;

        public void onChanged()
        {
            a.A = true;
            a.G = a.F;
            a.F = a.getAdapter().getCount();
            if (a.getAdapter().hasStableIds() && b != null && a.G == 0 && a.F > 0)
            {
                AviaryAdapterView.a(a, b);
                b = null;
            } else
            {
                a.j();
            }
            a.e();
            a.requestLayout();
        }

        public void onInvalidated()
        {
            a.A = true;
            if (a.getAdapter().hasStableIds())
            {
                b = AviaryAdapterView.a(a);
            }
            a.G = a.F;
            a.F = 0;
            a.D = -1;
            a.E = 0x8000000000000000L;
            a.B = -1;
            a.C = 0x8000000000000000L;
            a.u = false;
            a.e();
            a.requestLayout();
        }

        b()
        {
            a = AviaryAdapterView.this;
            super();
            b = null;
        }
    }

    public static interface c
    {

        public abstract void d(AviaryAdapterView aviaryadapterview, View view, int k, long l);
    }

    public static interface d
    {
    }

    public static interface e
    {

        public abstract void a(AviaryAdapterView aviaryadapterview);

        public abstract void a(AviaryAdapterView aviaryadapterview, View view, int k, long l);
    }


    boolean A;
    int B;
    long C;
    int D;
    long E;
    int F;
    int G;
    int H;
    long I;
    boolean J;
    private int a;
    private View b;
    private boolean c;
    private boolean d;
    private SelectionNotifier e;
    int p;
    int q;
    int r;
    long s;
    long t;
    boolean u;
    int v;
    boolean w;
    e x;
    c y;
    d z;

    public AviaryAdapterView(Context context)
    {
        super(context);
        p = 0;
        s = 0x8000000000000000L;
        u = false;
        w = false;
        B = -1;
        C = 0x8000000000000000L;
        D = -1;
        E = 0x8000000000000000L;
        H = -1;
        I = 0x8000000000000000L;
        J = false;
    }

    public AviaryAdapterView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        p = 0;
        s = 0x8000000000000000L;
        u = false;
        w = false;
        B = -1;
        C = 0x8000000000000000L;
        D = -1;
        E = 0x8000000000000000L;
        H = -1;
        I = 0x8000000000000000L;
        J = false;
    }

    public AviaryAdapterView(Context context, AttributeSet attributeset, int k)
    {
        super(context, attributeset, k);
        p = 0;
        s = 0x8000000000000000L;
        u = false;
        w = false;
        B = -1;
        C = 0x8000000000000000L;
        D = -1;
        E = 0x8000000000000000L;
        H = -1;
        I = 0x8000000000000000L;
        J = false;
    }

    static Parcelable a(AviaryAdapterView aviaryadapterview)
    {
        return aviaryadapterview.onSaveInstanceState();
    }

    static void a(AviaryAdapterView aviaryadapterview, Parcelable parcelable)
    {
        aviaryadapterview.onRestoreInstanceState(parcelable);
    }

    private void a(boolean flag)
    {
        if (d())
        {
            flag = false;
        }
        if (flag)
        {
            if (b != null)
            {
                b.setVisibility(0);
                setVisibility(8);
            } else
            {
                setVisibility(0);
            }
            if (A)
            {
                onLayout(false, getLeft(), getTop(), getRight(), getBottom());
            }
            return;
        }
        if (b != null)
        {
            b.setVisibility(8);
        }
        setVisibility(0);
    }

    int a(int k, boolean flag)
    {
        return k;
    }

    public long a(int k)
    {
        Adapter adapter = getAdapter();
        if (adapter == null || k < 0)
        {
            return 0x8000000000000000L;
        } else
        {
            return adapter.getItemId(k);
        }
    }

    public boolean a(View view, int k, long l)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (y != null)
        {
            flag = flag1;
            if (view != null)
            {
                playSoundEffect(0);
                view.sendAccessibilityEvent(1);
                y.d(this, view, k, l);
                flag = true;
            }
        }
        return flag;
    }

    public void addView(View view)
    {
        throw new UnsupportedOperationException("addView(View) is not supported in AviaryAdapterView");
    }

    public void addView(View view, int k)
    {
        throw new UnsupportedOperationException("addView(View, int) is not supported in AviaryAdapterView");
    }

    public void addView(View view, int k, android.view.ViewGroup.LayoutParams layoutparams)
    {
        throw new UnsupportedOperationException("addView(View, int, LayoutParams) is not supported in AviaryAdapterView");
    }

    public void addView(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        throw new UnsupportedOperationException("addView(View, LayoutParams) is not supported in AviaryAdapterView");
    }

    void b(int k, int l)
    {
        Log.i("View", (new StringBuilder()).append("selectionChanged: ").append(D).toString());
        if (x != null)
        {
            if (w || J)
            {
                if (e == null)
                {
                    e = new SelectionNotifier();
                }
                post(e);
            } else
            {
                f();
            }
        }
        if (D != -1 && isShown() && !isInTouchMode())
        {
            sendAccessibilityEvent(4);
        }
    }

    protected boolean canAnimate()
    {
        return super.canAnimate() && F > 0;
    }

    boolean d()
    {
        return false;
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityevent)
    {
        View view = getSelectedView();
        return view != null && view.getVisibility() == 0 && view.dispatchPopulateAccessibilityEvent(accessibilityevent);
    }

    protected void dispatchRestoreInstanceState(SparseArray sparsearray)
    {
        dispatchThawSelfOnly(sparsearray);
    }

    protected void dispatchSaveInstanceState(SparseArray sparsearray)
    {
        dispatchFreezeSelfOnly(sparsearray);
    }

    void e()
    {
label0:
        {
label1:
            {
                boolean flag2 = false;
                Adapter adapter = getAdapter();
                boolean flag;
                boolean flag1;
                if (adapter == null || adapter.getCount() == 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (!flag || d())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (flag && d)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                super.setFocusableInTouchMode(flag1);
                if (flag && c)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                super.setFocusable(flag1);
                if (b == null)
                {
                    break label0;
                }
                if (adapter != null)
                {
                    flag1 = flag2;
                    if (!adapter.isEmpty())
                    {
                        break label1;
                    }
                }
                flag1 = true;
            }
            a(flag1);
        }
    }

    protected void f()
    {
        if (x == null)
        {
            return;
        }
        int k = getSelectedItemPosition();
        if (k >= 0)
        {
            View view = getSelectedView();
            x.a(this, view, k, getAdapter().getItemId(k));
            return;
        } else
        {
            x.a(this);
            return;
        }
    }

    void g()
    {
        int j1;
        j1 = F;
        if (j1 <= 0)
        {
            break MISSING_BLOCK_LABEL_161;
        }
        if (!u) goto _L2; else goto _L1
_L1:
        int k;
        u = false;
        k = i();
        if (k < 0 || a(k, true) != k) goto _L2; else goto _L3
_L3:
        boolean flag;
        setNextSelectedPositionInt(k);
        flag = true;
_L4:
        if (!flag)
        {
            int i1 = getSelectedItemPosition();
            int l = i1;
            if (i1 >= j1)
            {
                l = j1 - 1;
            }
            i1 = l;
            if (l < 0)
            {
                i1 = 0;
            }
            l = a(i1, true);
            if (l < 0)
            {
                l = a(i1, false);
            }
            if (l >= 0)
            {
                setNextSelectedPositionInt(l);
                h();
                flag = true;
            }
        }
_L5:
        if (!flag)
        {
            D = -1;
            E = 0x8000000000000000L;
            B = -1;
            C = 0x8000000000000000L;
            u = false;
            h();
        }
        return;
_L2:
        flag = false;
          goto _L4
        flag = false;
          goto _L5
    }

    public abstract Adapter getAdapter();

    public int getCount()
    {
        return F;
    }

    public View getEmptyView()
    {
        return b;
    }

    public int getFirstVisiblePosition()
    {
        return p;
    }

    public int getLastVisiblePosition()
    {
        return (p + getChildCount()) - 1;
    }

    public final c getOnItemClickListener()
    {
        return y;
    }

    public final d getOnItemLongClickListener()
    {
        return z;
    }

    public final e getOnItemSelectedListener()
    {
        return x;
    }

    public Object getSelectedItem()
    {
        Adapter adapter = getAdapter();
        int k = getSelectedItemPosition();
        if (adapter != null && adapter.getCount() > 0 && k >= 0)
        {
            return adapter.getItem(k);
        } else
        {
            return null;
        }
    }

    public long getSelectedItemId()
    {
        return C;
    }

    public int getSelectedItemPosition()
    {
        return B;
    }

    public abstract View getSelectedView();

    void h()
    {
        StringBuilder stringbuilder = (new StringBuilder()).append("checkSelectionChanged ");
        boolean flag;
        if (D != H || E != I)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Log.i("View", stringbuilder.append(flag).toString());
        if (D != H || E != I)
        {
            b(H, D);
            H = D;
            I = E;
        }
    }

    int i()
    {
        int l1 = F;
        if (l1 != 0) goto _L2; else goto _L1
_L1:
        int j1 = -1;
_L4:
        return j1;
_L2:
        Adapter adapter;
        int k;
        boolean flag;
        long l2;
        long l3;
        l2 = s;
        k = r;
        if (l2 == 0x8000000000000000L)
        {
            return -1;
        }
        k = Math.min(l1 - 1, Math.max(0, k));
        l3 = SystemClock.uptimeMillis();
        flag = false;
        adapter = getAdapter();
        if (adapter == null)
        {
            return -1;
        }
        break MISSING_BLOCK_LABEL_196;
_L6:
        int l;
        int i1;
        boolean flag1;
        if (flag1 || flag && j1 == 0)
        {
            l++;
            flag = false;
            k = l;
        } else
        if (j1 != 0 || !flag && !flag1)
        {
            i1--;
            flag = true;
            k = i1;
        }
_L7:
        if (SystemClock.uptimeMillis() > l3 + 100L)
        {
            break; /* Loop/switch isn't completed */
        }
        j1 = k;
        if (adapter.getItemId(k) == l2) goto _L4; else goto _L3
_L3:
        if (l == l1 - 1)
        {
            j1 = 1;
        } else
        {
            j1 = 0;
        }
        if (i1 == 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (j1 == 0 || !flag1) goto _L6; else goto _L5
_L5:
        return -1;
        i1 = k;
        int k1 = k;
        l = k;
        k = k1;
          goto _L7
    }

    void j()
    {
label0:
        {
            if (getChildCount() > 0)
            {
                u = true;
                t = a;
                if (D < 0)
                {
                    break label0;
                }
                View view = getChildAt(D - p);
                s = C;
                r = B;
                if (view != null)
                {
                    q = view.getTop();
                }
                v = 0;
            }
            return;
        }
        View view1 = getChildAt(0);
        Adapter adapter = getAdapter();
        if (p >= 0 && p < adapter.getCount())
        {
            s = adapter.getItemId(p);
        } else
        {
            s = -1L;
        }
        r = p;
        if (view1 != null)
        {
            q = view1.getTop();
        }
        v = 1;
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        removeCallbacks(e);
    }

    protected void onLayout(boolean flag, int k, int l, int i1, int j1)
    {
        a = getHeight();
    }

    public void removeAllViews()
    {
        throw new UnsupportedOperationException("removeAllViews() is not supported in AviaryAdapterView");
    }

    public void removeView(View view)
    {
        throw new UnsupportedOperationException("removeView(View) is not supported in AviaryAdapterView");
    }

    public void removeViewAt(int k)
    {
        throw new UnsupportedOperationException("removeViewAt(int) is not supported in AviaryAdapterView");
    }

    public abstract void setAdapter(Adapter adapter);

    public void setEmptyView(View view)
    {
        b = view;
        view = getAdapter();
        boolean flag;
        if (view == null || view.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a(flag);
    }

    public void setFocusable(boolean flag)
    {
        boolean flag2 = true;
        Adapter adapter = getAdapter();
        boolean flag1;
        if (adapter == null || adapter.getCount() == 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        c = flag;
        if (!flag)
        {
            d = false;
        }
        if (!flag) goto _L2; else goto _L1
_L1:
        flag = flag2;
        if (!flag1) goto _L4; else goto _L3
_L3:
        if (!d()) goto _L2; else goto _L5
_L5:
        flag = flag2;
_L4:
        super.setFocusable(flag);
        return;
_L2:
        flag = false;
        if (true) goto _L4; else goto _L6
_L6:
    }

    public void setFocusableInTouchMode(boolean flag)
    {
        boolean flag2 = true;
        Adapter adapter = getAdapter();
        boolean flag1;
        if (adapter == null || adapter.getCount() == 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        d = flag;
        if (flag)
        {
            c = true;
        }
        if (!flag) goto _L2; else goto _L1
_L1:
        flag = flag2;
        if (!flag1) goto _L4; else goto _L3
_L3:
        if (!d()) goto _L2; else goto _L5
_L5:
        flag = flag2;
_L4:
        super.setFocusableInTouchMode(flag);
        return;
_L2:
        flag = false;
        if (true) goto _L4; else goto _L6
_L6:
    }

    void setNextSelectedPositionInt(int k)
    {
        Log.i("View", (new StringBuilder()).append("setNextSelectedPositionInt: ").append(k).toString());
        B = k;
        C = a(k);
        if (u && v == 0 && k >= 0)
        {
            r = k;
            s = C;
        }
    }

    public void setOnClickListener(android.view.View.OnClickListener onclicklistener)
    {
        throw new RuntimeException("Don't call setOnClickListener for an AviaryAdapterView. You probably want setOnItemClickListener instead");
    }

    public void setOnItemClickListener(c c1)
    {
        y = c1;
    }

    public void setOnItemLongClickListener(d d1)
    {
        if (!isLongClickable())
        {
            setLongClickable(true);
        }
        z = d1;
    }

    public void setOnItemSelectedListener(e e1)
    {
        x = e1;
    }

    void setSelectedPositionInt(int k)
    {
        D = k;
        E = a(k);
    }

    public abstract void setSelection(int k);
}
