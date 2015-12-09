// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.spotify.mobile.android.provider.PaymentState;
import com.spotify.mobile.android.spotlets.tinkerbell.BannerItem;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.viewuri.Verified;

final class gep
    implements fjk
{

    private final Context a;
    private final PaymentState b;
    private final gin c;
    private final Verified d;

    public gep(Context context, PaymentState paymentstate, gin gin1, Verified verified)
    {
        a = context;
        b = paymentstate;
        c = gin1;
        d = verified;
    }

    private void a(BannerItem banneritem, ClientEvent clientevent)
    {
        if (banneritem.a != 0x7f110014)
        {
            return;
        } else
        {
            geo.b(a, d, b, clientevent);
            c.b().a(geo.a, System.currentTimeMillis()).a(geo.b, b.toString()).b();
            return;
        }
    }

    public final void a(BannerItem banneritem)
    {
        a(banneritem, new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.N));
    }

    public final void b(BannerItem banneritem)
    {
        a(banneritem, new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.g));
    }
}
