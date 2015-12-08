// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.tracks;

import android.os.Handler;
import android.os.Message;
import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.events.PlayerUICommand;
import com.soundcloud.android.events.UIEvent;
import com.soundcloud.rx.eventbus.EventBus;

class this._cls0 extends Handler
{

    final this._cls0 this$0;

    public void handleMessage(Message message)
    {
        cess._mth200(this._cls0.this).publish(EventQueue.PLAYER_COMMAND, PlayerUICommand.collapsePlayer());
        cess._mth200(this._cls0.this).publish(EventQueue.TRACKING, UIEvent.fromPlayerClose("comments_open"));
    }

    ()
    {
        this$0 = this._cls0.this;
        super();
    }
}
