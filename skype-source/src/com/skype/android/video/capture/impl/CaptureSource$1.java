// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.video.capture.impl;

import com.skype.android.platform.capture.ImageFormat;

// Referenced classes of package com.skype.android.video.capture.impl:
//            CaptureSource

static class 
{

    static final int $SwitchMap$com$skype$android$platform$capture$CameraInfo$Facing[];
    static final int $SwitchMap$com$skype$android$platform$capture$ImageFormat[];

    static 
    {
        $SwitchMap$com$skype$android$platform$capture$ImageFormat = new int[ImageFormat.values().length];
        try
        {
            $SwitchMap$com$skype$android$platform$capture$ImageFormat[ImageFormat.b.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$com$skype$android$platform$capture$ImageFormat[ImageFormat.a.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        $SwitchMap$com$skype$android$platform$capture$CameraInfo$Facing = new int[com.skype.android.platform.capture.g.values().length];
        try
        {
            $SwitchMap$com$skype$android$platform$capture$CameraInfo$Facing[com.skype.android.platform.capture.g.b.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$skype$android$platform$capture$CameraInfo$Facing[com.skype.android.platform.capture.g.a.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
