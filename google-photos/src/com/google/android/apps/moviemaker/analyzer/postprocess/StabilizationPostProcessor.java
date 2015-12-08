// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.moviemaker.analyzer.postprocess;

import android.util.LongSparseArray;
import b;
import bjn;
import cmj;
import cmk;
import cos;
import cxh;
import java.nio.ByteBuffer;
import java.util.Map;

public class StabilizationPostProcessor
    implements bjn
{

    public StabilizationPostProcessor()
    {
    }

    private native int getContextLength();

    private native void stabilizationMotionFilteringProcess(ByteBuffer bytebuffer, float af[], float af1[], float af2[]);

    private native void stabilizationMotionFilteringSetUp(ByteBuffer bytebuffer, int i);

    private native void stabilizationMotionFilteringTearDown(ByteBuffer bytebuffer);

    public final void a(cmj cmj1)
    {
        Object obj = cos.q;
        if (cmj1.a.get(obj) == null)
        {
            obj = null;
        } else
        {
            obj = new cmk(cmj1, ((cos) (obj)));
        }
        if (obj != null)
        {
            int i1 = ((cmk) (obj)).a();
            float af2[] = new float[i1 * 9];
            float af[] = new float[i1 * 9];
            float af1[] = new float[i1 * 9];
            for (int i = 0; i < i1; i++)
            {
                b.a(i, "OneMetricIndex", 0, ((cmk) (obj)).a() - 1);
                cxh cxh1 = (cxh)((LongSparseArray)((cmk) (obj)).b.a.get(((cmk) (obj)).a)).valueAt(i);
                for (int k = 0; k < 9; k++)
                {
                    af2[i * 9 + k] = cxh1.a[k];
                }

            }

            ByteBuffer bytebuffer = ByteBuffer.allocateDirect(getContextLength());
            stabilizationMotionFilteringSetUp(bytebuffer, i1);
            stabilizationMotionFilteringProcess(bytebuffer, af2, af, af1);
            stabilizationMotionFilteringTearDown(bytebuffer);
            int j = 0;
            while (j < i1) 
            {
                b.a(j, "OneMetricIndex", 0, ((cmk) (obj)).a() - 1);
                long l1 = ((LongSparseArray)((cmk) (obj)).b.a.get(((cmk) (obj)).a)).keyAt(j);
                float af3[] = cxh.a();
                float af4[] = cxh.a();
                for (int l = 0; l < 9; l++)
                {
                    af3[l] = af1[j * 9 + l];
                    af4[l] = af[j * 9 + l];
                }

                cmj1.a(cos.b, l1, cxh.a(af3));
                cmj1.a(cos.r, l1, cxh.a(af4));
                j++;
            }
        }
    }
}
