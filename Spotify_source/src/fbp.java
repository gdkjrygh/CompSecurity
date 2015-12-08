// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.spotify.mobile.android.spotlets.ads.FeaturedAction;
import com.spotify.mobile.android.spotlets.ads.model.Ad;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class fbp
{

    FeaturedAction a;
    Set b;
    private BroadcastReceiver c;

    public fbp()
    {
        c = new BroadcastReceiver() {

            private fbp a;

            public final void onReceive(Context context, Intent intent)
            {
                context = (Ad)intent.getParcelableExtra(edx.b);
                intent = a;
                if (context == null)
                {
                    context = FeaturedAction.a();
                } else
                {
                    com.spotify.mobile.android.spotlets.ads.model.Ad.AdType adtype = context.getAdType();
                    com.spotify.mobile.android.spotlets.ads.model.Ad.FeaturedActionType featuredactiontype = context.getFeaturedActionType();
                    if (adtype == com.spotify.mobile.android.spotlets.ads.model.Ad.AdType.OFFER_AD && featuredactiontype == com.spotify.mobile.android.spotlets.ads.model.Ad.FeaturedActionType.c)
                    {
                        context = new eec(context);
                    } else
                    if (adtype == com.spotify.mobile.android.spotlets.ads.model.Ad.AdType.OFFER_AD && featuredactiontype == com.spotify.mobile.android.spotlets.ads.model.Ad.FeaturedActionType.d)
                    {
                        context = new eee(context);
                    } else
                    if (featuredactiontype == com.spotify.mobile.android.spotlets.ads.model.Ad.FeaturedActionType.b)
                    {
                        context = new eeb(context);
                    } else
                    {
                        context = FeaturedAction.a();
                    }
                }
                intent.a = context;
                if (a.b != null)
                {
                    for (context = a.b.iterator(); context.hasNext(); ((fbq)context.next()).a(a.a)) { }
                }
            }

            
            {
                a = fbp.this;
                super();
            }
        };
    }

    public final void a(fbq fbq1)
    {
        ctz.a(fbq1);
        if (b == null)
        {
            b = new HashSet();
            ((gnq)dmz.a(gnq)).a(c, edx.a);
        }
        b.add(fbq1);
        if (a != null)
        {
            fbq1.a(a);
        }
    }

    public final void b(fbq fbq1)
    {
        if (b != null)
        {
            b.remove(fbq1);
            if (b.isEmpty())
            {
                ((gnq)dmz.a(gnq)).a(c);
                b = null;
            }
        }
    }
}
