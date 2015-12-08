// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;

import android.opengl.GLES20;

// Referenced classes of package com.amobee.pulse3d:
//            CommandBase, Pulse3DView

class CommandGetString extends CommandBase
{

    static int argTypes[] = {
        2
    };
    int name_;
    String ret_;

    CommandGetString()
    {
    }

    void execute()
    {
        ret_ = GLES20.glGetString(name_);
    }

    void initArgs(CmdParserBase.GlArg aglarg[], Pulse3DView pulse3dview)
    {
        name_ = aglarg[0].intVal[0];
    }

    String stringifyResult()
    {
        String s = (new StringBuilder()).append("{ result: ").append('"').toString();
        StringBuilder stringbuilder = (new StringBuilder()).append(s);
        if (ret_ != null)
        {
            s = ret_;
        } else
        {
            s = "";
        }
        s = stringbuilder.append(s).toString();
        s = (new StringBuilder()).append(s).append('"').toString();
        return (new StringBuilder()).append(s).append("}").toString();
    }

}
