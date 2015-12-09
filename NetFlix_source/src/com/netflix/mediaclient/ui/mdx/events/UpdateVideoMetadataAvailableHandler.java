// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.mdx.events;

import android.content.Intent;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.ui.mdx.RemotePlaybackListener;

// Referenced classes of package com.netflix.mediaclient.ui.mdx.events:
//            EventHandler

public class UpdateVideoMetadataAvailableHandler extends EventHandler
{

    public UpdateVideoMetadataAvailableHandler()
    {
        super("com.netflix.mediaclient.intent.action.MDXUPDATE_MOVIEMETADATA_AVAILABLE");
    }

    public void handle(RemotePlaybackListener remoteplaybacklistener, Intent intent)
    {
        Log.d("mdxui", "Video metadata update");
        remoteplaybacklistener.updateVideoMetadata();
    }
}
