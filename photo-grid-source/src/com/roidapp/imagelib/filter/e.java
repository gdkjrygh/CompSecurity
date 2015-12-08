// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.filter;

import java.util.List;

// Referenced classes of package com.roidapp.imagelib.filter:
//            c, f, FilterListView

final class e
    implements c
{

    final FilterListView a;

    e(FilterListView filterlistview)
    {
        a = filterlistview;
        super();
    }

    public final void a(List list)
    {
        a.post(new f(this, list));
    }
}
