// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package retrofit.client;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import retrofit.mime.TypedOutput;

public final class Request
{

    private final TypedOutput body;
    private final List headers;
    private final String method;
    private final String url;

    public Request(String s, String s1, List list, TypedOutput typedoutput)
    {
        if (s == null)
        {
            throw new NullPointerException("Method must not be null.");
        }
        if (s1 == null)
        {
            throw new NullPointerException("URL must not be null.");
        }
        method = s;
        url = s1;
        if (list == null)
        {
            headers = Collections.emptyList();
        } else
        {
            headers = Collections.unmodifiableList(new ArrayList(list));
        }
        body = typedoutput;
    }

    public TypedOutput getBody()
    {
        return body;
    }

    public List getHeaders()
    {
        return headers;
    }

    public String getMethod()
    {
        return method;
    }

    public String getUrl()
    {
        return url;
    }
}
