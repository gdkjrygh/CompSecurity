// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;

import android.opengl.GLES20;

// Referenced classes of package com.amobee.pulse3d:
//            CommandBase, Pulse3DView

class CommandBindAttribLocation extends CommandBase
{

    static int argTypes[] = {
        2, 2, 1
    };
    int index_;
    String name_;
    int program_;

    CommandBindAttribLocation()
    {
    }

    void execute()
    {
        GLES20.glBindAttribLocation(program_, index_, name_);
    }

    void initArgs(CmdParserBase.GlArg aglarg[], Pulse3DView pulse3dview)
    {
        program_ = aglarg[0].intVal[0];
        index_ = aglarg[1].intVal[0];
        name_ = aglarg[2].stringVal;
    }

}
