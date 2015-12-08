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

public final class ShortNewsCard extends Card
{

    private final String i;
    private final String j;
    private final String k;
    private final String l;
    private final String m;

    public ShortNewsCard(JSONObject jsonobject)
    {
        this(jsonobject, null, null);
    }

    public ShortNewsCard(JSONObject jsonobject, bx bx, ei ei)
    {
        super(jsonobject, bx, ei);
        i = jsonobject.getString("description");
        j = jsonobject.getString("image");
        k = eu.a(jsonobject, "title");
        l = eu.a(jsonobject, "url");
        m = eu.a(jsonobject, "domain");
    }

    public final String getDescription()
    {
        return i;
    }

    public final String getDomain()
    {
        return m;
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
        return l;
    }

    public final String toString()
    {
        return (new StringBuilder("ShortNewsCard{mId='")).append(c).append('\'').append(", mViewed='").append(d).append('\'').append(", mCreated='").append(f).append('\'').append(", mUpdated='").append(g).append('\'').append(", mDescription='").append(i).append('\'').append(", mImageUrl='").append(j).append('\'').append(", mTitle='").append(k).append('\'').append(", mUrl='").append(l).append('\'').append(", mDomain='").append(m).append('\'').append("}").toString();
    }
}
