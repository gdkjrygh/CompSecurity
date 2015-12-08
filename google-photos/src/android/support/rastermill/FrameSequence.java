// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.rastermill;

import android.graphics.Bitmap;
import c;
import java.io.InputStream;
import java.nio.ByteBuffer;

public class FrameSequence
{

    public final int a;
    public final int b;
    public final boolean c;
    public final int d;
    public final int e;
    private final long f;

    private FrameSequence(long l, int i, int j, boolean flag, int k, int i1)
    {
        f = l;
        a = i;
        b = j;
        c = flag;
        d = k;
        e = i1;
    }

    public static long a(long l, int i, Bitmap bitmap, int j)
    {
        return nativeGetFrame(l, i, bitmap, j);
    }

    public static FrameSequence a(ByteBuffer bytebuffer)
    {
        if (bytebuffer == null)
        {
            throw new IllegalArgumentException();
        }
        if (!bytebuffer.isDirect())
        {
            if (bytebuffer.hasArray())
            {
                byte abyte0[] = bytebuffer.array();
                int i = bytebuffer.position();
                int j = bytebuffer.remaining();
                if (abyte0 == null)
                {
                    throw new IllegalArgumentException();
                }
                if (i < 0 || j < 0 || i + j > abyte0.length)
                {
                    throw new IllegalArgumentException("invalid offset/length parameters");
                } else
                {
                    return nativeDecodeByteArray(abyte0, i, j);
                }
            } else
            {
                throw new IllegalArgumentException("Cannot have non-direct ByteBuffer with no byte array");
            }
        } else
        {
            return nativeDecodeByteBuffer(bytebuffer, bytebuffer.position(), bytebuffer.remaining());
        }
    }

    public static void a(long l)
    {
        nativeDestroyState(l);
    }

    private static native long nativeCreateState(long l);

    private static native FrameSequence nativeDecodeByteArray(byte abyte0[], int i, int j);

    private static native FrameSequence nativeDecodeByteBuffer(ByteBuffer bytebuffer, int i, int j);

    private static native FrameSequence nativeDecodeStream(InputStream inputstream, byte abyte0[]);

    private static native void nativeDestroyFrameSequence(long l);

    private static native void nativeDestroyState(long l);

    private static native long nativeGetFrame(long l, int i, Bitmap bitmap, int j);

    public final c a()
    {
        if (f == 0L)
        {
            throw new IllegalStateException("attempted to use incorrectly built FrameSequence");
        }
        long l = nativeCreateState(f);
        if (l == 0L)
        {
            return null;
        } else
        {
            return new c(l);
        }
    }

    protected void finalize()
    {
        if (f != 0L)
        {
            nativeDestroyFrameSequence(f);
        }
        super.finalize();
        return;
        Exception exception;
        exception;
        super.finalize();
        throw exception;
    }

    static 
    {
        System.loadLibrary("framesequence");
    }
}
