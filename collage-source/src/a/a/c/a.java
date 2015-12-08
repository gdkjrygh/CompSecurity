// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a.c;

import a.a.b;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class a
    implements Serializable, Map
{

    private TreeMap a;

    public a()
    {
        a = new TreeMap();
    }

    public a a()
    {
        a a1 = new a();
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
                a1.a(s, (SortedSet)entry.getValue());
            }
        } while (true);
        return a1;
    }

    public String a(Object obj, boolean flag)
    {
        obj = (SortedSet)a.get(obj);
        if (obj == null || ((SortedSet) (obj)).isEmpty())
        {
            obj = null;
        } else
        {
            String s = (String)((SortedSet) (obj)).first();
            obj = s;
            if (flag)
            {
                return a.a.b.b(s);
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
            s2 = a.a.b.a(s);
        }
        s = (SortedSet)a.get(s2);
        Object obj = s;
        if (s == null)
        {
            obj = new TreeSet();
            a.put(s2, obj);
        }
        s = s1;
        if (s1 != null)
        {
            s = s1;
            if (flag)
            {
                s = a.a.b.a(s1);
            }
            ((SortedSet) (obj)).add(s);
        }
        return s;
    }

    public SortedSet a(Object obj)
    {
        return (SortedSet)a.get(obj);
    }

    public SortedSet a(String s, SortedSet sortedset)
    {
        return (SortedSet)a.put(s, sortedset);
    }

    public SortedSet a(String s, SortedSet sortedset, boolean flag)
    {
        if (flag)
        {
            c(s);
            for (sortedset = sortedset.iterator(); sortedset.hasNext(); a(s, (String)sortedset.next(), true)) { }
            return a(s);
        } else
        {
            return (SortedSet)a.put(s, sortedset);
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
            a.putAll(map);
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
            obj1 = a.a.b.a((String)obj);
        }
        obj = (Set)a.get(obj1);
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

    public SortedSet c(Object obj)
    {
        return (SortedSet)a.remove(obj);
    }

    public void clear()
    {
        a.clear();
    }

    public boolean containsKey(Object obj)
    {
        return a.containsKey(obj);
    }

    public boolean containsValue(Object obj)
    {
        for (Iterator iterator = a.values().iterator(); iterator.hasNext();)
        {
            if (((SortedSet)iterator.next()).contains(obj))
            {
                return true;
            }
        }

        return false;
    }

    public Set entrySet()
    {
        return a.entrySet();
    }

    public Object get(Object obj)
    {
        return a(obj);
    }

    public boolean isEmpty()
    {
        return a.isEmpty();
    }

    public Set keySet()
    {
        return a.keySet();
    }

    public Object put(Object obj, Object obj1)
    {
        return a((String)obj, (SortedSet)obj1);
    }

    public void putAll(Map map)
    {
        a.putAll(map);
    }

    public Object remove(Object obj)
    {
        return c(obj);
    }

    public int size()
    {
        Iterator iterator = a.keySet().iterator();
        String s;
        int i;
        for (i = 0; iterator.hasNext(); i = ((SortedSet)a.get(s)).size() + i)
        {
            s = (String)iterator.next();
        }

        return i;
    }

    public Collection values()
    {
        return a.values();
    }
}
