// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.dl.video.capture.impl;

import android.graphics.SurfaceTexture;
import com.microsoft.dl.utils.Log;

// Referenced classes of package com.microsoft.dl.video.capture.impl:
//            DummyPreviewSurface

private static class <init>
    implements android.graphics.eAvailableListener
{

    public void onFrameAvailable(SurfaceTexture surfacetexture)
    {
        if (Log.isLoggable("Capture", 3))
        {
            Log.d("Capture", "Preview frame skipped");
        }
    }

    private ()
    {
    }

    (byte byte0)
    {
        this();
    }
}
