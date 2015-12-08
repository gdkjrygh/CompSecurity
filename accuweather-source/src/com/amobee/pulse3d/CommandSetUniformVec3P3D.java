// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;

import android.opengl.GLES20;

// Referenced classes of package com.amobee.pulse3d:
//            CommandBase, Pulse3DView

class CommandSetUniformVec3P3D extends CommandBase
{

    static int argTypes[] = {
        2, 3, 3, 3
    };
    int location_;
    float vec3_[];
    float x_;
    float y_;
    float z_;

    CommandSetUniformVec3P3D()
    {
    }

    void execute()
    {
        GLES20.glUniform3fv(location_, 1, vec3_, 0);
    }

    void initArgs(CmdParserBase.GlArg aglarg[], Pulse3DView pulse3dview)
    {
        location_ = aglarg[0].intVal[0];
        x_ = aglarg[1].floatVal[0];
        y_ = aglarg[2].floatVal[0];
        z_ = aglarg[3].floatVal[0];
        vec3_ = new float[3];
        vec3_[0] = x_;
        vec3_[1] = y_;
        vec3_[2] = z_;
    }

}
