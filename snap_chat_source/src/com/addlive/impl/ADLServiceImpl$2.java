// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.addlive.impl;

import com.addlive.service.AudioOutputDevice;

// Referenced classes of package com.addlive.impl:
//            ADLServiceImpl

static class ice
{

    static final int $SwitchMap$com$addlive$service$AudioOutputDevice[];

    static 
    {
        $SwitchMap$com$addlive$service$AudioOutputDevice = new int[AudioOutputDevice.values().length];
        try
        {
            $SwitchMap$com$addlive$service$AudioOutputDevice[AudioOutputDevice.LOUD_SPEAKER.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$addlive$service$AudioOutputDevice[AudioOutputDevice.PHONE_SPEAKER.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
