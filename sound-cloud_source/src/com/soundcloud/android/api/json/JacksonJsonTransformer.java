// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.api.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.soundcloud.android.api.ApiMapperException;
import com.soundcloud.android.api.legacy.PublicApi;
import com.soundcloud.java.reflect.TypeToken;
import java.io.IOException;

// Referenced classes of package com.soundcloud.android.api.json:
//            JsonTransformer

public class JacksonJsonTransformer
    implements JsonTransformer
{

    private final ObjectMapper objectMapper = PublicApi.buildObjectMapper();
    private final TypeFactory typeFactory;

    public JacksonJsonTransformer()
    {
        typeFactory = objectMapper.getTypeFactory();
    }

    public Object fromJson(String s, TypeToken typetoken)
        throws IOException, ApiMapperException
    {
        try
        {
            s = ((String) (objectMapper.readValue(s, typeFactory.constructType(typetoken.getType()))));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new ApiMapperException(s);
        }
        return s;
    }

    public String toJson(Object obj)
        throws ApiMapperException
    {
        try
        {
            obj = objectMapper.writeValueAsString(obj);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new ApiMapperException(((Throwable) (obj)));
        }
        return ((String) (obj));
    }
}
