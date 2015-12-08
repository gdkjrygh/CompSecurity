// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;

import android.opengl.GLES20;

// Referenced classes of package com.amobee.pulse3d:
//            CommandBase, Pulse3DView

class CommandUniform1f extends CommandBase
{

    static int argTypes[] = {
        2, 3
    };
    int location_;
    float x_;

    CommandUniform1f()
    {
    }

    void execute()
    {
        GLES20.glUniform1f(location_, x_);
    }

    void initArgs(CmdParserBase.GlArg aglarg[], Pulse3DView pulse3dview)
    {
        location_ = aglarg[0].intVal[0];
        x_ = aglarg[1].floatVal[0];
    }

}
