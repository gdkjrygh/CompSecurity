// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.graphics.PointF;
import android.os.Parcelable;
import android.support.v4.view.accessibility.AccessibilityEventCompat;
import android.support.v4.view.accessibility.AccessibilityRecordCompat;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

// Referenced classes of package android.support.v7.widget:
//            OrientationHelper, ScrollbarHelper, RecyclerView, LinearSmoothScroller

public class LinearLayoutManager extends RecyclerView.LayoutManager
{

    int a;
    OrientationHelper b;
    boolean c;
    int d;
    int e;
    SavedState f;
    final AnchorInfo g;
    private LayoutState k;
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;
    private boolean p;

    public LinearLayoutManager(Context context)
    {
        this(context, 1, false);
    }

    public LinearLayoutManager(Context context, int i1, boolean flag)
    {
        m = false;
        c = false;
        n = false;
        o = true;
        d = -1;
        e = 0x80000000;
        f = null;
        g = new AnchorInfo();
        a(i1);
        a(flag);
    }

    private void B()
    {
        boolean flag = true;
        if (a == 1 || !e())
        {
            c = m;
            return;
        }
        if (m)
        {
            flag = false;
        }
        c = flag;
    }

    private View C()
    {
        int i1;
        if (c)
        {
            i1 = q() - 1;
        } else
        {
            i1 = 0;
        }
        return g(i1);
    }

    private View D()
    {
        int i1;
        if (c)
        {
            i1 = 0;
        } else
        {
            i1 = q() - 1;
        }
        return g(i1);
    }

    private int a(int i1, RecyclerView.Recycler recycler, RecyclerView.State state, boolean flag)
    {
        int j1 = b.d() - i1;
        if (j1 > 0)
        {
            int k1 = -c(-j1, recycler, state);
            j1 = k1;
            if (flag)
            {
                i1 = b.d() - (i1 + k1);
                j1 = k1;
                if (i1 > 0)
                {
                    b.a(i1);
                    j1 = k1 + i1;
                }
            }
            return j1;
        } else
        {
            return 0;
        }
    }

    private View a(boolean flag, boolean flag1)
    {
        if (c)
        {
            return a(q() - 1, -1, flag, flag1);
        } else
        {
            return a(0, q(), flag, flag1);
        }
    }

    private void a(int i1, int j1, boolean flag, RecyclerView.State state)
    {
        byte byte0 = -1;
        boolean flag1 = true;
        k.h = a(state);
        k.f = i1;
        if (i1 == 1)
        {
            state = k;
            state.h = ((LayoutState) (state)).h + b.g();
            state = D();
            LayoutState layoutstate = k;
            if (c)
            {
                i1 = byte0;
            } else
            {
                i1 = 1;
            }
            layoutstate.e = i1;
            k.d = d(state) + k.e;
            k.b = b.b(state);
            i1 = b.b(state) - b.d();
        } else
        {
            state = C();
            LayoutState layoutstate1 = k;
            layoutstate1.h = layoutstate1.h + b.c();
            layoutstate1 = k;
            if (c)
            {
                i1 = ((flag1) ? 1 : 0);
            } else
            {
                i1 = -1;
            }
            layoutstate1.e = i1;
            k.d = d(state) + k.e;
            k.b = b.a(state);
            i1 = -b.a(state) + b.c();
        }
        k.c = j1;
        if (flag)
        {
            state = k;
            state.c = ((LayoutState) (state)).c - i1;
        }
        k.g = i1;
    }

    private void a(AnchorInfo anchorinfo)
    {
        b(anchorinfo.a, anchorinfo.b);
    }

    private void a(RecyclerView.Recycler recycler, int i1)
    {
        if (i1 >= 0) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int l1;
        l1 = q();
        if (!c)
        {
            break; /* Loop/switch isn't completed */
        }
        int j1 = l1 - 1;
        while (j1 >= 0) 
        {
            View view = g(j1);
            if (b.b(view) > i1)
            {
                a(recycler, l1 - 1, j1);
                return;
            }
            j1--;
        }
        if (true) goto _L1; else goto _L3
_L3:
        int k1 = 0;
        while (k1 < l1) 
        {
            View view1 = g(k1);
            if (b.b(view1) > i1)
            {
                a(recycler, 0, k1);
                return;
            }
            k1++;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    private void a(RecyclerView.Recycler recycler, int i1, int j1)
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
            a(j1, recycler);
            j1--;
        }
        if (true) goto _L1; else goto _L3
_L3:
        while (k1 > j1) 
        {
            a(k1, recycler);
            k1--;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    private void a(RecyclerView.Recycler recycler, LayoutState layoutstate)
    {
        if (!layoutstate.a)
        {
            return;
        }
        if (layoutstate.f == -1)
        {
            b(recycler, layoutstate.g);
            return;
        } else
        {
            a(recycler, layoutstate.g);
            return;
        }
    }

    private boolean a(RecyclerView.State state, AnchorInfo anchorinfo)
    {
        boolean flag1 = false;
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
        anchorinfo.a = d;
        if (f != null && f.a())
        {
            anchorinfo.c = f.c;
            if (anchorinfo.c)
            {
                anchorinfo.b = b.d() - f.b;
                return true;
            } else
            {
                anchorinfo.b = b.c() + f.b;
                return true;
            }
        }
        if (e == 0x80000000)
        {
            state = b(d);
            if (state != null)
            {
                if (b.c(state) > b.f())
                {
                    anchorinfo.b();
                    return true;
                }
                if (b.a(state) - b.c() < 0)
                {
                    anchorinfo.b = b.c();
                    anchorinfo.c = false;
                    return true;
                }
                if (b.d() - b.b(state) < 0)
                {
                    anchorinfo.b = b.d();
                    anchorinfo.c = true;
                    return true;
                }
                int i1;
                if (anchorinfo.c)
                {
                    i1 = b.b(state) + b.b();
                } else
                {
                    i1 = b.a(state);
                }
                anchorinfo.b = i1;
                return true;
            }
            if (q() > 0)
            {
                int j1 = d(g(0));
                boolean flag;
                if (d < j1)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (flag == c)
                {
                    flag1 = true;
                }
                anchorinfo.c = flag1;
            }
            anchorinfo.b();
            return true;
        }
        anchorinfo.c = c;
        if (c)
        {
            anchorinfo.b = b.d() - e;
            return true;
        } else
        {
            anchorinfo.b = b.c() + e;
            return true;
        }
    }

    private int b(int i1, RecyclerView.Recycler recycler, RecyclerView.State state, boolean flag)
    {
        int j1 = i1 - b.c();
        if (j1 > 0)
        {
            int k1 = -c(j1, recycler, state);
            j1 = k1;
            if (flag)
            {
                i1 = (i1 + k1) - b.c();
                j1 = k1;
                if (i1 > 0)
                {
                    b.a(-i1);
                    j1 = k1 - i1;
                }
            }
            return j1;
        } else
        {
            return 0;
        }
    }

    private View b(boolean flag, boolean flag1)
    {
        if (c)
        {
            return a(0, q(), flag, flag1);
        } else
        {
            return a(q() - 1, -1, flag, flag1);
        }
    }

    private void b(int i1, int j1)
    {
        k.c = b.d() - j1;
        LayoutState layoutstate = k;
        int k1;
        if (c)
        {
            k1 = -1;
        } else
        {
            k1 = 1;
        }
        layoutstate.e = k1;
        k.d = i1;
        k.f = 1;
        k.b = j1;
        k.g = 0x80000000;
    }

    private void b(AnchorInfo anchorinfo)
    {
        c(anchorinfo.a, anchorinfo.b);
    }

    private void b(RecyclerView.Recycler recycler, int i1)
    {
        int j1 = q();
        if (i1 >= 0) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int k1;
        k1 = b.e() - i1;
        if (!c)
        {
            break; /* Loop/switch isn't completed */
        }
        i1 = 0;
        while (i1 < j1) 
        {
            View view = g(i1);
            if (b.a(view) < k1)
            {
                a(recycler, 0, i1);
                return;
            }
            i1++;
        }
        if (true) goto _L1; else goto _L3
_L3:
        i1 = j1 - 1;
        while (i1 >= 0) 
        {
            View view1 = g(i1);
            if (b.a(view1) < k1)
            {
                a(recycler, j1 - 1, i1);
                return;
            }
            i1--;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    private void b(RecyclerView.Recycler recycler, RecyclerView.State state, int i1, int j1)
    {
        if (!state.b() || q() == 0 || state.a() || !j())
        {
            return;
        }
        int k1 = 0;
        int l1 = 0;
        List list = recycler.b();
        int j3 = list.size();
        int k3 = d(g(0));
        int i2 = 0;
        while (i2 < j3) 
        {
            RecyclerView.ViewHolder viewholder = (RecyclerView.ViewHolder)list.get(i2);
            int k2;
            if (viewholder.isRemoved())
            {
                int j2 = l1;
                l1 = k1;
                k1 = j2;
            } else
            {
                int l2;
                boolean flag;
                if (viewholder.getLayoutPosition() < k3)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (flag != c)
                {
                    l2 = -1;
                } else
                {
                    l2 = 1;
                }
                if (l2 == -1)
                {
                    l2 = b.c(viewholder.itemView) + k1;
                    k1 = l1;
                    l1 = l2;
                } else
                {
                    int i3 = b.c(viewholder.itemView) + l1;
                    l1 = k1;
                    k1 = i3;
                }
            }
            k2 = i2 + 1;
            i2 = l1;
            l1 = k1;
            k1 = i2;
            i2 = k2;
        }
        k.k = list;
        if (k1 > 0)
        {
            c(d(C()), i1);
            k.h = k1;
            k.c = 0;
            k.a();
            a(recycler, k, state, false);
        }
        if (l1 > 0)
        {
            b(d(D()), j1);
            k.h = l1;
            k.c = 0;
            k.a();
            a(recycler, k, state, false);
        }
        k.k = null;
    }

    private void b(RecyclerView.Recycler recycler, RecyclerView.State state, AnchorInfo anchorinfo)
    {
        while (a(state, anchorinfo) || c(recycler, state, anchorinfo)) 
        {
            return;
        }
        anchorinfo.b();
        int i1;
        if (n)
        {
            i1 = state.e() - 1;
        } else
        {
            i1 = 0;
        }
        anchorinfo.a = i1;
    }

    private void c(int i1, int j1)
    {
        k.c = j1 - b.c();
        k.d = i1;
        LayoutState layoutstate = k;
        if (c)
        {
            i1 = 1;
        } else
        {
            i1 = -1;
        }
        layoutstate.e = i1;
        k.f = -1;
        k.b = j1;
        k.g = 0x80000000;
    }

    private boolean c(RecyclerView.Recycler recycler, RecyclerView.State state, AnchorInfo anchorinfo)
    {
        boolean flag = false;
        if (q() != 0)
        {
            View view = x();
            if (view != null && AnchorInfo.a(anchorinfo, view, state))
            {
                anchorinfo.a(view);
                return true;
            }
            if (l == n)
            {
                if (anchorinfo.c)
                {
                    recycler = f(recycler, state);
                } else
                {
                    recycler = g(recycler, state);
                }
                if (recycler != null)
                {
                    anchorinfo.b(recycler);
                    if (!state.a() && j())
                    {
                        if (b.a(recycler) >= b.d() || b.b(recycler) < b.c())
                        {
                            flag = true;
                        }
                        if (flag)
                        {
                            int i1;
                            if (anchorinfo.c)
                            {
                                i1 = b.d();
                            } else
                            {
                                i1 = b.c();
                            }
                            anchorinfo.b = i1;
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    private View f(RecyclerView.Recycler recycler, RecyclerView.State state)
    {
        if (c)
        {
            return h(recycler, state);
        } else
        {
            return i(recycler, state);
        }
    }

    private View g(RecyclerView.Recycler recycler, RecyclerView.State state)
    {
        if (c)
        {
            return i(recycler, state);
        } else
        {
            return h(recycler, state);
        }
    }

    private int h(RecyclerView.State state)
    {
        boolean flag1 = false;
        if (q() == 0)
        {
            return 0;
        }
        f();
        OrientationHelper orientationhelper = b;
        View view;
        boolean flag;
        if (!o)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        view = a(flag, true);
        flag = flag1;
        if (!o)
        {
            flag = true;
        }
        return ScrollbarHelper.a(state, orientationhelper, view, b(flag, true), this, o, c);
    }

    private View h(RecyclerView.Recycler recycler, RecyclerView.State state)
    {
        return a(recycler, state, 0, q(), state.e());
    }

    private int i(RecyclerView.State state)
    {
        boolean flag1 = false;
        if (q() == 0)
        {
            return 0;
        }
        f();
        OrientationHelper orientationhelper = b;
        View view;
        boolean flag;
        if (!o)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        view = a(flag, true);
        flag = flag1;
        if (!o)
        {
            flag = true;
        }
        return ScrollbarHelper.a(state, orientationhelper, view, b(flag, true), this, o);
    }

    private View i(RecyclerView.Recycler recycler, RecyclerView.State state)
    {
        return a(recycler, state, q() - 1, -1, state.e());
    }

    private int j(RecyclerView.State state)
    {
        boolean flag1 = false;
        if (q() == 0)
        {
            return 0;
        }
        f();
        OrientationHelper orientationhelper = b;
        View view;
        boolean flag;
        if (!o)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        view = a(flag, true);
        flag = flag1;
        if (!o)
        {
            flag = true;
        }
        return ScrollbarHelper.b(state, orientationhelper, view, b(flag, true), this, o);
    }

    private int k(int i1)
    {
        int j1;
        byte byte0;
        boolean flag;
        int k1;
        byte0 = -1;
        flag = true;
        k1 = 0x80000000;
        j1 = byte0;
        i1;
        JVM INSTR lookupswitch 6: default 72
    //                   1: 75
    //                   2: 77
    //                   17: 107
    //                   33: 79
    //                   66: 119
    //                   130: 92;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L2:
        break MISSING_BLOCK_LABEL_75;
_L1:
        j1 = 0x80000000;
_L9:
        return j1;
_L3:
        return 1;
_L5:
        j1 = byte0;
        if (a == 1) goto _L9; else goto _L8
_L8:
        return 0x80000000;
_L7:
        i1 = k1;
        if (a == 1)
        {
            i1 = 1;
        }
        return i1;
_L4:
        j1 = byte0;
        if (a == 0) goto _L9; else goto _L10
_L10:
        return 0x80000000;
_L6:
        if (a == 0)
        {
            i1 = ((flag) ? 1 : 0);
        } else
        {
            i1 = 0x80000000;
        }
        return i1;
    }

    public int a(int i1, RecyclerView.Recycler recycler, RecyclerView.State state)
    {
        if (a == 1)
        {
            return 0;
        } else
        {
            return c(i1, recycler, state);
        }
    }

    int a(RecyclerView.Recycler recycler, LayoutState layoutstate, RecyclerView.State state, boolean flag)
    {
        LayoutChunkResult layoutchunkresult;
        int i1;
        int k1;
        k1 = layoutstate.c;
        if (layoutstate.g != 0x80000000)
        {
            if (layoutstate.c < 0)
            {
                layoutstate.g = layoutstate.g + layoutstate.c;
            }
            a(recycler, layoutstate);
        }
        i1 = layoutstate.c + layoutstate.h;
        layoutchunkresult = new LayoutChunkResult();
_L4:
        if (i1 <= 0 || !layoutstate.a(state)) goto _L2; else goto _L1
_L1:
        layoutchunkresult.a();
        a(recycler, state, layoutstate, layoutchunkresult);
        if (!layoutchunkresult.b) goto _L3; else goto _L2
_L2:
        return k1 - layoutstate.c;
_L3:
        int j1;
label0:
        {
            layoutstate.b = layoutstate.b + layoutchunkresult.a * layoutstate.f;
            if (layoutchunkresult.c && k.k == null)
            {
                j1 = i1;
                if (state.a())
                {
                    break label0;
                }
            }
            layoutstate.c = layoutstate.c - layoutchunkresult.a;
            j1 = i1 - layoutchunkresult.a;
        }
        if (layoutstate.g != 0x80000000)
        {
            layoutstate.g = layoutstate.g + layoutchunkresult.a;
            if (layoutstate.c < 0)
            {
                layoutstate.g = layoutstate.g + layoutstate.c;
            }
            a(recycler, layoutstate);
        }
        i1 = j1;
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        i1 = j1;
        if (!layoutchunkresult.d) goto _L4; else goto _L2
    }

    protected int a(RecyclerView.State state)
    {
        if (state.d())
        {
            return b.f();
        } else
        {
            return 0;
        }
    }

    public RecyclerView.LayoutParams a()
    {
        return new RecyclerView.LayoutParams(-2, -2);
    }

    View a(int i1, int j1, boolean flag, boolean flag1)
    {
        f();
        int k1 = b.c();
        int l1 = b.d();
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
            View view1 = g(i1);
            int i2 = b.a(view1);
            int j2 = b.b(view1);
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

    View a(RecyclerView.Recycler recycler, RecyclerView.State state, int i1, int j1, int k1)
    {
        Object obj;
        int i2;
        int j2;
        state = null;
        f();
        i2 = b.c();
        j2 = b.d();
        int l1;
        int k2;
        if (j1 > i1)
        {
            l1 = 1;
        } else
        {
            l1 = -1;
        }
        recycler = null;
        if (i1 == j1) goto _L2; else goto _L1
_L1:
        obj = g(i1);
        k2 = d(((View) (obj)));
        if (k2 < 0 || k2 >= k1)
        {
            break MISSING_BLOCK_LABEL_172;
        }
        if (!((RecyclerView.LayoutParams)((View) (obj)).getLayoutParams()).a()) goto _L4; else goto _L3
_L3:
        if (recycler != null)
        {
            break MISSING_BLOCK_LABEL_172;
        }
        recycler = state;
        state = ((RecyclerView.State) (obj));
_L9:
        i1 += l1;
        obj = state;
        state = recycler;
        recycler = ((RecyclerView.Recycler) (obj));
        break MISSING_BLOCK_LABEL_35;
_L4:
        if (b.a(((View) (obj))) >= j2) goto _L6; else goto _L5
_L5:
        Object obj1 = obj;
        if (b.b(((View) (obj))) >= i2) goto _L7; else goto _L6
_L6:
        if (state != null)
        {
            break MISSING_BLOCK_LABEL_172;
        }
        state = recycler;
        recycler = ((RecyclerView.Recycler) (obj));
        continue; /* Loop/switch isn't completed */
_L2:
        if (state == null)
        {
            state = recycler;
        }
        obj1 = state;
_L7:
        return ((View) (obj1));
        RecyclerView.Recycler recycler1 = recycler;
        recycler = state;
        state = recycler1;
        if (true) goto _L9; else goto _L8
_L8:
    }

    public View a(View view, int i1, RecyclerView.Recycler recycler, RecyclerView.State state)
    {
        B();
        if (q() != 0)
        {
            if ((i1 = k(i1)) != 0x80000000)
            {
                f();
                if (i1 == -1)
                {
                    view = g(recycler, state);
                } else
                {
                    view = f(recycler, state);
                }
                if (view != null)
                {
                    f();
                    a(i1, (int)(0.33F * (float)b.f()), false, state);
                    k.g = 0x80000000;
                    k.a = false;
                    a(recycler, k, state, true);
                    if (i1 == -1)
                    {
                        recycler = C();
                    } else
                    {
                        recycler = D();
                    }
                    if (recycler != view && recycler.isFocusable())
                    {
                        return recycler;
                    }
                }
            }
        }
        return null;
    }

    public void a(int i1)
    {
        if (i1 != 0 && i1 != 1)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("invalid orientation:").append(i1).toString());
        }
        a(((String) (null)));
        if (i1 == a)
        {
            return;
        } else
        {
            a = i1;
            b = null;
            k();
            return;
        }
    }

    public void a(Parcelable parcelable)
    {
        if (parcelable instanceof SavedState)
        {
            f = (SavedState)parcelable;
            k();
        }
    }

    public void a(RecyclerView.Recycler recycler, RecyclerView.State state)
    {
        if ((f != null || d != -1) && state.e() == 0)
        {
            c(recycler);
            return;
        }
        if (f != null && f.a())
        {
            d = f.a;
        }
        f();
        k.a = false;
        B();
        g.a();
        g.c = c ^ n;
        b(recycler, state, g);
        int i1 = a(state);
        int j1;
        int k1;
        int l1;
        if (k.j >= 0)
        {
            j1 = 0;
        } else
        {
            j1 = i1;
            i1 = 0;
        }
        k1 = j1 + b.c();
        l1 = i1 + b.g();
        i1 = l1;
        j1 = k1;
        if (state.a())
        {
            i1 = l1;
            j1 = k1;
            if (d != -1)
            {
                i1 = l1;
                j1 = k1;
                if (e != 0x80000000)
                {
                    Object obj = b(d);
                    i1 = l1;
                    j1 = k1;
                    if (obj != null)
                    {
                        int i2;
                        if (c)
                        {
                            i1 = b.d() - b.b(((View) (obj))) - e;
                        } else
                        {
                            i1 = b.a(((View) (obj)));
                            j1 = b.c();
                            i1 = e - (i1 - j1);
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
        a(recycler, state, g);
        a(recycler);
        k.i = state.a();
        if (g.c)
        {
            b(g);
            k.h = j1;
            a(recycler, k, state, false);
            l1 = k.b;
            i2 = k.d;
            j1 = i1;
            if (k.c > 0)
            {
                j1 = i1 + k.c;
            }
            a(g);
            k.h = j1;
            obj = k;
            obj.d = ((LayoutState) (obj)).d + k.e;
            a(recycler, k, state, false);
            k1 = k.b;
            LayoutState layoutstate;
            int j2;
            if (k.c > 0)
            {
                i1 = k.c;
                c(i2, l1);
                k.h = i1;
                a(recycler, k, state, false);
                i1 = k.b;
            } else
            {
                i1 = l1;
            }
            j1 = i1;
            i1 = k1;
        } else
        {
            a(g);
            k.h = i1;
            a(recycler, k, state, false);
            k1 = k.b;
            j2 = k.d;
            i1 = j1;
            if (k.c > 0)
            {
                i1 = j1 + k.c;
            }
            b(g);
            k.h = i1;
            layoutstate = k;
            layoutstate.d = layoutstate.d + k.e;
            a(recycler, k, state, false);
            l1 = k.b;
            i1 = k1;
            j1 = l1;
            if (k.c > 0)
            {
                i1 = k.c;
                b(j2, k1);
                k.h = i1;
                a(recycler, k, state, false);
                i1 = k.b;
                j1 = l1;
            }
        }
        k1 = i1;
        l1 = j1;
        if (q() > 0)
        {
            if (c ^ n)
            {
                k1 = a(i1, recycler, state, true);
                l1 = j1 + k1;
                j1 = b(l1, recycler, state, false);
                l1 += j1;
                k1 = i1 + k1 + j1;
            } else
            {
                k1 = b(j1, recycler, state, true);
                i1 += k1;
                j2 = a(i1, recycler, state, false);
                l1 = j1 + k1 + j2;
                k1 = i1 + j2;
            }
        }
        b(recycler, state, l1, k1);
        if (!state.a())
        {
            d = -1;
            e = 0x80000000;
            b.a();
        }
        l = n;
        f = null;
    }

    void a(RecyclerView.Recycler recycler, RecyclerView.State state, AnchorInfo anchorinfo)
    {
    }

    void a(RecyclerView.Recycler recycler, RecyclerView.State state, LayoutState layoutstate, LayoutChunkResult layoutchunkresult)
    {
        recycler = layoutstate.a(recycler);
        if (recycler == null)
        {
            layoutchunkresult.b = true;
            return;
        }
        state = (RecyclerView.LayoutParams)recycler.getLayoutParams();
        int i1;
        int j1;
        int k1;
        int l1;
        if (layoutstate.k == null)
        {
            boolean flag2 = c;
            boolean flag;
            if (layoutstate.f == -1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag2 == flag)
            {
                b(recycler);
            } else
            {
                b(recycler, 0);
            }
        } else
        {
            boolean flag3 = c;
            boolean flag1;
            if (layoutstate.f == -1)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (flag3 == flag1)
            {
                a(((View) (recycler)));
            } else
            {
                a(((View) (recycler)), 0);
            }
        }
        a(((View) (recycler)), 0, 0);
        layoutchunkresult.a = b.c(recycler);
        if (a == 1)
        {
            if (e())
            {
                i1 = r() - v();
                j1 = i1 - b.d(recycler);
            } else
            {
                j1 = t();
                i1 = b.d(recycler) + j1;
            }
            if (layoutstate.f == -1)
            {
                k1 = layoutstate.b;
                l1 = layoutstate.b - layoutchunkresult.a;
            } else
            {
                l1 = layoutstate.b;
                k1 = layoutstate.b;
                int i2 = layoutchunkresult.a;
                k1 += i2;
            }
        } else
        {
            l1 = u();
            k1 = b.d(recycler) + l1;
            if (layoutstate.f == -1)
            {
                i1 = layoutstate.b;
                j1 = layoutstate.b - layoutchunkresult.a;
            } else
            {
                j1 = layoutstate.b;
                i1 = layoutstate.b;
                int j2 = layoutchunkresult.a;
                i1 += j2;
            }
        }
        a(((View) (recycler)), j1 + ((RecyclerView.LayoutParams) (state)).leftMargin, l1 + ((RecyclerView.LayoutParams) (state)).topMargin, i1 - ((RecyclerView.LayoutParams) (state)).rightMargin, k1 - ((RecyclerView.LayoutParams) (state)).bottomMargin);
        if (state.a() || state.b())
        {
            layoutchunkresult.c = true;
        }
        layoutchunkresult.d = recycler.isFocusable();
    }

    public void a(RecyclerView recyclerview, RecyclerView.Recycler recycler)
    {
        super.a(recyclerview, recycler);
        if (p)
        {
            c(recycler);
            recycler.a();
        }
    }

    public void a(RecyclerView recyclerview, RecyclerView.State state, int i1)
    {
        recyclerview = new LinearSmoothScroller(recyclerview.getContext()) {

            final LinearLayoutManager a;

            public PointF a(int j1)
            {
                return a.c(j1);
            }

            
            {
                a = LinearLayoutManager.this;
                super(context);
            }
        };
        recyclerview.d(i1);
        a(((RecyclerView.SmoothScroller) (recyclerview)));
    }

    public void a(AccessibilityEvent accessibilityevent)
    {
        super.a(accessibilityevent);
        if (q() > 0)
        {
            accessibilityevent = AccessibilityEventCompat.a(accessibilityevent);
            accessibilityevent.b(h());
            accessibilityevent.c(i());
        }
    }

    public void a(String s)
    {
        if (f == null)
        {
            super.a(s);
        }
    }

    public void a(boolean flag)
    {
        a(((String) (null)));
        if (flag == m)
        {
            return;
        } else
        {
            m = flag;
            k();
            return;
        }
    }

    public int b(int i1, RecyclerView.Recycler recycler, RecyclerView.State state)
    {
        if (a == 0)
        {
            return 0;
        } else
        {
            return c(i1, recycler, state);
        }
    }

    public int b(RecyclerView.State state)
    {
        return h(state);
    }

    public Parcelable b()
    {
        if (f != null)
        {
            return new SavedState(f);
        }
        SavedState savedstate = new SavedState();
        if (q() > 0)
        {
            f();
            boolean flag = l ^ c;
            savedstate.c = flag;
            if (flag)
            {
                View view = D();
                savedstate.b = b.d() - b.b(view);
                savedstate.a = d(view);
                return savedstate;
            } else
            {
                View view1 = C();
                savedstate.a = d(view1);
                savedstate.b = b.a(view1) - b.c();
                return savedstate;
            }
        } else
        {
            savedstate.b();
            return savedstate;
        }
    }

    public View b(int i1)
    {
        int j1 = q();
        if (j1 != 0) goto _L2; else goto _L1
_L1:
        View view = null;
_L4:
        return view;
_L2:
        View view1;
        int k1 = i1 - d(g(0));
        if (k1 < 0 || k1 >= j1)
        {
            break; /* Loop/switch isn't completed */
        }
        view1 = g(k1);
        view = view1;
        if (d(view1) == i1) goto _L4; else goto _L3
_L3:
        return super.b(i1);
    }

    int c(int i1, RecyclerView.Recycler recycler, RecyclerView.State state)
    {
        if (q() == 0 || i1 == 0)
        {
            return 0;
        }
        k.a = true;
        f();
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
        a(j1, k1, true, state);
        l1 = k.g + a(recycler, k, state, false);
        if (l1 < 0)
        {
            return 0;
        }
        if (k1 > l1)
        {
            i1 = j1 * l1;
        }
        b.a(-i1);
        k.j = i1;
        return i1;
    }

    public int c(RecyclerView.State state)
    {
        return h(state);
    }

    public PointF c(int i1)
    {
        boolean flag = true;
        boolean flag1 = false;
        if (q() == 0)
        {
            return null;
        }
        if (i1 < d(g(0)))
        {
            flag1 = true;
        }
        i1 = ((flag) ? 1 : 0);
        if (flag1 != c)
        {
            i1 = -1;
        }
        if (a == 0)
        {
            return new PointF(i1, 0.0F);
        } else
        {
            return new PointF(0.0F, i1);
        }
    }

    public boolean c()
    {
        return a == 0;
    }

    public int d(RecyclerView.State state)
    {
        return i(state);
    }

    public void d(int i1)
    {
        d = i1;
        e = 0x80000000;
        if (f != null)
        {
            f.b();
        }
        k();
    }

    public boolean d()
    {
        return a == 1;
    }

    public int e(RecyclerView.State state)
    {
        return i(state);
    }

    protected boolean e()
    {
        return o() == 1;
    }

    public int f(RecyclerView.State state)
    {
        return j(state);
    }

    void f()
    {
        if (k == null)
        {
            k = g();
        }
        if (b == null)
        {
            b = OrientationHelper.a(this, a);
        }
    }

    public int g(RecyclerView.State state)
    {
        return j(state);
    }

    LayoutState g()
    {
        return new LayoutState();
    }

    public int h()
    {
        View view = a(0, q(), false, true);
        if (view == null)
        {
            return -1;
        } else
        {
            return d(view);
        }
    }

    public int i()
    {
        View view = a(q() - 1, -1, false, true);
        if (view == null)
        {
            return -1;
        } else
        {
            return d(view);
        }
    }

    public boolean j()
    {
        return f == null && l == n;
    }

    private class AnchorInfo
    {

        int a;
        int b;
        boolean c;
        final LinearLayoutManager d;

        static boolean a(AnchorInfo anchorinfo, View view, RecyclerView.State state)
        {
            return anchorinfo.a(view, state);
        }

        private boolean a(View view, RecyclerView.State state)
        {
            view = (RecyclerView.LayoutParams)view.getLayoutParams();
            return !view.a() && view.c() >= 0 && view.c() < state.e();
        }

        void a()
        {
            a = -1;
            b = 0x80000000;
            c = false;
        }

        public void a(View view)
        {
            int k1 = d.b.b();
            if (k1 < 0) goto _L2; else goto _L1
_L1:
            b(view);
_L4:
            return;
_L2:
            a = d.d(view);
            if (!c)
            {
                break; /* Loop/switch isn't completed */
            }
            int i1 = d.b.d() - k1 - d.b.b(view);
            b = d.b.d() - i1;
            if (i1 > 0)
            {
                k1 = d.b.c(view);
                int l1 = b;
                int k2 = d.b.c();
                k1 = l1 - k1 - (k2 + Math.min(d.b.a(view) - k2, 0));
                if (k1 < 0)
                {
                    int i2 = b;
                    b = Math.min(i1, -k1) + i2;
                    return;
                }
            }
            if (true) goto _L4; else goto _L3
_L3:
            int j2 = d.b.a(view);
            int j1 = j2 - d.b.c();
            b = j2;
            if (j1 > 0)
            {
                int l2 = d.b.c(view);
                int i3 = d.b.d();
                int j3 = d.b.b(view);
                k1 = d.b.d() - Math.min(0, i3 - k1 - j3) - (j2 + l2);
                if (k1 < 0)
                {
                    b = b - Math.min(j1, -k1);
                    return;
                }
            }
            if (true) goto _L4; else goto _L5
_L5:
        }

        void b()
        {
            int i1;
            if (c)
            {
                i1 = d.b.d();
            } else
            {
                i1 = d.b.c();
            }
            b = i1;
        }

        public void b(View view)
        {
            if (c)
            {
                b = d.b.b(view) + d.b.b();
            } else
            {
                b = d.b.a(view);
            }
            a = d.d(view);
        }

        public String toString()
        {
            return (new StringBuilder()).append("AnchorInfo{mPosition=").append(a).append(", mCoordinate=").append(b).append(", mLayoutFromEnd=").append(c).append('}').toString();
        }

        AnchorInfo()
        {
            d = LinearLayoutManager.this;
            super();
        }
    }


    private class LayoutState
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

        private View b()
        {
            int i1;
            int j1;
            j1 = k.size();
            i1 = 0;
_L3:
            View view;
            RecyclerView.LayoutParams layoutparams;
            if (i1 >= j1)
            {
                break; /* Loop/switch isn't completed */
            }
            view = ((RecyclerView.ViewHolder)k.get(i1)).itemView;
            layoutparams = (RecyclerView.LayoutParams)view.getLayoutParams();
              goto _L1
_L5:
            i1++;
            if (true) goto _L3; else goto _L2
_L1:
            if (layoutparams.a() || d != layoutparams.c()) goto _L5; else goto _L4
_L4:
            a(view);
            return view;
_L2:
            return null;
        }

        View a(RecyclerView.Recycler recycler)
        {
            if (k != null)
            {
                return b();
            } else
            {
                recycler = recycler.b(d);
                d = d + e;
                return recycler;
            }
        }

        public void a()
        {
            a(((View) (null)));
        }

        public void a(View view)
        {
            view = b(view);
            if (view == null)
            {
                d = -1;
                return;
            } else
            {
                d = ((RecyclerView.LayoutParams)view.getLayoutParams()).c();
                return;
            }
        }

        boolean a(RecyclerView.State state)
        {
            return d >= 0 && d < state.e();
        }

        public View b(View view)
        {
            int l1 = k.size();
            View view1 = null;
            int i1 = 0x7fffffff;
            int j1 = 0;
            while (j1 < l1) 
            {
                View view2 = ((RecyclerView.ViewHolder)k.get(j1)).itemView;
                RecyclerView.LayoutParams layoutparams = (RecyclerView.LayoutParams)view2.getLayoutParams();
                if (view2 != view && !layoutparams.a())
                {
                    int k1 = (layoutparams.c() - d) * e;
                    if (k1 >= 0 && k1 < i1)
                    {
                        if (k1 == 0)
                        {
                            return view2;
                        }
                        view1 = view2;
                        i1 = k1;
                    }
                }
                j1++;
            }
            return view1;
        }

        LayoutState()
        {
            a = true;
            h = 0;
            i = false;
            k = null;
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
        boolean c;

        boolean a()
        {
            return a >= 0;
        }

        void b()
        {
            a = -1;
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


    private class LayoutChunkResult
    {

        public int a;
        public boolean b;
        public boolean c;
        public boolean d;

        void a()
        {
            a = 0;
            b = false;
            c = false;
            d = false;
        }

        protected LayoutChunkResult()
        {
        }
    }

}
