// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.moviemaker.filterpacks.image;

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
import cxh;
import java.nio.ByteBuffer;
import java.util.Arrays;

public class LucasKanadeMotionSaliencyFilter extends ahn
{

    private static final String DISPLACEMENT = "displacement";
    private static final String DROP_RATE = "dropRate";
    private static final String FRAME = "image";
    private static final String FRAME_NUMBER = "frameNumber";
    private static final String INTERFRAMETRANSFORM = "interframetransform";
    private static final String MAP = "map";
    private static final String MAP_DROP_RATE = "mapDropRate";
    private static final int SALIENCY_MAP_HEIGHT = 8;
    private static final int SALIENCY_MAP_WIDTH = 8;
    private static final String SCORE = "score";
    private static final String TAG = com/google/android/apps/moviemaker/filterpacks/image/LucasKanadeMotionSaliencyFilter.getSimpleName();
    private ByteBuffer mContextBuffer;
    private float mDropRate;
    private int mImageDims[];
    private boolean mIsAnalyzerPrepared;
    private float mMapDropRate;
    private final float mPreviousDisplacement[] = new float[2];
    private ahs mPreviousFrame;

    public LucasKanadeMotionSaliencyFilter(ajr ajr, String s)
    {
        super(ajr, s);
        mPreviousFrame = null;
        mIsAnalyzerPrepared = false;
        mDropRate = 0.95F;
        mMapDropRate = 0.95F;
    }

    private native float computeMotionSaliency(ByteBuffer bytebuffer, ByteBuffer bytebuffer1, ByteBuffer bytebuffer2, float f1, float f2, int i, int j, 
            ByteBuffer bytebuffer3);

    private native int getMotionSaliencyContextLength();

    private native boolean prepareMotionAnalyzer(ByteBuffer bytebuffer, int i, int j);

    private native void releaseMotionAnalyzer(ByteBuffer bytebuffer);

    public final ajw b()
    {
        aif aif1 = aif.a(100, 1);
        aif aif2 = aif.b(100);
        return (new ajw()).a("image", 2, aif1).a("frameNumber", 2, aif.a(Integer.TYPE)).a("displacement", 1, aif.b()).a("interframetransform", 1, aif.b()).a("dropRate", 1, aif.a(Float.TYPE)).a("mapDropRate", 1, aif.a(Float.TYPE)).b("score", 2, aif.a(Float.TYPE)).b("map", 1, aif2).a();
    }

    public final void b(ajo ajo1)
    {
        if (ajo1.b.equals("dropRate"))
        {
            ajo1.a("mDropRate");
            ajo1.g = true;
        }
        if (ajo1.b.equals("mapDropRate"))
        {
            ajo1.a("mMapDropRate");
            ajo1.g = true;
        }
    }

    protected final void c()
    {
        mContextBuffer = ByteBuffer.allocateDirect(getMotionSaliencyContextLength());
    }

    protected final void e()
    {
        int i = ((Integer)a("frameNumber").a().d().m()).intValue();
        Object obj = (cxh)a("interframetransform").a().d().m();
        ahs ahs1 = a("image").a();
        int ai[] = ahs1.l();
        aju aju1;
        if (!mIsAnalyzerPrepared)
        {
            mImageDims = Arrays.copyOf(ai, ai.length);
            if (!prepareMotionAnalyzer(mContextBuffer, mImageDims[0], mImageDims[1]))
            {
                Log.e(TAG, "Failed to initialize motion saliency analyzer");
                return;
            }
            mIsAnalyzerPrepared = true;
        } else
        if (!Arrays.equals(mImageDims, ai))
        {
            obj = TAG;
            i = mImageDims[0];
            int j = mImageDims[1];
            int k = ai[0];
            int l = ai[1];
            Log.e(((String) (obj)), (new StringBuilder(101)).append("input frame dimensions have changed from: (").append(i).append(", ").append(j).append(") to ( ").append(k).append(", ").append(l).append(" ).").toString());
            return;
        }
        aju1 = b("map");
        if (!b.a(i, mDropRate))
        {
            if (mPreviousFrame != null)
            {
                float f1 = -((cxh) (obj)).c();
                float f2 = mImageDims[0];
                float f3 = -((cxh) (obj)).d();
                float f4 = mImageDims[1];
                Object obj1 = ahs1.g().a(1);
                ByteBuffer bytebuffer = mPreviousFrame.g().a(1);
                if (aju1 != null)
                {
                    obj = aju1.a(new int[] {
                        8, 8
                    }).g();
                    ai = ((ahu) (obj)).a(2);
                } else
                {
                    ai = null;
                    obj = null;
                }
                f1 = computeMotionSaliency(mContextBuffer, ((ByteBuffer) (obj1)), bytebuffer, f1 * f2, f3 * f4, 8, 8, ai);
                mPreviousFrame.k();
                ahs1.k();
                ai = b("score");
                obj1 = ai.a(null).d();
                ((aig) (obj1)).a(Float.valueOf(f1));
                ai.a(((ahs) (obj1)));
                if (aju1 != null)
                {
                    ((ahu) (obj)).k();
                    if (!b.a(i, mMapDropRate))
                    {
                        aju1.a(((ahs) (obj)));
                    }
                }
            } else
            if (i != 0 && aju1 != null && !b.a(i, mMapDropRate))
            {
                obj = aju1.a(new int[] {
                    8, 8
                }).g();
                Arrays.fill(((ahu) (obj)).a(2).array(), (byte)0);
                ((ahu) (obj)).k();
                aju1.a(((ahs) (obj)));
            }
        }
        if (mPreviousFrame != null)
        {
            mPreviousFrame.i();
        }
        mPreviousFrame = ahs1.j();
    }

    protected final void f()
    {
        if (mIsAnalyzerPrepared)
        {
            releaseMotionAnalyzer(mContextBuffer);
            mIsAnalyzerPrepared = false;
        }
        if (mPreviousFrame != null)
        {
            mPreviousFrame.i();
            mPreviousFrame = null;
        }
    }

    static 
    {
        System.loadLibrary("moviemaker-jni");
    }
}
