// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.event;

import com.google.android.gms.common.data.DataBuffer;
import com.google.android.gms.common.data.DataHolder;

// Referenced classes of package com.google.android.gms.games.event:
//            EventRef, Event

public final class EventBuffer extends DataBuffer
{

    public EventBuffer(DataHolder dataholder)
    {
        super(dataholder);
    }

    public Event get(int i)
    {
        return new EventRef(DG, i);
    }

    public volatile Object get(int i)
    {
        return get(i);
    }
}
