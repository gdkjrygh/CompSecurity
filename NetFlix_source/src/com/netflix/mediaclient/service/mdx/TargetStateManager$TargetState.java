// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.mdx;


// Referenced classes of package com.netflix.mediaclient.service.mdx:
//            TargetStateManager

public static final class mBaseRetryIntreval extends Enum
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
    private int mBaseRetryIntreval;
    private StateHasError mId;
    private String mName;
    private int mRetry;
    private int mTimeOut;

    public static mBaseRetryIntreval valueOf(String s)
    {
        return (mBaseRetryIntreval)Enum.valueOf(com/netflix/mediaclient/service/mdx/TargetStateManager$TargetState, s);
    }

    public static mBaseRetryIntreval[] values()
    {
        return (mBaseRetryIntreval[])$VALUES.clone();
    }

    public e_3B_.clone getId()
    {
        return mId;
    }

    public String getName()
    {
        return mName;
    }

    public int getRetry()
    {
        return mRetry;
    }

    public int getRetryInterval()
    {
        return mBaseRetryIntreval;
    }

    public int getTimeOut()
    {
        return mTimeOut;
    }

    static 
    {
        StateNotLaunched = new <init>("StateNotLaunched", 0, eNotLaunched, "notlaunched", 0, 0, 1000);
        StateNeedLaunched = new <init>("StateNeedLaunched", 1, eNeedLaunched, "needlaunch", 1, 40000, 7000);
        StateLaunched = new <init>("StateLaunched", 2, eLaunched, "launched", 0, 0, 1000);
        StateHasPair = new <init>("StateHasPair", 3, eHasPair, "haspair", 2, 8000, 1000);
        StateBadPair = new <init>("StateBadPair", 4, eBadPair, "badpair", 0, 0, 1000);
        StateNoPair = new <init>("StateNoPair", 5, eNoPair, "nopair", 3, 24000, 3000);
        StateNoPairNeedRegPair = new <init>("StateNoPairNeedRegPair", 6, eNoPairNeedRegPair, "nopairneedregpair", 0, 0, 1000);
        StateNeedRegPair = new <init>("StateNeedRegPair", 7, eNeedRegPair, "needregpair", 3, 32000, 4000);
        StateNeedHandShake = new <init>("StateNeedHandShake", 8, eNeedHandShake, "needhandshake", 2, 8000, 1000);
        StateSessionReady = new <init>("StateSessionReady", 9, eSessionReady, "sessionready", 0, 0, 1000);
        StateSendingMessage = new <init>("StateSendingMessage", 10, eSendingMessage, "sendingmessage", 2, 8000, 1000);
        StateSessionEnd = new <init>("StateSessionEnd", 11, eSessionEnd, "sessionend", 0, 8000, 1000);
        StateRetryExhausted = new <init>("StateRetryExhausted", 12, eRetryExhausted, "retryexhausted", 0, 0, 1000);
        StateTimeout = new <init>("StateTimeout", 13, eTimeout, "timeout", 0, 0, 1000);
        StateHasError = new <init>("StateHasError", 14, eHasError, "haserror", 0, 0, 1000);
        $VALUES = (new .VALUES[] {
            StateNotLaunched, StateNeedLaunched, StateLaunched, StateHasPair, StateBadPair, StateNoPair, StateNoPairNeedRegPair, StateNeedRegPair, StateNeedHandShake, StateSessionReady, 
            StateSendingMessage, StateSessionEnd, StateRetryExhausted, StateTimeout, StateHasError
        });
    }


    private (String s, int i,  , String s1, int j, int k, int l)
    {
        super(s, i);
        mRetry = 0;
        mBaseRetryIntreval = 0;
        mName = s1;
        mRetry = j;
        mId = ;
        mTimeOut = k;
        mBaseRetryIntreval = l;
    }
}
