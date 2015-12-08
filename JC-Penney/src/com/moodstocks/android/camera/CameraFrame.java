// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.moodstocks.android.camera;


// Referenced classes of package com.moodstocks.android.camera:
//            Size

public class CameraFrame
{

    public byte data[];
    private ReleaseListener listener;
    public int orientation;
    public Size size;

    public CameraFrame(ReleaseListener releaselistener, byte abyte0[], Size size1, int i)
    {
        listener = releaselistener;
        data = abyte0;
        size = size1.clone();
        orientation = i;
    }

    public void release()
    {
        listener.onFrameReleased();
    }

    private class ReleaseListener
    {

        public abstract void onFrameReleased();
    }

}
