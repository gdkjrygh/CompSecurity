// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.sendapin.ui;

import com.pinterest.activity.sendapin.events.SendEvent;
import com.pinterest.activity.task.event.ToastEvent;
import com.pinterest.activity.task.toast.SendToast;
import com.pinterest.base.Events;

class val.event
    implements Runnable
{

    final val.event this$1;
    final SendEvent val$event;

    public void run()
    {
        Events.post(new ToastEvent(new SendToast(val$event)));
    }

    ()
    {
        this$1 = final_;
        val$event = SendEvent.this;
        super();
    }
}
