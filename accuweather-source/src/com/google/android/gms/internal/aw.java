// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.ads.purchase.InAppPurchaseListener;
import com.google.android.gms.ads.purchase.PlayStorePurchaseListener;

// Referenced classes of package com.google.android.gms.internal:
//            al, bt, am, ai, 
//            ah, ar, ao, di, 
//            dm, au, ev

public final class aw
{

    private AdListener lO;
    private PlayStorePurchaseListener mA;
    private final Context mContext;
    private AppEventListener mf;
    private String mh;
    private final bt mu;
    private final al mv;
    private ar mw;
    private String mx;
    private InAppPurchaseListener mz;

    public aw(Context context)
    {
        this(context, al.aA());
    }

    public aw(Context context, al al1)
    {
        mu = new bt();
        mContext = context;
        mv = al1;
    }

    private void k(String s)
        throws RemoteException
    {
        if (mh == null)
        {
            l(s);
        }
        mw = ai.a(mContext, new am(), mh, mu);
        if (lO != null)
        {
            mw.a(new ah(lO));
        }
        if (mf != null)
        {
            mw.a(new ao(mf));
        }
        if (mz != null)
        {
            mw.a(new di(mz));
        }
        if (mA != null)
        {
            mw.a(new dm(mA), mx);
        }
    }

    private void l(String s)
    {
        if (mw == null)
        {
            throw new IllegalStateException((new StringBuilder()).append("The ad unit ID must be set on InterstitialAd before ").append(s).append(" is called.").toString());
        } else
        {
            return;
        }
    }

    public void a(au au1)
    {
        try
        {
            if (mw == null)
            {
                k("loadAd");
            }
            if (mw.a(mv.a(mContext, au1)))
            {
                mu.c(au1.aD());
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (au au1)
        {
            ev.c("Failed to load ad.", au1);
        }
    }

    public AdListener getAdListener()
    {
        return lO;
    }

    public String getAdUnitId()
    {
        return mh;
    }

    public AppEventListener getAppEventListener()
    {
        return mf;
    }

    public InAppPurchaseListener getInAppPurchaseListener()
    {
        return mz;
    }

    public boolean isLoaded()
    {
        if (mw == null)
        {
            return false;
        }
        boolean flag;
        try
        {
            flag = mw.isReady();
        }
        catch (RemoteException remoteexception)
        {
            ev.c("Failed to check if ad is ready.", remoteexception);
            return false;
        }
        return flag;
    }

    public void setAdListener(AdListener adlistener)
    {
        lO = adlistener;
        if (mw == null) goto _L2; else goto _L1
_L1:
        ar ar1 = mw;
        if (adlistener == null)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        adlistener = new ah(adlistener);
_L3:
        ar1.a(adlistener);
_L2:
        return;
        adlistener = null;
          goto _L3
        adlistener;
        ev.c("Failed to set the AdListener.", adlistener);
        return;
    }

    public void setAdUnitId(String s)
    {
        if (mh != null)
        {
            throw new IllegalStateException("The ad unit ID can only be set once on InterstitialAd.");
        } else
        {
            mh = s;
            return;
        }
    }

    public void setAppEventListener(AppEventListener appeventlistener)
    {
        mf = appeventlistener;
        if (mw == null) goto _L2; else goto _L1
_L1:
        ar ar1 = mw;
        if (appeventlistener == null)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        appeventlistener = new ao(appeventlistener);
_L3:
        ar1.a(appeventlistener);
_L2:
        return;
        appeventlistener = null;
          goto _L3
        appeventlistener;
        ev.c("Failed to set the AppEventListener.", appeventlistener);
        return;
    }

    public void setInAppPurchaseListener(InAppPurchaseListener inapppurchaselistener)
    {
        if (mA != null)
        {
            throw new IllegalStateException("Play store purchase parameter has already been set.");
        }
        mz = inapppurchaselistener;
        if (mw == null) goto _L2; else goto _L1
_L1:
        ar ar1 = mw;
        if (inapppurchaselistener == null)
        {
            break MISSING_BLOCK_LABEL_55;
        }
        inapppurchaselistener = new di(inapppurchaselistener);
_L3:
        ar1.a(inapppurchaselistener);
_L2:
        return;
        inapppurchaselistener = null;
          goto _L3
        inapppurchaselistener;
        ev.c("Failed to set the InAppPurchaseListener.", inapppurchaselistener);
        return;
    }

    public void setPlayStorePurchaseParams(PlayStorePurchaseListener playstorepurchaselistener, String s)
    {
        mA = playstorepurchaselistener;
        if (mw == null) goto _L2; else goto _L1
_L1:
        ar ar1 = mw;
        if (playstorepurchaselistener == null)
        {
            break MISSING_BLOCK_LABEL_39;
        }
        playstorepurchaselistener = new dm(playstorepurchaselistener);
_L3:
        ar1.a(playstorepurchaselistener, s);
_L2:
        return;
        playstorepurchaselistener = null;
          goto _L3
        playstorepurchaselistener;
        ev.c("Failed to set the play store purchase parameter.", playstorepurchaselistener);
        return;
    }

    public void show()
    {
        try
        {
            l("show");
            mw.showInterstitial();
            return;
        }
        catch (RemoteException remoteexception)
        {
            ev.c("Failed to show interstitial.", remoteexception);
        }
    }
}
