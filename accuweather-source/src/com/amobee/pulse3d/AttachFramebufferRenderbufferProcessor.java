// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;

import android.opengl.GLES20;
import java.util.ArrayList;

// Referenced classes of package com.amobee.pulse3d:
//            IntArgProcessor, Pulse3DView, FramebufferResource, RenderbufferResource, 
//            Pulse3DGLSurfaceView, BufferViewIterator, Pulse3DGLRenderer

class AttachFramebufferRenderbufferProcessor extends IntArgProcessor
{

    int fboHandle_;
    int format_;
    int objectHandle_;
    Pulse3DView viewController_;

    AttachFramebufferRenderbufferProcessor(Pulse3DView pulse3dview)
    {
        viewController_ = pulse3dview;
    }

    void execute()
    {
        final FramebufferResource glFramebufferResource = (FramebufferResource)viewController_.resources.get(fboHandle_);
        final RenderbufferResource glRenderbufferResource = (RenderbufferResource)viewController_.resources.get(objectHandle_);
        final int serial = serial_;
        final int safe_attachment = format_;
        if (glFramebufferResource == null || glRenderbufferResource == null)
        {
            viewController_.reportError(serial_, "Framebufffer or Renderbuffer not found!");
            return;
        } else
        {
            viewController_.mGLView.queueEvent(new Runnable() {

                final AttachFramebufferRenderbufferProcessor this$0;
                final FramebufferResource val$glFramebufferResource;
                final RenderbufferResource val$glRenderbufferResource;
                final int val$safe_attachment;
                final int val$serial;

                public void run()
                {
                    GLES20.glBindFramebuffer(36160, glFramebufferResource.handle);
                    GLES20.glFramebufferRenderbuffer(36160, safe_attachment, 36161, glRenderbufferResource.handle);
                    GLES20.glBindFramebuffer(36160, 0);
                    if (Pulse3DGLRenderer.er() == 0)
                    {
                        viewController_.reportSuccess(serial, (new StringBuilder()).append("").append(fboHandle_).toString());
                        return;
                    } else
                    {
                        viewController_.reportError(serial, "Failed to bind renderbuffer to framebuffer");
                        return;
                    }
                }

            
            {
                this$0 = AttachFramebufferRenderbufferProcessor.this;
                glFramebufferResource = framebufferresource;
                safe_attachment = i;
                glRenderbufferResource = renderbufferresource;
                serial = j;
                super();
            }
            });
            return;
        }
    }

    void parse(BufferViewIterator bufferviewiterator)
    {
        super.parse(bufferviewiterator);
        fboHandle_ = value_;
        super.parse(bufferviewiterator);
        objectHandle_ = value_;
        super.parse(bufferviewiterator);
        format_ = value_;
    }
}
