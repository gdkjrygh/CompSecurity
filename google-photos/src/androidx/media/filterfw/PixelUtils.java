// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package androidx.media.filterfw;

import java.nio.ByteBuffer;

public class PixelUtils
{

    public static void a(ByteBuffer bytebuffer, ByteBuffer bytebuffer1, int i, int j, int k, int l, int i1)
    {
        if (bytebuffer.remaining() != bytebuffer1.remaining())
        {
            throw new IllegalArgumentException("Input and output buffers must have the same size!");
        }
        if (bytebuffer.remaining() % 4 != 0)
        {
            throw new IllegalArgumentException("Input buffer size must be a multiple of 4!");
        }
        if (bytebuffer1.remaining() % 4 != 0)
        {
            throw new IllegalArgumentException("Output buffer size must be a multiple of 4!");
        }
        if (i * j << 2 != bytebuffer.remaining())
        {
            throw new IllegalArgumentException("Input buffer size does not match given dimensions!");
        }
        if (i * j << 2 != bytebuffer1.remaining())
        {
            throw new IllegalArgumentException("Output buffer size does not match given dimensions!");
        } else
        {
            nativeCopyPixels(bytebuffer, bytebuffer1, i, j, k, l, i1);
            return;
        }
    }

    private static native void nativeCopyPixels(ByteBuffer bytebuffer, ByteBuffer bytebuffer1, int i, int j, int k, int l, int i1);

    static 
    {
        System.loadLibrary("filterframework_jni");
    }
}
