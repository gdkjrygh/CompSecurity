// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;

import android.opengl.GLES20;

// Referenced classes of package com.amobee.pulse3d:
//            CommandBase, Pulse3DView

class CommandUniform2i extends CommandBase
{

    static int argTypes[] = {
        2, 2, 2
    };
    int location_;
    int x_;
    int y_;

    CommandUniform2i()
    {
    }

    void execute()
    {
        GLES20.glUniform2i(location_, x_, y_);
    }

    void initArgs(CmdParserBase.GlArg aglarg[], Pulse3DView pulse3dview)
    {
        location_ = aglarg[0].intVal[0];
        x_ = aglarg[1].intVal[0];
        y_ = aglarg[2].intVal[0];
    }

}
