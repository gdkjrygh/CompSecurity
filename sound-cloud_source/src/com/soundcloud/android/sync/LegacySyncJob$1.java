// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync;


class on.Reason
{

    static final int $SwitchMap$com$soundcloud$android$api$ApiRequestException$Reason[];

    static 
    {
        $SwitchMap$com$soundcloud$android$api$ApiRequestException$Reason = new int[com.soundcloud.android.api.ion.Reason.values().length];
        try
        {
            $SwitchMap$com$soundcloud$android$api$ApiRequestException$Reason[com.soundcloud.android.api.ion.Reason.AUTH_ERROR.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror8) { }
        try
        {
            $SwitchMap$com$soundcloud$android$api$ApiRequestException$Reason[com.soundcloud.android.api.ion.Reason.NOT_ALLOWED.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror7) { }
        try
        {
            $SwitchMap$com$soundcloud$android$api$ApiRequestException$Reason[com.soundcloud.android.api.ion.Reason.NETWORK_ERROR.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            $SwitchMap$com$soundcloud$android$api$ApiRequestException$Reason[com.soundcloud.android.api.ion.Reason.SERVER_ERROR.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            $SwitchMap$com$soundcloud$android$api$ApiRequestException$Reason[com.soundcloud.android.api.ion.Reason.UNEXPECTED_RESPONSE.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            $SwitchMap$com$soundcloud$android$api$ApiRequestException$Reason[com.soundcloud.android.api.ion.Reason.BAD_REQUEST.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$com$soundcloud$android$api$ApiRequestException$Reason[com.soundcloud.android.api.ion.Reason.MALFORMED_INPUT.ordinal()] = 7;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$soundcloud$android$api$ApiRequestException$Reason[com.soundcloud.android.api.ion.Reason.NOT_FOUND.ordinal()] = 8;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$soundcloud$android$api$ApiRequestException$Reason[com.soundcloud.android.api.ion.Reason.RATE_LIMITED.ordinal()] = 9;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
