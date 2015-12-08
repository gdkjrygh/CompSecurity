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

class CommandGetFloatv extends CommandBase
{

    static int argTypes[] = {
        2, 0
    };
    FloatBuffer params_;
    int pname_;

    CommandGetFloatv()
    {
    }

    void execute()
    {
        GLES20.glGetFloatv(pname_, params_);
    }

    void initArgs(CmdParserBase.GlArg aglarg[], Pulse3DView pulse3dview)
    {
        pname_ = aglarg[0].intVal[0];
        if (aglarg[1].isHandle)
        {
            if (aglarg[1].handle == -1)
            {
                aglarg = null;
            } else
            {
                aglarg = (FloatBuffer)pulse3dview.resources.get(aglarg[1].handle);
            }
            params_ = aglarg;
            return;
        } else
        {
            params_ = ByteBuffer.wrap(aglarg[1].buffer).asFloatBuffer();
            return;
        }
    }

}
