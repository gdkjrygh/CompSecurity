// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.addlive.impl;

import com.addlive.service.MediaType;

// Referenced classes of package com.addlive.impl:
//            ADLNativeWrapperImpl

static class thodName
{

    static final int $SwitchMap$com$addlive$impl$ADLNativeWrapperImpl$MethodName[];
    static final int $SwitchMap$com$addlive$service$MediaType[];

    static 
    {
        $SwitchMap$com$addlive$service$MediaType = new int[MediaType.values().length];
        try
        {
            $SwitchMap$com$addlive$service$MediaType[MediaType.AUDIO.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror8) { }
        try
        {
            $SwitchMap$com$addlive$service$MediaType[MediaType.VIDEO.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror7) { }
        try
        {
            $SwitchMap$com$addlive$service$MediaType[MediaType.SCREEN.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        $SwitchMap$com$addlive$impl$ADLNativeWrapperImpl$MethodName = new int[thodName.values().length];
        try
        {
            $SwitchMap$com$addlive$impl$ADLNativeWrapperImpl$MethodName[thodName.DISCONNECT.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            $SwitchMap$com$addlive$impl$ADLNativeWrapperImpl$MethodName[thodName.GET_VIDEO_CAPTURE_DEVICE_NAMES.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            $SwitchMap$com$addlive$impl$ADLNativeWrapperImpl$MethodName[thodName.GET_VIDEO_CAPTURE_DEVICE.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$com$addlive$impl$ADLNativeWrapperImpl$MethodName[thodName.SET_VIDEO_CAPTURE_DEVICE.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$addlive$impl$ADLNativeWrapperImpl$MethodName[thodName.SET_PROPERTY.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$addlive$impl$ADLNativeWrapperImpl$MethodName[thodName.STOP_LOCAL_VIDEO.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
