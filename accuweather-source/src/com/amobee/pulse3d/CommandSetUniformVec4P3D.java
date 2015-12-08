// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;

import android.opengl.GLES20;

// Referenced classes of package com.amobee.pulse3d:
//            CommandBase, Pulse3DView

class CommandSetUniformVec4P3D extends CommandBase
{

    static int argTypes[] = {
        2, 3, 3, 3, 3
    };
    int location_;
    float vec4_[];
    float w_;
    float x_;
    float y_;
    float z_;

    CommandSetUniformVec4P3D()
    {
    }

    void execute()
    {
        GLES20.glUniform4f(location_, x_, y_, z_, w_);
    }

    void initArgs(CmdParserBase.GlArg aglarg[], Pulse3DView pulse3dview)
    {
        location_ = aglarg[0].intVal[0];
        x_ = aglarg[1].floatVal[0];
        y_ = aglarg[2].floatVal[0];
        z_ = aglarg[3].floatVal[0];
        w_ = aglarg[4].floatVal[0];
        vec4_ = new float[4];
        vec4_[0] = x_;
        vec4_[1] = y_;
        vec4_[2] = z_;
        vec4_[3] = w_;
    }

}
