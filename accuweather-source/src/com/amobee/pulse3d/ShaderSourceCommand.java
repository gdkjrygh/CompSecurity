// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;

import android.opengl.GLES20;

// Referenced classes of package com.amobee.pulse3d:
//            CommandBase, Pulse3DView, Pulse3DGLSurfaceView

class ShaderSourceCommand extends CommandBase
{

    static int argTypes[] = {
        2, 1
    };
    int shader_;
    String string_;

    ShaderSourceCommand()
    {
    }

    void execute()
    {
        GLES20.glShaderSource(shader_, string_);
    }

    void initArgs(CmdParserBase.GlArg aglarg[], Pulse3DView pulse3dview)
    {
        renderer = pulse3dview.mGLView.renderer;
        shader_ = aglarg[0].intVal[0];
        string_ = aglarg[1].stringVal;
    }

}
