// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;

import android.opengl.GLES20;
import java.nio.IntBuffer;

// Referenced classes of package com.amobee.pulse3d:
//            CommandBase, Pulse3DView

class CommandGetAttachedShaders extends CommandBase
{

    static int argTypes[] = {
        2, 2, 0, 0
    };
    IntBuffer count_;
    int maxcount_;
    int program_;
    IntBuffer shaders_;

    CommandGetAttachedShaders()
    {
    }

    void execute()
    {
        GLES20.glGetAttachedShaders(program_, maxcount_, count_, shaders_);
    }

    void initArgs(CmdParserBase.GlArg aglarg[], Pulse3DView pulse3dview)
    {
        program_ = aglarg[0].intVal[0];
        maxcount_ = aglarg[1].intVal[0];
        count_ = IntBuffer.wrap(new int[1]);
        shaders_ = IntBuffer.wrap(new int[maxcount_]);
    }

}
