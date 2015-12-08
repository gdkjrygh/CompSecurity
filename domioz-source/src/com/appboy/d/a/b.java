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

public final class b extends c
{

    private final String i;
    private final String j;
    private final String k;
    private final String l;
    private final String m;
    private final float n;

    public b(JSONObject jsonobject, at at, db db)
    {
        super(jsonobject, at, db);
        i = jsonobject.getString("image");
        j = jsonobject.getString("title");
        k = jsonobject.getString("description");
        l = dl.a(jsonobject, "url");
        m = dl.a(jsonobject, "domain");
        n = (float)jsonobject.optDouble("aspect_ratio", 0.0D);
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

    public final String f()
    {
        return m;
    }

    public final float g()
    {
        return n;
    }

    public final String toString()
    {
        return (new StringBuilder("CaptionedImageCard{mId='")).append(c).append('\'').append(", mViewed='").append(d).append('\'').append(", mCreated='").append(f).append('\'').append(", mUpdated='").append(g).append('\'').append(", mImageUrl='").append(i).append('\'').append(", mTitle='").append(j).append('\'').append(", mDescription='").append(k).append('\'').append(", mUrl='").append(l).append('\'').append(", mDomain='").append(m).append('\'').append(", mAspectRatio='").append(n).append('\'').append("}").toString();
    }
}
