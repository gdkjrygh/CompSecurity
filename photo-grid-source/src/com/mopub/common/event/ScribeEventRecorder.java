// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.common.event;

import android.os.Handler;
import android.os.Looper;
import com.mopub.common.logging.MoPubLog;
import com.mopub.network.ScribeBackoffPolicy;
import com.mopub.network.ScribeRequestManager;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// Referenced classes of package com.mopub.common.event:
//            EventRecorder, EventSampler, EventSerializer, c, 
//            b, BaseEvent

public class ScribeEventRecorder
    implements EventRecorder
{

    private final EventSampler a;
    private final Queue b;
    private final EventSerializer c;
    private final ScribeRequestManager d;
    private final Handler e;
    private final c f;

    ScribeEventRecorder(Looper looper)
    {
        this(new EventSampler(), ((Queue) (new LinkedList())), new EventSerializer(), new ScribeRequestManager(looper), new Handler(looper));
    }

    private ScribeEventRecorder(EventSampler eventsampler, Queue queue, EventSerializer eventserializer, ScribeRequestManager scriberequestmanager, Handler handler)
    {
        a = eventsampler;
        b = queue;
        c = eventserializer;
        d = scriberequestmanager;
        e = handler;
        f = new c(this);
    }

    static EventSerializer a(ScribeEventRecorder scribeeventrecorder)
    {
        return scribeeventrecorder.c;
    }

    final void a()
    {
        if (!d.isAtCapacity())
        {
            ArrayList arraylist;
            for (arraylist = new ArrayList(); b.peek() != null && arraylist.size() < 100; arraylist.add(b.poll())) { }
            if (!arraylist.isEmpty())
            {
                d.makeRequest(new b(this, arraylist), new ScribeBackoffPolicy());
                return;
            }
        }
    }

    final void b()
    {
        if (e.hasMessages(0) || b.isEmpty())
        {
            return;
        } else
        {
            e.postDelayed(f, 0x1d4c0L);
            return;
        }
    }

    public void record(BaseEvent baseevent)
    {
        if (!a.a(baseevent))
        {
            return;
        }
        if (b.size() >= 500)
        {
            MoPubLog.d((new StringBuilder("EventQueue is at max capacity. Event \"")).append(baseevent.getName()).append("\" is being dropped.").toString());
            return;
        }
        b.add(baseevent);
        if (b.size() >= 100)
        {
            a();
        }
        b();
    }
}
