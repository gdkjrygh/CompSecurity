// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova;


// Referenced classes of package org.apache.cordova:
//            NativeToJsMessageQueue

private abstract class <init>
{

    final NativeToJsMessageQueue this$0;

    void notifyOfFlush(boolean flag)
    {
    }

    abstract void onNativeToJsMessageAvailable();

    void reset()
    {
    }

    private ()
    {
        this$0 = NativeToJsMessageQueue.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
