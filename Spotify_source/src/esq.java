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

public final class esq extends ess
    implements NavigationItem
{

    public esq()
    {
    }

    public static esq a(String s, SpotifyLink spotifylink, Flags flags)
    {
        esq esq1 = new esq();
        esq1.a(flags, spotifylink.d(), s);
        return esq1;
    }

    public final com.spotify.mobile.android.ui.NavigationItem.NavigationGroup A_()
    {
        return com.spotify.mobile.android.ui.NavigationItem.NavigationGroup.d;
    }

    protected final gjm L()
    {
        return ViewUri.B;
    }

    protected final String M()
    {
        return "spotify:app:browse";
    }

    protected final String N()
    {
        return "browse";
    }

    public final volatile void a(Bundle bundle)
    {
        super.a(bundle);
    }

    protected final String b(Context context)
    {
        return context.getString(0x7f080159);
    }

    public final FeatureIdentifier u_()
    {
        return FeatureIdentifier.c;
    }

    public final volatile Verified v_()
    {
        return super.v_();
    }
}
