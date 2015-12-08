// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package jp.co.cyberagent.android.gpuimage;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.PointF;
import android.opengl.GLES20;
import java.io.InputStream;
import java.nio.FloatBuffer;
import java.util.LinkedList;
import java.util.Scanner;

// Referenced classes of package jp.co.cyberagent.android.gpuimage:
//            OpenGlUtils

public class GPUImageFilter
{

    public static final String NO_FILTER_FRAGMENT_SHADER = "varying highp vec2 textureCoordinate;\n \nuniform sampler2D inputImageTexture;\n \nvoid main()\n{\n     gl_FragColor = texture2D(inputImageTexture, textureCoordinate);\n}";
    public static final String NO_FILTER_VERTEX_SHADER = "attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n}";
    protected static int mSrcTexId;
    protected static int mSrcThumbnailTexId;
    protected boolean isCameraRender;
    protected boolean isDarkCorner;
    protected boolean isUseSrcTex;
    private final String mFragmentShader;
    protected int mGLAttribPosition;
    protected int mGLAttribTextureCoordinate;
    protected int mGLProgId;
    protected int mGLUniformTexture;
    private boolean mIsInitialized;
    protected int mOutputHeight;
    protected int mOutputWidth;
    private final LinkedList mRunOnDraw;
    protected boolean mUseSrcTex;
    private final String mVertexShader;

    public GPUImageFilter()
    {
        this("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n}", "varying highp vec2 textureCoordinate;\n \nuniform sampler2D inputImageTexture;\n \nvoid main()\n{\n     gl_FragColor = texture2D(inputImageTexture, textureCoordinate);\n}");
    }

    public GPUImageFilter(String s, String s1)
    {
        isDarkCorner = false;
        isCameraRender = false;
        mRunOnDraw = new LinkedList();
        mVertexShader = s;
        mFragmentShader = s1;
    }

    public static String convertStreamToString(InputStream inputstream)
    {
        inputstream = (new Scanner(inputstream)).useDelimiter("\\A");
        if (inputstream.hasNext())
        {
            return inputstream.next();
        } else
        {
            return "";
        }
    }

    public static String loadShader(String s, Context context)
    {
        try
        {
            s = context.getAssets().open(s);
            context = convertStreamToString(s);
            s.close();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return "";
        }
        return context;
    }

    public final void destroy()
    {
        mIsInitialized = false;
        GLES20.glDeleteProgram(mGLProgId);
        onDestroy();
    }

    public int getAttribPosition()
    {
        return mGLAttribPosition;
    }

    public int getAttribTextureCoordinate()
    {
        return mGLAttribTextureCoordinate;
    }

    public int getOutputHeight()
    {
        return mOutputHeight;
    }

    public int getOutputWidth()
    {
        return mOutputWidth;
    }

    public int getProgram()
    {
        return mGLProgId;
    }

    public int getUniformTexture()
    {
        return mGLUniformTexture;
    }

    public final void init()
    {
        onInit();
        mIsInitialized = true;
        onInitialized();
    }

    public boolean isInitialized()
    {
        return mIsInitialized;
    }

    public void onDestroy()
    {
    }

    public void onDraw(int i, FloatBuffer floatbuffer, FloatBuffer floatbuffer1)
    {
        GLES20.glUseProgram(mGLProgId);
        runPendingOnDrawTasks();
        if (!mIsInitialized)
        {
            return;
        }
        floatbuffer.position(0);
        GLES20.glVertexAttribPointer(mGLAttribPosition, 2, 5126, false, 0, floatbuffer);
        GLES20.glEnableVertexAttribArray(mGLAttribPosition);
        floatbuffer1.position(0);
        GLES20.glVertexAttribPointer(mGLAttribTextureCoordinate, 2, 5126, false, 0, floatbuffer1);
        GLES20.glEnableVertexAttribArray(mGLAttribTextureCoordinate);
        if (i != -1)
        {
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, i);
            GLES20.glUniform1i(mGLUniformTexture, 0);
        }
        onDrawArraysPre();
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glDisableVertexAttribArray(mGLAttribPosition);
        GLES20.glDisableVertexAttribArray(mGLAttribTextureCoordinate);
        GLES20.glBindTexture(3553, 0);
    }

    protected void onDrawArraysPre()
    {
    }

    public void onInit()
    {
        mGLProgId = OpenGlUtils.loadProgram(mVertexShader, mFragmentShader);
        mGLAttribPosition = GLES20.glGetAttribLocation(mGLProgId, "position");
        mGLUniformTexture = GLES20.glGetUniformLocation(mGLProgId, "inputImageTexture");
        mGLAttribTextureCoordinate = GLES20.glGetAttribLocation(mGLProgId, "inputTextureCoordinate");
        mIsInitialized = true;
    }

    public void onInitialized()
    {
    }

    public void onOutputSizeChanged(int i, int j)
    {
        mOutputWidth = i;
        mOutputHeight = j;
    }

    protected void runOnDraw(Runnable runnable)
    {
        synchronized (mRunOnDraw)
        {
            mRunOnDraw.addLast(runnable);
        }
        return;
        runnable;
        linkedlist;
        JVM INSTR monitorexit ;
        throw runnable;
    }

    protected void runPendingOnDrawTasks()
    {
        LinkedList linkedlist = mRunOnDraw;
        linkedlist;
        JVM INSTR monitorenter ;
        for (; !mRunOnDraw.isEmpty(); ((Runnable)mRunOnDraw.removeFirst()).run()) { }
        break MISSING_BLOCK_LABEL_40;
        Exception exception;
        exception;
        linkedlist;
        JVM INSTR monitorexit ;
        throw exception;
        linkedlist;
        JVM INSTR monitorexit ;
    }

    public void setDarkCorner(boolean flag)
    {
        isDarkCorner = flag;
        isCameraRender = true;
    }

    protected void setFloat(final int location, final float floatValue)
    {
        runOnDraw(new _cls2());
    }

    protected void setFloatArray(final int location, final float arrayValue[])
    {
        runOnDraw(new _cls6());
    }

    protected void setFloatVec2(final int location, final float arrayValue[])
    {
        runOnDraw(new _cls3());
    }

    protected void setFloatVec3(final int location, final float arrayValue[])
    {
        runOnDraw(new _cls4());
    }

    protected void setFloatVec4(final int location, final float arrayValue[])
    {
        runOnDraw(new _cls5());
    }

    protected void setInteger(final int location, final int intValue)
    {
        runOnDraw(new _cls1());
    }

    protected void setPoint(final int location, final PointF point)
    {
        runOnDraw(new _cls7());
    }

    protected void setUniformMatrix3f(final int location, final float matrix[])
    {
        runOnDraw(new _cls8());
    }

    protected void setUniformMatrix4f(final int location, final float matrix[])
    {
        runOnDraw(new _cls9());
    }

    private class _cls2
        implements Runnable
    {

        final GPUImageFilter this$0;
        final float val$floatValue;
        final int val$location;

        public void run()
        {
            GLES20.glUniform1f(location, floatValue);
        }

        _cls2()
        {
            this$0 = GPUImageFilter.this;
            location = i;
            floatValue = f;
            super();
        }
    }


    private class _cls6
        implements Runnable
    {

        final GPUImageFilter this$0;
        final float val$arrayValue[];
        final int val$location;

        public void run()
        {
            GLES20.glUniform1fv(location, arrayValue.length, FloatBuffer.wrap(arrayValue));
        }

        _cls6()
        {
            this$0 = GPUImageFilter.this;
            location = i;
            arrayValue = af;
            super();
        }
    }


    private class _cls3
        implements Runnable
    {

        final GPUImageFilter this$0;
        final float val$arrayValue[];
        final int val$location;

        public void run()
        {
            GLES20.glUniform2fv(location, 1, FloatBuffer.wrap(arrayValue));
        }

        _cls3()
        {
            this$0 = GPUImageFilter.this;
            location = i;
            arrayValue = af;
            super();
        }
    }


    private class _cls4
        implements Runnable
    {

        final GPUImageFilter this$0;
        final float val$arrayValue[];
        final int val$location;

        public void run()
        {
            GLES20.glUniform3fv(location, 1, FloatBuffer.wrap(arrayValue));
        }

        _cls4()
        {
            this$0 = GPUImageFilter.this;
            location = i;
            arrayValue = af;
            super();
        }
    }


    private class _cls5
        implements Runnable
    {

        final GPUImageFilter this$0;
        final float val$arrayValue[];
        final int val$location;

        public void run()
        {
            GLES20.glUniform4fv(location, 1, FloatBuffer.wrap(arrayValue));
        }

        _cls5()
        {
            this$0 = GPUImageFilter.this;
            location = i;
            arrayValue = af;
            super();
        }
    }


    private class _cls1
        implements Runnable
    {

        final GPUImageFilter this$0;
        final int val$intValue;
        final int val$location;

        public void run()
        {
            GLES20.glUniform1i(location, intValue);
        }

        _cls1()
        {
            this$0 = GPUImageFilter.this;
            location = i;
            intValue = j;
            super();
        }
    }


    private class _cls7
        implements Runnable
    {

        final GPUImageFilter this$0;
        final int val$location;
        final PointF val$point;

        public void run()
        {
            float f = point.x;
            float f1 = point.y;
            GLES20.glUniform2fv(location, 1, new float[] {
                f, f1
            }, 0);
        }

        _cls7()
        {
            this$0 = GPUImageFilter.this;
            point = pointf;
            location = i;
            super();
        }
    }


    private class _cls8
        implements Runnable
    {

        final GPUImageFilter this$0;
        final int val$location;
        final float val$matrix[];

        public void run()
        {
            GLES20.glUniformMatrix3fv(location, 1, false, matrix, 0);
        }

        _cls8()
        {
            this$0 = GPUImageFilter.this;
            location = i;
            matrix = af;
            super();
        }
    }


    private class _cls9
        implements Runnable
    {

        final GPUImageFilter this$0;
        final int val$location;
        final float val$matrix[];

        public void run()
        {
            GLES20.glUniformMatrix4fv(location, 1, false, matrix, 0);
        }

        _cls9()
        {
            this$0 = GPUImageFilter.this;
            location = i;
            matrix = af;
            super();
        }
    }

}
