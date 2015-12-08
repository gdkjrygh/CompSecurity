// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.filter;

import android.content.DialogInterface;
import com.roidapp.imagelib.b.c;
import com.roidapp.imagelib.filter.groupinfo.BaseGroupInfo;
import com.roidapp.imagelib.filter.groupinfo.CloudGroupInfo;

// Referenced classes of package com.roidapp.imagelib.filter:
//            FilterListView

final class j
    implements android.content.DialogInterface.OnClickListener
{

    final BaseGroupInfo a;
    final FilterListView b;

    j(FilterListView filterlistview, BaseGroupInfo basegroupinfo)
    {
        b = filterlistview;
        a = basegroupinfo;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        c.a(b.getContext(), ((CloudGroupInfo)a).c);
    }
}
