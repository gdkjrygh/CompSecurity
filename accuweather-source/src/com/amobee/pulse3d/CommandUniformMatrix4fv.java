// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;

import android.opengl.GLES20;
import java.nio.FloatBuffer;
import java.util.ArrayList;

// Referenced classes of package com.amobee.pulse3d:
//            CommandBase, Pulse3DView, BufferView

class CommandUniformMatrix4fv extends CommandBase
{

    static int argTypes[] = {
        2, 2, 2, 11
    };
    int count_;
    int location_;
    boolean transpose_;
    float v_[];

    CommandUniformMatrix4fv()
    {
    }

    void execute()
    {
        GLES20.glUniformMatrix4fv(location_, count_, transpose_, v_, 0);
    }

    void initArgs(CmdParserBase.GlArg aglarg[], Pulse3DView pulse3dview)
    {
        boolean flag = true;
        location_ = aglarg[0].intVal[0];
        count_ = aglarg[1].intVal[0];
        if (aglarg[2].intVal[0] == 0)
        {
            flag = false;
        }
        transpose_ = flag;
        if (aglarg[3].isHandle)
        {
            if (aglarg[3].handle == -1)
            {
                aglarg = null;
            } else
            {
                aglarg = (FloatBuffer)pulse3dview.resources.get(aglarg[3].handle);
            }
        } else
        {
            aglarg = aglarg[3].view.asFloat;
        }
        aglarg.position(0);
        v_ = new float[16];
        aglarg.get(v_, 0, 16);
    }

}
