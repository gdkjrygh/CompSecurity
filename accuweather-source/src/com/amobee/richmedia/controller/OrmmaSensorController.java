// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.richmedia.controller;

import android.content.Context;
import com.amobee.richmedia.controller.listeners.AccelListener;
import com.amobee.richmedia.view.AmobeeView;

// Referenced classes of package com.amobee.richmedia.controller:
//            OrmmaController

public class OrmmaSensorController extends OrmmaController
{

    private static final String LOG_TAG = "AmobeeViewSensorController";
    final int INTERVAL = 1000;
    private AccelListener mAccel;
    private float mLastX;
    private float mLastY;
    private float mLastZ;

    public OrmmaSensorController(AmobeeView amobeeview, Context context)
    {
        super(amobeeview, context);
        mLastX = 0.0F;
        mLastY = 0.0F;
        mLastZ = 0.0F;
        mAccel = new AccelListener(context, this);
    }

    public float getHeading()
    {
        return mAccel.getHeading();
    }

    public String getTilt()
    {
        return (new StringBuilder("{ x : \"")).append(mLastX).append("\", y : \"").append(mLastY).append("\", z : \"").append(mLastZ).append("\"}").toString();
    }

    public void onHeadingChange(float f)
    {
        String s = (new StringBuilder("window.ormmaview.fireChangeEvent({ heading: ")).append((int)((double)f * 57.295779513082323D)).append("});").toString();
        mOrmmaView.injectJavaScriptRichMedia(s);
    }

    public void onShake()
    {
        mOrmmaView.injectJavaScript("Ormma.gotShake()");
    }

    public void onTilt(float f, float f1, float f2)
    {
        mLastX = f;
        mLastY = f1;
        mLastZ = f2;
        String s = (new StringBuilder("window.ormmaview.fireChangeEvent({ tilt: ")).append(getTilt()).append("})").toString();
        mOrmmaView.injectJavaScriptRichMedia(s);
    }

    public void startHeadingListener()
    {
        mAccel.startTrackingHeading();
    }

    public void startShakeListener()
    {
        mAccel.startTrackingShake();
    }

    public void startTiltListener()
    {
        mAccel.startTrackingTilt();
    }

    void stop()
    {
    }

    public void stopAllListeners()
    {
        mAccel.stopAllListeners();
    }

    public void stopHeadingListener()
    {
        mAccel.stopTrackingHeading();
    }

    public void stopShakeListener()
    {
        mAccel.stopTrackingShake();
    }

    public void stopTiltListener()
    {
        mAccel.stopTrackingTilt();
    }
}
