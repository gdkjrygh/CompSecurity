// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aa;

import com.google.android.m4b.maps.y.f;
import com.google.android.m4b.maps.y.h;
import com.google.android.m4b.maps.y.j;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;

// Referenced classes of package com.google.android.m4b.maps.aa:
//            bc, e, ab, bb, 
//            av, x, bo

public final class ax
{
    static abstract class a extends Enum
        implements f
    {

        public static final a a;
        public static final a b;
        private static final a c[];

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/google/android/m4b/maps/aa/ax$a, s);
        }

        public static a[] values()
        {
            return (a[])c.clone();
        }

        static 
        {
            a = new a("KEY") {

                public final Object a(Object obj)
                {
                    return ((java.util.Map.Entry)obj).getKey();
                }

            };
            b = new a("VALUE") {

                public final Object a(Object obj)
                {
                    return ((java.util.Map.Entry)obj).getValue();
                }

            };
            c = (new a[] {
                a, b
            });
        }

        private a(String s, int i)
        {
            super(s, i);
        }

        a(String s, int i, byte byte0)
        {
            this(s, i);
        }
    }

    static abstract class b extends bo.a
    {

        abstract Map a();

        public void clear()
        {
            a().clear();
        }

        public boolean contains(Object obj)
        {
            boolean flag;
label0:
            {
                boolean flag1 = false;
                flag = flag1;
                if (!(obj instanceof java.util.Map.Entry))
                {
                    break label0;
                }
                obj = (java.util.Map.Entry)obj;
                Object obj1 = ((java.util.Map.Entry) (obj)).getKey();
                Object obj2 = ax.a(a(), obj1);
                flag = flag1;
                if (!h.a(obj2, ((java.util.Map.Entry) (obj)).getValue()))
                {
                    break label0;
                }
                if (obj2 == null)
                {
                    flag = flag1;
                    if (!a().containsKey(obj1))
                    {
                        break label0;
                    }
                }
                flag = true;
            }
            return flag;
        }

        public boolean isEmpty()
        {
            return a().isEmpty();
        }

        public boolean remove(Object obj)
        {
            if (contains(obj))
            {
                obj = (java.util.Map.Entry)obj;
                return a().keySet().remove(((java.util.Map.Entry) (obj)).getKey());
            } else
            {
                return false;
            }
        }

        public boolean removeAll(Collection collection)
        {
            boolean flag;
            try
            {
                flag = super.removeAll((Collection)j.a(collection));
            }
            catch (UnsupportedOperationException unsupportedoperationexception)
            {
                return bo.a(this, collection.iterator());
            }
            return flag;
        }

        public boolean retainAll(Collection collection)
        {
            boolean flag;
            try
            {
                flag = super.retainAll((Collection)j.a(collection));
            }
            catch (UnsupportedOperationException unsupportedoperationexception)
            {
                HashSet hashset = bo.a(collection.size());
                collection = collection.iterator();
                do
                {
                    if (!collection.hasNext())
                    {
                        break;
                    }
                    Object obj = collection.next();
                    if (contains(obj))
                    {
                        hashset.add(((java.util.Map.Entry)obj).getKey());
                    }
                } while (true);
                return a().keySet().retainAll(hashset);
            }
            return flag;
        }

        public int size()
        {
            return a().size();
        }

        b()
        {
        }
    }

    static abstract class c extends AbstractMap
    {

        private transient Set a;
        private transient Set b;
        private transient Collection c;

        abstract Set a();

        Set b()
        {
            return new d(this);
        }

        public Set entrySet()
        {
            Set set1 = a;
            Set set = set1;
            if (set1 == null)
            {
                set = a();
                a = set;
            }
            return set;
        }

        public Set keySet()
        {
            Set set1 = b;
            Set set = set1;
            if (set1 == null)
            {
                set = b();
                b = set;
            }
            return set;
        }

        public Collection values()
        {
            Collection collection = c;
            Object obj = collection;
            if (collection == null)
            {
                obj = new e(this);
                c = ((Collection) (obj));
            }
            return ((Collection) (obj));
        }

        c()
        {
        }
    }

    static class d extends bo.a
    {

        final Map a;

        public void clear()
        {
            a.clear();
        }

        public boolean contains(Object obj)
        {
            return a.containsKey(obj);
        }

        public boolean isEmpty()
        {
            return a.isEmpty();
        }

        public Iterator iterator()
        {
            return ax.a(a.entrySet().iterator());
        }

        public boolean remove(Object obj)
        {
            if (contains(obj))
            {
                a.remove(obj);
                return true;
            } else
            {
                return false;
            }
        }

        public int size()
        {
            return a.size();
        }

        d(Map map)
        {
            a = (Map)j.a(map);
        }
    }

    static final class e extends AbstractCollection
    {

        private Map a;

        public final void clear()
        {
            a.clear();
        }

        public final boolean contains(Object obj)
        {
            return a.containsValue(obj);
        }

        public final boolean isEmpty()
        {
            return a.isEmpty();
        }

        public final Iterator iterator()
        {
            return ax.b(a.entrySet().iterator());
        }

        public final boolean remove(Object obj)
        {
            boolean flag;
            try
            {
                flag = super.remove(obj);
            }
            catch (UnsupportedOperationException unsupportedoperationexception)
            {
                for (Iterator iterator1 = a.entrySet().iterator(); iterator1.hasNext();)
                {
                    java.util.Map.Entry entry = (java.util.Map.Entry)iterator1.next();
                    if (h.a(obj, entry.getValue()))
                    {
                        a.remove(entry.getKey());
                        return true;
                    }
                }

                return false;
            }
            return flag;
        }

        public final boolean removeAll(Collection collection)
        {
            boolean flag;
            try
            {
                flag = super.removeAll((Collection)j.a(collection));
            }
            catch (UnsupportedOperationException unsupportedoperationexception)
            {
                HashSet hashset = new HashSet();
                Iterator iterator1 = a.entrySet().iterator();
                do
                {
                    if (!iterator1.hasNext())
                    {
                        break;
                    }
                    java.util.Map.Entry entry = (java.util.Map.Entry)iterator1.next();
                    if (collection.contains(entry.getValue()))
                    {
                        hashset.add(entry.getKey());
                    }
                } while (true);
                return a.keySet().removeAll(hashset);
            }
            return flag;
        }

        public final boolean retainAll(Collection collection)
        {
            boolean flag;
            try
            {
                flag = super.retainAll((Collection)j.a(collection));
            }
            catch (UnsupportedOperationException unsupportedoperationexception)
            {
                HashSet hashset = new HashSet();
                Iterator iterator1 = a.entrySet().iterator();
                do
                {
                    if (!iterator1.hasNext())
                    {
                        break;
                    }
                    java.util.Map.Entry entry = (java.util.Map.Entry)iterator1.next();
                    if (collection.contains(entry.getValue()))
                    {
                        hashset.add(entry.getKey());
                    }
                } while (true);
                return a.keySet().retainAll(hashset);
            }
            return flag;
        }

        public final int size()
        {
            return a.size();
        }

        e(Map map)
        {
            a = (Map)j.a(map);
        }
    }


    private static com.google.android.m4b.maps.y.g.a a;

    static x a(x x)
    {
        return new x(x) {

            private x a;

            public final boolean hasNext()
            {
                return a.hasNext();
            }

            public final Object next()
            {
                return ((java.util.Map.Entry)a.next()).getValue();
            }

            
            {
                a = x1;
                super();
            }
        };
    }

    static f a()
    {
        return a.a;
    }

    static Object a(Map map, Object obj)
    {
        j.a(map);
        try
        {
            map = ((Map) (map.get(obj)));
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            return null;
        }
        return map;
    }

    public static HashMap a(int i)
    {
        return new HashMap(b(i));
    }

    public static HashMap a(Map map)
    {
        return new HashMap(map);
    }

    static Iterator a(Iterator iterator)
    {
        return com.google.android.m4b.maps.aa.e.a(iterator, a.a);
    }

    public static java.util.Map.Entry a(Object obj, Object obj1)
    {
        return new ab(obj, obj1);
    }

    static int b(int i)
    {
        if (i < 3)
        {
            bb.a(i, "expectedSize");
            return i + 1;
        }
        if (i < 0x40000000)
        {
            return i / 3 + i;
        } else
        {
            return 0x7fffffff;
        }
    }

    static String b(Map map)
    {
        StringBuilder stringbuilder = bc.a(map.size()).append('{');
        a.a(stringbuilder, map.entrySet().iterator());
        return stringbuilder.append('}').toString();
    }

    public static HashMap b()
    {
        return new HashMap();
    }

    static Iterator b(Iterator iterator)
    {
        return com.google.android.m4b.maps.aa.e.a(iterator, a.b);
    }

    static boolean b(Map map, Object obj)
    {
        j.a(map);
        boolean flag;
        try
        {
            flag = map.containsKey(obj);
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            return false;
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            return false;
        }
        return flag;
    }

    static Object c(Map map, Object obj)
    {
        j.a(map);
        try
        {
            map = ((Map) (map.remove(obj)));
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            return null;
        }
        return map;
    }

    public static LinkedHashMap c()
    {
        return new LinkedHashMap();
    }

    public static ConcurrentMap d()
    {
        return (new av()).d();
    }

    static boolean d(Map map, Object obj)
    {
        if (map == obj)
        {
            return true;
        }
        if (obj instanceof Map)
        {
            obj = (Map)obj;
            return map.entrySet().equals(((Map) (obj)).entrySet());
        } else
        {
            return false;
        }
    }

    public static IdentityHashMap e()
    {
        return new IdentityHashMap();
    }

    static 
    {
        a = new com.google.android.m4b.maps.y.g.a(bc.a, "=", (byte)0);
    }
}
