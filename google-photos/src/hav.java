// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Resources;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.apps.photos.list.fastscroll.FastScrollRecyclerView;

final class hav
    implements Runnable
{

    private final int a;
    private final hyk b;
    private final boolean c;
    private hat d;

    hav(hat hat1, int i, hyk hyk1, boolean flag)
    {
        d = hat1;
        super();
        a = i;
        b = hyk1;
        c = flag;
    }

    public final void run()
    {
        int j = hae.g(d.a).getHeight() - hae.g(d.a).getPaddingTop() - hae.g(d.a).getPaddingBottom();
        int k = d.a.g().getDimensionPixelOffset(b.vc);
        View view = ((RecyclerView) (hae.g(d.a))).e.findViewByPosition(a);
        int i;
        if (view != null && view.getBottom() < hae.g(d.a).getPaddingTop())
        {
            i = -((hae.g(d.a).getPaddingTop() - view.getTop()) + k);
        } else
        if (c && view != null && view.getBottom() > hae.g(d.a).getPaddingTop() + j)
        {
            if (hae.o(d.a) != null)
            {
                i = hae.o(d.a).b();
            } else
            {
                i = 0;
            }
            i += (view.getBottom() - (j + hae.g(d.a).getPaddingTop())) + k;
        } else
        {
            i = 0;
        }
        if (i == 0)
        {
            b.a(view);
            return;
        } else
        {
            hae.g(d.a).scrollBy(0, i);
            hae.g(d.a).requestLayout();
            hae.j(d.a).a(new hau(d, a, b));
            return;
        }
    }
}
