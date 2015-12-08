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
import android.content.Context;
import android.graphics.Point;
import android.graphics.PointF;
import android.util.Log;

public final class FacialExpressionFilter extends ahn
{

    private static final int CAMERA_FACE_COORDINATES_RANGE = 2000;
    private static final String TAG;
    private static boolean mLogVerbose;
    private FaceDetector.Module mEyesOpenModule;
    private FaceDetector.Module mJoyModule;
    private FaceDetector.Module mLandmarkModule;

    public FacialExpressionFilter(ajr ajr1, String s)
    {
        super(ajr1, s);
    }

    private static float a(int i, int j)
    {
        return (((float)i + 1000F) / 2000F) * (float)j;
    }

    private static PointF a(Point point, int ai[])
    {
        return new PointF(a(point.x, ai[0]), a(point.y, ai[1]));
    }

    private static FaceDetector.Module a(Context context)
    {
        FaceDetector.Module module;
        try
        {
            module = FaceDetector.Module.b();
        }
        catch (Exception exception)
        {
            String s = String.valueOf("LMspeed_508.emd");
            if (s.length() != 0)
            {
                s = "frsdk_modules/".concat(s);
            } else
            {
                s = new String("frsdk_modules/");
            }
            return FaceDetector.Module.a(context, s);
        }
        return module;
    }

    private static boolean a(Point point)
    {
        return point.x >= -1000 && point.x < 1000 && point.y >= -1000 && point.y < 1000;
    }

    private static String c(String s)
    {
        s = String.valueOf(s);
        if (s.length() != 0)
        {
            return "frsdk_expression_modules/".concat(s);
        } else
        {
            return new String("frsdk_expression_modules/");
        }
    }

    public final ajw b()
    {
        aif aif1 = aif.b(100);
        aif aif2 = aif.b(Float.TYPE);
        return (new ajw()).a("image", 2, aif1).a("faces", 2, aif.b(android/hardware/Camera$Face)).b("smileScores", 2, aif2).b("eyesOpenScores", 2, aif2).a();
    }

    protected final void c()
    {
        Context context = super.mContext.a;
        mLandmarkModule = a(context);
        mJoyModule = FaceDetector.Module.a(context, c("BCLjoy_100.emd"));
        mEyesOpenModule = FaceDetector.Module.a(context, c("BCLeyesclosed_100.emd"));
    }

    protected final void e()
    {
        float af[];
        float af1[];
        Object obj;
        android.hardware.Camera.Face aface[];
        int ai[];
        FaceDetector.DCR dcr;
        int i;
        obj = a("image").a().h();
        aface = (android.hardware.Camera.Face[])a("faces").a().e().n();
        ai = ((ahv) (obj)).l();
        af1 = new float[aface.length];
        af = new float[aface.length];
        dcr = new FaceDetector.DCR();
        dcr.a(((ahv) (obj)).a(1), ((ahv) (obj)).m(), ((ahv) (obj)).n());
        i = 0;
_L8:
        if (i >= aface.length) goto _L2; else goto _L1
_L1:
        android.hardware.Camera.Face face = aface[i];
        if (!a(face.leftEye) || !a(face.rightEye) || !a(face.mouth)) goto _L4; else goto _L3
_L3:
        boolean flag;
        double d = Math.atan2(face.rightEye.y - face.leftEye.y, face.rightEye.x - face.leftEye.x);
        Object obj1 = new Point();
        obj1.x = (face.leftEye.x + face.rightEye.x) / 2;
        obj1.y = (face.leftEye.y + face.rightEye.y) / 2;
        String s;
        String s1;
        if (Math.abs(d - Math.atan2(((Point) (obj1)).y - face.mouth.y, ((Point) (obj1)).x - face.mouth.x)) < 3.1415926535897931D)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag) goto _L4; else goto _L5
_L5:
        flag = true;
_L6:
        if (flag)
        {
            if (mLogVerbose)
            {
                obj1 = String.valueOf(face.leftEye);
                s = String.valueOf(face.rightEye);
                s1 = String.valueOf(face.mouth);
                (new StringBuilder(String.valueOf(obj1).length() + 28 + String.valueOf(s).length() + String.valueOf(s1).length())).append("Sending Face Coords: ").append(((String) (obj1))).append(" : ").append(s).append(" : ").append(s1).append(".");
            }
            dcr.a(a(face.leftEye, ai), a(face.rightEye, ai), a(face.mouth, ai));
            dcr.c(mLandmarkModule);
            dcr.c(mJoyModule);
            af1[i] = dcr.c();
            dcr.c(mEyesOpenModule);
            af[i] = 1.0F - dcr.c();
        }
        i++;
        continue; /* Loop/switch isn't completed */
_L4:
        flag = false;
        if (true) goto _L6; else goto _L2
_L2:
        ((ahv) (obj)).k();
        dcr.a();
        aju aju1 = b("smileScores");
        obj = b("eyesOpenScores");
        aih aih2 = aju1.a(null).e();
        aih2.b(af1);
        aju1.a(aih2);
        aih aih1 = ((aju) (obj)).a(null).e();
        aih1.b(af);
        ((aju) (obj)).a(aih1);
        return;
        if (true) goto _L8; else goto _L7
_L7:
    }

    protected final void g()
    {
        mLandmarkModule.c();
        mJoyModule.c();
        mEyesOpenModule.c();
        mLandmarkModule = null;
        mJoyModule = null;
        mEyesOpenModule = null;
    }

    static 
    {
        String s = com/google/android/apps/moviemaker/filterpacks/face/FacialExpressionFilter.getSimpleName();
        TAG = s;
        mLogVerbose = Log.isLoggable(s, 2);
    }
}
