// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.support.v7.widget.RecyclerView;
import android.view.View;

public final class hqr
    implements hqu
{

    private final nud a = new ntz(this);
    private RecyclerView b;
    private aen c;
    private final aep d = new hqs(this);

    public hqr()
    {
    }

    static RecyclerView a(hqr hqr1)
    {
        return hqr1.b;
    }

    static nud b(hqr hqr1)
    {
        return hqr1.a;
    }

    public final hqr a(olm olm1)
    {
        olm1.a(hqu, this);
        olm1.a(hqr, this);
        return this;
    }

    public final nud a()
    {
        return a;
    }

    public final void a(RecyclerView recyclerview)
    {
        b = recyclerview;
        b();
    }

    public final void b()
    {
        if (c != null)
        {
            c.b(d);
        }
        c = b.d;
        if (c != null)
        {
            c.a(d);
        }
        a.b();
    }

    public final int c()
    {
        Object obj = b;
        boolean flag;
        if (obj == null || ((RecyclerView) (obj)).e == null || ((RecyclerView) (obj)).e.getChildCount() == 0 || ((RecyclerView) (obj)).e.findViewByPosition(0) == ((RecyclerView) (obj)).getChildAt(0) && ((RecyclerView) (obj)).getChildAt(0).getTop() == ((RecyclerView) (obj)).getPaddingTop())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            return 0;
        }
        obj = b.e.findViewByPosition(0);
        if (obj != null)
        {
            int i = ((View) (obj)).getTop();
            return b.getPaddingTop() - i;
        } else
        {
            return -1;
        }
    }
}
