// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;


// Referenced classes of package com.amobee.pulse3d:
//            ActivateBufferProcessor, BufferResource, Pulse3DView

class val.safe_source_handle
    implements Runnable
{

    final ActivateBufferProcessor this$0;
    final BufferResource val$glBuffer;
    final int val$safe_source_handle;
    final int val$serial;

    public void run()
    {
        val$glBuffer.Activate();
        if (val$glBuffer.handle != 0)
        {
            viewController_.reportSuccess(val$serial, (new StringBuilder()).append("").append(val$safe_source_handle).toString());
            return;
        } else
        {
            viewController_.reportError(val$serial, "Error while activating buffer");
            return;
        }
    }

    ()
    {
        this$0 = final_activatebufferprocessor;
        val$glBuffer = bufferresource;
        val$serial = i;
        val$safe_source_handle = I.this;
        super();
    }
}
