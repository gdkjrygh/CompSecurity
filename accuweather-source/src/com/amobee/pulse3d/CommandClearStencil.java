// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;

import android.opengl.GLES20;

// Referenced classes of package com.amobee.pulse3d:
//            CommandBase, Pulse3DView

class CommandClearStencil extends CommandBase
{

    static int argTypes[] = {
        2
    };
    int s_;

    CommandClearStencil()
    {
    }

    void execute()
    {
        GLES20.glClearStencil(s_);
    }

    void initArgs(CmdParserBase.GlArg aglarg[], Pulse3DView pulse3dview)
    {
        s_ = aglarg[0].intVal[0];
    }

}
