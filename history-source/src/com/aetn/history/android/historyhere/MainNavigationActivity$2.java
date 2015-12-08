// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aetn.history.android.historyhere;

import com.aetn.history.android.historyhere.model.POIDetail;
import com.aetn.history.android.historyhere.utils.Utils;

// Referenced classes of package com.aetn.history.android.historyhere:
//            MainNavigationActivity

class val.poiId
    implements com.aetn.history.android.historyhere.model.edListener
{

    final MainNavigationActivity this$0;
    final String val$poiId;

    public void onTourDetailLoadFailed()
    {
        Utils.logger(MainNavigationActivity.access$000(MainNavigationActivity.this), "handleDeeplink(): Deeplink could not get detail for this item ");
        MainNavigationActivity.access$102(MainNavigationActivity.this, false);
    }

    public void onTourDetailLoaded(POIDetail poidetail)
    {
        MainNavigationActivity.setMapType(1);
        showTourInMap(val$poiId);
        MainNavigationActivity.access$102(MainNavigationActivity.this, false);
    }

    ilLoadedListener()
    {
        this$0 = final_mainnavigationactivity;
        val$poiId = String.this;
        super();
    }
}
