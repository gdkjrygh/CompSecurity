// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.internal.ac;
import com.google.android.gms.internal.av;
import com.google.android.gms.internal.cn;
import com.google.android.gms.internal.t;
import com.google.android.gms.internal.u;
import com.google.android.gms.internal.v;
import com.google.android.gms.internal.x;
import com.google.android.gms.internal.z;

// Referenced classes of package com.google.android.gms.ads:
//            AdRequest, AdListener, a

public final class InterstitialAd
{

    private final av dS = new av();
    private AdListener dT;
    private ac dU;
    private String dV;
    private a dW;
    private final Context mContext;

    public InterstitialAd(Context context)
    {
        mContext = context;
    }

    private void c(String s)
        throws RemoteException
    {
        if (dV == null)
        {
            d(s);
        }
        dU = u.a(mContext, new x(), dV, dS);
        if (dT != null)
        {
            dU.a(new t(dT));
        }
        if (dW != null)
        {
            dU.a(new z(dW));
        }
    }

    private void d(String s)
    {
        if (dU == null)
        {
            throw new IllegalStateException((new StringBuilder()).append("The ad unit ID must be set on InterstitialAd before ").append(s).append(" is called.").toString());
        } else
        {
            return;
        }
    }

    public AdListener getAdListener()
    {
        return dT;
    }

    public String getAdUnitId()
    {
        return dV;
    }

    public boolean isLoaded()
    {
        if (dU == null)
        {
            return false;
        }
        boolean flag;
        try
        {
            flag = dU.isReady();
        }
        catch (RemoteException remoteexception)
        {
            cn.b("Failed to check if ad is ready.", remoteexception);
            return false;
        }
        return flag;
    }

    public void loadAd(AdRequest adrequest)
    {
        try
        {
            if (dU == null)
            {
                c("loadAd");
            }
            if (dU.a(new v(mContext, adrequest)))
            {
                dS.c(adrequest.v());
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (AdRequest adrequest)
        {
            cn.b("Failed to load ad.", adrequest);
        }
    }

    public void setAdListener(AdListener adlistener)
    {
        dT = adlistener;
        if (dU == null) goto _L2; else goto _L1
_L1:
        ac ac1 = dU;
        if (adlistener == null)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        adlistener = new t(adlistener);
_L3:
        ac1.a(adlistener);
_L2:
        return;
        adlistener = null;
          goto _L3
        adlistener;
        cn.b("Failed to set the AdListener.", adlistener);
        return;
    }

    public void setAdUnitId(String s)
    {
        if (dV != null)
        {
            throw new IllegalStateException("The ad unit ID can only be set once on InterstitialAd.");
        } else
        {
            dV = s;
            return;
        }
    }

    public void show()
    {
        try
        {
            d("show");
            dU.showInterstitial();
            return;
        }
        catch (RemoteException remoteexception)
        {
            cn.b("Failed to show interstitial.", remoteexception);
        }
    }
}
