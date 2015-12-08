// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.mdx.events;

import android.content.Intent;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.ui.mdx.RemoteDialog;
import com.netflix.mediaclient.ui.mdx.RemotePlaybackListener;
import org.json.JSONException;

// Referenced classes of package com.netflix.mediaclient.ui.mdx.events:
//            EventHandler

public final class DialogShowHandler extends EventHandler
{

    DialogShowHandler()
    {
        super("com.netflix.mediaclient.intent.action.MDXUPDATE_DIALOGSHOW");
    }

    public void handle(RemotePlaybackListener remoteplaybacklistener, Intent intent)
    {
        Log.d("mdxui", "Show dialog");
        intent = intent.getStringExtra("stringBlob");
        try
        {
            remoteplaybacklistener.showDialog(new RemoteDialog(intent));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (RemotePlaybackListener remoteplaybacklistener)
        {
            Log.e("mdxui", (new StringBuilder()).append("Unable to display dialog, failed to process ").append(intent).toString(), remoteplaybacklistener);
        }
    }
}
