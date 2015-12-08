// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;


// Referenced classes of package com.facebook.internal:
//            WorkQueue

class rkNode
    implements Runnable
{

    final WorkQueue this$0;
    private final rkNode val$node;

    public void run()
    {
        val$node.getCallback().run();
        WorkQueue.access$3(WorkQueue.this, val$node);
        return;
        Exception exception;
        exception;
        WorkQueue.access$3(WorkQueue.this, val$node);
        throw exception;
    }

    rkNode()
    {
        this$0 = final_workqueue;
        val$node = rkNode.this;
        super();
    }
}
