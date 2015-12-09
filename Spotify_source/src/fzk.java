// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.porcelain.subitem.PorcelainIcon;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.viewuri.Verified;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import com.spotify.music.spotlets.FeatureIdentifier;

public final class fzk extends fzo
{

    public fzk()
    {
    }

    public static fzk a(Flags flags)
    {
        fzk fzk1 = new fzk();
        fzk1.b(flags);
        return fzk1;
    }

    public final com.spotify.mobile.android.ui.NavigationItem.NavigationGroup A_()
    {
        return com.spotify.mobile.android.ui.NavigationItem.NavigationGroup.u;
    }

    public final String a(Context context, Flags flags)
    {
        return context.getString(0x7f08052c);
    }

    protected final void a(gnn gnn1)
    {
        gnn1.a(a(ImmutableList.a(a("spotify:hub:sandbox:ab-nav-genres-releases", b(0x7f080530), PorcelainIcon.e), a("spotify:internal:discover", b(0x7f080539), PorcelainIcon.c), a("spotify:charts:root", b(0x7f08053a), PorcelainIcon.b), a("spotify:internal:radio", b(0x7f080536), PorcelainIcon.k))));
    }

    protected final FeatureIdentifier r_()
    {
        return FeatureIdentifier.Z;
    }

    public final FeatureIdentifier u_()
    {
        return FeatureIdentifier.Z;
    }

    public final Verified v_()
    {
        return ViewUri.d;
    }
}
