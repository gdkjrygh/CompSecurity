// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.playlist.proto;

import com.spotify.mobile.android.spotlets.show.proto.ProtoImageGroup;
import com.squareup.wire.Message;
import gxc;

// Referenced classes of package com.spotify.mobile.android.spotlets.playlist.proto:
//            ProtoPlaylistMetadata, ProtoUser

public final class e_offline extends gxc
{

    public Boolean browsable_offline;
    public Boolean collaborative;
    public String description;
    public Boolean followed;
    public String link;
    public String name;
    public Boolean owned_by_self;
    public ProtoUser owner;
    public ProtoImageGroup pictures;
    public Boolean published;
    public Integer total_length;

    public final e_offline browsable_offline(Boolean boolean1)
    {
        browsable_offline = boolean1;
        return this;
    }

    public final ProtoPlaylistMetadata build()
    {
        return new ProtoPlaylistMetadata(this, (byte)0);
    }

    public final volatile Message build()
    {
        return build();
    }

    public final build collaborative(Boolean boolean1)
    {
        collaborative = boolean1;
        return this;
    }

    public final collaborative description(String s)
    {
        description = s;
        return this;
    }

    public final description followed(Boolean boolean1)
    {
        followed = boolean1;
        return this;
    }

    public final followed link(String s)
    {
        link = s;
        return this;
    }

    public final link name(String s)
    {
        name = s;
        return this;
    }

    public final name owned_by_self(Boolean boolean1)
    {
        owned_by_self = boolean1;
        return this;
    }

    public final owned_by_self owner(ProtoUser protouser)
    {
        owner = protouser;
        return this;
    }

    public final owner pictures(ProtoImageGroup protoimagegroup)
    {
        pictures = protoimagegroup;
        return this;
    }

    public final pictures published(Boolean boolean1)
    {
        published = boolean1;
        return this;
    }

    public final published total_length(Integer integer)
    {
        total_length = integer;
        return this;
    }

    public ()
    {
    }

    public (ProtoPlaylistMetadata protoplaylistmetadata)
    {
        super(protoplaylistmetadata);
        if (protoplaylistmetadata == null)
        {
            return;
        } else
        {
            link = protoplaylistmetadata.link;
            name = protoplaylistmetadata.name;
            owner = protoplaylistmetadata.owner;
            owned_by_self = protoplaylistmetadata.owned_by_self;
            collaborative = protoplaylistmetadata.collaborative;
            total_length = protoplaylistmetadata.total_length;
            description = protoplaylistmetadata.description;
            pictures = protoplaylistmetadata.pictures;
            followed = protoplaylistmetadata.followed;
            published = protoplaylistmetadata.published;
            browsable_offline = protoplaylistmetadata.browsable_offline;
            return;
        }
    }
}
