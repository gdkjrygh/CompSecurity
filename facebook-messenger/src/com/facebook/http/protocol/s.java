// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.http.protocol;

import com.facebook.common.w.e;
import com.facebook.common.w.n;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;

// Referenced classes of package com.facebook.http.protocol:
//            ApiErrorResult, d, e

public class s
{

    private final ObjectMapper a;

    public s(ObjectMapper objectmapper)
    {
        a = objectmapper;
    }

    private static void b(JsonNode jsonnode)
    {
        if (jsonnode != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (!jsonnode.isObject())
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!jsonnode.has("error_code"))
        {
            break; /* Loop/switch isn't completed */
        }
        jsonnode = new ApiErrorResult(e.d(jsonnode.path("error_code")), e.b(jsonnode.path("error_msg")), e.b(jsonnode.path("error_data")), d.API_EC_DOMAIN);
_L4:
        if (jsonnode != null)
        {
            throw new com.facebook.http.protocol.e(jsonnode);
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (jsonnode.has("error") && jsonnode.path("error").isInt())
        {
            jsonnode = new ApiErrorResult(e.d(jsonnode.path("error")), e.b(jsonnode.path("error_description")), null, d.API_EC_DOMAIN);
        } else
        {
            if (!jsonnode.has("error") || !jsonnode.path("error").isObject())
            {
                break MISSING_BLOCK_LABEL_288;
            }
            jsonnode = jsonnode.path("error");
            if (jsonnode.has("code") && jsonnode.has("description"))
            {
                jsonnode = new ApiErrorResult(e.d(jsonnode.path("code")), e.b(jsonnode.path("description")), null, d.GRAPHQL_KERROR_DOMAIN);
            } else
            {
                if (!jsonnode.has("message"))
                {
                    break MISSING_BLOCK_LABEL_288;
                }
                int i;
                if (jsonnode.has("code"))
                {
                    i = e.d(jsonnode.path("code"));
                } else
                {
                    i = 0;
                }
                jsonnode = new ApiErrorResult(i, e.b(jsonnode.path("message")), jsonnode.path("error_data").toString(), d.API_EC_DOMAIN);
            }
        }
          goto _L4
        if (jsonnode.isArray()) goto _L1; else goto _L5
_L5:
        throw new JsonMappingException("Response was neither an array or a dictionary");
        jsonnode = null;
          goto _L4
    }

    private void b(String s1)
    {
        b(a.readTree(s1));
    }

    public void a(JsonNode jsonnode)
    {
        if (jsonnode == null)
        {
            return;
        }
        try
        {
            b(jsonnode);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (JsonNode jsonnode)
        {
            throw jsonnode;
        }
        // Misplaced declaration of an exception variable
        catch (JsonNode jsonnode)
        {
            return;
        }
        // Misplaced declaration of an exception variable
        catch (JsonNode jsonnode)
        {
            return;
        }
    }

    public void a(String s1)
    {
        if (n.a(s1))
        {
            return;
        }
        try
        {
            b(s1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            throw s1;
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            return;
        }
    }
}
