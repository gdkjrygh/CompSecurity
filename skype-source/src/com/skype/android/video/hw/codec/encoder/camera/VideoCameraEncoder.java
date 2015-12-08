// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.video.hw.codec.encoder.camera;

import android.media.MediaCodec;
import android.view.Surface;
import com.skype.android.video.hw.codec.encoder.AbstractVideoEncoder;
import com.skype.android.video.hw.format.ColorFormat;
import com.skype.android.video.hw.format.VideoFormat;
import com.skype.android.video.hw.frame.OutputFrame;
import com.skype.android.video.hw.utils.Log;
import java.lang.ref.WeakReference;

// Referenced classes of package com.skype.android.video.hw.codec.encoder.camera:
//            SurfaceObserver

public class VideoCameraEncoder extends AbstractVideoEncoder
{

    private Surface inputSurface;
    private WeakReference weakRefSurfaceObserver;

    public VideoCameraEncoder(String s)
    {
        super(s);
    }

    public void close()
    {
        SurfaceObserver surfaceobserver = (SurfaceObserver)weakRefSurfaceObserver.get();
        if (surfaceobserver == null) goto _L2; else goto _L1
_L1:
        surfaceobserver.detachSurface();
_L4:
        super.close();
        return;
_L2:
        if (inputSurface != null)
        {
            inputSurface.release();
            inputSurface = null;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void configure(Object obj, VideoFormat videoformat, boolean flag)
    {
        if (!videoformat.getColorFormat().equals(ColorFormat.SURFACE))
        {
            if (Log.isLoggable("SLIQ", 5))
            {
                Log.w("SLIQ", (new StringBuilder()).append(getClass().getSimpleName()).append(": ").append(ColorFormat.SURFACE).append(" color format is expected").toString());
            }
            videoformat.setColorFormat(ColorFormat.SURFACE);
        }
        weakRefSurfaceObserver = new WeakReference((SurfaceObserver)obj);
        obj = (SurfaceObserver)weakRefSurfaceObserver.get();
        super.configure(obj, videoformat, flag);
        inputSurface = mediaCodec.createInputSurface();
        if (obj != null)
        {
            ((SurfaceObserver) (obj)).attachSurface(inputSurface, videoformat.getResolution());
            return;
        } else
        {
            inputSurface.release();
            inputSurface = null;
            return;
        }
    }

    public OutputFrame encode(long l)
    {
        return super.drainCodec(l);
    }
}
