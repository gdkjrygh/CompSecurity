// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import bolts.j;
import com.cardinalblue.android.piccollage.a.b;
import com.cardinalblue.android.piccollage.a.f;
import com.cardinalblue.android.piccollage.lib.d;
import com.cardinalblue.android.piccollage.model.gson.PICDeviceConfig;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.formats.NativeAppInstallAd;
import com.google.android.gms.ads.formats.NativeContentAd;
import com.google.android.gms.ads.purchase.InAppPurchaseListener;
import dagger.internal.ArrayQueue;
import java.util.Queue;

public class com.cardinalblue.android.piccollage.a
{
    public static interface a
    {

        public abstract void a();
    }


    private boolean a;
    private boolean b;
    private InterstitialAd c;
    private Queue d;

    public com.cardinalblue.android.piccollage.a()
    {
        a = false;
        d = new ArrayQueue(1);
    }

    private boolean a()
    {
        if (a)
        {
            return b;
        }
        b = false;
        float f1 = ((d)com.cardinalblue.android.a.a.a(com/cardinalblue/android/piccollage/lib/d)).a().getInterstitialProb();
        if (Math.random() < (double)f1)
        {
            b = true;
        }
        a = true;
        return b;
    }

    private boolean b(Activity activity, a a1, InAppPurchaseListener inapppurchaselistener)
    {
        if (a() && c != null)
        {
            c.setInAppPurchaseListener(inapppurchaselistener);
            c.setAdListener(new AdListener(a1) {

                final a a;
                final com.cardinalblue.android.piccollage.a b;

                public void onAdClosed()
                {
                    super.onAdClosed();
                    Log.v("ADS", "onAdClosed");
                    if (a != null)
                    {
                        a.a();
                    }
                }

                public void onAdLeftApplication()
                {
                    super.onAdLeftApplication();
                    Log.v("ADS", "onAdLeftApplication");
                    com.cardinalblue.android.piccollage.a.b.bB();
                }

                public void onAdOpened()
                {
                    super.onAdOpened();
                    Log.v("ADS", "onAdOpened");
                }

            
            {
                b = com.cardinalblue.android.piccollage.a.this;
                a = a2;
                super();
            }
            });
            if (c.isLoaded() && a())
            {
                c.show();
                com.cardinalblue.android.piccollage.a.b.bA();
                activity.overridePendingTransition(0x7f040031, 0x7f040038);
                return true;
            }
        }
        return false;
    }

    public void a(Activity activity)
    {
        if (!a())
        {
            break MISSING_BLOCK_LABEL_74;
        }
        c = new InterstitialAd(activity);
        if (android.os.Build.VERSION.SDK_INT <= 15)
        {
            c.setAdUnitId("ca-app-pub-3259030093048086/6275589854");
        } else
        {
            c.setAdUnitId("ca-app-pub-3259030093048086/3385478652");
        }
        activity = new com.google.android.gms.ads.AdRequest.Builder();
        if (com.cardinalblue.android.b.d.e())
        {
            activity.addTestDevice(AdRequest.DEVICE_ID_EMULATOR).addTestDevice("E0BD8D036C89CA07D6412242CD7A8FAF");
        }
        c.loadAd(activity.build());
        return;
        activity;
        f.a(activity);
        return;
    }

    public void a(Context context)
    {
        bolts.j.a a1 = j.a();
        String s = "ca-app-pub-3259030093048086/7906689857";
        com.google.android.gms.ads.AdRequest.Builder builder = (new com.google.android.gms.ads.AdRequest.Builder()).addTestDevice(AdRequest.DEVICE_ID_EMULATOR);
        if (com.cardinalblue.android.b.d.e())
        {
            builder.addTestDevice(AdRequest.DEVICE_ID_EMULATOR).addTestDevice(AdRequest.DEVICE_ID_EMULATOR);
            s = "ca-app-pub-3940256099942544/2247696110";
        }
        (new com.google.android.gms.ads.AdLoader.Builder(context, s)).forContentAd(new com.google.android.gms.ads.formats.NativeContentAd.OnContentAdLoadedListener(a1) {

            final bolts.j.a a;
            final com.cardinalblue.android.piccollage.a b;

            public void onContentAdLoaded(NativeContentAd nativecontentad)
            {
                a.a(nativecontentad);
            }

            
            {
                b = com.cardinalblue.android.piccollage.a.this;
                a = a2;
                super();
            }
        }).forAppInstallAd(new com.google.android.gms.ads.formats.NativeAppInstallAd.OnAppInstallAdLoadedListener(a1) {

            final bolts.j.a a;
            final com.cardinalblue.android.piccollage.a b;

            public void onAppInstallAdLoaded(NativeAppInstallAd nativeappinstallad)
            {
                a.a(nativeappinstallad);
            }

            
            {
                b = com.cardinalblue.android.piccollage.a.this;
                a = a2;
                super();
            }
        }).withAdListener(new AdListener(a1) {

            final bolts.j.a a;
            final com.cardinalblue.android.piccollage.a b;

            public void onAdFailedToLoad(int i)
            {
                a.a(new Exception((new StringBuilder()).append("errorCode : ").append(i).toString()));
            }

            
            {
                b = com.cardinalblue.android.piccollage.a.this;
                a = a2;
                super();
            }
        }).build().loadAd(builder.build());
        d.add(a1.a());
    }

    public boolean a(Activity activity, a a1, InAppPurchaseListener inapppurchaselistener)
    {
        return b(activity, a1, inapppurchaselistener);
    }

    public j b(Context context)
    {
        j j1 = (j)d.poll();
        a(context);
        return j1;
        Exception exception;
        exception;
        a(context);
        throw exception;
    }
}
