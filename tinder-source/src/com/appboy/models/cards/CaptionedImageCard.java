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

public final class CaptionedImageCard extends Card
{

    private final String j;
    private final String k;
    private final String l;
    private final String m;
    private final String n;
    private final float o;

    public CaptionedImageCard(JSONObject jsonobject)
    {
        this(jsonobject, null, null);
    }

    public CaptionedImageCard(JSONObject jsonobject, br br, ec ec)
    {
        super(jsonobject, br, ec);
        j = jsonobject.getString("image");
        k = jsonobject.getString("title");
        l = jsonobject.getString("description");
        m = eo.a(jsonobject, "url");
        n = eo.a(jsonobject, "domain");
        o = (float)jsonobject.optDouble("aspect_ratio", 0.0D);
    }

    public final float getAspectRatio()
    {
        return o;
    }

    public final String getDescription()
    {
        return l;
    }

    public final String getDomain()
    {
        return n;
    }

    public final String getImageUrl()
    {
        return j;
    }

    public final String getTitle()
    {
        return k;
    }

    public final String getUrl()
    {
        return m;
    }

    public final String toString()
    {
        return (new StringBuilder("CaptionedImageCard{mId='")).append(c).append('\'').append(", mViewed='").append(d).append('\'').append(", mCreated='").append(f).append('\'').append(", mUpdated='").append(g).append('\'').append(", mImageUrl='").append(j).append('\'').append(", mTitle='").append(k).append('\'').append(", mDescription='").append(l).append('\'').append(", mUrl='").append(m).append('\'').append(", mDomain='").append(n).append('\'').append(", mAspectRatio='").append(o).append('\'').append("}").toString();
    }
}
