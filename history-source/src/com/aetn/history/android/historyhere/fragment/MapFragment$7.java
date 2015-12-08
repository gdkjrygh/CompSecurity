// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aetn.history.android.historyhere.fragment;

import com.aetn.history.android.historyhere.MainNavigationActivity;
import com.aetn.history.android.historyhere.model.PreferenceManager;
import com.aetn.history.android.historyhere.utils.Utils;

// Referenced classes of package com.aetn.history.android.historyhere.fragment:
//            MapFragment

class this._cls0
    implements com.aetn.history.android.historyhere.model.ger.OnFavoritesChangedListener
{

    final MapFragment this$0;

    public void onFavoritesChanged()
    {
        Utils.logger(MapFragment.access$000(MapFragment.this), "onFavoritesChanged");
        MapFragment.access$1702(MapFragment.this, PreferenceManager.getFavoritesString(getActivity()));
        if (MainNavigationActivity.isMapTypeFavorites())
        {
            if (!PreferenceManager.hasFavorites(getActivity()))
            {
                MainNavigationActivity.setMapType(0);
            }
            MapFragment.access$1800(MapFragment.this);
        }
        refreshPlacesMap();
    }

    ()
    {
        this$0 = MapFragment.this;
        super();
    }
}
