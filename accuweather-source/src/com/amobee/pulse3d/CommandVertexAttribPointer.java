// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;

import android.opengl.GLES20;

// Referenced classes of package com.amobee.pulse3d:
//            CommandBase, Pulse3DView

class CommandVertexAttribPointer extends CommandBase
{

    static int argTypes[] = {
        2, 2, 2, 2, 2, 2
    };
    int indx_;
    boolean normalized_;
    int ptr_;
    int size_;
    int stride_;
    int type_;

    CommandVertexAttribPointer()
    {
    }

    void execute()
    {
        GLES20.glVertexAttribPointer(indx_, size_, type_, normalized_, stride_, ptr_);
    }

    void initArgs(CmdParserBase.GlArg aglarg[], Pulse3DView pulse3dview)
    {
        boolean flag = true;
        indx_ = aglarg[0].intVal[0];
        size_ = aglarg[1].intVal[0];
        type_ = aglarg[2].intVal[0];
        if (aglarg[3].intVal[0] == 0)
        {
            flag = false;
        }
        normalized_ = flag;
        stride_ = aglarg[4].intVal[0];
        ptr_ = aglarg[5].intVal[0];
    }

}
