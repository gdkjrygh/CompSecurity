// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.spotlets.show.model.Covers;
import com.spotify.mobile.android.spotlets.show.model.Show;
import com.spotify.mobile.android.spotlets.show.proto.ProtoEpisodeCollectionState;
import com.spotify.mobile.android.spotlets.show.proto.ProtoEpisodeMetadata;
import com.spotify.mobile.android.spotlets.show.proto.ProtoEpisodeOfflineState;
import com.spotify.mobile.android.spotlets.show.proto.ProtoEpisodePlayState;
import com.spotify.mobile.android.spotlets.show.proto.ProtoImageGroup;
import com.spotify.mobile.android.spotlets.show.proto.ProtoShowCollectionState;
import com.spotify.mobile.android.spotlets.show.proto.ProtoShowMetadata;
import com.spotify.mobile.android.spotlets.show.proto.ProtoShowPlayState;
import com.spotify.mobile.android.spotlets.show.proto.ProtoShowsRequestItem;
import com.spotify.mobile.android.spotlets.show.proto.ProtoUnplayedEpisodesResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public final class fiv
{

    public static ProtoEpisodeCollectionState a(fio fio1)
    {
        if (fio1 == null)
        {
            return null;
        } else
        {
            return (new com.spotify.mobile.android.spotlets.show.proto.ProtoEpisodeCollectionState.Builder()).is_in_collection(Boolean.valueOf(fio1.g())).is_new(Boolean.valueOf(fio1.h())).build();
        }
    }

    private static ProtoImageGroup a(Covers covers)
    {
        if (covers == null)
        {
            return null;
        } else
        {
            return (new com.spotify.mobile.android.spotlets.show.proto.ProtoImageGroup.Builder()).standard_link(covers.getUri()).small_link(covers.getSmallUri()).large_link(covers.getLargeUri()).xlarge_link(covers.getXlargeUri()).build();
        }
    }

    public static ProtoShowsRequestItem a(Show show)
    {
        if (show == null)
        {
            return null;
        } else
        {
            return (new com.spotify.mobile.android.spotlets.show.proto.ProtoShowsRequestItem.Builder()).show_collection_state(c(show)).show_metadata(b(show)).show_play_state(d(show)).build();
        }
    }

    public static ProtoUnplayedEpisodesResponse a(fip fip1)
    {
        if (fip1 == null)
        {
            return null;
        }
        ArrayList arraylist = new ArrayList(((fio[])fip1.getItems()).length);
        fio afio[] = (fio[])fip1.getItems();
        int j = afio.length;
        int i = 0;
        while (i < j) 
        {
            Object obj = afio[i];
            if (obj == null)
            {
                obj = null;
            } else
            {
                obj = (new com.spotify.mobile.android.spotlets.show.proto.ProtoUnplayedEpisodesRequestItem.Builder()).episode_collection_state(a(((fio) (obj)))).episode_metadata(d(((fio) (obj)))).episode_offline_state(c(((fio) (obj)))).episode_play_state(b(((fio) (obj)))).header(((fio) (obj)).getHeader()).build();
            }
            arraylist.add(obj);
            i++;
        }
        return (new com.spotify.mobile.android.spotlets.show.proto.ProtoUnplayedEpisodesResponse.Builder()).unfiltered_length(Integer.valueOf(fip1.getUnfilteredLength())).unranged_length(Integer.valueOf(fip1.getUnrangedLength())).loading_contents(Boolean.valueOf(fip1.isLoading())).item(arraylist).build();
    }

    public static ProtoEpisodePlayState b(fio fio1)
    {
        if (fio1 == null)
        {
            return null;
        } else
        {
            return (new com.spotify.mobile.android.spotlets.show.proto.ProtoEpisodePlayState.Builder()).is_playable(Boolean.valueOf(fio1.i())).time_left(fio1.l()).is_played(Boolean.valueOf(fio1.m())).build();
        }
    }

    public static ProtoShowMetadata b(Show show)
    {
        if (show == null)
        {
            return null;
        } else
        {
            return (new com.spotify.mobile.android.spotlets.show.proto.ProtoShowMetadata.Builder()).link(show.b()).name(show.a()).consumption_order(show.h().toString().toLowerCase(Locale.US)).covers(a(show.c())).description(show.f()).media_type_enum(Integer.valueOf(show.i().ordinal())).publisher(show.d()).is_explicit(Boolean.valueOf(false)).copyright(new ArrayList()).language(null).num_episodes(Integer.valueOf(0)).popularity(null).build();
        }
    }

    public static ProtoEpisodeOfflineState c(fio fio1)
    {
        if (fio1 == null)
        {
            return null;
        } else
        {
            return (new com.spotify.mobile.android.spotlets.show.proto.ProtoEpisodeOfflineState.Builder()).offline_state(fit.b(fio1.p())).sync_progress(Integer.valueOf(fio1.q())).build();
        }
    }

    public static ProtoShowCollectionState c(Show show)
    {
        if (show == null)
        {
            return null;
        } else
        {
            return (new com.spotify.mobile.android.spotlets.show.proto.ProtoShowCollectionState.Builder()).is_in_collection(Boolean.valueOf(show.g())).build();
        }
    }

    public static ProtoEpisodeMetadata d(fio fio1)
    {
        if (fio1 == null)
        {
            return null;
        }
        com.spotify.mobile.android.spotlets.show.proto.ProtoEpisodeMetadata.Builder builder = (new com.spotify.mobile.android.spotlets.show.proto.ProtoEpisodeMetadata.Builder()).available(Boolean.valueOf(fio1.j())).covers(a(fio1.c())).description(fio1.e()).freeze_frames(a(fio1.d())).length(Integer.valueOf(fio1.k())).link(fio1.b()).manifest_id(fio1.f()).name(fio1.a()).publish_date(Long.valueOf(fio1.n()));
        Object obj = fio1.o();
        if (obj == null)
        {
            obj = null;
        } else
        {
            obj = (new com.spotify.mobile.android.spotlets.show.proto.ProtoEpisodeShowMetadata.Builder()).link(((Show) (obj)).b()).name(((Show) (obj)).a()).publisher(((Show) (obj)).d()).covers(a(((Show) (obj)).c())).build();
        }
        return builder.show(((com.spotify.mobile.android.spotlets.show.proto.ProtoEpisodeShowMetadata) (obj))).media_type_enum(Integer.valueOf(fio1.s().ordinal())).language(null).build();
    }

    public static ProtoShowPlayState d(Show show)
    {
        if (show == null)
        {
            return null;
        } else
        {
            return (new com.spotify.mobile.android.spotlets.show.proto.ProtoShowPlayState.Builder()).latest_played_episode_link(show.e()).build();
        }
    }
}
