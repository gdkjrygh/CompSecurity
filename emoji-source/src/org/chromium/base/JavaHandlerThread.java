// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.base;

import android.os.Handler;
import android.os.HandlerThread;

class JavaHandlerThread
{

    final HandlerThread mThread;

    private JavaHandlerThread(String s)
    {
        mThread = new HandlerThread(s);
    }

    private static JavaHandlerThread create(String s)
    {
        return new JavaHandlerThread(s);
    }

    private native void nativeInitializeThread(long l, long l1);

    private void start(final long nativeThread, final long nativeEvent)
    {
        mThread.start();
        (new Handler(mThread.getLooper())).post(new Runnable() {

            final JavaHandlerThread this$0;
            final long val$nativeEvent;
            final long val$nativeThread;

            public void run()
            {
                nativeInitializeThread(nativeThread, nativeEvent);
            }

            
            {
                this$0 = JavaHandlerThread.this;
                nativeThread = l;
                nativeEvent = l1;
                super();
            }
        });
    }

}
