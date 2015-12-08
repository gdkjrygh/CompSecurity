// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.baselib.hlistview;

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

// Referenced classes of package com.roidapp.baselib.hlistview:
//            s, v, u, t

public abstract class AdapterView extends ViewGroup
{

    protected int V;
    protected int W;
    private int a;
    protected int aa;
    protected long ab;
    protected long ac;
    protected boolean ad;
    int ae;
    protected boolean af;
    u ag;
    s ah;
    t ai;
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
    private v e;

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

    public AdapterView(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
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
        int i1;
        if (ag != null)
        {
            if ((i1 = ak) >= 0)
            {
                f();
                p().getItemId(i1);
                return;
            }
        }
    }

    static void a(AdapterView adapterview, Parcelable parcelable)
    {
        adapterview.onRestoreInstanceState(parcelable);
    }

    private void b()
    {
        while (!aq.isEnabled() || ak < 0) 
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
            Adapter adapter = p();
            flag = flag1;
            if (adapter == null)
            {
                break label0;
            }
            int i1 = adapter.getCount();
            flag = flag1;
            if (i1 <= 0)
            {
                break label0;
            }
            if (V <= 0)
            {
                flag = flag1;
                if (u() >= i1 - 1)
                {
                    break label0;
                }
            }
            flag = true;
        }
        return flag;
    }

    protected int a(int i1, boolean flag)
    {
        return i1;
    }

    public final int a(View view)
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
                        return i1 + V;
                    }
                }

                return -1;
            }
        } while (true);
    }

    public final void a(s s1)
    {
        ah = s1;
    }

    public boolean a(View view, int i1, long l1)
    {
        if (ah != null)
        {
            playSoundEffect(0);
            if (view != null)
            {
                view.sendAccessibilityEvent(1);
            }
            ah.a(this, view, i1);
            return true;
        } else
        {
            return false;
        }
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

    protected boolean canAnimate()
    {
        return super.canAnimate() && ao > 0;
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityevent)
    {
        View view = f();
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

    public abstract View f();

    public abstract void i(int i1);

    public final Object j(int i1)
    {
        Adapter adapter = p();
        if (adapter == null || i1 < 0)
        {
            return null;
        } else
        {
            return adapter.getItem(i1);
        }
    }

    public final long k(int i1)
    {
        Adapter adapter = p();
        if (adapter == null || i1 < 0)
        {
            return 0x8000000000000000L;
        } else
        {
            return adapter.getItemId(i1);
        }
    }

    protected final void l(int i1)
    {
        am = i1;
        an = k(i1);
    }

    protected final void m(int i1)
    {
        ak = i1;
        al = k(i1);
        if (ad && ae == 0 && i1 >= 0)
        {
            aa = i1;
            ab = al;
        }
    }

    void n()
    {
        int l1;
        l1 = ao;
        if (l1 <= 0)
        {
            break MISSING_BLOCK_LABEL_161;
        }
        if (!ad) goto _L2; else goto _L1
_L1:
        int i1;
        ad = false;
        i1 = x();
        if (i1 < 0 || a(i1, true) != i1) goto _L2; else goto _L3
_L3:
        boolean flag;
        m(i1);
        flag = true;
_L4:
        if (!flag)
        {
            int k1 = ak;
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
            j1 = a(k1, true);
            if (j1 < 0)
            {
                j1 = a(k1, false);
            }
            if (j1 >= 0)
            {
                m(j1);
                w();
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
            w();
        }
        return;
_L2:
        flag = false;
          goto _L4
        flag = false;
          goto _L5
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        removeCallbacks(e);
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityevent)
    {
        super.onInitializeAccessibilityEvent(accessibilityevent);
        accessibilityevent.setClassName(com/roidapp/baselib/hlistview/AdapterView.getName());
        accessibilityevent.setScrollable(c());
        View view = f();
        if (view != null)
        {
            accessibilityevent.setEnabled(view.isEnabled());
        }
        accessibilityevent.setCurrentItemIndex(ak);
        accessibilityevent.setFromIndex(V);
        accessibilityevent.setToIndex(u());
        accessibilityevent.setItemCount(ao);
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilitynodeinfo)
    {
        super.onInitializeAccessibilityNodeInfo(accessibilitynodeinfo);
        accessibilitynodeinfo.setClassName(com/roidapp/baselib/hlistview/AdapterView.getName());
        accessibilitynodeinfo.setScrollable(c());
        View view = f();
        if (view != null)
        {
            accessibilitynodeinfo.setEnabled(view.isEnabled());
        }
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
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

    public abstract Adapter p();

    public final int q()
    {
        return ak;
    }

    public final long r()
    {
        return al;
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

    public final int s()
    {
        return ao;
    }

    public void setFocusable(boolean flag)
    {
        boolean flag2 = true;
        Adapter adapter = p();
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
        if (flag && !flag1)
        {
            flag = flag2;
        } else
        {
            flag = false;
        }
        super.setFocusable(flag);
    }

    public void setFocusableInTouchMode(boolean flag)
    {
        boolean flag2 = true;
        Adapter adapter = p();
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
        if (flag && !flag1)
        {
            flag = flag2;
        } else
        {
            flag = false;
        }
        super.setFocusableInTouchMode(flag);
    }

    public void setOnClickListener(android.view.View.OnClickListener onclicklistener)
    {
        throw new RuntimeException("Don't call setOnClickListener for an AdapterView. You probably want setOnItemClickListener instead");
    }

    public final int t()
    {
        return V;
    }

    public final int u()
    {
        return (V + getChildCount()) - 1;
    }

    protected final void v()
    {
label0:
        {
            boolean flag1 = true;
            Adapter adapter = p();
            boolean flag;
            boolean flag2;
            if (adapter == null || adapter.getCount() == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (!flag)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag && d)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            super.setFocusableInTouchMode(flag2);
            if (flag && c)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            super.setFocusable(flag2);
            if (b != null)
            {
                flag = flag1;
                if (adapter != null)
                {
                    if (adapter.isEmpty())
                    {
                        flag = flag1;
                    } else
                    {
                        flag = false;
                    }
                }
                if (!flag)
                {
                    break label0;
                }
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
            }
            return;
        }
        if (b != null)
        {
            b.setVisibility(8);
        }
        setVisibility(0);
    }

    protected final void w()
    {
        if (am != ar || an != as)
        {
            if (ag != null || aq.isEnabled())
            {
                if (af || at)
                {
                    if (e == null)
                    {
                        e = new v(this, (byte)0);
                    }
                    post(e);
                } else
                {
                    a();
                    b();
                }
            }
            ar = am;
            as = an;
        }
    }

    final int x()
    {
        Adapter adapter;
        boolean flag;
        int j1;
        int j2;
        long l2;
        long l3;
        j2 = ao;
        if (j2 == 0)
        {
            return -1;
        }
        l2 = ab;
        int i1 = aa;
        if (l2 == 0x8000000000000000L)
        {
            return -1;
        }
        j1 = Math.min(j2 - 1, Math.max(0, i1));
        l3 = SystemClock.uptimeMillis();
        flag = false;
        adapter = p();
        if (adapter == null)
        {
            return -1;
        }
        break MISSING_BLOCK_LABEL_191;
        l1 = j1;
        int i2 = j1;
        k1 = j1;
        j1 = i2;
        while (SystemClock.uptimeMillis() <= l3 + 100L) 
        {
            if (adapter.getItemId(j1) == l2)
            {
                return j1;
            }
            if (k1 == j2 - 1)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (l1 == 0)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            if (flag1 && flag2)
            {
                break;
            }
            if (flag2 || flag && !flag1)
            {
                k1++;
                flag = false;
                j1 = k1;
            } else
            if (flag1 || !flag && !flag2)
            {
                l1--;
                flag = true;
                j1 = l1;
            }
        }
        return -1;
    }

    public final void y()
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
        Adapter adapter = p();
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
}
