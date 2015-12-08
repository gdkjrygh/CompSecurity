// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.accessibility.AccessibilityEventCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.support.v4.view.accessibility.AccessibilityRecordCompat;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.BitSet;

// Referenced classes of package android.support.v7.widget:
//            au, bo, bm, u, 
//            ad, bf, az, bi, 
//            br, RecyclerView, bl, bn, 
//            aa

public final class StaggeredGridLayoutManager extends au
{

    private boolean A;
    private final Runnable B = new bm(this);
    ad a;
    ad b;
    boolean c;
    int d;
    int e;
    LazySpanLookup f;
    private int g;
    private br h[];
    private int i;
    private int j;
    private u k;
    private boolean l;
    private BitSet m;
    private int n;
    private boolean o;
    private boolean p;
    private SavedState t;
    private int u;
    private int v;
    private int w;
    private final Rect x = new Rect();
    private final bo y = new bo(this, (byte)0);
    private boolean z;

    public StaggeredGridLayoutManager()
    {
        g = -1;
        l = false;
        c = false;
        d = -1;
        e = 0x80000000;
        f = new LazySpanLookup();
        n = 2;
        z = false;
        A = true;
        i = 1;
        i();
    }

    private int B()
    {
        if (r() == 0)
        {
            return 0;
        } else
        {
            return e(c(0));
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

    static int a(StaggeredGridLayoutManager staggeredgridlayoutmanager, int i1)
    {
        return staggeredgridlayoutmanager.j(i1);
    }

    private int a(az az1, u u1, bf bf1)
    {
        Object obj;
        Object obj1;
        View view;
        LayoutParams layoutparams;
        int i1;
        int j1;
        int j2;
        int k2;
        int l2;
        int k3;
        m.set(0, g, true);
        int k1;
        if (u1.d == 1)
        {
            j2 = u1.f + u1.a;
        } else
        {
            j2 = u1.e - u1.a;
        }
        f(u1.d, j2);
        if (c)
        {
            k2 = a.d();
        } else
        {
            k2 = a.c();
        }
        i1 = 0;
_L31:
        if (u1.b >= 0 && u1.b < bf1.e())
        {
            j1 = 1;
        } else
        {
            j1 = 0;
        }
        if (j1 == 0 || m.isEmpty()) goto _L2; else goto _L1
_L1:
        view = az1.b(u1.b);
        u1.b = u1.b + u1.c;
        layoutparams = (LayoutParams)view.getLayoutParams();
        k3 = ((RecyclerView.LayoutParams) (layoutparams)).a.c();
        obj = f;
        if (((LazySpanLookup) (obj)).a == null || k3 >= ((LazySpanLookup) (obj)).a.length)
        {
            i1 = -1;
        } else
        {
            i1 = ((LazySpanLookup) (obj)).a[k3];
        }
        if (i1 == -1)
        {
            l2 = 1;
        } else
        {
            l2 = 0;
        }
        if (l2 == 0) goto _L4; else goto _L3
_L3:
        if (!layoutparams.f) goto _L6; else goto _L5
_L5:
        obj = h[0];
_L9:
        obj1 = f;
        ((LazySpanLookup) (obj1)).c(k3);
        ((LazySpanLookup) (obj1)).a[k3] = ((br) (obj)).d;
_L12:
        layoutparams.e = ((br) (obj));
        class LazySpanLookup.FullSpanItem
            implements Parcelable
        {

            public static final android.os.Parcelable.Creator CREATOR = new bp();
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

        if (u1.d == 1)
        {
            c(view);
        } else
        {
            d(view);
        }
        if (layoutparams.f)
        {
            if (i == 1)
            {
                a(view, u, e(layoutparams.height, w));
            } else
            {
                a(view, e(layoutparams.width, v), u);
            }
        } else
        if (i == 1)
        {
            a(view, v, e(layoutparams.height, w));
        } else
        {
            a(view, e(layoutparams.width, v), w);
        }
        if (u1.d == 1)
        {
            int l1;
            int i3;
            int j3;
            int l3;
            boolean flag;
            if (layoutparams.f)
            {
                i1 = i(k2);
            } else
            {
                i1 = ((br) (obj)).b(k2);
            }
            j1 = i1 + a.c(view);
            if (l2 == 0 || !layoutparams.f)
            {
                break MISSING_BLOCK_LABEL_1600;
            }
            obj1 = new LazySpanLookup.FullSpanItem();
            obj1.c = new int[g];
            for (k1 = 0; k1 < g; k1++)
            {
                ((LazySpanLookup.FullSpanItem) (obj1)).c[k1] = i1 - h[k1].b(i1);
            }

            obj1.b = -1;
            obj1.a = k3;
            f.a(((LazySpanLookup.FullSpanItem) (obj1)));
            i2 = i1;
        } else
        {
            if (layoutparams.f)
            {
                j1 = h(k2);
            } else
            {
                j1 = ((br) (obj)).a(k2);
            }
            i2 = a.c(view);
            if (l2 != 0 && layoutparams.f)
            {
                obj1 = new LazySpanLookup.FullSpanItem();
                obj1.c = new int[g];
                for (i1 = 0; i1 < g; i1++)
                {
                    ((LazySpanLookup.FullSpanItem) (obj1)).c[i1] = h[i1].a(j1) - j1;
                }

                obj1.b = 1;
                obj1.a = k3;
                f.a(((LazySpanLookup.FullSpanItem) (obj1)));
            }
            i2 = j1 - i2;
        }
          goto _L7
_L6:
        i1 = u1.d;
        if (i == 0)
        {
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
            if (i1 == -1)
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
            if (flag == l())
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
            l1 = -1;
            j1 = -1;
        } else
        {
            i1 = 0;
            l1 = g;
            j1 = 1;
        }
        if (u1.d != 1)
        {
            break MISSING_BLOCK_LABEL_669;
        }
        obj1 = null;
        j3 = 0x7fffffff;
        l3 = a.c();
        i3 = i1;
        i1 = j3;
        obj = obj1;
        if (i3 == l1) goto _L9; else goto _L8
_L8:
        obj = h[i3];
        j3 = ((br) (obj)).b(l3);
        int i2;
        if (j3 < i1)
        {
            i1 = j3;
        } else
        {
            obj = obj1;
        }
        i3 += j1;
        obj1 = obj;
        break MISSING_BLOCK_LABEL_534;
        obj1 = null;
        j3 = 0x80000000;
        l3 = a.d();
        i3 = i1;
        i1 = j3;
_L11:
        obj = obj1;
        if (i3 == l1) goto _L9; else goto _L10
_L10:
        obj = h[i3];
        j3 = ((br) (obj)).a(l3);
        if (j3 > i1)
        {
            i1 = j3;
        } else
        {
            obj = obj1;
        }
        i3 += j1;
        obj1 = obj;
          goto _L11
          goto _L9
_L4:
        obj = h[i1];
          goto _L12
_L7:
        if (!layoutparams.f || u1.c != -1) goto _L14; else goto _L13
_L13:
        if (l2 != 0) goto _L16; else goto _L15
_L15:
        if (u1.d != 1) goto _L18; else goto _L17
_L17:
        l2 = h[0].b(0x80000000);
        i1 = 1;
_L24:
        if (i1 >= g) goto _L20; else goto _L19
_L19:
        if (h[i1].b(0x80000000) == l2) goto _L22; else goto _L21
_L21:
        i1 = 0;
_L25:
        if (i1 == 0)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
_L28:
        if (i1 == 0) goto _L14; else goto _L23
_L23:
        obj1 = f.d(k3);
        if (obj1 != null)
        {
            obj1.d = true;
        }
_L16:
        z = true;
          goto _L14
_L22:
        i1++;
          goto _L24
_L20:
        i1 = 1;
          goto _L25
_L18:
        l2 = h[0].a(0x80000000);
        i1 = 1;
_L29:
        if (i1 >= g)
        {
            break MISSING_BLOCK_LABEL_1287;
        }
        if (h[i1].a(0x80000000) == l2) goto _L27; else goto _L26
_L26:
        i1 = 0;
_L30:
        if (i1 == 0)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
          goto _L28
_L27:
        i1++;
          goto _L29
        i1 = 1;
          goto _L30
_L14:
        if (u1.d == 1)
        {
            if (layoutparams.f)
            {
                for (i1 = g - 1; i1 >= 0; i1--)
                {
                    h[i1].b(view);
                }

            } else
            {
                layoutparams.e.b(view);
            }
        } else
        if (layoutparams.f)
        {
            i1 = g - 1;
            while (i1 >= 0) 
            {
                h[i1].a(view);
                i1--;
            }
        } else
        {
            layoutparams.e.a(view);
        }
        if (layoutparams.f)
        {
            i1 = b.c();
        } else
        {
            i1 = ((br) (obj)).d * j + b.c();
        }
        l2 = b.c(view) + i1;
        if (i == 1)
        {
            b(view, i1, i2, l2, j1);
        } else
        {
            b(view, i2, i1, j1, l2);
        }
        if (layoutparams.f)
        {
            f(k.d, j2);
        } else
        {
            a(((br) (obj)), k.d, j2);
        }
        a(az1, k);
        i1 = 1;
          goto _L31
_L2:
        if (i1 == 0)
        {
            a(az1, k);
        }
        if (k.d == -1)
        {
            i1 = h(a.c());
            i1 = a.c() - i1;
        } else
        {
            i1 = i(a.d()) - a.d();
        }
        if (i1 > 0)
        {
            return Math.min(u1.a, i1);
        } else
        {
            return 0;
        }
        i2 = i1;
          goto _L7
    }

    private View a(boolean flag)
    {
        j();
        int j1 = a.c();
        int k1 = a.d();
        int l1 = r();
        View view = null;
        for (int i1 = 0; i1 < l1; i1++)
        {
            View view1 = c(i1);
            int i2 = a.a(view1);
            if (a.b(view1) <= j1 || i2 >= k1)
            {
                continue;
            }
            if (i2 >= j1 || !flag)
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

    private void a(int i1, bf bf1)
    {
        boolean flag1;
        flag1 = false;
        k.a = 0;
        k.b = i1;
        if (!q()) goto _L2; else goto _L1
_L1:
        int j1 = bf1.c();
        if (j1 == -1) goto _L2; else goto _L3
_L3:
        boolean flag3 = c;
        boolean flag;
        boolean flag2;
        if (j1 < i1)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        if (flag3 == flag2)
        {
            i1 = a.f();
            j1 = 0;
        } else
        {
            j1 = a.f();
            i1 = 0;
        }
_L5:
        flag = flag1;
        if (super.r != null)
        {
            flag = flag1;
            if (RecyclerView.v(super.r))
            {
                flag = true;
            }
        }
        if (flag)
        {
            k.e = a.c() - j1;
            k.f = i1 + a.d();
            return;
        } else
        {
            k.f = i1 + a.e();
            k.e = -j1;
            return;
        }
_L2:
        i1 = 0;
        j1 = 0;
        if (true) goto _L5; else goto _L4
_L4:
    }

    private void a(az az1, int i1)
    {
_L12:
        if (r() <= 0) goto _L2; else goto _L1
_L1:
        View view = c(0);
        if (a.b(view) > i1) goto _L2; else goto _L3
_L3:
        LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
        if (!layoutparams.f) goto _L5; else goto _L4
_L4:
        int j1 = 0;
_L9:
        if (j1 >= g) goto _L7; else goto _L6
_L6:
        if (br.a(h[j1]).size() != 1) goto _L8; else goto _L2
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
        if (br.a(layoutparams.e).size() == 1)
        {
            continue; /* Loop/switch isn't completed */
        }
        layoutparams.e.e();
        break; /* Loop/switch isn't completed */
        if (true) goto _L2; else goto _L10
_L10:
        a(view, az1);
        if (true) goto _L12; else goto _L11
_L11:
    }

    private void a(az az1, bf bf1, boolean flag)
    {
        int i1 = i(a.d());
        i1 = a.d() - i1;
        if (i1 > 0)
        {
            i1 -= -d(-i1, az1, bf1);
            if (flag && i1 > 0)
            {
                a.a(i1);
            }
        }
    }

    private void a(az az1, u u1)
    {
        int i2 = 1;
        int i1 = 1;
        if (u1.a == 0)
        {
            if (u1.d == -1)
            {
                b(az1, u1.f);
                return;
            } else
            {
                a(az1, u1.e);
                return;
            }
        }
        if (u1.d == -1)
        {
            int i3 = u1.e;
            int k3 = u1.e;
            int j1;
            for (j1 = h[0].a(k3); i1 < g; j1 = i2)
            {
                int k2 = h[i1].a(k3);
                i2 = j1;
                if (k2 > j1)
                {
                    i2 = k2;
                }
                i1++;
            }

            i1 = i3 - j1;
            if (i1 < 0)
            {
                i1 = u1.f;
            } else
            {
                i1 = u1.f - Math.min(i1, u1.a);
            }
            b(az1, i1);
            return;
        }
        int j3 = u1.f;
        int k1 = h[0].b(j3);
        for (i1 = i2; i1 < g;)
        {
            int l2 = h[i1].b(j3);
            int j2 = k1;
            if (l2 < k1)
            {
                j2 = l2;
            }
            i1++;
            k1 = j2;
        }

        i1 = k1 - u1.f;
        if (i1 < 0)
        {
            i1 = u1.e;
        } else
        {
            int l1 = u1.e;
            i1 = Math.min(i1, u1.a) + l1;
        }
        a(az1, i1);
    }

    private void a(br br1, int i1, int j1)
    {
        int k1 = br1.c;
        if (i1 == -1)
        {
            if (k1 + br1.a() <= j1)
            {
                m.set(br1.d, false);
            }
        } else
        if (br1.b() - k1 >= j1)
        {
            m.set(br1.d, false);
            return;
        }
    }

    private void a(View view, int i1, int j1)
    {
        a(view, x);
        LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
        view.measure(a(i1, layoutparams.leftMargin + x.left, layoutparams.rightMargin + x.right), a(j1, layoutparams.topMargin + x.top, layoutparams.bottomMargin + x.bottom));
    }

    static boolean a(StaggeredGridLayoutManager staggeredgridlayoutmanager)
    {
        return staggeredgridlayoutmanager.c();
    }

    static int b(StaggeredGridLayoutManager staggeredgridlayoutmanager)
    {
        return staggeredgridlayoutmanager.i;
    }

    private View b(boolean flag)
    {
        j();
        int j1 = a.c();
        int k1 = a.d();
        View view = null;
        for (int i1 = r() - 1; i1 >= 0; i1--)
        {
            View view1 = c(i1);
            int l1 = a.a(view1);
            int i2 = a.b(view1);
            if (i2 <= j1 || l1 >= k1)
            {
                continue;
            }
            if (i2 <= k1 || !flag)
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

    private void b(int i1, int j1, int k1)
    {
        int l1;
        int i2;
        int j2;
        if (c)
        {
            j2 = m();
        } else
        {
            j2 = B();
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
            i1 = B();
        } else
        {
            i1 = m();
        }
        if (l1 > i1) goto _L5; else goto _L7
_L7:
        n();
        return;
        if (true) goto _L1; else goto _L8
_L8:
    }

    private void b(az az1, int i1)
    {
        int j1 = r() - 1;
_L12:
        if (j1 < 0) goto _L2; else goto _L1
_L1:
        View view = c(j1);
        if (a.a(view) < i1) goto _L2; else goto _L3
_L3:
        LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
        if (!layoutparams.f) goto _L5; else goto _L4
_L4:
        int k1 = 0;
_L9:
        if (k1 >= g) goto _L7; else goto _L6
_L6:
        if (br.a(h[k1]).size() != 1) goto _L8; else goto _L2
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
        if (br.a(layoutparams.e).size() == 1)
        {
            continue; /* Loop/switch isn't completed */
        }
        layoutparams.e.d();
        break; /* Loop/switch isn't completed */
        if (true) goto _L2; else goto _L10
_L10:
        a(view, az1);
        j1--;
        if (true) goto _L12; else goto _L11
_L11:
    }

    private void b(az az1, bf bf1, boolean flag)
    {
        int i1 = h(a.c()) - a.c();
        if (i1 > 0)
        {
            i1 -= d(i1, az1, bf1);
            if (flag && i1 > 0)
            {
                a.a(-i1);
            }
        }
    }

    private static void b(View view, int i1, int j1, int k1, int l1)
    {
        LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
        a(view, layoutparams.leftMargin + i1, layoutparams.topMargin + j1, k1 - layoutparams.rightMargin, l1 - layoutparams.bottomMargin);
    }

    private boolean c()
    {
        if (r() == 0 || n == 0 || !p())
        {
            return false;
        }
        int i1;
        int j1;
        if (c)
        {
            j1 = m();
            i1 = B();
        } else
        {
            j1 = B();
            i1 = m();
        }
        if (j1 == 0 && d() != null)
        {
            f.a();
            A();
            n();
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
        fullspanitem = f.a(j1, i1 + 1, byte0);
        if (fullspanitem == null)
        {
            z = false;
            f.a(i1 + 1);
            return false;
        }
        LazySpanLookup.FullSpanItem fullspanitem1 = f.a(j1, fullspanitem.a, byte0 * -1);
        if (fullspanitem1 == null)
        {
            f.a(fullspanitem.a);
        } else
        {
            f.a(fullspanitem1.a + 1);
        }
        A();
        n();
        return true;
    }

    private int d(int i1, az az1, bf bf1)
    {
        j();
        int j1;
        int k1;
        int l1;
        if (i1 > 0)
        {
            j1 = 1;
            k1 = m();
        } else
        {
            j1 = -1;
            k1 = B();
        }
        a(k1, bf1);
        g(j1);
        k.b = k1 + k.c;
        l1 = Math.abs(i1);
        k.a = l1;
        k1 = a(az1, k, bf1);
        j1 = i1;
        if (l1 >= k1)
        {
            if (i1 < 0)
            {
                j1 = -k1;
            } else
            {
                j1 = k1;
            }
        }
        a.a(-j1);
        o = c;
        return j1;
    }

    private View d()
    {
        BitSet bitset;
        View view;
        LayoutParams layoutparams;
        br br1;
        int i1;
        byte byte0;
        int j1;
        byte byte1;
        int k1;
        i1 = r() - 1;
        bitset = new BitSet(g);
        bitset.set(0, g, true);
        if (i == 1 && l())
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
            j1 = i1 + 1;
            i1 = 0;
        }
        if (i1 < j1)
        {
            byte1 = 1;
        } else
        {
            byte1 = -1;
        }
        k1 = i1;
_L9:
        if (k1 == j1) goto _L2; else goto _L1
_L1:
        view = c(k1);
        layoutparams = (LayoutParams)view.getLayoutParams();
        if (!bitset.get(layoutparams.e.d))
        {
            break MISSING_BLOCK_LABEL_208;
        }
        br1 = layoutparams.e;
        if (!c) goto _L4; else goto _L3
_L3:
        if (br1.b() >= a.d()) goto _L6; else goto _L5
_L5:
        i1 = 1;
_L8:
        if (i1 != 0)
        {
            return view;
        }
        break; /* Loop/switch isn't completed */
_L4:
        if (br1.a() > a.c())
        {
            i1 = 1;
            continue; /* Loop/switch isn't completed */
        }
_L6:
        i1 = 0;
        if (true) goto _L8; else goto _L7
_L7:
        bitset.clear(layoutparams.e.d);
        int i2;
        if (layoutparams.f || k1 + byte1 == j1)
        {
            continue; /* Loop/switch isn't completed */
        }
        Object obj = c(k1 + byte1);
        if (c)
        {
            i1 = a.b(view);
            int l1 = a.b(((View) (obj)));
            if (i1 < l1)
            {
                return view;
            }
            if (i1 != l1)
            {
                break MISSING_BLOCK_LABEL_404;
            }
            i1 = 1;
        } else
        {
            i1 = a.a(view);
            i2 = a.a(((View) (obj)));
            if (i1 > i2)
            {
                return view;
            }
            if (i1 != i2)
            {
                break MISSING_BLOCK_LABEL_404;
            }
            i1 = 1;
        }
_L10:
        if (i1 == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = (LayoutParams)((View) (obj)).getLayoutParams();
        if (layoutparams.e.d - ((LayoutParams) (obj)).e.d < 0)
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
        if (i1 != i2)
        {
            return view;
        }
        continue; /* Loop/switch isn't completed */
        k1 += byte1;
          goto _L9
_L2:
        return null;
        i1 = 0;
          goto _L10
    }

    private static int e(int i1, int j1)
    {
        if (i1 < 0)
        {
            return j1;
        } else
        {
            return android.view.View.MeasureSpec.makeMeasureSpec(i1, 0x40000000);
        }
    }

    private void f(int i1, int j1)
    {
        for (int k1 = 0; k1 < g; k1++)
        {
            if (!br.a(h[k1]).isEmpty())
            {
                a(h[k1], i1, j1);
            }
        }

    }

    private int g(bf bf1)
    {
        boolean flag1 = true;
        if (r() == 0)
        {
            return 0;
        }
        j();
        ad ad1 = a;
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
        return bl.a(bf1, ad1, view, b(flag), this, A, c);
    }

    private void g(int i1)
    {
        boolean flag = true;
        k.d = i1;
        u u1 = k;
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
        u1.c = i1;
    }

    private int h(int i1)
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

    private int h(bf bf1)
    {
        boolean flag1 = true;
        if (r() == 0)
        {
            return 0;
        }
        j();
        ad ad1 = a;
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
        return bl.a(bf1, ad1, view, b(flag), this, A);
    }

    private int i(int i1)
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

    private int i(bf bf1)
    {
        boolean flag1 = true;
        if (r() == 0)
        {
            return 0;
        }
        j();
        ad ad1 = a;
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
        return bl.b(bf1, ad1, view, b(flag), this, A);
    }

    private void i()
    {
        a(((String) (null)));
        if (2 != g)
        {
            f.a();
            n();
            g = 2;
            m = new BitSet(g);
            h = new br[g];
            for (int i1 = 0; i1 < g; i1++)
            {
                h[i1] = new br(this, i1, (byte)0);
            }

            n();
        }
    }

    private int j(int i1)
    {
        if (r() != 0) goto _L2; else goto _L1
_L1:
        if (!c) goto _L4; else goto _L3
_L3:
        return 1;
_L4:
        return -1;
_L2:
        boolean flag;
        if (i1 < B())
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

    private void j()
    {
        if (a == null)
        {
            a = ad.a(this, i);
            b = ad.a(this, 1 - i);
            k = new u();
        }
    }

    private void k()
    {
        boolean flag = true;
        if (i != 1 && l()) goto _L2; else goto _L1
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

    private boolean l()
    {
        return ViewCompat.getLayoutDirection(super.r) == 1;
    }

    private int m()
    {
        int i1 = r();
        if (i1 == 0)
        {
            return 0;
        } else
        {
            return e(c(i1 - 1));
        }
    }

    public final int a(int i1, az az1, bf bf1)
    {
        return d(i1, az1, bf1);
    }

    public final int a(az az1, bf bf1)
    {
        if (i == 0)
        {
            return g;
        } else
        {
            return super.a(az1, bf1);
        }
    }

    public final int a(bf bf1)
    {
        return g(bf1);
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

    public final void a()
    {
        f.a();
        n();
    }

    public final void a(int i1, int j1)
    {
        b(i1, j1, 0);
    }

    public final void a(Parcelable parcelable)
    {
        if (parcelable instanceof SavedState)
        {
            t = (SavedState)parcelable;
            n();
        }
    }

    public final void a(RecyclerView recyclerview)
    {
        recyclerview = new bn(this, recyclerview.getContext());
        recyclerview.b(0);
        a(((bd) (recyclerview)));
    }

    public final void a(RecyclerView recyclerview, az az1)
    {
        a(B);
        for (int i1 = 0; i1 < g; i1++)
        {
            h[i1].c();
        }

    }

    public final void a(az az1, bf bf1, View view, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
    {
        int k1 = -1;
        az1 = view.getLayoutParams();
        if (!(az1 instanceof LayoutParams))
        {
            super.a(view, accessibilitynodeinfocompat);
            return;
        }
        az1 = (LayoutParams)az1;
        int i1;
        int j1;
        int l1;
        if (i == 0)
        {
            int i2 = az1.b();
            if (((LayoutParams) (az1)).f)
            {
                i1 = g;
            } else
            {
                i1 = 1;
            }
            l1 = -1;
            j1 = i1;
            i1 = i2;
        } else
        {
            l1 = az1.b();
            if (((LayoutParams) (az1)).f)
            {
                k1 = g;
                i1 = -1;
                j1 = -1;
            } else
            {
                i1 = -1;
                k1 = 1;
                j1 = -1;
            }
        }
        accessibilitynodeinfocompat.setCollectionItemInfo(android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(i1, j1, l1, k1, ((LayoutParams) (az1)).f, false));
    }

    public final void a(AccessibilityEvent accessibilityevent)
    {
        View view;
        View view1;
label0:
        {
            super.a(accessibilityevent);
            if (r() > 0)
            {
                accessibilityevent = AccessibilityEventCompat.asRecord(accessibilityevent);
                view = a(false);
                view1 = b(false);
                if (view != null && view1 != null)
                {
                    break label0;
                }
            }
            return;
        }
        int i1 = e(view);
        int j1 = e(view1);
        if (i1 < j1)
        {
            accessibilityevent.setFromIndex(i1);
            accessibilityevent.setToIndex(j1);
            return;
        } else
        {
            accessibilityevent.setFromIndex(j1);
            accessibilityevent.setToIndex(i1);
            return;
        }
    }

    public final void a(String s)
    {
        if (t == null)
        {
            super.a(s);
        }
    }

    public final boolean a(RecyclerView.LayoutParams layoutparams)
    {
        return layoutparams instanceof LayoutParams;
    }

    public final int b(int i1, az az1, bf bf1)
    {
        return d(i1, az1, bf1);
    }

    public final int b(az az1, bf bf1)
    {
        if (i == 1)
        {
            return g;
        } else
        {
            return super.b(az1, bf1);
        }
    }

    public final int b(bf bf1)
    {
        return g(bf1);
    }

    public final RecyclerView.LayoutParams b()
    {
        return new LayoutParams(-2, -2);
    }

    public final void b(int i1)
    {
        if (t != null && t.a != i1)
        {
            SavedState savedstate = t;
            savedstate.d = null;
            savedstate.c = 0;
            savedstate.a = -1;
            savedstate.b = -1;
        }
        d = i1;
        e = 0x80000000;
        n();
    }

    public final void b(int i1, int j1)
    {
        b(i1, j1, 1);
    }

    public final int c(bf bf1)
    {
        return h(bf1);
    }

    public final void c(int i1, int j1)
    {
        b(i1, j1, 2);
    }

    public final void c(az az1, bf bf1)
    {
        bo bo1;
        int j1;
        boolean flag1;
        flag1 = true;
        j();
        bo1 = y;
        bo1.a = -1;
        bo1.b = 0x80000000;
        bo1.c = false;
        bo1.d = false;
        if (t != null)
        {
            if (t.c > 0)
            {
                if (t.c == g)
                {
                    int l1 = 0;
                    while (l1 < g) 
                    {
                        h[l1].c();
                        int l2 = t.d[l1];
                        int i1 = l2;
                        if (l2 != 0x80000000)
                        {
                            if (t.i)
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
                    SavedState savedstate = t;
                    savedstate.d = null;
                    savedstate.c = 0;
                    savedstate.e = 0;
                    savedstate.f = null;
                    savedstate.g = null;
                    t.a = t.b;
                }
            }
            p = t.j;
            boolean flag2 = t.h;
            a(((String) (null)));
            if (t != null && t.h != flag2)
            {
                t.h = flag2;
            }
            l = flag2;
            n();
            k();
            int i2;
            int i3;
            if (t.a != -1)
            {
                d = t.a;
                bo1.c = t.i;
            } else
            {
                bo1.c = c;
            }
            if (t.e > 1)
            {
                f.a = t.f;
                f.b = t.g;
            }
        } else
        {
            k();
            bo1.c = c;
        }
        if (!bf1.a() && d != -1) goto _L2; else goto _L1
_L1:
        j1 = 0;
_L30:
        if (j1 != 0) goto _L4; else goto _L3
_L3:
        if (!o) goto _L6; else goto _L5
_L5:
        i3 = bf1.e();
        j1 = r() - 1;
_L15:
        if (j1 < 0) goto _L8; else goto _L7
_L7:
        i2 = e(c(j1));
        if (i2 < 0 || i2 >= i3)
        {
            continue; /* Loop/switch isn't completed */
        }
        j1 = i2;
_L16:
        bo1.a = j1;
        bo1.b = 0x80000000;
          goto _L4
_L2:
        if (d < 0 || d >= bf1.e())
        {
            d = -1;
            e = 0x80000000;
            j1 = 0;
            continue; /* Loop/switch isn't completed */
        }
        if (t != null && t.a != -1 && t.c > 0) goto _L10; else goto _L9
_L9:
        view = a(d);
        if (view == null) goto _L12; else goto _L11
_L11:
        if (c)
        {
            j1 = m();
        } else
        {
            j1 = B();
        }
        bo1.a = j1;
        if (e != 0x80000000)
        {
            if (bo1.c)
            {
                bo1.b = a.d() - e - a.b(view);
            } else
            {
                bo1.b = (a.c() + e) - a.a(view);
            }
            j1 = 1;
            continue; /* Loop/switch isn't completed */
        }
        if (a.c(view) > a.f())
        {
            if (bo1.c)
            {
                j1 = a.d();
            } else
            {
                j1 = a.c();
            }
            bo1.b = j1;
        } else
        {
            j1 = a.a(view) - a.c();
            if (j1 < 0)
            {
                bo1.b = -j1;
            } else
            {
                j1 = a.d() - a.b(view);
                if (j1 < 0)
                {
                    bo1.b = j1;
                } else
                {
                    bo1.b = 0x80000000;
                }
            }
        }
_L14:
        j1 = 1;
        continue; /* Loop/switch isn't completed */
_L12:
        bo1.a = d;
        if (e == 0x80000000)
        {
            boolean flag3;
            if (j(bo1.a) == 1)
            {
                flag3 = true;
            } else
            {
                flag3 = false;
            }
            bo1.c = flag3;
            if (bo1.c)
            {
                j1 = bo1.e.a.d();
            } else
            {
                j1 = bo1.e.a.c();
            }
            bo1.b = j1;
        } else
        {
            j1 = e;
            if (bo1.c)
            {
                bo1.b = bo1.e.a.d() - j1;
            } else
            {
                bo1.b = j1 + bo1.e.a.c();
            }
        }
        bo1.d = true;
        continue; /* Loop/switch isn't completed */
_L10:
        bo1.b = 0x80000000;
        bo1.a = d;
        if (true) goto _L14; else goto _L13
_L13:
        j1--;
          goto _L15
_L8:
        j1 = 0;
          goto _L16
_L6:
        l3 = bf1.e();
        j4 = r();
        j2 = 0;
_L20:
        if (j2 >= j4) goto _L18; else goto _L17
_L17:
        j3 = e(c(j2));
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
        if (t == null && (bo1.c != o || l() != p))
        {
            f.a();
            bo1.d = true;
        }
        View view;
        int j2;
        int j3;
        int l3;
        int j4;
        if (r() > 0 && (t == null || t.c <= 0))
        {
            if (bo1.d)
            {
                for (j1 = 0; j1 < g; j1++)
                {
                    h[j1].c();
                    if (bo1.b != 0x80000000)
                    {
                        h[j1].c(bo1.b);
                    }
                }

            } else
            {
                int k2 = 0;
                while (k2 < g) 
                {
                    br br1 = h[k2];
                    boolean flag4 = c;
                    int i4 = bo1.b;
                    int k1;
                    if (flag4)
                    {
                        k1 = br1.b(0x80000000);
                    } else
                    {
                        k1 = br1.a(0x80000000);
                    }
                    br1.c();
                    if (k1 != 0x80000000 && (!flag4 || k1 >= br1.e.a.d()) && (flag4 || k1 <= br1.e.a.c()))
                    {
                        int k3 = k1;
                        if (i4 != 0x80000000)
                        {
                            k3 = k1 + i4;
                        }
                        br1.b = k3;
                        br1.a = k3;
                    }
                    k2++;
                }
            }
        }
        a(az1);
        z = false;
        j = b.f() / g;
        u = android.view.View.MeasureSpec.makeMeasureSpec(b.f(), 0x40000000);
        if (i == 1)
        {
            v = android.view.View.MeasureSpec.makeMeasureSpec(j, 0x40000000);
            w = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        } else
        {
            w = android.view.View.MeasureSpec.makeMeasureSpec(j, 0x40000000);
            v = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        }
        a(bo1.a, bf1);
        if (bo1.c)
        {
            g(-1);
            a(az1, k, bf1);
            g(1);
            k.b = bo1.a + k.c;
            a(az1, k, bf1);
        } else
        {
            g(1);
            a(az1, k, bf1);
            g(-1);
            k.b = bo1.a + k.c;
            a(az1, k, bf1);
        }
        if (r() > 0)
        {
            if (c)
            {
                a(az1, bf1, true);
                b(az1, bf1, false);
            } else
            {
                b(az1, bf1, true);
                a(az1, bf1, false);
            }
        }
        if (bf1.a()) goto _L22; else goto _L21
_L21:
        if (n == 0 || r() <= 0) goto _L24; else goto _L23
_L23:
        flag = flag1;
        if (z) goto _L26; else goto _L25
_L25:
        if (d() == null) goto _L24; else goto _L27
_L27:
        flag = flag1;
_L26:
        if (flag)
        {
            a(B);
            az1 = B;
            if (super.r != null)
            {
                ViewCompat.postOnAnimation(super.r, az1);
            }
        }
        d = -1;
        e = 0x80000000;
_L22:
        o = bo1.c;
        p = l();
        t = null;
        return;
_L24:
        flag = false;
        if (true) goto _L26; else goto _L28
_L28:
        if (true) goto _L30; else goto _L29
_L29:
    }

    public final int d(bf bf1)
    {
        return h(bf1);
    }

    public final void d(int i1)
    {
        super.d(i1);
        for (int j1 = 0; j1 < g; j1++)
        {
            h[j1].d(i1);
        }

    }

    public final void d(int i1, int j1)
    {
        b(i1, j1, 3);
    }

    public final int e(bf bf1)
    {
        return i(bf1);
    }

    public final void e(int i1)
    {
        super.e(i1);
        for (int j1 = 0; j1 < g; j1++)
        {
            h[j1].d(i1);
        }

    }

    public final boolean e()
    {
        return t == null;
    }

    public final int f(bf bf1)
    {
        return i(bf1);
    }

    public final Parcelable f()
    {
        if (t != null)
        {
            return new SavedState(t);
        }
        SavedState savedstate = new SavedState();
        savedstate.h = l;
        savedstate.i = o;
        savedstate.j = p;
        if (f != null && f.a != null)
        {
            savedstate.f = f.a;
            savedstate.e = savedstate.f.length;
            savedstate.g = f.b;
        } else
        {
            savedstate.e = 0;
        }
        if (r() > 0)
        {
            j();
            View view;
            int i1;
            int j1;
            if (o)
            {
                i1 = m();
            } else
            {
                i1 = B();
            }
            savedstate.a = i1;
            if (c)
            {
                view = b(true);
            } else
            {
                view = a(true);
            }
            if (view == null)
            {
                i1 = -1;
            } else
            {
                i1 = e(view);
            }
            savedstate.b = i1;
            savedstate.c = g;
            savedstate.d = new int[g];
            j1 = 0;
            while (j1 < g) 
            {
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
            }
        } else
        {
            savedstate.a = -1;
            savedstate.b = -1;
            savedstate.c = 0;
        }
        return savedstate;
    }

    public final void f(int i1)
    {
        if (i1 == 0)
        {
            c();
        }
    }

    public final boolean g()
    {
        return i == 0;
    }

    public final boolean h()
    {
        return i == 1;
    }

    private class LazySpanLookup
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

        LazySpanLookup()
        {
        }
    }


    private class LayoutParams extends RecyclerView.LayoutParams
    {

        br e;
        boolean f;

        public final void a()
        {
            f = true;
        }

        public final int b()
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


    private class SavedState
        implements Parcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new bq();
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
