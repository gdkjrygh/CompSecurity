// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.bouncer.proto;

import com.squareup.wire.Message;
import gxc;

// Referenced classes of package com.spotify.bouncer.proto:
//            Metadata, SocialReaction

public final class s extends gxc
{

    public SocialReaction reactions;
    public String reshare_id;
    public String summary;

    public final Metadata build()
    {
        return new Metadata(this, (byte)0);
    }

    public final volatile Message build()
    {
        return build();
    }

    public final build reactions(SocialReaction socialreaction)
    {
        reactions = socialreaction;
        return this;
    }

    public final reactions reshare_id(String s)
    {
        reshare_id = s;
        return this;
    }

    public final reshare_id summary(String s)
    {
        summary = s;
        return this;
    }

    public ()
    {
    }

    public (Metadata metadata)
    {
        super(metadata);
        if (metadata == null)
        {
            return;
        } else
        {
            summary = metadata.summary;
            reshare_id = metadata.reshare_id;
            reactions = metadata.reactions;
            return;
        }
    }
}
