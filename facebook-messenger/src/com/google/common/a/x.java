// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

// Referenced classes of package com.google.common.a:
//            iw, ap, ao, ak, 
//            ah, am, aj, af, 
//            ai, ab, ax, y, 
//            kk, z, aa, ae, 
//            jf

abstract class x
    implements iw, Serializable
{

    private transient Map a;
    private transient int b;
    private transient Set c;
    private transient jf d;
    private transient Collection e;
    private transient Map f;

    protected x(Map map)
    {
        Preconditions.checkArgument(map.isEmpty());
        a = map;
    }

    static int a(x x1, int i1)
    {
        i1 = x1.b + i1;
        x1.b = i1;
        return i1;
    }

    static int a(x x1, Object obj)
    {
        return x1.b(obj);
    }

    static Collection a(x x1, Object obj, Collection collection)
    {
        return x1.a(obj, collection);
    }

    private Collection a(Object obj)
    {
        Collection collection1 = (Collection)a.get(obj);
        Collection collection = collection1;
        if (collection1 == null)
        {
            collection = e(obj);
            a.put(obj, collection);
        }
        return collection;
    }

    private Collection a(Object obj, Collection collection)
    {
        if (collection instanceof SortedSet)
        {
            return new ap(this, obj, (SortedSet)collection, null);
        }
        if (collection instanceof Set)
        {
            return new ao(this, obj, (Set)collection);
        }
        if (collection instanceof List)
        {
            return a(obj, (List)collection, ((ak) (null)));
        } else
        {
            return new ak(this, obj, collection, null);
        }
    }

    private Collection a(Collection collection)
    {
        if (collection instanceof SortedSet)
        {
            return Collections.unmodifiableSortedSet((SortedSet)collection);
        }
        if (collection instanceof Set)
        {
            return Collections.unmodifiableSet((Set)collection);
        }
        if (collection instanceof List)
        {
            return Collections.unmodifiableList((List)collection);
        } else
        {
            return Collections.unmodifiableCollection(collection);
        }
    }

    static Iterator a(x x1, Collection collection)
    {
        return x1.b(collection);
    }

    static List a(x x1, Object obj, List list, ak ak1)
    {
        return x1.a(obj, list, ak1);
    }

    private List a(Object obj, List list, ak ak1)
    {
        if (list instanceof RandomAccess)
        {
            return new ah(this, obj, list, ak1);
        } else
        {
            return new am(this, obj, list, ak1);
        }
    }

    static Map a(x x1)
    {
        return x1.a;
    }

    private Set a()
    {
        if (a instanceof SortedMap)
        {
            return new aj(this, (SortedMap)a);
        } else
        {
            return new af(this, a);
        }
    }

    static int b(x x1)
    {
        int i1 = x1.b;
        x1.b = i1 - 1;
        return i1;
    }

    static int b(x x1, int i1)
    {
        i1 = x1.b - i1;
        x1.b = i1;
        return i1;
    }

    private int b(Object obj)
    {
        int i1 = 0;
        try
        {
            obj = (Collection)a.remove(obj);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return 0;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return 0;
        }
        if (obj != null)
        {
            i1 = ((Collection) (obj)).size();
            ((Collection) (obj)).clear();
            b = b - i1;
        }
        return i1;
    }

    private Iterator b(Collection collection)
    {
        if (collection instanceof List)
        {
            return ((List)collection).listIterator();
        } else
        {
            return collection.iterator();
        }
    }

    static int c(x x1)
    {
        int i1 = x1.b;
        x1.b = i1 + 1;
        return i1;
    }

    private Map l()
    {
        if (a instanceof SortedMap)
        {
            return new ai(this, (SortedMap)a);
        } else
        {
            return new ab(this, a);
        }
    }

    public boolean a(Object obj, Object obj1)
    {
        if (a(obj).add(obj1))
        {
            b = b + 1;
            return true;
        } else
        {
            return false;
        }
    }

    public Collection b(Object obj, Iterable iterable)
    {
        iterable = iterable.iterator();
        if (!iterable.hasNext())
        {
            return d(obj);
        }
        obj = a(obj);
        Collection collection = c();
        collection.addAll(((Collection) (obj)));
        b = b - ((Collection) (obj)).size();
        ((Collection) (obj)).clear();
        do
        {
            if (!iterable.hasNext())
            {
                break;
            }
            if (((Collection) (obj)).add(iterable.next()))
            {
                b = b + 1;
            }
        } while (true);
        return a(collection);
    }

    public Map b()
    {
        Map map1 = f;
        Map map = map1;
        if (map1 == null)
        {
            map = l();
            f = map;
        }
        return map;
    }

    public boolean b(Object obj, Object obj1)
    {
        obj = (Collection)a.get(obj);
        return obj != null && ((Collection) (obj)).contains(obj1);
    }

    abstract Collection c();

    public Collection c(Object obj)
    {
        Collection collection1 = (Collection)a.get(obj);
        Collection collection = collection1;
        if (collection1 == null)
        {
            collection = e(obj);
        }
        return a(obj, collection);
    }

    public boolean c(Object obj, Iterable iterable)
    {
        int i1;
        boolean flag;
        flag = false;
        if (!iterable.iterator().hasNext())
        {
            return false;
        }
        obj = a(obj);
        i1 = ((Collection) (obj)).size();
        if (!(iterable instanceof Collection)) goto _L2; else goto _L1
_L1:
        boolean flag1 = ((Collection) (obj)).addAll(ax.a(iterable));
_L4:
        int j1 = b;
        b = (((Collection) (obj)).size() - i1) + j1;
        return flag1;
_L2:
        iterable = iterable.iterator();
        do
        {
            flag1 = flag;
            if (!iterable.hasNext())
            {
                continue;
            }
            flag |= ((Collection) (obj)).add(iterable.next());
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public boolean c(Object obj, Object obj1)
    {
        Collection collection = (Collection)a.get(obj);
        if (collection == null)
        {
            return false;
        }
        boolean flag = collection.remove(obj1);
        if (flag)
        {
            b = b - 1;
            if (collection.isEmpty())
            {
                a.remove(obj);
            }
        }
        return flag;
    }

    public int d()
    {
        return b;
    }

    public Collection d(Object obj)
    {
        obj = (Collection)a.remove(obj);
        Collection collection = c();
        if (obj != null)
        {
            collection.addAll(((Collection) (obj)));
            b = b - ((Collection) (obj)).size();
            ((Collection) (obj)).clear();
        }
        return a(collection);
    }

    Collection e(Object obj)
    {
        return c();
    }

    public boolean e()
    {
        return b == 0;
    }

    public boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (obj instanceof iw)
        {
            obj = (iw)obj;
            return a.equals(((iw) (obj)).b());
        } else
        {
            return false;
        }
    }

    public void f()
    {
        for (Iterator iterator = a.values().iterator(); iterator.hasNext(); ((Collection)iterator.next()).clear()) { }
        a.clear();
        b = 0;
    }

    public boolean f(Object obj)
    {
        return a.containsKey(obj);
    }

    public Set g()
    {
        Set set1 = c;
        Set set = set1;
        if (set1 == null)
        {
            set = a();
            c = set;
        }
        return set;
    }

    public jf h()
    {
        jf jf = d;
        Object obj = jf;
        if (jf == null)
        {
            obj = new y(this);
            d = ((jf) (obj));
        }
        return ((jf) (obj));
    }

    public int hashCode()
    {
        return a.hashCode();
    }

    public Collection i()
    {
        Collection collection1 = e;
        Collection collection = collection1;
        if (collection1 == null)
        {
            collection = j();
            e = collection;
        }
        return collection;
    }

    Collection j()
    {
        if (this instanceof kk)
        {
            return new z(this);
        } else
        {
            return new aa(this);
        }
    }

    Iterator k()
    {
        return new ae(this);
    }

    public String toString()
    {
        return a.toString();
    }
}
