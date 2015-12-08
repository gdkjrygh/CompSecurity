// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.mm.android.library.events.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.net.ConnectivityManager;
import android.os.IBinder;
import com.digby.mm.android.library.events.IEvent;
import com.digby.mm.android.library.events.queue.impl.BackoffManager;
import com.digby.mm.android.library.services.IEventSenderService;

// Referenced classes of package com.digby.mm.android.library.events.impl:
//            EventSender

class this._cls0
    implements ServiceConnection
{

    final EventSender this$0;

    public void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        EventSender.access$002(EventSender.this, ((com.digby.mm.android.library.services.impl.vice.EventSenderServiceBinder)ibinder).getService());
        EventSender.access$000(EventSender.this).initializeService(new BackoffManager(), (ConnectivityManager)EventSender.access$100(EventSender.this).getContext().getSystemService("connectivity"));
        EventSender.access$000(EventSender.this).addEvent(EventSender.access$100(EventSender.this), EventSender.access$200(EventSender.this));
        EventSender.access$100(EventSender.this).getContext().unbindService(this);
    }

    public void onServiceDisconnected(ComponentName componentname)
    {
        EventSender.access$002(EventSender.this, null);
    }

    ce()
    {
        this$0 = EventSender.this;
        super();
    }
}
