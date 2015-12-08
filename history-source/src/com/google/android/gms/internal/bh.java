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
import com.google.android.gms.ads.doubleclick.b;
import com.google.android.gms.ads.purchase.InAppPurchaseListener;
import com.google.android.gms.ads.purchase.PlayStorePurchaseListener;
import com.google.android.gms.dynamic.e;

// Referenced classes of package com.google.android.gms.internal:
//            ax, cx, bb, ay, 
//            gq, bd, gr, au, 
//            at, ba, es, ew, 
//            bs, bg

public final class bh
{

    private final cx oH;
    private final ax oI;
    private bd oJ;
    private String oK;
    private ViewGroup oL;
    private InAppPurchaseListener oM;
    private PlayStorePurchaseListener oN;
    private b oO;
    private AdListener ob;
    private AppEventListener os;
    private AdSize ot[];
    private String ou;

    public bh(ViewGroup viewgroup)
    {
        this(viewgroup, null, false, ax.bg());
    }

    public bh(ViewGroup viewgroup, AttributeSet attributeset, boolean flag)
    {
        this(viewgroup, attributeset, flag, ax.bg());
    }

    bh(ViewGroup viewgroup, AttributeSet attributeset, boolean flag, ax ax1)
    {
        this(viewgroup, attributeset, flag, ax1, null);
    }

    bh(ViewGroup viewgroup, AttributeSet attributeset, boolean flag, ax ax1, bd bd1)
    {
        oH = new cx();
        oL = viewgroup;
        oI = ax1;
        if (attributeset != null)
        {
            ax1 = viewgroup.getContext();
            try
            {
                attributeset = new bb(ax1, attributeset);
                ot = attributeset.h(flag);
                ou = attributeset.getAdUnitId();
            }
            // Misplaced declaration of an exception variable
            catch (AttributeSet attributeset)
            {
                gq.a(viewgroup, new ay(ax1, AdSize.BANNER), attributeset.getMessage(), attributeset.getMessage());
                return;
            }
            if (viewgroup.isInEditMode())
            {
                gq.a(viewgroup, new ay(ax1, ot[0]), "Ads by Google");
                return;
            }
        }
        oJ = bd1;
    }

    private void bm()
    {
        com.google.android.gms.dynamic.d d = oJ.ab();
        if (d == null)
        {
            return;
        }
        try
        {
            oL.addView((View)e.f(d));
            return;
        }
        catch (RemoteException remoteexception)
        {
            gr.d("Failed to get an ad frame.", remoteexception);
        }
        return;
    }

    private void bn()
        throws RemoteException
    {
        if ((ot == null || ou == null) && oJ == null)
        {
            throw new IllegalStateException("The ad size and ad unit ID must be set before loadAd is called.");
        }
        android.content.Context context = oL.getContext();
        oJ = au.a(context, new ay(context, ot), ou, oH);
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
        bm();
    }

    public void a(bg bg1)
    {
        try
        {
            if (oJ == null)
            {
                bn();
            }
            if (oJ.a(oI.a(oL.getContext(), bg1)))
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

    public transient void a(AdSize aadsize[])
    {
        ot = aadsize;
        try
        {
            if (oJ != null)
            {
                oJ.a(new ay(oL.getContext(), ot));
            }
        }
        // Misplaced declaration of an exception variable
        catch (AdSize aadsize[])
        {
            gr.d("Failed to set the ad size.", aadsize);
        }
        oL.requestLayout();
    }

    public void destroy()
    {
        try
        {
            if (oJ != null)
            {
                oJ.destroy();
            }
            return;
        }
        catch (RemoteException remoteexception)
        {
            gr.d("Failed to destroy AdView.", remoteexception);
        }
    }

    public AdListener getAdListener()
    {
        return ob;
    }

    public AdSize getAdSize()
    {
        AdSize adsize;
        if (oJ == null)
        {
            break MISSING_BLOCK_LABEL_30;
        }
        adsize = oJ.ac().bh();
        return adsize;
        RemoteException remoteexception;
        remoteexception;
        gr.d("Failed to get the current AdSize.", remoteexception);
        if (ot != null)
        {
            return ot[0];
        } else
        {
            return null;
        }
    }

    public AdSize[] getAdSizes()
    {
        return ot;
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
            break MISSING_BLOCK_LABEL_27;
        }
        s = oJ.getMediationAdapterClassName();
        return s;
        RemoteException remoteexception;
        remoteexception;
        gr.d("Failed to get the mediation adapter class name.", remoteexception);
        return null;
    }

    public void pause()
    {
        try
        {
            if (oJ != null)
            {
                oJ.pause();
            }
            return;
        }
        catch (RemoteException remoteexception)
        {
            gr.d("Failed to call pause.", remoteexception);
        }
    }

    public void recordManualImpression()
    {
        try
        {
            if (oJ != null)
            {
                oJ.an();
            }
            return;
        }
        catch (RemoteException remoteexception)
        {
            gr.d("Failed to record impression.", remoteexception);
        }
    }

    public void resume()
    {
        try
        {
            if (oJ != null)
            {
                oJ.resume();
            }
            return;
        }
        catch (RemoteException remoteexception)
        {
            gr.d("Failed to call resume.", remoteexception);
        }
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

    public transient void setAdSizes(AdSize aadsize[])
    {
        if (ot != null)
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
        if (ou != null)
        {
            throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
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
            break MISSING_BLOCK_LABEL_56;
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
        if (oM != null)
        {
            throw new IllegalStateException("InAppPurchaseListener has already been set.");
        }
        oN = playstorepurchaselistener;
        oK = s;
        if (oJ == null) goto _L2; else goto _L1
_L1:
        bd bd1 = oJ;
        if (playstorepurchaselistener == null)
        {
            break MISSING_BLOCK_LABEL_62;
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
}
