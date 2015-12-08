// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.video.hw.factory;

import com.skype.android.video.hw.extension.decoder.VideoDecoderExtension;
import com.skype.android.video.hw.extension.decoder.VideoDecoderExtensionFactory;
import com.skype.android.video.hw.extension.encoder.VideoEncoderExtension;
import com.skype.android.video.hw.extension.encoder.VideoEncoderExtensionFactory;

public class ExtensionFactory
{

    private static VideoDecoderExtensionFactory videoDecoderExtensionFactory;
    private static VideoEncoderExtensionFactory videoEncoderExtensionFactory;

    public ExtensionFactory()
    {
    }

    public static VideoDecoderExtension createVideoDecoderExtension(int i)
    {
        com/skype/android/video/hw/factory/ExtensionFactory;
        JVM INSTR monitorenter ;
        Object obj = videoDecoderExtensionFactory;
        if (obj != null) goto _L2; else goto _L1
_L1:
        obj = null;
_L4:
        com/skype/android/video/hw/factory/ExtensionFactory;
        JVM INSTR monitorexit ;
        return ((VideoDecoderExtension) (obj));
_L2:
        obj = videoDecoderExtensionFactory.create(i);
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public static VideoEncoderExtension createVideoEncoderExtension(int i)
    {
        com/skype/android/video/hw/factory/ExtensionFactory;
        JVM INSTR monitorenter ;
        Object obj = videoEncoderExtensionFactory;
        if (obj != null) goto _L2; else goto _L1
_L1:
        obj = null;
_L4:
        com/skype/android/video/hw/factory/ExtensionFactory;
        JVM INSTR monitorexit ;
        return ((VideoEncoderExtension) (obj));
_L2:
        obj = videoEncoderExtensionFactory.create(i);
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public static native void initNative();

    public static void setVideoDecoderExtensionFactory(VideoDecoderExtensionFactory videodecoderextensionfactory)
    {
        com/skype/android/video/hw/factory/ExtensionFactory;
        JVM INSTR monitorenter ;
        videoDecoderExtensionFactory = videodecoderextensionfactory;
        com/skype/android/video/hw/factory/ExtensionFactory;
        JVM INSTR monitorexit ;
        return;
        videodecoderextensionfactory;
        throw videodecoderextensionfactory;
    }

    public static void setVideoEncoderExtensionFactory(VideoEncoderExtensionFactory videoencoderextensionfactory)
    {
        com/skype/android/video/hw/factory/ExtensionFactory;
        JVM INSTR monitorenter ;
        videoEncoderExtensionFactory = videoencoderextensionfactory;
        com/skype/android/video/hw/factory/ExtensionFactory;
        JVM INSTR monitorexit ;
        return;
        videoencoderextensionfactory;
        throw videoencoderextensionfactory;
    }
}
