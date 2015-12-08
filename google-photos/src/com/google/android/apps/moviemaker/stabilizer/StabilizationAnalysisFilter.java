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
import android.util.LongSparseArray;
import b;
import cob;
import cxf;
import cxg;
import cxi;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Arrays;

public class StabilizationAnalysisFilter extends ahn
{

    private static final int BYTES_PER_FLOAT = 4;
    private static final String DIMENSIONS_CHANGED_MESSAGE_TEMPLATE = "Frame dimensions have changed during processing of a video, original dimensions were (%d, %d), current dimensions are (%d, %d). Ignoring current frame.";
    private static final String TAG = com/google/android/apps/moviemaker/stabilizer/StabilizationAnalysisFilter.getSimpleName();
    private final ArrayList mCameraMotions = new ArrayList();
    private ByteBuffer mContextBuffer;
    private final float mDisplacement[] = new float[2];
    private final ArrayList mFrameCompensations = new ArrayList();
    private int mFrameHeight;
    private int mFrameWidth;
    private int mInputDimensions[];
    private boolean mIsStabilizerInited;
    public cxi mListener;
    private LongSparseArray mPreviousResults;

    public StabilizationAnalysisFilter(ajr ajr, String s)
    {
        super(ajr, s);
    }

    private void a(long l)
    {
        mFrameCompensations.add(cxg.a(l, 0.0F, 0.0F, 1.0F));
        mCameraMotions.add(new cxf(l));
    }

    private native int getContextLength();

    private native void stabilizerAddPreviousDisplacementValues(ByteBuffer bytebuffer, FloatBuffer floatbuffer);

    private native void stabilizerGetCompensation(ByteBuffer bytebuffer, float af[], float af1[], float af2[]);

    private native void stabilizerPrepare(ByteBuffer bytebuffer, int i, int j);

    private native void stabilizerProcessFrame(ByteBuffer bytebuffer, ByteBuffer bytebuffer1, int i, int j, float af[]);

    private native void stabilizerSetupSecondPass(ByteBuffer bytebuffer);

    private native void stabilizerTearDown(ByteBuffer bytebuffer);

    public final ajw b()
    {
        aif aif1 = aif.a(301, 1);
        aif aif2 = aif.a(cob);
        return (new ajw()).a("image", 2, aif1).b("displacement", 1, aif2).a();
    }

    protected final void e()
    {
        Object obj;
        FloatBuffer floatbuffer;
        obj = a("image").a().h();
        floatbuffer = ((ahv) (obj)).l();
        if (mInputDimensions != null) goto _L2; else goto _L1
_L1:
        long l;
        cob cob1;
        int i;
        long l1;
        boolean flag;
        if (floatbuffer[0] % 8 == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b.a(flag, "input frame width must be a multiple of 8");
        mInputDimensions = Arrays.copyOf(floatbuffer, floatbuffer.length);
_L10:
        if (!mIsStabilizerInited)
        {
            mContextBuffer = ByteBuffer.allocateDirect(getContextLength());
            mFrameWidth = mInputDimensions[0];
            mFrameHeight = mInputDimensions[1];
            stabilizerPrepare(mContextBuffer, mFrameWidth, mFrameHeight);
            mIsStabilizerInited = true;
        }
        l = ((ahv) (obj)).c() / 1000L;
        if (mPreviousResults == null) goto _L4; else goto _L3
_L3:
        floatbuffer = ByteBuffer.allocateDirect(mPreviousResults.size() << 1 << 2).order(ByteOrder.nativeOrder()).asFloatBuffer();
        i = 0;
_L8:
        if (i >= mPreviousResults.size()) goto _L6; else goto _L5
_L5:
        l1 = mPreviousResults.keyAt(i);
        if (l1 >= l) goto _L6; else goto _L7
_L7:
        cob1 = (cob)mPreviousResults.get(l1);
        floatbuffer.put(cob1.c[0] * (float)mFrameWidth);
        floatbuffer.put(cob1.c[1] * (float)mFrameHeight);
        a(l1);
        i++;
          goto _L8
_L2:
        if (Arrays.equals(floatbuffer, mInputDimensions)) goto _L10; else goto _L9
_L9:
        Log.e(TAG, String.format("Frame dimensions have changed during processing of a video, original dimensions were (%d, %d), current dimensions are (%d, %d). Ignoring current frame.", new Object[] {
            Integer.valueOf(mInputDimensions[0]), Integer.valueOf(mInputDimensions[1]), Integer.valueOf(floatbuffer[0]), Integer.valueOf(floatbuffer[1])
        }));
_L12:
        return;
_L6:
        floatbuffer.rewind();
        stabilizerAddPreviousDisplacementValues(mContextBuffer, floatbuffer);
        mPreviousResults = null;
_L4:
        a(l);
        Object obj1 = ((ahv) (obj)).a(1);
        stabilizerProcessFrame(mContextBuffer, ((ByteBuffer) (obj1)), mFrameWidth, mFrameHeight, mDisplacement);
        ((ahv) (obj)).k();
        obj1 = b("displacement");
        if (obj1 != null)
        {
            aig aig1 = ((aju) (obj1)).a(null).d();
            aig1.a(((ahv) (obj)).c());
            obj = new cob(1, 2);
            float f1 = mDisplacement[0] / (float)mFrameWidth;
            ((cob) (obj)).c[0] = f1;
            f1 = mDisplacement[1] / (float)mFrameHeight;
            ((cob) (obj)).c[1] = f1;
            aig1.a(obj);
            ((aju) (obj1)).a(aig1);
            return;
        }
        if (true) goto _L12; else goto _L11
_L11:
    }

    protected final void f()
    {
        Object aobj[];
        Object aobj1[];
        if (!mIsStabilizerInited)
        {
            aobj = new cxg[0];
            aobj1 = new cxf[0];
        } else
        {
            stabilizerSetupSecondPass(mContextBuffer);
            aobj = new float[2];
            aobj1 = new float[1];
            float af[] = new float[2];
            for (int i = 0; i < mFrameCompensations.size(); i++)
            {
                cxg cxg1 = (cxg)mFrameCompensations.get(i);
                stabilizerGetCompensation(mContextBuffer, ((float []) (aobj)), ((float []) (aobj1)), af);
                ((cxf)mCameraMotions.get(i)).b = af[0] / (float)mFrameWidth;
                ((cxf)mCameraMotions.get(i)).c = af[1] / (float)mFrameHeight;
                mFrameCompensations.set(i, cxg.a(cxg1.a, aobj[0] / (float)mFrameWidth, aobj[1] / (float)mFrameHeight, aobj1[0]));
            }

            aobj = (cxg[])mFrameCompensations.toArray(new cxg[mFrameCompensations.size()]);
            aobj1 = (cxf[])mCameraMotions.toArray(new cxf[mCameraMotions.size()]);
        }
        if (mListener != null)
        {
            mListener.a(((cxg []) (aobj)), ((cxf []) (aobj1)));
        }
        if (mIsStabilizerInited)
        {
            stabilizerTearDown(mContextBuffer);
            mFrameHeight = 0;
            mFrameWidth = 0;
            mContextBuffer = null;
            mIsStabilizerInited = false;
        }
        mInputDimensions = null;
        mFrameCompensations.clear();
        mCameraMotions.clear();
    }

    static 
    {
        System.loadLibrary("moviemaker-jni");
    }
}
