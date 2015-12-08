// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil;

import android.app.Application;
import android.content.SharedPreferences;
import com.google.android.apps.unveil.env.af;
import com.google.android.apps.unveil.sensors.proxies.camera.RealCamera;
import java.io.Serializable;

// Referenced classes of package com.google.android.apps.unveil:
//            g

public class UnveilSettings
    implements Serializable
{

    public static final String SETTINGS_EXTRA = "UnveilSettings";
    private static final af a = new af();
    private static final long serialVersionUID = 0x2a93373162ae6c1cL;
    public final String cameraProxy;
    public final boolean groundtruth;
    public final Double latitude;
    public final Double longitude;
    public final int previousVersion;
    public final boolean useGLES2Overlay;
    public final boolean useLocalBarcode;
    public final boolean usePreviewFrame;

    public UnveilSettings(int i, String s, Double double1, Double double2, boolean flag, boolean flag1, boolean flag2, 
            boolean flag3)
    {
        previousVersion = i;
        cameraProxy = s;
        latitude = double1;
        longitude = double2;
        useGLES2Overlay = flag;
        useLocalBarcode = flag1;
        usePreviewFrame = flag2;
        groundtruth = flag3;
    }

    public UnveilSettings(Application application, SharedPreferences sharedpreferences)
    {
        int i;
        try
        {
            i = Integer.parseInt(sharedpreferences.getString(application.getString(g.previous_version_key), "0"));
        }
        // Misplaced declaration of an exception variable
        catch (Application application)
        {
            a.e("Invalid previous_version value in preferences.", new Object[0]);
            i = 0;
        }
        previousVersion = i;
        cameraProxy = com/google/android/apps/unveil/sensors/proxies/camera/RealCamera.getSimpleName();
        latitude = null;
        longitude = null;
        useGLES2Overlay = false;
        useLocalBarcode = true;
        usePreviewFrame = true;
        groundtruth = false;
    }

}
