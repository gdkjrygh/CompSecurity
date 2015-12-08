// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;

import com.adobe.mediacore.timeline.advertising.Ad;
import com.adobe.mediacore.timeline.advertising.AdAsset;
import com.adobe.mediacore.timeline.advertising.AdBreak;
import com.adobe.mediacore.timeline.advertising.AdBreakPlacement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.adobe.mediacore:
//            AdBreakManifestLoadCompleteListener, VideoEngineTimeline, MediaResource, ContentCache

class this._cls0
    implements AdBreakManifestLoadCompleteListener
{

    final VideoEngineTimeline this$0;

    public void onComplete()
    {
        ArrayList arraylist = new ArrayList();
        ArrayList arraylist1 = new ArrayList();
        Iterator iterator = VideoEngineTimeline.access$000(VideoEngineTimeline.this).getAdBreak().adsIterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Ad ad = (Ad)iterator.next();
            AdHandle adhandle = VideoEngineTimeline.access$500(VideoEngineTimeline.this).getHandle(ad.getPrimaryAsset().getMediaResource().getUrl());
            if (adhandle != null)
            {
                arraylist.add(ad);
                arraylist1.add(adhandle);
            }
        } while (true);
        if (arraylist.isEmpty())
        {
            VideoEngineTimeline.access$600(VideoEngineTimeline.this);
            return;
        } else
        {
            VideoEngineTimeline.access$700(VideoEngineTimeline.this, arraylist, arraylist1);
            return;
        }
    }

    dAsset()
    {
        this$0 = VideoEngineTimeline.this;
        super();
    }
}
