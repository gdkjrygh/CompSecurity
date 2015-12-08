// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.bouncer.proto;

import com.squareup.wire.Message;
import gxc;

// Referenced classes of package com.spotify.bouncer.proto:
//            SocialReaction, UserList

public final class  extends gxc
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

    public final build id(String s)
    {
        id = s;
        return this;
    }

    public final id likes(UserList userlist)
    {
        likes = userlist;
        return this;
    }

    public final likes reshares(UserList userlist)
    {
        reshares = userlist;
        return this;
    }

    public final reshares streams(UserList userlist)
    {
        streams = userlist;
        return this;
    }

    public ()
    {
    }

    public (SocialReaction socialreaction)
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
