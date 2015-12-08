// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.video.capture;

import com.skype.android.platform.capture.ImageFormat;

// Referenced classes of package com.skype.android.video.capture:
//            JavaCamera

static class t
{

    static final int $SwitchMap$com$skype$android$platform$capture$ImageFormat[];

    static 
    {
        $SwitchMap$com$skype$android$platform$capture$ImageFormat = new int[ImageFormat.values().length];
        try
        {
            $SwitchMap$com$skype$android$platform$capture$ImageFormat[ImageFormat.a.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$skype$android$platform$capture$ImageFormat[ImageFormat.b.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
