// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;


// Referenced classes of package com.amobee.pulse3d:
//            ActivateRenderbufferProcessor, RenderbufferResource, Pulse3DView

class val.serial
    implements Runnable
{

    final ActivateRenderbufferProcessor this$0;
    final RenderbufferResource val$glBuffer;
    final int val$serial;

    public void run()
    {
        val$glBuffer.Activate();
        if (val$glBuffer.handle == 0)
        {
            viewController_.reportError(val$serial, "Failed to activate renderbuffer");
            return;
        } else
        {
            viewController_.reportSuccess(val$serial, (new StringBuilder()).append("").append(value_).toString());
            return;
        }
    }

    ()
    {
        this$0 = final_activaterenderbufferprocessor;
        val$glBuffer = renderbufferresource;
        val$serial = I.this;
        super();
    }
}
