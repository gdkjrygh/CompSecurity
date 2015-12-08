// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.support.v4.view.a.a;
import android.support.v4.view.a.ad;
import android.support.v4.view.a.f;
import android.support.v4.view.a.p;
import android.support.v4.view.bp;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.BitSet;

// Referenced classes of package android.support.v7.widget:
//            bj, ac, au, bs, 
//            bm, bv, cd, RecyclerView, 
//            by, ca

public final class StaggeredGridLayoutManager extends bj
{

    private boolean A;
    private final Runnable B;
    au a;
    au b;
    boolean c;
    int d;
    int e;
    LazySpanLookup f;
    private int g;
    private cd k[];
    private int l;
    private int m;
    private ac n;
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
    private final ca y;
    private boolean z;

    private static int a(int j, int i1, int j1)
    {
        int k1;
        if (i1 != 0 || j1 != 0)
        {
            if ((k1 = android.view.View.MeasureSpec.getMode(j)) == 0x80000000 || k1 == 0x40000000)
            {
                return android.view.View.MeasureSpec.makeMeasureSpec(android.view.View.MeasureSpec.getSize(j) - i1 - j1, k1);
            }
        }
        return j;
    }

    private int a(bm bm1, ac ac1, bs bs1)
    {
        Object obj;
        Object obj1;
        View view;
        LayoutParams layoutparams;
        int j;
        int i1;
        int l1;
        int i2;
        int j2;
        int k2;
        int k3;
        p.set(0, g, true);
        int j1;
        if (ac1.d == 1)
        {
            l1 = a.d() + n.a;
            i2 = n.e + l1 + a.g();
        } else
        {
            l1 = a.c() - n.a;
            i2 = l1 - n.e - a.c();
        }
        f(ac1.d, i2);
        if (c)
        {
            j2 = a.d();
        } else
        {
            j2 = a.c();
        }
_L33:
        if (ac1.b >= 0 && ac1.b < bs1.e())
        {
            j = 1;
        } else
        {
            j = 0;
        }
        if (j == 0 || p.isEmpty()) goto _L2; else goto _L1
_L1:
        view = bm1.a(ac1.b);
        ac1.b = ac1.b + ac1.c;
        layoutparams = (LayoutParams)view.getLayoutParams();
        k3 = ((RecyclerView.LayoutParams) (layoutparams)).a.getLayoutPosition();
        obj = f;
        if (((LazySpanLookup) (obj)).a == null || k3 >= ((LazySpanLookup) (obj)).a.length)
        {
            j = -1;
        } else
        {
            j = ((LazySpanLookup) (obj)).a[k3];
        }
        if (j == -1)
        {
            k2 = 1;
        } else
        {
            k2 = 0;
        }
        if (k2 == 0) goto _L4; else goto _L3
_L3:
        if (!layoutparams.f) goto _L6; else goto _L5
_L5:
        obj = k[0];
_L9:
        obj1 = f;
        ((LazySpanLookup) (obj1)).c(k3);
        ((LazySpanLookup) (obj1)).a[k3] = ((cd) (obj)).d;
_L12:
        layoutparams.e = ((cd) (obj));
        class LazySpanLookup.FullSpanItem
            implements Parcelable
        {

            public static final android.os.Parcelable.Creator CREATOR = new cb();
            int a;
            int b;
            int c[];
            boolean d;

            final int a(int i4)
            {
                if (c == null)
                {
                    return 0;
                } else
                {
                    return c[i4];
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

            public void writeToParcel(Parcel parcel, int i4)
            {
                parcel.writeInt(a);
                parcel.writeInt(b);
                if (d)
                {
                    i4 = 1;
                } else
                {
                    i4 = 0;
                }
                parcel.writeInt(i4);
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
                int j;
                if (parcel.readInt() != 1)
                {
                    flag = false;
                }
                d = flag;
                j = parcel.readInt();
                if (j > 0)
                {
                    c = new int[j];
                    parcel.readIntArray(c);
                }
            }
        }

        if (ac1.d == 1)
        {
            a(view);
        } else
        {
            b(view);
        }
        if (layoutparams.f)
        {
            if (l == 1)
            {
                a(view, u, e(layoutparams.height, w));
            } else
            {
                a(view, e(layoutparams.width, v), u);
            }
        } else
        if (l == 1)
        {
            a(view, v, e(layoutparams.height, w));
        } else
        {
            a(view, e(layoutparams.width, v), w);
        }
        if (ac1.d == 1)
        {
            byte byte0;
            int l2;
            int j3;
            int l3;
            boolean flag;
            if (layoutparams.f)
            {
                j = g(j2);
            } else
            {
                j = ((cd) (obj)).b(j2);
            }
            i1 = j + a.c(view);
            if (k2 == 0 || !layoutparams.f)
            {
                break MISSING_BLOCK_LABEL_2026;
            }
            obj1 = new LazySpanLookup.FullSpanItem();
            obj1.c = new int[g];
            for (j1 = 0; j1 < g; j1++)
            {
                ((LazySpanLookup.FullSpanItem) (obj1)).c[j1] = j - k[j1].b(j);
            }

            obj1.b = -1;
            obj1.a = k3;
            f.a(((LazySpanLookup.FullSpanItem) (obj1)));
            k1 = j;
        } else
        {
            if (layoutparams.f)
            {
                i1 = f(j2);
            } else
            {
                i1 = ((cd) (obj)).a(j2);
            }
            k1 = a.c(view);
            if (k2 != 0 && layoutparams.f)
            {
                obj1 = new LazySpanLookup.FullSpanItem();
                obj1.c = new int[g];
                for (j = 0; j < g; j++)
                {
                    ((LazySpanLookup.FullSpanItem) (obj1)).c[j] = k[j].a(i1) - i1;
                }

                obj1.b = 1;
                obj1.a = k3;
                f.a(((LazySpanLookup.FullSpanItem) (obj1)));
            }
            k1 = i1 - k1;
        }
          goto _L7
_L6:
        j = ac1.d;
        if (l == 0)
        {
            if (j == -1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag != c)
            {
                j = 1;
            } else
            {
                j = 0;
            }
        } else
        {
            if (j == -1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag == c)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag == w())
            {
                j = 1;
            } else
            {
                j = 0;
            }
        }
        if (j != 0)
        {
            j = g - 1;
            i1 = -1;
            byte0 = -1;
        } else
        {
            j = 0;
            i1 = g;
            byte0 = 1;
        }
        if (ac1.d != 1)
        {
            break MISSING_BLOCK_LABEL_718;
        }
        obj1 = null;
        j3 = 0x7fffffff;
        l3 = a.c();
        l2 = j;
        j = j3;
        obj = obj1;
        if (l2 == i1) goto _L9; else goto _L8
_L8:
        obj = k[l2];
        j3 = ((cd) (obj)).b(l3);
        int k1;
        int i3;
        if (j3 < j)
        {
            j = j3;
        } else
        {
            obj = obj1;
        }
        l2 += byte0;
        obj1 = obj;
        break MISSING_BLOCK_LABEL_583;
        obj1 = null;
        j3 = 0x80000000;
        l3 = a.d();
        l2 = j;
        j = j3;
_L11:
        obj = obj1;
        if (l2 == i1) goto _L9; else goto _L10
_L10:
        obj = k[l2];
        j3 = ((cd) (obj)).a(l3);
        if (j3 > j)
        {
            j = j3;
        } else
        {
            obj = obj1;
        }
        l2 += byte0;
        obj1 = obj;
          goto _L11
          goto _L9
_L4:
        obj = k[j];
          goto _L12
_L7:
        if (!layoutparams.f || ac1.c != -1) goto _L14; else goto _L13
_L13:
        if (k2 != 0) goto _L16; else goto _L15
_L15:
        if (ac1.d != 1) goto _L18; else goto _L17
_L17:
        k2 = k[0].b(0x80000000);
        j = 1;
_L25:
        if (j >= g) goto _L20; else goto _L19
_L19:
        if (k[j].b(0x80000000) == k2) goto _L22; else goto _L21
_L21:
        j = 0;
_L26:
        if (j == 0)
        {
            j = 1;
        } else
        {
            j = 0;
        }
_L29:
        if (j == 0) goto _L14; else goto _L23
_L23:
        obj1 = f.d(k3);
        if (obj1 != null)
        {
            obj1.d = true;
        }
_L16:
        z = true;
_L14:
        if (ac1.d == 1)
        {
            if (layoutparams.f)
            {
                for (j = g - 1; j >= 0; j--)
                {
                    k[j].b(view);
                }

            } else
            {
                layoutparams.e.b(view);
            }
        } else
        if (layoutparams.f)
        {
            j = g - 1;
            while (j >= 0) 
            {
                k[j].a(view);
                j--;
            }
        } else
        {
            layoutparams.e.a(view);
        }
        if (layoutparams.f)
        {
            j = b.c();
        } else
        {
            j = ((cd) (obj)).d * m + b.c();
        }
        k2 = b.c(view) + j;
        if (l == 1)
        {
            b(view, j, k1, k2, i1);
        } else
        {
            b(view, k1, j, i1, k2);
        }
        if (layoutparams.f)
        {
            f(n.d, i2);
        } else
        {
            a(((cd) (obj)), n.d, i2);
        }
        if (n.d != -1)
        {
            break MISSING_BLOCK_LABEL_1761;
        }
        k2 = ((cd) (obj)).a();
        j = k[0].a(k2);
        for (i1 = 1; i1 < g; i1++)
        {
            k1 = k[i1].a(k2);
            if (k1 > j)
            {
                j = k1;
            }
        }

        k1 = Math.max(l1, j);
        k2 = a.e();
        i3 = a.c();
        j = j() - 1;
          goto _L24
_L22:
        j++;
          goto _L25
_L20:
        j = 1;
          goto _L26
_L18:
        k2 = k[0].a(0x80000000);
        j = 1;
_L30:
        if (j >= g)
        {
            break MISSING_BLOCK_LABEL_1336;
        }
        if (k[j].a(0x80000000) == k2) goto _L28; else goto _L27
_L27:
        j = 0;
_L31:
        if (j == 0)
        {
            j = 1;
        } else
        {
            j = 0;
        }
          goto _L29
_L28:
        j++;
          goto _L30
        j = 1;
          goto _L31
_L24:
        if (j < 0) goto _L33; else goto _L32
_L32:
        obj = b(j);
        if (a.a(((View) (obj))) <= k1 + (k2 - i3)) goto _L33; else goto _L34
_L34:
        obj1 = (LayoutParams)((View) (obj)).getLayoutParams();
        if (((LayoutParams) (obj1)).f)
        {
            for (i1 = 0; i1 < g; i1++)
            {
                k[i1].d();
            }

        } else
        {
            ((LayoutParams) (obj1)).e.d();
        }
        a(((View) (obj)), bm1);
        j--;
          goto _L24
        k2 = ((cd) (obj)).b();
        j = k[0].b(k2);
        for (i1 = 1; i1 < g; i1++)
        {
            k1 = k[i1].b(k2);
            if (k1 < j)
            {
                j = k1;
            }
        }

        i1 = Math.min(l1, j);
        k1 = a.e();
        k2 = a.c();
_L37:
        if (j() <= 0) goto _L33; else goto _L35
_L35:
        obj = b(0);
        if (a.b(((View) (obj))) >= i1 - (k1 - k2)) goto _L33; else goto _L36
_L36:
        obj1 = (LayoutParams)((View) (obj)).getLayoutParams();
        if (((LayoutParams) (obj1)).f)
        {
            for (j = 0; j < g; j++)
            {
                k[j].e();
            }

        } else
        {
            ((LayoutParams) (obj1)).e.e();
        }
        a(((View) (obj)), bm1);
          goto _L37
_L2:
        if (n.d == -1)
        {
            return Math.max(0, (l1 - f(a.c())) + n.a);
        } else
        {
            return Math.max(0, (g(a.d()) - l1) + n.a);
        }
        k1 = j;
          goto _L7
    }

    private View a(boolean flag)
    {
        u();
        int i1 = a.c();
        int j1 = a.d();
        int k1 = j();
        View view = null;
        for (int j = 0; j < k1; j++)
        {
            View view1 = b(j);
            int l1 = a.a(view1);
            if (a.b(view1) <= i1 || l1 >= j1)
            {
                continue;
            }
            if (l1 >= i1 || !flag)
            {
                return view1;
            }
            if (view == null)
            {
                view = view1;
            }
        }

        return view;
    }

    private void a(int j, bs bs1)
    {
        boolean flag = true;
        n.a = 0;
        n.b = j;
        if (!i())
        {
            break MISSING_BLOCK_LABEL_101;
        }
        int i1 = bs1.c();
        boolean flag2 = c;
        boolean flag1;
        if (i1 < j)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag2 == flag1)
        {
            break MISSING_BLOCK_LABEL_101;
        }
        n.e = a.f();
_L1:
        n.d = -1;
        bs1 = n;
        if (c)
        {
            j = ((flag) ? 1 : 0);
        } else
        {
            j = -1;
        }
        bs1.c = j;
        return;
        n.e = 0;
          goto _L1
    }

    private void a(bm bm1, bs bs1, boolean flag)
    {
        int j = g(a.d());
        j = a.d() - j;
        if (j > 0)
        {
            j -= -d(-j, bm1, bs1);
            if (flag && j > 0)
            {
                a.a(j);
            }
        }
    }

    private void a(cd cd1, int j, int i1)
    {
        int j1 = cd1.c;
        if (j == -1)
        {
            if (j1 + cd1.a() < i1)
            {
                p.set(cd1.d, false);
            }
        } else
        if (cd1.b() - j1 > i1)
        {
            p.set(cd1.d, false);
            return;
        }
    }

    private void a(View view, int j, int i1)
    {
        Object obj = x;
        if (super.i == null)
        {
            ((Rect) (obj)).set(0, 0, 0, 0);
        } else
        {
            ((Rect) (obj)).set(super.i.d(view));
        }
        obj = (LayoutParams)view.getLayoutParams();
        view.measure(a(j, ((LayoutParams) (obj)).leftMargin + x.left, ((LayoutParams) (obj)).rightMargin + x.right), a(i1, ((LayoutParams) (obj)).topMargin + x.top, ((LayoutParams) (obj)).bottomMargin + x.bottom));
    }

    private View b(boolean flag)
    {
        u();
        int i1 = a.c();
        int j1 = a.d();
        View view = null;
        for (int j = j() - 1; j >= 0; j--)
        {
            View view1 = b(j);
            int k1 = a.a(view1);
            int l1 = a.b(view1);
            if (l1 <= i1 || k1 >= j1)
            {
                continue;
            }
            if (l1 <= j1 || !flag)
            {
                return view1;
            }
            if (view == null)
            {
                view = view1;
            }
        }

        return view;
    }

    private void b(int j, int i1, int j1)
    {
        int k1;
        int l1;
        int i2;
        if (c)
        {
            i2 = x();
        } else
        {
            i2 = y();
        }
        if (j1 == 3)
        {
            if (j < i1)
            {
                l1 = i1 + 1;
                k1 = j;
            } else
            {
                l1 = j + 1;
                k1 = i1;
            }
        } else
        {
            l1 = j + i1;
            k1 = j;
        }
        f.b(k1);
        j1;
        JVM INSTR tableswitch 0 3: default 72
    //                   0 111
    //                   1 123
    //                   2 72
    //                   3 135;
           goto _L1 _L2 _L3 _L1 _L4
_L1:
        if (l1 > i2) goto _L6; else goto _L5
_L5:
        return;
_L2:
        f.b(j, i1);
        continue; /* Loop/switch isn't completed */
_L3:
        f.a(j, i1);
        continue; /* Loop/switch isn't completed */
_L4:
        f.a(j, 1);
        f.b(i1, 1);
        continue; /* Loop/switch isn't completed */
_L6:
        if (c)
        {
            j = y();
        } else
        {
            j = x();
        }
        if (k1 > j) goto _L5; else goto _L7
_L7:
        f();
        return;
        if (true) goto _L1; else goto _L8
_L8:
    }

    private void b(int j, bs bs1)
    {
        boolean flag;
        flag = true;
        n.a = 0;
        n.b = j;
        if (!i()) goto _L2; else goto _L1
_L1:
        int i1 = bs1.c();
        boolean flag2 = c;
        boolean flag1;
        if (i1 > j)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag2 == flag1) goto _L2; else goto _L3
_L3:
        n.e = a.f();
_L5:
        n.d = 1;
        bs1 = n;
        j = ((flag) ? 1 : 0);
        if (c)
        {
            j = -1;
        }
        bs1.c = j;
        return;
_L2:
        n.e = 0;
        if (true) goto _L5; else goto _L4
_L4:
    }

    private void b(bm bm1, bs bs1, boolean flag)
    {
        int j = f(a.c()) - a.c();
        if (j > 0)
        {
            j -= d(j, bm1, bs1);
            if (flag && j > 0)
            {
                a.a(-j);
            }
        }
    }

    private static void b(View view, int j, int i1, int j1, int k1)
    {
        LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
        a(view, layoutparams.leftMargin + j, layoutparams.topMargin + i1, j1 - layoutparams.rightMargin, k1 - layoutparams.bottomMargin);
    }

    private int d(int j, bm bm1, bs bs1)
    {
        int i1 = 1;
        int j1 = -1;
        u();
        if (j > 0)
        {
            n.d = 1;
            ac ac1 = n;
            int k1;
            if (c)
            {
                i1 = j1;
            } else
            {
                i1 = 1;
            }
            ac1.c = i1;
            i1 = x();
        } else
        {
            n.d = -1;
            ac ac2 = n;
            if (!c)
            {
                i1 = -1;
            }
            ac2.c = i1;
            i1 = y();
        }
        n.b = i1 + n.c;
        k1 = Math.abs(j);
        n.a = k1;
        ac1 = n;
        if (i())
        {
            i1 = a.f();
        } else
        {
            i1 = 0;
        }
        ac1.e = i1;
        j1 = a(bm1, n, bs1);
        i1 = j;
        if (k1 >= j1)
        {
            if (j < 0)
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

    private static int e(int j, int i1)
    {
        if (j < 0)
        {
            return i1;
        } else
        {
            return android.view.View.MeasureSpec.makeMeasureSpec(j, 0x40000000);
        }
    }

    private int f(int j)
    {
        int j1 = k[0].a(j);
        for (int i1 = 1; i1 < g;)
        {
            int l1 = k[i1].a(j);
            int k1 = j1;
            if (l1 < j1)
            {
                k1 = l1;
            }
            i1++;
            j1 = k1;
        }

        return j1;
    }

    private void f(int j, int i1)
    {
        for (int j1 = 0; j1 < g; j1++)
        {
            if (!android.support.v7.widget.cd.a(k[j1]).isEmpty())
            {
                a(k[j1], j, i1);
            }
        }

    }

    private int g(int j)
    {
        int j1 = k[0].b(j);
        for (int i1 = 1; i1 < g;)
        {
            int l1 = k[i1].b(j);
            int k1 = j1;
            if (l1 > j1)
            {
                k1 = l1;
            }
            i1++;
            j1 = k1;
        }

        return j1;
    }

    private int g(bs bs1)
    {
        boolean flag1 = true;
        if (j() == 0)
        {
            return 0;
        }
        u();
        au au1 = a;
        View view;
        boolean flag;
        if (!A)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        view = a(flag);
        if (!A)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        return android.support.v7.widget.by.a(bs1, au1, view, b(flag), this, A, c);
    }

    private int h(bs bs1)
    {
        boolean flag1 = true;
        if (j() == 0)
        {
            return 0;
        }
        u();
        au au1 = a;
        View view;
        boolean flag;
        if (!A)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        view = a(flag);
        if (!A)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        return android.support.v7.widget.by.a(bs1, au1, view, b(flag), this, A);
    }

    private int i(bs bs1)
    {
        boolean flag1 = true;
        if (j() == 0)
        {
            return 0;
        }
        u();
        au au1 = a;
        View view;
        boolean flag;
        if (!A)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        view = a(flag);
        if (!A)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        return by.b(bs1, au1, view, b(flag), this, A);
    }

    private View t()
    {
        BitSet bitset;
        View view;
        LayoutParams layoutparams;
        cd cd1;
        int j;
        byte byte0;
        int i1;
        byte byte1;
        int j1;
        j = j() - 1;
        bitset = new BitSet(g);
        bitset.set(0, g, true);
        if (l == 1 && w())
        {
            byte0 = 1;
        } else
        {
            byte0 = -1;
        }
        if (c)
        {
            i1 = -1;
        } else
        {
            i1 = j + 1;
            j = 0;
        }
        if (j < i1)
        {
            byte1 = 1;
        } else
        {
            byte1 = -1;
        }
        j1 = j;
_L9:
        if (j1 == i1) goto _L2; else goto _L1
_L1:
        view = b(j1);
        layoutparams = (LayoutParams)view.getLayoutParams();
        if (!bitset.get(layoutparams.e.d))
        {
            break MISSING_BLOCK_LABEL_208;
        }
        cd1 = layoutparams.e;
        if (!c) goto _L4; else goto _L3
_L3:
        if (cd1.b() >= a.d()) goto _L6; else goto _L5
_L5:
        j = 1;
_L8:
        if (j != 0)
        {
            return view;
        }
        break; /* Loop/switch isn't completed */
_L4:
        if (cd1.a() > a.c())
        {
            j = 1;
            continue; /* Loop/switch isn't completed */
        }
_L6:
        j = 0;
        if (true) goto _L8; else goto _L7
_L7:
        bitset.clear(layoutparams.e.d);
        int l1;
        if (layoutparams.f || j1 + byte1 == i1)
        {
            continue; /* Loop/switch isn't completed */
        }
        Object obj = b(j1 + byte1);
        if (c)
        {
            j = a.b(view);
            int k1 = a.b(((View) (obj)));
            if (j < k1)
            {
                return view;
            }
            if (j != k1)
            {
                break MISSING_BLOCK_LABEL_404;
            }
            j = 1;
        } else
        {
            j = a.a(view);
            l1 = a.a(((View) (obj)));
            if (j > l1)
            {
                return view;
            }
            if (j != l1)
            {
                break MISSING_BLOCK_LABEL_404;
            }
            j = 1;
        }
_L10:
        if (j == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = (LayoutParams)((View) (obj)).getLayoutParams();
        if (layoutparams.e.d - ((LayoutParams) (obj)).e.d < 0)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        if (byte0 < 0)
        {
            l1 = 1;
        } else
        {
            l1 = 0;
        }
        if (j != l1)
        {
            return view;
        }
        continue; /* Loop/switch isn't completed */
        j1 += byte1;
          goto _L9
_L2:
        return null;
        j = 0;
          goto _L10
    }

    private void u()
    {
        if (a == null)
        {
            a = android.support.v7.widget.au.a(this, l);
            b = android.support.v7.widget.au.a(this, 1 - l);
            n = new ac();
        }
    }

    private void v()
    {
        boolean flag = true;
        if (l != 1 && w()) goto _L2; else goto _L1
_L1:
        flag = o;
_L4:
        c = flag;
        return;
_L2:
        if (o)
        {
            flag = false;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private boolean w()
    {
        return bp.h(super.i) == 1;
    }

    private int x()
    {
        int j = j();
        if (j == 0)
        {
            return 0;
        } else
        {
            return c(b(j - 1));
        }
    }

    private int y()
    {
        if (j() == 0)
        {
            return 0;
        } else
        {
            return c(b(0));
        }
    }

    public final int a(int j, bm bm1, bs bs1)
    {
        return d(j, bm1, bs1);
    }

    public final int a(bs bs1)
    {
        return g(bs1);
    }

    public final RecyclerView.LayoutParams a()
    {
        return new LayoutParams();
    }

    public final RecyclerView.LayoutParams a(Context context, AttributeSet attributeset)
    {
        return new LayoutParams(context, attributeset);
    }

    public final RecyclerView.LayoutParams a(android.view.ViewGroup.LayoutParams layoutparams)
    {
        if (layoutparams instanceof android.view.ViewGroup.MarginLayoutParams)
        {
            return new LayoutParams((android.view.ViewGroup.MarginLayoutParams)layoutparams);
        } else
        {
            return new LayoutParams(layoutparams);
        }
    }

    public final void a(int j, int i1)
    {
        b(j, i1, 0);
    }

    public final void a(Parcelable parcelable)
    {
        if (parcelable instanceof SavedState)
        {
            t = (SavedState)parcelable;
            f();
        }
    }

    public final void a(RecyclerView recyclerview, bm bm1)
    {
        a(B);
        for (int j = 0; j < g; j++)
        {
            k[j].c();
        }

    }

    public final void a(bm bm1, bs bs1)
    {
        ca ca1;
        int i1;
        boolean flag1;
        flag1 = true;
        u();
        ca1 = y;
        ca1.a = -1;
        ca1.b = 0x80000000;
        ca1.c = false;
        ca1.d = false;
        if (t != null)
        {
            if (t.c > 0)
            {
                if (t.c == g)
                {
                    int k1 = 0;
                    while (k1 < g) 
                    {
                        k[k1].c();
                        int k2 = t.d[k1];
                        int j = k2;
                        if (k2 != 0x80000000)
                        {
                            if (t.i)
                            {
                                j = k2 + a.d();
                            } else
                            {
                                j = k2 + a.c();
                            }
                        }
                        k[k1].c(j);
                        k1++;
                    }
                } else
                {
                    SavedState savedstate = t;
                    savedstate.d = null;
                    savedstate.c = 0;
                    savedstate.e = 0;
                    savedstate.f = null;
                    savedstate.g = null;
                    t.a = t.b;
                }
            }
            s = t.j;
            boolean flag2 = t.h;
            a(((String) (null)));
            if (t != null && t.h != flag2)
            {
                t.h = flag2;
            }
            o = flag2;
            f();
            v();
            int l1;
            int l2;
            if (t.a != -1)
            {
                d = t.a;
                ca1.c = t.i;
            } else
            {
                ca1.c = c;
            }
            if (t.e > 1)
            {
                f.a = t.f;
                f.b = t.g;
            }
        } else
        {
            v();
            ca1.c = c;
        }
        if (!bs1.a() && d != -1) goto _L2; else goto _L1
_L1:
        i1 = 0;
_L37:
        if (i1 != 0) goto _L4; else goto _L3
_L3:
        if (!r) goto _L6; else goto _L5
_L5:
        l2 = bs1.e();
        i1 = j() - 1;
_L22:
        if (i1 < 0) goto _L8; else goto _L7
_L7:
        l1 = c(b(i1));
        if (l1 < 0 || l1 >= l2)
        {
            continue; /* Loop/switch isn't completed */
        }
        i1 = l1;
_L23:
        ca1.a = i1;
        ca1.b = 0x80000000;
          goto _L4
_L2:
        if (d < 0 || d >= bs1.e())
        {
            d = -1;
            e = 0x80000000;
            i1 = 0;
            continue; /* Loop/switch isn't completed */
        }
        if (t != null && t.a != -1 && t.c > 0) goto _L10; else goto _L9
_L9:
        view = a(d);
        if (view == null) goto _L12; else goto _L11
_L11:
        if (c)
        {
            i1 = x();
        } else
        {
            i1 = y();
        }
        ca1.a = i1;
        if (e != 0x80000000)
        {
            if (ca1.c)
            {
                ca1.b = a.d() - e - a.b(view);
            } else
            {
                ca1.b = (a.c() + e) - a.a(view);
            }
            i1 = 1;
            continue; /* Loop/switch isn't completed */
        }
        if (a.c(view) > a.f())
        {
            if (ca1.c)
            {
                i1 = a.d();
            } else
            {
                i1 = a.c();
            }
            ca1.b = i1;
        } else
        {
            i1 = a.a(view) - a.c();
            if (i1 < 0)
            {
                ca1.b = -i1;
            } else
            {
                i1 = a.d() - a.b(view);
                if (i1 < 0)
                {
                    ca1.b = i1;
                } else
                {
                    ca1.b = 0x80000000;
                }
            }
        }
_L21:
        i1 = 1;
        continue; /* Loop/switch isn't completed */
_L12:
        ca1.a = d;
        if (e != 0x80000000)
        {
            break MISSING_BLOCK_LABEL_1062;
        }
        i1 = ca1.a;
        if (j() != 0) goto _L14; else goto _L13
_L13:
        if (c) goto _L16; else goto _L15
_L15:
        i1 = -1;
_L18:
        boolean flag3;
        if (i1 == 1)
        {
            flag3 = true;
        } else
        {
            flag3 = false;
        }
        ca1.c = flag3;
        if (ca1.c)
        {
            i1 = ca1.e.a.d();
        } else
        {
            i1 = ca1.e.a.c();
        }
        ca1.b = i1;
_L19:
        ca1.d = true;
        continue; /* Loop/switch isn't completed */
_L14:
        if (i1 < y())
        {
            flag3 = true;
        } else
        {
            flag3 = false;
        }
        if (flag3 == c) goto _L16; else goto _L17
_L17:
        i1 = -1;
          goto _L18
_L16:
        i1 = 1;
          goto _L18
        i1 = e;
        if (ca1.c)
        {
            ca1.b = ca1.e.a.d() - i1;
        } else
        {
            ca1.b = i1 + ca1.e.a.c();
        }
          goto _L19
_L10:
        ca1.b = 0x80000000;
        ca1.a = d;
        if (true) goto _L21; else goto _L20
_L20:
        i1--;
          goto _L22
_L8:
        i1 = 0;
          goto _L23
_L6:
        k3 = bs1.e();
        i4 = j();
        i2 = 0;
_L27:
        if (i2 >= i4) goto _L25; else goto _L24
_L24:
        i3 = c(b(i2));
        if (i3 < 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        i1 = i3;
        if (i3 < k3) goto _L23; else goto _L26
_L26:
        i2++;
          goto _L27
_L25:
        i1 = 0;
          goto _L23
_L4:
        boolean flag;
        if (t == null && (ca1.c != r || w() != s))
        {
            f.a();
            ca1.d = true;
        }
        View view;
        int i2;
        int i3;
        int k3;
        int i4;
        if (j() > 0 && (t == null || t.c <= 0))
        {
            if (ca1.d)
            {
                for (i1 = 0; i1 < g; i1++)
                {
                    k[i1].c();
                    if (ca1.b != 0x80000000)
                    {
                        k[i1].c(ca1.b);
                    }
                }

            } else
            {
                int j2 = 0;
                while (j2 < g) 
                {
                    cd cd1 = k[j2];
                    boolean flag4 = c;
                    int l3 = ca1.b;
                    int j1;
                    if (flag4)
                    {
                        j1 = cd1.b(0x80000000);
                    } else
                    {
                        j1 = cd1.a(0x80000000);
                    }
                    cd1.c();
                    if (j1 != 0x80000000 && (!flag4 || j1 >= cd1.e.a.d()) && (flag4 || j1 <= cd1.e.a.c()))
                    {
                        int j3 = j1;
                        if (l3 != 0x80000000)
                        {
                            j3 = j1 + l3;
                        }
                        cd1.b = j3;
                        cd1.a = j3;
                    }
                    j2++;
                }
            }
        }
        a(bm1);
        z = false;
        m = b.f() / g;
        u = android.view.View.MeasureSpec.makeMeasureSpec(b.f(), 0x40000000);
        if (l == 1)
        {
            v = android.view.View.MeasureSpec.makeMeasureSpec(m, 0x40000000);
            w = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        } else
        {
            w = android.view.View.MeasureSpec.makeMeasureSpec(m, 0x40000000);
            v = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        }
        if (ca1.c)
        {
            a(ca1.a, bs1);
            a(bm1, n, bs1);
            b(ca1.a, bs1);
            ac ac1 = n;
            ac1.b = ac1.b + n.c;
            a(bm1, n, bs1);
        } else
        {
            b(ca1.a, bs1);
            a(bm1, n, bs1);
            a(ca1.a, bs1);
            ac ac2 = n;
            ac2.b = ac2.b + n.c;
            a(bm1, n, bs1);
        }
        if (j() > 0)
        {
            if (c)
            {
                a(bm1, bs1, true);
                b(bm1, bs1, false);
            } else
            {
                b(bm1, bs1, true);
                a(bm1, bs1, false);
            }
        }
        if (bs1.a()) goto _L29; else goto _L28
_L28:
        if (q == 0 || j() <= 0) goto _L31; else goto _L30
_L30:
        flag = flag1;
        if (z) goto _L33; else goto _L32
_L32:
        if (t() == null) goto _L31; else goto _L34
_L34:
        flag = flag1;
_L33:
        if (flag)
        {
            a(B);
            bm1 = B;
            if (super.i != null)
            {
                bp.a(super.i, bm1);
            }
        }
        d = -1;
        e = 0x80000000;
_L29:
        r = ca1.c;
        s = w();
        t = null;
        return;
_L31:
        flag = false;
        if (true) goto _L33; else goto _L35
_L35:
        if (true) goto _L37; else goto _L36
_L36:
    }

    public final void a(AccessibilityEvent accessibilityevent)
    {
        View view;
        View view1;
label0:
        {
            super.a(accessibilityevent);
            if (j() > 0)
            {
                accessibilityevent = android.support.v4.view.a.a.a(accessibilityevent);
                view = a(false);
                view1 = b(false);
                if (view != null && view1 != null)
                {
                    break label0;
                }
            }
            return;
        }
        int j = c(view);
        int i1 = c(view1);
        if (j < i1)
        {
            accessibilityevent.b(j);
            accessibilityevent.c(i1);
            return;
        } else
        {
            accessibilityevent.b(i1);
            accessibilityevent.c(j);
            return;
        }
    }

    public final void a(String s1)
    {
        if (t == null)
        {
            super.a(s1);
        }
    }

    public final boolean a(RecyclerView.LayoutParams layoutparams)
    {
        return layoutparams instanceof LayoutParams;
    }

    public final int b(int j, bm bm1, bs bs1)
    {
        return d(j, bm1, bs1);
    }

    public final int b(bm bm1, bs bs1)
    {
        if (l == 0)
        {
            return g;
        } else
        {
            return super.b(bm1, bs1);
        }
    }

    public final int b(bs bs1)
    {
        return g(bs1);
    }

    public final Parcelable b()
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
        if (j() > 0)
        {
            u();
            View view;
            int j;
            int i1;
            if (r)
            {
                j = x();
            } else
            {
                j = y();
            }
            savedstate.a = j;
            if (c)
            {
                view = b(true);
            } else
            {
                view = a(true);
            }
            if (view == null)
            {
                j = -1;
            } else
            {
                j = c(view);
            }
            savedstate.b = j;
            savedstate.c = g;
            savedstate.d = new int[g];
            i1 = 0;
            while (i1 < g) 
            {
                if (r)
                {
                    int j1 = k[i1].b(0x80000000);
                    j = j1;
                    if (j1 != 0x80000000)
                    {
                        j = j1 - a.d();
                    }
                } else
                {
                    int k1 = k[i1].a(0x80000000);
                    j = k1;
                    if (k1 != 0x80000000)
                    {
                        j = k1 - a.c();
                    }
                }
                savedstate.d[i1] = j;
                i1++;
            }
        } else
        {
            savedstate.a = -1;
            savedstate.b = -1;
            savedstate.c = 0;
        }
        return savedstate;
    }

    public final void b(int j, int i1)
    {
        b(j, i1, 1);
    }

    public final void b(View view, f f1)
    {
        int j1 = 1;
        int j = 1;
        int i1 = -1;
        android.view.ViewGroup.LayoutParams layoutparams = view.getLayoutParams();
        if (!(layoutparams instanceof LayoutParams))
        {
            super.a(view, f1);
            return;
        }
        view = (LayoutParams)layoutparams;
        int k1;
        if (l == 0)
        {
            k1 = view.a();
            if (((LayoutParams) (view)).f)
            {
                j = g;
            }
            byte byte0 = -1;
            j1 = j;
            j = byte0;
        } else
        {
            j = view.a();
            if (((LayoutParams) (view)).f)
            {
                int l1 = g;
                k1 = -1;
                i1 = j;
                j1 = -1;
                j = l1;
            } else
            {
                k1 = -1;
                i1 = j;
                byte byte1 = -1;
                j = j1;
                j1 = byte1;
            }
        }
        f1.b(android.support.v4.view.a.p.a(k1, j1, i1, j, ((LayoutParams) (view)).f));
    }

    public final int c(bm bm1, bs bs1)
    {
        if (l == 1)
        {
            return g;
        } else
        {
            return super.c(bm1, bs1);
        }
    }

    public final int c(bs bs1)
    {
        return h(bs1);
    }

    public final void c(int j)
    {
        super.c(j);
        for (int i1 = 0; i1 < g; i1++)
        {
            k[i1].d(j);
        }

    }

    public final void c(int j, int i1)
    {
        b(j, i1, 2);
    }

    public final boolean c()
    {
        return l == 0;
    }

    public final int d(bs bs1)
    {
        return h(bs1);
    }

    public final void d(int j)
    {
        super.d(j);
        for (int i1 = 0; i1 < g; i1++)
        {
            k[i1].d(j);
        }

    }

    public final void d(int j, int i1)
    {
        b(j, i1, 3);
    }

    public final boolean d()
    {
        return l == 1;
    }

    public final int e(bs bs1)
    {
        return i(bs1);
    }

    public final void e(int j)
    {
        if (j == 0 && j() != 0 && q != 0 && h()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int i1;
        if (c)
        {
            i1 = x();
            j = y();
        } else
        {
            i1 = y();
            j = x();
        }
        if (i1 != 0 || t() == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        f.a();
_L4:
        s();
        f();
        return;
        if (!z) goto _L1; else goto _L3
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
        fullspanitem = f.a(i1, j + 1, byte0);
        if (fullspanitem == null)
        {
            z = false;
            f.a(j + 1);
            return;
        }
        LazySpanLookup.FullSpanItem fullspanitem1 = f.a(i1, fullspanitem.a, byte0 * -1);
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

    public final boolean e()
    {
        return t == null;
    }

    public final int f(bs bs1)
    {
        return i(bs1);
    }

    public final void q()
    {
        f.a();
        f();
    }

    private class LayoutParams extends RecyclerView.LayoutParams
    {

        cd e;
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

        public LayoutParams()
        {
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


    private class LazySpanLookup
    {

        int a[];
        List b;

        final int a(int j)
        {
            if (b != null)
            {
                for (int i1 = b.size() - 1; i1 >= 0; i1--)
                {
                    if (((FullSpanItem)b.get(i1)).a >= j)
                    {
                        b.remove(i1);
                    }
                }

            }
            return b(j);
        }

        public final FullSpanItem a(int j, int i1, int j1)
        {
            if (b != null) goto _L2; else goto _L1
_L1:
            FullSpanItem fullspanitem = null;
_L6:
            return fullspanitem;
_L2:
            int k1;
            int l1;
            l1 = b.size();
            k1 = 0;
_L9:
            if (k1 >= l1) goto _L4; else goto _L3
_L3:
            FullSpanItem fullspanitem1;
            fullspanitem1 = (FullSpanItem)b.get(k1);
            if (fullspanitem1.a >= i1)
            {
                return null;
            }
            if (fullspanitem1.a < j)
            {
                continue; /* Loop/switch isn't completed */
            }
            fullspanitem = fullspanitem1;
            if (j1 == 0) goto _L6; else goto _L5
_L5:
            fullspanitem = fullspanitem1;
            if (fullspanitem1.b == j1) goto _L6; else goto _L7
_L7:
            fullspanitem = fullspanitem1;
            if (fullspanitem1.d) goto _L6; else goto _L8
_L8:
            k1++;
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

        final void a(int j, int i1)
        {
            if (a != null && j < a.length) goto _L2; else goto _L1
_L1:
            return;
_L2:
            c(j + i1);
            System.arraycopy(a, j + i1, a, j, a.length - j - i1);
            Arrays.fill(a, a.length - i1, a.length, -1);
            if (b != null)
            {
                int j1 = b.size() - 1;
                while (j1 >= 0) 
                {
                    FullSpanItem fullspanitem = (FullSpanItem)b.get(j1);
                    if (fullspanitem.a >= j)
                    {
                        if (fullspanitem.a < j + i1)
                        {
                            b.remove(j1);
                        } else
                        {
                            fullspanitem.a = fullspanitem.a - i1;
                        }
                    }
                    j1--;
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
            int i1 = b.size();
            for (int j = 0; j < i1; j++)
            {
                FullSpanItem fullspanitem1 = (FullSpanItem)b.get(j);
                if (fullspanitem1.a == fullspanitem.a)
                {
                    b.remove(j);
                }
                if (fullspanitem1.a >= fullspanitem.a)
                {
                    b.add(j, fullspanitem);
                    return;
                }
            }

            b.add(fullspanitem);
        }

        final int b(int j)
        {
            if (a == null)
            {
                return -1;
            }
            if (j >= a.length)
            {
                return -1;
            }
            if (b == null) goto _L2; else goto _L1
_L1:
            int i1;
            int j1;
            FullSpanItem fullspanitem = d(j);
            if (fullspanitem != null)
            {
                b.remove(fullspanitem);
            }
            j1 = b.size();
            i1 = 0;
_L6:
            if (i1 >= j1)
            {
                break MISSING_BLOCK_LABEL_175;
            }
            if (((FullSpanItem)b.get(i1)).a < j) goto _L4; else goto _L3
_L3:
            if (i1 == -1) goto _L2; else goto _L5
_L5:
            FullSpanItem fullspanitem1 = (FullSpanItem)b.get(i1);
            b.remove(i1);
            i1 = fullspanitem1.a;
_L7:
            if (i1 == -1)
            {
                Arrays.fill(a, j, a.length, -1);
                return a.length;
            } else
            {
                Arrays.fill(a, j, i1 + 1, -1);
                return i1 + 1;
            }
_L4:
            i1++;
              goto _L6
_L2:
            i1 = -1;
              goto _L7
            i1 = -1;
              goto _L3
        }

        final void b(int j, int i1)
        {
            if (a != null && j < a.length) goto _L2; else goto _L1
_L1:
            return;
_L2:
            c(j + i1);
            System.arraycopy(a, j, a, j + i1, a.length - j - i1);
            Arrays.fill(a, j, j + i1, -1);
            if (b != null)
            {
                int j1 = b.size() - 1;
                while (j1 >= 0) 
                {
                    FullSpanItem fullspanitem = (FullSpanItem)b.get(j1);
                    if (fullspanitem.a >= j)
                    {
                        fullspanitem.a = fullspanitem.a + i1;
                    }
                    j1--;
                }
            }
            if (true) goto _L1; else goto _L3
_L3:
        }

        final void c(int j)
        {
            if (a == null)
            {
                a = new int[Math.max(j, 10) + 1];
                Arrays.fill(a, -1);
            } else
            if (j >= a.length)
            {
                int ai[] = a;
                int i1;
                for (i1 = a.length; i1 <= j; i1 *= 2) { }
                a = new int[i1];
                System.arraycopy(ai, 0, a, 0, ai.length);
                Arrays.fill(a, ai.length, a.length, -1);
                return;
            }
        }

        public final FullSpanItem d(int j)
        {
            if (b != null) goto _L2; else goto _L1
_L1:
            FullSpanItem fullspanitem = null;
_L4:
            return fullspanitem;
_L2:
            int i1 = b.size() - 1;
label0:
            do
            {
label1:
                {
                    if (i1 < 0)
                    {
                        break label1;
                    }
                    FullSpanItem fullspanitem1 = (FullSpanItem)b.get(i1);
                    fullspanitem = fullspanitem1;
                    if (fullspanitem1.a == j)
                    {
                        break label0;
                    }
                    i1--;
                }
            } while (true);
            if (true) goto _L4; else goto _L3
_L3:
            return null;
        }
    }


    private class SavedState
        implements Parcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new cc();
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

}
