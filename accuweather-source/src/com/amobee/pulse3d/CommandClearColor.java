// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;

import android.opengl.GLES20;

// Referenced classes of package com.amobee.pulse3d:
//            CommandBase, Pulse3DView

class CommandClearColor extends CommandBase
{

    static int argTypes[] = {
        3, 3, 3, 3
    };
    float alpha_;
    float blue_;
    float green_;
    float red_;

    CommandClearColor()
    {
    }

    void execute()
    {
        GLES20.glClearColor(red_, green_, blue_, alpha_);
    }

    void initArgs(CmdParserBase.GlArg aglarg[], Pulse3DView pulse3dview)
    {
        red_ = aglarg[0].floatVal[0];
        green_ = aglarg[1].floatVal[0];
        blue_ = aglarg[2].floatVal[0];
        alpha_ = aglarg[3].floatVal[0];
    }

}
