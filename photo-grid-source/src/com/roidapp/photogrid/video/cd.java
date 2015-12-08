// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.video;

import android.view.View;

// Referenced classes of package com.roidapp.photogrid.video:
//            XListView, ce

final class cd
    implements android.view.View.OnClickListener
{

    final XListView a;

    cd(XListView xlistview)
    {
        a = xlistview;
        super();
    }

    public final void onClick(View view)
    {
        if (XListView.a(a) != null)
        {
            XListView.a(a).b();
        }
    }
}
