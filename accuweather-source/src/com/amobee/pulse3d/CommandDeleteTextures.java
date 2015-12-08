// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;

import android.opengl.GLES20;
import java.nio.IntBuffer;
import java.util.ArrayList;

// Referenced classes of package com.amobee.pulse3d:
//            CommandBase, Pulse3DView, BufferView

class CommandDeleteTextures extends CommandBase
{

    static int argTypes[] = {
        2, 12
    };
    int n_;
    int textures_[];

    CommandDeleteTextures()
    {
    }

    void execute()
    {
        GLES20.glDeleteTextures(n_, textures_, 0);
    }

    void initArgs(CmdParserBase.GlArg aglarg[], Pulse3DView pulse3dview)
    {
        n_ = aglarg[0].intVal[0];
        if (aglarg[1].isHandle)
        {
            if (aglarg[1].handle == -1)
            {
                aglarg = null;
            } else
            {
                aglarg = (IntBuffer)pulse3dview.resources.get(aglarg[1].handle);
            }
        } else
        {
            aglarg = aglarg[1].view.asInt;
        }
        aglarg.position(0);
        textures_ = new int[n_];
        aglarg.get(textures_, 0, n_);
    }

}
