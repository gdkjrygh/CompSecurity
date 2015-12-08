// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.env.gl;

import android.opengl.GLES20;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;

// Referenced classes of package com.google.android.apps.unveil.env.gl:
//            j

public final class Texture
{

    int a;
    boolean b;
    private final int c;
    private ByteBuffer d;

    private Texture()
    {
        int ai[] = new int[1];
        GLES20.glGenTextures(1, IntBuffer.wrap(ai));
        c = ai[0];
        GLES20.glBindTexture(36197, c);
        GLES20.glTexParameteri(36197, 10241, 9728);
        GLES20.glTexParameteri(36197, 10240, 9728);
        b = true;
    }

    public Texture(int i, int k, Format format)
    {
        int ai[] = new int[1];
        GLES20.glGenTextures(1, IntBuffer.wrap(ai));
        c = ai[0];
        j.a[format.ordinal()];
        JVM INSTR tableswitch 1 2: default 56
    //                   1 98
    //                   2 180;
           goto _L1 _L2 _L3
_L1:
        format = String.valueOf(format);
        throw new IllegalArgumentException((new StringBuilder(String.valueOf(format).length() + 20)).append("Unsupported format: ").append(format).toString());
_L2:
        a = 6409;
        d = ByteBuffer.allocate(i * k);
_L5:
        GLES20.glBindTexture(3553, c);
        GLES20.glTexImage2D(3553, 0, a, i, k, 0, a, 5121, d);
        GLES20.glTexParameteri(3553, 10241, 9728);
        GLES20.glTexParameteri(3553, 10240, 9728);
        b = true;
        return;
_L3:
        a = 6410;
        d = ByteBuffer.allocate(i * k << 1);
        if (true) goto _L5; else goto _L4
_L4:
    }

    public final void a()
    {
        if (b)
        {
            b = false;
            GLES20.glDeleteTextures(1, IntBuffer.wrap(new int[] {
                c
            }));
        }
    }

    public final void a(int i)
    {
        GLES20.glActiveTexture(i);
        GLES20.glBindTexture(3553, c);
    }

    public final void a(ByteBuffer bytebuffer, int i, int k)
    {
        GLES20.glTexSubImage2D(3553, 0, 0, 0, i, k, a, 5121, bytebuffer);
    }

    protected final void finalize()
    {
        a();
        super.finalize();
        return;
        Exception exception;
        exception;
        super.finalize();
        throw exception;
    }

    private class Format extends Enum
    {

        public static final Format LUMINANCE;
        public static final Format LUMINANCE_ALPHA;
        public static final Format RGB;
        public static final Format RGBA;
        private static final Format a[];

        public static Format valueOf(String s)
        {
            return (Format)Enum.valueOf(com/google/android/apps/unveil/env/gl/Texture$Format, s);
        }

        public static Format[] values()
        {
            return (Format[])a.clone();
        }

        static 
        {
            LUMINANCE = new Format("LUMINANCE", 0);
            LUMINANCE_ALPHA = new Format("LUMINANCE_ALPHA", 1);
            RGB = new Format("RGB", 2);
            RGBA = new Format("RGBA", 3);
            a = (new Format[] {
                LUMINANCE, LUMINANCE_ALPHA, RGB, RGBA
            });
        }

        private Format(String s, int i)
        {
            super(s, i);
        }
    }

}
