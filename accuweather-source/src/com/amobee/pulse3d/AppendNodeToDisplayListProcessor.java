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

class AppendNodeToDisplayListProcessor extends StringArgProcessor
{

    ArrayList appends_;
    BinInterpreter binInterpreter_;
    int nbCommands_;
    String nodeId_;
    int priority_;
    Pulse3DView viewController_;

    public AppendNodeToDisplayListProcessor(Pulse3DView pulse3dview, BinInterpreter bininterpreter)
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
        arraylist = appends_;
        s = nodeId_;
        i = priority_;
        SparseArray sparsearray = viewController_.mGLView.renderer.commandLists;
        sparsearray;
        JVM INSTR monitorenter ;
        Object obj = viewController_.mGLView.renderer.commandLists.get(i);
        if (obj != null) goto _L2; else goto _L1
_L1:
        obj = new CommandList(i, viewController_.mGLView.renderer);
        viewController_.mGLView.renderer.commandLists.append(i, obj);
_L5:
        i = 0;
_L4:
        if (i >= arraylist.size())
        {
            break; /* Loop/switch isn't completed */
        }
        CommandBase commandbase = (CommandBase)arraylist.get(i);
        commandbase.jsInterface = viewController_.jsInterface3D;
        commandbase.renderer = viewController_.mGLView.renderer;
        commandbase.node_name = s;
        ((CommandList) (obj)).commands().add(commandbase);
        i++;
        if (true) goto _L4; else goto _L3
_L2:
        obj = (CommandList)obj;
          goto _L5
_L3:
        ((CommandList) (obj)).name_map().put(s, Integer.valueOf(((CommandList) (obj)).commands().size() - 1));
        viewController_.setCommandListHasChanged(true);
        viewController_.mGLView.renderer.needCommitDisplayListChanges = false;
        sparsearray;
        JVM INSTR monitorexit ;
        pulse3dview;
        JVM INSTR monitorexit ;
_L7:
        return;
        Object obj1;
        obj1;
_L8:
        sparsearray;
        JVM INSTR monitorexit ;
        throw obj1;
        obj1;
        pulse3dview;
        JVM INSTR monitorexit ;
        try
        {
            throw obj1;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1) { }
        if (obj1 == null) goto _L7; else goto _L6
_L6:
        ((Exception) (obj1)).printStackTrace();
        return;
        obj1;
          goto _L8
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
        appends_ = binInterpreter_.commands_;
    }
}
