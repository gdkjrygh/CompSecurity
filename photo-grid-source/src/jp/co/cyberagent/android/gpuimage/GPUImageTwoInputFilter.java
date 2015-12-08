// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package jp.co.cyberagent.android.gpuimage;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import jp.co.cyberagent.android.gpuimage.util.TextureRotationUtil;

// Referenced classes of package jp.co.cyberagent.android.gpuimage:
//            GPUImageFilter, Rotation

public class GPUImageTwoInputFilter extends GPUImageFilter
{

    private static final String VERTEX_SHADER = "attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\nattribute vec4 inputTextureCoordinate2;\n \nvarying vec2 textureCoordinate;\nvarying vec2 textureCoordinate2;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n    textureCoordinate2 = inputTextureCoordinate2.xy;\n}";
    private Bitmap mBitmap;
    public int mFilterInputTextureUniform2;
    public int mFilterSecondTextureCoordinateAttribute;
    public int mFilterSourceTexture2;
    private ByteBuffer mTexture2CoordinatesBuffer;

    public GPUImageTwoInputFilter(String s)
    {
        this("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\nattribute vec4 inputTextureCoordinate2;\n \nvarying vec2 textureCoordinate;\nvarying vec2 textureCoordinate2;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n    textureCoordinate2 = inputTextureCoordinate2.xy;\n}", s);
    }

    public GPUImageTwoInputFilter(String s, String s1)
    {
        super(s, s1);
        mFilterSourceTexture2 = -1;
        setRotation(Rotation.NORMAL, false, false);
    }

    public Bitmap getBitmap()
    {
        return mBitmap;
    }

    public void onDestroy()
    {
        super.onDestroy();
        if (mFilterSourceTexture2 != mSrcTexId && !mUseSrcTex)
        {
            GLES20.glDeleteTextures(1, new int[] {
                mFilterSourceTexture2
            }, 0);
            mFilterSourceTexture2 = -1;
        }
    }

    protected void onDrawArraysPre()
    {
        GLES20.glEnableVertexAttribArray(mFilterSecondTextureCoordinateAttribute);
        GLES20.glActiveTexture(33987);
        if (mUseSrcTex)
        {
            int i;
            if (isUseSrcTex)
            {
                i = mSrcTexId;
            } else
            {
                i = mSrcThumbnailTexId;
            }
            GLES20.glBindTexture(3553, i);
        } else
        {
            GLES20.glBindTexture(3553, mFilterSourceTexture2);
        }
        GLES20.glUniform1i(mFilterInputTextureUniform2, 3);
        mTexture2CoordinatesBuffer.position(0);
        GLES20.glVertexAttribPointer(mFilterSecondTextureCoordinateAttribute, 2, 5126, false, 0, mTexture2CoordinatesBuffer);
    }

    public void onInit()
    {
        super.onInit();
        mFilterSecondTextureCoordinateAttribute = GLES20.glGetAttribLocation(getProgram(), "inputTextureCoordinate2");
        mFilterInputTextureUniform2 = GLES20.glGetUniformLocation(getProgram(), "inputImageTexture2");
        GLES20.glEnableVertexAttribArray(mFilterSecondTextureCoordinateAttribute);
        if (mBitmap != null && !mBitmap.isRecycled())
        {
            setBitmap(mBitmap);
        }
    }

    public void recycleBitmap()
    {
        if (mBitmap != null && !mBitmap.isRecycled())
        {
            mBitmap.recycle();
            mBitmap = null;
        }
    }

    public void setBitmap(final Bitmap bitmap)
    {
        if (bitmap == null || !bitmap.isRecycled())
        {
            mBitmap = bitmap;
            if (mBitmap != null)
            {
                runOnDraw(new _cls1());
                return;
            }
        }
    }

    public void setRotation(Rotation rotation, boolean flag, boolean flag1)
    {
        rotation = TextureRotationUtil.getRotation(rotation, flag, flag1);
        ByteBuffer bytebuffer = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder());
        FloatBuffer floatbuffer = bytebuffer.asFloatBuffer();
        floatbuffer.put(rotation);
        floatbuffer.flip();
        mTexture2CoordinatesBuffer = bytebuffer;
    }

    public void setTexture(int i)
    {
        GLES20.glActiveTexture(33987);
        mFilterSourceTexture2 = i;
    }

    private class _cls1
        implements Runnable
    {

        final GPUImageTwoInputFilter this$0;
        final Bitmap val$bitmap;

        public void run()
        {
            if (mFilterSourceTexture2 != -1 || bitmap == null || bitmap.isRecycled())
            {
                return;
            } else
            {
                GLES20.glActiveTexture(33987);
                mFilterSourceTexture2 = OpenGlUtils.loadTexture(bitmap, -1, true);
                return;
            }
        }

        _cls1()
        {
            this$0 = GPUImageTwoInputFilter.this;
            bitmap = bitmap1;
            super();
        }
    }

}
