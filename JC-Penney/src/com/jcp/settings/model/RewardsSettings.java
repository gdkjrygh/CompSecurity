// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.settings.model;

import java.util.List;

public class RewardsSettings
{

    private List features;

    public RewardsSettings()
    {
    }

    public List getFeatures()
    {
        return features;
    }

    public boolean isRewardsEnabled()
    {
        return features != null && features.contains("ProfileLinking-Android");
    }

    public void setFeatures(List list)
    {
        features = list;
    }
}
