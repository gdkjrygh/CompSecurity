// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.model;


public class TinderPlusFeatureDisplay
{

    private String byline;
    private String perk;
    private int resource;

    public TinderPlusFeatureDisplay(int i, String s, String s1)
    {
        resource = i;
        perk = s;
        byline = s1;
    }

    public String getByline()
    {
        return byline;
    }

    public String getPerk()
    {
        return perk;
    }

    public int getResource()
    {
        return resource;
    }
}
