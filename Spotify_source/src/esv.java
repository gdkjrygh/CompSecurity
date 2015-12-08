// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import com.google.common.collect.ImmutableMap;
import com.spotify.mobile.android.ui.NavigationItem;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.SpotifyLink;
import com.spotify.mobile.android.util.viewuri.Verified;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import com.spotify.music.spotlets.FeatureIdentifier;

public final class esv extends ess
    implements NavigationItem
{

    private static final ImmutableMap ag = ImmutableMap.h();

    public esv()
    {
    }

    public static esv a(Flags flags, SpotifyLink spotifylink, String s)
    {
        esv esv1 = new esv();
        esv1.a(flags, spotifylink.d(), s);
        return esv1;
    }

    public final com.spotify.mobile.android.ui.NavigationItem.NavigationGroup A_()
    {
        Object obj = super.aa.d();
        obj = (com.spotify.mobile.android.ui.NavigationItem.NavigationGroup)ag.get(obj);
        if (obj != null)
        {
            return ((com.spotify.mobile.android.ui.NavigationItem.NavigationGroup) (obj));
        } else
        {
            return com.spotify.mobile.android.ui.NavigationItem.NavigationGroup.a;
        }
    }

    protected final gjm L()
    {
        return ViewUri.C;
    }

    protected final String M()
    {
        return "spotify:hub:sandbox:";
    }

    protected final String N()
    {
        return "sandbox";
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
        return FeatureIdentifier.y;
    }

    public final volatile Verified v_()
    {
        return super.v_();
    }

}
