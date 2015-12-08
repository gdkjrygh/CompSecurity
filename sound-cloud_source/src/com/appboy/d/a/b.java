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

public final class b extends c
{

    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final float f;

    public b(JSONObject jsonobject, br br, ec ec)
    {
        super(jsonobject, br, ec);
        a = jsonobject.getString("image");
        b = jsonobject.getString("title");
        c = jsonobject.getString("description");
        d = eo.a(jsonobject, "url");
        e = eo.a(jsonobject, "domain");
        f = (float)jsonobject.optDouble("aspect_ratio", 0.0D);
    }

    public final String toString()
    {
        return (new StringBuilder("CaptionedImageCard{mId='")).append(i).append('\'').append(", mViewed='").append(j).append('\'').append(", mCreated='").append(l).append('\'').append(", mUpdated='").append(m).append('\'').append(", mImageUrl='").append(a).append('\'').append(", mTitle='").append(b).append('\'').append(", mDescription='").append(c).append('\'').append(", mUrl='").append(d).append('\'').append(", mDomain='").append(e).append('\'').append(", mAspectRatio='").append(f).append('\'').append("}").toString();
    }
}
