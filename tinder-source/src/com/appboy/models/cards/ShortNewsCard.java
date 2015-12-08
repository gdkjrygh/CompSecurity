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

public final class ShortNewsCard extends Card
{

    private final String j;
    private final String k;
    private final String l;
    private final String m;
    private final String n;

    public ShortNewsCard(JSONObject jsonobject)
    {
        this(jsonobject, null, null);
    }

    public ShortNewsCard(JSONObject jsonobject, br br, ec ec)
    {
        super(jsonobject, br, ec);
        j = jsonobject.getString("description");
        k = jsonobject.getString("image");
        l = eo.a(jsonobject, "title");
        m = eo.a(jsonobject, "url");
        n = eo.a(jsonobject, "domain");
    }

    public final String getDescription()
    {
        return j;
    }

    public final String getDomain()
    {
        return n;
    }

    public final String getImageUrl()
    {
        return k;
    }

    public final String getTitle()
    {
        return l;
    }

    public final String getUrl()
    {
        return m;
    }

    public final String toString()
    {
        return (new StringBuilder("ShortNewsCard{mId='")).append(c).append('\'').append(", mViewed='").append(d).append('\'').append(", mCreated='").append(f).append('\'').append(", mUpdated='").append(g).append('\'').append(", mDescription='").append(j).append('\'').append(", mImageUrl='").append(k).append('\'').append(", mTitle='").append(l).append('\'').append(", mUrl='").append(m).append('\'').append(", mDomain='").append(n).append('\'').append("}").toString();
    }
}
