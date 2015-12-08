// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Adapter;
import android.widget.AdapterView;

abstract class android.support.v7.internal.widget.c extends ViewGroup
{
    class a extends DataSetObserver
    {

        final android.support.v7.internal.widget.c a;
        private Parcelable b;

        public void onChanged()
        {
            a.u = true;
            a.A = a.z;
            a.z = a.e().getCount();
            if (a.e().hasStableIds() && b != null && a.A == 0 && a.z > 0)
            {
                android.support.v7.internal.widget.c.a(a, b);
                b = null;
            } else
            {
                a.n();
            }
            a.i();
            a.requestLayout();
        }

        public void onInvalidated()
        {
            a.u = true;
            if (a.e().hasStableIds())
            {
                b = android.support.v7.internal.widget.c.a(a);
            }
            a.A = a.z;
            a.z = 0;
            a.x = -1;
            a.y = 0x8000000000000000L;
            a.v = -1;
            a.w = 0x8000000000000000L;
            a.p = false;
            a.i();
            a.requestLayout();
        }

        a()
        {
            a = android.support.v7.internal.widget.c.this;
            super();
            b = null;
        }
    }

    public static interface b
    {

        public abstract void a(android.support.v7.internal.widget.c c1, View view, int i1, long l1);
    }

    class c
        implements android.widget.AdapterView.OnItemClickListener
    {

        final android.support.v7.internal.widget.c a;
        private final b b;

        public void onItemClick(AdapterView adapterview, View view, int i1, long l1)
        {
            b.a(a, view, i1, l1);
        }

        public c(b b1)
        {
            a = android.support.v7.internal.widget.c.this;
            super();
            b = b1;
        }
    }

    public static interface d
    {

        public abstract void a(android.support.v7.internal.widget.c c1);

        public abstract void a(android.support.v7.internal.widget.c c1, View view, int i1, long l1);
    }

    private class e
        implements Runnable
    {

        final android.support.v7.internal.widget.c a;

        public void run()
        {
            if (a.u)
            {
                if (a.e() != null)
                {
                    a.post(this);
                }
                return;
            } else
            {
                android.support.v7.internal.widget.c.b(a);
                return;
            }
        }

        private e()
        {
            a = android.support.v7.internal.widget.c.this;
            super();
        }

    }


    int A;
    int B;
    long C;
    boolean D;
    private int a;
    private View b;
    private boolean c;
    private boolean d;
    private e e;
    int k;
    int l;
    int m;
    long n;
    long o;
    boolean p;
    int q;
    boolean r;
    d s;
    b t;
    boolean u;
    int v;
    long w;
    int x;
    long y;
    int z;

    android.support.v7.internal.widget.c(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        k = 0;
        n = 0x8000000000000000L;
        p = false;
        r = false;
        v = -1;
        w = 0x8000000000000000L;
        x = -1;
        y = 0x8000000000000000L;
        B = -1;
        C = 0x8000000000000000L;
        D = false;
    }

    static Parcelable a(android.support.v7.internal.widget.c c1)
    {
        return c1.onSaveInstanceState();
    }

    private void a()
    {
        if (s == null)
        {
            return;
        }
        int i1 = f();
        if (i1 >= 0)
        {
            View view = c();
            s.a(this, view, i1, e().getItemId(i1));
            return;
        } else
        {
            s.a(this);
            return;
        }
    }

    static void a(android.support.v7.internal.widget.c c1, Parcelable parcelable)
    {
        c1.onRestoreInstanceState(parcelable);
    }

    private void a(boolean flag)
    {
        if (h())
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
            if (u)
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

    static void b(android.support.v7.internal.widget.c c1)
    {
        c1.a();
    }

    public void a(b b1)
    {
        t = b1;
    }

    public void a(d d1)
    {
        s = d1;
    }

    public boolean a(View view, int i1, long l1)
    {
        boolean flag = false;
        if (t != null)
        {
            playSoundEffect(0);
            if (view != null)
            {
                view.sendAccessibilityEvent(1);
            }
            t.a(this, view, i1, l1);
            flag = true;
        }
        return flag;
    }

    public void addView(View view)
    {
        throw new UnsupportedOperationException("addView(View) is not supported in AdapterView");
    }

    public void addView(View view, int i1)
    {
        throw new UnsupportedOperationException("addView(View, int) is not supported in AdapterView");
    }

    public void addView(View view, int i1, android.view.ViewGroup.LayoutParams layoutparams)
    {
        throw new UnsupportedOperationException("addView(View, int, LayoutParams) is not supported in AdapterView");
    }

    public void addView(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        throw new UnsupportedOperationException("addView(View, LayoutParams) is not supported in AdapterView");
    }

    int b(int i1, boolean flag)
    {
        return i1;
    }

    public long b(int i1)
    {
        Adapter adapter = e();
        if (adapter == null || i1 < 0)
        {
            return 0x8000000000000000L;
        } else
        {
            return adapter.getItemId(i1);
        }
    }

    public abstract View c();

    void c(int i1)
    {
        x = i1;
        y = b(i1);
    }

    protected boolean canAnimate()
    {
        return super.canAnimate() && z > 0;
    }

    void d(int i1)
    {
        v = i1;
        w = b(i1);
        if (p && q == 0 && i1 >= 0)
        {
            m = i1;
            n = w;
        }
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityevent)
    {
        View view = c();
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

    public abstract Adapter e();

    public int f()
    {
        return v;
    }

    public long g()
    {
        return w;
    }

    boolean h()
    {
        return false;
    }

    void i()
    {
label0:
        {
label1:
            {
                boolean flag2 = false;
                Adapter adapter = e();
                boolean flag;
                boolean flag1;
                if (adapter == null || adapter.getCount() == 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (!flag || h())
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

    void j()
    {
        if (s != null)
        {
            if (r || D)
            {
                if (e == null)
                {
                    e = new e();
                }
                post(e);
            } else
            {
                a();
            }
        }
        if (x != -1 && isShown() && !isInTouchMode())
        {
            sendAccessibilityEvent(4);
        }
    }

    void k()
    {
        int l1;
        l1 = z;
        if (l1 <= 0)
        {
            break MISSING_BLOCK_LABEL_161;
        }
        if (!p) goto _L2; else goto _L1
_L1:
        int i1;
        p = false;
        i1 = m();
        if (i1 < 0 || b(i1, true) != i1) goto _L2; else goto _L3
_L3:
        boolean flag;
        d(i1);
        flag = true;
_L4:
        if (!flag)
        {
            int k1 = f();
            int j1 = k1;
            if (k1 >= l1)
            {
                j1 = l1 - 1;
            }
            k1 = j1;
            if (j1 < 0)
            {
                k1 = 0;
            }
            j1 = b(k1, true);
            if (j1 < 0)
            {
                j1 = b(k1, false);
            }
            if (j1 >= 0)
            {
                d(j1);
                l();
                flag = true;
            }
        }
_L5:
        if (!flag)
        {
            x = -1;
            y = 0x8000000000000000L;
            v = -1;
            w = 0x8000000000000000L;
            p = false;
            l();
        }
        return;
_L2:
        flag = false;
          goto _L4
        flag = false;
          goto _L5
    }

    void l()
    {
        if (x != B || y != C)
        {
            j();
            B = x;
            C = y;
        }
    }

    int m()
    {
        int j2 = z;
        if (j2 != 0) goto _L2; else goto _L1
_L1:
        int l1 = -1;
_L4:
        return l1;
_L2:
        Adapter adapter;
        int i1;
        boolean flag;
        long l2;
        long l3;
        l2 = n;
        i1 = m;
        if (l2 == 0x8000000000000000L)
        {
            return -1;
        }
        i1 = Math.min(j2 - 1, Math.max(0, i1));
        l3 = SystemClock.uptimeMillis();
        flag = false;
        adapter = e();
        if (adapter == null)
        {
            return -1;
        }
        break MISSING_BLOCK_LABEL_196;
_L6:
        int j1;
        int k1;
        boolean flag1;
        if (flag1 || flag && l1 == 0)
        {
            j1++;
            flag = false;
            i1 = j1;
        } else
        if (l1 != 0 || !flag && !flag1)
        {
            k1--;
            flag = true;
            i1 = k1;
        }
_L7:
        if (SystemClock.uptimeMillis() > l3 + 100L)
        {
            break; /* Loop/switch isn't completed */
        }
        l1 = i1;
        if (adapter.getItemId(i1) == l2) goto _L4; else goto _L3
_L3:
        if (j1 == j2 - 1)
        {
            l1 = 1;
        } else
        {
            l1 = 0;
        }
        if (k1 == 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (l1 == 0 || !flag1) goto _L6; else goto _L5
_L5:
        return -1;
        k1 = i1;
        int i2 = i1;
        j1 = i1;
        i1 = i2;
          goto _L7
    }

    void n()
    {
label0:
        {
            if (getChildCount() > 0)
            {
                p = true;
                o = a;
                if (x < 0)
                {
                    break label0;
                }
                View view = getChildAt(x - k);
                n = w;
                m = v;
                if (view != null)
                {
                    l = view.getTop();
                }
                q = 0;
            }
            return;
        }
        View view1 = getChildAt(0);
        Adapter adapter = e();
        if (k >= 0 && k < adapter.getCount())
        {
            n = adapter.getItemId(k);
        } else
        {
            n = -1L;
        }
        m = k;
        if (view1 != null)
        {
            l = view1.getTop();
        }
        q = 1;
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        removeCallbacks(e);
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        a = getHeight();
    }

    public void removeAllViews()
    {
        throw new UnsupportedOperationException("removeAllViews() is not supported in AdapterView");
    }

    public void removeView(View view)
    {
        throw new UnsupportedOperationException("removeView(View) is not supported in AdapterView");
    }

    public void removeViewAt(int i1)
    {
        throw new UnsupportedOperationException("removeViewAt(int) is not supported in AdapterView");
    }

    public void setFocusable(boolean flag)
    {
        boolean flag2 = true;
        Adapter adapter = e();
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
        if (!h()) goto _L2; else goto _L5
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
        Adapter adapter = e();
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
        if (!h()) goto _L2; else goto _L5
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

    public void setOnClickListener(android.view.View.OnClickListener onclicklistener)
    {
        throw new RuntimeException("Don't call setOnClickListener for an AdapterView. You probably want setOnItemClickListener instead");
    }
}
