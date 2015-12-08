// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.bouncer.proto;

import com.squareup.wire.Message;

// Referenced classes of package com.spotify.bouncer.proto:
//            SocialReaction

public final class Metadata extends Message
{

    public static final String DEFAULT_RESHARE_ID = "";
    public static final String DEFAULT_SUMMARY = "";
    public final SocialReaction reactions;
    public final String reshare_id;
    public final String summary;

    private Metadata(Builder builder)
    {
        super(builder);
        summary = builder.summary;
        reshare_id = builder.reshare_id;
        reactions = builder.reactions;
    }

    Metadata(Builder builder, byte byte0)
    {
        this(builder);
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof Metadata))
            {
                return false;
            }
            obj = (Metadata)obj;
            if (!a(summary, ((Metadata) (obj)).summary) || !a(reshare_id, ((Metadata) (obj)).reshare_id) || !a(reactions, ((Metadata) (obj)).reactions))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        int l = 0;
        int j = hashCode;
        int i = j;
        if (j == 0)
        {
            int k;
            if (summary != null)
            {
                i = summary.hashCode();
            } else
            {
                i = 0;
            }
            if (reshare_id != null)
            {
                k = reshare_id.hashCode();
            } else
            {
                k = 0;
            }
            if (reactions != null)
            {
                l = reactions.hashCode();
            }
            i = (k + i * 37) * 37 + l;
            hashCode = i;
        }
        return i;
    }

    private class Builder extends gxc
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

        public final Builder reactions(SocialReaction socialreaction)
        {
            reactions = socialreaction;
            return this;
        }

        public final Builder reshare_id(String s)
        {
            reshare_id = s;
            return this;
        }

        public final Builder summary(String s)
        {
            summary = s;
            return this;
        }

        public Builder()
        {
        }

        public Builder(Metadata metadata)
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

}
