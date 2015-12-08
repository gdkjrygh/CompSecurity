// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.support.v7.widget.RecyclerView;
import com.google.android.apps.photos.list.fastscroll.FastScrollRecyclerView;
import org.lucasr.twowayview.TwoWayLayoutManager;

public final class ftn
    implements fss
{

    final ntz a = new ntz(this);
    int b;
    int c;
    boolean d;
    private final FastScrollRecyclerView e;
    private final fsq f;

    public ftn(FastScrollRecyclerView fastscrollrecyclerview, fsq fsq1)
    {
        b = -1;
        d = false;
        e = fastscrollrecyclerview;
        f = fsq1;
        fastscrollrecyclerview.b(new fto(this, fastscrollrecyclerview, fsq1));
        fsq1.a().a(new ftp(this), false);
    }

    private int f()
    {
        return e.getHeight() - e.getPaddingTop() - e.getPaddingBottom();
    }

    public final int a(float f1)
    {
        int i = (int)(c() * f1);
        int j = f.b(i);
        if (f1 == 0.0F)
        {
            e.a(0);
        } else
        if (f1 == 1.0F)
        {
            e.a(((RecyclerView) (e)).d.a() - 1);
        } else
        if (Math.abs(c - i) < e.getHeight())
        {
            e.scrollBy(0, i - c);
        } else
        {
            int k = i - f.a(j);
            Object obj = ((RecyclerView) (e)).e;
            if (obj instanceof adi)
            {
                ((adi)obj).a(j, k);
            } else
            if (obj instanceof TwoWayLayoutManager)
            {
                ((TwoWayLayoutManager)obj).scrollToPositionWithOffset(j, k);
            } else
            {
                obj = String.valueOf(obj);
                throw new IllegalStateException((new StringBuilder(String.valueOf(obj).length() + 48)).append("Cannot scroll to position using layout manager: ").append(((String) (obj))).toString());
            }
        }
        c = i;
        return j;
    }

    public final nud a()
    {
        return a;
    }

    public final boolean b()
    {
        return (float)f() / c() < 0.3F;
    }

    public final float c()
    {
        if (b == -1)
        {
            b = f.b();
            d = false;
        }
        return (float)(b - f());
    }

    public final float d()
    {
        return (float)c;
    }

    public final void e()
    {
        d = false;
    }
}
