// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package oauth.signpost.http;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import oauth.signpost.a;

public class HttpParameters
    implements Serializable, Map
{

    private TreeMap wrappedMap;

    public HttpParameters()
    {
        wrappedMap = new TreeMap();
    }

    public String a(Object obj, boolean flag)
    {
        obj = (SortedSet)wrappedMap.get(obj);
        if (obj == null || ((SortedSet) (obj)).isEmpty())
        {
            obj = null;
        } else
        {
            String s = (String)((SortedSet) (obj)).first();
            obj = s;
            if (flag)
            {
                return oauth.signpost.a.b(s);
            }
        }
        return ((String) (obj));
    }

    public String a(String s)
    {
        String s1 = b(s);
        if (s1 == null)
        {
            return null;
        } else
        {
            return (new StringBuilder()).append(s).append("=\"").append(s1).append("\"").toString();
        }
    }

    public String a(String s, String s1)
    {
        return a(s, s1, false);
    }

    public String a(String s, String s1, boolean flag)
    {
        String s2 = s;
        if (flag)
        {
            s2 = oauth.signpost.a.a(s);
        }
        s = (SortedSet)wrappedMap.get(s2);
        Object obj = s;
        if (s == null)
        {
            obj = new TreeSet();
            wrappedMap.put(s2, obj);
        }
        s = s1;
        if (s1 != null)
        {
            s = s1;
            if (flag)
            {
                s = oauth.signpost.a.a(s1);
            }
            ((SortedSet) (obj)).add(s);
        }
        return s;
    }

    public SortedSet a(Object obj)
    {
        return (SortedSet)wrappedMap.get(obj);
    }

    public SortedSet a(String s, SortedSet sortedset)
    {
        return (SortedSet)wrappedMap.put(s, sortedset);
    }

    public SortedSet a(String s, SortedSet sortedset, boolean flag)
    {
        if (flag)
        {
            d(s);
            for (sortedset = sortedset.iterator(); sortedset.hasNext(); a(s, (String)sortedset.next(), true)) { }
            return a(s);
        } else
        {
            return (SortedSet)wrappedMap.put(s, sortedset);
        }
    }

    public HttpParameters a()
    {
        HttpParameters httpparameters = new HttpParameters();
        Iterator iterator = entrySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            String s = (String)entry.getKey();
            if (s.startsWith("oauth_") || s.startsWith("x_oauth_"))
            {
                httpparameters.a(s, (SortedSet)entry.getValue());
            }
        } while (true);
        return httpparameters;
    }

    public void a(Map map)
    {
        Object obj;
        String s;
        for (Iterator iterator = map.keySet().iterator(); iterator.hasNext(); ((SortedSet) (obj)).addAll((Collection)map.get(s)))
        {
            s = (String)iterator.next();
            SortedSet sortedset = a(s);
            obj = sortedset;
            if (sortedset == null)
            {
                obj = new TreeSet();
                a(s, ((SortedSet) (obj)));
            }
        }

    }

    public void a(Map map, boolean flag)
    {
        if (flag)
        {
            String s;
            for (Iterator iterator = map.keySet().iterator(); iterator.hasNext(); a(s, (SortedSet)map.get(s), true))
            {
                s = (String)iterator.next();
            }

        } else
        {
            wrappedMap.putAll(map);
        }
    }

    public void a(String as[], boolean flag)
    {
        for (int i = 0; i < as.length - 1; i += 2)
        {
            a(as[i], as[i + 1], flag);
        }

    }

    public String b(Object obj)
    {
        return a(obj, false);
    }

    public String b(Object obj, boolean flag)
    {
        StringBuilder stringbuilder = new StringBuilder();
        Object obj1 = obj;
        if (flag)
        {
            obj1 = oauth.signpost.a.a((String)obj);
        }
        obj = (Set)wrappedMap.get(obj1);
        if (obj == null)
        {
            return (new StringBuilder()).append(obj1).append("=").toString();
        }
        obj = ((Set) (obj)).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            stringbuilder.append((new StringBuilder()).append(obj1).append("=").append((String)((Iterator) (obj)).next()).toString());
            if (((Iterator) (obj)).hasNext())
            {
                stringbuilder.append("&");
            }
        } while (true);
        return stringbuilder.toString();
    }

    public String b(String s, String s1)
    {
        return a(s, s1);
    }

    public String c(Object obj)
    {
        return b(obj, true);
    }

    public void clear()
    {
        wrappedMap.clear();
    }

    public boolean containsKey(Object obj)
    {
        return wrappedMap.containsKey(obj);
    }

    public boolean containsValue(Object obj)
    {
        for (Iterator iterator = wrappedMap.values().iterator(); iterator.hasNext();)
        {
            if (((SortedSet)iterator.next()).contains(obj))
            {
                return true;
            }
        }

        return false;
    }

    public SortedSet d(Object obj)
    {
        return (SortedSet)wrappedMap.remove(obj);
    }

    public Set entrySet()
    {
        return wrappedMap.entrySet();
    }

    public Object get(Object obj)
    {
        return a(obj);
    }

    public boolean isEmpty()
    {
        return wrappedMap.isEmpty();
    }

    public Set keySet()
    {
        return wrappedMap.keySet();
    }

    public Object put(Object obj, Object obj1)
    {
        return a((String)obj, (SortedSet)obj1);
    }

    public void putAll(Map map)
    {
        wrappedMap.putAll(map);
    }

    public Object remove(Object obj)
    {
        return d(obj);
    }

    public int size()
    {
        Iterator iterator = wrappedMap.keySet().iterator();
        String s;
        int i;
        for (i = 0; iterator.hasNext(); i = ((SortedSet)wrappedMap.get(s)).size() + i)
        {
            s = (String)iterator.next();
        }

        return i;
    }

    public Collection values()
    {
        return wrappedMap.values();
    }
}
