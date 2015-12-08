// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.accessibility.AccessibilityEventCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.support.v4.view.accessibility.AccessibilityRecordCompat;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.widget:
//            ChildHelper, RecyclerView

public abstract class b
{

    private boolean a;
    private boolean b;
    ChildHelper h;
    RecyclerView i;
     j;

    public static int a(int i1, int j1, int k1, boolean flag)
    {
        int l1;
        int i2;
        i2 = 0x40000000;
        l1 = Math.max(0, i1 - j1);
        if (!flag) goto _L2; else goto _L1
_L1:
        if (k1 >= 0)
        {
            i1 = k1;
            j1 = i2;
        } else
        {
            j1 = 0;
            i1 = 0;
        }
_L4:
        return android.view.eSpec(i1, j1);
_L2:
        j1 = i2;
        i1 = k1;
        if (k1 < 0)
        {
            if (k1 == -1)
            {
                i1 = l1;
                j1 = i2;
            } else
            if (k1 == -2)
            {
                j1 = 0x80000000;
                i1 = l1;
            } else
            {
                j1 = 0;
                i1 = 0;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void a(int i1, View view)
    {
        h.d(i1);
    }

    static void a( ,  1)
    {
        .b(1);
    }

    private void a( , int i1, View view)
    {
         1 = RecyclerView.getChildViewHolderInt(view);
        if (1.uldIgnore())
        {
            return;
        }
        if (1.nvalid() && !1.emoved() && !1.hanged() && !RecyclerView.access$2400(i).bleIds())
        {
            e(i1);
            .e(1);
            return;
        } else
        {
            f(i1);
            .f(view);
            return;
        }
    }

    private void a(View view, int i1, boolean flag)
    {
        f f1;
        f f2;
        f1 = RecyclerView.getChildViewHolderInt(view);
        if (flag || f1.emoved())
        {
            i.mState.i(view);
        } else
        {
            i.mState.i(view);
        }
        f2 = (i)view.getLayoutParams();
        if (!f1.ReturnedFromScrap() && !f1.crap()) goto _L2; else goto _L1
_L1:
        if (f1.crap())
        {
            f1.crap();
        } else
        {
            f1.arReturnedFromScrapFlag();
        }
        h.a(view, i1, view.getLayoutParams(), false);
_L4:
        if (f2.)
        {
            f1.mView.invalidate();
            f2. = false;
        }
        return;
_L2:
        if (view.getParent() == i)
        {
            int k1 = h.b(view);
            int j1 = i1;
            if (i1 == -1)
            {
                j1 = h.b();
            }
            if (k1 == -1)
            {
                throw new IllegalStateException((new StringBuilder()).append("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:").append(i.indexOfChild(view)).toString());
            }
            if (k1 != j1)
            {
                RecyclerView.access$1300(i).a(k1, j1);
            }
        } else
        {
            h.a(view, i1, false);
            f2. = true;
            if (j != null && j.h())
            {
                j.b(view);
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    static boolean a(.b b1)
    {
        return b1.a;
    }

    static boolean a(a a1, boolean flag)
    {
        a1.a = flag;
        return flag;
    }

    private void b( )
    {
        if (j == )
        {
            j = null;
        }
    }

    public void A()
    {
        a = true;
    }

    public int a(int i1, a a1, a a2)
    {
        return 0;
    }

    public abstract a a();

    public a a(Context context, AttributeSet attributeset)
    {
        return new init>(context, attributeset);
    }

    public init> a(android.view.ayoutManager ayoutmanager)
    {
        if (ayoutmanager instanceof init>)
        {
            return new init>((init>)ayoutmanager);
        }
        if (ayoutmanager instanceof android.view.s)
        {
            return new init>((android.view.s)ayoutmanager);
        } else
        {
            return new init>(ayoutmanager);
        }
    }

    public View a(View view, int i1, init> init>, init> init>1)
    {
        return null;
    }

    public void a(int i1, int j1)
    {
        View view = g(i1);
        if (view == null)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Cannot move a child from non-existing index:").append(i1).toString());
        } else
        {
            f(i1);
            c(view, j1);
            return;
        }
    }

    public void a(int i1, c c1)
    {
        View view = g(i1);
        e(i1);
        c1.e(view);
    }

    public void a(Parcelable parcelable)
    {
    }

    void a(AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
    {
        a(i.mRecycler, i.mState, accessibilitynodeinfocompat);
    }

    public void a(deInfoCompat deinfocompat, deInfoCompat deinfocompat1)
    {
    }

    public void a(deInfoCompat deinfocompat)
    {
        for (int i1 = q() - 1; i1 >= 0; i1--)
        {
            a(deinfocompat, i1, g(i1));
        }

    }

    public void a(g g1, g g2)
    {
        Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
    }

    public void a(g g1, g g2, int i1, int j1)
    {
        RecyclerView.access$4500(i, i1, j1);
    }

    public void a(deInfoCompat deinfocompat, deInfoCompat deinfocompat1, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
    {
        if (ViewCompat.b(i, -1) || ViewCompat.a(i, -1))
        {
            accessibilitynodeinfocompat.a(8192);
            accessibilitynodeinfocompat.i(true);
        }
        if (ViewCompat.b(i, 1) || ViewCompat.a(i, 1))
        {
            accessibilitynodeinfocompat.a(4096);
            accessibilitynodeinfocompat.i(true);
        }
        accessibilitynodeinfocompat.b(android.support.v4.view.accessibility..CollectionInfoCompat.a(c(deinfocompat, deinfocompat1), d(deinfocompat, deinfocompat1), e(deinfocompat, deinfocompat1), b(deinfocompat, deinfocompat1)));
    }

    public void a(deInfoCompat deinfocompat, deInfoCompat deinfocompat1, View view, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
    {
        int i1;
        int j1;
        if (d())
        {
            i1 = d(view);
        } else
        {
            i1 = 0;
        }
        if (c())
        {
            j1 = d(view);
        } else
        {
            j1 = 0;
        }
        accessibilitynodeinfocompat.c(android.support.v4.view.accessibility..CollectionItemInfoCompat.a(i1, 1, j1, 1, false, false));
    }

    public void a(InfoCompat.a a1, InfoCompat.a a2, AccessibilityEvent accessibilityevent)
    {
        boolean flag1 = true;
        a1 = AccessibilityEventCompat.a(accessibilityevent);
        if (i != null && a1 != null)
        {
            boolean flag = flag1;
            if (!ViewCompat.b(i, 1))
            {
                flag = flag1;
                if (!ViewCompat.b(i, -1))
                {
                    flag = flag1;
                    if (!ViewCompat.a(i, -1))
                    {
                        if (ViewCompat.a(i, 1))
                        {
                            flag = flag1;
                        } else
                        {
                            flag = false;
                        }
                    }
                }
            }
            a1.a(flag);
            if (RecyclerView.access$2400(i) != null)
            {
                a1.a(RecyclerView.access$2400(i).mCount());
                return;
            }
        }
    }

    public void a( )
    {
        if (j != null &&  != j && j.h())
        {
            j.f();
        }
        j = ;
        j.a(i, this);
    }

    void a(RecyclerView recyclerview)
    {
        if (recyclerview == null)
        {
            i = null;
            h = null;
            return;
        } else
        {
            i = recyclerview;
            h = recyclerview.mChildHelper;
            return;
        }
    }

    public void a(RecyclerView recyclerview, int i1, int j1)
    {
    }

    public void a(RecyclerView recyclerview, int i1, int j1, int k1)
    {
    }

    public void a(RecyclerView recyclerview, int i1, int j1, Object obj)
    {
        c(recyclerview, i1, j1);
    }

    public void a(RecyclerView recyclerview, c c1)
    {
        d(recyclerview);
    }

    public void a(RecyclerView recyclerview, d d1, int i1)
    {
        Log.e("RecyclerView", "You must override smoothScrollToPosition to support smooth scrolling");
    }

    public void a(View view)
    {
        a(view, -1);
    }

    public void a(View view, int i1)
    {
        a(view, i1, true);
    }

    public void a(View view, int i1, int j1)
    {
        a a1 = (a)view.getLayoutParams();
        Rect rect = i.getItemDecorInsetsForChild(view);
        int k1 = rect.left;
        int l1 = rect.right;
        int i2 = rect.top;
        int j2 = rect.bottom;
        view.measure(a(r(), k1 + l1 + i1 + (t() + v() + a1.eftMargin + a1.ightMargin), a1.idth, c()), a(s(), j2 + i2 + j1 + (u() + w() + a1.opMargin + a1.ottomMargin), a1.eight, d()));
    }

    public void a(View view, int i1, int j1, int k1, int l1)
    {
        Rect rect = ((d)view.getLayoutParams()).;
        view.layout(rect.left + i1, rect.top + j1, k1 - rect.right, l1 - rect.bottom);
    }

    public void a(View view, int i1,  )
    {
         1 = RecyclerView.getChildViewHolderInt(view);
        if (1.emoved())
        {
            i.mState.i(view);
        } else
        {
            i.mState.i(view);
        }
        h.a(view, i1, , 1.emoved());
    }

    public void a(View view, Rect rect)
    {
        if (i == null)
        {
            rect.set(0, 0, 0, 0);
            return;
        } else
        {
            rect.set(i.getItemDecorInsetsForChild(view));
            return;
        }
    }

    void a(View view, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
    {
        deInfoCompat deinfocompat = RecyclerView.getChildViewHolderInt(view);
        if (deinfocompat != null && !deinfocompat.emoved() && !h.c(deinfocompat.mView))
        {
            a(i.mRecycler, i.mState, view, accessibilitynodeinfocompat);
        }
    }

    public void a(View view, deInfoCompat deinfocompat)
    {
        c(view);
        deinfocompat.c(view);
    }

    public void a(AccessibilityEvent accessibilityevent)
    {
        a(i.mRecycler, i.mState, accessibilityevent);
    }

    public void a(Runnable runnable)
    {
        if (i != null)
        {
            ViewCompat.a(i, runnable);
        }
    }

    public void a(String s1)
    {
        if (i != null)
        {
            i.assertNotInLayoutOrScroll(s1);
        }
    }

    boolean a(int i1, Bundle bundle)
    {
        return a(i.mRecycler, i.mState, i1, bundle);
    }

    public boolean a(i i1)
    {
        return i1 != null;
    }

    public boolean a(i i1, i j1, int k1, Bundle bundle)
    {
        if (i != null) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        k1;
        JVM INSTR lookupswitch 2: default 36
    //                   4096: 129
    //                   8192: 62;
           goto _L3 _L4 _L5
_L3:
        int l1;
        k1 = 0;
        l1 = 0;
_L8:
        if (l1 != 0 || k1 != 0)
        {
            i.scrollBy(k1, l1);
            return true;
        }
          goto _L1
_L5:
        int i2;
        int j2;
        int k2;
        if (ViewCompat.b(i, -1))
        {
            k1 = -(s() - u() - w());
        } else
        {
            k1 = 0;
        }
        l1 = k1;
        if (!ViewCompat.a(i, -1)) goto _L7; else goto _L6
_L6:
        i2 = -(r() - t() - v());
        l1 = k1;
        k1 = i2;
          goto _L8
_L4:
        if (ViewCompat.b(i, 1))
        {
            k1 = s() - u() - w();
        } else
        {
            k1 = 0;
        }
        l1 = k1;
        if (!ViewCompat.a(i, 1)) goto _L7; else goto _L9
_L9:
        i2 = r();
        j2 = t();
        k2 = v();
        l1 = k1;
        k1 = i2 - j2 - k2;
          goto _L8
_L7:
        k1 = 0;
          goto _L8
    }

    public boolean a(v v1, v v2, View view, int i1, Bundle bundle)
    {
        return false;
    }

    public boolean a(RecyclerView recyclerview, v v1, View view, View view1)
    {
        return a(recyclerview, view, view1);
    }

    public boolean a(RecyclerView recyclerview, View view, Rect rect, boolean flag)
    {
        int k2 = t();
        int l1 = u();
        int l2 = r() - v();
        int j2 = s();
        int k3 = w();
        int i3 = view.getLeft() + rect.left;
        int i2 = view.getTop() + rect.top;
        int j3 = i3 + rect.width();
        int l3 = rect.height();
        int i1 = Math.min(0, i3 - k2);
        int j1 = Math.min(0, i2 - l1);
        int k1 = Math.max(0, j3 - l2);
        j2 = Math.max(0, (i2 + l3) - (j2 - k3));
        if (o() == 1)
        {
            if (k1 != 0)
            {
                i1 = k1;
            } else
            {
                i1 = Math.max(i1, j3 - l2);
            }
        } else
        if (i1 == 0)
        {
            i1 = Math.min(i3 - k2, k1);
        }
        if (j1 == 0)
        {
            j1 = Math.min(i2 - l1, j2);
        }
        if (i1 != 0 || j1 != 0)
        {
            if (flag)
            {
                recyclerview.scrollBy(i1, j1);
            } else
            {
                recyclerview.smoothScrollBy(i1, j1);
            }
            return true;
        } else
        {
            return false;
        }
    }

    public boolean a(RecyclerView recyclerview, View view, View view1)
    {
        return n() || recyclerview.isComputingLayout();
    }

    public boolean a(RecyclerView recyclerview, ArrayList arraylist, int i1, int j1)
    {
        return false;
    }

    boolean a(View view, int i1, Bundle bundle)
    {
        return a(i.mRecycler, i.mState, view, i1, bundle);
    }

    public int b(int i1, i j1, i k1)
    {
        return 0;
    }

    public int b(i i1, i j1)
    {
        return 0;
    }

    public int b(i i1)
    {
        return 0;
    }

    public Parcelable b()
    {
        return null;
    }

    public View b(int i1)
    {
        int k1;
        int l1;
        l1 = q();
        k1 = 0;
_L3:
        View view;
        i j1;
        if (k1 >= l1)
        {
            break; /* Loop/switch isn't completed */
        }
        view = g(k1);
        j1 = RecyclerView.getChildViewHolderInt(view);
          goto _L1
_L5:
        k1++;
        if (true) goto _L3; else goto _L2
_L1:
        if (j1 == null || j1.LayoutPosition() != i1 || j1.uldIgnore() || !i.mState.i() && j1.emoved()) goto _L5; else goto _L4
_L4:
        return view;
_L2:
        return null;
    }

    void b(emoved emoved)
    {
        int j1 = emoved.emoved();
        int i1 = j1 - 1;
        while (i1 >= 0) 
        {
            View view = emoved.emoved(i1);
            emoved emoved1 = RecyclerView.getChildViewHolderInt(view);
            if (!emoved1.uldIgnore())
            {
                emoved1.IsRecyclable(false);
                if (emoved1.mpDetached())
                {
                    i.removeDetachedView(view, false);
                }
                if (i.mItemAnimator != null)
                {
                    i.mItemAnimator.(emoved1);
                }
                emoved1.IsRecyclable(true);
                emoved.IsRecyclable(view);
            }
            i1--;
        }
        emoved.IsRecyclable();
        if (j1 > 0)
        {
            i.invalidate();
        }
    }

    void b(RecyclerView recyclerview)
    {
        b = true;
        c(recyclerview);
    }

    public void b(RecyclerView recyclerview, int i1, int j1)
    {
    }

    void b(RecyclerView recyclerview, c c1)
    {
        b = false;
        a(recyclerview, c1);
    }

    public void b(View view)
    {
        b(view, -1);
    }

    public void b(View view, int i1)
    {
        a(view, i1, false);
    }

    public boolean b(Runnable runnable)
    {
        if (i != null)
        {
            return i.removeCallbacks(runnable);
        } else
        {
            return false;
        }
    }

    public int c(s s1, s s2)
    {
        while (i == null || RecyclerView.access$2400(i) == null || !d()) 
        {
            return 1;
        }
        return RecyclerView.access$2400(i).mCount();
    }

    public int c(mCount mcount)
    {
        return 0;
    }

    public void c(mCount mcount)
    {
        for (int i1 = q() - 1; i1 >= 0; i1--)
        {
            if (!RecyclerView.getChildViewHolderInt(g(i1)).uldIgnore())
            {
                a(i1, mcount);
            }
        }

    }

    public void c(RecyclerView recyclerview)
    {
    }

    public void c(RecyclerView recyclerview, int i1, int j1)
    {
    }

    public void c(View view)
    {
        h.a(view);
    }

    public void c(View view, int i1)
    {
        a(view, i1, (a)view.getLayoutParams());
    }

    public boolean c()
    {
        return false;
    }

    public int d(a a1, a a2)
    {
        while (i == null || RecyclerView.access$2400(i) == null || !c()) 
        {
            return 1;
        }
        return RecyclerView.access$2400(i).mCount();
    }

    public int d(mCount mcount)
    {
        return 0;
    }

    public int d(View view)
    {
        return ((mCount)view.getLayoutParams()).();
    }

    public View d(View view, int i1)
    {
        return null;
    }

    public void d(int i1)
    {
    }

    public void d(RecyclerView recyclerview)
    {
    }

    public boolean d()
    {
        return false;
    }

    public int e( )
    {
        return 0;
    }

    public int e(View view)
    {
        Rect rect = (()view.getLayoutParams()).;
        int i1 = view.getMeasuredWidth();
        int j1 = rect.left;
        return rect.right + (i1 + j1);
    }

    public void e(int i1)
    {
        if (g(i1) != null)
        {
            h.a(i1);
        }
    }

    public void e(RecyclerView recyclerview)
    {
    }

    public boolean e(h h1, h h2)
    {
        return false;
    }

    public int f(h h1)
    {
        return 0;
    }

    public int f(View view)
    {
        Rect rect = ((h)view.getLayoutParams()).;
        int i1 = view.getMeasuredHeight();
        int j1 = rect.top;
        return rect.bottom + (i1 + j1);
    }

    public void f(int i1)
    {
        a(i1, g(i1));
    }

    public int g(g g1)
    {
        return 0;
    }

    public int g(View view)
    {
        return view.getLeft() - m(view);
    }

    public View g(int i1)
    {
        if (h != null)
        {
            return h.b(i1);
        } else
        {
            return null;
        }
    }

    public int h(View view)
    {
        return view.getTop() - k(view);
    }

    public void h(int i1)
    {
        if (i != null)
        {
            i.offsetChildrenHorizontal(i1);
        }
    }

    public int i(View view)
    {
        return view.getRight() + n(view);
    }

    public void i(int i1)
    {
        if (i != null)
        {
            i.offsetChildrenVertical(i1);
        }
    }

    public int j(View view)
    {
        return view.getBottom() + l(view);
    }

    public void j(int i1)
    {
    }

    public boolean j()
    {
        return false;
    }

    public int k(View view)
    {
        return ((l)view.getLayoutParams())..top;
    }

    public void k()
    {
        if (i != null)
        {
            i.requestLayout();
        }
    }

    public int l(View view)
    {
        return ((i)view.getLayoutParams())..bottom;
    }

    public boolean l()
    {
        return b;
    }

    public int m(View view)
    {
        return ((b)view.getLayoutParams())..left;
    }

    public boolean m()
    {
        return i != null && RecyclerView.access$4400(i);
    }

    public int n(View view)
    {
        return ((i)view.getLayoutParams())..right;
    }

    public boolean n()
    {
        return j != null && j.h();
    }

    public int o()
    {
        return ViewCompat.h(i);
    }

    public int p()
    {
        return -1;
    }

    public int q()
    {
        if (h != null)
        {
            return h.b();
        } else
        {
            return 0;
        }
    }

    public int r()
    {
        if (i != null)
        {
            return i.getWidth();
        } else
        {
            return 0;
        }
    }

    public int s()
    {
        if (i != null)
        {
            return i.getHeight();
        } else
        {
            return 0;
        }
    }

    public int t()
    {
        if (i != null)
        {
            return i.getPaddingLeft();
        } else
        {
            return 0;
        }
    }

    public int u()
    {
        if (i != null)
        {
            return i.getPaddingTop();
        } else
        {
            return 0;
        }
    }

    public int v()
    {
        if (i != null)
        {
            return i.getPaddingRight();
        } else
        {
            return 0;
        }
    }

    public int w()
    {
        if (i != null)
        {
            return i.getPaddingBottom();
        } else
        {
            return 0;
        }
    }

    public View x()
    {
        View view;
        if (i != null)
        {
            if ((view = i.getFocusedChild()) != null && !h.c(view))
            {
                return view;
            }
        }
        return null;
    }

    public int y()
    {
        h h1;
        if (i != null)
        {
            h1 = i.getAdapter();
        } else
        {
            h1 = null;
        }
        if (h1 != null)
        {
            return h1.mCount();
        } else
        {
            return 0;
        }
    }

    void z()
    {
        if (j != null)
        {
            j.f();
        }
    }

    public deInfoCompat()
    {
        a = false;
        b = false;
    }
}
