// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;

import android.opengl.GLES20;
import java.util.ArrayList;

// Referenced classes of package com.amobee.pulse3d:
//            IntArgProcessor, Pulse3DView, FramebufferResource, TextureResource, 
//            Pulse3DGLSurfaceView, BufferViewIterator, Log, Pulse3DGLRenderer

class AttachFramebufferTextureProcessor extends IntArgProcessor
{

    int attachment_;
    int fboHandle_;
    int objectHandle_;
    Pulse3DView viewController_;

    public AttachFramebufferTextureProcessor(Pulse3DView pulse3dview)
    {
        viewController_ = pulse3dview;
    }

    void execute()
    {
        final FramebufferResource glFramebufferResource = (FramebufferResource)viewController_.resources.get(fboHandle_);
        final TextureResource glTextureResource = (TextureResource)viewController_.resources.get(objectHandle_);
        final int attachment = attachment_;
        final int serial = serial_;
        if (glFramebufferResource == null || glTextureResource == null)
        {
            viewController_.reportError(serial, "Could not find framebuffer resource nor texture resource");
            return;
        } else
        {
            viewController_.mGLView.queueEvent(new Runnable() {

                final AttachFramebufferTextureProcessor this$0;
                final int val$attachment;
                final FramebufferResource val$glFramebufferResource;
                final TextureResource val$glTextureResource;
                final int val$serial;

                public void run()
                {
                    GLES20.glBindFramebuffer(36160, glFramebufferResource.handle);
                    GLES20.glFramebufferTexture2D(36160, attachment, 3553, glTextureResource.handle, 0);
                    int i = GLES20.glCheckFramebufferStatus(36160);
                    if (i != 36053)
                    {
                        Log.e("glFrameBufferTexture2D", (new StringBuilder()).append("status = ").append(i).toString());
                    }
                    GLES20.glBindFramebuffer(36160, 0);
                    if (Pulse3DGLRenderer.er() == 0)
                    {
                        viewController_.reportSuccess(serial, (new StringBuilder()).append("").append(fboHandle_).toString());
                        return;
                    } else
                    {
                        viewController_.reportError(serial, "Could not bind texture to framebuffer");
                        return;
                    }
                }

            
            {
                this$0 = AttachFramebufferTextureProcessor.this;
                glFramebufferResource = framebufferresource;
                attachment = i;
                glTextureResource = textureresource;
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
        attachment_ = value_;
    }
}
