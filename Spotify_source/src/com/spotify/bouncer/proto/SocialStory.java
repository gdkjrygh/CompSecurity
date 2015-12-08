// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.bouncer.proto;

import com.squareup.wire.Message;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.spotify.bouncer.proto:
//            Metadata

public final class SocialStory extends Message
{

    public static final String DEFAULT_ID = "";
    public static final List DEFAULT_RELATED = Collections.emptyList();
    public static final Long DEFAULT_TIMESTAMP = Long.valueOf(0L);
    public static final StoryType DEFAULT_TYPE;
    public static final String DEFAULT_URI = "";
    public static final String DEFAULT_USERNAME = "";
    public static final Integer DEFAULT_WEIGHT = Integer.valueOf(1);
    public final String id;
    public final Metadata metadata;
    public final List related;
    public final Long timestamp;
    public final StoryType type;
    public final String uri;
    public final String username;
    public final Integer weight;

    private SocialStory(Builder builder)
    {
        super(builder);
        id = builder.id;
        type = builder.type;
        timestamp = builder.timestamp;
        username = builder.username;
        uri = builder.uri;
        metadata = builder.metadata;
        related = e(builder.related);
        weight = builder.weight;
    }

    SocialStory(Builder builder, byte byte0)
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
            if (!(obj instanceof SocialStory))
            {
                return false;
            }
            obj = (SocialStory)obj;
            if (!a(id, ((SocialStory) (obj)).id) || !a(type, ((SocialStory) (obj)).type) || !a(timestamp, ((SocialStory) (obj)).timestamp) || !a(username, ((SocialStory) (obj)).username) || !a(uri, ((SocialStory) (obj)).uri) || !a(metadata, ((SocialStory) (obj)).metadata) || !a(related, ((SocialStory) (obj)).related) || !a(weight, ((SocialStory) (obj)).weight))
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
            if (id != null)
            {
                i = id.hashCode();
            } else
            {
                i = 0;
            }
            if (type != null)
            {
                k = type.hashCode();
            } else
            {
                k = 0;
            }
            if (timestamp != null)
            {
                l = timestamp.hashCode();
            } else
            {
                l = 0;
            }
            if (username != null)
            {
                i1 = username.hashCode();
            } else
            {
                i1 = 0;
            }
            if (uri != null)
            {
                j1 = uri.hashCode();
            } else
            {
                j1 = 0;
            }
            if (metadata != null)
            {
                k1 = metadata.hashCode();
            } else
            {
                k1 = 0;
            }
            if (related != null)
            {
                l1 = related.hashCode();
            } else
            {
                l1 = 1;
            }
            if (weight != null)
            {
                i2 = weight.hashCode();
            }
            i = (l1 + (k1 + (j1 + (i1 + (l + (k + i * 37) * 37) * 37) * 37) * 37) * 37) * 37 + i2;
            hashCode = i;
        }
        return i;
    }

    static 
    {
        DEFAULT_TYPE = StoryType.a;
    }

    private class Builder extends gxc
    {

        public String id;
        public Metadata metadata;
        public List related;
        public Long timestamp;
        public StoryType type;
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

        public final Builder id(String s)
        {
            id = s;
            return this;
        }

        public final Builder metadata(Metadata metadata1)
        {
            metadata = metadata1;
            return this;
        }

        public final Builder related(List list)
        {
            related = checkForNulls(list);
            return this;
        }

        public final Builder timestamp(Long long1)
        {
            timestamp = long1;
            return this;
        }

        public final Builder type(StoryType storytype)
        {
            type = storytype;
            return this;
        }

        public final Builder uri(String s)
        {
            uri = s;
            return this;
        }

        public final Builder username(String s)
        {
            username = s;
            return this;
        }

        public final Builder weight(Integer integer)
        {
            weight = integer;
            return this;
        }

        public Builder()
        {
        }

        public Builder(SocialStory socialstory)
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


    private class StoryType extends Enum
        implements gxi
    {

        public static final StoryType a;
        public static final StoryType b;
        private static StoryType c;
        private static StoryType d;
        private static StoryType e;
        private static final StoryType f[];
        private final int value;

        public static StoryType valueOf(String s)
        {
            return (StoryType)Enum.valueOf(com/spotify/bouncer/proto/SocialStory$StoryType, s);
        }

        public static StoryType[] values()
        {
            return (StoryType[])f.clone();
        }

        public final int a()
        {
            return value;
        }

        static 
        {
            a = new StoryType("FOLLOWED_PROFILE", 0, 0);
            c = new StoryType("PUBLISHED_PLAYLIST", 1, 1);
            d = new StoryType("FOLLOWED_PLAYLIST", 2, 2);
            b = new StoryType("SHARED_URI", 3, 3);
            e = new StoryType("LISTENED_TO_URI", 4, 4);
            f = (new StoryType[] {
                a, c, d, b, e
            });
        }

        private StoryType(String s, int i, int j)
        {
            super(s, i);
            value = j;
        }
    }

}
