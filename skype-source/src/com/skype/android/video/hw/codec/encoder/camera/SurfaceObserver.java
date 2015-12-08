// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.video.hw.codec.encoder.camera;

import android.view.Surface;
import com.skype.android.video.hw.codec.encoder.camera.capture.CapturerException;
import com.skype.android.video.hw.format.Resolution;

public interface SurfaceObserver
{

    public abstract void attachSurface(Surface surface, Resolution resolution);

    public abstract void detachSurface();

    public abstract float getTargetFrameRate();

    public abstract boolean pushFrame()
        throws CapturerException;

    public abstract void setTargetFrameRate(float f);
}
