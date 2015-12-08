// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import com.skype.android.app.media.MojiPlaybackStateHolder;
import com.skype.android.widget.ChatVideoTextureView;

// Referenced classes of package com.skype.android.app.chat:
//            MojiMediaMessageViewAdapter

final class val.holder
    implements com.skype.android.widget.tureDestroyedListener
{

    final MojiMediaMessageViewAdapter this$0;
    final sition val$holder;

    public final void onSurfaceTextureDestroyed()
    {
        if (MojiMediaMessageViewAdapter.access$300(MojiMediaMessageViewAdapter.this).isCurrentlyPlayingMessage(val$holder.essageId))
        {
            MojiMediaMessageViewAdapter.access$300(MojiMediaMessageViewAdapter.this).setCurrentPosition(val$holder.essageId, val$holder.ideoTextureView.getCurrentPosition());
        }
    }

    reDestroyedListener()
    {
        this$0 = final_mojimediamessageviewadapter;
        val$holder = val.holder.this;
        super();
    }
}
