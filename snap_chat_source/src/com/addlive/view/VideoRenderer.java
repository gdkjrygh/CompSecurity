// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.addlive.view;

import android.opengl.GLES20;
import com.addlive.impl.Log;
import com.addlive.platform.ADL;
import com.addlive.service.AddLiveService;
import com.addlive.service.DrawRequest;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

// Referenced classes of package com.addlive.view:
//            VideoViewType

public class VideoRenderer
    implements android.opengl.GLSurfaceView.Renderer
{

    private static final String CIRCLE_SHADER_SRC = "precision mediump float;                                              \nvarying vec2 TexCoordOut;                                             \nvarying vec2 TexCoordOutUV;                                           \nuniform sampler2D TextureY;                                           \nuniform sampler2D TextureU;                                           \nuniform sampler2D TextureV;                                           \nuniform float CircleRadius;                                           \nuniform float xScale;                                                 \nuniform float yScale;                                                 \nconst mat3 yuv2rgb = mat3(                                            \n  1, 1, 1,                                                            \n  0, -0.18732, 1.8556,                                                \n  1.57481, -0.46813, 0);                                              \nvoid main(void) {                                                     \n  vec3 yuv;                                                           \n  vec3 rgb;                                                           \n  float xadj = (TexCoordOut.x - 0.5) * xScale;                        \n  float yadj = (TexCoordOut.y - 0.5) * yScale;                        \n  float radius = distance(vec2(xadj, yadj), vec2(0.0, 0.0));          \n  float inCircle = float(radius < CircleRadius);                      \n  yuv.x = (texture2D(TextureY, TexCoordOut).r ) * inCircle;           \n  yuv.y = (texture2D(TextureU, TexCoordOutUV).r - 0.5) * inCircle;    \n  yuv.z = (texture2D(TextureV, TexCoordOutUV).r - 0.5) * inCircle;    \n  rgb = yuv2rgb * yuv;                                                \n  gl_FragColor = vec4(rgb, inCircle);                                 \n}                                                                     \n";
    private static final String LOG_TAG = "AddLive_SDK";
    private static final String RECT_SHADER_SRC = "precision mediump float;                              \nvarying vec2 TexCoordOut;                             \nvarying vec2 TexCoordOutUV;                           \nuniform sampler2D TextureY;                           \nuniform sampler2D TextureU;                           \nuniform sampler2D TextureV;                           \nconst mat3 yuv2rgb = mat3(                            \n  1, 1, 1,                                            \n  0, -0.18732, 1.8556,                                \n  1.57481, -0.46813, 0);                              \nvoid main(void) {                                     \n  vec3 yuv;                                           \n  vec3 rgb;                                           \n  yuv.x = texture2D(TextureY, TexCoordOut).r;         \n  yuv.y = texture2D(TextureU, TexCoordOutUV).r - 0.5; \n  yuv.z = texture2D(TextureV, TexCoordOutUV).r - 0.5; \n  rgb = yuv2rgb * yuv;                                \n  gl_FragColor = vec4(rgb, 1.0);                      \n}                                                     \n";
    private static final int SIZE_FLOAT = 4;
    private static final int SIZE_SHORT = 2;
    private static final String VERTEX_SHADER_SRC = "attribute vec4 Position;                              \nattribute vec2 TexCoordIn;                            \nvarying vec2 TexCoordOut;\t                           \nvarying vec2 TexCoordOutUV;\t                   \nuniform float ScaleUV;                                \nvoid main(void) {                                     \n  gl_Position = Position;\t                           \n  TexCoordOut = TexCoordIn;                           \n  TexCoordOutUV = vec2(ScaleUV, 1) * TexCoordIn;      \n}                                                     \n";
    private String FRAGMENT_SHADER_SRC;
    private int circleCoordSlot;
    private int circleRadius;
    private ShortBuffer indexBuffer;
    private boolean mirror;
    private int positionSlot;
    private int program;
    private int rendererId;
    private float scaleUV;
    private int scaleUniformUV;
    private int srfHeight;
    private float srfRadius;
    private int srfWidth;
    private int texCoordSlot;
    private int texHeight;
    private int texU;
    private int texUniformU;
    private int texUniformV;
    private int texUniformY;
    private int texV;
    private int texWidth;
    private int texY;
    private VideoViewType type;
    private boolean updateTextures;
    private FloatBuffer vertexBuffer;
    private int xScale;
    private float xScaleValue;
    private int yScale;
    private float yScaleValue;

    public VideoRenderer()
    {
        mirror = false;
        rendererId = -1;
        program = -1;
        positionSlot = -1;
        texCoordSlot = -1;
        circleCoordSlot = -1;
        texUniformY = -1;
        texUniformU = -1;
        texUniformV = -1;
        scaleUniformUV = -1;
        circleRadius = -1;
        xScale = -1;
        yScale = -1;
        texY = -1;
        texU = -1;
        texV = -1;
        texWidth = 0;
        texHeight = 0;
        srfWidth = 0;
        srfHeight = 0;
        scaleUV = 1.0F;
        srfRadius = 0.15F;
        xScaleValue = 0.0F;
        yScaleValue = 0.0F;
        vertexBuffer = null;
        indexBuffer = null;
        updateTextures = false;
        vertexBuffer = ByteBuffer.allocateDirect(80).order(ByteOrder.nativeOrder()).asFloatBuffer();
        vertexBuffer.put(new float[] {
            -1F, -1F, 0.0F, 0.0F, 1.0F, 1.0F, -1F, 0.0F, 1.0F, 1.0F, 
            1.0F, 1.0F, 0.0F, 1.0F, 0.0F, -1F, 1.0F, 0.0F, 0.0F, 0.0F
        }).rewind();
        indexBuffer = ByteBuffer.allocateDirect(12).order(ByteOrder.nativeOrder()).asShortBuffer();
        indexBuffer.put(new short[] {
            0, 1, 2, 2, 3, 0
        }).rewind();
        type = VideoViewType.RECTANGLE;
        FRAGMENT_SHADER_SRC = "precision mediump float;                              \nvarying vec2 TexCoordOut;                             \nvarying vec2 TexCoordOutUV;                           \nuniform sampler2D TextureY;                           \nuniform sampler2D TextureU;                           \nuniform sampler2D TextureV;                           \nconst mat3 yuv2rgb = mat3(                            \n  1, 1, 1,                                            \n  0, -0.18732, 1.8556,                                \n  1.57481, -0.46813, 0);                              \nvoid main(void) {                                     \n  vec3 yuv;                                           \n  vec3 rgb;                                           \n  yuv.x = texture2D(TextureY, TexCoordOut).r;         \n  yuv.y = texture2D(TextureU, TexCoordOutUV).r - 0.5; \n  yuv.z = texture2D(TextureV, TexCoordOutUV).r - 0.5; \n  rgb = yuv2rgb * yuv;                                \n  gl_FragColor = vec4(rgb, 1.0);                      \n}                                                     \n";
    }

    public VideoRenderer(VideoViewType videoviewtype)
    {
        mirror = false;
        rendererId = -1;
        program = -1;
        positionSlot = -1;
        texCoordSlot = -1;
        circleCoordSlot = -1;
        texUniformY = -1;
        texUniformU = -1;
        texUniformV = -1;
        scaleUniformUV = -1;
        circleRadius = -1;
        xScale = -1;
        yScale = -1;
        texY = -1;
        texU = -1;
        texV = -1;
        texWidth = 0;
        texHeight = 0;
        srfWidth = 0;
        srfHeight = 0;
        scaleUV = 1.0F;
        srfRadius = 0.15F;
        xScaleValue = 0.0F;
        yScaleValue = 0.0F;
        vertexBuffer = null;
        indexBuffer = null;
        updateTextures = false;
        vertexBuffer = ByteBuffer.allocateDirect(80).order(ByteOrder.nativeOrder()).asFloatBuffer();
        vertexBuffer.put(new float[] {
            -1F, -1F, 0.0F, 0.0F, 1.0F, 1.0F, -1F, 0.0F, 1.0F, 1.0F, 
            1.0F, 1.0F, 0.0F, 1.0F, 0.0F, -1F, 1.0F, 0.0F, 0.0F, 0.0F
        }).rewind();
        indexBuffer = ByteBuffer.allocateDirect(12).order(ByteOrder.nativeOrder()).asShortBuffer();
        indexBuffer.put(new short[] {
            0, 1, 2, 2, 3, 0
        }).rewind();
        type = videoviewtype;
        static class _cls1
        {

            static final int $SwitchMap$com$addlive$view$VideoViewType[];

            static 
            {
                $SwitchMap$com$addlive$view$VideoViewType = new int[VideoViewType.values().length];
                try
                {
                    $SwitchMap$com$addlive$view$VideoViewType[VideoViewType.RECTANGLE.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$addlive$view$VideoViewType[VideoViewType.CIRCLE.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1..SwitchMap.com.addlive.view.VideoViewType[type.ordinal()])
        {
        default:
            FRAGMENT_SHADER_SRC = "precision mediump float;                              \nvarying vec2 TexCoordOut;                             \nvarying vec2 TexCoordOutUV;                           \nuniform sampler2D TextureY;                           \nuniform sampler2D TextureU;                           \nuniform sampler2D TextureV;                           \nconst mat3 yuv2rgb = mat3(                            \n  1, 1, 1,                                            \n  0, -0.18732, 1.8556,                                \n  1.57481, -0.46813, 0);                              \nvoid main(void) {                                     \n  vec3 yuv;                                           \n  vec3 rgb;                                           \n  yuv.x = texture2D(TextureY, TexCoordOut).r;         \n  yuv.y = texture2D(TextureU, TexCoordOutUV).r - 0.5; \n  yuv.z = texture2D(TextureV, TexCoordOutUV).r - 0.5; \n  rgb = yuv2rgb * yuv;                                \n  gl_FragColor = vec4(rgb, 1.0);                      \n}                                                     \n";
            return;

        case 1: // '\001'
            FRAGMENT_SHADER_SRC = "precision mediump float;                              \nvarying vec2 TexCoordOut;                             \nvarying vec2 TexCoordOutUV;                           \nuniform sampler2D TextureY;                           \nuniform sampler2D TextureU;                           \nuniform sampler2D TextureV;                           \nconst mat3 yuv2rgb = mat3(                            \n  1, 1, 1,                                            \n  0, -0.18732, 1.8556,                                \n  1.57481, -0.46813, 0);                              \nvoid main(void) {                                     \n  vec3 yuv;                                           \n  vec3 rgb;                                           \n  yuv.x = texture2D(TextureY, TexCoordOut).r;         \n  yuv.y = texture2D(TextureU, TexCoordOutUV).r - 0.5; \n  yuv.z = texture2D(TextureV, TexCoordOutUV).r - 0.5; \n  rgb = yuv2rgb * yuv;                                \n  gl_FragColor = vec4(rgb, 1.0);                      \n}                                                     \n";
            return;

        case 2: // '\002'
            FRAGMENT_SHADER_SRC = "precision mediump float;                                              \nvarying vec2 TexCoordOut;                                             \nvarying vec2 TexCoordOutUV;                                           \nuniform sampler2D TextureY;                                           \nuniform sampler2D TextureU;                                           \nuniform sampler2D TextureV;                                           \nuniform float CircleRadius;                                           \nuniform float xScale;                                                 \nuniform float yScale;                                                 \nconst mat3 yuv2rgb = mat3(                                            \n  1, 1, 1,                                                            \n  0, -0.18732, 1.8556,                                                \n  1.57481, -0.46813, 0);                                              \nvoid main(void) {                                                     \n  vec3 yuv;                                                           \n  vec3 rgb;                                                           \n  float xadj = (TexCoordOut.x - 0.5) * xScale;                        \n  float yadj = (TexCoordOut.y - 0.5) * yScale;                        \n  float radius = distance(vec2(xadj, yadj), vec2(0.0, 0.0));          \n  float inCircle = float(radius < CircleRadius);                      \n  yuv.x = (texture2D(TextureY, TexCoordOut).r ) * inCircle;           \n  yuv.y = (texture2D(TextureU, TexCoordOutUV).r - 0.5) * inCircle;    \n  yuv.z = (texture2D(TextureV, TexCoordOutUV).r - 0.5) * inCircle;    \n  rgb = yuv2rgb * yuv;                                                \n  gl_FragColor = vec4(rgb, inCircle);                                 \n}                                                                     \n";
            break;
        }
    }

    private int align4(int i)
    {
        return i + 3 & -4;
    }

    private void allocTextures(int i, int j)
    {
        texY = newTexture(i, j, 6409, null);
        texU = newTexture(i / 2, j / 2, 6409, null);
        texV = newTexture(i / 2, j / 2, 6409, null);
        texWidth = i;
        texHeight = j;
    }

    private void clearTextures()
    {
        if (texWidth == 0 || texHeight == 0)
        {
            return;
        }
        ByteBuffer bytebuffer = ByteBuffer.allocateDirect(align4(texWidth) * texHeight);
        for (int i = 0; i < bytebuffer.capacity(); i++)
        {
            bytebuffer.put((byte)0);
        }

        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, texY);
        GLES20.glTexSubImage2D(3553, 0, 0, 0, align4(texWidth), texHeight, 6409, 5121, bytebuffer.rewind());
        bytebuffer = ByteBuffer.allocateDirect((align4(texWidth / 2) * texHeight) / 2);
        for (int j = 0; j < bytebuffer.capacity(); j++)
        {
            bytebuffer.put((byte)-128);
        }

        GLES20.glActiveTexture(33985);
        GLES20.glBindTexture(3553, texU);
        GLES20.glTexSubImage2D(3553, 0, 0, 0, align4(texWidth / 2), texHeight / 2, 6409, 5121, bytebuffer.rewind());
        GLES20.glActiveTexture(33986);
        GLES20.glBindTexture(3553, texV);
        GLES20.glTexSubImage2D(3553, 0, 0, 0, align4(texWidth / 2), texHeight / 2, 6409, 5121, bytebuffer.rewind());
    }

    private int createShader(int i, String s)
    {
        i = GLES20.glCreateShader(i);
        if (i == 0)
        {
            Log.e("AddLive_SDK", "Error creating shader.");
            throw new RuntimeException("Error creating shader.");
        }
        GLES20.glShaderSource(i, s);
        GLES20.glCompileShader(i);
        s = new int[1];
        GLES20.glGetShaderiv(i, 35713, s, 0);
        if (s[0] == 0)
        {
            GLES20.glDeleteShader(i);
            Log.e("AddLive_SDK", "Error compiling shader.");
            throw new RuntimeException("Error compiling shader.");
        } else
        {
            return i;
        }
    }

    private void deallocTextures()
    {
        GLES20.glDeleteTextures(3, new int[] {
            texY, texU, texV
        }, 0);
        texV = -1;
        texU = -1;
        texY = -1;
    }

    private void initShaders()
    {
        int i = createShader(35633, "attribute vec4 Position;                              \nattribute vec2 TexCoordIn;                            \nvarying vec2 TexCoordOut;\t                           \nvarying vec2 TexCoordOutUV;\t                   \nuniform float ScaleUV;                                \nvoid main(void) {                                     \n  gl_Position = Position;\t                           \n  TexCoordOut = TexCoordIn;                           \n  TexCoordOutUV = vec2(ScaleUV, 1) * TexCoordIn;      \n}                                                     \n");
        int j = createShader(35632, FRAGMENT_SHADER_SRC);
        program = GLES20.glCreateProgram();
        if (program == 0)
        {
            Log.e("AddLive_SDK", "Error creating program.");
            throw new RuntimeException("Error creating program.");
        }
        GLES20.glAttachShader(program, i);
        GLES20.glAttachShader(program, j);
        GLES20.glLinkProgram(program);
        int ai[] = new int[1];
        GLES20.glGetProgramiv(program, 35714, ai, 0);
        if (ai[0] == 0)
        {
            GLES20.glDeleteProgram(program);
            Log.e("AddLive_SDK", "Error linking program.");
            throw new RuntimeException("Error linking program.");
        } else
        {
            GLES20.glUseProgram(program);
            positionSlot = GLES20.glGetAttribLocation(program, "Position");
            texCoordSlot = GLES20.glGetAttribLocation(program, "TexCoordIn");
            circleCoordSlot = GLES20.glGetAttribLocation(program, "CircleCoordIn");
            GLES20.glEnableVertexAttribArray(positionSlot);
            GLES20.glEnableVertexAttribArray(texCoordSlot);
            GLES20.glEnableVertexAttribArray(circleCoordSlot);
            texUniformY = GLES20.glGetUniformLocation(program, "TextureY");
            texUniformU = GLES20.glGetUniformLocation(program, "TextureU");
            texUniformV = GLES20.glGetUniformLocation(program, "TextureV");
            scaleUniformUV = GLES20.glGetUniformLocation(program, "ScaleUV");
            circleRadius = GLES20.glGetUniformLocation(program, "CircleRadius");
            xScale = GLES20.glGetUniformLocation(program, "xScale");
            yScale = GLES20.glGetUniformLocation(program, "yScale");
            return;
        }
    }

    private int newTexture(int i, int j, int k, ByteBuffer bytebuffer)
    {
        IntBuffer intbuffer = IntBuffer.allocate(1);
        GLES20.glGenTextures(1, intbuffer);
        GLES20.glBindTexture(3553, intbuffer.get(0));
        GLES20.glPixelStorei(3317, 1);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLES20.glTexImage2D(3553, 0, k, align4(i), j, 0, k, 5121, bytebuffer);
        return intbuffer.get(0);
    }

    private void renderFrame()
    {
        if (texY < 0 || texU < 0 || texV < 0)
        {
            return;
        } else
        {
            DrawRequest drawrequest = new DrawRequest(0, 0, texHeight, texWidth, rendererId, texY, texU, texV);
            ADL.getService().draw(drawrequest);
            GLES20.glVertexAttribPointer(positionSlot, 3, 5126, false, 20, 0);
            GLES20.glVertexAttribPointer(texCoordSlot, 2, 5126, false, 20, 12);
            GLES20.glUniform1f(scaleUniformUV, scaleUV);
            GLES20.glUniform1f(circleRadius, srfRadius);
            GLES20.glUniform1f(xScale, xScaleValue);
            GLES20.glUniform1f(yScale, yScaleValue);
            GLES20.glEnableVertexAttribArray(positionSlot);
            GLES20.glEnableVertexAttribArray(texCoordSlot);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, texY);
            GLES20.glUniform1i(texUniformY, 0);
            GLES20.glActiveTexture(33985);
            GLES20.glBindTexture(3553, texU);
            GLES20.glUniform1i(texUniformU, 1);
            GLES20.glActiveTexture(33986);
            GLES20.glBindTexture(3553, texV);
            GLES20.glUniform1i(texUniformV, 2);
            GLES20.glDrawElements(4, 6, 5123, 0);
            return;
        }
    }

    private void updateTexCoord()
    {
        Log.d("AddLive_SDK", (new StringBuilder("VideoRenderer::updateTexCoord: ")).append(texWidth).append("x").append(texHeight).append(" --> ").append(srfWidth).append("x").append(srfHeight).toString());
        float f2 = (float)texWidth / (float)texHeight;
        xScaleValue = f2;
        yScaleValue = 1.0F;
        float f;
        float f1;
        float f3;
        float f4;
        if ((float)srfHeight * f2 > (float)srfWidth)
        {
            f = (float)srfHeight * f2;
        } else
        {
            f = srfWidth;
        }
        if ((float)srfWidth / f2 > (float)srfHeight)
        {
            f1 = (float)srfWidth / f2;
        } else
        {
            f1 = srfHeight;
        }
        f4 = srfWidth;
        f3 = srfHeight;
        f = ((f - f4) * 0.5F) / f;
        f1 = (0.5F * (f1 - f3)) / f1;
        f3 = texWidth - (texWidth & -4);
        f2 = f3 / f2;
        f3 /= texWidth;
        f2 /= texHeight;
        scaleUV = ((float)(texWidth & -8) - 1.0F) / (float)texWidth;
        if (!mirror)
        {
            vertexBuffer.put(3, f + 0.0F);
            vertexBuffer.put(4, 1.0F - f1 - f2);
            vertexBuffer.put(8, 1.0F - f - f3);
            vertexBuffer.put(9, 1.0F - f1 - f2);
            vertexBuffer.put(13, 1.0F - f - f3);
            vertexBuffer.put(14, f1 + 0.0F);
            vertexBuffer.put(18, f + 0.0F);
            vertexBuffer.put(19, f1 + 0.0F);
        } else
        {
            vertexBuffer.put(3, 1.0F - f - f3);
            vertexBuffer.put(4, 1.0F - f1 - f2);
            vertexBuffer.put(8, f + 0.0F);
            vertexBuffer.put(9, 1.0F - f1 - f2);
            vertexBuffer.put(13, f + 0.0F);
            vertexBuffer.put(14, f1 + 0.0F);
            vertexBuffer.put(18, 1.0F - f - f3);
            vertexBuffer.put(19, f1 + 0.0F);
        }
        GLES20.glBufferSubData(34962, 0, 80, vertexBuffer);
    }

    private void updateTextures(int i, int j)
    {
        deallocTextures();
        allocTextures(i, j);
        clearTextures();
        updateTexCoord();
        updateTextures = false;
    }

    public int getRendererId()
    {
        return rendererId;
    }

    public void onDrawFrame(GL10 gl10)
    {
        GLES20.glClear(16384);
        GLES20.glUseProgram(program);
        if (updateTextures)
        {
            updateTextures(texWidth, texHeight);
        }
        if (rendererId >= 0 && texWidth > 0 && texHeight > 0)
        {
            renderFrame();
        }
        GLES20.glFinish();
    }

    public void onResolutionChanged(int i, int j)
    {
        if (texWidth == i && texHeight == j)
        {
            return;
        } else
        {
            texWidth = i;
            texHeight = j;
            updateTextures = true;
            return;
        }
    }

    public void onStartRendering(int i, boolean flag)
    {
        rendererId = i;
        mirror = flag;
    }

    public void onStopRendering()
    {
        rendererId = -1;
        clearTextures();
    }

    public void onSurfaceChanged(GL10 gl10, int i, int j)
    {
        Log.d("AddLive_SDK", (new StringBuilder("VideoRenderer::onSurfaceChanged(")).append(i).append("x").append(j).append(")").toString());
        GLES20.glViewport(0, 0, i, j);
        srfWidth = i;
        srfHeight = j;
        updateTextures = true;
    }

    public void onSurfaceCreated(GL10 gl10, EGLConfig eglconfig)
    {
        Log.i("AddLive_SDK", "GL Details: ==================");
        Log.i("AddLive_SDK", (new StringBuilder("VERSION: ")).append(GLES20.glGetString(7938)).toString());
        Log.i("AddLive_SDK", (new StringBuilder("VENDOR: ")).append(GLES20.glGetString(7936)).toString());
        Log.i("AddLive_SDK", (new StringBuilder("RENDERER: ")).append(GLES20.glGetString(7937)).toString());
        Log.i("AddLive_SDK", (new StringBuilder("EXTENSION: ")).append(GLES20.glGetString(7939)).toString());
        Log.i("AddLive_SDK", "==============================");
        gl10 = IntBuffer.allocate(2);
        GLES20.glGenTextures(2, gl10);
        GLES20.glBindBuffer(34962, gl10.get(0));
        GLES20.glBufferData(34962, 80, vertexBuffer, 35040);
        GLES20.glBindBuffer(34963, gl10.get(1));
        GLES20.glBufferData(34963, 12, indexBuffer, 35044);
        initShaders();
    }

    public void setRadius(float f)
    {
        srfRadius = f;
    }
}
