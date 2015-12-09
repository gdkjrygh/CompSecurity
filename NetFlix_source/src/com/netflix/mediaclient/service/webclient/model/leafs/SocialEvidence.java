// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.webclient.model.leafs;

import java.util.List;

public class SocialEvidence
{

    private List facebookFriends;
    private boolean isVideoHidden;

    public SocialEvidence()
    {
    }

    public List getFacebookFriends()
    {
        return facebookFriends;
    }

    public boolean isVideoHidden()
    {
        return isVideoHidden;
    }

    public void setVideoHidden(boolean flag)
    {
        isVideoHidden = flag;
    }
}
