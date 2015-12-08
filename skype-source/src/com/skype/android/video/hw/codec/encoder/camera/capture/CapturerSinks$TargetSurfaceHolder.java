// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.video.hw.codec.encoder.camera.capture;

import android.view.Surface;
import com.skype.android.video.hw.format.Resolution;
import com.skype.android.video.hw.utils.Log;
import java.io.Closeable;

// Referenced classes of package com.skype.android.video.hw.codec.encoder.camera.capture:
//            CapturerSinks, Capturer

public static class resolution
    implements Closeable
{

    private final boolean canReleaseSurface;
    private Resolution resolution;
    private Surface surface;

    public void close()
    {
        if (surface != null)
        {
            if (canReleaseSurface)
            {
                if (Log.isLoggable("SLIQ", 4))
                {
                    Log.i("SLIQ", (new StringBuilder()).append(com/skype/android/video/hw/codec/encoder/camera/capture/Capturer.getSimpleName()).append(": Releasing surface: ").append(this).toString());
                }
                surface.release();
            }
            surface = null;
        }
        resolution = null;
    }

    public Resolution getResolution()
    {
        return resolution;
    }

    public Surface getSurface()
    {
        return surface;
    }

    public void setResolution(Resolution resolution1)
    {
        resolution = resolution1;
    }

    public String toString()
    {
        return (new StringBuilder()).append(surface).append(" at ").append(resolution).toString();
    }

    public (Surface surface1, Resolution resolution1, boolean flag)
    {
        canReleaseSurface = flag;
        surface = surface1;
        resolution = resolution1;
    }
}
