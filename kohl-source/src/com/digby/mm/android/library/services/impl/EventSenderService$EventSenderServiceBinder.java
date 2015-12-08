// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.mm.android.library.services.impl;

import android.os.Binder;
import com.digby.mm.android.library.services.IEventSenderService;

// Referenced classes of package com.digby.mm.android.library.services.impl:
//            EventSenderService

public class this._cls0 extends Binder
{

    final EventSenderService this$0;

    public IEventSenderService getService()
    {
        return EventSenderService.this;
    }

    public ()
    {
        this$0 = EventSenderService.this;
        super();
    }
}
