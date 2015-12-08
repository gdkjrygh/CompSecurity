// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.cosmos.parser;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.logging.Logger;
import ctz;
import dmz;
import gng;
import gni;
import java.io.IOException;
import java.nio.charset.Charset;

// Referenced classes of package com.spotify.mobile.android.cosmos.parser:
//            ResponseParser

public class JsonParser
    implements ResponseParser
{

    private static final Charset DEFAULT_CHARSET = Charset.forName("UTF-8");
    private static final ObjectMapper DEFAULT_OBJECT_MAPPER;
    private final Class mClazz;
    private final ObjectMapper mObjectMapper;

    public JsonParser(Class class1)
    {
        this(class1, null);
    }

    public JsonParser(Class class1, ObjectMapper objectmapper)
    {
        mClazz = (Class)ctz.a(class1);
        if (objectmapper == null)
        {
            objectmapper = DEFAULT_OBJECT_MAPPER;
        }
        mObjectMapper = objectmapper;
    }

    public static JsonParser forClass(Class class1)
    {
        return new JsonParser(class1);
    }

    public Object parseResponse(Response response)
    {
        response = new String(response.getBody(), DEFAULT_CHARSET);
        Object obj;
        try
        {
            obj = mObjectMapper.readValue(response, mClazz);
        }
        catch (ArrayStoreException arraystoreexception)
        {
            Logger.c("Error parsing JSON String: %s", new Object[] {
                response
            });
            Assertion.a("Caught an exception while parsing JSON string", arraystoreexception);
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Response response)
        {
            throw new com.spotify.mobile.android.cosmos.ParsingCallbackReceiver.ParserException(response);
        }
        return obj;
    }

    static 
    {
        DEFAULT_OBJECT_MAPPER = ((gni)dmz.a(gni)).a().a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).a();
    }
}
