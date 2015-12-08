// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;

import com.adobe.mediacore.logging.Logger;
import com.adobe.mediacore.timeline.advertising.AdBreakPlacement;

// Referenced classes of package com.adobe.mediacore:
//            VideoEngineTimeline, ContentLoader

class this._cls0
    implements Runnable
{

    final VideoEngineTimeline this$0;

    public void run()
    {
        if (VideoEngineTimeline.access$000(VideoEngineTimeline.this) != null && VideoEngineTimeline.access$000(VideoEngineTimeline.this).getAdBreak() != null)
        {
            VideoEngineTimeline.access$100(VideoEngineTimeline.this).loadContent(VideoEngineTimeline.access$000(VideoEngineTimeline.this).getAdBreak());
            return;
        } else
        {
            VideoEngineTimeline.access$300().w((new StringBuilder()).append(VideoEngineTimeline.access$200()).append("#initialise::run").toString(), "Loading manifests for ads cannot proceed");
            return;
        }
    }

    dBreakPlacement()
    {
        this$0 = VideoEngineTimeline.this;
        super();
    }
}
