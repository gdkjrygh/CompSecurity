// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.configuration.esn;

import android.content.Context;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.service.configuration.ConfigurationAgent;
import com.netflix.mediaclient.service.configuration.drm.DrmManager;
import com.netflix.mediaclient.service.configuration.drm.DrmManagerRegistry;
import com.netflix.mediaclient.service.configuration.drm.WidevineDrmManager;
import com.netflix.mediaclient.util.AndroidUtils;

// Referenced classes of package com.netflix.mediaclient.service.configuration.esn:
//            EsnLegacyProvider, BaseEsnProvider, EsnCdmNexus7Provider, EsnCdmProvider, 
//            EsnProvider

public final class EsnProviderRegistry
{

    protected static final String TAG = "nf_esn";

    private EsnProviderRegistry()
    {
    }

    public static EsnProvider createESN(Context context, DrmManager drmmanager, ConfigurationAgent configurationagent)
    {
        Log.d("nf_esn", "Create ESN");
        int i = AndroidUtils.getAndroidVersion();
        boolean flag;
        if (drmmanager.getDrmType() == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            if (i >= 18)
            {
                Log.d("nf_esn", "JB MR2+ device");
                if (WidevineDrmManager.isWidewineSupported())
                {
                    Log.d("nf_esn", "JB MR2+ device with Widewine support, but failed to initialize or not allowed, return ESN Legacy implemenatation!");
                } else
                {
                    Log.d("nf_esn", "JB MR2+ device without Widewine support, return ESN Legacy implemenatation!");
                }
            } else
            {
                Log.d("nf_esn", "Pre JB MR2 device, return ESN Legacy implemenatation!");
            }
            drmmanager = new EsnLegacyProvider();
        } else
        {
            Log.d("nf_esn", "JB MR2+ device with Widewine support, return ESN CDM implemenatation!");
            if (DrmManagerRegistry.isDevicePredeterminedToUseWV())
            {
                Log.d("nf_esn", "JB MR2+ device with legacy Widewine support, return ESN CDM Nexus 7 implemenatation!");
                drmmanager = new EsnCdmNexus7Provider(drmmanager);
            } else
            {
                Log.d("nf_esn", "JB MR2+ device with new Widewine support, return ESN CDM implemenatation!");
                drmmanager = new EsnCdmProvider(drmmanager, configurationagent.getDeviceCategory());
            }
        }
        drmmanager.initialize(context);
        if (Log.isLoggable("nf_esn", 3))
        {
            Log.d("nf_esn", (new StringBuilder()).append("ESN: ").append(drmmanager.getEsn()).toString());
        }
        return drmmanager;
    }
}
