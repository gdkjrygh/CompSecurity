// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j;

import java.util.concurrent.ExecutorService;

// Referenced classes of package twitter4j:
//            DispatcherImpl

class this._cls0 extends Thread
{

    final DispatcherImpl this$0;

    public void run()
    {
        DispatcherImpl.access$000(DispatcherImpl.this).shutdown();
    }

    orService()
    {
        this$0 = DispatcherImpl.this;
        super();
    }
}
