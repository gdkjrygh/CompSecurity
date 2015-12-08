// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.show.proto;

import com.squareup.wire.Message;
import gxc;
import java.util.List;

// Referenced classes of package com.spotify.mobile.android.spotlets.show.proto:
//            ProtoShowMetadata, ProtoImageGroup

public final class t extends gxc
{

    public String consumption_order;
    public List copyright;
    public ProtoImageGroup covers;
    public String description;
    public Boolean is_explicit;
    public String language;
    public String link;
    public Integer media_type_enum;
    public String name;
    public Integer num_episodes;
    public Integer popularity;
    public String publisher;

    public final ProtoShowMetadata build()
    {
        return new ProtoShowMetadata(this, (byte)0);
    }

    public final volatile Message build()
    {
        return build();
    }

    public final build consumption_order(String s)
    {
        consumption_order = s;
        return this;
    }

    public final consumption_order copyright(List list)
    {
        copyright = checkForNulls(list);
        return this;
    }

    public final checkForNulls covers(ProtoImageGroup protoimagegroup)
    {
        covers = protoimagegroup;
        return this;
    }

    public final covers description(String s)
    {
        description = s;
        return this;
    }

    public final description is_explicit(Boolean boolean1)
    {
        is_explicit = boolean1;
        return this;
    }

    public final is_explicit language(String s)
    {
        language = s;
        return this;
    }

    public final language link(String s)
    {
        link = s;
        return this;
    }

    public final link media_type_enum(Integer integer)
    {
        media_type_enum = integer;
        return this;
    }

    public final media_type_enum name(String s)
    {
        name = s;
        return this;
    }

    public final name num_episodes(Integer integer)
    {
        num_episodes = integer;
        return this;
    }

    public final num_episodes popularity(Integer integer)
    {
        popularity = integer;
        return this;
    }

    public final popularity publisher(String s)
    {
        publisher = s;
        return this;
    }

    public ()
    {
    }

    public (ProtoShowMetadata protoshowmetadata)
    {
        super(protoshowmetadata);
        if (protoshowmetadata == null)
        {
            return;
        } else
        {
            link = protoshowmetadata.link;
            name = protoshowmetadata.name;
            description = protoshowmetadata.description;
            popularity = protoshowmetadata.popularity;
            publisher = protoshowmetadata.publisher;
            language = protoshowmetadata.language;
            is_explicit = protoshowmetadata.is_explicit;
            covers = protoshowmetadata.covers;
            num_episodes = protoshowmetadata.num_episodes;
            consumption_order = protoshowmetadata.consumption_order;
            media_type_enum = protoshowmetadata.media_type_enum;
            copyright = ProtoShowMetadata.a(protoshowmetadata.copyright);
            return;
        }
    }
}
