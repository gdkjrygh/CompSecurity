// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.common.base.Optional;
import com.spotify.android.paste.widget.StickyRecyclerView;
import com.spotify.cosmos.android.Subscription;
import com.spotify.mobile.android.porcelain.PorcelainAdapter;
import com.spotify.mobile.android.porcelain.metrics.PorcelainMetricsRenderType;
import com.spotify.mobile.android.spotlets.hubs.shows.keeplistening.UnfinishedEpisodesManager;
import com.spotify.mobile.android.ui.NavigationItem;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.SpotifyLink;
import com.spotify.mobile.android.util.viewuri.Verified;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import com.spotify.music.spotlets.FeatureIdentifier;
import com.spotify.music.spotlets.common.AbstractContentFragment;
import java.util.Collections;

public final class esw extends ess
    implements NavigationItem, esy
{

    private static final gdf ag = gdf.a(com/spotify/mobile/android/spotlets/hubs/shows/keeplistening/UnfinishedEpisodesManager$Type);
    private dpt ah;
    private UnfinishedEpisodesManager ai;

    public esw()
    {
    }

    private boolean Q()
    {
        Object obj = K();
        if (y() != null)
        {
            if (obj != null)
            {
                obj = ((dot) (obj)).getSpace();
            } else
            {
                obj = null;
            }
            if (b(((doz) (obj))).b())
            {
                return true;
            }
        }
        return false;
    }

    public static esw a(Flags flags, SpotifyLink spotifylink, String s)
    {
        esw esw1 = new esw();
        esw1.a(flags, spotifylink.d(), s);
        return esw1;
    }

    private static Optional b(doz doz1)
    {
        if (doz1 == null)
        {
            return Optional.e();
        }
        doz1 = doz1.getExtraData().get("showsHubIncludeContinuePlayingSection");
        if (doz1 == null || !doz1.isTextual())
        {
            return Optional.e();
        } else
        {
            return ag.b(doz1.asText());
        }
    }

    public final com.spotify.mobile.android.ui.NavigationItem.NavigationGroup A_()
    {
        return com.spotify.mobile.android.ui.NavigationItem.NavigationGroup.q;
    }

    protected final gjm L()
    {
        return ViewUri.A;
    }

    protected final String M()
    {
        return "spotify:hub:shows";
    }

    protected final String N()
    {
        return "shows";
    }

    public final void O()
    {
        if (Q())
        {
            ((StickyRecyclerView)((dsz)super.ad).b).a().c().c(0, 2);
        }
    }

    protected final dps a(doz doz1)
    {
        dps dps = super.a(doz1);
        doz1 = b(doz1);
        UnfinishedEpisodesManager unfinishedepisodesmanager = ai;
        unfinishedepisodesmanager.d = (com.spotify.mobile.android.spotlets.hubs.shows.keeplistening.UnfinishedEpisodesManager.Type)doz1.d();
        if (unfinishedepisodesmanager.b != null)
        {
            unfinishedepisodesmanager.a(unfinishedepisodesmanager.b);
        }
        if (doz1.b())
        {
            ggp.a(((StickyRecyclerView)((dsz)super.ad).b).a(), null);
            super.Y.c.a = false;
            ah.a(dps);
            return ah;
        } else
        {
            return dps;
        }
    }

    public final void a(int i, int j)
    {
        if (Q())
        {
            ((StickyRecyclerView)((dsz)super.ad).b).a().c().a(i, j);
        }
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        bundle = k();
        com.spotify.cosmos.android.Resolver resolver = super.a;
        drq drq1 = drp.a(PorcelainMetricsRenderType.g);
        drq1.d = 0;
        drq1.b = "shows-continue-playing";
        ai = new UnfinishedEpisodesManager(bundle, resolver, drq1.a(), this);
        ai.a();
    }

    public final String b(Context context)
    {
        return context.getString(0x7f080315);
    }

    protected final dsz c(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        ah = new dpt(ai.a.a(), Collections.emptyList());
        if (bundle != null)
        {
            UnfinishedEpisodesManager unfinishedepisodesmanager = ai;
            Object obj = bundle.getParcelable("spotlets.hubs.shows.unfinished.episodes");
            if (obj instanceof com.spotify.mobile.android.spotlets.hubs.shows.keeplistening.UnfinishedEpisodesManager.SavedState)
            {
                obj = (com.spotify.mobile.android.spotlets.hubs.shows.keeplistening.UnfinishedEpisodesManager.SavedState)obj;
                unfinishedepisodesmanager.b = ((com.spotify.mobile.android.spotlets.hubs.shows.keeplistening.UnfinishedEpisodesManager.SavedState) (obj)).a;
                unfinishedepisodesmanager.d = ((com.spotify.mobile.android.spotlets.hubs.shows.keeplistening.UnfinishedEpisodesManager.SavedState) (obj)).b;
            }
        }
        return super.c(layoutinflater, viewgroup, bundle);
    }

    public final void c()
    {
        super.c();
        ai.a();
    }

    protected final View d(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return c(layoutinflater, viewgroup, bundle);
    }

    public final void d()
    {
        super.d();
        UnfinishedEpisodesManager unfinishedepisodesmanager = ai;
        unfinishedepisodesmanager.e = false;
        unfinishedepisodesmanager.a.b();
        unfinishedepisodesmanager.a.a(Collections.emptyList(), null);
        if (unfinishedepisodesmanager.c != null)
        {
            unfinishedepisodesmanager.c.unsubscribe();
            unfinishedepisodesmanager.c = null;
        }
        unfinishedepisodesmanager.b = null;
    }

    public final void e(Bundle bundle)
    {
        super.e(bundle);
        if (ai != null)
        {
            UnfinishedEpisodesManager unfinishedepisodesmanager = ai;
            bundle.putParcelable("spotlets.hubs.shows.unfinished.episodes", new com.spotify.mobile.android.spotlets.hubs.shows.keeplistening.UnfinishedEpisodesManager.SavedState(unfinishedepisodesmanager.b, unfinishedepisodesmanager.d));
        }
    }

    public final FeatureIdentifier u_()
    {
        return FeatureIdentifier.x;
    }

    public final volatile Verified v_()
    {
        return super.v_();
    }

}
