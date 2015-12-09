// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.show.proto;

import com.squareup.wire.Message;

// Referenced classes of package com.spotify.mobile.android.spotlets.show.proto:
//            ProtoEpisodeShowMetadata, ProtoImageGroup

public final class ProtoEpisodeMetadata extends Message
{

    public static final Boolean DEFAULT_AVAILABLE = Boolean.valueOf(false);
    public static final String DEFAULT_DESCRIPTION = "";
    public static final String DEFAULT_LANGUAGE = "";
    public static final Integer DEFAULT_LENGTH = Integer.valueOf(0);
    public static final String DEFAULT_LINK = "";
    public static final String DEFAULT_MANIFEST_ID = "";
    public static final Integer DEFAULT_MEDIA_TYPE_ENUM = Integer.valueOf(0);
    public static final String DEFAULT_NAME = "";
    public static final Long DEFAULT_PUBLISH_DATE = Long.valueOf(0L);
    public final Boolean available;
    public final ProtoImageGroup covers;
    public final String description;
    public final ProtoImageGroup freeze_frames;
    public final String language;
    public final Integer length;
    public final String link;
    public final String manifest_id;
    public final Integer media_type_enum;
    public final String name;
    public final Long publish_date;
    public final ProtoEpisodeShowMetadata show;

    private ProtoEpisodeMetadata(Builder builder)
    {
        super(builder);
        show = builder.show;
        link = builder.link;
        name = builder.name;
        length = builder.length;
        covers = builder.covers;
        manifest_id = builder.manifest_id;
        description = builder.description;
        publish_date = builder.publish_date;
        freeze_frames = builder.freeze_frames;
        language = builder.language;
        available = builder.available;
        media_type_enum = builder.media_type_enum;
    }

    ProtoEpisodeMetadata(Builder builder, byte byte0)
    {
        this(builder);
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof ProtoEpisodeMetadata))
            {
                return false;
            }
            obj = (ProtoEpisodeMetadata)obj;
            if (!a(show, ((ProtoEpisodeMetadata) (obj)).show) || !a(link, ((ProtoEpisodeMetadata) (obj)).link) || !a(name, ((ProtoEpisodeMetadata) (obj)).name) || !a(length, ((ProtoEpisodeMetadata) (obj)).length) || !a(covers, ((ProtoEpisodeMetadata) (obj)).covers) || !a(manifest_id, ((ProtoEpisodeMetadata) (obj)).manifest_id) || !a(description, ((ProtoEpisodeMetadata) (obj)).description) || !a(publish_date, ((ProtoEpisodeMetadata) (obj)).publish_date) || !a(freeze_frames, ((ProtoEpisodeMetadata) (obj)).freeze_frames) || !a(language, ((ProtoEpisodeMetadata) (obj)).language) || !a(available, ((ProtoEpisodeMetadata) (obj)).available) || !a(media_type_enum, ((ProtoEpisodeMetadata) (obj)).media_type_enum))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        int i3 = 0;
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
            int l2;
            if (show != null)
            {
                i = show.hashCode();
            } else
            {
                i = 0;
            }
            if (link != null)
            {
                k = link.hashCode();
            } else
            {
                k = 0;
            }
            if (name != null)
            {
                l = name.hashCode();
            } else
            {
                l = 0;
            }
            if (length != null)
            {
                i1 = length.hashCode();
            } else
            {
                i1 = 0;
            }
            if (covers != null)
            {
                j1 = covers.hashCode();
            } else
            {
                j1 = 0;
            }
            if (manifest_id != null)
            {
                k1 = manifest_id.hashCode();
            } else
            {
                k1 = 0;
            }
            if (description != null)
            {
                l1 = description.hashCode();
            } else
            {
                l1 = 0;
            }
            if (publish_date != null)
            {
                i2 = publish_date.hashCode();
            } else
            {
                i2 = 0;
            }
            if (freeze_frames != null)
            {
                j2 = freeze_frames.hashCode();
            } else
            {
                j2 = 0;
            }
            if (language != null)
            {
                k2 = language.hashCode();
            } else
            {
                k2 = 0;
            }
            if (available != null)
            {
                l2 = available.hashCode();
            } else
            {
                l2 = 0;
            }
            if (media_type_enum != null)
            {
                i3 = media_type_enum.hashCode();
            }
            i = (l2 + (k2 + (j2 + (i2 + (l1 + (k1 + (j1 + (i1 + (l + (k + i * 37) * 37) * 37) * 37) * 37) * 37) * 37) * 37) * 37) * 37) * 37 + i3;
            hashCode = i;
        }
        return i;
    }


    private class Builder extends gxc
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

        public final Builder available(Boolean boolean1)
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

        public final Builder freeze_frames(ProtoImageGroup protoimagegroup)
        {
            freeze_frames = protoimagegroup;
            return this;
        }

        public final Builder language(String s)
        {
            language = s;
            return this;
        }

        public final Builder length(Integer integer)
        {
            length = integer;
            return this;
        }

        public final Builder link(String s)
        {
            link = s;
            return this;
        }

        public final Builder manifest_id(String s)
        {
            manifest_id = s;
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

        public final Builder publish_date(Long long1)
        {
            publish_date = long1;
            return this;
        }

        public final Builder show(ProtoEpisodeShowMetadata protoepisodeshowmetadata)
        {
            show = protoepisodeshowmetadata;
            return this;
        }

        public Builder()
        {
        }

        public Builder(ProtoEpisodeMetadata protoepisodemetadata)
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

}
