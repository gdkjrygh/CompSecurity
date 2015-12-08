// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;

import android.content.Context;
import com.admarvel.android.util.Logging;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;

// Referenced classes of package com.admarvel.android.ads:
//            AdFetcher

public class context
{

    private final Context context;
    final AdFetcher this$0;

    public String getAdvId()
    {
        String s = null;
        com.google.android.gms.ads.identifier.on on;
        try
        {
            on = AdvertisingIdClient.getAdvertisingIdInfo(context.getApplicationContext());
        }
        catch (IllegalStateException illegalstateexception)
        {
            Logging.log((new StringBuilder("IllegalStateException ")).append(illegalstateexception.getMessage()).append(" in fetching ADvID").toString());
            return null;
        }
        catch (GooglePlayServicesRepairableException googleplayservicesrepairableexception)
        {
            Logging.log((new StringBuilder("GooglePlayServicesRepairableException ")).append(googleplayservicesrepairableexception.getMessage()).append(" in fetching ADvID").toString());
            return null;
        }
        catch (IOException ioexception)
        {
            Logging.log((new StringBuilder("IOException ")).append(ioexception.getMessage()).append(" in fetching ADvID").toString());
            return null;
        }
        catch (GooglePlayServicesNotAvailableException googleplayservicesnotavailableexception)
        {
            Logging.log((new StringBuilder("GooglePlayServicesNotAvailableException ")).append(googleplayservicesnotavailableexception.getMessage()).append(" in fetching ADvID").toString());
            return null;
        }
        if (on == null)
        {
            break MISSING_BLOCK_LABEL_22;
        }
        s = on.d();
        return s;
    }

    public ilableException(Context context1)
    {
        this$0 = AdFetcher.this;
        super();
        context = context1;
    }
}
