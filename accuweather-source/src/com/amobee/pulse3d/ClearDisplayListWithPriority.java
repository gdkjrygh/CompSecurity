// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;


// Referenced classes of package com.amobee.pulse3d:
//            NativeCommandProcessor, BinInterpreter, Pulse3DView, Pulse3DGLSurfaceView, 
//            Pulse3DGLRenderer, Pulse3DJavaScriptInterface, BufferViewIterator

class ClearDisplayListWithPriority extends NativeCommandProcessor
{

    BinInterpreter binInterpreter_;
    int priority_;

    public ClearDisplayListWithPriority(BinInterpreter bininterpreter)
    {
        binInterpreter_ = bininterpreter;
    }

    public void execute()
    {
        synchronized (binInterpreter_.viewController_)
        {
            binInterpreter_.viewController_.mGLView.renderer.ClearDisplayListWithPriority(priority_);
            if (!binInterpreter_.viewController_.jsInterface3D.isRedrawSuspended)
            {
                binInterpreter_.viewController_.mGLView.requestRender();
            }
            binInterpreter_.viewController_.mGLView.renderer.needCommitDisplayListChanges = false;
        }
        return;
        exception1;
        pulse3dview;
        JVM INSTR monitorexit ;
        try
        {
            throw exception1;
        }
        catch (Exception exception)
        {
            if (exception != null)
            {
                exception.printStackTrace();
            }
        }
        return;
    }

    public void parse(BufferViewIterator bufferviewiterator)
    {
        priority_ = bufferviewiterator.parseInt();
    }
}
