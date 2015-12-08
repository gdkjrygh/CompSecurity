// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.akamai.android.analytics;


final class StateTimerOutputPacketType extends Enum
{

    public static final StateTimerOutputPacketType CURRENTMETRICS;
    public static final StateTimerOutputPacketType DEBUG;
    private static final StateTimerOutputPacketType ENUM$VALUES[];
    public static final StateTimerOutputPacketType INTERNALERROR;
    public static final StateTimerOutputPacketType SENDERRORLINE;
    public static final StateTimerOutputPacketType SENDFEEDBACKLINE;
    public static final StateTimerOutputPacketType SENDFIRSTPLAYLINE;
    public static final StateTimerOutputPacketType SENDHEARTBEATLINE;
    public static final StateTimerOutputPacketType SENDINITLINE;
    public static final StateTimerOutputPacketType SENDPLAYLINE;
    public static final StateTimerOutputPacketType SENDSTOPLINE;
    public static final StateTimerOutputPacketType TITLE_SWITCHED;
    public static final StateTimerOutputPacketType WAITINGFORPOSTROLL;

    private StateTimerOutputPacketType(String s, int i)
    {
        super(s, i);
    }

    public static StateTimerOutputPacketType valueOf(String s)
    {
        return (StateTimerOutputPacketType)Enum.valueOf(com/akamai/android/analytics/StateTimerOutputPacketType, s);
    }

    public static StateTimerOutputPacketType[] values()
    {
        StateTimerOutputPacketType astatetimeroutputpackettype[] = ENUM$VALUES;
        int i = astatetimeroutputpackettype.length;
        StateTimerOutputPacketType astatetimeroutputpackettype1[] = new StateTimerOutputPacketType[i];
        System.arraycopy(astatetimeroutputpackettype, 0, astatetimeroutputpackettype1, 0, i);
        return astatetimeroutputpackettype1;
    }

    static 
    {
        DEBUG = new StateTimerOutputPacketType("DEBUG", 0);
        INTERNALERROR = new StateTimerOutputPacketType("INTERNALERROR", 1);
        SENDINITLINE = new StateTimerOutputPacketType("SENDINITLINE", 2);
        SENDFIRSTPLAYLINE = new StateTimerOutputPacketType("SENDFIRSTPLAYLINE", 3);
        SENDSTOPLINE = new StateTimerOutputPacketType("SENDSTOPLINE", 4);
        SENDERRORLINE = new StateTimerOutputPacketType("SENDERRORLINE", 5);
        SENDPLAYLINE = new StateTimerOutputPacketType("SENDPLAYLINE", 6);
        SENDHEARTBEATLINE = new StateTimerOutputPacketType("SENDHEARTBEATLINE", 7);
        CURRENTMETRICS = new StateTimerOutputPacketType("CURRENTMETRICS", 8);
        WAITINGFORPOSTROLL = new StateTimerOutputPacketType("WAITINGFORPOSTROLL", 9);
        SENDFEEDBACKLINE = new StateTimerOutputPacketType("SENDFEEDBACKLINE", 10);
        TITLE_SWITCHED = new StateTimerOutputPacketType("TITLE_SWITCHED", 11);
        ENUM$VALUES = (new StateTimerOutputPacketType[] {
            DEBUG, INTERNALERROR, SENDINITLINE, SENDFIRSTPLAYLINE, SENDSTOPLINE, SENDERRORLINE, SENDPLAYLINE, SENDHEARTBEATLINE, CURRENTMETRICS, WAITINGFORPOSTROLL, 
            SENDFEEDBACKLINE, TITLE_SWITCHED
        });
    }
}
