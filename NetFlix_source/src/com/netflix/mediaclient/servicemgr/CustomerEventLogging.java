// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.servicemgr;


public interface CustomerEventLogging
{

    public abstract void logMdxPlaybackStart(String s, String s1, String s2, int i);

    public abstract void logMdxTarget(String s, String s1, String s2, String s3);

    public abstract void logMdxTargetSelection(String s);

    public abstract void reportApplicationLaunchedFromDeepLinking(String s, String s1, String s2);

    public abstract void reportMdpFromDeepLinking(String s);

    public abstract void reportNotificationOptIn(boolean flag, String s);
}
