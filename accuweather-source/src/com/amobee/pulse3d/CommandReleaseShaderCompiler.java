// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;

import android.opengl.GLES20;

// Referenced classes of package com.amobee.pulse3d:
//            CommandBase, Pulse3DView

class CommandReleaseShaderCompiler extends CommandBase
{

    static int argTypes[] = {
        0
    };

    CommandReleaseShaderCompiler()
    {
    }

    void execute()
    {
        GLES20.glReleaseShaderCompiler();
    }

    void initArgs(CmdParserBase.GlArg aglarg[], Pulse3DView pulse3dview)
    {
    }

}
