// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import com.spotify.mobile.android.spotlets.show.model.Covers;
import com.spotify.mobile.android.spotlets.show.model.Show;
import com.spotify.mobile.android.spotlets.show.proto.ProtoEpisodeCollectionState;
import com.spotify.mobile.android.spotlets.show.proto.ProtoEpisodeMetadata;
import com.spotify.mobile.android.spotlets.show.proto.ProtoEpisodeOfflineState;
import com.spotify.mobile.android.spotlets.show.proto.ProtoEpisodePlayState;
import com.spotify.mobile.android.spotlets.show.proto.ProtoEpisodeShowMetadata;
import com.spotify.mobile.android.spotlets.show.proto.ProtoImageGroup;
import com.spotify.mobile.android.spotlets.show.proto.ProtoOfflinedEpisodesRequestItem;
import com.spotify.mobile.android.spotlets.show.proto.ProtoOfflinedEpisodesResponse;
import com.spotify.mobile.android.spotlets.show.proto.ProtoOnlineData;
import com.spotify.mobile.android.spotlets.show.proto.ProtoShowCollectionState;
import com.spotify.mobile.android.spotlets.show.proto.ProtoShowMetadata;
import com.spotify.mobile.android.spotlets.show.proto.ProtoShowPlayState;
import com.spotify.mobile.android.spotlets.show.proto.ProtoShowRequestHeader;
import com.spotify.mobile.android.spotlets.show.proto.ProtoShowRequestItem;
import com.spotify.mobile.android.spotlets.show.proto.ProtoShowResponse;
import com.spotify.mobile.android.spotlets.show.proto.ProtoShowsRequestItem;
import com.spotify.mobile.android.spotlets.show.proto.ProtoShowsResponse;
import com.spotify.mobile.android.spotlets.show.proto.ProtoUnplayedEpisodesRequestItem;
import com.spotify.mobile.android.spotlets.show.proto.ProtoUnplayedEpisodesResponse;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class fiu
{

    private static Covers a(ProtoImageGroup protoimagegroup)
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

    public static Show a(ProtoShowMetadata protoshowmetadata, ProtoShowCollectionState protoshowcollectionstate, ProtoShowPlayState protoshowplaystate)
    {
        if (protoshowmetadata == null)
        {
            return null;
        }
        Covers covers = a(protoshowmetadata.covers);
        com.spotify.mobile.android.spotlets.show.model.Show.ConsumptionOrder consumptionorder = fit.a(protoshowmetadata.consumption_order);
        Integer integer = protoshowmetadata.media_type_enum;
        if (integer == null)
        {
            integer = Integer.valueOf(-1);
        }
        return new Show(protoshowmetadata, covers, protoshowplaystate, protoshowcollectionstate, consumptionorder, fit.a(((Integer)integer).intValue())) {

            private ProtoShowMetadata a;
            private Covers b;
            private ProtoShowPlayState c;
            private ProtoShowCollectionState d;
            private com.spotify.mobile.android.spotlets.show.model.Show.ConsumptionOrder e;
            private com.spotify.mobile.android.spotlets.show.model.Show.MediaType f;

            public final String a()
            {
                return a.name;
            }

            public final String b()
            {
                return a.link;
            }

            public final Covers c()
            {
                return b;
            }

            public final String d()
            {
                return a.publisher;
            }

            public final String e()
            {
                if (c == null)
                {
                    return "";
                } else
                {
                    return c.latest_played_episode_link;
                }
            }

            public final String f()
            {
                return a.description;
            }

            public final boolean g()
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

            public final String getHeader()
            {
                return null;
            }

            public final com.spotify.mobile.android.spotlets.show.model.Show.ConsumptionOrder h()
            {
                return e;
            }

            public final com.spotify.mobile.android.spotlets.show.model.Show.MediaType i()
            {
                return f;
            }

            public final boolean isHeader()
            {
                return false;
            }

            
            {
                a = protoshowmetadata;
                b = covers;
                c = protoshowplaystate;
                d = protoshowcollectionstate;
                e = consumptionorder;
                f = mediatype;
                super();
            }
        };
    }

    public static Show a(ProtoShowsRequestItem protoshowsrequestitem)
    {
        if (protoshowsrequestitem == null)
        {
            return null;
        } else
        {
            return a(protoshowsrequestitem.show_metadata, protoshowsrequestitem.show_collection_state, protoshowsrequestitem.show_play_state);
        }
    }

    public static fio a(ProtoEpisodeMetadata protoepisodemetadata, ProtoEpisodeOfflineState protoepisodeofflinestate, ProtoEpisodePlayState protoepisodeplaystate, ProtoEpisodeCollectionState protoepisodecollectionstate, String s)
    {
        Object obj = new HashMap();
        if (!TextUtils.isEmpty(s))
        {
            return new fio(((Map) (obj)), s) {

                private Map a;
                private String b;

                public final String a()
                {
                    return "";
                }

                public final String b()
                {
                    return "";
                }

                public final Covers c()
                {
                    return null;
                }

                public final Covers d()
                {
                    return null;
                }

                public final String e()
                {
                    return "";
                }

                public final String f()
                {
                    return "";
                }

                public final boolean g()
                {
                    return false;
                }

                public final String getHeader()
                {
                    return b;
                }

                public final boolean h()
                {
                    return false;
                }

                public final boolean i()
                {
                    return false;
                }

                public final boolean isHeader()
                {
                    return true;
                }

                public final boolean j()
                {
                    return false;
                }

                public final int k()
                {
                    return 0;
                }

                public final Integer l()
                {
                    return null;
                }

                public final boolean m()
                {
                    return false;
                }

                public final int n()
                {
                    return 0;
                }

                public final Show o()
                {
                    return null;
                }

                public final int p()
                {
                    return 0;
                }

                public final int q()
                {
                    return 0;
                }

                public final Map r()
                {
                    return a;
                }

                public final com.spotify.mobile.android.spotlets.show.model.Show.MediaType s()
                {
                    return com.spotify.mobile.android.spotlets.show.model.Show.MediaType.d;
                }

            
            {
                a = map;
                b = s1;
                super();
            }
            };
        }
        if (protoepisodemetadata == null)
        {
            return null;
        }
        Covers covers;
        Covers covers1;
        int i;
        if (protoepisodeofflinestate == null)
        {
            s = "";
        } else
        {
            s = protoepisodeofflinestate.offline_state;
        }
        i = com.spotify.mobile.android.provider.Metadata.OfflineSync.a(s);
        covers = a(protoepisodemetadata.covers);
        covers1 = a(protoepisodemetadata.freeze_frames);
        s = protoepisodemetadata.show;
        if (s == null)
        {
            s = null;
        } else
        {
            s = new Show(s, a(((ProtoEpisodeShowMetadata) (s)).covers)) {

                private ProtoEpisodeShowMetadata a;
                private Covers b;

                public final String a()
                {
                    return a.name;
                }

                public final String b()
                {
                    return a.link;
                }

                public final Covers c()
                {
                    return b;
                }

                public final String d()
                {
                    return a.publisher;
                }

                public final String e()
                {
                    return "";
                }

                public final String f()
                {
                    return "";
                }

                public final boolean g()
                {
                    return false;
                }

                public final String getHeader()
                {
                    return null;
                }

                public final com.spotify.mobile.android.spotlets.show.model.Show.ConsumptionOrder h()
                {
                    return com.spotify.mobile.android.spotlets.show.model.Show.ConsumptionOrder.a;
                }

                public final com.spotify.mobile.android.spotlets.show.model.Show.MediaType i()
                {
                    return com.spotify.mobile.android.spotlets.show.model.Show.MediaType.d;
                }

                public final boolean isHeader()
                {
                    return false;
                }

            
            {
                a = protoepisodeshowmetadata;
                b = covers;
                super();
            }
            };
        }
        obj = protoepisodemetadata.media_type_enum;
        if (obj == null)
        {
            obj = Integer.valueOf(-1);
        }
        obj = fit.a(((Integer)obj).intValue());
        return new fio(protoepisodemetadata, covers, covers1, protoepisodecollectionstate, protoepisodeplaystate, s, i, protoepisodeofflinestate, fit.a(covers, covers1, protoepisodemetadata.name, protoepisodemetadata.manifest_id, s, ((com.spotify.mobile.android.spotlets.show.model.Show.MediaType) (obj))), ((com.spotify.mobile.android.spotlets.show.model.Show.MediaType) (obj))) {

            private ProtoEpisodeMetadata a;
            private Covers b;
            private Covers c;
            private ProtoEpisodeCollectionState d;
            private ProtoEpisodePlayState e;
            private Show f;
            private int g;
            private ProtoEpisodeOfflineState h;
            private Map i;
            private com.spotify.mobile.android.spotlets.show.model.Show.MediaType j;

            public final String a()
            {
                return a.name;
            }

            public final String b()
            {
                return a.link;
            }

            public final Covers c()
            {
                return b;
            }

            public final Covers d()
            {
                return c;
            }

            public final String e()
            {
                return a.description;
            }

            public final String f()
            {
                return a.manifest_id;
            }

            public final boolean g()
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

            public final String getHeader()
            {
                return "";
            }

            public final boolean h()
            {
                if (d == null)
                {
                    return false;
                }
                Boolean boolean1 = d.is_new;
                if (boolean1 == null)
                {
                    boolean1 = Boolean.valueOf(false);
                }
                return ((Boolean)boolean1).booleanValue();
            }

            public final boolean i()
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

            public final boolean isHeader()
            {
                return false;
            }

            public final boolean j()
            {
                Boolean boolean1 = a.available;
                if (boolean1 == null)
                {
                    boolean1 = Boolean.valueOf(false);
                }
                return ((Boolean)boolean1).booleanValue();
            }

            public final int k()
            {
                Integer integer = a.length;
                if (integer == null)
                {
                    integer = Integer.valueOf(0);
                }
                return ((Integer)integer).intValue();
            }

            public final Integer l()
            {
                Integer integer;
label0:
                {
                    Integer integer1 = e.time_left;
                    if (integer1 != null)
                    {
                        integer = integer1;
                        if (integer1.intValue() >= 0)
                        {
                            break label0;
                        }
                    }
                    integer = null;
                }
                return integer;
            }

            public final boolean m()
            {
                if (e == null)
                {
                    return false;
                }
                Boolean boolean1 = e.is_played;
                if (boolean1 == null)
                {
                    boolean1 = Boolean.valueOf(false);
                }
                return ((Boolean)boolean1).booleanValue();
            }

            public final int n()
            {
                Long long1 = a.publish_date;
                long l1;
                if (long1 == null)
                {
                    l1 = 0L;
                } else
                {
                    l1 = long1.longValue();
                }
                return (int)l1;
            }

            public final Show o()
            {
                return f;
            }

            public final int p()
            {
                return g;
            }

            public final int q()
            {
                Integer integer;
                if (h == null)
                {
                    integer = null;
                } else
                {
                    integer = h.sync_progress;
                }
                if (integer == null)
                {
                    return 0;
                } else
                {
                    return integer.intValue();
                }
            }

            public final Map r()
            {
                return i;
            }

            public final com.spotify.mobile.android.spotlets.show.model.Show.MediaType s()
            {
                return j;
            }

            
            {
                a = protoepisodemetadata;
                b = covers;
                c = covers1;
                d = protoepisodecollectionstate;
                e = protoepisodeplaystate;
                f = show;
                g = i1;
                h = protoepisodeofflinestate;
                i = map;
                j = mediatype;
                super();
            }
        };
    }

    public static fip a(ProtoOfflinedEpisodesResponse protoofflinedepisodesresponse)
    {
        if (protoofflinedepisodesresponse == null)
        {
            return null;
        }
        fio afio[] = new fio[protoofflinedepisodesresponse.item.size()];
        Iterator iterator = protoofflinedepisodesresponse.item.iterator();
        for (int i = 0; iterator.hasNext(); i++)
        {
            ProtoOfflinedEpisodesRequestItem protoofflinedepisodesrequestitem = (ProtoOfflinedEpisodesRequestItem)iterator.next();
            afio[i] = a(protoofflinedepisodesrequestitem.episode_metadata, protoofflinedepisodesrequestitem.episode_offline_state, protoofflinedepisodesrequestitem.episode_play_state, protoofflinedepisodesrequestitem.episode_collection_state, protoofflinedepisodesrequestitem.header);
        }

        return new fip(afio, protoofflinedepisodesresponse) {

            private fio a[];
            private ProtoOfflinedEpisodesResponse b;

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

            
            {
                a = afio;
                b = protoofflinedepisodesresponse;
                super();
            }
        };
    }

    public static fip a(ProtoUnplayedEpisodesResponse protounplayedepisodesresponse)
    {
        if (protounplayedepisodesresponse == null)
        {
            return null;
        }
        fio afio[] = new fio[protounplayedepisodesresponse.item.size()];
        Iterator iterator = protounplayedepisodesresponse.item.iterator();
        for (int i = 0; iterator.hasNext(); i++)
        {
            ProtoUnplayedEpisodesRequestItem protounplayedepisodesrequestitem = (ProtoUnplayedEpisodesRequestItem)iterator.next();
            afio[i] = a(protounplayedepisodesrequestitem.episode_metadata, protounplayedepisodesrequestitem.episode_offline_state, protounplayedepisodesrequestitem.episode_play_state, protounplayedepisodesrequestitem.episode_collection_state, protounplayedepisodesrequestitem.header);
        }

        return new fip(afio, protounplayedepisodesresponse) {

            private fio a[];
            private ProtoUnplayedEpisodesResponse b;

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

            
            {
                a = afio;
                b = protounplayedepisodesresponse;
                super();
            }
        };
    }

    public static fir a(ProtoShowResponse protoshowresponse)
    {
        if (protoshowresponse == null || protoshowresponse.header == null)
        {
            return null;
        }
        Show show = a(protoshowresponse.header.show_metadata, protoshowresponse.header.show_collection_state, protoshowresponse.header.show_play_state);
        Object obj = protoshowresponse.online_data;
        fio afio[];
        Iterator iterator;
        if (obj == null)
        {
            obj = null;
        } else
        {
            obj = new fiq(((ProtoOnlineData) (obj))) {

                private ProtoOnlineData a;

                public final int a()
                {
                    Integer integer = a.num_followers;
                    if (integer == null)
                    {
                        integer = Integer.valueOf(0);
                    }
                    return ((Integer)integer).intValue();
                }

            
            {
                a = protoonlinedata;
                super();
            }
            };
        }
        afio = new fio[protoshowresponse.item.size()];
        iterator = protoshowresponse.item.iterator();
        for (int i = 0; iterator.hasNext(); i++)
        {
            ProtoShowRequestItem protoshowrequestitem = (ProtoShowRequestItem)iterator.next();
            afio[i] = a(protoshowrequestitem.episode_metadata, protoshowrequestitem.episode_offline_state, protoshowrequestitem.episode_play_state, protoshowrequestitem.episode_collection_state, protoshowrequestitem.header);
        }

        return new fir(show, ((fiq) (obj)), afio, protoshowresponse) {

            private Show a;
            private fiq b;
            private fio c[];
            private ProtoShowResponse d;

            public final Show a()
            {
                return a;
            }

            public final fiq b()
            {
                return b;
            }

            public final volatile Object[] getItems()
            {
                return c;
            }

            public final int getUnfilteredLength()
            {
                Integer integer = d.unfiltered_length;
                if (integer == null)
                {
                    integer = Integer.valueOf(0);
                }
                return ((Integer)integer).intValue();
            }

            public final int getUnrangedLength()
            {
                Integer integer = d.unranged_length;
                if (integer == null)
                {
                    integer = Integer.valueOf(0);
                }
                return ((Integer)integer).intValue();
            }

            public final boolean isLoading()
            {
                Boolean boolean1 = d.loading_contents;
                if (boolean1 == null)
                {
                    boolean1 = Boolean.valueOf(false);
                }
                return ((Boolean)boolean1).booleanValue();
            }

            
            {
                a = show;
                b = fiq;
                c = afio;
                d = protoshowresponse;
                super();
            }
        };
    }

    // Unreferenced inner class fiu$3

/* anonymous class */
    public final class _cls3
        implements fis
    {

        private ProtoShowsResponse a;
        private Show b[];

        public final int a()
        {
            Integer integer = a.num_offlined_episodes;
            if (integer == null)
            {
                integer = Integer.valueOf(0);
            }
            return ((Integer)integer).intValue();
        }

        public final volatile Object[] getItems()
        {
            return b;
        }

        public final int getUnfilteredLength()
        {
            Integer integer = a.unfiltered_length;
            if (integer == null)
            {
                integer = Integer.valueOf(0);
            }
            return ((Integer)integer).intValue();
        }

        public final int getUnrangedLength()
        {
            Integer integer = a.unranged_length;
            if (integer == null)
            {
                integer = Integer.valueOf(0);
            }
            return ((Integer)integer).intValue();
        }

        public final boolean isLoading()
        {
            Boolean boolean1 = a.loading_contents;
            if (boolean1 == null)
            {
                boolean1 = Boolean.valueOf(false);
            }
            return ((Boolean)boolean1).booleanValue();
        }

            public 
            {
                a = protoshowsresponse;
                b = ashow;
                super();
            }
    }

}
