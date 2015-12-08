// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.models.cards;

import bo.app.br;
import bo.app.ec;
import bo.app.eo;
import com.appboy.Constants;
import com.appboy.enums.AppStore;
import com.appboy.support.AppboyLogger;
import org.json.JSONObject;

// Referenced classes of package com.appboy.models.cards:
//            Card

public final class CrossPromotionSmallCard extends Card
{

    private static final String j;
    private final String k;
    private final String l;
    private final String m;
    private final String n;
    private double o;
    private int p;
    private final double q;
    private final String r;
    private String s;
    private String t;
    private AppStore u;
    private String v;

    public CrossPromotionSmallCard(JSONObject jsonobject)
    {
        this(jsonobject, null, null);
    }

    public CrossPromotionSmallCard(JSONObject jsonobject, br br, ec ec)
    {
        super(jsonobject, br, ec);
        k = jsonobject.getString("title");
        l = jsonobject.getString("subtitle");
        m = jsonobject.getString("caption");
        n = jsonobject.getString("image");
        try
        {
            o = jsonobject.getDouble("rating");
            p = jsonobject.getInt("reviews");
        }
        // Misplaced declaration of an exception variable
        catch (br br)
        {
            o = 0.0D;
            p = 0;
        }
        if (jsonobject.has("package"))
        {
            s = jsonobject.getString("package");
        }
        if (jsonobject.has("kindle_id"))
        {
            t = jsonobject.getString("kindle_id");
        }
        q = jsonobject.getDouble("price");
        if (jsonobject.has("display_price"))
        {
            v = jsonobject.getString("display_price");
        }
        r = jsonobject.getString("url");
        if (eo.a(jsonobject, "store") == null)
        {
            break MISSING_BLOCK_LABEL_175;
        }
        jsonobject = eo.a(jsonobject, "store");
        if (jsonobject == null)
        {
            break MISSING_BLOCK_LABEL_190;
        }
        u = AppStore.valueOf(AppStore.serverStringToEnumString(jsonobject));
        return;
        try
        {
            u = AppStore.GOOGLE_PLAY_STORE;
            return;
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            AppboyLogger.e(j, "Caught exception creating cross promotion small card Json.", jsonobject);
        }
        u = AppStore.GOOGLE_PLAY_STORE;
        return;
    }

    public final AppStore getAppStore()
    {
        return u;
    }

    public final String getCaption()
    {
        return m;
    }

    public final String getDisplayPrice()
    {
        return v;
    }

    public final String getImageUrl()
    {
        return n;
    }

    public final String getKindleId()
    {
        return t;
    }

    public final String getPackage()
    {
        return s;
    }

    public final double getPrice()
    {
        return q;
    }

    public final double getRating()
    {
        return o;
    }

    public final int getReviewCount()
    {
        return p;
    }

    public final String getSubtitle()
    {
        return l;
    }

    public final String getTitle()
    {
        return k;
    }

    public final String getUrl()
    {
        return r;
    }

    public final String toString()
    {
        return (new StringBuilder("CrossPromotionSmallCard{mId='")).append(c).append('\'').append(", mViewed='").append(d).append('\'').append(", mCreated='").append(f).append('\'').append(", mUpdated='").append(g).append('\'').append(", mTitle='").append(k).append('\'').append(", mSubtitle='").append(l).append('\'').append(", mCaption='").append(m).append('\'').append(", mImageUrl='").append(n).append('\'').append(", mRating=").append(o).append(", mReviewCount=").append(p).append(", mPrice=").append(q).append(", mPackage=").append(s).append(", mUrl='").append(r).append('\'').append(", mAppStore='").append(u).append('\'').append(", mKindleId='").append(t).append('\'').append(", mDisplayPrice='").append(v).append('\'').append("}").toString();
    }

    static 
    {
        j = String.format("%s.%s", new Object[] {
            Constants.APPBOY_LOG_TAG_PREFIX, com/appboy/models/cards/CrossPromotionSmallCard.getName()
        });
    }
}
