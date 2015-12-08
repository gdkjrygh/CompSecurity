// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.media.MediaPlayer;
import com.skype.android.analytics.LogEvent;
import com.skype.android.analytics.SkypeTelemetryEvent;

// Referenced classes of package com.skype.android.app.chat:
//            MojiMediaMessageViewAdapter

final class val.holder
    implements android.media.iewAdapter._cls8
{

    final MojiMediaMessageViewAdapter this$0;
    final messageId val$holder;

    public final boolean onError(MediaPlayer mediaplayer, int i, int j)
    {
        MojiMediaMessageViewAdapter.access$400(MojiMediaMessageViewAdapter.this, val$holder);
        MojiMediaMessageViewAdapter.access$600(MojiMediaMessageViewAdapter.this, new SkypeTelemetryEvent(LogEvent.V), getMediaDocument(val$holder.messageId));
        return true;
    }

    ()
    {
        this$0 = final_mojimediamessageviewadapter;
        val$holder = val.holder.this;
        super();
    }
}
