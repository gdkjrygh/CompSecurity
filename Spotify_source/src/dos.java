// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.View;
import com.spotify.mobile.android.porcelain.PorcelainAdapter;
import com.spotify.mobile.android.porcelain.collection.PorcelainCarouselCollection;
import com.spotify.mobile.android.util.Assertion;

public final class dos extends aad
{

    private final aac m = new aac() {

        private dos b;

        public final int a(int k)
        {
            if (dos.a(b) == null)
            {
                Assertion.b("getSpanSize called with null RecyclerView");
            } else
            {
                k = dos.a(b, k);
                if (drg.a(k))
                {
                    if (drg.b(k))
                    {
                        return 2;
                    }
                } else
                {
                    return b.c();
                }
            }
            return 1;
        }

            
            {
                b = dos.this;
                super();
            }
    };
    private final abc n = new abc() {

        private dos a;

        public final void a(Rect rect, View view, RecyclerView recyclerview, abm abm)
        {
            int l = 0;
            if (dos.a(a) != null) goto _L2; else goto _L1
_L1:
            Assertion.b("getItemOffsets called with null RecyclerView");
_L4:
            return;
_L2:
            int k;
            int i1;
            view = dos.a(a).a(view);
            i1 = view.d();
            k = view.e();
            if (drg.a(k))
            {
                l = dos.b(a, i1);
                if (dos.c(a, i1) == 0)
                {
                    k = dos.b(a);
                } else
                {
                    k = 0;
                }
                rect.set(l, k, dos.d(a, i1), dos.b(a));
                return;
            }
            int j1 = dos.a(a, i1 - 1);
            boolean flag = drg.d(j1);
            if (flag)
            {
                rect.top = dos.c(a);
            }
            if (!drg.c(k))
            {
                continue; /* Loop/switch isn't completed */
            }
            rect.bottom = dos.b(a);
            view = dos.e(a, i1);
            k = l;
            if (view instanceof PorcelainCarouselCollection)
            {
                k = l;
                if (!TextUtils.isEmpty(((PorcelainCarouselCollection)view).getBackground()))
                {
                    k = 1;
                }
            }
            if (k == 0 && (i1 == 0 || !flag && !drg.c(j1)))
            {
                rect.top = rect.top + dos.b(a);
                return;
            }
            continue; /* Loop/switch isn't completed */
            if (!drg.a(dos.a(a, i1 + 1))) goto _L4; else goto _L3
_L3:
            if (drg.d(k))
            {
                rect.bottom = dos.c(a);
                return;
            }
            if (drg.e(k))
            {
                rect.bottom = dos.b(a);
                return;
            }
            if (true) goto _L4; else goto _L5
_L5:
        }

            
            {
                a = dos.this;
                super();
            }
    };
    private final djv o;
    private final int p;
    private final int q;
    private final int r;
    private final SparseIntArray s = new SparseIntArray();
    private final SparseIntArray t = new SparseIntArray();
    private final SparseIntArray u = new SparseIntArray();
    private final SparseIntArray v = new SparseIntArray();
    private RecyclerView w;

    public dos(Context context)
    {
        ctz.a(context);
        super(context.getResources().getInteger(0x7f0e0001));
        p = context.getResources().getDimensionPixelSize(0x7f0c008d);
        q = p / 4;
        m.a();
        r = ((c() + 1) * p) / c();
        a(m);
        o = new djv(context, new djw() {

            private dos a;

            public final int a(int k)
            {
                boolean flag = false;
                byte byte0 = flag;
                if (drg.e(dos.a(a, k)))
                {
                    int l = dos.a(a, k - 1);
                    if (drg.a(dos.e(a, k)))
                    {
                        drf drf = dos.e(a, k - 1);
                        flag = true;
                        byte0 = flag;
                        if (k > 0)
                        {
                            byte0 = flag;
                            if (!drg.a(drf))
                            {
                                byte0 = 3;
                            }
                        }
                    } else
                    {
                        byte0 = flag;
                        if (drg.d(l))
                        {
                            return 2;
                        }
                    }
                }
                return byte0;
            }

            
            {
                a = dos.this;
                super();
            }
        });
    }

    private void A()
    {
        t.clear();
        s.clear();
    }

    static int a(dos dos1, int k)
    {
        boolean flag = false;
        int l;
        boolean flag1;
        if (dos1.w != null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        ctz.b(flag1, "not attached");
        dos1 = dos1.w.c();
        l = ((flag) ? 1 : 0);
        if (dos1 != null)
        {
            l = ((flag) ? 1 : 0);
            if (k >= 0)
            {
                l = ((flag) ? 1 : 0);
                if (k < dos1.b())
                {
                    l = dos1.a(k);
                }
            }
        }
        return l;
    }

    static RecyclerView a(dos dos1)
    {
        return dos1.w;
    }

    static int b(dos dos1)
    {
        return dos1.p;
    }

    static int b(dos dos1, int k)
    {
        return dos1.h(dos1.j(k));
    }

    static int c(dos dos1)
    {
        return dos1.q;
    }

    static int c(dos dos1, int k)
    {
        int l = dos1.t.get(k, -1);
        if (l >= 0)
        {
            return l;
        } else
        {
            int i1 = dos1.m.c(k, dos1.c());
            dos1.t.put(k, i1);
            return i1;
        }
    }

    static int d(dos dos1, int k)
    {
        return dos1.i((dos1.j(k) + dos1.m.a(k)) - 1);
    }

    static drf e(dos dos1, int k)
    {
        boolean flag;
        if (dos1.w != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ctz.b(flag, "not attached");
        dos1 = dos1.w.c();
        if ((dos1 instanceof PorcelainAdapter) && k >= 0 && k < dos1.b())
        {
            return ((PorcelainAdapter)dos1).f(k);
        } else
        {
            return null;
        }
    }

    private int h(int k)
    {
        int l;
        if (k == 0)
        {
            l = p;
        } else
        {
            int j1 = u.get(k, -1);
            l = j1;
            if (j1 < 0)
            {
                int i1 = p - i(k - 1);
                u.put(k, i1);
                return i1;
            }
        }
        return l;
    }

    private int i(int k)
    {
        int l;
        if (k == c() - 1)
        {
            l = p;
        } else
        {
            int j1 = v.get(k, -1);
            l = j1;
            if (j1 < 0)
            {
                int i1 = r - h(k);
                v.put(k, i1);
                return i1;
            }
        }
        return l;
    }

    private int j(int k)
    {
        int l = s.get(k, -1);
        if (l >= 0)
        {
            return l;
        } else
        {
            int i1 = m.a(k, c());
            s.put(k, i1);
            return i1;
        }
    }

    public final void a(RecyclerView recyclerview)
    {
        super.a(recyclerview);
        A();
    }

    public final void a(RecyclerView recyclerview, int k, int l)
    {
        super.a(recyclerview, k, l);
        A();
    }

    public final void a(RecyclerView recyclerview, int k, int l, int i1)
    {
        super.a(recyclerview, k, l, i1);
        A();
    }

    public final void a(RecyclerView recyclerview, abh abh)
    {
        recyclerview.b(n);
        recyclerview.b(o);
        w = null;
        super.a(recyclerview, abh);
        A();
    }

    public final void b(RecyclerView recyclerview, int k, int l)
    {
        super.b(recyclerview, k, l);
        A();
    }

    public final void c(RecyclerView recyclerview)
    {
        super.c(recyclerview);
        w = recyclerview;
        recyclerview.a(n);
        recyclerview.a(o);
    }

    public final void d(RecyclerView recyclerview, int k, int l)
    {
        super.d(recyclerview, k, l);
        A();
    }
}
