// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.mdx;


// Referenced classes of package com.netflix.mediaclient.service.mdx:
//            TargetStateManager

static class ateId
{

    static final int $SwitchMap$com$netflix$mediaclient$service$mdx$TargetStateManager$StateId[];

    static 
    {
        $SwitchMap$com$netflix$mediaclient$service$mdx$TargetStateManager$StateId = new int[ateId.values().length];
        try
        {
            $SwitchMap$com$netflix$mediaclient$service$mdx$TargetStateManager$StateId[ateId.StateNotLaunched.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror14) { }
        try
        {
            $SwitchMap$com$netflix$mediaclient$service$mdx$TargetStateManager$StateId[ateId.StateNeedLaunched.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror13) { }
        try
        {
            $SwitchMap$com$netflix$mediaclient$service$mdx$TargetStateManager$StateId[ateId.StateLaunched.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror12) { }
        try
        {
            $SwitchMap$com$netflix$mediaclient$service$mdx$TargetStateManager$StateId[ateId.StateHasPair.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror11) { }
        try
        {
            $SwitchMap$com$netflix$mediaclient$service$mdx$TargetStateManager$StateId[ateId.StateBadPair.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror10) { }
        try
        {
            $SwitchMap$com$netflix$mediaclient$service$mdx$TargetStateManager$StateId[ateId.StateNoPair.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror9) { }
        try
        {
            $SwitchMap$com$netflix$mediaclient$service$mdx$TargetStateManager$StateId[ateId.StateNoPairNeedRegPair.ordinal()] = 7;
        }
        catch (NoSuchFieldError nosuchfielderror8) { }
        try
        {
            $SwitchMap$com$netflix$mediaclient$service$mdx$TargetStateManager$StateId[ateId.StateNeedRegPair.ordinal()] = 8;
        }
        catch (NoSuchFieldError nosuchfielderror7) { }
        try
        {
            $SwitchMap$com$netflix$mediaclient$service$mdx$TargetStateManager$StateId[ateId.StateNeedHandShake.ordinal()] = 9;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            $SwitchMap$com$netflix$mediaclient$service$mdx$TargetStateManager$StateId[ateId.StateSessionReady.ordinal()] = 10;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            $SwitchMap$com$netflix$mediaclient$service$mdx$TargetStateManager$StateId[ateId.StateSendingMessage.ordinal()] = 11;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            $SwitchMap$com$netflix$mediaclient$service$mdx$TargetStateManager$StateId[ateId.StateSessionEnd.ordinal()] = 12;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$com$netflix$mediaclient$service$mdx$TargetStateManager$StateId[ateId.StateRetryExhausted.ordinal()] = 13;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$netflix$mediaclient$service$mdx$TargetStateManager$StateId[ateId.StateTimeout.ordinal()] = 14;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$netflix$mediaclient$service$mdx$TargetStateManager$StateId[ateId.StateHasError.ordinal()] = 15;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
