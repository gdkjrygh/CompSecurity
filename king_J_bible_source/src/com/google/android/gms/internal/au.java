// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.ads.purchase.InAppPurchaseListener;

// Referenced classes of package com.google.android.gms.internal:
//            aj, bp, ak, ag, 
//            af, ap, am, cp, 
//            as, dw

public final class au
{

    private AdListener lF;
    private AppEventListener lV;
    private String lX;
    private final Context mContext;
    private final bp ml;
    private final aj mm;
    private ap mn;
    private InAppPurchaseListener mp;

    public au(Context context)
    {
        this(context, aj.az());
    }

    public au(Context context, aj aj1)
    {
        ml = new bp();
        mContext = context;
        mm = aj1;
    }

    private void k(String s)
        throws RemoteException
    {
        if (lX == null)
        {
            l(s);
        }
        mn = ag.a(mContext, new ak(), lX, ml);
        if (lF != null)
        {
            mn.a(new af(lF));
        }
        if (lV != null)
        {
            mn.a(new am(lV));
        }
        if (mp != null)
        {
            mn.a(new cp(mp));
        }
    }

    private void l(String s)
    {
        if (mn == null)
        {
            throw new IllegalStateException((new StringBuilder()).append("The ad unit ID must be set on InterstitialAd before ").append(s).append(" is called.").toString());
        } else
        {
            return;
        }
    }

    public void a(as as1)
    {
        try
        {
            if (mn == null)
            {
                k("loadAd");
            }
            if (mn.a(mm.a(mContext, as1)))
            {
                ml.c(as1.aC());
                ml.d(as1.aD());
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (as as1)
        {
            dw.c("Failed to load ad.", as1);
        }
    }

    public AdListener getAdListener()
    {
        return lF;
    }

    public String getAdUnitId()
    {
        return lX;
    }

    public AppEventListener getAppEventListener()
    {
        return lV;
    }

    public InAppPurchaseListener getInAppPurchaseListener()
    {
        return mp;
    }

    public boolean isLoaded()
    {
        if (mn == null)
        {
            return false;
        }
        boolean flag;
        try
        {
            flag = mn.isReady();
        }
        catch (RemoteException remoteexception)
        {
            dw.c("Failed to check if ad is ready.", remoteexception);
            return false;
        }
        return flag;
    }

    public void setAdListener(AdListener adlistener)
    {
        lF = adlistener;
        if (mn == null) goto _L2; else goto _L1
_L1:
        ap ap1 = mn;
        if (adlistener == null)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        adlistener = new af(adlistener);
_L3:
        ap1.a(adlistener);
_L2:
        return;
        adlistener = null;
          goto _L3
        adlistener;
        dw.c("Failed to set the AdListener.", adlistener);
        return;
    }

    public void setAdUnitId(String s)
    {
        if (lX != null)
        {
            throw new IllegalStateException("The ad unit ID can only be set once on InterstitialAd.");
        } else
        {
            lX = s;
            return;
        }
    }

    public void setAppEventListener(AppEventListener appeventlistener)
    {
        lV = appeventlistener;
        if (mn == null) goto _L2; else goto _L1
_L1:
        ap ap1 = mn;
        if (appeventlistener == null)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        appeventlistener = new am(appeventlistener);
_L3:
        ap1.a(appeventlistener);
_L2:
        return;
        appeventlistener = null;
          goto _L3
        appeventlistener;
        dw.c("Failed to set the AppEventListener.", appeventlistener);
        return;
    }

    public void setInAppPurchaseListener(InAppPurchaseListener inapppurchaselistener)
    {
        mp = inapppurchaselistener;
        if (mn == null) goto _L2; else goto _L1
_L1:
        ap ap1 = mn;
        if (inapppurchaselistener == null)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        inapppurchaselistener = new cp(inapppurchaselistener);
_L3:
        ap1.a(inapppurchaselistener);
_L2:
        return;
        inapppurchaselistener = null;
          goto _L3
        inapppurchaselistener;
        dw.c("Failed to set the InAppPurchaseListener.", inapppurchaselistener);
        return;
    }

    public void show()
    {
        try
        {
            l("show");
            mn.showInterstitial();
            return;
        }
        catch (RemoteException remoteexception)
        {
            dw.c("Failed to show interstitial.", remoteexception);
        }
    }
}
