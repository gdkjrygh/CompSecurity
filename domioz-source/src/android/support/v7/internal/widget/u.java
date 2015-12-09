// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Adapter;

// Referenced classes of package android.support.v7.internal.widget:
//            y, x, w

public abstract class u extends ViewGroup
{

    int A;
    long B;
    boolean C;
    private int a;
    private View b;
    private boolean c;
    private boolean d;
    private y e;
    int j;
    int k;
    int l;
    long m;
    long n;
    boolean o;
    int p;
    boolean q;
    x r;
    w s;
    boolean t;
    int u;
    long v;
    int w;
    long x;
    int y;
    int z;

    u(Context context, int i)
    {
        super(context, null, i);
        j = 0;
        m = 0x8000000000000000L;
        o = false;
        q = false;
        u = -1;
        v = 0x8000000000000000L;
        w = -1;
        x = 0x8000000000000000L;
        A = -1;
        B = 0x8000000000000000L;
        C = false;
    }

    private long a(int i)
    {
        Adapter adapter = c();
        if (adapter == null || i < 0)
        {
            return 0x8000000000000000L;
        } else
        {
            return adapter.getItemId(i);
        }
    }

    static Parcelable a(u u1)
    {
        return u1.onSaveInstanceState();
    }

    private void a()
    {
        int i;
        if (r != null)
        {
            if ((i = u) >= 0)
            {
                b();
                c().getItemId(i);
                return;
            }
        }
    }

    static void a(u u1, Parcelable parcelable)
    {
        u1.onRestoreInstanceState(parcelable);
    }

    static void b(u u1)
    {
        u1.a();
    }

    public void a(w w1)
    {
        s = w1;
    }

    public final boolean a(View view)
    {
        if (s != null)
        {
            playSoundEffect(0);
            if (view != null)
            {
                view.sendAccessibilityEvent(1);
            }
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

    public abstract View b();

    final void b(int i)
    {
        w = i;
        x = a(i);
    }

    public abstract Adapter c();

    final void c(int i)
    {
        u = i;
        v = a(i);
        if (o && p == 0 && i >= 0)
        {
            l = i;
            m = v;
        }
    }

    protected boolean canAnimate()
    {
        return super.canAnimate() && y > 0;
    }

    final void d()
    {
label0:
        {
            boolean flag1 = true;
            Adapter adapter = c();
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
                if (t)
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

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityevent)
    {
        View view = b();
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

    final void e()
    {
        int l1;
        l1 = y;
        if (l1 <= 0)
        {
            break MISSING_BLOCK_LABEL_339;
        }
        if (!o) goto _L2; else goto _L1
_L1:
        int i2;
        o = false;
        i2 = y;
        if (i2 == 0) goto _L4; else goto _L3
_L3:
        int i;
        long l2;
        l2 = m;
        i = l;
        if (l2 == 0x8000000000000000L) goto _L4; else goto _L5
_L5:
        Adapter adapter;
        int i1;
        boolean flag;
        long l3;
        i1 = Math.min(i2 - 1, Math.max(0, i));
        l3 = SystemClock.uptimeMillis();
        flag = false;
        adapter = c();
        if (adapter == null) goto _L4; else goto _L6
_L6:
        int j1;
        int k1;
        j1 = i1;
        i = i1;
        k1 = i1;
        i1 = ((flag) ? 1 : 0);
_L12:
        if (SystemClock.uptimeMillis() > 100L + l3) goto _L4; else goto _L7
_L7:
        if (adapter.getItemId(i) != l2) goto _L9; else goto _L8
_L8:
        if (i < 0) goto _L2; else goto _L10
_L10:
        c(i);
        i = 1;
_L13:
        i1 = i;
        if (i == 0)
        {
            j1 = u;
            i1 = j1;
            if (j1 >= l1)
            {
                i1 = l1 - 1;
            }
            j1 = i1;
            if (i1 < 0)
            {
                j1 = 0;
            }
            if (j1 >= 0);
            i1 = i;
            if (j1 >= 0)
            {
                c(j1);
                f();
                i1 = 1;
            }
        }
_L14:
        if (i1 == 0)
        {
            w = -1;
            x = 0x8000000000000000L;
            u = -1;
            v = 0x8000000000000000L;
            o = false;
            f();
        }
        return;
_L9:
        boolean flag1;
        if (k1 == i2 - 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (j1 == 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag && flag1) goto _L4; else goto _L11
_L11:
        if (flag1 || i1 != 0 && !flag)
        {
            k1++;
            i1 = 0;
            i = k1;
        } else
        if (flag || i1 == 0 && !flag1)
        {
            j1--;
            i1 = 1;
            i = j1;
        }
          goto _L12
_L4:
        i = -1;
          goto _L8
_L2:
        i = 0;
          goto _L13
        i1 = 0;
          goto _L14
    }

    final void f()
    {
        if (w != A || x != B)
        {
            if (r != null)
            {
                if (q || C)
                {
                    if (e == null)
                    {
                        e = new y(this, (byte)0);
                    }
                    post(e);
                } else
                {
                    a();
                }
            }
            if (w != -1 && isShown() && !isInTouchMode())
            {
                sendAccessibilityEvent(4);
            }
            A = w;
            B = x;
        }
    }

    final void g()
    {
label0:
        {
            if (getChildCount() > 0)
            {
                o = true;
                n = a;
                if (w < 0)
                {
                    break label0;
                }
                View view = getChildAt(w - j);
                m = v;
                l = u;
                if (view != null)
                {
                    k = view.getTop();
                }
                p = 0;
            }
            return;
        }
        View view1 = getChildAt(0);
        Adapter adapter = c();
        if (j >= 0 && j < adapter.getCount())
        {
            m = adapter.getItemId(j);
        } else
        {
            m = -1L;
        }
        l = j;
        if (view1 != null)
        {
            k = view1.getTop();
        }
        p = 1;
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        removeCallbacks(e);
    }

    protected void onLayout(boolean flag, int i, int i1, int j1, int k1)
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

    public void removeViewAt(int i)
    {
        throw new UnsupportedOperationException("removeViewAt(int) is not supported in AdapterView");
    }

    public void setFocusable(boolean flag)
    {
        boolean flag2 = true;
        Adapter adapter = c();
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
        Adapter adapter = c();
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
}
