// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.igmodel.metadata;

import com.pinterest.api.igmodel.IgModel;
import com.pinterest.api.igmodel.metadata.article.IgArticle;
import com.pinterest.api.igmodel.metadata.movie.IgMovie;
import com.pinterest.api.igmodel.metadata.product.IgProduct;
import com.pinterest.api.igmodel.metadata.product.IgProductHistory;
import com.pinterest.api.igmodel.metadata.recipe.IgRecipe;
import com.pinterest.api.model.PinMetadata;
import com.pinterest.api.model.metadata.product.OfferSummary;
import com.pinterest.api.model.metadata.product.Product;
import java.util.List;

public class IgPinMetadata
    implements IgModel
{

    public List a;
    public List b;
    public IgMovie c;
    public IgRecipe d;
    public IgArticle e;

    public IgPinMetadata()
    {
    }

    public final PinMetadata a()
    {
        if (b != null && b.size() > 0)
        {
            Product product = ((IgProduct)b.get(0)).b();
            if (a != null && a.size() > 0)
            {
                product.getOfferSummary().setOldPrice(((IgProductHistory)a.get(0)).a());
                product.getOfferSummary().makeOfferDisplay();
            }
            return product;
        }
        if (c != null)
        {
            return c.b();
        }
        if (d != null)
        {
            return d.b();
        }
        if (e != null)
        {
            return e.b();
        } else
        {
            return null;
        }
    }

    public Object getModel()
    {
        return a();
    }
}
