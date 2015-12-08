// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;

import android.opengl.GLES20;

// Referenced classes of package com.amobee.pulse3d:
//            CommandBase, Log, Pulse3DView

class CommandFramebufferRenderbuffer extends CommandBase
{

    static int argTypes[] = {
        2, 2, 2, 2
    };
    int attachment_;
    int renderbuffer_;
    int renderbuffertarget_;
    int target_;

    CommandFramebufferRenderbuffer()
    {
    }

    void execute()
    {
        GLES20.glFramebufferRenderbuffer(target_, attachment_, renderbuffertarget_, renderbuffer_);
        int i = GLES20.glCheckFramebufferStatus(36160);
        if (i != 36053)
        {
            Log.e("glFrameBufferTexture2D", (new StringBuilder()).append("status = ").append(i).toString());
        }
    }

    void initArgs(CmdParserBase.GlArg aglarg[], Pulse3DView pulse3dview)
    {
        target_ = aglarg[0].intVal[0];
        attachment_ = aglarg[1].intVal[0];
        renderbuffertarget_ = aglarg[2].intVal[0];
        renderbuffer_ = aglarg[3].intVal[0];
    }

}
