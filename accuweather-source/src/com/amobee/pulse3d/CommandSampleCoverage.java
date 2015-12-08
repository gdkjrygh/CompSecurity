// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;

import android.opengl.GLES20;

// Referenced classes of package com.amobee.pulse3d:
//            CommandBase, Pulse3DView

class CommandSampleCoverage extends CommandBase
{

    static int argTypes[] = {
        3, 2
    };
    boolean invert_;
    float value_;

    CommandSampleCoverage()
    {
    }

    void execute()
    {
        GLES20.glSampleCoverage(value_, invert_);
    }

    void initArgs(CmdParserBase.GlArg aglarg[], Pulse3DView pulse3dview)
    {
        boolean flag = true;
        value_ = aglarg[0].floatVal[0];
        if (aglarg[1].intVal[0] == 0)
        {
            flag = false;
        }
        invert_ = flag;
    }

}
