// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.snapchat.android.util.eventbus.CameraDisplayState;

public final class Mh
{

    public final com.snapchat.android.camera.model.CameraModel.CameraType cameraToResume;
    public final CameraDisplayState displayState;

    public Mh(CameraDisplayState cameradisplaystate)
    {
        this(cameradisplaystate, null);
    }

    public Mh(CameraDisplayState cameradisplaystate, com.snapchat.android.camera.model.CameraModel.CameraType cameratype)
    {
        displayState = (CameraDisplayState)dv.a(cameradisplaystate);
        cameraToResume = cameratype;
    }

    public final boolean a()
    {
        return displayState != CameraDisplayState.CLOSE;
    }
}
