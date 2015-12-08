// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;


// Referenced classes of package com.amobee.pulse3d:
//            ResizeBuffer2DProcessor, RenderbufferResource, Pulse3DGLRenderer, Pulse3DView, 
//            TextureResource, RenderResource

class val.handle
    implements Runnable
{

    final ResizeBuffer2DProcessor this$0;
    final RenderResource val$glResource;
    final int val$h;
    final int val$handle;
    final int val$serial;
    final int val$w;

    public void run()
    {
        if (val$glResource instanceof RenderbufferResource)
        {
            ((RenderbufferResource)val$glResource).Resize(val$w, val$h);
        } else
        if (val$glResource instanceof TextureResource)
        {
            ((TextureResource)val$glResource).Resize(val$w, val$h);
        }
        if (Pulse3DGLRenderer.er() == 0)
        {
            viewController_.reportSuccess(val$serial, (new StringBuilder()).append("").append(val$handle).toString());
            return;
        } else
        {
            viewController_.reportError(val$serial, "Failed to resize resource");
            return;
        }
    }

    ()
    {
        this$0 = final_resizebuffer2dprocessor;
        val$glResource = renderresource;
        val$w = i;
        val$h = j;
        val$serial = k;
        val$handle = I.this;
        super();
    }
}
