// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.a;
import com.google.android.gms.ads.doubleclick.c;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.internal.bj;
import com.google.android.gms.internal.dg;
import com.google.android.gms.internal.es;
import com.google.android.gms.internal.ew;

// Referenced classes of package com.google.android.gms.ads.internal.client:
//            j, u, f, e, 
//            n, AdSizeParcel, h, l, 
//            aa, a

public final class ac
{

    private final dg a;
    private final Context b;
    private final j c;
    private a d;
    private com.google.android.gms.ads.internal.client.a e;
    private u f;
    private String g;
    private String h;
    private com.google.android.gms.ads.doubleclick.a i;
    private com.google.android.gms.ads.purchase.b j;
    private com.google.android.gms.ads.purchase.a k;
    private c l;
    private com.google.android.gms.ads.doubleclick.b m;

    public ac(Context context)
    {
        this(context, com.google.android.gms.ads.internal.client.j.a());
    }

    private ac(Context context, j j1)
    {
        a = new dg();
        b = context;
        c = j1;
        l = null;
    }

    private void b(String s)
    {
        if (f == null)
        {
            throw new IllegalStateException((new StringBuilder("The ad unit ID must be set on InterstitialAd before ")).append(s).append(" is called.").toString());
        } else
        {
            return;
        }
    }

    public final void a()
    {
        try
        {
            b("show");
            f.g();
            return;
        }
        catch (RemoteException remoteexception)
        {
            com.google.android.gms.ads.internal.util.client.b.b("Failed to show interstitial.", remoteexception);
        }
    }

    public final void a(a a1)
    {
        d = a1;
        if (f == null) goto _L2; else goto _L1
_L1:
        u u1 = f;
        if (a1 == null)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        a1 = new f(a1);
_L3:
        u1.a(a1);
_L2:
        return;
        a1 = null;
          goto _L3
        a1;
        com.google.android.gms.ads.internal.util.client.b.b("Failed to set the AdListener.", a1);
        return;
    }

    public final void a(com.google.android.gms.ads.internal.client.a a1)
    {
        e = a1;
        if (f == null) goto _L2; else goto _L1
_L1:
        u u1 = f;
        if (a1 == null)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        a1 = new e(a1);
_L3:
        u1.a(a1);
_L2:
        return;
        a1 = null;
          goto _L3
        a1;
        com.google.android.gms.ads.internal.util.client.b.b("Failed to set the AdClickListener.", a1);
        return;
    }

    public final void a(aa aa1)
    {
        try
        {
            if (f == null)
            {
                if (g == null)
                {
                    b("loadAd");
                }
                f = com.google.android.gms.ads.internal.client.n.b().b(b, new AdSizeParcel(), g, a);
                if (d != null)
                {
                    f.a(new f(d));
                }
                if (e != null)
                {
                    f.a(new e(e));
                }
                if (i != null)
                {
                    f.a(new l(i));
                }
                if (k != null)
                {
                    f.a(new es(k));
                }
                if (j != null)
                {
                    f.a(new ew(j), h);
                }
                if (m != null)
                {
                    f.a(new bj(m));
                }
            }
            if (f.a(com.google.android.gms.ads.internal.client.j.a(b, aa1)))
            {
                a.a(aa1.j());
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (aa aa1)
        {
            com.google.android.gms.ads.internal.util.client.b.b("Failed to load ad.", aa1);
        }
    }

    public final void a(String s)
    {
        if (g != null)
        {
            throw new IllegalStateException("The ad unit ID can only be set once on InterstitialAd.");
        } else
        {
            g = s;
            return;
        }
    }
}
