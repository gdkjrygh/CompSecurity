// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.igmodel;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.pinterest.api.igmodel:
//            IgInterest, InterestImages__JsonHelper, IgPin__JsonHelper

public final class IgInterest__JsonHelper
{

    public static IgInterest a(JsonParser jsonparser)
    {
        IgInterest iginterest = new IgInterest();
        if (jsonparser.c() != JsonToken.b)
        {
            jsonparser.b();
            return null;
        }
        while (jsonparser.a() != JsonToken.c) 
        {
            Object obj = jsonparser.d();
            jsonparser.a();
            if ("id".equals(obj))
            {
                if (jsonparser.c() == JsonToken.m)
                {
                    obj = null;
                } else
                {
                    obj = jsonparser.f();
                }
                iginterest.a = ((String) (obj));
            } else
            if ("background_color".equals(obj))
            {
                if (jsonparser.c() == JsonToken.m)
                {
                    obj = null;
                } else
                {
                    obj = jsonparser.f();
                }
                iginterest.f = ((String) (obj));
            } else
            if ("follower_count".equals(obj))
            {
                iginterest.i = Integer.valueOf(jsonparser.i());
            } else
            if ("url_name".equals(obj))
            {
                if (jsonparser.c() == JsonToken.m)
                {
                    obj = null;
                } else
                {
                    obj = jsonparser.f();
                }
                iginterest.d = ((String) (obj));
            } else
            if ("images".equals(obj))
            {
                iginterest.k = InterestImages__JsonHelper.a(jsonparser);
            } else
            if ("image_signature".equals(obj))
            {
                if (jsonparser.c() == JsonToken.m)
                {
                    obj = null;
                } else
                {
                    obj = jsonparser.f();
                }
                iginterest.e = ((String) (obj));
            } else
            if ("is_followed".equals(obj))
            {
                iginterest.g = Boolean.valueOf(jsonparser.l());
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
                iginterest.c = ((String) (obj));
            } else
            if ("recommendation_pins".equals(obj))
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
                        obj = IgPin__JsonHelper.a(jsonparser);
                        if (obj != null)
                        {
                            arraylist.add(obj);
                        }
                    } while (true);
                } else
                {
                    obj = null;
                }
                iginterest.l = ((List) (obj));
            } else
            if ("feed_update_time".equals(obj))
            {
                if (jsonparser.c() == JsonToken.m)
                {
                    obj = null;
                } else
                {
                    obj = jsonparser.f();
                }
                iginterest.h = ((String) (obj));
            } else
            if ("key".equals(obj))
            {
                if (jsonparser.c() == JsonToken.m)
                {
                    obj = null;
                } else
                {
                    obj = jsonparser.f();
                }
                iginterest.b = ((String) (obj));
            } else
            if ("recommendation_source".equals(obj))
            {
                String s;
                if (jsonparser.c() == JsonToken.m)
                {
                    s = null;
                } else
                {
                    s = jsonparser.f();
                }
                iginterest.j = s;
            }
            jsonparser.b();
        }
        return iginterest;
    }
}
