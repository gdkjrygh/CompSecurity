// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import com.spotify.mobile.android.ui.NavigationItem;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.SpotifyLink;
import com.spotify.mobile.android.util.viewuri.Verified;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import com.spotify.music.spotlets.FeatureIdentifier;

public final class est extends ess
    implements NavigationItem
{

    public est()
    {
    }

    public static est a(Flags flags, SpotifyLink spotifylink, String s)
    {
        est est1 = new est();
        est1.a(flags, spotifylink.d(), s);
        return est1;
    }

    public final com.spotify.mobile.android.ui.NavigationItem.NavigationGroup A_()
    {
        return com.spotify.mobile.android.ui.NavigationItem.NavigationGroup.r;
    }

    protected final gjm L()
    {
        return ViewUri.y;
    }

    protected final String M()
    {
        return "spotify:hub:moments";
    }

    protected final String N()
    {
        return "moments";
    }

    protected final android.net.Uri.Builder a(SpotifyLink spotifylink)
    {
        return super.a(spotifylink).appendQueryParameter("running-enabled", String.valueOf(fyw.a(this).a(fys.au)));
    }

    public final volatile void a(Bundle bundle)
    {
        super.a(bundle);
    }

    public final String b(Context context)
    {
        return context.getString(0x7f080310);
    }

    public final FeatureIdentifier u_()
    {
        return FeatureIdentifier.v;
    }

    public final volatile Verified v_()
    {
        return super.v_();
    }
}
