// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;

import android.opengl.GLES20;

// Referenced classes of package com.amobee.pulse3d:
//            CommandBase, Pulse3DView

class CommandGetUniformLocation extends CommandBase
{

    static int argTypes[] = {
        2, 1
    };
    String name_;
    int program_;
    int ret_;

    CommandGetUniformLocation()
    {
    }

    void execute()
    {
        ret_ = GLES20.glGetUniformLocation(program_, name_);
    }

    void initArgs(CmdParserBase.GlArg aglarg[], Pulse3DView pulse3dview)
    {
        program_ = aglarg[0].intVal[0];
        name_ = aglarg[1].stringVal;
    }

    String stringifyResult()
    {
        String s = (new StringBuilder()).append("{ result: ").append(Integer.toString(ret_)).toString();
        return (new StringBuilder()).append(s).append("}").toString();
    }

}
