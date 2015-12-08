// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.playlist.proto;

import com.squareup.wire.Message;
import gxc;

// Referenced classes of package com.spotify.mobile.android.spotlets.playlist.proto:
//            ProtoUser

public final class name extends gxc
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

    public final build display_name(String s)
    {
        display_name = s;
        return this;
    }

    public final display_name link(String s)
    {
        link = s;
        return this;
    }

    public final link username(String s)
    {
        username = s;
        return this;
    }

    public ()
    {
    }

    public (ProtoUser protouser)
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
