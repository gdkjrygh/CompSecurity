// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.lang3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.apache.commons.lang3.mutable.MutableInt;

public class ArrayUtils
{

    public static final boolean EMPTY_BOOLEAN_ARRAY[] = new boolean[0];
    public static final Boolean EMPTY_BOOLEAN_OBJECT_ARRAY[] = new Boolean[0];
    public static final byte EMPTY_BYTE_ARRAY[] = new byte[0];
    public static final Byte EMPTY_BYTE_OBJECT_ARRAY[] = new Byte[0];
    public static final Character EMPTY_CHARACTER_OBJECT_ARRAY[] = new Character[0];
    public static final char EMPTY_CHAR_ARRAY[] = new char[0];
    public static final Class EMPTY_CLASS_ARRAY[] = new Class[0];
    public static final double EMPTY_DOUBLE_ARRAY[] = new double[0];
    public static final Double EMPTY_DOUBLE_OBJECT_ARRAY[] = new Double[0];
    public static final float EMPTY_FLOAT_ARRAY[] = new float[0];
    public static final Float EMPTY_FLOAT_OBJECT_ARRAY[] = new Float[0];
    public static final Integer EMPTY_INTEGER_OBJECT_ARRAY[] = new Integer[0];
    public static final int EMPTY_INT_ARRAY[] = new int[0];
    public static final long EMPTY_LONG_ARRAY[] = new long[0];
    public static final Long EMPTY_LONG_OBJECT_ARRAY[] = new Long[0];
    public static final Object EMPTY_OBJECT_ARRAY[] = new Object[0];
    public static final short EMPTY_SHORT_ARRAY[] = new short[0];
    public static final Short EMPTY_SHORT_OBJECT_ARRAY[] = new Short[0];
    public static final String EMPTY_STRING_ARRAY[] = new String[0];
    public static final int INDEX_NOT_FOUND = -1;

    public ArrayUtils()
    {
    }

    private static Object add(Object obj, int i, Object obj1, Class class1)
    {
        if (obj == null)
        {
            if (i != 0)
            {
                throw new IndexOutOfBoundsException((new StringBuilder()).append("Index: ").append(i).append(", Length: 0").toString());
            } else
            {
                obj = Array.newInstance(class1, 1);
                Array.set(obj, 0, obj1);
                return obj;
            }
        }
        int j = Array.getLength(obj);
        if (i > j || i < 0)
        {
            throw new IndexOutOfBoundsException((new StringBuilder()).append("Index: ").append(i).append(", Length: ").append(j).toString());
        }
        class1 = ((Class) (Array.newInstance(class1, j + 1)));
        System.arraycopy(obj, 0, class1, 0, i);
        Array.set(class1, i, obj1);
        if (i < j)
        {
            System.arraycopy(obj, i, class1, i + 1, j - i);
        }
        return class1;
    }

    public static byte[] add(byte abyte0[], byte byte0)
    {
        abyte0 = (byte[])(byte[])copyArrayGrow1(abyte0, Byte.TYPE);
        abyte0[abyte0.length - 1] = byte0;
        return abyte0;
    }

    public static byte[] add(byte abyte0[], int i, byte byte0)
    {
        return (byte[])(byte[])add(abyte0, i, Byte.valueOf(byte0), Byte.TYPE);
    }

    public static char[] add(char ac[], char c)
    {
        ac = (char[])(char[])copyArrayGrow1(ac, Character.TYPE);
        ac[ac.length - 1] = c;
        return ac;
    }

    public static char[] add(char ac[], int i, char c)
    {
        return (char[])(char[])add(ac, i, Character.valueOf(c), Character.TYPE);
    }

    public static double[] add(double ad[], double d)
    {
        ad = (double[])(double[])copyArrayGrow1(ad, Double.TYPE);
        ad[ad.length - 1] = d;
        return ad;
    }

    public static double[] add(double ad[], int i, double d)
    {
        return (double[])(double[])add(ad, i, Double.valueOf(d), Double.TYPE);
    }

    public static float[] add(float af[], float f)
    {
        af = (float[])(float[])copyArrayGrow1(af, Float.TYPE);
        af[af.length - 1] = f;
        return af;
    }

    public static float[] add(float af[], int i, float f)
    {
        return (float[])(float[])add(af, i, Float.valueOf(f), Float.TYPE);
    }

    public static int[] add(int ai[], int i)
    {
        ai = (int[])(int[])copyArrayGrow1(ai, Integer.TYPE);
        ai[ai.length - 1] = i;
        return ai;
    }

    public static int[] add(int ai[], int i, int j)
    {
        return (int[])(int[])add(ai, i, Integer.valueOf(j), Integer.TYPE);
    }

    public static long[] add(long al[], int i, long l)
    {
        return (long[])(long[])add(al, i, Long.valueOf(l), Long.TYPE);
    }

    public static long[] add(long al[], long l)
    {
        al = (long[])(long[])copyArrayGrow1(al, Long.TYPE);
        al[al.length - 1] = l;
        return al;
    }

    public static Object[] add(Object aobj[], int i, Object obj)
    {
        Class class1;
        if (aobj != null)
        {
            class1 = ((Object) (aobj)).getClass().getComponentType();
        } else
        if (obj != null)
        {
            class1 = obj.getClass();
        } else
        {
            throw new IllegalArgumentException("Array and element cannot both be null");
        }
        return (Object[])(Object[])add(((Object) (aobj)), i, obj, class1);
    }

    public static Object[] add(Object aobj[], Object obj)
    {
        Class class1;
        if (aobj != null)
        {
            class1 = ((Object) (aobj)).getClass();
        } else
        if (obj != null)
        {
            class1 = obj.getClass();
        } else
        {
            throw new IllegalArgumentException("Arguments cannot both be null");
        }
        aobj = (Object[])(Object[])copyArrayGrow1(((Object) (aobj)), class1);
        aobj[aobj.length - 1] = obj;
        return aobj;
    }

    public static short[] add(short aword0[], int i, short word0)
    {
        return (short[])(short[])add(aword0, i, Short.valueOf(word0), Short.TYPE);
    }

    public static short[] add(short aword0[], short word0)
    {
        aword0 = (short[])(short[])copyArrayGrow1(aword0, Short.TYPE);
        aword0[aword0.length - 1] = word0;
        return aword0;
    }

    public static boolean[] add(boolean aflag[], int i, boolean flag)
    {
        return (boolean[])(boolean[])add(aflag, i, Boolean.valueOf(flag), Boolean.TYPE);
    }

    public static boolean[] add(boolean aflag[], boolean flag)
    {
        aflag = (boolean[])(boolean[])copyArrayGrow1(aflag, Boolean.TYPE);
        aflag[aflag.length - 1] = flag;
        return aflag;
    }

    public static transient byte[] addAll(byte abyte0[], byte abyte1[])
    {
        if (abyte0 == null)
        {
            return clone(abyte1);
        }
        if (abyte1 == null)
        {
            return clone(abyte0);
        } else
        {
            byte abyte2[] = new byte[abyte0.length + abyte1.length];
            System.arraycopy(abyte0, 0, abyte2, 0, abyte0.length);
            System.arraycopy(abyte1, 0, abyte2, abyte0.length, abyte1.length);
            return abyte2;
        }
    }

    public static transient char[] addAll(char ac[], char ac1[])
    {
        if (ac == null)
        {
            return clone(ac1);
        }
        if (ac1 == null)
        {
            return clone(ac);
        } else
        {
            char ac2[] = new char[ac.length + ac1.length];
            System.arraycopy(ac, 0, ac2, 0, ac.length);
            System.arraycopy(ac1, 0, ac2, ac.length, ac1.length);
            return ac2;
        }
    }

    public static transient double[] addAll(double ad[], double ad1[])
    {
        if (ad == null)
        {
            return clone(ad1);
        }
        if (ad1 == null)
        {
            return clone(ad);
        } else
        {
            double ad2[] = new double[ad.length + ad1.length];
            System.arraycopy(ad, 0, ad2, 0, ad.length);
            System.arraycopy(ad1, 0, ad2, ad.length, ad1.length);
            return ad2;
        }
    }

    public static transient float[] addAll(float af[], float af1[])
    {
        if (af == null)
        {
            return clone(af1);
        }
        if (af1 == null)
        {
            return clone(af);
        } else
        {
            float af2[] = new float[af.length + af1.length];
            System.arraycopy(af, 0, af2, 0, af.length);
            System.arraycopy(af1, 0, af2, af.length, af1.length);
            return af2;
        }
    }

    public static transient int[] addAll(int ai[], int ai1[])
    {
        if (ai == null)
        {
            return clone(ai1);
        }
        if (ai1 == null)
        {
            return clone(ai);
        } else
        {
            int ai2[] = new int[ai.length + ai1.length];
            System.arraycopy(ai, 0, ai2, 0, ai.length);
            System.arraycopy(ai1, 0, ai2, ai.length, ai1.length);
            return ai2;
        }
    }

    public static transient long[] addAll(long al[], long al1[])
    {
        if (al == null)
        {
            return clone(al1);
        }
        if (al1 == null)
        {
            return clone(al);
        } else
        {
            long al2[] = new long[al.length + al1.length];
            System.arraycopy(al, 0, al2, 0, al.length);
            System.arraycopy(al1, 0, al2, al.length, al1.length);
            return al2;
        }
    }

    public static transient Object[] addAll(Object aobj[], Object aobj1[])
    {
        if (aobj == null)
        {
            return clone(aobj1);
        }
        if (aobj1 == null)
        {
            return clone(aobj);
        }
        Class class1 = ((Object) (aobj)).getClass().getComponentType();
        Object aobj2[] = (Object[])(Object[])Array.newInstance(class1, aobj.length + aobj1.length);
        System.arraycopy(((Object) (aobj)), 0, ((Object) (aobj2)), 0, aobj.length);
        try
        {
            System.arraycopy(((Object) (aobj1)), 0, ((Object) (aobj2)), aobj.length, aobj1.length);
        }
        // Misplaced declaration of an exception variable
        catch (Object aobj[])
        {
            aobj1 = ((Object) (aobj1)).getClass().getComponentType();
            if (!class1.isAssignableFrom(((Class) (aobj1))))
            {
                throw new IllegalArgumentException((new StringBuilder()).append("Cannot store ").append(((Class) (aobj1)).getName()).append(" in an array of ").append(class1.getName()).toString(), ((Throwable) (aobj)));
            } else
            {
                throw aobj;
            }
        }
        return aobj2;
    }

    public static transient short[] addAll(short aword0[], short aword1[])
    {
        if (aword0 == null)
        {
            return clone(aword1);
        }
        if (aword1 == null)
        {
            return clone(aword0);
        } else
        {
            short aword2[] = new short[aword0.length + aword1.length];
            System.arraycopy(aword0, 0, aword2, 0, aword0.length);
            System.arraycopy(aword1, 0, aword2, aword0.length, aword1.length);
            return aword2;
        }
    }

    public static transient boolean[] addAll(boolean aflag[], boolean aflag1[])
    {
        if (aflag == null)
        {
            return clone(aflag1);
        }
        if (aflag1 == null)
        {
            return clone(aflag);
        } else
        {
            boolean aflag2[] = new boolean[aflag.length + aflag1.length];
            System.arraycopy(aflag, 0, aflag2, 0, aflag.length);
            System.arraycopy(aflag1, 0, aflag2, aflag.length, aflag1.length);
            return aflag2;
        }
    }

    public static byte[] clone(byte abyte0[])
    {
        if (abyte0 == null)
        {
            return null;
        } else
        {
            return (byte[])abyte0.clone();
        }
    }

    public static char[] clone(char ac[])
    {
        if (ac == null)
        {
            return null;
        } else
        {
            return (char[])ac.clone();
        }
    }

    public static double[] clone(double ad[])
    {
        if (ad == null)
        {
            return null;
        } else
        {
            return (double[])ad.clone();
        }
    }

    public static float[] clone(float af[])
    {
        if (af == null)
        {
            return null;
        } else
        {
            return (float[])af.clone();
        }
    }

    public static int[] clone(int ai[])
    {
        if (ai == null)
        {
            return null;
        } else
        {
            return (int[])ai.clone();
        }
    }

    public static long[] clone(long al[])
    {
        if (al == null)
        {
            return null;
        } else
        {
            return (long[])al.clone();
        }
    }

    public static Object[] clone(Object aobj[])
    {
        if (aobj == null)
        {
            return null;
        } else
        {
            return (Object[])((Object []) (aobj)).clone();
        }
    }

    public static short[] clone(short aword0[])
    {
        if (aword0 == null)
        {
            return null;
        } else
        {
            return (short[])aword0.clone();
        }
    }

    public static boolean[] clone(boolean aflag[])
    {
        if (aflag == null)
        {
            return null;
        } else
        {
            return (boolean[])aflag.clone();
        }
    }

    public static boolean contains(byte abyte0[], byte byte0)
    {
        return indexOf(abyte0, byte0) != -1;
    }

    public static boolean contains(char ac[], char c)
    {
        return indexOf(ac, c) != -1;
    }

    public static boolean contains(double ad[], double d)
    {
        return indexOf(ad, d) != -1;
    }

    public static boolean contains(double ad[], double d, double d1)
    {
        boolean flag = false;
        if (indexOf(ad, d, 0, d1) != -1)
        {
            flag = true;
        }
        return flag;
    }

    public static boolean contains(float af[], float f)
    {
        return indexOf(af, f) != -1;
    }

    public static boolean contains(int ai[], int i)
    {
        return indexOf(ai, i) != -1;
    }

    public static boolean contains(long al[], long l)
    {
        return indexOf(al, l) != -1;
    }

    public static boolean contains(Object aobj[], Object obj)
    {
        return indexOf(aobj, obj) != -1;
    }

    public static boolean contains(short aword0[], short word0)
    {
        return indexOf(aword0, word0) != -1;
    }

    public static boolean contains(boolean aflag[], boolean flag)
    {
        return indexOf(aflag, flag) != -1;
    }

    private static Object copyArrayGrow1(Object obj, Class class1)
    {
        if (obj != null)
        {
            int i = Array.getLength(obj);
            class1 = ((Class) (Array.newInstance(obj.getClass().getComponentType(), i + 1)));
            System.arraycopy(obj, 0, class1, 0, i);
            return class1;
        } else
        {
            return Array.newInstance(class1, 1);
        }
    }

    private static int[] extractIndices(HashSet hashset)
    {
        int ai[] = new int[hashset.size()];
        int i = 0;
        for (hashset = hashset.iterator(); hashset.hasNext();)
        {
            ai[i] = ((Integer)hashset.next()).intValue();
            i++;
        }

        return ai;
    }

    public static int getLength(Object obj)
    {
        if (obj == null)
        {
            return 0;
        } else
        {
            return Array.getLength(obj);
        }
    }

    public static int hashCode(Object obj)
    {
        return (new HashCodeBuilder()).append(obj).toHashCode();
    }

    public static int indexOf(byte abyte0[], byte byte0)
    {
        return indexOf(abyte0, byte0, 0);
    }

    public static int indexOf(byte abyte0[], byte byte0, int i)
    {
        if (abyte0 != null) goto _L2; else goto _L1
_L1:
        int j = -1;
_L4:
        return j;
_L2:
        j = i;
        if (i < 0)
        {
            j = 0;
        }
        i = j;
label0:
        do
        {
label1:
            {
                if (i >= abyte0.length)
                {
                    break label1;
                }
                j = i;
                if (byte0 == abyte0[i])
                {
                    break label0;
                }
                i++;
            }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
        return -1;
    }

    public static int indexOf(char ac[], char c)
    {
        return indexOf(ac, c, 0);
    }

    public static int indexOf(char ac[], char c, int i)
    {
        if (ac != null) goto _L2; else goto _L1
_L1:
        int j = -1;
_L4:
        return j;
_L2:
        j = i;
        if (i < 0)
        {
            j = 0;
        }
        i = j;
label0:
        do
        {
label1:
            {
                if (i >= ac.length)
                {
                    break label1;
                }
                j = i;
                if (c == ac[i])
                {
                    break label0;
                }
                i++;
            }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
        return -1;
    }

    public static int indexOf(double ad[], double d)
    {
        return indexOf(ad, d, 0);
    }

    public static int indexOf(double ad[], double d, double d1)
    {
        return indexOf(ad, d, 0, d1);
    }

    public static int indexOf(double ad[], double d, int i)
    {
        if (!isEmpty(ad)) goto _L2; else goto _L1
_L1:
        int j = -1;
_L4:
        return j;
_L2:
        j = i;
        if (i < 0)
        {
            j = 0;
        }
        i = j;
label0:
        do
        {
label1:
            {
                if (i >= ad.length)
                {
                    break label1;
                }
                j = i;
                if (d == ad[i])
                {
                    break label0;
                }
                i++;
            }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
        return -1;
    }

    public static int indexOf(double ad[], double d, int i, double d1)
    {
        if (!isEmpty(ad)) goto _L2; else goto _L1
_L1:
        int j = -1;
_L6:
        return j;
_L2:
        j = i;
        if (i < 0)
        {
            j = 0;
        }
        i = j;
_L7:
        if (i >= ad.length) goto _L4; else goto _L3
_L3:
        if (ad[i] < d - d1)
        {
            continue; /* Loop/switch isn't completed */
        }
        j = i;
        if (ad[i] <= d + d1) goto _L6; else goto _L5
_L5:
        i++;
          goto _L7
_L4:
        return -1;
    }

    public static int indexOf(float af[], float f)
    {
        return indexOf(af, f, 0);
    }

    public static int indexOf(float af[], float f, int i)
    {
        if (!isEmpty(af)) goto _L2; else goto _L1
_L1:
        int j = -1;
_L4:
        return j;
_L2:
        j = i;
        if (i < 0)
        {
            j = 0;
        }
        i = j;
label0:
        do
        {
label1:
            {
                if (i >= af.length)
                {
                    break label1;
                }
                j = i;
                if (f == af[i])
                {
                    break label0;
                }
                i++;
            }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
        return -1;
    }

    public static int indexOf(int ai[], int i)
    {
        return indexOf(ai, i, 0);
    }

    public static int indexOf(int ai[], int i, int j)
    {
        if (ai != null) goto _L2; else goto _L1
_L1:
        int k = -1;
_L4:
        return k;
_L2:
        k = j;
        if (j < 0)
        {
            k = 0;
        }
        j = k;
label0:
        do
        {
label1:
            {
                if (j >= ai.length)
                {
                    break label1;
                }
                k = j;
                if (i == ai[j])
                {
                    break label0;
                }
                j++;
            }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
        return -1;
    }

    public static int indexOf(long al[], long l)
    {
        return indexOf(al, l, 0);
    }

    public static int indexOf(long al[], long l, int i)
    {
        if (al != null) goto _L2; else goto _L1
_L1:
        int j = -1;
_L4:
        return j;
_L2:
        j = i;
        if (i < 0)
        {
            j = 0;
        }
        i = j;
label0:
        do
        {
label1:
            {
                if (i >= al.length)
                {
                    break label1;
                }
                j = i;
                if (l == al[i])
                {
                    break label0;
                }
                i++;
            }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
        return -1;
    }

    public static int indexOf(Object aobj[], Object obj)
    {
        return indexOf(aobj, obj, 0);
    }

    public static int indexOf(Object aobj[], Object obj, int i)
    {
        if (aobj != null) goto _L2; else goto _L1
_L1:
        i = -1;
_L4:
        return i;
_L2:
label0:
        {
            int j = i;
            if (i < 0)
            {
                j = 0;
            }
            if (obj == null)
            {
                do
                {
                    if (j >= aobj.length)
                    {
                        break label0;
                    }
                    i = j;
                    if (aobj[j] == null)
                    {
                        continue; /* Loop/switch isn't completed */
                    }
                    j++;
                } while (true);
            }
            if (!((Object) (aobj)).getClass().getComponentType().isInstance(obj))
            {
                break label0;
            }
            do
            {
                if (j >= aobj.length)
                {
                    break label0;
                }
                i = j;
                if (obj.equals(aobj[j]))
                {
                    break;
                }
                j++;
            } while (true);
        }
        if (true) goto _L4; else goto _L3
_L3:
        return -1;
    }

    public static int indexOf(short aword0[], short word0)
    {
        return indexOf(aword0, word0, 0);
    }

    public static int indexOf(short aword0[], short word0, int i)
    {
        if (aword0 != null) goto _L2; else goto _L1
_L1:
        int j = -1;
_L4:
        return j;
_L2:
        j = i;
        if (i < 0)
        {
            j = 0;
        }
        i = j;
label0:
        do
        {
label1:
            {
                if (i >= aword0.length)
                {
                    break label1;
                }
                j = i;
                if (word0 == aword0[i])
                {
                    break label0;
                }
                i++;
            }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
        return -1;
    }

    public static int indexOf(boolean aflag[], boolean flag)
    {
        return indexOf(aflag, flag, 0);
    }

    public static int indexOf(boolean aflag[], boolean flag, int i)
    {
        if (!isEmpty(aflag)) goto _L2; else goto _L1
_L1:
        int j = -1;
_L4:
        return j;
_L2:
        j = i;
        if (i < 0)
        {
            j = 0;
        }
        i = j;
label0:
        do
        {
label1:
            {
                if (i >= aflag.length)
                {
                    break label1;
                }
                j = i;
                if (flag == aflag[i])
                {
                    break label0;
                }
                i++;
            }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
        return -1;
    }

    public static boolean isEmpty(byte abyte0[])
    {
        return abyte0 == null || abyte0.length == 0;
    }

    public static boolean isEmpty(char ac[])
    {
        return ac == null || ac.length == 0;
    }

    public static boolean isEmpty(double ad[])
    {
        return ad == null || ad.length == 0;
    }

    public static boolean isEmpty(float af[])
    {
        return af == null || af.length == 0;
    }

    public static boolean isEmpty(int ai[])
    {
        return ai == null || ai.length == 0;
    }

    public static boolean isEmpty(long al[])
    {
        return al == null || al.length == 0;
    }

    public static boolean isEmpty(Object aobj[])
    {
        return aobj == null || aobj.length == 0;
    }

    public static boolean isEmpty(short aword0[])
    {
        return aword0 == null || aword0.length == 0;
    }

    public static boolean isEmpty(boolean aflag[])
    {
        return aflag == null || aflag.length == 0;
    }

    public static boolean isEquals(Object obj, Object obj1)
    {
        return (new EqualsBuilder()).append(obj, obj1).isEquals();
    }

    public static boolean isNotEmpty(byte abyte0[])
    {
        return abyte0 != null && abyte0.length != 0;
    }

    public static boolean isNotEmpty(char ac[])
    {
        return ac != null && ac.length != 0;
    }

    public static boolean isNotEmpty(double ad[])
    {
        return ad != null && ad.length != 0;
    }

    public static boolean isNotEmpty(float af[])
    {
        return af != null && af.length != 0;
    }

    public static boolean isNotEmpty(int ai[])
    {
        return ai != null && ai.length != 0;
    }

    public static boolean isNotEmpty(long al[])
    {
        return al != null && al.length != 0;
    }

    public static boolean isNotEmpty(Object aobj[])
    {
        return aobj != null && aobj.length != 0;
    }

    public static boolean isNotEmpty(short aword0[])
    {
        return aword0 != null && aword0.length != 0;
    }

    public static boolean isNotEmpty(boolean aflag[])
    {
        return aflag != null && aflag.length != 0;
    }

    public static boolean isSameLength(byte abyte0[], byte abyte1[])
    {
        return (abyte0 != null || abyte1 == null || abyte1.length <= 0) && (abyte1 != null || abyte0 == null || abyte0.length <= 0) && (abyte0 == null || abyte1 == null || abyte0.length == abyte1.length);
    }

    public static boolean isSameLength(char ac[], char ac1[])
    {
        return (ac != null || ac1 == null || ac1.length <= 0) && (ac1 != null || ac == null || ac.length <= 0) && (ac == null || ac1 == null || ac.length == ac1.length);
    }

    public static boolean isSameLength(double ad[], double ad1[])
    {
        return (ad != null || ad1 == null || ad1.length <= 0) && (ad1 != null || ad == null || ad.length <= 0) && (ad == null || ad1 == null || ad.length == ad1.length);
    }

    public static boolean isSameLength(float af[], float af1[])
    {
        return (af != null || af1 == null || af1.length <= 0) && (af1 != null || af == null || af.length <= 0) && (af == null || af1 == null || af.length == af1.length);
    }

    public static boolean isSameLength(int ai[], int ai1[])
    {
        return (ai != null || ai1 == null || ai1.length <= 0) && (ai1 != null || ai == null || ai.length <= 0) && (ai == null || ai1 == null || ai.length == ai1.length);
    }

    public static boolean isSameLength(long al[], long al1[])
    {
        return (al != null || al1 == null || al1.length <= 0) && (al1 != null || al == null || al.length <= 0) && (al == null || al1 == null || al.length == al1.length);
    }

    public static boolean isSameLength(Object aobj[], Object aobj1[])
    {
        return (aobj != null || aobj1 == null || aobj1.length <= 0) && (aobj1 != null || aobj == null || aobj.length <= 0) && (aobj == null || aobj1 == null || aobj.length == aobj1.length);
    }

    public static boolean isSameLength(short aword0[], short aword1[])
    {
        return (aword0 != null || aword1 == null || aword1.length <= 0) && (aword1 != null || aword0 == null || aword0.length <= 0) && (aword0 == null || aword1 == null || aword0.length == aword1.length);
    }

    public static boolean isSameLength(boolean aflag[], boolean aflag1[])
    {
        return (aflag != null || aflag1 == null || aflag1.length <= 0) && (aflag1 != null || aflag == null || aflag.length <= 0) && (aflag == null || aflag1 == null || aflag.length == aflag1.length);
    }

    public static boolean isSameType(Object obj, Object obj1)
    {
        if (obj == null || obj1 == null)
        {
            throw new IllegalArgumentException("The Array must not be null");
        } else
        {
            return obj.getClass().getName().equals(obj1.getClass().getName());
        }
    }

    public static int lastIndexOf(byte abyte0[], byte byte0)
    {
        return lastIndexOf(abyte0, byte0, 0x7fffffff);
    }

    public static int lastIndexOf(byte abyte0[], byte byte0, int i)
    {
        if (abyte0 != null) goto _L2; else goto _L1
_L1:
        int j = -1;
_L4:
        return j;
_L2:
        if (i < 0)
        {
            return -1;
        }
        j = i;
        if (i >= abyte0.length)
        {
            j = abyte0.length - 1;
        }
        i = j;
label0:
        do
        {
label1:
            {
                if (i < 0)
                {
                    break label1;
                }
                j = i;
                if (byte0 == abyte0[i])
                {
                    break label0;
                }
                i--;
            }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
        return -1;
    }

    public static int lastIndexOf(char ac[], char c)
    {
        return lastIndexOf(ac, c, 0x7fffffff);
    }

    public static int lastIndexOf(char ac[], char c, int i)
    {
        if (ac != null) goto _L2; else goto _L1
_L1:
        int j = -1;
_L4:
        return j;
_L2:
        if (i < 0)
        {
            return -1;
        }
        j = i;
        if (i >= ac.length)
        {
            j = ac.length - 1;
        }
        i = j;
label0:
        do
        {
label1:
            {
                if (i < 0)
                {
                    break label1;
                }
                j = i;
                if (c == ac[i])
                {
                    break label0;
                }
                i--;
            }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
        return -1;
    }

    public static int lastIndexOf(double ad[], double d)
    {
        return lastIndexOf(ad, d, 0x7fffffff);
    }

    public static int lastIndexOf(double ad[], double d, double d1)
    {
        return lastIndexOf(ad, d, 0x7fffffff, d1);
    }

    public static int lastIndexOf(double ad[], double d, int i)
    {
        if (!isEmpty(ad)) goto _L2; else goto _L1
_L1:
        int j = -1;
_L4:
        return j;
_L2:
        if (i < 0)
        {
            return -1;
        }
        j = i;
        if (i >= ad.length)
        {
            j = ad.length - 1;
        }
        i = j;
label0:
        do
        {
label1:
            {
                if (i < 0)
                {
                    break label1;
                }
                j = i;
                if (d == ad[i])
                {
                    break label0;
                }
                i--;
            }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
        return -1;
    }

    public static int lastIndexOf(double ad[], double d, int i, double d1)
    {
        if (!isEmpty(ad)) goto _L2; else goto _L1
_L1:
        int j = -1;
_L6:
        return j;
_L2:
        if (i < 0)
        {
            return -1;
        }
        j = i;
        if (i >= ad.length)
        {
            j = ad.length - 1;
        }
        i = j;
_L7:
        if (i < 0) goto _L4; else goto _L3
_L3:
        if (ad[i] < d - d1)
        {
            continue; /* Loop/switch isn't completed */
        }
        j = i;
        if (ad[i] <= d + d1) goto _L6; else goto _L5
_L5:
        i--;
          goto _L7
_L4:
        return -1;
    }

    public static int lastIndexOf(float af[], float f)
    {
        return lastIndexOf(af, f, 0x7fffffff);
    }

    public static int lastIndexOf(float af[], float f, int i)
    {
        if (!isEmpty(af)) goto _L2; else goto _L1
_L1:
        int j = -1;
_L4:
        return j;
_L2:
        if (i < 0)
        {
            return -1;
        }
        j = i;
        if (i >= af.length)
        {
            j = af.length - 1;
        }
        i = j;
label0:
        do
        {
label1:
            {
                if (i < 0)
                {
                    break label1;
                }
                j = i;
                if (f == af[i])
                {
                    break label0;
                }
                i--;
            }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
        return -1;
    }

    public static int lastIndexOf(int ai[], int i)
    {
        return lastIndexOf(ai, i, 0x7fffffff);
    }

    public static int lastIndexOf(int ai[], int i, int j)
    {
        if (ai != null) goto _L2; else goto _L1
_L1:
        int k = -1;
_L4:
        return k;
_L2:
        if (j < 0)
        {
            return -1;
        }
        k = j;
        if (j >= ai.length)
        {
            k = ai.length - 1;
        }
        j = k;
label0:
        do
        {
label1:
            {
                if (j < 0)
                {
                    break label1;
                }
                k = j;
                if (i == ai[j])
                {
                    break label0;
                }
                j--;
            }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
        return -1;
    }

    public static int lastIndexOf(long al[], long l)
    {
        return lastIndexOf(al, l, 0x7fffffff);
    }

    public static int lastIndexOf(long al[], long l, int i)
    {
        if (al != null) goto _L2; else goto _L1
_L1:
        int j = -1;
_L4:
        return j;
_L2:
        if (i < 0)
        {
            return -1;
        }
        j = i;
        if (i >= al.length)
        {
            j = al.length - 1;
        }
        i = j;
label0:
        do
        {
label1:
            {
                if (i < 0)
                {
                    break label1;
                }
                j = i;
                if (l == al[i])
                {
                    break label0;
                }
                i--;
            }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
        return -1;
    }

    public static int lastIndexOf(Object aobj[], Object obj)
    {
        return lastIndexOf(aobj, obj, 0x7fffffff);
    }

    public static int lastIndexOf(Object aobj[], Object obj, int i)
    {
        if (aobj != null) goto _L2; else goto _L1
_L1:
        i = -1;
_L4:
        return i;
_L2:
label0:
        {
            if (i < 0)
            {
                return -1;
            }
            int j = i;
            if (i >= aobj.length)
            {
                j = aobj.length - 1;
            }
            if (obj == null)
            {
                do
                {
                    if (j < 0)
                    {
                        break label0;
                    }
                    i = j;
                    if (aobj[j] == null)
                    {
                        continue; /* Loop/switch isn't completed */
                    }
                    j--;
                } while (true);
            }
            if (!((Object) (aobj)).getClass().getComponentType().isInstance(obj))
            {
                break label0;
            }
            do
            {
                if (j < 0)
                {
                    break label0;
                }
                i = j;
                if (obj.equals(aobj[j]))
                {
                    break;
                }
                j--;
            } while (true);
        }
        if (true) goto _L4; else goto _L3
_L3:
        return -1;
    }

    public static int lastIndexOf(short aword0[], short word0)
    {
        return lastIndexOf(aword0, word0, 0x7fffffff);
    }

    public static int lastIndexOf(short aword0[], short word0, int i)
    {
        if (aword0 != null) goto _L2; else goto _L1
_L1:
        int j = -1;
_L4:
        return j;
_L2:
        if (i < 0)
        {
            return -1;
        }
        j = i;
        if (i >= aword0.length)
        {
            j = aword0.length - 1;
        }
        i = j;
label0:
        do
        {
label1:
            {
                if (i < 0)
                {
                    break label1;
                }
                j = i;
                if (word0 == aword0[i])
                {
                    break label0;
                }
                i--;
            }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
        return -1;
    }

    public static int lastIndexOf(boolean aflag[], boolean flag)
    {
        return lastIndexOf(aflag, flag, 0x7fffffff);
    }

    public static int lastIndexOf(boolean aflag[], boolean flag, int i)
    {
        if (!isEmpty(aflag)) goto _L2; else goto _L1
_L1:
        int j = -1;
_L4:
        return j;
_L2:
        if (i < 0)
        {
            return -1;
        }
        j = i;
        if (i >= aflag.length)
        {
            j = aflag.length - 1;
        }
        i = j;
label0:
        do
        {
label1:
            {
                if (i < 0)
                {
                    break label1;
                }
                j = i;
                if (flag == aflag[i])
                {
                    break label0;
                }
                i--;
            }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
        return -1;
    }

    public static byte[] nullToEmpty(byte abyte0[])
    {
        byte abyte1[];
label0:
        {
            if (abyte0 != null)
            {
                abyte1 = abyte0;
                if (abyte0.length != 0)
                {
                    break label0;
                }
            }
            abyte1 = EMPTY_BYTE_ARRAY;
        }
        return abyte1;
    }

    public static char[] nullToEmpty(char ac[])
    {
        char ac1[];
label0:
        {
            if (ac != null)
            {
                ac1 = ac;
                if (ac.length != 0)
                {
                    break label0;
                }
            }
            ac1 = EMPTY_CHAR_ARRAY;
        }
        return ac1;
    }

    public static double[] nullToEmpty(double ad[])
    {
        double ad1[];
label0:
        {
            if (ad != null)
            {
                ad1 = ad;
                if (ad.length != 0)
                {
                    break label0;
                }
            }
            ad1 = EMPTY_DOUBLE_ARRAY;
        }
        return ad1;
    }

    public static float[] nullToEmpty(float af[])
    {
        float af1[];
label0:
        {
            if (af != null)
            {
                af1 = af;
                if (af.length != 0)
                {
                    break label0;
                }
            }
            af1 = EMPTY_FLOAT_ARRAY;
        }
        return af1;
    }

    public static int[] nullToEmpty(int ai[])
    {
        int ai1[];
label0:
        {
            if (ai != null)
            {
                ai1 = ai;
                if (ai.length != 0)
                {
                    break label0;
                }
            }
            ai1 = EMPTY_INT_ARRAY;
        }
        return ai1;
    }

    public static long[] nullToEmpty(long al[])
    {
        long al1[];
label0:
        {
            if (al != null)
            {
                al1 = al;
                if (al.length != 0)
                {
                    break label0;
                }
            }
            al1 = EMPTY_LONG_ARRAY;
        }
        return al1;
    }

    public static Boolean[] nullToEmpty(Boolean aboolean[])
    {
        Boolean aboolean1[];
label0:
        {
            if (aboolean != null)
            {
                aboolean1 = aboolean;
                if (aboolean.length != 0)
                {
                    break label0;
                }
            }
            aboolean1 = EMPTY_BOOLEAN_OBJECT_ARRAY;
        }
        return aboolean1;
    }

    public static Byte[] nullToEmpty(Byte abyte[])
    {
        Byte abyte1[];
label0:
        {
            if (abyte != null)
            {
                abyte1 = abyte;
                if (abyte.length != 0)
                {
                    break label0;
                }
            }
            abyte1 = EMPTY_BYTE_OBJECT_ARRAY;
        }
        return abyte1;
    }

    public static Character[] nullToEmpty(Character acharacter[])
    {
        Character acharacter1[];
label0:
        {
            if (acharacter != null)
            {
                acharacter1 = acharacter;
                if (acharacter.length != 0)
                {
                    break label0;
                }
            }
            acharacter1 = EMPTY_CHARACTER_OBJECT_ARRAY;
        }
        return acharacter1;
    }

    public static Double[] nullToEmpty(Double adouble[])
    {
        Double adouble1[];
label0:
        {
            if (adouble != null)
            {
                adouble1 = adouble;
                if (adouble.length != 0)
                {
                    break label0;
                }
            }
            adouble1 = EMPTY_DOUBLE_OBJECT_ARRAY;
        }
        return adouble1;
    }

    public static Float[] nullToEmpty(Float afloat[])
    {
        Float afloat1[];
label0:
        {
            if (afloat != null)
            {
                afloat1 = afloat;
                if (afloat.length != 0)
                {
                    break label0;
                }
            }
            afloat1 = EMPTY_FLOAT_OBJECT_ARRAY;
        }
        return afloat1;
    }

    public static Integer[] nullToEmpty(Integer ainteger[])
    {
        Integer ainteger1[];
label0:
        {
            if (ainteger != null)
            {
                ainteger1 = ainteger;
                if (ainteger.length != 0)
                {
                    break label0;
                }
            }
            ainteger1 = EMPTY_INTEGER_OBJECT_ARRAY;
        }
        return ainteger1;
    }

    public static Long[] nullToEmpty(Long along[])
    {
        Long along1[];
label0:
        {
            if (along != null)
            {
                along1 = along;
                if (along.length != 0)
                {
                    break label0;
                }
            }
            along1 = EMPTY_LONG_OBJECT_ARRAY;
        }
        return along1;
    }

    public static Object[] nullToEmpty(Object aobj[])
    {
        Object aobj1[];
label0:
        {
            if (aobj != null)
            {
                aobj1 = aobj;
                if (aobj.length != 0)
                {
                    break label0;
                }
            }
            aobj1 = EMPTY_OBJECT_ARRAY;
        }
        return aobj1;
    }

    public static Short[] nullToEmpty(Short ashort[])
    {
        Short ashort1[];
label0:
        {
            if (ashort != null)
            {
                ashort1 = ashort;
                if (ashort.length != 0)
                {
                    break label0;
                }
            }
            ashort1 = EMPTY_SHORT_OBJECT_ARRAY;
        }
        return ashort1;
    }

    public static String[] nullToEmpty(String as[])
    {
        String as1[];
label0:
        {
            if (as != null)
            {
                as1 = as;
                if (as.length != 0)
                {
                    break label0;
                }
            }
            as1 = EMPTY_STRING_ARRAY;
        }
        return as1;
    }

    public static short[] nullToEmpty(short aword0[])
    {
        short aword1[];
label0:
        {
            if (aword0 != null)
            {
                aword1 = aword0;
                if (aword0.length != 0)
                {
                    break label0;
                }
            }
            aword1 = EMPTY_SHORT_ARRAY;
        }
        return aword1;
    }

    public static boolean[] nullToEmpty(boolean aflag[])
    {
        boolean aflag1[];
label0:
        {
            if (aflag != null)
            {
                aflag1 = aflag;
                if (aflag.length != 0)
                {
                    break label0;
                }
            }
            aflag1 = EMPTY_BOOLEAN_ARRAY;
        }
        return aflag1;
    }

    private static Object remove(Object obj, int i)
    {
        int j = getLength(obj);
        if (i < 0 || i >= j)
        {
            throw new IndexOutOfBoundsException((new StringBuilder()).append("Index: ").append(i).append(", Length: ").append(j).toString());
        }
        Object obj1 = Array.newInstance(obj.getClass().getComponentType(), j - 1);
        System.arraycopy(obj, 0, obj1, 0, i);
        if (i < j - 1)
        {
            System.arraycopy(obj, i + 1, obj1, i, j - i - 1);
        }
        return obj1;
    }

    public static byte[] remove(byte abyte0[], int i)
    {
        return (byte[])(byte[])remove(abyte0, i);
    }

    public static char[] remove(char ac[], int i)
    {
        return (char[])(char[])remove(ac, i);
    }

    public static double[] remove(double ad[], int i)
    {
        return (double[])(double[])remove(ad, i);
    }

    public static float[] remove(float af[], int i)
    {
        return (float[])(float[])remove(af, i);
    }

    public static int[] remove(int ai[], int i)
    {
        return (int[])(int[])remove(ai, i);
    }

    public static long[] remove(long al[], int i)
    {
        return (long[])(long[])remove(al, i);
    }

    public static Object[] remove(Object aobj[], int i)
    {
        return (Object[])(Object[])remove(((Object) (aobj)), i);
    }

    public static short[] remove(short aword0[], int i)
    {
        return (short[])(short[])remove(aword0, i);
    }

    public static boolean[] remove(boolean aflag[], int i)
    {
        return (boolean[])(boolean[])remove(aflag, i);
    }

    private static transient Object removeAll(Object obj, int ai[])
    {
        int k = getLength(obj);
        int j1 = 0;
        int i = 0;
        if (isNotEmpty(ai))
        {
            Arrays.sort(ai);
            j1 = ai.length;
            int l = k;
            do
            {
                int l1 = j1 - 1;
                j1 = i;
                if (l1 < 0)
                {
                    break;
                }
                int j2 = ai[l1];
                if (j2 < 0 || j2 >= k)
                {
                    throw new IndexOutOfBoundsException((new StringBuilder()).append("Index: ").append(j2).append(", Length: ").append(k).toString());
                }
                j1 = l1;
                if (j2 < l)
                {
                    i++;
                    l = j2;
                    j1 = l1;
                }
            } while (true);
        }
        Object obj1 = Array.newInstance(obj.getClass().getComponentType(), k - j1);
        if (j1 < k)
        {
            int i1 = k;
            k -= j1;
            for (int j = ai.length - 1; j >= 0;)
            {
                int i2 = ai[j];
                int k1 = k;
                if (i1 - i2 > 1)
                {
                    i1 = i1 - i2 - 1;
                    k1 = k - i1;
                    System.arraycopy(obj, i2 + 1, obj1, k1, i1);
                }
                i1 = i2;
                j--;
                k = k1;
            }

            if (i1 > 0)
            {
                System.arraycopy(obj, 0, obj1, 0, i1);
            }
        }
        return obj1;
    }

    public static transient byte[] removeAll(byte abyte0[], int ai[])
    {
        return (byte[])(byte[])removeAll(abyte0, clone(ai));
    }

    public static transient char[] removeAll(char ac[], int ai[])
    {
        return (char[])(char[])removeAll(ac, clone(ai));
    }

    public static transient double[] removeAll(double ad[], int ai[])
    {
        return (double[])(double[])removeAll(ad, clone(ai));
    }

    public static transient float[] removeAll(float af[], int ai[])
    {
        return (float[])(float[])removeAll(af, clone(ai));
    }

    public static transient int[] removeAll(int ai[], int ai1[])
    {
        return (int[])(int[])removeAll(ai, clone(ai1));
    }

    public static transient long[] removeAll(long al[], int ai[])
    {
        return (long[])(long[])removeAll(al, clone(ai));
    }

    public static transient Object[] removeAll(Object aobj[], int ai[])
    {
        return (Object[])(Object[])removeAll(((Object) (aobj)), clone(ai));
    }

    public static transient short[] removeAll(short aword0[], int ai[])
    {
        return (short[])(short[])removeAll(aword0, clone(ai));
    }

    public static transient boolean[] removeAll(boolean aflag[], int ai[])
    {
        return (boolean[])(boolean[])removeAll(aflag, clone(ai));
    }

    public static byte[] removeElement(byte abyte0[], byte byte0)
    {
        int i = indexOf(abyte0, byte0);
        if (i == -1)
        {
            return clone(abyte0);
        } else
        {
            return remove(abyte0, i);
        }
    }

    public static char[] removeElement(char ac[], char c)
    {
        int i = indexOf(ac, c);
        if (i == -1)
        {
            return clone(ac);
        } else
        {
            return remove(ac, i);
        }
    }

    public static double[] removeElement(double ad[], double d)
    {
        int i = indexOf(ad, d);
        if (i == -1)
        {
            return clone(ad);
        } else
        {
            return remove(ad, i);
        }
    }

    public static float[] removeElement(float af[], float f)
    {
        int i = indexOf(af, f);
        if (i == -1)
        {
            return clone(af);
        } else
        {
            return remove(af, i);
        }
    }

    public static int[] removeElement(int ai[], int i)
    {
        i = indexOf(ai, i);
        if (i == -1)
        {
            return clone(ai);
        } else
        {
            return remove(ai, i);
        }
    }

    public static long[] removeElement(long al[], long l)
    {
        int i = indexOf(al, l);
        if (i == -1)
        {
            return clone(al);
        } else
        {
            return remove(al, i);
        }
    }

    public static Object[] removeElement(Object aobj[], Object obj)
    {
        int i = indexOf(aobj, obj);
        if (i == -1)
        {
            return clone(aobj);
        } else
        {
            return remove(aobj, i);
        }
    }

    public static short[] removeElement(short aword0[], short word0)
    {
        int i = indexOf(aword0, word0);
        if (i == -1)
        {
            return clone(aword0);
        } else
        {
            return remove(aword0, i);
        }
    }

    public static boolean[] removeElement(boolean aflag[], boolean flag)
    {
        int i = indexOf(aflag, flag);
        if (i == -1)
        {
            return clone(aflag);
        } else
        {
            return remove(aflag, i);
        }
    }

    public static transient byte[] removeElements(byte abyte0[], byte abyte1[])
    {
        Object obj;
        if (isEmpty(abyte0) || isEmpty(abyte1))
        {
            return clone(abyte0);
        }
        obj = new HashMap(abyte1.length);
        int k = abyte1.length;
        int i = 0;
        while (i < k) 
        {
            Byte byte1 = Byte.valueOf(abyte1[i]);
            MutableInt mutableint = (MutableInt)((HashMap) (obj)).get(byte1);
            if (mutableint == null)
            {
                ((HashMap) (obj)).put(byte1, new MutableInt(1));
            } else
            {
                mutableint.increment();
            }
            i++;
        }
        abyte1 = new HashSet();
        obj = ((HashMap) (obj)).entrySet().iterator();
_L2:
        Byte byte2;
        int j;
        int l;
        int i1;
        if (!((Iterator) (obj)).hasNext())
        {
            break MISSING_BLOCK_LABEL_215;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (obj)).next();
        byte2 = (Byte)entry.getKey();
        l = 0;
        j = 0;
        i1 = ((MutableInt)entry.getValue()).intValue();
_L4:
        if (j >= i1) goto _L2; else goto _L1
_L1:
        l = indexOf(abyte0, byte2.byteValue(), l);
        if (l < 0) goto _L2; else goto _L3
_L3:
        abyte1.add(Integer.valueOf(l));
        j++;
        l++;
          goto _L4
        return removeAll(abyte0, extractIndices(abyte1));
    }

    public static transient char[] removeElements(char ac[], char ac1[])
    {
        Object obj;
        if (isEmpty(ac) || isEmpty(ac1))
        {
            return clone(ac);
        }
        obj = new HashMap(ac1.length);
        int k = ac1.length;
        int i = 0;
        while (i < k) 
        {
            Character character = Character.valueOf(ac1[i]);
            MutableInt mutableint = (MutableInt)((HashMap) (obj)).get(character);
            if (mutableint == null)
            {
                ((HashMap) (obj)).put(character, new MutableInt(1));
            } else
            {
                mutableint.increment();
            }
            i++;
        }
        ac1 = new HashSet();
        obj = ((HashMap) (obj)).entrySet().iterator();
_L2:
        Character character1;
        int j;
        int l;
        int i1;
        if (!((Iterator) (obj)).hasNext())
        {
            break MISSING_BLOCK_LABEL_215;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (obj)).next();
        character1 = (Character)entry.getKey();
        l = 0;
        j = 0;
        i1 = ((MutableInt)entry.getValue()).intValue();
_L4:
        if (j >= i1) goto _L2; else goto _L1
_L1:
        l = indexOf(ac, character1.charValue(), l);
        if (l < 0) goto _L2; else goto _L3
_L3:
        ac1.add(Integer.valueOf(l));
        j++;
        l++;
          goto _L4
        return removeAll(ac, extractIndices(ac1));
    }

    public static transient double[] removeElements(double ad[], double ad1[])
    {
        Object obj;
        if (isEmpty(ad) || isEmpty(ad1))
        {
            return clone(ad);
        }
        obj = new HashMap(ad1.length);
        int k = ad1.length;
        int i = 0;
        while (i < k) 
        {
            Double double1 = Double.valueOf(ad1[i]);
            MutableInt mutableint = (MutableInt)((HashMap) (obj)).get(double1);
            if (mutableint == null)
            {
                ((HashMap) (obj)).put(double1, new MutableInt(1));
            } else
            {
                mutableint.increment();
            }
            i++;
        }
        ad1 = new HashSet();
        obj = ((HashMap) (obj)).entrySet().iterator();
_L2:
        Double double2;
        int j;
        int l;
        int i1;
        if (!((Iterator) (obj)).hasNext())
        {
            break MISSING_BLOCK_LABEL_215;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (obj)).next();
        double2 = (Double)entry.getKey();
        l = 0;
        j = 0;
        i1 = ((MutableInt)entry.getValue()).intValue();
_L4:
        if (j >= i1) goto _L2; else goto _L1
_L1:
        l = indexOf(ad, double2.doubleValue(), l);
        if (l < 0) goto _L2; else goto _L3
_L3:
        ad1.add(Integer.valueOf(l));
        j++;
        l++;
          goto _L4
        return removeAll(ad, extractIndices(ad1));
    }

    public static transient float[] removeElements(float af[], float af1[])
    {
        Object obj;
        if (isEmpty(af) || isEmpty(af1))
        {
            return clone(af);
        }
        obj = new HashMap(af1.length);
        int k = af1.length;
        int i = 0;
        while (i < k) 
        {
            Float float1 = Float.valueOf(af1[i]);
            MutableInt mutableint = (MutableInt)((HashMap) (obj)).get(float1);
            if (mutableint == null)
            {
                ((HashMap) (obj)).put(float1, new MutableInt(1));
            } else
            {
                mutableint.increment();
            }
            i++;
        }
        af1 = new HashSet();
        obj = ((HashMap) (obj)).entrySet().iterator();
_L2:
        Float float2;
        int j;
        int l;
        int i1;
        if (!((Iterator) (obj)).hasNext())
        {
            break MISSING_BLOCK_LABEL_215;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (obj)).next();
        float2 = (Float)entry.getKey();
        l = 0;
        j = 0;
        i1 = ((MutableInt)entry.getValue()).intValue();
_L4:
        if (j >= i1) goto _L2; else goto _L1
_L1:
        l = indexOf(af, float2.floatValue(), l);
        if (l < 0) goto _L2; else goto _L3
_L3:
        af1.add(Integer.valueOf(l));
        j++;
        l++;
          goto _L4
        return removeAll(af, extractIndices(af1));
    }

    public static transient int[] removeElements(int ai[], int ai1[])
    {
        Object obj;
        if (isEmpty(ai) || isEmpty(ai1))
        {
            return clone(ai);
        }
        obj = new HashMap(ai1.length);
        int k = ai1.length;
        int i = 0;
        while (i < k) 
        {
            Integer integer = Integer.valueOf(ai1[i]);
            MutableInt mutableint = (MutableInt)((HashMap) (obj)).get(integer);
            if (mutableint == null)
            {
                ((HashMap) (obj)).put(integer, new MutableInt(1));
            } else
            {
                mutableint.increment();
            }
            i++;
        }
        ai1 = new HashSet();
        obj = ((HashMap) (obj)).entrySet().iterator();
_L2:
        Integer integer1;
        int j;
        int l;
        int i1;
        if (!((Iterator) (obj)).hasNext())
        {
            break MISSING_BLOCK_LABEL_215;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (obj)).next();
        integer1 = (Integer)entry.getKey();
        l = 0;
        j = 0;
        i1 = ((MutableInt)entry.getValue()).intValue();
_L4:
        if (j >= i1) goto _L2; else goto _L1
_L1:
        l = indexOf(ai, integer1.intValue(), l);
        if (l < 0) goto _L2; else goto _L3
_L3:
        ai1.add(Integer.valueOf(l));
        j++;
        l++;
          goto _L4
        return removeAll(ai, extractIndices(ai1));
    }

    public static transient long[] removeElements(long al[], long al1[])
    {
        Object obj;
        if (isEmpty(al) || isEmpty(al1))
        {
            return clone(al);
        }
        obj = new HashMap(al1.length);
        int k = al1.length;
        int i = 0;
        while (i < k) 
        {
            Long long1 = Long.valueOf(al1[i]);
            MutableInt mutableint = (MutableInt)((HashMap) (obj)).get(long1);
            if (mutableint == null)
            {
                ((HashMap) (obj)).put(long1, new MutableInt(1));
            } else
            {
                mutableint.increment();
            }
            i++;
        }
        al1 = new HashSet();
        obj = ((HashMap) (obj)).entrySet().iterator();
_L2:
        Long long2;
        int j;
        int l;
        int i1;
        if (!((Iterator) (obj)).hasNext())
        {
            break MISSING_BLOCK_LABEL_215;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (obj)).next();
        long2 = (Long)entry.getKey();
        l = 0;
        j = 0;
        i1 = ((MutableInt)entry.getValue()).intValue();
_L4:
        if (j >= i1) goto _L2; else goto _L1
_L1:
        l = indexOf(al, long2.longValue(), l);
        if (l < 0) goto _L2; else goto _L3
_L3:
        al1.add(Integer.valueOf(l));
        j++;
        l++;
          goto _L4
        return removeAll(al, extractIndices(al1));
    }

    public static transient Object[] removeElements(Object aobj[], Object aobj1[])
    {
        Object obj;
        if (isEmpty(aobj) || isEmpty(aobj1))
        {
            return clone(aobj);
        }
        obj = new HashMap(aobj1.length);
        int k = aobj1.length;
        int i = 0;
        while (i < k) 
        {
            Object obj1 = aobj1[i];
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
        aobj1 = new HashSet();
        obj = ((HashMap) (obj)).entrySet().iterator();
_L2:
        Object obj2;
        int j;
        int l;
        int i1;
        if (!((Iterator) (obj)).hasNext())
        {
            break MISSING_BLOCK_LABEL_206;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (obj)).next();
        obj2 = entry.getKey();
        l = 0;
        j = 0;
        i1 = ((MutableInt)entry.getValue()).intValue();
_L4:
        if (j >= i1) goto _L2; else goto _L1
_L1:
        l = indexOf(aobj, obj2, l);
        if (l < 0) goto _L2; else goto _L3
_L3:
        ((HashSet) (aobj1)).add(Integer.valueOf(l));
        j++;
        l++;
          goto _L4
        return removeAll(aobj, extractIndices(((HashSet) (aobj1))));
    }

    public static transient short[] removeElements(short aword0[], short aword1[])
    {
        Object obj;
        if (isEmpty(aword0) || isEmpty(aword1))
        {
            return clone(aword0);
        }
        obj = new HashMap(aword1.length);
        int k = aword1.length;
        int i = 0;
        while (i < k) 
        {
            Short short1 = Short.valueOf(aword1[i]);
            MutableInt mutableint = (MutableInt)((HashMap) (obj)).get(short1);
            if (mutableint == null)
            {
                ((HashMap) (obj)).put(short1, new MutableInt(1));
            } else
            {
                mutableint.increment();
            }
            i++;
        }
        aword1 = new HashSet();
        obj = ((HashMap) (obj)).entrySet().iterator();
_L2:
        Short short2;
        int j;
        int l;
        int i1;
        if (!((Iterator) (obj)).hasNext())
        {
            break MISSING_BLOCK_LABEL_215;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (obj)).next();
        short2 = (Short)entry.getKey();
        l = 0;
        j = 0;
        i1 = ((MutableInt)entry.getValue()).intValue();
_L4:
        if (j >= i1) goto _L2; else goto _L1
_L1:
        l = indexOf(aword0, short2.shortValue(), l);
        if (l < 0) goto _L2; else goto _L3
_L3:
        aword1.add(Integer.valueOf(l));
        j++;
        l++;
          goto _L4
        return removeAll(aword0, extractIndices(aword1));
    }

    public static transient boolean[] removeElements(boolean aflag[], boolean aflag1[])
    {
        Object obj;
        if (isEmpty(aflag) || isEmpty(aflag1))
        {
            return clone(aflag);
        }
        obj = new HashMap(aflag1.length);
        int k = aflag1.length;
        int i = 0;
        while (i < k) 
        {
            Boolean boolean1 = Boolean.valueOf(aflag1[i]);
            MutableInt mutableint = (MutableInt)((HashMap) (obj)).get(boolean1);
            if (mutableint == null)
            {
                ((HashMap) (obj)).put(boolean1, new MutableInt(1));
            } else
            {
                mutableint.increment();
            }
            i++;
        }
        aflag1 = new HashSet();
        obj = ((HashMap) (obj)).entrySet().iterator();
_L2:
        Boolean boolean2;
        int j;
        int l;
        int i1;
        if (!((Iterator) (obj)).hasNext())
        {
            break MISSING_BLOCK_LABEL_215;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (obj)).next();
        boolean2 = (Boolean)entry.getKey();
        l = 0;
        j = 0;
        i1 = ((MutableInt)entry.getValue()).intValue();
_L4:
        if (j >= i1) goto _L2; else goto _L1
_L1:
        l = indexOf(aflag, boolean2.booleanValue(), l);
        if (l < 0) goto _L2; else goto _L3
_L3:
        aflag1.add(Integer.valueOf(l));
        j++;
        l++;
          goto _L4
        return removeAll(aflag, extractIndices(aflag1));
    }

    public static void reverse(byte abyte0[])
    {
        if (abyte0 != null)
        {
            int i = 0;
            int j = abyte0.length - 1;
            while (j > i) 
            {
                byte byte0 = abyte0[j];
                abyte0[j] = abyte0[i];
                abyte0[i] = byte0;
                j--;
                i++;
            }
        }
    }

    public static void reverse(char ac[])
    {
        if (ac != null)
        {
            int i = 0;
            int j = ac.length - 1;
            while (j > i) 
            {
                char c = ac[j];
                ac[j] = ac[i];
                ac[i] = c;
                j--;
                i++;
            }
        }
    }

    public static void reverse(double ad[])
    {
        if (ad != null)
        {
            int i = 0;
            int j = ad.length - 1;
            while (j > i) 
            {
                double d = ad[j];
                ad[j] = ad[i];
                ad[i] = d;
                j--;
                i++;
            }
        }
    }

    public static void reverse(float af[])
    {
        if (af != null)
        {
            int i = 0;
            int j = af.length - 1;
            while (j > i) 
            {
                float f = af[j];
                af[j] = af[i];
                af[i] = f;
                j--;
                i++;
            }
        }
    }

    public static void reverse(int ai[])
    {
        if (ai != null)
        {
            int i = 0;
            int j = ai.length - 1;
            while (j > i) 
            {
                int k = ai[j];
                ai[j] = ai[i];
                ai[i] = k;
                j--;
                i++;
            }
        }
    }

    public static void reverse(long al[])
    {
        if (al != null)
        {
            int i = 0;
            int j = al.length - 1;
            while (j > i) 
            {
                long l = al[j];
                al[j] = al[i];
                al[i] = l;
                j--;
                i++;
            }
        }
    }

    public static void reverse(Object aobj[])
    {
        if (aobj != null)
        {
            int i = 0;
            int j = aobj.length - 1;
            while (j > i) 
            {
                Object obj = aobj[j];
                aobj[j] = aobj[i];
                aobj[i] = obj;
                j--;
                i++;
            }
        }
    }

    public static void reverse(short aword0[])
    {
        if (aword0 != null)
        {
            int i = 0;
            int j = aword0.length - 1;
            while (j > i) 
            {
                short word0 = aword0[j];
                aword0[j] = aword0[i];
                aword0[i] = word0;
                j--;
                i++;
            }
        }
    }

    public static void reverse(boolean aflag[])
    {
        if (aflag != null)
        {
            int i = 0;
            int j = aflag.length - 1;
            while (j > i) 
            {
                boolean flag = aflag[j];
                aflag[j] = aflag[i];
                aflag[i] = flag;
                j--;
                i++;
            }
        }
    }

    public static byte[] subarray(byte abyte0[], int i, int j)
    {
        if (abyte0 == null)
        {
            return null;
        }
        int k = i;
        if (i < 0)
        {
            k = 0;
        }
        i = j;
        if (j > abyte0.length)
        {
            i = abyte0.length;
        }
        i -= k;
        if (i <= 0)
        {
            return EMPTY_BYTE_ARRAY;
        } else
        {
            byte abyte1[] = new byte[i];
            System.arraycopy(abyte0, k, abyte1, 0, i);
            return abyte1;
        }
    }

    public static char[] subarray(char ac[], int i, int j)
    {
        if (ac == null)
        {
            return null;
        }
        int k = i;
        if (i < 0)
        {
            k = 0;
        }
        i = j;
        if (j > ac.length)
        {
            i = ac.length;
        }
        i -= k;
        if (i <= 0)
        {
            return EMPTY_CHAR_ARRAY;
        } else
        {
            char ac1[] = new char[i];
            System.arraycopy(ac, k, ac1, 0, i);
            return ac1;
        }
    }

    public static double[] subarray(double ad[], int i, int j)
    {
        if (ad == null)
        {
            return null;
        }
        int k = i;
        if (i < 0)
        {
            k = 0;
        }
        i = j;
        if (j > ad.length)
        {
            i = ad.length;
        }
        i -= k;
        if (i <= 0)
        {
            return EMPTY_DOUBLE_ARRAY;
        } else
        {
            double ad1[] = new double[i];
            System.arraycopy(ad, k, ad1, 0, i);
            return ad1;
        }
    }

    public static float[] subarray(float af[], int i, int j)
    {
        if (af == null)
        {
            return null;
        }
        int k = i;
        if (i < 0)
        {
            k = 0;
        }
        i = j;
        if (j > af.length)
        {
            i = af.length;
        }
        i -= k;
        if (i <= 0)
        {
            return EMPTY_FLOAT_ARRAY;
        } else
        {
            float af1[] = new float[i];
            System.arraycopy(af, k, af1, 0, i);
            return af1;
        }
    }

    public static int[] subarray(int ai[], int i, int j)
    {
        if (ai == null)
        {
            return null;
        }
        int k = i;
        if (i < 0)
        {
            k = 0;
        }
        i = j;
        if (j > ai.length)
        {
            i = ai.length;
        }
        i -= k;
        if (i <= 0)
        {
            return EMPTY_INT_ARRAY;
        } else
        {
            int ai1[] = new int[i];
            System.arraycopy(ai, k, ai1, 0, i);
            return ai1;
        }
    }

    public static long[] subarray(long al[], int i, int j)
    {
        if (al == null)
        {
            return null;
        }
        int k = i;
        if (i < 0)
        {
            k = 0;
        }
        i = j;
        if (j > al.length)
        {
            i = al.length;
        }
        i -= k;
        if (i <= 0)
        {
            return EMPTY_LONG_ARRAY;
        } else
        {
            long al1[] = new long[i];
            System.arraycopy(al, k, al1, 0, i);
            return al1;
        }
    }

    public static Object[] subarray(Object aobj[], int i, int j)
    {
        if (aobj == null)
        {
            return null;
        }
        int k = i;
        if (i < 0)
        {
            k = 0;
        }
        i = j;
        if (j > aobj.length)
        {
            i = aobj.length;
        }
        i -= k;
        Class class1 = ((Object) (aobj)).getClass().getComponentType();
        if (i <= 0)
        {
            return (Object[])(Object[])Array.newInstance(class1, 0);
        } else
        {
            Object aobj1[] = (Object[])(Object[])Array.newInstance(class1, i);
            System.arraycopy(((Object) (aobj)), k, ((Object) (aobj1)), 0, i);
            return aobj1;
        }
    }

    public static short[] subarray(short aword0[], int i, int j)
    {
        if (aword0 == null)
        {
            return null;
        }
        int k = i;
        if (i < 0)
        {
            k = 0;
        }
        i = j;
        if (j > aword0.length)
        {
            i = aword0.length;
        }
        i -= k;
        if (i <= 0)
        {
            return EMPTY_SHORT_ARRAY;
        } else
        {
            short aword1[] = new short[i];
            System.arraycopy(aword0, k, aword1, 0, i);
            return aword1;
        }
    }

    public static boolean[] subarray(boolean aflag[], int i, int j)
    {
        if (aflag == null)
        {
            return null;
        }
        int k = i;
        if (i < 0)
        {
            k = 0;
        }
        i = j;
        if (j > aflag.length)
        {
            i = aflag.length;
        }
        i -= k;
        if (i <= 0)
        {
            return EMPTY_BOOLEAN_ARRAY;
        } else
        {
            boolean aflag1[] = new boolean[i];
            System.arraycopy(aflag, k, aflag1, 0, i);
            return aflag1;
        }
    }

    public static transient Object[] toArray(Object aobj[])
    {
        return aobj;
    }

    public static Map toMap(Object aobj[])
    {
        if (aobj != null) goto _L2; else goto _L1
_L1:
        Object obj = null;
_L4:
        return ((Map) (obj));
_L2:
        HashMap hashmap = new HashMap((int)((double)aobj.length * 1.5D));
        int i = 0;
        do
        {
            obj = hashmap;
            if (i >= aobj.length)
            {
                continue; /* Loop/switch isn't completed */
            }
            obj = aobj[i];
            if (obj instanceof java.util.Map.Entry)
            {
                obj = (java.util.Map.Entry)obj;
                hashmap.put(((java.util.Map.Entry) (obj)).getKey(), ((java.util.Map.Entry) (obj)).getValue());
            } else
            if (obj instanceof Object[])
            {
                Object aobj1[] = (Object[])(Object[])obj;
                if (aobj1.length < 2)
                {
                    throw new IllegalArgumentException((new StringBuilder()).append("Array element ").append(i).append(", '").append(obj).append("', has a length less than 2").toString());
                }
                hashmap.put(aobj1[0], aobj1[1]);
            } else
            {
                throw new IllegalArgumentException((new StringBuilder()).append("Array element ").append(i).append(", '").append(obj).append("', is neither of type Map.Entry nor an Array").toString());
            }
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static Boolean[] toObject(boolean aflag[])
    {
        if (aflag != null) goto _L2; else goto _L1
_L1:
        Boolean aboolean[] = null;
_L4:
        return aboolean;
_L2:
        if (aflag.length == 0)
        {
            return EMPTY_BOOLEAN_OBJECT_ARRAY;
        }
        Boolean aboolean1[] = new Boolean[aflag.length];
        int i = 0;
        do
        {
            aboolean = aboolean1;
            if (i >= aflag.length)
            {
                continue;
            }
            Boolean boolean1;
            if (aflag[i])
            {
                boolean1 = Boolean.TRUE;
            } else
            {
                boolean1 = Boolean.FALSE;
            }
            aboolean1[i] = boolean1;
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static Byte[] toObject(byte abyte0[])
    {
        if (abyte0 != null) goto _L2; else goto _L1
_L1:
        Byte abyte[] = null;
_L4:
        return abyte;
_L2:
        if (abyte0.length == 0)
        {
            return EMPTY_BYTE_OBJECT_ARRAY;
        }
        Byte abyte1[] = new Byte[abyte0.length];
        int i = 0;
        do
        {
            abyte = abyte1;
            if (i >= abyte0.length)
            {
                continue;
            }
            abyte1[i] = Byte.valueOf(abyte0[i]);
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static Character[] toObject(char ac[])
    {
        if (ac != null) goto _L2; else goto _L1
_L1:
        Character acharacter[] = null;
_L4:
        return acharacter;
_L2:
        if (ac.length == 0)
        {
            return EMPTY_CHARACTER_OBJECT_ARRAY;
        }
        Character acharacter1[] = new Character[ac.length];
        int i = 0;
        do
        {
            acharacter = acharacter1;
            if (i >= ac.length)
            {
                continue;
            }
            acharacter1[i] = Character.valueOf(ac[i]);
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static Double[] toObject(double ad[])
    {
        if (ad != null) goto _L2; else goto _L1
_L1:
        Double adouble[] = null;
_L4:
        return adouble;
_L2:
        if (ad.length == 0)
        {
            return EMPTY_DOUBLE_OBJECT_ARRAY;
        }
        Double adouble1[] = new Double[ad.length];
        int i = 0;
        do
        {
            adouble = adouble1;
            if (i >= ad.length)
            {
                continue;
            }
            adouble1[i] = Double.valueOf(ad[i]);
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static Float[] toObject(float af[])
    {
        if (af != null) goto _L2; else goto _L1
_L1:
        Float afloat[] = null;
_L4:
        return afloat;
_L2:
        if (af.length == 0)
        {
            return EMPTY_FLOAT_OBJECT_ARRAY;
        }
        Float afloat1[] = new Float[af.length];
        int i = 0;
        do
        {
            afloat = afloat1;
            if (i >= af.length)
            {
                continue;
            }
            afloat1[i] = Float.valueOf(af[i]);
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static Integer[] toObject(int ai[])
    {
        if (ai != null) goto _L2; else goto _L1
_L1:
        Integer ainteger[] = null;
_L4:
        return ainteger;
_L2:
        if (ai.length == 0)
        {
            return EMPTY_INTEGER_OBJECT_ARRAY;
        }
        Integer ainteger1[] = new Integer[ai.length];
        int i = 0;
        do
        {
            ainteger = ainteger1;
            if (i >= ai.length)
            {
                continue;
            }
            ainteger1[i] = Integer.valueOf(ai[i]);
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static Long[] toObject(long al[])
    {
        if (al != null) goto _L2; else goto _L1
_L1:
        Long along[] = null;
_L4:
        return along;
_L2:
        if (al.length == 0)
        {
            return EMPTY_LONG_OBJECT_ARRAY;
        }
        Long along1[] = new Long[al.length];
        int i = 0;
        do
        {
            along = along1;
            if (i >= al.length)
            {
                continue;
            }
            along1[i] = Long.valueOf(al[i]);
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static Short[] toObject(short aword0[])
    {
        if (aword0 != null) goto _L2; else goto _L1
_L1:
        Short ashort[] = null;
_L4:
        return ashort;
_L2:
        if (aword0.length == 0)
        {
            return EMPTY_SHORT_OBJECT_ARRAY;
        }
        Short ashort1[] = new Short[aword0.length];
        int i = 0;
        do
        {
            ashort = ashort1;
            if (i >= aword0.length)
            {
                continue;
            }
            ashort1[i] = Short.valueOf(aword0[i]);
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static byte[] toPrimitive(Byte abyte[])
    {
        if (abyte != null) goto _L2; else goto _L1
_L1:
        byte abyte0[] = null;
_L4:
        return abyte0;
_L2:
        if (abyte.length == 0)
        {
            return EMPTY_BYTE_ARRAY;
        }
        byte abyte1[] = new byte[abyte.length];
        int i = 0;
        do
        {
            abyte0 = abyte1;
            if (i >= abyte.length)
            {
                continue;
            }
            abyte1[i] = abyte[i].byteValue();
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static byte[] toPrimitive(Byte abyte[], byte byte0)
    {
        if (abyte != null) goto _L2; else goto _L1
_L1:
        byte abyte0[] = null;
_L4:
        return abyte0;
_L2:
        if (abyte.length == 0)
        {
            return EMPTY_BYTE_ARRAY;
        }
        byte abyte1[] = new byte[abyte.length];
        int i = 0;
        do
        {
            abyte0 = abyte1;
            if (i >= abyte.length)
            {
                continue;
            }
            Byte byte2 = abyte[i];
            byte byte1;
            if (byte2 == null)
            {
                byte1 = byte0;
            } else
            {
                byte1 = byte2.byteValue();
            }
            abyte1[i] = byte1;
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static char[] toPrimitive(Character acharacter[])
    {
        if (acharacter != null) goto _L2; else goto _L1
_L1:
        char ac[] = null;
_L4:
        return ac;
_L2:
        if (acharacter.length == 0)
        {
            return EMPTY_CHAR_ARRAY;
        }
        char ac1[] = new char[acharacter.length];
        int i = 0;
        do
        {
            ac = ac1;
            if (i >= acharacter.length)
            {
                continue;
            }
            ac1[i] = acharacter[i].charValue();
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static char[] toPrimitive(Character acharacter[], char c)
    {
        if (acharacter != null) goto _L2; else goto _L1
_L1:
        char ac[] = null;
_L4:
        return ac;
_L2:
        if (acharacter.length == 0)
        {
            return EMPTY_CHAR_ARRAY;
        }
        char ac1[] = new char[acharacter.length];
        int i = 0;
        do
        {
            ac = ac1;
            if (i >= acharacter.length)
            {
                continue;
            }
            Character character = acharacter[i];
            char c1;
            if (character == null)
            {
                c1 = c;
            } else
            {
                c1 = character.charValue();
            }
            ac1[i] = c1;
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static double[] toPrimitive(Double adouble[])
    {
        if (adouble != null) goto _L2; else goto _L1
_L1:
        double ad[] = null;
_L4:
        return ad;
_L2:
        if (adouble.length == 0)
        {
            return EMPTY_DOUBLE_ARRAY;
        }
        double ad1[] = new double[adouble.length];
        int i = 0;
        do
        {
            ad = ad1;
            if (i >= adouble.length)
            {
                continue;
            }
            ad1[i] = adouble[i].doubleValue();
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static double[] toPrimitive(Double adouble[], double d)
    {
        if (adouble != null) goto _L2; else goto _L1
_L1:
        double ad[] = null;
_L4:
        return ad;
_L2:
        if (adouble.length == 0)
        {
            return EMPTY_DOUBLE_ARRAY;
        }
        double ad1[] = new double[adouble.length];
        int i = 0;
        do
        {
            ad = ad1;
            if (i >= adouble.length)
            {
                continue;
            }
            Double double1 = adouble[i];
            double d1;
            if (double1 == null)
            {
                d1 = d;
            } else
            {
                d1 = double1.doubleValue();
            }
            ad1[i] = d1;
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static float[] toPrimitive(Float afloat[])
    {
        if (afloat != null) goto _L2; else goto _L1
_L1:
        float af[] = null;
_L4:
        return af;
_L2:
        if (afloat.length == 0)
        {
            return EMPTY_FLOAT_ARRAY;
        }
        float af1[] = new float[afloat.length];
        int i = 0;
        do
        {
            af = af1;
            if (i >= afloat.length)
            {
                continue;
            }
            af1[i] = afloat[i].floatValue();
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static float[] toPrimitive(Float afloat[], float f)
    {
        if (afloat != null) goto _L2; else goto _L1
_L1:
        float af[] = null;
_L4:
        return af;
_L2:
        if (afloat.length == 0)
        {
            return EMPTY_FLOAT_ARRAY;
        }
        float af1[] = new float[afloat.length];
        int i = 0;
        do
        {
            af = af1;
            if (i >= afloat.length)
            {
                continue;
            }
            Float float1 = afloat[i];
            float f1;
            if (float1 == null)
            {
                f1 = f;
            } else
            {
                f1 = float1.floatValue();
            }
            af1[i] = f1;
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static int[] toPrimitive(Integer ainteger[])
    {
        if (ainteger != null) goto _L2; else goto _L1
_L1:
        int ai[] = null;
_L4:
        return ai;
_L2:
        if (ainteger.length == 0)
        {
            return EMPTY_INT_ARRAY;
        }
        int ai1[] = new int[ainteger.length];
        int i = 0;
        do
        {
            ai = ai1;
            if (i >= ainteger.length)
            {
                continue;
            }
            ai1[i] = ainteger[i].intValue();
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static int[] toPrimitive(Integer ainteger[], int i)
    {
        if (ainteger != null) goto _L2; else goto _L1
_L1:
        int ai[] = null;
_L4:
        return ai;
_L2:
        if (ainteger.length == 0)
        {
            return EMPTY_INT_ARRAY;
        }
        int ai1[] = new int[ainteger.length];
        int j = 0;
        do
        {
            ai = ai1;
            if (j >= ainteger.length)
            {
                continue;
            }
            Integer integer = ainteger[j];
            int k;
            if (integer == null)
            {
                k = i;
            } else
            {
                k = integer.intValue();
            }
            ai1[j] = k;
            j++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static long[] toPrimitive(Long along[])
    {
        if (along != null) goto _L2; else goto _L1
_L1:
        long al[] = null;
_L4:
        return al;
_L2:
        if (along.length == 0)
        {
            return EMPTY_LONG_ARRAY;
        }
        long al1[] = new long[along.length];
        int i = 0;
        do
        {
            al = al1;
            if (i >= along.length)
            {
                continue;
            }
            al1[i] = along[i].longValue();
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static long[] toPrimitive(Long along[], long l)
    {
        if (along != null) goto _L2; else goto _L1
_L1:
        long al[] = null;
_L4:
        return al;
_L2:
        if (along.length == 0)
        {
            return EMPTY_LONG_ARRAY;
        }
        long al1[] = new long[along.length];
        int i = 0;
        do
        {
            al = al1;
            if (i >= along.length)
            {
                continue;
            }
            Long long1 = along[i];
            long l1;
            if (long1 == null)
            {
                l1 = l;
            } else
            {
                l1 = long1.longValue();
            }
            al1[i] = l1;
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static short[] toPrimitive(Short ashort[])
    {
        if (ashort != null) goto _L2; else goto _L1
_L1:
        short aword0[] = null;
_L4:
        return aword0;
_L2:
        if (ashort.length == 0)
        {
            return EMPTY_SHORT_ARRAY;
        }
        short aword1[] = new short[ashort.length];
        int i = 0;
        do
        {
            aword0 = aword1;
            if (i >= ashort.length)
            {
                continue;
            }
            aword1[i] = ashort[i].shortValue();
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static short[] toPrimitive(Short ashort[], short word0)
    {
        if (ashort != null) goto _L2; else goto _L1
_L1:
        short aword0[] = null;
_L4:
        return aword0;
_L2:
        if (ashort.length == 0)
        {
            return EMPTY_SHORT_ARRAY;
        }
        short aword1[] = new short[ashort.length];
        int i = 0;
        do
        {
            aword0 = aword1;
            if (i >= ashort.length)
            {
                continue;
            }
            Short short1 = ashort[i];
            short word1;
            if (short1 == null)
            {
                word1 = word0;
            } else
            {
                word1 = short1.shortValue();
            }
            aword1[i] = word1;
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static boolean[] toPrimitive(Boolean aboolean[])
    {
        if (aboolean != null) goto _L2; else goto _L1
_L1:
        boolean aflag[] = null;
_L4:
        return aflag;
_L2:
        if (aboolean.length == 0)
        {
            return EMPTY_BOOLEAN_ARRAY;
        }
        boolean aflag1[] = new boolean[aboolean.length];
        int i = 0;
        do
        {
            aflag = aflag1;
            if (i >= aboolean.length)
            {
                continue;
            }
            aflag1[i] = aboolean[i].booleanValue();
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static boolean[] toPrimitive(Boolean aboolean[], boolean flag)
    {
        if (aboolean != null) goto _L2; else goto _L1
_L1:
        boolean aflag[] = null;
_L4:
        return aflag;
_L2:
        if (aboolean.length == 0)
        {
            return EMPTY_BOOLEAN_ARRAY;
        }
        boolean aflag1[] = new boolean[aboolean.length];
        int i = 0;
        do
        {
            aflag = aflag1;
            if (i >= aboolean.length)
            {
                continue;
            }
            Boolean boolean1 = aboolean[i];
            boolean flag1;
            if (boolean1 == null)
            {
                flag1 = flag;
            } else
            {
                flag1 = boolean1.booleanValue();
            }
            aflag1[i] = flag1;
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static String toString(Object obj)
    {
        return toString(obj, "{}");
    }

    public static String toString(Object obj, String s)
    {
        if (obj == null)
        {
            return s;
        } else
        {
            return (new ToStringBuilder(obj, ToStringStyle.SIMPLE_STYLE)).append(obj).toString();
        }
    }

}
