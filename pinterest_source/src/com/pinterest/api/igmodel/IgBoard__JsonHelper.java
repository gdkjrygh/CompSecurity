// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.igmodel;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.pinterest.api.igmodel:
//            IgBoard, IgUser__JsonHelper, BoardImages__JsonHelper, BoardCoverImages__JsonHelper, 
//            IgInterest__JsonHelper

public final class IgBoard__JsonHelper
{

    public static IgBoard a(JsonParser jsonparser)
    {
        IgBoard igboard = new IgBoard();
        if (jsonparser.c() != JsonToken.b)
        {
            jsonparser.b();
            return null;
        }
        while (jsonparser.a() != JsonToken.c) 
        {
            Object obj = jsonparser.d();
            jsonparser.a();
            if ("owner".equals(obj))
            {
                igboard.u = IgUser__JsonHelper.a(jsonparser);
            } else
            if ("images".equals(obj))
            {
                igboard.h = BoardImages__JsonHelper.a(jsonparser);
            } else
            if ("board_order_modified_at".equals(obj))
            {
                if (jsonparser.c() == JsonToken.m)
                {
                    obj = null;
                } else
                {
                    obj = jsonparser.f();
                }
                igboard.c = ((String) (obj));
            } else
            if ("image_cover_url".equals(obj))
            {
                if (jsonparser.c() == JsonToken.m)
                {
                    obj = null;
                } else
                {
                    obj = jsonparser.f();
                }
                igboard.j = ((String) (obj));
            } else
            if ("collaborator_count".equals(obj))
            {
                igboard.s = Integer.valueOf(jsonparser.i());
            } else
            if ("is_collaborative".equals(obj))
            {
                igboard.m = Boolean.valueOf(jsonparser.l());
            } else
            if ("collaborator_invites_enabled".equals(obj))
            {
                igboard.n = Boolean.valueOf(jsonparser.l());
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
                igboard.f = ((String) (obj));
            } else
            if ("privacy".equals(obj))
            {
                if (jsonparser.c() == JsonToken.m)
                {
                    obj = null;
                } else
                {
                    obj = jsonparser.f();
                }
                igboard.p = ((String) (obj));
            } else
            if ("url".equals(obj))
            {
                if (jsonparser.c() == JsonToken.m)
                {
                    obj = null;
                } else
                {
                    obj = jsonparser.f();
                }
                igboard.g = ((String) (obj));
            } else
            if ("collaborated_by_me".equals(obj))
            {
                igboard.o = Boolean.valueOf(jsonparser.l());
            } else
            if ("layout".equals(obj))
            {
                if (jsonparser.c() == JsonToken.m)
                {
                    obj = null;
                } else
                {
                    obj = jsonparser.f();
                }
                igboard.t = ((String) (obj));
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
                igboard.a = ((String) (obj));
            } else
            if ("created_at".equals(obj))
            {
                if (jsonparser.c() == JsonToken.m)
                {
                    obj = null;
                } else
                {
                    obj = jsonparser.f();
                }
                igboard.b = ((String) (obj));
            } else
            if ("pin_count".equals(obj))
            {
                igboard.q = Integer.valueOf(jsonparser.i());
            } else
            if ("cover_images".equals(obj))
            {
                igboard.k = BoardCoverImages__JsonHelper.a(jsonparser);
            } else
            if ("followed_by_me".equals(obj))
            {
                igboard.l = Boolean.valueOf(jsonparser.l());
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
                igboard.d = ((String) (obj));
            } else
            if ("category".equals(obj))
            {
                if (jsonparser.c() == JsonToken.m)
                {
                    obj = null;
                } else
                {
                    obj = jsonparser.f();
                }
                igboard.e = ((String) (obj));
            } else
            if ("interests".equals(obj))
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
                        obj = IgInterest__JsonHelper.a(jsonparser);
                        if (obj != null)
                        {
                            arraylist.add(obj);
                        }
                    } while (true);
                } else
                {
                    obj = null;
                }
                igboard.v = ((List) (obj));
            } else
            if ("follower_count".equals(obj))
            {
                igboard.r = Integer.valueOf(jsonparser.i());
            } else
            if ("image_thumbnail_url".equals(obj))
            {
                String s;
                if (jsonparser.c() == JsonToken.m)
                {
                    s = null;
                } else
                {
                    s = jsonparser.f();
                }
                igboard.i = s;
            }
            jsonparser.b();
        }
        return igboard;
    }
}
