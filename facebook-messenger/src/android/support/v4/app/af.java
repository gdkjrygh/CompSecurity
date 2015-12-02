// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

// Referenced classes of package android.support.v4.app:
//            ListFragment

class af
    implements android.widget.AdapterView.OnItemClickListener
{

    final ListFragment a;

    af(ListFragment listfragment)
    {
        a = listfragment;
        super();
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        a.a((ListView)adapterview, view, i, l);
    }
}
