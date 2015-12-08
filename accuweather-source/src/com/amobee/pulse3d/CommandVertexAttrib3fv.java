// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;

import android.opengl.GLES20;
import java.nio.FloatBuffer;
import java.util.ArrayList;

// Referenced classes of package com.amobee.pulse3d:
//            CommandBase, Pulse3DView, BufferView

class CommandVertexAttrib3fv extends CommandBase
{

    static int argTypes[] = {
        2, 11
    };
    int indx_;
    float values_[];

    CommandVertexAttrib3fv()
    {
    }

    void execute()
    {
        GLES20.glVertexAttrib3fv(indx_, values_, 0);
    }

    void initArgs(CmdParserBase.GlArg aglarg[], Pulse3DView pulse3dview)
    {
        indx_ = aglarg[0].intVal[0];
        if (aglarg[1].isHandle)
        {
            if (aglarg[1].handle == -1)
            {
                aglarg = null;
            } else
            {
                aglarg = (FloatBuffer)pulse3dview.resources.get(aglarg[1].handle);
            }
        } else
        {
            aglarg = aglarg[1].view.asFloat;
        }
        aglarg.position(0);
        values_ = new float[3];
        aglarg.get(values_, 0, 3);
    }

}
