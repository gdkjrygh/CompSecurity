// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.googleapis.json;

import com.google.api.client.http.HttpMediaType;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.HttpResponseException;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.JsonParser;
import com.google.api.client.json.JsonToken;
import com.google.api.client.util.Preconditions;
import com.google.api.client.util.StringUtils;
import com.google.api.client.util.Strings;
import java.io.IOException;

// Referenced classes of package com.google.api.client.googleapis.json:
//            GoogleJsonError

public class GoogleJsonResponseException extends HttpResponseException
{

    private static final long serialVersionUID = 0x5aff10c793dbb70L;
    private final transient GoogleJsonError details;

    GoogleJsonResponseException(com.google.api.client.http.HttpResponseException.Builder builder, GoogleJsonError googlejsonerror)
    {
        super(builder);
        details = googlejsonerror;
    }

    public static HttpResponse execute(JsonFactory jsonfactory, HttpRequest httprequest)
        throws GoogleJsonResponseException, IOException
    {
        Preconditions.checkNotNull(jsonfactory);
        boolean flag = httprequest.getThrowExceptionOnExecuteError();
        if (flag)
        {
            httprequest.setThrowExceptionOnExecuteError(false);
        }
        HttpResponse httpresponse = httprequest.execute();
        httprequest.setThrowExceptionOnExecuteError(flag);
        if (!flag || httpresponse.isSuccessStatusCode())
        {
            return httpresponse;
        } else
        {
            throw from(jsonfactory, httpresponse);
        }
    }

    public static GoogleJsonResponseException from(JsonFactory jsonfactory, HttpResponse httpresponse)
    {
        JsonFactory jsonfactory1;
        Object obj;
        Object obj1;
        String s;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        com.google.api.client.http.HttpResponseException.Builder builder;
        builder = new com.google.api.client.http.HttpResponseException.Builder(httpresponse.getStatusCode(), httpresponse.getStatusMessage(), httpresponse.getHeaders());
        Preconditions.checkNotNull(jsonfactory);
        jsonfactory1 = null;
        obj1 = null;
        obj7 = null;
        obj8 = null;
        obj5 = null;
        obj4 = null;
        obj3 = null;
        obj6 = null;
        s = obj3;
        obj = obj1;
        if (httpresponse.isSuccessStatusCode()) goto _L2; else goto _L1
_L1:
        s = obj3;
        obj = obj1;
        if (!HttpMediaType.equalsIgnoreParameters("application/json; charset=UTF-8", httpresponse.getContentType())) goto _L2; else goto _L3
_L3:
        s = obj3;
        obj = obj1;
        Object obj2 = httpresponse.getContent();
        if (obj2 == null) goto _L2; else goto _L4
_L4:
        JsonParser jsonparser;
        JsonParser jsonparser1;
        jsonparser1 = null;
        jsonparser = null;
        jsonfactory1 = obj7;
        obj1 = obj8;
        JsonParser jsonparser2 = jsonfactory.createJsonParser(httpresponse.getContent());
        jsonfactory1 = obj7;
        jsonparser = jsonparser2;
        obj1 = obj8;
        jsonparser1 = jsonparser2;
        jsonfactory = jsonparser2.getCurrentToken();
        jsonfactory1 = jsonfactory;
        if (jsonfactory != null)
        {
            break MISSING_BLOCK_LABEL_173;
        }
        jsonfactory1 = obj7;
        jsonparser = jsonparser2;
        obj1 = obj8;
        jsonparser1 = jsonparser2;
        jsonfactory = jsonparser2.nextToken();
        jsonfactory1 = jsonfactory;
        obj2 = obj6;
        jsonfactory = obj5;
        if (jsonfactory1 == null)
        {
            break MISSING_BLOCK_LABEL_284;
        }
        jsonfactory1 = obj7;
        jsonparser = jsonparser2;
        obj1 = obj8;
        jsonparser1 = jsonparser2;
        jsonparser2.skipToKey("error");
        obj2 = obj6;
        jsonfactory = obj5;
        jsonfactory1 = obj7;
        jsonparser = jsonparser2;
        obj1 = obj8;
        jsonparser1 = jsonparser2;
        if (jsonparser2.getCurrentToken() == JsonToken.END_OBJECT)
        {
            break MISSING_BLOCK_LABEL_284;
        }
        jsonfactory1 = obj7;
        jsonparser = jsonparser2;
        obj1 = obj8;
        jsonparser1 = jsonparser2;
        jsonfactory = (GoogleJsonError)jsonparser2.parseAndClose(com/google/api/client/googleapis/json/GoogleJsonError);
        jsonfactory1 = jsonfactory;
        jsonparser = jsonparser2;
        obj1 = jsonfactory;
        jsonparser1 = jsonparser2;
        obj2 = jsonfactory.toPrettyString();
        if (jsonparser2 != null) goto _L6; else goto _L5
_L5:
        s = ((String) (obj2));
        obj = jsonfactory;
        httpresponse.ignore();
        obj = jsonfactory;
        obj1 = obj2;
_L11:
        jsonfactory = HttpResponseException.computeMessageBuffer(httpresponse);
        if (!Strings.isNullOrEmpty(((String) (obj1))))
        {
            jsonfactory.append(StringUtils.LINE_SEPARATOR).append(((String) (obj1)));
            builder.setContent(((String) (obj1)));
        }
        builder.setMessage(jsonfactory.toString());
        return new GoogleJsonResponseException(builder, ((GoogleJsonError) (obj)));
_L6:
        obj1 = obj2;
        obj = jsonfactory;
        if (jsonfactory != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        s = ((String) (obj2));
        obj = jsonfactory;
        jsonparser2.close();
        obj1 = obj2;
        obj = jsonfactory;
        continue; /* Loop/switch isn't completed */
        jsonfactory;
        obj1 = jsonfactory1;
        jsonparser1 = jsonparser;
        jsonfactory.printStackTrace();
        if (jsonparser != null)
        {
            break MISSING_BLOCK_LABEL_438;
        }
        s = obj3;
        obj = jsonfactory1;
        httpresponse.ignore();
        obj1 = obj4;
        obj = jsonfactory1;
        continue; /* Loop/switch isn't completed */
        obj1 = obj4;
        obj = jsonfactory1;
        if (jsonfactory1 != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        s = obj3;
        obj = jsonfactory1;
        jsonparser.close();
        obj1 = obj4;
        obj = jsonfactory1;
        continue; /* Loop/switch isn't completed */
        jsonfactory;
        if (jsonparser1 != null) goto _L8; else goto _L7
_L7:
        s = obj3;
        obj = obj1;
        httpresponse.ignore();
_L9:
        s = obj3;
        obj = obj1;
        try
        {
            throw jsonfactory;
        }
        // Misplaced declaration of an exception variable
        catch (JsonFactory jsonfactory)
        {
            jsonfactory.printStackTrace();
            obj1 = s;
        }
        continue; /* Loop/switch isn't completed */
_L8:
        if (obj1 != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        s = obj3;
        obj = obj1;
        jsonparser1.close();
        if (true) goto _L9; else goto _L2
_L2:
        s = obj3;
        obj = obj1;
        obj1 = httpresponse.parseAsString();
        obj = jsonfactory1;
        if (true) goto _L11; else goto _L10
_L10:
    }

    public final GoogleJsonError getDetails()
    {
        return details;
    }
}
