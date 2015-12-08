// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.eventbus;

import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.android.apps.wallet.eventbus:
//            EventBus, RegistrationCallback

final class nCallback
    implements Runnable
{

    final EventBus this$0;
    final RegistrationCallback val$callback;
    final Set val$eventIds;

    public final void run()
    {
        Object obj;
        for (Iterator iterator = val$eventIds.iterator(); iterator.hasNext(); val$callback.handleRegistration(obj))
        {
            obj = iterator.next();
        }

    }

    nCallback()
    {
        this$0 = final_eventbus;
        val$eventIds = set;
        val$callback = RegistrationCallback.this;
        super();
    }
}
