// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;

import com.adobe.mediacore.logging.Logger;

// Referenced classes of package com.adobe.mediacore:
//            OpportunityHandledListener, MediaPlayerClient, VideoEngineTimelineProxy

class this._cls0
    implements OpportunityHandledListener
{

    final MediaPlayerClient this$0;

    public void onOpportunityHandled(long l)
    {
        MediaPlayerClient.access$200(MediaPlayerClient.this).i((new StringBuilder()).append(MediaPlayerClient.access$100()).append("#OpportunityHandledListener::onOpportunityHandled").toString(), (new StringBuilder()).append("Release reference for placement complete for HOLD at ").append(l).toString());
        MediaPlayerClient.access$300(MediaPlayerClient.this).releaseHoldReference(l);
    }

    roxy()
    {
        this$0 = MediaPlayerClient.this;
        super();
    }
}
