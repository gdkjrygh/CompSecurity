// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.moviemaker.filterpacks.audio;

import ahn;
import ahs;
import ahu;
import aif;
import ajo;
import ajr;
import aju;
import ajw;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;

public class DeltaMfccFilter extends ahn
{

    private static final int FEATURE_BUFFER_SIZE = 5;
    private static final int FRAME_BUFFER_SIZE = 2;
    private static final String TAG = com/google/android/apps/moviemaker/filterpacks/audio/DeltaMfccFilter.getSimpleName();
    private final ArrayList mFeatureBuffer = new ArrayList();
    private int mMfccDim;
    private final ArrayDeque mTimestampBuffer = new ArrayDeque();

    public DeltaMfccFilter(ajr ajr, String s)
    {
        super(ajr, s);
        mMfccDim = 0;
    }

    private ahu a(ahu ahu1)
    {
        float af[];
        Object obj;
        if (mFeatureBuffer.size() < 5)
        {
            af = new float[mMfccDim];
        } else
        {
            af = (float[])mFeatureBuffer.remove(0);
        }
        obj = ahu1.a(1);
        ((ByteBuffer) (obj)).order(ByteOrder.nativeOrder());
        obj = ((ByteBuffer) (obj)).asFloatBuffer();
        ((FloatBuffer) (obj)).rewind();
        for (int i = 0; i < mMfccDim; i++)
        {
            af[i] = ((FloatBuffer) (obj)).get(i);
        }

        ahu1.k();
        mFeatureBuffer.add(af);
        if (mFeatureBuffer.size() == 5)
        {
            ahu1 = new float[mMfccDim];
            int j = 1;
            int l = 0;
            do
            {
                int i1 = j;
                if (i1 > 2)
                {
                    break;
                }
                float af1[] = (float[])mFeatureBuffer.get(2 - i1);
                float af2[] = (float[])mFeatureBuffer.get(i1 + 2);
                for (j = 0; j < mMfccDim; j++)
                {
                    ahu1[j] = ahu1[j] + (af2[j] - af1[j]) * (float)i1;
                }

                j = i1 + 1;
                l += i1 * 2 * i1;
            } while (true);
            for (int k = 0; k < mMfccDim; k++)
            {
                ahu1[k] = ahu1[k] / (float)l;
            }

            ahu ahu2 = b("delta").a(new int[] {
                1, mMfccDim
            }).g();
            ByteBuffer bytebuffer = ahu2.a(2);
            bytebuffer.order(ByteOrder.nativeOrder());
            bytebuffer.asFloatBuffer().put(ahu1);
            ahu2.k();
            return ahu2;
        } else
        {
            return null;
        }
    }

    public final ajw b()
    {
        aif aif1 = aif.b(200);
        return (new ajw()).a("mfcc", 2, aif1).b("delta", 2, aif1).a();
    }

    protected final void e()
    {
        ahu ahu1 = a("mfcc").a().g();
        long l;
        if (mMfccDim == 0)
        {
            mMfccDim = ahu1.b();
        } else
        if (mMfccDim != ahu1.b())
        {
            String s = TAG;
            int i = mMfccDim;
            int j = ahu1.b();
            Log.e(s, (new StringBuilder(62)).append("mfcc feature dimension changes from ").append(i).append(" to ").append(j).toString());
            return;
        }
        l = 0L;
        if (mTimestampBuffer.size() == 2)
        {
            l = ((Long)mTimestampBuffer.removeFirst()).longValue();
        }
        mTimestampBuffer.add(Long.valueOf(ahu1.c()));
        ahu1 = a(ahu1);
        if (ahu1 != null)
        {
            ahu1.a(Long.valueOf(l).longValue());
            b("delta").a(ahu1);
        }
    }

}
