// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.payments;


class 
{

    static final int $SwitchMap$com$soundcloud$android$api$ApiRequestException$Reason[];

    static 
    {
        $SwitchMap$com$soundcloud$android$api$ApiRequestException$Reason = new int[com.soundcloud.android.api.on.values().length];
        try
        {
            $SwitchMap$com$soundcloud$android$api$ApiRequestException$Reason[com.soundcloud.android.api.on.BAD_REQUEST.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$soundcloud$android$api$ApiRequestException$Reason[com.soundcloud.android.api.on.NOT_FOUND.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
