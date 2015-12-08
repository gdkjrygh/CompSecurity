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
import deo;
import java.nio.ByteBuffer;

public class PhaseCorrelateFilter extends ahn
{

    private static final String TAG = com/google/android/apps/moviemaker/filterpacks/image/PhaseCorrelateFilter.getSimpleName();
    private final float mMotionEstimation[] = new float[2];
    private ahu mPreviousFrame;
    private deo mTimer;

    public PhaseCorrelateFilter(ajr ajr, String s)
    {
        super(ajr, s);
    }

    private void a(String s, float f)
    {
        s = b(s);
        aig aig1 = s.a(null).d();
        aig1.a(Float.valueOf(f));
        s.a(aig1);
    }

    private native void phaseCorrelate(int i, ByteBuffer bytebuffer, ByteBuffer bytebuffer1, float af[]);

    public final ajw b()
    {
        aif aif1 = aif.b(100);
        aif aif2 = aif.a(Float.TYPE);
        return (new ajw()).a("image", 2, aif1).b("horizontalPanDirection", 2, aif2).b("verticalPanDirection", 2, aif2).a();
    }

    public final void b(ajo ajo1)
    {
    }

    protected final void c()
    {
        mTimer = new deo(TAG);
    }

    protected final void e()
    {
        ahu ahu1 = a("image").a().g();
        if (mPreviousFrame != null)
        {
            mTimer.a("onProcess");
            ByteBuffer bytebuffer = ahu1.a(1);
            mTimer.b("lock current image");
            ByteBuffer bytebuffer1 = mPreviousFrame.a(1);
            mTimer.b("lock previous image");
            phaseCorrelate(ahu1.m(), bytebuffer1, bytebuffer, mMotionEstimation);
            mTimer.b("phase correlate in jni");
            ahu1.k();
            mTimer.b("unlock current image");
            mPreviousFrame.k();
            mTimer.b("unlock previous image");
            mTimer.a(true);
            mPreviousFrame.i();
            a("horizontalPanDirection", mMotionEstimation[0]);
            a("verticalPanDirection", mMotionEstimation[1]);
        }
        mPreviousFrame = ahu1;
        mPreviousFrame.j();
    }

    protected final void g()
    {
        mTimer.a();
    }

    static 
    {
        System.loadLibrary("moviemaker-jni");
    }
}
