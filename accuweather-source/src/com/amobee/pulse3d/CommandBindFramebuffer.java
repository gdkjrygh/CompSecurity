// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;

import android.opengl.GLES20;

// Referenced classes of package com.amobee.pulse3d:
//            CommandBase, Pulse3DView

class CommandBindFramebuffer extends CommandBase
{

    static int argTypes[] = {
        2, 2
    };
    int framebuffer_;
    int target_;

    CommandBindFramebuffer()
    {
    }

    void execute()
    {
        GLES20.glBindFramebuffer(target_, framebuffer_);
    }

    void initArgs(CmdParserBase.GlArg aglarg[], Pulse3DView pulse3dview)
    {
        target_ = aglarg[0].intVal[0];
        framebuffer_ = aglarg[1].intVal[0];
    }

}
