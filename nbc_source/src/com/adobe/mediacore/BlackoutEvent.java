// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;


// Referenced classes of package com.adobe.mediacore:
//            MediaPlayerEvent

class BlackoutEvent extends MediaPlayerEvent
{

    public BlackoutEvent(MediaPlayerEvent.Type type)
    {
        super(type);
    }

    public static BlackoutEvent createBlackoutEvent()
    {
        return new BlackoutEvent(MediaPlayerEvent.Type.BACKGROUND_MANIFEST_FAILED);
    }
}
