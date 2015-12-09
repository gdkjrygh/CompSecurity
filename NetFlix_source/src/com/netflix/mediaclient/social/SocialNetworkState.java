// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.social;


public class SocialNetworkState
{

    private boolean disabled;
    private boolean share;

    public SocialNetworkState(boolean flag, boolean flag1)
    {
        disabled = true;
        share = false;
        disabled = flag;
        share = flag1;
    }

    public boolean isDisabled()
    {
        return disabled;
    }

    public boolean isShare()
    {
        return share;
    }

    public String toString()
    {
        return (new StringBuilder()).append("SocialNetworkState [disabled=").append(disabled).append(", share=").append(share).append("]").toString();
    }
}
