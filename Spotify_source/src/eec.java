// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.text.TextUtils;
import com.spotify.mobile.android.spotlets.ads.AdEventReporter;
import com.spotify.mobile.android.spotlets.ads.FeaturedAction;
import com.spotify.mobile.android.spotlets.ads.model.Ad;

public final class eec extends FeaturedAction
{

    public eec(Ad ad)
    {
        a = ad;
        b = new eea() {

            private eec a;

            public final void a()
            {
                ((AdEventReporter)dmz.a(com/spotify/mobile/android/spotlets/ads/AdEventReporter)).b(a.a.getId());
            }

            
            {
                a = eec.this;
                super();
            }
        };
    }

    public final String a(Context context)
    {
        String s1 = a.getButtonText();
        String s = s1;
        if (TextUtils.isEmpty(s1))
        {
            s = context.getString(0x7f0805ef);
        }
        return s;
    }

    public final boolean b()
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
        return com.spotify.mobile.android.spotlets.ads.FeaturedAction.Type.c;
    }
}
