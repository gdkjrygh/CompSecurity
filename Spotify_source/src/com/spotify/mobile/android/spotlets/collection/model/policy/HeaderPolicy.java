// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.collection.model.policy;

import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.Map;

public class HeaderPolicy
    implements JacksonModel
{

    private Map mAttributes;

    public HeaderPolicy()
    {
    }

    public Map getMap()
    {
        return mAttributes;
    }

    public void setAttributes(Map map)
    {
        mAttributes = map;
    }
}
