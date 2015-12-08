// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.video.hw.codec.encoder.camera.capture;


// Referenced classes of package com.skype.android.video.hw.codec.encoder.camera.capture:
//            CapturerSinks, CapturerException

private class  extends 
{

    final CapturerSinks this$0;

    public boolean canReleaseSurface()
    {
        return false;
    }

    public float getTargetFrameRate()
    {
        return 0.0F;
    }

    public com.skype.android.video.hw.codec.encoder.camera.gl.utType getType()
    {
        return com.skype.android.video.hw.codec.encoder.camera.gl.utType.SCREEN;
    }

    public void onFrameCaptured(long l)
    {
    }

    public boolean pushFrame()
        throws CapturerException
    {
        return false;
    }

    public void setTargetFrameRate(float f)
    {
    }

    public e(Object obj, e e, int i)
    {
        this$0 = CapturerSinks.this;
        super(CapturerSinks.this, obj, e, i);
    }
}
