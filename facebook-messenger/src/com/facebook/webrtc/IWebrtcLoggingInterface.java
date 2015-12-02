// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.webrtc;


public interface IWebrtcLoggingInterface
{

    public abstract void logCallAction(long l, long l1, String s, String s1);

    public abstract void logConnectionStatus(boolean flag, String s, long l);

    public abstract void logInternalError(String s, long l);

    public abstract void logMustFix(String s, long l);

    public abstract void logReceivedMessage(String s, long l, long l1, long l2, 
            long l3, String s1);

    public abstract void logSentMessage(String s, long l, long l1, long l2, 
            long l3, String s1);

    public abstract void logSentMessageFailure(long l, int i, String s, String s1, long l1);

    public abstract void logSentMessageSuccess(long l, long l1);
}
