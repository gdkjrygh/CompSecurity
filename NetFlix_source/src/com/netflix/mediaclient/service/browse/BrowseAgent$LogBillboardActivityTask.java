// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.browse;

import com.netflix.mediaclient.servicemgr.Video;

// Referenced classes of package com.netflix.mediaclient.service.browse:
//            BrowseAgent, BrowseWebClient

private class type
    implements Runnable
{

    final BrowseAgent this$0;
    private final type type;
    private final Video video;

    public void run()
    {
        BrowseAgent.access$000(BrowseAgent.this).logBillboardActivity(video, type);
    }

    public Q(Video video1, Q q)
    {
        this$0 = BrowseAgent.this;
        super();
        video = video1;
        type = q;
    }
}
