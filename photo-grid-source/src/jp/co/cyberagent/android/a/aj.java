// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package jp.co.cyberagent.android.a;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import jp.co.cyberagent.android.a.a.a;

// Referenced classes of package jp.co.cyberagent.android.a:
//            h, an, ak

public class aj extends h
{

    public int A;
    public int B;
    private Bitmap C;
    private ByteBuffer y;
    public int z;

    public aj(String s)
    {
        this("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\nattribute vec4 inputTextureCoordinate2;\n \nvarying vec2 textureCoordinate;\nvarying vec2 textureCoordinate2;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n    textureCoordinate2 = inputTextureCoordinate2.xy;\n}", s);
    }

    private aj(String s, String s1)
    {
        super(s, s1);
        B = -1;
        s = jp.co.cyberagent.android.a.a.a.a(jp.co.cyberagent.android.a.an.a, false, false);
        s1 = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder());
        FloatBuffer floatbuffer = s1.asFloatBuffer();
        floatbuffer.put(s);
        floatbuffer.flip();
        y = s1;
    }

    protected void a()
    {
        GLES20.glEnableVertexAttribArray(z);
        GLES20.glActiveTexture(33987);
        GLES20.glBindTexture(3553, B);
        GLES20.glUniform1i(A, 3);
        y.position(0);
        GLES20.glVertexAttribPointer(z, 2, 5126, false, 0, y);
    }

    public final void a(Bitmap bitmap)
    {
        if (bitmap == null || !bitmap.isRecycled())
        {
            C = bitmap;
            if (C != null)
            {
                a(((Runnable) (new ak(this, bitmap))));
                return;
            }
        }
    }

    public void c()
    {
        super.c();
        z = GLES20.glGetAttribLocation(p(), "inputTextureCoordinate2");
        A = GLES20.glGetUniformLocation(p(), "inputImageTexture2");
        GLES20.glEnableVertexAttribArray(z);
        if (C != null && !C.isRecycled())
        {
            a(C);
        }
    }

    public final void e()
    {
        super.e();
        if (B != -1)
        {
            B = -1;
        }
    }
}
