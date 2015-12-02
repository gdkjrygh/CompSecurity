// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.zero.ui;

import com.facebook.common.json.jsonmirror.g;
import com.facebook.common.w.e;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

// Referenced classes of package com.facebook.zero.ui:
//            CarrierBottomBannerData

public class h
{

    private final ObjectMapper a;
    private final JsonFactory b;

    public h(ObjectMapper objectmapper, JsonFactory jsonfactory)
    {
        a = objectmapper;
        b = jsonfactory;
    }

    public CarrierBottomBannerData a(JsonNode jsonnode)
    {
        jsonnode = jsonnode.get("data").get(0);
        JsonNode jsonnode1 = jsonnode.get("content");
        JsonNode jsonnode2 = jsonnode.get("action");
        return new CarrierBottomBannerData(e.a(jsonnode.get("id"), ""), e.a(jsonnode.get("title"), ""), e.a(jsonnode1.get("text"), ""), e.a(jsonnode2.get("title"), ""), e.a(jsonnode2.get("url"), ""));
    }

    public CarrierBottomBannerData a(String s)
    {
        s = b.createJsonParser(s);
        s.nextToken();
        return (CarrierBottomBannerData)g.a(s, com/facebook/zero/ui/CarrierBottomBannerData);
    }

    public String a(CarrierBottomBannerData carrierbottombannerdata)
    {
        return a.writeValueAsString(carrierbottombannerdata);
    }
}
