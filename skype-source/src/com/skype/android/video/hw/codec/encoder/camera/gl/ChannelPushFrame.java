// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.video.hw.codec.encoder.camera.gl;


// Referenced classes of package com.skype.android.video.hw.codec.encoder.camera.gl:
//            GLException

public interface ChannelPushFrame
{

    public abstract boolean executePushFrame(int i)
        throws GLException;
}
