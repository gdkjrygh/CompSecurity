// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;

import android.opengl.GLES20;

// Referenced classes of package com.amobee.pulse3d:
//            CommandBase, Pulse3DView

class CommandCopyTexSubImage2D extends CommandBase
{

    static int argTypes[] = {
        2, 2, 2, 2, 2, 2, 2, 2
    };
    int height_;
    int level_;
    int target_;
    int width_;
    int x_;
    int xoffset_;
    int y_;
    int yoffset_;

    CommandCopyTexSubImage2D()
    {
    }

    void execute()
    {
        GLES20.glCopyTexSubImage2D(target_, level_, xoffset_, yoffset_, x_, y_, width_, height_);
    }

    void initArgs(CmdParserBase.GlArg aglarg[], Pulse3DView pulse3dview)
    {
        target_ = aglarg[0].intVal[0];
        level_ = aglarg[1].intVal[0];
        xoffset_ = aglarg[2].intVal[0];
        yoffset_ = aglarg[3].intVal[0];
        x_ = aglarg[4].intVal[0];
        y_ = aglarg[5].intVal[0];
        width_ = aglarg[6].intVal[0];
        height_ = aglarg[7].intVal[0];
    }

}
