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

public final class e extends c
{

    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public e(JSONObject jsonobject, br br, ec ec)
    {
        super(jsonobject, br, ec);
        a = jsonobject.getString("description");
        b = jsonobject.getString("image");
        c = eo.a(jsonobject, "title");
        d = eo.a(jsonobject, "url");
        e = eo.a(jsonobject, "domain");
    }

    public final String toString()
    {
        return (new StringBuilder("ShortNewsCard{mId='")).append(i).append('\'').append(", mViewed='").append(j).append('\'').append(", mCreated='").append(l).append('\'').append(", mUpdated='").append(m).append('\'').append(", mDescription='").append(a).append('\'').append(", mImageUrl='").append(b).append('\'').append(", mTitle='").append(c).append('\'').append(", mUrl='").append(d).append('\'').append(", mDomain='").append(e).append('\'').append("}").toString();
    }
}
