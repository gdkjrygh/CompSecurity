// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;

import android.opengl.GLES20;

// Referenced classes of package com.amobee.pulse3d:
//            CommandBase, Pulse3DGLRenderer, Pulse3DView

class CommandSetDefaultFramebufferP3D extends CommandBase
{

    static int argTypes[] = {
        0
    };

    CommandSetDefaultFramebufferP3D()
    {
    }

    void execute()
    {
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glViewport(0, 0, renderer.width, renderer.height);
    }

    void initArgs(CmdParserBase.GlArg aglarg[], Pulse3DView pulse3dview)
    {
    }

}
