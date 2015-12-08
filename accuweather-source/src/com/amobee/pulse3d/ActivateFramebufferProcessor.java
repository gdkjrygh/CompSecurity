// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;

import java.util.ArrayList;

// Referenced classes of package com.amobee.pulse3d:
//            IntArgProcessor, Pulse3DView, FramebufferResource, Pulse3DGLSurfaceView

class ActivateFramebufferProcessor extends IntArgProcessor
{

    Pulse3DView viewController_;

    ActivateFramebufferProcessor(Pulse3DView pulse3dview)
    {
        viewController_ = pulse3dview;
    }

    void execute()
    {
        final FramebufferResource frameBuffer = (FramebufferResource)viewController_.resources.get(value_);
        final int serial = serial_;
        if (frameBuffer == null)
        {
            viewController_.reportError(serial_, "Framebuffer buffer not found!");
            return;
        } else
        {
            viewController_.mGLView.queueEvent(new Runnable() {

                final ActivateFramebufferProcessor this$0;
                final FramebufferResource val$frameBuffer;
                final int val$serial;

                public void run()
                {
                    frameBuffer.Activate();
                    if (frameBuffer.handle == 0)
                    {
                        viewController_.reportError(serial, "Failed to activate framebuffer");
                        return;
                    } else
                    {
                        viewController_.reportSuccess(serial, (new StringBuilder()).append("").append(value_).toString());
                        return;
                    }
                }

            
            {
                this$0 = ActivateFramebufferProcessor.this;
                frameBuffer = framebufferresource;
                serial = i;
                super();
            }
            });
            return;
        }
    }
}
