// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import aae;
import aai;
import aau;
import abd;
import abh;
import abk;
import abm;
import abq;
import abt;
import abu;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import km;
import mw;
import nb;
import nn;
import nx;

// Referenced classes of package android.support.v7.widget:
//            RecyclerView

public final class StaggeredGridLayoutManager extends abd
{

    public aau a;
    private aau b;
    private int c;
    private aae d;
    private boolean e;
    private boolean f;
    private int g;
    private int h;
    private boolean i;
    private boolean m;
    private SavedState n;
    private int o;
    private int p;
    private final Rect q;
    private final abt r;
    private final Runnable s;

    private static int a(int k, int l, int i1)
    {
        int j1;
        if (l != 0 || i1 != 0)
        {
            if ((j1 = android.view.View.MeasureSpec.getMode(k)) == 0x80000000 || j1 == 0x40000000)
            {
                return android.view.View.MeasureSpec.makeMeasureSpec(Math.max(0, android.view.View.MeasureSpec.getSize(k) - l - i1), j1);
            }
        }
        return k;
    }

    private int a(abh abh, aae aae1, abm abm1)
    {
        throw new NullPointerException();
    }

    static int a(StaggeredGridLayoutManager staggeredgridlayoutmanager, int k)
    {
        return staggeredgridlayoutmanager.h(k);
    }

    private View a(boolean flag)
    {
        b();
        int l = a.b();
        int i1 = a.c();
        int j1 = p();
        View view = null;
        for (int k = 0; k < j1; k++)
        {
            View view1 = d(k);
            int k1 = a.a(view1);
            if (a.b(view1) <= l || k1 >= i1)
            {
                continue;
            }
            if (k1 >= l || !flag)
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

    private void a(int k)
    {
        boolean flag = true;
        d.d = k;
        aae aae1 = d;
        boolean flag2 = f;
        boolean flag1;
        if (k == -1)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag2 == flag1)
        {
            k = ((flag) ? 1 : 0);
        } else
        {
            k = -1;
        }
        aae1.c = k;
    }

    private void a(int k, abm abm1)
    {
        boolean flag1;
        flag1 = false;
        d.a = 0;
        d.b = k;
        if (!n()) goto _L2; else goto _L1
_L1:
        int l = abm1.a;
        if (l == -1) goto _L2; else goto _L3
_L3:
        boolean flag3 = f;
        boolean flag;
        boolean flag2;
        if (l < k)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        if (flag3 == flag2)
        {
            k = a.e();
            l = 0;
        } else
        {
            l = a.e();
            k = 0;
        }
_L5:
        flag = flag1;
        if (super.k != null)
        {
            flag = flag1;
            if (RecyclerView.t(super.k))
            {
                flag = true;
            }
        }
        if (flag)
        {
            d.e = a.b() - l;
            d.f = k + a.c();
            return;
        } else
        {
            d.f = k + a.d();
            d.e = -l;
            return;
        }
_L2:
        k = 0;
        l = 0;
        if (true) goto _L5; else goto _L4
_L4:
    }

    private void a(abh abh, int k)
    {
        if (p() > 0)
        {
            abh = d(0);
            if (a.b(abh) <= k)
            {
                abh = (LayoutParams)abh.getLayoutParams();
                throw new NullPointerException();
            }
        }
    }

    private void a(abh abh, aae aae1)
    {
        if (aae1.a == 0)
        {
            if (aae1.d == -1)
            {
                b(abh, aae1.f);
                return;
            } else
            {
                a(abh, aae1.e);
                return;
            }
        }
        if (aae1.d == -1)
        {
            int k = aae1.e - abu.a(aae1.e);
            if (k < 0)
            {
                k = aae1.f;
            } else
            {
                k = aae1.f - Math.min(k, aae1.a);
            }
            b(abh, k);
            return;
        }
        int l = abu.b(aae1.f) - aae1.f;
        if (l < 0)
        {
            l = aae1.e;
        } else
        {
            int i1 = aae1.e;
            l = Math.min(l, aae1.a) + i1;
        }
        a(abh, l);
    }

    private void a(abh abh, abm abm1, boolean flag)
    {
        int k = abu.b(a.c());
        k = a.c() - k;
        if (k > 0)
        {
            k -= -d(-k, abh, abm1);
            if (flag && k > 0)
            {
                a.a(k);
            }
        }
    }

    private View b(boolean flag)
    {
        b();
        int l = a.b();
        int i1 = a.c();
        View view = null;
        for (int k = p() - 1; k >= 0; k--)
        {
            View view1 = d(k);
            int j1 = a.a(view1);
            int k1 = a.b(view1);
            if (k1 <= l || j1 >= i1)
            {
                continue;
            }
            if (k1 <= i1 || !flag)
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

    private void b()
    {
        if (a == null)
        {
            a = aau.a(this, 0);
            b = aau.a(this, 1);
            d = new aae();
        }
    }

    private void b(int k, int l, int i1)
    {
        int j1;
        if (f)
        {
            j1 = i();
        } else
        {
            j1 = j();
        }
        if (i1 == 8)
        {
            if (k < l)
            {
                i1 = k;
                k = l + 1;
                k = i1;
            } else
            {
                i1 = k + 1;
                k = l;
                k = i1;
            }
        } else
        {
            i1 = k;
            l = k + l;
            k = i1;
            k = l;
        }
        throw new NullPointerException();
    }

    private void b(abh abh, int k)
    {
        int l = p() - 1;
        if (l >= 0)
        {
            abh = d(l);
            if (a.a(abh) >= k)
            {
                abh = (LayoutParams)abh.getLayoutParams();
                throw new NullPointerException();
            }
        }
    }

    private void b(abh abh, abm abm1, boolean flag)
    {
        int k = abu.a(a.b()) - a.b();
        if (k > 0)
        {
            k -= d(k, abh, abm1);
            if (flag && k > 0)
            {
                a.a(-k);
            }
        }
    }

    private void c()
    {
        boolean flag;
        if (!h())
        {
            flag = e;
        } else
        if (!e)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        f = flag;
    }

    private int d(int k, abh abh, abm abm1)
    {
        b();
        int l;
        int i1;
        int j1;
        if (k > 0)
        {
            l = 1;
            i1 = i();
        } else
        {
            l = -1;
            i1 = j();
        }
        a(i1, abm1);
        a(l);
        d.b = i1 + d.c;
        j1 = Math.abs(k);
        d.a = j1;
        i1 = a(abh, d, abm1);
        l = k;
        if (j1 >= i1)
        {
            if (k < 0)
            {
                l = -i1;
            } else
            {
                l = i1;
            }
        }
        a.a(-l);
        i = f;
        return l;
    }

    private int g(abm abm1)
    {
        if (p() == 0)
        {
            return 0;
        } else
        {
            b();
            return abq.a(abm1, a, a(true), b(true), this, false, f);
        }
    }

    private int h(int k)
    {
        if (p() != 0) goto _L2; else goto _L1
_L1:
        if (!f) goto _L4; else goto _L3
_L3:
        return 1;
_L4:
        return -1;
_L2:
        boolean flag;
        if (k < j())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag != f)
        {
            return -1;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    private int h(abm abm1)
    {
        if (p() == 0)
        {
            return 0;
        } else
        {
            b();
            return abq.a(abm1, a, a(true), b(true), this, false);
        }
    }

    private boolean h()
    {
        return km.h(super.k) == 1;
    }

    private int i()
    {
        int k = p();
        if (k == 0)
        {
            return 0;
        } else
        {
            return b(d(k - 1));
        }
    }

    private int i(abm abm1)
    {
        if (p() == 0)
        {
            return 0;
        } else
        {
            b();
            return abq.b(abm1, a, a(true), b(true), this, false);
        }
    }

    private int j()
    {
        if (p() == 0)
        {
            return 0;
        } else
        {
            return b(d(0));
        }
    }

    public final int a(int k, abh abh, abm abm1)
    {
        return d(k, abh, abm1);
    }

    public final int a(abh abh, abm abm1)
    {
        return 0;
    }

    public final int a(abm abm1)
    {
        return g(abm1);
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

    public final void a(abh abh, abm abm1, View view, nb nb1)
    {
        abh = view.getLayoutParams();
        if (!(abh instanceof LayoutParams))
        {
            super.a(view, nb1);
            return;
        }
        abh = (LayoutParams)abh;
        int k;
        if (((LayoutParams) (abh)).a == null)
        {
            k = -1;
        } else
        {
            k = ((LayoutParams) (abh)).a.d;
        }
        nb1.a(nn.a(k, 1, -1, -1, false));
    }

    public final void a(Parcelable parcelable)
    {
        if (parcelable instanceof SavedState)
        {
            n = (SavedState)parcelable;
            m();
        }
    }

    public final void a(RecyclerView recyclerview)
    {
        LazySpanLookup.a();
        m();
    }

    public final void a(RecyclerView recyclerview, int k)
    {
        recyclerview = new aai(recyclerview.getContext()) {

            private StaggeredGridLayoutManager g;

            public final PointF a(int l)
            {
                l = StaggeredGridLayoutManager.a(g, l);
                if (l == 0)
                {
                    return null;
                } else
                {
                    return new PointF(l, 0.0F);
                }
            }

            
            {
                g = StaggeredGridLayoutManager.this;
                super(context);
            }
        };
        recyclerview.a = k;
        a(((abk) (recyclerview)));
    }

    public final void a(RecyclerView recyclerview, int k, int l)
    {
        b(k, l, 1);
    }

    public final void a(RecyclerView recyclerview, int k, int l, int i1)
    {
        b(k, l, 8);
    }

    public final void a(RecyclerView recyclerview, abh abh)
    {
        recyclerview = s;
        if (super.k != null)
        {
            super.k.removeCallbacks(recyclerview);
        }
    }

    public final void a(AccessibilityEvent accessibilityevent)
    {
        View view;
        View view1;
label0:
        {
            super.a(accessibilityevent);
            if (p() > 0)
            {
                accessibilityevent = mw.a(accessibilityevent);
                view = a(false);
                view1 = b(false);
                if (view != null && view1 != null)
                {
                    break label0;
                }
            }
            return;
        }
        int k = b(view);
        int l = b(view1);
        if (k < l)
        {
            accessibilityevent.b(k);
            accessibilityevent.c(l);
            return;
        } else
        {
            accessibilityevent.b(l);
            accessibilityevent.c(k);
            return;
        }
    }

    public final void a(String s1)
    {
        if (n == null)
        {
            super.a(s1);
        }
    }

    public final boolean a(RecyclerView.LayoutParams layoutparams)
    {
        return layoutparams instanceof LayoutParams;
    }

    public final int b(int k, abh abh, abm abm1)
    {
        return d(k, abh, abm1);
    }

    public final int b(abh abh, abm abm1)
    {
        return super.b(abh, abm1);
    }

    public final int b(abm abm1)
    {
        return g(abm1);
    }

    public final void b(RecyclerView recyclerview, int k, int l)
    {
        b(k, l, 2);
    }

    public final int c(abm abm1)
    {
        return h(abm1);
    }

    public final void c(int k)
    {
        if (n != null && n.a != k)
        {
            SavedState savedstate = n;
            savedstate.d = null;
            savedstate.c = 0;
            savedstate.a = -1;
            savedstate.b = -1;
        }
        g = k;
        h = 0x80000000;
        m();
    }

    public final void c(abh abh, abm abm1)
    {
        abt abt1;
        int k;
        b();
        abt1 = r;
        abt1.a = -1;
        abt1.b = false;
        if ((n != null || g != -1) && abm1.b() == 0)
        {
            c(abh);
            return;
        }
        if (n != null)
        {
            if (n.c > 0 && n.c != 0)
            {
                SavedState savedstate = n;
                savedstate.d = null;
                savedstate.c = 0;
                savedstate.e = 0;
                savedstate.f = null;
                savedstate.g = null;
                n.a = n.b;
            }
            m = n.j;
            boolean flag = n.h;
            a(((String) (null)));
            if (n != null && n.h != flag)
            {
                n.h = flag;
            }
            e = flag;
            m();
            c();
            int l;
            int j1;
            if (n.a != -1)
            {
                g = n.a;
                abt1.b = n.i;
            } else
            {
                abt1.b = f;
            }
            if (n.e > 1)
            {
                int ai[] = n.f;
                List list = n.g;
            }
        } else
        {
            c();
            abt1.b = f;
        }
        if (abm1.f || g == -1)
        {
            k = 0;
        } else
        {
label0:
            {
                if (g >= 0 && g < abm1.b())
                {
                    break label0;
                }
                g = -1;
                h = 0x80000000;
                k = 0;
            }
        }
_L11:
        if (k != 0) goto _L2; else goto _L1
_L1:
        if (!i) goto _L4; else goto _L3
_L3:
        j1 = abm1.b();
        k = p() - 1;
_L13:
        if (k < 0) goto _L6; else goto _L5
_L5:
        l = b(d(k));
        if (l < 0 || l >= j1) goto _L8; else goto _L7
_L7:
        k = l;
_L14:
        abt1.a = k;
_L2:
        if (n == null && (abt1.b != i || h() != m))
        {
            LazySpanLookup.a();
        }
        if (p() > 0 && n != null)
        {
            k = n.c;
        }
        a(abh);
        c = b.e() / 0;
        android.view.View.MeasureSpec.makeMeasureSpec(b.e(), 0x40000000);
        p = android.view.View.MeasureSpec.makeMeasureSpec(c, 0x40000000);
        o = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        a(abt1.a, abm1);
        View view;
        int i1;
        int k1;
        int l1;
        int i2;
        boolean flag1;
        if (abt1.b)
        {
            a(-1);
            a(abh, d, abm1);
            a(1);
            d.b = abt1.a + d.c;
            a(abh, d, abm1);
        } else
        {
            a(1);
            a(abh, d, abm1);
            a(-1);
            d.b = abt1.a + d.c;
            a(abh, d, abm1);
        }
        if (p() > 0)
        {
            if (f)
            {
                a(abh, abm1, true);
                b(abh, abm1, false);
            } else
            {
                b(abh, abm1, true);
                a(abh, abm1, false);
            }
        }
        if (!abm1.f)
        {
            g = -1;
            h = 0x80000000;
        }
        i = abt1.b;
        m = h();
        n = null;
        return;
        if (n != null && n.a != -1 && n.c > 0)
        {
            break MISSING_BLOCK_LABEL_979;
        }
        view = b(g);
        if (view == null) goto _L10; else goto _L9
_L9:
label1:
        {
            if (f)
            {
                k = i();
            } else
            {
                k = j();
            }
            abt1.a = k;
            if (h == 0x80000000)
            {
                break label1;
            }
            if (abt1.b)
            {
                a.c();
                a.b(view);
            } else
            {
                a.b();
                a.a(view);
            }
            k = 1;
        }
          goto _L11
        if (a.c(view) > a.e())
        {
            if (abt1.b)
            {
                a.c();
            } else
            {
                a.b();
            }
        } else
        if (a.a(view) - a.b() < 0 || a.c() - a.b(view) < 0);
_L12:
        k = 1;
          goto _L11
_L10:
        abt1.a = g;
        if (h == 0x80000000)
        {
            if (h(abt1.a) == 1)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            abt1.b = flag1;
            if (abt1.b)
            {
                abt1.c.a.c();
            } else
            {
                abt1.c.a.b();
            }
        } else
        if (abt1.b)
        {
            abt1.c.a.c();
        } else
        {
            abt1.c.a.b();
        }
          goto _L12
        abt1.a = g;
          goto _L12
_L8:
        k--;
          goto _L13
_L6:
        k = 0;
          goto _L14
_L4:
        l1 = abm1.b();
        i2 = p();
        i1 = 0;
_L18:
        if (i1 >= i2) goto _L16; else goto _L15
_L15:
        k1 = b(d(i1));
        if (k1 < 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        k = k1;
        if (k1 < l1) goto _L14; else goto _L17
_L17:
        i1++;
          goto _L18
_L16:
        k = 0;
          goto _L14
    }

    public final void c(RecyclerView recyclerview, int k, int l)
    {
        b(k, l, 4);
    }

    public final int d(abm abm1)
    {
        return h(abm1);
    }

    public final boolean d()
    {
        return n == null;
    }

    public final int e(abm abm1)
    {
        return i(abm1);
    }

    public final Parcelable e()
    {
        if (n != null)
        {
            return new SavedState(n);
        }
        SavedState savedstate = new SavedState();
        savedstate.h = e;
        savedstate.i = i;
        savedstate.j = m;
        savedstate.e = 0;
        if (p() > 0)
        {
            b();
            View view;
            int k;
            if (i)
            {
                k = i();
            } else
            {
                k = j();
            }
            savedstate.a = k;
            if (f)
            {
                view = b(true);
            } else
            {
                view = a(true);
            }
            if (view == null)
            {
                k = -1;
            } else
            {
                k = b(view);
            }
            savedstate.b = k;
            savedstate.c = 0;
            savedstate.d = new int[0];
        } else
        {
            savedstate.a = -1;
            savedstate.b = -1;
            savedstate.c = 0;
        }
        return savedstate;
    }

    public final void e(int k)
    {
        super.e(k);
    }

    public final int f(abm abm1)
    {
        return i(abm1);
    }

    public final void f(int k)
    {
        super.f(k);
    }

    public final boolean f()
    {
        return true;
    }

    public final void g(int k)
    {
        if (k == 0)
        {
            p();
        }
    }

    public final boolean g()
    {
        return false;
    }

    private class LayoutParams extends RecyclerView.LayoutParams
    {

        abu a;

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


    private class SavedState
        implements Parcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public final Object createFromParcel(Parcel parcel)
            {
                return new SavedState(parcel);
            }

            public final volatile Object[] newArray(int k)
            {
                return new SavedState[k];
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

        public void writeToParcel(Parcel parcel, int k)
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
                k = 1;
            } else
            {
                k = 0;
            }
            parcel.writeInt(k);
            if (i)
            {
                k = 1;
            } else
            {
                k = 0;
            }
            parcel.writeInt(k);
            if (j)
            {
                k = ((flag) ? 1 : 0);
            } else
            {
                k = 0;
            }
            parcel.writeInt(k);
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


    private class LazySpanLookup
    {

        int a[];
        List b;

        static void a()
        {
            throw new NullPointerException();
        }

        static void a(int k)
        {
            throw new NullPointerException();
        }

        static void a(int k, int l)
        {
            throw new NullPointerException();
        }

        static void b(int k, int l)
        {
            throw new NullPointerException();
        }
    }

}
