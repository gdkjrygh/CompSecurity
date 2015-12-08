// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mobileads.util.vast;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class VastCompanionAd
    implements Serializable
{

    private final Integer a;
    private final Integer b;
    private final String c;
    private final String d;
    private final ArrayList e;

    public VastCompanionAd(Integer integer, Integer integer1, String s, String s1, ArrayList arraylist)
    {
        a = integer;
        b = integer1;
        c = s;
        d = s1;
        e = arraylist;
    }

    public String getClickThroughUrl()
    {
        return d;
    }

    public List getClickTrackers()
    {
        return e;
    }

    public Integer getHeight()
    {
        return b;
    }

    public String getImageUrl()
    {
        return c;
    }

    public Integer getWidth()
    {
        return a;
    }
}
