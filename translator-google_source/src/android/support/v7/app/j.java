// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

// Referenced classes of package android.support.v7.app:
//            f, d

public final class j
    implements android.widget.AdapterView.OnItemClickListener
{

    final ListView a;
    final d b;
    final f c;

    public j(f f1, ListView listview, d d1)
    {
        c = f1;
        a = listview;
        b = d1;
        super();
    }

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        if (c.C != null)
        {
            c.C[i] = a.isItemChecked(i);
        }
        c.G.onClick(b.b, i, a.isItemChecked(i));
    }
}
