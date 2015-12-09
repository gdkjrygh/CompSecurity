// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.search.model.offline;

import com.spotify.mobile.android.cosmos.JacksonModel;

public abstract class OfflineSearchEntity
    implements JacksonModel
{

    public final String image;
    public final String name;
    public final String uri;

    public OfflineSearchEntity(String s, String s1, String s2)
    {
        name = s;
        uri = s1;
        image = s2;
    }

    public String getImageUri()
    {
        return image;
    }

    public String getName()
    {
        return name;
    }

    public String getUri()
    {
        return uri;
    }
}
