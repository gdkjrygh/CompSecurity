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

final class val.startTime
    implements android.media.
{

    final MojiMediaMessageViewAdapter this$0;
    final val.holder val$holder;
    final long val$startTime;

    public final void onPrepared(MediaPlayer mediaplayer)
    {
        if (MojiMediaMessageViewAdapter.access$300(MojiMediaMessageViewAdapter.this).isCurrentlyPlayingMessage(val$holder.messageId))
        {
            val$holder.itemLayout.setOnClickListener(new android.view.View.OnClickListener() {

                final MojiMediaMessageViewAdapter._cls7 this$1;

                public final void onClick(View view)
                {
                    if (holder.videoTextureView.isPlaying())
                    {
                        holder.videoTextureView.a();
                    }
                    MojiMediaMessageViewAdapter.access$400(this$0, holder);
                }

            
            {
                this$1 = MojiMediaMessageViewAdapter._cls7.this;
                super();
            }
            });
            int i = MojiMediaMessageViewAdapter.access$300(MojiMediaMessageViewAdapter.this).getCurrentPosition(val$holder.messageId);
            if (i > 0)
            {
                val$holder.videoTextureView.seekTo(i);
            }
            val$holder.videoTextureView.start();
            long l = System.currentTimeMillis();
            long l1 = val$startTime;
            MojiMediaMessageViewAdapter.access$100(MojiMediaMessageViewAdapter.this, new SkypeTelemetryEvent(LogEvent.ac), getMediaDocument(val$holder.messageId), String.valueOf(l - l1));
            return;
        } else
        {
            MojiMediaMessageViewAdapter.access$500(MojiMediaMessageViewAdapter.this, val$holder);
            return;
        }
    }

    _cls1.this._cls1()
    {
        this$0 = final_mojimediamessageviewadapter;
        val$holder = _pcls1;
        val$startTime = J.this;
        super();
    }
}
