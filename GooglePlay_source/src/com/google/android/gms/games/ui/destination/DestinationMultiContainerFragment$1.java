// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.destination;

import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;

// Referenced classes of package com.google.android.gms.games.ui.destination:
//            DestinationMultiContainerFragment

final class this._cls0
    implements com.google.android.gms.games.ui.util.CreatedListener
{

    final DestinationMultiContainerFragment this$0;

    public final void onFragmentCreated(Fragment fragment, int i)
    {
        if (DestinationMultiContainerFragment.access$000(DestinationMultiContainerFragment.this) != null && i == DestinationMultiContainerFragment.access$000(DestinationMultiContainerFragment.this).mCurItem)
        {
            DestinationMultiContainerFragment.access$100(DestinationMultiContainerFragment.this, fragment);
        }
    }

    Listener()
    {
        this$0 = DestinationMultiContainerFragment.this;
        super();
    }
}
