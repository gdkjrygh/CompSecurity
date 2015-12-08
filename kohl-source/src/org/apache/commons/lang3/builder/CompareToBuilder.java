// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.lang3.builder;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Collection;
import java.util.Comparator;
import org.apache.commons.lang3.ArrayUtils;

// Referenced classes of package org.apache.commons.lang3.builder:
//            Builder, ReflectionToStringBuilder

public class CompareToBuilder
    implements Builder
{

    private int comparison;

    public CompareToBuilder()
    {
        comparison = 0;
    }

    private static void reflectionAppend(Object obj, Object obj1, Class class1, CompareToBuilder comparetobuilder, boolean flag, String as[])
    {
        class1 = class1.getDeclaredFields();
        AccessibleObject.setAccessible(class1, true);
        int i = 0;
        while (i < class1.length && comparetobuilder.comparison == 0) 
        {
            Field field = class1[i];
            if (!ArrayUtils.contains(as, field.getName()) && field.getName().indexOf('$') == -1 && (flag || !Modifier.isTransient(field.getModifiers())) && !Modifier.isStatic(field.getModifiers()))
            {
                try
                {
                    comparetobuilder.append(field.get(obj), field.get(obj1));
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    throw new InternalError("Unexpected IllegalAccessException");
                }
            }
            i++;
        }
    }

    public static int reflectionCompare(Object obj, Object obj1)
    {
        return reflectionCompare(obj, obj1, false, null, new String[0]);
    }

    public static int reflectionCompare(Object obj, Object obj1, Collection collection)
    {
        return reflectionCompare(obj, obj1, ReflectionToStringBuilder.toNoNullStringArray(collection));
    }

    public static int reflectionCompare(Object obj, Object obj1, boolean flag)
    {
        return reflectionCompare(obj, obj1, flag, null, new String[0]);
    }

    public static transient int reflectionCompare(Object obj, Object obj1, boolean flag, Class class1, String as[])
    {
        if (obj == obj1)
        {
            return 0;
        }
        if (obj == null || obj1 == null)
        {
            throw new NullPointerException();
        }
        Class class2 = obj.getClass();
        if (!class2.isInstance(obj1))
        {
            throw new ClassCastException();
        }
        CompareToBuilder comparetobuilder = new CompareToBuilder();
        reflectionAppend(obj, obj1, class2, comparetobuilder, flag, as);
        for (; class2.getSuperclass() != null && class2 != class1; reflectionAppend(obj, obj1, class2, comparetobuilder, flag, as))
        {
            class2 = class2.getSuperclass();
        }

        return comparetobuilder.toComparison();
    }

    public static transient int reflectionCompare(Object obj, Object obj1, String as[])
    {
        return reflectionCompare(obj, obj1, false, null, as);
    }

    public CompareToBuilder append(byte byte0, byte byte1)
    {
        if (comparison != 0)
        {
            return this;
        }
        if (byte0 < byte1)
        {
            byte0 = -1;
        } else
        if (byte0 > byte1)
        {
            byte0 = 1;
        } else
        {
            byte0 = 0;
        }
        comparison = byte0;
        return this;
    }

    public CompareToBuilder append(char c, char c1)
    {
        if (comparison != 0)
        {
            return this;
        }
        if (c < c1)
        {
            c = '\uFFFF';
        } else
        if (c > c1)
        {
            c = '\001';
        } else
        {
            c = '\0';
        }
        comparison = c;
        return this;
    }

    public CompareToBuilder append(double d, double d1)
    {
        if (comparison != 0)
        {
            return this;
        } else
        {
            comparison = Double.compare(d, d1);
            return this;
        }
    }

    public CompareToBuilder append(float f, float f1)
    {
        if (comparison != 0)
        {
            return this;
        } else
        {
            comparison = Float.compare(f, f1);
            return this;
        }
    }

    public CompareToBuilder append(int i, int j)
    {
        if (comparison != 0)
        {
            return this;
        }
        if (i < j)
        {
            i = -1;
        } else
        if (i > j)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        comparison = i;
        return this;
    }

    public CompareToBuilder append(long l, long l1)
    {
        if (comparison != 0)
        {
            return this;
        }
        int i;
        if (l < l1)
        {
            i = -1;
        } else
        if (l > l1)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        comparison = i;
        return this;
    }

    public CompareToBuilder append(Object obj, Object obj1)
    {
        return append(obj, obj1, null);
    }

    public CompareToBuilder append(Object obj, Object obj1, Comparator comparator)
    {
        while (comparison != 0 || obj == obj1) 
        {
            return this;
        }
        if (obj == null)
        {
            comparison = -1;
            return this;
        }
        if (obj1 == null)
        {
            comparison = 1;
            return this;
        }
        if (obj.getClass().isArray())
        {
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
                append((Object[])(Object[])obj, (Object[])(Object[])obj1, comparator);
                return this;
            }
        }
        if (comparator == null)
        {
            comparison = ((Comparable)obj).compareTo(obj1);
            return this;
        } else
        {
            comparison = comparator.compare(obj, obj1);
            return this;
        }
    }

    public CompareToBuilder append(short word0, short word1)
    {
        if (comparison != 0)
        {
            return this;
        }
        if (word0 < word1)
        {
            word0 = -1;
        } else
        if (word0 > word1)
        {
            word0 = 1;
        } else
        {
            word0 = 0;
        }
        comparison = word0;
        return this;
    }

    public CompareToBuilder append(boolean flag, boolean flag1)
    {
        while (comparison != 0 || flag == flag1) 
        {
            return this;
        }
        if (!flag)
        {
            comparison = -1;
            return this;
        } else
        {
            comparison = 1;
            return this;
        }
    }

    public CompareToBuilder append(byte abyte0[], byte abyte1[])
    {
        int i;
        i = -1;
        break MISSING_BLOCK_LABEL_2;
        if (comparison == 0 && abyte0 != abyte1)
        {
            if (abyte0 == null)
            {
                comparison = -1;
                return this;
            }
            if (abyte1 == null)
            {
                comparison = 1;
                return this;
            }
            if (abyte0.length != abyte1.length)
            {
                if (abyte0.length >= abyte1.length)
                {
                    i = 1;
                }
                comparison = i;
                return this;
            }
            i = 0;
            while (i < abyte0.length && comparison == 0) 
            {
                append(abyte0[i], abyte1[i]);
                i++;
            }
        }
        return this;
    }

    public CompareToBuilder append(char ac[], char ac1[])
    {
        int i;
        i = -1;
        break MISSING_BLOCK_LABEL_2;
        if (comparison == 0 && ac != ac1)
        {
            if (ac == null)
            {
                comparison = -1;
                return this;
            }
            if (ac1 == null)
            {
                comparison = 1;
                return this;
            }
            if (ac.length != ac1.length)
            {
                if (ac.length >= ac1.length)
                {
                    i = 1;
                }
                comparison = i;
                return this;
            }
            i = 0;
            while (i < ac.length && comparison == 0) 
            {
                append(ac[i], ac1[i]);
                i++;
            }
        }
        return this;
    }

    public CompareToBuilder append(double ad[], double ad1[])
    {
        int i;
        i = -1;
        break MISSING_BLOCK_LABEL_2;
        if (comparison == 0 && ad != ad1)
        {
            if (ad == null)
            {
                comparison = -1;
                return this;
            }
            if (ad1 == null)
            {
                comparison = 1;
                return this;
            }
            if (ad.length != ad1.length)
            {
                if (ad.length >= ad1.length)
                {
                    i = 1;
                }
                comparison = i;
                return this;
            }
            i = 0;
            while (i < ad.length && comparison == 0) 
            {
                append(ad[i], ad1[i]);
                i++;
            }
        }
        return this;
    }

    public CompareToBuilder append(float af[], float af1[])
    {
        int i;
        i = -1;
        break MISSING_BLOCK_LABEL_2;
        if (comparison == 0 && af != af1)
        {
            if (af == null)
            {
                comparison = -1;
                return this;
            }
            if (af1 == null)
            {
                comparison = 1;
                return this;
            }
            if (af.length != af1.length)
            {
                if (af.length >= af1.length)
                {
                    i = 1;
                }
                comparison = i;
                return this;
            }
            i = 0;
            while (i < af.length && comparison == 0) 
            {
                append(af[i], af1[i]);
                i++;
            }
        }
        return this;
    }

    public CompareToBuilder append(int ai[], int ai1[])
    {
        int i;
        i = -1;
        break MISSING_BLOCK_LABEL_2;
        if (comparison == 0 && ai != ai1)
        {
            if (ai == null)
            {
                comparison = -1;
                return this;
            }
            if (ai1 == null)
            {
                comparison = 1;
                return this;
            }
            if (ai.length != ai1.length)
            {
                if (ai.length >= ai1.length)
                {
                    i = 1;
                }
                comparison = i;
                return this;
            }
            i = 0;
            while (i < ai.length && comparison == 0) 
            {
                append(ai[i], ai1[i]);
                i++;
            }
        }
        return this;
    }

    public CompareToBuilder append(long al[], long al1[])
    {
        int i;
        i = -1;
        break MISSING_BLOCK_LABEL_2;
        if (comparison == 0 && al != al1)
        {
            if (al == null)
            {
                comparison = -1;
                return this;
            }
            if (al1 == null)
            {
                comparison = 1;
                return this;
            }
            if (al.length != al1.length)
            {
                if (al.length >= al1.length)
                {
                    i = 1;
                }
                comparison = i;
                return this;
            }
            i = 0;
            while (i < al.length && comparison == 0) 
            {
                append(al[i], al1[i]);
                i++;
            }
        }
        return this;
    }

    public CompareToBuilder append(Object aobj[], Object aobj1[])
    {
        return append(aobj, aobj1, null);
    }

    public CompareToBuilder append(Object aobj[], Object aobj1[], Comparator comparator)
    {
        int i;
        i = -1;
        break MISSING_BLOCK_LABEL_3;
        if (comparison == 0 && aobj != aobj1)
        {
            if (aobj == null)
            {
                comparison = -1;
                return this;
            }
            if (aobj1 == null)
            {
                comparison = 1;
                return this;
            }
            if (aobj.length != aobj1.length)
            {
                if (aobj.length >= aobj1.length)
                {
                    i = 1;
                }
                comparison = i;
                return this;
            }
            i = 0;
            while (i < aobj.length && comparison == 0) 
            {
                append(aobj[i], aobj1[i], comparator);
                i++;
            }
        }
        return this;
    }

    public CompareToBuilder append(short aword0[], short aword1[])
    {
        int i;
        i = -1;
        break MISSING_BLOCK_LABEL_2;
        if (comparison == 0 && aword0 != aword1)
        {
            if (aword0 == null)
            {
                comparison = -1;
                return this;
            }
            if (aword1 == null)
            {
                comparison = 1;
                return this;
            }
            if (aword0.length != aword1.length)
            {
                if (aword0.length >= aword1.length)
                {
                    i = 1;
                }
                comparison = i;
                return this;
            }
            i = 0;
            while (i < aword0.length && comparison == 0) 
            {
                append(aword0[i], aword1[i]);
                i++;
            }
        }
        return this;
    }

    public CompareToBuilder append(boolean aflag[], boolean aflag1[])
    {
        int i;
        i = -1;
        break MISSING_BLOCK_LABEL_2;
        if (comparison == 0 && aflag != aflag1)
        {
            if (aflag == null)
            {
                comparison = -1;
                return this;
            }
            if (aflag1 == null)
            {
                comparison = 1;
                return this;
            }
            if (aflag.length != aflag1.length)
            {
                if (aflag.length >= aflag1.length)
                {
                    i = 1;
                }
                comparison = i;
                return this;
            }
            i = 0;
            while (i < aflag.length && comparison == 0) 
            {
                append(aflag[i], aflag1[i]);
                i++;
            }
        }
        return this;
    }

    public CompareToBuilder appendSuper(int i)
    {
        if (comparison != 0)
        {
            return this;
        } else
        {
            comparison = i;
            return this;
        }
    }

    public Integer build()
    {
        return Integer.valueOf(toComparison());
    }

    public volatile Object build()
    {
        return build();
    }

    public int toComparison()
    {
        return comparison;
    }
}
