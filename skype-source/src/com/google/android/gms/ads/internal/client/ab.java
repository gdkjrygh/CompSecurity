// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.d;
import com.google.android.gms.ads.f;
import com.google.android.gms.ads.internal.util.client.a;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.internal.bj;
import com.google.android.gms.internal.dg;
import com.google.android.gms.internal.es;
import com.google.android.gms.internal.ew;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.google.android.gms.ads.internal.client:
//            j, m, n, AdSizeParcel, 
//            u, f, l, e, 
//            h, aa, a

public final class ab
{

    private final dg a;
    private final j b;
    private final AtomicBoolean c;
    private com.google.android.gms.ads.a d;
    private com.google.android.gms.ads.internal.client.a e;
    private u f;
    private d g[];
    private String h;
    private String i;
    private ViewGroup j;
    private com.google.android.gms.ads.doubleclick.a k;
    private com.google.android.gms.ads.purchase.a l;
    private com.google.android.gms.ads.purchase.b m;
    private com.google.android.gms.ads.doubleclick.b n;
    private boolean o;

    public ab(ViewGroup viewgroup)
    {
        this(viewgroup, null, false, com.google.android.gms.ads.internal.client.j.a(), (byte)0);
    }

    public ab(ViewGroup viewgroup, AttributeSet attributeset, boolean flag)
    {
        this(viewgroup, attributeset, flag, com.google.android.gms.ads.internal.client.j.a(), (byte)0);
    }

    private ab(ViewGroup viewgroup, AttributeSet attributeset, boolean flag, j j1)
    {
        a = new dg();
        j = viewgroup;
        b = j1;
        f = null;
        c = new AtomicBoolean(false);
        if (attributeset != null)
        {
            j1 = viewgroup.getContext();
            try
            {
                attributeset = new m(j1, attributeset);
                g = attributeset.a(flag);
                h = attributeset.a();
            }
            // Misplaced declaration of an exception variable
            catch (AttributeSet attributeset)
            {
                com.google.android.gms.ads.internal.client.n.a();
                com.google.android.gms.ads.internal.util.client.a.a(viewgroup, new AdSizeParcel(j1, d.a), attributeset.getMessage(), attributeset.getMessage());
                return;
            }
            if (viewgroup.isInEditMode())
            {
                com.google.android.gms.ads.internal.client.n.a();
                com.google.android.gms.ads.internal.util.client.a.a(viewgroup, new AdSizeParcel(j1, g[0]), "Ads by Google");
            }
        }
    }

    private ab(ViewGroup viewgroup, AttributeSet attributeset, boolean flag, j j1, byte byte0)
    {
        this(viewgroup, attributeset, flag, j1);
    }

    public final void a()
    {
        try
        {
            if (f != null)
            {
                f.b();
            }
            return;
        }
        catch (RemoteException remoteexception)
        {
            com.google.android.gms.ads.internal.util.client.b.b("Failed to destroy AdView.", remoteexception);
        }
    }

    public final void a(com.google.android.gms.ads.a a1)
    {
        d = a1;
        if (f == null) goto _L2; else goto _L1
_L1:
        u u1 = f;
        if (a1 == null)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        a1 = new com.google.android.gms.ads.internal.client.f(a1);
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

    public final void a(com.google.android.gms.ads.doubleclick.a a1)
    {
        k = a1;
        if (f == null) goto _L2; else goto _L1
_L1:
        u u1 = f;
        if (a1 == null)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        a1 = new l(a1);
_L3:
        u1.a(a1);
_L2:
        return;
        a1 = null;
          goto _L3
        a1;
        com.google.android.gms.ads.internal.util.client.b.b("Failed to set the AppEventListener.", a1);
        return;
    }

    public final void a(com.google.android.gms.ads.doubleclick.b b1)
    {
        n = b1;
        if (f == null) goto _L2; else goto _L1
_L1:
        u u1 = f;
        if (b1 == null)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        b1 = new bj(b1);
_L3:
        u1.a(b1);
_L2:
        return;
        b1 = null;
          goto _L3
        b1;
        com.google.android.gms.ads.internal.util.client.b.b("Failed to set the onCustomRenderedAdLoadedListener.", b1);
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
        if (f != null) goto _L2; else goto _L1
_L1:
        if ((g == null || h == null) && f == null)
        {
            throw new IllegalStateException("The ad size and ad unit ID must be set before loadAd is called.");
        }
          goto _L3
_L5:
        return;
_L3:
        android.content.Context context = j.getContext();
        f = com.google.android.gms.ads.internal.client.n.b().a(context, new AdSizeParcel(context, g), h, a);
        if (d != null)
        {
            f.a(new com.google.android.gms.ads.internal.client.f(d));
        }
        if (e != null)
        {
            f.a(new e(e));
        }
        if (k != null)
        {
            f.a(new l(k));
        }
        if (l != null)
        {
            f.a(new es(l));
        }
        if (m != null)
        {
            f.a(new ew(m), i);
        }
        if (n != null)
        {
            f.a(new bj(n));
        }
        f.a(com.google.android.gms.ads.internal.client.n.c());
        f.a(o);
        com.google.android.gms.b.c c1 = f.a();
        if (c1 != null)
        {
            break; /* Loop/switch isn't completed */
        }
_L2:
        try
        {
            if (f.a(com.google.android.gms.ads.internal.client.j.a(j.getContext(), aa1)))
            {
                a.a(aa1.j());
                return;
            }
            continue; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (aa aa1)
        {
            com.google.android.gms.ads.internal.util.client.b.b("Failed to load ad.", aa1);
        }
        if (true) goto _L5; else goto _L4
_L4:
        j.addView((View)com.google.android.gms.b.d.a(c1));
          goto _L2
        RemoteException remoteexception;
        remoteexception;
        com.google.android.gms.ads.internal.util.client.b.b("Failed to get an ad frame.", remoteexception);
          goto _L2
        if (true) goto _L5; else goto _L6
_L6:
    }

    public final void a(com.google.android.gms.ads.purchase.a a1)
    {
        if (m != null)
        {
            throw new IllegalStateException("Play store purchase parameter has already been set.");
        }
        l = a1;
        if (f == null) goto _L2; else goto _L1
_L1:
        u u1 = f;
        if (a1 == null)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        a1 = new es(a1);
_L3:
        u1.a(a1);
_L2:
        return;
        a1 = null;
          goto _L3
        a1;
        com.google.android.gms.ads.internal.util.client.b.b("Failed to set the InAppPurchaseListener.", a1);
        return;
    }

    public final void a(com.google.android.gms.ads.purchase.b b1, String s)
    {
        if (l != null)
        {
            throw new IllegalStateException("InAppPurchaseListener has already been set.");
        }
        m = b1;
        i = s;
        if (f == null) goto _L2; else goto _L1
_L1:
        u u1 = f;
        if (b1 == null)
        {
            break MISSING_BLOCK_LABEL_62;
        }
        b1 = new ew(b1);
_L3:
        u1.a(b1, s);
_L2:
        return;
        b1 = null;
          goto _L3
        b1;
        com.google.android.gms.ads.internal.util.client.b.b("Failed to set the play store purchase parameter.", b1);
        return;
    }

    public final void a(String s)
    {
        if (h != null)
        {
            throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
        } else
        {
            h = s;
            return;
        }
    }

    public final void a(boolean flag)
    {
        o = flag;
        try
        {
            if (f != null)
            {
                f.a(o);
            }
            return;
        }
        catch (RemoteException remoteexception)
        {
            com.google.android.gms.ads.internal.util.client.b.b("Failed to set manual impressions.", remoteexception);
        }
    }

    public final transient void a(d ad[])
    {
        if (g != null)
        {
            throw new IllegalStateException("The ad size can only be set once on AdView.");
        } else
        {
            b(ad);
            return;
        }
    }

    public final d b()
    {
        Object obj;
        if (f == null)
        {
            break MISSING_BLOCK_LABEL_47;
        }
        obj = f.j();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_47;
        }
        obj = com.google.android.gms.ads.f.a(((AdSizeParcel) (obj)).f, ((AdSizeParcel) (obj)).c, ((AdSizeParcel) (obj)).b);
        return ((d) (obj));
        RemoteException remoteexception;
        remoteexception;
        com.google.android.gms.ads.internal.util.client.b.b("Failed to get the current AdSize.", remoteexception);
        if (g != null)
        {
            return g[0];
        } else
        {
            return null;
        }
    }

    public final transient void b(d ad[])
    {
        g = ad;
        try
        {
            if (f != null)
            {
                f.a(new AdSizeParcel(j.getContext(), g));
            }
        }
        // Misplaced declaration of an exception variable
        catch (d ad[])
        {
            com.google.android.gms.ads.internal.util.client.b.b("Failed to set the ad size.", ad);
        }
        j.requestLayout();
    }

    public final void c()
    {
        try
        {
            if (f != null)
            {
                f.d();
            }
            return;
        }
        catch (RemoteException remoteexception)
        {
            com.google.android.gms.ads.internal.util.client.b.b("Failed to call pause.", remoteexception);
        }
    }

    public final void d()
    {
        try
        {
            if (f != null)
            {
                f.f();
            }
            return;
        }
        catch (RemoteException remoteexception)
        {
            com.google.android.gms.ads.internal.util.client.b.b("Failed to call resume.", remoteexception);
        }
    }
}
