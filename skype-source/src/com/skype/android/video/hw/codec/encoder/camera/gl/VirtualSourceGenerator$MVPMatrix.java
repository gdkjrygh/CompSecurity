// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.video.hw.codec.encoder.camera.gl;

import android.opengl.Matrix;
import com.skype.android.video.hw.format.Resolution;

// Referenced classes of package com.skype.android.video.hw.codec.encoder.camera.gl:
//            VirtualSourceGenerator, GLException, Program

private static class iformMatrix extends iformMatrix
{

    private static final float AR_COMPARISON_TOLERANCE = 0.01F;

    private static float getAR(Resolution resolution, boolean flag)
    {
        if (flag)
        {
            return (float)resolution.getHeight() / (float)resolution.getWidth();
        } else
        {
            return (float)resolution.getWidth() / (float)resolution.getHeight();
        }
    }

    private static boolean isPortrait(int i)
    {
        return i % 180 != 0;
    }

    public void transform(Resolution resolution, Resolution resolution1, int i, boolean flag, boolean flag1)
    {
        boolean flag2 = isPortrait(i);
        float f = getAR(resolution1, flag2);
        float f1 = getAR(resolution, false);
        if (Math.abs(f - f1) > 0.01F)
        {
            float f2 = 1.0F;
            float f3 = 1.0F;
            if (f < f1)
            {
                if (flag2)
                {
                    f1 = f;
                    f = f2;
                } else
                {
                    f1 = f3;
                }
            } else
            if (flag2)
            {
                f = f1;
                f1 = f3;
            } else
            {
                f = f2;
            }
            Matrix.scaleM(data, 0, f, f1, 1.0F);
        }
        if (flag || flag1)
        {
            resolution = data;
            if (flag)
            {
                f = -1F;
            } else
            {
                f = 1.0F;
            }
            if (flag1)
            {
                f1 = -1F;
            } else
            {
                f1 = 1.0F;
            }
            Matrix.scaleM(resolution, 0, f, f1, 1.0F);
        }
        Matrix.rotateM(data, 0, i, 0.0F, 0.0F, 1.0F);
    }

    public iformMatrix(Program program)
        throws GLException
    {
        super(program, "uMVPMatrix");
    }
}
