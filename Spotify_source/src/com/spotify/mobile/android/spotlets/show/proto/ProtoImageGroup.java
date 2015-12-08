// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.show.proto;

import com.squareup.wire.Message;

public final class ProtoImageGroup extends Message
{

    public static final String DEFAULT_LARGE_LINK = "";
    public static final String DEFAULT_SMALL_LINK = "";
    public static final String DEFAULT_STANDARD_LINK = "";
    public static final String DEFAULT_XLARGE_LINK = "";
    public final String large_link;
    public final String small_link;
    public final String standard_link;
    public final String xlarge_link;

    private ProtoImageGroup(Builder builder)
    {
        super(builder);
        standard_link = builder.standard_link;
        small_link = builder.small_link;
        large_link = builder.large_link;
        xlarge_link = builder.xlarge_link;
    }

    ProtoImageGroup(Builder builder, byte byte0)
    {
        this(builder);
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof ProtoImageGroup))
            {
                return false;
            }
            obj = (ProtoImageGroup)obj;
            if (!a(standard_link, ((ProtoImageGroup) (obj)).standard_link) || !a(small_link, ((ProtoImageGroup) (obj)).small_link) || !a(large_link, ((ProtoImageGroup) (obj)).large_link) || !a(xlarge_link, ((ProtoImageGroup) (obj)).xlarge_link))
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
            if (standard_link != null)
            {
                i = standard_link.hashCode();
            } else
            {
                i = 0;
            }
            if (small_link != null)
            {
                k = small_link.hashCode();
            } else
            {
                k = 0;
            }
            if (large_link != null)
            {
                l = large_link.hashCode();
            } else
            {
                l = 0;
            }
            if (xlarge_link != null)
            {
                i1 = xlarge_link.hashCode();
            }
            i = (l + (k + i * 37) * 37) * 37 + i1;
            hashCode = i;
        }
        return i;
    }

    private class Builder extends gxc
    {

        public String large_link;
        public String small_link;
        public String standard_link;
        public String xlarge_link;

        public final ProtoImageGroup build()
        {
            return new ProtoImageGroup(this, (byte)0);
        }

        public final volatile Message build()
        {
            return build();
        }

        public final Builder large_link(String s)
        {
            large_link = s;
            return this;
        }

        public final Builder small_link(String s)
        {
            small_link = s;
            return this;
        }

        public final Builder standard_link(String s)
        {
            standard_link = s;
            return this;
        }

        public final Builder xlarge_link(String s)
        {
            xlarge_link = s;
            return this;
        }

        public Builder()
        {
        }

        public Builder(ProtoImageGroup protoimagegroup)
        {
            super(protoimagegroup);
            if (protoimagegroup == null)
            {
                return;
            } else
            {
                standard_link = protoimagegroup.standard_link;
                small_link = protoimagegroup.small_link;
                large_link = protoimagegroup.large_link;
                xlarge_link = protoimagegroup.xlarge_link;
                return;
            }
        }
    }

}
