// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.show.proto;

import com.squareup.wire.Message;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.spotify.mobile.android.spotlets.show.proto:
//            ProtoImageGroup

public final class ProtoShowMetadata extends Message
{

    public static final String DEFAULT_CONSUMPTION_ORDER = "";
    public static final List DEFAULT_COPYRIGHT = Collections.emptyList();
    public static final String DEFAULT_DESCRIPTION = "";
    public static final Boolean DEFAULT_IS_EXPLICIT = Boolean.valueOf(false);
    public static final String DEFAULT_LANGUAGE = "";
    public static final String DEFAULT_LINK = "";
    public static final Integer DEFAULT_MEDIA_TYPE_ENUM = Integer.valueOf(0);
    public static final String DEFAULT_NAME = "";
    public static final Integer DEFAULT_NUM_EPISODES = Integer.valueOf(0);
    public static final Integer DEFAULT_POPULARITY = Integer.valueOf(0);
    public static final String DEFAULT_PUBLISHER = "";
    public final String consumption_order;
    public final List copyright;
    public final ProtoImageGroup covers;
    public final String description;
    public final Boolean is_explicit;
    public final String language;
    public final String link;
    public final Integer media_type_enum;
    public final String name;
    public final Integer num_episodes;
    public final Integer popularity;
    public final String publisher;

    private ProtoShowMetadata(Builder builder)
    {
        super(builder);
        link = builder.link;
        name = builder.name;
        description = builder.description;
        popularity = builder.popularity;
        publisher = builder.publisher;
        language = builder.language;
        is_explicit = builder.is_explicit;
        covers = builder.covers;
        num_episodes = builder.num_episodes;
        consumption_order = builder.consumption_order;
        media_type_enum = builder.media_type_enum;
        copyright = e(builder.copyright);
    }

    ProtoShowMetadata(Builder builder, byte byte0)
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
            if (!(obj instanceof ProtoShowMetadata))
            {
                return false;
            }
            obj = (ProtoShowMetadata)obj;
            if (!a(link, ((ProtoShowMetadata) (obj)).link) || !a(name, ((ProtoShowMetadata) (obj)).name) || !a(description, ((ProtoShowMetadata) (obj)).description) || !a(popularity, ((ProtoShowMetadata) (obj)).popularity) || !a(publisher, ((ProtoShowMetadata) (obj)).publisher) || !a(language, ((ProtoShowMetadata) (obj)).language) || !a(is_explicit, ((ProtoShowMetadata) (obj)).is_explicit) || !a(covers, ((ProtoShowMetadata) (obj)).covers) || !a(num_episodes, ((ProtoShowMetadata) (obj)).num_episodes) || !a(consumption_order, ((ProtoShowMetadata) (obj)).consumption_order) || !a(media_type_enum, ((ProtoShowMetadata) (obj)).media_type_enum) || !a(copyright, ((ProtoShowMetadata) (obj)).copyright))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        int l2 = 0;
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
            int i2;
            int j2;
            int k2;
            int i3;
            if (link != null)
            {
                i = link.hashCode();
            } else
            {
                i = 0;
            }
            if (name != null)
            {
                k = name.hashCode();
            } else
            {
                k = 0;
            }
            if (description != null)
            {
                l = description.hashCode();
            } else
            {
                l = 0;
            }
            if (popularity != null)
            {
                i1 = popularity.hashCode();
            } else
            {
                i1 = 0;
            }
            if (publisher != null)
            {
                j1 = publisher.hashCode();
            } else
            {
                j1 = 0;
            }
            if (language != null)
            {
                k1 = language.hashCode();
            } else
            {
                k1 = 0;
            }
            if (is_explicit != null)
            {
                l1 = is_explicit.hashCode();
            } else
            {
                l1 = 0;
            }
            if (covers != null)
            {
                i2 = covers.hashCode();
            } else
            {
                i2 = 0;
            }
            if (num_episodes != null)
            {
                j2 = num_episodes.hashCode();
            } else
            {
                j2 = 0;
            }
            if (consumption_order != null)
            {
                k2 = consumption_order.hashCode();
            } else
            {
                k2 = 0;
            }
            if (media_type_enum != null)
            {
                l2 = media_type_enum.hashCode();
            }
            if (copyright != null)
            {
                i3 = copyright.hashCode();
            } else
            {
                i3 = 1;
            }
            i = i3 + ((k2 + (j2 + (i2 + (l1 + (k1 + (j1 + (i1 + (l + (k + i * 37) * 37) * 37) * 37) * 37) * 37) * 37) * 37) * 37) * 37 + l2) * 37;
            hashCode = i;
        }
        return i;
    }


    private class Builder extends gxc
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

        public final Builder consumption_order(String s)
        {
            consumption_order = s;
            return this;
        }

        public final Builder copyright(List list)
        {
            copyright = checkForNulls(list);
            return this;
        }

        public final Builder covers(ProtoImageGroup protoimagegroup)
        {
            covers = protoimagegroup;
            return this;
        }

        public final Builder description(String s)
        {
            description = s;
            return this;
        }

        public final Builder is_explicit(Boolean boolean1)
        {
            is_explicit = boolean1;
            return this;
        }

        public final Builder language(String s)
        {
            language = s;
            return this;
        }

        public final Builder link(String s)
        {
            link = s;
            return this;
        }

        public final Builder media_type_enum(Integer integer)
        {
            media_type_enum = integer;
            return this;
        }

        public final Builder name(String s)
        {
            name = s;
            return this;
        }

        public final Builder num_episodes(Integer integer)
        {
            num_episodes = integer;
            return this;
        }

        public final Builder popularity(Integer integer)
        {
            popularity = integer;
            return this;
        }

        public final Builder publisher(String s)
        {
            publisher = s;
            return this;
        }

        public Builder()
        {
        }

        public Builder(ProtoShowMetadata protoshowmetadata)
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

}
