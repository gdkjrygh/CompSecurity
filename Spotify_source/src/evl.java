// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.pm.PackageInfo;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.cosmos.router.Request;
import com.spotify.mobile.android.cosmos.RequestBuilder;
import com.spotify.mobile.android.ui.NavigationItem;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.ClientInfo;
import com.spotify.mobile.android.util.viewuri.Verified;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import com.spotify.music.spotlets.FeatureIdentifier;
import java.util.Locale;
import java.util.TimeZone;

public final class evl extends doq
    implements NavigationItem
{

    public evl()
    {
    }

    public static evl a(Flags flags)
    {
        evl evl1 = new evl();
        fyw.a(evl1, flags);
        return evl1;
    }

    public final com.spotify.mobile.android.ui.NavigationItem.NavigationGroup A_()
    {
        return com.spotify.mobile.android.ui.NavigationItem.NavigationGroup.c;
    }

    protected final SpotifyIcon G()
    {
        return SpotifyIcon.bp;
    }

    protected final Request H()
    {
        return RequestBuilder.get((new android.net.Uri.Builder()).scheme("hm").authority("intro").path("/v1/hub").appendQueryParameter("client-locale", Locale.getDefault().toString()).appendQueryParameter("client-timezone", TimeZone.getDefault().getID()).appendQueryParameter("client-version", ((ClientInfo)dmz.a(com/spotify/mobile/android/util/ClientInfo)).a.versionName).appendQueryParameter("client-platform", "android").toString()).build();
    }

    public final String a(Context context, Flags flags)
    {
        return context.getString(0x7f08035d);
    }

    protected final FeatureIdentifier r_()
    {
        return FeatureIdentifier.E;
    }

    public final FeatureIdentifier u_()
    {
        return FeatureIdentifier.E;
    }

    public final Verified v_()
    {
        return ViewUri.k;
    }
}
