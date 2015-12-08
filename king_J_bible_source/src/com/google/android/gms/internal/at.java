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
import com.google.android.gms.dynamic.e;

// Referenced classes of package com.google.android.gms.internal:
//            aj, bp, an, ak, 
//            dv, ap, dw, ag, 
//            af, am, cp, as

public final class at
{

    private AdListener lF;
    private AppEventListener lV;
    private AdSize lW[];
    private String lX;
    private final bp ml;
    private final aj mm;
    private ap mn;
    private ViewGroup mo;
    private InAppPurchaseListener mp;

    public at(ViewGroup viewgroup)
    {
        this(viewgroup, null, false, aj.az());
    }

    public at(ViewGroup viewgroup, AttributeSet attributeset, boolean flag)
    {
        this(viewgroup, attributeset, flag, aj.az());
    }

    at(ViewGroup viewgroup, AttributeSet attributeset, boolean flag, aj aj1)
    {
        ml = new bp();
        mo = viewgroup;
        mm = aj1;
        if (attributeset != null)
        {
            aj1 = viewgroup.getContext();
            try
            {
                attributeset = new an(aj1, attributeset);
                lW = attributeset.e(flag);
                lX = attributeset.getAdUnitId();
            }
            // Misplaced declaration of an exception variable
            catch (AttributeSet attributeset)
            {
                dv.a(viewgroup, new ak(aj1, AdSize.BANNER), attributeset.getMessage(), attributeset.getMessage());
                return;
            }
            if (viewgroup.isInEditMode())
            {
                dv.a(viewgroup, new ak(aj1, lW[0]), "Ads by Google");
            }
        }
    }

    private void aF()
    {
        com.google.android.gms.dynamic.d d = mn.Q();
        if (d == null)
        {
            return;
        }
        try
        {
            mo.addView((View)e.d(d));
            return;
        }
        catch (RemoteException remoteexception)
        {
            dw.c("Failed to get an ad frame.", remoteexception);
        }
        return;
    }

    private void aG()
        throws RemoteException
    {
        if ((lW == null || lX == null) && mn == null)
        {
            throw new IllegalStateException("The ad size and ad unit ID must be set before loadAd is called.");
        }
        android.content.Context context = mo.getContext();
        mn = ag.a(context, new ak(context, lW), lX, ml);
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
        aF();
    }

    public void a(as as1)
    {
        try
        {
            if (mn == null)
            {
                aG();
            }
            if (mn.a(mm.a(mo.getContext(), as1)))
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

    public transient void a(AdSize aadsize[])
    {
        lW = aadsize;
        try
        {
            if (mn != null)
            {
                mn.a(new ak(mo.getContext(), lW));
            }
        }
        // Misplaced declaration of an exception variable
        catch (AdSize aadsize[])
        {
            dw.c("Failed to set the ad size.", aadsize);
        }
        mo.requestLayout();
    }

    public void destroy()
    {
        try
        {
            if (mn != null)
            {
                mn.destroy();
            }
            return;
        }
        catch (RemoteException remoteexception)
        {
            dw.c("Failed to destroy AdView.", remoteexception);
        }
    }

    public AdListener getAdListener()
    {
        return lF;
    }

    public AdSize getAdSize()
    {
        AdSize adsize;
        if (mn == null)
        {
            break MISSING_BLOCK_LABEL_29;
        }
        adsize = mn.R().aA();
        return adsize;
        RemoteException remoteexception;
        remoteexception;
        dw.c("Failed to get the current AdSize.", remoteexception);
        if (lW != null)
        {
            return lW[0];
        } else
        {
            return null;
        }
    }

    public AdSize[] getAdSizes()
    {
        return lW;
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

    public void pause()
    {
        try
        {
            if (mn != null)
            {
                mn.pause();
            }
            return;
        }
        catch (RemoteException remoteexception)
        {
            dw.c("Failed to call pause.", remoteexception);
        }
    }

    public void recordManualImpression()
    {
        try
        {
            mn.ac();
            return;
        }
        catch (RemoteException remoteexception)
        {
            dw.c("Failed to record impression.", remoteexception);
        }
    }

    public void resume()
    {
        try
        {
            if (mn != null)
            {
                mn.resume();
            }
            return;
        }
        catch (RemoteException remoteexception)
        {
            dw.c("Failed to call resume.", remoteexception);
        }
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

    public transient void setAdSizes(AdSize aadsize[])
    {
        if (lW != null)
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
        if (lX != null)
        {
            throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
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
}
