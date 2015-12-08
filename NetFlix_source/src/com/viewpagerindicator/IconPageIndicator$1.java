// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.viewpagerindicator;

import android.view.View;

// Referenced classes of package com.viewpagerindicator:
//            IconPageIndicator

class val.iconView
    implements Runnable
{

    final IconPageIndicator this$0;
    final View val$iconView;

    public void run()
    {
        int i = val$iconView.getLeft();
        int j = (getWidth() - val$iconView.getWidth()) / 2;
        smoothScrollTo(i - j, 0);
        IconPageIndicator.access$002(IconPageIndicator.this, null);
    }

    ()
    {
        this$0 = final_iconpageindicator;
        val$iconView = View.this;
        super();
    }
}
