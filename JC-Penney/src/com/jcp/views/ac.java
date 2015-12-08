// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.views;


// Referenced classes of package com.jcp.views:
//            ScrollViewWithStopMonitor, ad

class ac
    implements Runnable
{

    final ScrollViewWithStopMonitor a;

    ac(ScrollViewWithStopMonitor scrollviewwithstopmonitor)
    {
        a = scrollviewwithstopmonitor;
        super();
    }

    public void run()
    {
        int i = a.getScrollY();
        if (ScrollViewWithStopMonitor.a(a) - i == 0)
        {
            if (ScrollViewWithStopMonitor.b(a) != null)
            {
                ScrollViewWithStopMonitor.b(a).a();
            }
            return;
        } else
        {
            ScrollViewWithStopMonitor.a(a, a.getScrollY());
            a.postDelayed(ScrollViewWithStopMonitor.c(a), 100L);
            return;
        }
    }
}
