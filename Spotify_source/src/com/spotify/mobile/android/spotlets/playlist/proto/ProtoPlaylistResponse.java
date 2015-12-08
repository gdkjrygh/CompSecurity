// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.playlist.proto;

import com.squareup.wire.Message;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.spotify.mobile.android.spotlets.playlist.proto:
//            ProtoPlaylistHeader

public final class ProtoPlaylistResponse extends Message
{

    public static final Long DEFAULT_DURATION = Long.valueOf(0L);
    public static final List DEFAULT_ITEM = Collections.emptyList();
    public static final Boolean DEFAULT_LOADING_CONTENTS = Boolean.valueOf(false);
    public static final String DEFAULT_OFFLINE = "";
    public static final Integer DEFAULT_SYNC_PROGRESS = Integer.valueOf(0);
    public static final Integer DEFAULT_UNFILTERED_LENGTH = Integer.valueOf(0);
    public static final Integer DEFAULT_UNRANGED_LENGTH = Integer.valueOf(0);
    public final Long duration;
    public final List item;
    public final Boolean loading_contents;
    public final String offline;
    public final ProtoPlaylistHeader playlist;
    public final Integer sync_progress;
    public final Integer unfiltered_length;
    public final Integer unranged_length;

    private ProtoPlaylistResponse(Builder builder)
    {
        super(builder);
        item = e(builder.item);
        playlist = builder.playlist;
        unfiltered_length = builder.unfiltered_length;
        unranged_length = builder.unranged_length;
        duration = builder.duration;
        loading_contents = builder.loading_contents;
        offline = builder.offline;
        sync_progress = builder.sync_progress;
    }

    ProtoPlaylistResponse(Builder builder, byte byte0)
    {
        this(builder);
    }

    static List a(List list)
    {
        return d(list);
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof ProtoPlaylistResponse))
            {
                return false;
            }
            obj = (ProtoPlaylistResponse)obj;
            if (!a(item, ((ProtoPlaylistResponse) (obj)).item) || !a(playlist, ((ProtoPlaylistResponse) (obj)).playlist) || !a(unfiltered_length, ((ProtoPlaylistResponse) (obj)).unfiltered_length) || !a(unranged_length, ((ProtoPlaylistResponse) (obj)).unranged_length) || !a(duration, ((ProtoPlaylistResponse) (obj)).duration) || !a(loading_contents, ((ProtoPlaylistResponse) (obj)).loading_contents) || !a(offline, ((ProtoPlaylistResponse) (obj)).offline) || !a(sync_progress, ((ProtoPlaylistResponse) (obj)).sync_progress))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        int i2 = 0;
        int j = hashCode;
        int i = j;
        if (j == 0)
        {
            int k;
            int l;
            int i1;
            int j1;
            int k1;
            int l1;
            if (item != null)
            {
                i = item.hashCode();
            } else
            {
                i = 1;
            }
            if (playlist != null)
            {
                k = playlist.hashCode();
            } else
            {
                k = 0;
            }
            if (unfiltered_length != null)
            {
                l = unfiltered_length.hashCode();
            } else
            {
                l = 0;
            }
            if (unranged_length != null)
            {
                i1 = unranged_length.hashCode();
            } else
            {
                i1 = 0;
            }
            if (duration != null)
            {
                j1 = duration.hashCode();
            } else
            {
                j1 = 0;
            }
            if (loading_contents != null)
            {
                k1 = loading_contents.hashCode();
            } else
            {
                k1 = 0;
            }
            if (offline != null)
            {
                l1 = offline.hashCode();
            } else
            {
                l1 = 0;
            }
            if (sync_progress != null)
            {
                i2 = sync_progress.hashCode();
            }
            i = (l1 + (k1 + (j1 + (i1 + (l + (k + i * 37) * 37) * 37) * 37) * 37) * 37) * 37 + i2;
            hashCode = i;
        }
        return i;
    }


    private class Builder extends gxc
    {

        public Long duration;
        public List item;
        public Boolean loading_contents;
        public String offline;
        public ProtoPlaylistHeader playlist;
        public Integer sync_progress;
        public Integer unfiltered_length;
        public Integer unranged_length;

        public final ProtoPlaylistResponse build()
        {
            return new ProtoPlaylistResponse(this, (byte)0);
        }

        public final volatile Message build()
        {
            return build();
        }

        public final Builder duration(Long long1)
        {
            duration = long1;
            return this;
        }

        public final Builder item(List list)
        {
            item = checkForNulls(list);
            return this;
        }

        public final Builder loading_contents(Boolean boolean1)
        {
            loading_contents = boolean1;
            return this;
        }

        public final Builder offline(String s)
        {
            offline = s;
            return this;
        }

        public final Builder playlist(ProtoPlaylistHeader protoplaylistheader)
        {
            playlist = protoplaylistheader;
            return this;
        }

        public final Builder sync_progress(Integer integer)
        {
            sync_progress = integer;
            return this;
        }

        public final Builder unfiltered_length(Integer integer)
        {
            unfiltered_length = integer;
            return this;
        }

        public final Builder unranged_length(Integer integer)
        {
            unranged_length = integer;
            return this;
        }

        public Builder()
        {
        }

        public Builder(ProtoPlaylistResponse protoplaylistresponse)
        {
            super(protoplaylistresponse);
            if (protoplaylistresponse == null)
            {
                return;
            } else
            {
                item = ProtoPlaylistResponse.a(protoplaylistresponse.item);
                playlist = protoplaylistresponse.playlist;
                unfiltered_length = protoplaylistresponse.unfiltered_length;
                unranged_length = protoplaylistresponse.unranged_length;
                duration = protoplaylistresponse.duration;
                loading_contents = protoplaylistresponse.loading_contents;
                offline = protoplaylistresponse.offline;
                sync_progress = protoplaylistresponse.sync_progress;
                return;
            }
        }
    }

}
