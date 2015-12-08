// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

// Referenced classes of package com.amobee.pulse3d:
//            StringArgProcessor, Pulse3DView, Pulse3DGLSurfaceView, Pulse3DGLRenderer, 
//            CommandList, CommandBase, BufferViewIterator, BinInterpreter

class ReplaceDisplayListNode extends StringArgProcessor
{

    BinInterpreter binInterpreter_;
    int nbCommands_;
    String nodeId_;
    int priority_;
    ArrayList replaces_;
    Pulse3DView viewController_;

    public ReplaceDisplayListNode(Pulse3DView pulse3dview, BinInterpreter bininterpreter)
    {
        viewController_ = pulse3dview;
        binInterpreter_ = bininterpreter;
    }

    void execute()
    {
        Pulse3DView pulse3dview = viewController_;
        pulse3dview;
        JVM INSTR monitorenter ;
        ArrayList arraylist;
        String s;
        int i;
        arraylist = replaces_;
        s = nodeId_;
        i = priority_;
        SparseArray sparsearray = viewController_.mGLView.renderer.commandLists;
        sparsearray;
        JVM INSTR monitorenter ;
        CommandList commandlist;
        Integer integer;
        commandlist = (CommandList)viewController_.mGLView.renderer.commandLists.get(i);
        integer = (Integer)commandlist.name_map().get(s);
        i = 0;
_L2:
        if (i >= arraylist.size())
        {
            break; /* Loop/switch isn't completed */
        }
        CommandBase commandbase = (CommandBase)arraylist.get(i);
        commandbase.jsInterface = viewController_.jsInterface3D;
        commandbase.renderer = viewController_.mGLView.renderer;
        commandbase.node_name = s;
        commandlist.commands().set(integer.intValue(), commandbase);
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        viewController_.setCommandListHasChanged(true);
        viewController_.mGLView.renderer.needCommitDisplayListChanges = false;
        sparsearray;
        JVM INSTR monitorexit ;
        pulse3dview;
        JVM INSTR monitorexit ;
_L3:
        return;
        Exception exception2;
        exception2;
        sparsearray;
        JVM INSTR monitorexit ;
        throw exception2;
        Exception exception1;
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
                return;
            }
        }
          goto _L3
    }

    void parse(BufferViewIterator bufferviewiterator)
    {
        priority_ = bufferviewiterator.parseInt();
        nodeId_ = Integer.toString(bufferviewiterator.parseInt());
        nbCommands_ = bufferviewiterator.parseInt();
        try
        {
            binInterpreter_.processDisplayCommands(bufferviewiterator, nbCommands_);
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
        replaces_ = binInterpreter_.commands_;
    }
}
