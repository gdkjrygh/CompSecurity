// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.common.event;

import android.os.Message;
import com.mopub.common.logging.MoPubLog;
import java.util.Iterator;

// Referenced classes of package com.mopub.common.event:
//            BaseEvent, EventDispatcher, EventRecorder

final class a
    implements android.os.Handler.Callback
{

    final EventDispatcher a;

    a(EventDispatcher eventdispatcher)
    {
        a = eventdispatcher;
        super();
    }

    public final boolean handleMessage(Message message)
    {
        if (message.obj instanceof BaseEvent)
        {
            for (Iterator iterator = EventDispatcher.a(a).iterator(); iterator.hasNext(); ((EventRecorder)iterator.next()).record((BaseEvent)message.obj)) { }
        } else
        {
            MoPubLog.d("EventDispatcher received non-BaseEvent message type.");
        }
        return true;
    }
}
