// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mobileads;


final class az
{

    static final int a[];

    static 
    {
        a = new int[com.mopub.common.util.DeviceUtils.ForceOrientation.values().length];
        try
        {
            a[com.mopub.common.util.DeviceUtils.ForceOrientation.FORCE_PORTRAIT.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            a[com.mopub.common.util.DeviceUtils.ForceOrientation.FORCE_LANDSCAPE.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[com.mopub.common.util.DeviceUtils.ForceOrientation.DEVICE_ORIENTATION.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[com.mopub.common.util.DeviceUtils.ForceOrientation.UNDEFINED.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
