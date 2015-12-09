// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.util.camera;

import android.hardware.Camera;
import com.google.android.apps.wallet.util.async.ActionExecutor;
import com.google.android.apps.wallet.util.async.ThreadChecker;

public class CameraManager
{

    private static final String TAG = com/google/android/apps/wallet/util/camera/CameraManager.getSimpleName();
    private final ActionExecutor actionExecutor;
    private final ThreadChecker threadChecker;

    public CameraManager(ThreadChecker threadchecker, ActionExecutor actionexecutor)
    {
        threadChecker = threadchecker;
        actionExecutor = actionexecutor;
    }

    public static boolean deviceSupportsBarcodeScanning()
    {
        return Camera.getNumberOfCameras() > 0;
    }

}
