// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.video.hw.codec.encoder.camera.gl;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.Matrix;
import com.skype.android.video.hw.format.Resolution;
import com.skype.android.video.hw.utils.Log;
import java.io.Closeable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

// Referenced classes of package com.skype.android.video.hw.codec.encoder.camera.gl:
//            GLException, Program

public class SurfaceTextureRenderer
    implements Closeable
{
    private static abstract class AbstractUniformMatrix
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
            SurfaceTextureRenderer.validate("Failed to setup matrix");
        }

        public AbstractUniformMatrix(Program program, String s)
            throws GLException
        {
            idx = program.getUniformLocation(s);
        }
    }

    private static class MVPMatrix extends AbstractUniformMatrix
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

        public MVPMatrix(Program program)
            throws GLException
        {
            super(program, "uMVPMatrix");
        }
    }

    private static class STMatrix extends AbstractUniformMatrix
    {

        public STMatrix(Program program)
            throws GLException
        {
            super(program, "uSTMatrix");
        }
    }

    private static class TriangleVertices
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
            SurfaceTextureRenderer.validate("Failed to define vertex attribute data");
            GLES20.glEnableVertexAttribArray(j);
            SurfaceTextureRenderer.validate("Failed to enable vertex attribute array");
        }

        public void setup()
            throws GLException
        {
            setupVertexAttrib(0, idxDataPosOffset, 3);
            setupVertexAttrib(3, idxDataUVOffset, 2);
        }


        public TriangleVertices(Program program)
            throws GLException
        {
            data = ByteBuffer.allocateDirect(triangleVerticesData.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
            data.put(triangleVerticesData).position(0);
            idxDataPosOffset = program.getAttribLocation("aPosition");
            idxDataUVOffset = program.getAttribLocation("aTextureCoord");
        }
    }


    private static final String PIXEL_SHADER_CROSS_HATCH = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n    \tvec3 clr = texture2D(sTexture, vTextureCoord).rgb;\n     vec3 resClr = vec3(1.0);     float luma = dot(clr, vec3(0.299, 0.587, 0.114));\n\t\tif (luma < 0.8) {\n         if (mod(gl_FragCoord.x + gl_FragCoord.y, 10.0) == 0.0) {\t\t\t\tresClr = vec3(0.0);\n         }\n\t\t}\n\t\tif (luma < 0.7) {\n         if (mod(gl_FragCoord.x - gl_FragCoord.y, 10.0) == 0.0) {\t\t\t\tresClr = vec3(0.0);\n         }\n\t\t}\n\t\tif (luma < 0.6) {\n         if (mod(gl_FragCoord.x + gl_FragCoord.y - 5.0, 10.0) == 0.0) {\t\t\t\tresClr = vec3(0.0);\n         }\n\t\t}\n\t\tif (luma < 0.5) {\n         if (mod(gl_FragCoord.x - gl_FragCoord.y - 5.0, 10.0) == 0.0) {\t\t\t\tresClr = vec3(0.0);\n         }\n\t\t}\n\t\tif (luma < 0.4) {\n         if (mod(gl_FragCoord.x + gl_FragCoord.y - 2.0, 10.0) == 0.0) {\t\t\t\tresClr = vec3(0.0);\n         }\n\t\t}\n\t\tif (luma < 0.3) {\n         if (mod(gl_FragCoord.x - gl_FragCoord.y - 2.0, 10.0) == 0.0) {\t\t\t\tresClr = vec3(0.0);\n         }\n\t\t}\n\t\tgl_FragColor = vec4(resClr, 1.0);\n}\n";
    private static final String PIXEL_SHADER_DEFAULT = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n    gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n";
    private static final String PIXEL_SHADER_PORTRAIT_HIGH = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n    vec3  clr  = texture2D(sTexture, vTextureCoord).rgb;\n    float grey = dot(vec3(0.299, 0.587, 0.114), clr);\n    grey = 0.5 + sin(3.1415926 * (grey + 1.5))/2.0;    float dst = distance(vTextureCoord, vec2(0.5, 0.5))/length(vec2(0.5, 0.5));    vec3 res  = mix(clr, vec3(grey), dst * dst) + vec3(dst*dst*dst) + 0.3;    gl_FragColor = vec4(res, 1.0);\n}\n";
    private static final String PIXEL_SHADER_POSTERIZE = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n    vec3  clr  = texture2D(sTexture, vTextureCoord).rgb;\n    clr = floor(vec3(10) * pow(clr, vec3(0.625)))/vec3(10);\n    gl_FragColor = vec4(clr, 1.0);\n}\n";
    private static final String VERTEX_SHADER = "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = uMVPMatrix * aPosition;\n    vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n";
    private Program glProgram;
    private final MVPMatrix mvpMatrix;
    private int sourceTextureId;
    private final STMatrix stMatrix;
    private final TriangleVertices triangleVertices;

    public SurfaceTextureRenderer()
        throws GLException
    {
        if (Log.isLoggable("SLIQ", 4))
        {
            Log.i("SLIQ", (new StringBuilder()).append(getClass().getSimpleName()).append(": Creating").toString());
        }
        glProgram = new Program("uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = uMVPMatrix * aPosition;\n    vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n", "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n    gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n");
        stMatrix = new STMatrix(glProgram);
        mvpMatrix = new MVPMatrix(glProgram);
        triangleVertices = new TriangleVertices(glProgram);
        sourceTextureId = createTexture();
        bindTexture(sourceTextureId);
        setGlParamFloat(10241, 9729F);
        setGlParamFloat(10240, 9729F);
        setGlParamInt(10242, 33071);
        setGlParamInt(10243, 33071);
        if (Log.isLoggable("SLIQ", 4))
        {
            Log.i("SLIQ", (new StringBuilder()).append(getClass().getSimpleName()).append(": Created").toString());
        }
    }

    private static void bindTexture(int i)
        throws GLException
    {
        if (Log.isLoggable("SLIQ", 3))
        {
            Log.d("SLIQ", (new StringBuilder()).append(com/skype/android/video/hw/codec/encoder/camera/gl/SurfaceTextureRenderer.getSimpleName()).append(": Binding texture ").append(i).toString());
        }
        GLES20.glBindTexture(36197, i);
        validate("Failed to bind texture");
    }

    private static int createTexture()
        throws GLException
    {
        int ai[] = new int[1];
        GLES20.glGenTextures(1, ai, 0);
        return ai[0];
    }

    private void render()
        throws GLException
    {
        if (Log.isLoggable("SLIQ", 3))
        {
            Log.d("SLIQ", (new StringBuilder()).append(com/skype/android/video/hw/codec/encoder/camera/gl/SurfaceTextureRenderer.getSimpleName()).append(": rendering a frame").toString());
        }
        GLES20.glClearColor(0.0F, 0.0F, 0.0F, 1.0F);
        GLES20.glClear(16640);
        GLES20.glDrawArrays(5, 0, 4);
        validate("Failed to draw arrays");
    }

    private static void setGlParamFloat(int i, float f)
        throws GLException
    {
        GLES20.glTexParameterf(36197, i, f);
        validate("Failed to set GLES20 float parameter");
    }

    private static void setGlParamInt(int i, int j)
        throws GLException
    {
        GLES20.glTexParameteri(36197, i, j);
        validate("Failed to set GLES20 int parameter");
    }

    private static void setViewPort(Resolution resolution)
        throws GLException
    {
        GLES20.glScissor(0, 0, resolution.getWidth(), resolution.getHeight());
        validate("Failed to set scissor");
        GLES20.glViewport(0, 0, resolution.getWidth(), resolution.getHeight());
        validate("Failed to set viewport");
    }

    private static void validate(String s)
        throws GLException
    {
        int i = GLES20.glGetError();
        if (i != 0)
        {
            throw new GLException(s, i);
        } else
        {
            return;
        }
    }

    public void close()
    {
        if (glProgram != null)
        {
            if (Log.isLoggable("SLIQ", 4))
            {
                Log.i("SLIQ", (new StringBuilder()).append(getClass().getSimpleName()).append(": Closing").toString());
            }
            glProgram.close();
            glProgram = null;
            if (Log.isLoggable("SLIQ", 4))
            {
                Log.i("SLIQ", (new StringBuilder()).append(getClass().getSimpleName()).append(": Closed").toString());
            }
        }
    }

    public void draw(SurfaceTexture surfacetexture, Resolution resolution, Resolution resolution1, float f, int i, boolean flag, boolean flag1)
        throws GLException
    {
        if (Log.isLoggable("SLIQ", 3))
        {
            StringBuilder stringbuilder = (new StringBuilder()).append(getClass().getSimpleName()).append(".draw() enter: ").append(resolution).append(" -> ").append(resolution1).append(" @").append(i).append(" deg");
            String s;
            if (flag)
            {
                s = ", H-flip";
            } else
            {
                s = "";
            }
            stringbuilder = stringbuilder.append(s);
            if (flag1)
            {
                s = ", V-flip";
            } else
            {
                s = "";
            }
            Log.d("SLIQ", stringbuilder.append(s).toString());
        }
        glProgram.install();
        GLES20.glActiveTexture(33984);
        bindTexture(sourceTextureId);
        stMatrix.getFrom(surfacetexture);
        mvpMatrix.makeIdentity();
        mvpMatrix.transform(resolution, resolution1, f, i, flag, flag1);
        stMatrix.setup();
        mvpMatrix.setup();
        triangleVertices.setup();
        setViewPort(resolution1);
        render();
        bindTexture(0);
        if (Log.isLoggable("SLIQ", 3))
        {
            Log.d("SLIQ", (new StringBuilder()).append(getClass().getSimpleName()).append(".draw() leave").toString());
        }
    }

    public int getSourceTextureId()
    {
        return sourceTextureId;
    }

}
