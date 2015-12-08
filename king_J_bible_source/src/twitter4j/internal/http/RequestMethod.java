// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.internal.http;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public final class RequestMethod
    implements Serializable
{

    public static final RequestMethod DELETE = new RequestMethod("DELETE");
    public static final RequestMethod GET = new RequestMethod("GET");
    public static final RequestMethod HEAD = new RequestMethod("HEAD");
    public static final RequestMethod POST = new RequestMethod("POST");
    public static final RequestMethod PUT = new RequestMethod("PUT");
    private static final Map instances = new HashMap(5);
    private static final long serialVersionUID = 0xc2f2d25e7f7749d3L;
    private final String name;

    private RequestMethod(String s)
    {
        name = s;
        instances.put(s, this);
    }

    private static RequestMethod getInstance(String s)
    {
        return (RequestMethod)instances.get(s);
    }

    private Object readResolve()
        throws ObjectStreamException
    {
        return getInstance(name);
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof RequestMethod))
            {
                return false;
            }
            obj = (RequestMethod)obj;
            if (!name.equals(((RequestMethod) (obj)).name))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return name.hashCode();
    }

    public final String name()
    {
        return name;
    }

    public String toString()
    {
        return "RequestMethod{name='" + name + '\'' + '}';
    }

}
