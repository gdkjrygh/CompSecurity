// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.lang3;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import org.apache.commons.lang3.exception.CloneFailedException;
import org.apache.commons.lang3.mutable.MutableInt;

// Referenced classes of package org.apache.commons.lang3:
//            Validate, ArrayUtils

public class ObjectUtils
{
    public static class Null
        implements Serializable
    {

        private static final long serialVersionUID = 0x626e04ed40667ec5L;

        private Object readResolve()
        {
            return ObjectUtils.NULL;
        }

        Null()
        {
        }
    }


    public static final Null NULL = new Null();

    public ObjectUtils()
    {
    }

    public static Object clone(Object obj)
    {
        if (!(obj instanceof Cloneable)) goto _L2; else goto _L1
_L1:
        if (!obj.getClass().isArray()) goto _L4; else goto _L3
_L3:
        Object obj1 = obj.getClass().getComponentType();
        if (((Class) (obj1)).isPrimitive()) goto _L6; else goto _L5
_L5:
        obj1 = ((Object []) ((Object[])(Object[])obj)).clone();
_L7:
        return obj1;
_L6:
        int i = Array.getLength(obj);
        Object obj2 = Array.newInstance(((Class) (obj1)), i);
        do
        {
            int j = i - 1;
            obj1 = obj2;
            if (i <= 0)
            {
                continue; /* Loop/switch isn't completed */
            }
            Array.set(obj2, j, Array.get(obj, j));
            i = j;
        } while (true);
_L4:
        try
        {
            obj1 = obj.getClass().getMethod("clone", new Class[0]).invoke(obj, new Object[0]);
        }
        catch (NoSuchMethodException nosuchmethodexception)
        {
            throw new CloneFailedException((new StringBuilder()).append("Cloneable type ").append(obj.getClass().getName()).append(" has no clone method").toString(), nosuchmethodexception);
        }
        catch (IllegalAccessException illegalaccessexception)
        {
            throw new CloneFailedException((new StringBuilder()).append("Cannot clone Cloneable type ").append(obj.getClass().getName()).toString(), illegalaccessexception);
        }
        catch (InvocationTargetException invocationtargetexception)
        {
            throw new CloneFailedException((new StringBuilder()).append("Exception cloning Cloneable type ").append(obj.getClass().getName()).toString(), invocationtargetexception.getCause());
        }
        if (true) goto _L7; else goto _L2
_L2:
        return null;
    }

    public static Object cloneIfPossible(Object obj)
    {
        Object obj1 = clone(obj);
        if (obj1 == null)
        {
            return obj;
        } else
        {
            return obj1;
        }
    }

    public static int compare(Comparable comparable, Comparable comparable1)
    {
        return compare(comparable, comparable1, false);
    }

    public static int compare(Comparable comparable, Comparable comparable1, boolean flag)
    {
        int i = 1;
        byte byte1 = -1;
        if (comparable == comparable1)
        {
            i = 0;
        } else
        if (comparable == null)
        {
            if (!flag)
            {
                return -1;
            }
        } else
        if (comparable1 == null)
        {
            byte byte0;
            if (flag)
            {
                byte0 = byte1;
            } else
            {
                byte0 = 1;
            }
            return byte0;
        } else
        {
            return comparable.compareTo(comparable1);
        }
        return i;
    }

    public static Object defaultIfNull(Object obj, Object obj1)
    {
        if (obj != null)
        {
            return obj;
        } else
        {
            return obj1;
        }
    }

    public static boolean equals(Object obj, Object obj1)
    {
        if (obj == obj1)
        {
            return true;
        }
        if (obj == null || obj1 == null)
        {
            return false;
        } else
        {
            return obj.equals(obj1);
        }
    }

    public static transient Object firstNonNull(Object aobj[])
    {
        if (aobj != null)
        {
            int j = aobj.length;
            for (int i = 0; i < j; i++)
            {
                Object obj = aobj[i];
                if (obj != null)
                {
                    return obj;
                }
            }

        }
        return null;
    }

    public static int hashCode(Object obj)
    {
        if (obj == null)
        {
            return 0;
        } else
        {
            return obj.hashCode();
        }
    }

    public static transient int hashCodeMulti(Object aobj[])
    {
        int k = 1;
        int i = 1;
        if (aobj != null)
        {
            int l = aobj.length;
            int j = 0;
            do
            {
                k = i;
                if (j >= l)
                {
                    break;
                }
                i = i * 31 + hashCode(aobj[j]);
                j++;
            } while (true);
        }
        return k;
    }

    public static String identityToString(Object obj)
    {
        if (obj == null)
        {
            return null;
        } else
        {
            StringBuffer stringbuffer = new StringBuffer();
            identityToString(stringbuffer, obj);
            return stringbuffer.toString();
        }
    }

    public static void identityToString(StringBuffer stringbuffer, Object obj)
    {
        if (obj == null)
        {
            throw new NullPointerException("Cannot get the toString of a null identity");
        } else
        {
            stringbuffer.append(obj.getClass().getName()).append('@').append(Integer.toHexString(System.identityHashCode(obj)));
            return;
        }
    }

    public static transient Comparable max(Comparable acomparable[])
    {
        Comparable comparable1 = null;
        Comparable comparable = null;
        if (acomparable != null)
        {
            int j = acomparable.length;
            int i = 0;
            do
            {
                comparable1 = comparable;
                if (i >= j)
                {
                    break;
                }
                Comparable comparable2 = acomparable[i];
                comparable1 = comparable;
                if (compare(comparable2, comparable, false) > 0)
                {
                    comparable1 = comparable2;
                }
                i++;
                comparable = comparable1;
            } while (true);
        }
        return comparable1;
    }

    public static transient Comparable median(Comparable acomparable[])
    {
        Validate.notEmpty(acomparable);
        Validate.noNullElements(acomparable);
        TreeSet treeset = new TreeSet();
        Collections.addAll(treeset, acomparable);
        return (Comparable)treeset.toArray()[(treeset.size() - 1) / 2];
    }

    public static transient Object median(Comparator comparator, Object aobj[])
    {
        Validate.notEmpty(aobj, "null/empty items", new Object[0]);
        Validate.noNullElements(aobj);
        Validate.notNull(comparator, "null comparator", new Object[0]);
        comparator = new TreeSet(comparator);
        Collections.addAll(comparator, aobj);
        return comparator.toArray()[(comparator.size() - 1) / 2];
    }

    public static transient Comparable min(Comparable acomparable[])
    {
        Comparable comparable1 = null;
        Comparable comparable = null;
        if (acomparable != null)
        {
            int j = acomparable.length;
            int i = 0;
            do
            {
                comparable1 = comparable;
                if (i >= j)
                {
                    break;
                }
                Comparable comparable2 = acomparable[i];
                comparable1 = comparable;
                if (compare(comparable2, comparable, true) < 0)
                {
                    comparable1 = comparable2;
                }
                i++;
                comparable = comparable1;
            } while (true);
        }
        return comparable1;
    }

    public static transient Object mode(Object aobj[])
    {
        Object obj;
        if (ArrayUtils.isNotEmpty(aobj))
        {
            obj = new HashMap(aobj.length);
            int j = aobj.length;
            int i = 0;
            while (i < j) 
            {
                Object obj1 = aobj[i];
                MutableInt mutableint = (MutableInt)((HashMap) (obj)).get(obj1);
                if (mutableint == null)
                {
                    ((HashMap) (obj)).put(obj1, new MutableInt(1));
                } else
                {
                    mutableint.increment();
                }
                i++;
            }
            aobj = null;
            i = 0;
            Iterator iterator = ((HashMap) (obj)).entrySet().iterator();
            do
            {
                obj = ((Object) (aobj));
                if (!iterator.hasNext())
                {
                    break;
                }
                obj = (java.util.Map.Entry)iterator.next();
                int k = ((MutableInt)((java.util.Map.Entry) (obj)).getValue()).intValue();
                if (k == i)
                {
                    aobj = null;
                } else
                if (k > i)
                {
                    i = k;
                    aobj = ((Object []) (((java.util.Map.Entry) (obj)).getKey()));
                }
            } while (true);
        } else
        {
            obj = null;
        }
        return obj;
    }

    public static boolean notEqual(Object obj, Object obj1)
    {
        return !equals(obj, obj1);
    }

    public static String toString(Object obj)
    {
        if (obj == null)
        {
            return "";
        } else
        {
            return obj.toString();
        }
    }

    public static String toString(Object obj, String s)
    {
        if (obj == null)
        {
            return s;
        } else
        {
            return obj.toString();
        }
    }

}
