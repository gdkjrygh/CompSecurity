// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.graphics.PointF;
import android.os.Parcelable;
import android.support.v4.view.accessibility.AccessibilityEventCompat;
import android.support.v4.view.accessibility.AccessibilityRecordCompat;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import gl;
import gm;
import gn;
import go;
import ha;
import hk;
import ho;
import ht;
import hw;
import ib;
import java.util.List;

// Referenced classes of package android.support.v7.widget:
//            RecyclerView

public class LinearLayoutManager extends hk
{

    private gn a;
    private boolean b;
    private boolean c;
    private boolean d;
    private boolean e;
    private boolean f;
    int j;
    public ha k;
    boolean l;
    int m;
    int n;
    SavedState o;
    final gl p;

    public LinearLayoutManager()
    {
        this((byte)0);
    }

    private LinearLayoutManager(byte byte0)
    {
        c = false;
        l = false;
        d = false;
        e = true;
        m = -1;
        n = 0x80000000;
        o = null;
        p = new gl(this);
        h();
        C();
    }

    private void B()
    {
        boolean flag = true;
        if (j == 1 || !i())
        {
            l = c;
            return;
        }
        if (c)
        {
            flag = false;
        }
        l = flag;
    }

    private void C()
    {
        a(((String) (null)));
        if (!c)
        {
            return;
        } else
        {
            c = false;
            k();
            return;
        }
    }

    private static gn D()
    {
        return new gn();
    }

    private View E()
    {
        int i1;
        if (l)
        {
            i1 = q() - 1;
        } else
        {
            i1 = 0;
        }
        return d(i1);
    }

    private View F()
    {
        int i1;
        if (l)
        {
            i1 = 0;
        } else
        {
            i1 = q() - 1;
        }
        return d(i1);
    }

    private int G()
    {
        View view = a(0, q(), false);
        if (view == null)
        {
            return -1;
        } else
        {
            return c(view);
        }
    }

    private int H()
    {
        View view = a(q() - 1, -1, false);
        if (view == null)
        {
            return -1;
        } else
        {
            return c(view);
        }
    }

    private int a(int i1, ho ho1, ht ht1, boolean flag)
    {
        int j1 = k.d() - i1;
        if (j1 > 0)
        {
            int k1 = -d(-j1, ho1, ht1);
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

    private int a(ho ho1, gn gn1, ht ht1, boolean flag)
    {
        int k1 = gn1.c;
        if (gn1.g != 0x80000000)
        {
            if (gn1.c < 0)
            {
                gn1.g = gn1.g + gn1.c;
            }
            a(ho1, gn1);
        }
        int i1 = gn1.c + gn1.h;
        gm gm1 = new gm();
label0:
        do
        {
            int j1;
            do
            {
label1:
                {
                    if (i1 <= 0 || !gn1.a(ht1))
                    {
                        break label0;
                    }
                    gm1.a();
                    a(ho1, ht1, gn1, gm1);
                    if (gm1.b)
                    {
                        break label0;
                    }
                    gn1.b = gn1.b + gm1.a * gn1.f;
                    if (gm1.c && a.k == null)
                    {
                        j1 = i1;
                        if (ht1.a())
                        {
                            break label1;
                        }
                    }
                    gn1.c = gn1.c - gm1.a;
                    j1 = i1 - gm1.a;
                }
                if (gn1.g != 0x80000000)
                {
                    gn1.g = gn1.g + gm1.a;
                    if (gn1.c < 0)
                    {
                        gn1.g = gn1.g + gn1.c;
                    }
                    a(ho1, gn1);
                }
                i1 = j1;
            } while (!flag);
            i1 = j1;
        } while (!gm1.d);
        return k1 - gn1.c;
    }

    private View a(int i1, int j1, boolean flag)
    {
        j();
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
            return a(q() - 1, -1, flag);
        } else
        {
            return a(0, q(), flag);
        }
    }

    private void a(int i1, int j1, boolean flag, ht ht1)
    {
        byte byte0 = -1;
        boolean flag1 = true;
        a.h = g(ht1);
        a.f = i1;
        if (i1 == 1)
        {
            ht1 = a;
            ht1.h = ((gn) (ht1)).h + k.g();
            ht1 = F();
            gn gn1 = a;
            if (l)
            {
                i1 = byte0;
            } else
            {
                i1 = 1;
            }
            gn1.e = i1;
            a.d = c(ht1) + a.e;
            a.b = k.b(ht1);
            i1 = k.b(ht1) - k.d();
        } else
        {
            ht1 = E();
            gn gn2 = a;
            gn2.h = gn2.h + k.c();
            gn2 = a;
            if (l)
            {
                i1 = ((flag1) ? 1 : 0);
            } else
            {
                i1 = -1;
            }
            gn2.e = i1;
            a.d = c(ht1) + a.e;
            a.b = k.a(ht1);
            i1 = -k.a(ht1) + k.c();
        }
        a.c = j1;
        if (flag)
        {
            ht1 = a;
            ht1.c = ((gn) (ht1)).c - i1;
        }
        a.g = i1;
    }

    private void a(gl gl1)
    {
        f(gl1.a, gl1.b);
    }

    private void a(ho ho1, int i1)
    {
        if (i1 >= 0) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int l1;
        l1 = q();
        if (!l)
        {
            break; /* Loop/switch isn't completed */
        }
        int j1 = l1 - 1;
        while (j1 >= 0) 
        {
            View view = d(j1);
            if (k.b(view) > i1)
            {
                a(ho1, l1 - 1, j1);
                return;
            }
            j1--;
        }
        if (true) goto _L1; else goto _L3
_L3:
        int k1 = 0;
        while (k1 < l1) 
        {
            View view1 = d(k1);
            if (k.b(view1) > i1)
            {
                a(ho1, 0, k1);
                return;
            }
            k1++;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    private void a(ho ho1, int i1, int j1)
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
            a(j1, ho1);
            j1--;
        }
        if (true) goto _L1; else goto _L3
_L3:
        while (k1 > j1) 
        {
            a(k1, ho1);
            k1--;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    private void a(ho ho1, gn gn1)
    {
        if (!gn1.a)
        {
            return;
        }
        if (gn1.f == -1)
        {
            b(ho1, gn1.g);
            return;
        } else
        {
            a(ho1, gn1.g);
            return;
        }
    }

    private void a(ho ho1, ht ht1, int i1, int j1)
    {
        if (!ht1.b() || q() == 0 || ht1.a() || !c())
        {
            return;
        }
        int k1 = 0;
        int l1 = 0;
        List list = ho1.b();
        int i3 = list.size();
        int j3 = c(d(0));
        int i2 = 0;
        while (i2 < i3) 
        {
            hw hw1 = (hw)list.get(i2);
            if (!hw1.p())
            {
                int j2;
                boolean flag;
                if (hw1.d() < j3)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (flag != l)
                {
                    j2 = -1;
                } else
                {
                    j2 = 1;
                }
                if (j2 == -1)
                {
                    j2 = k.c(hw1.a) + k1;
                    k1 = l1;
                    l1 = j2;
                } else
                {
                    int k2 = k.c(hw1.a) + l1;
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
        a.k = list;
        if (k1 > 0)
        {
            g(c(E()), i1);
            a.h = k1;
            a.c = 0;
            a.a();
            a(ho1, a, ht1, false);
        }
        if (l1 > 0)
        {
            f(c(F()), j1);
            a.h = l1;
            a.c = 0;
            a.a();
            a(ho1, a, ht1, false);
        }
        a.k = null;
    }

    private boolean a(ht ht1, gl gl1)
    {
        boolean flag1 = false;
        if (ht1.a() || m == -1)
        {
            return false;
        }
        if (m < 0 || m >= ht1.e())
        {
            m = -1;
            n = 0x80000000;
            return false;
        }
        gl1.a = m;
        if (o != null && o.a())
        {
            gl1.c = o.c;
            if (gl1.c)
            {
                gl1.b = k.d() - o.b;
                return true;
            } else
            {
                gl1.b = k.c() + o.b;
                return true;
            }
        }
        if (n == 0x80000000)
        {
            ht1 = a(m);
            if (ht1 != null)
            {
                if (k.c(ht1) > k.f())
                {
                    gl1.b();
                    return true;
                }
                if (k.a(ht1) - k.c() < 0)
                {
                    gl1.b = k.c();
                    gl1.c = false;
                    return true;
                }
                if (k.d() - k.b(ht1) < 0)
                {
                    gl1.b = k.d();
                    gl1.c = true;
                    return true;
                }
                int i1;
                if (gl1.c)
                {
                    i1 = k.b(ht1) + k.b();
                } else
                {
                    i1 = k.a(ht1);
                }
                gl1.b = i1;
                return true;
            }
            if (q() > 0)
            {
                int j1 = c(d(0));
                boolean flag;
                if (m < j1)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (flag == l)
                {
                    flag1 = true;
                }
                gl1.c = flag1;
            }
            gl1.b();
            return true;
        }
        gl1.c = l;
        if (l)
        {
            gl1.b = k.d() - n;
            return true;
        } else
        {
            gl1.b = k.c() + n;
            return true;
        }
    }

    private int b(int i1, ho ho1, ht ht1, boolean flag)
    {
        int j1 = i1 - k.c();
        if (j1 > 0)
        {
            int k1 = -d(j1, ho1, ht1);
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
            return a(0, q(), flag);
        } else
        {
            return a(q() - 1, -1, flag);
        }
    }

    private void b(gl gl1)
    {
        g(gl1.a, gl1.b);
    }

    private void b(ho ho1, int i1)
    {
        int j1 = q();
        if (i1 >= 0) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int k1;
        k1 = k.e() - i1;
        if (!l)
        {
            break; /* Loop/switch isn't completed */
        }
        i1 = 0;
        while (i1 < j1) 
        {
            View view = d(i1);
            if (k.a(view) < k1)
            {
                a(ho1, 0, i1);
                return;
            }
            i1++;
        }
        if (true) goto _L1; else goto _L3
_L3:
        i1 = j1 - 1;
        while (i1 >= 0) 
        {
            View view1 = d(i1);
            if (k.a(view1) < k1)
            {
                a(ho1, j1 - 1, i1);
                return;
            }
            i1--;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    private void b(ho ho1, ht ht1, gl gl1)
    {
        while (a(ht1, gl1) || c(ho1, ht1, gl1)) 
        {
            return;
        }
        gl1.b();
        int i1;
        if (d)
        {
            i1 = ht1.e() - 1;
        } else
        {
            i1 = 0;
        }
        gl1.a = i1;
    }

    private boolean c(ho ho1, ht ht1, gl gl1)
    {
        boolean flag = false;
        if (q() != 0)
        {
            View view = x();
            if (view != null && gl.a(view, ht1))
            {
                gl1.a(view);
                return true;
            }
            if (b == d)
            {
                if (gl1.c)
                {
                    ho1 = d(ho1, ht1);
                } else
                {
                    ho1 = e(ho1, ht1);
                }
                if (ho1 != null)
                {
                    gl1.b(ho1);
                    if (!ht1.a() && c())
                    {
                        if (k.a(ho1) >= k.d() || k.b(ho1) < k.c())
                        {
                            flag = true;
                        }
                        if (flag)
                        {
                            int i1;
                            if (gl1.c)
                            {
                                i1 = k.d();
                            } else
                            {
                                i1 = k.c();
                            }
                            gl1.b = i1;
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    private int d(int i1, ho ho1, ht ht1)
    {
        if (q() == 0 || i1 == 0)
        {
            return 0;
        }
        a.a = true;
        j();
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
        a(j1, k1, true, ht1);
        l1 = a.g + a(ho1, a, ht1, false);
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

    private View d(ho ho1, ht ht1)
    {
        if (l)
        {
            return f(ho1, ht1);
        } else
        {
            return g(ho1, ht1);
        }
    }

    private View e(ho ho1, ht ht1)
    {
        if (l)
        {
            return g(ho1, ht1);
        } else
        {
            return f(ho1, ht1);
        }
    }

    private View f(ho ho1, ht ht1)
    {
        return a(ho1, ht1, 0, q(), ht1.e());
    }

    private void f(int i1, int j1)
    {
        a.c = k.d() - j1;
        gn gn1 = a;
        int k1;
        if (l)
        {
            k1 = -1;
        } else
        {
            k1 = 1;
        }
        gn1.e = k1;
        a.d = i1;
        a.f = 1;
        a.b = j1;
        a.g = 0x80000000;
    }

    private int g(ht ht1)
    {
        if (ht1.d())
        {
            return k.f();
        } else
        {
            return 0;
        }
    }

    private View g(ho ho1, ht ht1)
    {
        return a(ho1, ht1, q() - 1, -1, ht1.e());
    }

    private void g(int i1, int j1)
    {
        a.c = j1 - k.c();
        a.d = i1;
        gn gn1 = a;
        if (l)
        {
            i1 = 1;
        } else
        {
            i1 = -1;
        }
        gn1.e = i1;
        a.f = -1;
        a.b = j1;
        a.g = 0x80000000;
    }

    private int h(ht ht1)
    {
        boolean flag1 = true;
        if (q() == 0)
        {
            return 0;
        }
        j();
        ha ha1 = k;
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
        return ib.a(ht1, ha1, view, b(flag), this, e, l);
    }

    private int i(int i1)
    {
        int j1;
        byte byte0;
        byte0 = -1;
        j1 = byte0;
        i1;
        JVM INSTR lookupswitch 6: default 64
    //                   1: 67
    //                   2: 69
    //                   17: 97
    //                   33: 71
    //                   66: 109
    //                   130: 84;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L2:
        break MISSING_BLOCK_LABEL_67;
_L1:
        j1 = 0x80000000;
_L9:
        return j1;
_L3:
        return 1;
_L5:
        j1 = byte0;
        if (j == 1) goto _L9; else goto _L8
_L8:
        return 0x80000000;
_L7:
        return j != 1 ? 0x80000000 : 1;
_L4:
        j1 = byte0;
        if (j == 0) goto _L9; else goto _L10
_L10:
        return 0x80000000;
_L6:
        return j != 0 ? 0x80000000 : 1;
    }

    private int i(ht ht1)
    {
        boolean flag1 = true;
        if (q() == 0)
        {
            return 0;
        }
        j();
        ha ha1 = k;
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
        return ib.a(ht1, ha1, view, b(flag), this, e);
    }

    private int j(ht ht1)
    {
        boolean flag1 = true;
        if (q() == 0)
        {
            return 0;
        }
        j();
        ha ha1 = k;
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
        return ib.b(ht1, ha1, view, b(flag), this, e);
    }

    public final int a(int i1, ho ho1, ht ht1)
    {
        if (j == 1)
        {
            return 0;
        } else
        {
            return d(i1, ho1, ht1);
        }
    }

    public final int a(ht ht1)
    {
        return h(ht1);
    }

    public final View a(int i1)
    {
        int j1 = q();
        if (j1 != 0) goto _L2; else goto _L1
_L1:
        View view = null;
_L4:
        return view;
_L2:
        View view1;
        int k1 = i1 - c(d(0));
        if (k1 < 0 || k1 >= j1)
        {
            break; /* Loop/switch isn't completed */
        }
        view1 = d(k1);
        view = view1;
        if (c(view1) == i1) goto _L4; else goto _L3
_L3:
        return super.a(i1);
    }

    View a(ho ho1, ht ht1, int i1, int j1, int k1)
    {
label0:
        {
            Object obj;
label1:
            {
                ho1 = null;
                j();
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
                ht1 = null;
                while (i1 != j1) 
                {
                    View view = d(i1);
                    int k2 = c(view);
                    if (k2 >= 0 && k2 < k1)
                    {
                        if (((RecyclerView.LayoutParams)view.getLayoutParams()).c())
                        {
                            if (ht1 == null)
                            {
                                ht1 = view;
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
                            if (ho1 == null)
                            {
                                ho1 = view;
                            }
                        }
                    }
                    i1 += l1;
                }
                if (ho1 == null)
                {
                    break label0;
                }
                obj = ho1;
            }
            return ((View) (obj));
        }
        return ht1;
    }

    public final void a(Parcelable parcelable)
    {
        if (parcelable instanceof SavedState)
        {
            o = (SavedState)parcelable;
            k();
        }
    }

    public final void a(RecyclerView recyclerview, int i1)
    {
        recyclerview = new _cls1(recyclerview.getContext());
        recyclerview.b(i1);
        a(((hr) (recyclerview)));
    }

    public final void a(RecyclerView recyclerview, ho ho1)
    {
        super.a(recyclerview, ho1);
        if (f)
        {
            c(ho1);
            ho1.a();
        }
    }

    public final void a(AccessibilityEvent accessibilityevent)
    {
        super.a(accessibilityevent);
        if (q() > 0)
        {
            accessibilityevent = AccessibilityEventCompat.asRecord(accessibilityevent);
            accessibilityevent.setFromIndex(G());
            accessibilityevent.setToIndex(H());
        }
    }

    void a(ho ho1, ht ht1, gl gl1)
    {
    }

    void a(ho ho1, ht ht1, gn gn1, gm gm1)
    {
        ho1 = gn1.a(ho1);
        if (ho1 == null)
        {
            gm1.b = true;
            return;
        }
        ht1 = (RecyclerView.LayoutParams)ho1.getLayoutParams();
        int i1;
        int j1;
        int k1;
        int l1;
        if (gn1.k == null)
        {
            boolean flag2 = l;
            boolean flag;
            if (gn1.f == -1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag2 == flag)
            {
                b(ho1);
            } else
            {
                b(ho1, 0);
            }
        } else
        {
            boolean flag3 = l;
            boolean flag1;
            if (gn1.f == -1)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (flag3 == flag1)
            {
                a(((View) (ho1)));
            } else
            {
                a(((View) (ho1)), 0);
            }
        }
        d(ho1);
        gm1.a = k.c(ho1);
        if (j == 1)
        {
            if (i())
            {
                i1 = r() - v();
                j1 = i1 - k.d(ho1);
            } else
            {
                j1 = t();
                i1 = k.d(ho1) + j1;
            }
            if (gn1.f == -1)
            {
                k1 = gn1.b;
                l1 = gn1.b - gm1.a;
            } else
            {
                l1 = gn1.b;
                k1 = gn1.b;
                int i2 = gm1.a;
                k1 += i2;
            }
        } else
        {
            l1 = u();
            k1 = k.d(ho1) + l1;
            if (gn1.f == -1)
            {
                i1 = gn1.b;
                j1 = gn1.b - gm1.a;
            } else
            {
                j1 = gn1.b;
                i1 = gn1.b + gm1.a;
            }
        }
        a(((View) (ho1)), j1 + ((RecyclerView.LayoutParams) (ht1)).leftMargin, l1 + ((RecyclerView.LayoutParams) (ht1)).topMargin, i1 - ((RecyclerView.LayoutParams) (ht1)).rightMargin, k1 - ((RecyclerView.LayoutParams) (ht1)).bottomMargin);
        if (ht1.c() || ht1.d())
        {
            gm1.c = true;
        }
        gm1.d = ho1.isFocusable();
    }

    public final void a(String s)
    {
        if (o == null)
        {
            super.a(s);
        }
    }

    public final int b(int i1, ho ho1, ht ht1)
    {
        if (j == 0)
        {
            return 0;
        } else
        {
            return d(i1, ho1, ht1);
        }
    }

    public final int b(ht ht1)
    {
        return h(ht1);
    }

    public final PointF b(int i1)
    {
        boolean flag = true;
        boolean flag1 = false;
        if (q() == 0)
        {
            return null;
        }
        if (i1 < c(d(0)))
        {
            flag1 = true;
        }
        i1 = ((flag) ? 1 : 0);
        if (flag1 != l)
        {
            i1 = -1;
        }
        if (j == 0)
        {
            return new PointF(i1, 0.0F);
        } else
        {
            return new PointF(0.0F, i1);
        }
    }

    public RecyclerView.LayoutParams b()
    {
        return new RecyclerView.LayoutParams();
    }

    public final int c(ht ht1)
    {
        return i(ht1);
    }

    public final View c(int i1, ho ho1, ht ht1)
    {
        B();
        if (q() != 0)
        {
            if ((i1 = i(i1)) != 0x80000000)
            {
                j();
                View view;
                if (i1 == -1)
                {
                    view = e(ho1, ht1);
                } else
                {
                    view = d(ho1, ht1);
                }
                if (view != null)
                {
                    j();
                    a(i1, (int)(0.33F * (float)k.f()), false, ht1);
                    a.g = 0x80000000;
                    a.a = false;
                    a(ho1, a, ht1, true);
                    if (i1 == -1)
                    {
                        ho1 = E();
                    } else
                    {
                        ho1 = F();
                    }
                    if (ho1 != view && ho1.isFocusable())
                    {
                        return ho1;
                    }
                }
            }
        }
        return null;
    }

    public final void c(int i1)
    {
        m = i1;
        n = 0x80000000;
        if (o != null)
        {
            o.b();
        }
        k();
    }

    public void c(ho ho1, ht ht1)
    {
        if ((o != null || m != -1) && ht1.e() == 0)
        {
            c(ho1);
            return;
        }
        if (o != null && o.a())
        {
            m = o.a;
        }
        j();
        a.a = false;
        B();
        p.a();
        p.c = l ^ d;
        b(ho1, ht1, p);
        int i1 = g(ht1);
        int j1;
        int k1;
        int l1;
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
        if (ht1.a())
        {
            i1 = l1;
            j1 = k1;
            if (m != -1)
            {
                i1 = l1;
                j1 = k1;
                if (n != 0x80000000)
                {
                    Object obj = a(m);
                    i1 = l1;
                    j1 = k1;
                    if (obj != null)
                    {
                        int i2;
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
        a(ho1, ht1, p);
        a(ho1);
        a.i = ht1.a();
        if (p.c)
        {
            b(p);
            a.h = j1;
            a(ho1, a, ht1, false);
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
            obj.d = ((gn) (obj)).d + a.e;
            a(ho1, a, ht1, false);
            k1 = a.b;
            gn gn1;
            int j2;
            if (a.c > 0)
            {
                i1 = a.c;
                g(i2, l1);
                a.h = i1;
                a(ho1, a, ht1, false);
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
            a(ho1, a, ht1, false);
            k1 = a.b;
            j2 = a.d;
            i1 = j1;
            if (a.c > 0)
            {
                i1 = j1 + a.c;
            }
            b(p);
            a.h = i1;
            gn1 = a;
            gn1.d = gn1.d + a.e;
            a(ho1, a, ht1, false);
            l1 = a.b;
            i1 = k1;
            j1 = l1;
            if (a.c > 0)
            {
                i1 = a.c;
                f(j2, k1);
                a.h = i1;
                a(ho1, a, ht1, false);
                i1 = a.b;
                j1 = l1;
            }
        }
        k1 = i1;
        l1 = j1;
        if (q() > 0)
        {
            if (l ^ d)
            {
                k1 = a(i1, ho1, ht1, true);
                l1 = j1 + k1;
                j1 = b(l1, ho1, ht1, false);
                l1 += j1;
                k1 = i1 + k1 + j1;
            } else
            {
                k1 = b(j1, ho1, ht1, true);
                i1 += k1;
                j2 = a(i1, ho1, ht1, false);
                l1 = j1 + k1 + j2;
                k1 = i1 + j2;
            }
        }
        a(ho1, ht1, l1, k1);
        if (!ht1.a())
        {
            m = -1;
            n = 0x80000000;
            k.a();
        }
        b = d;
        o = null;
    }

    public boolean c()
    {
        return o == null && b == d;
    }

    public final int d(ht ht1)
    {
        return i(ht1);
    }

    public final Parcelable d()
    {
        if (o != null)
        {
            return new SavedState(o);
        }
        SavedState savedstate = new SavedState();
        if (q() > 0)
        {
            j();
            boolean flag = b ^ l;
            savedstate.c = flag;
            if (flag)
            {
                View view = F();
                savedstate.b = k.d() - k.b(view);
                savedstate.a = c(view);
                return savedstate;
            } else
            {
                View view1 = E();
                savedstate.a = c(view1);
                savedstate.b = k.a(view1) - k.c();
                return savedstate;
            }
        } else
        {
            savedstate.b();
            return savedstate;
        }
    }

    public final int e(ht ht1)
    {
        return j(ht1);
    }

    public final boolean e()
    {
        return j == 0;
    }

    public final int f(ht ht1)
    {
        return j(ht1);
    }

    public final boolean f()
    {
        return j == 1;
    }

    public final int g()
    {
        return j;
    }

    public final void h()
    {
        a(((String) (null)));
        if (1 == j)
        {
            return;
        } else
        {
            j = 1;
            k = null;
            k();
            return;
        }
    }

    protected final boolean i()
    {
        return p() == 1;
    }

    final void j()
    {
        if (a == null)
        {
            a = D();
        }
        if (k == null)
        {
            k = ha.a(this, j);
        }
    }

    /* member class not found */
    class SavedState {}


    /* member class not found */
    class _cls1 {}

}
