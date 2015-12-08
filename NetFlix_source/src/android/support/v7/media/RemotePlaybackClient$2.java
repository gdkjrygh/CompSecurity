// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.media;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

// Referenced classes of package android.support.v7.media:
//            RemotePlaybackClient, MediaSessionStatus

class estCallback extends estCallback
{

    final RemotePlaybackClient this$0;
    final ssionActionCallback val$callback;
    final Intent val$intent;
    final String val$sessionId;

    public void onError(String s, Bundle bundle)
    {
        RemotePlaybackClient.access$600(RemotePlaybackClient.this, val$intent, val$callback, s, bundle);
    }

    public void onResult(Bundle bundle)
    {
        String s;
        MediaSessionStatus mediasessionstatus;
        if (bundle == null)
        {
            break MISSING_BLOCK_LABEL_195;
        }
        s = RemotePlaybackClient.access$100(val$sessionId, bundle.getString("android.media.intent.extra.SESSION_ID"));
        mediasessionstatus = MediaSessionStatus.fromBundle(bundle.getBundle("android.media.intent.extra.SESSION_STATUS"));
        RemotePlaybackClient.access$200(RemotePlaybackClient.this, s);
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_195;
        }
        if (RemotePlaybackClient.access$300())
        {
            Log.d("RemotePlaybackClient", (new StringBuilder()).append("Received result from ").append(val$intent.getAction()).append(": data=").append(RemotePlaybackClient.access$400(bundle)).append(", sessionId=").append(s).append(", sessionStatus=").append(mediasessionstatus).toString());
        }
        val$callback.onResult(bundle, s, mediasessionstatus);
        if (val$intent.getAction().equals("android.media.intent.action.END_SESSION") && s.equals(RemotePlaybackClient.access$700(RemotePlaybackClient.this)))
        {
            setSessionId(null);
        }
        return;
        bundle;
        if (val$intent.getAction().equals("android.media.intent.action.END_SESSION") && s.equals(RemotePlaybackClient.access$700(RemotePlaybackClient.this)))
        {
            setSessionId(null);
        }
        throw bundle;
        RemotePlaybackClient.access$500(RemotePlaybackClient.this, val$intent, val$callback, bundle);
        return;
    }

    ssionActionCallback()
    {
        this$0 = final_remoteplaybackclient;
        val$sessionId = s;
        val$intent = intent1;
        val$callback = ssionActionCallback.this;
        super();
    }
}
