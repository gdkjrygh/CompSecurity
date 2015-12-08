// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;

import android.opengl.GLES20;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.ArrayList;

// Referenced classes of package com.amobee.pulse3d:
//            CommandBase, Pulse3DView

class CommandGetUniformfv extends CommandBase
{

    static int argTypes[] = {
        2, 2, 0
    };
    int location_;
    FloatBuffer params_;
    int program_;

    CommandGetUniformfv()
    {
    }

    void execute()
    {
        GLES20.glGetUniformfv(program_, location_, params_);
    }

    void initArgs(CmdParserBase.GlArg aglarg[], Pulse3DView pulse3dview)
    {
        program_ = aglarg[0].intVal[0];
        location_ = aglarg[1].intVal[0];
        if (aglarg[2].isHandle)
        {
            if (aglarg[2].handle == -1)
            {
                aglarg = null;
            } else
            {
                aglarg = (FloatBuffer)pulse3dview.resources.get(aglarg[2].handle);
            }
            params_ = aglarg;
            return;
        } else
        {
            params_ = ByteBuffer.wrap(aglarg[2].buffer).asFloatBuffer();
            return;
        }
    }

}
