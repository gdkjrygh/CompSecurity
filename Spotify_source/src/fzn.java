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

public final class fzn extends fzo
{

    public fzn()
    {
    }

    public static fzn a(Flags flags)
    {
        fzn fzn1 = new fzn();
        fzn1.b(flags);
        return fzn1;
    }

    public final com.spotify.mobile.android.ui.NavigationItem.NavigationGroup A_()
    {
        return com.spotify.mobile.android.ui.NavigationItem.NavigationGroup.x;
    }

    public final String a(Context context, Flags flags)
    {
        return context.getString(0x7f08053e);
    }

    protected final void a(gnn gnn1)
    {
        cuq cuq1 = ImmutableList.h();
        cuq1.c(a(ViewUri.j.toString(), b(0x7f080532), PorcelainIcon.n));
        cuq1.c(a("spotify:internal:radio", b(0x7f080536), PorcelainIcon.k));
        cuq1.c(a(ViewUri.l.toString(), b(0x7f080538), PorcelainIcon.l));
        if (((Boolean)fyw.a(this).a(fys.at)).booleanValue())
        {
            cuq1.c(a(ViewUri.m.toString(), b(0x7f080535), PorcelainIcon.g));
        }
        cuq1.c(a("spotify:recently_played", b(0x7f080537), PorcelainIcon.h));
        gnn1.a(a(cuq1.a()));
    }

    protected final FeatureIdentifier r_()
    {
        return FeatureIdentifier.ac;
    }

    public final FeatureIdentifier u_()
    {
        return FeatureIdentifier.ac;
    }

    public final Verified v_()
    {
        return ViewUri.g;
    }
}
