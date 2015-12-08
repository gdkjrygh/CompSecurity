// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;

import android.opengl.GLES20;

// Referenced classes of package com.amobee.pulse3d:
//            CommandBase, Pulse3DGLRenderer, Pulse3DView, Pulse3DGLSurfaceView

class CommandMapAttributeP3D extends CommandBase
{

    static int argTypes[] = {
        2, 2, 2, 2, 2, 2
    };
    int attrib_index_;
    int component_type_;
    boolean normalized_;
    int num_components_;
    int offset_;
    int stride_;

    CommandMapAttributeP3D()
    {
    }

    void execute()
    {
        GLES20.glVertexAttribPointer(attrib_index_, num_components_, component_type_, normalized_, stride_, offset_);
        Pulse3DGLRenderer.er();
        GLES20.glEnableVertexAttribArray(attrib_index_);
    }

    void initArgs(CmdParserBase.GlArg aglarg[], Pulse3DView pulse3dview)
    {
        boolean flag = true;
        renderer = pulse3dview.mGLView.renderer;
        attrib_index_ = aglarg[0].intVal[0];
        num_components_ = aglarg[1].intVal[0];
        component_type_ = aglarg[2].intVal[0];
        if (aglarg[3].intVal[0] == 0)
        {
            flag = false;
        }
        normalized_ = flag;
        stride_ = aglarg[4].intVal[0];
        offset_ = aglarg[5].intVal[0];
    }

}
