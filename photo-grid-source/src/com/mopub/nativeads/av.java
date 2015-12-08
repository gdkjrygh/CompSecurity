// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.nativeads;

import com.mopub.common.logging.MoPubLog;
import com.mopub.common.util.DeviceUtils;
import com.mopub.mobileads.MoPubErrorCode;
import com.mopub.network.MoPubNetworkError;
import com.mopub.volley.VolleyError;

// Referenced classes of package com.mopub.nativeads:
//            as

final class av
    implements com.mopub.volley.Response.ErrorListener
{

    final as a;

    av(as as1)
    {
        a = as1;
        super();
    }

    public final void onErrorResponse(VolleyError volleyerror)
    {
        if (!(volleyerror instanceof MoPubNetworkError) || ((MoPubNetworkError)volleyerror).getReason().equals(com.mopub.network.MoPubNetworkError.Reason.WARMING_UP))
        {
            MoPubLog.e("Failed to load positioning data", volleyerror);
            if (volleyerror.networkResponse == null && !DeviceUtils.isNetworkAvailable(as.b(a)))
            {
                MoPubLog.c(String.valueOf(MoPubErrorCode.NO_CONNECTION.toString()));
            }
        }
        as.c(a);
    }
}
