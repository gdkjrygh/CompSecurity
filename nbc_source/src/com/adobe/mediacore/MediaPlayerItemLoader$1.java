// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;

import com.adobe.ave.MediaErrorCode;
import com.adobe.ave.UpdateType;
import com.adobe.ave.VideoEngine;
import com.adobe.ave.VideoEngineListener;
import com.adobe.mediacore.logging.Logger;
import java.util.Arrays;

// Referenced classes of package com.adobe.mediacore:
//            MediaPlayerItemLoader, PSDKConfig, DRMMetadataCache, VideoEngineItem

class this._cls0 extends VideoEngineListener
{

    final MediaPlayerItemLoader this$0;

    public void onDRMMetadata(VideoEngine videoengine, byte abyte0[], int i, long l)
    {
        if (MediaPlayerItemLoader.access$000(MediaPlayerItemLoader.this) == videoengine)
        {
            MediaPlayerItemLoader.access$200(MediaPlayerItemLoader.this).i((new StringBuilder()).append(MediaPlayerItemLoader.access$100()).append("#onDRMMetadata").toString(), (new StringBuilder()).append("DRMMetadata event  received at time [").append(l).append("]").toString());
            MediaPlayerItemLoader.access$302(MediaPlayerItemLoader.this, true);
        }
    }

    public void onError(VideoEngine videoengine, MediaErrorCode mediaerrorcode, String s)
    {
        if (MediaPlayerItemLoader.access$000(MediaPlayerItemLoader.this) == videoengine)
        {
            MediaPlayerItemLoader.access$200(MediaPlayerItemLoader.this).e((new StringBuilder()).append(MediaPlayerItemLoader.access$100()).append("#onError").toString(), (new StringBuilder()).append("[Error] >> ").append(String.valueOf(mediaerrorcode)).append(" - ").append(s).toString());
        }
    }

    public void onTimeline(VideoEngine videoengine, UpdateType updatetype)
    {
        if (MediaPlayerItemLoader.access$000(MediaPlayerItemLoader.this) == videoengine)
        {
            MediaPlayerItemLoader.access$200(MediaPlayerItemLoader.this).i((new StringBuilder()).append(MediaPlayerItemLoader.access$100()).append("#onTimeline").toString(), (new StringBuilder()).append("Timeline event  received. Update type: ").append(updatetype).toString());
            videoengine = Arrays.asList(PSDKConfig.getAdTagsWithDefault());
            updatetype = new DRMMetadataCache();
            MediaPlayerItemLoader.access$402(MediaPlayerItemLoader.this, new VideoEngineItem(MediaPlayerItemLoader.access$500(MediaPlayerItemLoader.this), MediaPlayerItemLoader.access$600(MediaPlayerItemLoader.this), 0, updatetype, videoengine));
            MediaPlayerItemLoader.access$400(MediaPlayerItemLoader.this).update(MediaPlayerItemLoader.access$000(MediaPlayerItemLoader.this));
            MediaPlayerItemLoader.access$400(MediaPlayerItemLoader.this).setIsProtected(MediaPlayerItemLoader.access$300(MediaPlayerItemLoader.this));
            MediaPlayerItemLoader.access$700(MediaPlayerItemLoader.this).onLoadComplete(MediaPlayerItemLoader.access$400(MediaPlayerItemLoader.this));
        }
    }

    public void onWarning(VideoEngine videoengine, MediaErrorCode mediaerrorcode, String s)
    {
        if (MediaPlayerItemLoader.access$000(MediaPlayerItemLoader.this) == videoengine)
        {
            MediaPlayerItemLoader.access$200(MediaPlayerItemLoader.this).w((new StringBuilder()).append(MediaPlayerItemLoader.access$100()).append("#onWarning").toString(), (new StringBuilder()).append("[Warning] >> ").append(String.valueOf(mediaerrorcode)).append(" - ").append(s).toString());
        }
    }

    aderListener()
    {
        this$0 = MediaPlayerItemLoader.this;
        super();
    }
}
