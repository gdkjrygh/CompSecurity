// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.mdx;


// Referenced classes of package com.netflix.mediaclient.service.mdx:
//            TargetStateManager

public static final class  extends Enum
{

    private static final Timeout $VALUES[];
    public static final Timeout DeletePairSucceed;
    public static final Timeout HandShakeFailed;
    public static final Timeout HandShakeSucceed;
    public static final Timeout LaunchFailed;
    public static final Timeout LaunchRetry;
    public static final Timeout LaunchSucceed;
    public static final Timeout PairFailed;
    public static final Timeout PairFailedExistedPair;
    public static final Timeout PairFailedNeedRegPair;
    public static final Timeout PairNotAllowed;
    public static final Timeout PairSucceed;
    public static final Timeout PairingRetry;
    public static final Timeout RegistrationInProgress;
    public static final Timeout SendMessageFailed;
    public static final Timeout SendMessageFailedNeedNewSession;
    public static final Timeout SendMessageFailedNeedRepair;
    public static final Timeout SendMessageSucceed;
    public static final Timeout SessionCommandReceived;
    public static final Timeout SessionEnd;
    public static final Timeout SessionRetry;
    public static final Timeout StartSessionSucceed;
    public static final Timeout StartTarget;
    public static final Timeout TargetUpdate;
    public static final Timeout Timeout;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/netflix/mediaclient/service/mdx/TargetStateManager$TargetContextEvent, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        StartTarget = new <init>("StartTarget", 0);
        LaunchSucceed = new <init>("LaunchSucceed", 1);
        LaunchFailed = new <init>("LaunchFailed", 2);
        PairSucceed = new <init>("PairSucceed", 3);
        PairFailed = new <init>("PairFailed", 4);
        PairFailedExistedPair = new <init>("PairFailedExistedPair", 5);
        PairFailedNeedRegPair = new <init>("PairFailedNeedRegPair", 6);
        PairNotAllowed = new <init>("PairNotAllowed", 7);
        RegistrationInProgress = new <init>("RegistrationInProgress", 8);
        DeletePairSucceed = new <init>("DeletePairSucceed", 9);
        StartSessionSucceed = new <init>("StartSessionSucceed", 10);
        HandShakeSucceed = new <init>("HandShakeSucceed", 11);
        HandShakeFailed = new <init>("HandShakeFailed", 12);
        SendMessageSucceed = new <init>("SendMessageSucceed", 13);
        SendMessageFailed = new <init>("SendMessageFailed", 14);
        SendMessageFailedNeedRepair = new <init>("SendMessageFailedNeedRepair", 15);
        SendMessageFailedNeedNewSession = new <init>("SendMessageFailedNeedNewSession", 16);
        SessionEnd = new <init>("SessionEnd", 17);
        SessionCommandReceived = new <init>("SessionCommandReceived", 18);
        TargetUpdate = new <init>("TargetUpdate", 19);
        SessionRetry = new <init>("SessionRetry", 20);
        PairingRetry = new <init>("PairingRetry", 21);
        LaunchRetry = new <init>("LaunchRetry", 22);
        Timeout = new <init>("Timeout", 23);
        $VALUES = (new .VALUES[] {
            StartTarget, LaunchSucceed, LaunchFailed, PairSucceed, PairFailed, PairFailedExistedPair, PairFailedNeedRegPair, PairNotAllowed, RegistrationInProgress, DeletePairSucceed, 
            StartSessionSucceed, HandShakeSucceed, HandShakeFailed, SendMessageSucceed, SendMessageFailed, SendMessageFailedNeedRepair, SendMessageFailedNeedNewSession, SessionEnd, SessionCommandReceived, TargetUpdate, 
            SessionRetry, PairingRetry, LaunchRetry, Timeout
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
