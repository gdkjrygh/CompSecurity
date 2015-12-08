// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.a.f;
import com.google.android.gms.ads.a;
import com.google.android.gms.ads.d;

// Referenced classes of package com.google.android.gms.internal:
//            az, ae, ab, eh, 
//            g, ek, lo, lp, 
//            c, z, p

public final class r
{

    private final az a;
    private a b;
    private g c;
    private d d[];
    private String e;
    private ViewGroup f;
    private com.google.android.gms.ads.doubleclick.a g;

    public r(ViewGroup viewgroup)
    {
        a = new az();
        f = viewgroup;
    }

    public r(ViewGroup viewgroup, AttributeSet attributeset, boolean flag)
    {
        a = new az();
        f = viewgroup;
        android.content.Context context = viewgroup.getContext();
        try
        {
            attributeset = new ae(context, attributeset);
            d = attributeset.a(flag);
            e = attributeset.a();
        }
        // Misplaced declaration of an exception variable
        catch (AttributeSet attributeset)
        {
            com.google.android.gms.internal.eh.a(viewgroup, new ab(context, d.a), attributeset.getMessage(), attributeset.getMessage());
            return;
        }
        if (viewgroup.isInEditMode())
        {
            com.google.android.gms.internal.eh.a(viewgroup, new ab(context, d[0]), "Ads by Google");
        }
    }

    public final d a()
    {
        d d1;
        if (c == null)
        {
            break MISSING_BLOCK_LABEL_29;
        }
        d1 = c.i().a();
        return d1;
        RemoteException remoteexception;
        remoteexception;
        com.google.android.gms.internal.ek.a("Failed to get the current AdSize.", remoteexception);
        if (d != null)
        {
            return d[0];
        } else
        {
            return null;
        }
    }

    public final void a(a a1)
    {
        b = a1;
        if (c == null) goto _L2; else goto _L1
_L1:
        g g1 = c;
        if (a1 == null)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        a1 = new lo(a1);
_L3:
        g1.a(a1);
_L2:
        return;
        a1 = null;
          goto _L3
        a1;
        com.google.android.gms.internal.ek.a("Failed to set the AdListener.", a1);
        return;
    }

    public final void a(p p1)
    {
        if (c != null) goto _L2; else goto _L1
_L1:
        if ((d == null || e == null) && c == null)
        {
            throw new IllegalStateException("The ad size and ad unit ID must be set before loadAd is called.");
        }
          goto _L3
_L5:
        return;
_L3:
        android.content.Context context = f.getContext();
        c = com.google.android.gms.internal.lp.a(context, new ab(context, d), e, a);
        if (b != null)
        {
            c.a(new lo(b));
        }
        if (g != null)
        {
            c.a(new c(g));
        }
        com.google.android.gms.a.c c1 = c.a();
        if (c1 != null)
        {
            break; /* Loop/switch isn't completed */
        }
_L2:
        try
        {
            if (c.a(new z(f.getContext(), p1)))
            {
                a.a(p1.i());
                return;
            }
            continue; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (p p1)
        {
            com.google.android.gms.internal.ek.a("Failed to load ad.", p1);
        }
        if (true) goto _L5; else goto _L4
_L4:
        f.addView((View)com.google.android.gms.a.f.a(c1));
          goto _L2
        RemoteException remoteexception;
        remoteexception;
        com.google.android.gms.internal.ek.a("Failed to get an ad frame.", remoteexception);
          goto _L2
        if (true) goto _L5; else goto _L6
_L6:
    }

    public final void a(String s)
    {
        if (e != null)
        {
            throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
        } else
        {
            e = s;
            return;
        }
    }

    public final transient void a(d ad[])
    {
        if (d != null)
        {
            throw new IllegalStateException("The ad size can only be set once on AdView.");
        }
        d = ad;
        try
        {
            if (c != null)
            {
                c.a(new ab(f.getContext(), d));
            }
        }
        // Misplaced declaration of an exception variable
        catch (d ad[])
        {
            com.google.android.gms.internal.ek.a("Failed to set the ad size.", ad);
        }
        f.requestLayout();
    }
}
