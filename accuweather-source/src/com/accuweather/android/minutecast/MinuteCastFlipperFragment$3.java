// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.minutecast;

import com.accuweather.android.models.location.GeocodedAddress;
import com.accuweather.android.views.SearchViewListenerAdapter;

// Referenced classes of package com.accuweather.android.minutecast:
//            MinuteCastFlipperFragment

class this._cls0 extends SearchViewListenerAdapter
{

    final MinuteCastFlipperFragment this$0;

    public void onQueryChanged(String s)
    {
        MinuteCastFlipperFragment.access$700(MinuteCastFlipperFragment.this, s);
    }

    public void onSearchItemSelected(int i, Object obj)
    {
        obj = (GeocodedAddress)obj;
        MinuteCastFlipperFragment.access$800(MinuteCastFlipperFragment.this, ((GeocodedAddress) (obj)));
    }

    ()
    {
        this$0 = MinuteCastFlipperFragment.this;
        super();
    }
}
