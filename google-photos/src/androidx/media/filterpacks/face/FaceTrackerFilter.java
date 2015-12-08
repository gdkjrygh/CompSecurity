// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package androidx.media.filterpacks.face;

import ahn;
import ahs;
import ahv;
import aif;
import aih;
import ajo;
import ajr;
import aju;
import ajw;
import ajz;
import akw;
import android.media.effect.Effect;
import android.media.effect.EffectContext;
import android.media.effect.EffectFactory;
import android.media.effect.EffectUpdateListener;

public final class FaceTrackerFilter extends ahn
{

    private static final String FACE_TRACKER_EFFECT = "com.google.android.media.effect.effects.FaceTrackingEffect";
    private EffectContext mEffectContext;
    private EffectUpdateListener mFaceListener;
    private Effect mFaceTracker;
    private android.hardware.Camera.Face mFaces[];
    private ajz mIgnoreTex;

    public FaceTrackerFilter(ajr ajr, String s)
    {
        super(ajr, s);
        mEffectContext = null;
        mFaceTracker = null;
        mFaces = null;
        mIgnoreTex = null;
        mFaceListener = new akw(this);
    }

    public static android.hardware.Camera.Face[] a(FaceTrackerFilter facetrackerfilter, android.hardware.Camera.Face aface[])
    {
        facetrackerfilter.mFaces = aface;
        return aface;
    }

    public final ajw b()
    {
        aif aif1 = aif.a(301, 2);
        aif aif2 = aif.b(android/hardware/Camera$Face);
        return (new ajw()).a("image", 2, aif1).b("faces", 2, aif2).a();
    }

    protected final void c()
    {
        mEffectContext = EffectContext.createWithCurrentGlContext();
        EffectFactory effectfactory = mEffectContext.getFactory();
        if (EffectFactory.isEffectSupported("com.google.android.media.effect.effects.FaceTrackingEffect"))
        {
            mFaceTracker = effectfactory.createEffect("com.google.android.media.effect.effects.FaceTrackingEffect");
            mFaceTracker.setParameter("ignoreOutput", Boolean.valueOf(true));
            mFaceTracker.setUpdateListener(mFaceListener);
            mIgnoreTex = ajz.a();
            mIgnoreTex.a(640, 480);
            return;
        } else
        {
            String s = String.valueOf(this);
            throw new RuntimeException((new StringBuilder(String.valueOf(s).length() + 39)).append("Cannot find a face-tracker engine for ").append(s).append("!").toString());
        }
    }

    protected final void e()
    {
        aju aju1;
        aju1 = b("faces");
        ahv ahv1 = a("image").a().h();
        int i = ahv1.o().a;
        int j = mIgnoreTex.a;
        mFaceTracker.apply(i, ahv1.m(), ahv1.n(), j);
        ahv1.k();
        this;
        JVM INSTR monitorenter ;
        if (mFaces == null)
        {
            mFaces = new android.hardware.Camera.Face[0];
        }
        aih aih1 = aju1.a(new int[] {
            mFaces.length
        }).e();
        aih1.b(mFaces);
        aju1.a(aih1);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected final void g()
    {
        if (mEffectContext != null)
        {
            mEffectContext.release();
            mEffectContext = null;
        }
        if (mIgnoreTex != null)
        {
            mIgnoreTex.e();
            mIgnoreTex = null;
        }
    }
}
