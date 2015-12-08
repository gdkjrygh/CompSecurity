// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;

import com.adobe.mediacore.logging.Logger;
import com.adobe.mediacore.metadata.DefaultMetadataKeys;
import com.adobe.mediacore.metadata.Metadata;
import com.adobe.mediacore.metadata.MetadataNode;

// Referenced classes of package com.adobe.mediacore:
//            ItemCreatedListener, DefaultMediaPlayer, VideoEngineAdapter, MediaPlayerItem, 
//            MediaResource, MediaPlayerNotification, ErrorEvent, VideoEngineDispatcher

class this._cls0
    implements ItemCreatedListener
{

    final DefaultMediaPlayer this$0;

    public void onCreated()
    {
        if (DefaultMediaPlayer.access$1700(DefaultMediaPlayer.this) == te.ERROR)
        {
            DefaultMediaPlayer.access$1600(DefaultMediaPlayer.this).w((new StringBuilder()).append(DefaultMediaPlayer.access$1400()).append("#onPlayerItemAvailable").toString(), "Ignore event as media player is in ERROR state.");
        } else
        {
            DefaultMediaPlayer.access$1600(DefaultMediaPlayer.this).i((new StringBuilder()).append(DefaultMediaPlayer.access$1400()).append("#onPlayerItemAvailable").toString(), "Media player item available.");
            DefaultMediaPlayer.access$302(DefaultMediaPlayer.this, DefaultMediaPlayer.access$200(DefaultMediaPlayer.this).getCurrentItem());
            if (DefaultMediaPlayer.access$300(DefaultMediaPlayer.this).isLive() && DefaultMediaPlayer.access$300(DefaultMediaPlayer.this).getResource().getMetadata() != null && DefaultMediaPlayer.access$300(DefaultMediaPlayer.this).getResource().getMetadata().containsKey(DefaultMetadataKeys.CUSTOM_AD_MARKERS_METADATA_KEY.getValue()))
            {
                DefaultMediaPlayer.access$1600(DefaultMediaPlayer.this).e((new StringBuilder()).append(DefaultMediaPlayer.access$1400()).append("#onPlayerItemAvailable").toString(), "Cannot place custom ad-markers on LIVE content.");
                on.Error error = MediaPlayerNotification.createErrorNotification(on.ErrorCode.RESOURCE_LOAD_ERROR, "Resource loading failed due to invalid media-resource metadata.");
                MetadataNode metadatanode = new MetadataNode();
                metadatanode.setValue("DESCRIPTION", "Cannot place custom ad-markers on LIVE content.");
                error.setMetadata(metadatanode);
                DefaultMediaPlayer.access$100(DefaultMediaPlayer.this).dispatch(ErrorEvent.createVideoErrorEvent(error));
                return;
            }
            setStatus(te.INITIALIZED, null);
            if (DefaultMediaPlayer.access$1800(DefaultMediaPlayer.this))
            {
                prepareToPlay(DefaultMediaPlayer.access$1900(DefaultMediaPlayer.this));
                return;
            }
        }
    }

    ()
    {
        this$0 = DefaultMediaPlayer.this;
        super();
    }
}
