// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.mm.android.library.events.impl;

import com.digby.localpoint.sdk.core.ILPError;
import com.digby.localpoint.sdk.core.impl.LPError;
import com.digby.mm.android.library.events.IEventResponse;
import com.digby.mm.android.library.exception.DigbyException;

// Referenced classes of package com.digby.mm.android.library.events.impl:
//            AbstractEventResponseHandler

public class CheckInEventResponseHandler extends AbstractEventResponseHandler
{

    private static final int FAILED_CHECKIN = 440;
    private DigbyException exception;
    private boolean success;

    public CheckInEventResponseHandler()
    {
        exception = null;
    }

    public ILPError getError()
    {
        return new LPError(440, exception.getMessage());
    }

    public boolean getStatus()
    {
        return success;
    }

    public void onError(DigbyException digbyexception)
    {
        success = false;
        exception = digbyexception;
    }

    public void onResponse(IEventResponse ieventresponse)
    {
        success = true;
    }
}
