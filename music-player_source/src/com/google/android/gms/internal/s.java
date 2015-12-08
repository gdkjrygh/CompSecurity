// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.a;

// Referenced classes of package com.google.android.gms.internal:
//            az, lo, g, ek, 
//            ab, lp, c, z, 
//            p

public final class s
{

    private final az a = new az();
    private final Context b;
    private a c;
    private g d;
    private String e;
    private com.google.android.gms.ads.doubleclick.a f;

    public s(Context context)
    {
        b = context;
    }

    private void b(String s1)
    {
        if (d == null)
        {
            throw new IllegalStateException((new StringBuilder("The ad unit ID must be set on InterstitialAd before ")).append(s1).append(" is called.").toString());
        } else
        {
            return;
        }
    }

    public final void a(a a1)
    {
        c = a1;
        if (d == null) goto _L2; else goto _L1
_L1:
        g g1 = d;
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
        try
        {
            if (d == null)
            {
                if (e == null)
                {
                    b("loadAd");
                }
                d = com.google.android.gms.internal.lp.a(b, new ab(), e, a);
                if (c != null)
                {
                    d.a(new lo(c));
                }
                if (f != null)
                {
                    d.a(new c(f));
                }
            }
            if (d.a(new z(b, p1)))
            {
                a.a(p1.i());
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (p p1)
        {
            com.google.android.gms.internal.ek.a("Failed to load ad.", p1);
        }
    }

    public final void a(String s1)
    {
        if (e != null)
        {
            throw new IllegalStateException("The ad unit ID can only be set once on InterstitialAd.");
        } else
        {
            e = s1;
            return;
        }
    }

    public final boolean a()
    {
        if (d == null)
        {
            return false;
        }
        boolean flag;
        try
        {
            flag = d.c();
        }
        catch (RemoteException remoteexception)
        {
            com.google.android.gms.internal.ek.a("Failed to check if ad is ready.", remoteexception);
            return false;
        }
        return flag;
    }

    public final void b()
    {
        try
        {
            b("show");
            d.f();
            return;
        }
        catch (RemoteException remoteexception)
        {
            com.google.android.gms.internal.ek.a("Failed to show interstitial.", remoteexception);
        }
    }
}
