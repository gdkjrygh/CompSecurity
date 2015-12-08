// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.bouncer.proto;

import com.squareup.wire.Message;
import gxc;
import java.util.List;

// Referenced classes of package com.spotify.bouncer.proto:
//            SocialStoryList

public final class stories extends gxc
{

    public List stories;

    public final SocialStoryList build()
    {
        return new SocialStoryList(this, (byte)0);
    }

    public final volatile Message build()
    {
        return build();
    }

    public final build stories(List list)
    {
        stories = checkForNulls(list);
        return this;
    }

    public ()
    {
    }

    public (SocialStoryList socialstorylist)
    {
        super(socialstorylist);
        if (socialstorylist == null)
        {
            return;
        } else
        {
            stories = SocialStoryList.a(socialstorylist.stories);
            return;
        }
    }
}
