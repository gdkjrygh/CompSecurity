// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.onboarding.auth.tasks;


class 
{

    static final int $SwitchMap$com$soundcloud$android$api$ApiRequestException$Reason[];

    static 
    {
        $SwitchMap$com$soundcloud$android$api$ApiRequestException$Reason = new int[com.soundcloud.android.api.eption.Reason.values().length];
        try
        {
            $SwitchMap$com$soundcloud$android$api$ApiRequestException$Reason[com.soundcloud.android.api.eption.Reason.VALIDATION_ERROR.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$soundcloud$android$api$ApiRequestException$Reason[com.soundcloud.android.api.eption.Reason.NOT_ALLOWED.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$soundcloud$android$api$ApiRequestException$Reason[com.soundcloud.android.api.eption.Reason.SERVER_ERROR.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
