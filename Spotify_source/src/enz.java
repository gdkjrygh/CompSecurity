// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import com.spotify.mobile.android.spotlets.collection.proto.ProtoAlbumArtistMetadata;
import com.spotify.mobile.android.spotlets.collection.proto.ProtoAlbumCollectionState;
import com.spotify.mobile.android.spotlets.collection.proto.ProtoAlbumMetadata;
import com.spotify.mobile.android.spotlets.collection.proto.ProtoAlbumOfflineState;
import com.spotify.mobile.android.spotlets.collection.proto.ProtoArtistCollectionState;
import com.spotify.mobile.android.spotlets.collection.proto.ProtoArtistMetadata;
import com.spotify.mobile.android.spotlets.collection.proto.ProtoArtistOfflineState;
import com.spotify.mobile.android.spotlets.collection.proto.ProtoCollectionAlbumsItem;
import com.spotify.mobile.android.spotlets.collection.proto.ProtoCollectionAlbumsResponse;
import com.spotify.mobile.android.spotlets.collection.proto.ProtoCollectionArtistsItem;
import com.spotify.mobile.android.spotlets.collection.proto.ProtoCollectionArtistsResponse;
import com.spotify.mobile.android.spotlets.collection.proto.ProtoCollectionTracksItem;
import com.spotify.mobile.android.spotlets.collection.proto.ProtoCollectionTracksResponse;
import com.spotify.mobile.android.spotlets.collection.proto.ProtoTrackAlbumArtistMetadata;
import com.spotify.mobile.android.spotlets.collection.proto.ProtoTrackAlbumMetadata;
import com.spotify.mobile.android.spotlets.collection.proto.ProtoTrackArtistMetadata;
import com.spotify.mobile.android.spotlets.collection.proto.ProtoTrackCollectionState;
import com.spotify.mobile.android.spotlets.collection.proto.ProtoTrackMetadata;
import com.spotify.mobile.android.spotlets.collection.proto.ProtoTrackOfflineState;
import com.spotify.mobile.android.spotlets.collection.proto.ProtoTrackPlayState;
import com.spotify.mobile.android.spotlets.show.model.Covers;
import com.spotify.mobile.android.spotlets.show.proto.ProtoImageGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class enz
{

    public static Covers a(ProtoImageGroup protoimagegroup)
    {
        if (protoimagegroup == null)
        {
            return null;
        } else
        {
            return new Covers(protoimagegroup) {

                private ProtoImageGroup a;

                public final String getImageUri(com.spotify.mobile.android.spotlets.show.model.Covers.Size size)
                {
                    return fit.a(this, size);
                }

                public final String getLargeUri()
                {
                    String s = a.large_link;
                    if (s == null)
                    {
                        s = "";
                    }
                    return (String)s;
                }

                public final String getSmallUri()
                {
                    String s = a.small_link;
                    if (s == null)
                    {
                        s = "";
                    }
                    return (String)s;
                }

                public final String getUri()
                {
                    String s = a.standard_link;
                    if (s == null)
                    {
                        s = "";
                    }
                    return (String)s;
                }

                public final String getXlargeUri()
                {
                    String s = a.xlarge_link;
                    if (s == null)
                    {
                        s = "";
                    }
                    return (String)s;
                }

            
            {
                a = protoimagegroup;
                super();
            }
            };
        }
    }

    public static enr a(ProtoAlbumMetadata protoalbummetadata, ProtoAlbumOfflineState protoalbumofflinestate, ProtoAlbumCollectionState protoalbumcollectionstate, String s)
    {
        if (!TextUtils.isEmpty(s))
        {
            return new enr(s) {

                private String a;

                public final ent getArtist()
                {
                    return null;
                }

                public final String getCollectionUri()
                {
                    return "";
                }

                public final String getCopyright()
                {
                    return "";
                }

                public final Covers getCovers()
                {
                    return null;
                }

                public final String getHeader()
                {
                    return a;
                }

                public final int getInferredOfflineState()
                {
                    return 0;
                }

                public final String getName()
                {
                    return "";
                }

                public final int getNumDiscs()
                {
                    return 0;
                }

                public final int getNumTracks()
                {
                    return 0;
                }

                public final int getNumTracksInCollection()
                {
                    return 0;
                }

                public final int getOfflineState()
                {
                    return 0;
                }

                public final int getSyncProgress()
                {
                    return 0;
                }

                public final String getUri()
                {
                    return "";
                }

                public final int getYear()
                {
                    return 0;
                }

                public final boolean isAnyTrackPlayable()
                {
                    return false;
                }

                public final boolean isHeader()
                {
                    return true;
                }

                public final boolean isSavedToCollection()
                {
                    return false;
                }

            
            {
                a = s;
                super();
            }
            };
        }
        if (protoalbummetadata == null)
        {
            return null;
        }
        int i;
        int j;
        if (protoalbumofflinestate == null)
        {
            s = "";
        } else
        {
            s = protoalbumofflinestate.offline;
        }
        i = com.spotify.mobile.android.provider.Metadata.OfflineSync.a(s);
        if (protoalbumofflinestate == null)
        {
            s = "";
        } else
        {
            s = protoalbumofflinestate.inferred_offline;
        }
        j = com.spotify.mobile.android.provider.Metadata.OfflineSync.a(s);
        return new enr(protoalbummetadata, a(protoalbummetadata.covers), protoalbumcollectionstate, i, j, protoalbumofflinestate) {

            private ProtoAlbumMetadata a;
            private Covers b;
            private ProtoAlbumCollectionState c;
            private int d;
            private int e;
            private ProtoAlbumOfflineState f;

            public final ent getArtist()
            {
                ProtoAlbumArtistMetadata protoalbumartistmetadata = a.artist;
                if (protoalbumartistmetadata == null)
                {
                    return null;
                } else
                {
                    return new ent(protoalbumartistmetadata) {

                        private ProtoAlbumArtistMetadata a;

                        public final String getCollectionUri()
                        {
                            return "";
                        }

                        public final Covers getCovers()
                        {
                            return null;
                        }

                        public final String getHeader()
                        {
                            return null;
                        }

                        public final int getInferredOfflineState()
                        {
                            return 0;
                        }

                        public final String getName()
                        {
                            return a.name;
                        }

                        public final int getNumAlbumsInCollection()
                        {
                            return 0;
                        }

                        public final int getNumTracksInCollection()
                        {
                            return 0;
                        }

                        public final int getOfflineState()
                        {
                            return 0;
                        }

                        public final int getSyncProgress()
                        {
                            return 0;
                        }

                        public final String getUri()
                        {
                            return a.link;
                        }

                        public final boolean isFollowed()
                        {
                            return false;
                        }

                        public final boolean isHeader()
                        {
                            return false;
                        }

                        public final boolean isVariousArtists()
                        {
                            return false;
                        }

            
            {
                a = protoalbumartistmetadata;
                super();
            }
                    };
                }
            }

            public final String getCollectionUri()
            {
                String s1;
                if (c == null)
                {
                    s1 = null;
                } else
                {
                    s1 = c.collection_link;
                }
                if (s1 == null)
                {
                    s1 = "";
                }
                return (String)s1;
            }

            public final String getCopyright()
            {
                String s1 = a.copyright;
                if (s1 == null)
                {
                    s1 = "";
                }
                return (String)s1;
            }

            public final Covers getCovers()
            {
                return b;
            }

            public final String getHeader()
            {
                return null;
            }

            public final int getInferredOfflineState()
            {
                return e;
            }

            public final String getName()
            {
                return a.name;
            }

            public final int getNumDiscs()
            {
                Integer integer = a.num_discs;
                if (integer == null)
                {
                    integer = Integer.valueOf(0);
                }
                return ((Integer)integer).intValue();
            }

            public final int getNumTracks()
            {
                Integer integer = a.num_tracks;
                if (integer == null)
                {
                    integer = Integer.valueOf(0);
                }
                return ((Integer)integer).intValue();
            }

            public final int getNumTracksInCollection()
            {
                Integer integer;
                if (c == null)
                {
                    integer = null;
                } else
                {
                    integer = c.num_tracks_in_collection;
                }
                if (integer == null)
                {
                    integer = Integer.valueOf(0);
                }
                return ((Integer)integer).intValue();
            }

            public final int getOfflineState()
            {
                return d;
            }

            public final int getSyncProgress()
            {
                Integer integer;
                if (f == null)
                {
                    integer = null;
                } else
                {
                    integer = f.sync_progress;
                }
                if (integer == null)
                {
                    integer = Integer.valueOf(0);
                }
                return ((Integer)integer).intValue();
            }

            public final String getUri()
            {
                return a.link;
            }

            public final int getYear()
            {
                Integer integer = a.year;
                if (integer == null)
                {
                    integer = Integer.valueOf(0);
                }
                return ((Integer)integer).intValue();
            }

            public final boolean isAnyTrackPlayable()
            {
                Boolean boolean1 = a.playability;
                if (boolean1 == null)
                {
                    boolean1 = Boolean.valueOf(false);
                }
                return ((Boolean)boolean1).booleanValue();
            }

            public final boolean isHeader()
            {
                return false;
            }

            public final boolean isSavedToCollection()
            {
                Boolean boolean1;
                if (c == null)
                {
                    boolean1 = null;
                } else
                {
                    boolean1 = c.complete;
                }
                if (boolean1 == null)
                {
                    boolean1 = Boolean.valueOf(false);
                }
                return ((Boolean)boolean1).booleanValue();
            }

            
            {
                a = protoalbummetadata;
                b = covers;
                c = protoalbumcollectionstate;
                d = i;
                e = j;
                f = protoalbumofflinestate;
                super();
            }
        };
    }

    public static enr a(ProtoCollectionAlbumsItem protocollectionalbumsitem)
    {
        if (protocollectionalbumsitem == null)
        {
            return null;
        } else
        {
            return a(protocollectionalbumsitem.album_metadata, protocollectionalbumsitem.offline_state, protocollectionalbumsitem.collection_state, protocollectionalbumsitem.header_field);
        }
    }

    public static ent a(ProtoArtistMetadata protoartistmetadata, ProtoArtistOfflineState protoartistofflinestate, ProtoArtistCollectionState protoartistcollectionstate, String s)
    {
        if (!TextUtils.isEmpty(s))
        {
            return new ent(s) {

                private String a;

                public final String getCollectionUri()
                {
                    return "";
                }

                public final Covers getCovers()
                {
                    return null;
                }

                public final String getHeader()
                {
                    return a;
                }

                public final int getInferredOfflineState()
                {
                    return 0;
                }

                public final String getName()
                {
                    return "";
                }

                public final int getNumAlbumsInCollection()
                {
                    return 0;
                }

                public final int getNumTracksInCollection()
                {
                    return 0;
                }

                public final int getOfflineState()
                {
                    return 0;
                }

                public final int getSyncProgress()
                {
                    return 0;
                }

                public final String getUri()
                {
                    return "";
                }

                public final boolean isFollowed()
                {
                    return false;
                }

                public final boolean isHeader()
                {
                    return true;
                }

                public final boolean isVariousArtists()
                {
                    return false;
                }

            
            {
                a = s;
                super();
            }
            };
        }
        if (protoartistmetadata == null)
        {
            return null;
        }
        int i;
        int j;
        if (protoartistofflinestate == null)
        {
            s = "";
        } else
        {
            s = protoartistofflinestate.offline;
        }
        i = com.spotify.mobile.android.provider.Metadata.OfflineSync.a(s);
        if (protoartistofflinestate == null)
        {
            s = "";
        } else
        {
            s = protoartistofflinestate.inferred_offline;
        }
        j = com.spotify.mobile.android.provider.Metadata.OfflineSync.a(s);
        return new ent(protoartistmetadata, a(protoartistmetadata.covers), protoartistcollectionstate, i, j, protoartistofflinestate) {

            private ProtoArtistMetadata a;
            private Covers b;
            private ProtoArtistCollectionState c;
            private int d;
            private int e;
            private ProtoArtistOfflineState f;

            public final String getCollectionUri()
            {
                String s1;
                if (c == null)
                {
                    s1 = null;
                } else
                {
                    s1 = c.collection_link;
                }
                if (s1 == null)
                {
                    s1 = "";
                }
                return (String)s1;
            }

            public final Covers getCovers()
            {
                return b;
            }

            public final String getHeader()
            {
                return null;
            }

            public final int getInferredOfflineState()
            {
                return e;
            }

            public final String getName()
            {
                return a.name;
            }

            public final int getNumAlbumsInCollection()
            {
                Integer integer;
                if (c == null)
                {
                    integer = null;
                } else
                {
                    integer = c.num_albums_in_collection;
                }
                if (integer == null)
                {
                    integer = Integer.valueOf(0);
                }
                return ((Integer)integer).intValue();
            }

            public final int getNumTracksInCollection()
            {
                Integer integer;
                if (c == null)
                {
                    integer = null;
                } else
                {
                    integer = c.num_tracks_in_collection;
                }
                if (integer == null)
                {
                    integer = Integer.valueOf(0);
                }
                return ((Integer)integer).intValue();
            }

            public final int getOfflineState()
            {
                return d;
            }

            public final int getSyncProgress()
            {
                Integer integer;
                if (f == null)
                {
                    integer = null;
                } else
                {
                    integer = f.sync_progress;
                }
                if (integer == null)
                {
                    integer = Integer.valueOf(0);
                }
                return ((Integer)integer).intValue();
            }

            public final String getUri()
            {
                return a.link;
            }

            public final boolean isFollowed()
            {
                Boolean boolean1;
                if (c == null)
                {
                    boolean1 = null;
                } else
                {
                    boolean1 = c.followed;
                }
                if (boolean1 == null)
                {
                    boolean1 = Boolean.valueOf(false);
                }
                return ((Boolean)boolean1).booleanValue();
            }

            public final boolean isHeader()
            {
                return false;
            }

            public final boolean isVariousArtists()
            {
                Boolean boolean1 = a.is_various_artists;
                if (boolean1 == null)
                {
                    boolean1 = Boolean.valueOf(false);
                }
                return ((Boolean)boolean1).booleanValue();
            }

            
            {
                a = protoartistmetadata;
                b = covers;
                c = protoartistcollectionstate;
                d = i;
                e = j;
                f = protoartistofflinestate;
                super();
            }
        };
    }

    public static ent a(ProtoCollectionArtistsItem protocollectionartistsitem)
    {
        if (protocollectionartistsitem == null)
        {
            return null;
        } else
        {
            return a(protocollectionartistsitem.artist_metadata, protocollectionartistsitem.offline_state, protocollectionartistsitem.collection_state, protocollectionartistsitem.header_field);
        }
    }

    public static enw a(ProtoCollectionTracksItem protocollectiontracksitem)
    {
        if (protocollectiontracksitem == null)
        {
            return null;
        } else
        {
            return a(protocollectiontracksitem.track_metadata, protocollectiontracksitem.offline_state, protocollectiontracksitem.play_state, protocollectiontracksitem.collection_state, protocollectiontracksitem.add_time, protocollectiontracksitem.header_field);
        }
    }

    public static enw a(ProtoTrackMetadata prototrackmetadata, ProtoTrackOfflineState prototrackofflinestate, ProtoTrackPlayState prototrackplaystate, ProtoTrackCollectionState prototrackcollectionstate, Integer integer, String s)
    {
        Object obj = null;
        if (!TextUtils.isEmpty(s))
        {
            s = new enw(s) {

                private String a;

                public final boolean canAddToCollection()
                {
                    return false;
                }

                public final int getAddTime()
                {
                    return 0;
                }

                public final enr getAlbum()
                {
                    return null;
                }

                public final List getArtists()
                {
                    return null;
                }

                public final String getHeader()
                {
                    return a;
                }

                public final String getName()
                {
                    return "";
                }

                public final int getOfflineState()
                {
                    return 0;
                }

                public final String getUri()
                {
                    return "";
                }

                public final boolean inCollection()
                {
                    return false;
                }

                public final boolean isAvailable()
                {
                    return false;
                }

                public final boolean isExplicit()
                {
                    return false;
                }

                public final boolean isHeader()
                {
                    return true;
                }

                public final boolean isLocal()
                {
                    return false;
                }

                public final boolean isPlayable()
                {
                    return false;
                }

            
            {
                a = s;
                super();
            }
            };
        } else
        {
            s = obj;
            if (prototrackmetadata != null)
            {
                int i;
                if (prototrackofflinestate == null)
                {
                    prototrackofflinestate = "";
                } else
                {
                    prototrackofflinestate = prototrackofflinestate.offline;
                }
                i = com.spotify.mobile.android.provider.Metadata.OfflineSync.a(prototrackofflinestate);
                s = new ArrayList();
                if (prototrackmetadata.artist != null)
                {
                    Iterator iterator = prototrackmetadata.artist.iterator();
                    while (iterator.hasNext()) 
                    {
                        prototrackofflinestate = (ProtoTrackArtistMetadata)iterator.next();
                        if (prototrackofflinestate == null)
                        {
                            prototrackofflinestate = null;
                        } else
                        {
                            prototrackofflinestate = new ent(prototrackofflinestate) {

                                private ProtoTrackArtistMetadata a;

                                public final String getCollectionUri()
                                {
                                    return "";
                                }

                                public final Covers getCovers()
                                {
                                    return null;
                                }

                                public final String getHeader()
                                {
                                    return null;
                                }

                                public final int getInferredOfflineState()
                                {
                                    return 0;
                                }

                                public final String getName()
                                {
                                    return a.name;
                                }

                                public final int getNumAlbumsInCollection()
                                {
                                    return 0;
                                }

                                public final int getNumTracksInCollection()
                                {
                                    return 0;
                                }

                                public final int getOfflineState()
                                {
                                    return 0;
                                }

                                public final int getSyncProgress()
                                {
                                    return 0;
                                }

                                public final String getUri()
                                {
                                    return a.link;
                                }

                                public final boolean isFollowed()
                                {
                                    return false;
                                }

                                public final boolean isHeader()
                                {
                                    return false;
                                }

                                public final boolean isVariousArtists()
                                {
                                    return false;
                                }

            
            {
                a = prototrackartistmetadata;
                super();
            }
                            };
                        }
                        s.add(prototrackofflinestate);
                    }
                }
                prototrackofflinestate = prototrackmetadata.album;
                if (prototrackofflinestate == null)
                {
                    prototrackofflinestate = null;
                } else
                {
                    prototrackofflinestate = new enr(prototrackofflinestate, a(((ProtoTrackAlbumMetadata) (prototrackofflinestate)).covers)) {

                        private ProtoTrackAlbumMetadata a;
                        private Covers b;

                        public final ent getArtist()
                        {
                            ProtoTrackAlbumArtistMetadata prototrackalbumartistmetadata = a.artist;
                            if (prototrackalbumartistmetadata == null)
                            {
                                return null;
                            } else
                            {
                                return new ent(prototrackalbumartistmetadata) {

                                    private ProtoTrackAlbumArtistMetadata a;

                                    public final String getCollectionUri()
                                    {
                                        return "";
                                    }

                                    public final Covers getCovers()
                                    {
                                        return null;
                                    }

                                    public final String getHeader()
                                    {
                                        return null;
                                    }

                                    public final int getInferredOfflineState()
                                    {
                                        return 0;
                                    }

                                    public final String getName()
                                    {
                                        return a.name;
                                    }

                                    public final int getNumAlbumsInCollection()
                                    {
                                        return 0;
                                    }

                                    public final int getNumTracksInCollection()
                                    {
                                        return 0;
                                    }

                                    public final int getOfflineState()
                                    {
                                        return 0;
                                    }

                                    public final int getSyncProgress()
                                    {
                                        return 0;
                                    }

                                    public final String getUri()
                                    {
                                        return a.link;
                                    }

                                    public final boolean isFollowed()
                                    {
                                        return false;
                                    }

                                    public final boolean isHeader()
                                    {
                                        return false;
                                    }

                                    public final boolean isVariousArtists()
                                    {
                                        return false;
                                    }

            
            {
                a = prototrackalbumartistmetadata;
                super();
            }
                                };
                            }
                        }

                        public final String getCollectionUri()
                        {
                            return "";
                        }

                        public final String getCopyright()
                        {
                            return "";
                        }

                        public final Covers getCovers()
                        {
                            return b;
                        }

                        public final String getHeader()
                        {
                            return null;
                        }

                        public final int getInferredOfflineState()
                        {
                            return 0;
                        }

                        public final String getName()
                        {
                            return a.name;
                        }

                        public final int getNumDiscs()
                        {
                            return 0;
                        }

                        public final int getNumTracks()
                        {
                            return 0;
                        }

                        public final int getNumTracksInCollection()
                        {
                            return 0;
                        }

                        public final int getOfflineState()
                        {
                            return 0;
                        }

                        public final int getSyncProgress()
                        {
                            return 0;
                        }

                        public final String getUri()
                        {
                            return a.link;
                        }

                        public final int getYear()
                        {
                            return 0;
                        }

                        public final boolean isAnyTrackPlayable()
                        {
                            return false;
                        }

                        public final boolean isHeader()
                        {
                            return false;
                        }

                        public final boolean isSavedToCollection()
                        {
                            return false;
                        }

            
            {
                a = prototrackalbummetadata;
                b = covers;
                super();
            }
                    };
                }
                return new enw(prototrackmetadata, prototrackofflinestate, s, prototrackcollectionstate, prototrackplaystate, i, integer) {

                    private ProtoTrackMetadata a;
                    private enr b;
                    private List c;
                    private ProtoTrackCollectionState d;
                    private ProtoTrackPlayState e;
                    private int f;
                    private Integer g;

                    public final boolean canAddToCollection()
                    {
                        if (d == null)
                        {
                            return false;
                        }
                        Boolean boolean1 = d.can_add_to_collection;
                        if (boolean1 == null)
                        {
                            boolean1 = Boolean.valueOf(false);
                        }
                        return ((Boolean)boolean1).booleanValue();
                    }

                    public final int getAddTime()
                    {
                        Integer integer1 = g;
                        if (integer1 == null)
                        {
                            integer1 = Integer.valueOf(0);
                        }
                        return ((Integer)integer1).intValue();
                    }

                    public final enr getAlbum()
                    {
                        return b;
                    }

                    public final List getArtists()
                    {
                        return c;
                    }

                    public final String getHeader()
                    {
                        return null;
                    }

                    public final String getName()
                    {
                        return a.name;
                    }

                    public final int getOfflineState()
                    {
                        return f;
                    }

                    public final String getUri()
                    {
                        return a.link;
                    }

                    public final boolean inCollection()
                    {
                        if (d == null)
                        {
                            return false;
                        }
                        Boolean boolean1 = d.is_in_collection;
                        if (boolean1 == null)
                        {
                            boolean1 = Boolean.valueOf(false);
                        }
                        return ((Boolean)boolean1).booleanValue();
                    }

                    public final boolean isAvailable()
                    {
                        Boolean boolean1 = a.available;
                        if (boolean1 == null)
                        {
                            boolean1 = Boolean.valueOf(false);
                        }
                        return ((Boolean)boolean1).booleanValue();
                    }

                    public final boolean isExplicit()
                    {
                        Boolean boolean1 = a.is_explicit;
                        if (boolean1 == null)
                        {
                            boolean1 = Boolean.valueOf(false);
                        }
                        return ((Boolean)boolean1).booleanValue();
                    }

                    public final boolean isHeader()
                    {
                        return false;
                    }

                    public final boolean isLocal()
                    {
                        Boolean boolean1 = a.is_local;
                        if (boolean1 == null)
                        {
                            boolean1 = Boolean.valueOf(false);
                        }
                        return ((Boolean)boolean1).booleanValue();
                    }

                    public final boolean isPlayable()
                    {
                        if (e == null)
                        {
                            return false;
                        }
                        Boolean boolean1 = e.is_playable;
                        if (boolean1 == null)
                        {
                            boolean1 = Boolean.valueOf(false);
                        }
                        return ((Boolean)boolean1).booleanValue();
                    }

            
            {
                a = prototrackmetadata;
                b = enr;
                c = list;
                d = prototrackcollectionstate;
                e = prototrackplaystate;
                f = i;
                g = integer;
                super();
            }
                };
            }
        }
        return s;
    }

    // Unreferenced inner class enz$1

/* anonymous class */
    public final class _cls1
        implements enx
    {

        private int a;
        private ProtoCollectionTracksResponse b;
        private enw c[];

        public final int a()
        {
            return a;
        }

        public final int b()
        {
            Integer integer = b.sync_progress;
            if (integer == null)
            {
                integer = Integer.valueOf(0);
            }
            return ((Integer)integer).intValue();
        }

        public final volatile Object[] getItems()
        {
            return c;
        }

        public final int getUnfilteredLength()
        {
            Integer integer = b.unfiltered_length;
            if (integer == null)
            {
                integer = Integer.valueOf(0);
            }
            return ((Integer)integer).intValue();
        }

        public final int getUnrangedLength()
        {
            Integer integer = b.unranged_length;
            if (integer == null)
            {
                integer = Integer.valueOf(0);
            }
            return ((Integer)integer).intValue();
        }

        public final boolean isLoading()
        {
            Boolean boolean1 = b.loading_contents;
            if (boolean1 == null)
            {
                boolean1 = Boolean.valueOf(false);
            }
            return ((Boolean)boolean1).booleanValue();
        }

            public 
            {
                a = i;
                b = protocollectiontracksresponse;
                c = aenw;
                super();
            }
    }


    // Unreferenced inner class enz$7

/* anonymous class */
    public final class _cls7
        implements fip
    {

        private enr a[];
        private ProtoCollectionAlbumsResponse b;

        public final volatile Object[] getItems()
        {
            return a;
        }

        public final int getUnfilteredLength()
        {
            Integer integer = b.unfiltered_length;
            if (integer == null)
            {
                integer = Integer.valueOf(0);
            }
            return ((Integer)integer).intValue();
        }

        public final int getUnrangedLength()
        {
            Integer integer = b.unranged_length;
            if (integer == null)
            {
                integer = Integer.valueOf(0);
            }
            return ((Integer)integer).intValue();
        }

        public final boolean isLoading()
        {
            Boolean boolean1 = b.loading_contents;
            if (boolean1 == null)
            {
                boolean1 = Boolean.valueOf(false);
            }
            return ((Boolean)boolean1).booleanValue();
        }

            public 
            {
                a = aenr;
                b = protocollectionalbumsresponse;
                super();
            }
    }


    // Unreferenced inner class enz$8

/* anonymous class */
    public final class _cls8
        implements fip
    {

        private ent a[];
        private ProtoCollectionArtistsResponse b;

        public final volatile Object[] getItems()
        {
            return a;
        }

        public final int getUnfilteredLength()
        {
            Integer integer = b.unfiltered_length;
            if (integer == null)
            {
                integer = Integer.valueOf(0);
            }
            return ((Integer)integer).intValue();
        }

        public final int getUnrangedLength()
        {
            Integer integer = b.unranged_length;
            if (integer == null)
            {
                integer = Integer.valueOf(0);
            }
            return ((Integer)integer).intValue();
        }

        public final boolean isLoading()
        {
            Boolean boolean1 = b.loading_contents;
            if (boolean1 == null)
            {
                boolean1 = Boolean.valueOf(false);
            }
            return ((Boolean)boolean1).booleanValue();
        }

            public 
            {
                a = aent;
                b = protocollectionartistsresponse;
                super();
            }
    }

}
