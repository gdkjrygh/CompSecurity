// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.ads.doubleclick.PublisherInterstitialAd;
import com.google.android.gms.ads.doubleclick.c;
import com.google.android.gms.ads.purchase.InAppPurchaseListener;
import com.google.android.gms.ads.purchase.PlayStorePurchaseListener;

// Referenced classes of package com.google.android.gms.internal:
//            ax, cs, ay, au, 
//            at, bd, ba, em, 
//            eq, ex, bg, gs

public class bi
{

    private final Context mContext;
    private AdListener nR;
    private String oA;
    private InAppPurchaseListener oC;
    private PlayStorePurchaseListener oD;
    private PublisherInterstitialAd oF;
    private c oG;
    private AppEventListener oi;
    private String ok;
    private final cs ox;
    private final ax oy;
    private bd oz;

    public bi(Context context)
    {
        this(context, ax.bb(), null);
    }

    public bi(Context context, PublisherInterstitialAd publisherinterstitialad)
    {
        this(context, ax.bb(), publisherinterstitialad);
    }

    public bi(Context context, ax ax1, PublisherInterstitialAd publisherinterstitialad)
    {
        ox = new cs();
        mContext = context;
        oy = ax1;
        oF = publisherinterstitialad;
    }

    private void v(String s)
        throws RemoteException
    {
        if (ok == null)
        {
            w(s);
        }
        oz = au.a(mContext, new ay(), ok, ox);
        if (nR != null)
        {
            oz.a(new at(nR));
        }
        if (oi != null)
        {
            oz.a(new ba(oi));
        }
        if (oC != null)
        {
            oz.a(new em(oC));
        }
        if (oD != null)
        {
            oz.a(new eq(oD), oA);
        }
        if (oG != null)
        {
            oz.a(new ex(oG, oF));
        }
    }

    private void w(String s)
    {
        if (oz == null)
        {
            throw new IllegalStateException((new StringBuilder()).append("The ad unit ID must be set on InterstitialAd before ").append(s).append(" is called.").toString());
        } else
        {
            return;
        }
    }

    public void a(bg bg1)
    {
        try
        {
            if (oz == null)
            {
                v("loadAd");
            }
            if (oz.a(oy.a(mContext, bg1)))
            {
                ox.d(bg1.be());
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (bg bg1)
        {
            gs.d("Failed to load ad.", bg1);
        }
    }

    public AdListener getAdListener()
    {
        return nR;
    }

    public String getAdUnitId()
    {
        return ok;
    }

    public AppEventListener getAppEventListener()
    {
        return oi;
    }

    public InAppPurchaseListener getInAppPurchaseListener()
    {
        return oC;
    }

    public String getMediationAdapterClassName()
    {
        String s;
        if (oz == null)
        {
            break MISSING_BLOCK_LABEL_26;
        }
        s = oz.getMediationAdapterClassName();
        return s;
        RemoteException remoteexception;
        remoteexception;
        gs.d("Failed to get the mediation adapter class name.", remoteexception);
        return null;
    }

    public boolean isLoaded()
    {
        if (oz == null)
        {
            return false;
        }
        boolean flag;
        try
        {
            flag = oz.isReady();
        }
        catch (RemoteException remoteexception)
        {
            gs.d("Failed to check if ad is ready.", remoteexception);
            return false;
        }
        return flag;
    }

    public void setAdListener(AdListener adlistener)
    {
        nR = adlistener;
        if (oz == null) goto _L2; else goto _L1
_L1:
        bd bd1 = oz;
        if (adlistener == null)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        adlistener = new at(adlistener);
_L3:
        bd1.a(adlistener);
_L2:
        return;
        adlistener = null;
          goto _L3
        adlistener;
        gs.d("Failed to set the AdListener.", adlistener);
        return;
    }

    public void setAdUnitId(String s)
    {
        if (ok != null)
        {
            throw new IllegalStateException("The ad unit ID can only be set once on InterstitialAd.");
        } else
        {
            ok = s;
            return;
        }
    }

    public void setAppEventListener(AppEventListener appeventlistener)
    {
        oi = appeventlistener;
        if (oz == null) goto _L2; else goto _L1
_L1:
        bd bd1 = oz;
        if (appeventlistener == null)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        appeventlistener = new ba(appeventlistener);
_L3:
        bd1.a(appeventlistener);
_L2:
        return;
        appeventlistener = null;
          goto _L3
        appeventlistener;
        gs.d("Failed to set the AppEventListener.", appeventlistener);
        return;
    }

    public void setInAppPurchaseListener(InAppPurchaseListener inapppurchaselistener)
    {
        if (oD != null)
        {
            throw new IllegalStateException("Play store purchase parameter has already been set.");
        }
        oC = inapppurchaselistener;
        if (oz == null) goto _L2; else goto _L1
_L1:
        bd bd1 = oz;
        if (inapppurchaselistener == null)
        {
            break MISSING_BLOCK_LABEL_55;
        }
        inapppurchaselistener = new em(inapppurchaselistener);
_L3:
        bd1.a(inapppurchaselistener);
_L2:
        return;
        inapppurchaselistener = null;
          goto _L3
        inapppurchaselistener;
        gs.d("Failed to set the InAppPurchaseListener.", inapppurchaselistener);
        return;
    }

    public void setPlayStorePurchaseParams(PlayStorePurchaseListener playstorepurchaselistener, String s)
    {
        oD = playstorepurchaselistener;
        if (oz == null) goto _L2; else goto _L1
_L1:
        bd bd1 = oz;
        if (playstorepurchaselistener == null)
        {
            break MISSING_BLOCK_LABEL_39;
        }
        playstorepurchaselistener = new eq(playstorepurchaselistener);
_L3:
        bd1.a(playstorepurchaselistener, s);
_L2:
        return;
        playstorepurchaselistener = null;
          goto _L3
        playstorepurchaselistener;
        gs.d("Failed to set the play store purchase parameter.", playstorepurchaselistener);
        return;
    }

    public void show()
    {
        try
        {
            w("show");
            oz.showInterstitial();
            return;
        }
        catch (RemoteException remoteexception)
        {
            gs.d("Failed to show interstitial.", remoteexception);
        }
    }
}
