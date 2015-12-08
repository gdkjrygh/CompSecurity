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

public class MotionTrackFilter extends ahn
{

    private static final String TAG = com/google/android/apps/moviemaker/filterpacks/image/MotionTrackFilter.getSimpleName();
    private float mExactMatchPercentage;
    private final int mMotionEstimation[] = new int[2];
    private ahu mPreviousFrame;
    private deo timer;

    public MotionTrackFilter(ajr ajr, String s)
    {
        super(ajr, s);
        mExactMatchPercentage = 0.5F;
    }

    private void a(String s, float f)
    {
        s = b(s);
        aig aig1 = s.a(null).d();
        aig1.a(Float.valueOf(f));
        s.a(aig1);
    }

    private native void trackGrossMotion(int i, ByteBuffer bytebuffer, ByteBuffer bytebuffer1, float f, int ai[]);

    public final ajw b()
    {
        aif aif1 = aif.b(100);
        aif aif2 = aif.a(Float.TYPE);
        return (new ajw()).a("image", 2, aif1).a("exactMatchPercentage", 1, aif2).b("horizontalPanDirection", 2, aif2).b("verticalPanDirection", 2, aif2).a();
    }

    public final void b(ajo ajo1)
    {
        if (ajo1.b.equals("exactMatchPercentage"))
        {
            ajo1.a("mExactMatchPercentage");
            ajo1.g = true;
            ajo1.f = false;
        }
    }

    protected final void c()
    {
        timer = new deo(TAG);
    }

    protected final void e()
    {
        ahu ahu1 = a("image").a().g();
        if (mPreviousFrame != null)
        {
            timer.a("onProcess");
            ByteBuffer bytebuffer = ahu1.a(1);
            timer.b("lock current image");
            ByteBuffer bytebuffer1 = mPreviousFrame.a(1);
            timer.b("lock previous image");
            trackGrossMotion(ahu1.m(), bytebuffer, bytebuffer1, mExactMatchPercentage, mMotionEstimation);
            timer.b("track motion in jni");
            ahu1.k();
            timer.b("unlock current image");
            mPreviousFrame.k();
            timer.b("unlock previous image");
            timer.a(false);
            mPreviousFrame.i();
            a("horizontalPanDirection", mMotionEstimation[0]);
            a("verticalPanDirection", mMotionEstimation[1]);
        }
        mPreviousFrame = ahu1;
        mPreviousFrame.j();
    }

    protected final void g()
    {
        timer.a();
    }

    static 
    {
        System.loadLibrary("moviemaker-jni");
    }
}
