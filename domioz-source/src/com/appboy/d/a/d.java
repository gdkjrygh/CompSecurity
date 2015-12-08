// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.d.a;

import a.a.at;
import a.a.db;
import a.a.dl;
import com.appboy.b.a;
import org.json.JSONObject;

// Referenced classes of package com.appboy.d.a:
//            c

public final class d extends c
{

    private final String i;
    private final String j;
    private final String k;
    private final String l;
    private double m;
    private int n;
    private final double o;
    private final String p;
    private String q;
    private String r;
    private a s;
    private String t;

    public d(JSONObject jsonobject, at at, db db)
    {
        super(jsonobject, at, db);
        i = jsonobject.getString("title");
        j = jsonobject.getString("subtitle");
        k = jsonobject.getString("caption");
        l = jsonobject.getString("image");
        try
        {
            m = jsonobject.getDouble("rating");
            n = jsonobject.getInt("reviews");
        }
        // Misplaced declaration of an exception variable
        catch (at at)
        {
            m = 0.0D;
            n = 0;
        }
        if (jsonobject.has("package"))
        {
            q = jsonobject.getString("package");
        }
        if (jsonobject.has("kindle_id"))
        {
            r = jsonobject.getString("kindle_id");
        }
        o = jsonobject.getDouble("price");
        if (jsonobject.has("display_price"))
        {
            t = jsonobject.getString("display_price");
        }
        p = jsonobject.getString("url");
        if (dl.a(jsonobject, "store") == null)
        {
            break MISSING_BLOCK_LABEL_175;
        }
        jsonobject = dl.a(jsonobject, "store");
        if (jsonobject == null)
        {
            break MISSING_BLOCK_LABEL_190;
        }
        s = a.valueOf(a.a(jsonobject));
        return;
        try
        {
            s = a.a;
            return;
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            jsonobject.printStackTrace();
        }
        s = a.a;
        return;
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

    public final double f()
    {
        return m;
    }

    public final int g()
    {
        return n;
    }

    public final double o()
    {
        return o;
    }

    public final String p()
    {
        return q;
    }

    public final String q()
    {
        return r;
    }

    public final a r()
    {
        return s;
    }

    public final String s()
    {
        return t;
    }

    public final String toString()
    {
        return (new StringBuilder("CrossPromotionSmallCard{mId='")).append(c).append('\'').append(", mViewed='").append(d).append('\'').append(", mCreated='").append(f).append('\'').append(", mUpdated='").append(g).append('\'').append(", mTitle='").append(i).append('\'').append(", mSubtitle='").append(j).append('\'').append(", mCaption='").append(k).append('\'').append(", mImageUrl='").append(l).append('\'').append(", mRating=").append(m).append(", mReviewCount=").append(n).append(", mPrice=").append(o).append(", mPackage=").append(q).append(", mUrl='").append(p).append('\'').append(", mAppStore='").append(s).append('\'').append(", mKindleId='").append(r).append('\'').append(", mDisplayPrice='").append(t).append('\'').append("}").toString();
    }
}
