// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.show.proto;

import com.squareup.wire.Message;

// Referenced classes of package com.spotify.mobile.android.spotlets.show.proto:
//            ProtoImageGroup

public final class ProtoEpisodeShowMetadata extends Message
{

    public static final String DEFAULT_LINK = "";
    public static final String DEFAULT_NAME = "";
    public static final String DEFAULT_PUBLISHER = "";
    public final ProtoImageGroup covers;
    public final String link;
    public final String name;
    public final String publisher;

    private ProtoEpisodeShowMetadata(Builder builder)
    {
        super(builder);
        link = builder.link;
        name = builder.name;
        publisher = builder.publisher;
        covers = builder.covers;
    }

    ProtoEpisodeShowMetadata(Builder builder, byte byte0)
    {
        this(builder);
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof ProtoEpisodeShowMetadata))
            {
                return false;
            }
            obj = (ProtoEpisodeShowMetadata)obj;
            if (!a(link, ((ProtoEpisodeShowMetadata) (obj)).link) || !a(name, ((ProtoEpisodeShowMetadata) (obj)).name) || !a(publisher, ((ProtoEpisodeShowMetadata) (obj)).publisher) || !a(covers, ((ProtoEpisodeShowMetadata) (obj)).covers))
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
            if (publisher != null)
            {
                l = publisher.hashCode();
            } else
            {
                l = 0;
            }
            if (covers != null)
            {
                i1 = covers.hashCode();
            }
            i = (l + (k + i * 37) * 37) * 37 + i1;
            hashCode = i;
        }
        return i;
    }

    private class Builder extends gxc
    {

        public ProtoImageGroup covers;
        public String link;
        public String name;
        public String publisher;

        public final ProtoEpisodeShowMetadata build()
        {
            return new ProtoEpisodeShowMetadata(this, (byte)0);
        }

        public final volatile Message build()
        {
            return build();
        }

        public final Builder covers(ProtoImageGroup protoimagegroup)
        {
            covers = protoimagegroup;
            return this;
        }

        public final Builder link(String s)
        {
            link = s;
            return this;
        }

        public final Builder name(String s)
        {
            name = s;
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

        public Builder(ProtoEpisodeShowMetadata protoepisodeshowmetadata)
        {
            super(protoepisodeshowmetadata);
            if (protoepisodeshowmetadata == null)
            {
                return;
            } else
            {
                link = protoepisodeshowmetadata.link;
                name = protoepisodeshowmetadata.name;
                publisher = protoepisodeshowmetadata.publisher;
                covers = protoepisodeshowmetadata.covers;
                return;
            }
        }
    }

}
