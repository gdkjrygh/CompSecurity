// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;

import android.opengl.GLES20;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.ArrayList;

// Referenced classes of package com.amobee.pulse3d:
//            CommandBase, Pulse3DView

class CommandGetShaderiv extends CommandBase
{

    static int argTypes[] = {
        2, 2, 0
    };
    IntBuffer params_;
    int pname_;
    int shader_;

    CommandGetShaderiv()
    {
    }

    void execute()
    {
        GLES20.glGetShaderiv(shader_, pname_, params_);
    }

    void initArgs(CmdParserBase.GlArg aglarg[], Pulse3DView pulse3dview)
    {
        shader_ = aglarg[0].intVal[0];
        pname_ = aglarg[1].intVal[0];
        if (aglarg[2].isHandle)
        {
            if (aglarg[2].handle == -1)
            {
                aglarg = null;
            } else
            {
                aglarg = (IntBuffer)pulse3dview.resources.get(aglarg[2].handle);
            }
            params_ = aglarg;
            return;
        } else
        {
            params_ = ByteBuffer.wrap(aglarg[2].buffer).asIntBuffer();
            return;
        }
    }

}
