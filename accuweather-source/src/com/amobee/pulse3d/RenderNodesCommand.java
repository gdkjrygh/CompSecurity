// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;


// Referenced classes of package com.amobee.pulse3d:
//            CommandBase, Pulse3DGLRenderer, Pulse3DView, Pulse3DGLSurfaceView

class RenderNodesCommand extends CommandBase
{

    static int argTypes[] = {
        2, 2
    };
    int priorityEnd_;
    int priorityStart_;

    RenderNodesCommand()
    {
    }

    void execute()
    {
        renderer.doRenderPriorities(priorityStart_, priorityEnd_);
    }

    void initArgs(CmdParserBase.GlArg aglarg[], Pulse3DView pulse3dview)
    {
        renderer = pulse3dview.mGLView.renderer;
        priorityStart_ = aglarg[0].intVal[0];
        priorityEnd_ = aglarg[1].intVal[0];
    }

}
