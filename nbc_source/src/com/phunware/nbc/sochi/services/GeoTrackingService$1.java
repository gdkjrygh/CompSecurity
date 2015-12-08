// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.services;

import com.phunware.nbc.sochi.content.GeoRequestResponse;
import com.phunware.nbc.sochi.location.TotalCastResponseListener;
import com.phunware.nbc.sochi.system.NBCSystem;
import timber.log.Timber;

// Referenced classes of package com.phunware.nbc.sochi.services:
//            GeoTrackingService

class this._cls0
    implements TotalCastResponseListener
{

    final GeoTrackingService this$0;

    public void onResponse(GeoRequestResponse georequestresponse)
    {
        if (georequestresponse != null)
        {
            NBCSystem.LAST_KNOWN_GEO_LOCATION = georequestresponse;
            Timber.d((new StringBuilder()).append("TotalCast updated:").append(georequestresponse.toString()).toString(), new Object[0]);
        }
    }

    ener()
    {
        this$0 = GeoTrackingService.this;
        super();
    }
}
