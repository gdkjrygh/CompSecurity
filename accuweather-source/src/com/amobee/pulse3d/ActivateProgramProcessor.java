// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;

import java.util.ArrayList;

// Referenced classes of package com.amobee.pulse3d:
//            IntArgProcessor, Pulse3DView, ShaderResource, Pulse3DGLSurfaceView

class ActivateProgramProcessor extends IntArgProcessor
{

    Pulse3DView viewController_;

    ActivateProgramProcessor(Pulse3DView pulse3dview)
    {
        viewController_ = pulse3dview;
    }

    void execute()
    {
        final ShaderResource program = (ShaderResource)viewController_.resources.get(value_);
        final int serial = serial_;
        viewController_.mGLView.queueEvent(new Runnable() {

            final ActivateProgramProcessor this$0;
            final ShaderResource val$program;
            final int val$serial;

            public void run()
            {
                program.Activate();
                if (program.handle != 0)
                {
                    String s = program.getUniformLocations();
                    viewController_.reportSuccess(serial, s);
                    return;
                } else
                {
                    viewController_.reportError(serial, "Error while activating program");
                    return;
                }
            }

            
            {
                this$0 = ActivateProgramProcessor.this;
                program = shaderresource;
                serial = i;
                super();
            }
        });
    }
}
