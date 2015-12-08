// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;

import android.opengl.GLES20;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

// Referenced classes of package com.amobee.pulse3d:
//            CommandBase, Pulse3DView, Pulse3DGLSurfaceView

class ReadPixelsCommand extends CommandBase
{

    static int argTypes[] = {
        2, 2, 2, 2, 2, 2, 14
    };
    int format_;
    int height_;
    int nbComponents_;
    ByteBuffer pixels_;
    int type_;
    int width_;
    int x_;
    int y_;

    ReadPixelsCommand()
    {
    }

    void execute()
    {
        GLES20.glReadPixels(x_, y_, width_, height_, format_, type_, pixels_);
    }

    void initArgs(CmdParserBase.GlArg aglarg[], Pulse3DView pulse3dview)
    {
        renderer = pulse3dview.mGLView.renderer;
        x_ = aglarg[0].intVal[0];
        y_ = aglarg[1].intVal[0];
        width_ = aglarg[2].intVal[0];
        height_ = aglarg[3].intVal[0];
        format_ = aglarg[4].intVal[0];
        type_ = aglarg[5].intVal[0];
        nbComponents_ = 4;
        format_;
        JVM INSTR tableswitch 6406 6408: default 120
    //                   6406 160
    //                   6407 176
    //                   6408 168;
           goto _L1 _L2 _L3 _L4
_L1:
        break; /* Loop/switch isn't completed */
_L3:
        break MISSING_BLOCK_LABEL_176;
_L5:
        int i;
        if (type_ == 5121)
        {
            i = nbComponents_ * width_ * height_;
        } else
        {
            i = width_ * height_ * 2;
        }
        pixels_ = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        return;
_L2:
        nbComponents_ = 1;
          goto _L5
_L4:
        nbComponents_ = 4;
          goto _L5
        nbComponents_ = 3;
          goto _L5
    }

    String stringifyResult()
    {
        String s = "{ \"result\": [";
        String s1;
        if (type_ == 5121)
        {
            int k = nbComponents_ * width_ * height_;
            int i = 0;
            do
            {
                s1 = s;
                if (i >= k)
                {
                    break;
                }
                char c = (char)pixels_.get(i);
                s = (new StringBuilder()).append(s).append(Integer.toString(c % 256)).toString();
                if (i != k - 1)
                {
                    s = (new StringBuilder()).append(s).append(",").toString();
                } else
                {
                    s = (new StringBuilder()).append(s).append("]}").toString();
                }
                i++;
            } while (true);
        } else
        {
            int l = width_ * height_ * 2;
            int j = 0;
            do
            {
                s1 = s;
                if (j >= l)
                {
                    break;
                }
                char c1 = (char)pixels_.get(j);
                s = (new StringBuilder()).append(s).append(Integer.toString(c1 % 256)).toString();
                if (j != l - 1)
                {
                    s = (new StringBuilder()).append(s).append(",").toString();
                } else
                {
                    s = (new StringBuilder()).append(s).append("]}").toString();
                }
                j++;
            } while (true);
        }
        return s1;
    }

}
