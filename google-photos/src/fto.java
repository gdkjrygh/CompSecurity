// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.apps.photos.list.fastscroll.FastScrollRecyclerView;
import org.lucasr.twowayview.TwoWayLayoutManager;

final class fto extends afc
{

    private FastScrollRecyclerView a;
    private fsq b;
    private ftn c;

    fto(ftn ftn1, FastScrollRecyclerView fastscrollrecyclerview, fsq fsq1)
    {
        c = ftn1;
        a = fastscrollrecyclerview;
        b = fsq1;
        super();
    }

    private void a()
    {
        Object obj = ((RecyclerView) (a)).e;
        int i;
        if (obj instanceof adi)
        {
            i = ((adi)obj).c();
        } else
        if (obj instanceof TwoWayLayoutManager)
        {
            i = ((TwoWayLayoutManager)obj).getFirstVisiblePosition();
        } else
        {
            obj = String.valueOf(obj);
            throw new IllegalStateException((new StringBuilder(String.valueOf(obj).length() + 44)).append("Cannot measure offset using layout manager: ").append(((String) (obj))).toString());
        }
        obj = ((aex) (obj)).findViewByPosition(i);
        if (obj != null)
        {
            c.c = (b.a(i) + ((View) (obj)).getTop()) - a.getPaddingTop();
            c.d = true;
        }
    }

    public final void a(RecyclerView recyclerview, int i)
    {
        if (!c.d)
        {
            a();
        }
    }

    public final void a(RecyclerView recyclerview, int i, int j)
    {
        if (!c.d)
        {
            a();
        }
        c.c = Math.max(Math.min(c.c + j, (int)c.c()), 0);
    }
}
