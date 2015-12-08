// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;

import android.opengl.GLES20;

// Referenced classes of package com.amobee.pulse3d:
//            CommandBase, Pulse3DView

class CommandCullFaceP3D extends CommandBase
{

    static int argTypes[] = {
        2
    };
    int _mode;
    boolean enabled_;

    CommandCullFaceP3D()
    {
    }

    void execute()
    {
        GLES20.glCullFace(_mode);
    }

    void initArgs(CmdParserBase.GlArg aglarg[], Pulse3DView pulse3dview)
    {
        _mode = aglarg[0].intVal[0];
    }

}
