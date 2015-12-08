// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.bouncer.proto;

import com.squareup.wire.Message;
import gxc;
import java.util.List;

// Referenced classes of package com.spotify.bouncer.proto:
//            SocialStory, Metadata

public final class weight extends gxc
{

    public String id;
    public Metadata metadata;
    public List related;
    public Long timestamp;
    public e type;
    public String uri;
    public String username;
    public Integer weight;

    public final SocialStory build()
    {
        return new SocialStory(this, (byte)0);
    }

    public final volatile Message build()
    {
        return build();
    }

    public final build id(String s)
    {
        id = s;
        return this;
    }

    public final id metadata(Metadata metadata1)
    {
        metadata = metadata1;
        return this;
    }

    public final metadata related(List list)
    {
        related = checkForNulls(list);
        return this;
    }

    public final checkForNulls timestamp(Long long1)
    {
        timestamp = long1;
        return this;
    }

    public final e type(e e)
    {
        type = e;
        return this;
    }

    public final type uri(String s)
    {
        uri = s;
        return this;
    }

    public final uri username(String s)
    {
        username = s;
        return this;
    }

    public final username weight(Integer integer)
    {
        weight = integer;
        return this;
    }

    public e()
    {
    }

    public e(SocialStory socialstory)
    {
        super(socialstory);
        if (socialstory == null)
        {
            return;
        } else
        {
            id = socialstory.id;
            type = socialstory.type;
            timestamp = socialstory.timestamp;
            username = socialstory.username;
            uri = socialstory.uri;
            metadata = socialstory.metadata;
            related = SocialStory.a(socialstory.related);
            weight = socialstory.weight;
            return;
        }
    }
}
