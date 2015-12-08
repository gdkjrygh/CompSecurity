// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.video.hw.codec.encoder.camera.capture;

import com.skype.android.video.hw.codec.encoder.camera.gl.GLException;
import com.skype.android.video.hw.utils.Log;
import java.io.Closeable;
import java.util.concurrent.TimeoutException;

// Referenced classes of package com.skype.android.video.hw.codec.encoder.camera.capture:
//            Capturer, CapturerException, CapturerParameters

private class cb
    implements Closeable, Runnable
{

    private static final long CAPTURE_TIMEOUT_MS = 0x7fffffffffffffffL;
    private final CapturerParameters capturerParameters;
    private final vents cb;
    private volatile boolean shallRun;
    final Capturer this$0;

    public void close()
    {
        if (Log.isLoggable("SLIQ", 4))
        {
            Log.i("SLIQ", (new StringBuilder()).append(com/skype/android/video/hw/codec/encoder/camera/capture/Capturer$Runner.getSimpleName()).append(": Requesting exit").toString());
        }
        shallRun = false;
    }

    public void run()
    {
        if (capturerParameters == null)
        {
            throw new IllegalStateException("no capture parameters set");
        }
        if (Log.isLoggable("SLIQ", 4))
        {
            Log.i("SLIQ", (new StringBuilder()).append(com/skype/android/video/hw/codec/encoder/camera/capture/Capturer$Runner.getSimpleName()).append(": Entering").toString());
        }
        if (Capturer.access$000(Capturer.this) == null)
        {
            setup(capturerParameters);
        }
        if (cb != null)
        {
            cb.onStarted();
        }
        while (shallRun) 
        {
            Capturer.access$100(Capturer.this, 0x7fffffffffffffffL);
        }
          goto _L1
        Object obj;
        obj;
        if (Log.isLoggable("SLIQ", 6))
        {
            Log.e("SLIQ", (new StringBuilder()).append(com/skype/android/video/hw/codec/encoder/camera/capture/Capturer$Runner.getSimpleName()).append(": UnexpectedException caught").toString(), ((Throwable) (obj)));
        }
        Capturer.access$200(Capturer.this);
        Capturer.access$302(Capturer.this, false);
        if (cb != null)
        {
            cb.onFailed(((Exception) (obj)));
        }
        if (cb != null)
        {
            cb.onStopped();
        }
        if (Log.isLoggable("SLIQ", 4))
        {
            Log.i("SLIQ", (new StringBuilder()).append(com/skype/android/video/hw/codec/encoder/camera/capture/Capturer$Runner.getSimpleName()).append(": Leaving").toString());
        }
_L2:
        return;
_L1:
        Capturer.access$200(Capturer.this);
        Capturer.access$302(Capturer.this, false);
        if (cb != null)
        {
            cb.onStopped();
        }
        if (Log.isLoggable("SLIQ", 4))
        {
            Log.i("SLIQ", (new StringBuilder()).append(com/skype/android/video/hw/codec/encoder/camera/capture/Capturer$Runner.getSimpleName()).append(": Leaving").toString());
            return;
        }
          goto _L2
        obj;
        if (Log.isLoggable("SLIQ", 6))
        {
            Log.e("SLIQ", (new StringBuilder()).append(com/skype/android/video/hw/codec/encoder/camera/capture/Capturer$Runner.getSimpleName()).append(": Capturing has failed").toString(), ((Throwable) (obj)));
        }
        Capturer.access$200(Capturer.this);
        Capturer.access$302(Capturer.this, false);
        if (cb != null)
        {
            cb.onFailed(((Exception) (obj)));
        }
        if (cb != null)
        {
            cb.onStopped();
        }
        if (Log.isLoggable("SLIQ", 4))
        {
            Log.i("SLIQ", (new StringBuilder()).append(com/skype/android/video/hw/codec/encoder/camera/capture/Capturer$Runner.getSimpleName()).append(": Leaving").toString());
            return;
        }
          goto _L2
        obj;
        if (Log.isLoggable("SLIQ", 4))
        {
            Log.i("SLIQ", (new StringBuilder()).append(com/skype/android/video/hw/codec/encoder/camera/capture/Capturer$Runner.getSimpleName()).append(": Interrupted").toString());
        }
        Capturer.access$200(Capturer.this);
        Capturer.access$302(Capturer.this, false);
        if (cb != null)
        {
            cb.onStopped();
        }
        if (Log.isLoggable("SLIQ", 4))
        {
            Log.i("SLIQ", (new StringBuilder()).append(com/skype/android/video/hw/codec/encoder/camera/capture/Capturer$Runner.getSimpleName()).append(": Leaving").toString());
            return;
        }
          goto _L2
        obj;
        if (Log.isLoggable("SLIQ", 6))
        {
            Log.e("SLIQ", (new StringBuilder()).append(com/skype/android/video/hw/codec/encoder/camera/capture/Capturer$Runner.getSimpleName()).append(": Timeout expired").toString());
        }
        Capturer.access$200(Capturer.this);
        Capturer.access$302(Capturer.this, false);
        if (cb != null)
        {
            cb.onFailed(((Exception) (obj)));
        }
        if (cb != null)
        {
            cb.onStopped();
        }
        if (Log.isLoggable("SLIQ", 4))
        {
            Log.i("SLIQ", (new StringBuilder()).append(com/skype/android/video/hw/codec/encoder/camera/capture/Capturer$Runner.getSimpleName()).append(": Leaving").toString());
            return;
        }
          goto _L2
        obj;
        if (Log.isLoggable("SLIQ", 6))
        {
            Log.e("SLIQ", (new StringBuilder()).append(com/skype/android/video/hw/codec/encoder/camera/capture/Capturer$Runner.getSimpleName()).append(": GL Error").toString());
        }
        Capturer.access$200(Capturer.this);
        Capturer.access$302(Capturer.this, false);
        if (cb != null)
        {
            cb.onStopped();
        }
        if (!Log.isLoggable("SLIQ", 4)) goto _L2; else goto _L3
_L3:
        Log.i("SLIQ", (new StringBuilder()).append(com/skype/android/video/hw/codec/encoder/camera/capture/Capturer$Runner.getSimpleName()).append(": Leaving").toString());
        return;
        obj;
        if (cb != null)
        {
            cb.onStopped();
        }
        if (Log.isLoggable("SLIQ", 4))
        {
            Log.i("SLIQ", (new StringBuilder()).append(com/skype/android/video/hw/codec/encoder/camera/capture/Capturer$Runner.getSimpleName()).append(": Leaving").toString());
        }
        throw obj;
    }

    public vents(CapturerParameters capturerparameters, vents vents)
    {
        this$0 = Capturer.this;
        super();
        shallRun = true;
        capturerParameters = capturerparameters;
        cb = vents;
    }
}
