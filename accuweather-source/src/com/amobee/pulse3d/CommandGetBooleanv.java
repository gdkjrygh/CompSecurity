// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;

import android.opengl.GLES20;
import java.nio.IntBuffer;

// Referenced classes of package com.amobee.pulse3d:
//            CommandBase, Pulse3DView

class CommandGetBooleanv extends CommandBase
{

    static int argTypes[] = {
        2, 0
    };
    IntBuffer params_;
    int pname_;

    CommandGetBooleanv()
    {
    }

    void execute()
    {
        GLES20.glGetBooleanv(pname_, params_);
    }

    void initArgs(CmdParserBase.GlArg aglarg[], Pulse3DView pulse3dview)
    {
        pname_ = aglarg[0].intVal[0];
        params_ = IntBuffer.wrap(new int[0]);
    }

}
