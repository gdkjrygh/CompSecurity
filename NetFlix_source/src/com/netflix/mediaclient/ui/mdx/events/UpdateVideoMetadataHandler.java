// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.mdx.events;

import android.content.Intent;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.ui.mdx.RemotePlaybackListener;

// Referenced classes of package com.netflix.mediaclient.ui.mdx.events:
//            EventHandler

public final class UpdateVideoMetadataHandler extends EventHandler
{

    UpdateVideoMetadataHandler()
    {
        super("com.netflix.mediaclient.intent.action.MDXUPDATE_MOVIEMETADA");
    }

    public void handle(RemotePlaybackListener remoteplaybacklistener, Intent intent)
    {
        Log.d("mdxui", "Video metadata update");
        remoteplaybacklistener.updateDuration(intent.getIntExtra("duration", 0));
    }
}
