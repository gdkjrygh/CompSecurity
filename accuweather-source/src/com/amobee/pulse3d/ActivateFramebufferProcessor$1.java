// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;


// Referenced classes of package com.amobee.pulse3d:
//            ActivateFramebufferProcessor, FramebufferResource, Pulse3DView

class val.serial
    implements Runnable
{

    final ActivateFramebufferProcessor this$0;
    final FramebufferResource val$frameBuffer;
    final int val$serial;

    public void run()
    {
        val$frameBuffer.Activate();
        if (val$frameBuffer.handle == 0)
        {
            viewController_.reportError(val$serial, "Failed to activate framebuffer");
            return;
        } else
        {
            viewController_.reportSuccess(val$serial, (new StringBuilder()).append("").append(value_).toString());
            return;
        }
    }

    ()
    {
        this$0 = final_activateframebufferprocessor;
        val$frameBuffer = framebufferresource;
        val$serial = I.this;
        super();
    }
}
