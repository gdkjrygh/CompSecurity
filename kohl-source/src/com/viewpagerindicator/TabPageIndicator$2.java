// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.viewpagerindicator;

import android.view.View;

// Referenced classes of package com.viewpagerindicator:
//            TabPageIndicator

class val.tabView
    implements Runnable
{

    final TabPageIndicator this$0;
    final View val$tabView;

    public void run()
    {
        int i = val$tabView.getLeft();
        int j = (getWidth() - val$tabView.getWidth()) / 2;
        smoothScrollTo(i - j, 0);
        TabPageIndicator.access$202(TabPageIndicator.this, null);
    }

    ()
    {
        this$0 = final_tabpageindicator;
        val$tabView = View.this;
        super();
    }
}
