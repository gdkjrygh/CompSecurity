// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.support.v4.view.accessibility.AccessibilityEventCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.support.v4.view.accessibility.AccessibilityRecordCompat;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.BitSet;

// Referenced classes of package android.support.v7.widget:
//            OrientationHelper, LayoutState, ScrollbarHelper, RecyclerView, 
//            LinearSmoothScroller

public class StaggeredGridLayoutManager extends RecyclerView.LayoutManager
{

    private boolean A;
    private final Runnable B;
    OrientationHelper a;
    OrientationHelper b;
    boolean c;
    int d;
    int e;
    LazySpanLookup f;
    private int g;
    private Span k[];
    private int l;
    private int m;
    private LayoutState n;
    private boolean o;
    private BitSet p;
    private int q;
    private boolean r;
    private boolean s;
    private SavedState t;
    private int u;
    private int v;
    private int w;
    private final Rect x;
    private final AnchorInfo y;
    private boolean z;

    private boolean C()
    {
        if (q() == 0 || q == 0 || !l())
        {
            return false;
        }
        int i1;
        int j1;
        if (c)
        {
            j1 = F();
            i1 = G();
        } else
        {
            j1 = G();
            i1 = F();
        }
        if (j1 == 0 && e() != null)
        {
            f.a();
            A();
            k();
            return true;
        }
        if (!z)
        {
            return false;
        }
        LazySpanLookup.FullSpanItem fullspanitem;
        byte byte0;
        if (c)
        {
            byte0 = -1;
        } else
        {
            byte0 = 1;
        }
        fullspanitem = f.a(j1, i1 + 1, byte0, true);
        if (fullspanitem == null)
        {
            z = false;
            f.a(i1 + 1);
            return false;
        }
        class LazySpanLookup.FullSpanItem
            implements Parcelable
        {

            public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

                public LazySpanLookup.FullSpanItem a(Parcel parcel)
                {
                    return new LazySpanLookup.FullSpanItem(parcel);
                }

                public LazySpanLookup.FullSpanItem[] a(int k1)
                {
                    return new LazySpanLookup.FullSpanItem[k1];
                }

                public Object createFromParcel(Parcel parcel)
                {
                    return a(parcel);
                }

                public Object[] newArray(int k1)
                {
                    return a(k1);
                }

            };
            int a;
            int b;
            int c[];
            boolean d;

            int a(int k1)
            {
                if (c == null)
                {
                    return 0;
                } else
                {
                    return c[k1];
                }
            }

            public int describeContents()
            {
                return 0;
            }

            public String toString()
            {
                return (new StringBuilder()).append("FullSpanItem{mPosition=").append(a).append(", mGapDir=").append(b).append(", mHasUnwantedGapAfter=").append(d).append(", mGapPerSpan=").append(Arrays.toString(c)).append('}').toString();
            }

            public void writeToParcel(Parcel parcel, int k1)
            {
                parcel.writeInt(a);
                parcel.writeInt(b);
                if (d)
                {
                    k1 = 1;
                } else
                {
                    k1 = 0;
                }
                parcel.writeInt(k1);
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

        LazySpanLookup.FullSpanItem fullspanitem1 = f.a(j1, fullspanitem.a, byte0 * -1, true);
        if (fullspanitem1 == null)
        {
            f.a(fullspanitem.a);
        } else
        {
            f.a(fullspanitem1.a + 1);
        }
        A();
        k();
        return true;
    }

    private void D()
    {
        if (a == null)
        {
            a = OrientationHelper.a(this, l);
            b = OrientationHelper.a(this, 1 - l);
            n = new LayoutState();
        }
    }

    private void E()
    {
        boolean flag = true;
        if (l == 1 || !f())
        {
            c = o;
            return;
        }
        if (o)
        {
            flag = false;
        }
        c = flag;
    }

    private int F()
    {
        int i1 = q();
        if (i1 == 0)
        {
            return 0;
        } else
        {
            return d(g(i1 - 1));
        }
    }

    private int G()
    {
        if (q() == 0)
        {
            return 0;
        } else
        {
            return d(g(0));
        }
    }

    private int a(int i1, int j1, int k1)
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

    private int a(RecyclerView.Recycler recycler, LayoutState layoutstate, RecyclerView.State state)
    {
        p.set(0, g, true);
        int i1;
        int k1;
        int l1;
        if (layoutstate.d == 1)
        {
            k1 = layoutstate.f + layoutstate.a;
        } else
        {
            k1 = layoutstate.e - layoutstate.a;
        }
        c(layoutstate.d, k1);
        if (c)
        {
            l1 = a.d();
        } else
        {
            l1 = a.c();
        }
        i1 = 0;
        do
        {
            if (layoutstate.a(state) && !p.isEmpty())
            {
                View view = layoutstate.a(recycler);
                LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
                int k2 = layoutparams.c();
                i1 = f.c(k2);
                Span span;
                int i2;
                if (i1 == -1)
                {
                    i2 = 1;
                } else
                {
                    i2 = 0;
                }
                if (i2 != 0)
                {
                    LazySpanLookup.FullSpanItem fullspanitem;
                    if (layoutparams.f)
                    {
                        span = k[0];
                    } else
                    {
                        span = a(layoutstate);
                    }
                    f.a(k2, span);
                } else
                {
                    span = k[i1];
                }
                layoutparams.e = span;
                if (layoutstate.d == 1)
                {
                    b(view);
                } else
                {
                    b(view, 0);
                }
                a(view, layoutparams);
                if (layoutstate.d == 1)
                {
                    int j1;
                    int j2;
                    if (layoutparams.f)
                    {
                        i1 = n(l1);
                    } else
                    {
                        i1 = span.b(l1);
                    }
                    j2 = i1 + a.c(view);
                    LazySpanLookup.FullSpanItem fullspanitem1;
                    if (i2 != 0 && layoutparams.f)
                    {
                        fullspanitem = c(i1);
                        fullspanitem.b = -1;
                        fullspanitem.a = k2;
                        f.a(fullspanitem);
                        j1 = i1;
                    } else
                    {
                        j1 = i1;
                    }
                } else
                {
                    if (layoutparams.f)
                    {
                        i1 = m(l1);
                    } else
                    {
                        i1 = span.a(l1);
                    }
                    j1 = i1 - a.c(view);
                    if (i2 != 0 && layoutparams.f)
                    {
                        fullspanitem1 = k(i1);
                        fullspanitem1.b = 1;
                        fullspanitem1.a = k2;
                        f.a(fullspanitem1);
                    }
                    j2 = i1;
                }
                if (layoutparams.f && layoutstate.c == -1)
                {
                    if (i2 != 0)
                    {
                        z = true;
                    } else
                    {
                        if (layoutstate.d == 1)
                        {
                            if (!i())
                            {
                                i1 = 1;
                            } else
                            {
                                i1 = 0;
                            }
                        } else
                        if (!B())
                        {
                            i1 = 1;
                        } else
                        {
                            i1 = 0;
                        }
                        if (i1 != 0)
                        {
                            fullspanitem1 = f.f(k2);
                            if (fullspanitem1 != null)
                            {
                                fullspanitem1.d = true;
                            }
                            z = true;
                        }
                    }
                }
                a(view, layoutparams, layoutstate);
                if (layoutparams.f)
                {
                    i1 = b.c();
                } else
                {
                    i1 = span.d;
                    i2 = m;
                    i1 = b.c() + i1 * i2;
                }
                i2 = i1 + b.c(view);
                if (l == 1)
                {
                    b(view, i1, j1, i2, j2);
                } else
                {
                    b(view, j1, i1, j2, i2);
                }
                if (layoutparams.f)
                {
                    c(n.d, k1);
                } else
                {
                    a(span, n.d, k1);
                }
                a(recycler, n);
                i1 = 1;
                continue;
            }
            if (i1 == 0)
            {
                a(recycler, n);
            }
            if (n.d == -1)
            {
                i1 = m(a.c());
                i1 = a.c() - i1;
            } else
            {
                i1 = n(a.d()) - a.d();
            }
            if (i1 > 0)
            {
                return Math.min(layoutstate.a, i1);
            }
            return 0;
        } while (true);
    }

    private int a(RecyclerView.State state)
    {
        boolean flag1 = false;
        if (q() == 0)
        {
            return 0;
        }
        D();
        OrientationHelper orientationhelper = a;
        View view;
        boolean flag;
        if (!A)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        view = a(flag, true);
        flag = flag1;
        if (!A)
        {
            flag = true;
        }
        return ScrollbarHelper.a(state, orientationhelper, view, b(flag, true), this, A, c);
    }

    static int a(StaggeredGridLayoutManager staggeredgridlayoutmanager)
    {
        return staggeredgridlayoutmanager.l;
    }

    static int a(StaggeredGridLayoutManager staggeredgridlayoutmanager, int i1)
    {
        return staggeredgridlayoutmanager.q(i1);
    }

    private Span a(LayoutState layoutstate)
    {
        Object obj1 = null;
        Object obj = null;
        byte byte0 = -1;
        int i1;
        int j1;
        if (p(layoutstate.d))
        {
            i1 = g - 1;
            j1 = -1;
        } else
        {
            j1 = g;
            i1 = 0;
            byte0 = 1;
        }
        if (layoutstate.d == 1)
        {
            int i3 = a.c();
            int i2 = 0x7fffffff;
            int k1 = i1;
            layoutstate = ((LayoutState) (obj));
            i1 = i2;
            do
            {
                obj = layoutstate;
                if (k1 == j1)
                {
                    break;
                }
                obj = k[k1];
                int j2 = ((Span) (obj)).b(i3);
                if (j2 < i1)
                {
                    layoutstate = ((LayoutState) (obj));
                    i1 = j2;
                }
                k1 += byte0;
            } while (true);
        } else
        {
            int j3 = a.d();
            int k2 = 0x80000000;
            int l1 = i1;
            layoutstate = obj1;
            i1 = k2;
            do
            {
                obj = layoutstate;
                if (l1 == j1)
                {
                    break;
                }
                obj = k[l1];
                int l2 = ((Span) (obj)).a(j3);
                if (l2 > i1)
                {
                    layoutstate = ((LayoutState) (obj));
                    i1 = l2;
                }
                l1 += byte0;
            } while (true);
        }
        return ((Span) (obj));
    }

    private void a(int i1)
    {
        boolean flag = true;
        n.d = i1;
        LayoutState layoutstate = n;
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
        layoutstate.c = i1;
    }

    private void a(int i1, RecyclerView.State state)
    {
        int j1;
        j1 = 0;
        n.a = 0;
        n.b = i1;
        if (!n()) goto _L2; else goto _L1
_L1:
        int k1 = state.c();
        if (k1 == -1) goto _L2; else goto _L3
_L3:
        boolean flag1 = c;
        boolean flag;
        if (k1 < i1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag1 == flag)
        {
            i1 = a.f();
        } else
        {
            j1 = a.f();
            i1 = 0;
        }
_L5:
        if (m())
        {
            n.e = a.c() - j1;
            n.f = i1 + a.d();
            return;
        } else
        {
            n.f = i1 + a.e();
            n.e = -j1;
            return;
        }
_L2:
        i1 = 0;
        if (true) goto _L5; else goto _L4
_L4:
    }

    private void a(RecyclerView.Recycler recycler, int i1)
    {
_L12:
        if (q() <= 0) goto _L2; else goto _L1
_L1:
        View view = g(0);
        if (a.b(view) > i1) goto _L2; else goto _L3
_L3:
        LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
        if (!layoutparams.f) goto _L5; else goto _L4
_L4:
        int j1 = 0;
_L9:
        if (j1 >= g) goto _L7; else goto _L6
_L6:
        if (Span.a(k[j1]).size() != 1) goto _L8; else goto _L2
_L2:
        return;
_L8:
        j1++;
          goto _L9
_L7:
        for (int k1 = 0; k1 < g; k1++)
        {
            k[k1].h();
        }

        break; /* Loop/switch isn't completed */
_L5:
        if (Span.a(layoutparams.e).size() == 1)
        {
            continue; /* Loop/switch isn't completed */
        }
        layoutparams.e.h();
        break; /* Loop/switch isn't completed */
        if (true) goto _L2; else goto _L10
_L10:
        a(view, recycler);
        if (true) goto _L12; else goto _L11
_L11:
    }

    private void a(RecyclerView.Recycler recycler, LayoutState layoutstate)
    {
        if (layoutstate.a == 0)
        {
            if (layoutstate.d == -1)
            {
                b(recycler, layoutstate.f);
                return;
            } else
            {
                a(recycler, layoutstate.e);
                return;
            }
        }
        if (layoutstate.d == -1)
        {
            int i1 = layoutstate.e - l(layoutstate.e);
            if (i1 < 0)
            {
                i1 = layoutstate.f;
            } else
            {
                i1 = layoutstate.f - Math.min(i1, layoutstate.a);
            }
            b(recycler, i1);
            return;
        }
        int j1 = o(layoutstate.f) - layoutstate.f;
        if (j1 < 0)
        {
            j1 = layoutstate.e;
        } else
        {
            int k1 = layoutstate.e;
            j1 = Math.min(j1, layoutstate.a) + k1;
        }
        a(recycler, j1);
    }

    private void a(RecyclerView.Recycler recycler, RecyclerView.State state, boolean flag)
    {
        int i1 = n(a.d());
        i1 = a.d() - i1;
        if (i1 > 0)
        {
            i1 -= -c(-i1, recycler, state);
            if (flag && i1 > 0)
            {
                a.a(i1);
            }
        }
    }

    private void a(AnchorInfo anchorinfo)
    {
        if (t.c > 0)
        {
            if (t.c == g)
            {
                int j1 = 0;
                while (j1 < g) 
                {
                    k[j1].e();
                    int k1 = t.d[j1];
                    int i1 = k1;
                    if (k1 != 0x80000000)
                    {
                        if (t.i)
                        {
                            i1 = k1 + a.d();
                        } else
                        {
                            i1 = k1 + a.c();
                        }
                    }
                    k[j1].c(i1);
                    j1++;
                }
            } else
            {
                t.a();
                t.a = t.b;
            }
        }
        s = t.j;
        a(t.h);
        E();
        if (t.a != -1)
        {
            d = t.a;
            anchorinfo.c = t.i;
        } else
        {
            anchorinfo.c = c;
        }
        if (t.e > 1)
        {
            f.a = t.f;
            f.b = t.g;
        }
    }

    private void a(Span span, int i1, int j1)
    {
        int k1 = span.i();
        if (i1 == -1)
        {
            if (k1 + span.b() <= j1)
            {
                p.set(span.d, false);
            }
        } else
        if (span.d() - k1 >= j1)
        {
            p.set(span.d, false);
            return;
        }
    }

    private void a(View view, LayoutParams layoutparams)
    {
        if (layoutparams.f)
        {
            if (l == 1)
            {
                b(view, u, b(layoutparams.height, w));
                return;
            } else
            {
                b(view, b(layoutparams.width, v), u);
                return;
            }
        }
        if (l == 1)
        {
            b(view, v, b(layoutparams.height, w));
            return;
        } else
        {
            b(view, b(layoutparams.width, v), w);
            return;
        }
    }

    private void a(View view, LayoutParams layoutparams, LayoutState layoutstate)
    {
        if (layoutstate.d == 1)
        {
            if (layoutparams.f)
            {
                o(view);
                return;
            } else
            {
                layoutparams.e.b(view);
                return;
            }
        }
        if (layoutparams.f)
        {
            p(view);
            return;
        } else
        {
            layoutparams.e.a(view);
            return;
        }
    }

    private boolean a(Span span)
    {
        return c ? span.d() < a.d() : span.b() > a.c();
    }

    private int b(int i1, int j1)
    {
        if (i1 < 0)
        {
            return j1;
        } else
        {
            return android.view.View.MeasureSpec.makeMeasureSpec(i1, 0x40000000);
        }
    }

    private void b(int i1, int j1, int k1)
    {
        int l1;
        int i2;
        int j2;
        if (c)
        {
            j2 = F();
        } else
        {
            j2 = G();
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
            i2 = i1 + j1;
            l1 = i1;
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
            i1 = G();
        } else
        {
            i1 = F();
        }
        if (l1 > i1) goto _L5; else goto _L7
_L7:
        k();
        return;
        if (true) goto _L1; else goto _L8
_L8:
    }

    private void b(RecyclerView.Recycler recycler, int i1)
    {
        int j1 = q() - 1;
_L12:
        if (j1 < 0) goto _L2; else goto _L1
_L1:
        View view = g(j1);
        if (a.a(view) < i1) goto _L2; else goto _L3
_L3:
        LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
        if (!layoutparams.f) goto _L5; else goto _L4
_L4:
        int k1 = 0;
_L9:
        if (k1 >= g) goto _L7; else goto _L6
_L6:
        if (Span.a(k[k1]).size() != 1) goto _L8; else goto _L2
_L2:
        return;
_L8:
        k1++;
          goto _L9
_L7:
        for (int l1 = 0; l1 < g; l1++)
        {
            k[l1].g();
        }

        break; /* Loop/switch isn't completed */
_L5:
        if (Span.a(layoutparams.e).size() == 1)
        {
            continue; /* Loop/switch isn't completed */
        }
        layoutparams.e.g();
        break; /* Loop/switch isn't completed */
        if (true) goto _L2; else goto _L10
_L10:
        a(view, recycler);
        j1--;
        if (true) goto _L12; else goto _L11
_L11:
    }

    private void b(RecyclerView.Recycler recycler, RecyclerView.State state, boolean flag)
    {
        int i1 = m(a.c()) - a.c();
        if (i1 > 0)
        {
            i1 -= c(i1, recycler, state);
            if (flag && i1 > 0)
            {
                a.a(-i1);
            }
        }
    }

    private void b(View view, int i1, int j1)
    {
        a(view, x);
        LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
        view.measure(a(i1, layoutparams.leftMargin + x.left, layoutparams.rightMargin + x.right), a(j1, layoutparams.topMargin + x.top, layoutparams.bottomMargin + x.bottom));
    }

    private void b(View view, int i1, int j1, int k1, int l1)
    {
        LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
        a(view, i1 + layoutparams.leftMargin, j1 + layoutparams.topMargin, k1 - layoutparams.rightMargin, l1 - layoutparams.bottomMargin);
    }

    private LazySpanLookup.FullSpanItem c(int i1)
    {
        LazySpanLookup.FullSpanItem fullspanitem = new LazySpanLookup.FullSpanItem();
        fullspanitem.c = new int[g];
        for (int j1 = 0; j1 < g; j1++)
        {
            fullspanitem.c[j1] = i1 - k[j1].b(i1);
        }

        return fullspanitem;
    }

    private void c(int i1, int j1)
    {
        int k1 = 0;
        while (k1 < g) 
        {
            if (!Span.a(k[k1]).isEmpty())
            {
                a(k[k1], i1, j1);
            }
            k1++;
        }
    }

    private boolean c(RecyclerView.State state, AnchorInfo anchorinfo)
    {
        int i1;
        if (r)
        {
            i1 = s(state.e());
        } else
        {
            i1 = r(state.e());
        }
        anchorinfo.a = i1;
        anchorinfo.b = 0x80000000;
        return true;
    }

    private int h(RecyclerView.State state)
    {
        boolean flag1 = false;
        if (q() == 0)
        {
            return 0;
        }
        D();
        OrientationHelper orientationhelper = a;
        View view;
        boolean flag;
        if (!A)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        view = a(flag, true);
        flag = flag1;
        if (!A)
        {
            flag = true;
        }
        return ScrollbarHelper.a(state, orientationhelper, view, b(flag, true), this, A);
    }

    private int i(RecyclerView.State state)
    {
        boolean flag1 = false;
        if (q() == 0)
        {
            return 0;
        }
        D();
        OrientationHelper orientationhelper = a;
        View view;
        boolean flag;
        if (!A)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        view = a(flag, true);
        flag = flag1;
        if (!A)
        {
            flag = true;
        }
        return ScrollbarHelper.b(state, orientationhelper, view, b(flag, true), this, A);
    }

    private LazySpanLookup.FullSpanItem k(int i1)
    {
        LazySpanLookup.FullSpanItem fullspanitem = new LazySpanLookup.FullSpanItem();
        fullspanitem.c = new int[g];
        for (int j1 = 0; j1 < g; j1++)
        {
            fullspanitem.c[j1] = k[j1].a(i1) - i1;
        }

        return fullspanitem;
    }

    private int l(int i1)
    {
        int k1 = k[0].a(i1);
        for (int j1 = 1; j1 < g;)
        {
            int i2 = k[j1].a(i1);
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

    private int m(int i1)
    {
        int k1 = k[0].a(i1);
        for (int j1 = 1; j1 < g;)
        {
            int i2 = k[j1].a(i1);
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

    private int n(int i1)
    {
        int k1 = k[0].b(i1);
        for (int j1 = 1; j1 < g;)
        {
            int i2 = k[j1].b(i1);
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

    private int o(int i1)
    {
        int k1 = k[0].b(i1);
        for (int j1 = 1; j1 < g;)
        {
            int i2 = k[j1].b(i1);
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

    private void o(View view)
    {
        for (int i1 = g - 1; i1 >= 0; i1--)
        {
            k[i1].b(view);
        }

    }

    private void p(View view)
    {
        for (int i1 = g - 1; i1 >= 0; i1--)
        {
            k[i1].a(view);
        }

    }

    private boolean p(int i1)
    {
        if (l != 0) goto _L2; else goto _L1
_L1:
        boolean flag;
        if (i1 == -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag == c) goto _L4; else goto _L3
_L3:
        return true;
_L4:
        return false;
_L2:
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
        if (flag1 != f())
        {
            return false;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    private int q(int i1)
    {
        byte byte0 = -1;
        if (q() == 0)
        {
            return !c ? -1 : 1;
        }
        boolean flag;
        if (i1 < G())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag != c)
        {
            i1 = byte0;
        } else
        {
            i1 = 1;
        }
        return i1;
    }

    private int r(int i1)
    {
        int k1 = q();
        for (int j1 = 0; j1 < k1; j1++)
        {
            int l1 = d(g(j1));
            if (l1 >= 0 && l1 < i1)
            {
                return l1;
            }
        }

        return 0;
    }

    private int s(int i1)
    {
        for (int j1 = q() - 1; j1 >= 0; j1--)
        {
            int k1 = d(g(j1));
            if (k1 >= 0 && k1 < i1)
            {
                return k1;
            }
        }

        return 0;
    }

    boolean B()
    {
        boolean flag1 = true;
        int j1 = k[0].a(0x80000000);
        int i1 = 1;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (i1 < g)
                {
                    if (k[i1].a(0x80000000) == j1)
                    {
                        break label0;
                    }
                    flag = false;
                }
                return flag;
            }
            i1++;
        } while (true);
    }

    public int a(int i1, RecyclerView.Recycler recycler, RecyclerView.State state)
    {
        return c(i1, recycler, state);
    }

    public RecyclerView.LayoutParams a()
    {
        return new LayoutParams(-2, -2);
    }

    public RecyclerView.LayoutParams a(Context context, AttributeSet attributeset)
    {
        return new LayoutParams(context, attributeset);
    }

    public RecyclerView.LayoutParams a(android.view.ViewGroup.LayoutParams layoutparams)
    {
        if (layoutparams instanceof android.view.ViewGroup.MarginLayoutParams)
        {
            return new LayoutParams((android.view.ViewGroup.MarginLayoutParams)layoutparams);
        } else
        {
            return new LayoutParams(layoutparams);
        }
    }

    View a(boolean flag, boolean flag1)
    {
        D();
        int j1 = a.c();
        int k1 = a.d();
        int l1 = q();
        int i1 = 0;
        View view = null;
        while (i1 < l1) 
        {
            View view2 = g(i1);
            int i2 = a.a(view2);
            View view1 = view;
            if (a.b(view2) > j1)
            {
                if (i2 >= k1)
                {
                    view1 = view;
                } else
                {
                    if (i2 >= j1 || !flag)
                    {
                        return view2;
                    }
                    view1 = view;
                    if (flag1)
                    {
                        view1 = view;
                        if (view == null)
                        {
                            view1 = view2;
                        }
                    }
                }
            }
            i1++;
            view = view1;
        }
        return view;
    }

    public void a(Parcelable parcelable)
    {
        if (parcelable instanceof SavedState)
        {
            t = (SavedState)parcelable;
            k();
        }
    }

    public void a(RecyclerView.Recycler recycler, RecyclerView.State state)
    {
label0:
        {
label1:
            {
                boolean flag1 = false;
                D();
                AnchorInfo anchorinfo = y;
                anchorinfo.a();
                if ((t != null || d != -1) && state.e() == 0)
                {
                    c(recycler);
                    return;
                }
                if (t != null)
                {
                    a(anchorinfo);
                } else
                {
                    E();
                    anchorinfo.c = c;
                }
                a(state, anchorinfo);
                if (t == null && (anchorinfo.c != r || f() != s))
                {
                    f.a();
                    anchorinfo.d = true;
                }
                if (q() > 0 && (t == null || t.c < 1))
                {
                    if (anchorinfo.d)
                    {
                        for (int i1 = 0; i1 < g; i1++)
                        {
                            k[i1].e();
                            if (anchorinfo.b != 0x80000000)
                            {
                                k[i1].c(anchorinfo.b);
                            }
                        }

                    } else
                    {
                        for (int j1 = 0; j1 < g; j1++)
                        {
                            k[j1].a(c, anchorinfo.b);
                        }

                    }
                }
                a(recycler);
                z = false;
                g();
                a(anchorinfo.a, state);
                boolean flag;
                if (anchorinfo.c)
                {
                    a(-1);
                    a(recycler, n, state);
                    a(1);
                    n.b = anchorinfo.a + n.c;
                    a(recycler, n, state);
                } else
                {
                    a(1);
                    a(recycler, n, state);
                    a(-1);
                    n.b = anchorinfo.a + n.c;
                    a(recycler, n, state);
                }
                if (q() > 0)
                {
                    if (c)
                    {
                        a(recycler, state, true);
                        b(recycler, state, false);
                    } else
                    {
                        b(recycler, state, true);
                        a(recycler, state, false);
                    }
                }
                if (state.a())
                {
                    break label0;
                }
                flag = flag1;
                if (q == 0)
                {
                    break label1;
                }
                flag = flag1;
                if (q() <= 0)
                {
                    break label1;
                }
                if (!z)
                {
                    flag = flag1;
                    if (e() == null)
                    {
                        break label1;
                    }
                }
                flag = true;
            }
            if (flag)
            {
                b(B);
                a(B);
            }
            d = -1;
            e = 0x80000000;
        }
        r = anchorinfo.c;
        s = f();
        t = null;
    }

    public void a(RecyclerView.Recycler recycler, RecyclerView.State state, View view, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
    {
        recycler = view.getLayoutParams();
        if (!(recycler instanceof LayoutParams))
        {
            super.a(view, accessibilitynodeinfocompat);
            return;
        }
        recycler = (LayoutParams)recycler;
        if (l == 0)
        {
            int k1 = recycler.d();
            int i1;
            if (((LayoutParams) (recycler)).f)
            {
                i1 = g;
            } else
            {
                i1 = 1;
            }
            accessibilitynodeinfocompat.c(android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.CollectionItemInfoCompat.a(k1, i1, -1, -1, ((LayoutParams) (recycler)).f, false));
            return;
        }
        int l1 = recycler.d();
        int j1;
        if (((LayoutParams) (recycler)).f)
        {
            j1 = g;
        } else
        {
            j1 = 1;
        }
        accessibilitynodeinfocompat.c(android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.CollectionItemInfoCompat.a(-1, -1, l1, j1, ((LayoutParams) (recycler)).f, false));
    }

    void a(RecyclerView.State state, AnchorInfo anchorinfo)
    {
        while (b(state, anchorinfo) || c(state, anchorinfo)) 
        {
            return;
        }
        anchorinfo.b();
        anchorinfo.a = 0;
    }

    public void a(RecyclerView recyclerview, int i1, int j1)
    {
        b(i1, j1, 0);
    }

    public void a(RecyclerView recyclerview, int i1, int j1, int k1)
    {
        b(i1, j1, 3);
    }

    public void a(RecyclerView recyclerview, int i1, int j1, Object obj)
    {
        b(i1, j1, 2);
    }

    public void a(RecyclerView recyclerview, RecyclerView.Recycler recycler)
    {
        b(B);
        for (int i1 = 0; i1 < g; i1++)
        {
            k[i1].e();
        }

    }

    public void a(RecyclerView recyclerview, RecyclerView.State state, int i1)
    {
        recyclerview = new LinearSmoothScroller(recyclerview.getContext()) {

            final StaggeredGridLayoutManager a;

            public PointF a(int j1)
            {
                j1 = StaggeredGridLayoutManager.a(a, j1);
                if (j1 == 0)
                {
                    return null;
                }
                if (StaggeredGridLayoutManager.a(a) == 0)
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
        recyclerview.d(i1);
        a(((RecyclerView.SmoothScroller) (recyclerview)));
    }

    public void a(AccessibilityEvent accessibilityevent)
    {
        View view;
        View view1;
label0:
        {
            super.a(accessibilityevent);
            if (q() > 0)
            {
                accessibilityevent = AccessibilityEventCompat.a(accessibilityevent);
                view = a(false, true);
                view1 = b(false, true);
                if (view != null && view1 != null)
                {
                    break label0;
                }
            }
            return;
        }
        int i1 = d(view);
        int j1 = d(view1);
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

    public void a(String s1)
    {
        if (t == null)
        {
            super.a(s1);
        }
    }

    public void a(boolean flag)
    {
        a(((String) (null)));
        if (t != null && t.h != flag)
        {
            t.h = flag;
        }
        o = flag;
        k();
    }

    public boolean a(RecyclerView.LayoutParams layoutparams)
    {
        return layoutparams instanceof LayoutParams;
    }

    public int b(int i1, RecyclerView.Recycler recycler, RecyclerView.State state)
    {
        return c(i1, recycler, state);
    }

    public int b(RecyclerView.State state)
    {
        return a(state);
    }

    public Parcelable b()
    {
        if (t != null)
        {
            return new SavedState(t);
        }
        SavedState savedstate = new SavedState();
        savedstate.h = o;
        savedstate.i = r;
        savedstate.j = s;
        if (f != null && f.a != null)
        {
            savedstate.f = f.a;
            savedstate.e = savedstate.f.length;
            savedstate.g = f.b;
        } else
        {
            savedstate.e = 0;
        }
        if (q() > 0)
        {
            D();
            int i1;
            int j1;
            if (r)
            {
                i1 = F();
            } else
            {
                i1 = G();
            }
            savedstate.a = i1;
            savedstate.b = h();
            savedstate.c = g;
            savedstate.d = new int[g];
            j1 = 0;
            while (j1 < g) 
            {
                if (r)
                {
                    int k1 = k[j1].b(0x80000000);
                    i1 = k1;
                    if (k1 != 0x80000000)
                    {
                        i1 = k1 - a.d();
                    }
                } else
                {
                    int l1 = k[j1].a(0x80000000);
                    i1 = l1;
                    if (l1 != 0x80000000)
                    {
                        i1 = l1 - a.c();
                    }
                }
                savedstate.d[j1] = i1;
                j1++;
            }
        } else
        {
            savedstate.a = -1;
            savedstate.b = -1;
            savedstate.c = 0;
        }
        return savedstate;
    }

    View b(boolean flag, boolean flag1)
    {
        D();
        int j1 = a.c();
        int k1 = a.d();
        int i1 = q() - 1;
        View view = null;
        while (i1 >= 0) 
        {
            View view2 = g(i1);
            int l1 = a.a(view2);
            int i2 = a.b(view2);
            View view1 = view;
            if (i2 > j1)
            {
                if (l1 >= k1)
                {
                    view1 = view;
                } else
                {
                    if (i2 <= k1 || !flag)
                    {
                        return view2;
                    }
                    view1 = view;
                    if (flag1)
                    {
                        view1 = view;
                        if (view == null)
                        {
                            view1 = view2;
                        }
                    }
                }
            }
            i1--;
            view = view1;
        }
        return view;
    }

    public void b(RecyclerView recyclerview, int i1, int j1)
    {
        b(i1, j1, 1);
    }

    boolean b(RecyclerView.State state, AnchorInfo anchorinfo)
    {
        boolean flag = false;
        if (state.a() || d == -1)
        {
            return false;
        }
        if (d < 0 || d >= state.e())
        {
            d = -1;
            e = 0x80000000;
            return false;
        }
        if (t == null || t.a == -1 || t.c < 1)
        {
            state = b(d);
            if (state != null)
            {
                int i1;
                if (c)
                {
                    i1 = F();
                } else
                {
                    i1 = G();
                }
                anchorinfo.a = i1;
                if (e != 0x80000000)
                {
                    if (anchorinfo.c)
                    {
                        anchorinfo.b = a.d() - e - a.b(state);
                        return true;
                    } else
                    {
                        anchorinfo.b = (a.c() + e) - a.a(state);
                        return true;
                    }
                }
                if (a.c(state) > a.f())
                {
                    if (anchorinfo.c)
                    {
                        i1 = a.d();
                    } else
                    {
                        i1 = a.c();
                    }
                    anchorinfo.b = i1;
                    return true;
                }
                i1 = a.a(state) - a.c();
                if (i1 < 0)
                {
                    anchorinfo.b = -i1;
                    return true;
                }
                i1 = a.d() - a.b(state);
                if (i1 < 0)
                {
                    anchorinfo.b = i1;
                    return true;
                } else
                {
                    anchorinfo.b = 0x80000000;
                    return true;
                }
            }
            anchorinfo.a = d;
            if (e == 0x80000000)
            {
                if (q(anchorinfo.a) == 1)
                {
                    flag = true;
                }
                anchorinfo.c = flag;
                anchorinfo.b();
            } else
            {
                anchorinfo.a(e);
            }
            anchorinfo.d = true;
            return true;
        } else
        {
            anchorinfo.b = 0x80000000;
            anchorinfo.a = d;
            return true;
        }
    }

    int c(int i1, RecyclerView.Recycler recycler, RecyclerView.State state)
    {
        D();
        int j1;
        int k1;
        if (i1 > 0)
        {
            j1 = 1;
            k1 = F();
        } else
        {
            j1 = -1;
            k1 = G();
        }
        a(k1, state);
        a(j1);
        n.b = k1 + n.c;
        k1 = Math.abs(i1);
        n.a = k1;
        j1 = a(recycler, n, state);
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
        r = c;
        return i1;
    }

    public int c(RecyclerView.Recycler recycler, RecyclerView.State state)
    {
        if (l == 0)
        {
            return g;
        } else
        {
            return super.c(recycler, state);
        }
    }

    public int c(RecyclerView.State state)
    {
        return a(state);
    }

    public boolean c()
    {
        return l == 0;
    }

    public int d(RecyclerView.Recycler recycler, RecyclerView.State state)
    {
        if (l == 1)
        {
            return g;
        } else
        {
            return super.d(recycler, state);
        }
    }

    public int d(RecyclerView.State state)
    {
        return h(state);
    }

    public void d(int i1)
    {
        if (t != null && t.a != i1)
        {
            t.b();
        }
        d = i1;
        e = 0x80000000;
        k();
    }

    public boolean d()
    {
        return l == 1;
    }

    public int e(RecyclerView.State state)
    {
        return h(state);
    }

    View e()
    {
        BitSet bitset;
        View view;
        LayoutParams layoutparams;
        byte byte0;
        int k1;
        byte byte1;
        int l1;
        int i1 = q() - 1;
        bitset = new BitSet(g);
        bitset.set(0, g, true);
        if (l == 1 && f())
        {
            byte0 = 1;
        } else
        {
            byte0 = -1;
        }
        if (c)
        {
            k1 = -1;
        } else
        {
            k1 = i1 + 1;
            i1 = 0;
        }
        if (i1 < k1)
        {
            byte1 = 1;
        } else
        {
            byte1 = -1;
        }
        l1 = i1;
_L3:
        if (l1 == k1)
        {
            break; /* Loop/switch isn't completed */
        }
        view = g(l1);
        layoutparams = (LayoutParams)view.getLayoutParams();
        if (bitset.get(layoutparams.e.d))
        {
            if (a(layoutparams.e))
            {
                return view;
            }
            bitset.clear(layoutparams.e.d);
        }
          goto _L1
_L5:
        l1 += byte1;
        if (true) goto _L3; else goto _L2
_L1:
        if (layoutparams.f || l1 + byte1 == k1) goto _L5; else goto _L4
_L4:
        int j1;
        Object obj = g(l1 + byte1);
        if (c)
        {
            j1 = a.b(view);
            int i2 = a.b(((View) (obj)));
            if (j1 < i2)
            {
                return view;
            }
            if (j1 != i2)
            {
                break MISSING_BLOCK_LABEL_352;
            }
            j1 = 1;
        } else
        {
            j1 = a.a(view);
            j2 = a.a(((View) (obj)));
            if (j1 > j2)
            {
                return view;
            }
            if (j1 != j2)
            {
                break MISSING_BLOCK_LABEL_352;
            }
            j1 = 1;
        }
_L6:
        if (j1 != 0)
        {
            obj = (LayoutParams)((View) (obj)).getLayoutParams();
            int j2;
            if (layoutparams.e.d - ((LayoutParams) (obj)).e.d < 0)
            {
                j1 = 1;
            } else
            {
                j1 = 0;
            }
            if (byte0 < 0)
            {
                j2 = 1;
            } else
            {
                j2 = 0;
            }
            if (j1 != j2)
            {
                return view;
            }
        }
          goto _L5
_L2:
        return null;
        j1 = 0;
          goto _L6
    }

    public void e(RecyclerView recyclerview)
    {
        f.a();
        k();
    }

    public int f(RecyclerView.State state)
    {
        return i(state);
    }

    boolean f()
    {
        return o() == 1;
    }

    public int g(RecyclerView.State state)
    {
        return i(state);
    }

    void g()
    {
        m = b.f() / g;
        u = android.view.View.MeasureSpec.makeMeasureSpec(b.f(), 0x40000000);
        if (l == 1)
        {
            v = android.view.View.MeasureSpec.makeMeasureSpec(m, 0x40000000);
            w = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
            return;
        } else
        {
            w = android.view.View.MeasureSpec.makeMeasureSpec(m, 0x40000000);
            v = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
            return;
        }
    }

    int h()
    {
        View view;
        if (c)
        {
            view = b(true, true);
        } else
        {
            view = a(true, true);
        }
        if (view == null)
        {
            return -1;
        } else
        {
            return d(view);
        }
    }

    public void h(int i1)
    {
        super.h(i1);
        for (int j1 = 0; j1 < g; j1++)
        {
            k[j1].d(i1);
        }

    }

    public void i(int i1)
    {
        super.i(i1);
        for (int j1 = 0; j1 < g; j1++)
        {
            k[j1].d(i1);
        }

    }

    boolean i()
    {
        boolean flag1 = true;
        int j1 = k[0].b(0x80000000);
        int i1 = 1;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (i1 < g)
                {
                    if (k[i1].b(0x80000000) == j1)
                    {
                        break label0;
                    }
                    flag = false;
                }
                return flag;
            }
            i1++;
        } while (true);
    }

    public void j(int i1)
    {
        if (i1 == 0)
        {
            C();
        }
    }

    public boolean j()
    {
        return t == null;
    }

    private class LazySpanLookup
    {

        int a[];
        List b;

        private void c(int i1, int j1)
        {
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
        }

        private void d(int i1, int j1)
        {
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
        }

        private int g(int i1)
        {
            int j1;
            int k1;
            if (b == null)
            {
                return -1;
            }
            FullSpanItem fullspanitem = f(i1);
            if (fullspanitem != null)
            {
                b.remove(fullspanitem);
            }
            k1 = b.size();
            j1 = 0;
_L3:
            if (j1 >= k1)
            {
                break MISSING_BLOCK_LABEL_113;
            }
            if (((FullSpanItem)b.get(j1)).a < i1) goto _L2; else goto _L1
_L1:
            if (j1 != -1)
            {
                FullSpanItem fullspanitem1 = (FullSpanItem)b.get(j1);
                b.remove(j1);
                return fullspanitem1.a;
            } else
            {
                return -1;
            }
_L2:
            j1++;
              goto _L3
            j1 = -1;
              goto _L1
        }

        int a(int i1)
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

        public FullSpanItem a(int i1, int j1, int k1, boolean flag)
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
            if (!flag)
            {
                continue; /* Loop/switch isn't completed */
            }
            fullspanitem = fullspanitem1;
            if (fullspanitem1.d) goto _L6; else goto _L8
_L8:
            l1++;
              goto _L9
_L4:
            return null;
        }

        void a()
        {
            if (a != null)
            {
                Arrays.fill(a, -1);
            }
            b = null;
        }

        void a(int i1, int j1)
        {
            if (a == null || i1 >= a.length)
            {
                return;
            } else
            {
                e(i1 + j1);
                System.arraycopy(a, i1 + j1, a, i1, a.length - i1 - j1);
                Arrays.fill(a, a.length - j1, a.length, -1);
                c(i1, j1);
                return;
            }
        }

        void a(int i1, Span span)
        {
            e(i1);
            a[i1] = span.d;
        }

        public void a(FullSpanItem fullspanitem)
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

        int b(int i1)
        {
            while (a == null || i1 >= a.length) 
            {
                return -1;
            }
            int j1 = g(i1);
            if (j1 == -1)
            {
                Arrays.fill(a, i1, a.length, -1);
                return a.length;
            } else
            {
                Arrays.fill(a, i1, j1 + 1, -1);
                return j1 + 1;
            }
        }

        void b(int i1, int j1)
        {
            if (a == null || i1 >= a.length)
            {
                return;
            } else
            {
                e(i1 + j1);
                System.arraycopy(a, i1, a, i1 + j1, a.length - i1 - j1);
                Arrays.fill(a, i1, i1 + j1, -1);
                d(i1, j1);
                return;
            }
        }

        int c(int i1)
        {
            if (a == null || i1 >= a.length)
            {
                return -1;
            } else
            {
                return a[i1];
            }
        }

        int d(int i1)
        {
            int j1;
            for (j1 = a.length; j1 <= i1; j1 *= 2) { }
            return j1;
        }

        void e(int i1)
        {
            if (a == null)
            {
                a = new int[Math.max(i1, 10) + 1];
                Arrays.fill(a, -1);
            } else
            if (i1 >= a.length)
            {
                int ai[] = a;
                a = new int[d(i1)];
                System.arraycopy(ai, 0, a, 0, ai.length);
                Arrays.fill(a, ai.length, a.length, -1);
                return;
            }
        }

        public FullSpanItem f(int i1)
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


    private class LayoutParams extends RecyclerView.LayoutParams
    {

        Span e;
        boolean f;

        public final int d()
        {
            if (e == null)
            {
                return -1;
            } else
            {
                return e.d;
            }
        }

        public LayoutParams(int i1, int j1)
        {
            super(i1, j1);
        }

        public LayoutParams(Context context, AttributeSet attributeset)
        {
            super(context, attributeset);
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
        {
            super(layoutparams);
        }

        public LayoutParams(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
        {
            super(marginlayoutparams);
        }
    }


    private class Span
    {

        int a;
        int b;
        int c;
        final int d;
        final StaggeredGridLayoutManager e;
        private ArrayList f;

        static ArrayList a(Span span)
        {
            return span.f;
        }

        int a(int i1)
        {
            if (a != 0x80000000)
            {
                i1 = a;
            } else
            if (f.size() != 0)
            {
                a();
                return a;
            }
            return i1;
        }

        void a()
        {
            View view = (View)f.get(0);
            LayoutParams layoutparams = c(view);
            a = e.a.a(view);
            if (layoutparams.f)
            {
                LazySpanLookup.FullSpanItem fullspanitem = e.f.f(layoutparams.c());
                if (fullspanitem != null && fullspanitem.b == -1)
                {
                    a = a - fullspanitem.a(d);
                }
            }
        }

        void a(View view)
        {
            LayoutParams layoutparams = c(view);
            layoutparams.e = this;
            f.add(0, view);
            a = 0x80000000;
            if (f.size() == 1)
            {
                b = 0x80000000;
            }
            if (layoutparams.a() || layoutparams.b())
            {
                c = c + e.a.c(view);
            }
        }

        void a(boolean flag, int i1)
        {
            int j1;
            if (flag)
            {
                j1 = b(0x80000000);
            } else
            {
                j1 = a(0x80000000);
            }
            e();
            while (j1 == 0x80000000 || flag && j1 < e.a.d() || !flag && j1 > e.a.c()) 
            {
                return;
            }
            int k1 = j1;
            if (i1 != 0x80000000)
            {
                k1 = j1 + i1;
            }
            b = k1;
            a = k1;
        }

        int b()
        {
            if (a != 0x80000000)
            {
                return a;
            } else
            {
                a();
                return a;
            }
        }

        int b(int i1)
        {
            if (b != 0x80000000)
            {
                i1 = b;
            } else
            if (f.size() != 0)
            {
                c();
                return b;
            }
            return i1;
        }

        void b(View view)
        {
            LayoutParams layoutparams = c(view);
            layoutparams.e = this;
            f.add(view);
            b = 0x80000000;
            if (f.size() == 1)
            {
                a = 0x80000000;
            }
            if (layoutparams.a() || layoutparams.b())
            {
                c = c + e.a.c(view);
            }
        }

        LayoutParams c(View view)
        {
            return (LayoutParams)view.getLayoutParams();
        }

        void c()
        {
            View view = (View)f.get(f.size() - 1);
            LayoutParams layoutparams = c(view);
            b = e.a.b(view);
            if (layoutparams.f)
            {
                LazySpanLookup.FullSpanItem fullspanitem = e.f.f(layoutparams.c());
                if (fullspanitem != null && fullspanitem.b == 1)
                {
                    int i1 = b;
                    b = fullspanitem.a(d) + i1;
                }
            }
        }

        void c(int i1)
        {
            a = i1;
            b = i1;
        }

        int d()
        {
            if (b != 0x80000000)
            {
                return b;
            } else
            {
                c();
                return b;
            }
        }

        void d(int i1)
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

        void e()
        {
            f.clear();
            f();
            c = 0;
        }

        void f()
        {
            a = 0x80000000;
            b = 0x80000000;
        }

        void g()
        {
            int i1 = f.size();
            View view = (View)f.remove(i1 - 1);
            LayoutParams layoutparams = c(view);
            layoutparams.e = null;
            if (layoutparams.a() || layoutparams.b())
            {
                c = c - e.a.c(view);
            }
            if (i1 == 1)
            {
                a = 0x80000000;
            }
            b = 0x80000000;
        }

        void h()
        {
            View view = (View)f.remove(0);
            LayoutParams layoutparams = c(view);
            layoutparams.e = null;
            if (f.size() == 0)
            {
                b = 0x80000000;
            }
            if (layoutparams.a() || layoutparams.b())
            {
                c = c - e.a.c(view);
            }
            a = 0x80000000;
        }

        public int i()
        {
            return c;
        }
    }


    private class SavedState
        implements Parcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public SavedState a(Parcel parcel)
            {
                return new SavedState(parcel);
            }

            public SavedState[] a(int i1)
            {
                return new SavedState[i1];
            }

            public Object createFromParcel(Parcel parcel)
            {
                return a(parcel);
            }

            public Object[] newArray(int i1)
            {
                return a(i1);
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

        void a()
        {
            d = null;
            c = 0;
            e = 0;
            f = null;
            g = null;
        }

        void b()
        {
            d = null;
            c = 0;
            a = -1;
            b = -1;
        }

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


    private class AnchorInfo
    {

        int a;
        int b;
        boolean c;
        boolean d;
        final StaggeredGridLayoutManager e;

        void a()
        {
            a = -1;
            b = 0x80000000;
            c = false;
            d = false;
        }

        void a(int i1)
        {
            if (c)
            {
                b = e.a.d() - i1;
                return;
            } else
            {
                b = e.a.c() + i1;
                return;
            }
        }

        void b()
        {
            int i1;
            if (c)
            {
                i1 = e.a.d();
            } else
            {
                i1 = e.a.c();
            }
            b = i1;
        }
    }

}
