// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;

import android.opengl.GLES20;

// Referenced classes of package com.amobee.pulse3d:
//            CommandBase, Pulse3DView

class CommandFramebufferTexture2D extends CommandBase
{

    static int argTypes[] = {
        2, 2, 2, 2, 2
    };
    int attachment_;
    int level_;
    int target_;
    int textarget_;
    int texture_;

    CommandFramebufferTexture2D()
    {
    }

    void execute()
    {
        GLES20.glFramebufferTexture2D(target_, attachment_, textarget_, texture_, level_);
    }

    void initArgs(CmdParserBase.GlArg aglarg[], Pulse3DView pulse3dview)
    {
        target_ = aglarg[0].intVal[0];
        attachment_ = aglarg[1].intVal[0];
        textarget_ = aglarg[2].intVal[0];
        texture_ = aglarg[3].intVal[0];
        level_ = aglarg[4].intVal[0];
    }

}
