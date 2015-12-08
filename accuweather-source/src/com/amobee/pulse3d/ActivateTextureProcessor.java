// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;

import java.util.ArrayList;

// Referenced classes of package com.amobee.pulse3d:
//            NativeCommandProcessor, Pulse3DView, Pulse3DGLSurfaceView, BufferViewIterator, 
//            TextureResource

class ActivateTextureProcessor extends NativeCommandProcessor
{

    int format_;
    int handle_;
    Pulse3DView viewController_;

    ActivateTextureProcessor(Pulse3DView pulse3dview)
    {
        viewController_ = pulse3dview;
    }

    void execute()
    {
        final int serial = serial_;
        final int handle = handle_;
        final int format = format_;
        viewController_.mGLView.queueEvent(new Runnable() {

            final ActivateTextureProcessor this$0;
            final int val$format;
            final int val$handle;
            final int val$serial;

            public void run()
            {
                if (viewController_.resources == null)
                {
                    return;
                }
                TextureResource textureresource = (TextureResource)viewController_.resources.get(handle);
                if (textureresource == null)
                {
                    viewController_.reportError(serial, "handle not found!");
                    return;
                }
                textureresource.setFormatRequest(format);
                textureresource.Activate();
                if (textureresource.handle != 0)
                {
                    viewController_.reportSuccess(serial, Integer.toString(handle));
                    return;
                } else
                {
                    viewController_.reportError(serial, "could not activate texture with this format");
                    return;
                }
            }

            
            {
                this$0 = ActivateTextureProcessor.this;
                handle = i;
                serial = j;
                format = k;
                super();
            }
        });
    }

    void parse(BufferViewIterator bufferviewiterator)
    {
        handle_ = bufferviewiterator.parseInt();
        format_ = bufferviewiterator.parseInt();
    }
}
