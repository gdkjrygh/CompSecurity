// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;

import android.opengl.GLES20;

// Referenced classes of package com.amobee.pulse3d:
//            CommandBase, Pulse3DView

class CommandDrawElementsP3D extends CommandBase
{

    static int argTypes[] = {
        2, 2, 2, 2
    };
    int count_;
    int indices_;
    int mode_;
    int type_;

    CommandDrawElementsP3D()
    {
        indices_ = 0;
    }

    void execute()
    {
        GLES20.glDrawElements(mode_, count_, type_, indices_);
    }

    void initArgs(CmdParserBase.GlArg aglarg[], Pulse3DView pulse3dview)
    {
        mode_ = aglarg[0].intVal[0];
        count_ = aglarg[1].intVal[0];
        type_ = aglarg[2].intVal[0];
        indices_ = aglarg[3].intVal[0];
    }

}
