// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;

import android.opengl.GLES20;

// Referenced classes of package com.amobee.pulse3d:
//            CommandBase, Pulse3DView

class CommandColorMask extends CommandBase
{

    static int argTypes[] = {
        2, 2, 2, 2
    };
    boolean alpha_;
    boolean blue_;
    boolean green_;
    boolean red_;

    CommandColorMask()
    {
    }

    void execute()
    {
        GLES20.glColorMask(red_, green_, blue_, alpha_);
    }

    void initArgs(CmdParserBase.GlArg aglarg[], Pulse3DView pulse3dview)
    {
        boolean flag1 = true;
        boolean flag;
        if (aglarg[0].intVal[0] != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        red_ = flag;
        if (aglarg[1].intVal[0] != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        green_ = flag;
        if (aglarg[2].intVal[0] != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        blue_ = flag;
        if (aglarg[3].intVal[0] != 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        alpha_ = flag;
    }

}
