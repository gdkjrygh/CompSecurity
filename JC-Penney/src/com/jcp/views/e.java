// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.views;


// Referenced classes of package com.jcp.views:
//            DataListView, j

class e
    implements Runnable
{

    final DataListView a;

    e(DataListView datalistview)
    {
        a = datalistview;
        super();
    }

    public void run()
    {
        a.scrollTo(0, DataListView.a(a).getPaddingTop());
    }
}
