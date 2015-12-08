// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.model;

import com.pinterest.api.model.metadata.article.Article;
import com.pinterest.api.model.metadata.movie.Movie;
import com.pinterest.api.model.metadata.product.Product;
import com.pinterest.api.model.metadata.recipe.Recipe;
import com.pinterest.network.json.PinterestJsonArray;
import com.pinterest.network.json.PinterestJsonObject;

// Referenced classes of package com.pinterest.api.model:
//            Pin, PinMetadata

public class PinMetadataFactory
{

    public PinMetadataFactory()
    {
    }

    public static PinMetadata make(Pin pin, PinterestJsonObject pinterestjsonobject)
    {
        if (pin != null && pinterestjsonobject != null)
        {
            if (pinterestjsonobject.e("products").a() > 0)
            {
                return new Product(pin, pinterestjsonobject);
            }
            if (pinterestjsonobject.c("movie") != null)
            {
                return new Movie(pin, pinterestjsonobject);
            }
            PinterestJsonObject pinterestjsonobject1 = pinterestjsonobject.c("recipe");
            if (pinterestjsonobject1 != null && pinterestjsonobject1.a("id", 0L) != 0L)
            {
                return new Recipe(pin, pinterestjsonobject);
            }
            if (pinterestjsonobject.c("article") != null)
            {
                return new Article(pin, pinterestjsonobject);
            }
        }
        return null;
    }
}
