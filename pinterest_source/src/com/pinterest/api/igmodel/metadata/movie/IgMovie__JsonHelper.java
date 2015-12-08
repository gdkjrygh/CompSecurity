// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.igmodel.metadata.movie;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.pinterest.api.igmodel.metadata.IgAggregateRating__JsonHelper;
import com.pinterest.api.igmodel.metadata.IgMetadata__JsonHelper;
import com.pinterest.api.igmodel.metadata.IgPerson__JsonHelper;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.pinterest.api.igmodel.metadata.movie:
//            IgMovie

public final class IgMovie__JsonHelper
{

    public static IgMovie a(JsonParser jsonparser)
    {
        IgMovie igmovie = new IgMovie();
        if (jsonparser.c() != JsonToken.b)
        {
            jsonparser.b();
            return null;
        }
        while (jsonparser.a() != JsonToken.c) 
        {
            Object obj = jsonparser.d();
            jsonparser.a();
            if ("date_published".equals(obj))
            {
                if (jsonparser.c() == JsonToken.m)
                {
                    obj = null;
                } else
                {
                    obj = jsonparser.f();
                }
                igmovie.m = ((String) (obj));
            } else
            if ("duration".equals(obj))
            {
                igmovie.o = jsonparser.i();
            } else
            if ("name".equals(obj))
            {
                if (jsonparser.c() == JsonToken.m)
                {
                    obj = null;
                } else
                {
                    obj = jsonparser.f();
                }
                igmovie.q = ((String) (obj));
            } else
            if ("description".equals(obj))
            {
                if (jsonparser.c() == JsonToken.m)
                {
                    obj = null;
                } else
                {
                    obj = jsonparser.f();
                }
                igmovie.n = ((String) (obj));
            } else
            if ("actors".equals(obj))
            {
                if (jsonparser.c() == JsonToken.d)
                {
                    ArrayList arraylist = new ArrayList();
                    do
                    {
                        obj = arraylist;
                        if (jsonparser.a() == JsonToken.e)
                        {
                            break;
                        }
                        obj = IgPerson__JsonHelper.a(jsonparser);
                        if (obj != null)
                        {
                            arraylist.add(obj);
                        }
                    } while (true);
                } else
                {
                    obj = null;
                }
                igmovie.h = ((List) (obj));
            } else
            if ("content_rating".equals(obj))
            {
                if (jsonparser.c() == JsonToken.m)
                {
                    obj = null;
                } else
                {
                    obj = jsonparser.f();
                }
                igmovie.l = ((String) (obj));
            } else
            if ("directors".equals(obj))
            {
                if (jsonparser.c() == JsonToken.d)
                {
                    ArrayList arraylist1 = new ArrayList();
                    do
                    {
                        obj = arraylist1;
                        if (jsonparser.a() == JsonToken.e)
                        {
                            break;
                        }
                        obj = IgPerson__JsonHelper.a(jsonparser);
                        if (obj != null)
                        {
                            arraylist1.add(obj);
                        }
                    } while (true);
                } else
                {
                    obj = null;
                }
                igmovie.i = ((List) (obj));
            } else
            if ("id".equals(obj))
            {
                if (jsonparser.c() == JsonToken.m)
                {
                    obj = null;
                } else
                {
                    obj = jsonparser.f();
                }
                igmovie.p = ((String) (obj));
            } else
            if ("aggregate_rating".equals(obj))
            {
                igmovie.k = IgAggregateRating__JsonHelper.a(jsonparser);
            } else
            if ("type".equals(obj))
            {
                if (jsonparser.c() == JsonToken.m)
                {
                    obj = null;
                } else
                {
                    obj = jsonparser.f();
                }
                igmovie.r = ((String) (obj));
            } else
            if ("writers".equals(obj))
            {
                if (jsonparser.c() == JsonToken.d)
                {
                    ArrayList arraylist2 = new ArrayList();
                    do
                    {
                        obj = arraylist2;
                        if (jsonparser.a() == JsonToken.e)
                        {
                            break;
                        }
                        obj = IgPerson__JsonHelper.a(jsonparser);
                        if (obj != null)
                        {
                            arraylist2.add(obj);
                        }
                    } while (true);
                } else
                {
                    obj = null;
                }
                igmovie.j = ((List) (obj));
            } else
            {
                IgMetadata__JsonHelper.a(igmovie, ((String) (obj)), jsonparser);
            }
            jsonparser.b();
        }
        return igmovie;
    }
}
