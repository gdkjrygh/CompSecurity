// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.models.cards;

import bo.app.bx;
import bo.app.ei;
import bo.app.eu;
import org.json.JSONObject;

// Referenced classes of package com.appboy.models.cards:
//            Card

public final class BannerImageCard extends Card
{

    private final String i;
    private final String j;
    private final String k;
    private final float l;

    public BannerImageCard(JSONObject jsonobject)
    {
        this(jsonobject, null, null);
    }

    public BannerImageCard(JSONObject jsonobject, bx bx, ei ei)
    {
        super(jsonobject, bx, ei);
        i = jsonobject.getString("image");
        j = eu.a(jsonobject, "url");
        k = eu.a(jsonobject, "domain");
        l = (float)jsonobject.optDouble("aspect_ratio", 0.0D);
    }

    public final float getAspectRatio()
    {
        return l;
    }

    public final String getDomain()
    {
        return k;
    }

    public final String getImageUrl()
    {
        return i;
    }

    public final String getUrl()
    {
        return j;
    }

    public final String toString()
    {
        return (new StringBuilder("BannerImageCard{mId='")).append(c).append('\'').append(", mViewed='").append(d).append('\'').append(", mCreated='").append(f).append('\'').append(", mUpdated='").append(g).append('\'').append(", mImageUrl='").append(i).append('\'').append(", mUrl='").append(j).append('\'').append(", mDomain='").append(k).append('\'').append(", mAspectRatio='").append(l).append('\'').append("}").toString();
    }
}
