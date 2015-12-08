// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.video.hw.codec.encoder.camera.capture;

import com.skype.android.video.hw.codec.encoder.camera.gl.GLException;
import com.skype.android.video.hw.utils.Log;

// Referenced classes of package com.skype.android.video.hw.codec.encoder.camera.capture:
//            VirtualCaptureSource

private class <init>
    implements Runnable
{

    final VirtualCaptureSource this$0;

    public void run()
    {
        synchronized (VirtualCaptureSource.access$100(VirtualCaptureSource.this))
        {
            VirtualCaptureSource.access$202(VirtualCaptureSource.this, VirtualCaptureSource.access$400(VirtualCaptureSource.this, VirtualCaptureSource.access$300(VirtualCaptureSource.this)));
        }
        VirtualCaptureSource.access$500(VirtualCaptureSource.this);
_L1:
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        GLException glexception;
        glexception;
        if (Log.isLoggable("SLIQ", 6))
        {
            Log.e("SLIQ", "Exception caught!", glexception);
            return;
        }
          goto _L1
    }

    private Y()
    {
        this$0 = VirtualCaptureSource.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
