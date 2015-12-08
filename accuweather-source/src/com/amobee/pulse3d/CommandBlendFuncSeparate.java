// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;

import android.opengl.GLES20;

// Referenced classes of package com.amobee.pulse3d:
//            CommandBase, Pulse3DView

class CommandBlendFuncSeparate extends CommandBase
{

    static int argTypes[] = {
        2, 2, 2, 2
    };
    int dstAlpha_;
    int dstRGB_;
    int srcAlpha_;
    int srcRGB_;

    CommandBlendFuncSeparate()
    {
    }

    void execute()
    {
        GLES20.glBlendFuncSeparate(srcRGB_, dstRGB_, srcAlpha_, dstAlpha_);
    }

    void initArgs(CmdParserBase.GlArg aglarg[], Pulse3DView pulse3dview)
    {
        srcRGB_ = aglarg[0].intVal[0];
        dstRGB_ = aglarg[1].intVal[0];
        srcAlpha_ = aglarg[2].intVal[0];
        dstAlpha_ = aglarg[3].intVal[0];
    }

}
