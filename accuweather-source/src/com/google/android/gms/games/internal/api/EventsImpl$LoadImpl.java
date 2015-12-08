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

    public com.google.android.gms.games.event.ult A(Status status)
    {
        return new com.google.android.gms.games.event.Events.LoadEventsResult(status) {

            final EventsImpl.LoadImpl Po;
            final Status yG;

            public EventBuffer getEvents()
            {
                return new EventBuffer(DataHolder.af(14));
            }

            public Status getStatus()
            {
                return yG;
            }

            public void release()
            {
            }

            
            {
                Po = EventsImpl.LoadImpl.this;
                yG = status;
                super();
            }
        };
    }

    public Result c(Status status)
    {
        return A(status);
    }

    private _cls1.yG()
    {
    }

    _cls1.yG(_cls1.yG yg)
    {
        this();
    }
}
