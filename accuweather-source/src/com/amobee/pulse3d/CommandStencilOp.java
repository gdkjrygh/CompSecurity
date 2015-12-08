// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;

import android.opengl.GLES20;

// Referenced classes of package com.amobee.pulse3d:
//            CommandBase, Pulse3DView

class CommandStencilOp extends CommandBase
{

    static int argTypes[] = {
        2, 2, 2
    };
    int fail_;
    int zfail_;
    int zpass_;

    CommandStencilOp()
    {
    }

    void execute()
    {
        GLES20.glStencilOp(fail_, zfail_, zpass_);
    }

    void initArgs(CmdParserBase.GlArg aglarg[], Pulse3DView pulse3dview)
    {
        fail_ = aglarg[0].intVal[0];
        zfail_ = aglarg[1].intVal[0];
        zpass_ = aglarg[2].intVal[0];
    }

}
