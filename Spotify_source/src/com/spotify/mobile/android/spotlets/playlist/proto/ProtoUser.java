// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.playlist.proto;

import com.squareup.wire.Message;

public final class ProtoUser extends Message
{

    public static final String DEFAULT_DISPLAY_NAME = "";
    public static final String DEFAULT_LINK = "";
    public static final String DEFAULT_USERNAME = "";
    public final String display_name;
    public final String link;
    public final String username;

    private ProtoUser(Builder builder)
    {
        super(builder);
        link = builder.link;
        username = builder.username;
        display_name = builder.display_name;
    }

    ProtoUser(Builder builder, byte byte0)
    {
        this(builder);
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof ProtoUser))
            {
                return false;
            }
            obj = (ProtoUser)obj;
            if (!a(link, ((ProtoUser) (obj)).link) || !a(username, ((ProtoUser) (obj)).username) || !a(display_name, ((ProtoUser) (obj)).display_name))
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
            if (link != null)
            {
                i = link.hashCode();
            } else
            {
                i = 0;
            }
            if (username != null)
            {
                k = username.hashCode();
            } else
            {
                k = 0;
            }
            if (display_name != null)
            {
                l = display_name.hashCode();
            }
            i = (k + i * 37) * 37 + l;
            hashCode = i;
        }
        return i;
    }

    private class Builder extends gxc
    {

        public String display_name;
        public String link;
        public String username;

        public final ProtoUser build()
        {
            return new ProtoUser(this, (byte)0);
        }

        public final volatile Message build()
        {
            return build();
        }

        public final Builder display_name(String s)
        {
            display_name = s;
            return this;
        }

        public final Builder link(String s)
        {
            link = s;
            return this;
        }

        public final Builder username(String s)
        {
            username = s;
            return this;
        }

        public Builder()
        {
        }

        public Builder(ProtoUser protouser)
        {
            super(protouser);
            if (protouser == null)
            {
                return;
            } else
            {
                link = protouser.link;
                username = protouser.username;
                display_name = protouser.display_name;
                return;
            }
        }
    }

}
