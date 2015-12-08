// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.moviemaker.filterpacks.numeric;

import ahn;
import ahs;
import ahu;
import aif;
import aig;
import ajo;
import ajr;
import aju;
import ajw;
import android.util.Log;
import b;
import java.nio.ByteBuffer;

public class MapProjectionFilter extends ahn
{

    private static final String BATCH_SIZE_INPUT_PORT = "batchSize";
    private static final String DROP_RATE_INPUT_PORT = "dropRate";
    private static final String FRAME_NUMBER_INPUT_PORT = "frameNumber";
    private static final String HORIZONTAL_PROJECTION_OUTPUT_PORT = "horizontalProjection";
    private static final String MAP_INPUT_PORT = "map";
    private static final String TAG = com/google/android/apps/moviemaker/filterpacks/numeric/MapProjectionFilter.getSimpleName();
    private static final String VERTICAL_PROJECTION_OUTPUT_PORT = "verticalProjection";
    private int mBatchSize;
    private float mDropRate;
    private int mFrameNumber;

    public MapProjectionFilter(ajr ajr, String s)
    {
        super(ajr, s);
        mBatchSize = 1;
        mDropRate = 0.0F;
        mFrameNumber = 0;
    }

    private static void a(long al[], long l)
    {
        for (int i = 0; i < al.length; i++)
        {
            al[i] = al[i] / l;
        }

    }

    public final ajw b()
    {
        aif aif1 = aif.b(100);
        aif aif2 = aif.a(java/lang/Integer);
        aif aif3 = aif.b(java/lang/Long);
        return (new ajw()).a("map", 2, aif1).a("batchSize", 1, aif2).a("dropRate", 1, aif.a(Float.TYPE)).a("frameNumber", 1, aif.a(Integer.TYPE)).b("verticalProjection", 1, aif3).b("horizontalProjection", 1, aif3).a();
    }

    public final void b(ajo ajo1)
    {
        if (ajo1.b.equals("batchSize"))
        {
            ajo1.a("mBatchSize");
            ajo1.g = true;
            ajo1.f = false;
        }
        if (ajo1.b.equals("dropRate"))
        {
            ajo1.a("mDropRate");
            ajo1.g = true;
            ajo1.f = false;
        }
        if (ajo1.b.equals("frameNumber"))
        {
            ajo1.a("mFrameNumber");
            ajo1.g = true;
            ajo1.f = false;
        }
    }

    protected final void e()
    {
        ahs ahs1 = a("map").a();
        if (!b.a(mFrameNumber, mDropRate))
        {
            ahu ahu1 = ahs1.g();
            ByteBuffer bytebuffer = ahu1.a(1);
            int ai[] = ahu1.l();
            aju aju1 = b("verticalProjection");
            aju aju2 = b("horizontalProjection");
            long al[];
            aig aig1;
            long al1[];
            aig aig2;
            boolean flag;
            boolean flag1;
            int i;
            if (aju1 != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (aju2 != null)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            i = mBatchSize;
            if (ai[0] % mBatchSize != 0 || ai[1] % mBatchSize != 0)
            {
                Log.w(TAG, "The dimensions of the saliency map are not divisible by the batchSize parameter. The projections will not be resized.");
                i = 1;
            }
            if (flag)
            {
                aig1 = aju1.a(null).d();
                al = new long[ai[0] / i];
            } else
            {
                al = null;
                aig1 = null;
            }
            if (flag1)
            {
                aig2 = aju2.a(null).d();
                al1 = new long[ai[1] / i];
            } else
            {
                al1 = null;
                aig2 = null;
            }
            if (flag || flag1)
            {
                for (int j = 0; j < ai[1]; j++)
                {
                    for (int k = 0; k < ai[0]; k++)
                    {
                        int l = bytebuffer.get(ai[0] * j + k) & 0xff;
                        if (flag)
                        {
                            int i1 = k / i;
                            al[i1] = al[i1] + (long)l;
                        }
                        if (flag1)
                        {
                            int j1 = j / i;
                            al1[j1] = al1[j1] + (long)l;
                        }
                    }

                }

            }
            i *= i;
            if (flag)
            {
                a(al, i);
                aig1.a(ahs1.c());
                aig1.a(al);
                aju1.a(aig1);
            }
            if (flag1)
            {
                a(al1, i);
                aig2.a(ahs1.c());
                aig2.a(al1);
                aju2.a(aig2);
                return;
            }
        }
    }

}
