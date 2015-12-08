// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package android.support.v7.widget:
//            SearchView

final class a
    implements android.widget.nItemClickListener
{

    final SearchView a;

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        SearchView.a(a, i);
    }

    istener(SearchView searchview)
    {
        a = searchview;
        super();
    }
}
