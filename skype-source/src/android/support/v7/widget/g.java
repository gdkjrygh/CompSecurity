// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.support.v4.view.accessibility.c;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import java.util.Arrays;

// Referenced classes of package android.support.v7.widget:
//            LinearLayoutManager, l, RecyclerView

public class g extends LinearLayoutManager
{
    public static final class a extends c
    {

        public final int getSpanIndex(int j, int k)
        {
            return j % k;
        }

        public final int getSpanSize(int j)
        {
            return 1;
        }

        public a()
        {
        }
    }

    public static final class b extends RecyclerView.j
    {

        private int e;
        private int f;

        static int a(b b1)
        {
            return b1.e;
        }

        static int a(b b1, int j)
        {
            b1.f = j;
            return j;
        }

        static int b(b b1)
        {
            return b1.f;
        }

        static int b(b b1, int j)
        {
            b1.e = j;
            return j;
        }

        public final int a()
        {
            return e;
        }

        public final int b()
        {
            return f;
        }

        public b()
        {
            super(-2);
            e = -1;
            f = 0;
        }

        public b(Context context, AttributeSet attributeset)
        {
            super(context, attributeset);
            e = -1;
            f = 0;
        }

        public b(android.view.ViewGroup.LayoutParams layoutparams)
        {
            super(layoutparams);
            e = -1;
            f = 0;
        }

        public b(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
        {
            super(marginlayoutparams);
            e = -1;
            f = 0;
        }
    }

    public static abstract class c
    {

        private boolean mCacheSpanIndices;
        final SparseIntArray mSpanIndexCache = new SparseIntArray();

        int findReferenceIndexFromCache(int j)
        {
            int k = 0;
            for (int i1 = mSpanIndexCache.size() - 1; k <= i1;)
            {
                int j1 = k + i1 >>> 1;
                if (mSpanIndexCache.keyAt(j1) < j)
                {
                    k = j1 + 1;
                } else
                {
                    i1 = j1 - 1;
                }
            }

            j = k - 1;
            if (j >= 0 && j < mSpanIndexCache.size())
            {
                return mSpanIndexCache.keyAt(j);
            } else
            {
                return -1;
            }
        }

        int getCachedSpanIndex(int j, int k)
        {
            int i1;
            if (!mCacheSpanIndices)
            {
                i1 = getSpanIndex(j, k);
            } else
            {
                int j1 = mSpanIndexCache.get(j, -1);
                i1 = j1;
                if (j1 == -1)
                {
                    k = getSpanIndex(j, k);
                    mSpanIndexCache.put(j, k);
                    return k;
                }
            }
            return i1;
        }

        public int getSpanGroupIndex(int j, int k)
        {
            int i1 = 0;
            int j1 = 0;
            int k2 = getSpanSize(j);
            int l1 = 0;
            while (l1 < j) 
            {
                int i2 = getSpanSize(l1);
                int j2 = i1 + i2;
                int k1;
                if (j2 == k)
                {
                    i1 = 0;
                    k1 = j1 + 1;
                } else
                {
                    k1 = j1;
                    i1 = j2;
                    if (j2 > k)
                    {
                        i1 = i2;
                        k1 = j1 + 1;
                    }
                }
                l1++;
                j1 = k1;
            }
            j = j1;
            if (i1 + k2 > k)
            {
                j = j1 + 1;
            }
            return j;
        }

        public int getSpanIndex(int j, int k)
        {
            int i2 = getSpanSize(j);
            if (i2 == k)
            {
                j = 0;
            } else
            {
                boolean flag = false;
                boolean flag1 = false;
                int i1 = ((flag) ? 1 : 0);
                int j1 = ((flag1) ? 1 : 0);
                if (mCacheSpanIndices)
                {
                    i1 = ((flag) ? 1 : 0);
                    j1 = ((flag1) ? 1 : 0);
                    if (mSpanIndexCache.size() > 0)
                    {
                        int j2 = findReferenceIndexFromCache(j);
                        i1 = ((flag) ? 1 : 0);
                        j1 = ((flag1) ? 1 : 0);
                        if (j2 >= 0)
                        {
                            i1 = mSpanIndexCache.get(j2) + getSpanSize(j2);
                            j1 = j2 + 1;
                        }
                    }
                }
                while (j1 < j) 
                {
                    int k1 = getSpanSize(j1);
                    int l1 = i1 + k1;
                    if (l1 == k)
                    {
                        i1 = 0;
                    } else
                    {
                        i1 = l1;
                        if (l1 > k)
                        {
                            i1 = k1;
                        }
                    }
                    j1++;
                }
                j = i1;
                if (i1 + i2 > k)
                {
                    return 0;
                }
            }
            return j;
        }

        public abstract int getSpanSize(int j);

        public void invalidateSpanIndexCache()
        {
            mSpanIndexCache.clear();
        }

        public boolean isSpanIndexCacheEnabled()
        {
            return mCacheSpanIndices;
        }

        public void setSpanIndexCacheEnabled(boolean flag)
        {
            mCacheSpanIndices = flag;
        }

        public c()
        {
            mCacheSpanIndices = false;
        }
    }


    static final int a = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
    boolean b;
    int c;
    int d[];
    View e[];
    final SparseIntArray f = new SparseIntArray();
    final SparseIntArray g = new SparseIntArray();
    c h;
    final Rect i = new Rect();

    public g(Context context, int j, int k)
    {
        super(context, k, false);
        b = false;
        c = -1;
        h = new a();
        a(j);
    }

    private static int a(int j, int k, int i1)
    {
        int j1;
        if (k != 0 || i1 != 0)
        {
            if ((j1 = android.view.View.MeasureSpec.getMode(j)) == 0x80000000 || j1 == 0x40000000)
            {
                return android.view.View.MeasureSpec.makeMeasureSpec(android.view.View.MeasureSpec.getSize(j) - k - i1, j1);
            }
        }
        return j;
    }

    private int a(RecyclerView.o o, RecyclerView.s s, int j)
    {
        if (!s.a())
        {
            return h.getSpanGroupIndex(j, c);
        }
        int k = o.b(j);
        if (k == -1)
        {
            Log.w("GridLayoutManager", (new StringBuilder("Cannot find span size for pre layout position. ")).append(j).toString());
            return 0;
        } else
        {
            return h.getSpanGroupIndex(k, c);
        }
    }

    private void a(RecyclerView.o o, RecyclerView.s s, int j, boolean flag)
    {
        int k;
        int i1;
        int j1;
        byte byte0;
        if (flag)
        {
            boolean flag1 = false;
            j1 = j;
            i1 = 1;
            j = ((flag1) ? 1 : 0);
        } else
        {
            j--;
            j1 = -1;
            i1 = -1;
        }
        if (mOrientation == 1 && isLayoutRTL())
        {
            k = c - 1;
            byte0 = -1;
        } else
        {
            k = 0;
            byte0 = 1;
        }
        while (j != j1) 
        {
            View view = e[j];
            b b1 = (b)view.getLayoutParams();
            b.a(b1, c(o, s, getPosition(view)));
            if (byte0 == -1 && b.b(b1) > 1)
            {
                b.b(b1, k - (b.b(b1) - 1));
            } else
            {
                b.b(b1, k);
            }
            k += b.b(b1) * byte0;
            j += i1;
        }
    }

    private void a(View view, int j, int k, boolean flag)
    {
        RecyclerView.j j1;
        int i1;
label0:
        {
            calculateItemDecorationsForChild(view, i);
            j1 = (RecyclerView.j)view.getLayoutParams();
            if (!flag)
            {
                i1 = j;
                if (mOrientation != 1)
                {
                    break label0;
                }
            }
            i1 = a(j, j1.leftMargin + i.left, j1.rightMargin + i.right);
        }
label1:
        {
            if (!flag)
            {
                j = k;
                if (mOrientation != 0)
                {
                    break label1;
                }
            }
            j = a(k, j1.topMargin + i.top, j1.bottomMargin + i.bottom);
        }
        view.measure(i1, j);
    }

    private static int b(int j)
    {
        if (j < 0)
        {
            return a;
        } else
        {
            return android.view.View.MeasureSpec.makeMeasureSpec(j, 0x40000000);
        }
    }

    private int b(RecyclerView.o o, RecyclerView.s s, int j)
    {
        int k;
        if (!s.a())
        {
            k = h.getCachedSpanIndex(j, c);
        } else
        {
            int j1 = g.get(j, -1);
            k = j1;
            if (j1 == -1)
            {
                int i1 = o.b(j);
                if (i1 == -1)
                {
                    Log.w("GridLayoutManager", (new StringBuilder("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:")).append(j).toString());
                    return 0;
                } else
                {
                    return h.getCachedSpanIndex(i1, c);
                }
            }
        }
        return k;
    }

    private int c(RecyclerView.o o, RecyclerView.s s, int j)
    {
        int k;
        if (!s.a())
        {
            k = h.getSpanSize(j);
        } else
        {
            int j1 = f.get(j, -1);
            k = j1;
            if (j1 == -1)
            {
                int i1 = o.b(j);
                if (i1 == -1)
                {
                    Log.w("GridLayoutManager", (new StringBuilder("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:")).append(j).toString());
                    return 1;
                } else
                {
                    return h.getSpanSize(i1);
                }
            }
        }
        return k;
    }

    public final c a()
    {
        return h;
    }

    public void a(int j)
    {
        if (j == c)
        {
            return;
        }
        b = true;
        if (j <= 0)
        {
            throw new IllegalArgumentException((new StringBuilder("Span count should be at least 1. Provided ")).append(j).toString());
        } else
        {
            c = j;
            h.invalidateSpanIndexCache();
            return;
        }
    }

    public void a(c c1)
    {
        h = c1;
    }

    public final int b()
    {
        return c;
    }

    public boolean checkLayoutParams(RecyclerView.j j)
    {
        return j instanceof b;
    }

    View findReferenceChild(RecyclerView.o o, RecyclerView.s s, int j, int k, int i1)
    {
        View view1;
label0:
        {
            View view2;
label1:
            {
                ensureLayoutState();
                view1 = null;
                Object obj = null;
                int k1 = mOrientationHelper.c();
                int l1 = mOrientationHelper.d();
                int j1;
                if (k > j)
                {
                    j1 = 1;
                } else
                {
                    j1 = -1;
                }
                while (j != k) 
                {
                    View view = getChildAt(j);
                    int i2 = getPosition(view);
                    view2 = view1;
                    View view3 = obj;
                    if (i2 >= 0)
                    {
                        view2 = view1;
                        view3 = obj;
                        if (i2 < i1)
                        {
                            view2 = view1;
                            view3 = obj;
                            if (b(o, s, i2) == 0)
                            {
                                if (((RecyclerView.j)view.getLayoutParams()).a.isRemoved())
                                {
                                    view2 = view1;
                                    view3 = obj;
                                    if (view1 == null)
                                    {
                                        view3 = obj;
                                        view2 = view;
                                    }
                                } else
                                {
                                    if (mOrientationHelper.a(view) < l1)
                                    {
                                        view2 = view;
                                        if (mOrientationHelper.b(view) >= k1)
                                        {
                                            break label1;
                                        }
                                    }
                                    view2 = view1;
                                    view3 = obj;
                                    if (obj == null)
                                    {
                                        view2 = view1;
                                        view3 = view;
                                    }
                                }
                            }
                        }
                    }
                    j += j1;
                    view1 = view2;
                    obj = view3;
                }
                if (obj == null)
                {
                    break label0;
                }
                view2 = obj;
            }
            return view2;
        }
        return view1;
    }

    public RecyclerView.j generateDefaultLayoutParams()
    {
        return new b();
    }

    public RecyclerView.j generateLayoutParams(Context context, AttributeSet attributeset)
    {
        return new b(context, attributeset);
    }

    public RecyclerView.j generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        if (layoutparams instanceof android.view.ViewGroup.MarginLayoutParams)
        {
            return new b((android.view.ViewGroup.MarginLayoutParams)layoutparams);
        } else
        {
            return new b(layoutparams);
        }
    }

    public int getColumnCountForAccessibility(RecyclerView.o o, RecyclerView.s s)
    {
        if (mOrientation == 1)
        {
            return c;
        }
        if (s.e() <= 0)
        {
            return 0;
        } else
        {
            return a(o, s, s.e() - 1);
        }
    }

    public int getRowCountForAccessibility(RecyclerView.o o, RecyclerView.s s)
    {
        if (mOrientation == 0)
        {
            return c;
        }
        if (s.e() <= 0)
        {
            return 0;
        } else
        {
            return a(o, s, s.e() - 1);
        }
    }

    void layoutChunk(RecyclerView.o o, RecyclerView.s s, LinearLayoutManager.c c1, LinearLayoutManager.b b1)
    {
        int j;
        int k;
        int k2;
        boolean flag1;
        if (c1.e == 1)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        k = 0;
        j = c;
        k2 = k;
        if (!flag1)
        {
            j = b(o, s, c1.d) + c(o, s, c1.d);
            k2 = k;
        }
        do
        {
            if (k2 >= c || !c1.a(s) || j <= 0)
            {
                break;
            }
            k = c1.d;
            int i1 = c(o, s, k);
            if (i1 > c)
            {
                throw new IllegalArgumentException((new StringBuilder("Item at position ")).append(k).append(" requires ").append(i1).append(" spans but GridLayoutManager has only ").append(c).append(" spans.").toString());
            }
            j -= i1;
            if (j < 0)
            {
                break;
            }
            View view = c1.a(o);
            if (view == null)
            {
                break;
            }
            e[k2] = view;
            k2++;
        } while (true);
        if (k2 == 0)
        {
            b1.b = true;
            return;
        }
        j = 0;
        a(o, s, k2, flag1);
        k = 0;
        while (k < k2) 
        {
            o = e[k];
            int j1;
            int l1;
            if (c1.k == null)
            {
                if (flag1)
                {
                    addView(o);
                } else
                {
                    addView(o, 0);
                }
            } else
            if (flag1)
            {
                addDisappearingView(o);
            } else
            {
                addDisappearingView(o, 0);
            }
            s = (b)o.getLayoutParams();
            j1 = android.view.View.MeasureSpec.makeMeasureSpec(d[b.a(s) + b.b(s)] - d[b.a(s)], 0x40000000);
            if (mOrientation == 1)
            {
                a(o, j1, b(((b) (s)).height), false);
            } else
            {
                a(o, b(((b) (s)).width), j1, false);
            }
            l1 = mOrientationHelper.c(o);
            j1 = j;
            if (l1 > j)
            {
                j1 = l1;
            }
            k++;
            j = j1;
        }
        int k1 = b(j);
        k = 0;
        while (k < k2) 
        {
            o = e[k];
            if (mOrientationHelper.c(o) != j)
            {
                s = (b)o.getLayoutParams();
                int i2 = android.view.View.MeasureSpec.makeMeasureSpec(d[b.a(s) + b.b(s)] - d[b.a(s)], 0x40000000);
                if (mOrientation == 1)
                {
                    a(o, i2, k1, true);
                } else
                {
                    a(o, k1, i2, true);
                }
            }
            k++;
        }
        b1.a = j;
        k = 0;
        k1 = 0;
        int j2 = 0;
        int l2 = 0;
        boolean flag;
        if (mOrientation == 1)
        {
            if (c1.f == -1)
            {
                l2 = c1.b;
                j2 = l2 - j;
                j = l2;
            } else
            {
                j2 = c1.b;
                j = j2 + j;
            }
        } else
        if (c1.f == -1)
        {
            k1 = c1.b;
            k = k1 - j;
            j = l2;
        } else
        {
            k = c1.b;
            k1 = k + j;
            j = l2;
        }
        flag = false;
        l2 = j2;
        j2 = k;
        k = ((flag) ? 1 : 0);
        while (k < k2) 
        {
            o = e[k];
            s = (b)o.getLayoutParams();
            if (mOrientation == 1)
            {
                j2 = getPaddingLeft() + d[b.a(s)];
                k1 = j2 + mOrientationHelper.d(o);
            } else
            {
                l2 = getPaddingTop() + d[b.a(s)];
                j = l2 + mOrientationHelper.d(o);
            }
            layoutDecorated(o, j2 + ((b) (s)).leftMargin, l2 + ((b) (s)).topMargin, k1 - ((b) (s)).rightMargin, j - ((b) (s)).bottomMargin);
            if (((RecyclerView.j) (s)).a.isRemoved() || ((RecyclerView.j) (s)).a.isChanged())
            {
                b1.c = true;
            }
            b1.d = b1.d | o.isFocusable();
            k++;
        }
        Arrays.fill(e, null);
    }

    void onAnchorReady(RecyclerView.o o, RecyclerView.s s, LinearLayoutManager.a a1)
    {
        int k = 0;
        super.onAnchorReady(o, s, a1);
        int j;
        int i1;
        int k1;
        int l1;
        if (getOrientation() == 1)
        {
            j = getWidth() - getPaddingRight() - getPaddingLeft();
        } else
        {
            j = getHeight() - getPaddingBottom() - getPaddingTop();
        }
        if (d == null || d.length != c + 1 || d[d.length - 1] != j)
        {
            d = new int[c + 1];
        }
        d[0] = 0;
        k1 = j / c;
        l1 = j % c;
        i1 = 1;
        j = 0;
        while (i1 <= c) 
        {
            j += l1;
            int j1;
            if (j > 0 && c - j < l1)
            {
                j -= c;
                j1 = k1 + 1;
            } else
            {
                j1 = k1;
            }
            k += j1;
            d[i1] = k;
            i1++;
        }
        if (s.e() > 0 && !s.a())
        {
            for (j = b(o, s, a1.a); j > 0 && a1.a > 0; j = b(o, s, a1.a))
            {
                a1.a = a1.a - 1;
            }

        }
        if (e == null || e.length != c)
        {
            e = new View[c];
        }
    }

    public void onInitializeAccessibilityNodeInfoForItem(RecyclerView.o o, RecyclerView.s s, View view, android.support.v4.view.accessibility.c c1)
    {
        boolean flag3 = false;
        boolean flag2 = false;
        android.view.ViewGroup.LayoutParams layoutparams = view.getLayoutParams();
        if (!(layoutparams instanceof b))
        {
            super.onInitializeAccessibilityNodeInfoForItem(view, c1);
            return;
        }
        view = (b)layoutparams;
        int j = a(o, s, ((RecyclerView.j) (view)).a.getLayoutPosition());
        if (mOrientation == 0)
        {
            int k = view.a();
            int j1 = view.b();
            boolean flag = flag2;
            if (c > 1)
            {
                flag = flag2;
                if (view.b() == c)
                {
                    flag = true;
                }
            }
            c1.b(android.support.v4.view.accessibility.c.l.a(k, j1, j, 1, flag));
            return;
        }
        int i1 = view.a();
        int k1 = view.b();
        boolean flag1 = flag3;
        if (c > 1)
        {
            flag1 = flag3;
            if (view.b() == c)
            {
                flag1 = true;
            }
        }
        c1.b(android.support.v4.view.accessibility.c.l.a(j, 1, i1, k1, flag1));
    }

    public void onItemsAdded(RecyclerView recyclerview, int j, int k)
    {
        h.invalidateSpanIndexCache();
    }

    public void onItemsChanged(RecyclerView recyclerview)
    {
        h.invalidateSpanIndexCache();
    }

    public void onItemsMoved(RecyclerView recyclerview, int j, int k, int i1)
    {
        h.invalidateSpanIndexCache();
    }

    public void onItemsRemoved(RecyclerView recyclerview, int j, int k)
    {
        h.invalidateSpanIndexCache();
    }

    public void onItemsUpdated(RecyclerView recyclerview, int j, int k, Object obj)
    {
        h.invalidateSpanIndexCache();
    }

    public void onLayoutChildren(RecyclerView.o o, RecyclerView.s s)
    {
        if (s.a())
        {
            int k = getChildCount();
            for (int j = 0; j < k; j++)
            {
                b b1 = (b)getChildAt(j).getLayoutParams();
                int i1 = ((RecyclerView.j) (b1)).a.getLayoutPosition();
                f.put(i1, b1.b());
                g.put(i1, b1.a());
            }

        }
        super.onLayoutChildren(o, s);
        f.clear();
        g.clear();
        if (!s.a())
        {
            b = false;
        }
    }

    public void setStackFromEnd(boolean flag)
    {
        if (flag)
        {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        } else
        {
            super.setStackFromEnd(false);
            return;
        }
    }

    public boolean supportsPredictiveItemAnimations()
    {
        return mPendingSavedState == null && !b;
    }

}
