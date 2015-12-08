// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.dynamic.c;
import com.google.android.gms.internal.aa;
import com.google.android.gms.internal.ac;
import com.google.android.gms.internal.av;
import com.google.android.gms.internal.cm;
import com.google.android.gms.internal.cn;
import com.google.android.gms.internal.t;
import com.google.android.gms.internal.u;
import com.google.android.gms.internal.v;
import com.google.android.gms.internal.x;
import com.google.android.gms.internal.z;

// Referenced classes of package com.google.android.gms.ads:
//            AdSize, AdRequest, AdListener, a

public final class AdView extends ViewGroup
{

    private AdSize c;
    private final av dS;
    private AdListener dT;
    private ac dU;
    private String dV;
    private a dW;

    public AdView(Context context)
    {
        super(context);
        dS = new av();
    }

    public AdView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public AdView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        dS = new av();
        try
        {
            attributeset = new aa(context, attributeset);
            c = attributeset.getAdSize();
            dV = attributeset.getAdUnitId();
        }
        // Misplaced declaration of an exception variable
        catch (AttributeSet attributeset)
        {
            cm.a(this, new x(context, AdSize.BANNER), attributeset.getMessage());
            return;
        }
        if (isInEditMode())
        {
            cm.b(this, new x(context, c), "Ads by Google");
        }
    }

    private void c(String s)
        throws RemoteException
    {
        if (c == null || dV == null)
        {
            d(s);
        }
        s = getContext();
        dU = u.a(s, new x(s, c), dV, dS);
        if (dT != null)
        {
            dU.a(new t(dT));
        }
        if (dW != null)
        {
            dU.a(new z(dW));
        }
        x();
    }

    private void d(String s)
    {
        if (dU == null)
        {
            throw new IllegalStateException((new StringBuilder()).append("The ad size and ad unit ID must be set on AdView before ").append(s).append(" is called.").toString());
        } else
        {
            return;
        }
    }

    private void x()
    {
        com.google.android.gms.dynamic.b b = dU.z();
        if (b == null)
        {
            return;
        }
        try
        {
            addView((View)com.google.android.gms.dynamic.c.b(b));
            return;
        }
        catch (RemoteException remoteexception)
        {
            cn.b("Failed to get an ad frame.", remoteexception);
        }
        return;
    }

    public void destroy()
    {
        try
        {
            if (dU != null)
            {
                dU.destroy();
            }
            return;
        }
        catch (RemoteException remoteexception)
        {
            cn.b("Failed to destroy AdView.", remoteexception);
        }
    }

    public AdListener getAdListener()
    {
        return dT;
    }

    public AdSize getAdSize()
    {
        return c;
    }

    public String getAdUnitId()
    {
        return dV;
    }

    public void loadAd(AdRequest adrequest)
    {
        try
        {
            if (dU == null)
            {
                c("loadAd");
            }
            if (dU.a(new v(getContext(), adrequest)))
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

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        View view = getChildAt(0);
        if (view != null && view.getVisibility() != 8)
        {
            int i1 = view.getMeasuredWidth();
            int j1 = view.getMeasuredHeight();
            i = (k - i - i1) / 2;
            j = (l - j - j1) / 2;
            view.layout(i, j, i1 + i, j1 + j);
        }
    }

    protected void onMeasure(int i, int j)
    {
        int k = 0;
        View view = getChildAt(0);
        int l;
        if (view != null && view.getVisibility() != 8)
        {
            measureChild(view, i, j);
            l = view.getMeasuredWidth();
            k = view.getMeasuredHeight();
        } else
        if (c != null)
        {
            Context context = getContext();
            l = c.getWidthInPixels(context);
            k = c.getHeightInPixels(context);
        } else
        {
            l = 0;
        }
        l = Math.max(l, getSuggestedMinimumWidth());
        k = Math.max(k, getSuggestedMinimumHeight());
        setMeasuredDimension(resolveSize(l, i), resolveSize(k, j));
    }

    public void pause()
    {
        try
        {
            if (dU != null)
            {
                dU.pause();
            }
            return;
        }
        catch (RemoteException remoteexception)
        {
            cn.b("Failed to call pause.", remoteexception);
        }
    }

    public void resume()
    {
        try
        {
            if (dU != null)
            {
                dU.resume();
            }
            return;
        }
        catch (RemoteException remoteexception)
        {
            cn.b("Failed to call resume.", remoteexception);
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

    public void setAdSize(AdSize adsize)
    {
        if (c != null)
        {
            throw new IllegalStateException("The ad size can only be set once on AdView.");
        } else
        {
            c = adsize;
            requestLayout();
            return;
        }
    }

    public void setAdUnitId(String s)
    {
        if (dV != null)
        {
            throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
        } else
        {
            dV = s;
            return;
        }
    }
}
