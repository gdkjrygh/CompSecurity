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

public final class CaptionedImageCard extends Card
{

    private final String i;
    private final String j;
    private final String k;
    private final String l;
    private final String m;
    private final float n;

    public CaptionedImageCard(JSONObject jsonobject)
    {
        this(jsonobject, null, null);
    }

    public CaptionedImageCard(JSONObject jsonobject, bx bx, ei ei)
    {
        super(jsonobject, bx, ei);
        i = jsonobject.getString("image");
        j = jsonobject.getString("title");
        k = jsonobject.getString("description");
        l = eu.a(jsonobject, "url");
        m = eu.a(jsonobject, "domain");
        n = (float)jsonobject.optDouble("aspect_ratio", 0.0D);
    }

    public final float getAspectRatio()
    {
        return n;
    }

    public final String getDescription()
    {
        return k;
    }

    public final String getDomain()
    {
        return m;
    }

    public final String getImageUrl()
    {
        return i;
    }

    public final String getTitle()
    {
        return j;
    }

    public final String getUrl()
    {
        return l;
    }

    public final String toString()
    {
        return (new StringBuilder("CaptionedImageCard{mId='")).append(c).append('\'').append(", mViewed='").append(d).append('\'').append(", mCreated='").append(f).append('\'').append(", mUpdated='").append(g).append('\'').append(", mImageUrl='").append(i).append('\'').append(", mTitle='").append(j).append('\'').append(", mDescription='").append(k).append('\'').append(", mUrl='").append(l).append('\'').append(", mDomain='").append(m).append('\'').append(", mAspectRatio='").append(n).append('\'').append("}").toString();
    }
}
