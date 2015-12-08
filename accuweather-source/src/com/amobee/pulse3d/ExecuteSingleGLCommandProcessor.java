// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;

import android.opengl.GLES20;

// Referenced classes of package com.amobee.pulse3d:
//            NativeCommandProcessor, Pulse3DView, Pulse3DGLSurfaceView, CommandBase, 
//            BinInterpreter, BufferViewIterator

class ExecuteSingleGLCommandProcessor extends NativeCommandProcessor
{

    BinInterpreter binInterpreter_;
    CommandBase command_;
    Pulse3DView viewController_;

    ExecuteSingleGLCommandProcessor(Pulse3DView pulse3dview, BinInterpreter bininterpreter)
    {
        viewController_ = pulse3dview;
        binInterpreter_ = bininterpreter;
    }

    void execute()
    {
        viewController_.mGLView.queueEvent(new Runnable() {

            final ExecuteSingleGLCommandProcessor this$0;

            public void run()
            {
                command_.execute();
                if (GLES20.glGetError() == 0)
                {
                    viewController_.reportSuccess(serial_, command_.stringifyResult());
                    return;
                } else
                {
                    viewController_.reportError(serial_, "");
                    return;
                }
            }

            
            {
                this$0 = ExecuteSingleGLCommandProcessor.this;
                super();
            }
        });
    }

    void parse(BufferViewIterator bufferviewiterator)
    {
        CommandBase acommandbase[] = new CommandBase[1];
        try
        {
            binInterpreter_.processSingleCommand(bufferviewiterator, acommandbase);
        }
        // Misplaced declaration of an exception variable
        catch (BufferViewIterator bufferviewiterator)
        {
            bufferviewiterator.printStackTrace();
        }
        // Misplaced declaration of an exception variable
        catch (BufferViewIterator bufferviewiterator)
        {
            bufferviewiterator.printStackTrace();
        }
        command_ = acommandbase[0];
    }
}
