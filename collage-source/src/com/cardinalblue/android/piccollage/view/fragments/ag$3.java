// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.fragments;

import android.view.View;
import android.widget.AdapterView;
import com.cardinalblue.android.piccollage.controller.d;
import com.squareup.a.b;

// Referenced classes of package com.cardinalblue.android.piccollage.view.fragments:
//            ag

class a
    implements android.widget.erView.OnItemClickListener
{

    final ag a;

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        if (i > 0)
        {
            adapterview = (String)com.cardinalblue.android.piccollage.view.fragments.ag.b(a).getItem(i - 1);
            d.a().c(new <init>(adapterview));
        }
    }

    (ag ag1)
    {
        a = ag1;
        super();
    }
}
