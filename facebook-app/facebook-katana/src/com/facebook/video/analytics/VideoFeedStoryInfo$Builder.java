// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.video.analytics;

import com.fasterxml.jackson.databind.node.ArrayNode;

// Referenced classes of package com.facebook.video.analytics:
//            ChannelEligibility, VideoFeedStoryInfo

public class a
{

    public final ArrayNode a;
    public Type b;
    public ChannelEligibility c;
    public boolean d;

    public final a a(ChannelEligibility channeleligibility)
    {
        c = channeleligibility;
        return this;
    }

    public final Type a(Type type)
    {
        b = type;
        return this;
    }

    public final b a(boolean flag)
    {
        d = flag;
        return this;
    }

    public final VideoFeedStoryInfo a()
    {
        return new VideoFeedStoryInfo(this);
    }

    public Type(ArrayNode arraynode)
    {
        b = Type.BY_USER;
        c = ChannelEligibility.NO_INFO;
        d = false;
        a = arraynode;
    }
}
