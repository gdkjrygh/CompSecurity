// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;

import android.opengl.GLES20;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.ArrayList;

// Referenced classes of package com.amobee.pulse3d:
//            CommandBase, Pulse3DView

class CommandShaderBinary extends CommandBase
{

    static int argTypes[] = {
        2, 12, 2, 10, 2
    };
    Buffer binary_;
    int binaryformat_;
    int length_;
    int n_;
    IntBuffer shaders_;

    CommandShaderBinary()
    {
    }

    void execute()
    {
        GLES20.glShaderBinary(n_, shaders_, binaryformat_, binary_, length_);
    }

    void initArgs(CmdParserBase.GlArg aglarg[], Pulse3DView pulse3dview)
    {
        Object obj = null;
        n_ = aglarg[0].intVal[0];
        if (aglarg[1].isHandle)
        {
            IntBuffer intbuffer;
            if (aglarg[1].handle == -1)
            {
                intbuffer = null;
            } else
            {
                intbuffer = (IntBuffer)pulse3dview.resources.get(aglarg[1].handle);
            }
            shaders_ = intbuffer;
        } else
        {
            shaders_ = ByteBuffer.wrap(aglarg[1].buffer).asIntBuffer();
        }
        binaryformat_ = aglarg[2].intVal[0];
        if (aglarg[3].isHandle)
        {
            if (aglarg[3].handle == -1)
            {
                pulse3dview = obj;
            } else
            {
                pulse3dview = (ByteBuffer)pulse3dview.resources.get(aglarg[3].handle);
            }
            binary_ = pulse3dview;
        } else
        {
            binary_ = ByteBuffer.wrap(aglarg[3].buffer);
        }
        length_ = aglarg[4].intVal[0];
    }

}
