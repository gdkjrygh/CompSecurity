// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;

import android.opengl.GLES20;

// Referenced classes of package com.amobee.pulse3d:
//            CommandBase, Log, Pulse3DView

class CommandTexParameteri extends CommandBase
{

    static int argTypes[] = {
        2, 2, 2
    };
    int param_;
    int pname_;
    int target_;

    CommandTexParameteri()
    {
    }

    void execute()
    {
        GLES20.glGetError();
        GLES20.glTexParameteri(target_, pname_, param_);
        if (GLES20.glGetError() != 0)
        {
            Log.e("glTexParameteri", (new StringBuilder()).append("pname = ").append(GLES20.glGetString(pname_)).append(", param_ = ").append(GLES20.glGetString(param_)).toString());
            return;
        } else
        {
            Log.e("glTexParameteri", "pass");
            return;
        }
    }

    void initArgs(CmdParserBase.GlArg aglarg[], Pulse3DView pulse3dview)
    {
        target_ = aglarg[0].intVal[0];
        pname_ = aglarg[1].intVal[0];
        param_ = aglarg[2].intVal[0];
    }

}
