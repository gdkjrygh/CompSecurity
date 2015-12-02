// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.json;

import com.facebook.inject.a.a;
import com.facebook.inject.a.g;
import com.facebook.inject.b;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.smile.SmileFactory;
import com.fasterxml.jackson.datatype.guava.GuavaModule;

// Referenced classes of package com.facebook.common.json:
//            a, k, h, j, 
//            g, i

public class e extends b
{

    public e()
    {
    }

    static ObjectMapper a(ObjectMapper objectmapper)
    {
        return b(objectmapper);
    }

    private static ObjectMapper b(ObjectMapper objectmapper)
    {
        objectmapper.registerModule(new GuavaModule());
        objectmapper.registerModule(new com.facebook.common.json.a());
        objectmapper.setVisibility(PropertyAccessor.ALL, com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE);
        objectmapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        return objectmapper;
    }

    protected void a()
    {
        a(com/facebook/common/json/k).a(new h(null)).a();
        a(com/fasterxml/jackson/dataformat/smile/SmileFactory).a(new j(null)).a();
        a(com/fasterxml/jackson/core/JsonFactory).a(new com.facebook.common.json.g(null)).a();
        a(com/fasterxml/jackson/databind/ObjectMapper).a(new i(null)).a();
    }
}
