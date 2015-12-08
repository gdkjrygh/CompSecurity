// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.igresponse;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.pinterest.api.igresponse:
//            Nag

public final class Nag__JsonHelper
{

    public static Nag a(JsonParser jsonparser)
    {
        Nag nag = new Nag();
        if (jsonparser.c() != JsonToken.b)
        {
            jsonparser.b();
            return null;
        }
        while (jsonparser.a() != JsonToken.c) 
        {
            Object obj = jsonparser.d();
            jsonparser.a();
            if ("nag_type".equals(obj))
            {
                if (jsonparser.c() == JsonToken.m)
                {
                    obj = null;
                } else
                {
                    obj = jsonparser.f();
                }
                nag.a = ((String) (obj));
            } else
            if ("messages".equals(obj))
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
                        if (jsonparser.c() == JsonToken.m)
                        {
                            obj = null;
                        } else
                        {
                            obj = jsonparser.f();
                        }
                        if (obj != null)
                        {
                            arraylist.add(obj);
                        }
                    } while (true);
                } else
                {
                    obj = null;
                }
                nag.b = ((List) (obj));
            } else
            if ("theme".equals(obj))
            {
                String s;
                if (jsonparser.c() == JsonToken.m)
                {
                    s = null;
                } else
                {
                    s = jsonparser.f();
                }
                nag.c = s;
            }
            jsonparser.b();
        }
        return nag;
    }
}
