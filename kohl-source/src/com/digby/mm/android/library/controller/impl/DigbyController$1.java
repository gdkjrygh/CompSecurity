// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.mm.android.library.controller.impl;

import com.digby.mm.android.library.events.IEventResponse;
import com.digby.mm.android.library.events.impl.AbstractEventResponseHandler;
import com.digby.mm.android.library.exception.DigbyException;

// Referenced classes of package com.digby.mm.android.library.controller.impl:
//            DigbyController

class andler extends AbstractEventResponseHandler
{

    final DigbyController this$0;

    public void onError(DigbyException digbyexception)
    {
    }

    public void onResponse(IEventResponse ieventresponse)
    {
    }

    andler()
    {
        this$0 = DigbyController.this;
        super();
    }
}
