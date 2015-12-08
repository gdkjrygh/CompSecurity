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

public final class TextAnnouncementCard extends Card
{

    private final String i;
    private final String j;
    private final String k;
    private final String l;

    public TextAnnouncementCard(JSONObject jsonobject)
    {
        this(jsonobject, null, null);
    }

    public TextAnnouncementCard(JSONObject jsonobject, bx bx, ei ei)
    {
        super(jsonobject, bx, ei);
        j = eu.a(jsonobject, "title");
        i = jsonobject.getString("description");
        k = eu.a(jsonobject, "url");
        l = eu.a(jsonobject, "domain");
    }

    public final String getDescription()
    {
        return i;
    }

    public final String getDomain()
    {
        return l;
    }

    public final String getTitle()
    {
        return j;
    }

    public final String getUrl()
    {
        return k;
    }

    public final String toString()
    {
        return (new StringBuilder("TextAnnouncementCard{mId='")).append(c).append('\'').append(", mViewed='").append(d).append('\'').append(", mCreated='").append(f).append('\'').append(", mUpdated='").append(g).append('\'').append(", mDescription='").append(i).append('\'').append(", mTitle='").append(j).append('\'').append(", mUrl='").append(k).append('\'').append(", mDomain='").append(l).append('\'').append("}").toString();
    }
}
