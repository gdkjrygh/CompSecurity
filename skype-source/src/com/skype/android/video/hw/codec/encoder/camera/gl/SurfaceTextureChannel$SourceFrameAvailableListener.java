// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.video.hw.codec.encoder.camera.gl;

import android.graphics.SurfaceTexture;

// Referenced classes of package com.skype.android.video.hw.codec.encoder.camera.gl:
//            SurfaceTextureChannel

private class <init>
    implements android.graphics.nnel.SourceFrameAvailableListener
{

    final SurfaceTextureChannel this$0;

    public void onFrameAvailable(SurfaceTexture surfacetexture)
    {
        synchronized (SurfaceTextureChannel.access$100(SurfaceTextureChannel.this))
        {
            SurfaceTextureChannel.access$202(SurfaceTextureChannel.this, this._fld0);
            SurfaceTextureChannel.access$100(SurfaceTextureChannel.this).notifyAll();
        }
        return;
        exception;
        surfacetexture;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private ()
    {
        this$0 = SurfaceTextureChannel.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
