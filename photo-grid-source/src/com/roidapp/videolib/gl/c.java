// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.videolib.gl;

import com.roidapp.videolib.b.i;

// Referenced classes of package com.roidapp.videolib.gl:
//            GPUVideoView

final class c
    implements Runnable
{

    final GPUVideoView a;

    c(GPUVideoView gpuvideoview)
    {
        a = gpuvideoview;
        super();
    }

    public final void run()
    {
        GPUVideoView.a(a).a();
        a.requestRender();
    }
}
