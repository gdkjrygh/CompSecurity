// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.mdx.events;

import android.content.Intent;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.ui.mdx.RemotePlaybackListener;

// Referenced classes of package com.netflix.mediaclient.ui.mdx.events:
//            EventHandler

public final class NotReadyHandler extends EventHandler
{

    NotReadyHandler()
    {
        super("com.netflix.mediaclient.intent.action.MDXUPDATE_NOTREADY");
    }

    public void handle(RemotePlaybackListener remoteplaybacklistener, Intent intent)
    {
        Log.d("mdxui", "MDXUPDATE_NOTREADY");
        remoteplaybacklistener.mdxStateChanged(false);
    }
}
