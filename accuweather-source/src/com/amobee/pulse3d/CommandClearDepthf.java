// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;

import android.opengl.GLES20;

// Referenced classes of package com.amobee.pulse3d:
//            CommandBase, Pulse3DView

class CommandClearDepthf extends CommandBase
{

    static int argTypes[] = {
        3
    };
    float depth_;

    CommandClearDepthf()
    {
    }

    void execute()
    {
        GLES20.glClearDepthf(depth_);
    }

    void initArgs(CmdParserBase.GlArg aglarg[], Pulse3DView pulse3dview)
    {
        depth_ = aglarg[0].floatVal[0];
    }

}
