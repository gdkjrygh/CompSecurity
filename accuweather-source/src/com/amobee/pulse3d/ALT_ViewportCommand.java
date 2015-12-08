// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;

import android.opengl.GLES20;

// Referenced classes of package com.amobee.pulse3d:
//            CommandBase, Pulse3DGLRenderer, Pulse3DView, Pulse3DGLSurfaceView

class ALT_ViewportCommand extends CommandBase
{

    static int argTypes[] = {
        2, 2, 2, 2
    };
    int height_;
    int width_;
    int x_;
    int y_;

    ALT_ViewportCommand()
    {
    }

    void execute()
    {
        float f1 = Pulse3DGLRenderer.content_scale;
        if (renderer.width > renderer.height && width_ < height_)
        {
            int i = width_;
            width_ = height_;
            height_ = i;
        }
        float f = f1;
        if ((float)width_ * f1 > (float)renderer.width)
        {
            f = (float)renderer.width / (float)width_;
        }
        GLES20.glViewport((int)((float)x_ * f), (int)((float)y_ * f), (int)((float)width_ * f), (int)((float)height_ * f));
    }

    void initArgs(CmdParserBase.GlArg aglarg[], Pulse3DView pulse3dview)
    {
        renderer = pulse3dview.mGLView.renderer;
        x_ = aglarg[0].intVal[0];
        y_ = aglarg[1].intVal[0];
        width_ = aglarg[2].intVal[0];
        height_ = aglarg[3].intVal[0];
    }

}
