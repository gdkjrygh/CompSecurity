// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.show.proto;

import com.squareup.wire.Message;
import gxc;

// Referenced classes of package com.spotify.mobile.android.spotlets.show.proto:
//            ProtoEpisodeMetadata, ProtoImageGroup, ProtoEpisodeShowMetadata

public final class pe_enum extends gxc
{

    public Boolean available;
    public ProtoImageGroup covers;
    public String description;
    public ProtoImageGroup freeze_frames;
    public String language;
    public Integer length;
    public String link;
    public String manifest_id;
    public Integer media_type_enum;
    public String name;
    public Long publish_date;
    public ProtoEpisodeShowMetadata show;

    public final pe_enum available(Boolean boolean1)
    {
        available = boolean1;
        return this;
    }

    public final ProtoEpisodeMetadata build()
    {
        return new ProtoEpisodeMetadata(this, (byte)0);
    }

    public final volatile Message build()
    {
        return build();
    }

    public final build covers(ProtoImageGroup protoimagegroup)
    {
        covers = protoimagegroup;
        return this;
    }

    public final covers description(String s)
    {
        description = s;
        return this;
    }

    public final description freeze_frames(ProtoImageGroup protoimagegroup)
    {
        freeze_frames = protoimagegroup;
        return this;
    }

    public final freeze_frames language(String s)
    {
        language = s;
        return this;
    }

    public final language length(Integer integer)
    {
        length = integer;
        return this;
    }

    public final length link(String s)
    {
        link = s;
        return this;
    }

    public final link manifest_id(String s)
    {
        manifest_id = s;
        return this;
    }

    public final manifest_id media_type_enum(Integer integer)
    {
        media_type_enum = integer;
        return this;
    }

    public final media_type_enum name(String s)
    {
        name = s;
        return this;
    }

    public final name publish_date(Long long1)
    {
        publish_date = long1;
        return this;
    }

    public final publish_date show(ProtoEpisodeShowMetadata protoepisodeshowmetadata)
    {
        show = protoepisodeshowmetadata;
        return this;
    }

    public Q()
    {
    }

    public Q(ProtoEpisodeMetadata protoepisodemetadata)
    {
        super(protoepisodemetadata);
        if (protoepisodemetadata == null)
        {
            return;
        } else
        {
            show = protoepisodemetadata.show;
            link = protoepisodemetadata.link;
            name = protoepisodemetadata.name;
            length = protoepisodemetadata.length;
            covers = protoepisodemetadata.covers;
            manifest_id = protoepisodemetadata.manifest_id;
            description = protoepisodemetadata.description;
            publish_date = protoepisodemetadata.publish_date;
            freeze_frames = protoepisodemetadata.freeze_frames;
            language = protoepisodemetadata.language;
            available = protoepisodemetadata.available;
            media_type_enum = protoepisodemetadata.media_type_enum;
            return;
        }
    }
}
