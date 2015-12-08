// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.lang3.builder;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.tuple.Pair;

// Referenced classes of package org.apache.commons.lang3.builder:
//            Builder, IDKey, ReflectionToStringBuilder

public class EqualsBuilder
    implements Builder
{

    private static final ThreadLocal REGISTRY = new ThreadLocal();
    private boolean isEquals;

    public EqualsBuilder()
    {
        isEquals = true;
    }

    static Pair getRegisterPair(Object obj, Object obj1)
    {
        return Pair.of(new IDKey(obj), new IDKey(obj1));
    }

    static Set getRegistry()
    {
        return (Set)REGISTRY.get();
    }

    static boolean isRegistered(Object obj, Object obj1)
    {
        Set set = getRegistry();
        obj = getRegisterPair(obj, obj1);
        obj1 = Pair.of(((Pair) (obj)).getLeft(), ((Pair) (obj)).getRight());
        return set != null && (set.contains(obj) || set.contains(obj1));
    }

    private static void reflectionAppend(Object obj, Object obj1, Class class1, EqualsBuilder equalsbuilder, boolean flag, String as[])
    {
        if (isRegistered(obj, obj1))
        {
            return;
        }
        register(obj, obj1);
        class1 = class1.getDeclaredFields();
        AccessibleObject.setAccessible(class1, true);
        int i = 0;
_L1:
        if (i >= class1.length || !equalsbuilder.isEquals)
        {
            break MISSING_BLOCK_LABEL_150;
        }
        Field field = class1[i];
        if (ArrayUtils.contains(as, field.getName()) || field.getName().indexOf('$') != -1)
        {
            break MISSING_BLOCK_LABEL_122;
        }
        if (flag)
        {
            break MISSING_BLOCK_LABEL_90;
        }
        if (Modifier.isTransient(field.getModifiers()))
        {
            break MISSING_BLOCK_LABEL_122;
        }
        boolean flag1 = Modifier.isStatic(field.getModifiers());
        if (flag1)
        {
            break MISSING_BLOCK_LABEL_122;
        }
        equalsbuilder.append(field.get(obj), field.get(obj1));
        i++;
          goto _L1
        class1;
        throw new InternalError("Unexpected IllegalAccessException");
        class1;
        unregister(obj, obj1);
        throw class1;
        unregister(obj, obj1);
        return;
    }

    public static boolean reflectionEquals(Object obj, Object obj1, Collection collection)
    {
        return reflectionEquals(obj, obj1, ReflectionToStringBuilder.toNoNullStringArray(collection));
    }

    public static boolean reflectionEquals(Object obj, Object obj1, boolean flag)
    {
        return reflectionEquals(obj, obj1, flag, null, new String[0]);
    }

    public static transient boolean reflectionEquals(Object obj, Object obj1, boolean flag, Class class1, String as[])
    {
        Object obj3;
        Class class2;
        if (obj == obj1)
        {
            return true;
        }
        if (obj == null || obj1 == null)
        {
            return false;
        }
        obj3 = obj.getClass();
        class2 = obj1.getClass();
        if (!((Class) (obj3)).isInstance(obj1)) goto _L2; else goto _L1
_L1:
        Object obj2;
        obj2 = obj3;
        if (!class2.isInstance(obj))
        {
            obj2 = class2;
        }
_L4:
        obj3 = new EqualsBuilder();
        reflectionAppend(obj, obj1, ((Class) (obj2)), ((EqualsBuilder) (obj3)), flag, as);
        while (((Class) (obj2)).getSuperclass() != null && obj2 != class1) 
        {
            try
            {
                obj2 = ((Class) (obj2)).getSuperclass();
                reflectionAppend(obj, obj1, ((Class) (obj2)), ((EqualsBuilder) (obj3)), flag, as);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                return false;
            }
        }
        break MISSING_BLOCK_LABEL_146;
_L2:
        if (!class2.isInstance(obj))
        {
            break; /* Loop/switch isn't completed */
        }
        obj2 = class2;
        if (!((Class) (obj3)).isInstance(obj1))
        {
            obj2 = obj3;
        }
        if (true) goto _L4; else goto _L3
_L3:
        return false;
        return ((EqualsBuilder) (obj3)).isEquals();
    }

    public static transient boolean reflectionEquals(Object obj, Object obj1, String as[])
    {
        return reflectionEquals(obj, obj1, false, null, as);
    }

    static void register(Object obj, Object obj1)
    {
        org/apache/commons/lang3/builder/EqualsBuilder;
        JVM INSTR monitorenter ;
        if (getRegistry() == null)
        {
            REGISTRY.set(new HashSet());
        }
        org/apache/commons/lang3/builder/EqualsBuilder;
        JVM INSTR monitorexit ;
        getRegistry().add(getRegisterPair(obj, obj1));
        return;
        obj;
        org/apache/commons/lang3/builder/EqualsBuilder;
        JVM INSTR monitorexit ;
        throw obj;
    }

    static void unregister(Object obj, Object obj1)
    {
        Set set = getRegistry();
        if (set == null)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        set.remove(getRegisterPair(obj, obj1));
        org/apache/commons/lang3/builder/EqualsBuilder;
        JVM INSTR monitorenter ;
        obj = getRegistry();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        if (((Set) (obj)).isEmpty())
        {
            REGISTRY.remove();
        }
        org/apache/commons/lang3/builder/EqualsBuilder;
        JVM INSTR monitorexit ;
        return;
        obj;
        org/apache/commons/lang3/builder/EqualsBuilder;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public EqualsBuilder append(byte byte0, byte byte1)
    {
        if (!isEquals)
        {
            return this;
        }
        boolean flag;
        if (byte0 == byte1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        isEquals = flag;
        return this;
    }

    public EqualsBuilder append(char c, char c1)
    {
        if (!isEquals)
        {
            return this;
        }
        boolean flag;
        if (c == c1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        isEquals = flag;
        return this;
    }

    public EqualsBuilder append(double d, double d1)
    {
        if (!isEquals)
        {
            return this;
        } else
        {
            return append(Double.doubleToLongBits(d), Double.doubleToLongBits(d1));
        }
    }

    public EqualsBuilder append(float f, float f1)
    {
        if (!isEquals)
        {
            return this;
        } else
        {
            return append(Float.floatToIntBits(f), Float.floatToIntBits(f1));
        }
    }

    public EqualsBuilder append(int i, int j)
    {
        if (!isEquals)
        {
            return this;
        }
        boolean flag;
        if (i == j)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        isEquals = flag;
        return this;
    }

    public EqualsBuilder append(long l, long l1)
    {
        if (!isEquals)
        {
            return this;
        }
        boolean flag;
        if (l == l1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        isEquals = flag;
        return this;
    }

    public EqualsBuilder append(Object obj, Object obj1)
    {
        while (!isEquals || obj == obj1) 
        {
            return this;
        }
        if (obj == null || obj1 == null)
        {
            setEquals(false);
            return this;
        }
        if (!obj.getClass().isArray())
        {
            isEquals = obj.equals(obj1);
            return this;
        }
        if (obj.getClass() != obj1.getClass())
        {
            setEquals(false);
            return this;
        }
        if (obj instanceof long[])
        {
            append((long[])(long[])obj, (long[])(long[])obj1);
            return this;
        }
        if (obj instanceof int[])
        {
            append((int[])(int[])obj, (int[])(int[])obj1);
            return this;
        }
        if (obj instanceof short[])
        {
            append((short[])(short[])obj, (short[])(short[])obj1);
            return this;
        }
        if (obj instanceof char[])
        {
            append((char[])(char[])obj, (char[])(char[])obj1);
            return this;
        }
        if (obj instanceof byte[])
        {
            append((byte[])(byte[])obj, (byte[])(byte[])obj1);
            return this;
        }
        if (obj instanceof double[])
        {
            append((double[])(double[])obj, (double[])(double[])obj1);
            return this;
        }
        if (obj instanceof float[])
        {
            append((float[])(float[])obj, (float[])(float[])obj1);
            return this;
        }
        if (obj instanceof boolean[])
        {
            append((boolean[])(boolean[])obj, (boolean[])(boolean[])obj1);
            return this;
        } else
        {
            append((Object[])(Object[])obj, (Object[])(Object[])obj1);
            return this;
        }
    }

    public EqualsBuilder append(short word0, short word1)
    {
        if (!isEquals)
        {
            return this;
        }
        boolean flag;
        if (word0 == word1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        isEquals = flag;
        return this;
    }

    public EqualsBuilder append(boolean flag, boolean flag1)
    {
        if (!isEquals)
        {
            return this;
        }
        if (flag == flag1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        isEquals = flag;
        return this;
    }

    public EqualsBuilder append(byte abyte0[], byte abyte1[])
    {
        if (isEquals && abyte0 != abyte1)
        {
            if (abyte0 == null || abyte1 == null)
            {
                setEquals(false);
                return this;
            }
            if (abyte0.length != abyte1.length)
            {
                setEquals(false);
                return this;
            }
            int i = 0;
            while (i < abyte0.length && isEquals) 
            {
                append(abyte0[i], abyte1[i]);
                i++;
            }
        }
        return this;
    }

    public EqualsBuilder append(char ac[], char ac1[])
    {
        if (isEquals && ac != ac1)
        {
            if (ac == null || ac1 == null)
            {
                setEquals(false);
                return this;
            }
            if (ac.length != ac1.length)
            {
                setEquals(false);
                return this;
            }
            int i = 0;
            while (i < ac.length && isEquals) 
            {
                append(ac[i], ac1[i]);
                i++;
            }
        }
        return this;
    }

    public EqualsBuilder append(double ad[], double ad1[])
    {
        if (isEquals && ad != ad1)
        {
            if (ad == null || ad1 == null)
            {
                setEquals(false);
                return this;
            }
            if (ad.length != ad1.length)
            {
                setEquals(false);
                return this;
            }
            int i = 0;
            while (i < ad.length && isEquals) 
            {
                append(ad[i], ad1[i]);
                i++;
            }
        }
        return this;
    }

    public EqualsBuilder append(float af[], float af1[])
    {
        if (isEquals && af != af1)
        {
            if (af == null || af1 == null)
            {
                setEquals(false);
                return this;
            }
            if (af.length != af1.length)
            {
                setEquals(false);
                return this;
            }
            int i = 0;
            while (i < af.length && isEquals) 
            {
                append(af[i], af1[i]);
                i++;
            }
        }
        return this;
    }

    public EqualsBuilder append(int ai[], int ai1[])
    {
        if (isEquals && ai != ai1)
        {
            if (ai == null || ai1 == null)
            {
                setEquals(false);
                return this;
            }
            if (ai.length != ai1.length)
            {
                setEquals(false);
                return this;
            }
            int i = 0;
            while (i < ai.length && isEquals) 
            {
                append(ai[i], ai1[i]);
                i++;
            }
        }
        return this;
    }

    public EqualsBuilder append(long al[], long al1[])
    {
        if (isEquals && al != al1)
        {
            if (al == null || al1 == null)
            {
                setEquals(false);
                return this;
            }
            if (al.length != al1.length)
            {
                setEquals(false);
                return this;
            }
            int i = 0;
            while (i < al.length && isEquals) 
            {
                append(al[i], al1[i]);
                i++;
            }
        }
        return this;
    }

    public EqualsBuilder append(Object aobj[], Object aobj1[])
    {
        if (isEquals && aobj != aobj1)
        {
            if (aobj == null || aobj1 == null)
            {
                setEquals(false);
                return this;
            }
            if (aobj.length != aobj1.length)
            {
                setEquals(false);
                return this;
            }
            int i = 0;
            while (i < aobj.length && isEquals) 
            {
                append(aobj[i], aobj1[i]);
                i++;
            }
        }
        return this;
    }

    public EqualsBuilder append(short aword0[], short aword1[])
    {
        if (isEquals && aword0 != aword1)
        {
            if (aword0 == null || aword1 == null)
            {
                setEquals(false);
                return this;
            }
            if (aword0.length != aword1.length)
            {
                setEquals(false);
                return this;
            }
            int i = 0;
            while (i < aword0.length && isEquals) 
            {
                append(aword0[i], aword1[i]);
                i++;
            }
        }
        return this;
    }

    public EqualsBuilder append(boolean aflag[], boolean aflag1[])
    {
        if (isEquals && aflag != aflag1)
        {
            if (aflag == null || aflag1 == null)
            {
                setEquals(false);
                return this;
            }
            if (aflag.length != aflag1.length)
            {
                setEquals(false);
                return this;
            }
            int i = 0;
            while (i < aflag.length && isEquals) 
            {
                append(aflag[i], aflag1[i]);
                i++;
            }
        }
        return this;
    }

    public EqualsBuilder appendSuper(boolean flag)
    {
        if (!isEquals)
        {
            return this;
        } else
        {
            isEquals = flag;
            return this;
        }
    }

    public Boolean build()
    {
        return Boolean.valueOf(isEquals());
    }

    public volatile Object build()
    {
        return build();
    }

    public boolean isEquals()
    {
        return isEquals;
    }

    public void reset()
    {
        isEquals = true;
    }

    protected void setEquals(boolean flag)
    {
        isEquals = flag;
    }

}
