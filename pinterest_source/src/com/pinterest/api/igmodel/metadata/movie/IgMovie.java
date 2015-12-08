// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.igmodel.metadata.movie;

import com.pinterest.api.igmodel.metadata.IgAggregateRating;
import com.pinterest.api.igmodel.metadata.IgMetadata;
import com.pinterest.api.igmodel.metadata.IgPerson;
import com.pinterest.api.model.metadata.movie.Movie;
import com.pinterest.network.json.PinterestJsonArray;
import com.pinterest.network.json.PinterestJsonObject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IgMovie extends IgMetadata
{

    public List h;
    public List i;
    public List j;
    IgAggregateRating k;
    public String l;
    public String m;
    public String n;
    public int o;
    public String p;
    public String q;
    public String r;

    public IgMovie()
    {
        o = 0;
    }

    public final PinterestJsonObject a()
    {
        PinterestJsonObject pinterestjsonobject = super.a();
        pinterestjsonobject.b("id", p);
        pinterestjsonobject.b("type", r);
        pinterestjsonobject.b("name", q);
        pinterestjsonobject.a("duration", Integer.valueOf(o));
        pinterestjsonobject.b("description", n);
        pinterestjsonobject.b("date_published", m);
        pinterestjsonobject.b("content_rating", l);
        if (k != null)
        {
            pinterestjsonobject.a("aggregate_rating", k.b());
        }
        if (j != null)
        {
            PinterestJsonArray pinterestjsonarray = new PinterestJsonArray();
            for (Iterator iterator = j.iterator(); iterator.hasNext(); pinterestjsonarray.a(((IgPerson)iterator.next()).b())) { }
            pinterestjsonobject.a("writers", pinterestjsonarray);
        }
        if (i != null)
        {
            PinterestJsonArray pinterestjsonarray1 = new PinterestJsonArray();
            for (Iterator iterator1 = i.iterator(); iterator1.hasNext(); pinterestjsonarray1.a(((IgPerson)iterator1.next()).b())) { }
            pinterestjsonobject.a("directors", pinterestjsonarray1);
        }
        if (h != null)
        {
            PinterestJsonArray pinterestjsonarray2 = new PinterestJsonArray();
            for (Iterator iterator2 = h.iterator(); iterator2.hasNext(); pinterestjsonarray2.a(((IgPerson)iterator2.next()).b())) { }
            pinterestjsonobject.a("actors", pinterestjsonarray2);
        }
        return pinterestjsonobject;
    }

    public final Movie b()
    {
        Movie movie = new Movie();
        a(movie);
        if (h != null)
        {
            ArrayList arraylist = new ArrayList();
            for (Iterator iterator = h.iterator(); iterator.hasNext(); arraylist.add(((IgPerson)iterator.next()).a())) { }
            movie.setActors(arraylist);
        }
        if (i != null)
        {
            ArrayList arraylist1 = new ArrayList();
            for (Iterator iterator1 = i.iterator(); iterator1.hasNext(); arraylist1.add(((IgPerson)iterator1.next()).a())) { }
            movie.setDirectors(arraylist1);
        }
        if (j != null)
        {
            ArrayList arraylist2 = new ArrayList();
            for (Iterator iterator2 = j.iterator(); iterator2.hasNext(); arraylist2.add(((IgPerson)iterator2.next()).a())) { }
            movie.setWriters(arraylist2);
        }
        if (k != null)
        {
            movie.setAggregateRating(k.a());
        }
        movie.setContentRating(l);
        movie.setDatePublished(m);
        movie.setDescription(n);
        movie.setDuration(Integer.valueOf(o));
        movie.setId(p);
        movie.setType(r);
        movie.setName(q);
        movie.generateCacheContent();
        return movie;
    }

    public Object getModel()
    {
        return b();
    }
}
