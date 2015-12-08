// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.http.protocol;

import java.util.HashMap;
import java.util.Map;

// Referenced classes of package org.apache.http.protocol:
//            HttpContext

public class BasicHttpContext
    implements HttpContext
{

    private Map map;
    private final HttpContext parentContext;

    public BasicHttpContext()
    {
        this(null);
    }

    public BasicHttpContext(HttpContext httpcontext)
    {
        map = null;
        parentContext = httpcontext;
    }

    public void clear()
    {
        if (map != null)
        {
            map.clear();
        }
    }

    public Object getAttribute(String s)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("Id may not be null");
        }
        Object obj = null;
        if (map != null)
        {
            obj = map.get(s);
        }
        Object obj1 = obj;
        if (obj == null)
        {
            obj1 = obj;
            if (parentContext != null)
            {
                obj1 = parentContext.getAttribute(s);
            }
        }
        return obj1;
    }

    public Object removeAttribute(String s)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("Id may not be null");
        }
        if (map != null)
        {
            return map.remove(s);
        } else
        {
            return null;
        }
    }

    public void setAttribute(String s, Object obj)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("Id may not be null");
        }
        if (map == null)
        {
            map = new HashMap();
        }
        map.put(s, obj);
    }

    public String toString()
    {
        if (map != null)
        {
            return map.toString();
        } else
        {
            return "{}";
        }
    }
}
