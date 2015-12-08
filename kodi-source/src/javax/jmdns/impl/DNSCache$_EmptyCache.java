// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package javax.jmdns.impl;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package javax.jmdns.impl:
//            DNSCache

static final class  extends DNSCache
{

    public boolean containsKey(Object obj)
    {
        return false;
    }

    public boolean containsValue(Object obj)
    {
        return false;
    }

    public Set entrySet()
    {
        return Collections.emptySet();
    }

    public boolean equals(Object obj)
    {
        return (obj instanceof Map) && ((Map)obj).size() == 0;
    }

    public volatile Object get(Object obj)
    {
        return get(obj);
    }

    public List get(Object obj)
    {
        return null;
    }

    public int hashCode()
    {
        return 0;
    }

    public boolean isEmpty()
    {
        return true;
    }

    public Set keySet()
    {
        return Collections.emptySet();
    }

    public volatile Object put(Object obj, Object obj1)
    {
        return put((String)obj, (List)obj1);
    }

    public List put(String s, List list)
    {
        return null;
    }

    public int size()
    {
        return 0;
    }

    public Collection values()
    {
        return Collections.emptySet();
    }

    ()
    {
    }
}
