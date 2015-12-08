// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.ads.mediation.NativeAdMapper;
import com.google.android.gms.common.internal.bl;

// Referenced classes of package com.google.android.gms.internal:
//            iv

public final class jj
    implements MediationBannerListener, MediationInterstitialListener, MediationNativeListener
{

    private final iv a;
    private NativeAdMapper b;

    public jj(iv iv1)
    {
        a = iv1;
    }

    public final NativeAdMapper a()
    {
        return b;
    }

    public final void onAdClicked(MediationBannerAdapter mediationbanneradapter)
    {
        bl.b("onAdClicked must be called on the main UI thread.");
        zzb.zzaF("Adapter called onAdClicked.");
        try
        {
            a.a();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationBannerAdapter mediationbanneradapter)
        {
            zzb.zzd("Could not call onAdClicked.", mediationbanneradapter);
        }
    }

    public final void onAdClicked(MediationInterstitialAdapter mediationinterstitialadapter)
    {
        bl.b("onAdClicked must be called on the main UI thread.");
        zzb.zzaF("Adapter called onAdClicked.");
        try
        {
            a.a();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationInterstitialAdapter mediationinterstitialadapter)
        {
            zzb.zzd("Could not call onAdClicked.", mediationinterstitialadapter);
        }
    }

    public final void onAdClicked(MediationNativeAdapter mediationnativeadapter)
    {
        bl.b("onAdClicked must be called on the main UI thread.");
        zzb.zzaF("Adapter called onAdClicked.");
        try
        {
            a.a();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationNativeAdapter mediationnativeadapter)
        {
            zzb.zzd("Could not call onAdClicked.", mediationnativeadapter);
        }
    }

    public final void onAdClosed(MediationBannerAdapter mediationbanneradapter)
    {
        bl.b("onAdClosed must be called on the main UI thread.");
        zzb.zzaF("Adapter called onAdClosed.");
        try
        {
            a.b();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationBannerAdapter mediationbanneradapter)
        {
            zzb.zzd("Could not call onAdClosed.", mediationbanneradapter);
        }
    }

    public final void onAdClosed(MediationInterstitialAdapter mediationinterstitialadapter)
    {
        bl.b("onAdClosed must be called on the main UI thread.");
        zzb.zzaF("Adapter called onAdClosed.");
        try
        {
            a.b();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationInterstitialAdapter mediationinterstitialadapter)
        {
            zzb.zzd("Could not call onAdClosed.", mediationinterstitialadapter);
        }
    }

    public final void onAdClosed(MediationNativeAdapter mediationnativeadapter)
    {
        bl.b("onAdClosed must be called on the main UI thread.");
        zzb.zzaF("Adapter called onAdClosed.");
        try
        {
            a.b();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationNativeAdapter mediationnativeadapter)
        {
            zzb.zzd("Could not call onAdClosed.", mediationnativeadapter);
        }
    }

    public final void onAdFailedToLoad(MediationBannerAdapter mediationbanneradapter, int i)
    {
        bl.b("onAdFailedToLoad must be called on the main UI thread.");
        zzb.zzaF((new StringBuilder("Adapter called onAdFailedToLoad with error. ")).append(i).toString());
        try
        {
            a.a(i);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationBannerAdapter mediationbanneradapter)
        {
            zzb.zzd("Could not call onAdFailedToLoad.", mediationbanneradapter);
        }
    }

    public final void onAdFailedToLoad(MediationInterstitialAdapter mediationinterstitialadapter, int i)
    {
        bl.b("onAdFailedToLoad must be called on the main UI thread.");
        zzb.zzaF((new StringBuilder("Adapter called onAdFailedToLoad with error ")).append(i).append(".").toString());
        try
        {
            a.a(i);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationInterstitialAdapter mediationinterstitialadapter)
        {
            zzb.zzd("Could not call onAdFailedToLoad.", mediationinterstitialadapter);
        }
    }

    public final void onAdFailedToLoad(MediationNativeAdapter mediationnativeadapter, int i)
    {
        bl.b("onAdFailedToLoad must be called on the main UI thread.");
        zzb.zzaF((new StringBuilder("Adapter called onAdFailedToLoad with error ")).append(i).append(".").toString());
        try
        {
            a.a(i);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationNativeAdapter mediationnativeadapter)
        {
            zzb.zzd("Could not call onAdFailedToLoad.", mediationnativeadapter);
        }
    }

    public final void onAdLeftApplication(MediationBannerAdapter mediationbanneradapter)
    {
        bl.b("onAdLeftApplication must be called on the main UI thread.");
        zzb.zzaF("Adapter called onAdLeftApplication.");
        try
        {
            a.c();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationBannerAdapter mediationbanneradapter)
        {
            zzb.zzd("Could not call onAdLeftApplication.", mediationbanneradapter);
        }
    }

    public final void onAdLeftApplication(MediationInterstitialAdapter mediationinterstitialadapter)
    {
        bl.b("onAdLeftApplication must be called on the main UI thread.");
        zzb.zzaF("Adapter called onAdLeftApplication.");
        try
        {
            a.c();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationInterstitialAdapter mediationinterstitialadapter)
        {
            zzb.zzd("Could not call onAdLeftApplication.", mediationinterstitialadapter);
        }
    }

    public final void onAdLeftApplication(MediationNativeAdapter mediationnativeadapter)
    {
        bl.b("onAdLeftApplication must be called on the main UI thread.");
        zzb.zzaF("Adapter called onAdLeftApplication.");
        try
        {
            a.c();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationNativeAdapter mediationnativeadapter)
        {
            zzb.zzd("Could not call onAdLeftApplication.", mediationnativeadapter);
        }
    }

    public final void onAdLoaded(MediationBannerAdapter mediationbanneradapter)
    {
        bl.b("onAdLoaded must be called on the main UI thread.");
        zzb.zzaF("Adapter called onAdLoaded.");
        try
        {
            a.e();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationBannerAdapter mediationbanneradapter)
        {
            zzb.zzd("Could not call onAdLoaded.", mediationbanneradapter);
        }
    }

    public final void onAdLoaded(MediationInterstitialAdapter mediationinterstitialadapter)
    {
        bl.b("onAdLoaded must be called on the main UI thread.");
        zzb.zzaF("Adapter called onAdLoaded.");
        try
        {
            a.e();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationInterstitialAdapter mediationinterstitialadapter)
        {
            zzb.zzd("Could not call onAdLoaded.", mediationinterstitialadapter);
        }
    }

    public final void onAdLoaded(MediationNativeAdapter mediationnativeadapter, NativeAdMapper nativeadmapper)
    {
        bl.b("onAdLoaded must be called on the main UI thread.");
        zzb.zzaF("Adapter called onAdLoaded.");
        b = nativeadmapper;
        try
        {
            a.e();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationNativeAdapter mediationnativeadapter)
        {
            zzb.zzd("Could not call onAdLoaded.", mediationnativeadapter);
        }
    }

    public final void onAdOpened(MediationBannerAdapter mediationbanneradapter)
    {
        bl.b("onAdOpened must be called on the main UI thread.");
        zzb.zzaF("Adapter called onAdOpened.");
        try
        {
            a.d();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationBannerAdapter mediationbanneradapter)
        {
            zzb.zzd("Could not call onAdOpened.", mediationbanneradapter);
        }
    }

    public final void onAdOpened(MediationInterstitialAdapter mediationinterstitialadapter)
    {
        bl.b("onAdOpened must be called on the main UI thread.");
        zzb.zzaF("Adapter called onAdOpened.");
        try
        {
            a.d();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationInterstitialAdapter mediationinterstitialadapter)
        {
            zzb.zzd("Could not call onAdOpened.", mediationinterstitialadapter);
        }
    }

    public final void onAdOpened(MediationNativeAdapter mediationnativeadapter)
    {
        bl.b("onAdOpened must be called on the main UI thread.");
        zzb.zzaF("Adapter called onAdOpened.");
        try
        {
            a.d();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediationNativeAdapter mediationnativeadapter)
        {
            zzb.zzd("Could not call onAdOpened.", mediationnativeadapter);
        }
    }
}
