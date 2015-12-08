// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;

import android.opengl.GLES20;

// Referenced classes of package com.amobee.pulse3d:
//            CommandBase, Pulse3DView

class CommandSetUniformIntP3D extends CommandBase
{

    static int argTypes[] = {
        2, 2
    };
    int int_value_;
    int location_;

    CommandSetUniformIntP3D()
    {
    }

    void execute()
    {
        GLES20.glUniform1i(location_, int_value_);
    }

    void initArgs(CmdParserBase.GlArg aglarg[], Pulse3DView pulse3dview)
    {
        location_ = aglarg[0].intVal[0];
        int_value_ = aglarg[1].intVal[0];
    }

}
