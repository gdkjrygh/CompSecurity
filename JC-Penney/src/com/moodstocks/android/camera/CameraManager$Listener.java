// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.moodstocks.android.camera;


// Referenced classes of package com.moodstocks.android.camera:
//            CameraFrame

public interface 
{

    public abstract boolean isListening();

    public abstract void onCameraOpenException(Exception exception);

    public abstract void onNewFrameInBackground(CameraFrame cameraframe);
}
