// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.spotify.mobile.android.spotlets.ads.AdEventReporter;
import com.spotify.mobile.android.spotlets.ads.FeaturedAction;
import com.spotify.mobile.android.spotlets.ads.model.Ad;

public final class eee extends FeaturedAction
{

    public eee(Ad ad)
    {
        a = ad;
        b = new eea() {

            private eee a;

            public final void a()
            {
                ((AdEventReporter)dmz.a(com/spotify/mobile/android/spotlets/ads/AdEventReporter)).a(a.a);
            }

            
            {
                a = eee.this;
                super();
            }
        };
    }

    public final String a(Context context)
    {
        String s = a.getButtonText();
        if (s != null)
        {
            return s;
        } else
        {
            return context.getString(0x7f0805f0);
        }
    }

    public final boolean c()
    {
        return true;
    }

    public final boolean e()
    {
        return false;
    }

    public final boolean f()
    {
        return true;
    }

    public final boolean g()
    {
        return true;
    }

    public final com.spotify.mobile.android.spotlets.ads.FeaturedAction.Type i()
    {
        return com.spotify.mobile.android.spotlets.ads.FeaturedAction.Type.d;
    }

    public final void l()
    {
    }
}
