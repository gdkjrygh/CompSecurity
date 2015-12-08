// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.base;

import de.greenrobot.event.EventBus;

// Referenced classes of package com.pinterest.base:
//            Events

final class val.event
    implements Runnable
{

    final Object val$event;

    public final void run()
    {
        Events.access$000().postSticky(val$event);
    }

    ()
    {
        val$event = obj;
        super();
    }
}
