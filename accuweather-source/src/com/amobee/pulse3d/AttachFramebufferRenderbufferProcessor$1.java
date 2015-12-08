// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;

import android.opengl.GLES20;

// Referenced classes of package com.amobee.pulse3d:
//            AttachFramebufferRenderbufferProcessor, FramebufferResource, RenderbufferResource, Pulse3DGLRenderer, 
//            Pulse3DView

class val.serial
    implements Runnable
{

    final AttachFramebufferRenderbufferProcessor this$0;
    final FramebufferResource val$glFramebufferResource;
    final RenderbufferResource val$glRenderbufferResource;
    final int val$safe_attachment;
    final int val$serial;

    public void run()
    {
        GLES20.glBindFramebuffer(36160, val$glFramebufferResource.handle);
        GLES20.glFramebufferRenderbuffer(36160, val$safe_attachment, 36161, val$glRenderbufferResource.handle);
        GLES20.glBindFramebuffer(36160, 0);
        if (Pulse3DGLRenderer.er() == 0)
        {
            viewController_.reportSuccess(val$serial, (new StringBuilder()).append("").append(fboHandle_).toString());
            return;
        } else
        {
            viewController_.reportError(val$serial, "Failed to bind renderbuffer to framebuffer");
            return;
        }
    }

    A()
    {
        this$0 = final_attachframebufferrenderbufferprocessor;
        val$glFramebufferResource = framebufferresource;
        val$safe_attachment = i;
        val$glRenderbufferResource = renderbufferresource;
        val$serial = I.this;
        super();
    }
}
