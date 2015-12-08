// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package it.sephiroth.android.library.widget;

import android.content.Context;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Adapter;

public abstract class AdapterView extends ViewGroup
{
    public static interface c
    {

        public abstract void a(AdapterView adapterview, View view, int i, long l);
    }


    protected int V;
    protected int W;
    private int a;
    protected int aa;
    protected long ab;
    protected long ac;
    protected boolean ad;
    int ae;
    protected boolean af;
    e ag;
    c ah;
    d ai;
    public boolean aj;
    protected int ak;
    protected long al;
    protected int am;
    protected long an;
    protected int ao;
    protected int ap;
    AccessibilityManager aq;
    protected int ar;
    protected long as;
    protected boolean at;
    private View b;
    private boolean c;
    private boolean d;
    private SelectionNotifier e;

    public AdapterView(Context context)
    {
        super(context);
        V = 0;
        ab = 0x8000000000000000L;
        ad = false;
        af = false;
        ak = -1;
        al = 0x8000000000000000L;
        am = -1;
        an = 0x8000000000000000L;
        ar = -1;
        as = 0x8000000000000000L;
        at = false;
    }

    public AdapterView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        V = 0;
        ab = 0x8000000000000000L;
        ad = false;
        af = false;
        ak = -1;
        al = 0x8000000000000000L;
        am = -1;
        an = 0x8000000000000000L;
        ar = -1;
        as = 0x8000000000000000L;
        at = false;
    }

    public AdapterView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        V = 0;
        ab = 0x8000000000000000L;
        ad = false;
        af = false;
        ak = -1;
        al = 0x8000000000000000L;
        am = -1;
        an = 0x8000000000000000L;
        ar = -1;
        as = 0x8000000000000000L;
        at = false;
        if (android.os.Build.VERSION.SDK_INT >= 16 && getImportantForAccessibility() == 0)
        {
            setImportantForAccessibility(1);
        }
        if (!isInEditMode())
        {
            aq = (AccessibilityManager)getContext().getSystemService("accessibility");
        }
    }

    static Parcelable a(AdapterView adapterview)
    {
        return adapterview.onSaveInstanceState();
    }

    private void a()
    {
        if (ag == null)
        {
            return;
        }
        int i = getSelectedItemPosition();
    /* block-local class not found */
    class e {}

        if (i >= 0)
        {
            View view = getSelectedView();
            ag.b(this, view, i, getAdapter().getItemId(i));
            return;
        } else
        {
            ag.a(this);
            return;
        }
    }

    static void a(AdapterView adapterview, Parcelable parcelable)
    {
        adapterview.onRestoreInstanceState(parcelable);
    }

    private void a(boolean flag)
    {
        if (s())
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
            if (aj)
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
        while (!aq.isEnabled() || getSelectedItemPosition() < 0) 
        {
            return;
        }
        sendAccessibilityEvent(4);
    }

    static void b(AdapterView adapterview)
    {
        adapterview.a();
    }

    static void c(AdapterView adapterview)
    {
        adapterview.b();
    }

    private boolean c()
    {
        boolean flag;
label0:
        {
            boolean flag1 = false;
            Adapter adapter = getAdapter();
            flag = flag1;
            if (adapter == null)
            {
                break label0;
            }
            int i = adapter.getCount();
            flag = flag1;
            if (i <= 0)
            {
                break label0;
            }
            if (getFirstVisiblePosition() <= 0)
            {
                flag = flag1;
                if (getLastVisiblePosition() >= i - 1)
                {
                    break label0;
                }
            }
            flag = true;
        }
        return flag;
    }

    public int a(View view)
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
                int j = getChildCount();
                for (int i = 0; i < j; i++)
                {
                    if (getChildAt(i).equals(view))
                    {
                        return i + V;
                    }
                }

                return -1;
            }
        } while (true);
    }

    public boolean a(View view, int i, long l)
    {
        boolean flag = false;
        if (ah != null)
        {
            playSoundEffect(0);
            if (view != null)
            {
                view.sendAccessibilityEvent(1);
            }
            ah.a(this, view, i, l);
            flag = true;
        }
        return flag;
    }

    public void addView(View view)
    {
        throw new UnsupportedOperationException("addView(View) is not supported in AdapterView");
    }

    public void addView(View view, int i)
    {
        throw new UnsupportedOperationException("addView(View, int) is not supported in AdapterView");
    }

    public void addView(View view, int i, android.view.ViewGroup.LayoutParams layoutparams)
    {
        throw new UnsupportedOperationException("addView(View, int, LayoutParams) is not supported in AdapterView");
    }

    public void addView(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        throw new UnsupportedOperationException("addView(View, LayoutParams) is not supported in AdapterView");
    }

    protected int b(int i, boolean flag)
    {
        return i;
    }

    protected boolean canAnimate()
    {
        return super.canAnimate() && ao > 0;
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

    public long g(int i)
    {
        Adapter adapter = getAdapter();
        if (adapter == null || i < 0)
        {
            return 0x8000000000000000L;
        } else
        {
            return adapter.getItemId(i);
        }
    }

    public abstract Adapter getAdapter();

    public int getCount()
    {
        return ao;
    }

    public View getEmptyView()
    {
        return b;
    }

    public int getFirstVisiblePosition()
    {
        return V;
    }

    public int getLastVisiblePosition()
    {
        return (V + getChildCount()) - 1;
    }

    public final c getOnItemClickListener()
    {
        return ah;
    }

    public final d getOnItemLongClickListener()
    {
        return ai;
    }

    public final e getOnItemSelectedListener()
    {
        return ag;
    }

    public Object getSelectedItem()
    {
        Adapter adapter = getAdapter();
        int i = getSelectedItemPosition();
        if (adapter != null && adapter.getCount() > 0 && i >= 0)
        {
            return adapter.getItem(i);
        } else
        {
            return null;
        }
    }

    public long getSelectedItemId()
    {
        return al;
    }

    public int getSelectedItemPosition()
    {
        return ak;
    }

    public abstract View getSelectedView();

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        removeCallbacks(e);
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityevent)
    {
        super.onInitializeAccessibilityEvent(accessibilityevent);
        accessibilityevent.setClassName(it/sephiroth/android/library/widget/AdapterView.getName());
        accessibilityevent.setScrollable(c());
        View view = getSelectedView();
        if (view != null)
        {
            accessibilityevent.setEnabled(view.isEnabled());
        }
        accessibilityevent.setCurrentItemIndex(getSelectedItemPosition());
        accessibilityevent.setFromIndex(getFirstVisiblePosition());
        accessibilityevent.setToIndex(getLastVisiblePosition());
        accessibilityevent.setItemCount(getCount());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilitynodeinfo)
    {
        super.onInitializeAccessibilityNodeInfo(accessibilitynodeinfo);
        accessibilitynodeinfo.setClassName(it/sephiroth/android/library/widget/AdapterView.getName());
        accessibilitynodeinfo.setScrollable(c());
        View view = getSelectedView();
        if (view != null)
        {
            accessibilitynodeinfo.setEnabled(view.isEnabled());
        }
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        a = getWidth();
    }

    public boolean onRequestSendAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
    {
        if (super.onRequestSendAccessibilityEvent(view, accessibilityevent))
        {
            AccessibilityEvent accessibilityevent1 = AccessibilityEvent.obtain();
            onInitializeAccessibilityEvent(accessibilityevent1);
            view.dispatchPopulateAccessibilityEvent(accessibilityevent1);
            accessibilityevent.appendRecord(accessibilityevent1);
            return true;
        } else
        {
            return false;
        }
    }

    void r()
    {
        int l;
        l = ao;
        if (l <= 0)
        {
            break MISSING_BLOCK_LABEL_161;
        }
        if (!ad) goto _L2; else goto _L1
_L1:
        int i;
        ad = false;
        i = w();
        if (i < 0 || b(i, true) != i) goto _L2; else goto _L3
_L3:
        boolean flag;
        setNextSelectedPositionInt(i);
        flag = true;
_L4:
        if (!flag)
        {
            int k = getSelectedItemPosition();
            int j = k;
            if (k >= l)
            {
                j = l - 1;
            }
            k = j;
            if (j < 0)
            {
                k = 0;
            }
            j = b(k, true);
            if (j < 0)
            {
                j = b(k, false);
            }
            if (j >= 0)
            {
                setNextSelectedPositionInt(j);
                v();
                flag = true;
            }
        }
_L5:
        if (!flag)
        {
            am = -1;
            an = 0x8000000000000000L;
            ak = -1;
            al = 0x8000000000000000L;
            ad = false;
            v();
        }
        return;
_L2:
        flag = false;
          goto _L4
        flag = false;
          goto _L5
    }

    public void removeAllViews()
    {
        throw new UnsupportedOperationException("removeAllViews() is not supported in AdapterView");
    }

    public void removeView(View view)
    {
        throw new UnsupportedOperationException("removeView(View) is not supported in AdapterView");
    }

    public void removeViewAt(int i)
    {
        throw new UnsupportedOperationException("removeViewAt(int) is not supported in AdapterView");
    }

    boolean s()
    {
        return false;
    }

    public abstract void setAdapter(Adapter adapter);

    public void setEmptyView(View view)
    {
        boolean flag1 = true;
        b = view;
        if (android.os.Build.VERSION.SDK_INT >= 16 && view != null && view.getImportantForAccessibility() == 0)
        {
            view.setImportantForAccessibility(1);
        }
        view = getAdapter();
        boolean flag = flag1;
        if (view != null)
        {
            if (view.isEmpty())
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
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
        if (!s()) goto _L2; else goto _L5
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
        if (!s()) goto _L2; else goto _L5
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

    protected void setNextSelectedPositionInt(int i)
    {
        ak = i;
        al = g(i);
        if (ad && ae == 0 && i >= 0)
        {
            aa = i;
            ab = al;
        }
    }

    public void setOnClickListener(android.view.View.OnClickListener onclicklistener)
    {
        throw new RuntimeException("Don't call setOnClickListener for an AdapterView. You probably want setOnItemClickListener instead");
    }

    public void setOnItemClickListener(c c1)
    {
        ah = c1;
    }

    public void setOnItemLongClickListener(d d1)
    {
        if (!isLongClickable())
        {
            setLongClickable(true);
        }
        ai = d1;
    }

    public void setOnItemSelectedListener(e e1)
    {
        ag = e1;
    }

    protected void setSelectedPositionInt(int i)
    {
        am = i;
        an = g(i);
    }

    public abstract void setSelection(int i);

    protected void t()
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
                if (!flag || s())
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

    void u()
    {
label0:
        {
            if (ag != null || aq.isEnabled())
            {
                if (!af && !at)
                {
                    break label0;
                }
    /* block-local class not found */
    class SelectionNotifier {}

                if (e == null)
                {
                    e = new SelectionNotifier(null);
                }
                post(e);
            }
            return;
        }
        a();
        b();
    }

    protected void v()
    {
        if (am != ar || an != as)
        {
            u();
            ar = am;
            as = an;
        }
    }

    int w()
    {
        int j1 = ao;
        if (j1 != 0) goto _L2; else goto _L1
_L1:
        int l = -1;
_L4:
        return l;
_L2:
        Adapter adapter;
        int i;
        boolean flag;
        long l1;
        long l2;
        l1 = ab;
        i = aa;
        if (l1 == 0x8000000000000000L)
        {
            return -1;
        }
        i = Math.min(j1 - 1, Math.max(0, i));
        l2 = SystemClock.uptimeMillis();
        flag = false;
        adapter = getAdapter();
        if (adapter == null)
        {
            return -1;
        }
        break MISSING_BLOCK_LABEL_196;
_L6:
        int j;
        int k;
        boolean flag1;
        if (flag1 || flag && l == 0)
        {
            j++;
            flag = false;
            i = j;
        } else
        if (l != 0 || !flag && !flag1)
        {
            k--;
            flag = true;
            i = k;
        }
_L7:
        if (SystemClock.uptimeMillis() > l2 + 100L)
        {
            break; /* Loop/switch isn't completed */
        }
        l = i;
        if (adapter.getItemId(i) == l1) goto _L4; else goto _L3
_L3:
        if (j == j1 - 1)
        {
            l = 1;
        } else
        {
            l = 0;
        }
        if (k == 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (l == 0 || !flag1) goto _L6; else goto _L5
_L5:
        return -1;
        k = i;
        int i1 = i;
        j = i;
        i = i1;
          goto _L7
    }

    public void x()
    {
label0:
        {
            if (getChildCount() > 0)
            {
                ad = true;
                ac = a;
                if (am < 0)
                {
                    break label0;
                }
                View view = getChildAt(am - V);
                ab = al;
                aa = ak;
                if (view != null)
                {
                    W = view.getLeft();
                }
                ae = 0;
            }
            return;
        }
        View view1 = getChildAt(0);
        Adapter adapter = getAdapter();
        if (V >= 0 && V < adapter.getCount())
        {
            ab = adapter.getItemId(V);
        } else
        {
            ab = -1L;
        }
        aa = V;
        if (view1 != null)
        {
            W = view1.getLeft();
        }
        ae = 1;
    }

    // Unreferenced inner class it/sephiroth/android/library/widget/AdapterView$a
    /* block-local class not found */
    class a {}


    // Unreferenced inner class it/sephiroth/android/library/widget/AdapterView$b
    /* block-local class not found */
    class b {}


    // Unreferenced inner class it/sephiroth/android/library/widget/AdapterView$d
    /* block-local class not found */
    class d {}

}
