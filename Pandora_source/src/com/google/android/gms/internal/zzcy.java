// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Handler;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzj;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.ads.internal.util.client.zzb;
import p.bq.d;
import p.bq.e;
import p.bq.f;
import p.bq.g;

// Referenced classes of package com.google.android.gms.internal:
//            zzct, zzcz

public final class zzcy
    implements e, g
{

    private final zzct zzvb;

    public zzcy(zzct zzct1)
    {
        zzvb = zzct1;
    }

    static zzct zza(zzcy zzcy1)
    {
        return zzcy1.zzvb;
    }

    public void onClick(d d)
    {
        zzb.zzaj("Adapter called onClick.");
        if (!zzj.zzbJ().zzfk())
        {
            zzb.zzan("onClick must be called on the main UI thread.");
            zza.zzCH.post(new Runnable() {

                final zzcy a;

                public void run()
                {
                    try
                    {
                        com.google.android.gms.internal.zzcy.zza(a).onAdClicked();
                        return;
                    }
                    catch (RemoteException remoteexception)
                    {
                        zzb.zzd("Could not call onAdClicked.", remoteexception);
                    }
                }

            
            {
                a = zzcy.this;
                super();
            }
            });
            return;
        }
        try
        {
            zzvb.onAdClicked();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (d d)
        {
            zzb.zzd("Could not call onAdClicked.", d);
        }
    }

    public void onDismissScreen(d d)
    {
        zzb.zzaj("Adapter called onDismissScreen.");
        if (!zzj.zzbJ().zzfk())
        {
            zzb.zzan("onDismissScreen must be called on the main UI thread.");
            zza.zzCH.post(new Runnable() {

                final zzcy a;

                public void run()
                {
                    try
                    {
                        com.google.android.gms.internal.zzcy.zza(a).onAdClosed();
                        return;
                    }
                    catch (RemoteException remoteexception)
                    {
                        zzb.zzd("Could not call onAdClosed.", remoteexception);
                    }
                }

            
            {
                a = zzcy.this;
                super();
            }
            });
            return;
        }
        try
        {
            zzvb.onAdClosed();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (d d)
        {
            zzb.zzd("Could not call onAdClosed.", d);
        }
    }

    public void onDismissScreen(f f)
    {
        zzb.zzaj("Adapter called onDismissScreen.");
        if (!zzj.zzbJ().zzfk())
        {
            zzb.zzan("onDismissScreen must be called on the main UI thread.");
            zza.zzCH.post(new Runnable() {

                final zzcy a;

                public void run()
                {
                    try
                    {
                        com.google.android.gms.internal.zzcy.zza(a).onAdClosed();
                        return;
                    }
                    catch (RemoteException remoteexception)
                    {
                        zzb.zzd("Could not call onAdClosed.", remoteexception);
                    }
                }

            
            {
                a = zzcy.this;
                super();
            }
            });
            return;
        }
        try
        {
            zzvb.onAdClosed();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (f f)
        {
            zzb.zzd("Could not call onAdClosed.", f);
        }
    }

    public void onFailedToReceiveAd(d d, p.bp.a.a a)
    {
        zzb.zzaj((new StringBuilder()).append("Adapter called onFailedToReceiveAd with error. ").append(a).toString());
        if (!zzj.zzbJ().zzfk())
        {
            zzb.zzan("onFailedToReceiveAd must be called on the main UI thread.");
            zza.zzCH.post(new Runnable(a) {

                final p.bp.a.a a;
                final zzcy b;

                public void run()
                {
                    try
                    {
                        com.google.android.gms.internal.zzcy.zza(b).onAdFailedToLoad(com.google.android.gms.internal.zzcz.zza(a));
                        return;
                    }
                    catch (RemoteException remoteexception)
                    {
                        zzb.zzd("Could not call onAdFailedToLoad.", remoteexception);
                    }
                }

            
            {
                b = zzcy.this;
                a = a1;
                super();
            }
            });
            return;
        }
        try
        {
            zzvb.onAdFailedToLoad(com.google.android.gms.internal.zzcz.zza(a));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (d d)
        {
            zzb.zzd("Could not call onAdFailedToLoad.", d);
        }
    }

    public void onFailedToReceiveAd(f f, p.bp.a.a a)
    {
        zzb.zzaj((new StringBuilder()).append("Adapter called onFailedToReceiveAd with error ").append(a).append(".").toString());
        if (!zzj.zzbJ().zzfk())
        {
            zzb.zzan("onFailedToReceiveAd must be called on the main UI thread.");
            zza.zzCH.post(new Runnable(a) {

                final p.bp.a.a a;
                final zzcy b;

                public void run()
                {
                    try
                    {
                        com.google.android.gms.internal.zzcy.zza(b).onAdFailedToLoad(com.google.android.gms.internal.zzcz.zza(a));
                        return;
                    }
                    catch (RemoteException remoteexception)
                    {
                        zzb.zzd("Could not call onAdFailedToLoad.", remoteexception);
                    }
                }

            
            {
                b = zzcy.this;
                a = a1;
                super();
            }
            });
            return;
        }
        try
        {
            zzvb.onAdFailedToLoad(com.google.android.gms.internal.zzcz.zza(a));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (f f)
        {
            zzb.zzd("Could not call onAdFailedToLoad.", f);
        }
    }

    public void onLeaveApplication(d d)
    {
        zzb.zzaj("Adapter called onLeaveApplication.");
        if (!zzj.zzbJ().zzfk())
        {
            zzb.zzan("onLeaveApplication must be called on the main UI thread.");
            zza.zzCH.post(new Runnable() {

                final zzcy a;

                public void run()
                {
                    try
                    {
                        com.google.android.gms.internal.zzcy.zza(a).onAdLeftApplication();
                        return;
                    }
                    catch (RemoteException remoteexception)
                    {
                        zzb.zzd("Could not call onAdLeftApplication.", remoteexception);
                    }
                }

            
            {
                a = zzcy.this;
                super();
            }
            });
            return;
        }
        try
        {
            zzvb.onAdLeftApplication();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (d d)
        {
            zzb.zzd("Could not call onAdLeftApplication.", d);
        }
    }

    public void onLeaveApplication(f f)
    {
        zzb.zzaj("Adapter called onLeaveApplication.");
        if (!zzj.zzbJ().zzfk())
        {
            zzb.zzan("onLeaveApplication must be called on the main UI thread.");
            zza.zzCH.post(new Runnable() {

                final zzcy a;

                public void run()
                {
                    try
                    {
                        com.google.android.gms.internal.zzcy.zza(a).onAdLeftApplication();
                        return;
                    }
                    catch (RemoteException remoteexception)
                    {
                        zzb.zzd("Could not call onAdLeftApplication.", remoteexception);
                    }
                }

            
            {
                a = zzcy.this;
                super();
            }
            });
            return;
        }
        try
        {
            zzvb.onAdLeftApplication();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (f f)
        {
            zzb.zzd("Could not call onAdLeftApplication.", f);
        }
    }

    public void onPresentScreen(d d)
    {
        zzb.zzaj("Adapter called onPresentScreen.");
        if (!zzj.zzbJ().zzfk())
        {
            zzb.zzan("onPresentScreen must be called on the main UI thread.");
            zza.zzCH.post(new Runnable() {

                final zzcy a;

                public void run()
                {
                    try
                    {
                        com.google.android.gms.internal.zzcy.zza(a).onAdOpened();
                        return;
                    }
                    catch (RemoteException remoteexception)
                    {
                        zzb.zzd("Could not call onAdOpened.", remoteexception);
                    }
                }

            
            {
                a = zzcy.this;
                super();
            }
            });
            return;
        }
        try
        {
            zzvb.onAdOpened();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (d d)
        {
            zzb.zzd("Could not call onAdOpened.", d);
        }
    }

    public void onPresentScreen(f f)
    {
        zzb.zzaj("Adapter called onPresentScreen.");
        if (!zzj.zzbJ().zzfk())
        {
            zzb.zzan("onPresentScreen must be called on the main UI thread.");
            zza.zzCH.post(new Runnable() {

                final zzcy a;

                public void run()
                {
                    try
                    {
                        com.google.android.gms.internal.zzcy.zza(a).onAdOpened();
                        return;
                    }
                    catch (RemoteException remoteexception)
                    {
                        zzb.zzd("Could not call onAdOpened.", remoteexception);
                    }
                }

            
            {
                a = zzcy.this;
                super();
            }
            });
            return;
        }
        try
        {
            zzvb.onAdOpened();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (f f)
        {
            zzb.zzd("Could not call onAdOpened.", f);
        }
    }

    public void onReceivedAd(d d)
    {
        zzb.zzaj("Adapter called onReceivedAd.");
        if (!zzj.zzbJ().zzfk())
        {
            zzb.zzan("onReceivedAd must be called on the main UI thread.");
            zza.zzCH.post(new Runnable() {

                final zzcy a;

                public void run()
                {
                    try
                    {
                        com.google.android.gms.internal.zzcy.zza(a).onAdLoaded();
                        return;
                    }
                    catch (RemoteException remoteexception)
                    {
                        zzb.zzd("Could not call onAdLoaded.", remoteexception);
                    }
                }

            
            {
                a = zzcy.this;
                super();
            }
            });
            return;
        }
        try
        {
            zzvb.onAdLoaded();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (d d)
        {
            zzb.zzd("Could not call onAdLoaded.", d);
        }
    }

    public void onReceivedAd(f f)
    {
        zzb.zzaj("Adapter called onReceivedAd.");
        if (!zzj.zzbJ().zzfk())
        {
            zzb.zzan("onReceivedAd must be called on the main UI thread.");
            zza.zzCH.post(new Runnable() {

                final zzcy a;

                public void run()
                {
                    try
                    {
                        com.google.android.gms.internal.zzcy.zza(a).onAdLoaded();
                        return;
                    }
                    catch (RemoteException remoteexception)
                    {
                        zzb.zzd("Could not call onAdLoaded.", remoteexception);
                    }
                }

            
            {
                a = zzcy.this;
                super();
            }
            });
            return;
        }
        try
        {
            zzvb.onAdLoaded();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (f f)
        {
            zzb.zzd("Could not call onAdLoaded.", f);
        }
    }
}
