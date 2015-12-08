// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.service.feature;

import com.spotify.mobile.android.cosmos.JacksonModel;
import ctz;

public class AbbaFlagModel
    implements JacksonModel
{

    private final String mCell;
    private final String mFeatureName;

    public AbbaFlagModel(String s, String s1)
    {
        mFeatureName = (String)ctz.a(s);
        mCell = (String)ctz.a(s1);
    }

    public String getCell()
    {
        return mCell;
    }

    public String getFeatureName()
    {
        return mFeatureName;
    }
}
