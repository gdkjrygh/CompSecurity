// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.spotlets.collection.proto.ProtoCollectionAlbumsItem;
import com.spotify.mobile.android.spotlets.collection.proto.ProtoCollectionArtistsItem;
import com.spotify.mobile.android.spotlets.collection.proto.ProtoCollectionTracksItem;
import com.spotify.mobile.android.spotlets.show.model.Covers;
import com.spotify.mobile.android.spotlets.show.proto.ProtoImageGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class eoa
{

    public static ProtoCollectionAlbumsItem a(enr enr1)
    {
        Object obj1 = null;
        Object obj2 = null;
        if (enr1 == null)
        {
            return null;
        }
        com.spotify.mobile.android.spotlets.collection.proto.ProtoCollectionAlbumsItem.Builder builder1 = new com.spotify.mobile.android.spotlets.collection.proto.ProtoCollectionAlbumsItem.Builder();
        Object obj;
        if (enr1 == null)
        {
            obj = null;
        } else
        {
            obj = (new com.spotify.mobile.android.spotlets.collection.proto.ProtoAlbumOfflineState.Builder()).inferred_offline(fit.b(enr1.getOfflineState())).offline(fit.b(enr1.getInferredOfflineState())).sync_progress(Integer.valueOf(enr1.getSyncProgress())).build();
        }
        builder1 = builder1.offline_state(((com.spotify.mobile.android.spotlets.collection.proto.ProtoAlbumOfflineState) (obj)));
        if (enr1 == null)
        {
            obj = null;
        } else
        {
            obj = (new com.spotify.mobile.android.spotlets.collection.proto.ProtoAlbumCollectionState.Builder()).collection_link(enr1.getCollectionUri()).complete(Boolean.valueOf(enr1.isSavedToCollection())).num_tracks_in_collection(Integer.valueOf(enr1.getNumTracksInCollection())).build();
        }
        builder1 = builder1.collection_state(((com.spotify.mobile.android.spotlets.collection.proto.ProtoAlbumCollectionState) (obj)));
        if (enr1 == null)
        {
            obj = obj2;
        } else
        {
            com.spotify.mobile.android.spotlets.collection.proto.ProtoAlbumMetadata.Builder builder = (new com.spotify.mobile.android.spotlets.collection.proto.ProtoAlbumMetadata.Builder()).name(enr1.getName()).link(enr1.getUri());
            obj = enr1.getArtist();
            if (obj == null)
            {
                obj = obj1;
            } else
            {
                obj = (new com.spotify.mobile.android.spotlets.collection.proto.ProtoAlbumArtistMetadata.Builder()).name(((ent) (obj)).getName()).link(((ent) (obj)).getUri()).build();
            }
            obj = builder.artist(((com.spotify.mobile.android.spotlets.collection.proto.ProtoAlbumArtistMetadata) (obj))).copyright(enr1.getCopyright()).num_discs(Integer.valueOf(enr1.getNumDiscs())).num_tracks(Integer.valueOf(enr1.getNumTracks())).year(Integer.valueOf(enr1.getYear())).playability(Boolean.valueOf(enr1.isAnyTrackPlayable())).covers(a(enr1.getCovers())).build();
        }
        return builder1.album_metadata(((com.spotify.mobile.android.spotlets.collection.proto.ProtoAlbumMetadata) (obj))).header_field(enr1.getHeader()).add_time(Integer.valueOf(0)).headerless_index(Integer.valueOf(0)).build();
    }

    public static ProtoCollectionArtistsItem a(ent ent1)
    {
        Object obj1 = null;
        if (ent1 == null)
        {
            return null;
        }
        com.spotify.mobile.android.spotlets.collection.proto.ProtoCollectionArtistsItem.Builder builder = new com.spotify.mobile.android.spotlets.collection.proto.ProtoCollectionArtistsItem.Builder();
        Object obj;
        if (ent1 == null)
        {
            obj = null;
        } else
        {
            obj = (new com.spotify.mobile.android.spotlets.collection.proto.ProtoArtistOfflineState.Builder()).inferred_offline(fit.b(ent1.getOfflineState())).offline(fit.b(ent1.getInferredOfflineState())).sync_progress(Integer.valueOf(ent1.getSyncProgress())).build();
        }
        builder = builder.offline_state(((com.spotify.mobile.android.spotlets.collection.proto.ProtoArtistOfflineState) (obj)));
        if (ent1 == null)
        {
            obj = null;
        } else
        {
            obj = (new com.spotify.mobile.android.spotlets.collection.proto.ProtoArtistCollectionState.Builder()).collection_link(ent1.getCollectionUri()).followed(Boolean.valueOf(ent1.isFollowed())).num_albums_in_collection(Integer.valueOf(ent1.getNumAlbumsInCollection())).num_tracks_in_collection(Integer.valueOf(ent1.getNumTracksInCollection())).build();
        }
        builder = builder.collection_state(((com.spotify.mobile.android.spotlets.collection.proto.ProtoArtistCollectionState) (obj)));
        if (ent1 == null)
        {
            obj = obj1;
        } else
        {
            obj = (new com.spotify.mobile.android.spotlets.collection.proto.ProtoArtistMetadata.Builder()).name(ent1.getName()).link(ent1.getUri()).is_various_artists(Boolean.valueOf(ent1.isVariousArtists())).covers(a(ent1.getCovers())).build();
        }
        return builder.artist_metadata(((com.spotify.mobile.android.spotlets.collection.proto.ProtoArtistMetadata) (obj))).header_field(ent1.getHeader()).add_time(Integer.valueOf(0)).headerless_index(Integer.valueOf(0)).build();
    }

    public static ProtoCollectionTracksItem a(enw enw1)
    {
        Object obj1 = null;
        if (enw1 == null)
        {
            return null;
        }
        com.spotify.mobile.android.spotlets.collection.proto.ProtoCollectionTracksItem.Builder builder = new com.spotify.mobile.android.spotlets.collection.proto.ProtoCollectionTracksItem.Builder();
        Object obj;
        if (enw1 == null)
        {
            obj = null;
        } else
        {
            obj = (new com.spotify.mobile.android.spotlets.collection.proto.ProtoTrackOfflineState.Builder()).offline(fit.b(enw1.getOfflineState())).build();
        }
        builder = builder.offline_state(((com.spotify.mobile.android.spotlets.collection.proto.ProtoTrackOfflineState) (obj)));
        if (enw1 == null)
        {
            obj = null;
        } else
        {
            obj = (new com.spotify.mobile.android.spotlets.collection.proto.ProtoTrackPlayState.Builder()).is_playable(Boolean.valueOf(enw1.isPlayable())).build();
        }
        builder = builder.play_state(((com.spotify.mobile.android.spotlets.collection.proto.ProtoTrackPlayState) (obj)));
        if (enw1 == null)
        {
            obj = null;
        } else
        {
            ArrayList arraylist = new ArrayList(enw1.getArtists().size());
            Object obj2 = enw1.getArtists().iterator();
            while (((Iterator) (obj2)).hasNext()) 
            {
                obj = (ent)((Iterator) (obj2)).next();
                if (obj == null)
                {
                    obj = null;
                } else
                {
                    obj = (new com.spotify.mobile.android.spotlets.collection.proto.ProtoTrackArtistMetadata.Builder()).link(((ent) (obj)).getUri()).name(((ent) (obj)).getName()).build();
                }
                arraylist.add(obj);
            }
            obj2 = new com.spotify.mobile.android.spotlets.collection.proto.ProtoTrackMetadata.Builder();
            obj = enw1.getAlbum();
            if (obj == null)
            {
                obj = null;
            } else
            {
                com.spotify.mobile.android.spotlets.collection.proto.ProtoTrackAlbumMetadata.Builder builder1 = (new com.spotify.mobile.android.spotlets.collection.proto.ProtoTrackAlbumMetadata.Builder()).name(((enr) (obj)).getName()).link(((enr) (obj)).getUri()).covers(a(((enr) (obj)).getCovers()));
                obj = ((enr) (obj)).getArtist();
                if (obj == null)
                {
                    obj = null;
                } else
                {
                    obj = (new com.spotify.mobile.android.spotlets.collection.proto.ProtoTrackAlbumArtistMetadata.Builder()).link(((ent) (obj)).getUri()).name(((ent) (obj)).getName()).build();
                }
                obj = builder1.artist(((com.spotify.mobile.android.spotlets.collection.proto.ProtoTrackAlbumArtistMetadata) (obj))).build();
            }
            obj = ((com.spotify.mobile.android.spotlets.collection.proto.ProtoTrackMetadata.Builder) (obj2)).album(((com.spotify.mobile.android.spotlets.collection.proto.ProtoTrackAlbumMetadata) (obj))).artist(arraylist).available(Boolean.valueOf(enw1.isAvailable())).is_explicit(Boolean.valueOf(enw1.isExplicit())).is_local(Boolean.valueOf(enw1.isLocal())).link(enw1.getUri()).name(enw1.getName()).length(Integer.valueOf(0)).track_number(Integer.valueOf(0)).disc_number(Integer.valueOf(0)).build();
        }
        builder = builder.track_metadata(((com.spotify.mobile.android.spotlets.collection.proto.ProtoTrackMetadata) (obj)));
        if (enw1 == null)
        {
            obj = obj1;
        } else
        {
            obj = (new com.spotify.mobile.android.spotlets.collection.proto.ProtoTrackCollectionState.Builder()).is_in_collection(Boolean.valueOf(enw1.inCollection())).can_add_to_collection(Boolean.valueOf(enw1.canAddToCollection())).build();
        }
        return builder.collection_state(((com.spotify.mobile.android.spotlets.collection.proto.ProtoTrackCollectionState) (obj))).header_field(enw1.getHeader()).add_time(Integer.valueOf(enw1.getAddTime())).headerless_index(Integer.valueOf(0)).build();
    }

    public static ProtoImageGroup a(Covers covers)
    {
        if (covers == null)
        {
            return null;
        } else
        {
            return (new com.spotify.mobile.android.spotlets.show.proto.ProtoImageGroup.Builder()).standard_link(covers.getUri()).small_link(covers.getSmallUri()).large_link(covers.getLargeUri()).xlarge_link(covers.getXlargeUri()).build();
        }
    }
}
