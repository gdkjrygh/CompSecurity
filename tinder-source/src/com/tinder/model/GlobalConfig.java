// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.model;


public class GlobalConfig
{

    public static final int DEFAULT_LIKES_PERCENT_REMAINING = 100;
    public static final int DEFAULT_RECS_INTERVAL = 4000;
    public static final int DEFAULT_UPDATES_INTERVAL = 4000;
    public int adSwipeLimit;
    public boolean appboyEnabled;
    public boolean blendEnabled;
    public boolean fetchConnections;
    public boolean moments;
    public boolean plusEnabled;
    public boolean rateApp;
    public int recsInterval;
    public boolean sparksEnabled;
    public boolean superLikeEnabled;
    public boolean superLikeLimited;
    public int updatesInterval;

    public GlobalConfig()
    {
        updatesInterval = 4000;
        recsInterval = 4000;
    }
}
