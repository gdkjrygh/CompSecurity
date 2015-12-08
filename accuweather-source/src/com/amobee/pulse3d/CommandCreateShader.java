// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;

import android.opengl.GLES20;

// Referenced classes of package com.amobee.pulse3d:
//            CommandBase, Pulse3DView

class CommandCreateShader extends CommandBase
{

    static int argTypes[] = {
        2
    };
    int ret_;
    int type_;

    CommandCreateShader()
    {
    }

    void execute()
    {
        ret_ = GLES20.glCreateShader(type_);
    }

    void initArgs(CmdParserBase.GlArg aglarg[], Pulse3DView pulse3dview)
    {
        type_ = aglarg[0].intVal[0];
    }

    String stringifyResult()
    {
        String s = (new StringBuilder()).append("{ result: ").append(Integer.toString(ret_)).toString();
        return (new StringBuilder()).append(s).append("}").toString();
    }

}
