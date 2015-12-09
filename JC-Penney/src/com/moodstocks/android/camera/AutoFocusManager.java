// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.moodstocks.android.camera;

import android.hardware.Camera;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import java.util.List;

public class AutoFocusManager extends Handler
    implements android.hardware.Camera.AutoFocusCallback
{

    private static final long FOCUS_DELAY = 1500L;
    private static int FOCUS_REQUEST = 0;
    private Camera camera;
    private boolean focussing;
    private boolean is_focus;

    protected AutoFocusManager(Camera camera1)
    {
        is_focus = false;
        focussing = false;
        android.hardware.Camera.Parameters parameters = camera1.getParameters();
        if (parameters.getSupportedFocusModes().contains("auto"))
        {
            parameters.setFocusMode("auto");
        }
        camera1.setParameters(parameters);
        camera = camera1;
    }

    private void safeAutoFocus()
    {
        if (camera == null)
        {
            break MISSING_BLOCK_LABEL_15;
        }
        camera.autoFocus(this);
        return;
        RuntimeException runtimeexception;
        runtimeexception;
        Log.e("AutoFocusManager", "Unexpected Runtime Exception while calling autofocus");
        return;
    }

    private void safeCancelAutoFocus()
    {
        if (camera == null)
        {
            break MISSING_BLOCK_LABEL_14;
        }
        camera.cancelAutoFocus();
        return;
        RuntimeException runtimeexception;
        runtimeexception;
        Log.e("AutoFocusManager", "Unexpected Runtime Exception while cancelling autofocus");
        return;
    }

    public void handleMessage(Message message)
    {
        if (message.what == FOCUS_REQUEST && camera != null)
        {
            safeCancelAutoFocus();
            safeAutoFocus();
            focussing = true;
        }
    }

    protected boolean isFocussed()
    {
        return is_focus && !focussing;
    }

    public void onAutoFocus(boolean flag, Camera camera1)
    {
        sendEmptyMessageDelayed(FOCUS_REQUEST, 1500L);
        focussing = false;
        is_focus = flag;
    }

    protected void requestFocus()
    {
        if (!focussing && !is_focus)
        {
            focussing = true;
            stop();
            start();
        }
    }

    protected void start()
    {
        if (camera == null)
        {
            return;
        } else
        {
            safeCancelAutoFocus();
            safeAutoFocus();
            focussing = true;
            return;
        }
    }

    protected void stop()
    {
        safeCancelAutoFocus();
        removeMessages(FOCUS_REQUEST);
    }

}
