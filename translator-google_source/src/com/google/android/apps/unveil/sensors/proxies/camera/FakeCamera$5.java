// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.sensors.proxies.camera;


class llbackType
{

    static final int $SwitchMap$com$google$android$apps$unveil$sensors$proxies$camera$FakeCamera$CallbackType[];

    static 
    {
        $SwitchMap$com$google$android$apps$unveil$sensors$proxies$camera$FakeCamera$CallbackType = new int[llbackType.values().length];
        try
        {
            $SwitchMap$com$google$android$apps$unveil$sensors$proxies$camera$FakeCamera$CallbackType[llbackType.WITH_BUFFER.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$google$android$apps$unveil$sensors$proxies$camera$FakeCamera$CallbackType[llbackType.ONESHOT.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$google$android$apps$unveil$sensors$proxies$camera$FakeCamera$CallbackType[llbackType.REPEATING.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
