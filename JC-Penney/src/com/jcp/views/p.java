// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.views;


// Referenced classes of package com.jcp.views:
//            HorizontalListView

class p
    implements Runnable
{

    final HorizontalListView a;

    p(HorizontalListView horizontallistview)
    {
        a = horizontallistview;
        super();
    }

    public void run()
    {
        a.requestLayout();
    }
}
