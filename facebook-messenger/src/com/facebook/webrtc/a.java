// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.webrtc;


public final class a extends Enum
{

    private static final a $VALUES[];
    public static final a CallEndAcceptAfterHangUp;
    public static final a CallEndCallerNotVisible;
    public static final a CallEndCarrierBlocked;
    public static final a CallEndClientError;
    public static final a CallEndClientInterrupted;
    public static final a CallEndConnectionDropped;
    public static final a CallEndHangupCall;
    public static final a CallEndIgnoreCall;
    public static final a CallEndInAnotherCall;
    public static final a CallEndIncomingTimeout;
    public static final a CallEndNoAnswerTimeout;
    public static final a CallEndNoPermission;
    public static final a CallEndNoUIError;
    public static final a CallEndOtherCarrierBlocked;
    public static final a CallEndOtherInstanceHandled;
    public static final a CallEndOtherNotCapable;
    public static final a CallEndSignalingMessageFailed;
    public static final a CallEndUnsupportedVersion;
    public static final a CallEndWebRTCError;

    private a(String s, int i)
    {
        super(s, i);
    }

    public static a valueOf(String s)
    {
        return (a)Enum.valueOf(com/facebook/webrtc/a, s);
    }

    public static a[] values()
    {
        return (a[])$VALUES.clone();
    }

    static 
    {
        CallEndIgnoreCall = new a("CallEndIgnoreCall", 0);
        CallEndHangupCall = new a("CallEndHangupCall", 1);
        CallEndInAnotherCall = new a("CallEndInAnotherCall", 2);
        CallEndAcceptAfterHangUp = new a("CallEndAcceptAfterHangUp", 3);
        CallEndNoAnswerTimeout = new a("CallEndNoAnswerTimeout", 4);
        CallEndIncomingTimeout = new a("CallEndIncomingTimeout", 5);
        CallEndOtherInstanceHandled = new a("CallEndOtherInstanceHandled", 6);
        CallEndSignalingMessageFailed = new a("CallEndSignalingMessageFailed", 7);
        CallEndConnectionDropped = new a("CallEndConnectionDropped", 8);
        CallEndClientInterrupted = new a("CallEndClientInterrupted", 9);
        CallEndWebRTCError = new a("CallEndWebRTCError", 10);
        CallEndClientError = new a("CallEndClientError", 11);
        CallEndNoPermission = new a("CallEndNoPermission", 12);
        CallEndOtherNotCapable = new a("CallEndOtherNotCapable", 13);
        CallEndNoUIError = new a("CallEndNoUIError", 14);
        CallEndUnsupportedVersion = new a("CallEndUnsupportedVersion", 15);
        CallEndCallerNotVisible = new a("CallEndCallerNotVisible", 16);
        CallEndCarrierBlocked = new a("CallEndCarrierBlocked", 17);
        CallEndOtherCarrierBlocked = new a("CallEndOtherCarrierBlocked", 18);
        $VALUES = (new a[] {
            CallEndIgnoreCall, CallEndHangupCall, CallEndInAnotherCall, CallEndAcceptAfterHangUp, CallEndNoAnswerTimeout, CallEndIncomingTimeout, CallEndOtherInstanceHandled, CallEndSignalingMessageFailed, CallEndConnectionDropped, CallEndClientInterrupted, 
            CallEndWebRTCError, CallEndClientError, CallEndNoPermission, CallEndOtherNotCapable, CallEndNoUIError, CallEndUnsupportedVersion, CallEndCallerNotVisible, CallEndCarrierBlocked, CallEndOtherCarrierBlocked
        });
    }
}
