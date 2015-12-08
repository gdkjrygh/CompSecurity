// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.c.d;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

// Referenced classes of package org.c.d:
//            k, e, f, a, 
//            j

public abstract class d
{

    public d()
    {
    }

    public static List arrayToList(Object obj)
    {
        return Arrays.asList(k.toObjectArray(obj));
    }

    public static boolean contains(Enumeration enumeration, Object obj)
    {
        if (enumeration != null)
        {
            while (enumeration.hasMoreElements()) 
            {
                if (k.nullSafeEquals(enumeration.nextElement(), obj))
                {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean contains(Iterator iterator, Object obj)
    {
        if (iterator != null)
        {
            while (iterator.hasNext()) 
            {
                if (k.nullSafeEquals(iterator.next(), obj))
                {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean containsAny(Collection collection, Collection collection1)
    {
        if (!isEmpty(collection) && !isEmpty(collection1))
        {
            collection1 = collection1.iterator();
            while (collection1.hasNext()) 
            {
                if (collection.contains(collection1.next()))
                {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean containsInstance(Collection collection, Object obj)
    {
label0:
        {
            if (collection == null)
            {
                break label0;
            }
            collection = collection.iterator();
            do
            {
                if (!collection.hasNext())
                {
                    break label0;
                }
            } while (collection.next() != obj);
            return true;
        }
        return false;
    }

    public static Class findCommonElementType(Collection collection)
    {
label0:
        {
            if (isEmpty(collection))
            {
                return null;
            }
            Iterator iterator = collection.iterator();
            collection = null;
            Object obj;
label1:
            do
            {
                while (iterator.hasNext()) 
                {
                    obj = iterator.next();
                    if (obj != null)
                    {
                        if (collection != null)
                        {
                            continue label1;
                        }
                        collection = obj.getClass();
                    }
                }
                break label0;
            } while (collection == obj.getClass());
            return null;
        }
        return collection;
    }

    public static Object findFirstMatch(Collection collection, Collection collection1)
    {
        if (isEmpty(collection) || isEmpty(collection1))
        {
            return null;
        }
        for (collection1 = collection1.iterator(); collection1.hasNext();)
        {
            Object obj = collection1.next();
            if (collection.contains(obj))
            {
                return obj;
            }
        }

        return null;
    }

    public static Object findValueOfType(Collection collection, Class class1)
    {
        if (!isEmpty(collection)) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        Iterator iterator = collection.iterator();
        collection = null;
label0:
        do
        {
label1:
            {
                Object obj;
                do
                {
                    if (!iterator.hasNext())
                    {
                        break label1;
                    }
                    obj = iterator.next();
                } while (class1 != null && !class1.isInstance(obj));
                if (collection != null)
                {
                    break label0;
                }
                collection = ((Collection) (obj));
            }
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
        return collection;
    }

    public static Object findValueOfType(Collection collection, Class aclass[])
    {
        if (!isEmpty(collection) && !k.isEmpty(aclass)) goto _L2; else goto _L1
_L1:
        Object obj = null;
_L4:
        return obj;
_L2:
        int l = aclass.length;
        int i = 0;
label0:
        do
        {
label1:
            {
                if (i >= l)
                {
                    break label1;
                }
                Object obj1 = findValueOfType(collection, aclass[i]);
                obj = obj1;
                if (obj1 != null)
                {
                    break label0;
                }
                i++;
            }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
        return null;
    }

    public static boolean hasUniqueObject(Collection collection)
    {
label0:
        {
            if (isEmpty(collection))
            {
                return false;
            }
            Object obj = null;
            Iterator iterator = collection.iterator();
            boolean flag = false;
            collection = ((Collection) (obj));
label1:
            do
            {
                while (iterator.hasNext()) 
                {
                    obj = iterator.next();
                    if (flag)
                    {
                        continue label1;
                    }
                    collection = ((Collection) (obj));
                    flag = true;
                }
                break label0;
            } while (collection == obj);
            return false;
        }
        return true;
    }

    public static boolean isEmpty(Collection collection)
    {
        return collection == null || collection.isEmpty();
    }

    public static boolean isEmpty(Map map)
    {
        return map == null || map.isEmpty();
    }

    public static void mergeArrayIntoCollection(Object obj, Collection collection)
    {
        if (collection == null)
        {
            throw new IllegalArgumentException("Collection must not be null");
        }
        obj = ((Object) (k.toObjectArray(obj)));
        int l = obj.length;
        for (int i = 0; i < l; i++)
        {
            collection.add(obj[i]);
        }

    }

    public static void mergePropertiesIntoMap(Properties properties, Map map)
    {
        if (map == null)
        {
            throw new IllegalArgumentException("Map must not be null");
        }
        if (properties != null)
        {
            Object obj;
            String s1;
            for (Enumeration enumeration = properties.propertyNames(); enumeration.hasMoreElements(); map.put(s1, obj))
            {
                s1 = (String)enumeration.nextElement();
                String s = properties.getProperty(s1);
                obj = s;
                if (s == null)
                {
                    obj = properties.get(s1);
                }
            }

        }
    }

    public static Object[] toArray(Enumeration enumeration, Object aobj[])
    {
        ArrayList arraylist = new ArrayList();
        for (; enumeration.hasMoreElements(); arraylist.add(enumeration.nextElement())) { }
        return arraylist.toArray(aobj);
    }

    public static Iterator toIterator(Enumeration enumeration)
    {
        return new e(enumeration);
    }

    public static j toMultiValueMap(Map map)
    {
        return new f(map);
    }

    public static j unmodifiableMultiValueMap(j j1)
    {
        a.notNull(j1, "'map' must not be null");
        LinkedHashMap linkedhashmap = new LinkedHashMap(j1.size());
        java.util.Map.Entry entry;
        List list;
        for (j1 = j1.entrySet().iterator(); j1.hasNext(); linkedhashmap.put(entry.getKey(), list))
        {
            entry = (java.util.Map.Entry)j1.next();
            list = Collections.unmodifiableList((List)entry.getValue());
        }

        return toMultiValueMap(Collections.unmodifiableMap(linkedhashmap));
    }
}
