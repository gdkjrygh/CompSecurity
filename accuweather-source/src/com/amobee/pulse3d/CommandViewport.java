// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;

import android.opengl.GLES20;

// Referenced classes of package com.amobee.pulse3d:
//            CommandBase, Pulse3DView

class CommandViewport extends CommandBase
{

    static int argTypes[] = {
        2, 2, 2, 2
    };
    int height_;
    int width_;
    int x_;
    int y_;

    CommandViewport()
    {
    }

    void execute()
    {
        GLES20.glViewport(x_, y_, width_, height_);
    }

    void initArgs(CmdParserBase.GlArg aglarg[], Pulse3DView pulse3dview)
    {
        x_ = aglarg[0].intVal[0];
        y_ = aglarg[1].intVal[0];
        width_ = aglarg[2].intVal[0];
        height_ = aglarg[3].intVal[0];
    }

}
