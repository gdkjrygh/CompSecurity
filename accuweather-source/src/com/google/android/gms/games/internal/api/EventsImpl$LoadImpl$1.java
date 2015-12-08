// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.event.EventBuffer;

// Referenced classes of package com.google.android.gms.games.internal.api:
//            EventsImpl

class yG
    implements com.google.android.gms.games.event.t
{

    final yG Po;
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

    ( , Status status)
    {
        Po = ;
        yG = status;
        super();
    }
}
