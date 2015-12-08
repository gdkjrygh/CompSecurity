// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.media;

import android.hardware.Camera;

// Referenced classes of package com.skype.android.media:
//            Size, SurfaceWrapper, ScaleMode

public interface CameraControl
{

    public abstract Camera getCamera();

    public abstract int getCameraFacing();

    public abstract int getCameraId();

    public abstract android.hardware.Camera.Parameters getCameraParameters();

    public abstract int getOrientationHint();

    public abstract Size getPreviewSize();

    public abstract SurfaceWrapper getPreviewSurface();

    public abstract ScaleMode getScaleMode();
}
