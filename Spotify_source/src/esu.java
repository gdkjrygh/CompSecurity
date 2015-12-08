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

public final class esu extends ess
    implements NavigationItem
{

    public esu()
    {
    }

    public static esu a(Flags flags, SpotifyLink spotifylink, String s)
    {
        esu esu1 = new esu();
        esu1.a(flags, spotifylink.d(), s);
        return esu1;
    }

    public final com.spotify.mobile.android.ui.NavigationItem.NavigationGroup A_()
    {
        return com.spotify.mobile.android.ui.NavigationItem.NavigationGroup.p;
    }

    protected final gjm L()
    {
        return ViewUri.z;
    }

    protected final String M()
    {
        return "spotify:hub:music";
    }

    protected final String N()
    {
        return "music";
    }

    public final volatile void a(Bundle bundle)
    {
        super.a(bundle);
    }

    public final String b(Context context)
    {
        return context.getString(0x7f080312);
    }

    public final FeatureIdentifier u_()
    {
        return FeatureIdentifier.w;
    }

    public final volatile Verified v_()
    {
        return super.v_();
    }
}
