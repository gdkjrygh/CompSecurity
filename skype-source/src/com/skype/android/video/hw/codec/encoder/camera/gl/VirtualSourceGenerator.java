// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.video.hw.codec.encoder.camera.gl;

import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.view.Surface;
import com.skype.android.video.hw.format.Resolution;
import com.skype.android.video.hw.utils.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

// Referenced classes of package com.skype.android.video.hw.codec.encoder.camera.gl:
//            GLException, SurfaceTextureRenderer, Program, Context, 
//            EGLUtils

public class VirtualSourceGenerator
{
    private static abstract class AbstractUniformMatrix
    {

        protected final float data[] = new float[16];
        private final int idx;

        public void makeIdentity()
        {
            Matrix.setIdentityM(data, 0);
        }

        public void setup()
            throws GLException
        {
            GLES20.glUniformMatrix4fv(idx, 1, false, data, 0);
            VirtualSourceGenerator.validate(new Object[] {
                "Failed to setup matrix"
            });
        }

        public AbstractUniformMatrix(Program program, String s)
            throws GLException
        {
            idx = program.getUniformLocation(s);
        }
    }

    private static class MVPMatrix extends AbstractUniformMatrix
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

        public MVPMatrix(Program program)
            throws GLException
        {
            super(program, "uMVPMatrix");
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
            VirtualSourceGenerator.validate(new Object[] {
                "Failed to define vertex attribute data"
            });
            GLES20.glEnableVertexAttribArray(j);
            VirtualSourceGenerator.validate(new Object[] {
                "Failed to enable vertex attribute array"
            });
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


    private static final int EGL_CONTEXT_ATTRIBUTES[] = {
        12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 
        12325, 0, 12326, 0, 12344
    };
    private static final String PIXEL_SHADER = "precision mediump float;\nvarying vec2 vTextureCoord;\nuniform sampler2D sTexture;\nvoid main() {\n    gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n";
    private static final String VERTEX_SHADER = "uniform mat4 uMVPMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = uMVPMatrix * aPosition;\n    vTextureCoord = aTextureCoord.xy;\n}\n";
    private Context context;
    private EGLSurface dummySurface;
    private EGLDisplay eglDisplay;
    private EGLSurface eglSurface;
    private Program glProgram;
    private MVPMatrix mvpMatrix;
    private Context sharedContext;
    private Resolution sourceResolution;
    private Surface surface;
    private final Object surfaceMutex = new Object();
    private Resolution targetResolution;
    private int textureId;
    private TriangleVertices triangleVertices;

    public VirtualSourceGenerator()
    {
    }

    private static void bindTexture(int i)
        throws GLException
    {
        if (Log.isLoggable("SLIQ", 3))
        {
            Log.d("SLIQ", (new StringBuilder()).append(com/skype/android/video/hw/codec/encoder/camera/gl/VirtualSourceGenerator.getSimpleName()).append(": Binding texture ").append(i).toString());
        }
        GLES20.glBindTexture(3553, i);
        validate(new Object[] {
            "Failed to bind texture ", Integer.valueOf(i)
        });
    }

    private static transient String cat(Object aobj[])
    {
        StringBuilder stringbuilder = new StringBuilder();
        int j = aobj.length;
        for (int i = 0; i < j; i++)
        {
            stringbuilder.append(aobj[i]);
        }

        return stringbuilder.toString();
    }

    private void createEGLDisplay()
        throws GLException
    {
        if (Log.isLoggable("SLIQ", 4))
        {
            Log.i("SLIQ", (new StringBuilder()).append(getClass().getSimpleName()).append(": Creating EGL display").toString());
        }
        eglDisplay = EGL14.eglGetDisplay(0);
        if (eglDisplay == EGL14.EGL_NO_DISPLAY)
        {
            throw new GLException("Failed to get EGL14 display.", EGL14.eglGetError());
        }
        if (Log.isLoggable("SLIQ", 4))
        {
            Log.i("SLIQ", (new StringBuilder()).append(getClass().getSimpleName()).append(": Initializing EGL").toString());
        }
        int ai[] = new int[2];
        if (!EGL14.eglInitialize(eglDisplay, ai, 0, ai, 1))
        {
            throw new GLException("Failed to initialize EGL.", EGL14.eglGetError());
        }
        if (Log.isLoggable("SLIQ", 4))
        {
            Log.i("SLIQ", (new StringBuilder()).append(getClass().getSimpleName()).append(": EGL initialized: version ").append(ai[0]).append(".").append(ai[1]).toString());
        }
    }

    private int createTexture()
        throws GLException
    {
        int ai[] = new int[1];
        GLES20.glGenTextures(1, ai, 0);
        if (ai[0] == 0)
        {
            throw new RuntimeException("Error loading texture.");
        } else
        {
            return ai[0];
        }
    }

    private void loadTexture(Resolution resolution, int i, ByteBuffer bytebuffer)
    {
        GLES20.glBindTexture(3553, i);
        GLES20.glTexParameteri(3553, 10241, 9728);
        GLES20.glTexParameteri(3553, 10240, 9728);
        GLES20.glTexImage2D(3553, 0, 6408, resolution.getWidth(), resolution.getHeight(), 0, 6408, 5121, bytebuffer);
        bytebuffer.position(0);
    }

    private void render()
        throws GLException
    {
        if (Log.isLoggable("SLIQ", 3))
        {
            Log.d("SLIQ", (new StringBuilder()).append(com/skype/android/video/hw/codec/encoder/camera/gl/SurfaceTextureRenderer.getSimpleName()).append(": rendering a frame").toString());
        }
        GLES20.glClear(16384);
        glProgram.install();
        GLES20.glUniform1i(glProgram.getUniformLocation("sTexture"), 0);
        mvpMatrix.setup();
        GLES20.glActiveTexture(33984);
        bindTexture(textureId);
        GLES20.glDrawArrays(5, 0, 4);
        validate(new Object[] {
            "Failed to draw arrays"
        });
    }

    private static void setViewPort(Resolution resolution)
        throws GLException
    {
        int i = (16 - resolution.getHeight() % 16) % 16;
        GLES20.glScissor(0, i, resolution.getWidth(), resolution.getHeight());
        validate(new Object[] {
            "Failed to set scissor to ", resolution
        });
        GLES20.glViewport(0, i, resolution.getWidth(), resolution.getHeight());
        validate(new Object[] {
            "Failed to set viewport to ", resolution
        });
    }

    private static transient void validate(Object aobj[])
        throws GLException
    {
        int i = GLES20.glGetError();
        if (i != 0)
        {
            throw new GLException(cat(aobj), i);
        } else
        {
            return;
        }
    }

    public void close()
        throws GLException
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

    public void createContextIfNotExist()
        throws GLException
    {
        if (context == null)
        {
            context = new Context(sharedContext, EGL_CONTEXT_ATTRIBUTES);
            eglSurface = EGL14.eglCreateWindowSurface(context.getEGLDisplay(), context.getEGLConfig(), surface, new int[] {
                12344
            }, 0);
        }
    }

    public void renderOneFrame(ByteBuffer bytebuffer, long l)
        throws GLException
    {
        createContextIfNotExist();
        EGL14.eglMakeCurrent(context.getEGLDisplay(), eglSurface, eglSurface, context.getEGLContext());
        validate(new Object[] {
            "Failed to eglMakeCurrent"
        });
        loadTexture(sourceResolution, textureId, bytebuffer);
        mvpMatrix.makeIdentity();
        mvpMatrix.transform(sourceResolution, targetResolution, 0, false, true);
        triangleVertices.setup();
        setViewPort(targetResolution);
        validate(new Object[] {
            "Failed to set uViewport to ", targetResolution
        });
        render();
        bindTexture(0);
        if (Log.isLoggable("SLIQ", 3))
        {
            Log.d("SLIQ", (new StringBuilder()).append(getClass().getSimpleName()).append(".draw() leave").toString());
        }
        if (l < 0L && Log.isLoggable("SLIQ", 6))
        {
            Log.e("SLIQ", (new StringBuilder("Provided timestamp is negative but must be positive for MediaCodec: ")).append(l).toString());
        }
        EGLExt.eglPresentationTimeANDROID(context.getEGLDisplay(), eglSurface, 1000L * l);
        EGL14.eglSwapBuffers(context.getEGLDisplay(), eglSurface);
        EGLUtils.validate("Failed to swap buffers.");
    }

    public void setResolution(Resolution resolution)
    {
        sourceResolution = resolution;
        targetResolution = resolution;
    }

    public void setSurface(Surface surface1)
    {
        synchronized (surfaceMutex)
        {
            if (surface != null)
            {
                surface.release();
            }
            surface = surface1;
        }
        return;
        surface1;
        obj;
        JVM INSTR monitorexit ;
        throw surface1;
    }

    public void setup()
        throws GLException
    {
        createEGLDisplay();
        sharedContext = new Context(eglDisplay, EGL_CONTEXT_ATTRIBUTES);
        dummySurface = EGL14.eglCreatePbufferSurface(sharedContext.getEGLDisplay(), sharedContext.getEGLConfig(), new int[] {
            12375, 640, 12374, 480, 12344
        }, 0);
        EGL14.eglMakeCurrent(sharedContext.getEGLDisplay(), dummySurface, dummySurface, sharedContext.getEGLContext());
        glProgram = new Program("uniform mat4 uMVPMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = uMVPMatrix * aPosition;\n    vTextureCoord = aTextureCoord.xy;\n}\n", "precision mediump float;\nvarying vec2 vTextureCoord;\nuniform sampler2D sTexture;\nvoid main() {\n    gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n");
        mvpMatrix = new MVPMatrix(glProgram);
        triangleVertices = new TriangleVertices(glProgram);
        textureId = createTexture();
        GLES20.glClearColor(1.0F, 1.0F, 0.0F, 1.0F);
        GLES20.glDisable(2929);
        GLES20.glEnable(3553);
        EGL14.eglMakeCurrent(sharedContext.getEGLDisplay(), EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_CONTEXT);
    }


}
