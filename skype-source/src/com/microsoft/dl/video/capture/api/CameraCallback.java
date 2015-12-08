// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.dl.video.capture.api;


// Referenced classes of package com.microsoft.dl.video.capture.api:
//            Camera

public interface CameraCallback
{

    public abstract void onError(int i, Camera camera);

    public abstract void onFrame(byte abyte0[], Camera camera);
}
