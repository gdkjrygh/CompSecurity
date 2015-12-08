// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.video;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.text.TextUtils;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.games.internal.GamesLog;

public final class CameraUtils
{

    public static String getFrontFacingCameraId(Context context)
    {
        if (PlatformVersion.checkVersion(21)) goto _L2; else goto _L1
_L1:
        context = null;
_L4:
        return context;
_L2:
        CameraManager cameramanager = (CameraManager)context.getSystemService("camera");
        String as[];
        int j;
        as = cameramanager.getCameraIdList();
        j = as.length;
        int i = 0;
_L5:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        context = as[i];
        int k;
        if (((Integer)cameramanager.getCameraCharacteristics(context).get(CameraCharacteristics.LENS_FACING)).intValue() != 0 || !TextUtils.isDigitsOnly(context))
        {
            break; /* Loop/switch isn't completed */
        }
        k = Integer.decode(context).intValue();
        if (k <= 10) goto _L4; else goto _L3
_L3:
        i++;
          goto _L5
        if (true) goto _L4; else goto _L6
        context;
        GamesLog.e("CameraUtils", "Missing permission to access camera", context);
_L6:
        return null;
        context;
        GamesLog.e("CameraUtils", "Could not access camera", context);
        continue; /* Loop/switch isn't completed */
        context;
        GamesLog.e("CameraUtils", "Camera2 API not available", context);
        continue; /* Loop/switch isn't completed */
        context;
        GamesLog.e("CameraUtils", "Camera2 API internal error", context);
        if (true) goto _L6; else goto _L7
_L7:
    }
}
