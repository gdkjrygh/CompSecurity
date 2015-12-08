// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;

import android.opengl.GLES20;

// Referenced classes of package com.amobee.pulse3d:
//            CommandBase, Pulse3DView

class CommandPolygonOffset extends CommandBase
{

    static int argTypes[] = {
        3, 3
    };
    float factor_;
    float units_;

    CommandPolygonOffset()
    {
    }

    void execute()
    {
        GLES20.glPolygonOffset(factor_, units_);
    }

    void initArgs(CmdParserBase.GlArg aglarg[], Pulse3DView pulse3dview)
    {
        factor_ = aglarg[0].floatVal[0];
        units_ = aglarg[1].floatVal[0];
    }

}
