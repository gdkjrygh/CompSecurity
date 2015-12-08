// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.wlclient;


public class WL403ResponseException extends Exception
{

    private static final long serialVersionUID = 0x8c4d32f2b041b5ddL;
    private String challengeData;
    private String instanceAuthData;

    public WL403ResponseException()
    {
        challengeData = null;
        instanceAuthData = null;
    }

    public String getChallengeData()
    {
        return challengeData;
    }

    public String getInstanceAuthData()
    {
        return instanceAuthData;
    }

    public void setChallengeData(String s)
    {
        challengeData = s;
    }

    public void setInstanceAuthData(String s)
    {
        instanceAuthData = s;
    }
}
