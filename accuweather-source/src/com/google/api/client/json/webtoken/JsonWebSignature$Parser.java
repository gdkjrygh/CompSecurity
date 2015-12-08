// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.json.webtoken;

import com.google.api.client.json.JsonFactory;
import com.google.api.client.util.Base64;
import com.google.api.client.util.Preconditions;
import com.google.api.client.util.StringUtils;
import java.io.ByteArrayInputStream;
import java.io.IOException;

// Referenced classes of package com.google.api.client.json.webtoken:
//            JsonWebSignature

public static final class jsonFactory
{

    private Class headerClass;
    private final JsonFactory jsonFactory;
    private Class payloadClass;

    public Class getHeaderClass()
    {
        return headerClass;
    }

    public JsonFactory getJsonFactory()
    {
        return jsonFactory;
    }

    public Class getPayloadClass()
    {
        return payloadClass;
    }

    public JsonWebSignature parse(String s)
        throws IOException
    {
        boolean flag1 = true;
        int i = s.indexOf('.');
        byte abyte0[];
        byte abyte1[];
        byte abyte2[];
        payloadClass payloadclass;
        int j;
        boolean flag;
        if (i != -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        abyte2 = Base64.decodeBase64(s.substring(0, i));
        j = s.indexOf('.', i + 1);
        if (j != -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        if (s.indexOf('.', j + 1) == -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        abyte0 = Base64.decodeBase64(s.substring(i + 1, j));
        abyte1 = Base64.decodeBase64(s.substring(j + 1));
        s = StringUtils.getBytesUtf8(s.substring(0, j));
        payloadclass = (payloadClass)jsonFactory.fromInputStream(new ByteArrayInputStream(abyte2), headerClass);
        if (payloadclass.getAlgorithm() != null)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        return new JsonWebSignature(payloadclass, (getAlgorithm)jsonFactory.fromInputStream(new ByteArrayInputStream(abyte0), payloadClass), abyte1, s);
    }

    public payloadClass setHeaderClass(Class class1)
    {
        headerClass = class1;
        return this;
    }

    public headerClass setPayloadClass(Class class1)
    {
        payloadClass = class1;
        return this;
    }

    public A(JsonFactory jsonfactory)
    {
        headerClass = com/google/api/client/json/webtoken/JsonWebSignature$Header;
        payloadClass = com/google/api/client/json/webtoken/JsonWebToken$Payload;
        jsonFactory = (JsonFactory)Preconditions.checkNotNull(jsonfactory);
    }
}
