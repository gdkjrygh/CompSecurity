// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.destination;

import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;

// Referenced classes of package com.google.android.gms.games.ui.destination:
//            DestinationMultiFragmentActivity

final class this._cls0
    implements com.google.android.gms.games.ui.util.tCreatedListener
{

    final DestinationMultiFragmentActivity this$0;

    public final void onFragmentCreated(Fragment fragment, int i)
    {
        if (DestinationMultiFragmentActivity.access$000(DestinationMultiFragmentActivity.this) != null && i == DestinationMultiFragmentActivity.access$000(DestinationMultiFragmentActivity.this).mCurItem)
        {
            DestinationMultiFragmentActivity.access$100(DestinationMultiFragmentActivity.this, fragment);
        }
    }

    dListener()
    {
        this$0 = DestinationMultiFragmentActivity.this;
        super();
    }
}
