// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;

import android.opengl.GLES20;
import java.nio.IntBuffer;
import java.util.ArrayList;

// Referenced classes of package com.amobee.pulse3d:
//            CommandBase, Pulse3DView, BufferView

class CommandDeleteBuffers extends CommandBase
{

    static int argTypes[] = {
        2, 12
    };
    int buffers_[];
    int n_;

    CommandDeleteBuffers()
    {
    }

    void execute()
    {
        GLES20.glDeleteBuffers(n_, buffers_, 0);
    }

    void initArgs(CmdParserBase.GlArg aglarg[], Pulse3DView pulse3dview)
    {
        n_ = aglarg[0].intVal[0];
        if (aglarg[1].isHandle)
        {
            if (aglarg[1].handle == -1)
            {
                aglarg = null;
            } else
            {
                aglarg = (IntBuffer)pulse3dview.resources.get(aglarg[1].handle);
            }
        } else
        {
            aglarg = aglarg[1].view.asInt;
        }
        aglarg.position(0);
        buffers_ = new int[n_];
        aglarg.get(buffers_, 0, n_);
    }

}
