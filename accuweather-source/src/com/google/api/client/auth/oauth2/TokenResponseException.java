// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.auth.oauth2;

import com.google.api.client.http.HttpMediaType;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.HttpResponseException;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.JsonObjectParser;
import com.google.api.client.util.Preconditions;
import com.google.api.client.util.StringUtils;
import com.google.api.client.util.Strings;
import java.io.IOException;

// Referenced classes of package com.google.api.client.auth.oauth2:
//            TokenErrorResponse

public class TokenResponseException extends HttpResponseException
{

    private static final long serialVersionUID = 0x37cc5b6d7204050cL;
    private final transient TokenErrorResponse details;

    TokenResponseException(com.google.api.client.http.HttpResponseException.Builder builder, TokenErrorResponse tokenerrorresponse)
    {
        super(builder);
        details = tokenerrorresponse;
    }

    public static TokenResponseException from(JsonFactory jsonfactory, HttpResponse httpresponse)
    {
        Object obj;
        String s;
        String s1;
        Object obj1;
        com.google.api.client.http.HttpResponseException.Builder builder;
        String s2;
        builder = new com.google.api.client.http.HttpResponseException.Builder(httpresponse.getStatusCode(), httpresponse.getStatusMessage(), httpresponse.getHeaders());
        Preconditions.checkNotNull(jsonfactory);
        obj1 = null;
        s1 = null;
        s = null;
        s2 = httpresponse.getContentType();
        obj = obj1;
        if (httpresponse.isSuccessStatusCode() || s2 == null) goto _L2; else goto _L1
_L1:
        obj = obj1;
        if (!HttpMediaType.equalsIgnoreParameters("application/json; charset=UTF-8", s2)) goto _L2; else goto _L3
_L3:
        obj = obj1;
        jsonfactory = (TokenErrorResponse)(new JsonObjectParser(jsonfactory)).parseAndClose(httpresponse.getContent(), httpresponse.getContentCharset(), com/google/api/client/auth/oauth2/TokenErrorResponse);
        obj = jsonfactory;
        s1 = jsonfactory.toPrettyString();
        s = s1;
        obj = jsonfactory;
        jsonfactory = s;
_L5:
        httpresponse = HttpResponseException.computeMessageBuffer(httpresponse);
        if (!Strings.isNullOrEmpty(jsonfactory))
        {
            httpresponse.append(StringUtils.LINE_SEPARATOR).append(jsonfactory);
            builder.setContent(jsonfactory);
        }
        builder.setMessage(httpresponse.toString());
        return new TokenResponseException(builder, ((TokenErrorResponse) (obj)));
_L2:
        obj = obj1;
        jsonfactory = httpresponse.parseAsString();
        obj = s1;
        continue; /* Loop/switch isn't completed */
        jsonfactory;
        jsonfactory.printStackTrace();
        jsonfactory = s;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public final TokenErrorResponse getDetails()
    {
        return details;
    }
}
