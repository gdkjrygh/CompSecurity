// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;

import java.util.ArrayList;

// Referenced classes of package com.amobee.pulse3d:
//            IntArgProcessor, Pulse3DView, RenderbufferResource, Pulse3DGLSurfaceView

class ActivateRenderbufferProcessor extends IntArgProcessor
{

    Pulse3DView viewController_;

    ActivateRenderbufferProcessor(Pulse3DView pulse3dview)
    {
        viewController_ = pulse3dview;
    }

    void execute()
    {
        final RenderbufferResource glBuffer = (RenderbufferResource)viewController_.resources.get(value_);
        final int serial = serial_;
        if (glBuffer == null)
        {
            viewController_.reportError(serial_, "Render buffer not found!");
            return;
        } else
        {
            viewController_.mGLView.queueEvent(new Runnable() {

                final ActivateRenderbufferProcessor this$0;
                final RenderbufferResource val$glBuffer;
                final int val$serial;

                public void run()
                {
                    glBuffer.Activate();
                    if (glBuffer.handle == 0)
                    {
                        viewController_.reportError(serial, "Failed to activate renderbuffer");
                        return;
                    } else
                    {
                        viewController_.reportSuccess(serial, (new StringBuilder()).append("").append(value_).toString());
                        return;
                    }
                }

            
            {
                this$0 = ActivateRenderbufferProcessor.this;
                glBuffer = renderbufferresource;
                serial = i;
                super();
            }
            });
            return;
        }
    }
}
