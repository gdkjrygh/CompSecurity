// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.primitives;

import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public final class Ints
{
    static final class IntArrayAsList extends AbstractList
        implements Serializable, RandomAccess
    {

        final int array[];
        final int end;
        final int start;

        private Integer get(int i)
        {
            Preconditions.checkElementIndex(i, size());
            return Integer.valueOf(array[start + i]);
        }

        private Integer set(int i, Integer integer)
        {
            Preconditions.checkElementIndex(i, size());
            int j = array[start + i];
            array[start + i] = ((Integer)Preconditions.checkNotNull(integer)).intValue();
            return Integer.valueOf(j);
        }

        public final boolean contains(Object obj)
        {
            return (obj instanceof Integer) && Ints.indexOf(array, ((Integer)obj).intValue(), start, end) != -1;
        }

        public final boolean equals(Object obj)
        {
            if (obj != this)
            {
                if (obj instanceof IntArrayAsList)
                {
                    obj = (IntArrayAsList)obj;
                    int j = size();
                    if (((IntArrayAsList) (obj)).size() != j)
                    {
                        return false;
                    }
                    int i = 0;
                    while (i < j) 
                    {
                        if (array[start + i] != ((IntArrayAsList) (obj)).array[((IntArrayAsList) (obj)).start + i])
                        {
                            return false;
                        }
                        i++;
                    }
                } else
                {
                    return super.equals(obj);
                }
            }
            return true;
        }

        public final volatile Object get(int i)
        {
            return get(i);
        }

        public final int hashCode()
        {
            int j = 1;
            for (int i = start; i < end; i++)
            {
                j = j * 31 + Ints.hashCode(array[i]);
            }

            return j;
        }

        public final int indexOf(Object obj)
        {
            if (obj instanceof Integer)
            {
                int i = Ints.indexOf(array, ((Integer)obj).intValue(), start, end);
                if (i >= 0)
                {
                    return i - start;
                }
            }
            return -1;
        }

        public final boolean isEmpty()
        {
            return false;
        }

        public final int lastIndexOf(Object obj)
        {
            if (obj instanceof Integer)
            {
                int i = Ints.lastIndexOf(array, ((Integer)obj).intValue(), start, end);
                if (i >= 0)
                {
                    return i - start;
                }
            }
            return -1;
        }

        public final volatile Object set(int i, Object obj)
        {
            return set(i, (Integer)obj);
        }

        public final int size()
        {
            return end - start;
        }

        public final List subList(int i, int j)
        {
            Preconditions.checkPositionIndexes(i, j, size());
            if (i == j)
            {
                return Collections.emptyList();
            } else
            {
                return new IntArrayAsList(array, start + i, start + j);
            }
        }

        final int[] toIntArray()
        {
            int i = size();
            int ai[] = new int[i];
            System.arraycopy(array, start, ai, 0, i);
            return ai;
        }

        public final String toString()
        {
            StringBuilder stringbuilder = new StringBuilder(size() * 5);
            stringbuilder.append('[').append(array[start]);
            for (int i = start + 1; i < end; i++)
            {
                stringbuilder.append(", ").append(array[i]);
            }

            return stringbuilder.append(']').toString();
        }

        IntArrayAsList(int ai[])
        {
            this(ai, 0, ai.length);
        }

        private IntArrayAsList(int ai[], int i, int j)
        {
            array = ai;
            start = i;
            end = j;
        }
    }


    private static final byte asciiDigits[];

    public static transient List asList(int ai[])
    {
        if (ai.length == 0)
        {
            return Collections.emptyList();
        } else
        {
            return new IntArrayAsList(ai);
        }
    }

    public static int checkedCast(long l)
    {
        int i = (int)l;
        if ((long)i != l)
        {
            throw new IllegalArgumentException((new StringBuilder("Out of range: ")).append(l).toString());
        } else
        {
            return i;
        }
    }

    public static int compare(int i, int j)
    {
        if (i < j)
        {
            return -1;
        }
        return i <= j ? 0 : 1;
    }

    public static boolean contains(int ai[], int i)
    {
        int k = ai.length;
        for (int j = 0; j < k; j++)
        {
            if (ai[j] == i)
            {
                return true;
            }
        }

        return false;
    }

    private static int digit(char c)
    {
        if (c < '\200')
        {
            return asciiDigits[c];
        } else
        {
            return -1;
        }
    }

    public static int fromByteArray(byte abyte0[])
    {
        boolean flag;
        if (abyte0.length >= 4)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "array too small: %s < %s", new Object[] {
            Integer.valueOf(abyte0.length), Integer.valueOf(4)
        });
        return fromBytes(abyte0[0], abyte0[1], abyte0[2], abyte0[3]);
    }

    private static int fromBytes(byte byte0, byte byte1, byte byte2, byte byte3)
    {
        return byte0 << 24 | (byte1 & 0xff) << 16 | (byte2 & 0xff) << 8 | byte3 & 0xff;
    }

    public static int hashCode(int i)
    {
        return i;
    }

    public static int indexOf(int ai[], int i)
    {
        return indexOf(ai, i, 0, ai.length);
    }

    private static int indexOf(int ai[], int i, int j, int k)
    {
        for (; j < k; j++)
        {
            if (ai[j] == i)
            {
                return j;
            }
        }

        return -1;
    }

    private static int lastIndexOf(int ai[], int i, int j, int k)
    {
        for (k--; k >= j; k--)
        {
            if (ai[k] == i)
            {
                return k;
            }
        }

        return -1;
    }

    public static int saturatedCast(long l)
    {
        if (l > 0x7fffffffL)
        {
            return 0x7fffffff;
        }
        if (l < 0xffffffff80000000L)
        {
            return 0x80000000;
        } else
        {
            return (int)l;
        }
    }

    public static int[] toArray(Collection collection)
    {
        if (!(collection instanceof IntArrayAsList)) goto _L2; else goto _L1
_L1:
        collection = ((IntArrayAsList)collection).toIntArray();
_L4:
        return collection;
_L2:
        Object aobj[] = collection.toArray();
        int j = aobj.length;
        int ai[] = new int[j];
        int i = 0;
        do
        {
            collection = ai;
            if (i >= j)
            {
                continue;
            }
            ai[i] = ((Number)Preconditions.checkNotNull(aobj[i])).intValue();
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static byte[] toByteArray(int i)
    {
        return (new byte[] {
            i >> 24, (byte)(i >> 16), (byte)(i >> 8), (byte)i
        });
    }

    public static Integer tryParse(String s)
    {
        return tryParse(s, 10);
    }

    private static Integer tryParse(String s, int i)
    {
        int j = 1;
        if (((String)Preconditions.checkNotNull(s)).length() == 0)
        {
            return null;
        }
        if (i < 2 || i > 36)
        {
            throw new IllegalArgumentException((new StringBuilder("radix must be between MIN_RADIX and MAX_RADIX but was ")).append(i).toString());
        }
        boolean flag;
        if (s.charAt(0) == '-')
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            j = 0;
        }
        if (j == s.length())
        {
            return null;
        }
        int k = digit(s.charAt(j));
        if (k < 0 || k >= i)
        {
            return null;
        }
        k = -k;
        int l = 0x80000000 / i;
        for (j++; j < s.length(); j++)
        {
            int i1 = digit(s.charAt(j));
            if (i1 < 0 || i1 >= i || k < l)
            {
                return null;
            }
            k *= i;
            if (k < i1 - 0x80000000)
            {
                return null;
            }
            k -= i1;
        }

        if (flag)
        {
            return Integer.valueOf(k);
        }
        if (k == 0x80000000)
        {
            return null;
        } else
        {
            return Integer.valueOf(-k);
        }
    }

    static 
    {
        byte abyte0[] = new byte[128];
        asciiDigits = abyte0;
        Arrays.fill(abyte0, (byte)-1);
        for (int i = 0; i <= 9; i++)
        {
            asciiDigits[i + 48] = (byte)i;
        }

        for (int j = 0; j <= 26; j++)
        {
            asciiDigits[j + 65] = (byte)(j + 10);
            asciiDigits[j + 97] = (byte)(j + 10);
        }

    }


}
