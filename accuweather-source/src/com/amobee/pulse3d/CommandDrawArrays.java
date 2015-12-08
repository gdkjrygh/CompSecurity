// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;

import android.opengl.GLES20;

// Referenced classes of package com.amobee.pulse3d:
//            CommandBase, Pulse3DView

class CommandDrawArrays extends CommandBase
{

    static int argTypes[] = {
        2, 2, 2
    };
    int count_;
    int first_;
    int mode_;

    CommandDrawArrays()
    {
    }

    void execute()
    {
        GLES20.glDrawArrays(mode_, first_, count_);
    }

    void initArgs(CmdParserBase.GlArg aglarg[], Pulse3DView pulse3dview)
    {
        mode_ = aglarg[0].intVal[0];
        first_ = aglarg[1].intVal[0];
        count_ = aglarg[2].intVal[0];
    }

}
