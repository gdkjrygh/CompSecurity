// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;

import android.opengl.GLES20;

// Referenced classes of package com.amobee.pulse3d:
//            CommandBase, Pulse3DView

class CommandBlendColorP3D extends CommandBase
{

    static int argTypes[] = {
        3, 3, 3, 3
    };
    float w;
    float x;
    float y;
    float z;

    CommandBlendColorP3D()
    {
    }

    void execute()
    {
        GLES20.glBlendColor(x, y, z, w);
    }

    void initArgs(CmdParserBase.GlArg aglarg[], Pulse3DView pulse3dview)
    {
        x = aglarg[0].floatVal[0];
        y = aglarg[1].floatVal[0];
        z = aglarg[2].floatVal[0];
        w = aglarg[3].floatVal[0];
    }

}
