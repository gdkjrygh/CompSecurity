// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.d.a;

import bo.app.br;
import bo.app.ec;
import bo.app.eo;
import com.appboy.b.a;
import org.json.JSONObject;

// Referenced classes of package com.appboy.d.a:
//            c

public final class d extends c
{

    private static final String u;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public double e;
    public int f;
    public final double p;
    public String q;
    public String r;
    public a s;
    public String t;
    private final String v;

    public d(JSONObject jsonobject, br br, ec ec)
    {
        super(jsonobject, br, ec);
        a = jsonobject.getString("title");
        b = jsonobject.getString("subtitle");
        c = jsonobject.getString("caption");
        d = jsonobject.getString("image");
        try
        {
            e = jsonobject.getDouble("rating");
            f = jsonobject.getInt("reviews");
        }
        // Misplaced declaration of an exception variable
        catch (br br)
        {
            e = 0.0D;
            f = 0;
        }
        if (jsonobject.has("package"))
        {
            q = jsonobject.getString("package");
        }
        if (jsonobject.has("kindle_id"))
        {
            r = jsonobject.getString("kindle_id");
        }
        p = jsonobject.getDouble("price");
        if (jsonobject.has("display_price"))
        {
            t = jsonobject.getString("display_price");
        }
        v = jsonobject.getString("url");
        if (eo.a(jsonobject, "store") == null)
        {
            break MISSING_BLOCK_LABEL_175;
        }
        jsonobject = eo.a(jsonobject, "store");
        if (jsonobject == null)
        {
            break MISSING_BLOCK_LABEL_190;
        }
        s = com.appboy.b.a.valueOf(com.appboy.b.a.a(jsonobject));
        return;
        try
        {
            s = a.a;
            return;
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            s = a.a;
        }
        return;
    }

    public final String toString()
    {
        return (new StringBuilder("CrossPromotionSmallCard{mId='")).append(i).append('\'').append(", mViewed='").append(j).append('\'').append(", mCreated='").append(l).append('\'').append(", mUpdated='").append(m).append('\'').append(", mTitle='").append(a).append('\'').append(", mSubtitle='").append(b).append('\'').append(", mCaption='").append(c).append('\'').append(", mImageUrl='").append(d).append('\'').append(", mRating=").append(e).append(", mReviewCount=").append(f).append(", mPrice=").append(p).append(", mPackage=").append(q).append(", mUrl='").append(v).append('\'').append(", mAppStore='").append(s).append('\'').append(", mKindleId='").append(r).append('\'').append(", mDisplayPrice='").append(t).append('\'').append("}").toString();
    }

    static 
    {
        u = String.format("%s.%s", new Object[] {
            com.appboy.d.a, com/appboy/d/a/d.getName()
        });
    }
}
