// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;


// Referenced classes of package com.adobe.mediacore:
//            MediaPlayerEvent

class OperationFailedEvent extends MediaPlayerEvent
{

    private OperationFailedEvent()
    {
        super(MediaPlayerEvent.Type.OPERATION_FAILED);
    }

    public static OperationFailedEvent createEvent(MediaPlayerNotification.Warning warning)
    {
        OperationFailedEvent operationfailedevent = new OperationFailedEvent();
        operationfailedevent.setNotification(warning);
        return operationfailedevent;
    }
}
