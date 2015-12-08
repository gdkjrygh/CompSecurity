// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.filter;

import android.content.DialogInterface;

// Referenced classes of package com.roidapp.imagelib.filter:
//            FilterListView

final class i
    implements android.content.DialogInterface.OnClickListener
{

    final FilterListView a;

    i(FilterListView filterlistview)
    {
        a = filterlistview;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int j)
    {
        dialoginterface.dismiss();
    }
}
