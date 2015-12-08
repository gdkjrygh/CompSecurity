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

class CommandGetShaderPrecisionFormat extends CommandBase
{

    static int argTypes[] = {
        2, 2, 0, 0
    };
    IntBuffer precision_;
    int precisiontype_;
    IntBuffer range_;
    int shadertype_;

    CommandGetShaderPrecisionFormat()
    {
    }

    void execute()
    {
        GLES20.glGetShaderPrecisionFormat(shadertype_, precisiontype_, range_, precision_);
    }

    void initArgs(CmdParserBase.GlArg aglarg[], Pulse3DView pulse3dview)
    {
        Object obj = null;
        shadertype_ = aglarg[0].intVal[0];
        precisiontype_ = aglarg[1].intVal[0];
        if (aglarg[2].isHandle)
        {
            IntBuffer intbuffer;
            if (aglarg[2].handle == -1)
            {
                intbuffer = null;
            } else
            {
                intbuffer = (IntBuffer)pulse3dview.resources.get(aglarg[2].handle);
            }
            range_ = intbuffer;
        } else
        {
            range_ = ByteBuffer.wrap(aglarg[2].buffer).asIntBuffer();
        }
        if (aglarg[3].isHandle)
        {
            if (aglarg[3].handle == -1)
            {
                aglarg = obj;
            } else
            {
                aglarg = (IntBuffer)pulse3dview.resources.get(aglarg[3].handle);
            }
            precision_ = aglarg;
            return;
        } else
        {
            precision_ = ByteBuffer.wrap(aglarg[3].buffer).asIntBuffer();
            return;
        }
    }

}
