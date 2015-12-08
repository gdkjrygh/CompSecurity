// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.kit.data;


// Referenced classes of package com.pinterest.kit.data:
//            DiskWatcher

class val.event
    implements Runnable
{

    final val.event this$1;
    final int val$event;

    public void run()
    {
        onEvent(val$event);
    }

    ()
    {
        this$1 = final_;
        val$event = I.this;
        super();
    }
}
