// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;


// Referenced classes of package com.amobee.pulse3d:
//            NativeCommandProcessor, BinInterpreter, Pulse3DView, Pulse3DGLSurfaceView, 
//            Pulse3DGLRenderer, Pulse3DJavaScriptInterface, BufferViewIterator

class ClearAllDisplayListProcessor extends NativeCommandProcessor
{

    BinInterpreter binInterpreter_;

    public ClearAllDisplayListProcessor(BinInterpreter bininterpreter)
    {
        binInterpreter_ = bininterpreter;
    }

    void execute()
    {
label0:
        {
            synchronized (binInterpreter_.viewController_)
            {
                if (binInterpreter_.viewController_.mGLView != null)
                {
                    break label0;
                }
            }
            return;
        }
        binInterpreter_.viewController_.mGLView.renderer.ClearAllDisplayLists();
        if (!binInterpreter_.viewController_.jsInterface3D.isRedrawSuspended)
        {
            binInterpreter_.viewController_.mGLView.requestRender();
        }
        binInterpreter_.viewController_.mGLView.renderer.needCommitDisplayListChanges = false;
        pulse3dview;
        JVM INSTR monitorexit ;
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
    }
}
