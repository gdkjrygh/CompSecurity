// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.views;


// Referenced classes of package com.jcp.views:
//            DataListView

class f
    implements Runnable
{

    final int a;
    final DataListView b;

    f(DataListView datalistview, int i)
    {
        b = datalistview;
        a = i;
        super();
    }

    public void run()
    {
        b.scrollTo(0, a);
    }
}
