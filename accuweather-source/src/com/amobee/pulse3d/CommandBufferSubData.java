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

class CommandBufferSubData extends CommandBase
{

    static int argTypes[] = {
        2, 2, 2, 10
    };
    Buffer data_;
    int offset_;
    int size_;
    int target_;

    CommandBufferSubData()
    {
    }

    void execute()
    {
        GLES20.glBufferSubData(target_, offset_, size_, data_);
    }

    void initArgs(CmdParserBase.GlArg aglarg[], Pulse3DView pulse3dview)
    {
        target_ = aglarg[0].intVal[0];
        offset_ = aglarg[1].intVal[0];
        size_ = aglarg[2].intVal[0];
        if (aglarg[3].isHandle)
        {
            if (aglarg[3].handle == -1)
            {
                aglarg = null;
            } else
            {
                aglarg = (ByteBuffer)pulse3dview.resources.get(aglarg[3].handle);
            }
            data_ = aglarg;
            return;
        } else
        {
            data_ = ByteBuffer.wrap(aglarg[3].buffer);
            return;
        }
    }

}
