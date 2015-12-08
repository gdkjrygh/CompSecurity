// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.models.cards;

import bo.app.bx;
import bo.app.ei;
import bo.app.eu;
import com.appboy.Constants;
import com.appboy.enums.AppStore;
import com.appboy.support.AppboyLogger;
import org.json.JSONObject;

// Referenced classes of package com.appboy.models.cards:
//            Card

public final class CrossPromotionSmallCard extends Card
{

    private static final String i;
    private final String j;
    private final String k;
    private final String l;
    private final String m;
    private double n;
    private int o;
    private final double p;
    private final String q;
    private String r;
    private String s;
    private AppStore t;
    private String u;

    public CrossPromotionSmallCard(JSONObject jsonobject)
    {
        this(jsonobject, null, null);
    }

    public CrossPromotionSmallCard(JSONObject jsonobject, bx bx, ei ei)
    {
        super(jsonobject, bx, ei);
        j = jsonobject.getString("title");
        k = jsonobject.getString("subtitle");
        l = jsonobject.getString("caption");
        m = jsonobject.getString("image");
        try
        {
            n = jsonobject.getDouble("rating");
            o = jsonobject.getInt("reviews");
        }
        // Misplaced declaration of an exception variable
        catch (bx bx)
        {
            n = 0.0D;
            o = 0;
        }
        if (jsonobject.has("package"))
        {
            r = jsonobject.getString("package");
        }
        if (jsonobject.has("kindle_id"))
        {
            s = jsonobject.getString("kindle_id");
        }
        p = jsonobject.getDouble("price");
        if (jsonobject.has("display_price"))
        {
            u = jsonobject.getString("display_price");
        }
        q = jsonobject.getString("url");
        if (eu.a(jsonobject, "store") == null)
        {
            break MISSING_BLOCK_LABEL_175;
        }
        jsonobject = eu.a(jsonobject, "store");
        if (jsonobject == null)
        {
            break MISSING_BLOCK_LABEL_190;
        }
        t = AppStore.valueOf(AppStore.serverStringToEnumString(jsonobject));
        return;
        try
        {
            t = AppStore.GOOGLE_PLAY_STORE;
            return;
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            AppboyLogger.e(i, "Caught exception creating cross promotion small card Json.", jsonobject);
        }
        t = AppStore.GOOGLE_PLAY_STORE;
        return;
    }

    public final AppStore getAppStore()
    {
        return t;
    }

    public final String getCaption()
    {
        return l;
    }

    public final String getDisplayPrice()
    {
        return u;
    }

    public final String getImageUrl()
    {
        return m;
    }

    public final String getKindleId()
    {
        return s;
    }

    public final String getPackage()
    {
        return r;
    }

    public final double getPrice()
    {
        return p;
    }

    public final double getRating()
    {
        return n;
    }

    public final int getReviewCount()
    {
        return o;
    }

    public final String getSubtitle()
    {
        return k;
    }

    public final String getTitle()
    {
        return j;
    }

    public final String getUrl()
    {
        return q;
    }

    public final String toString()
    {
        return (new StringBuilder("CrossPromotionSmallCard{mId='")).append(c).append('\'').append(", mViewed='").append(d).append('\'').append(", mCreated='").append(f).append('\'').append(", mUpdated='").append(g).append('\'').append(", mTitle='").append(j).append('\'').append(", mSubtitle='").append(k).append('\'').append(", mCaption='").append(l).append('\'').append(", mImageUrl='").append(m).append('\'').append(", mRating=").append(n).append(", mReviewCount=").append(o).append(", mPrice=").append(p).append(", mPackage=").append(r).append(", mUrl='").append(q).append('\'').append(", mAppStore='").append(t).append('\'').append(", mKindleId='").append(s).append('\'').append(", mDisplayPrice='").append(u).append('\'').append("}").toString();
    }

    static 
    {
        i = String.format("%s.%s", new Object[] {
            Constants.APPBOY_LOG_TAG_PREFIX, com/appboy/models/cards/CrossPromotionSmallCard.getName()
        });
    }
}
