// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;

import java.util.ArrayList;

// Referenced classes of package com.amobee.pulse3d:
//            IntArgProcessor, Pulse3DView, RenderResource, Pulse3DGLSurfaceView

class DeactivateResourceProcessor extends IntArgProcessor
{

    Pulse3DView viewController_;

    DeactivateResourceProcessor(Pulse3DView pulse3dview)
    {
        viewController_ = pulse3dview;
    }

    void execute()
    {
        final RenderResource glResource = (RenderResource)viewController_.resources.get(value_);
        final int serial = serial_;
        if (glResource == null)
        {
            viewController_.reportError(serial_, "Can't deactivate resource, provided resource not found");
            return;
        } else
        {
            viewController_.mGLView.queueEvent(new Runnable() {

                final DeactivateResourceProcessor this$0;
                final RenderResource val$glResource;
                final int val$serial;

                public void run()
                {
                    glResource.Deactivate();
                    if (glResource.handle == 0)
                    {
                        viewController_.reportError(serial, "Could not deactivate resource");
                        return;
                    } else
                    {
                        viewController_.reportSuccess(serial, (new StringBuilder()).append("").append(glResource.handle).toString());
                        return;
                    }
                }

            
            {
                this$0 = DeactivateResourceProcessor.this;
                glResource = renderresource;
                serial = i;
                super();
            }
            });
            return;
        }
    }
}
