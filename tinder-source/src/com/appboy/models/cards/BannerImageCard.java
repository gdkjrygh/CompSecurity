// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.models.cards;

import bo.app.br;
import bo.app.ec;
import bo.app.eo;
import org.json.JSONObject;

// Referenced classes of package com.appboy.models.cards:
//            Card

public final class BannerImageCard extends Card
{

    private final String j;
    private final String k;
    private final String l;
    private final float m;

    public BannerImageCard(JSONObject jsonobject)
    {
        this(jsonobject, null, null);
    }

    public BannerImageCard(JSONObject jsonobject, br br, ec ec)
    {
        super(jsonobject, br, ec);
        j = jsonobject.getString("image");
        k = eo.a(jsonobject, "url");
        l = eo.a(jsonobject, "domain");
        m = (float)jsonobject.optDouble("aspect_ratio", 0.0D);
    }

    public final float getAspectRatio()
    {
        return m;
    }

    public final String getDomain()
    {
        return l;
    }

    public final String getImageUrl()
    {
        return j;
    }

    public final String getUrl()
    {
        return k;
    }

    public final String toString()
    {
        return (new StringBuilder("BannerImageCard{mId='")).append(c).append('\'').append(", mViewed='").append(d).append('\'').append(", mCreated='").append(f).append('\'').append(", mUpdated='").append(g).append('\'').append(", mImageUrl='").append(j).append('\'').append(", mUrl='").append(k).append('\'').append(", mDomain='").append(l).append('\'').append(", mAspectRatio='").append(m).append('\'').append("}").toString();
    }
}
