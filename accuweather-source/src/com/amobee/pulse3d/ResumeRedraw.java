// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;


// Referenced classes of package com.amobee.pulse3d:
//            NativeCommandProcessor, Pulse3DView, Pulse3DGLSurfaceView, Pulse3DGLRenderer, 
//            BufferViewIterator

class ResumeRedraw extends NativeCommandProcessor
{

    Pulse3DView viewController_;

    ResumeRedraw(Pulse3DView pulse3dview)
    {
        viewController_ = pulse3dview;
    }

    void execute()
    {
        viewController_.mGLView.renderer.stopped = false;
        viewController_.mGLView.setSwapBufferEnabled(true);
        viewController_.reportSuccess(serial_, "Redraw resumed!");
    }

    public void parse(BufferViewIterator bufferviewiterator)
    {
    }
}
