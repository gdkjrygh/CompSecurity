// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;

import android.opengl.GLES20;

// Referenced classes of package com.amobee.pulse3d:
//            CommandBase, Pulse3DView

class CommandVertexAttrib2f extends CommandBase
{

    static int argTypes[] = {
        2, 3, 3
    };
    int indx_;
    float x_;
    float y_;

    CommandVertexAttrib2f()
    {
    }

    void execute()
    {
        GLES20.glVertexAttrib2f(indx_, x_, y_);
    }

    void initArgs(CmdParserBase.GlArg aglarg[], Pulse3DView pulse3dview)
    {
        indx_ = aglarg[0].intVal[0];
        x_ = aglarg[1].floatVal[0];
        y_ = aglarg[2].floatVal[0];
    }

}
