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

class CommandCompressedTexImage2D extends CommandBase
{

    static int argTypes[] = {
        2, 2, 2, 2, 2, 2, 2, 10
    };
    int border_;
    Buffer data_;
    int height_;
    int imageSize_;
    int internalformat_;
    int level_;
    int target_;
    int width_;

    CommandCompressedTexImage2D()
    {
    }

    void execute()
    {
        GLES20.glCompressedTexImage2D(target_, level_, internalformat_, width_, height_, border_, imageSize_, data_);
    }

    void initArgs(CmdParserBase.GlArg aglarg[], Pulse3DView pulse3dview)
    {
        target_ = aglarg[0].intVal[0];
        level_ = aglarg[1].intVal[0];
        internalformat_ = aglarg[2].intVal[0];
        width_ = aglarg[3].intVal[0];
        height_ = aglarg[4].intVal[0];
        border_ = aglarg[5].intVal[0];
        imageSize_ = aglarg[6].intVal[0];
        if (aglarg[7].isHandle)
        {
            if (aglarg[7].handle == -1)
            {
                aglarg = null;
            } else
            {
                aglarg = (ByteBuffer)pulse3dview.resources.get(aglarg[7].handle);
            }
            data_ = aglarg;
            return;
        } else
        {
            data_ = ByteBuffer.wrap(aglarg[7].buffer);
            return;
        }
    }

}
