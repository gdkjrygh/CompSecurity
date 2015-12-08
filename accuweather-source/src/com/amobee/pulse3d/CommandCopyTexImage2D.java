// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;

import android.opengl.GLES20;

// Referenced classes of package com.amobee.pulse3d:
//            CommandBase, Pulse3DView

class CommandCopyTexImage2D extends CommandBase
{

    static int argTypes[] = {
        2, 2, 2, 2, 2, 2, 2, 2
    };
    int border_;
    int height_;
    int internalformat_;
    int level_;
    int target_;
    int width_;
    int x_;
    int y_;

    CommandCopyTexImage2D()
    {
    }

    void execute()
    {
        GLES20.glCopyTexImage2D(target_, level_, internalformat_, x_, y_, width_, height_, border_);
    }

    void initArgs(CmdParserBase.GlArg aglarg[], Pulse3DView pulse3dview)
    {
        target_ = aglarg[0].intVal[0];
        level_ = aglarg[1].intVal[0];
        internalformat_ = aglarg[2].intVal[0];
        x_ = aglarg[3].intVal[0];
        y_ = aglarg[4].intVal[0];
        width_ = aglarg[5].intVal[0];
        height_ = aglarg[6].intVal[0];
        border_ = aglarg[7].intVal[0];
    }

}
