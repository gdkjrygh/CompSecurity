// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.zzk;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.atomic.AtomicBoolean;

public final class bgy
{

    public bfe a;
    public bgh b;
    public ber c[];
    public String d;
    public ViewGroup e;
    private final cew f;
    private bem g;

    public bgy(ViewGroup viewgroup)
    {
        bfo.a();
        this(viewgroup, null, false, '\0');
    }

    public bgy(ViewGroup viewgroup, AttributeSet attributeset, boolean flag)
    {
        bfo.a();
        this(viewgroup, attributeset, flag, '\0');
    }

    private bgy(ViewGroup viewgroup, AttributeSet attributeset, boolean flag, byte byte0)
    {
        f = new cew();
        e = viewgroup;
        b = null;
        new AtomicBoolean(false);
        if (attributeset == null) goto _L2; else goto _L1
_L1:
        android.content.Context context = viewgroup.getContext();
        attributeset = new zzk(context, attributeset);
        if (flag) goto _L4; else goto _L3
_L3:
        if (((zzk) (attributeset)).a.length != 1)
        {
            throw new IllegalArgumentException("The adSizes XML attribute is only allowed on PublisherAdViews.");
        }
          goto _L4
        attributeset;
        bfq.a();
        bjz.a(viewgroup, new AdSizeParcel(context, ber.a), attributeset.getMessage(), attributeset.getMessage());
_L2:
        return;
_L4:
        c = ((zzk) (attributeset)).a;
        d = ((zzk) (attributeset)).b;
        if (viewgroup.isInEditMode())
        {
            bfq.a();
            bjz.a(viewgroup, new AdSizeParcel(context, c[0]), "Ads by Google", 0xff000000, -1);
            return;
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    private bgy(ViewGroup viewgroup, AttributeSet attributeset, boolean flag, char c1)
    {
        this(viewgroup, attributeset, flag, (byte)0);
    }

    public final void a()
    {
        try
        {
            if (b != null)
            {
                b.b();
            }
            return;
        }
        catch (RemoteException remoteexception)
        {
            bka.c("Failed to destroy AdView.", remoteexception);
        }
    }

    public final void a(bem bem)
    {
        g = bem;
        if (b == null) goto _L2; else goto _L1
_L1:
        bgh bgh1 = b;
        if (bem == null)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        bem = new bfj(bem);
_L3:
        bgh1.a(bem);
_L2:
        return;
        bem = null;
          goto _L3
        bem;
        bka.c("Failed to set the AdListener.", bem);
        return;
    }

    public final void a(bgw bgw1)
    {
        if (b != null) goto _L2; else goto _L1
_L1:
        if ((c == null || d == null) && b == null)
        {
            throw new IllegalStateException("The ad size and ad unit ID must be set before loadAd is called.");
        }
          goto _L3
_L5:
        return;
_L3:
        bgh bgh1;
        android.content.Context context;
        AdSizeParcel adsizeparcel;
        String s;
        cew cew1;
        context = e.getContext();
        bfl bfl1 = bfq.b();
        adsizeparcel = new AdSizeParcel(context, c);
        s = d;
        cew1 = f;
        bfq.a();
        if (!bjz.b(context))
        {
            break MISSING_BLOCK_LABEL_118;
        }
        bgh1 = bfl1.a(context, adsizeparcel, s, cew1, 1);
        Object obj;
        obj = bgh1;
        if (bgh1 != null)
        {
            break MISSING_BLOCK_LABEL_149;
        }
        bka.a("Using BannerAdManager from the client jar.");
        obj = new bkj(context, adsizeparcel, s, cew1, new VersionInfoParcel(), bkf.a());
        b = ((bgh) (obj));
        if (g != null)
        {
            b.a(new bfj(g));
        }
        if (a != null)
        {
            b.a(new bfi(a));
        }
        b.a(bfq.c());
        b.a(false);
        obj = b.a();
        if (obj != null)
        {
            break; /* Loop/switch isn't completed */
        }
_L2:
        try
        {
            if (b.a(bfo.a(e.getContext(), bgw1)))
            {
                f.a = bgw1.i;
                return;
            }
            continue; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (bgw bgw1)
        {
            bka.c("Failed to load ad.", bgw1);
        }
        if (true) goto _L5; else goto _L4
_L4:
        e.addView((View)bye.a(((byb) (obj))));
          goto _L2
        RemoteException remoteexception;
        remoteexception;
        bka.c("Failed to get an ad frame.", remoteexception);
          goto _L2
        if (true) goto _L5; else goto _L6
_L6:
    }

    public final ber b()
    {
        Object obj;
        if (b == null)
        {
            break MISSING_BLOCK_LABEL_35;
        }
        obj = b.j();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_35;
        }
        obj = ((AdSizeParcel) (obj)).b();
        return ((ber) (obj));
        RemoteException remoteexception;
        remoteexception;
        bka.c("Failed to get the current AdSize.", remoteexception);
        if (c != null)
        {
            return c[0];
        } else
        {
            return null;
        }
    }

    public final void c()
    {
        try
        {
            if (b != null)
            {
                b.d();
            }
            return;
        }
        catch (RemoteException remoteexception)
        {
            bka.c("Failed to call pause.", remoteexception);
        }
    }

    public final void d()
    {
        try
        {
            if (b != null)
            {
                b.f();
            }
            return;
        }
        catch (RemoteException remoteexception)
        {
            bka.c("Failed to call resume.", remoteexception);
        }
    }
}
