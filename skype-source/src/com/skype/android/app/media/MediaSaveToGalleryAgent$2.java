// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.media;

import com.skype.android.config.FileUtil;
import java.util.concurrent.Callable;

// Referenced classes of package com.skype.android.app.media:
//            MediaSaveToGalleryAgent, MediaLinkSaveError

final class val.vimUrlPath
    implements Callable
{

    final MediaSaveToGalleryAgent this$0;
    final String val$vimUrlPath;

    public final MediaLinkSaveError call()
        throws Exception
    {
        return FileUtil.downloadAndSaveVideoMessage(MediaSaveToGalleryAgent.access$100(MediaSaveToGalleryAgent.this), val$vimUrlPath);
    }

    public final volatile Object call()
        throws Exception
    {
        return call();
    }

    ()
    {
        this$0 = final_mediasavetogalleryagent;
        val$vimUrlPath = String.this;
        super();
    }
}
