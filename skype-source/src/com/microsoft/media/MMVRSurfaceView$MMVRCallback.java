// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.media;


// Referenced classes of package com.microsoft.media:
//            MMVRSurfaceView

public static interface 
{

    public abstract void onFrameRendered(MMVRSurfaceView mmvrsurfaceview);

    public abstract void onRenderSizeChanged(MMVRSurfaceView mmvrsurfaceview, int i, int j);

    public abstract void onSmartCropInfoChanged(MMVRSurfaceView mmvrsurfaceview, int i, int j, int k, int l, int i1);

    public abstract void onSurfaceCreated(MMVRSurfaceView mmvrsurfaceview);
}
