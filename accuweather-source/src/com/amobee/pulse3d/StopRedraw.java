// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;


// Referenced classes of package com.amobee.pulse3d:
//            NativeCommandProcessor, Pulse3DView, Pulse3DGLSurfaceView, Pulse3DGLRenderer, 
//            BufferViewIterator

class StopRedraw extends NativeCommandProcessor
{

    Pulse3DView viewController_;

    StopRedraw(Pulse3DView pulse3dview)
    {
        viewController_ = pulse3dview;
    }

    void execute()
    {
        viewController_.mGLView.renderer.stopped = true;
        viewController_.mGLView.setSwapBufferEnabled(false);
        viewController_.reportSuccess(serial_, "Redraw stopped!");
    }

    public void parse(BufferViewIterator bufferviewiterator)
    {
    }
}
