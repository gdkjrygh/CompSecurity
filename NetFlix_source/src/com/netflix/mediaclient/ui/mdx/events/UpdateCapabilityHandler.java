// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.mdx.events;

import android.content.Intent;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.ui.mdx.MdxTargetCapabilities;
import com.netflix.mediaclient.ui.mdx.RemotePlaybackListener;

// Referenced classes of package com.netflix.mediaclient.ui.mdx.events:
//            EventHandler

public final class UpdateCapabilityHandler extends EventHandler
{

    UpdateCapabilityHandler()
    {
        super("com.netflix.mediaclient.intent.action.MDXUPDATE_CAPABILITY");
    }

    public void handle(RemotePlaybackListener remoteplaybacklistener, Intent intent)
    {
        Log.d("mdxui", "Update capability");
        intent = intent.getStringExtra("stringBlob");
        try
        {
            remoteplaybacklistener.updateTargetCapabilities(new MdxTargetCapabilities(intent));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (RemotePlaybackListener remoteplaybacklistener)
        {
            Log.e("mdxui", "Failed to extract capability data ", remoteplaybacklistener);
        }
    }
}
