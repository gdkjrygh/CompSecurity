// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.moviemaker.stabilizer;

import ahn;
import ahs;
import ahv;
import aif;
import aig;
import ajo;
import ajr;
import aju;
import ajw;
import android.util.Log;
import cob;
import cxh;
import java.nio.ByteBuffer;
import java.util.Arrays;

public class StabilizationMotionEstimationFilter extends ahn
{

    private static final String TAG = com/google/android/apps/moviemaker/stabilizer/StabilizationMotionEstimationFilter.getSimpleName();
    private ByteBuffer mContextBuffer;
    private boolean mIsStabilizationMotionEstimationSetUp;
    private int mOriginalInputDimensions[];
    private int mWorkingFrameHeight;
    private int mWorkingFrameWidth;

    public StabilizationMotionEstimationFilter(ajr ajr, String s)
    {
        super(ajr, s);
    }

    private native int getContextLength();

    private native void stabilizationMotionEstimationProcessFrame(ByteBuffer bytebuffer, ByteBuffer bytebuffer1, int i, int j, float af[]);

    private native void stabilizationMotionEstimationSetUp(ByteBuffer bytebuffer, int i, int j);

    private native void stabilizationMotionEstimationTearDown(ByteBuffer bytebuffer);

    public final ajw b()
    {
        aif aif1 = aif.a(100, 1);
        aif aif2 = aif.a(cob);
        return (new ajw()).a("image", 2, aif1).b("interframetransform", 1, aif2).a();
    }

    protected final void c()
    {
        mContextBuffer = ByteBuffer.allocateDirect(getContextLength());
    }

    protected final void e()
    {
        ahv ahv1 = a("image").a().h();
        int ai[] = ahv1.l();
        Object obj;
        if (mOriginalInputDimensions == null)
        {
            mOriginalInputDimensions = Arrays.copyOf(ai, ai.length);
        } else
        if (!Arrays.equals(ai, mOriginalInputDimensions))
        {
            Log.e(TAG, String.format("Frame dimensions have changed during processing of a video, original dimensions were (%d, %d), current dimensions are (%d, %d). Ignoring current frame.", new Object[] {
                Integer.valueOf(mOriginalInputDimensions[0]), Integer.valueOf(mOriginalInputDimensions[1]), Integer.valueOf(ai[0]), Integer.valueOf(ai[1])
            }));
            return;
        }
        if (!mIsStabilizationMotionEstimationSetUp)
        {
            mWorkingFrameWidth = ai[0];
            mWorkingFrameHeight = ai[1];
            stabilizationMotionEstimationSetUp(mContextBuffer, mWorkingFrameWidth, mWorkingFrameHeight);
            mIsStabilizationMotionEstimationSetUp = true;
        }
        obj = ahv1.a(1);
        ai = cxh.a();
        stabilizationMotionEstimationProcessFrame(mContextBuffer, ((ByteBuffer) (obj)), mWorkingFrameWidth, mWorkingFrameHeight, ai);
        ahv1.k();
        obj = b("interframetransform");
        if (obj != null)
        {
            aig aig1 = ((aju) (obj)).a(null).d();
            aig1.a(ahv1.c());
            aig1.a(cxh.a(ai));
            ((aju) (obj)).a(aig1);
        }
    }

    protected final void f()
    {
        mOriginalInputDimensions = null;
        if (mIsStabilizationMotionEstimationSetUp)
        {
            stabilizationMotionEstimationTearDown(mContextBuffer);
            mIsStabilizationMotionEstimationSetUp = false;
        }
    }

}
