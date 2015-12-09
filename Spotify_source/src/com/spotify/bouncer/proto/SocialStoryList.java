// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.bouncer.proto;

import com.squareup.wire.Message;
import java.util.Collections;
import java.util.List;

public final class SocialStoryList extends Message
{

    public static final List DEFAULT_STORIES = Collections.emptyList();
    public final List stories;

    private SocialStoryList(Builder builder)
    {
        super(builder);
        stories = e(builder.stories);
    }

    SocialStoryList(Builder builder, byte byte0)
    {
        this(builder);
    }

    static List a(List list)
    {
        return d(list);
    }

    public final boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (!(obj instanceof SocialStoryList))
        {
            return false;
        } else
        {
            return a(stories, ((SocialStoryList)obj).stories);
        }
    }

    public final int hashCode()
    {
        int i = hashCode;
        if (i != 0)
        {
            return i;
        }
        if (stories != null)
        {
            i = stories.hashCode();
        } else
        {
            i = 1;
        }
        hashCode = i;
        return i;
    }


    private class Builder extends gxc
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

        public final Builder stories(List list)
        {
            stories = checkForNulls(list);
            return this;
        }

        public Builder()
        {
        }

        public Builder(SocialStoryList socialstorylist)
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

}
