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
//            al, bt, ap, am, 
//            eu, ar, ev, ai, 
//            ah, ao, di, dm, 
//            au

public final class av
{

    private AdListener lO;
    private PlayStorePurchaseListener mA;
    private AppEventListener mf;
    private AdSize mg[];
    private String mh;
    private final bt mu;
    private final al mv;
    private ar mw;
    private String mx;
    private ViewGroup my;
    private InAppPurchaseListener mz;

    public av(ViewGroup viewgroup)
    {
        this(viewgroup, null, false, al.aA());
    }

    public av(ViewGroup viewgroup, AttributeSet attributeset, boolean flag)
    {
        this(viewgroup, attributeset, flag, al.aA());
    }

    av(ViewGroup viewgroup, AttributeSet attributeset, boolean flag, al al1)
    {
        mu = new bt();
        my = viewgroup;
        mv = al1;
        if (attributeset != null)
        {
            al1 = viewgroup.getContext();
            try
            {
                attributeset = new ap(al1, attributeset);
                mg = attributeset.f(flag);
                mh = attributeset.getAdUnitId();
            }
            // Misplaced declaration of an exception variable
            catch (AttributeSet attributeset)
            {
                eu.a(viewgroup, new am(al1, AdSize.BANNER), attributeset.getMessage(), attributeset.getMessage());
                return;
            }
            if (viewgroup.isInEditMode())
            {
                eu.a(viewgroup, new am(al1, mg[0]), "Ads by Google");
            }
        }
    }

    private void aG()
    {
        com.google.android.gms.dynamic.d d = mw.P();
        if (d == null)
        {
            return;
        }
        try
        {
            my.addView((View)e.e(d));
            return;
        }
        catch (RemoteException remoteexception)
        {
            ev.c("Failed to get an ad frame.", remoteexception);
        }
        return;
    }

    private void aH()
        throws RemoteException
    {
        if ((mg == null || mh == null) && mw == null)
        {
            throw new IllegalStateException("The ad size and ad unit ID must be set before loadAd is called.");
        }
        android.content.Context context = my.getContext();
        mw = ai.a(context, new am(context, mg), mh, mu);
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
        aG();
    }

    public void a(au au1)
    {
        try
        {
            if (mw == null)
            {
                aH();
            }
            if (mw.a(mv.a(my.getContext(), au1)))
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

    public transient void a(AdSize aadsize[])
    {
        mg = aadsize;
        try
        {
            if (mw != null)
            {
                mw.a(new am(my.getContext(), mg));
            }
        }
        // Misplaced declaration of an exception variable
        catch (AdSize aadsize[])
        {
            ev.c("Failed to set the ad size.", aadsize);
        }
        my.requestLayout();
    }

    public void destroy()
    {
        try
        {
            if (mw != null)
            {
                mw.destroy();
            }
            return;
        }
        catch (RemoteException remoteexception)
        {
            ev.c("Failed to destroy AdView.", remoteexception);
        }
    }

    public AdListener getAdListener()
    {
        return lO;
    }

    public AdSize getAdSize()
    {
        AdSize adsize;
        if (mw == null)
        {
            break MISSING_BLOCK_LABEL_29;
        }
        adsize = mw.Q().aB();
        return adsize;
        RemoteException remoteexception;
        remoteexception;
        ev.c("Failed to get the current AdSize.", remoteexception);
        if (mg != null)
        {
            return mg[0];
        } else
        {
            return null;
        }
    }

    public AdSize[] getAdSizes()
    {
        return mg;
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

    public void pause()
    {
        try
        {
            if (mw != null)
            {
                mw.pause();
            }
            return;
        }
        catch (RemoteException remoteexception)
        {
            ev.c("Failed to call pause.", remoteexception);
        }
    }

    public void recordManualImpression()
    {
        try
        {
            mw.ab();
            return;
        }
        catch (RemoteException remoteexception)
        {
            ev.c("Failed to record impression.", remoteexception);
        }
    }

    public void resume()
    {
        try
        {
            if (mw != null)
            {
                mw.resume();
            }
            return;
        }
        catch (RemoteException remoteexception)
        {
            ev.c("Failed to call resume.", remoteexception);
        }
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

    public transient void setAdSizes(AdSize aadsize[])
    {
        if (mg != null)
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
        if (mh != null)
        {
            throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
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
            break MISSING_BLOCK_LABEL_56;
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
        if (mz != null)
        {
            throw new IllegalStateException("InAppPurchaseListener has already been set.");
        }
        mA = playstorepurchaselistener;
        mx = s;
        if (mw == null) goto _L2; else goto _L1
_L1:
        ar ar1 = mw;
        if (playstorepurchaselistener == null)
        {
            break MISSING_BLOCK_LABEL_62;
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
}
