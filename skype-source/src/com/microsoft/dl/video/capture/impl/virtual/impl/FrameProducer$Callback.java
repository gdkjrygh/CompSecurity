// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.dl.video.capture.impl.virtual.impl;

import com.microsoft.dl.video.capture.api.ImageFormat;
import com.microsoft.dl.video.capture.api.Resolution;
import java.nio.ByteBuffer;

// Referenced classes of package com.microsoft.dl.video.capture.impl.virtual.impl:
//            FrameProducer

public static interface 
{

    public abstract byte[] getBuffer(int i, long l);

    public abstract void onFrameCaptured(ByteBuffer bytebuffer, ImageFormat imageformat, Resolution resolution);

    public abstract void onFrameReady(byte abyte0[]);
}
