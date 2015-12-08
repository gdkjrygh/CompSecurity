// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.mdx;


// Referenced classes of package com.netflix.mediaclient.service.mdx:
//            TargetStateManager

public static final class  extends Enum
{

    private static final StateHasError $VALUES[];
    public static final StateHasError StateBadPair;
    public static final StateHasError StateHasError;
    public static final StateHasError StateHasPair;
    public static final StateHasError StateLaunched;
    public static final StateHasError StateNeedHandShake;
    public static final StateHasError StateNeedLaunched;
    public static final StateHasError StateNeedRegPair;
    public static final StateHasError StateNoPair;
    public static final StateHasError StateNoPairNeedRegPair;
    public static final StateHasError StateNotLaunched;
    public static final StateHasError StateRetryExhausted;
    public static final StateHasError StateSendingMessage;
    public static final StateHasError StateSessionEnd;
    public static final StateHasError StateSessionReady;
    public static final StateHasError StateTimeout;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/netflix/mediaclient/service/mdx/TargetStateManager$StateId, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        StateNotLaunched = new <init>("StateNotLaunched", 0);
        StateNeedLaunched = new <init>("StateNeedLaunched", 1);
        StateLaunched = new <init>("StateLaunched", 2);
        StateHasPair = new <init>("StateHasPair", 3);
        StateBadPair = new <init>("StateBadPair", 4);
        StateNoPair = new <init>("StateNoPair", 5);
        StateNoPairNeedRegPair = new <init>("StateNoPairNeedRegPair", 6);
        StateNeedRegPair = new <init>("StateNeedRegPair", 7);
        StateNeedHandShake = new <init>("StateNeedHandShake", 8);
        StateSessionReady = new <init>("StateSessionReady", 9);
        StateSendingMessage = new <init>("StateSendingMessage", 10);
        StateSessionEnd = new <init>("StateSessionEnd", 11);
        StateRetryExhausted = new <init>("StateRetryExhausted", 12);
        StateTimeout = new <init>("StateTimeout", 13);
        StateHasError = new <init>("StateHasError", 14);
        $VALUES = (new .VALUES[] {
            StateNotLaunched, StateNeedLaunched, StateLaunched, StateHasPair, StateBadPair, StateNoPair, StateNoPairNeedRegPair, StateNeedRegPair, StateNeedHandShake, StateSessionReady, 
            StateSendingMessage, StateSessionEnd, StateRetryExhausted, StateTimeout, StateHasError
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
