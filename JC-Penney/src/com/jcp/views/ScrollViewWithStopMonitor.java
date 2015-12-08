// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ScrollView;

// Referenced classes of package com.jcp.views:
//            ac, ad

public class ScrollViewWithStopMonitor extends ScrollView
{

    private Runnable a;
    private int b;
    private ad c;

    public ScrollViewWithStopMonitor(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = new ac(this);
    }

    static int a(ScrollViewWithStopMonitor scrollviewwithstopmonitor)
    {
        return scrollviewwithstopmonitor.b;
    }

    static int a(ScrollViewWithStopMonitor scrollviewwithstopmonitor, int i)
    {
        scrollviewwithstopmonitor.b = i;
        return i;
    }

    static ad b(ScrollViewWithStopMonitor scrollviewwithstopmonitor)
    {
        return scrollviewwithstopmonitor.c;
    }

    static Runnable c(ScrollViewWithStopMonitor scrollviewwithstopmonitor)
    {
        return scrollviewwithstopmonitor.a;
    }

    public void a()
    {
        b = getScrollY();
        postDelayed(a, 100L);
    }

    public void setOnScrollStoppedListener(ad ad)
    {
        c = ad;
    }
}
