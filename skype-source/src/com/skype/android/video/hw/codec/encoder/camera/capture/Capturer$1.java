// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.video.hw.codec.encoder.camera.capture;

import android.graphics.SurfaceTexture;
import com.skype.android.video.hw.codec.encoder.camera.gl.SurfaceTextureChannel;

// Referenced classes of package com.skype.android.video.hw.codec.encoder.camera.capture:
//            Capturer

class annel extends SurfaceTextureChannel
{

    final Capturer this$0;

    protected long getTimestamp(SurfaceTexture surfacetexture)
    {
        return doOverrideFrameTimestamp(surfacetexture.getTimestamp());
    }

    annel(boolean flag)
    {
        this$0 = Capturer.this;
        super(flag);
    }
}
