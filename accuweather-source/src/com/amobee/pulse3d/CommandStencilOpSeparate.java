// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;

import android.opengl.GLES20;

// Referenced classes of package com.amobee.pulse3d:
//            CommandBase, Pulse3DView

class CommandStencilOpSeparate extends CommandBase
{

    static int argTypes[] = {
        2, 2, 2, 2
    };
    int face_;
    int fail_;
    int zfail_;
    int zpass_;

    CommandStencilOpSeparate()
    {
    }

    void execute()
    {
        GLES20.glStencilOpSeparate(face_, fail_, zfail_, zpass_);
    }

    void initArgs(CmdParserBase.GlArg aglarg[], Pulse3DView pulse3dview)
    {
        face_ = aglarg[0].intVal[0];
        fail_ = aglarg[1].intVal[0];
        zfail_ = aglarg[2].intVal[0];
        zpass_ = aglarg[3].intVal[0];
    }

}
