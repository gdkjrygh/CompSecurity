// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.bouncer.proto;

import com.squareup.wire.Message;

// Referenced classes of package com.spotify.bouncer.proto:
//            UserList

public final class SocialReaction extends Message
{

    public static final String DEFAULT_ID = "";
    public final String id;
    public final UserList likes;
    public final UserList reshares;
    public final UserList streams;

    private SocialReaction(Builder builder)
    {
        super(builder);
        id = builder.id;
        likes = builder.likes;
        streams = builder.streams;
        reshares = builder.reshares;
    }

    SocialReaction(Builder builder, byte byte0)
    {
        this(builder);
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof SocialReaction))
            {
                return false;
            }
            obj = (SocialReaction)obj;
            if (!a(id, ((SocialReaction) (obj)).id) || !a(likes, ((SocialReaction) (obj)).likes) || !a(streams, ((SocialReaction) (obj)).streams) || !a(reshares, ((SocialReaction) (obj)).reshares))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        int i1 = 0;
        int j = hashCode;
        int i = j;
        if (j == 0)
        {
            int k;
            int l;
            if (id != null)
            {
                i = id.hashCode();
            } else
            {
                i = 0;
            }
            if (likes != null)
            {
                k = likes.hashCode();
            } else
            {
                k = 0;
            }
            if (streams != null)
            {
                l = streams.hashCode();
            } else
            {
                l = 0;
            }
            if (reshares != null)
            {
                i1 = reshares.hashCode();
            }
            i = (l + (k + i * 37) * 37) * 37 + i1;
            hashCode = i;
        }
        return i;
    }

    private class Builder extends gxc
    {

        public String id;
        public UserList likes;
        public UserList reshares;
        public UserList streams;

        public final SocialReaction build()
        {
            return new SocialReaction(this, (byte)0);
        }

        public final volatile Message build()
        {
            return build();
        }

        public final Builder id(String s)
        {
            id = s;
            return this;
        }

        public final Builder likes(UserList userlist)
        {
            likes = userlist;
            return this;
        }

        public final Builder reshares(UserList userlist)
        {
            reshares = userlist;
            return this;
        }

        public final Builder streams(UserList userlist)
        {
            streams = userlist;
            return this;
        }

        public Builder()
        {
        }

        public Builder(SocialReaction socialreaction)
        {
            super(socialreaction);
            if (socialreaction == null)
            {
                return;
            } else
            {
                id = socialreaction.id;
                likes = socialreaction.likes;
                streams = socialreaction.streams;
                reshares = socialreaction.reshares;
                return;
            }
        }
    }

}
