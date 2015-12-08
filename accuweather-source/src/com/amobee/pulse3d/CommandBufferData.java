// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;

import android.opengl.GLES20;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.ArrayList;

// Referenced classes of package com.amobee.pulse3d:
//            CommandBase, Pulse3DView

class CommandBufferData extends CommandBase
{

    static int argTypes[] = {
        2, 2, 10, 2
    };
    Buffer data_;
    int size_;
    int target_;
    int usage_;

    CommandBufferData()
    {
    }

    void execute()
    {
        GLES20.glBufferData(target_, size_, data_, usage_);
    }

    void initArgs(CmdParserBase.GlArg aglarg[], Pulse3DView pulse3dview)
    {
        target_ = aglarg[0].intVal[0];
        size_ = aglarg[1].intVal[0];
        if (aglarg[2].isHandle)
        {
            if (aglarg[2].handle == -1)
            {
                pulse3dview = null;
            } else
            {
                pulse3dview = (ByteBuffer)pulse3dview.resources.get(aglarg[2].handle);
            }
            data_ = pulse3dview;
        } else
        {
            data_ = ByteBuffer.wrap(aglarg[2].buffer);
        }
        usage_ = aglarg[3].intVal[0];
    }

}
