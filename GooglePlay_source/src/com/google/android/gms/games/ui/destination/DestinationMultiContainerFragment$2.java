// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.destination;

import android.support.v4.view.ViewPager;
import com.google.android.gms.games.ui.util.GamesFragmentPagerAdapter;
import com.google.android.gms.games.ui.widget.finsky.PlayTabContainer;

// Referenced classes of package com.google.android.gms.games.ui.destination:
//            DestinationMultiContainerFragment

final class ChangeListener extends com.google.android.gms.games.ui.util.entPageChangeListener
{

    final DestinationMultiContainerFragment this$0;

    public final void onPageSelected(int i)
    {
        super.onPageSelected(i);
        DestinationMultiContainerFragment.access$200(DestinationMultiContainerFragment.this, i);
        logClick(i);
    }

    ChangeListener(ViewPager viewpager, GamesFragmentPagerAdapter gamesfragmentpageradapter, PlayTabContainer playtabcontainer)
    {
        this$0 = DestinationMultiContainerFragment.this;
        super(viewpager, gamesfragmentpageradapter, playtabcontainer);
    }
}
