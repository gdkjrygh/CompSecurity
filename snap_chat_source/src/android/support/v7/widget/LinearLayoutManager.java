// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import aY;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import bE;
import bG;
import bI;
import bj;
import bo;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package android.support.v7.widget:
//            RecyclerView

public class LinearLayoutManager extends RecyclerView.i
{
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
                i1 = d.d.c();
            } else
            {
                i1 = d.d.b();
            }
            b = i1;
        }

        public final void a(View view)
        {
            if (c)
            {
                b = d.d.b(view) + d.d.a();
            } else
            {
                b = d.d.a(view);
            }
            a = LinearLayoutManager.a(view);
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

    public static final class b
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
        int i;
        List j;

        final View a(RecyclerView.n n1)
        {
            if (j != null)
            {
                int j1 = j.size();
                for (int i1 = 0; i1 < j1; i1++)
                {
                    n1 = (RecyclerView.v)j.get(i1);
                    if (!n1.o() && d == n1.d())
                    {
                        a(((RecyclerView.v) (n1)));
                        return ((RecyclerView.v) (n1)).a;
                    }
                }

                return null;
            } else
            {
                n1 = n1.b(d);
                d = d + e;
                return n1;
            }
        }

        public final void a(RecyclerView.v v)
        {
            int l1 = j.size();
            RecyclerView.v v1 = null;
            int i1 = 0x7fffffff;
            for (int j1 = 0; j1 < l1; j1++)
            {
                RecyclerView.v v2 = (RecyclerView.v)j.get(j1);
                if (v2 == v || v2.o())
                {
                    continue;
                }
                int k1 = (v2.d() - d) * e;
                if (k1 < 0 || k1 >= i1)
                {
                    continue;
                }
                v1 = v2;
                if (k1 == 0)
                {
                    break;
                }
                v1 = v2;
                i1 = k1;
            }

            if (v1 == null)
            {
                i1 = -1;
            } else
            {
                i1 = v1.d();
            }
            d = i1;
        }

        final boolean a(RecyclerView.s s)
        {
            return d >= 0 && d < s.a();
        }

        c()
        {
            a = true;
            h = 0;
            j = null;
        }
    }


    private c a;
    private boolean b;
    public int c;
    bI d;
    boolean e;
    SavedState f;
    private int j;
    private int k;
    private a l;

    public LinearLayoutManager()
    {
        this(1);
    }

    public LinearLayoutManager(int i1)
    {
        e = false;
        b = true;
        j = -1;
        k = 0x80000000;
        f = null;
        l = new a();
        if (i1 != 0 && i1 != 1)
        {
            throw new IllegalArgumentException((new StringBuilder("invalid orientation:")).append(i1).toString());
        }
        a(((String) (null)));
        if (i1 != c)
        {
            c = i1;
            d = null;
            q();
        }
        a(((String) (null)));
    }

    private void B()
    {
        boolean flag = true;
        if (c == 1 || !k())
        {
            flag = false;
        }
        e = flag;
    }

    private View C()
    {
        int i1;
        if (e)
        {
            i1 = s() - 1;
        } else
        {
            i1 = 0;
        }
        return e(i1);
    }

    private View D()
    {
        int i1;
        if (e)
        {
            i1 = 0;
        } else
        {
            i1 = s() - 1;
        }
        return e(i1);
    }

    private int a(int i1, RecyclerView.n n1, RecyclerView.s s, boolean flag)
    {
        int j1 = d.c() - i1;
        if (j1 > 0)
        {
            int k1 = -d(-j1, n1, s);
            j1 = k1;
            if (flag)
            {
                i1 = d.c() - (i1 + k1);
                j1 = k1;
                if (i1 > 0)
                {
                    d.a(i1);
                    j1 = k1 + i1;
                }
            }
            return j1;
        } else
        {
            return 0;
        }
    }

    private int a(RecyclerView.n n1, c c1, RecyclerView.s s, boolean flag)
    {
        int k1 = c1.c;
        if (c1.g != 0x80000000)
        {
            if (c1.c < 0)
            {
                c1.g = c1.g + c1.c;
            }
            a(n1, c1);
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
                    if (i1 <= 0 || !c1.a(s))
                    {
                        break label0;
                    }
                    b1.a = 0;
                    b1.b = false;
                    b1.c = false;
                    b1.d = false;
                    a(n1, s, c1, b1);
                    if (b1.b)
                    {
                        break label0;
                    }
                    c1.b = c1.b + b1.a * c1.f;
                    if (b1.c && a.j == null)
                    {
                        j1 = i1;
                        if (s.j)
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
                    a(n1, c1);
                }
                i1 = j1;
            } while (!flag);
            i1 = j1;
        } while (!b1.d);
        return k1 - c1.c;
    }

    private View a(int i1, int j1, boolean flag, boolean flag1)
    {
        l();
        int k1 = d.b();
        int l1 = d.c();
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
            View view1 = e(i1);
            int i2 = d.a(view1);
            int j2 = d.b(view1);
            if (i2 >= l1 || j2 <= k1)
            {
                continue;
            }
            if (!flag || i2 >= k1 && j2 <= l1)
            {
                return view1;
            }
            if (flag1 && view == null)
            {
                view = view1;
            }
        }

        return view;
    }

    private View a(boolean flag)
    {
        if (e)
        {
            return a(s() - 1, -1, flag, true);
        } else
        {
            return a(0, s(), flag, true);
        }
    }

    private void a(int i1, int j1, boolean flag, RecyclerView.s s)
    {
        byte byte0 = -1;
        boolean flag1 = true;
        a.h = g(s);
        a.f = i1;
        if (i1 == 1)
        {
            s = a;
            s.h = ((c) (s)).h + d.f();
            s = D();
            c c1 = a;
            if (e)
            {
                i1 = byte0;
            } else
            {
                i1 = 1;
            }
            c1.e = i1;
            a.d = a(((View) (s))) + a.e;
            a.b = d.b(s);
            i1 = d.b(s) - d.c();
        } else
        {
            s = C();
            c c2 = a;
            c2.h = c2.h + d.b();
            c2 = a;
            if (e)
            {
                i1 = ((flag1) ? 1 : 0);
            } else
            {
                i1 = -1;
            }
            c2.e = i1;
            a.d = a(((View) (s))) + a.e;
            a.b = d.a(s);
            i1 = -d.a(s) + d.b();
        }
        a.c = j1;
        if (flag)
        {
            s = a;
            s.c = ((c) (s)).c - i1;
        }
        a.g = i1;
    }

    private void a(a a1)
    {
        b(a1.a, a1.b);
    }

    private void a(RecyclerView.n n1, int i1, int j1)
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
            a(j1, n1);
            j1--;
        }
        if (true) goto _L1; else goto _L3
_L3:
        while (k1 > j1) 
        {
            a(k1, n1);
            k1--;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    private void a(RecyclerView.n n1, c c1)
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
        int j2 = s();
        if (i1 >= 0)
        {
            int l2 = d.d() - i1;
            if (e)
            {
                int j1 = 0;
                while (j1 < j2) 
                {
                    c1 = e(j1);
                    if (d.a(c1) < l2)
                    {
                        a(n1, 0, j1);
                        return;
                    }
                    j1++;
                }
            } else
            {
                int k1 = j2 - 1;
                while (k1 >= 0) 
                {
                    c1 = e(k1);
                    if (d.a(c1) < l2)
                    {
                        a(n1, j2 - 1, k1);
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
        i3 = s();
        if (!e)
        {
            break; /* Loop/switch isn't completed */
        }
        int l1 = i3 - 1;
        while (l1 >= 0) 
        {
            c1 = e(l1);
            if (d.b(c1) > k2)
            {
                a(n1, i3 - 1, l1);
                return;
            }
            l1--;
        }
        if (true) goto _L1; else goto _L4
_L4:
        int i2 = 0;
        while (i2 < i3) 
        {
            c1 = e(i2);
            if (d.b(c1) > k2)
            {
                a(n1, 0, i2);
                return;
            }
            i2++;
        }
        if (true) goto _L1; else goto _L5
_L5:
    }

    private void a(RecyclerView.n n1, RecyclerView.s s, int i1, int j1)
    {
        if (!s.l || s() == 0 || s.j || !g())
        {
            return;
        }
        int k1 = 0;
        int l1 = 0;
        List list = n1.d;
        int i3 = list.size();
        int j3 = a(e(0));
        int i2 = 0;
        while (i2 < i3) 
        {
            RecyclerView.v v = (RecyclerView.v)list.get(i2);
            if (!v.o())
            {
                int j2;
                boolean flag;
                if (v.d() < j3)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (flag != e)
                {
                    j2 = -1;
                } else
                {
                    j2 = 1;
                }
                if (j2 == -1)
                {
                    j2 = d.c(v.a) + k1;
                    k1 = l1;
                    l1 = j2;
                } else
                {
                    int k2 = d.c(v.a) + l1;
                    l1 = k1;
                    k1 = k2;
                }
            } else
            {
                int l2 = k1;
                k1 = l1;
                l1 = l2;
            }
            j2 = i2 + 1;
            i2 = l1;
            l1 = k1;
            k1 = i2;
            i2 = j2;
        }
        a.j = list;
        if (k1 > 0)
        {
            c(a(C()), i1);
            a.h = k1;
            a.c = 0;
            a.a(null);
            a(n1, a, s, false);
        }
        if (l1 > 0)
        {
            b(a(D()), j1);
            a.h = l1;
            a.c = 0;
            a.a(null);
            a(n1, a, s, false);
        }
        a.j = null;
    }

    private int b(int i1, RecyclerView.n n1, RecyclerView.s s, boolean flag)
    {
        int j1 = i1 - d.b();
        if (j1 > 0)
        {
            int k1 = -d(j1, n1, s);
            j1 = k1;
            if (flag)
            {
                i1 = (i1 + k1) - d.b();
                j1 = k1;
                if (i1 > 0)
                {
                    d.a(-i1);
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
        if (e)
        {
            return a(0, s(), flag, true);
        } else
        {
            return a(s() - 1, -1, flag, true);
        }
    }

    private void b(int i1, int j1)
    {
        a.c = d.c() - j1;
        c c1 = a;
        int k1;
        if (e)
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

    private void b(a a1)
    {
        c(a1.a, a1.b);
    }

    private void c(int i1, int j1)
    {
        a.c = j1 - d.b();
        a.d = i1;
        c c1 = a;
        if (e)
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

    private int d(int i1, RecyclerView.n n1, RecyclerView.s s)
    {
        if (s() == 0 || i1 == 0)
        {
            return 0;
        }
        a.a = true;
        l();
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
        a(j1, k1, true, s);
        l1 = a.g + a(n1, a, s, false);
        if (l1 < 0)
        {
            return 0;
        }
        if (k1 > l1)
        {
            i1 = j1 * l1;
        }
        d.a(-i1);
        a.i = i1;
        return i1;
    }

    private View d(RecyclerView.n n1, RecyclerView.s s)
    {
        if (e)
        {
            return f(n1, s);
        } else
        {
            return g(n1, s);
        }
    }

    private View e(RecyclerView.n n1, RecyclerView.s s)
    {
        if (e)
        {
            return g(n1, s);
        } else
        {
            return f(n1, s);
        }
    }

    private View f(RecyclerView.n n1, RecyclerView.s s)
    {
        return a(n1, s, 0, s(), s.a());
    }

    private int g(RecyclerView.s s)
    {
        int i1 = 0;
        boolean flag;
        if (s.a != -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            i1 = d.e();
        }
        return i1;
    }

    private View g(RecyclerView.n n1, RecyclerView.s s)
    {
        return a(n1, s, s() - 1, -1, s.a());
    }

    private int h(RecyclerView.s s)
    {
        boolean flag2 = true;
        boolean flag = false;
        int j1;
        if (s() == 0)
        {
            j1 = ((flag) ? 1 : 0);
        } else
        {
            l();
            bI bi = d;
            View view;
            View view1;
            boolean flag1;
            if (!b)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            view = a(flag1);
            if (!b)
            {
                flag1 = flag2;
            } else
            {
                flag1 = false;
            }
            view1 = b(flag1);
            flag1 = b;
            flag2 = e;
            j1 = ((flag) ? 1 : 0);
            if (s() != 0)
            {
                j1 = ((flag) ? 1 : 0);
                if (s.a() != 0)
                {
                    j1 = ((flag) ? 1 : 0);
                    if (view != null)
                    {
                        j1 = ((flag) ? 1 : 0);
                        if (view1 != null)
                        {
                            int i1 = Math.min(RecyclerView.i.a(view), RecyclerView.i.a(view1));
                            j1 = Math.max(RecyclerView.i.a(view), RecyclerView.i.a(view1));
                            if (flag2)
                            {
                                i1 = Math.max(0, s.a() - j1 - 1);
                            } else
                            {
                                i1 = Math.max(0, i1);
                            }
                            j1 = i1;
                            if (flag1)
                            {
                                int k1 = Math.abs(bi.b(view1) - bi.a(view));
                                int l1 = Math.abs(RecyclerView.i.a(view) - RecyclerView.i.a(view1));
                                float f1 = (float)k1 / (float)(l1 + 1);
                                float f2 = i1;
                                return Math.round((float)(bi.b() - bi.a(view)) + f1 * f2);
                            }
                        }
                    }
                }
            }
        }
        return j1;
    }

    private int i(RecyclerView.s s)
    {
        boolean flag1 = true;
        if (s() != 0)
        {
            l();
            bI bi = d;
            View view;
            View view1;
            boolean flag;
            if (!b)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            view = a(flag);
            if (!b)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            view1 = b(flag);
            flag = b;
            if (s() != 0 && s.a() != 0 && view != null && view1 != null)
            {
                if (!flag)
                {
                    return Math.abs(RecyclerView.i.a(view) - RecyclerView.i.a(view1)) + 1;
                } else
                {
                    int i1 = bi.b(view1);
                    int j1 = bi.a(view);
                    return Math.min(bi.e(), i1 - j1);
                }
            }
        }
        return 0;
    }

    private int j(RecyclerView.s s)
    {
        boolean flag1 = true;
        if (s() != 0)
        {
            l();
            bI bi = d;
            View view;
            View view1;
            boolean flag;
            if (!b)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            view = a(flag);
            if (!b)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            view1 = b(flag);
            flag = b;
            if (s() != 0 && s.a() != 0 && view != null && view1 != null)
            {
                if (!flag)
                {
                    return s.a();
                } else
                {
                    int i1 = bi.b(view1);
                    int j1 = bi.a(view);
                    int k1 = Math.abs(RecyclerView.i.a(view) - RecyclerView.i.a(view1));
                    return (int)(((float)(i1 - j1) / (float)(k1 + 1)) * (float)s.a());
                }
            }
        }
        return 0;
    }

    public final int a(int i1, RecyclerView.n n1, RecyclerView.s s)
    {
        if (c == 1)
        {
            return 0;
        } else
        {
            return d(i1, n1, s);
        }
    }

    public final int a(RecyclerView.s s)
    {
        return h(s);
    }

    public final View a(int i1)
    {
        int j1 = s();
        if (j1 != 0) goto _L2; else goto _L1
_L1:
        View view = null;
_L4:
        return view;
_L2:
        View view1;
        int k1 = i1 - a(e(0));
        if (k1 < 0 || k1 >= j1)
        {
            break; /* Loop/switch isn't completed */
        }
        view1 = e(k1);
        view = view1;
        if (a(view1) == i1) goto _L4; else goto _L3
_L3:
        return super.a(i1);
    }

    View a(RecyclerView.n n1, RecyclerView.s s, int i1, int j1, int k1)
    {
label0:
        {
            Object obj;
label1:
            {
                n1 = null;
                l();
                int i2 = d.b();
                int j2 = d.c();
                int l1;
                if (j1 > i1)
                {
                    l1 = 1;
                } else
                {
                    l1 = -1;
                }
                s = null;
                while (i1 != j1) 
                {
                    View view = e(i1);
                    int k2 = a(view);
                    if (k2 >= 0 && k2 < k1)
                    {
                        if (((RecyclerView.LayoutParams)view.getLayoutParams()).c.o())
                        {
                            if (s == null)
                            {
                                s = view;
                            }
                        } else
                        {
                            if (d.a(view) < j2)
                            {
                                obj = view;
                                if (d.b(view) >= i2)
                                {
                                    break label1;
                                }
                            }
                            if (n1 == null)
                            {
                                n1 = view;
                            }
                        }
                    }
                    i1 += l1;
                }
                if (n1 == null)
                {
                    break label0;
                }
                obj = n1;
            }
            return ((View) (obj));
        }
        return s;
    }

    public final void a(int i1, int j1)
    {
        j = i1;
        k = j1;
        if (f != null)
        {
            f.a = -1;
        }
        q();
    }

    public final void a(Parcelable parcelable)
    {
        if (parcelable instanceof SavedState)
        {
            f = (SavedState)parcelable;
            q();
        }
    }

    void a(RecyclerView.n n1, RecyclerView.s s, a a1)
    {
    }

    void a(RecyclerView.n n1, RecyclerView.s s, c c1, b b1)
    {
        n1 = c1.a(n1);
        if (n1 == null)
        {
            b1.b = true;
            return;
        }
        s = (RecyclerView.LayoutParams)n1.getLayoutParams();
        int i1;
        int j1;
        int k1;
        int l1;
        if (c1.j == null)
        {
            boolean flag2 = e;
            RecyclerView.LayoutParams layoutparams;
            Rect rect;
            boolean flag;
            if (c1.f == -1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag2 == flag)
            {
                a(n1, -1);
            } else
            {
                a(((View) (n1)), 0);
            }
        } else
        {
            boolean flag3 = e;
            boolean flag1;
            if (c1.f == -1)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (flag3 == flag1)
            {
                super.a(n1, -1, true);
            } else
            {
                super.a(n1, 0, true);
            }
        }
        layoutparams = (RecyclerView.LayoutParams)n1.getLayoutParams();
        rect = super.h.e(n1);
        i1 = rect.left;
        j1 = rect.right;
        k1 = rect.top;
        l1 = rect.bottom;
        n1.measure(RecyclerView.i.a(t(), i1 + j1 + 0 + (v() + x() + layoutparams.leftMargin + layoutparams.rightMargin), layoutparams.width, i()), RecyclerView.i.a(u(), l1 + k1 + 0 + (w() + y() + layoutparams.topMargin + layoutparams.bottomMargin), layoutparams.height, j()));
        b1.a = d.c(n1);
        if (c == 1)
        {
            if (k())
            {
                i1 = t() - x();
                j1 = i1 - d.d(n1);
            } else
            {
                j1 = v();
                i1 = d.d(n1) + j1;
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
            l1 = w();
            k1 = d.d(n1) + l1;
            if (c1.f == -1)
            {
                i1 = c1.b;
                j1 = c1.b - b1.a;
            } else
            {
                j1 = c1.b;
                i1 = c1.b;
                int j2 = b1.a;
                i1 += j2;
            }
        }
        a(((View) (n1)), j1 + ((RecyclerView.LayoutParams) (s)).leftMargin, l1 + ((RecyclerView.LayoutParams) (s)).topMargin, i1 - ((RecyclerView.LayoutParams) (s)).rightMargin, k1 - ((RecyclerView.LayoutParams) (s)).bottomMargin);
        if (((RecyclerView.LayoutParams) (s)).c.o() || ((RecyclerView.LayoutParams) (s)).c.m())
        {
            b1.c = true;
        }
        b1.d = n1.isFocusable();
    }

    public final void a(RecyclerView recyclerview, int i1)
    {
        recyclerview = new bG(recyclerview.getContext()) {

            private LinearLayoutManager g;

            public final PointF a(int j1)
            {
                boolean flag = true;
                boolean flag1 = false;
                LinearLayoutManager linearlayoutmanager = g;
                if (linearlayoutmanager.s() == 0)
                {
                    return null;
                }
                if (j1 < LinearLayoutManager.a(linearlayoutmanager.e(0)))
                {
                    flag1 = true;
                }
                j1 = ((flag) ? 1 : 0);
                if (flag1 != linearlayoutmanager.e)
                {
                    j1 = -1;
                }
                if (linearlayoutmanager.c == 0)
                {
                    return new PointF(j1, 0.0F);
                } else
                {
                    return new PointF(0.0F, j1);
                }
            }

            
            {
                g = LinearLayoutManager.this;
                super(context);
            }
        };
        recyclerview.a = i1;
        a(((RecyclerView.r) (recyclerview)));
    }

    public final void a(AccessibilityEvent accessibilityevent)
    {
        super.a(accessibilityevent);
        if (s() > 0)
        {
            accessibilityevent = bj.a(accessibilityevent);
            accessibilityevent.b(m());
            accessibilityevent.c(o());
        }
    }

    public final void a(String s)
    {
        if (f == null)
        {
            super.a(s);
        }
    }

    public final int b(int i1, RecyclerView.n n1, RecyclerView.s s)
    {
        if (c == 0)
        {
            return 0;
        } else
        {
            return d(i1, n1, s);
        }
    }

    public final int b(RecyclerView.s s)
    {
        return h(s);
    }

    public final void b(int i1)
    {
        j = i1;
        k = 0x80000000;
        if (f != null)
        {
            f.a = -1;
        }
        q();
    }

    public final int c(RecyclerView.s s)
    {
        return i(s);
    }

    public final View c(int i1, RecyclerView.n n1, RecyclerView.s s)
    {
        B();
        if (s() != 0) goto _L2; else goto _L1
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
            l();
            View view;
            if (i1 == -1)
            {
                view = e(n1, s);
            } else
            {
                view = d(n1, s);
            }
            if (view != null)
            {
                l();
                a(i1, (int)(0.33F * (float)d.e()), false, s);
                a.g = 0x80000000;
                a.a = false;
                a(n1, a, s, true);
                if (i1 == -1)
                {
                    n1 = C();
                } else
                {
                    n1 = D();
                }
                if (n1 != view && n1.isFocusable())
                {
                    return n1;
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
        if (c == 1)
        {
            i1 = -1;
        } else
        {
            i1 = 0x80000000;
        }
          goto _L10
_L9:
        if (c == 1)
        {
            i1 = 1;
        } else
        {
            i1 = 0x80000000;
        }
          goto _L10
_L6:
        if (c == 0)
        {
            i1 = -1;
        } else
        {
            i1 = 0x80000000;
        }
          goto _L10
_L8:
        if (c == 0)
        {
            i1 = 1;
        } else
        {
            i1 = 0x80000000;
        }
          goto _L10
    }

    public void c(RecyclerView.n n1, RecyclerView.s s)
    {
        Object obj1;
        if (f != null && f.a())
        {
            j = f.a;
        }
        l();
        a.a = false;
        B();
        a a1 = l;
        a1.a = -1;
        a1.b = 0x80000000;
        a1.c = false;
        l.c = e;
        obj1 = l;
        if (!s.j && j != -1) goto _L2; else goto _L1
_L1:
        int i1 = 0;
_L21:
        if (i1 != 0) goto _L4; else goto _L3
_L3:
        if (s() == 0) goto _L6; else goto _L5
_L5:
        Object obj;
        int j1;
        if (super.h == null)
        {
            obj = null;
        } else
        {
            obj = super.h.getFocusedChild();
            if (obj == null || super.g.a(((View) (obj))))
            {
                obj = null;
            }
        }
        if (obj == null) goto _L8; else goto _L7
_L7:
        RecyclerView.LayoutParams layoutparams = (RecyclerView.LayoutParams)((View) (obj)).getLayoutParams();
        boolean flag;
        if (!layoutparams.c.o() && layoutparams.c.d() >= 0 && layoutparams.c.d() < s.a())
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 == 0) goto _L8; else goto _L9
_L9:
        j1 = ((a) (obj1)).d.d.a();
        if (j1 >= 0)
        {
            ((a) (obj1)).a(((View) (obj)));
        } else
        {
            obj1.a = a(((View) (obj)));
            if (((a) (obj1)).c)
            {
                i1 = ((a) (obj1)).d.d.c() - j1 - ((a) (obj1)).d.d.b(((View) (obj)));
                obj1.b = ((a) (obj1)).d.d.c() - i1;
                if (i1 > 0)
                {
                    j1 = ((a) (obj1)).d.d.c(((View) (obj)));
                    k1 = ((a) (obj1)).b;
                    i2 = ((a) (obj1)).d.d.b();
                    j1 = k1 - j1 - (Math.min(((a) (obj1)).d.d.a(((View) (obj))) - i2, 0) + i2);
                    if (j1 < 0)
                    {
                        k1 = ((a) (obj1)).b;
                        obj1.b = Math.min(i1, -j1) + k1;
                    }
                }
            } else
            {
                k1 = ((a) (obj1)).d.d.a(((View) (obj)));
                i1 = k1 - ((a) (obj1)).d.d.b();
                obj1.b = k1;
                if (i1 > 0)
                {
                    i2 = ((a) (obj1)).d.d.c(((View) (obj)));
                    int k2 = ((a) (obj1)).d.d.c();
                    int i3 = ((a) (obj1)).d.d.b(((View) (obj)));
                    j1 = ((a) (obj1)).d.d.c() - Math.min(0, k2 - j1 - i3) - (k1 + i2);
                    if (j1 < 0)
                    {
                        obj1.b = ((a) (obj1)).b - Math.min(i1, -j1);
                    }
                }
            }
        }
        i1 = 1;
_L19:
        if (i1 == 0)
        {
            ((a) (obj1)).a();
            obj1.a = 0;
        }
_L4:
        i1 = g(s);
        int k1;
        int i2;
        if (a.i >= 0)
        {
            j1 = 0;
        } else
        {
            j1 = i1;
            i1 = 0;
        }
        k1 = j1 + d.b();
        i2 = i1 + d.f();
        i1 = i2;
        j1 = k1;
        if (s.j)
        {
            i1 = i2;
            j1 = k1;
            if (j != -1)
            {
                i1 = i2;
                j1 = k1;
                if (k != 0x80000000)
                {
                    obj = a(j);
                    i1 = i2;
                    j1 = k1;
                    if (obj != null)
                    {
                        if (e)
                        {
                            i1 = d.c() - d.b(((View) (obj))) - k;
                        } else
                        {
                            i1 = d.a(((View) (obj)));
                            j1 = d.b();
                            i1 = k - (i1 - j1);
                        }
                        if (i1 > 0)
                        {
                            j1 = k1 + i1;
                            i1 = i2;
                        } else
                        {
                            i1 = i2 - i1;
                            j1 = k1;
                        }
                    }
                }
            }
        }
        a(n1, s, l);
        k1 = s() - 1;
        while (k1 >= 0) 
        {
            obj = e(k1);
            obj1 = RecyclerView.b(((View) (obj)));
            if (!((RecyclerView.v) (obj1)).L_())
            {
                if (((RecyclerView.v) (obj1)).k() && !((RecyclerView.v) (obj1)).o() && !((RecyclerView.v) (obj1)).m() && !RecyclerView.g(super.h).b)
                {
                    c(k1);
                    n1.a(((RecyclerView.v) (obj1)));
                } else
                {
                    d(k1);
                    obj = RecyclerView.b(((View) (obj)));
                    obj.j = n1;
                    if (!((RecyclerView.v) (obj)).m() || !RecyclerView.i(n1.h))
                    {
                        if (((RecyclerView.v) (obj)).k() && !((RecyclerView.v) (obj)).o() && !RecyclerView.g(n1.h).b)
                        {
                            throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.");
                        }
                        n1.a.add(obj);
                    } else
                    {
                        if (n1.b == null)
                        {
                            n1.b = new ArrayList();
                        }
                        n1.b.add(obj);
                    }
                }
            }
            k1--;
        }
        break; /* Loop/switch isn't completed */
_L2:
        if (j < 0 || j >= s.a())
        {
            j = -1;
            k = 0x80000000;
            i1 = 0;
            continue; /* Loop/switch isn't completed */
        }
        obj1.a = j;
        if (f != null && f.a())
        {
            obj1.c = f.c;
            if (((a) (obj1)).c)
            {
                obj1.b = d.c() - f.b;
            } else
            {
                obj1.b = d.b() + f.b;
            }
            i1 = 1;
            continue; /* Loop/switch isn't completed */
        }
        if (k != 0x80000000) goto _L11; else goto _L10
_L10:
        obj = a(j);
        if (obj == null) goto _L13; else goto _L12
_L12:
        if (d.c(((View) (obj))) <= d.e()) goto _L15; else goto _L14
_L14:
        ((a) (obj1)).a();
_L17:
        i1 = 1;
        continue; /* Loop/switch isn't completed */
_L15:
        if (d.a(((View) (obj))) - d.b() < 0)
        {
            obj1.b = d.b();
            obj1.c = false;
            continue; /* Loop/switch isn't completed */
        }
        if (d.c() - d.b(((View) (obj))) < 0)
        {
            obj1.b = d.c();
            obj1.c = true;
            continue; /* Loop/switch isn't completed */
        }
        if (((a) (obj1)).c)
        {
            i1 = d.b(((View) (obj))) + d.a();
        } else
        {
            i1 = d.a(((View) (obj)));
        }
        obj1.b = i1;
_L16:
        i1 = 1;
        continue; /* Loop/switch isn't completed */
_L13:
        if (s() > 0)
        {
            i1 = a(e(0));
            if (j < i1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag == e)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            obj1.c = flag;
        }
        ((a) (obj1)).a();
        if (true) goto _L16; else goto _L11
_L11:
        obj1.c = e;
        if (e)
        {
            obj1.b = d.c() - k;
        } else
        {
            obj1.b = d.b() + k;
        }
        if (true) goto _L17; else goto _L8
_L8:
        if (((a) (obj1)).c)
        {
            obj = d(n1, s);
        } else
        {
            obj = e(n1, s);
        }
        if (obj != null)
        {
            ((a) (obj1)).a(((View) (obj)));
            if (!s.j && g())
            {
                if (d.a(((View) (obj))) >= d.c() || d.b(((View) (obj))) < d.b())
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
                        i1 = d.c();
                    } else
                    {
                        i1 = d.b();
                    }
                    obj1.b = i1;
                }
            }
            i1 = 1;
            continue; /* Loop/switch isn't completed */
        }
_L6:
        i1 = 0;
        if (true) goto _L19; else goto _L18
_L18:
        if (l.c)
        {
            b(l);
            a.h = j1;
            a(n1, a, s, false);
            int j2 = a.b;
            int l2 = a.d;
            j1 = i1;
            if (a.c > 0)
            {
                j1 = i1 + a.c;
            }
            a(l);
            a.h = j1;
            c c1 = a;
            c1.d = c1.d + a.e;
            a(n1, a, s, false);
            int l1 = a.b;
            if (a.c > 0)
            {
                i1 = a.c;
                c(l2, j2);
                a.h = i1;
                a(n1, a, s, false);
                i1 = a.b;
            } else
            {
                i1 = j2;
            }
            j1 = i1;
            i1 = l1;
        } else
        {
            a(l);
            a.h = i1;
            a(n1, a, s, false);
            l1 = a.b;
            l2 = a.d;
            i1 = j1;
            if (a.c > 0)
            {
                i1 = j1 + a.c;
            }
            b(l);
            a.h = i1;
            c1 = a;
            c1.d = c1.d + a.e;
            a(n1, a, s, false);
            j2 = a.b;
            i1 = l1;
            j1 = j2;
            if (a.c > 0)
            {
                i1 = a.c;
                b(l2, l1);
                a.h = i1;
                a(n1, a, s, false);
                i1 = a.b;
                j1 = j2;
            }
        }
        l1 = i1;
        j2 = j1;
        if (s() > 0)
        {
            if (e)
            {
                l1 = a(i1, n1, s, true);
                j2 = j1 + l1;
                j1 = b(j2, n1, s, false);
                j2 += j1;
                l1 = i1 + l1 + j1;
            } else
            {
                l1 = b(j1, n1, s, true);
                i1 += l1;
                l2 = a(i1, n1, s, false);
                j2 = j1 + l1 + l2;
                l1 = i1 + l2;
            }
        }
        a(n1, s, j2, l1);
        if (!s.j)
        {
            j = -1;
            k = 0x80000000;
            n1 = d;
            n1.b = n1.e();
        }
        f = null;
        return;
        if (true) goto _L21; else goto _L20
_L20:
    }

    public final int d(RecyclerView.s s)
    {
        return i(s);
    }

    public final int e(RecyclerView.s s)
    {
        return j(s);
    }

    public final int f(RecyclerView.s s)
    {
        return j(s);
    }

    public RecyclerView.LayoutParams f()
    {
        return new RecyclerView.LayoutParams();
    }

    public boolean g()
    {
        return f == null;
    }

    public final Parcelable h()
    {
        if (f != null)
        {
            return new SavedState(f);
        }
        SavedState savedstate = new SavedState();
        if (s() > 0)
        {
            l();
            boolean flag = e ^ false;
            savedstate.c = flag;
            if (flag)
            {
                View view = D();
                savedstate.b = d.c() - d.b(view);
                savedstate.a = a(view);
                return savedstate;
            } else
            {
                View view1 = C();
                savedstate.a = a(view1);
                savedstate.b = d.a(view1) - d.b();
                return savedstate;
            }
        } else
        {
            savedstate.a = -1;
            return savedstate;
        }
    }

    public final boolean i()
    {
        return c == 0;
    }

    public final boolean j()
    {
        return c == 1;
    }

    protected final boolean k()
    {
        return aY.h(super.h) == 1;
    }

    final void l()
    {
        if (a == null)
        {
            a = new c();
        }
        if (d != null) goto _L2; else goto _L1
_L1:
        c;
        JVM INSTR tableswitch 0 1: default 52
    //                   0 63
    //                   1 78;
           goto _L3 _L4 _L5
_L3:
        throw new IllegalArgumentException("invalid orientation");
_L4:
        Object obj = new bI._cls1(this);
_L7:
        d = ((bI) (obj));
_L2:
        return;
_L5:
        obj = new bI._cls2(this);
        if (true) goto _L7; else goto _L6
_L6:
    }

    public final int m()
    {
        View view = a(0, s(), false, true);
        if (view == null)
        {
            return -1;
        } else
        {
            return a(view);
        }
    }

    public final int n()
    {
        View view = a(0, s(), true, false);
        if (view == null)
        {
            return -1;
        } else
        {
            return a(view);
        }
    }

    public final int o()
    {
        View view = a(s() - 1, -1, false, true);
        if (view == null)
        {
            return -1;
        } else
        {
            return a(view);
        }
    }

    public final int p()
    {
        View view = a(s() - 1, -1, true, false);
        if (view == null)
        {
            return -1;
        } else
        {
            return a(view);
        }
    }
}
