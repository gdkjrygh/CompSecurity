// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;

import android.opengl.GLES20;

// Referenced classes of package com.amobee.pulse3d:
//            CommandBase, Pulse3DView

class CommandStencilFuncSeparate extends CommandBase
{

    static int argTypes[] = {
        2, 2, 2, 2
    };
    int face_;
    int func_;
    int mask_;
    int ref_;

    CommandStencilFuncSeparate()
    {
    }

    void execute()
    {
        GLES20.glStencilFuncSeparate(face_, func_, ref_, mask_);
    }

    void initArgs(CmdParserBase.GlArg aglarg[], Pulse3DView pulse3dview)
    {
        face_ = aglarg[0].intVal[0];
        func_ = aglarg[1].intVal[0];
        ref_ = aglarg[2].intVal[0];
        mask_ = aglarg[3].intVal[0];
    }

}
