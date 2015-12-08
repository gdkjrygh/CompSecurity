// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.lang3.concurrent;


// Referenced classes of package org.apache.commons.lang3.concurrent:
//            TimedSemaphore

class this._cls0
    implements Runnable
{

    final TimedSemaphore this$0;

    public void run()
    {
        endOfPeriod();
    }

    ()
    {
        this$0 = TimedSemaphore.this;
        super();
    }
}
