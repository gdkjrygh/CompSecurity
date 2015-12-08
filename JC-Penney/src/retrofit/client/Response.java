// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package retrofit.client;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import retrofit.mime.TypedInput;

public final class Response
{

    private final TypedInput body;
    private final List headers;
    private final String reason;
    private final int status;
    private final String url;

    public Response(String s, int i, String s1, List list, TypedInput typedinput)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("url == null");
        }
        if (i < 200)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Invalid status code: ").append(i).toString());
        }
        if (s1 == null)
        {
            throw new IllegalArgumentException("reason == null");
        }
        if (list == null)
        {
            throw new IllegalArgumentException("headers == null");
        } else
        {
            url = s;
            status = i;
            reason = s1;
            headers = Collections.unmodifiableList(new ArrayList(list));
            body = typedinput;
            return;
        }
    }

    public TypedInput getBody()
    {
        return body;
    }

    public List getHeaders()
    {
        return headers;
    }

    public String getReason()
    {
        return reason;
    }

    public int getStatus()
    {
        return status;
    }

    public String getUrl()
    {
        return url;
    }
}
