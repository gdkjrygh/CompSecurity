// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.d.a;

import a.a.at;
import a.a.db;
import a.a.dl;
import org.json.JSONObject;

// Referenced classes of package com.appboy.d.a:
//            c

public final class f extends c
{

    private final String i;
    private final String j;
    private final String k;
    private final String l;

    public f(JSONObject jsonobject, at at, db db)
    {
        super(jsonobject, at, db);
        j = dl.a(jsonobject, "title");
        i = jsonobject.getString("description");
        k = dl.a(jsonobject, "url");
        l = dl.a(jsonobject, "domain");
    }

    public final String b()
    {
        return i;
    }

    public final String c()
    {
        return j;
    }

    public final String d()
    {
        return k;
    }

    public final String e()
    {
        return l;
    }

    public final String toString()
    {
        return (new StringBuilder("TextAnnouncementCard{mId='")).append(c).append('\'').append(", mViewed='").append(d).append('\'').append(", mCreated='").append(f).append('\'').append(", mUpdated='").append(g).append('\'').append(", mDescription='").append(i).append('\'').append(", mTitle='").append(j).append('\'').append(", mUrl='").append(k).append('\'').append(", mDomain='").append(l).append('\'').append("}").toString();
    }
}
