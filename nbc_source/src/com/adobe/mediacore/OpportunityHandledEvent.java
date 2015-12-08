// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;


// Referenced classes of package com.adobe.mediacore:
//            MediaPlayerEvent

class OpportunityHandledEvent extends MediaPlayerEvent
{

    private final long _time;

    public OpportunityHandledEvent(MediaPlayerEvent.Type type, long l)
    {
        super(type);
        _time = l;
    }

    public long getTime()
    {
        return _time;
    }
}
