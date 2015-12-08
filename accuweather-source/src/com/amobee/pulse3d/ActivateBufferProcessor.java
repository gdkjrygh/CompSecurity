// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;

import java.util.ArrayList;

// Referenced classes of package com.amobee.pulse3d:
//            IntArgProcessor, Pulse3DView, BufferResource, Pulse3DGLSurfaceView

class ActivateBufferProcessor extends IntArgProcessor
{

    Pulse3DView viewController_;

    ActivateBufferProcessor(Pulse3DView pulse3dview)
    {
        viewController_ = pulse3dview;
    }

    void execute()
    {
        final int safe_source_handle = value_;
        final int serial = serial_;
        final BufferResource glBuffer = (BufferResource)viewController_.resources.get(value_);
        if (glBuffer == null)
        {
            viewController_.reportError(serial_, "Handle for activateBuffer was not found");
            return;
        } else
        {
            viewController_.mGLView.queueEvent(new Runnable() {

                final ActivateBufferProcessor this$0;
                final BufferResource val$glBuffer;
                final int val$safe_source_handle;
                final int val$serial;

                public void run()
                {
                    glBuffer.Activate();
                    if (glBuffer.handle != 0)
                    {
                        viewController_.reportSuccess(serial, (new StringBuilder()).append("").append(safe_source_handle).toString());
                        return;
                    } else
                    {
                        viewController_.reportError(serial, "Error while activating buffer");
                        return;
                    }
                }

            
            {
                this$0 = ActivateBufferProcessor.this;
                glBuffer = bufferresource;
                serial = i;
                safe_source_handle = j;
                super();
            }
            });
            return;
        }
    }
}
