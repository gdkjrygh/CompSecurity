// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;


// Referenced classes of package com.adobe.mediacore:
//            MediaPlayerEvent

class ErrorEvent extends MediaPlayerEvent
{

    private ErrorEvent()
    {
        super(MediaPlayerEvent.Type.VIDEO_ERROR);
    }

    public static ErrorEvent createVideoErrorEvent(MediaPlayerNotification.Error error)
    {
        ErrorEvent errorevent = new ErrorEvent();
        errorevent.setNotification(error);
        return errorevent;
    }
}
