// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;

import android.opengl.GLES20;
import java.nio.IntBuffer;
import java.util.ArrayList;

// Referenced classes of package com.amobee.pulse3d:
//            CommandBase, Pulse3DView, BufferView

class CommandTexParameteriv extends CommandBase
{

    static int argTypes[] = {
        2, 2, 12
    };
    int params_[];
    int pname_;
    int target_;

    CommandTexParameteriv()
    {
    }

    void execute()
    {
        GLES20.glTexParameteriv(target_, pname_, params_, 0);
    }

    void initArgs(CmdParserBase.GlArg aglarg[], Pulse3DView pulse3dview)
    {
        target_ = aglarg[0].intVal[0];
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
        } else
        {
            aglarg = aglarg[2].view.asInt;
        }
        aglarg.position(0);
        params_ = new int[aglarg.remaining()];
        aglarg.get(params_, 0, params_.length);
    }

}
