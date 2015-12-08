// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;

import android.graphics.Bitmap;
import android.opengl.ETC1Util;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import java.nio.ByteBuffer;

// Referenced classes of package com.amobee.pulse3d:
//            RenderResource, Log

class TextureResource extends RenderResource
{
    public static class PixelFormat
    {

        public static final int A8 = 3;
        public static final int AI88 = 5;
        public static final int Default = 0;
        public static final int I8 = 4;
        public static final int PVRTC2 = 9;
        public static final int PVRTC4 = 8;
        public static final int RGB565 = 2;
        public static final int RGB5A1 = 7;
        public static final int RGB888 = 1;
        public static final int RGBA16F = 10;
        public static final int RGBA32F = 11;
        public static final int RGBA4444 = 6;
        public static final int RGBA8888 = 0;

        public PixelFormat()
        {
        }
    }


    static int GL_HALF_FLOAT_OES = 36193;
    static int GL_R16F_EXT = 33325;
    static int GL_RG16F_EXT = 33327;
    static int GL_RGB16F_EXT = 34843;
    static int GL_RGBA16F_EXT = 34842;
    int format_;
    int format_request_;
    Boolean isnpot;
    Object obj;
    int textureTarget_;
    String url;
    int x_;
    int y_;

    TextureResource()
    {
    }

    TextureResource(int i, int j, int k)
    {
        format_ = k;
        x_ = i;
        y_ = j;
        boolean flag;
        if (!IsPowerOf2(x_) || !IsPowerOf2(y_))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        isnpot = Boolean.valueOf(flag);
    }

    static boolean IsPowerOf2(int i)
    {
        return (i - 1 & i) == 0 && i > 0;
    }

    void Activate()
    {
        if (handle != 0)
        {
            return;
        }
        textureTarget_ = 3553;
        int ai[] = new int[1];
        GLES20.glGenTextures(1, ai, 0);
        GLES20.glBindTexture(3553, ai[0]);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        handle = ai[0];
        if (!(obj instanceof Bitmap)) goto _L2; else goto _L1
_L1:
        GLUtils.texImage2D(3553, 0, (Bitmap)obj, 0);
_L8:
        GLES20.glBindTexture(3553, 0);
        return;
_L2:
        if (!(obj instanceof android.opengl.ETC1Util.ETC1Texture)) goto _L4; else goto _L3
_L3:
        ETC1Util.loadTexture(3553, 0, 0, 6407, 33635, (android.opengl.ETC1Util.ETC1Texture)obj);
          goto _L5
_L4:
        if (format_request_ != 10) goto _L7; else goto _L6
_L6:
        ByteBuffer bytebuffer = ByteBuffer.allocateDirect(x_ * y_ * 2 * 4);
        GLES20.glTexImage2D(3553, 0, format_, x_, y_, 0, format_, GL_HALF_FLOAT_OES, bytebuffer);
_L9:
        textureTarget_ = 3553;
        ByteBuffer bytebuffer1;
        boolean flag;
        if (!IsPowerOf2(x_) || !IsPowerOf2(y_))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        isnpot = Boolean.valueOf(flag);
_L5:
        if (true) goto _L8; else goto _L7
_L7:
        if (format_request_ == 11)
        {
            GLES20.glTexImage2D(3553, 0, format_, x_, y_, 0, format_, 5126, null);
        } else
        {
            bytebuffer1 = ByteBuffer.allocateDirect(x_ * y_ * 4);
            GLES20.glTexImage2D(3553, 0, format_, x_, y_, 0, format_, 5121, bytebuffer1);
        }
          goto _L9
    }

    void Bind()
    {
        GLES20.glBindTexture(3553, handle);
    }

    void Deactivate()
    {
        if (handle != 0)
        {
            GLES20.glDeleteTextures(1, new int[] {
                handle
            }, 0);
        }
        handle = 0;
    }

    public void Resize(int i, int j)
    {
        if ((obj instanceof Bitmap) || (obj instanceof android.opengl.ETC1Util.ETC1Texture))
        {
            return;
        }
        Deactivate();
        x_ = i;
        y_ = j;
        boolean flag;
        if (!IsPowerOf2(x_) || !IsPowerOf2(y_))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        isnpot = Boolean.valueOf(flag);
        Activate();
    }

    void Unbind()
    {
        GLES20.glBindTexture(textureTarget_, 0);
        Log.d("GLTexture", (new StringBuilder()).append("UNBinding texture with handle").append(handle).append("type of ").append(obj.getClass().getSimpleName()).toString());
    }

    public void setFormatRequest(int i)
    {
        format_request_ = i;
    }

}
