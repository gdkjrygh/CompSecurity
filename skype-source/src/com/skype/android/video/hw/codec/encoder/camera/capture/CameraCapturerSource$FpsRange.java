// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.video.hw.codec.encoder.camera.capture;


// Referenced classes of package com.skype.android.video.hw.codec.encoder.camera.capture:
//            CameraCapturerSource

private static class max
{

    public final int max;
    public final int min;

    public String toString()
    {
        return (new StringBuilder()).append((float)min / 1000F).append("-").append((float)max / 1000F).toString();
    }

    public (int i, int j)
    {
        min = i;
        max = j;
    }
}
