// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.media.MediaPlayer;
import android.view.View;
import android.widget.RelativeLayout;
import com.skype.android.analytics.LogEvent;
import com.skype.android.analytics.SkypeTelemetryEvent;
import com.skype.android.app.media.MojiPlaybackStateHolder;
import com.skype.android.widget.ChatVideoTextureView;

// Referenced classes of package com.skype.android.app.chat:
//            MojiMediaMessageViewAdapter

final class this._cls1
    implements android.view.ewAdapter._cls7._cls1
{

    final l.holder this$1;

    public final void onClick(View view)
    {
        if (holder.deoTextureView.isPlaying())
        {
            holder.deoTextureView.a();
        }
        MojiMediaMessageViewAdapter.access$400(_fld0, holder);
    }

    l.startTime()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/skype/android/app/chat/MojiMediaMessageViewAdapter$7

/* anonymous class */
    final class MojiMediaMessageViewAdapter._cls7
        implements android.media.MediaPlayer.OnPreparedListener
    {

        final MojiMediaMessageViewAdapter this$0;
        final MojiMediaMessageViewAdapter.a val$holder;
        final long val$startTime;

        public final void onPrepared(MediaPlayer mediaplayer)
        {
            if (MojiMediaMessageViewAdapter.access$300(MojiMediaMessageViewAdapter.this).isCurrentlyPlayingMessage(holder.messageId))
            {
                holder.itemLayout.setOnClickListener(new MojiMediaMessageViewAdapter._cls7._cls1());
                int i = MojiMediaMessageViewAdapter.access$300(MojiMediaMessageViewAdapter.this).getCurrentPosition(holder.messageId);
                if (i > 0)
                {
                    holder.videoTextureView.seekTo(i);
                }
                holder.videoTextureView.start();
                long l = System.currentTimeMillis();
                long l1 = startTime;
                MojiMediaMessageViewAdapter.access$100(MojiMediaMessageViewAdapter.this, new SkypeTelemetryEvent(LogEvent.ac), getMediaDocument(holder.messageId), String.valueOf(l - l1));
                return;
            } else
            {
                MojiMediaMessageViewAdapter.access$500(MojiMediaMessageViewAdapter.this, holder);
                return;
            }
        }

            
            {
                this$0 = final_mojimediamessageviewadapter;
                holder = a;
                startTime = J.this;
                super();
            }
    }

}
