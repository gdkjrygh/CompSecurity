// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.video.hw.codec.encoder.camera.gl;

import android.opengl.GLES20;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

// Referenced classes of package com.skype.android.video.hw.codec.encoder.camera.gl:
//            VirtualSourceGenerator, GLException, Program

private static class idxDataUVOffset
{

    private static final int FLOAT_SIZE_BYTES = 4;
    private static final int TRIANGLE_VERTICES_DATA_POS_OFFSET = 0;
    private static final int TRIANGLE_VERTICES_DATA_STRIDE_BYTES = 20;
    private static final int TRIANGLE_VERTICES_DATA_UV_OFFSET = 3;
    private static final float triangleVerticesData[] = {
        -1F, -1F, 0.0F, 0.0F, 0.0F, 1.0F, -1F, 0.0F, 1.0F, 0.0F, 
        -1F, 1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F
    };
    private final FloatBuffer data;
    private final int idxDataPosOffset;
    private final int idxDataUVOffset;

    private void setupVertexAttrib(int i, int j, int k)
        throws GLException
    {
        data.position(i);
        GLES20.glVertexAttribPointer(j, k, 5126, false, 20, data);
        VirtualSourceGenerator.access$000(new Object[] {
            "Failed to define vertex attribute data"
        });
        GLES20.glEnableVertexAttribArray(j);
        VirtualSourceGenerator.access$000(new Object[] {
            "Failed to enable vertex attribute array"
        });
    }

    public void setup()
        throws GLException
    {
        setupVertexAttrib(0, idxDataPosOffset, 3);
        setupVertexAttrib(3, idxDataUVOffset, 2);
    }


    public (Program program)
        throws GLException
    {
        data = ByteBuffer.allocateDirect(triangleVerticesData.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        data.put(triangleVerticesData).position(0);
        idxDataPosOffset = program.getAttribLocation("aPosition");
        idxDataUVOffset = program.getAttribLocation("aTextureCoord");
    }
}
