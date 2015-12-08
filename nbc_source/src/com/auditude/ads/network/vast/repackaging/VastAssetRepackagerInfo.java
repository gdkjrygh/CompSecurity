// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.network.vast.repackaging;


public class VastAssetRepackagerInfo
{

    public String domain;
    public Boolean repackaginEnabled;
    public String requiredFormat;
    public int zoneId;

    public VastAssetRepackagerInfo(Boolean boolean1, String s, String s1, int i)
    {
        repackaginEnabled = Boolean.valueOf(false);
        requiredFormat = null;
        domain = null;
        zoneId = 0;
        repackaginEnabled = boolean1;
        requiredFormat = s;
        domain = s1;
        zoneId = i;
    }
}
