// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.event.EventBuffer;

// Referenced classes of package com.google.android.gms.games.internal.api:
//            EventsImpl

class DS
    implements com.google.android.gms.games.event.t
{

    final Status DS;
    final DS aan;

    public EventBuffer getEvents()
    {
        return new EventBuffer(DataHolder.av(14));
    }

    public Status getStatus()
    {
        return DS;
    }

    public void release()
    {
    }

    ( , Status status)
    {
        aan = ;
        DS = status;
        super();
    }
}
