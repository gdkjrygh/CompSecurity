// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.view.View;

// Referenced classes of package android.support.v7.widget:
//            SearchView

final class a
    implements android.view.stener
{

    private SearchView a;

    public final void onClick(View view)
    {
        if (view == SearchView.c(a))
        {
            SearchView.d(a);
        } else
        {
            if (view == SearchView.e(a))
            {
                SearchView.f(a);
                return;
            }
            if (view == SearchView.g(a))
            {
                SearchView.h(a);
                return;
            }
            if (view == SearchView.i(a))
            {
                SearchView.g();
                return;
            }
            if (view == SearchView.j(a))
            {
                SearchView.k(a);
                return;
            }
        }
    }

    (SearchView searchview)
    {
        a = searchview;
        super();
    }
}
