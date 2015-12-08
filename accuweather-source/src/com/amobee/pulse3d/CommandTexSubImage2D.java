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

class CommandTexSubImage2D extends CommandBase
{

    static int argTypes[] = {
        2, 2, 2, 2, 2, 2, 2, 2, 10
    };
    int format_;
    int height_;
    int level_;
    Buffer pixels_;
    int target_;
    int type_;
    int width_;
    int xoffset_;
    int yoffset_;

    CommandTexSubImage2D()
    {
    }

    void execute()
    {
        GLES20.glTexSubImage2D(target_, level_, xoffset_, yoffset_, width_, height_, format_, type_, pixels_);
    }

    void initArgs(CmdParserBase.GlArg aglarg[], Pulse3DView pulse3dview)
    {
        target_ = aglarg[0].intVal[0];
        level_ = aglarg[1].intVal[0];
        xoffset_ = aglarg[2].intVal[0];
        yoffset_ = aglarg[3].intVal[0];
        width_ = aglarg[4].intVal[0];
        height_ = aglarg[5].intVal[0];
        format_ = aglarg[6].intVal[0];
        type_ = aglarg[7].intVal[0];
        if (aglarg[8].isHandle)
        {
            if (aglarg[8].handle == -1)
            {
                aglarg = null;
            } else
            {
                aglarg = (ByteBuffer)pulse3dview.resources.get(aglarg[8].handle);
            }
            pixels_ = aglarg;
            return;
        } else
        {
            pixels_ = ByteBuffer.wrap(aglarg[8].buffer);
            return;
        }
    }

}
