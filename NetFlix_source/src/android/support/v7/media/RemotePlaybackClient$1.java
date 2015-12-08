// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.media;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

// Referenced classes of package android.support.v7.media:
//            RemotePlaybackClient, MediaSessionStatus, MediaItemStatus

class estCallback extends estCallback
{

    final RemotePlaybackClient this$0;
    final emActionCallback val$callback;
    final Intent val$intent;
    final String val$itemId;
    final String val$sessionId;

    public void onError(String s, Bundle bundle)
    {
        RemotePlaybackClient.access$600(RemotePlaybackClient.this, val$intent, val$callback, s, bundle);
    }

    public void onResult(Bundle bundle)
    {
        if (bundle != null)
        {
            String s = RemotePlaybackClient.access$100(val$sessionId, bundle.getString("android.media.intent.extra.SESSION_ID"));
            MediaSessionStatus mediasessionstatus = MediaSessionStatus.fromBundle(bundle.getBundle("android.media.intent.extra.SESSION_STATUS"));
            String s1 = RemotePlaybackClient.access$100(val$itemId, bundle.getString("android.media.intent.extra.ITEM_ID"));
            MediaItemStatus mediaitemstatus = MediaItemStatus.fromBundle(bundle.getBundle("android.media.intent.extra.ITEM_STATUS"));
            RemotePlaybackClient.access$200(RemotePlaybackClient.this, s);
            if (s != null && s1 != null && mediaitemstatus != null)
            {
                if (RemotePlaybackClient.access$300())
                {
                    Log.d("RemotePlaybackClient", (new StringBuilder()).append("Received result from ").append(val$intent.getAction()).append(": data=").append(RemotePlaybackClient.access$400(bundle)).append(", sessionId=").append(s).append(", sessionStatus=").append(mediasessionstatus).append(", itemId=").append(s1).append(", itemStatus=").append(mediaitemstatus).toString());
                }
                val$callback.onResult(bundle, s, mediasessionstatus, s1, mediaitemstatus);
                return;
            }
        }
        RemotePlaybackClient.access$500(RemotePlaybackClient.this, val$intent, val$callback, bundle);
    }

    emActionCallback()
    {
        this$0 = final_remoteplaybackclient;
        val$sessionId = s;
        val$itemId = s1;
        val$intent = intent1;
        val$callback = emActionCallback.this;
        super();
    }
}
