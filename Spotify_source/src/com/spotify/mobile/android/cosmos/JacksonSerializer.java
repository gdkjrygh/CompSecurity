// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.cosmos;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import dmz;
import gng;
import gni;
import java.nio.charset.Charset;

// Referenced classes of package com.spotify.mobile.android.cosmos:
//            ParserException, JacksonModel

public class JacksonSerializer
{

    private static final Charset DEFAULT_CHARSET = Charset.forName("UTF-8");
    private static final gng sObjectMapperBuilder;

    public JacksonSerializer()
    {
    }

    public static byte[] toBytes(JacksonModel jacksonmodel)
    {
        return toBytes(jacksonmodel, null);
    }

    public static byte[] toBytes(JacksonModel jacksonmodel, ObjectMapper objectmapper)
    {
        if (jacksonmodel == null)
        {
            throw new IllegalArgumentException("jacksonObject can't be null");
        }
        ObjectMapper objectmapper1 = objectmapper;
        if (objectmapper == null)
        {
            objectmapper1 = sObjectMapperBuilder.a();
        }
        try
        {
            jacksonmodel = objectmapper1.writeValueAsString(jacksonmodel).getBytes(DEFAULT_CHARSET);
        }
        // Misplaced declaration of an exception variable
        catch (JacksonModel jacksonmodel)
        {
            throw new ParserException(jacksonmodel);
        }
        return jacksonmodel;
    }

    static 
    {
        sObjectMapperBuilder = ((gni)dmz.a(gni)).a().a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }
}
