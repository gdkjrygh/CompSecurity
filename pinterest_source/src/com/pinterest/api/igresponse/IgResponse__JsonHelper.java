// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.igresponse;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.pinterest.api.igresponse:
//            IgResponse, SearchNag__JsonHelper, DeveloperError__JsonHelper, Nag__JsonHelper

public final class IgResponse__JsonHelper
{

    public static boolean a(IgResponse igresponse, String s, JsonParser jsonparser)
    {
        Object obj1 = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj = null;
        if ("bookmark".equals(s))
        {
            if (jsonparser.c() == JsonToken.m)
            {
                s = obj;
            } else
            {
                s = jsonparser.f();
            }
            igresponse.e = s;
            return true;
        }
        if ("search_nag".equals(s))
        {
            igresponse.j = SearchNag__JsonHelper.a(jsonparser);
            return true;
        }
        if ("error".equals(s))
        {
            igresponse.k = DeveloperError__JsonHelper.a(jsonparser);
            return true;
        }
        if ("code".equals(s))
        {
            igresponse.d = jsonparser.i();
            return true;
        }
        if ("generated_at".equals(s))
        {
            if (jsonparser.c() == JsonToken.m)
            {
                s = obj1;
            } else
            {
                s = jsonparser.f();
            }
            igresponse.f = s;
            return true;
        }
        if ("message".equals(s))
        {
            if (jsonparser.c() == JsonToken.m)
            {
                s = obj2;
            } else
            {
                s = jsonparser.f();
            }
            igresponse.g = s;
            return true;
        }
        if ("nags".equals(s))
        {
            s = obj3;
            if (jsonparser.c() == JsonToken.d)
            {
                ArrayList arraylist = new ArrayList();
                do
                {
                    s = arraylist;
                    if (jsonparser.a() == JsonToken.e)
                    {
                        break;
                    }
                    s = Nag__JsonHelper.a(jsonparser);
                    if (s != null)
                    {
                        arraylist.add(s);
                    }
                } while (true);
            }
            igresponse.i = s;
            return true;
        }
        if ("message_detail".equals(s))
        {
            if (jsonparser.c() == JsonToken.m)
            {
                s = obj4;
            } else
            {
                s = jsonparser.f();
            }
            igresponse.h = s;
            return true;
        }
        if ("status".equals(s))
        {
            if (jsonparser.c() == JsonToken.m)
            {
                s = obj5;
            } else
            {
                s = jsonparser.f();
            }
            igresponse.c = s;
            return true;
        } else
        {
            return false;
        }
    }
}
