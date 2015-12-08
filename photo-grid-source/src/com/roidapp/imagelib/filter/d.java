// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.filter;

import android.view.View;

// Referenced classes of package com.roidapp.imagelib.filter:
//            FilterListView

final class d
    implements android.view.View.OnClickListener
{

    final FilterListView a;

    d(FilterListView filterlistview)
    {
        a = filterlistview;
        super();
    }

    public final void onClick(View view)
    {
        a.d();
    }
}
