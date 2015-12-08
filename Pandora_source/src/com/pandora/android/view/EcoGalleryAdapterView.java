// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.view;

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

public abstract class EcoGalleryAdapterView extends ViewGroup
{
    public static class a
        implements android.view.ContextMenu.ContextMenuInfo
    {

        public View a;
        public int b;
        public long c;

        public a(View view, int i1, long l1)
        {
            a = view;
            b = i1;
            c = l1;
        }
    }

    class b extends DataSetObserver
    {

        final EcoGalleryAdapterView a;
        private Parcelable b;

        public void onChanged()
        {
            a.v = true;
            a.B = a.A;
            a.A = a.getAdapter().getCount();
            if (a.getAdapter().hasStableIds() && b != null && a.B == 0 && a.A > 0)
            {
                EcoGalleryAdapterView.a(a, b);
                b = null;
            } else
            {
                a.m();
            }
            a.j();
            a.requestLayout();
        }

        public void onInvalidated()
        {
            a.v = true;
            if (a.getAdapter().hasStableIds())
            {
                b = EcoGalleryAdapterView.a(a);
            }
            a.B = a.A;
            a.A = 0;
            a.y = -1;
            a.z = 0x8000000000000000L;
            a.setSelectedItemPosition(-1);
            a.x = 0x8000000000000000L;
            a.p = false;
            a.j();
            a.requestLayout();
        }

        b()
        {
            a = EcoGalleryAdapterView.this;
            super();
            b = null;
        }
    }

    public static interface c
    {

        public abstract void a(EcoGalleryAdapterView ecogalleryadapterview, View view, int i1, long l1);
    }

    public static interface d
    {

        public abstract boolean a(EcoGalleryAdapterView ecogalleryadapterview, View view, int i1, long l1);
    }

    public static interface e
    {

        public abstract void a(EcoGalleryAdapterView ecogalleryadapterview);

        public abstract void a(EcoGalleryAdapterView ecogalleryadapterview, View view, int i1, long l1);
    }

    private class f
        implements Runnable
    {

        final EcoGalleryAdapterView a;

        public void run()
        {
            if (a.v)
            {
                if (a.getAdapter() != null)
                {
                    a.post(this);
                }
                return;
            } else
            {
                EcoGalleryAdapterView.b(a);
                return;
            }
        }

        private f()
        {
            a = EcoGalleryAdapterView.this;
            super();
        }

    }


    int A;
    int B;
    int C;
    long D;
    boolean E;
    private int a;
    private View b;
    private boolean c;
    private boolean d;
    private f e;
    int k;
    int l;
    int m;
    long n;
    long o;
    boolean p;
    int q;
    boolean r;
    e s;
    c t;
    d u;
    boolean v;
    int w;
    long x;
    int y;
    long z;

    public EcoGalleryAdapterView(Context context)
    {
        super(context);
        k = 0;
        n = 0x8000000000000000L;
        p = false;
        r = false;
        w = -1;
        x = 0x8000000000000000L;
        y = -1;
        z = 0x8000000000000000L;
        C = -1;
        D = 0x8000000000000000L;
        E = false;
    }

    public EcoGalleryAdapterView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        k = 0;
        n = 0x8000000000000000L;
        p = false;
        r = false;
        w = -1;
        x = 0x8000000000000000L;
        y = -1;
        z = 0x8000000000000000L;
        C = -1;
        D = 0x8000000000000000L;
        E = false;
    }

    public EcoGalleryAdapterView(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        k = 0;
        n = 0x8000000000000000L;
        p = false;
        r = false;
        w = -1;
        x = 0x8000000000000000L;
        y = -1;
        z = 0x8000000000000000L;
        C = -1;
        D = 0x8000000000000000L;
        E = false;
    }

    static Parcelable a(EcoGalleryAdapterView ecogalleryadapterview)
    {
        return ecogalleryadapterview.onSaveInstanceState();
    }

    static void a(EcoGalleryAdapterView ecogalleryadapterview, Parcelable parcelable)
    {
        ecogalleryadapterview.onRestoreInstanceState(parcelable);
    }

    private void a(boolean flag)
    {
        if (i())
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
            if (v)
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

    private void b()
    {
        if (s == null)
        {
            return;
        }
        int i1 = getSelectedItemPosition();
        if (i1 >= 0)
        {
            View view = getSelectedView();
            s.a(this, view, i1, getAdapter().getItemId(i1));
            return;
        } else
        {
            s.a(this);
            return;
        }
    }

    static void b(EcoGalleryAdapterView ecogalleryadapterview)
    {
        ecogalleryadapterview.b();
    }

    void a()
    {
        if (s != null)
        {
            if (r || E)
            {
                if (e == null)
                {
                    e = new f();
                }
                post(e);
            } else
            {
                b();
            }
        }
        if (y != -1 && isShown() && !isInTouchMode())
        {
            sendAccessibilityEvent(4);
        }
    }

    public boolean a(View view, int i1, long l1)
    {
        boolean flag = false;
        if (t != null)
        {
            playSoundEffect(0);
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

    public long b(int i1)
    {
        Adapter adapter = getAdapter();
        if (adapter == null || i1 < 0)
        {
            return 0x8000000000000000L;
        } else
        {
            return adapter.getItemId(i1);
        }
    }

    public int c(View view)
    {
        do
        {
            View view1;
            boolean flag;
            try
            {
                view1 = (View)view.getParent();
                flag = view1.equals(this);
            }
            // Misplaced declaration of an exception variable
            catch (View view)
            {
                return -1;
            }
            if (!flag)
            {
                view = view1;
            } else
            {
                int j1 = getChildCount();
                for (int i1 = 0; i1 < j1; i1++)
                {
                    if (getChildAt(i1).equals(view))
                    {
                        return i1 + k;
                    }
                }

                return -1;
            }
        } while (true);
    }

    protected boolean canAnimate()
    {
        return super.canAnimate() && A > 0;
    }

    int d(int i1, boolean flag)
    {
        return i1;
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityevent)
    {
        boolean flag = false;
        if (accessibilityevent.getEventType() == 8)
        {
            accessibilityevent.setEventType(4);
        }
        View view = getSelectedView();
        if (view != null)
        {
            flag = view.dispatchPopulateAccessibilityEvent(accessibilityevent);
        }
        if (!flag)
        {
            if (view != null)
            {
                accessibilityevent.setEnabled(view.isEnabled());
            }
            accessibilityevent.setItemCount(getCount());
            accessibilityevent.setCurrentItemIndex(getSelectedItemPosition());
        }
        return flag;
    }

    protected void dispatchRestoreInstanceState(SparseArray sparsearray)
    {
        dispatchThawSelfOnly(sparsearray);
    }

    protected void dispatchSaveInstanceState(SparseArray sparsearray)
    {
        dispatchFreezeSelfOnly(sparsearray);
    }

    public abstract Adapter getAdapter();

    public int getCount()
    {
        return A;
    }

    public View getEmptyView()
    {
        return b;
    }

    public int getFirstVisiblePosition()
    {
        return k;
    }

    public int getLastVisiblePosition()
    {
        return (k + getChildCount()) - 1;
    }

    public final c getOnItemClickListener()
    {
        return t;
    }

    public final d getOnItemLongClickListener()
    {
        return u;
    }

    public final e getOnItemSelectedListener()
    {
        return s;
    }

    public Object getSelectedItem()
    {
        Adapter adapter = getAdapter();
        int i1 = getSelectedItemPosition();
        if (adapter != null && adapter.getCount() > 0 && i1 >= 0)
        {
            return adapter.getItem(i1);
        } else
        {
            return null;
        }
    }

    public long getSelectedItemId()
    {
        return x;
    }

    public int getSelectedItemPosition()
    {
        return w;
    }

    public abstract View getSelectedView();

    void h()
    {
        int l1;
        l1 = A;
        if (l1 <= 0)
        {
            break MISSING_BLOCK_LABEL_161;
        }
        if (!p) goto _L2; else goto _L1
_L1:
        int i1;
        p = false;
        i1 = l();
        if (i1 < 0 || d(i1, true) != i1) goto _L2; else goto _L3
_L3:
        boolean flag;
        setNextSelectedPositionInt(i1);
        flag = true;
_L4:
        if (!flag)
        {
            int k1 = getSelectedItemPosition();
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
            j1 = d(k1, true);
            if (j1 < 0)
            {
                j1 = d(k1, false);
            }
            if (j1 >= 0)
            {
                setNextSelectedPositionInt(j1);
                k();
                flag = true;
            }
        }
_L5:
        if (!flag)
        {
            y = -1;
            z = 0x8000000000000000L;
            setSelectedItemPosition(-1);
            x = 0x8000000000000000L;
            p = false;
            k();
        }
        return;
_L2:
        flag = false;
          goto _L4
        flag = false;
          goto _L5
    }

    boolean i()
    {
        return false;
    }

    void j()
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
                if (!flag || i())
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

    void k()
    {
        if (y != C || z != D)
        {
            a();
            C = y;
            D = z;
        }
    }

    int l()
    {
        int j2 = A;
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
        adapter = getAdapter();
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

    void m()
    {
label0:
        {
            if (getChildCount() > 0)
            {
                p = true;
                o = a;
                if (y < 0)
                {
                    break label0;
                }
                View view = getChildAt(y - k);
                n = x;
                m = w;
                if (view != null)
                {
                    l = view.getTop();
                }
                q = 0;
            }
            return;
        }
        View view1 = getChildAt(0);
        Adapter adapter = getAdapter();
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
        if (!i()) goto _L2; else goto _L5
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
        if (!i()) goto _L2; else goto _L5
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

    void setNextSelectedPositionInt(int i1)
    {
        setSelectedItemPosition(i1);
        x = b(i1);
        if (p && q == 0 && i1 >= 0)
        {
            m = i1;
            n = x;
        }
    }

    public void setOnClickListener(android.view.View.OnClickListener onclicklistener)
    {
        throw new RuntimeException("Don't call setOnClickListener for an AdapterView. You probably want setOnItemClickListener instead");
    }

    public void setOnItemClickListener(c c1)
    {
        t = c1;
    }

    public void setOnItemLongClickListener(d d1)
    {
        if (!isLongClickable())
        {
            setLongClickable(true);
        }
        u = d1;
    }

    public void setOnItemSelectedListener(e e1)
    {
        s = e1;
    }

    public void setSelectedItemPosition(int i1)
    {
        w = i1;
    }

    void setSelectedPositionInt(int i1)
    {
        y = i1;
        z = b(i1);
    }

    public abstract void setSelection(int i1);
}
