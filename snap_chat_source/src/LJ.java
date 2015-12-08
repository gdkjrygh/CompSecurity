// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;

public final class LJ
    implements SensorEventListener
{
    public static interface a
    {

        public abstract void a(Activity activity, LJ lj);
    }


    public static final int NUMBER_OF_DATA_POINTS = 20;
    protected static final int SHAKE_COUNT_THRESHOLD = 2;
    private static final float THRESHOLD = 18F;
    public Activity mActivity;
    private int mBufferIndex;
    private float mBufferX[];
    private float mBufferY[];
    private float mBufferZ[];
    public a mBugReporter;
    public boolean mCanSendReports;
    private boolean mIsBufferFilled;
    public SensorManager mSensorManager;
    private int mShakeCount;

    public LJ()
    {
        mBufferX = new float[20];
        mBufferY = new float[20];
        mBufferZ = new float[20];
        mIsBufferFilled = false;
    }

    private static float a(float af[], float f, float f1)
    {
        int k = af.length;
        for (int i = 0; i < k; i++)
        {
            float f2 = af[i];
            if (f2 < f)
            {
                f = f2;
            }
        }

        k = af.length;
        for (int j = 0; j < k; j++)
        {
            float f3 = af[j];
            if (f3 > f1)
            {
                f1 = f3;
            }
        }

        return Math.abs(f1 - f);
    }

    private void c()
    {
        mIsBufferFilled = false;
        mBufferIndex = 0;
    }

    public final void a()
    {
        mSensorManager.unregisterListener(this);
    }

    public final void b()
    {
        c();
        mCanSendReports = true;
    }

    public final void onAccuracyChanged(Sensor sensor, int i)
    {
    }

    public final void onSensorChanged(SensorEvent sensorevent)
    {
        boolean flag;
        flag = true;
        float af[] = new float[3];
        af[0] = sensorevent.values[0];
        af[1] = sensorevent.values[1];
        af[2] = sensorevent.values[2];
        mBufferX[mBufferIndex] = af[0];
        mBufferY[mBufferIndex] = af[1];
        mBufferZ[mBufferIndex] = af[2];
        mBufferIndex = mBufferIndex + 1;
        if (mBufferIndex == mBufferX.length)
        {
            mIsBufferFilled = true;
            mBufferIndex = 0;
        }
        if (!mIsBufferFilled) goto _L2; else goto _L1
_L1:
        float f;
        float f1;
        float f2;
        f = a(mBufferX, 3.402823E+38F, 1.401298E-45F);
        f1 = a(mBufferY, 3.402823E+38F, 1.401298E-45F);
        f2 = a(mBufferZ, 3.402823E+38F, 1.401298E-45F);
        if (f <= 18F && f1 <= 18F && f2 <= 18F) goto _L4; else goto _L3
_L3:
        if (mShakeCount <= 2) goto _L6; else goto _L5
_L5:
        mShakeCount = 0;
_L7:
        if (flag && mCanSendReports)
        {
            mCanSendReports = false;
            if (mBugReporter != null)
            {
                mBugReporter.a(mActivity, this);
            }
        }
        return;
_L6:
        mShakeCount = mShakeCount + 1;
        c();
_L2:
        flag = false;
        if (true) goto _L7; else goto _L4
_L4:
        mShakeCount = 0;
          goto _L2
    }
}
