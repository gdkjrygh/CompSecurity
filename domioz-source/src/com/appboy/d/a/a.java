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

public final class a extends c
{

    private final String i;
    private final String j;
    private final String k;
    private final float l;

    public a(JSONObject jsonobject, at at, db db)
    {
        super(jsonobject, at, db);
        i = jsonobject.getString("image");
        j = dl.a(jsonobject, "url");
        k = dl.a(jsonobject, "domain");
        l = (float)jsonobject.optDouble("aspect_ratio", 0.0D);
    }

    public final String b()
    {
        return i;
    }

    public final String c()
    {
        return j;
    }

    public final float d()
    {
        return l;
    }

    public final String toString()
    {
        return (new StringBuilder("BannerImageCard{mId='")).append(c).append('\'').append(", mViewed='").append(d).append('\'').append(", mCreated='").append(f).append('\'').append(", mUpdated='").append(g).append('\'').append(", mImageUrl='").append(i).append('\'').append(", mUrl='").append(j).append('\'').append(", mDomain='").append(k).append('\'').append(", mAspectRatio='").append(l).append('\'').append("}").toString();
    }
}
