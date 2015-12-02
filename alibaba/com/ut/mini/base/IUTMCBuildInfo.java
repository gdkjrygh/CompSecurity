// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ut.mini.base;


public interface IUTMCBuildInfo
{

    public abstract String getBuildID();

    public abstract String getFullSDKVersion();

    public abstract String getGitCommitID();

    public abstract String getShortSDKVersion();

    public abstract boolean isTestMode();
}
