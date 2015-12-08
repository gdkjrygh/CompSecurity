// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.media;

import com.skype.android.config.FileUtil;
import java.util.concurrent.Callable;

// Referenced classes of package com.skype.android.app.media:
//            MediaSaveToGalleryAgent, MediaLinkSaveError

final class val.localPath
    implements Callable
{

    final MediaSaveToGalleryAgent this$0;
    final String val$localPath;

    public final MediaLinkSaveError call()
        throws Exception
    {
        return FileUtil.copyVimToGallery(val$localPath, MediaSaveToGalleryAgent.access$000(MediaSaveToGalleryAgent.this));
    }

    public final volatile Object call()
        throws Exception
    {
        return call();
    }

    ()
    {
        this$0 = final_mediasavetogalleryagent;
        val$localPath = String.this;
        super();
    }
}
