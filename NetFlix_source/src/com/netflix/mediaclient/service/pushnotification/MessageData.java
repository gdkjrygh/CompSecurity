// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.pushnotification;


public final class MessageData
{

    private String mGuid;
    private String mMessageGuid;
    private String mOriginator;

    public MessageData(String s, String s1, String s2)
    {
        mGuid = s;
        mMessageGuid = s1;
        mOriginator = s2;
    }

    public String getGuid()
    {
        return mGuid;
    }

    public String getMessageGuid()
    {
        return mMessageGuid;
    }

    public String getOriginator()
    {
        return mOriginator;
    }

    public String toString()
    {
        return (new StringBuilder()).append("MessageData [mGuid=").append(mGuid).append(", mMessageGuid=").append(mMessageGuid).append(", mOriginator=").append(mOriginator).append("]").toString();
    }
}
