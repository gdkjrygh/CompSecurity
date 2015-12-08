// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;

import android.opengl.GLES20;

// Referenced classes of package com.amobee.pulse3d:
//            CommandBase, Pulse3DView

class CommandStencilMaskSeparate extends CommandBase
{

    static int argTypes[] = {
        2, 2
    };
    int face_;
    int mask_;

    CommandStencilMaskSeparate()
    {
    }

    void execute()
    {
        GLES20.glStencilMaskSeparate(face_, mask_);
    }

    void initArgs(CmdParserBase.GlArg aglarg[], Pulse3DView pulse3dview)
    {
        face_ = aglarg[0].intVal[0];
        mask_ = aglarg[1].intVal[0];
    }

}
