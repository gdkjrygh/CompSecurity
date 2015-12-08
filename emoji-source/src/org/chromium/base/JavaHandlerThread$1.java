// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.base;


// Referenced classes of package org.chromium.base:
//            JavaHandlerThread

class val.nativeEvent
    implements Runnable
{

    final JavaHandlerThread this$0;
    final long val$nativeEvent;
    final long val$nativeThread;

    public void run()
    {
        JavaHandlerThread.access$000(JavaHandlerThread.this, val$nativeThread, val$nativeEvent);
    }

    ()
    {
        this$0 = final_javahandlerthread;
        val$nativeThread = l;
        val$nativeEvent = J.this;
        super();
    }
}
