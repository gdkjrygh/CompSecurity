// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;

import android.util.SparseArray;

// Referenced classes of package com.amobee.pulse3d:
//            NativeCommandProcessor, Pulse3DView, Pulse3DGLSurfaceView, Pulse3DGLRenderer, 
//            CommandList, BufferViewIterator

class EnableNodesWithPriorityRange extends NativeCommandProcessor
{

    int max_;
    int min_;
    Pulse3DView viewController_;

    EnableNodesWithPriorityRange(Pulse3DView pulse3dview)
    {
        viewController_ = pulse3dview;
    }

    void execute()
    {
        SparseArray sparsearray = viewController_.mGLView.renderer.commandLists;
        sparsearray;
        JVM INSTR monitorenter ;
        int j = viewController_.mGLView.renderer.commandLists.size();
        int i = 0;
_L2:
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_106;
        }
        int k = viewController_.mGLView.renderer.commandLists.keyAt(i);
        if (k >= min_ && k <= max_)
        {
            ((CommandList)viewController_.mGLView.renderer.commandLists.get(k)).enable();
        }
        break MISSING_BLOCK_LABEL_122;
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
        min_ = bufferviewiterator.parseInt();
        max_ = bufferviewiterator.parseInt();
    }
}
