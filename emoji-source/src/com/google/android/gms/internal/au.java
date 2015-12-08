// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.ads.purchase.InAppPurchaseListener;
import com.google.android.gms.ads.purchase.PlayStorePurchaseListener;
import com.google.android.gms.dynamic.e;

// Referenced classes of package com.google.android.gms.internal:
//            ak, bs, ao, al, 
//            et, aq, eu, ah, 
//            ag, an, dh, dl, 
//            at

public final class au
{

    private AdListener lQ;
    private ViewGroup mA;
    private InAppPurchaseListener mB;
    private PlayStorePurchaseListener mC;
    private AppEventListener mh;
    private AdSize mi[];
    private String mj;
    private final bs mw;
    private final ak mx;
    private aq my;
    private String mz;

    public au(ViewGroup viewgroup)
    {
        this(viewgroup, null, false, ak.aF());
    }

    public au(ViewGroup viewgroup, AttributeSet attributeset, boolean flag)
    {
        this(viewgroup, attributeset, flag, ak.aF());
    }

    au(ViewGroup viewgroup, AttributeSet attributeset, boolean flag, ak ak1)
    {
        mw = new bs();
        mA = viewgroup;
        mx = ak1;
        if (attributeset != null)
        {
            ak1 = viewgroup.getContext();
            try
            {
                attributeset = new ao(ak1, attributeset);
                mi = attributeset.f(flag);
                mj = attributeset.getAdUnitId();
            }
            // Misplaced declaration of an exception variable
            catch (AttributeSet attributeset)
            {
                et.a(viewgroup, new al(ak1, AdSize.BANNER), attributeset.getMessage(), attributeset.getMessage());
                return;
            }
            if (viewgroup.isInEditMode())
            {
                et.a(viewgroup, new al(ak1, mi[0]), "Ads by Google");
            }
        }
    }

    private void aL()
    {
        com.google.android.gms.dynamic.d d = my.U();
        if (d == null)
        {
            return;
        }
        try
        {
            mA.addView((View)e.e(d));
            return;
        }
        catch (RemoteException remoteexception)
        {
            eu.c("Failed to get an ad frame.", remoteexception);
        }
        return;
    }

    private void aM()
        throws RemoteException
    {
        if ((mi == null || mj == null) && my == null)
        {
            throw new IllegalStateException("The ad size and ad unit ID must be set before loadAd is called.");
        }
        android.content.Context context = mA.getContext();
        my = ah.a(context, new al(context, mi), mj, mw);
        if (lQ != null)
        {
            my.a(new ag(lQ));
        }
        if (mh != null)
        {
            my.a(new an(mh));
        }
        if (mB != null)
        {
            my.a(new dh(mB));
        }
        if (mC != null)
        {
            my.a(new dl(mC), mz);
        }
        aL();
    }

    public void a(at at1)
    {
        try
        {
            if (my == null)
            {
                aM();
            }
            if (my.a(mx.a(mA.getContext(), at1)))
            {
                mw.c(at1.aI());
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (at at1)
        {
            eu.c("Failed to load ad.", at1);
        }
    }

    public transient void a(AdSize aadsize[])
    {
        mi = aadsize;
        try
        {
            if (my != null)
            {
                my.a(new al(mA.getContext(), mi));
            }
        }
        // Misplaced declaration of an exception variable
        catch (AdSize aadsize[])
        {
            eu.c("Failed to set the ad size.", aadsize);
        }
        mA.requestLayout();
    }

    public void destroy()
    {
        try
        {
            if (my != null)
            {
                my.destroy();
            }
            return;
        }
        catch (RemoteException remoteexception)
        {
            eu.c("Failed to destroy AdView.", remoteexception);
        }
    }

    public AdListener getAdListener()
    {
        return lQ;
    }

    public AdSize getAdSize()
    {
        AdSize adsize;
        if (my == null)
        {
            break MISSING_BLOCK_LABEL_29;
        }
        adsize = my.V().aG();
        return adsize;
        RemoteException remoteexception;
        remoteexception;
        eu.c("Failed to get the current AdSize.", remoteexception);
        if (mi != null)
        {
            return mi[0];
        } else
        {
            return null;
        }
    }

    public AdSize[] getAdSizes()
    {
        return mi;
    }

    public String getAdUnitId()
    {
        return mj;
    }

    public AppEventListener getAppEventListener()
    {
        return mh;
    }

    public InAppPurchaseListener getInAppPurchaseListener()
    {
        return mB;
    }

    public void pause()
    {
        try
        {
            if (my != null)
            {
                my.pause();
            }
            return;
        }
        catch (RemoteException remoteexception)
        {
            eu.c("Failed to call pause.", remoteexception);
        }
    }

    public void recordManualImpression()
    {
        try
        {
            my.ag();
            return;
        }
        catch (RemoteException remoteexception)
        {
            eu.c("Failed to record impression.", remoteexception);
        }
    }

    public void resume()
    {
        try
        {
            if (my != null)
            {
                my.resume();
            }
            return;
        }
        catch (RemoteException remoteexception)
        {
            eu.c("Failed to call resume.", remoteexception);
        }
    }

    public void setAdListener(AdListener adlistener)
    {
        lQ = adlistener;
        if (my == null) goto _L2; else goto _L1
_L1:
        aq aq1 = my;
        if (adlistener == null)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        adlistener = new ag(adlistener);
_L3:
        aq1.a(adlistener);
_L2:
        return;
        adlistener = null;
          goto _L3
        adlistener;
        eu.c("Failed to set the AdListener.", adlistener);
        return;
    }

    public transient void setAdSizes(AdSize aadsize[])
    {
        if (mi != null)
        {
            throw new IllegalStateException("The ad size can only be set once on AdView.");
        } else
        {
            a(aadsize);
            return;
        }
    }

    public void setAdUnitId(String s)
    {
        if (mj != null)
        {
            throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
        } else
        {
            mj = s;
            return;
        }
    }

    public void setAppEventListener(AppEventListener appeventlistener)
    {
        mh = appeventlistener;
        if (my == null) goto _L2; else goto _L1
_L1:
        aq aq1 = my;
        if (appeventlistener == null)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        appeventlistener = new an(appeventlistener);
_L3:
        aq1.a(appeventlistener);
_L2:
        return;
        appeventlistener = null;
          goto _L3
        appeventlistener;
        eu.c("Failed to set the AppEventListener.", appeventlistener);
        return;
    }

    public void setInAppPurchaseListener(InAppPurchaseListener inapppurchaselistener)
    {
        if (mC != null)
        {
            throw new IllegalStateException("Play store purchase parameter has already been set.");
        }
        mB = inapppurchaselistener;
        if (my == null) goto _L2; else goto _L1
_L1:
        aq aq1 = my;
        if (inapppurchaselistener == null)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        inapppurchaselistener = new dh(inapppurchaselistener);
_L3:
        aq1.a(inapppurchaselistener);
_L2:
        return;
        inapppurchaselistener = null;
          goto _L3
        inapppurchaselistener;
        eu.c("Failed to set the InAppPurchaseListener.", inapppurchaselistener);
        return;
    }

    public void setPlayStorePurchaseParams(PlayStorePurchaseListener playstorepurchaselistener, String s)
    {
        if (mB != null)
        {
            throw new IllegalStateException("InAppPurchaseListener has already been set.");
        }
        mC = playstorepurchaselistener;
        mz = s;
        if (my == null) goto _L2; else goto _L1
_L1:
        aq aq1 = my;
        if (playstorepurchaselistener == null)
        {
            break MISSING_BLOCK_LABEL_62;
        }
        playstorepurchaselistener = new dl(playstorepurchaselistener);
_L3:
        aq1.a(playstorepurchaselistener, s);
_L2:
        return;
        playstorepurchaselistener = null;
          goto _L3
        playstorepurchaselistener;
        eu.c("Failed to set the play store purchase parameter.", playstorepurchaselistener);
        return;
    }
}
