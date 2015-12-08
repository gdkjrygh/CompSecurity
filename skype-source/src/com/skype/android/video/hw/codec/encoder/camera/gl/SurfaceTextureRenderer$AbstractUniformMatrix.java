// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.video.hw.codec.encoder.camera.gl;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.Matrix;

// Referenced classes of package com.skype.android.video.hw.codec.encoder.camera.gl:
//            SurfaceTextureRenderer, GLException, Program

private static abstract class idx
{

    protected final float data[] = new float[16];
    private final int idx;

    public void getFrom(SurfaceTexture surfacetexture)
    {
        surfacetexture.getTransformMatrix(data);
    }

    public void makeIdentity()
    {
        Matrix.setIdentityM(data, 0);
    }

    public void setup()
        throws GLException
    {
        GLES20.glUniformMatrix4fv(idx, 1, false, data, 0);
        SurfaceTextureRenderer.access$000("Failed to setup matrix");
    }

    public (Program program, String s)
        throws GLException
    {
        idx = program.getUniformLocation(s);
    }
}
