// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.views;

import android.view.View;

// Referenced classes of package com.jcp.views:
//            DataListView

class g
    implements android.view.View.OnClickListener
{

    final DataListView a;

    g(DataListView datalistview)
    {
        a = datalistview;
        super();
    }

    public void onClick(View view)
    {
        if (DataListView.b(a))
        {
            DataListView.c(a);
            return;
        } else
        {
            DataListView.d(a);
            return;
        }
    }
}
