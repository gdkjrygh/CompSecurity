// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.ads.doubleclick.PublisherInterstitialAd;
import com.google.android.gms.ads.doubleclick.b;
import com.google.android.gms.ads.purchase.InAppPurchaseListener;
import com.google.android.gms.ads.purchase.PlayStorePurchaseListener;

// Referenced classes of package com.google.android.gms.internal:
//            ax, cx, ay, au, 
//            at, bd, ba, es, 
//            ew, bs, bg, gr

public class bi
{

    private final Context mContext;
    private final cx oH;
    private final ax oI;
    private bd oJ;
    private String oK;
    private InAppPurchaseListener oM;
    private PlayStorePurchaseListener oN;
    private b oO;
    private PublisherInterstitialAd oP;
    private AdListener ob;
    private AppEventListener os;
    private String ou;

    public bi(Context context)
    {
        this(context, ax.bg(), null);
    }

    public bi(Context context, PublisherInterstitialAd publisherinterstitialad)
    {
        this(context, ax.bg(), publisherinterstitialad);
    }

    public bi(Context context, ax ax1, PublisherInterstitialAd publisherinterstitialad)
    {
        oH = new cx();
        mContext = context;
        oI = ax1;
        oP = publisherinterstitialad;
    }

    private void v(String s)
        throws RemoteException
    {
        if (ou == null)
        {
            w(s);
        }
        oJ = au.a(mContext, new ay(), ou, oH);
        if (ob != null)
        {
            oJ.a(new at(ob));
        }
        if (os != null)
        {
            oJ.a(new ba(os));
        }
        if (oM != null)
        {
            oJ.a(new es(oM));
        }
        if (oN != null)
        {
            oJ.a(new ew(oN), oK);
        }
        if (oO != null)
        {
            oJ.a(new bs(oO));
        }
    }

    private void w(String s)
    {
        if (oJ == null)
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
            if (oJ == null)
            {
                v("loadAd");
            }
            if (oJ.a(oI.a(mContext, bg1)))
            {
                oH.d(bg1.bj());
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (bg bg1)
        {
            gr.d("Failed to load ad.", bg1);
        }
    }

    public AdListener getAdListener()
    {
        return ob;
    }

    public String getAdUnitId()
    {
        return ou;
    }

    public AppEventListener getAppEventListener()
    {
        return os;
    }

    public InAppPurchaseListener getInAppPurchaseListener()
    {
        return oM;
    }

    public String getMediationAdapterClassName()
    {
        String s;
        if (oJ == null)
        {
            break MISSING_BLOCK_LABEL_26;
        }
        s = oJ.getMediationAdapterClassName();
        return s;
        RemoteException remoteexception;
        remoteexception;
        gr.d("Failed to get the mediation adapter class name.", remoteexception);
        return null;
    }

    public boolean isLoaded()
    {
        if (oJ == null)
        {
            return false;
        }
        boolean flag;
        try
        {
            flag = oJ.isReady();
        }
        catch (RemoteException remoteexception)
        {
            gr.d("Failed to check if ad is ready.", remoteexception);
            return false;
        }
        return flag;
    }

    public void setAdListener(AdListener adlistener)
    {
        ob = adlistener;
        if (oJ == null) goto _L2; else goto _L1
_L1:
        bd bd1 = oJ;
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
        gr.d("Failed to set the AdListener.", adlistener);
        return;
    }

    public void setAdUnitId(String s)
    {
        if (ou != null)
        {
            throw new IllegalStateException("The ad unit ID can only be set once on InterstitialAd.");
        } else
        {
            ou = s;
            return;
        }
    }

    public void setAppEventListener(AppEventListener appeventlistener)
    {
        os = appeventlistener;
        if (oJ == null) goto _L2; else goto _L1
_L1:
        bd bd1 = oJ;
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
        gr.d("Failed to set the AppEventListener.", appeventlistener);
        return;
    }

    public void setInAppPurchaseListener(InAppPurchaseListener inapppurchaselistener)
    {
        if (oN != null)
        {
            throw new IllegalStateException("Play store purchase parameter has already been set.");
        }
        oM = inapppurchaselistener;
        if (oJ == null) goto _L2; else goto _L1
_L1:
        bd bd1 = oJ;
        if (inapppurchaselistener == null)
        {
            break MISSING_BLOCK_LABEL_55;
        }
        inapppurchaselistener = new es(inapppurchaselistener);
_L3:
        bd1.a(inapppurchaselistener);
_L2:
        return;
        inapppurchaselistener = null;
          goto _L3
        inapppurchaselistener;
        gr.d("Failed to set the InAppPurchaseListener.", inapppurchaselistener);
        return;
    }

    public void setPlayStorePurchaseParams(PlayStorePurchaseListener playstorepurchaselistener, String s)
    {
        oN = playstorepurchaselistener;
        if (oJ == null) goto _L2; else goto _L1
_L1:
        bd bd1 = oJ;
        if (playstorepurchaselistener == null)
        {
            break MISSING_BLOCK_LABEL_39;
        }
        playstorepurchaselistener = new ew(playstorepurchaselistener);
_L3:
        bd1.a(playstorepurchaselistener, s);
_L2:
        return;
        playstorepurchaselistener = null;
          goto _L3
        playstorepurchaselistener;
        gr.d("Failed to set the play store purchase parameter.", playstorepurchaselistener);
        return;
    }

    public void show()
    {
        try
        {
            w("show");
            oJ.showInterstitial();
            return;
        }
        catch (RemoteException remoteexception)
        {
            gr.d("Failed to show interstitial.", remoteexception);
        }
    }
}
