// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.video.capture;

import com.skype.android.util.Log;
import com.skype.android.video.hw.codec.encoder.camera.capture.Capturer;

// Referenced classes of package com.skype.android.video.capture:
//            MediaCodecCapturer

class this._cls0
    implements com.skype.android.video.hw.codec.encoder.camera.capture.
{

    final MediaCodecCapturer this$0;

    public void onFailed(Exception exception)
    {
        if (Log.isLoggable("Capture", 6))
        {
            Log.e("Capture", "Failed", exception);
        }
        (new Thread(new Runnable() {

            final MediaCodecCapturer._cls1 this$1;

            public void run()
            {
                MediaCodecCapturer.onCapturingFailed(nativeObj);
            }

            
            {
                this$1 = MediaCodecCapturer._cls1.this;
                super();
            }
        })).start();
        MediaCodecCapturer.access$400(MediaCodecCapturer.this).closeSinks();
    }

    public void onStarted()
    {
        synchronized (MediaCodecCapturer.access$100(MediaCodecCapturer.this))
        {
            if (Log.isLoggable("Capture", 4))
            {
                Log.i("Capture", "Started");
            }
            MediaCodecCapturer.access$202(MediaCodecCapturer.this, true);
            MediaCodecCapturer.access$100(MediaCodecCapturer.this).notifyAll();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void onStopped()
    {
        synchronized (MediaCodecCapturer.access$300(MediaCodecCapturer.this))
        {
            if (Log.isLoggable("Capture", 4))
            {
                Log.i("Capture", "Stopped");
            }
            MediaCodecCapturer.access$202(MediaCodecCapturer.this, false);
            MediaCodecCapturer.access$300(MediaCodecCapturer.this).notifyAll();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    _cls1.this._cls1()
    {
        this$0 = MediaCodecCapturer.this;
        super();
    }
}
