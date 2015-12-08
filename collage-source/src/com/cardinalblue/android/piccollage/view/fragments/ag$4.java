// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.fragments;

import android.widget.TextView;
import com.malinskiy.superrecyclerview.SuperRecyclerView;

// Referenced classes of package com.cardinalblue.android.piccollage.view.fragments:
//            ag

class a
    implements com.malinskiy.superrecyclerview.RecyclerView.b
{

    final ag a;

    public void a()
    {
        android.view.View view = ag.c(a).getEmptyView();
        if (view == null)
        {
            return;
        } else
        {
            ag.a(a, (TextView)view);
            return;
        }
    }

    (ag ag1)
    {
        a = ag1;
        super();
    }
}
