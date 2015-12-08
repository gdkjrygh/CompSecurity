// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.panels;

import android.database.Cursor;
import android.view.View;
import it.sephiroth.android.library.widget.AdapterView;

// Referenced classes of package com.aviary.android.feather.sdk.panels:
//            q

class a
    implements it.sephiroth.android.library.widget.terView.c
{

    final q a;

    public void a(AdapterView adapterview, View view, int i, long l)
    {
        a.q.b((new StringBuilder()).append("onItemClick: ").append(i).toString());
        adapterview = (a)adapterview.getAdapter();
        view = (Cursor)adapterview.getItem(i);
        view = view.getString(view.getColumnIndex("item_identifier"));
        q.b(a);
        q.a(a, adapterview.a(), view, null);
    }

    rView(q q1)
    {
        a = q1;
        super();
    }
}
