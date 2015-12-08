// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.event.EventBuffer;

// Referenced classes of package com.google.android.gms.games.internal.api:
//            EventsImpl

private static abstract class <init> extends com.google.android.gms.games.thodImpl
{

    public com.google.android.gms.games.event.ult O(Status status)
    {
        return new com.google.android.gms.games.event.Events.LoadEventsResult(status) {

            final Status CW;
            final EventsImpl.LoadImpl Ys;

            public EventBuffer getEvents()
            {
                return new EventBuffer(DataHolder.as(14));
            }

            public Status getStatus()
            {
                return CW;
            }

            public void release()
            {
            }

            
            {
                Ys = EventsImpl.LoadImpl.this;
                CW = status;
                super();
            }
        };
    }

    public Result c(Status status)
    {
        return O(status);
    }

    private _cls1.CW()
    {
    }

    _cls1.CW(_cls1.CW cw)
    {
        this();
    }
}
