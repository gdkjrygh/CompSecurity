// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.collection.json;

import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.spotlets.show.model.Covers;
import fit;

public class CoversJacksonModel
    implements JacksonModel, Covers
{

    private final String mLargeUri;
    private final String mSmallUri;
    private final String mUri;
    private final String mXlargeUri;

    public CoversJacksonModel(String s, String s1, String s2, String s3)
    {
        mUri = s;
        mSmallUri = s1;
        mLargeUri = s2;
        mXlargeUri = s3;
    }

    public String getImageUri(com.spotify.mobile.android.spotlets.show.model.Covers.Size size)
    {
        return fit.a(this, size);
    }

    public String getLargeUri()
    {
        return mLargeUri;
    }

    public String getSmallUri()
    {
        return mSmallUri;
    }

    public String getUri()
    {
        return mUri;
    }

    public String getXlargeUri()
    {
        return mXlargeUri;
    }
}
