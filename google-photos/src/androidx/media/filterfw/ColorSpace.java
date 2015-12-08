// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package androidx.media.filterfw;

import java.nio.ByteBuffer;

public class ColorSpace
{

    private static void a(ByteBuffer bytebuffer, int i)
    {
        if (bytebuffer.remaining() < i)
        {
            String s = String.valueOf("Input buffer's size does not fit given width and height! Expected: ");
            int j = bytebuffer.remaining();
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(s).length() + 30)).append(s).append(i).append(", Got: ").append(j).append(".").toString());
        } else
        {
            return;
        }
    }

    public static void a(ByteBuffer bytebuffer, ByteBuffer bytebuffer1, int i, int j)
    {
        a(bytebuffer, i * j << 2);
        b(bytebuffer1, i * j << 2);
        nativeRgba8888ToHsva8888(bytebuffer, bytebuffer1, i, j);
    }

    public static void a(ByteBuffer bytebuffer, ByteBuffer bytebuffer1, int i, int j, int k)
    {
        a(bytebuffer, (k * 3 * j) / 2);
        b(bytebuffer1, i * j << 2);
        nativeYuv420pToRgba8888(bytebuffer, bytebuffer1, i, j, k);
    }

    public static void a(ByteBuffer bytebuffer, ByteBuffer bytebuffer1, int i, int j, int k, int l, int i1, int j1)
    {
        a(bytebuffer, i * j << 2);
        b(bytebuffer1, ((i1 + 1) - k) * ((j1 + 1) - l) << 2);
        nativeCropRgbaImage(bytebuffer, bytebuffer1, i, j, k, l, i1, j1);
    }

    private static void b(ByteBuffer bytebuffer, int i)
    {
        if (bytebuffer.remaining() < i)
        {
            String s = String.valueOf("Output buffer's size does not fit given width and height! Expected: ");
            int j = bytebuffer.remaining();
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(s).length() + 30)).append(s).append(i).append(", Got: ").append(j).append(".").toString());
        } else
        {
            return;
        }
    }

    public static void b(ByteBuffer bytebuffer, ByteBuffer bytebuffer1, int i, int j)
    {
        a(bytebuffer, i * j << 2);
        b(bytebuffer1, i * j << 2);
        nativeRgba8888ToYcbcra8888(bytebuffer, bytebuffer1, i, j);
    }

    public static void b(ByteBuffer bytebuffer, ByteBuffer bytebuffer1, int i, int j, int k)
    {
        a(bytebuffer, k * j);
        b(bytebuffer1, i * j << 2);
        nativeArgb8888ToRgba8888(bytebuffer, bytebuffer1, i, j, k);
    }

    public static void c(ByteBuffer bytebuffer, ByteBuffer bytebuffer1, int i, int j)
    {
        a(bytebuffer, i * j << 2);
        b(bytebuffer1, i * j << 2);
        nativeRgba8888ToGray8888(bytebuffer, bytebuffer1, i, j);
    }

    private static native void nativeArgb8888ToRgba8888(ByteBuffer bytebuffer, ByteBuffer bytebuffer1, int i, int j, int k);

    private static native void nativeCropRgbaImage(ByteBuffer bytebuffer, ByteBuffer bytebuffer1, int i, int j, int k, int l, int i1, int j1);

    private static native void nativeRgba8888ToGray8888(ByteBuffer bytebuffer, ByteBuffer bytebuffer1, int i, int j);

    private static native void nativeRgba8888ToHsva8888(ByteBuffer bytebuffer, ByteBuffer bytebuffer1, int i, int j);

    private static native void nativeRgba8888ToYcbcra8888(ByteBuffer bytebuffer, ByteBuffer bytebuffer1, int i, int j);

    private static native void nativeYuv420pToRgba8888(ByteBuffer bytebuffer, ByteBuffer bytebuffer1, int i, int j, int k);

    static 
    {
        System.loadLibrary("filterframework_jni");
    }
}
