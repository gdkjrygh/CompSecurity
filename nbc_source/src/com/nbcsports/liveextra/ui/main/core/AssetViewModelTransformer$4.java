// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.main.core;

import android.text.TextUtils;
import com.nbcsports.liveextra.library.api.models.Asset;
import com.phunware.nbc.sochi.content.GeoRequestResponse;
import com.phunware.nbc.sochi.system.AppSharedPreferences;
import org.apache.commons.collections4.Predicate;

// Referenced classes of package com.nbcsports.liveextra.ui.main.core:
//            AssetViewModelTransformer

class val.lastKnownGeoLocation
    implements Predicate
{

    final AssetViewModelTransformer this$0;
    final GeoRequestResponse val$lastKnownGeoLocation;

    public boolean evaluate(Asset asset)
    {
label0:
        {
            String s = AppSharedPreferences.getSetting(getApplicationContext(), "PREF_SELECTED_DMA");
            if (!TextUtils.isEmpty(asset.getRsndma()))
            {
                if (s == null)
                {
                    s = "";
                }
                if (!asset.isInMarket(s))
                {
                    if (val$lastKnownGeoLocation != null)
                    {
                        s = val$lastKnownGeoLocation.NielsonDMA;
                    } else
                    {
                        s = "";
                    }
                    if (!asset.isInMarket(s))
                    {
                        break label0;
                    }
                }
            }
            return true;
        }
        return false;
    }

    public volatile boolean evaluate(Object obj)
    {
        return evaluate((Asset)obj);
    }

    ()
    {
        this$0 = final_assetviewmodeltransformer;
        val$lastKnownGeoLocation = GeoRequestResponse.this;
        super();
    }
}
