// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.video.hw.utils;

import java.util.Map;
import java.util.Set;

// Referenced classes of package com.skype.android.video.hw.utils:
//            CodecUtils

private static class 
{

    private static Map decoderCapabilities;
    private static Map encoderCapabilities;

    public static String[] enumCodecs(boolean flag)
    {
        Map map;
        if (flag)
        {
            map = getEncoderCapabilities();
        } else
        {
            map = getDecoderCapabilities();
        }
        return (String[])map.keySet().toArray(new String[map.size()]);
    }

    public static Map getDecoderCapabilities()
    {
        com/skype/android/video/hw/utils/CodecUtils$CapabilitiesHandler;
        JVM INSTR monitorenter ;
        Map map;
        if (decoderCapabilities == null)
        {
            decoderCapabilities = CodecUtils.access$000(false);
        }
        map = decoderCapabilities;
        com/skype/android/video/hw/utils/CodecUtils$CapabilitiesHandler;
        JVM INSTR monitorexit ;
        return map;
        Exception exception;
        exception;
        throw exception;
    }

    public static Map getEncoderCapabilities()
    {
        com/skype/android/video/hw/utils/CodecUtils$CapabilitiesHandler;
        JVM INSTR monitorenter ;
        Map map;
        if (encoderCapabilities == null)
        {
            encoderCapabilities = CodecUtils.access$000(true);
        }
        map = encoderCapabilities;
        com/skype/android/video/hw/utils/CodecUtils$CapabilitiesHandler;
        JVM INSTR monitorexit ;
        return map;
        Exception exception;
        exception;
        throw exception;
    }

    private ()
    {
    }
}
