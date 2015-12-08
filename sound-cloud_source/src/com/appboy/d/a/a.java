// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.d.a;

import bo.app.br;
import bo.app.ec;
import bo.app.eo;
import org.json.JSONObject;

// Referenced classes of package com.appboy.d.a:
//            c

public final class a extends c
{

    public final String a;
    public final String b;
    public final float c;
    private final String d;

    public a(JSONObject jsonobject, br br, ec ec)
    {
        super(jsonobject, br, ec);
        a = jsonobject.getString("image");
        b = eo.a(jsonobject, "url");
        d = eo.a(jsonobject, "domain");
        c = (float)jsonobject.optDouble("aspect_ratio", 0.0D);
    }

    public final String toString()
    {
        return (new StringBuilder("BannerImageCard{mId='")).append(i).append('\'').append(", mViewed='").append(j).append('\'').append(", mCreated='").append(l).append('\'').append(", mUpdated='").append(m).append('\'').append(", mImageUrl='").append(a).append('\'').append(", mUrl='").append(b).append('\'').append(", mDomain='").append(d).append('\'').append(", mAspectRatio='").append(c).append('\'').append("}").toString();
    }
}
