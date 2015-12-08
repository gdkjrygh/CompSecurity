// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.support.v4.widget.b;

// Referenced classes of package android.support.v7.widget:
//            SearchView, a

class a
    implements Runnable
{

    final SearchView a;

    public void run()
    {
        if (android.support.v7.widget.SearchView.b(a) != null && (android.support.v7.widget.SearchView.b(a) instanceof a))
        {
            android.support.v7.widget.SearchView.b(a).a(null);
        }
    }

    (SearchView searchview)
    {
        a = searchview;
        super();
    }
}
