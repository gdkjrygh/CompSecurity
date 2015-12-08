// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.widget.finsky;

import android.support.v4.view.ViewPager;
import android.view.View;

// Referenced classes of package com.google.android.gms.games.ui.widget.finsky:
//            PlayTabContainer

final class val.indexToSelect
    implements android.view.r
{

    final PlayTabContainer this$0;
    final int val$indexToSelect;

    public final void onClick(View view)
    {
        PlayTabContainer.access$100(PlayTabContainer.this).setCurrentItem(val$indexToSelect, true);
    }

    ()
    {
        this$0 = final_playtabcontainer;
        val$indexToSelect = I.this;
        super();
    }
}
