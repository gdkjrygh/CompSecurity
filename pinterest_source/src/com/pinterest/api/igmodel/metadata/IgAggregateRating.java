// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.igmodel.metadata;

import com.pinterest.api.igmodel.IgModel;
import com.pinterest.api.model.ModelHelper;
import com.pinterest.api.model.metadata.AggregateRating;
import com.pinterest.network.json.PinterestJsonObject;

public class IgAggregateRating
    implements IgModel
{

    public String a;
    public String b;
    public String c;
    public String d;
    public int e;
    public String f;
    public int g;
    public String h;

    public IgAggregateRating()
    {
        e = -1;
        g = -1;
    }

    private String c()
    {
        if (ModelHelper.isValid(f) && ModelHelper.isValid(a))
        {
            StringBuilder stringbuilder = new StringBuilder();
            try
            {
                stringbuilder.append(Long.parseLong(f));
            }
            catch (NumberFormatException numberformatexception)
            {
                stringbuilder.append(f);
            }
            stringbuilder.append("/");
            stringbuilder.append(a);
            return stringbuilder.toString();
        } else
        {
            return null;
        }
    }

    public final AggregateRating a()
    {
        AggregateRating aggregaterating = new AggregateRating();
        aggregaterating.setBestRating(a);
        aggregaterating.setWorstRating(b);
        aggregaterating.setId(c);
        aggregaterating.setName(d);
        aggregaterating.setRatingCount(Integer.valueOf(e));
        aggregaterating.setRatingValue(f);
        aggregaterating.setReviewCount(Integer.valueOf(g));
        aggregaterating.setType(h);
        aggregaterating.setRatingDisplay(c());
        return aggregaterating;
    }

    public final PinterestJsonObject b()
    {
        PinterestJsonObject pinterestjsonobject = new PinterestJsonObject();
        pinterestjsonobject.b("id", c);
        pinterestjsonobject.b("best_rating", a);
        pinterestjsonobject.b("worst_rating", b);
        pinterestjsonobject.b("name", d);
        pinterestjsonobject.a("rating_count", Integer.valueOf(e));
        pinterestjsonobject.b("rating_value", f);
        pinterestjsonobject.a("review_count", Integer.valueOf(g));
        pinterestjsonobject.b("type", h);
        return pinterestjsonobject;
    }

    public Object getModel()
    {
        return a();
    }
}
