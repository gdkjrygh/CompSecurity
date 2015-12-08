// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.headerlist;

import android.support.v4.view.ViewPager;
import android.view.View;

// Referenced classes of package com.google.android.play.headerlist:
//            PlayHeaderListTabStrip

final class val.pagerPosition
    implements android.view.yHeaderListTabStrip._cls2
{

    final PlayHeaderListTabStrip this$0;
    final int val$pagerPosition;

    public final void onClick(View view)
    {
        PlayHeaderListTabStrip.access$502(PlayHeaderListTabStrip.this, false);
        updateSelectedTab(val$pagerPosition, true);
        PlayHeaderListTabStrip.access$100(PlayHeaderListTabStrip.this).setCurrentItem(val$pagerPosition);
    }

    A()
    {
        this$0 = final_playheaderlisttabstrip;
        val$pagerPosition = I.this;
        super();
    }
}
