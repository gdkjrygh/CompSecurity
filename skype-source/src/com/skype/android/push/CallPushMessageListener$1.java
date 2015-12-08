// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.push;


// Referenced classes of package com.skype.android.push:
//            CallPushMessageListener

static final class 
{

    static final int $SwitchMap$com$skype$SkyLib$PUSHHANDLINGRESULT[];

    static 
    {
        $SwitchMap$com$skype$SkyLib$PUSHHANDLINGRESULT = new int[com.skype.values().length];
        try
        {
            $SwitchMap$com$skype$SkyLib$PUSHHANDLINGRESULT[com.skype.CALL_SETUP_FAILED.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror9) { }
        try
        {
            $SwitchMap$com$skype$SkyLib$PUSHHANDLINGRESULT[com.skype.CALL_SETUP_FAILED_CANNOT_CONNECT.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror8) { }
        try
        {
            $SwitchMap$com$skype$SkyLib$PUSHHANDLINGRESULT[com.skype.CALL_SETUP_FAILED_NO_SIGNALING.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror7) { }
        try
        {
            $SwitchMap$com$skype$SkyLib$PUSHHANDLINGRESULT[com.skype.CALL_SETUP_FAILED_PUSH_IGNORED.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            $SwitchMap$com$skype$SkyLib$PUSHHANDLINGRESULT[com.skype.CALL_SETUP_FAILED_ANSWERED_ELSEWHERE.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            $SwitchMap$com$skype$SkyLib$PUSHHANDLINGRESULT[com.skype.CALL_SETUP_FAILED_CALL_ALREADY_ENDED.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            $SwitchMap$com$skype$SkyLib$PUSHHANDLINGRESULT[com.skype.CALL_SETUP_FAILED_CONFLICT.ordinal()] = 7;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$com$skype$SkyLib$PUSHHANDLINGRESULT[com.skype.CALL_SETUP_FAILED_NO_COMMON_CODEC.ordinal()] = 8;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$skype$SkyLib$PUSHHANDLINGRESULT[com.skype.CALL_SETUP_FAILED_NO_PERMISSION.ordinal()] = 9;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$skype$SkyLib$PUSHHANDLINGRESULT[com.skype.BAD_NOTIFICATION_PAYLOAD.ordinal()] = 10;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
