// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;

import android.opengl.GLES20;
import java.nio.IntBuffer;

// Referenced classes of package com.amobee.pulse3d:
//            CommandBase, Pulse3DView

class CommandGenRenderbuffers extends CommandBase
{

    static int argTypes[] = {
        2, 0
    };
    int n_;
    IntBuffer renderbuffers_;

    CommandGenRenderbuffers()
    {
    }

    void execute()
    {
        GLES20.glGenRenderbuffers(n_, renderbuffers_);
    }

    void initArgs(CmdParserBase.GlArg aglarg[], Pulse3DView pulse3dview)
    {
        n_ = aglarg[0].intVal[0];
        renderbuffers_ = IntBuffer.wrap(new int[n_]);
    }

    String stringifyResult()
    {
        String s = (new StringBuilder()).append("{ result: ").append("null").toString();
        s = (new StringBuilder()).append(s).append(",").toString();
        s = (new StringBuilder()).append(s).append("renderbuffers : [").toString();
        int i = 0;
        while (i < n_) 
        {
            s = (new StringBuilder()).append(s).append("").append(renderbuffers_.get(i)).toString();
            if (i != n_ - 1)
            {
                s = (new StringBuilder()).append(s).append(",").toString();
            } else
            {
                s = (new StringBuilder()).append(s).append("]").toString();
            }
            i++;
        }
        return (new StringBuilder()).append(s).append("}").toString();
    }

}
