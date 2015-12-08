// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;

import android.opengl.GLES20;

// Referenced classes of package com.amobee.pulse3d:
//            AttachFramebufferTextureProcessor, FramebufferResource, TextureResource, Log, 
//            Pulse3DGLRenderer, Pulse3DView

class val.serial
    implements Runnable
{

    final AttachFramebufferTextureProcessor this$0;
    final int val$attachment;
    final FramebufferResource val$glFramebufferResource;
    final TextureResource val$glTextureResource;
    final int val$serial;

    public void run()
    {
        GLES20.glBindFramebuffer(36160, val$glFramebufferResource.handle);
        GLES20.glFramebufferTexture2D(36160, val$attachment, 3553, val$glTextureResource.handle, 0);
        int i = GLES20.glCheckFramebufferStatus(36160);
        if (i != 36053)
        {
            Log.e("glFrameBufferTexture2D", (new StringBuilder()).append("status = ").append(i).toString());
        }
        GLES20.glBindFramebuffer(36160, 0);
        if (Pulse3DGLRenderer.er() == 0)
        {
            viewController_.reportSuccess(val$serial, (new StringBuilder()).append("").append(fboHandle_).toString());
            return;
        } else
        {
            viewController_.reportError(val$serial, "Could not bind texture to framebuffer");
            return;
        }
    }

    ()
    {
        this$0 = final_attachframebuffertextureprocessor;
        val$glFramebufferResource = framebufferresource;
        val$attachment = i;
        val$glTextureResource = textureresource;
        val$serial = I.this;
        super();
    }
}
