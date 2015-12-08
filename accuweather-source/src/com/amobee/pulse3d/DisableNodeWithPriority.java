// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;

import android.util.SparseArray;

// Referenced classes of package com.amobee.pulse3d:
//            NativeCommandProcessor, Pulse3DView, Pulse3DGLSurfaceView, Pulse3DGLRenderer, 
//            CommandList, BufferViewIterator

class DisableNodeWithPriority extends NativeCommandProcessor
{

    int priorities_[];
    Pulse3DView viewController_;

    DisableNodeWithPriority(Pulse3DView pulse3dview)
    {
        viewController_ = pulse3dview;
    }

    void execute()
    {
        SparseArray sparsearray = viewController_.mGLView.renderer.commandLists;
        sparsearray;
        JVM INSTR monitorenter ;
        int i = 0;
_L2:
        Object obj;
        if (i >= priorities_.length)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        obj = viewController_.mGLView.renderer.commandLists.get(priorities_[i]);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_80;
        }
        ((CommandList)obj).disable();
        break MISSING_BLOCK_LABEL_80;
        viewController_.setCommandListHasChanged(true);
        sparsearray;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        sparsearray;
        JVM INSTR monitorexit ;
        throw exception;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    void parse(BufferViewIterator bufferviewiterator)
    {
        priorities_ = bufferviewiterator.parseIntBufferWithByteLength();
    }
}
