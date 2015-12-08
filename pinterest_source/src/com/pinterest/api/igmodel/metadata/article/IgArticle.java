// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.igmodel.metadata.article;

import com.pinterest.api.igmodel.metadata.IgMetadata;
import com.pinterest.api.igmodel.metadata.IgPerson;
import com.pinterest.api.model.metadata.article.Article;
import com.pinterest.network.json.PinterestJsonArray;
import com.pinterest.network.json.PinterestJsonObject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IgArticle extends IgMetadata
{

    public List h;
    public String i;
    public String j;
    public String k;
    public String l;
    public String m;

    public IgArticle()
    {
    }

    public final PinterestJsonObject a()
    {
        PinterestJsonObject pinterestjsonobject = super.a();
        pinterestjsonobject.b("id", k);
        pinterestjsonobject.b("type", m);
        pinterestjsonobject.b("name", l);
        pinterestjsonobject.b("description", j);
        pinterestjsonobject.b("date_published", i);
        if (h != null)
        {
            PinterestJsonArray pinterestjsonarray = new PinterestJsonArray();
            for (Iterator iterator = h.iterator(); iterator.hasNext(); pinterestjsonarray.a(((IgPerson)iterator.next()).b())) { }
            pinterestjsonobject.a("authors", pinterestjsonarray);
        }
        return pinterestjsonobject;
    }

    public final Article b()
    {
        Article article = new Article();
        a(article);
        article.setDatePublished(i);
        article.setDescription(j);
        if (h != null)
        {
            ArrayList arraylist = new ArrayList();
            for (Iterator iterator = h.iterator(); iterator.hasNext(); arraylist.add(((IgPerson)iterator.next()).a())) { }
            article.setAuthors(arraylist);
        }
        article.setId(k);
        article.setType(m);
        article.setName(l);
        article.generateCacheContent();
        return article;
    }

    public Object getModel()
    {
        return b();
    }
}
