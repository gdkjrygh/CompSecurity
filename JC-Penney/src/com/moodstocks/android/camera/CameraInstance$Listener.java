// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.moodstocks.android.camera;


// Referenced classes of package com.moodstocks.android.camera:
//            Size

public interface 
{

    public abstract void onCameraOpenException(Exception exception);

    public abstract void onCameraOpenSuccess();

    public abstract void onNewFrame(byte abyte0[], Size size, int i);
}
