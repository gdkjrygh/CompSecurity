// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.video.hw.codec.encoder.camera.capture;

import android.graphics.SurfaceTexture;
import com.skype.android.video.hw.format.Resolution;
import java.io.Closeable;

// Referenced classes of package com.skype.android.video.hw.codec.encoder.camera.capture:
//            CapturerException

public interface CapturerSource
    extends Closeable
{

    public abstract void configure(Resolution resolution, int i)
        throws CapturerException;

    public abstract long getNativeCtx();

    public abstract void setFramerate(int i)
        throws CapturerException;

    public abstract void setResolution(Resolution resolution)
        throws CapturerException;

    public abstract void setSurfaceTexture(SurfaceTexture surfacetexture)
        throws CapturerException;

    public abstract void start()
        throws CapturerException;

    public abstract void stop();

    public abstract void unlock();
}
