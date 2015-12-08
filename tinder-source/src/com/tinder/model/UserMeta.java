// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.model;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.tinder.model:
//            InstagramDataSet, SuperlikeStatus, ClientConfig, GlobalConfig, 
//            TinderLocation

public class UserMeta
{

    public ClientConfig clientConfig;
    public GlobalConfig globalConfig;
    public List groups;
    public InstagramDataSet instagramDataSet;
    public boolean isTraveling;
    public int likesPercentRemaining;
    public List listPurchases;
    public long millisRateLimitedUntil;
    public List reportNotifications;
    public SuperlikeStatus superlikeStatus;
    public TinderLocation tinderPassport;
    public List tutorials;

    public UserMeta()
    {
        reportNotifications = new ArrayList();
        instagramDataSet = new InstagramDataSet();
        groups = new ArrayList();
        superlikeStatus = new SuperlikeStatus();
        tutorials = new ArrayList();
    }
}
