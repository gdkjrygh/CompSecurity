// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.SpotifyLink;
import com.spotify.mobile.android.util.viewuri.Verified;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import com.spotify.music.framework.flag.NoFlags;
import com.spotify.music.spotlets.FeatureIdentifier;

public final class esr extends ess
{

    public esr()
    {
    }

    public static esr a(Flags flags, SpotifyLink spotifylink, String s)
    {
        esr esr1 = new esr();
        esr1.a(flags, spotifylink.d(), s);
        return esr1;
    }

    public static boolean a(Flags flags)
    {
        return !(flags instanceof NoFlags) && (((Boolean)flags.a(fys.N)).booleanValue() || ekr.a(flags) || "Enabled".equals(flags.a(fys.L)));
    }

    protected final gjm L()
    {
        return ViewUri.x;
    }

    protected final String M()
    {
        return "spotify:genre:";
    }

    protected final String N()
    {
        return "music/genres";
    }

    public final volatile void a(Bundle bundle)
    {
        super.a(bundle);
    }

    protected final String b(Context context)
    {
        return "";
    }

    public final FeatureIdentifier u_()
    {
        return FeatureIdentifier.u;
    }

    public final volatile Verified v_()
    {
        return super.v_();
    }
}
