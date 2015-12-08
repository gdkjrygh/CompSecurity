// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.reward.mediation.client;

import android.os.RemoteException;
import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdListener;
import com.google.android.gms.b.d;
import com.google.android.gms.common.internal.bl;

// Referenced classes of package com.google.android.gms.ads.internal.reward.mediation.client:
//            zza, RewardItemParcel

public class zzb
    implements MediationRewardedVideoAdListener
{

    private final zza a;

    public zzb(zza zza1)
    {
        a = zza1;
    }

    public void onAdClicked(MediationRewardedVideoAdAdapter mediationrewardedvideoadadapter)
    {
        bl.b("onAdClicked must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzb.zzaF("Adapter called onAdClicked.");
        try
        {
            a.zzl(d.a(mediationrewardedvideoadadapter));
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
        bl.b("onAdClosed must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzb.zzaF("Adapter called onAdClosed.");
        try
        {
            a.zzk(d.a(mediationrewardedvideoadadapter));
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
        bl.b("onAdFailedToLoad must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzb.zzaF("Adapter called onAdFailedToLoad.");
        try
        {
            a.zzc(d.a(mediationrewardedvideoadadapter), i);
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
        bl.b("onAdLeftApplication must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzb.zzaF("Adapter called onAdLeftApplication.");
        try
        {
            a.zzm(d.a(mediationrewardedvideoadadapter));
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
        bl.b("onAdLoaded must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzb.zzaF("Adapter called onAdLoaded.");
        try
        {
            a.zzh(d.a(mediationrewardedvideoadadapter));
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
        bl.b("onAdOpened must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzb.zzaF("Adapter called onAdOpened.");
        try
        {
            a.zzi(d.a(mediationrewardedvideoadadapter));
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
        bl.b("onInitializationFailed must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzb.zzaF("Adapter called onInitializationFailed.");
        try
        {
            a.zzb(d.a(mediationrewardedvideoadadapter), i);
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
        bl.b("onInitializationSucceeded must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzb.zzaF("Adapter called onInitializationSucceeded.");
        try
        {
            a.zzg(d.a(mediationrewardedvideoadadapter));
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
        bl.b("onRewarded must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzb.zzaF("Adapter called onRewarded.");
        if (rewarditem != null)
        {
            try
            {
                a.zza(d.a(mediationrewardedvideoadadapter), new RewardItemParcel(rewarditem));
                return;
            }
            // Misplaced declaration of an exception variable
            catch (MediationRewardedVideoAdAdapter mediationrewardedvideoadadapter)
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call onRewarded.", mediationrewardedvideoadadapter);
            }
            break MISSING_BLOCK_LABEL_72;
        }
        a.zza(d.a(mediationrewardedvideoadadapter), new RewardItemParcel(mediationrewardedvideoadadapter.getClass().getName(), 1));
        return;
    }

    public void onVideoStarted(MediationRewardedVideoAdAdapter mediationrewardedvideoadadapter)
    {
        bl.b("onVideoStarted must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzb.zzaF("Adapter called onVideoStarted.");
        try
        {
            a.zzj(d.a(mediationrewardedvideoadadapter));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationRewardedVideoAdAdapter mediationrewardedvideoadadapter)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call onVideoStarted.", mediationrewardedvideoadadapter);
        }
    }
}
