// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.view.accessibility.a;
import android.support.v4.view.accessibility.c;
import android.support.v4.view.accessibility.g;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

// Referenced classes of package android.support.v7.widget:
//            h, l, n, RecyclerView, 
//            i

public final class StaggeredGridLayoutManager extends RecyclerView.i
{
    static final class LazySpanLookup
    {

        int a[];
        List b;

        final int a(int i1)
        {
            if (b != null)
            {
                for (int j1 = b.size() - 1; j1 >= 0; j1--)
                {
                    if (((FullSpanItem)b.get(j1)).a >= i1)
                    {
                        b.remove(j1);
                    }
                }

            }
            return b(i1);
        }

        public final FullSpanItem a(int i1, int j1, int k1)
        {
            if (b != null) goto _L2; else goto _L1
_L1:
            FullSpanItem fullspanitem = null;
_L6:
            return fullspanitem;
_L2:
            int l1;
            int i2;
            i2 = b.size();
            l1 = 0;
_L9:
            if (l1 >= i2) goto _L4; else goto _L3
_L3:
            FullSpanItem fullspanitem1;
            fullspanitem1 = (FullSpanItem)b.get(l1);
            if (fullspanitem1.a >= j1)
            {
                return null;
            }
            if (fullspanitem1.a < i1)
            {
                continue; /* Loop/switch isn't completed */
            }
            fullspanitem = fullspanitem1;
            if (k1 == 0) goto _L6; else goto _L5
_L5:
            fullspanitem = fullspanitem1;
            if (fullspanitem1.b == k1) goto _L6; else goto _L7
_L7:
            fullspanitem = fullspanitem1;
            if (fullspanitem1.d) goto _L6; else goto _L8
_L8:
            l1++;
              goto _L9
_L4:
            return null;
        }

        final void a()
        {
            if (a != null)
            {
                Arrays.fill(a, -1);
            }
            b = null;
        }

        final void a(int i1, int j1)
        {
            if (a != null && i1 < a.length) goto _L2; else goto _L1
_L1:
            return;
_L2:
            c(i1 + j1);
            System.arraycopy(a, i1 + j1, a, i1, a.length - i1 - j1);
            Arrays.fill(a, a.length - j1, a.length, -1);
            if (b != null)
            {
                int k1 = b.size() - 1;
                while (k1 >= 0) 
                {
                    FullSpanItem fullspanitem = (FullSpanItem)b.get(k1);
                    if (fullspanitem.a >= i1)
                    {
                        if (fullspanitem.a < i1 + j1)
                        {
                            b.remove(k1);
                        } else
                        {
                            fullspanitem.a = fullspanitem.a - j1;
                        }
                    }
                    k1--;
                }
            }
            if (true) goto _L1; else goto _L3
_L3:
        }

        public final void a(FullSpanItem fullspanitem)
        {
            if (b == null)
            {
                b = new ArrayList();
            }
            int j1 = b.size();
            for (int i1 = 0; i1 < j1; i1++)
            {
                FullSpanItem fullspanitem1 = (FullSpanItem)b.get(i1);
                if (fullspanitem1.a == fullspanitem.a)
                {
                    b.remove(i1);
                }
                if (fullspanitem1.a >= fullspanitem.a)
                {
                    b.add(i1, fullspanitem);
                    return;
                }
            }

            b.add(fullspanitem);
        }

        final int b(int i1)
        {
            if (a == null)
            {
                return -1;
            }
            if (i1 >= a.length)
            {
                return -1;
            }
            if (b == null) goto _L2; else goto _L1
_L1:
            int j1;
            int k1;
            FullSpanItem fullspanitem = d(i1);
            if (fullspanitem != null)
            {
                b.remove(fullspanitem);
            }
            k1 = b.size();
            j1 = 0;
_L6:
            if (j1 >= k1)
            {
                break MISSING_BLOCK_LABEL_175;
            }
            if (((FullSpanItem)b.get(j1)).a < i1) goto _L4; else goto _L3
_L3:
            if (j1 == -1) goto _L2; else goto _L5
_L5:
            FullSpanItem fullspanitem1 = (FullSpanItem)b.get(j1);
            b.remove(j1);
            j1 = fullspanitem1.a;
_L7:
            if (j1 == -1)
            {
                Arrays.fill(a, i1, a.length, -1);
                return a.length;
            } else
            {
                Arrays.fill(a, i1, j1 + 1, -1);
                return j1 + 1;
            }
_L4:
            j1++;
              goto _L6
_L2:
            j1 = -1;
              goto _L7
            j1 = -1;
              goto _L3
        }

        final void b(int i1, int j1)
        {
            if (a != null && i1 < a.length) goto _L2; else goto _L1
_L1:
            return;
_L2:
            c(i1 + j1);
            System.arraycopy(a, i1, a, i1 + j1, a.length - i1 - j1);
            Arrays.fill(a, i1, i1 + j1, -1);
            if (b != null)
            {
                int k1 = b.size() - 1;
                while (k1 >= 0) 
                {
                    FullSpanItem fullspanitem = (FullSpanItem)b.get(k1);
                    if (fullspanitem.a >= i1)
                    {
                        fullspanitem.a = fullspanitem.a + j1;
                    }
                    k1--;
                }
            }
            if (true) goto _L1; else goto _L3
_L3:
        }

        final void c(int i1)
        {
            if (a == null)
            {
                a = new int[Math.max(i1, 10) + 1];
                Arrays.fill(a, -1);
            } else
            if (i1 >= a.length)
            {
                int ai[] = a;
                int j1;
                for (j1 = a.length; j1 <= i1; j1 *= 2) { }
                a = new int[j1];
                System.arraycopy(ai, 0, a, 0, ai.length);
                Arrays.fill(a, ai.length, a.length, -1);
                return;
            }
        }

        public final FullSpanItem d(int i1)
        {
            if (b != null) goto _L2; else goto _L1
_L1:
            FullSpanItem fullspanitem = null;
_L4:
            return fullspanitem;
_L2:
            int j1 = b.size() - 1;
label0:
            do
            {
label1:
                {
                    if (j1 < 0)
                    {
                        break label1;
                    }
                    FullSpanItem fullspanitem1 = (FullSpanItem)b.get(j1);
                    fullspanitem = fullspanitem1;
                    if (fullspanitem1.a == i1)
                    {
                        break label0;
                    }
                    j1--;
                }
            } while (true);
            if (true) goto _L4; else goto _L3
_L3:
            return null;
        }
    }

    static class LazySpanLookup.FullSpanItem
        implements Parcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public final Object createFromParcel(Parcel parcel)
            {
                return new LazySpanLookup.FullSpanItem(parcel);
            }

            public final volatile Object[] newArray(int i1)
            {
                return new LazySpanLookup.FullSpanItem[i1];
            }

        };
        int a;
        int b;
        int c[];
        boolean d;

        final int a(int i1)
        {
            if (c == null)
            {
                return 0;
            } else
            {
                return c[i1];
            }
        }

        public int describeContents()
        {
            return 0;
        }

        public String toString()
        {
            return (new StringBuilder("FullSpanItem{mPosition=")).append(a).append(", mGapDir=").append(b).append(", mHasUnwantedGapAfter=").append(d).append(", mGapPerSpan=").append(Arrays.toString(c)).append('}').toString();
        }

        public void writeToParcel(Parcel parcel, int i1)
        {
            parcel.writeInt(a);
            parcel.writeInt(b);
            if (d)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            parcel.writeInt(i1);
            if (c != null && c.length > 0)
            {
                parcel.writeInt(c.length);
                parcel.writeIntArray(c);
                return;
            } else
            {
                parcel.writeInt(0);
                return;
            }
        }


        public LazySpanLookup.FullSpanItem()
        {
        }

        public LazySpanLookup.FullSpanItem(Parcel parcel)
        {
            boolean flag = true;
            super();
            a = parcel.readInt();
            b = parcel.readInt();
            int i1;
            if (parcel.readInt() != 1)
            {
                flag = false;
            }
            d = flag;
            i1 = parcel.readInt();
            if (i1 > 0)
            {
                c = new int[i1];
                parcel.readIntArray(c);
            }
        }
    }

    static class SavedState
        implements Parcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public final Object createFromParcel(Parcel parcel)
            {
                return new SavedState(parcel);
            }

            public final volatile Object[] newArray(int i1)
            {
                return new SavedState[i1];
            }

        };
        int a;
        int b;
        int c;
        int d[];
        int e;
        int f[];
        List g;
        boolean h;
        boolean i;
        boolean j;

        public int describeContents()
        {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i1)
        {
            boolean flag = true;
            parcel.writeInt(a);
            parcel.writeInt(b);
            parcel.writeInt(c);
            if (c > 0)
            {
                parcel.writeIntArray(d);
            }
            parcel.writeInt(e);
            if (e > 0)
            {
                parcel.writeIntArray(f);
            }
            if (h)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            parcel.writeInt(i1);
            if (i)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            parcel.writeInt(i1);
            if (j)
            {
                i1 = ((flag) ? 1 : 0);
            } else
            {
                i1 = 0;
            }
            parcel.writeInt(i1);
            parcel.writeList(g);
        }


        public SavedState()
        {
        }

        SavedState(Parcel parcel)
        {
            boolean flag1 = true;
            super();
            a = parcel.readInt();
            b = parcel.readInt();
            c = parcel.readInt();
            if (c > 0)
            {
                d = new int[c];
                parcel.readIntArray(d);
            }
            e = parcel.readInt();
            if (e > 0)
            {
                f = new int[e];
                parcel.readIntArray(f);
            }
            boolean flag;
            if (parcel.readInt() == 1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            h = flag;
            if (parcel.readInt() == 1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            i = flag;
            if (parcel.readInt() == 1)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            j = flag;
            g = parcel.readArrayList(android/support/v7/widget/StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.getClassLoader());
        }

        public SavedState(SavedState savedstate)
        {
            c = savedstate.c;
            a = savedstate.a;
            b = savedstate.b;
            d = savedstate.d;
            e = savedstate.e;
            f = savedstate.f;
            h = savedstate.h;
            i = savedstate.i;
            j = savedstate.j;
            g = savedstate.g;
        }
    }

    private final class a
    {

        int a;
        int b;
        boolean c;
        boolean d;
        final StaggeredGridLayoutManager e;
    }

    public static final class b extends RecyclerView.j
    {

        c e;
        boolean f;

        public final int a()
        {
            if (e == null)
            {
                return -1;
            } else
            {
                return e.d;
            }
        }

        public b()
        {
            super(-2);
        }

        public b(Context context, AttributeSet attributeset)
        {
            super(context, attributeset);
        }

        public b(android.view.ViewGroup.LayoutParams layoutparams)
        {
            super(layoutparams);
        }

        public b(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
        {
            super(marginlayoutparams);
        }
    }

    final class c
    {

        int a;
        int b;
        int c;
        final int d;
        final StaggeredGridLayoutManager e;
        private ArrayList f;

        static ArrayList a(c c1)
        {
            return c1.f;
        }

        private void f()
        {
            View view = (View)f.get(0);
            b b1 = (b)view.getLayoutParams();
            a = e.a.a(view);
            if (b1.f)
            {
                LazySpanLookup.FullSpanItem fullspanitem = e.f.d(((RecyclerView.j) (b1)).a.getLayoutPosition());
                if (fullspanitem != null && fullspanitem.b == -1)
                {
                    a = a - fullspanitem.a(d);
                }
            }
        }

        private void g()
        {
            View view = (View)f.get(f.size() - 1);
            b b1 = (b)view.getLayoutParams();
            b = e.a.b(view);
            if (b1.f)
            {
                LazySpanLookup.FullSpanItem fullspanitem = e.f.d(((RecyclerView.j) (b1)).a.getLayoutPosition());
                if (fullspanitem != null && fullspanitem.b == 1)
                {
                    b = b + fullspanitem.a(d);
                }
            }
        }

        final int a()
        {
            if (a != 0x80000000)
            {
                return a;
            } else
            {
                f();
                return a;
            }
        }

        final int a(int i1)
        {
            if (a != 0x80000000)
            {
                i1 = a;
            } else
            if (f.size() != 0)
            {
                f();
                return a;
            }
            return i1;
        }

        final void a(View view)
        {
            b b1 = (b)view.getLayoutParams();
            b1.e = this;
            f.add(0, view);
            a = 0x80000000;
            if (f.size() == 1)
            {
                b = 0x80000000;
            }
            if (((RecyclerView.j) (b1)).a.isRemoved() || ((RecyclerView.j) (b1)).a.isChanged())
            {
                c = c + e.a.c(view);
            }
        }

        final int b()
        {
            if (b != 0x80000000)
            {
                return b;
            } else
            {
                g();
                return b;
            }
        }

        final int b(int i1)
        {
            if (b != 0x80000000)
            {
                i1 = b;
            } else
            if (f.size() != 0)
            {
                g();
                return b;
            }
            return i1;
        }

        final void b(View view)
        {
            b b1 = (b)view.getLayoutParams();
            b1.e = this;
            f.add(view);
            b = 0x80000000;
            if (f.size() == 1)
            {
                a = 0x80000000;
            }
            if (((RecyclerView.j) (b1)).a.isRemoved() || ((RecyclerView.j) (b1)).a.isChanged())
            {
                c = c + e.a.c(view);
            }
        }

        final void c()
        {
            f.clear();
            a = 0x80000000;
            b = 0x80000000;
            c = 0;
        }

        final void c(int i1)
        {
            a = i1;
            b = i1;
        }

        final void d()
        {
            int i1 = f.size();
            View view = (View)f.remove(i1 - 1);
            b b1 = (b)view.getLayoutParams();
            b1.e = null;
            if (((RecyclerView.j) (b1)).a.isRemoved() || ((RecyclerView.j) (b1)).a.isChanged())
            {
                c = c - e.a.c(view);
            }
            if (i1 == 1)
            {
                a = 0x80000000;
            }
            b = 0x80000000;
        }

        final void d(int i1)
        {
            if (a != 0x80000000)
            {
                a = a + i1;
            }
            if (b != 0x80000000)
            {
                b = b + i1;
            }
        }

        final void e()
        {
            View view = (View)f.remove(0);
            b b1 = (b)view.getLayoutParams();
            b1.e = null;
            if (f.size() == 0)
            {
                b = 0x80000000;
            }
            if (((RecyclerView.j) (b1)).a.isRemoved() || ((RecyclerView.j) (b1)).a.isChanged())
            {
                c = c - e.a.c(view);
            }
            a = 0x80000000;
        }
    }


    l a;
    l b;
    boolean c;
    int d;
    int e;
    LazySpanLookup f;
    private int g;
    private c h[];
    private int i;
    private int j;
    private h k;
    private boolean l;
    private BitSet m;
    private int n;
    private boolean o;
    private boolean p;
    private SavedState q;
    private int r;
    private int s;
    private int t;
    private final Rect u;
    private final a v;
    private boolean w;
    private boolean x;
    private final Runnable y;

    private static int a(int i1, int j1)
    {
        if (i1 < 0)
        {
            return j1;
        } else
        {
            return android.view.View.MeasureSpec.makeMeasureSpec(i1, 0x40000000);
        }
    }

    private static int a(int i1, int j1, int k1)
    {
        int l1;
        if (j1 != 0 || k1 != 0)
        {
            if ((l1 = android.view.View.MeasureSpec.getMode(i1)) == 0x80000000 || l1 == 0x40000000)
            {
                return android.view.View.MeasureSpec.makeMeasureSpec(android.view.View.MeasureSpec.getSize(i1) - j1 - k1, l1);
            }
        }
        return i1;
    }

    private int a(int i1, RecyclerView.o o1, RecyclerView.s s1)
    {
        b();
        int j1;
        int k1;
        if (i1 > 0)
        {
            j1 = 1;
            k1 = e();
        } else
        {
            j1 = -1;
            k1 = f();
        }
        a(k1, s1);
        a(j1);
        k.b = k.c + k1;
        k1 = Math.abs(i1);
        k.a = k1;
        j1 = a(o1, k, s1);
        if (k1 >= j1)
        {
            if (i1 < 0)
            {
                i1 = -j1;
            } else
            {
                i1 = j1;
            }
        }
        a.a(-i1);
        o = c;
        return i1;
    }

    private int a(RecyclerView.o o1, h h1, RecyclerView.s s1)
    {
        Object obj;
        View view;
        b b1;
        int i1;
        int j1;
        int k1;
        int l1;
        int j2;
        int k2;
        int i4;
        m.set(0, g, true);
        LazySpanLookup lazyspanlookup;
        if (h1.d == 1)
        {
            j1 = h1.f + h1.a;
        } else
        {
            j1 = h1.e - h1.a;
        }
        b(h1.d, j1);
        if (c)
        {
            k1 = a.d();
        } else
        {
            k1 = a.c();
        }
        i1 = 0;
_L20:
        if (h1.b >= 0 && h1.b < s1.e())
        {
            l1 = 1;
        } else
        {
            l1 = 0;
        }
        if (l1 == 0 || m.isEmpty())
        {
            break; /* Loop/switch isn't completed */
        }
        view = o1.c(h1.b);
        h1.b = h1.b + h1.c;
        b1 = (b)view.getLayoutParams();
        i4 = ((RecyclerView.j) (b1)).a.getLayoutPosition();
        obj = f;
        if (((LazySpanLookup) (obj)).a == null || i4 >= ((LazySpanLookup) (obj)).a.length)
        {
            i1 = -1;
        } else
        {
            i1 = ((LazySpanLookup) (obj)).a[i4];
        }
        if (i1 == -1)
        {
            l1 = 1;
        } else
        {
            l1 = 0;
        }
        if (l1 != 0)
        {
            if (b1.f)
            {
                obj = h[0];
            } else
            {
                i1 = h1.d;
                if (i == 0)
                {
                    int j3;
                    int j4;
                    boolean flag;
                    if (i1 == -1)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    if (flag != c)
                    {
                        i1 = 1;
                    } else
                    {
                        i1 = 0;
                    }
                } else
                {
                    boolean flag1;
                    if (i1 == -1)
                    {
                        flag1 = true;
                    } else
                    {
                        flag1 = false;
                    }
                    if (flag1 == c)
                    {
                        flag1 = true;
                    } else
                    {
                        flag1 = false;
                    }
                    if (flag1 == d())
                    {
                        i1 = 1;
                    } else
                    {
                        i1 = 0;
                    }
                }
                if (i1 != 0)
                {
                    i1 = g - 1;
                    k2 = -1;
                    j2 = -1;
                } else
                {
                    i1 = 0;
                    k2 = g;
                    j2 = 1;
                }
                if (h1.d == 1)
                {
                    obj = null;
                    j3 = 0x7fffffff;
                    j4 = a.c();
                    l2 = i1;
                    i1 = j3;
                    while (l2 != k2) 
                    {
                        obj1 = h[l2];
                        j3 = ((c) (obj1)).b(j4);
                        if (j3 < i1)
                        {
                            obj = obj1;
                            i1 = j3;
                        }
                        l2 += j2;
                    }
                } else
                {
                    obj = null;
                    int k3 = 0x80000000;
                    int k4 = a.d();
                    l2 = i1;
                    i1 = k3;
                    while (l2 != k2) 
                    {
                        obj1 = h[l2];
                        int l3 = ((c) (obj1)).a(k4);
                        if (l3 > i1)
                        {
                            obj = obj1;
                            i1 = l3;
                        }
                        l2 += j2;
                    }
                }
            }
            lazyspanlookup = f;
            lazyspanlookup.c(i4);
            lazyspanlookup.a[i4] = ((c) (obj)).d;
        } else
        {
            obj = h[i1];
        }
        b1.e = ((c) (obj));
        if (h1.d == 1)
        {
            addView(view);
        } else
        {
            addView(view, 0);
        }
        if (b1.f)
        {
            if (i == 1)
            {
                a(view, r, a(b1.height, t));
            } else
            {
                a(view, a(b1.width, s), r);
            }
        } else
        if (i == 1)
        {
            a(view, s, a(b1.height, t));
        } else
        {
            a(view, a(b1.width, s), t);
        }
        LazySpanLookup.FullSpanItem fullspanitem;
        if (h1.d == 1)
        {
            int l2;
            if (b1.f)
            {
                i1 = c(k1);
            } else
            {
                i1 = ((c) (obj)).b(k1);
            }
            l2 = i1 + a.c(view);
            j2 = i1;
            k2 = l2;
            if (l1 != 0)
            {
                j2 = i1;
                k2 = l2;
                if (b1.f)
                {
                    Object obj1 = new LazySpanLookup.FullSpanItem();
                    obj1.c = new int[g];
                    for (j2 = 0; j2 < g; j2++)
                    {
                        ((LazySpanLookup.FullSpanItem) (obj1)).c[j2] = i1 - h[j2].b(i1);
                    }

                    obj1.b = -1;
                    obj1.a = i4;
                    f.a(((LazySpanLookup.FullSpanItem) (obj1)));
                    k2 = l2;
                    j2 = i1;
                }
            }
        } else
        {
            int i3;
            if (b1.f)
            {
                i1 = b(k1);
            } else
            {
                i1 = ((c) (obj)).a(k1);
            }
            i3 = i1 - a.c(view);
            j2 = i3;
            k2 = i1;
            if (l1 != 0)
            {
                j2 = i3;
                k2 = i1;
                if (b1.f)
                {
                    LazySpanLookup.FullSpanItem fullspanitem1 = new LazySpanLookup.FullSpanItem();
                    fullspanitem1.c = new int[g];
                    for (j2 = 0; j2 < g; j2++)
                    {
                        fullspanitem1.c[j2] = h[j2].a(i1) - i1;
                    }

                    fullspanitem1.b = 1;
                    fullspanitem1.a = i4;
                    f.a(fullspanitem1);
                    j2 = i3;
                    k2 = i1;
                }
            }
        }
        if (!b1.f || h1.c != -1) goto _L2; else goto _L1
_L1:
        if (l1 != 0) goto _L4; else goto _L3
_L3:
        if (h1.d != 1) goto _L6; else goto _L5
_L5:
        l1 = h[0].b(0x80000000);
        i1 = 1;
_L12:
        if (i1 >= g) goto _L8; else goto _L7
_L7:
        if (h[i1].b(0x80000000) == l1) goto _L10; else goto _L9
_L9:
        i1 = 0;
_L13:
        if (i1 == 0)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
_L16:
        if (i1 == 0) goto _L2; else goto _L11
_L11:
        fullspanitem = f.d(i4);
        if (fullspanitem != null)
        {
            fullspanitem.d = true;
        }
_L4:
        w = true;
_L2:
        if (h1.d == 1)
        {
            if (b1.f)
            {
                for (i1 = g - 1; i1 >= 0; i1--)
                {
                    h[i1].b(view);
                }

            } else
            {
                b1.e.b(view);
            }
        } else
        if (b1.f)
        {
            i1 = g - 1;
            while (i1 >= 0) 
            {
                h[i1].a(view);
                i1--;
            }
        } else
        {
            b1.e.a(view);
        }
        break MISSING_BLOCK_LABEL_1348;
_L10:
        i1++;
          goto _L12
_L8:
        i1 = 1;
          goto _L13
_L6:
        l1 = h[0].a(0x80000000);
        i1 = 1;
_L17:
        if (i1 >= g)
        {
            break MISSING_BLOCK_LABEL_1326;
        }
        if (h[i1].a(0x80000000) == l1) goto _L15; else goto _L14
_L14:
        i1 = 0;
_L18:
        if (i1 == 0)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
          goto _L16
_L15:
        i1++;
          goto _L17
        i1 = 1;
          goto _L18
        int i2;
        if (b1.f)
        {
            i1 = b.c();
        } else
        {
            i1 = ((c) (obj)).d * j + b.c();
        }
        i2 = i1 + b.c(view);
        if (i == 1)
        {
            a(view, i1, j2, i2, k2);
        } else
        {
            a(view, j2, i1, k2, i2);
        }
        if (b1.f)
        {
            b(k.d, j1);
        } else
        {
            a(((c) (obj)), k.d, j1);
        }
        a(o1, k);
        i1 = 1;
        if (true) goto _L20; else goto _L19
_L19:
        if (i1 == 0)
        {
            a(o1, k);
        }
        if (k.d == -1)
        {
            i1 = b(a.c());
            i1 = a.c() - i1;
        } else
        {
            i1 = c(a.d()) - a.d();
        }
        if (i1 > 0)
        {
            return Math.min(h1.a, i1);
        } else
        {
            return 0;
        }
    }

    private int a(RecyclerView.s s1)
    {
        boolean flag1 = true;
        if (getChildCount() == 0)
        {
            return 0;
        }
        b();
        l l1 = a;
        View view;
        boolean flag;
        if (!x)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        view = a(flag);
        if (!x)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        return android.support.v7.widget.n.a(s1, l1, view, b(flag), this, x, c);
    }

    static int a(StaggeredGridLayoutManager staggeredgridlayoutmanager)
    {
        return staggeredgridlayoutmanager.i;
    }

    static int a(StaggeredGridLayoutManager staggeredgridlayoutmanager, int i1)
    {
        return staggeredgridlayoutmanager.d(i1);
    }

    private View a()
    {
        BitSet bitset;
        View view;
        b b1;
        Object obj;
        int i1;
        byte byte0;
        int j1;
        byte byte1;
        int k1;
        i1 = getChildCount() - 1;
        bitset = new BitSet(g);
        bitset.set(0, g, true);
        if (i == 1 && d())
        {
            byte0 = 1;
        } else
        {
            byte0 = -1;
        }
        if (c)
        {
            j1 = -1;
        } else
        {
            byte1 = 0;
            j1 = i1 + 1;
            i1 = byte1;
        }
        if (i1 < j1)
        {
            byte1 = 1;
        } else
        {
            byte1 = -1;
        }
        k1 = i1;
_L18:
        if (k1 == j1)
        {
            break MISSING_BLOCK_LABEL_403;
        }
        view = getChildAt(k1);
        b1 = (b)view.getLayoutParams();
        if (!bitset.get(b1.e.d)) goto _L2; else goto _L1
_L1:
        obj = b1.e;
        if (!c) goto _L4; else goto _L3
_L3:
        if (((c) (obj)).b() >= a.d()) goto _L6; else goto _L5
_L5:
        i1 = 1;
_L10:
        if (i1 == 0) goto _L8; else goto _L7
_L7:
        return view;
_L4:
        if (((c) (obj)).a() <= a.c()) goto _L6; else goto _L9
_L9:
        i1 = 1;
          goto _L10
_L6:
        i1 = 0;
          goto _L10
_L8:
        bitset.clear(b1.e.d);
_L2:
        if (b1.f || k1 + byte1 == j1)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = getChildAt(k1 + byte1);
        i1 = 0;
        if (!c) goto _L12; else goto _L11
_L11:
        int l1;
        int j2;
        l1 = a.b(view);
        j2 = a.b(((View) (obj)));
        if (l1 < j2) goto _L7; else goto _L13
_L13:
        if (l1 == j2)
        {
            i1 = 1;
        }
_L16:
        if (!i1)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = (b)((View) (obj)).getLayoutParams();
        int i2;
        int k2;
        if (b1.e.d - ((b) (obj)).e.d < 0)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (byte0 < 0)
        {
            i2 = 1;
        } else
        {
            i2 = 0;
        }
        if (i1 != i2) goto _L7; else goto _L14
_L14:
        k1 += byte1;
        continue; /* Loop/switch isn't completed */
_L12:
        i2 = a.a(view);
        k2 = a.a(((View) (obj)));
        if (i2 > k2) goto _L7; else goto _L15
_L15:
        if (i2 == k2)
        {
            i1 = 1;
        }
          goto _L16
        return null;
        if (true) goto _L18; else goto _L17
_L17:
    }

    private View a(boolean flag)
    {
        b();
        int j1 = a.c();
        int k1 = a.d();
        int l1 = getChildCount();
        View view = null;
        for (int i1 = 0; i1 < l1;)
        {
            View view2 = getChildAt(i1);
            int i2 = a.a(view2);
            View view1 = view;
            if (a.b(view2) > j1)
            {
                view1 = view;
                if (i2 < k1)
                {
                    if (i2 >= j1 || !flag)
                    {
                        return view2;
                    }
                    view1 = view;
                    if (view == null)
                    {
                        view1 = view2;
                    }
                }
            }
            i1++;
            view = view1;
        }

        return view;
    }

    private void a(int i1)
    {
        boolean flag = true;
        k.d = i1;
        h h1 = k;
        boolean flag2 = c;
        boolean flag1;
        if (i1 == -1)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag2 == flag1)
        {
            i1 = ((flag) ? 1 : 0);
        } else
        {
            i1 = -1;
        }
        h1.c = i1;
    }

    private void a(int i1, RecyclerView.s s1)
    {
        boolean flag2 = false;
        k.a = 0;
        k.b = i1;
        boolean flag = false;
        boolean flag1 = false;
        int j1 = ((flag1) ? 1 : 0);
        int k1 = ((flag) ? 1 : 0);
        if (isSmoothScrolling())
        {
            int l1 = s1.c();
            j1 = ((flag1) ? 1 : 0);
            k1 = ((flag) ? 1 : 0);
            if (l1 != -1)
            {
                boolean flag3 = c;
                if (l1 < i1)
                {
                    flag2 = true;
                }
                if (flag3 == flag2)
                {
                    j1 = a.f();
                    k1 = ((flag) ? 1 : 0);
                } else
                {
                    k1 = a.f();
                    j1 = ((flag1) ? 1 : 0);
                }
            }
        }
        if (getClipToPadding())
        {
            k.e = a.c() - k1;
            k.f = a.d() + j1;
            return;
        } else
        {
            k.f = a.e() + j1;
            k.e = -k1;
            return;
        }
    }

    private void a(RecyclerView.o o1, int i1)
    {
_L12:
        if (getChildCount() <= 0) goto _L2; else goto _L1
_L1:
        View view = getChildAt(0);
        if (a.b(view) > i1) goto _L2; else goto _L3
_L3:
        b b1 = (b)view.getLayoutParams();
        if (!b1.f) goto _L5; else goto _L4
_L4:
        int j1 = 0;
_L9:
        if (j1 >= g) goto _L7; else goto _L6
_L6:
        if (android.support.v7.widget.c.a(h[j1]).size() != 1) goto _L8; else goto _L2
_L2:
        return;
_L8:
        j1++;
          goto _L9
_L7:
        for (int k1 = 0; k1 < g; k1++)
        {
            h[k1].e();
        }

        break; /* Loop/switch isn't completed */
_L5:
        if (android.support.v7.widget.c.a(b1.e).size() == 1)
        {
            continue; /* Loop/switch isn't completed */
        }
        b1.e.e();
        break; /* Loop/switch isn't completed */
        if (true) goto _L2; else goto _L10
_L10:
        removeAndRecycleView(view, o1);
        if (true) goto _L12; else goto _L11
_L11:
    }

    private void a(RecyclerView.o o1, RecyclerView.s s1, boolean flag)
    {
        int i1 = c(a.d());
        i1 = a.d() - i1;
        if (i1 > 0)
        {
            i1 -= -a(-i1, o1, s1);
            if (flag && i1 > 0)
            {
                a.a(i1);
            }
        }
    }

    private void a(RecyclerView.o o1, h h1)
    {
        int l1 = 1;
        int i1 = 1;
        if (h1.a == 0)
        {
            if (h1.d == -1)
            {
                b(o1, h1.f);
                return;
            } else
            {
                a(o1, h1.e);
                return;
            }
        }
        if (h1.d == -1)
        {
            int l2 = h1.e;
            int j3 = h1.e;
            int j1;
            for (j1 = h[0].a(j3); i1 < g; j1 = l1)
            {
                int j2 = h[i1].a(j3);
                l1 = j1;
                if (j2 > j1)
                {
                    l1 = j2;
                }
                i1++;
            }

            i1 = l2 - j1;
            if (i1 < 0)
            {
                i1 = h1.f;
            } else
            {
                i1 = h1.f - Math.min(i1, h1.a);
            }
            b(o1, i1);
            return;
        }
        int i3 = h1.f;
        int k1 = h[0].b(i3);
        for (i1 = l1; i1 < g;)
        {
            int k2 = h[i1].b(i3);
            int i2 = k1;
            if (k2 < k1)
            {
                i2 = k2;
            }
            i1++;
            k1 = i2;
        }

        i1 = k1 - h1.f;
        if (i1 < 0)
        {
            i1 = h1.e;
        } else
        {
            i1 = h1.e + Math.min(i1, h1.a);
        }
        a(o1, i1);
    }

    private void a(c c1, int i1, int j1)
    {
        int k1 = c1.c;
        if (i1 == -1)
        {
            if (c1.a() + k1 <= j1)
            {
                m.set(c1.d, false);
            }
        } else
        if (c1.b() - k1 >= j1)
        {
            m.set(c1.d, false);
            return;
        }
    }

    private void a(View view, int i1, int j1)
    {
        calculateItemDecorationsForChild(view, u);
        b b1 = (b)view.getLayoutParams();
        view.measure(a(i1, b1.leftMargin + u.left, b1.rightMargin + u.right), a(j1, b1.topMargin + u.top, b1.bottomMargin + u.bottom));
    }

    private void a(View view, int i1, int j1, int k1, int l1)
    {
        b b1 = (b)view.getLayoutParams();
        layoutDecorated(view, i1 + b1.leftMargin, j1 + b1.topMargin, k1 - b1.rightMargin, l1 - b1.bottomMargin);
    }

    private int b(int i1)
    {
        int k1 = h[0].a(i1);
        for (int j1 = 1; j1 < g;)
        {
            int i2 = h[j1].a(i1);
            int l1 = k1;
            if (i2 < k1)
            {
                l1 = i2;
            }
            j1++;
            k1 = l1;
        }

        return k1;
    }

    private int b(RecyclerView.s s1)
    {
        boolean flag1 = true;
        if (getChildCount() == 0)
        {
            return 0;
        }
        b();
        l l1 = a;
        View view;
        boolean flag;
        if (!x)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        view = a(flag);
        if (!x)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        return android.support.v7.widget.n.a(s1, l1, view, b(flag), this, x);
    }

    private View b(boolean flag)
    {
        b();
        int j1 = a.c();
        int k1 = a.d();
        View view = null;
        for (int i1 = getChildCount() - 1; i1 >= 0;)
        {
            View view2 = getChildAt(i1);
            int l1 = a.a(view2);
            int i2 = a.b(view2);
            View view1 = view;
            if (i2 > j1)
            {
                view1 = view;
                if (l1 < k1)
                {
                    if (i2 <= k1 || !flag)
                    {
                        return view2;
                    }
                    view1 = view;
                    if (view == null)
                    {
                        view1 = view2;
                    }
                }
            }
            i1--;
            view = view1;
        }

        return view;
    }

    private void b()
    {
        if (a == null)
        {
            a = android.support.v7.widget.l.a(this, i);
            b = android.support.v7.widget.l.a(this, 1 - i);
            k = new h();
        }
    }

    private void b(int i1, int j1)
    {
        for (int k1 = 0; k1 < g; k1++)
        {
            if (!android.support.v7.widget.c.a(h[k1]).isEmpty())
            {
                a(h[k1], i1, j1);
            }
        }

    }

    private void b(int i1, int j1, int k1)
    {
        int l1;
        int i2;
        int j2;
        if (c)
        {
            j2 = e();
        } else
        {
            j2 = f();
        }
        if (k1 == 3)
        {
            if (i1 < j1)
            {
                i2 = j1 + 1;
                l1 = i1;
            } else
            {
                i2 = i1 + 1;
                l1 = j1;
            }
        } else
        {
            l1 = i1;
            i2 = i1 + j1;
        }
        f.b(l1);
        k1;
        JVM INSTR tableswitch 0 3: default 72
    //                   0 111
    //                   1 123
    //                   2 72
    //                   3 135;
           goto _L1 _L2 _L3 _L1 _L4
_L1:
        if (i2 > j2) goto _L6; else goto _L5
_L5:
        return;
_L2:
        f.b(i1, j1);
        continue; /* Loop/switch isn't completed */
_L3:
        f.a(i1, j1);
        continue; /* Loop/switch isn't completed */
_L4:
        f.a(i1, 1);
        f.b(j1, 1);
        continue; /* Loop/switch isn't completed */
_L6:
        if (c)
        {
            i1 = f();
        } else
        {
            i1 = e();
        }
        if (l1 > i1) goto _L5; else goto _L7
_L7:
        requestLayout();
        return;
        if (true) goto _L1; else goto _L8
_L8:
    }

    private void b(RecyclerView.o o1, int i1)
    {
        int j1 = getChildCount() - 1;
_L12:
        if (j1 < 0) goto _L2; else goto _L1
_L1:
        View view = getChildAt(j1);
        if (a.a(view) < i1) goto _L2; else goto _L3
_L3:
        b b1 = (b)view.getLayoutParams();
        if (!b1.f) goto _L5; else goto _L4
_L4:
        int k1 = 0;
_L9:
        if (k1 >= g) goto _L7; else goto _L6
_L6:
        if (android.support.v7.widget.c.a(h[k1]).size() != 1) goto _L8; else goto _L2
_L2:
        return;
_L8:
        k1++;
          goto _L9
_L7:
        for (int l1 = 0; l1 < g; l1++)
        {
            h[l1].d();
        }

        break; /* Loop/switch isn't completed */
_L5:
        if (android.support.v7.widget.c.a(b1.e).size() == 1)
        {
            continue; /* Loop/switch isn't completed */
        }
        b1.e.d();
        break; /* Loop/switch isn't completed */
        if (true) goto _L2; else goto _L10
_L10:
        removeAndRecycleView(view, o1);
        j1--;
        if (true) goto _L12; else goto _L11
_L11:
    }

    private void b(RecyclerView.o o1, RecyclerView.s s1, boolean flag)
    {
        int i1 = b(a.c()) - a.c();
        if (i1 > 0)
        {
            i1 -= a(i1, o1, s1);
            if (flag && i1 > 0)
            {
                a.a(-i1);
            }
        }
    }

    private int c(int i1)
    {
        int k1 = h[0].b(i1);
        for (int j1 = 1; j1 < g;)
        {
            int i2 = h[j1].b(i1);
            int l1 = k1;
            if (i2 > k1)
            {
                l1 = i2;
            }
            j1++;
            k1 = l1;
        }

        return k1;
    }

    private int c(RecyclerView.s s1)
    {
        boolean flag1 = true;
        if (getChildCount() == 0)
        {
            return 0;
        }
        b();
        l l1 = a;
        View view;
        boolean flag;
        if (!x)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        view = a(flag);
        if (!x)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        return android.support.v7.widget.n.b(s1, l1, view, b(flag), this, x);
    }

    private void c()
    {
        boolean flag = true;
        if (i != 1 && d()) goto _L2; else goto _L1
_L1:
        flag = l;
_L4:
        c = flag;
        return;
_L2:
        if (l)
        {
            flag = false;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private int d(int i1)
    {
        if (getChildCount() != 0) goto _L2; else goto _L1
_L1:
        if (!c) goto _L4; else goto _L3
_L3:
        return 1;
_L4:
        return -1;
_L2:
        boolean flag;
        if (i1 < f())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag != c)
        {
            return -1;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    private boolean d()
    {
        return getLayoutDirection() == 1;
    }

    private int e()
    {
        int i1 = getChildCount();
        if (i1 == 0)
        {
            return 0;
        } else
        {
            return getPosition(getChildAt(i1 - 1));
        }
    }

    private int f()
    {
        if (getChildCount() == 0)
        {
            return 0;
        } else
        {
            return getPosition(getChildAt(0));
        }
    }

    public final void assertNotInLayoutOrScroll(String s1)
    {
        if (q == null)
        {
            super.assertNotInLayoutOrScroll(s1);
        }
    }

    public final boolean canScrollHorizontally()
    {
        return i == 0;
    }

    public final boolean canScrollVertically()
    {
        return i == 1;
    }

    public final boolean checkLayoutParams(RecyclerView.j j1)
    {
        return j1 instanceof b;
    }

    public final int computeHorizontalScrollExtent(RecyclerView.s s1)
    {
        return b(s1);
    }

    public final int computeHorizontalScrollOffset(RecyclerView.s s1)
    {
        return a(s1);
    }

    public final int computeHorizontalScrollRange(RecyclerView.s s1)
    {
        return c(s1);
    }

    public final int computeVerticalScrollExtent(RecyclerView.s s1)
    {
        return b(s1);
    }

    public final int computeVerticalScrollOffset(RecyclerView.s s1)
    {
        return a(s1);
    }

    public final int computeVerticalScrollRange(RecyclerView.s s1)
    {
        return c(s1);
    }

    public final RecyclerView.j generateDefaultLayoutParams()
    {
        return new b();
    }

    public final RecyclerView.j generateLayoutParams(Context context, AttributeSet attributeset)
    {
        return new b(context, attributeset);
    }

    public final RecyclerView.j generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        if (layoutparams instanceof android.view.ViewGroup.MarginLayoutParams)
        {
            return new b((android.view.ViewGroup.MarginLayoutParams)layoutparams);
        } else
        {
            return new b(layoutparams);
        }
    }

    public final int getColumnCountForAccessibility(RecyclerView.o o1, RecyclerView.s s1)
    {
        if (i == 1)
        {
            return g;
        } else
        {
            return super.getColumnCountForAccessibility(o1, s1);
        }
    }

    public final int getRowCountForAccessibility(RecyclerView.o o1, RecyclerView.s s1)
    {
        if (i == 0)
        {
            return g;
        } else
        {
            return super.getRowCountForAccessibility(o1, s1);
        }
    }

    public final void offsetChildrenHorizontal(int i1)
    {
        super.offsetChildrenHorizontal(i1);
        for (int j1 = 0; j1 < g; j1++)
        {
            h[j1].d(i1);
        }

    }

    public final void offsetChildrenVertical(int i1)
    {
        super.offsetChildrenVertical(i1);
        for (int j1 = 0; j1 < g; j1++)
        {
            h[j1].d(i1);
        }

    }

    public final void onDetachedFromWindow(RecyclerView recyclerview, RecyclerView.o o1)
    {
        removeCallbacks(y);
        for (int i1 = 0; i1 < g; i1++)
        {
            h[i1].c();
        }

    }

    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityevent)
    {
        View view;
        View view1;
label0:
        {
            super.onInitializeAccessibilityEvent(accessibilityevent);
            if (getChildCount() > 0)
            {
                accessibilityevent = android.support.v4.view.accessibility.a.a(accessibilityevent);
                view = a(false);
                view1 = b(false);
                if (view != null && view1 != null)
                {
                    break label0;
                }
            }
            return;
        }
        int i1 = getPosition(view);
        int j1 = getPosition(view1);
        if (i1 < j1)
        {
            accessibilityevent.b(i1);
            accessibilityevent.c(j1);
            return;
        } else
        {
            accessibilityevent.b(j1);
            accessibilityevent.c(i1);
            return;
        }
    }

    public final void onInitializeAccessibilityNodeInfoForItem(RecyclerView.o o1, RecyclerView.s s1, View view, android.support.v4.view.accessibility.c c1)
    {
        int k1 = 1;
        int i1 = 1;
        int j1 = -1;
        o1 = view.getLayoutParams();
        if (!(o1 instanceof b))
        {
            super.onInitializeAccessibilityNodeInfoForItem(view, c1);
            return;
        }
        o1 = (b)o1;
        int l1;
        if (i == 0)
        {
            l1 = o1.a();
            if (((b) (o1)).f)
            {
                i1 = g;
            }
            byte byte0 = -1;
            k1 = i1;
            i1 = byte0;
        } else
        {
            i1 = o1.a();
            if (((b) (o1)).f)
            {
                int i2 = g;
                l1 = -1;
                j1 = i1;
                k1 = -1;
                i1 = i2;
            } else
            {
                l1 = -1;
                j1 = i1;
                byte byte1 = -1;
                i1 = k1;
                k1 = byte1;
            }
        }
        c1.b(android.support.v4.view.accessibility.c.l.a(l1, k1, j1, i1, ((b) (o1)).f));
    }

    public final void onItemsAdded(RecyclerView recyclerview, int i1, int j1)
    {
        b(i1, j1, 0);
    }

    public final void onItemsChanged(RecyclerView recyclerview)
    {
        f.a();
        requestLayout();
    }

    public final void onItemsMoved(RecyclerView recyclerview, int i1, int j1, int k1)
    {
        b(i1, j1, 3);
    }

    public final void onItemsRemoved(RecyclerView recyclerview, int i1, int j1)
    {
        b(i1, j1, 1);
    }

    public final void onItemsUpdated(RecyclerView recyclerview, int i1, int j1, Object obj)
    {
        b(i1, j1, 2);
    }

    public final void onLayoutChildren(RecyclerView.o o1, RecyclerView.s s1)
    {
        a a1;
        int j1;
        boolean flag1;
        flag1 = true;
        b();
        a1 = v;
        a1.a = -1;
        a1.b = 0x80000000;
        a1.c = false;
        a1.d = false;
        if ((q != null || d != -1) && s1.e() == 0)
        {
            removeAndRecycleAllViews(o1);
            return;
        }
        if (q != null)
        {
            if (q.c > 0)
            {
                if (q.c == g)
                {
                    int l1 = 0;
                    while (l1 < g) 
                    {
                        h[l1].c();
                        int l2 = q.d[l1];
                        int i1 = l2;
                        if (l2 != 0x80000000)
                        {
                            if (q.i)
                            {
                                i1 = l2 + a.d();
                            } else
                            {
                                i1 = l2 + a.c();
                            }
                        }
                        h[l1].c(i1);
                        l1++;
                    }
                } else
                {
                    SavedState savedstate = q;
                    savedstate.d = null;
                    savedstate.c = 0;
                    savedstate.e = 0;
                    savedstate.f = null;
                    savedstate.g = null;
                    q.a = q.b;
                }
            }
            p = q.j;
            boolean flag2 = q.h;
            assertNotInLayoutOrScroll(null);
            if (q != null && q.h != flag2)
            {
                q.h = flag2;
            }
            l = flag2;
            requestLayout();
            c();
            int i2;
            int i3;
            if (q.a != -1)
            {
                d = q.a;
                a1.c = q.i;
            } else
            {
                a1.c = c;
            }
            if (q.e > 1)
            {
                f.a = q.f;
                f.b = q.g;
            }
        } else
        {
            c();
            a1.c = c;
        }
        if (!s1.a() && d != -1) goto _L2; else goto _L1
_L1:
        j1 = 0;
_L30:
        if (j1 != 0) goto _L4; else goto _L3
_L3:
        if (!o) goto _L6; else goto _L5
_L5:
        i3 = s1.e();
        j1 = getChildCount() - 1;
_L15:
        if (j1 < 0) goto _L8; else goto _L7
_L7:
        i2 = getPosition(getChildAt(j1));
        if (i2 < 0 || i2 >= i3)
        {
            continue; /* Loop/switch isn't completed */
        }
        j1 = i2;
_L16:
        a1.a = j1;
        a1.b = 0x80000000;
          goto _L4
_L2:
        if (d < 0 || d >= s1.e())
        {
            d = -1;
            e = 0x80000000;
            j1 = 0;
            continue; /* Loop/switch isn't completed */
        }
        if (q != null && q.a != -1 && q.c > 0) goto _L10; else goto _L9
_L9:
        view = findViewByPosition(d);
        if (view == null) goto _L12; else goto _L11
_L11:
        if (c)
        {
            j1 = e();
        } else
        {
            j1 = f();
        }
        a1.a = j1;
        if (e != 0x80000000)
        {
            if (a1.c)
            {
                a1.b = a.d() - e - a.b(view);
            } else
            {
                a1.b = (a.c() + e) - a.a(view);
            }
            j1 = 1;
            continue; /* Loop/switch isn't completed */
        }
        if (a.c(view) > a.f())
        {
            if (a1.c)
            {
                j1 = a.d();
            } else
            {
                j1 = a.c();
            }
            a1.b = j1;
        } else
        {
            j1 = a.a(view) - a.c();
            if (j1 < 0)
            {
                a1.b = -j1;
            } else
            {
                j1 = a.d() - a.b(view);
                if (j1 < 0)
                {
                    a1.b = j1;
                } else
                {
                    a1.b = 0x80000000;
                }
            }
        }
_L14:
        j1 = 1;
        continue; /* Loop/switch isn't completed */
_L12:
        a1.a = d;
        if (e == 0x80000000)
        {
            boolean flag3;
            if (d(a1.a) == 1)
            {
                flag3 = true;
            } else
            {
                flag3 = false;
            }
            a1.c = flag3;
            if (a1.c)
            {
                j1 = a1.e.a.d();
            } else
            {
                j1 = a1.e.a.c();
            }
            a1.b = j1;
        } else
        {
            j1 = e;
            if (a1.c)
            {
                a1.b = a1.e.a.d() - j1;
            } else
            {
                a1.b = j1 + a1.e.a.c();
            }
        }
        a1.d = true;
        continue; /* Loop/switch isn't completed */
_L10:
        a1.b = 0x80000000;
        a1.a = d;
        if (true) goto _L14; else goto _L13
_L13:
        j1--;
          goto _L15
_L8:
        j1 = 0;
          goto _L16
_L6:
        l3 = s1.e();
        j4 = getChildCount();
        j2 = 0;
_L20:
        if (j2 >= j4) goto _L18; else goto _L17
_L17:
        j3 = getPosition(getChildAt(j2));
        if (j3 < 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        j1 = j3;
        if (j3 < l3) goto _L16; else goto _L19
_L19:
        j2++;
          goto _L20
_L18:
        j1 = 0;
          goto _L16
_L4:
        boolean flag;
        if (q == null && (a1.c != o || d() != p))
        {
            f.a();
            a1.d = true;
        }
        View view;
        int j2;
        int j3;
        int l3;
        int j4;
        if (getChildCount() > 0 && (q == null || q.c <= 0))
        {
            if (a1.d)
            {
                for (j1 = 0; j1 < g; j1++)
                {
                    h[j1].c();
                    if (a1.b != 0x80000000)
                    {
                        h[j1].c(a1.b);
                    }
                }

            } else
            {
                int k2 = 0;
                while (k2 < g) 
                {
                    c c1 = h[k2];
                    boolean flag4 = c;
                    int i4 = a1.b;
                    int k1;
                    if (flag4)
                    {
                        k1 = c1.b(0x80000000);
                    } else
                    {
                        k1 = c1.a(0x80000000);
                    }
                    c1.c();
                    if (k1 != 0x80000000 && (!flag4 || k1 >= c1.e.a.d()) && (flag4 || k1 <= c1.e.a.c()))
                    {
                        int k3 = k1;
                        if (i4 != 0x80000000)
                        {
                            k3 = k1 + i4;
                        }
                        c1.b = k3;
                        c1.a = k3;
                    }
                    k2++;
                }
            }
        }
        detachAndScrapAttachedViews(o1);
        w = false;
        j = b.f() / g;
        r = android.view.View.MeasureSpec.makeMeasureSpec(b.f(), 0x40000000);
        if (i == 1)
        {
            s = android.view.View.MeasureSpec.makeMeasureSpec(j, 0x40000000);
            t = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        } else
        {
            t = android.view.View.MeasureSpec.makeMeasureSpec(j, 0x40000000);
            s = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        }
        a(a1.a, s1);
        if (a1.c)
        {
            a(-1);
            a(o1, k, s1);
            a(1);
            k.b = a1.a + k.c;
            a(o1, k, s1);
        } else
        {
            a(1);
            a(o1, k, s1);
            a(-1);
            k.b = a1.a + k.c;
            a(o1, k, s1);
        }
        if (getChildCount() > 0)
        {
            if (c)
            {
                a(o1, s1, true);
                b(o1, s1, false);
            } else
            {
                b(o1, s1, true);
                a(o1, s1, false);
            }
        }
        if (s1.a()) goto _L22; else goto _L21
_L21:
        if (n == 0 || getChildCount() <= 0) goto _L24; else goto _L23
_L23:
        flag = flag1;
        if (w) goto _L26; else goto _L25
_L25:
        if (a() == null) goto _L24; else goto _L27
_L27:
        flag = flag1;
_L26:
        if (flag)
        {
            removeCallbacks(y);
            postOnAnimation(y);
        }
        d = -1;
        e = 0x80000000;
_L22:
        o = a1.c;
        p = d();
        q = null;
        return;
_L24:
        flag = false;
        if (true) goto _L26; else goto _L28
_L28:
        if (true) goto _L30; else goto _L29
_L29:
    }

    public final void onRestoreInstanceState(Parcelable parcelable)
    {
        if (parcelable instanceof SavedState)
        {
            q = (SavedState)parcelable;
            requestLayout();
        }
    }

    public final Parcelable onSaveInstanceState()
    {
        if (q == null) goto _L2; else goto _L1
_L1:
        Object obj = new SavedState(q);
_L4:
        return ((Parcelable) (obj));
_L2:
        SavedState savedstate;
label0:
        {
            savedstate = new SavedState();
            savedstate.h = l;
            savedstate.i = o;
            savedstate.j = p;
            int i1;
            int j1;
            if (f != null && f.a != null)
            {
                savedstate.f = f.a;
                savedstate.e = savedstate.f.length;
                savedstate.g = f.b;
            } else
            {
                savedstate.e = 0;
            }
            if (getChildCount() <= 0)
            {
                break label0;
            }
            b();
            if (o)
            {
                i1 = e();
            } else
            {
                i1 = f();
            }
            savedstate.a = i1;
            if (c)
            {
                obj = b(true);
            } else
            {
                obj = a(true);
            }
            if (obj == null)
            {
                i1 = -1;
            } else
            {
                i1 = getPosition(((View) (obj)));
            }
            savedstate.b = i1;
            savedstate.c = g;
            savedstate.d = new int[g];
            j1 = 0;
            do
            {
                obj = savedstate;
                if (j1 >= g)
                {
                    break;
                }
                if (o)
                {
                    int k1 = h[j1].b(0x80000000);
                    i1 = k1;
                    if (k1 != 0x80000000)
                    {
                        i1 = k1 - a.d();
                    }
                } else
                {
                    int l1 = h[j1].a(0x80000000);
                    i1 = l1;
                    if (l1 != 0x80000000)
                    {
                        i1 = l1 - a.c();
                    }
                }
                savedstate.d[j1] = i1;
                j1++;
            } while (true);
        }
        if (true) goto _L4; else goto _L3
_L3:
        savedstate.a = -1;
        savedstate.b = -1;
        savedstate.c = 0;
        return savedstate;
    }

    public final void onScrollStateChanged(int i1)
    {
        if (i1 == 0 && getChildCount() != 0 && n != 0 && isAttachedToWindow()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int j1;
        if (c)
        {
            j1 = e();
            i1 = f();
        } else
        {
            j1 = f();
            i1 = e();
        }
        if (j1 != 0 || a() == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        f.a();
_L4:
        requestSimpleAnimationsInNextLayout();
        requestLayout();
        return;
        if (!w) goto _L1; else goto _L3
_L3:
        LazySpanLookup.FullSpanItem fullspanitem;
        byte byte0;
        if (c)
        {
            byte0 = -1;
        } else
        {
            byte0 = 1;
        }
        fullspanitem = f.a(j1, i1 + 1, byte0);
        if (fullspanitem == null)
        {
            w = false;
            f.a(i1 + 1);
            return;
        }
        LazySpanLookup.FullSpanItem fullspanitem1 = f.a(j1, fullspanitem.a, byte0 * -1);
        if (fullspanitem1 == null)
        {
            f.a(fullspanitem.a);
        } else
        {
            f.a(fullspanitem1.a + 1);
        }
          goto _L4
        if (true) goto _L1; else goto _L5
_L5:
    }

    public final int scrollHorizontallyBy(int i1, RecyclerView.o o1, RecyclerView.s s1)
    {
        return a(i1, o1, s1);
    }

    public final void scrollToPosition(int i1)
    {
        if (q != null && q.a != i1)
        {
            SavedState savedstate = q;
            savedstate.d = null;
            savedstate.c = 0;
            savedstate.a = -1;
            savedstate.b = -1;
        }
        d = i1;
        e = 0x80000000;
        requestLayout();
    }

    public final int scrollVerticallyBy(int i1, RecyclerView.o o1, RecyclerView.s s1)
    {
        return a(i1, o1, s1);
    }

    public final void smoothScrollToPosition(RecyclerView recyclerview, RecyclerView.s s1, int i1)
    {
        recyclerview = new i(recyclerview.getContext()) {

            final StaggeredGridLayoutManager a;

            public final PointF a(int j1)
            {
                j1 = android.support.v7.widget.StaggeredGridLayoutManager.a(a, j1);
                if (j1 == 0)
                {
                    return null;
                }
                if (android.support.v7.widget.StaggeredGridLayoutManager.a(a) == 0)
                {
                    return new PointF(j1, 0.0F);
                } else
                {
                    return new PointF(0.0F, j1);
                }
            }

            
            {
                a = StaggeredGridLayoutManager.this;
                super(context);
            }
        };
        recyclerview.b(i1);
        startSmoothScroll(recyclerview);
    }

    public final boolean supportsPredictiveItemAnimations()
    {
        return q == null;
    }
}
