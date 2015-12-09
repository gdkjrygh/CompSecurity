// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.video;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.OrientationEventListener;
import com.google.android.gms.common.internal.Preconditions;

public final class DeviceRotationListener extends OrientationEventListener
    implements android.os.Handler.Callback
{
    public static interface DeviceRotationListenerCallback
    {

        public abstract void onDeviceOrientationChanged(int i);

        public abstract void onInitialDeviceOrientationDetected(int i);
    }


    int mCurrentDeviceOrientation;
    private final Handler mHandler;
    private boolean mIsEnabled;
    private int mLastNotifiedMessage;
    private final DeviceRotationListenerCallback mListenerCallback;

    public DeviceRotationListener(Context context, Looper looper, DeviceRotationListenerCallback devicerotationlistenercallback)
    {
        super(context, 3);
        mCurrentDeviceOrientation = -1;
        mListenerCallback = (DeviceRotationListenerCallback)Preconditions.checkNotNull(devicerotationlistenercallback, "listenerCallback cannot be null");
        Preconditions.checkNotNull(looper, "looper cannot be null");
        mHandler = new Handler(looper, this);
    }

    private void reset()
    {
        mHandler.removeCallbacksAndMessages(null);
        mCurrentDeviceOrientation = -1;
        mLastNotifiedMessage = -1;
        mIsEnabled = false;
    }

    public final void disable()
    {
        reset();
        super.disable();
    }

    public final void enable()
    {
        reset();
        mIsEnabled = true;
        super.enable();
    }

    public final boolean handleMessage(Message message)
    {
        if (mLastNotifiedMessage == -1)
        {
            mListenerCallback.onInitialDeviceOrientationDetected(message.what);
        } else
        {
            mListenerCallback.onDeviceOrientationChanged(message.what);
        }
        mLastNotifiedMessage = message.what;
        return true;
    }

    public final void onOrientationChanged(int i)
    {
        if (i >= 0 && i <= 30 || i >= 330 && i < 360)
        {
            i = 0;
        } else
        if (i >= 60 && i <= 120)
        {
            i = 90;
        } else
        if (i >= 150 && i <= 210)
        {
            i = 180;
        } else
        if (i >= 240 && i <= 300)
        {
            i = 270;
        } else
        {
            i = -1;
        }
_L8:
        if (i == mCurrentDeviceOrientation) goto _L2; else goto _L1
_L1:
        mCurrentDeviceOrientation = i;
        mHandler.removeCallbacksAndMessages(null);
        if (i == -1) goto _L2; else goto _L3
_L3:
        if (mLastNotifiedMessage != -1) goto _L5; else goto _L4
_L4:
        mHandler.sendEmptyMessage(i);
_L2:
        return;
_L5:
        if (mLastNotifiedMessage == i) goto _L2; else goto _L6
_L6:
        mHandler.sendEmptyMessageDelayed(i, 200L);
        return;
        if (true) goto _L8; else goto _L7
_L7:
    }
}
