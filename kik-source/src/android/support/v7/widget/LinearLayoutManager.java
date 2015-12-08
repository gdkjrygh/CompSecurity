// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.accessibility.AccessibilityEventCompat;
import android.support.v4.view.accessibility.AccessibilityRecordCompat;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

// Referenced classes of package android.support.v7.widget:
//            q, aa, RecyclerView, m, 
//            o, b, n

public class LinearLayoutManager extends RecyclerView.i
{
    static class SavedState
        implements Parcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new n();
        int a;
        int b;
        boolean c;

        final boolean a()
        {
            return a >= 0;
        }

        public int describeContents()
        {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i1)
        {
            parcel.writeInt(a);
            parcel.writeInt(b);
            if (c)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            parcel.writeInt(i1);
        }


        public SavedState()
        {
        }

        SavedState(Parcel parcel)
        {
            boolean flag = true;
            super();
            a = parcel.readInt();
            b = parcel.readInt();
            if (parcel.readInt() != 1)
            {
                flag = false;
            }
            c = flag;
        }

        public SavedState(SavedState savedstate)
        {
            a = savedstate.a;
            b = savedstate.b;
            c = savedstate.c;
        }
    }

    final class a
    {

        int a;
        int b;
        boolean c;
        final LinearLayoutManager d;

        final void a()
        {
            int i1;
            if (c)
            {
                i1 = d.k.d();
            } else
            {
                i1 = d.k.c();
            }
            b = i1;
        }

        public final void a(View view)
        {
            if (c)
            {
                b = d.k.b(view) + d.k.b();
            } else
            {
                b = d.k.a(view);
            }
            a = LinearLayoutManager.e(view);
        }

        public final String toString()
        {
            return (new StringBuilder("AnchorInfo{mPosition=")).append(a).append(", mCoordinate=").append(b).append(", mLayoutFromEnd=").append(c).append('}').toString();
        }

        a()
        {
            d = LinearLayoutManager.this;
            super();
        }
    }

    protected static final class b
    {

        public int a;
        public boolean b;
        public boolean c;
        public boolean d;

        protected b()
        {
        }
    }

    static final class c
    {

        boolean a;
        int b;
        int c;
        int d;
        int e;
        int f;
        int g;
        int h;
        boolean i;
        int j;
        List k;

        final View a(RecyclerView.m m1)
        {
            if (k != null)
            {
                int j1 = k.size();
                for (int i1 = 0; i1 < j1; i1++)
                {
                    m1 = (RecyclerView.t)k.get(i1);
                    if (!m1.m() && d == m1.c())
                    {
                        a(((RecyclerView.t) (m1)));
                        return ((RecyclerView.t) (m1)).a;
                    }
                }

                return null;
            } else
            {
                m1 = m1.b(d);
                d = d + e;
                return m1;
            }
        }

        public final void a(RecyclerView.t t)
        {
            int l1 = k.size();
            RecyclerView.t t1 = null;
            int i1 = 0x7fffffff;
            for (int j1 = 0; j1 < l1; j1++)
            {
                RecyclerView.t t2 = (RecyclerView.t)k.get(j1);
                if (t2 == t || t2.m())
                {
                    continue;
                }
                int k1 = (t2.c() - d) * e;
                if (k1 < 0 || k1 >= i1)
                {
                    continue;
                }
                t1 = t2;
                if (k1 == 0)
                {
                    break;
                }
                t1 = t2;
                i1 = k1;
            }

            if (t1 == null)
            {
                i1 = -1;
            } else
            {
                i1 = t1.c();
            }
            d = i1;
        }

        final boolean a(RecyclerView.q q1)
        {
            return d >= 0 && d < q1.e();
        }

        c()
        {
            a = true;
            h = 0;
            i = false;
            k = null;
        }
    }


    private c a;
    private boolean b;
    private boolean c;
    private boolean d;
    private boolean e;
    private boolean f;
    int j;
    q k;
    boolean l;
    int m;
    int n;
    SavedState o;
    final a p;

    public LinearLayoutManager()
    {
        this(1, false);
    }

    public LinearLayoutManager(int i1, boolean flag)
    {
        c = false;
        l = false;
        d = false;
        e = true;
        m = -1;
        n = 0x80000000;
        o = null;
        p = new a();
        if (i1 != 0 && i1 != 1)
        {
            throw new IllegalArgumentException((new StringBuilder("invalid orientation:")).append(i1).toString());
        }
        a(((String) (null)));
        if (i1 != j)
        {
            j = i1;
            k = null;
            l();
        }
        a(((String) (null)));
        if (flag != c)
        {
            c = flag;
            l();
        }
    }

    private int a(int i1, RecyclerView.m m1, RecyclerView.q q1, boolean flag)
    {
        int j1 = k.d() - i1;
        if (j1 > 0)
        {
            int k1 = -d(-j1, m1, q1);
            j1 = k1;
            if (flag)
            {
                i1 = k.d() - (i1 + k1);
                j1 = k1;
                if (i1 > 0)
                {
                    k.a(i1);
                    j1 = k1 + i1;
                }
            }
            return j1;
        } else
        {
            return 0;
        }
    }

    private int a(RecyclerView.m m1, c c1, RecyclerView.q q1, boolean flag)
    {
        int k1 = c1.c;
        if (c1.g != 0x80000000)
        {
            if (c1.c < 0)
            {
                c1.g = c1.g + c1.c;
            }
            a(m1, c1);
        }
        int i1 = c1.c + c1.h;
        b b1 = new b();
label0:
        do
        {
            int j1;
            do
            {
label1:
                {
                    if (i1 <= 0 || !c1.a(q1))
                    {
                        break label0;
                    }
                    b1.a = 0;
                    b1.b = false;
                    b1.c = false;
                    b1.d = false;
                    a(m1, q1, c1, b1);
                    if (b1.b)
                    {
                        break label0;
                    }
                    c1.b = c1.b + b1.a * c1.f;
                    if (b1.c && a.k == null)
                    {
                        j1 = i1;
                        if (q1.a())
                        {
                            break label1;
                        }
                    }
                    c1.c = c1.c - b1.a;
                    j1 = i1 - b1.a;
                }
                if (c1.g != 0x80000000)
                {
                    c1.g = c1.g + b1.a;
                    if (c1.c < 0)
                    {
                        c1.g = c1.g + c1.c;
                    }
                    a(m1, c1);
                }
                i1 = j1;
            } while (!flag);
            i1 = j1;
        } while (!b1.d);
        return k1 - c1.c;
    }

    private View a(int i1, int j1, boolean flag)
    {
        i();
        int k1 = k.c();
        int l1 = k.d();
        View view;
        byte byte0;
        if (j1 > i1)
        {
            byte0 = 1;
        } else
        {
            byte0 = -1;
        }
        view = null;
        for (; i1 != j1; i1 += byte0)
        {
            View view1 = d(i1);
            int i2 = k.a(view1);
            int j2 = k.b(view1);
            if (i2 >= l1 || j2 <= k1)
            {
                continue;
            }
            if (!flag || i2 >= k1 && j2 <= l1)
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

    private View a(boolean flag)
    {
        if (l)
        {
            return a(p() - 1, -1, flag);
        } else
        {
            return a(0, p(), flag);
        }
    }

    private void a(int i1, int j1, boolean flag, RecyclerView.q q1)
    {
        byte byte0 = -1;
        boolean flag1 = true;
        a.h = g(q1);
        a.f = i1;
        if (i1 == 1)
        {
            q1 = a;
            q1.h = ((c) (q1)).h + k.g();
            q1 = z();
            c c1 = a;
            if (l)
            {
                i1 = byte0;
            } else
            {
                i1 = 1;
            }
            c1.e = i1;
            a.d = e(q1) + a.e;
            a.b = k.b(q1);
            i1 = k.b(q1) - k.d();
        } else
        {
            q1 = y();
            c c2 = a;
            c2.h = c2.h + k.c();
            c2 = a;
            if (l)
            {
                i1 = ((flag1) ? 1 : 0);
            } else
            {
                i1 = -1;
            }
            c2.e = i1;
            a.d = e(q1) + a.e;
            a.b = k.a(q1);
            i1 = -k.a(q1) + k.c();
        }
        a.c = j1;
        if (flag)
        {
            q1 = a;
            q1.c = ((c) (q1)).c - i1;
        }
        a.g = i1;
    }

    private void a(a a1)
    {
        f(a1.a, a1.b);
    }

    private void a(RecyclerView.m m1, int i1, int j1)
    {
        if (i1 != j1) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int k1;
        k1 = i1;
        if (j1 <= i1)
        {
            break; /* Loop/switch isn't completed */
        }
        j1--;
        while (j1 >= i1) 
        {
            a(j1, m1);
            j1--;
        }
        if (true) goto _L1; else goto _L3
_L3:
        while (k1 > j1) 
        {
            a(k1, m1);
            k1--;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    private void a(RecyclerView.m m1, c c1)
    {
        if (c1.a) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (c1.f != -1)
        {
            break; /* Loop/switch isn't completed */
        }
        int i1 = c1.g;
        int j2 = p();
        if (i1 >= 0)
        {
            int l2 = k.e() - i1;
            if (l)
            {
                int j1 = 0;
                while (j1 < j2) 
                {
                    c1 = d(j1);
                    if (k.a(c1) < l2)
                    {
                        a(m1, 0, j1);
                        return;
                    }
                    j1++;
                }
            } else
            {
                int k1 = j2 - 1;
                while (k1 >= 0) 
                {
                    c1 = d(k1);
                    if (k.a(c1) < l2)
                    {
                        a(m1, j2 - 1, k1);
                        return;
                    }
                    k1--;
                }
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
        int k2;
        int i3;
        k2 = c1.g;
        if (k2 < 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        i3 = p();
        if (!l)
        {
            break; /* Loop/switch isn't completed */
        }
        int l1 = i3 - 1;
        while (l1 >= 0) 
        {
            c1 = d(l1);
            if (k.b(c1) > k2)
            {
                a(m1, i3 - 1, l1);
                return;
            }
            l1--;
        }
        if (true) goto _L1; else goto _L4
_L4:
        int i2 = 0;
        while (i2 < i3) 
        {
            c1 = d(i2);
            if (k.b(c1) > k2)
            {
                a(m1, 0, i2);
                return;
            }
            i2++;
        }
        if (true) goto _L1; else goto _L5
_L5:
    }

    private int b(int i1, RecyclerView.m m1, RecyclerView.q q1, boolean flag)
    {
        int j1 = i1 - k.c();
        if (j1 > 0)
        {
            int k1 = -d(j1, m1, q1);
            j1 = k1;
            if (flag)
            {
                i1 = (i1 + k1) - k.c();
                j1 = k1;
                if (i1 > 0)
                {
                    k.a(-i1);
                    j1 = k1 - i1;
                }
            }
            return j1;
        } else
        {
            return 0;
        }
    }

    private View b(boolean flag)
    {
        if (l)
        {
            return a(0, p(), flag);
        } else
        {
            return a(p() - 1, -1, flag);
        }
    }

    private void b(a a1)
    {
        g(a1.a, a1.b);
    }

    private void c()
    {
        boolean flag = true;
        if (j != 1 && h()) goto _L2; else goto _L1
_L1:
        flag = c;
_L4:
        l = flag;
        return;
_L2:
        if (c)
        {
            flag = false;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private int d(int i1, RecyclerView.m m1, RecyclerView.q q1)
    {
        if (p() == 0 || i1 == 0)
        {
            return 0;
        }
        a.a = true;
        i();
        int j1;
        int k1;
        int l1;
        if (i1 > 0)
        {
            j1 = 1;
        } else
        {
            j1 = -1;
        }
        k1 = Math.abs(i1);
        a(j1, k1, true, q1);
        l1 = a.g + a(m1, a, q1, false);
        if (l1 < 0)
        {
            return 0;
        }
        if (k1 > l1)
        {
            i1 = j1 * l1;
        }
        k.a(-i1);
        a.j = i1;
        return i1;
    }

    private View d(RecyclerView.m m1, RecyclerView.q q1)
    {
        if (l)
        {
            return f(m1, q1);
        } else
        {
            return g(m1, q1);
        }
    }

    private View e(RecyclerView.m m1, RecyclerView.q q1)
    {
        if (l)
        {
            return g(m1, q1);
        } else
        {
            return f(m1, q1);
        }
    }

    private View f(RecyclerView.m m1, RecyclerView.q q1)
    {
        return a(m1, q1, 0, p(), q1.e());
    }

    private void f(int i1, int j1)
    {
        a.c = k.d() - j1;
        c c1 = a;
        int k1;
        if (l)
        {
            k1 = -1;
        } else
        {
            k1 = 1;
        }
        c1.e = k1;
        a.d = i1;
        a.f = 1;
        a.b = j1;
        a.g = 0x80000000;
    }

    private int g(RecyclerView.q q1)
    {
        if (q1.d())
        {
            return k.f();
        } else
        {
            return 0;
        }
    }

    private View g(RecyclerView.m m1, RecyclerView.q q1)
    {
        return a(m1, q1, p() - 1, -1, q1.e());
    }

    private void g(int i1, int j1)
    {
        a.c = j1 - k.c();
        a.d = i1;
        c c1 = a;
        if (l)
        {
            i1 = 1;
        } else
        {
            i1 = -1;
        }
        c1.e = i1;
        a.f = -1;
        a.b = j1;
        a.g = 0x80000000;
    }

    private int h(RecyclerView.q q1)
    {
        boolean flag1 = true;
        if (p() == 0)
        {
            return 0;
        }
        i();
        q q2 = k;
        View view;
        boolean flag;
        if (!e)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        view = a(flag);
        if (!e)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        return aa.a(q1, q2, view, b(flag), this, e, l);
    }

    private int i(RecyclerView.q q1)
    {
        boolean flag1 = true;
        if (p() == 0)
        {
            return 0;
        }
        i();
        q q2 = k;
        View view;
        boolean flag;
        if (!e)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        view = a(flag);
        if (!e)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        return aa.a(q1, q2, view, b(flag), this, e);
    }

    private int j(RecyclerView.q q1)
    {
        boolean flag1 = true;
        if (p() == 0)
        {
            return 0;
        }
        i();
        q q2 = k;
        View view;
        boolean flag;
        if (!e)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        view = a(flag);
        if (!e)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        return aa.b(q1, q2, view, b(flag), this, e);
    }

    private View y()
    {
        int i1;
        if (l)
        {
            i1 = p() - 1;
        } else
        {
            i1 = 0;
        }
        return d(i1);
    }

    private View z()
    {
        int i1;
        if (l)
        {
            i1 = 0;
        } else
        {
            i1 = p() - 1;
        }
        return d(i1);
    }

    public final int a(int i1, RecyclerView.m m1, RecyclerView.q q1)
    {
        if (j == 1)
        {
            return 0;
        } else
        {
            return d(i1, m1, q1);
        }
    }

    public final int a(RecyclerView.q q1)
    {
        return h(q1);
    }

    View a(RecyclerView.m m1, RecyclerView.q q1, int i1, int j1, int k1)
    {
label0:
        {
            Object obj;
label1:
            {
                m1 = null;
                i();
                int i2 = k.c();
                int j2 = k.d();
                int l1;
                if (j1 > i1)
                {
                    l1 = 1;
                } else
                {
                    l1 = -1;
                }
                q1 = null;
                while (i1 != j1) 
                {
                    View view = d(i1);
                    int k2 = e(view);
                    if (k2 >= 0 && k2 < k1)
                    {
                        if (((RecyclerView.LayoutParams)view.getLayoutParams()).a.m())
                        {
                            if (q1 == null)
                            {
                                q1 = view;
                            }
                        } else
                        {
                            if (k.a(view) < j2)
                            {
                                obj = view;
                                if (k.b(view) >= i2)
                                {
                                    break label1;
                                }
                            }
                            if (m1 == null)
                            {
                                m1 = view;
                            }
                        }
                    }
                    i1 += l1;
                }
                if (m1 == null)
                {
                    break label0;
                }
                obj = m1;
            }
            return ((View) (obj));
        }
        return q1;
    }

    public final void a(Parcelable parcelable)
    {
        if (parcelable instanceof SavedState)
        {
            o = (SavedState)parcelable;
            l();
        }
    }

    void a(RecyclerView.m m1, RecyclerView.q q1, a a1)
    {
    }

    void a(RecyclerView.m m1, RecyclerView.q q1, c c1, b b1)
    {
        boolean flag2 = false;
        boolean flag = false;
        m1 = c1.a(m1);
        if (m1 == null)
        {
            b1.b = true;
            return;
        }
        q1 = (RecyclerView.LayoutParams)m1.getLayoutParams();
        int i1;
        int j1;
        int k1;
        int l1;
        if (c1.k == null)
        {
            flag2 = l;
            if (c1.f == -1)
            {
                flag = true;
            }
            RecyclerView.LayoutParams layoutparams;
            Rect rect;
            if (flag2 == flag)
            {
                c(m1);
            } else
            {
                d(m1);
            }
        } else
        {
            boolean flag3 = l;
            boolean flag1 = flag2;
            if (c1.f == -1)
            {
                flag1 = true;
            }
            if (flag3 == flag1)
            {
                a(((View) (m1)));
            } else
            {
                b(m1);
            }
        }
        layoutparams = (RecyclerView.LayoutParams)m1.getLayoutParams();
        rect = super.r.e(m1);
        i1 = rect.left;
        j1 = rect.right;
        k1 = rect.top;
        l1 = rect.bottom;
        m1.measure(RecyclerView.i.a(q(), i1 + j1 + 0 + (s() + u() + layoutparams.leftMargin + layoutparams.rightMargin), layoutparams.width, f()), RecyclerView.i.a(r(), l1 + k1 + 0 + (t() + v() + layoutparams.topMargin + layoutparams.bottomMargin), layoutparams.height, g()));
        b1.a = k.c(m1);
        if (j == 1)
        {
            if (h())
            {
                i1 = q() - u();
                j1 = i1 - k.d(m1);
            } else
            {
                j1 = s();
                i1 = k.d(m1) + j1;
            }
            if (c1.f == -1)
            {
                k1 = c1.b;
                l1 = c1.b - b1.a;
            } else
            {
                l1 = c1.b;
                k1 = c1.b;
                int i2 = b1.a;
                k1 += i2;
            }
        } else
        {
            l1 = t();
            k1 = k.d(m1) + l1;
            if (c1.f == -1)
            {
                i1 = c1.b;
                j1 = c1.b - b1.a;
            } else
            {
                j1 = c1.b;
                i1 = c1.b + b1.a;
            }
        }
        a(((View) (m1)), j1 + ((RecyclerView.LayoutParams) (q1)).leftMargin, l1 + ((RecyclerView.LayoutParams) (q1)).topMargin, i1 - ((RecyclerView.LayoutParams) (q1)).rightMargin, k1 - ((RecyclerView.LayoutParams) (q1)).bottomMargin);
        if (((RecyclerView.LayoutParams) (q1)).a.m() || ((RecyclerView.LayoutParams) (q1)).a.k())
        {
            b1.c = true;
        }
        b1.d = m1.isFocusable();
    }

    public final void a(RecyclerView recyclerview, int i1)
    {
        recyclerview = new m(this, recyclerview.getContext());
        recyclerview.b(i1);
        a(((RecyclerView.p) (recyclerview)));
    }

    public final void a(RecyclerView recyclerview, RecyclerView.m m1)
    {
        super.a(recyclerview, m1);
        if (f)
        {
            c(m1);
            m1.a();
        }
    }

    public final void a(AccessibilityEvent accessibilityevent)
    {
        super.a(accessibilityevent);
        if (p() > 0)
        {
            accessibilityevent = AccessibilityEventCompat.asRecord(accessibilityevent);
            accessibilityevent.setFromIndex(j());
            accessibilityevent.setToIndex(k());
        }
    }

    public final void a(String s)
    {
        if (o == null)
        {
            super.a(s);
        }
    }

    public final int b(int i1, RecyclerView.m m1, RecyclerView.q q1)
    {
        if (j == 0)
        {
            return 0;
        } else
        {
            return d(i1, m1, q1);
        }
    }

    public final int b(RecyclerView.q q1)
    {
        return h(q1);
    }

    public RecyclerView.LayoutParams b()
    {
        return new RecyclerView.LayoutParams(-2, -2);
    }

    public final View b(int i1)
    {
        int j1 = p();
        if (j1 != 0) goto _L2; else goto _L1
_L1:
        View view = null;
_L4:
        return view;
_L2:
        View view1;
        int k1 = i1 - e(d(0));
        if (k1 < 0 || k1 >= j1)
        {
            break; /* Loop/switch isn't completed */
        }
        view1 = d(k1);
        view = view1;
        if (e(view1) == i1) goto _L4; else goto _L3
_L3:
        return super.b(i1);
    }

    public final int c(RecyclerView.q q1)
    {
        return i(q1);
    }

    public final View c(int i1, RecyclerView.m m1, RecyclerView.q q1)
    {
        c();
        if (p() != 0) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        i1;
        JVM INSTR lookupswitch 6: default 72
    //                   1: 181
    //                   2: 186
    //                   17: 229
    //                   33: 191
    //                   66: 247
    //                   130: 210;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L3:
        i1 = 0x80000000;
_L10:
        if (i1 != 0x80000000)
        {
            i();
            View view;
            if (i1 == -1)
            {
                view = e(m1, q1);
            } else
            {
                view = d(m1, q1);
            }
            if (view != null)
            {
                i();
                a(i1, (int)(0.33F * (float)k.f()), false, q1);
                a.g = 0x80000000;
                a.a = false;
                a(m1, a, q1, true);
                if (i1 == -1)
                {
                    m1 = y();
                } else
                {
                    m1 = z();
                }
                if (m1 != view && m1.isFocusable())
                {
                    return m1;
                }
            }
        }
        if (true) goto _L1; else goto _L4
_L4:
        i1 = -1;
          goto _L10
_L5:
        i1 = 1;
          goto _L10
_L7:
        if (j == 1)
        {
            i1 = -1;
        } else
        {
            i1 = 0x80000000;
        }
          goto _L10
_L9:
        if (j == 1)
        {
            i1 = 1;
        } else
        {
            i1 = 0x80000000;
        }
          goto _L10
_L6:
        if (j == 0)
        {
            i1 = -1;
        } else
        {
            i1 = 0x80000000;
        }
          goto _L10
_L8:
        if (j == 0)
        {
            i1 = 1;
        } else
        {
            i1 = 0x80000000;
        }
          goto _L10
    }

    public final void c(int i1)
    {
        m = i1;
        n = 0x80000000;
        if (o != null)
        {
            o.a = -1;
        }
        l();
    }

    public void c(RecyclerView.m m1, RecyclerView.q q1)
    {
        Object obj;
        Object obj1;
        int i1;
        int j1;
        int k1;
        int l1;
        if (o != null && o.a())
        {
            m = o.a;
        }
        i();
        a.a = false;
        c();
        obj = p;
        obj.a = -1;
        obj.b = 0x80000000;
        obj.c = false;
        p.c = l ^ d;
        obj1 = p;
        RecyclerView.LayoutParams layoutparams;
        int i2;
        if (q1.a() || m == -1)
        {
            i1 = 0;
        } else
        if (m < 0 || m >= q1.e())
        {
            m = -1;
            n = 0x80000000;
            i1 = 0;
        } else
        {
label0:
            {
                obj1.a = m;
                if (o == null || !o.a())
                {
                    break label0;
                }
                obj1.c = o.c;
                if (((a) (obj1)).c)
                {
                    obj1.b = k.d() - o.b;
                } else
                {
                    obj1.b = k.c() + o.b;
                }
                i1 = 1;
            }
        }
_L8:
        if (i1 != 0) goto _L2; else goto _L1
_L1:
        if (p() == 0)
        {
            break MISSING_BLOCK_LABEL_1700;
        }
        boolean flag;
        if (super.r == null)
        {
            obj = null;
        } else
        {
            obj = super.r.getFocusedChild();
            if (obj == null || super.q.b(((View) (obj))))
            {
                obj = null;
            }
        }
        if (obj == null) goto _L4; else goto _L3
_L3:
        layoutparams = (RecyclerView.LayoutParams)((View) (obj)).getLayoutParams();
        if (!layoutparams.a.m() && layoutparams.a.c() >= 0 && layoutparams.a.c() < q1.e())
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 == 0) goto _L4; else goto _L5
_L5:
        j1 = ((a) (obj1)).d.k.b();
        if (j1 >= 0)
        {
            ((a) (obj1)).a(((View) (obj)));
        } else
        {
            obj1.a = e(((View) (obj)));
            if (((a) (obj1)).c)
            {
                i1 = ((a) (obj1)).d.k.d() - j1 - ((a) (obj1)).d.k.b(((View) (obj)));
                obj1.b = ((a) (obj1)).d.k.d() - i1;
                if (i1 > 0)
                {
                    j1 = ((a) (obj1)).d.k.c(((View) (obj)));
                    k1 = ((a) (obj1)).b;
                    l1 = ((a) (obj1)).d.k.c();
                    j1 = k1 - j1 - (Math.min(((a) (obj1)).d.k.a(((View) (obj))) - l1, 0) + l1);
                    if (j1 < 0)
                    {
                        k1 = ((a) (obj1)).b;
                        obj1.b = Math.min(i1, -j1) + k1;
                    }
                }
            } else
            {
                k1 = ((a) (obj1)).d.k.a(((View) (obj)));
                i1 = k1 - ((a) (obj1)).d.k.c();
                obj1.b = k1;
                if (i1 > 0)
                {
                    l1 = ((a) (obj1)).d.k.c(((View) (obj)));
                    int j2 = ((a) (obj1)).d.k.d();
                    int l2 = ((a) (obj1)).d.k.b(((View) (obj)));
                    j1 = ((a) (obj1)).d.k.d() - Math.min(0, j2 - j1 - l2) - (k1 + l1);
                    if (j1 < 0)
                    {
                        obj1.b = ((a) (obj1)).b - Math.min(i1, -j1);
                    }
                }
            }
        }
        i1 = 1;
_L11:
        if (i1 == 0)
        {
            ((a) (obj1)).a();
            if (d)
            {
                i1 = q1.e() - 1;
            } else
            {
                i1 = 0;
            }
            obj1.a = i1;
        }
_L2:
        i1 = g(q1);
        if (a.j >= 0)
        {
            j1 = 0;
        } else
        {
            j1 = i1;
            i1 = 0;
        }
        k1 = j1 + k.c();
        l1 = i1 + k.g();
        i1 = l1;
        j1 = k1;
        if (q1.a())
        {
            i1 = l1;
            j1 = k1;
            if (m != -1)
            {
                i1 = l1;
                j1 = k1;
                if (n != 0x80000000)
                {
                    obj = b(m);
                    i1 = l1;
                    j1 = k1;
                    if (obj != null)
                    {
                        if (l)
                        {
                            i1 = k.d() - k.b(((View) (obj))) - n;
                        } else
                        {
                            i1 = k.a(((View) (obj)));
                            j1 = k.c();
                            i1 = n - (i1 - j1);
                        }
                        if (i1 > 0)
                        {
                            j1 = k1 + i1;
                            i1 = l1;
                        } else
                        {
                            i1 = l1 - i1;
                            j1 = k1;
                        }
                    }
                }
            }
        }
        a(m1, q1, p);
        a(m1);
        a.i = q1.a();
        if (p.c)
        {
            b(p);
            a.h = j1;
            a(m1, a, q1, false);
            l1 = a.b;
            i2 = a.d;
            j1 = i1;
            if (a.c > 0)
            {
                j1 = i1 + a.c;
            }
            a(p);
            a.h = j1;
            obj = a;
            obj.d = ((c) (obj)).d + a.e;
            a(m1, a, q1, false);
            k1 = a.b;
            int k2;
            int i3;
            int j3;
            int k3;
            boolean flag1;
            if (a.c > 0)
            {
                i1 = a.c;
                g(i2, l1);
                a.h = i1;
                a(m1, a, q1, false);
                i1 = a.b;
            } else
            {
                i1 = l1;
            }
            j1 = i1;
            i1 = k1;
        } else
        {
            a(p);
            a.h = i1;
            a(m1, a, q1, false);
            k1 = a.b;
            k2 = a.d;
            i1 = j1;
            if (a.c > 0)
            {
                i1 = j1 + a.c;
            }
            b(p);
            a.h = i1;
            obj = a;
            obj.d = ((c) (obj)).d + a.e;
            a(m1, a, q1, false);
            l1 = a.b;
            i1 = k1;
            j1 = l1;
            if (a.c > 0)
            {
                i1 = a.c;
                f(k2, k1);
                a.h = i1;
                a(m1, a, q1, false);
                i1 = a.b;
                j1 = l1;
            }
        }
        if (p() > 0)
        {
            if (l ^ d)
            {
                k1 = a(i1, m1, q1, true);
                l1 = j1 + k1;
                j1 = b(l1, m1, q1, false);
                l1 += j1;
                k1 = i1 + k1 + j1;
            } else
            {
                k1 = b(j1, m1, q1, true);
                i1 += k1;
                k2 = a(i1, m1, q1, false);
                l1 = j1 + k1 + k2;
                k1 = i1 + k2;
            }
        } else
        {
            k1 = i1;
            l1 = j1;
        }
        if (q1.b() && p() != 0 && !q1.a() && d())
        {
            i1 = 0;
            j1 = 0;
            obj = m1.b();
            j3 = ((List) (obj)).size();
            k3 = e(d(0));
            k2 = 0;
            while (k2 < j3) 
            {
                obj1 = (RecyclerView.t)((List) (obj)).get(k2);
                if (!((RecyclerView.t) (obj1)).m())
                {
                    if (((RecyclerView.t) (obj1)).c() < k3)
                    {
                        flag1 = true;
                    } else
                    {
                        flag1 = false;
                    }
                    if (flag1 != l)
                    {
                        i3 = -1;
                    } else
                    {
                        i3 = 1;
                    }
                    if (i3 == -1)
                    {
                        i3 = k.c(((RecyclerView.t) (obj1)).a) + i1;
                        i1 = j1;
                        j1 = i3;
                    } else
                    {
                        i3 = k.c(((RecyclerView.t) (obj1)).a) + j1;
                        j1 = i1;
                        i1 = i3;
                    }
                } else
                {
                    i3 = i1;
                    i1 = j1;
                    j1 = i3;
                }
                i3 = j1;
                k2++;
                j1 = i1;
                i1 = i3;
            }
            a.k = ((List) (obj));
            if (i1 > 0)
            {
                g(e(y()), l1);
                a.h = i1;
                a.c = 0;
                a.a(null);
                a(m1, a, q1, false);
            }
            if (j1 > 0)
            {
                f(e(z()), k1);
                a.h = j1;
                a.c = 0;
                a.a(null);
                a(m1, a, q1, false);
            }
            a.k = null;
        }
        if (!q1.a())
        {
            m = -1;
            n = 0x80000000;
            k.a();
        }
        b = d;
        o = null;
        return;
        if (n != 0x80000000)
        {
            break MISSING_BLOCK_LABEL_1148;
        }
        obj = b(m);
        if (obj == null) goto _L7; else goto _L6
_L6:
        if (k.c(((View) (obj))) > k.f())
        {
            ((a) (obj1)).a();
        } else
        if (k.a(((View) (obj))) - k.c() < 0)
        {
            obj1.b = k.c();
            obj1.c = false;
        } else
        {
label1:
            {
                if (k.d() - k.b(((View) (obj))) >= 0)
                {
                    break label1;
                }
                obj1.b = k.d();
                obj1.c = true;
            }
        }
_L10:
        i1 = 1;
          goto _L8
        if (((a) (obj1)).c)
        {
            i1 = k.b(((View) (obj))) + k.b();
        } else
        {
            i1 = k.a(((View) (obj)));
        }
        obj1.b = i1;
_L9:
        i1 = 1;
          goto _L8
_L7:
        if (p() > 0)
        {
            i1 = e(d(0));
            if (m < i1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag == l)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            obj1.c = flag;
        }
        ((a) (obj1)).a();
          goto _L9
        obj1.c = l;
        if (l)
        {
            obj1.b = k.d() - n;
        } else
        {
            obj1.b = k.c() + n;
        }
          goto _L10
_L4:
        if (b != d)
        {
            break MISSING_BLOCK_LABEL_1700;
        }
        if (((a) (obj1)).c)
        {
            obj = d(m1, q1);
        } else
        {
            obj = e(m1, q1);
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_1700;
        }
        ((a) (obj1)).a(((View) (obj)));
        if (!q1.a() && d())
        {
            if (k.a(((View) (obj))) >= k.d() || k.b(((View) (obj))) < k.c())
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            if (i1 != 0)
            {
                if (((a) (obj1)).c)
                {
                    i1 = k.d();
                } else
                {
                    i1 = k.c();
                }
                obj1.b = i1;
            }
        }
        i1 = 1;
          goto _L11
        i1 = 0;
          goto _L11
    }

    public final int d(RecyclerView.q q1)
    {
        return i(q1);
    }

    public boolean d()
    {
        return o == null && b == d;
    }

    public final int e(RecyclerView.q q1)
    {
        return j(q1);
    }

    public final Parcelable e()
    {
        if (o != null)
        {
            return new SavedState(o);
        }
        SavedState savedstate = new SavedState();
        if (p() > 0)
        {
            i();
            boolean flag = b ^ l;
            savedstate.c = flag;
            if (flag)
            {
                View view = z();
                savedstate.b = k.d() - k.b(view);
                savedstate.a = e(view);
                return savedstate;
            } else
            {
                View view1 = y();
                savedstate.a = e(view1);
                savedstate.b = k.a(view1) - k.c();
                return savedstate;
            }
        } else
        {
            savedstate.a = -1;
            return savedstate;
        }
    }

    public final void e(int i1, int j1)
    {
        m = i1;
        n = j1;
        if (o != null)
        {
            o.a = -1;
        }
        l();
    }

    public final int f(RecyclerView.q q1)
    {
        return j(q1);
    }

    public final boolean f()
    {
        return j == 0;
    }

    public final boolean g()
    {
        return j == 1;
    }

    protected final boolean h()
    {
        return ViewCompat.getLayoutDirection(super.r) == 1;
    }

    final void i()
    {
        if (a == null)
        {
            a = new c();
        }
        if (k == null)
        {
            k = q.a(this, j);
        }
    }

    public final int j()
    {
        View view = a(0, p(), false);
        if (view == null)
        {
            return -1;
        } else
        {
            return e(view);
        }
    }

    public final int k()
    {
        View view = a(p() - 1, -1, false);
        if (view == null)
        {
            return -1;
        } else
        {
            return e(view);
        }
    }
}
