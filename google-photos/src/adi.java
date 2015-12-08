// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

public class adi extends aex
{

    private adm a;
    int b;
    aee c;
    boolean d;
    adn e;
    private boolean f;
    private boolean g;
    private boolean h;
    private boolean i;
    private int j;
    private int k;
    private adk l;

    private adi(int i1, boolean flag)
    {
        g = false;
        d = false;
        h = false;
        i = true;
        j = -1;
        k = 0x80000000;
        e = null;
        l = new adk(this);
        assertNotInLayoutOrScroll(null);
        if (1 != b)
        {
            b = 1;
            c = null;
            requestLayout();
        }
        assertNotInLayoutOrScroll(null);
        if (g)
        {
            g = false;
            requestLayout();
        }
    }

    public adi(Context context)
    {
        this(1, false);
    }

    private int a(int i1, afe afe1, afl afl1)
    {
        if (getChildCount() == 0 || i1 == 0)
        {
            return 0;
        }
        a.a = true;
        b();
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
        a(j1, k1, true, afl1);
        l1 = a.g + a(afe1, a, afl1, false);
        if (l1 < 0)
        {
            return 0;
        }
        if (k1 > l1)
        {
            i1 = j1 * l1;
        }
        c.a(-i1);
        a.i = i1;
        return i1;
    }

    private int a(int i1, afe afe1, afl afl1, boolean flag)
    {
        int j1 = c.c() - i1;
        if (j1 > 0)
        {
            int k1 = -a(-j1, afe1, afl1);
            j1 = k1;
            if (flag)
            {
                i1 = c.c() - (i1 + k1);
                j1 = k1;
                if (i1 > 0)
                {
                    c.a(i1);
                    j1 = k1 + i1;
                }
            }
            return j1;
        } else
        {
            return 0;
        }
    }

    private int a(afe afe1, adm adm1, afl afl1, boolean flag)
    {
        int k1 = adm1.c;
        if (adm1.g != 0x80000000)
        {
            if (adm1.c < 0)
            {
                adm1.g = adm1.g + adm1.c;
            }
            a(afe1, adm1);
        }
        int i1 = adm1.c + adm1.h;
        adl adl1 = new adl();
label0:
        do
        {
            int j1;
            do
            {
label1:
                {
                    if (i1 <= 0 || !adm1.a(afl1))
                    {
                        break label0;
                    }
                    adl1.a = 0;
                    adl1.b = false;
                    adl1.c = false;
                    adl1.d = false;
                    a(afe1, afl1, adm1, adl1);
                    if (adl1.b)
                    {
                        break label0;
                    }
                    adm1.b = adm1.b + adl1.a * adm1.f;
                    if (adl1.c && a.j == null)
                    {
                        j1 = i1;
                        if (afl1.j)
                        {
                            break label1;
                        }
                    }
                    adm1.c = adm1.c - adl1.a;
                    j1 = i1 - adl1.a;
                }
                if (adm1.g != 0x80000000)
                {
                    adm1.g = adm1.g + adl1.a;
                    if (adm1.c < 0)
                    {
                        adm1.g = adm1.g + adm1.c;
                    }
                    a(afe1, adm1);
                }
                i1 = j1;
            } while (!flag);
            i1 = j1;
        } while (!adl1.d);
        return k1 - adm1.c;
    }

    private int a(afl afl1)
    {
        if (afl1.a())
        {
            return c.e();
        } else
        {
            return 0;
        }
    }

    private View a(int i1, int j1, boolean flag, boolean flag1)
    {
        b();
        int k1 = c.b();
        int l1 = c.c();
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
            View view1 = getChildAt(i1);
            int i2 = c.a(view1);
            int j2 = c.b(view1);
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

    private View a(afe afe1, afl afl1)
    {
        if (d)
        {
            return c(afe1, afl1);
        } else
        {
            return d(afe1, afl1);
        }
    }

    private View a(boolean flag, boolean flag1)
    {
        if (d)
        {
            return a(getChildCount() - 1, -1, flag, true);
        } else
        {
            return a(0, getChildCount(), flag, true);
        }
    }

    private void a(int i1, int j1, boolean flag, afl afl1)
    {
        byte byte0 = -1;
        boolean flag1 = true;
        a.h = a(afl1);
        a.f = i1;
        if (i1 == 1)
        {
            afl1 = a;
            afl1.h = ((adm) (afl1)).h + c.f();
            afl1 = g();
            adm adm1 = a;
            if (d)
            {
                i1 = byte0;
            } else
            {
                i1 = 1;
            }
            adm1.e = i1;
            a.d = getPosition(afl1) + a.e;
            a.b = c.b(afl1);
            i1 = c.b(afl1) - c.c();
        } else
        {
            afl1 = f();
            adm adm2 = a;
            adm2.h = adm2.h + c.b();
            adm2 = a;
            if (d)
            {
                i1 = ((flag1) ? 1 : 0);
            } else
            {
                i1 = -1;
            }
            adm2.e = i1;
            a.d = getPosition(afl1) + a.e;
            a.b = c.a(afl1);
            i1 = -c.a(afl1) + c.b();
        }
        a.c = j1;
        if (flag)
        {
            afl1 = a;
            afl1.c = ((adm) (afl1)).c - i1;
        }
        a.g = i1;
    }

    private void a(adk adk1)
    {
        b(adk1.a, adk1.b);
    }

    private void a(afe afe1, int i1, int j1)
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
            removeAndRecycleViewAt(j1, afe1);
            j1--;
        }
        if (true) goto _L1; else goto _L3
_L3:
        while (k1 > j1) 
        {
            removeAndRecycleViewAt(k1, afe1);
            k1--;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    private void a(afe afe1, adm adm1)
    {
        if (adm1.a) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (adm1.f != -1)
        {
            break; /* Loop/switch isn't completed */
        }
        int i1 = adm1.g;
        int j2 = getChildCount();
        if (i1 >= 0)
        {
            int l2 = c.d() - i1;
            if (d)
            {
                int j1 = 0;
                while (j1 < j2) 
                {
                    adm1 = getChildAt(j1);
                    if (c.a(adm1) < l2)
                    {
                        a(afe1, 0, j1);
                        return;
                    }
                    j1++;
                }
            } else
            {
                int k1 = j2 - 1;
                while (k1 >= 0) 
                {
                    adm1 = getChildAt(k1);
                    if (c.a(adm1) < l2)
                    {
                        a(afe1, j2 - 1, k1);
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
        k2 = adm1.g;
        if (k2 < 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        i3 = getChildCount();
        if (!d)
        {
            break; /* Loop/switch isn't completed */
        }
        int l1 = i3 - 1;
        while (l1 >= 0) 
        {
            adm1 = getChildAt(l1);
            if (c.b(adm1) > k2)
            {
                a(afe1, i3 - 1, l1);
                return;
            }
            l1--;
        }
        if (true) goto _L1; else goto _L4
_L4:
        int i2 = 0;
        while (i2 < i3) 
        {
            adm1 = getChildAt(i2);
            if (c.b(adm1) > k2)
            {
                a(afe1, 0, i2);
                return;
            }
            i2++;
        }
        if (true) goto _L1; else goto _L5
_L5:
    }

    private int b(int i1, afe afe1, afl afl1, boolean flag)
    {
        int j1 = i1 - c.b();
        if (j1 > 0)
        {
            int k1 = -a(j1, afe1, afl1);
            j1 = k1;
            if (flag)
            {
                i1 = (i1 + k1) - c.b();
                j1 = k1;
                if (i1 > 0)
                {
                    c.a(-i1);
                    j1 = k1 - i1;
                }
            }
            return j1;
        } else
        {
            return 0;
        }
    }

    private int b(afl afl1)
    {
        boolean flag = false;
        int j1;
        if (getChildCount() == 0)
        {
            j1 = ((flag) ? 1 : 0);
        } else
        {
            b();
            aee aee1 = c;
            View view;
            View view1;
            boolean flag1;
            boolean flag2;
            if (!i)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            view = a(flag1, true);
            if (!i)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            view1 = b(flag1, true);
            flag1 = i;
            flag2 = d;
            j1 = ((flag) ? 1 : 0);
            if (getChildCount() != 0)
            {
                j1 = ((flag) ? 1 : 0);
                if (afl1.b() != 0)
                {
                    j1 = ((flag) ? 1 : 0);
                    if (view != null)
                    {
                        j1 = ((flag) ? 1 : 0);
                        if (view1 != null)
                        {
                            int i1 = Math.min(getPosition(view), getPosition(view1));
                            j1 = Math.max(getPosition(view), getPosition(view1));
                            if (flag2)
                            {
                                i1 = Math.max(0, afl1.b() - j1 - 1);
                            } else
                            {
                                i1 = Math.max(0, i1);
                            }
                            j1 = i1;
                            if (flag1)
                            {
                                int k1 = Math.abs(aee1.b(view1) - aee1.a(view));
                                int l1 = Math.abs(getPosition(view) - getPosition(view1));
                                return Math.round(((float)k1 / (float)(l1 + 1)) * (float)i1 + (float)(aee1.b() - aee1.a(view)));
                            }
                        }
                    }
                }
            }
        }
        return j1;
    }

    private View b(afe afe1, afl afl1)
    {
        if (d)
        {
            return d(afe1, afl1);
        } else
        {
            return c(afe1, afl1);
        }
    }

    private View b(boolean flag, boolean flag1)
    {
        if (d)
        {
            return a(0, getChildCount(), flag, true);
        } else
        {
            return a(getChildCount() - 1, -1, flag, true);
        }
    }

    private void b(int i1, int j1)
    {
        a.c = c.c() - j1;
        adm adm1 = a;
        int k1;
        if (d)
        {
            k1 = -1;
        } else
        {
            k1 = 1;
        }
        adm1.e = k1;
        a.d = i1;
        a.f = 1;
        a.b = j1;
        a.g = 0x80000000;
    }

    private void b(adk adk1)
    {
        c(adk1.a, adk1.b);
    }

    private int c(afl afl1)
    {
        if (getChildCount() != 0)
        {
            b();
            aee aee1 = c;
            View view;
            View view1;
            boolean flag;
            if (!i)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            view = a(flag, true);
            if (!i)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            view1 = b(flag, true);
            flag = i;
            if (getChildCount() != 0 && afl1.b() != 0 && view != null && view1 != null)
            {
                if (!flag)
                {
                    return Math.abs(getPosition(view) - getPosition(view1)) + 1;
                } else
                {
                    int i1 = aee1.b(view1);
                    int j1 = aee1.a(view);
                    return Math.min(aee1.e(), i1 - j1);
                }
            }
        }
        return 0;
    }

    private View c(afe afe1, afl afl1)
    {
        return a(afe1, afl1, 0, getChildCount(), afl1.b());
    }

    private void c(int i1, int j1)
    {
        a.c = j1 - c.b();
        a.d = i1;
        adm adm1 = a;
        if (d)
        {
            i1 = 1;
        } else
        {
            i1 = -1;
        }
        adm1.e = i1;
        a.f = -1;
        a.b = j1;
        a.g = 0x80000000;
    }

    private int d(afl afl1)
    {
        if (getChildCount() != 0)
        {
            b();
            aee aee1 = c;
            View view;
            View view1;
            boolean flag;
            if (!i)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            view = a(flag, true);
            if (!i)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            view1 = b(flag, true);
            flag = i;
            if (getChildCount() != 0 && afl1.b() != 0 && view != null && view1 != null)
            {
                if (!flag)
                {
                    return afl1.b();
                } else
                {
                    int i1 = aee1.b(view1);
                    int j1 = aee1.a(view);
                    int k1 = Math.abs(getPosition(view) - getPosition(view1));
                    return (int)(((float)(i1 - j1) / (float)(k1 + 1)) * (float)afl1.b());
                }
            }
        }
        return 0;
    }

    private View d(afe afe1, afl afl1)
    {
        return a(afe1, afl1, getChildCount() - 1, -1, afl1.b());
    }

    private void e()
    {
        boolean flag = true;
        if (b != 1 && a()) goto _L2; else goto _L1
_L1:
        flag = g;
_L4:
        d = flag;
        return;
_L2:
        if (g)
        {
            flag = false;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private View f()
    {
        int i1;
        if (d)
        {
            i1 = getChildCount() - 1;
        } else
        {
            i1 = 0;
        }
        return getChildAt(i1);
    }

    private View g()
    {
        int i1;
        if (d)
        {
            i1 = 0;
        } else
        {
            i1 = getChildCount() - 1;
        }
        return getChildAt(i1);
    }

    View a(afe afe1, afl afl1, int i1, int j1, int k1)
    {
label0:
        {
            Object obj;
label1:
            {
                afe1 = null;
                b();
                int i2 = c.b();
                int j2 = c.c();
                int l1;
                if (j1 > i1)
                {
                    l1 = 1;
                } else
                {
                    l1 = -1;
                }
                afl1 = null;
                while (i1 != j1) 
                {
                    View view = getChildAt(i1);
                    int k2 = getPosition(view);
                    if (k2 >= 0 && k2 < k1)
                    {
                        if (((aez)view.getLayoutParams()).c.o())
                        {
                            if (afl1 == null)
                            {
                                afl1 = view;
                            }
                        } else
                        {
                            if (c.a(view) < j2)
                            {
                                obj = view;
                                if (c.b(view) >= i2)
                                {
                                    break label1;
                                }
                            }
                            if (afe1 == null)
                            {
                                afe1 = view;
                            }
                        }
                    }
                    i1 += l1;
                }
                if (afe1 == null)
                {
                    break label0;
                }
                obj = afe1;
            }
            return ((View) (obj));
        }
        return afl1;
    }

    public final void a(int i1, int j1)
    {
        j = i1;
        k = j1;
        if (e != null)
        {
            e.a = -1;
        }
        requestLayout();
    }

    void a(afe afe1, afl afl1, adk adk1)
    {
    }

    void a(afe afe1, afl afl1, adm adm1, adl adl1)
    {
        afe1 = adm1.a(afe1);
        if (afe1 == null)
        {
            adl1.b = true;
            return;
        }
        afl1 = (aez)afe1.getLayoutParams();
        int i1;
        int j1;
        int k1;
        int l1;
        if (adm1.j == null)
        {
            boolean flag2 = d;
            boolean flag;
            if (adm1.f == -1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag2 == flag)
            {
                addView(afe1);
            } else
            {
                addView(afe1, 0);
            }
        } else
        {
            boolean flag3 = d;
            boolean flag1;
            if (adm1.f == -1)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (flag3 == flag1)
            {
                addDisappearingView(afe1);
            } else
            {
                addDisappearingView(afe1, 0);
            }
        }
        measureChildWithMargins(afe1, 0, 0);
        adl1.a = c.c(afe1);
        if (b == 1)
        {
            if (a())
            {
                i1 = getWidth() - getPaddingRight();
                j1 = i1 - c.d(afe1);
            } else
            {
                j1 = getPaddingLeft();
                i1 = c.d(afe1) + j1;
            }
            if (adm1.f == -1)
            {
                k1 = adm1.b;
                l1 = adm1.b - adl1.a;
            } else
            {
                l1 = adm1.b;
                k1 = adm1.b;
                int i2 = adl1.a;
                k1 += i2;
            }
        } else
        {
            l1 = getPaddingTop();
            k1 = c.d(afe1) + l1;
            if (adm1.f == -1)
            {
                i1 = adm1.b;
                j1 = adm1.b - adl1.a;
            } else
            {
                j1 = adm1.b;
                i1 = adm1.b;
                int j2 = adl1.a;
                i1 += j2;
            }
        }
        layoutDecorated(afe1, j1 + ((aez) (afl1)).leftMargin, l1 + ((aez) (afl1)).topMargin, i1 - ((aez) (afl1)).rightMargin, k1 - ((aez) (afl1)).bottomMargin);
        if (((aez) (afl1)).c.o() || ((aez) (afl1)).c.m())
        {
            adl1.c = true;
        }
        adl1.d = afe1.isFocusable();
    }

    protected final boolean a()
    {
        return getLayoutDirection() == 1;
    }

    public void assertNotInLayoutOrScroll(String s)
    {
        if (e == null)
        {
            super.assertNotInLayoutOrScroll(s);
        }
    }

    final void b()
    {
        if (a == null)
        {
            a = new adm();
        }
        if (c != null) goto _L2; else goto _L1
_L1:
        b;
        JVM INSTR tableswitch 0 1: default 52
    //                   0 63
    //                   1 78;
           goto _L3 _L4 _L5
_L3:
        throw new IllegalArgumentException("invalid orientation");
_L4:
        Object obj = new aef(this);
_L7:
        c = ((aee) (obj));
_L2:
        return;
_L5:
        obj = new aeg(this);
        if (true) goto _L7; else goto _L6
_L6:
    }

    public final int c()
    {
        View view = a(0, getChildCount(), false, true);
        if (view == null)
        {
            return -1;
        } else
        {
            return getPosition(view);
        }
    }

    public boolean canScrollHorizontally()
    {
        return b == 0;
    }

    public boolean canScrollVertically()
    {
        return b == 1;
    }

    public int computeHorizontalScrollExtent(afl afl1)
    {
        return c(afl1);
    }

    public int computeHorizontalScrollOffset(afl afl1)
    {
        return b(afl1);
    }

    public int computeHorizontalScrollRange(afl afl1)
    {
        return d(afl1);
    }

    public int computeVerticalScrollExtent(afl afl1)
    {
        return c(afl1);
    }

    public int computeVerticalScrollOffset(afl afl1)
    {
        return b(afl1);
    }

    public int computeVerticalScrollRange(afl afl1)
    {
        return d(afl1);
    }

    public final int d()
    {
        View view = a(getChildCount() - 1, -1, false, true);
        if (view == null)
        {
            return -1;
        } else
        {
            return getPosition(view);
        }
    }

    public View findViewByPosition(int i1)
    {
        int j1 = getChildCount();
        if (j1 != 0) goto _L2; else goto _L1
_L1:
        View view = null;
_L4:
        return view;
_L2:
        View view1;
        int k1 = i1 - getPosition(getChildAt(0));
        if (k1 < 0 || k1 >= j1)
        {
            break; /* Loop/switch isn't completed */
        }
        view1 = getChildAt(k1);
        view = view1;
        if (getPosition(view1) == i1) goto _L4; else goto _L3
_L3:
        return super.findViewByPosition(i1);
    }

    public aez generateDefaultLayoutParams()
    {
        return new aez(-2, -2);
    }

    public void onDetachedFromWindow(RecyclerView recyclerview, afe afe1)
    {
        super.onDetachedFromWindow(recyclerview, afe1);
    }

    public View onFocusSearchFailed(View view, int i1, afe afe1, afl afl1)
    {
        e();
        if (getChildCount() != 0) goto _L2; else goto _L1
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
            b();
            if (i1 == -1)
            {
                view = b(afe1, afl1);
            } else
            {
                view = a(afe1, afl1);
            }
            if (view != null)
            {
                b();
                a(i1, (int)(0.33F * (float)c.e()), false, afl1);
                a.g = 0x80000000;
                a.a = false;
                a(afe1, a, afl1, true);
                if (i1 == -1)
                {
                    afe1 = f();
                } else
                {
                    afe1 = g();
                }
                if (afe1 != view && afe1.isFocusable())
                {
                    return afe1;
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
        if (b == 1)
        {
            i1 = -1;
        } else
        {
            i1 = 0x80000000;
        }
          goto _L10
_L9:
        if (b == 1)
        {
            i1 = 1;
        } else
        {
            i1 = 0x80000000;
        }
          goto _L10
_L6:
        if (b == 0)
        {
            i1 = -1;
        } else
        {
            i1 = 0x80000000;
        }
          goto _L10
_L8:
        if (b == 0)
        {
            i1 = 1;
        } else
        {
            i1 = 0x80000000;
        }
          goto _L10
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityevent)
    {
        super.onInitializeAccessibilityEvent(accessibilityevent);
        if (getChildCount() > 0)
        {
            accessibilityevent = ot.a(accessibilityevent);
            accessibilityevent.b(c());
            accessibilityevent.c(d());
        }
    }

    public void onLayoutChildren(afe afe1, afl afl1)
    {
        Object obj;
        Object obj1;
        int i1;
        int j1;
        if ((e != null || j != -1) && afl1.b() == 0)
        {
            removeAndRecycleAllViews(afe1);
            return;
        }
        if (e != null && e.a())
        {
            j = e.a;
        }
        b();
        a.a = false;
        e();
        obj = l;
        obj.a = -1;
        obj.b = 0x80000000;
        obj.c = false;
        l.c = d;
        obj1 = l;
        aez aez1;
        int i2;
        if (afl1.j || j == -1)
        {
            i1 = 0;
        } else
        if (j < 0 || j >= afl1.b())
        {
            j = -1;
            k = 0x80000000;
            i1 = 0;
        } else
        {
label0:
            {
                obj1.a = j;
                if (e == null || !e.a())
                {
                    break label0;
                }
                obj1.c = e.c;
                if (((adk) (obj1)).c)
                {
                    obj1.b = c.c() - e.b;
                } else
                {
                    obj1.b = c.b() + e.b;
                }
                i1 = 1;
            }
        }
_L10:
        if (i1 != 0) goto _L2; else goto _L1
_L1:
        if (getChildCount() == 0) goto _L4; else goto _L3
_L3:
        obj = getFocusedChild();
        if (obj == null) goto _L6; else goto _L5
_L5:
        aez1 = (aez)((View) (obj)).getLayoutParams();
        boolean flag;
        if (!aez1.c.o() && aez1.c.d() >= 0 && aez1.c.d() < afl1.b())
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 == 0) goto _L6; else goto _L7
_L7:
        j1 = ((adk) (obj1)).d.c.a();
        if (j1 >= 0)
        {
            ((adk) (obj1)).a(((View) (obj)));
        } else
        {
            obj1.a = ((adk) (obj1)).d.getPosition(((View) (obj)));
            if (((adk) (obj1)).c)
            {
                i1 = ((adk) (obj1)).d.c.c() - j1 - ((adk) (obj1)).d.c.b(((View) (obj)));
                obj1.b = ((adk) (obj1)).d.c.c() - i1;
                if (i1 > 0)
                {
                    j1 = ((adk) (obj1)).d.c.c(((View) (obj)));
                    k1 = ((adk) (obj1)).b;
                    l1 = ((adk) (obj1)).d.c.b();
                    j1 = k1 - j1 - (Math.min(((adk) (obj1)).d.c.a(((View) (obj))) - l1, 0) + l1);
                    if (j1 < 0)
                    {
                        k1 = ((adk) (obj1)).b;
                        obj1.b = Math.min(i1, -j1) + k1;
                    }
                }
            } else
            {
                k1 = ((adk) (obj1)).d.c.a(((View) (obj)));
                i1 = k1 - ((adk) (obj1)).d.c.b();
                obj1.b = k1;
                if (i1 > 0)
                {
                    l1 = ((adk) (obj1)).d.c.c(((View) (obj)));
                    int j2 = ((adk) (obj1)).d.c.c();
                    int l2 = ((adk) (obj1)).d.c.b(((View) (obj)));
                    j1 = ((adk) (obj1)).d.c.c() - Math.min(0, j2 - j1 - l2) - (k1 + l1);
                    if (j1 < 0)
                    {
                        obj1.b = ((adk) (obj1)).b - Math.min(i1, -j1);
                    }
                }
            }
        }
        i1 = 1;
_L14:
        if (i1 == 0)
        {
            ((adk) (obj1)).a();
            obj1.a = 0;
        }
_L2:
        i1 = a(afl1);
        int k1;
        int l1;
        if (a.i >= 0)
        {
            j1 = 0;
        } else
        {
            j1 = i1;
            i1 = 0;
        }
        k1 = j1 + c.b();
        l1 = i1 + c.f();
        i1 = l1;
        j1 = k1;
        if (afl1.j)
        {
            i1 = l1;
            j1 = k1;
            if (j != -1)
            {
                i1 = l1;
                j1 = k1;
                if (k != 0x80000000)
                {
                    obj = findViewByPosition(j);
                    i1 = l1;
                    j1 = k1;
                    if (obj != null)
                    {
                        if (d)
                        {
                            i1 = c.c() - c.b(((View) (obj))) - k;
                        } else
                        {
                            i1 = c.a(((View) (obj)));
                            j1 = c.b();
                            i1 = k - (i1 - j1);
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
        a(afe1, afl1, l);
        detachAndScrapAttachedViews(afe1);
        if (l.c)
        {
            b(l);
            a.h = j1;
            a(afe1, a, afl1, false);
            l1 = a.b;
            i2 = a.d;
            j1 = i1;
            if (a.c > 0)
            {
                j1 = i1 + a.c;
            }
            a(l);
            a.h = j1;
            obj = a;
            obj.d = ((adm) (obj)).d + a.e;
            a(afe1, a, afl1, false);
            k1 = a.b;
            int k2;
            int i3;
            int j3;
            int k3;
            boolean flag1;
            if (a.c > 0)
            {
                i1 = a.c;
                c(i2, l1);
                a.h = i1;
                a(afe1, a, afl1, false);
                i1 = a.b;
            } else
            {
                i1 = l1;
            }
            j1 = i1;
            i1 = k1;
        } else
        {
            a(l);
            a.h = i1;
            a(afe1, a, afl1, false);
            k1 = a.b;
            k2 = a.d;
            i1 = j1;
            if (a.c > 0)
            {
                i1 = j1 + a.c;
            }
            b(l);
            a.h = i1;
            obj = a;
            obj.d = ((adm) (obj)).d + a.e;
            a(afe1, a, afl1, false);
            l1 = a.b;
            i1 = k1;
            j1 = l1;
            if (a.c > 0)
            {
                i1 = a.c;
                b(k2, k1);
                a.h = i1;
                a(afe1, a, afl1, false);
                i1 = a.b;
                j1 = l1;
            }
        }
        if (getChildCount() > 0)
        {
            if (d)
            {
                k1 = a(i1, afe1, afl1, true);
                l1 = j1 + k1;
                j1 = b(l1, afe1, afl1, false);
                l1 += j1;
                k1 = i1 + k1 + j1;
            } else
            {
                k1 = b(j1, afe1, afl1, true);
                i1 += k1;
                k2 = a(i1, afe1, afl1, false);
                l1 = j1 + k1 + k2;
                k1 = i1 + k2;
            }
        } else
        {
            k1 = i1;
            l1 = j1;
        }
        if (afl1.l && getChildCount() != 0 && !afl1.j && supportsPredictiveItemAnimations())
        {
            i1 = 0;
            j1 = 0;
            obj = afe1.d;
            j3 = ((List) (obj)).size();
            k3 = getPosition(getChildAt(0));
            k2 = 0;
            while (k2 < j3) 
            {
                obj1 = (afn)((List) (obj)).get(k2);
                if (!((afn) (obj1)).o())
                {
                    if (((afn) (obj1)).d() < k3)
                    {
                        flag1 = true;
                    } else
                    {
                        flag1 = false;
                    }
                    if (flag1 != d)
                    {
                        i3 = -1;
                    } else
                    {
                        i3 = 1;
                    }
                    if (i3 == -1)
                    {
                        i3 = c.c(((afn) (obj1)).a) + i1;
                        i1 = j1;
                        j1 = i3;
                    } else
                    {
                        i3 = c.c(((afn) (obj1)).a) + j1;
                        j1 = i1;
                        i1 = i3;
                    }
                } else
                {
                    i3 = i1;
                    i1 = j1;
                    j1 = i3;
                }
                i3 = k2 + 1;
                k2 = j1;
                j1 = i1;
                i1 = k2;
                k2 = i3;
            }
            a.j = ((List) (obj));
            if (i1 > 0)
            {
                c(getPosition(f()), l1);
                a.h = i1;
                a.c = 0;
                a.a(null);
                a(afe1, a, afl1, false);
            }
            if (j1 > 0)
            {
                b(getPosition(g()), k1);
                a.h = j1;
                a.c = 0;
                a.a(null);
                a(afe1, a, afl1, false);
            }
            a.j = null;
        }
        if (!afl1.j)
        {
            j = -1;
            k = 0x80000000;
            afe1 = c;
            afe1.b = afe1.e();
        }
        f = false;
        e = null;
        return;
        if (k != 0x80000000)
        {
            break MISSING_BLOCK_LABEL_1139;
        }
        obj = findViewByPosition(j);
        if (obj == null) goto _L9; else goto _L8
_L8:
        if (c.c(((View) (obj))) > c.e())
        {
            ((adk) (obj1)).a();
        } else
        if (c.a(((View) (obj))) - c.b() < 0)
        {
            obj1.b = c.b();
            obj1.c = false;
        } else
        {
label1:
            {
                if (c.c() - c.b(((View) (obj))) >= 0)
                {
                    break label1;
                }
                obj1.b = c.c();
                obj1.c = true;
            }
        }
_L12:
        i1 = 1;
          goto _L10
        if (((adk) (obj1)).c)
        {
            i1 = c.b(((View) (obj))) + c.a();
        } else
        {
            i1 = c.a(((View) (obj)));
        }
        obj1.b = i1;
_L11:
        i1 = 1;
          goto _L10
_L9:
        if (getChildCount() > 0)
        {
            i1 = getPosition(getChildAt(0));
            if (j < i1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag == d)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            obj1.c = flag;
        }
        ((adk) (obj1)).a();
          goto _L11
        obj1.c = d;
        if (d)
        {
            obj1.b = c.c() - k;
        } else
        {
            obj1.b = c.b() + k;
        }
          goto _L12
_L6:
        if (!f) goto _L13; else goto _L4
_L4:
        i1 = 0;
          goto _L14
_L13:
        if (((adk) (obj1)).c)
        {
            obj = a(afe1, afl1);
        } else
        {
            obj = b(afe1, afl1);
        }
        if (obj == null) goto _L4; else goto _L15
_L15:
        ((adk) (obj1)).a(((View) (obj)));
        if (!afl1.j && supportsPredictiveItemAnimations())
        {
            if (c.a(((View) (obj))) >= c.c() || c.b(((View) (obj))) < c.b())
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            if (i1 != 0)
            {
                if (((adk) (obj1)).c)
                {
                    i1 = c.c();
                } else
                {
                    i1 = c.b();
                }
                obj1.b = i1;
            }
        }
        i1 = 1;
          goto _L14
    }

    public void onRestoreInstanceState(Parcelable parcelable)
    {
        if (parcelable instanceof adn)
        {
            e = (adn)parcelable;
            requestLayout();
        }
    }

    public Parcelable onSaveInstanceState()
    {
        if (e != null)
        {
            return new adn(e);
        }
        adn adn1 = new adn();
        if (getChildCount() > 0)
        {
            b();
            boolean flag = f ^ d;
            adn1.c = flag;
            if (flag)
            {
                View view = g();
                adn1.b = c.c() - c.b(view);
                adn1.a = getPosition(view);
                return adn1;
            } else
            {
                View view1 = f();
                adn1.a = getPosition(view1);
                adn1.b = c.a(view1) - c.b();
                return adn1;
            }
        } else
        {
            adn1.a = -1;
            return adn1;
        }
    }

    public int scrollHorizontallyBy(int i1, afe afe1, afl afl1)
    {
        if (b == 1)
        {
            return 0;
        } else
        {
            return a(i1, afe1, afl1);
        }
    }

    public void scrollToPosition(int i1)
    {
        j = i1;
        k = 0x80000000;
        if (e != null)
        {
            e.a = -1;
        }
        requestLayout();
    }

    public int scrollVerticallyBy(int i1, afe afe1, afl afl1)
    {
        if (b == 0)
        {
            return 0;
        } else
        {
            return a(i1, afe1, afl1);
        }
    }

    public void smoothScrollToPosition(RecyclerView recyclerview, afl afl1, int i1)
    {
        recyclerview = new adj(this, recyclerview.getContext());
        recyclerview.setTargetPosition(i1);
        startSmoothScroll(recyclerview);
    }

    public boolean supportsPredictiveItemAnimations()
    {
        return e == null && !f;
    }
}
