// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.videolib.gl;


// Referenced classes of package com.roidapp.videolib.gl:
//            GPUVideoView

final class b
    implements Runnable
{

    final GPUVideoView a;

    b(GPUVideoView gpuvideoview)
    {
        a = gpuvideoview;
        super();
    }

    public final void run()
    {
        a.setRenderMode(1);
    }
}
