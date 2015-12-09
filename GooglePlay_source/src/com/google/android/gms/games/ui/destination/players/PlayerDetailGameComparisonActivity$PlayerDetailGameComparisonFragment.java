// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.destination.players;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import com.google.android.gms.games.ui.destination.DestinationFragmentActivity;
import com.google.android.gms.games.ui.destination.DestinationMultiContainerFragment;
import com.google.android.gms.games.ui.util.TabConfig;
import com.google.android.gms.games.ui.util.TabSpec;

// Referenced classes of package com.google.android.gms.games.ui.destination.players:
//            PlayerDetailGameComparisonActivity

public static final class TAB_CONFIG extends DestinationMultiContainerFragment
{

    private static final TabConfig TAB_CONFIG;
    private static final TabSpec TAB_SPECS[];

    protected final int getPlaylogElementType()
    {
        return 24;
    }

    public final boolean hasPlayHeader()
    {
        return true;
    }

    public final void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        if (bundle == null)
        {
            int i = mParent.getIntent().getIntExtra("com.google.android.gms.games.TAB", 0);
            super.mViewPager.setCurrentItem(i);
        }
    }

    static 
    {
        Bundle bundle = new Bundle();
        bundle.putInt("FRAGMENT_TAGS", 616);
        Bundle bundle1 = new Bundle();
        bundle1.putInt("FRAGMENT_TAGS", 617);
        TAB_SPECS = (new TabSpec[] {
            new TabSpec(com/google/android/gms/games/ui/destination/players/PlayerDetailGameComparisonActivity$GameCommonFragment, 0x7f1000d2, bundle), new TabSpec(com/google/android/gms/games/ui/destination/players/PlayerDetailGameComparisonActivity$GameTheirGameFragment, 0x7f1000d4, bundle1)
        });
        TAB_CONFIG = new TabConfig(TAB_SPECS);
    }

    public ()
    {
        super(TAB_CONFIG, 0x7f0400d7);
    }
}
