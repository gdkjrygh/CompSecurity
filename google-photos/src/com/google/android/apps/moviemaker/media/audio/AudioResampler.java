// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.moviemaker.media.audio;

import b;
import c;
import ded;
import java.nio.ByteBuffer;

public class AudioResampler
    implements ded
{

    private static final float f = (float)(Math.sqrt(2D) / 2D);
    public final int a;
    public final int b;
    public final int c;
    public final boolean d;
    public int e;
    private final ByteBuffer g;
    private boolean h;

    private AudioResampler(int i, int j, int k, boolean flag)
    {
        boolean flag2 = true;
        super();
        e = -1;
        b.a(true, "Only 8-bit and 16-bit PCM samples are supported");
        a = 2;
        boolean flag1 = flag2;
        if (j != 1)
        {
            if (j == 2)
            {
                flag1 = flag2;
            } else
            {
                flag1 = false;
            }
        }
        b.a(flag1, "Only mono and stereo are supported");
        b = j;
        c = b.a(k, "targetSampleRateHz");
        d = flag;
        g = ByteBuffer.allocateDirect(getNativeResamplerContextSize());
        createNativeResampler(g, 2, j, k, flag);
        a(1.0F, 1.0F);
    }

    public AudioResampler(int i, int j, boolean flag)
    {
        this(2, i, 44100, true);
    }

    private native void createNativeResampler(ByteBuffer bytebuffer, int i, int j, int k, boolean flag);

    private native int getNativeResamplerContextSize();

    private native void releaseNativeResampler(ByteBuffer bytebuffer);

    private native void resampleFromByteBuffer(ByteBuffer bytebuffer, ByteBuffer bytebuffer1, int i, int j, byte abyte0[], int k, boolean flag);

    private native void setSourceSampleRate(ByteBuffer bytebuffer, int i);

    private native void setVolume(ByteBuffer bytebuffer, float f1, float f2);

    public final int a(byte abyte0[], ByteBuffer bytebuffer, int i, int j, boolean flag)
    {
        boolean flag2 = true;
        if (j == 0)
        {
            return 0;
        }
        int k = bytebuffer.capacity();
        int l;
        boolean flag1;
        if (!h)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        c.a(flag1, "resampler must not be released");
        c.b(e, "mSourceSampleRateHz", -1, "source sample rate must be set before calling resample()");
        b.a(j, "sourceSizeBytes", null);
        if (i + j <= k)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        b.a(flag1, "sourceOffsetBytes + sourceSizeBytes must be less or equal to source capacity");
        b.a(bytebuffer.isDirect(), "sourceSamples must be a direct ByteBuffer");
        j = b(j);
        k = c(j);
        l = d(k);
        if (abyte0.length >= l)
        {
            flag1 = flag2;
        } else
        {
            flag1 = false;
        }
        b.a(flag1, "the size of result must be at least getResampledByteCount()");
        resampleFromByteBuffer(g, bytebuffer, i, j * b, abyte0, k, flag);
        return l;
    }

    public final void a()
    {
        if (!h)
        {
            releaseNativeResampler(g);
            h = true;
        }
    }

    public final void a(float f1, float f2)
    {
        float f4 = f1;
        float f3 = f2;
        if (b == 1)
        {
            f4 = f1;
            f3 = f2;
            if (d)
            {
                f4 = f1 * f;
                f3 = f2 * f;
            }
        }
        setVolume(g, f4, f3);
    }

    public final void a(int i)
    {
        e = b.a(i, "sourceSampleRateHz");
        setSourceSampleRate(g, i);
    }

    public int b(int i)
    {
        return i / (a * b);
    }

    public int c(int i)
    {
        return (c * i) / e;
    }

    public int d(int i)
    {
        int k = a;
        int j;
        if (d)
        {
            j = 2;
        } else
        {
            j = b;
        }
        return j * (i * k);
    }

    static 
    {
        com/google/android/apps/moviemaker/media/audio/AudioResampler.getSimpleName();
        System.loadLibrary("moviemaker-jni");
    }
}
