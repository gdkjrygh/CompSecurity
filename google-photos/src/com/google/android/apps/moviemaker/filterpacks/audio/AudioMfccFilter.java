// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.moviemaker.filterpacks.audio;

import ahn;
import ahs;
import ahu;
import aif;
import aig;
import ajo;
import ajr;
import aju;
import ajw;
import akd;
import b;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.List;

public class AudioMfccFilter extends ahn
{

    private static final int BYTES_PER_SAMPLE = 2;
    private static final int FFT_SIZE = 512;
    private static final int FFT_STEP_SIZE = 256;
    private static final int SAMPLE_BUFFER_SIZE = 4000;
    private static final float SECOND_IN_NS = 1E+09F;
    private static final int TARGET_SAMPLE_RATE_HZ = 16000;
    private int mDownsampleFactor;
    private int mNanosPerFrame;
    private final List mOutputTimestampQueue = new ArrayList();
    private final List mOutputValueQueue = new ArrayList();
    private short mSampleBuffer[];
    private int mSampleRate;

    public AudioMfccFilter(ajr ajr, String s)
    {
        super(ajr, s);
        mSampleBuffer = new short[4000];
        super.mMinimumAvailableInputs = 0;
    }

    private native void close();

    private native void init(int i);

    private native float[][] process(short aword0[], int i);

    public final ajw b()
    {
        aif aif1 = aif.a(akd);
        aif aif2 = aif.b(200);
        return (new ajw()).a("audio", 2, aif1).b("mfcc", 2, aif2).a();
    }

    protected final void e()
    {
        ajo ajo1 = a("audio");
        if (ajo1.b())
        {
            ahs ahs1 = ajo1.a();
            akd akd1 = (akd)ahs1.d().m();
            if (mSampleRate != akd1.a)
            {
                int i = akd1.a;
                int i1;
                int j1;
                boolean flag;
                if (i > 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                b.a(flag, "sampleRate must be >0");
                if (mSampleRate != 0)
                {
                    close();
                }
                mSampleRate = i;
                mDownsampleFactor = Math.max(1, i / 16000);
                init(i / mDownsampleFactor);
            }
            if (mOutputTimestampQueue.isEmpty())
            {
                mOutputTimestampQueue.add(Long.valueOf(ahs1.c()));
            }
            i1 = 0;
            int l1;
            for (int j = akd1.c.length / 2 / akd1.b / mDownsampleFactor; j > 0; j -= l1)
            {
                l1 = Math.min(j, mSampleBuffer.length);
                int i2 = akd1.b * mDownsampleFactor;
                for (int k = 0; k < l1; k++)
                {
                    int k1 = 0;
                    for (j1 = 0; j1 < i2; j1++)
                    {
                        k1 += b.a(akd1.c, i1, 2);
                        i1 += 2;
                    }

                    mSampleBuffer[k] = (short)(k1 / i2);
                }

                float af1[][] = process(mSampleBuffer, l1);
                if (af1 == null)
                {
                    continue;
                }
                for (int l = 0; l < af1.length; l++)
                {
                    mOutputValueQueue.add(af1[l]);
                    long l2 = ahs1.c();
                    float f = ((1E+09F / (float)mSampleRate) * (float)mDownsampleFactor * 512F) / 2.0F;
                    mOutputTimestampQueue.add(Long.valueOf(l2 + (long)((float)(l + 1) * f)));
                }

            }

        }
        if (!mOutputValueQueue.isEmpty())
        {
            float af[] = (float[])mOutputValueQueue.remove(0);
            aju aju1 = b("mfcc");
            ahu ahu1 = aju1.a(new int[] {
                1, af.length
            }).g();
            ByteBuffer bytebuffer = ahu1.a(2);
            bytebuffer.order(ByteOrder.nativeOrder());
            bytebuffer.asFloatBuffer().put(af);
            ahu1.k();
            ahu1.a(((Long)mOutputTimestampQueue.remove(0)).longValue());
            aju1.a(ahu1);
        }
        ajo1.f = mOutputValueQueue.isEmpty();
    }

    protected final void g()
    {
        if (mSampleRate != 0)
        {
            mSampleRate = 0;
            close();
        }
    }

    static 
    {
        System.loadLibrary("moviemaker-jni");
    }
}
