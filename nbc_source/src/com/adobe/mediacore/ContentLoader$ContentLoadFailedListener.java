// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;

import com.adobe.mediacore.metadata.Metadata;
import com.adobe.mediacore.metadata.MetadataNode;
import com.adobe.mediacore.timeline.advertising.Ad;
import com.adobe.mediacore.timeline.advertising.ContentTracker;

// Referenced classes of package com.adobe.mediacore:
//            AdManifestLoadFailedListener, ContentLoader, MediaPlayerNotification, OperationFailedEvent, 
//            VideoEngineDispatcher, MediaPlayerEvent

private class <init>
    implements AdManifestLoadFailedListener
{

    final ContentLoader this$0;

    public void onError(int i)
    {
        Ad ad = ContentLoader.access$300(ContentLoader.this).(i);
        if (ad != null && ad.getContentTracker() != null)
        {
            ad.getContentTracker().onAdError(ad);
        }
        ContentLoader.access$300(ContentLoader.this).ontentResolved(i);
        if (ContentLoader.access$500(ContentLoader.this) != null)
        {
            <init> <init>1 = MediaPlayerNotification.createWarningNotification(ANIFEST_LOAD_FAILED, "fail to load ad manifest");
            MetadataNode metadatanode = new MetadataNode();
            metadatanode.setValue("AD", ad.toString());
            <init>1.ata(metadatanode);
            ContentLoader.access$500(ContentLoader.this).dispatch(OperationFailedEvent.createEvent(<init>1));
        }
        if (ContentLoader.access$300(ContentLoader.this).nishedLoading())
        {
            ContentLoader.access$500(ContentLoader.this).dispatch(new MediaPlayerEvent(LOAD_COMPLETE));
        }
    }

    private A()
    {
        this$0 = ContentLoader.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
