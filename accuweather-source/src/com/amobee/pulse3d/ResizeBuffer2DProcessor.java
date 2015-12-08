// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;

import java.util.ArrayList;

// Referenced classes of package com.amobee.pulse3d:
//            IntArgProcessor, Pulse3DView, RenderResource, TextureResource, 
//            RenderbufferResource, Pulse3DGLSurfaceView, BufferViewIterator, Pulse3DGLRenderer

class ResizeBuffer2DProcessor extends IntArgProcessor
{

    int h_;
    int handle_;
    Pulse3DView viewController_;
    int w_;

    public ResizeBuffer2DProcessor(Pulse3DView pulse3dview)
    {
        viewController_ = pulse3dview;
    }

    void execute()
    {
        final int serial = serial_;
        final int handle = handle_;
        final int w = w_;
        final int h = h_;
        final RenderResource glResource = (RenderResource)viewController_.resources.get(handle_);
        if (glResource == null)
        {
            viewController_.reportError(serial_, "Could not find resource to resize!");
            return;
        }
        if (!(glResource instanceof TextureResource) && !(glResource instanceof RenderbufferResource))
        {
            viewController_.reportError(serial_, "Invalid resource type, must be renderbuffer or texture");
            return;
        } else
        {
            viewController_.mGLView.queueEvent(new Runnable() {

                final ResizeBuffer2DProcessor this$0;
                final RenderResource val$glResource;
                final int val$h;
                final int val$handle;
                final int val$serial;
                final int val$w;

                public void run()
                {
                    if (glResource instanceof RenderbufferResource)
                    {
                        ((RenderbufferResource)glResource).Resize(w, h);
                    } else
                    if (glResource instanceof TextureResource)
                    {
                        ((TextureResource)glResource).Resize(w, h);
                    }
                    if (Pulse3DGLRenderer.er() == 0)
                    {
                        viewController_.reportSuccess(serial, (new StringBuilder()).append("").append(handle).toString());
                        return;
                    } else
                    {
                        viewController_.reportError(serial, "Failed to resize resource");
                        return;
                    }
                }

            
            {
                this$0 = ResizeBuffer2DProcessor.this;
                glResource = renderresource;
                w = i;
                h = j;
                serial = k;
                handle = l;
                super();
            }
            });
            return;
        }
    }

    void parse(BufferViewIterator bufferviewiterator)
    {
        super.parse(bufferviewiterator);
        w_ = value_;
        super.parse(bufferviewiterator);
        h_ = value_;
        super.parse(bufferviewiterator);
        handle_ = value_;
    }
}
