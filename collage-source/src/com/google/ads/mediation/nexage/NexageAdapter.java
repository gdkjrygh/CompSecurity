// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads.mediation.nexage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.millennialmedia.InlineAd;
import com.millennialmedia.InterstitialAd;
import com.millennialmedia.a;
import com.millennialmedia.b;
import com.millennialmedia.d;
import com.millennialmedia.f;
import java.util.Iterator;
import java.util.Set;

public class NexageAdapter
    implements MediationBannerAdapter, MediationInterstitialAdapter, com.millennialmedia.InlineAd.f, com.millennialmedia.InterstitialAd.d
{

    private static final String a = com/google/ads/mediation/nexage/NexageAdapter.getSimpleName();
    private static final Handler b = new Handler(Looper.getMainLooper());
    private InlineAd c;
    private InterstitialAd d;
    private LinearLayout e;
    private MediationBannerListener f;
    private MediationInterstitialListener g;
    private Context h;

    public NexageAdapter()
    {
    }

    private static int a(int i, Context context)
    {
        return (int)TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }

    private AdSize a(Activity activity, AdSize adsize)
    {
        int i;
        int j;
label0:
        {
            i = activity.getResources().getDisplayMetrics().widthPixels;
            j = activity.getResources().getDisplayMetrics().heightPixels;
            AdSize adsize1 = adsize;
            if (adsize.isAutoHeight())
            {
                adsize1 = adsize;
                if (adsize.isFullWidth())
                {
                    if (i < a(728, ((Context) (activity))))
                    {
                        break label0;
                    }
                    adsize1 = new AdSize(728, 90);
                }
            }
            return adsize1;
        }
        if (i > j && j > a(400, ((Context) (activity))))
        {
            return new AdSize(320, 50);
        }
        if (i > j && j < a(400, ((Context) (activity))))
        {
            return new AdSize(120, 30);
        } else
        {
            return new AdSize(320, 50);
        }
    }

    static MediationBannerListener a(NexageAdapter nexageadapter)
    {
        return nexageadapter.f;
    }

    private f a(MediationAdRequest mediationadrequest)
    {
        f f1 = (new f()).a(mediationadrequest.getBirthday());
        Object obj;
        if (mediationadrequest.getGender() == 1)
        {
            f1 = f1.a(com.millennialmedia.f.a.a);
        } else
        if (mediationadrequest.getGender() == 2)
        {
            f1 = f1.a(com.millennialmedia.f.a.b);
        } else
        {
            f1 = f1.a(com.millennialmedia.f.a.c);
        }
        obj = f1;
        if (mediationadrequest.getKeywords() != null)
        {
            obj = new StringBuilder();
            String s;
            for (mediationadrequest = mediationadrequest.getKeywords().iterator(); mediationadrequest.hasNext(); ((StringBuilder) (obj)).append(s))
            {
                s = (String)mediationadrequest.next();
                ((StringBuilder) (obj)).append(",");
            }

            obj = f1.a(((StringBuilder) (obj)).toString().substring(1));
        }
        return ((f) (obj));
    }

    static String a()
    {
        return a;
    }

    static MediationInterstitialListener b(NexageAdapter nexageadapter)
    {
        return nexageadapter.g;
    }

    public String a(Bundle bundle)
    {
        if (bundle != null)
        {
            if (bundle.containsKey("position"))
            {
                return bundle.getString("position");
            }
            if (bundle.containsKey("pubid"))
            {
                return bundle.getString("pubid");
            }
        }
        return null;
    }

    public void a(InlineAd inlinead)
    {
        b.post(new Runnable() {

            final NexageAdapter a;

            public void run()
            {
                com.google.ads.mediation.nexage.NexageAdapter.a(a).onAdLoaded(a);
            }

            
            {
                a = NexageAdapter.this;
                super();
            }
        });
        Log.i(a, "Millennial inline ad request succeeded.");
    }

    public void a(InlineAd inlinead, int i, int j)
    {
        Log.d(a, (new StringBuilder()).append("Millennial Inline Ad - Banner about to resize (width: ").append(i).append(", height: ").append(j).append(")").toString());
    }

    public void a(InlineAd inlinead, int i, int j, boolean flag)
    {
        String s = a;
        StringBuilder stringbuilder = (new StringBuilder()).append("Millennial Inline Ad - Banner resized (width: ").append(i).append(", height: ").append(j).append("). ");
        if (flag)
        {
            inlinead = "Returned to original placement.";
        } else
        {
            inlinead = "Got a fresh, new place.";
        }
        Log.d(s, stringbuilder.append(inlinead).toString());
    }

    public void a(InlineAd inlinead, com.millennialmedia.InlineAd.e e1)
    {
        Log.i(a, (new StringBuilder()).append("Millennial Inline Ad request failed (").append(e1.a()).append("): ").append(e1.b()).toString());
        switch (e1.a())
        {
        case 5: // '\005'
        default:
            b.post(new Runnable() {

                final NexageAdapter a;

                public void run()
                {
                    com.google.ads.mediation.nexage.NexageAdapter.a(a).onAdFailedToLoad(a, 3);
                }

            
            {
                a = NexageAdapter.this;
                super();
            }
            });
            return;

        case 1: // '\001'
        case 3: // '\003'
        case 4: // '\004'
        case 7: // '\007'
            b.post(new Runnable() {

                final NexageAdapter a;

                public void run()
                {
                    com.google.ads.mediation.nexage.NexageAdapter.a(a).onAdFailedToLoad(a, 0);
                }

            
            {
                a = NexageAdapter.this;
                super();
            }
            });
            return;

        case 2: // '\002'
        case 6: // '\006'
            b.post(new Runnable() {

                final NexageAdapter a;

                public void run()
                {
                    com.google.ads.mediation.nexage.NexageAdapter.a(a).onAdFailedToLoad(a, 2);
                }

            
            {
                a = NexageAdapter.this;
                super();
            }
            });
            break;
        }
    }

    public void a(InterstitialAd interstitialad)
    {
        b.post(new Runnable() {

            final NexageAdapter a;

            public void run()
            {
                com.google.ads.mediation.nexage.NexageAdapter.b(a).onAdLoaded(a);
            }

            
            {
                a = NexageAdapter.this;
                super();
            }
        });
        Log.i(a, "Millennial interstitial loaded.");
    }

    public void a(InterstitialAd interstitialad, com.millennialmedia.InterstitialAd.c c1)
    {
        c1.a();
        JVM INSTR lookupswitch 7: default 72
    //                   1: 157
    //                   2: 175
    //                   3: 157
    //                   4: 157
    //                   6: 175
    //                   7: 157
    //                   203: 131;
           goto _L1 _L2 _L3 _L2 _L2 _L3 _L2 _L4
_L1:
        b.post(new Runnable() {

            final NexageAdapter a;

            public void run()
            {
                com.google.ads.mediation.nexage.NexageAdapter.b(a).onAdFailedToLoad(a, 3);
            }

            
            {
                a = NexageAdapter.this;
                super();
            }
        });
_L6:
        Log.w(a, (new StringBuilder()).append("Millennial interstitial request failed (").append(c1.a()).append("): ").append(c1.b()).toString());
        return;
_L4:
        Log.w(a, "Already loaded an ad! Possibly accumulating discrepancies.");
        b.post(new Runnable() {

            final NexageAdapter a;

            public void run()
            {
                com.google.ads.mediation.nexage.NexageAdapter.b(a).onAdLoaded(a);
            }

            
            {
                a = NexageAdapter.this;
                super();
            }
        });
        return;
_L2:
        b.post(new Runnable() {

            final NexageAdapter a;

            public void run()
            {
                com.google.ads.mediation.nexage.NexageAdapter.b(a).onAdFailedToLoad(a, 0);
            }

            
            {
                a = NexageAdapter.this;
                super();
            }
        });
        continue; /* Loop/switch isn't completed */
_L3:
        b.post(new Runnable() {

            final NexageAdapter a;

            public void run()
            {
                com.google.ads.mediation.nexage.NexageAdapter.b(a).onAdFailedToLoad(a, 2);
            }

            
            {
                a = NexageAdapter.this;
                super();
            }
        });
        if (true) goto _L6; else goto _L5
_L5:
    }

    public boolean a(Bundle bundle, Bundle bundle1)
    {
        Object obj = null;
        String s;
        a a1;
        try
        {
            a1 = (new a()).b("AdMobNexageAdapter").a(null);
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            return false;
        }
        s = obj;
        if (bundle == null)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        s = obj;
        if (bundle.containsKey("dcn"))
        {
            s = bundle.getString("dcn");
        }
        bundle = s;
        if (bundle1 == null)
        {
            break MISSING_BLOCK_LABEL_76;
        }
        bundle = s;
        if (bundle1.containsKey("dcn"))
        {
            bundle = bundle1.getString("dcn");
        }
        Log.d(a, (new StringBuilder()).append("Using site ID: ").append(bundle).toString());
        com.millennialmedia.d.a(a1.a(bundle));
        return true;
    }

    public void b(InlineAd inlinead)
    {
        b.post(new Runnable() {

            final NexageAdapter a;

            public void run()
            {
                com.google.ads.mediation.nexage.NexageAdapter.a(a).onAdClicked(a);
            }

            
            {
                a = NexageAdapter.this;
                super();
            }
        });
        Log.i(a, "Millennial inline ad clicked.");
    }

    public void b(InterstitialAd interstitialad)
    {
        b.post(new Runnable() {

            final NexageAdapter a;

            public void run()
            {
                com.google.ads.mediation.nexage.NexageAdapter.b(a).onAdOpened(a);
            }

            
            {
                a = NexageAdapter.this;
                super();
            }
        });
        Log.i(a, "Millennial interstitial shown.");
    }

    public void b(InterstitialAd interstitialad, com.millennialmedia.InterstitialAd.c c1)
    {
        Log.e(a, (new StringBuilder()).append("MM ad failed to display: ").append(c1.b()).toString());
    }

    public void c(InlineAd inlinead)
    {
        b.post(new Runnable() {

            final NexageAdapter a;

            public void run()
            {
                com.google.ads.mediation.nexage.NexageAdapter.a(a).onAdOpened(a);
            }

            
            {
                a = NexageAdapter.this;
                super();
            }
        });
        Log.i(a, "Millennial inline ad expanded.");
    }

    public void c(InterstitialAd interstitialad)
    {
        b.post(new Runnable() {

            final NexageAdapter a;

            public void run()
            {
                com.google.ads.mediation.nexage.NexageAdapter.b(a).onAdClosed(a);
            }

            
            {
                a = NexageAdapter.this;
                super();
            }
        });
        Log.i(a, "Millennial ad closed");
    }

    public void d(InlineAd inlinead)
    {
        b.post(new Runnable() {

            final NexageAdapter a;

            public void run()
            {
                com.google.ads.mediation.nexage.NexageAdapter.a(a).onAdClosed(a);
            }

            
            {
                a = NexageAdapter.this;
                super();
            }
        });
        Log.i(a, "Millennial inline ad collapsed.");
    }

    public void d(InterstitialAd interstitialad)
    {
        b.post(new Runnable() {

            final NexageAdapter a;

            public void run()
            {
                com.google.ads.mediation.nexage.NexageAdapter.b(a).onAdClicked(a);
            }

            
            {
                a = NexageAdapter.this;
                super();
            }
        });
        Log.i(a, "Millennial interstitial clicked.");
    }

    public void e(InlineAd inlinead)
    {
        b.post(new Runnable() {

            final NexageAdapter a;

            public void run()
            {
                com.google.ads.mediation.nexage.NexageAdapter.a(a).onAdLeftApplication(a);
            }

            
            {
                a = NexageAdapter.this;
                super();
            }
        });
        Log.i(a, "Millennial inline ad left application.");
    }

    public void e(InterstitialAd interstitialad)
    {
        b.post(new Runnable() {

            final NexageAdapter a;

            public void run()
            {
                com.google.ads.mediation.nexage.NexageAdapter.b(a).onAdLeftApplication(a);
            }

            
            {
                a = NexageAdapter.this;
                super();
            }
        });
        Log.i(a, "Millennial interstitial left application.");
    }

    public void f(InterstitialAd interstitialad)
    {
        b.post(new Runnable() {

            final NexageAdapter a;

            public void run()
            {
                com.google.ads.mediation.nexage.NexageAdapter.b(a).onAdFailedToLoad(a, 0);
            }

            
            {
                a = NexageAdapter.this;
                super();
            }
        });
        Log.w(a, "Millennial interstitial cached ad expired.");
    }

    public View getBannerView()
    {
        return e;
    }

    public void onDestroy()
    {
        if (c != null)
        {
            c.a(new com.millennialmedia.InlineAd.c() {

                final NexageAdapter a;

                public void a(InlineAd inlinead)
                {
                    Log.d(com.google.ads.mediation.nexage.NexageAdapter.a(), "Abort succeeded.");
                }

                public void b(InlineAd inlinead)
                {
                    Log.w(com.google.ads.mediation.nexage.NexageAdapter.a(), "Request to abort failed.");
                }

            
            {
                a = NexageAdapter.this;
                super();
            }
            });
        }
    }

    public void onPause()
    {
    }

    public void onResume()
    {
    }

    public void requestBannerAd(Context context, MediationBannerListener mediationbannerlistener, Bundle bundle, AdSize adsize, MediationAdRequest mediationadrequest, Bundle bundle1)
    {
        String s = a(bundle);
        android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(-1, -2);
        h = context;
        f = mediationbannerlistener;
        if (mediationbannerlistener == null)
        {
            Log.e(a, "Missing required listener. Millennial cannot make ad request.");
            return;
        }
        if (!com.millennialmedia.d.a())
        {
            com.millennialmedia.d.a((Activity)context);
        }
        if (!a(bundle1, bundle))
        {
            Log.w(a, "Millennial SDK can't set required parameters.");
            b.post(new Runnable() {

                final NexageAdapter a;

                public void run()
                {
                    com.google.ads.mediation.nexage.NexageAdapter.a(a).onAdFailedToLoad(a, 0);
                }

            
            {
                a = NexageAdapter.this;
                super();
            }
            });
            return;
        }
        mediationbannerlistener = a((Activity)context, adsize);
        e = new LinearLayout(context);
        layoutparams.gravity = 1;
        e.setLayoutParams(layoutparams);
        boolean flag;
        try
        {
            c = InlineAd.a(s, e);
            context = (new com.millennialmedia.InlineAd.d()).a(new com.millennialmedia.InlineAd.a(mediationbannerlistener.getWidth(), mediationbannerlistener.getHeight()));
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.e(a, (new StringBuilder()).append("MMSDK Adapter error: ").append(context.getMessage()).toString(), context);
            b.post(new Runnable() {

                final NexageAdapter a;

                public void run()
                {
                    com.google.ads.mediation.nexage.NexageAdapter.a(a).onAdFailedToLoad(a, 1);
                }

            
            {
                a = NexageAdapter.this;
                super();
            }
            });
            return;
        }
        if (mediationadrequest.getLocation() != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.millennialmedia.d.a(flag);
        com.millennialmedia.d.a(a(mediationadrequest));
        c.a(this);
        c.a(context);
    }

    public void requestInterstitialAd(Context context, MediationInterstitialListener mediationinterstitiallistener, Bundle bundle, MediationAdRequest mediationadrequest, Bundle bundle1)
    {
        String s = a(bundle);
        g = mediationinterstitiallistener;
        h = context;
        if (mediationinterstitiallistener == null)
        {
            Log.e(a, "Missing required listener. Millennial cannot make ad request.");
            return;
        }
        if (!com.millennialmedia.d.a())
        {
            com.millennialmedia.d.a((Activity)context);
        }
        if (!a(bundle1, bundle))
        {
            Log.w(a, "Millennial SDK can't set required parameters.");
            b.post(new Runnable() {

                final NexageAdapter a;

                public void run()
                {
                    com.google.ads.mediation.nexage.NexageAdapter.b(a).onAdFailedToLoad(a, 0);
                }

            
            {
                a = NexageAdapter.this;
                super();
            }
            });
            return;
        }
        boolean flag;
        try
        {
            d = InterstitialAd.a(s);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.e(a, (new StringBuilder()).append("MMSDK Adapter error: ").append(context.getMessage()).toString(), context);
            b.post(new Runnable() {

                final NexageAdapter a;

                public void run()
                {
                    com.google.ads.mediation.nexage.NexageAdapter.b(a).onAdFailedToLoad(a, 1);
                }

            
            {
                a = NexageAdapter.this;
                super();
            }
            });
            return;
        }
        if (mediationadrequest.getLocation() != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.millennialmedia.d.a(flag);
        com.millennialmedia.d.a(a(mediationadrequest));
        d.a(this);
        d.a(context, new com.millennialmedia.InterstitialAd.b());
    }

    public void showInterstitial()
    {
        try
        {
            d.a(h);
            return;
        }
        catch (b b1)
        {
            Log.e(a, (new StringBuilder()).append("Exception on displaying MM Ad: ").append(b1.getMessage()).toString(), b1);
        }
    }

}
