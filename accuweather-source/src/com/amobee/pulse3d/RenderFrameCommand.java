// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;


// Referenced classes of package com.amobee.pulse3d:
//            CommandBase, Pulse3DGLRenderer, Pulse3DView, Pulse3DGLSurfaceView

class RenderFrameCommand extends CommandBase
{

    static int argTypes[] = new int[0];

    RenderFrameCommand()
    {
    }

    void execute()
    {
        renderer.doRender();
    }

    void initArgs(CmdParserBase.GlArg aglarg[], Pulse3DView pulse3dview)
    {
        renderer = pulse3dview.mGLView.renderer;
    }

}
