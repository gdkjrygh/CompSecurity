// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.video.hw.codec.encoder.camera.gl;

import android.opengl.Matrix;
import com.skype.android.video.hw.format.Resolution;

// Referenced classes of package com.skype.android.video.hw.codec.encoder.camera.gl:
//            SurfaceTextureRenderer, GLException, Program

private static class iformMatrix extends iformMatrix
{

    private static int getLong(Resolution resolution)
    {
        return Math.max(resolution.getWidth(), resolution.getHeight());
    }

    private static int getShort(Resolution resolution)
    {
        return Math.min(resolution.getWidth(), resolution.getHeight());
    }

    private static boolean isPortrait(int i)
    {
        return i % 180 != 0;
    }

    public void transform(Resolution resolution, Resolution resolution1, float f, int i, boolean flag, boolean flag1)
    {
        float f1;
        int j;
        int k;
        boolean flag2;
        if (getLong(resolution) != resolution.getWidth())
        {
            j = 1;
        } else
        {
            j = 0;
        }
        if (getLong(resolution1) != resolution1.getWidth())
        {
            k = 1;
        } else
        {
            k = 0;
        }
        if (j != k)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        if (flag2 != isPortrait(i))
        {
            j = 1;
        } else
        {
            j = 0;
        }
        if (j != 0)
        {
            j = getShort(resolution) * getShort(resolution1);
            k = getLong(resolution) * getLong(resolution1);
        } else
        {
            j = getLong(resolution1) * getShort(resolution);
            k = getLong(resolution) * getShort(resolution1);
        }
        f1 = (float)Math.min(j, k) / (float)Math.max(j, k);
        f += (1.0F - f) / f1;
        if (j > k)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        if (flag2 != isPortrait(i))
        {
            Matrix.scaleM(data, 0, f1, 1.0F, 1.0F);
        } else
        {
            Matrix.scaleM(data, 0, 1.0F, f1, 1.0F);
        }
        Matrix.scaleM(data, 0, f, f, 1.0F);
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
