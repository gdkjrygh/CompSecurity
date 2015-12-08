// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.igmodel.metadata;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

// Referenced classes of package com.pinterest.api.igmodel.metadata:
//            IgMetadata

public final class IgMetadata__JsonHelper
{

    public static boolean a(IgMetadata igmetadata, String s, JsonParser jsonparser)
    {
        Object obj1 = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj = null;
        if ("id".equals(s))
        {
            if (jsonparser.c() == JsonToken.m)
            {
                s = obj;
            } else
            {
                s = jsonparser.f();
            }
            igmetadata.a = s;
            return true;
        }
        if ("apple_touch_icon_link".equals(s))
        {
            if (jsonparser.c() == JsonToken.m)
            {
                s = obj1;
            } else
            {
                s = jsonparser.f();
            }
            igmetadata.b = s;
            return true;
        }
        if ("site_name".equals(s))
        {
            if (jsonparser.c() == JsonToken.m)
            {
                s = obj2;
            } else
            {
                s = jsonparser.f();
            }
            igmetadata.e = s;
            return true;
        }
        if ("favicon_link".equals(s))
        {
            if (jsonparser.c() == JsonToken.m)
            {
                s = obj3;
            } else
            {
                s = jsonparser.f();
            }
            igmetadata.c = s;
            return true;
        }
        if ("locale".equals(s))
        {
            if (jsonparser.c() == JsonToken.m)
            {
                s = obj4;
            } else
            {
                s = jsonparser.f();
            }
            igmetadata.d = s;
            return true;
        }
        if ("title".equals(s))
        {
            if (jsonparser.c() == JsonToken.m)
            {
                s = obj5;
            } else
            {
                s = jsonparser.f();
            }
            igmetadata.f = s;
            return true;
        }
        if ("url".equals(s))
        {
            if (jsonparser.c() == JsonToken.m)
            {
                s = obj6;
            } else
            {
                s = jsonparser.f();
            }
            igmetadata.g = s;
            return true;
        } else
        {
            return false;
        }
    }
}
