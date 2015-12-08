// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.support.v7.widget.StaggeredGridLayoutManager;
import java.util.List;

// Referenced classes of package kik.android.widget:
//            at, GifSearchFragment, RobotoEditText

final class bd extends at
{

    final List a;
    final StaggeredGridLayoutManager b;
    final GifSearchFragment c;

    bd(GifSearchFragment gifsearchfragment, List list, StaggeredGridLayoutManager staggeredgridlayoutmanager)
    {
        c = gifsearchfragment;
        a = list;
        b = staggeredgridlayoutmanager;
        super();
    }

    public final void a()
    {
        GifSearchFragment.a(c, true);
        if (c.f() != null && !c.f().c())
        {
            GifSearchFragment.b(c, true);
        }
        GifSearchFragment.a(c, c._searchEditText.getText().toString(), a.size());
        GifSearchFragment.a(c);
    }

    public final void b()
    {
        if (b.c().length > 0 && b.c()[0] > 0)
        {
            GifSearchFragment.a(c, false);
        }
        if (c.f() != null && !c.f().c())
        {
            GifSearchFragment.b(c, false);
        }
        GifSearchFragment.a(c, c._searchEditText.getText().toString(), a.size());
        GifSearchFragment.b(c);
    }
}
