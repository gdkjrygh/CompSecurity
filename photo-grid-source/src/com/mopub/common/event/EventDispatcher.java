// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.common.event;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

// Referenced classes of package com.mopub.common.event:
//            a, BaseEvent

public class EventDispatcher
{

    private final Iterable a;
    private final Looper b;
    private final Handler c;
    private final android.os.Handler.Callback d = new a(this);

    EventDispatcher(Iterable iterable, Looper looper)
    {
        a = iterable;
        b = looper;
        c = new Handler(b, d);
    }

    static Iterable a(EventDispatcher eventdispatcher)
    {
        return eventdispatcher.a;
    }

    public void dispatch(BaseEvent baseevent)
    {
        Message.obtain(c, 0, baseevent).sendToTarget();
    }
}
