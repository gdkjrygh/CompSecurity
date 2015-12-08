// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;

// Referenced classes of package android.support.v7.widget:
//            u, r

class v
    implements android.widget.AdapterView.OnItemClickListener
{

    final r a;
    final u b;

    v(u u1, r r1)
    {
        b = u1;
        a = r1;
        super();
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        b.a.setSelection(i);
        if (b.a.getOnItemClickListener() != null)
        {
            b.a.performItemClick(view, i, u.a(b).getItemId(i));
        }
        b.i();
    }
}
