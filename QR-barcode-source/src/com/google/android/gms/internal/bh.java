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
import com.google.android.gms.ads.doubleclick.PublisherAdView;
import com.google.android.gms.ads.doubleclick.b;
import com.google.android.gms.ads.purchase.InAppPurchaseListener;
import com.google.android.gms.ads.purchase.PlayStorePurchaseListener;
import com.google.android.gms.dynamic.e;

// Referenced classes of package com.google.android.gms.internal:
//            ax, cs, bb, ay, 
//            gr, bd, gs, au, 
//            at, ba, em, eq, 
//            ew, bg

public final class bh
{

    private AdListener nR;
    private String oA;
    private ViewGroup oB;
    private InAppPurchaseListener oC;
    private PlayStorePurchaseListener oD;
    private b oE;
    private AppEventListener oi;
    private AdSize oj[];
    private String ok;
    private final cs ox;
    private final ax oy;
    private bd oz;

    public bh(ViewGroup viewgroup)
    {
        this(viewgroup, null, false, ax.bb());
    }

    public bh(ViewGroup viewgroup, AttributeSet attributeset, boolean flag)
    {
        this(viewgroup, attributeset, flag, ax.bb());
    }

    bh(ViewGroup viewgroup, AttributeSet attributeset, boolean flag, ax ax1)
    {
        this(viewgroup, attributeset, flag, ax1, null);
    }

    bh(ViewGroup viewgroup, AttributeSet attributeset, boolean flag, ax ax1, bd bd1)
    {
        ox = new cs();
        oB = viewgroup;
        oy = ax1;
        if (attributeset != null)
        {
            ax1 = viewgroup.getContext();
            try
            {
                attributeset = new bb(ax1, attributeset);
                oj = attributeset.f(flag);
                ok = attributeset.getAdUnitId();
            }
            // Misplaced declaration of an exception variable
            catch (AttributeSet attributeset)
            {
                gr.a(viewgroup, new ay(ax1, AdSize.BANNER), attributeset.getMessage(), attributeset.getMessage());
                return;
            }
            if (viewgroup.isInEditMode())
            {
                gr.a(viewgroup, new ay(ax1, oj[0]), "Ads by Google");
                return;
            }
        }
        oz = bd1;
    }

    private void bh()
    {
        com.google.android.gms.dynamic.d d = oz.X();
        if (d == null)
        {
            return;
        }
        try
        {
            oB.addView((View)e.f(d));
            return;
        }
        catch (RemoteException remoteexception)
        {
            gs.d("Failed to get an ad frame.", remoteexception);
        }
        return;
    }

    private void bi()
        throws RemoteException
    {
        if ((oj == null || ok == null) && oz == null)
        {
            throw new IllegalStateException("The ad size and ad unit ID must be set before loadAd is called.");
        }
        android.content.Context context = oB.getContext();
        oz = au.a(context, new ay(context, oj), ok, ox);
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
        if (oE != null)
        {
            oz.a(new ew(oE, (PublisherAdView)oB));
        }
        bh();
    }

    public void a(bg bg1)
    {
        try
        {
            if (oz == null)
            {
                bi();
            }
            if (oz.a(oy.a(oB.getContext(), bg1)))
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

    public transient void a(AdSize aadsize[])
    {
        oj = aadsize;
        try
        {
            if (oz != null)
            {
                oz.a(new ay(oB.getContext(), oj));
            }
        }
        // Misplaced declaration of an exception variable
        catch (AdSize aadsize[])
        {
            gs.d("Failed to set the ad size.", aadsize);
        }
        oB.requestLayout();
    }

    public void destroy()
    {
        try
        {
            if (oz != null)
            {
                oz.destroy();
            }
            return;
        }
        catch (RemoteException remoteexception)
        {
            gs.d("Failed to destroy AdView.", remoteexception);
        }
    }

    public AdListener getAdListener()
    {
        return nR;
    }

    public AdSize getAdSize()
    {
        AdSize adsize;
        if (oz == null)
        {
            break MISSING_BLOCK_LABEL_30;
        }
        adsize = oz.Y().bc();
        return adsize;
        RemoteException remoteexception;
        remoteexception;
        gs.d("Failed to get the current AdSize.", remoteexception);
        if (oj != null)
        {
            return oj[0];
        } else
        {
            return null;
        }
    }

    public AdSize[] getAdSizes()
    {
        return oj;
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
            break MISSING_BLOCK_LABEL_27;
        }
        s = oz.getMediationAdapterClassName();
        return s;
        RemoteException remoteexception;
        remoteexception;
        gs.d("Failed to get the mediation adapter class name.", remoteexception);
        return null;
    }

    public void pause()
    {
        try
        {
            if (oz != null)
            {
                oz.pause();
            }
            return;
        }
        catch (RemoteException remoteexception)
        {
            gs.d("Failed to call pause.", remoteexception);
        }
    }

    public void recordManualImpression()
    {
        try
        {
            if (oz != null)
            {
                oz.aj();
            }
            return;
        }
        catch (RemoteException remoteexception)
        {
            gs.d("Failed to record impression.", remoteexception);
        }
    }

    public void resume()
    {
        try
        {
            if (oz != null)
            {
                oz.resume();
            }
            return;
        }
        catch (RemoteException remoteexception)
        {
            gs.d("Failed to call resume.", remoteexception);
        }
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

    public transient void setAdSizes(AdSize aadsize[])
    {
        if (oj != null)
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
        if (ok != null)
        {
            throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
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
            break MISSING_BLOCK_LABEL_56;
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
        if (oC != null)
        {
            throw new IllegalStateException("InAppPurchaseListener has already been set.");
        }
        oD = playstorepurchaselistener;
        oA = s;
        if (oz == null) goto _L2; else goto _L1
_L1:
        bd bd1 = oz;
        if (playstorepurchaselistener == null)
        {
            break MISSING_BLOCK_LABEL_62;
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
}
