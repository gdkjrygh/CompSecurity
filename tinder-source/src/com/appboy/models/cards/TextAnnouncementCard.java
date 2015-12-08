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

public final class TextAnnouncementCard extends Card
{

    private final String j;
    private final String k;
    private final String l;
    private final String m;

    public TextAnnouncementCard(JSONObject jsonobject)
    {
        this(jsonobject, null, null);
    }

    public TextAnnouncementCard(JSONObject jsonobject, br br, ec ec)
    {
        super(jsonobject, br, ec);
        k = eo.a(jsonobject, "title");
        j = jsonobject.getString("description");
        l = eo.a(jsonobject, "url");
        m = eo.a(jsonobject, "domain");
    }

    public final String getDescription()
    {
        return j;
    }

    public final String getDomain()
    {
        return m;
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
        return (new StringBuilder("TextAnnouncementCard{mId='")).append(c).append('\'').append(", mViewed='").append(d).append('\'').append(", mCreated='").append(f).append('\'').append(", mUpdated='").append(g).append('\'').append(", mDescription='").append(j).append('\'').append(", mTitle='").append(k).append('\'').append(", mUrl='").append(l).append('\'').append(", mDomain='").append(m).append('\'').append("}").toString();
    }
}
