// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.moviemaker.filterpacks.audio;

import ahn;
import ahs;
import aif;
import aig;
import ajo;
import ajr;
import aju;
import ajw;
import akd;
import b;
import java.util.ArrayList;
import java.util.List;

public class AudioRmsFilter extends ahn
{

    private static final int BYTES_PER_SAMPLE = 2;
    private static final float RMS_INTERVAL_SECONDS = 0.1F;
    private static final float SECOND_IN_NS = 1E+09F;
    private final List mOutputTimestampQueue = new ArrayList();
    private int mPeakAmplitude;
    private final List mPeakAmplitudeValueQueue = new ArrayList();
    private final List mRmsValueQueue = new ArrayList();
    private int mSampleCount;
    private float mSampleSquaredSum;

    public AudioRmsFilter(ajr ajr, String s)
    {
        super(ajr, s);
        mSampleCount = 0;
        mSampleSquaredSum = 0.0F;
        mPeakAmplitude = 0;
        super.mMinimumAvailableInputs = 0;
    }

    public final ajw b()
    {
        aif aif1 = aif.a(akd);
        aif aif2 = aif.a(Float.TYPE);
        aif aif3 = aif.a(Integer.TYPE);
        return (new ajw()).a("audio", 2, aif1).b("rms", 2, aif2).b("peakAmplitude", 2, aif3).a();
    }

    protected final void e()
    {
        ajo ajo1 = a("audio");
        if (ajo1.b())
        {
            ahs ahs1 = ajo1.a();
            akd akd1 = (akd)ahs1.d().m();
            if (mOutputTimestampQueue.isEmpty())
            {
                mOutputTimestampQueue.add(Long.valueOf(ahs1.c()));
            }
            int j = (int)((float)akd1.a * 0.1F * (float)akd1.b);
            for (int i = 0; i <= akd1.c.length - 2; i += 2)
            {
                int k = b.a(akd1.c, i, 2);
                mSampleSquaredSum = mSampleSquaredSum + (float)(k * k);
                mSampleCount = mSampleCount + 1;
                k = Math.abs(k);
                if (k > mPeakAmplitude)
                {
                    mPeakAmplitude = k;
                }
                if (mSampleCount >= j)
                {
                    mRmsValueQueue.add(Float.valueOf((float)Math.sqrt(mSampleSquaredSum / (float)mSampleCount)));
                    mPeakAmplitudeValueQueue.add(Integer.valueOf(mPeakAmplitude));
                    mSampleCount = 0;
                    mSampleSquaredSum = 0.0F;
                    mPeakAmplitude = 0;
                    long l = ahs1.c();
                    float f = 1E+09F / (float)akd1.a / 2.0F / (float)akd1.b;
                    mOutputTimestampQueue.add(Long.valueOf(l + (long)(f * (float)(i + 2))));
                }
            }

        }
        if (!mRmsValueQueue.isEmpty())
        {
            long l1 = ((Long)mOutputTimestampQueue.remove(0)).longValue();
            aju aju1 = b("rms");
            aig aig1 = aju1.a(null).d();
            aig1.a(mRmsValueQueue.remove(0));
            aig1.a(l1);
            aju1.a(aig1);
            aju1 = b("peakAmplitude");
            aig1 = aju1.a(null).d();
            aig1.a(mPeakAmplitudeValueQueue.remove(0));
            aig1.a(l1);
            aju1.a(aig1);
        }
        ajo1.f = mRmsValueQueue.isEmpty();
    }
}
