// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.ads.model;

import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.HashMap;
import java.util.Map;

public class Targetings
    implements JacksonModel
{

    public static final String AD_USER_ID = "aduserid";
    public Map mCustomTargetings;

    public Targetings()
    {
        mCustomTargetings = new HashMap();
    }

    public Map any()
    {
        return mCustomTargetings;
    }

    public Map getCustomTargetings()
    {
        return mCustomTargetings;
    }

    public void set(String s, String s1)
    {
        mCustomTargetings.put(s, s1);
    }

    public void setCustomTargetings(Map map)
    {
        mCustomTargetings = map;
    }
}
