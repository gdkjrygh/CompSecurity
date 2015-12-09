// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

// Referenced classes of package android.support.v7.app:
//            d, b

final class h
    implements android.widget.AdapterView.OnItemClickListener
{

    final ListView a;
    final b b;
    final d c;

    h(d d1, ListView listview, b b1)
    {
        c = d1;
        a = listview;
        b = b1;
        super();
    }

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        if (c.C != null)
        {
            c.C[i] = a.isItemChecked(i);
        }
        c.G.onClick(android.support.v7.app.b.g(b), i, a.isItemChecked(i));
    }
}
