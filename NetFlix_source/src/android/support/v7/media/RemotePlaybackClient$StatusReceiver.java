// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.media;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

// Referenced classes of package android.support.v7.media:
//            RemotePlaybackClient, MediaSessionStatus, MediaItemStatus

private final class <init> extends BroadcastReceiver
{

    public static final String ACTION_ITEM_STATUS_CHANGED = "android.support.v7.media.actions.ACTION_ITEM_STATUS_CHANGED";
    public static final String ACTION_SESSION_STATUS_CHANGED = "android.support.v7.media.actions.ACTION_SESSION_STATUS_CHANGED";
    final RemotePlaybackClient this$0;

    public void onReceive(Context context, Intent intent)
    {
        context = intent.getStringExtra("android.media.intent.extra.SESSION_ID");
        if (context != null && context.equals(RemotePlaybackClient.access$700(RemotePlaybackClient.this))) goto _L2; else goto _L1
_L1:
        Log.w("RemotePlaybackClient", (new StringBuilder()).append("Discarding spurious status callback with missing or invalid session id: sessionId=").append(context).toString());
_L4:
        return;
_L2:
        MediaSessionStatus mediasessionstatus;
        String s;
        mediasessionstatus = MediaSessionStatus.fromBundle(intent.getBundleExtra("android.media.intent.extra.SESSION_STATUS"));
        s = intent.getAction();
        if (!s.equals("android.support.v7.media.actions.ACTION_ITEM_STATUS_CHANGED"))
        {
            continue; /* Loop/switch isn't completed */
        }
        s = intent.getStringExtra("android.media.intent.extra.ITEM_ID");
        if (s == null)
        {
            Log.w("RemotePlaybackClient", "Discarding spurious status callback with missing item id.");
            return;
        }
        MediaItemStatus mediaitemstatus = MediaItemStatus.fromBundle(intent.getBundleExtra("android.media.intent.extra.ITEM_STATUS"));
        if (mediaitemstatus == null)
        {
            Log.w("RemotePlaybackClient", "Discarding spurious status callback with missing item status.");
            return;
        }
        if (RemotePlaybackClient.access$300())
        {
            Log.d("RemotePlaybackClient", (new StringBuilder()).append("Received item status callback: sessionId=").append(context).append(", sessionStatus=").append(mediasessionstatus).append(", itemId=").append(s).append(", itemStatus=").append(mediaitemstatus).toString());
        }
        if (RemotePlaybackClient.access$800(RemotePlaybackClient.this) != null)
        {
            RemotePlaybackClient.access$800(RemotePlaybackClient.this).onItemStatusChanged(intent.getExtras(), context, mediasessionstatus, s, mediaitemstatus);
            return;
        }
        continue; /* Loop/switch isn't completed */
        if (!s.equals("android.support.v7.media.actions.ACTION_SESSION_STATUS_CHANGED")) goto _L4; else goto _L3
_L3:
        if (mediasessionstatus == null)
        {
            Log.w("RemotePlaybackClient", "Discarding spurious media status callback with missing session status.");
            return;
        }
        if (RemotePlaybackClient.access$300())
        {
            Log.d("RemotePlaybackClient", (new StringBuilder()).append("Received session status callback: sessionId=").append(context).append(", sessionStatus=").append(mediasessionstatus).toString());
        }
        if (RemotePlaybackClient.access$800(RemotePlaybackClient.this) != null)
        {
            RemotePlaybackClient.access$800(RemotePlaybackClient.this).onSessionStatusChanged(intent.getExtras(), context, mediasessionstatus);
            return;
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    private ()
    {
        this$0 = RemotePlaybackClient.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
