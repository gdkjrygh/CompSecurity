// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.playlist.proto;

import com.spotify.mobile.android.spotlets.show.proto.ProtoImageGroup;
import com.squareup.wire.Message;

// Referenced classes of package com.spotify.mobile.android.spotlets.playlist.proto:
//            ProtoUser

public final class ProtoPlaylistMetadata extends Message
{

    public static final Boolean DEFAULT_BROWSABLE_OFFLINE = Boolean.valueOf(false);
    public static final Boolean DEFAULT_COLLABORATIVE = Boolean.valueOf(false);
    public static final String DEFAULT_DESCRIPTION = "";
    public static final Boolean DEFAULT_FOLLOWED = Boolean.valueOf(false);
    public static final String DEFAULT_LINK = "";
    public static final String DEFAULT_NAME = "";
    public static final Boolean DEFAULT_OWNED_BY_SELF = Boolean.valueOf(false);
    public static final Boolean DEFAULT_PUBLISHED = Boolean.valueOf(false);
    public static final Integer DEFAULT_TOTAL_LENGTH = Integer.valueOf(0);
    public final Boolean browsable_offline;
    public final Boolean collaborative;
    public final String description;
    public final Boolean followed;
    public final String link;
    public final String name;
    public final Boolean owned_by_self;
    public final ProtoUser owner;
    public final ProtoImageGroup pictures;
    public final Boolean published;
    public final Integer total_length;

    private ProtoPlaylistMetadata(Builder builder)
    {
        super(builder);
        link = builder.link;
        name = builder.name;
        owner = builder.owner;
        owned_by_self = builder.owned_by_self;
        collaborative = builder.collaborative;
        total_length = builder.total_length;
        description = builder.description;
        pictures = builder.pictures;
        followed = builder.followed;
        published = builder.published;
        browsable_offline = builder.browsable_offline;
    }

    ProtoPlaylistMetadata(Builder builder, byte byte0)
    {
        this(builder);
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof ProtoPlaylistMetadata))
            {
                return false;
            }
            obj = (ProtoPlaylistMetadata)obj;
            if (!a(link, ((ProtoPlaylistMetadata) (obj)).link) || !a(name, ((ProtoPlaylistMetadata) (obj)).name) || !a(owner, ((ProtoPlaylistMetadata) (obj)).owner) || !a(owned_by_self, ((ProtoPlaylistMetadata) (obj)).owned_by_self) || !a(collaborative, ((ProtoPlaylistMetadata) (obj)).collaborative) || !a(total_length, ((ProtoPlaylistMetadata) (obj)).total_length) || !a(description, ((ProtoPlaylistMetadata) (obj)).description) || !a(pictures, ((ProtoPlaylistMetadata) (obj)).pictures) || !a(followed, ((ProtoPlaylistMetadata) (obj)).followed) || !a(published, ((ProtoPlaylistMetadata) (obj)).published) || !a(browsable_offline, ((ProtoPlaylistMetadata) (obj)).browsable_offline))
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
            if (owner != null)
            {
                l = owner.hashCode();
            } else
            {
                l = 0;
            }
            if (owned_by_self != null)
            {
                i1 = owned_by_self.hashCode();
            } else
            {
                i1 = 0;
            }
            if (collaborative != null)
            {
                j1 = collaborative.hashCode();
            } else
            {
                j1 = 0;
            }
            if (total_length != null)
            {
                k1 = total_length.hashCode();
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
            if (pictures != null)
            {
                i2 = pictures.hashCode();
            } else
            {
                i2 = 0;
            }
            if (followed != null)
            {
                j2 = followed.hashCode();
            } else
            {
                j2 = 0;
            }
            if (published != null)
            {
                k2 = published.hashCode();
            } else
            {
                k2 = 0;
            }
            if (browsable_offline != null)
            {
                l2 = browsable_offline.hashCode();
            }
            i = (k2 + (j2 + (i2 + (l1 + (k1 + (j1 + (i1 + (l + (k + i * 37) * 37) * 37) * 37) * 37) * 37) * 37) * 37) * 37) * 37 + l2;
            hashCode = i;
        }
        return i;
    }


    private class Builder extends gxc
    {

        public Boolean browsable_offline;
        public Boolean collaborative;
        public String description;
        public Boolean followed;
        public String link;
        public String name;
        public Boolean owned_by_self;
        public ProtoUser owner;
        public ProtoImageGroup pictures;
        public Boolean published;
        public Integer total_length;

        public final Builder browsable_offline(Boolean boolean1)
        {
            browsable_offline = boolean1;
            return this;
        }

        public final ProtoPlaylistMetadata build()
        {
            return new ProtoPlaylistMetadata(this, (byte)0);
        }

        public final volatile Message build()
        {
            return build();
        }

        public final Builder collaborative(Boolean boolean1)
        {
            collaborative = boolean1;
            return this;
        }

        public final Builder description(String s)
        {
            description = s;
            return this;
        }

        public final Builder followed(Boolean boolean1)
        {
            followed = boolean1;
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

        public final Builder owned_by_self(Boolean boolean1)
        {
            owned_by_self = boolean1;
            return this;
        }

        public final Builder owner(ProtoUser protouser)
        {
            owner = protouser;
            return this;
        }

        public final Builder pictures(ProtoImageGroup protoimagegroup)
        {
            pictures = protoimagegroup;
            return this;
        }

        public final Builder published(Boolean boolean1)
        {
            published = boolean1;
            return this;
        }

        public final Builder total_length(Integer integer)
        {
            total_length = integer;
            return this;
        }

        public Builder()
        {
        }

        public Builder(ProtoPlaylistMetadata protoplaylistmetadata)
        {
            super(protoplaylistmetadata);
            if (protoplaylistmetadata == null)
            {
                return;
            } else
            {
                link = protoplaylistmetadata.link;
                name = protoplaylistmetadata.name;
                owner = protoplaylistmetadata.owner;
                owned_by_self = protoplaylistmetadata.owned_by_self;
                collaborative = protoplaylistmetadata.collaborative;
                total_length = protoplaylistmetadata.total_length;
                description = protoplaylistmetadata.description;
                pictures = protoplaylistmetadata.pictures;
                followed = protoplaylistmetadata.followed;
                published = protoplaylistmetadata.published;
                browsable_offline = protoplaylistmetadata.browsable_offline;
                return;
            }
        }
    }

}
