// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;

import android.opengl.GLES20;
import android.util.Log;

// Referenced classes of package com.amobee.pulse3d:
//            CommandBase, Pulse3DView

class CommandSetUniformMatrix4P3D extends CommandBase
{

    static int argTypes[] = {
        2, 4
    };
    int location_;
    float matrix_[];

    CommandSetUniformMatrix4P3D()
    {
    }

    void execute()
    {
        if (matrix_ == null)
        {
            Log.e(TAG, "CommandSetUniformMatrix4: null matrix");
            return;
        } else
        {
            GLES20.glUniformMatrix4fv(location_, 1, false, matrix_, 0);
            return;
        }
    }

    void initArgs(CmdParserBase.GlArg aglarg[], Pulse3DView pulse3dview)
    {
        location_ = aglarg[0].intVal[0];
        matrix_ = aglarg[1].floatVal;
    }

}
