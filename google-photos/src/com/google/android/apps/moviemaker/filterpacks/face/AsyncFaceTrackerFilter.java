// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.moviemaker.filterpacks.face;

import ahn;
import ahs;
import ahv;
import aif;
import aih;
import ajo;
import ajr;
import aju;
import ajw;
import all;
import alm;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.Log;
import cdw;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.HashMap;

public class AsyncFaceTrackerFilter extends ahn
    implements cdw
{

    private static final String TAG;
    private static boolean mLogVerbose;
    private int mMinEyeDistance;
    private File mModuleFile;
    public int mNativeTrackerHandle;
    private int mNumSkipFrames;
    private all mTimingTracking;
    private boolean mWaitForDetector;

    public AsyncFaceTrackerFilter(ajr ajr, String s)
    {
        super(ajr, s);
        mNativeTrackerHandle = 0;
        mMinEyeDistance = 15;
        mNumSkipFrames = 0;
        mWaitForDetector = false;
    }

    private native int getFace(int i, int j, float af[]);

    private native int getNumOfFaces(int i);

    private native int newFaceTracker();

    private native int reset(int i);

    private native void setParameter(int i, String s, String s1);

    private native int tearDown(int i);

    private native int track(int i, ByteBuffer bytebuffer, int j, int k, long l);

    public final void a(FaceDetector.Module module)
    {
        if (n())
        {
            throw new IllegalStateException("Cannot call setCustomModule while tracker is running!");
        }
        if (module != null)
        {
            mModuleFile = module.a;
            return;
        } else
        {
            mModuleFile = null;
            return;
        }
    }

    public final ajw b()
    {
        aif aif1 = aif.b(100);
        aif aif2 = aif.b(android/hardware/Camera$Face);
        aif aif3 = aif.a(Integer.TYPE);
        aif aif4 = aif.a(Boolean.TYPE);
        return (new ajw()).a("image", 2, aif1).a("minEyeDist", 1, aif3).a("numSkipFrames", 1, aif3).a("waitForDetector", 1, aif4).b("faces", 2, aif2).a();
    }

    public final void b(ajo ajo1)
    {
        if (ajo1.b.equals("minEyeDist"))
        {
            ajo1.a("mMinEyeDistance");
            ajo1.g = true;
        } else
        {
            if (ajo1.b.equals("numSkipFrames"))
            {
                ajo1.a("mNumSkipFrames");
                ajo1.g = true;
                return;
            }
            if (ajo1.b.equals("waitForDetector"))
            {
                ajo1.a("mWaitForDetector");
                ajo1.g = true;
                return;
            }
        }
    }

    protected final void e()
    {
        Object obj;
        android.hardware.Camera.Face aface[];
        int k;
        if (mNativeTrackerHandle == 0)
        {
            if (mModuleFile == null)
            {
                mModuleFile = FaceDetector.Module.a().a;
            }
            mNativeTrackerHandle = newFaceTracker();
            setParameter(mNativeTrackerHandle, "minEyeDist", String.valueOf(mMinEyeDistance));
            setParameter(mNativeTrackerHandle, "numSkipFrames", String.valueOf(mNumSkipFrames));
            int i = mNativeTrackerHandle;
            Object obj2;
            all all1;
            float af[];
            android.hardware.Camera.Face face;
            if (mWaitForDetector)
            {
                obj = "1";
            } else
            {
                obj = "0";
            }
            setParameter(i, "waitForDetector", ((String) (obj)));
            setParameter(mNativeTrackerHandle, "modulePath", String.valueOf(mModuleFile.getParent()).concat("/"));
            setParameter(mNativeTrackerHandle, "ffModule", mModuleFile.getName());
            setParameter(mNativeTrackerHandle, "trackingError", "1.0");
        }
        if (mLogVerbose && mTimingTracking == null)
        {
            mTimingTracking = new all("FaceTracking");
        }
        if (mLogVerbose)
        {
            all1 = mTimingTracking;
            obj2 = (alm)all.b.get(all1.a);
            obj = obj2;
            if (obj2 == null)
            {
                obj = new alm();
                all.b.put(all1.a, obj);
            }
            obj.e = System.currentTimeMillis();
        }
        obj = b("faces");
        obj2 = a("image").a().h();
        track(mNativeTrackerHandle, ((ahv) (obj2)).a(1), ((ahv) (obj2)).m(), ((ahv) (obj2)).n(), ((ahv) (obj2)).c());
        ((ahv) (obj2)).k();
        k = getNumOfFaces(mNativeTrackerHandle);
        if (mLogVerbose)
        {
            (new StringBuilder(29)).append("Number of faces = ").append(k);
        }
        aface = new android.hardware.Camera.Face[k];
        af = new float[11];
        for (i = 0; i < k; i++)
        {
            aface[i] = new android.hardware.Camera.Face();
            aface[i].id = getFace(mNativeTrackerHandle, i, af);
            face = aface[i];
            face.rect = new Rect((int)((af[0] - 0.5F) * 2000F), (int)((af[1] - 0.5F) * 2000F), (int)((af[2] - 0.5F) * 2000F), (int)((af[3] - 0.5F) * 2000F));
            face.leftEye = new Point((int)((af[4] - 0.5F) * 2000F), (int)((af[5] - 0.5F) * 2000F));
            face.rightEye = new Point((int)((af[6] - 0.5F) * 2000F), (int)((af[7] - 0.5F) * 2000F));
            face.mouth = new Point((int)((af[8] - 0.5F) * 2000F), (int)((af[9] - 0.5F) * 2000F));
            face.score = (int)(af[10] * 99F + 1.0F);
        }

        aih aih1 = ((aju) (obj)).a(new int[] {
            k
        }).e();
        aih1.b(aface);
        ((aju) (obj)).a(aih1);
        if (mLogVerbose)
        {
            Object obj1 = mTimingTracking;
            obj1 = (alm)all.b.get(((all) (obj1)).a);
            Object obj3;
            if (obj1 == null || ((alm) (obj1)).e < 0L)
            {
                Log.e("Timing", "No begin called.");
            } else
            {
                long l1 = System.currentTimeMillis() - ((alm) (obj1)).e;
                if (((alm) (obj1)).a == 0)
                {
                    obj1.b = l1;
                    obj1.c = l1;
                    obj1.d = l1;
                    obj1.f = l1;
                    obj1.a = 1;
                } else
                {
                    obj1.a = ((alm) (obj1)).a + 1;
                    obj1.d = ((alm) (obj1)).d + l1;
                    obj1.b = Math.min(((alm) (obj1)).b, l1);
                    obj1.c = Math.max(((alm) (obj1)).c, l1);
                    obj1.f = l1;
                }
            }
            obj3 = mTimingTracking;
            obj1 = (alm)all.b.get(((all) (obj3)).a);
            if (obj1 != null)
            {
                obj3 = String.valueOf(((all) (obj3)).a);
                double d;
                int j;
                long l;
                long l2;
                if (((String) (obj3)).length() != 0)
                {
                    "Timing: ".concat(((String) (obj3)));
                } else
                {
                    new String("Timing: ");
                }
                if (((alm) (obj1)).a != 0)
                {
                    d = (double)((alm) (obj1)).d / (double)((alm) (obj1)).a;
                } else
                {
                    d = 0.0D;
                }
                obj3 = String.valueOf(String.format("%.2f", new Object[] {
                    Double.valueOf(d)
                }));
                l = ((alm) (obj1)).c;
                l2 = ((alm) (obj1)).f;
                j = ((alm) (obj1)).a;
                (new StringBuilder(String.valueOf(obj3).length() + 90)).append("Average: ").append(((String) (obj3))).append(", Maximum: ").append(l).append(", Latest: ").append(l2).append(", Count: ").append(j);
            }
        }
    }

    protected final void f()
    {
        if (mNativeTrackerHandle != 0)
        {
            reset(mNativeTrackerHandle);
        }
    }

    protected final void g()
    {
        if (mNativeTrackerHandle != 0)
        {
            tearDown(mNativeTrackerHandle);
        }
    }

    static 
    {
        String s = com/google/android/apps/moviemaker/filterpacks/face/AsyncFaceTrackerFilter.getSimpleName();
        TAG = s;
        mLogVerbose = Log.isLoggable(s, 2);
        System.loadLibrary("moviemaker-jni");
    }
}
