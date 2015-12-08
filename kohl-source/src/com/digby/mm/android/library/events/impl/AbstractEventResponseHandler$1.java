// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.mm.android.library.events.impl;

import android.content.Context;
import android.content.Intent;
import com.digby.mm.android.library.events.IEvent;
import com.digby.mm.android.library.events.IEventResponse;
import com.digby.mm.android.library.exception.DigbyException;
import com.digby.mm.android.library.utils.Logger;

// Referenced classes of package com.digby.mm.android.library.events.impl:
//            AbstractEventResponseHandler

class nit> extends AbstractEventResponseHandler
{

    final AbstractEventResponseHandler this$0;

    public void onError(DigbyException digbyexception)
    {
    }

    public void onResponse(IEventResponse ieventresponse)
    {
        Logger.Debug("Send GeoFencesUpdated Intent", AbstractEventResponseHandler.access$000(AbstractEventResponseHandler.this).getContext());
        ieventresponse = new Intent("com.digby.mm.android.library.GeoFencesUpdated");
        AbstractEventResponseHandler.access$000(AbstractEventResponseHandler.this).getContext().sendBroadcast(ieventresponse);
    }

    ()
    {
        this$0 = AbstractEventResponseHandler.this;
        super();
    }
}
