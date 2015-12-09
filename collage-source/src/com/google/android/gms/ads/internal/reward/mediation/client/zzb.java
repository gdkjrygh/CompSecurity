// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.reward.mediation.client;

import android.os.RemoteException;
import com.google.android.gms.a.b;
import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdListener;
import com.google.android.gms.common.internal.z;

// Referenced classes of package com.google.android.gms.ads.internal.reward.mediation.client:
//            zza, RewardItemParcel

public class zzb
    implements MediationRewardedVideoAdListener
{

    private final zza zzGD;

    public zzb(zza zza1)
    {
        zzGD = zza1;
    }

    public void onAdClicked(MediationRewardedVideoAdAdapter mediationrewardedvideoadadapter)
    {
        z.b("onAdClicked must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzb.zzaC("Adapter called onAdClicked.");
        try
        {
            zzGD.zzl(b.a(mediationrewardedvideoadadapter));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationRewardedVideoAdAdapter mediationrewardedvideoadadapter)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call onAdClicked.", mediationrewardedvideoadadapter);
        }
    }

    public void onAdClosed(MediationRewardedVideoAdAdapter mediationrewardedvideoadadapter)
    {
        z.b("onAdClosed must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzb.zzaC("Adapter called onAdClosed.");
        try
        {
            zzGD.zzk(b.a(mediationrewardedvideoadadapter));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationRewardedVideoAdAdapter mediationrewardedvideoadadapter)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call onAdClosed.", mediationrewardedvideoadadapter);
        }
    }

    public void onAdFailedToLoad(MediationRewardedVideoAdAdapter mediationrewardedvideoadadapter, int i)
    {
        z.b("onAdFailedToLoad must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzb.zzaC("Adapter called onAdFailedToLoad.");
        try
        {
            zzGD.zzc(b.a(mediationrewardedvideoadadapter), i);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationRewardedVideoAdAdapter mediationrewardedvideoadadapter)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call onAdFailedToLoad.", mediationrewardedvideoadadapter);
        }
    }

    public void onAdLeftApplication(MediationRewardedVideoAdAdapter mediationrewardedvideoadadapter)
    {
        z.b("onAdLeftApplication must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzb.zzaC("Adapter called onAdLeftApplication.");
        try
        {
            zzGD.zzm(b.a(mediationrewardedvideoadadapter));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationRewardedVideoAdAdapter mediationrewardedvideoadadapter)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call onAdLeftApplication.", mediationrewardedvideoadadapter);
        }
    }

    public void onAdLoaded(MediationRewardedVideoAdAdapter mediationrewardedvideoadadapter)
    {
        z.b("onAdLoaded must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzb.zzaC("Adapter called onAdLoaded.");
        try
        {
            zzGD.zzh(b.a(mediationrewardedvideoadadapter));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationRewardedVideoAdAdapter mediationrewardedvideoadadapter)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call onAdLoaded.", mediationrewardedvideoadadapter);
        }
    }

    public void onAdOpened(MediationRewardedVideoAdAdapter mediationrewardedvideoadadapter)
    {
        z.b("onAdOpened must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzb.zzaC("Adapter called onAdOpened.");
        try
        {
            zzGD.zzi(b.a(mediationrewardedvideoadadapter));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationRewardedVideoAdAdapter mediationrewardedvideoadadapter)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call onAdOpened.", mediationrewardedvideoadadapter);
        }
    }

    public void onInitializationFailed(MediationRewardedVideoAdAdapter mediationrewardedvideoadadapter, int i)
    {
        z.b("onInitializationFailed must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzb.zzaC("Adapter called onInitializationFailed.");
        try
        {
            zzGD.zzb(b.a(mediationrewardedvideoadadapter), i);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationRewardedVideoAdAdapter mediationrewardedvideoadadapter)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call onInitializationFailed.", mediationrewardedvideoadadapter);
        }
    }

    public void onInitializationSucceeded(MediationRewardedVideoAdAdapter mediationrewardedvideoadadapter)
    {
        z.b("onInitializationSucceeded must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzb.zzaC("Adapter called onInitializationSucceeded.");
        try
        {
            zzGD.zzg(b.a(mediationrewardedvideoadadapter));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationRewardedVideoAdAdapter mediationrewardedvideoadadapter)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call onInitializationSucceeded.", mediationrewardedvideoadadapter);
        }
    }

    public void onRewarded(MediationRewardedVideoAdAdapter mediationrewardedvideoadadapter, RewardItem rewarditem)
    {
        z.b("onRewarded must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzb.zzaC("Adapter called onRewarded.");
        if (rewarditem != null)
        {
            try
            {
                zzGD.zza(b.a(mediationrewardedvideoadadapter), new RewardItemParcel(rewarditem));
                return;
            }
            // Misplaced declaration of an exception variable
            catch (MediationRewardedVideoAdAdapter mediationrewardedvideoadadapter)
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call onRewarded.", mediationrewardedvideoadadapter);
            }
            break MISSING_BLOCK_LABEL_72;
        }
        zzGD.zza(b.a(mediationrewardedvideoadadapter), new RewardItemParcel(mediationrewardedvideoadadapter.getClass().getName(), 1));
        return;
    }

    public void onVideoStarted(MediationRewardedVideoAdAdapter mediationrewardedvideoadadapter)
    {
        z.b("onVideoStarted must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzb.zzaC("Adapter called onVideoStarted.");
        try
        {
            zzGD.zzj(b.a(mediationrewardedvideoadadapter));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationRewardedVideoAdAdapter mediationrewardedvideoadadapter)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call onVideoStarted.", mediationrewardedvideoadadapter);
        }
    }
}
