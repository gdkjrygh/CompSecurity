// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads.mediation;

import android.os.Bundle;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;

// Referenced classes of package com.google.ads.mediation:
//            AbstractAdViewAdapter

public final class AdUrlAdapter extends AbstractAdViewAdapter
    implements MediationBannerAdapter, MediationInterstitialAdapter
{

    public AdUrlAdapter()
    {
    }

    protected Bundle a(Bundle bundle, Bundle bundle1)
    {
        if (bundle == null)
        {
            bundle = new Bundle();
        }
        bundle.putBundle("sdk_less_server_data", bundle1);
        bundle.putBoolean("_noRefresh", true);
        return bundle;
    }

    public String a(Bundle bundle)
    {
        return "adurl";
    }
}
