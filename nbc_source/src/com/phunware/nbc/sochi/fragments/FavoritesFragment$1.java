// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.fragments;

import android.view.View;
import com.phunware.nbc.sochi.metrics.TrackingHelper;
import timber.log.Timber;

// Referenced classes of package com.phunware.nbc.sochi.fragments:
//            FavoritesFragment

class this._cls0
    implements android.view.
{

    final FavoritesFragment this$0;

    public void onClick(View view)
    {
        try
        {
            FavoritesFragment.access$000(FavoritesFragment.this);
            view = new com.phunware.nbc.sochi.metrics.ageInfo(":Favorites:Live", "Favorites", "Live&Upcoming", null);
            trackingHelper.trackPageEvent(view);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            Timber.d(view.toString(), new Object[0]);
        }
    }

    eInfo()
    {
        this$0 = FavoritesFragment.this;
        super();
    }
}
