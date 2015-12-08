// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.kids.details;

import android.widget.HorizontalScrollView;

// Referenced classes of package com.netflix.mediaclient.ui.kids.details:
//            KidsSeasonSelector

class val.x
    implements Runnable
{

    final KidsSeasonSelector this$0;
    final boolean val$useSmoothScroll;
    final int val$x;

    public void run()
    {
        if (val$useSmoothScroll)
        {
            KidsSeasonSelector.access$100(KidsSeasonSelector.this).smoothScrollTo(val$x, 0);
            return;
        } else
        {
            KidsSeasonSelector.access$100(KidsSeasonSelector.this).scrollTo(val$x, 0);
            return;
        }
    }

    ()
    {
        this$0 = final_kidsseasonselector;
        val$useSmoothScroll = flag;
        val$x = I.this;
        super();
    }
}
